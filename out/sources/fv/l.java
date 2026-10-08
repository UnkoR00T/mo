package fv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u001e\"B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8G¢\u0006\u0006\u001a\u0004\b%\u0010(R\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010&8G¢\u0006\u0006\u001a\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lfv/l;", "", "", "isTls", "supportsTlsExtensions", "", "", "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "g", "(Ljavax/net/ssl/SSLSocket;Z)Lfv/l;", "Loq/i0;", "c", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "e", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "f", "()Z", "b", "h", "[Ljava/lang/String;", "d", "", "Lfv/i;", "()Ljava/util/List;", "cipherSuites", "Lfv/g0;", "i", "tlsVersions", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i[] f67443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i[] f67444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f67445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f67446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f67447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f67448k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isTls;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsTlsExtensions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] cipherSuitesAsString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tlsVersionsAsString;

    static {
        i iVar = i.f67413o1;
        i iVar2 = i.f67416p1;
        i iVar3 = i.f67419q1;
        i iVar4 = i.f67371a1;
        i iVar5 = i.f67383e1;
        i iVar6 = i.f67374b1;
        i iVar7 = i.f67386f1;
        i iVar8 = i.f67404l1;
        i iVar9 = i.f67401k1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f67443f = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.L0, i.M0, i.f67397j0, i.f67400k0, i.H, i.L, i.f67402l};
        f67444g = iVarArr2;
        a aVarB = new a(true).b((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        f67445h = aVarB.e(g0Var, g0Var2).d(true).a();
        f67446i = new a(true).b((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).e(g0Var, g0Var2).d(true).a();
        f67447j = new a(true).b((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).e(g0Var, g0Var2, g0.TLS_1_1, g0.TLS_1_0).d(true).a();
        f67448k = new a(false).a();
    }

    public l(boolean z15, boolean z16, String[] strArr, String[] strArr2) {
        this.isTls = z15;
        this.supportsTlsExtensions = z16;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final l g(SSLSocket sslSocket, boolean isFallback) {
        String[] strArrE = this.cipherSuitesAsString != null ? gv.d.E(sslSocket.getEnabledCipherSuites(), this.cipherSuitesAsString, i.INSTANCE.c()) : sslSocket.getEnabledCipherSuites();
        String[] strArrE2 = this.tlsVersionsAsString != null ? gv.d.E(sslSocket.getEnabledProtocols(), this.tlsVersionsAsString, sq.a.g()) : sslSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        int iX = gv.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.INSTANCE.c());
        if (isFallback && iX != -1) {
            strArrE = gv.d.o(strArrE, supportedCipherSuites[iX]);
        }
        return new a(this).c((String[]) Arrays.copyOf(strArrE, strArrE.length)).f((String[]) Arrays.copyOf(strArrE2, strArrE2.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean isFallback) {
        l lVarG = g(sslSocket, isFallback);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.tlsVersionsAsString);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.cipherSuitesAsString);
        }
    }

    public final List<i> d() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.INSTANCE.b(str));
        }
        return pq.v.f1(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !gv.d.u(strArr, socket.getEnabledProtocols(), sq.a.g())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || gv.d.u(strArr2, socket.getEnabledCipherSuites(), i.INSTANCE.c());
    }

    public boolean equals(Object other) {
        if (!(other instanceof l)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z15 = this.isTls;
        l lVar = (l) other;
        if (z15 != lVar.isTls) {
            return false;
        }
        return !z15 || (Arrays.equals(this.cipherSuitesAsString, lVar.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, lVar.tlsVersionsAsString) && this.supportsTlsExtensions == lVar.supportsTlsExtensions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public final List<g0> i() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g0.INSTANCE.a(str));
        }
        return pq.v.f1(arrayList);
    }

    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\t\"\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0005R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u0005¨\u0006("}, d2 = {"Lfv/l$a;", "", "", "tls", "<init>", "(Z)V", "Lfv/l;", "connectionSpec", "(Lfv/l;)V", "", "Lfv/i;", "cipherSuites", "b", "([Lfv/i;)Lfv/l$a;", "", "c", "([Ljava/lang/String;)Lfv/l$a;", "Lfv/g0;", "tlsVersions", "e", "([Lfv/g0;)Lfv/l$a;", "f", "supportsTlsExtensions", "d", "(Z)Lfv/l$a;", "a", "()Lfv/l;", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean tls;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String[] cipherSuites;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String[] tlsVersions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean supportsTlsExtensions;

        public a(boolean z15) {
            this.tls = z15;
        }

        public final l a() {
            return new l(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final a b(i... cipherSuites) {
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a c(String... cipherSuites) {
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.cipherSuites = (String[]) cipherSuites.clone();
            return this;
        }

        @oq.a
        public final a d(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        public final a e(g0... tlsVersions) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (g0 g0Var : tlsVersions) {
                arrayList.add(g0Var.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return f((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a f(String... tlsVersions) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.tlsVersions = (String[]) tlsVersions.clone();
            return this;
        }

        public a(l lVar) {
            this.tls = lVar.getIsTls();
            this.cipherSuites = lVar.cipherSuitesAsString;
            this.tlsVersions = lVar.tlsVersionsAsString;
            this.supportsTlsExtensions = lVar.getSupportsTlsExtensions();
        }
    }
}
