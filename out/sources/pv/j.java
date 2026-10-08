package pv;

import fv.a0;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001c"}, d2 = {"Lpv/j;", "Lpv/k;", "Lpv/j$a;", "socketAdapterFactory", "<init>", "(Lpv/j$a;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "e", "(Ljavax/net/ssl/SSLSocket;)Lpv/k;", "", "a", "()Z", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lfv/a0;", "protocols", "Loq/i0;", "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Lpv/j$a;", "Lpv/k;", "delegate", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a socketAdapterFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private k delegate;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpv/j$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "(Ljavax/net/ssl/SSLSocket;)Z", "Lpv/k;", "c", "(Ljavax/net/ssl/SSLSocket;)Lpv/k;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        boolean b(SSLSocket sslSocket);

        k c(SSLSocket sslSocket);
    }

    public j(a aVar) {
        this.socketAdapterFactory = aVar;
    }

    private final synchronized k e(SSLSocket sslSocket) {
        try {
            if (this.delegate == null && this.socketAdapterFactory.b(sslSocket)) {
                this.delegate = this.socketAdapterFactory.c(sslSocket);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.delegate;
    }

    @Override // pv.k
    public boolean a() {
        return true;
    }

    @Override // pv.k
    public boolean b(SSLSocket sslSocket) {
        return this.socketAdapterFactory.b(sslSocket);
    }

    @Override // pv.k
    public String c(SSLSocket sslSocket) {
        k kVarE = e(sslSocket);
        if (kVarE != null) {
            return kVarE.c(sslSocket);
        }
        return null;
    }

    @Override // pv.k
    public void d(SSLSocket sslSocket, String hostname, List<? extends a0> protocols) {
        k kVarE = e(sslSocket);
        if (kVarE != null) {
            kVarE.d(sslSocket, hostname, protocols);
        }
    }
}
