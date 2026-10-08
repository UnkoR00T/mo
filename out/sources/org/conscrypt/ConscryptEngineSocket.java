package org.conscrypt;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
class ConscryptEngineSocket extends OpenSSLSocketImpl implements SSLParametersImpl.AliasChooser {
    private static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocate(0);
    private BufferAllocator bufferAllocator;
    private final ConscryptEngine engine;
    private final Object handshakeLock;
    private long handshakeStartedMillis;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private SSLInputStream f149622in;
    private SSLOutputStream out;
    private int state;
    private final Object stateLock;

    /* JADX INFO: renamed from: org.conscrypt.ConscryptEngineSocket$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus;
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$Status;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$Status = iArr;
            try {
                iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    ConscryptEngineSocket(SSLParametersImpl sSLParametersImpl) {
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.handshakeStartedMillis = 0L;
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    private SSLInputStream createInputStream() {
        synchronized (this.stateLock) {
            try {
                if (this.f149622in == null) {
                    this.f149622in = new SSLInputStream();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return this.f149622in;
    }

    private SSLOutputStream createOutputStream() {
        synchronized (this.stateLock) {
            try {
                if (this.out == null) {
                    this.out = new SSLOutputStream();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return this.out;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doHandshake() throws IOException {
        boolean z15 = false;
        while (!z15) {
            try {
                int i15 = AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[this.engine.getHandshakeStatus().ordinal()];
                if (i15 != 1) {
                    if (i15 == 2) {
                        this.out.writeInternal(EMPTY_BUFFER);
                        this.out.flushInternal();
                    } else {
                        if (i15 == 3) {
                            close();
                            throw new IllegalStateException("Engine tasks are unsupported");
                        }
                        if (i15 != 4 && i15 != 5) {
                            throw new IllegalStateException("Unknown handshake status: " + this.engine.getHandshakeStatus());
                        }
                        z15 = true;
                    }
                } else if (this.f149622in.processDataFromSocket(EmptyArray.BYTE, 0, 0) < 0) {
                    close();
                    throw SSLUtils.toSSLHandshakeException(new EOFException("connection closed"));
                }
            } catch (SSLException e15) {
                drainOutgoingQueue();
                close();
                throw e15;
            } catch (IOException e16) {
                close();
                throw e16;
            } catch (Exception e17) {
                close();
                throw SSLUtils.toSSLHandshakeException(e17);
            }
        }
        if (isState(3)) {
            transitionTo(4);
            notifyHandshakeCompletedListeners();
            transitionTo(5);
        }
    }

    private void drainOutgoingQueue() {
        while (this.engine.pendingOutboundEncryptedBytes() > 0) {
            try {
                this.out.writeInternal(EMPTY_BUFFER);
                this.out.flushInternal();
            } catch (IOException unused) {
                return;
            }
        }
    }

    private static X509TrustManager getDelegatingTrustManager(X509TrustManager x509TrustManager, final ConscryptEngineSocket conscryptEngineSocket) {
        if (!(x509TrustManager instanceof X509ExtendedTrustManager)) {
            return x509TrustManager;
        }
        final X509ExtendedTrustManager x509ExtendedTrustManager = (X509ExtendedTrustManager) x509TrustManager;
        return new X509ExtendedTrustManager() { // from class: org.conscrypt.ConscryptEngineSocket.2
            @Override // javax.net.ssl.X509ExtendedTrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
                throw new AssertionError("Should not be called");
            }

            @Override // javax.net.ssl.X509ExtendedTrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
                throw new AssertionError("Should not be called");
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return x509ExtendedTrustManager.getAcceptedIssuers();
            }

            @Override // javax.net.ssl.X509ExtendedTrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, conscryptEngineSocket);
            }

            @Override // javax.net.ssl.X509ExtendedTrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
                x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, conscryptEngineSocket);
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str);
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getUnderlyingInputStream() {
        return super.getInputStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream getUnderlyingOutputStream() {
        return super.getOutputStream();
    }

    private boolean isState(int i15) {
        boolean z15;
        synchronized (this.stateLock) {
            z15 = this.state == i15;
        }
        return z15;
    }

    private static ConscryptEngine newEngine(SSLParametersImpl sSLParametersImpl, ConscryptEngineSocket conscryptEngineSocket) {
        SSLParametersImpl sSLParametersImplCloneWithTrustManager;
        if (sSLParametersImpl.isSpake()) {
            sSLParametersImplCloneWithTrustManager = sSLParametersImpl.cloneWithSpake();
        } else {
            sSLParametersImplCloneWithTrustManager = Platform.supportsX509ExtendedTrustManager() ? sSLParametersImpl.cloneWithTrustManager(getDelegatingTrustManager(sSLParametersImpl.getX509TrustManager(), conscryptEngineSocket)) : sSLParametersImpl;
        }
        ConscryptEngine conscryptEngine = new ConscryptEngine(sSLParametersImplCloneWithTrustManager, conscryptEngineSocket.peerInfoProvider(), conscryptEngineSocket);
        conscryptEngine.setHandshakeListener(new HandshakeListener() { // from class: org.conscrypt.ConscryptEngineSocket.1
            @Override // org.conscrypt.HandshakeListener
            public void onHandshakeFinished() {
                ConscryptEngineSocket.this.onEngineHandshakeFinished();
            }
        });
        conscryptEngine.setUseClientMode(sSLParametersImpl.getUseClientMode());
        return conscryptEngine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onEngineHandshakeFinished() {
        if (isState(2)) {
            transitionTo(3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:4:0x0003, B:6:0x0007, B:27:0x006c, B:29:0x0070, B:30:0x0075, B:19:0x001d, B:21:0x0023, B:22:0x0049, B:24:0x004f, B:25:0x0065), top: B:34:0x0003 }] */
    private int transitionTo(int i15) {
        boolean z15;
        synchronized (this.stateLock) {
            try {
                int i16 = this.state;
                if (i16 == i15) {
                    return i16;
                }
                if (i15 != 2) {
                    z15 = true;
                    if (i15 != 8) {
                        if (i15 != 4) {
                            if (i15 != 5) {
                            }
                        } else if (this.handshakeStartedMillis > 0) {
                            Platform.getStatsLog().countTlsHandshake(true, this.engine.getSession().getProtocol(), this.engine.getSession().getCipherSuite(), Platform.getMillisSinceBoot() - this.handshakeStartedMillis);
                            this.handshakeStartedMillis = 0L;
                        }
                    } else if (this.handshakeStartedMillis > 0) {
                        Platform.getStatsLog().countTlsHandshake(false, "TLS_PROTO_FAILED", "TLS_CIPHER_FAILED", Platform.getMillisSinceBoot() - this.handshakeStartedMillis);
                        this.handshakeStartedMillis = 0L;
                    }
                    this.state = i15;
                    if (z15) {
                        this.stateLock.notifyAll();
                    }
                    return i16;
                }
                this.handshakeStartedMillis = Platform.getMillisSinceBoot();
                z15 = false;
                this.state = i15;
                if (z15) {
                    this.stateLock.notifyAll();
                }
                return i16;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitForHandshake() throws IOException {
        int i15;
        startHandshake();
        synchronized (this.stateLock) {
            while (true) {
                i15 = this.state;
                if (i15 == 5 || i15 == 4 || i15 == 8) {
                    break;
                }
                try {
                    this.stateLock.wait();
                } catch (InterruptedException e15) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted waiting for handshake", e15);
                }
            }
            if (i15 == 8) {
                throw new SocketException("Socket is closed");
            }
        }
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        return x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, this);
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager.chooseServerAlias(str, null, this);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int iTransitionTo;
        if (this.stateLock == null || (iTransitionTo = transitionTo(8)) == 8) {
            return;
        }
        try {
            this.engine.closeInbound();
            this.engine.closeOutbound();
            if (iTransitionTo >= 2) {
                drainOutgoingQueue();
                this.engine.closeOutbound();
            }
            try {
                super.close();
                if (this.f149622in != null) {
                }
            } finally {
                if (this.f149622in != null) {
                    this.f149622in.release();
                }
            }
        } catch (Throwable th4) {
            try {
                super.close();
                if (this.f149622in != null) {
                }
                throw th4;
            } finally {
                if (this.f149622in != null) {
                    this.f149622in.release();
                }
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    byte[] exportKeyingMaterial(String str, byte[] bArr, int i15) {
        return this.engine.exportKeyingMaterial(str, bArr, i15);
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final SSLSession getActiveSession() {
        return this.engine.getSession();
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getApplicationProtocol() {
        return this.engine.getApplicationProtocol();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final String[] getApplicationProtocols() {
        return this.engine.getApplicationProtocols();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final byte[] getChannelId() {
        return this.engine.getChannelId();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final String getCurveNameForTesting() {
        return this.engine.getCurveNameForTesting();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.engine.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.engine.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.engine.getEnabledProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getHandshakeApplicationProtocol() {
        return this.engine.getHandshakeApplicationProtocol();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final SSLSession getHandshakeSession() {
        return this.engine.handshakeSession();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final InputStream getInputStream() throws SocketException {
        checkOpen();
        return createInputStream();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.engine.getNeedClientAuth();
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final OutputStream getOutputStream() throws SocketException {
        checkOpen();
        return createOutputStream();
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLParameters getSSLParameters() {
        return this.engine.getSSLParameters();
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        if (isConnected()) {
            try {
                waitForHandshake();
            } catch (IOException unused) {
            }
        }
        return this.engine.getSession();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return this.engine.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return this.engine.getSupportedProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    byte[] getTlsUnique() {
        return this.engine.getTlsUnique();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.engine.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.engine.getWantClientAuth();
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        setApplicationProtocolSelector(applicationProtocolSelector == null ? null : new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector));
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final void setApplicationProtocols(String[] strArr) {
        this.engine.setApplicationProtocols(strArr);
    }

    void setBufferAllocator(BufferAllocator bufferAllocator) {
        this.engine.setBufferAllocator(bufferAllocator);
        this.bufferAllocator = bufferAllocator;
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdEnabled(boolean z15) {
        this.engine.setChannelIdEnabled(z15);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
        this.engine.setChannelIdPrivateKey(privateKey);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z15) {
        this.engine.setEnableSessionCreation(z15);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.engine.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        this.engine.setEnabledProtocols(strArr);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public void setHandshakeTimeout(int i15) {
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setHostname(String str) {
        this.engine.setHostname(str);
        super.setHostname(str);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setNamedGroups(String[] strArr) {
        this.engine.setNamedGroups(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z15) {
        this.engine.setNeedClientAuth(z15);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setSSLParameters(SSLParameters sSLParameters) {
        this.engine.setSSLParameters(sSLParameters);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z15) {
        this.engine.setUseClientMode(z15);
    }

    @Override // org.conscrypt.OpenSSLSocketImpl, org.conscrypt.AbstractConscryptSocket
    public final void setUseSessionTickets(boolean z15) {
        this.engine.setUseSessionTickets(z15);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z15) {
        this.engine.setWantClientAuth(z15);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() throws IOException {
        checkOpen();
        try {
            synchronized (this.handshakeLock) {
                synchronized (this.stateLock) {
                    if (this.state == 0) {
                        transitionTo(2);
                        this.engine.beginHandshake();
                        createInputStream();
                        createOutputStream();
                        doHandshake();
                    }
                }
            }
        } catch (IOException e15) {
            close();
            throw e15;
        } catch (Exception e16) {
            close();
            throw SSLUtils.toSSLHandshakeException(e16);
        }
    }

    @Override // org.conscrypt.AbstractConscryptSocket
    final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.engine.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    private final class SSLOutputStream extends OutputStream {
        private OutputStream socketOutputStream;
        private final ByteBuffer target;
        private final int targetArrayOffset;
        private final Object writeLock = new Object();

        SSLOutputStream() {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ConscryptEngineSocket.this.engine.getSession().getPacketBufferSize());
            this.target = byteBufferAllocate;
            this.targetArrayOffset = byteBufferAllocate.arrayOffset();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void flushInternal() throws IOException {
            ConscryptEngineSocket.this.checkOpen();
            init();
            this.socketOutputStream.flush();
        }

        private void init() {
            if (this.socketOutputStream == null) {
                this.socketOutputStream = ConscryptEngineSocket.this.getUnderlyingOutputStream();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeInternal(ByteBuffer byteBuffer) throws IOException {
            Platform.blockGuardOnNetwork();
            ConscryptEngineSocket.this.checkOpen();
            init();
            int iRemaining = byteBuffer.remaining();
            do {
                this.target.clear();
                SSLEngineResult sSLEngineResultWrap = ConscryptEngineSocket.this.engine.wrap(byteBuffer, this.target);
                if (sSLEngineResultWrap.getStatus() != SSLEngineResult.Status.OK && sSLEngineResultWrap.getStatus() != SSLEngineResult.Status.CLOSED) {
                    throw new SSLException("Unexpected engine result " + sSLEngineResultWrap.getStatus());
                }
                if (this.target.position() != sSLEngineResultWrap.bytesProduced()) {
                    throw new SSLException("Engine bytesProduced " + sSLEngineResultWrap.bytesProduced() + " does not match bytes written " + this.target.position());
                }
                iRemaining -= sSLEngineResultWrap.bytesConsumed();
                if (iRemaining != byteBuffer.remaining()) {
                    throw new SSLException("Engine did not read the correct number of bytes");
                }
                if (sSLEngineResultWrap.getStatus() == SSLEngineResult.Status.CLOSED && sSLEngineResultWrap.bytesProduced() == 0) {
                    if (iRemaining > 0) {
                        throw new SocketException("Socket closed");
                    }
                    return;
                } else {
                    this.target.flip();
                    writeToSocket();
                }
            } while (iRemaining > 0);
        }

        private void writeToSocket() throws IOException {
            this.socketOutputStream.write(this.target.array(), this.targetArrayOffset, this.target.limit());
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ConscryptEngineSocket.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            ConscryptEngineSocket.this.waitForHandshake();
            synchronized (this.writeLock) {
                flushInternal();
            }
        }

        @Override // java.io.OutputStream
        public void write(int i15) throws IOException {
            ConscryptEngineSocket.this.waitForHandshake();
            synchronized (this.writeLock) {
                write(new byte[]{(byte) i15});
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            ConscryptEngineSocket.this.waitForHandshake();
            synchronized (this.writeLock) {
                writeInternal(ByteBuffer.wrap(bArr));
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i15, int i16) throws IOException {
            ConscryptEngineSocket.this.waitForHandshake();
            synchronized (this.writeLock) {
                writeInternal(ByteBuffer.wrap(bArr, i15, i16));
            }
        }
    }

    private final class SSLInputStream extends InputStream {
        private final AllocatedBuffer allocatedBuffer;
        private final ByteBuffer fromEngine;
        private final ByteBuffer fromSocket;
        private final int fromSocketArrayOffset;
        private final Object readLock = new Object();
        private final byte[] singleByte = new byte[1];
        private InputStream socketInputStream;

        SSLInputStream() {
            if (ConscryptEngineSocket.this.bufferAllocator != null) {
                AllocatedBuffer allocatedBufferAllocateDirectBuffer = ConscryptEngineSocket.this.bufferAllocator.allocateDirectBuffer(ConscryptEngineSocket.this.engine.getSession().getApplicationBufferSize());
                this.allocatedBuffer = allocatedBufferAllocateDirectBuffer;
                this.fromEngine = allocatedBufferAllocateDirectBuffer.nioBuffer();
            } else {
                this.allocatedBuffer = null;
                this.fromEngine = ByteBuffer.allocateDirect(ConscryptEngineSocket.this.engine.getSession().getApplicationBufferSize());
            }
            this.fromEngine.flip();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ConscryptEngineSocket.this.engine.getSession().getPacketBufferSize());
            this.fromSocket = byteBufferAllocate;
            this.fromSocketArrayOffset = byteBufferAllocate.arrayOffset();
        }

        private void init() {
            if (this.socketInputStream == null) {
                this.socketInputStream = ConscryptEngineSocket.this.getUnderlyingInputStream();
            }
        }

        private boolean isHandshakeFinished() {
            boolean z15;
            synchronized (ConscryptEngineSocket.this.stateLock) {
                z15 = ConscryptEngineSocket.this.state > 2;
            }
            return z15;
        }

        private boolean isHandshaking(SSLEngineResult.HandshakeStatus handshakeStatus) {
            int i15 = AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[handshakeStatus.ordinal()];
            return i15 == 1 || i15 == 2 || i15 == 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int processDataFromSocket(byte[] bArr, int i15, int i16) throws SocketException, SSLException {
            Platform.blockGuardOnNetwork();
            ConscryptEngineSocket.this.checkOpen();
            init();
            while (this.fromEngine.remaining() <= 0) {
                this.fromSocket.flip();
                this.fromEngine.clear();
                boolean zIsHandshaking = isHandshaking(ConscryptEngineSocket.this.engine.getHandshakeStatus());
                SSLEngineResult sSLEngineResultUnwrap = ConscryptEngineSocket.this.engine.unwrap(this.fromSocket, this.fromEngine);
                this.fromSocket.compact();
                this.fromEngine.flip();
                int i17 = AnonymousClass3.$SwitchMap$javax$net$ssl$SSLEngineResult$Status[sSLEngineResultUnwrap.getStatus().ordinal()];
                boolean z15 = true;
                if (i17 == 1) {
                    if (sSLEngineResultUnwrap.bytesProduced() != 0) {
                    }
                    if (z15 && sSLEngineResultUnwrap.bytesProduced() == 0) {
                        return 0;
                    }
                    if (!z15 && readFromSocket() == -1) {
                        return -1;
                    }
                } else {
                    if (i17 != 2) {
                        if (i17 == 3) {
                            return -1;
                        }
                        throw new SSLException("Unexpected engine result " + sSLEngineResultUnwrap.getStatus());
                    }
                    if (!zIsHandshaking && isHandshaking(sSLEngineResultUnwrap.getHandshakeStatus()) && isHandshakeFinished()) {
                        renegotiate();
                        return 0;
                    }
                }
                z15 = false;
                if (z15) {
                }
                if (!z15) {
                }
            }
            int iMin = Math.min(this.fromEngine.remaining(), i16);
            this.fromEngine.get(bArr, i15, iMin);
            return iMin;
        }

        private int readFromSocket() throws IOException {
            try {
                int iPosition = this.fromSocket.position();
                int i15 = this.socketInputStream.read(this.fromSocket.array(), this.fromSocketArrayOffset + iPosition, this.fromSocket.limit() - iPosition);
                if (i15 > 0) {
                    this.fromSocket.position(iPosition + i15);
                }
                return i15;
            } catch (EOFException unused) {
                return -1;
            }
        }

        private int readUntilDataAvailable(byte[] bArr, int i15, int i16) throws SocketException, SSLException {
            int iProcessDataFromSocket;
            do {
                iProcessDataFromSocket = processDataFromSocket(bArr, i15, i16);
            } while (iProcessDataFromSocket == 0);
            return iProcessDataFromSocket;
        }

        private void renegotiate() {
            synchronized (ConscryptEngineSocket.this.handshakeLock) {
                ConscryptEngineSocket.this.doHandshake();
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            int iRemaining;
            ConscryptEngineSocket.this.waitForHandshake();
            synchronized (this.readLock) {
                init();
                iRemaining = this.fromEngine.remaining();
            }
            return iRemaining;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ConscryptEngineSocket.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            ConscryptEngineSocket.this.waitForHandshake();
            synchronized (this.readLock) {
                try {
                    int i15 = read(this.singleByte, 0, 1);
                    if (i15 == -1) {
                        return -1;
                    }
                    if (i15 == 1) {
                        return this.singleByte[0] & 255;
                    }
                    throw new SSLException("read incorrect number of bytes " + i15);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        void release() {
            synchronized (this.readLock) {
                try {
                    AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                    if (allocatedBuffer != null) {
                        allocatedBuffer.release();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int i15;
            ConscryptEngineSocket.this.waitForHandshake();
            synchronized (this.readLock) {
                i15 = read(bArr, 0, bArr.length);
            }
            return i15;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i15, int i16) throws IOException {
            int untilDataAvailable;
            ConscryptEngineSocket.this.waitForHandshake();
            if (i16 == 0) {
                return 0;
            }
            synchronized (this.readLock) {
                untilDataAvailable = readUntilDataAvailable(bArr, i15, i16);
            }
            return untilDataAvailable;
        }
    }

    ConscryptEngineSocket(String str, int i15, SSLParametersImpl sSLParametersImpl) {
        super(str, i15);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.handshakeStartedMillis = 0L;
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    ConscryptEngineSocket(InetAddress inetAddress, int i15, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i15);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.handshakeStartedMillis = 0L;
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    ConscryptEngineSocket(String str, int i15, InetAddress inetAddress, int i16, SSLParametersImpl sSLParametersImpl) {
        super(str, i15, inetAddress, i16);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.handshakeStartedMillis = 0L;
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    ConscryptEngineSocket(InetAddress inetAddress, int i15, InetAddress inetAddress2, int i16, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i15, inetAddress2, i16);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.handshakeStartedMillis = 0L;
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }

    ConscryptEngineSocket(Socket socket, String str, int i15, boolean z15, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i15, z15);
        this.stateLock = new Object();
        this.handshakeLock = new Object();
        this.handshakeStartedMillis = 0L;
        this.bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
        this.state = 0;
        this.engine = newEngine(sSLParametersImpl, this);
    }
}
