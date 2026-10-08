package kv;

import fv.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Lkv/b;", "", "", "Lfv/l;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "(Ljavax/net/ssl/SSLSocket;)Z", "sslSocket", "a", "(Ljavax/net/ssl/SSLSocket;)Lfv/l;", "Ljava/io/IOException;", "e", "b", "(Ljava/io/IOException;)Z", "Ljava/util/List;", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "d", "isFallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<l> connectionSpecs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nextModeIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isFallbackPossible;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isFallback;

    public b(List<l> list) {
        this.connectionSpecs = list;
    }

    private final boolean c(SSLSocket socket) {
        int size = this.connectionSpecs.size();
        for (int i15 = this.nextModeIndex; i15 < size; i15++) {
            if (this.connectionSpecs.get(i15).e(socket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) throws UnknownServiceException {
        l lVar;
        int i15 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i15 >= size) {
                lVar = null;
                break;
            }
            lVar = this.connectionSpecs.get(i15);
            if (lVar.e(sslSocket)) {
                this.nextModeIndex = i15 + 1;
                break;
            }
            i15++;
        }
        if (lVar != null) {
            this.isFallbackPossible = c(sslSocket);
            lVar.c(sslSocket, this.isFallback);
            return lVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.isFallback + ", modes=" + this.connectionSpecs + ", supported protocols=" + Arrays.toString(sslSocket.getEnabledProtocols()));
    }

    public final boolean b(IOException e15) {
        this.isFallback = true;
        if (!this.isFallbackPossible || (e15 instanceof ProtocolException) || (e15 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e15 instanceof SSLHandshakeException) && (e15.getCause() instanceof CertificateException)) || (e15 instanceof SSLPeerUnverifiedException) || !(e15 instanceof SSLException)) ? false : true;
    }
}
