package ov;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import fv.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p071kotlin.Metadata;
import pq.v;
import pv.i;
import pv.j;
import pv.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lov/a;", "Lov/h;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lfv/a0;", "protocols", "Loq/i0;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "g", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "i", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lsv/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)Lsv/c;", "Lpv/k;", "d", "Ljava/util/List;", "socketAdapters", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f150181f;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<k> socketAdapters;

    /* JADX INFO: renamed from: ov.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lov/a$a;", "", "<init>", "()V", "Lov/h;", "a", "()Lov/h;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f150181f;
        }

        private Companion() {
        }
    }

    static {
        f150181f = h.INSTANCE.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listS = v.s(pv.a.INSTANCE.a(), new j(pv.f.INSTANCE.d()), new j(i.INSTANCE.a()), new j(pv.g.INSTANCE.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (((k) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    @Override // ov.h
    public sv.c c(X509TrustManager trustManager) {
        pv.b bVarA = pv.b.INSTANCE.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // ov.h
    public void e(SSLSocket sslSocket, String hostname, List<? extends a0> protocols) {
        Object next;
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).b(sslSocket));
        k kVar = (k) next;
        if (kVar != null) {
            kVar.d(sslSocket, hostname, protocols);
        }
    }

    @Override // ov.h
    public String g(SSLSocket sslSocket) {
        Object next;
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).b(sslSocket));
        k kVar = (k) next;
        if (kVar != null) {
            return kVar.c(sslSocket);
        }
        return null;
    }

    @Override // ov.h
    @SuppressLint({"NewApi"})
    public boolean i(String hostname) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
