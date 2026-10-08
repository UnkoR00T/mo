package org.conscrypt;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractSessionContext implements SSLSessionContext {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 28800;
    private volatile int maximumSize;
    private volatile int timeout = DEFAULT_SESSION_TIMEOUT_SECONDS;
    private volatile long sslCtxNativePointer = NativeCrypto.SSL_CTX_new();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Map<ByteArray, NativeSslSession> sessions = new LinkedHashMap<ByteArray, NativeSslSession>() { // from class: org.conscrypt.AbstractSessionContext.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<ByteArray, NativeSslSession> entry) {
            if (AbstractSessionContext.this.maximumSize <= 0 || size() <= AbstractSessionContext.this.maximumSize) {
                return false;
            }
            AbstractSessionContext.this.onBeforeRemoveSession(entry.getValue());
            return true;
        }
    };

    AbstractSessionContext(int i15) {
        this.maximumSize = i15;
    }

    private void freeNative() {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                long j15 = this.sslCtxNativePointer;
                this.sslCtxNativePointer = 0L;
                NativeCrypto.SSL_CTX_free(j15, this);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    private boolean isValid() {
        return this.sslCtxNativePointer != 0;
    }

    private void setTimeout(int i15) {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                NativeCrypto.SSL_CTX_set_timeout(this.sslCtxNativePointer, this, i15);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    private void trimToSize() {
        synchronized (this.sessions) {
            try {
                int size = this.sessions.size();
                if (size > this.maximumSize) {
                    int i15 = size - this.maximumSize;
                    Iterator<NativeSslSession> it = this.sessions.values().iterator();
                    while (true) {
                        int i16 = i15 - 1;
                        if (i15 <= 0) {
                            break;
                        }
                        onBeforeRemoveSession(it.next());
                        it.remove();
                        i15 = i16;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final void cacheSession(NativeSslSession nativeSslSession) {
        byte[] id5 = nativeSslSession.getId();
        if (id5 == null || id5.length == 0) {
            return;
        }
        synchronized (this.sessions) {
            try {
                ByteArray byteArray = new ByteArray(id5);
                if (this.sessions.containsKey(byteArray)) {
                    removeSession(this.sessions.get(byteArray));
                }
                onBeforeAddSession(nativeSslSession);
                this.sessions.put(byteArray, nativeSslSession);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected void finalize() throws Throwable {
        try {
            freeNative();
        } finally {
            super.finalize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final Enumeration<byte[]> getIds() {
        final Iterator it;
        synchronized (this.sessions) {
            it = Arrays.asList((NativeSslSession[]) this.sessions.values().toArray(new NativeSslSession[0])).iterator();
        }
        return new Enumeration<byte[]>() { // from class: org.conscrypt.AbstractSessionContext.2
            private NativeSslSession next;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.next != null) {
                    return true;
                }
                while (it.hasNext()) {
                    NativeSslSession nativeSslSession = (NativeSslSession) it.next();
                    if (nativeSslSession.isValid()) {
                        this.next = nativeSslSession;
                        return true;
                    }
                }
                this.next = null;
                return false;
            }

            @Override // java.util.Enumeration
            public byte[] nextElement() {
                if (!hasMoreElements()) {
                    throw new NoSuchElementException();
                }
                byte[] id5 = this.next.getId();
                this.next = null;
                return id5;
            }
        };
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final SSLSession getSession(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            throw new NullPointerException("sessionId");
        }
        ByteArray byteArray = new ByteArray(bArr);
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(byteArray);
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return null;
        }
        return nativeSslSession.toSSLSession();
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionCacheSize() {
        return this.maximumSize;
    }

    final NativeSslSession getSessionFromCache(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            return null;
        }
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(new ByteArray(bArr));
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return getSessionFromPersistentCache(bArr);
        }
        if (nativeSslSession.isSingleUse()) {
            removeSession(nativeSslSession);
        }
        return nativeSslSession;
    }

    abstract NativeSslSession getSessionFromPersistentCache(byte[] bArr);

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionTimeout() {
        return this.timeout;
    }

    void initSpake(SSLParametersImpl sSLParametersImpl) throws Throwable {
        AbstractSessionContext abstractSessionContext;
        Spake2PlusKeyManager spake2PlusKeyManager = sSLParametersImpl.getSpake2PlusKeyManager();
        byte[] context = spake2PlusKeyManager.getContext();
        byte[] idProver = spake2PlusKeyManager.getIdProver();
        byte[] idVerifier = spake2PlusKeyManager.getIdVerifier();
        byte[] password = spake2PlusKeyManager.getPassword();
        boolean zIsClient = spake2PlusKeyManager.isClient();
        int handshakeLimit = spake2PlusKeyManager.getHandshakeLimit();
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                abstractSessionContext = this;
                try {
                    NativeCrypto.SSL_CTX_set_spake_credential(context, password, idProver, idVerifier, zIsClient, handshakeLimit, this.sslCtxNativePointer, abstractSessionContext);
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    abstractSessionContext.lock.writeLock().unlock();
                    throw th5;
                }
            } else {
                abstractSessionContext = this;
            }
            abstractSessionContext.lock.writeLock().unlock();
        } catch (Throwable th6) {
            th = th6;
            abstractSessionContext = this;
        }
    }

    long newSsl() {
        this.lock.readLock().lock();
        try {
            if (!isValid()) {
                throw new SSLException("Invalid session context");
            }
            long jSSL_new = NativeCrypto.SSL_new(this.sslCtxNativePointer, this);
            this.lock.readLock().unlock();
            return jSSL_new;
        } catch (Throwable th4) {
            this.lock.readLock().unlock();
            throw th4;
        }
    }

    abstract void onBeforeAddSession(NativeSslSession nativeSslSession);

    abstract void onBeforeRemoveSession(NativeSslSession nativeSslSession);

    final void removeSession(NativeSslSession nativeSslSession) {
        byte[] id5 = nativeSslSession.getId();
        if (id5 == null || id5.length == 0) {
            return;
        }
        onBeforeRemoveSession(nativeSslSession);
        ByteArray byteArray = new ByteArray(id5);
        synchronized (this.sessions) {
            this.sessions.remove(byteArray);
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionCacheSize(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        int i16 = this.maximumSize;
        this.maximumSize = i15;
        if (i15 < i16) {
            trimToSize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionTimeout(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("seconds < 0");
        }
        synchronized (this.sessions) {
            try {
                this.timeout = i15;
                if (i15 <= 0) {
                    i15 = Integer.MAX_VALUE;
                }
                setTimeout(i15);
                Iterator<NativeSslSession> it = this.sessions.values().iterator();
                while (it.hasNext()) {
                    NativeSslSession next = it.next();
                    if (!next.isValid()) {
                        onBeforeRemoveSession(next);
                        it.remove();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected void setSesssionIdContext(byte[] bArr) {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                NativeCrypto.SSL_CTX_set_session_id_context(this.sslCtxNativePointer, this, bArr);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }
}
