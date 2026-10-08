package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.PrivateKey;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractConscryptEngine extends SSLEngine {
    AbstractConscryptEngine() {
    }

    abstract byte[] exportKeyingMaterial(String str, byte[] bArr, int i15);

    @Override // javax.net.ssl.SSLEngine
    public abstract String getApplicationProtocol();

    abstract String[] getApplicationProtocols();

    abstract byte[] getChannelId();

    @Override // javax.net.ssl.SSLEngine
    public abstract String getHandshakeApplicationProtocol();

    @Override // javax.net.ssl.SSLEngine
    public final SSLSession getHandshakeSession() {
        return handshakeSession();
    }

    abstract String getHostname();

    @Override // javax.net.ssl.SSLEngine
    public abstract String getPeerHost();

    @Override // javax.net.ssl.SSLEngine
    public abstract int getPeerPort();

    abstract byte[] getTlsUnique();

    abstract SSLSession handshakeSession();

    abstract int maxSealOverhead();

    abstract void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector);

    abstract void setApplicationProtocols(String[] strArr);

    abstract void setBufferAllocator(BufferAllocator bufferAllocator);

    abstract void setChannelIdEnabled(boolean z15);

    abstract void setChannelIdPrivateKey(PrivateKey privateKey);

    abstract void setHandshakeListener(HandshakeListener handshakeListener);

    abstract void setHostname(String str);

    abstract void setUseSessionTickets(boolean z15);

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr);

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i15, int i16);

    abstract SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i15, int i16, ByteBuffer[] byteBufferArr2, int i17, int i18);

    abstract SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2);

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    @Override // javax.net.ssl.SSLEngine
    public abstract SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i15, int i16, ByteBuffer byteBuffer);
}
