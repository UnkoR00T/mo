package sn;

import java.net.URI;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends c {
    private static final Set<String> E;
    private final String A;
    private final String B;
    private final String C;
    private final List<String> D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f182482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final xn.d f182483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f182484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.c f182485t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final io.c f182486v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final io.c f182487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f182488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final io.c f182489y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final io.c f182490z;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("authTag");
        E = Collections.unmodifiableSet(hashSet);
    }

    public n(b bVar, f fVar, j jVar, String str, Set<String> set, URI uri, xn.d dVar, URI uri2, io.c cVar, io.c cVar2, List<io.a> list, String str2, xn.d dVar2, e eVar, io.c cVar3, io.c cVar4, io.c cVar5, int i15, io.c cVar6, io.c cVar7, String str3, String str4, String str5, List<String> list2, Map<String, Object> map, io.c cVar8) {
        super(bVar, jVar, str, set, uri, dVar, uri2, cVar, cVar2, list, str2, map, cVar8);
        if (bVar != null && bVar.a().equals(b.f182422c.a())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (dVar2 != null && dVar2.r()) {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
        Objects.requireNonNull(fVar);
        this.f182482q = fVar;
        this.f182483r = dVar2;
        this.f182484s = eVar;
        this.f182485t = cVar3;
        this.f182486v = cVar4;
        this.f182487w = cVar5;
        this.f182488x = i15;
        this.f182489y = cVar6;
        this.f182490z = cVar7;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = list2;
    }

    public e A() {
        return this.f182484s;
    }

    public f B() {
        return this.f182482q;
    }

    public xn.d C() {
        return this.f182483r;
    }

    public io.c D() {
        return this.f182489y;
    }

    public String E() {
        return this.B;
    }

    public int F() {
        return this.f182488x;
    }

    public io.c G() {
        return this.f182487w;
    }

    public String H() {
        return this.A;
    }

    public String I() {
        return this.C;
    }

    @Override // sn.c, sn.g
    public Map<String, Object> i() {
        Map<String, Object> mapI = super.i();
        f fVar = this.f182482q;
        if (fVar != null) {
            mapI.put("enc", fVar.toString());
        }
        xn.d dVar = this.f182483r;
        if (dVar != null) {
            mapI.put("epk", dVar.w());
        }
        e eVar = this.f182484s;
        if (eVar != null) {
            mapI.put("zip", eVar.toString());
        }
        io.c cVar = this.f182485t;
        if (cVar != null) {
            mapI.put("apu", cVar.toString());
        }
        io.c cVar2 = this.f182486v;
        if (cVar2 != null) {
            mapI.put("apv", cVar2.toString());
        }
        io.c cVar3 = this.f182487w;
        if (cVar3 != null) {
            mapI.put("p2s", cVar3.toString());
        }
        int i15 = this.f182488x;
        if (i15 > 0) {
            mapI.put("p2c", Integer.valueOf(i15));
        }
        io.c cVar4 = this.f182489y;
        if (cVar4 != null) {
            mapI.put("iv", cVar4.toString());
        }
        io.c cVar5 = this.f182490z;
        if (cVar5 != null) {
            mapI.put("tag", cVar5.toString());
        }
        String str = this.A;
        if (str != null) {
            mapI.put("skid", str);
        }
        String str2 = this.B;
        if (str2 != null) {
            mapI.put("iss", str2);
        }
        String str3 = this.C;
        if (str3 != null) {
            mapI.put("sub", str3);
        }
        List<String> list = this.D;
        if (list != null) {
            if (list.size() == 1) {
                mapI.put("aud", this.D.get(0));
                return mapI;
            }
            if (!this.D.isEmpty()) {
                mapI.put("aud", this.D);
            }
        }
        return mapI;
    }

    @Override // sn.c
    public /* bridge */ /* synthetic */ xn.d j() {
        return super.j();
    }

    @Override // sn.c
    public /* bridge */ /* synthetic */ URI k() {
        return super.k();
    }

    @Override // sn.c
    public /* bridge */ /* synthetic */ String m() {
        return super.m();
    }

    @Override // sn.c
    public /* bridge */ /* synthetic */ List n() {
        return super.n();
    }

    @Override // sn.c
    public /* bridge */ /* synthetic */ io.c o() {
        return super.o();
    }

    @Override // sn.c
    @Deprecated
    public /* bridge */ /* synthetic */ io.c p() {
        return super.p();
    }

    @Override // sn.c
    public /* bridge */ /* synthetic */ URI r() {
        return super.r();
    }

    public io.c t() {
        return this.f182485t;
    }

    public io.c u() {
        return this.f182486v;
    }

    public k v() {
        return (k) super.a();
    }

    public List<String> w() {
        List<String> list = this.D;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public io.c y() {
        return this.f182490z;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f182491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f182492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private j f182493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f182494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set<String> f182495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private URI f182496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private xn.d f182497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private URI f182498h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        private io.c f182499i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private io.c f182500j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<io.a> f182501k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f182502l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private xn.d f182503m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private e f182504n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private io.c f182505o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private io.c f182506p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private io.c f182507q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f182508r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private io.c f182509s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private io.c f182510t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private String f182511u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private String f182512v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private String f182513w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private List<String> f182514x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Map<String, Object> f182515y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private io.c f182516z;

        public a(k kVar, f fVar) {
            if (kVar.a().equals(b.f182422c.a())) {
                throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            }
            this.f182492b = kVar;
            Objects.requireNonNull(fVar);
            this.f182491a = fVar;
        }

        public a a(io.c cVar) {
            this.f182505o = cVar;
            return this;
        }

        public a b(io.c cVar) {
            this.f182506p = cVar;
            return this;
        }

        public n c() {
            return new n(this.f182492b, this.f182491a, this.f182493c, this.f182494d, this.f182495e, this.f182496f, this.f182497g, this.f182498h, this.f182499i, this.f182500j, this.f182501k, this.f182502l, this.f182503m, this.f182504n, this.f182505o, this.f182506p, this.f182507q, this.f182508r, this.f182509s, this.f182510t, this.f182511u, this.f182512v, this.f182513w, this.f182514x, this.f182515y, this.f182516z);
        }

        public a d(String str) {
            this.f182494d = str;
            return this;
        }

        public a e(xn.d dVar) {
            this.f182503m = dVar;
            return this;
        }

        public a f(String str) {
            this.f182502l = str;
            return this;
        }

        public a(f fVar) {
            Objects.requireNonNull(fVar);
            this.f182491a = fVar;
        }

        public a(n nVar) {
            this(nVar.B());
            this.f182492b = nVar.v();
            this.f182493c = nVar.f();
            this.f182494d = nVar.b();
            this.f182495e = nVar.c();
            this.f182515y = nVar.e();
            this.f182496f = nVar.k();
            this.f182497g = nVar.j();
            this.f182498h = nVar.r();
            this.f182499i = nVar.p();
            this.f182500j = nVar.o();
            this.f182501k = nVar.n();
            this.f182502l = nVar.m();
            this.f182503m = nVar.C();
            this.f182504n = nVar.A();
            this.f182505o = nVar.t();
            this.f182506p = nVar.u();
            this.f182507q = nVar.G();
            this.f182508r = nVar.F();
            this.f182509s = nVar.D();
            this.f182510t = nVar.y();
            this.f182511u = nVar.H();
            this.f182512v = nVar.E();
            this.f182513w = nVar.I();
            this.f182514x = nVar.w();
            this.f182515y = nVar.e();
        }
    }
}
