package be;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class h<R> implements be.f.a, Runnable, Comparable<h<?>>, we.a.f {
    private zd.f A;
    private zd.f B;
    private Object C;
    private zd.a D;
    private com.bumptech.glide.load.data.d<?> E;
    private volatile be.f F;
    private volatile boolean G;
    private volatile boolean H;
    private boolean I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f18675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i6.f<h<?>> f18676e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.d f18679h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private zd.f f18680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.g f18681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private n f18682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18684n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f18685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private zd.h f18686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b<R> f18687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private EnumC0472h f18689t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g f18690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f18691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Object f18693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Thread f18694z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final be.g<R> f18672a = new be.g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Throwable> f18673b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final we.c f18674c = we.c.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d<?> f18677f = new d<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f18678g = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f18696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f18697c;

        static {
            int[] iArr = new int[zd.c.values().length];
            f18697c = iArr;
            try {
                iArr[zd.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18697c[zd.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0472h.values().length];
            f18696b = iArr2;
            try {
                iArr2[EnumC0472h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18696b[EnumC0472h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18696b[EnumC0472h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18696b[EnumC0472h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18696b[EnumC0472h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f18695a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18695a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18695a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b<R> {
        void c(v<R> vVar, zd.a aVar, boolean z15);

        void d(q qVar);

        void e(h<?> hVar);
    }

    private final class c<Z> implements i.a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zd.a f18698a;

        c(zd.a aVar) {
            this.f18698a = aVar;
        }

        @Override // be.i.a
        public v<Z> a(v<Z> vVar) {
            return h.this.F(this.f18698a, vVar);
        }
    }

    private static class d<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private zd.f f18700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private zd.k<Z> f18701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u<Z> f18702c;

        d() {
        }

        void a() {
            this.f18700a = null;
            this.f18701b = null;
            this.f18702c = null;
        }

        void b(e eVar, zd.h hVar) {
            we.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f18700a, new be.e(this.f18701b, this.f18702c, hVar));
            } finally {
                this.f18702c.g();
                we.b.e();
            }
        }

        boolean c() {
            return this.f18702c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(zd.f fVar, zd.k<X> kVar, u<X> uVar) {
            this.f18700a = fVar;
            this.f18701b = kVar;
            this.f18702c = uVar;
        }
    }

    interface e {
        de.a a();
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18705c;

        f() {
        }

        private boolean a(boolean z15) {
            return (this.f18705c || z15 || this.f18704b) && this.f18703a;
        }

        synchronized boolean b() {
            this.f18704b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f18705c = true;
            return a(false);
        }

        synchronized boolean d(boolean z15) {
            this.f18703a = true;
            return a(z15);
        }

        synchronized void e() {
            this.f18704b = false;
            this.f18703a = false;
            this.f18705c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: be.h$h, reason: collision with other inner class name */
    private enum EnumC0472h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, i6.f<h<?>> fVar) {
        this.f18675d = eVar;
        this.f18676e = fVar;
    }

    private void A() {
        O();
        this.f18687r.d(new q("Failed to load resource", new ArrayList(this.f18673b)));
        D();
    }

    private void B() {
        if (this.f18678g.b()) {
            H();
        }
    }

    private void D() {
        if (this.f18678g.c()) {
            H();
        }
    }

    private void H() {
        this.f18678g.e();
        this.f18677f.a();
        this.f18672a.a();
        this.G = false;
        this.f18679h = null;
        this.f18680j = null;
        this.f18686q = null;
        this.f18681k = null;
        this.f18682l = null;
        this.f18687r = null;
        this.f18689t = null;
        this.F = null;
        this.f18694z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.f18691w = 0L;
        this.H = false;
        this.f18693y = null;
        this.f18673b.clear();
        this.f18676e.A(this);
    }

    private void I(g gVar) {
        this.f18690v = gVar;
        this.f18687r.e(this);
    }

    private void J() {
        this.f18694z = Thread.currentThread();
        this.f18691w = ve.g.b();
        boolean zA = false;
        while (!this.H && this.F != null && !(zA = this.F.a())) {
            this.f18689t = r(this.f18689t);
            this.F = q();
            if (this.f18689t == EnumC0472h.SOURCE) {
                I(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f18689t == EnumC0472h.FINISHED || this.H) && !zA) {
            A();
        }
    }

    private <Data, ResourceType> v<R> K(Data data, zd.a aVar, t<Data, ResourceType, R> tVar) {
        zd.h hVarS = s(aVar);
        com.bumptech.glide.load.data.e<Data> eVarL = this.f18679h.i().l(data);
        try {
            return tVar.a(eVarL, hVarS, this.f18683m, this.f18684n, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    private void N() {
        int i15 = a.f18695a[this.f18690v.ordinal()];
        if (i15 == 1) {
            this.f18689t = r(EnumC0472h.INITIALIZE);
            this.F = q();
            J();
        } else if (i15 == 2) {
            J();
        } else {
            if (i15 == 3) {
                p();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f18690v);
        }
    }

    private void O() {
        Throwable th4;
        this.f18674c.c();
        if (!this.G) {
            this.G = true;
            return;
        }
        if (this.f18673b.isEmpty()) {
            th4 = null;
        } else {
            List<Throwable> list = this.f18673b;
            th4 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th4);
    }

    private <Data> v<R> n(com.bumptech.glide.load.data.d<?> dVar, Data data, zd.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = ve.g.b();
            v<R> vVarO = o(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                w("Decoded result " + vVarO, jB);
            }
            return vVarO;
        } finally {
            dVar.b();
        }
    }

    private <Data> v<R> o(Data data, zd.a aVar) {
        return K(data, aVar, this.f18672a.h(data.getClass()));
    }

    private void p() {
        v<R> vVarN;
        if (Log.isLoggable("DecodeJob", 2)) {
            x("Retrieved data", this.f18691w, "data: " + this.C + ", cache key: " + this.A + ", fetcher: " + this.E);
        }
        try {
            vVarN = n(this.E, this.C, this.D);
        } catch (q e15) {
            e15.i(this.B, this.D);
            this.f18673b.add(e15);
            vVarN = null;
        }
        if (vVarN != null) {
            z(vVarN, this.D, this.I);
        } else {
            J();
        }
    }

    private be.f q() {
        int i15 = a.f18696b[this.f18689t.ordinal()];
        if (i15 == 1) {
            return new w(this.f18672a, this);
        }
        if (i15 == 2) {
            return new be.c(this.f18672a, this);
        }
        if (i15 == 3) {
            return new z(this.f18672a, this);
        }
        if (i15 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f18689t);
    }

    private EnumC0472h r(EnumC0472h enumC0472h) {
        int i15 = a.f18696b[enumC0472h.ordinal()];
        if (i15 == 1) {
            return this.f18685p.a() ? EnumC0472h.DATA_CACHE : r(EnumC0472h.DATA_CACHE);
        }
        if (i15 == 2) {
            return this.f18692x ? EnumC0472h.FINISHED : EnumC0472h.SOURCE;
        }
        if (i15 == 3 || i15 == 4) {
            return EnumC0472h.FINISHED;
        }
        if (i15 == 5) {
            return this.f18685p.b() ? EnumC0472h.RESOURCE_CACHE : r(EnumC0472h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0472h);
    }

    private zd.h s(zd.a aVar) {
        zd.h hVar = this.f18686q;
        boolean z15 = aVar == zd.a.RESOURCE_DISK_CACHE || this.f18672a.x();
        zd.g<Boolean> gVar = ie.o.f91925j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z15)) {
            return hVar;
        }
        zd.h hVar2 = new zd.h();
        hVar2.d(this.f18686q);
        hVar2.f(gVar, Boolean.valueOf(z15));
        return hVar2;
    }

    private int t() {
        return this.f18681k.ordinal();
    }

    private void w(String str, long j15) {
        x(str, j15, null);
    }

    private void x(String str, long j15, String str2) {
        ve.g.a(j15);
        Objects.toString(this.f18682l);
        if (str2 != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(", ");
            sb5.append(str2);
        }
        Thread.currentThread().getName();
    }

    private void y(v<R> vVar, zd.a aVar, boolean z15) {
        O();
        this.f18687r.c(vVar, aVar, z15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z(v<R> vVar, zd.a aVar, boolean z15) {
        u uVar;
        we.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).a();
            }
            if (this.f18677f.c()) {
                vVar = u.e(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            y(vVar, aVar, z15);
            this.f18689t = EnumC0472h.ENCODE;
            try {
                if (this.f18677f.c()) {
                    this.f18677f.b(this.f18675d, this.f18686q);
                }
                if (uVar != 0) {
                    uVar.g();
                }
                B();
                we.b.e();
            } catch (Throwable th4) {
                if (uVar != 0) {
                    uVar.g();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            we.b.e();
            throw th5;
        }
    }

    <Z> v<Z> F(zd.a aVar, v<Z> vVar) {
        v<Z> vVarA;
        zd.l<Z> lVar;
        zd.c cVarB;
        zd.f dVar;
        Class<?> cls = vVar.get().getClass();
        zd.k<Z> kVarN = null;
        if (aVar != zd.a.RESOURCE_DISK_CACHE) {
            zd.l<Z> lVarS = this.f18672a.s(cls);
            lVar = lVarS;
            vVarA = lVarS.a(this.f18679h, vVar, this.f18683m, this.f18684n);
        } else {
            vVarA = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVarA)) {
            vVar.c();
        }
        if (this.f18672a.w(vVarA)) {
            kVarN = this.f18672a.n(vVarA);
            cVarB = kVarN.b(this.f18686q);
        } else {
            cVarB = zd.c.NONE;
        }
        zd.k kVar = kVarN;
        if (!this.f18685p.d(!this.f18672a.y(this.A), aVar, cVarB)) {
            return vVarA;
        }
        if (kVar == null) {
            throw new com.bumptech.glide.i.d(vVarA.get().getClass());
        }
        int i15 = a.f18697c[cVarB.ordinal()];
        if (i15 == 1) {
            dVar = new be.d(this.A, this.f18680j);
        } else {
            if (i15 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarB);
            }
            dVar = new x(this.f18672a.b(), this.A, this.f18680j, this.f18683m, this.f18684n, lVar, cls, this.f18686q);
        }
        u uVarE = u.e(vVarA);
        this.f18677f.d(dVar, kVar, uVarE);
        return uVarE;
    }

    void G(boolean z15) {
        if (this.f18678g.d(z15)) {
            H();
        }
    }

    boolean P() {
        EnumC0472h enumC0472hR = r(EnumC0472h.INITIALIZE);
        return enumC0472hR == EnumC0472h.RESOURCE_CACHE || enumC0472hR == EnumC0472h.DATA_CACHE;
    }

    @Override // we.a.f
    public we.c b() {
        return this.f18674c;
    }

    @Override // be.f.a
    public void e(zd.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, zd.a aVar, zd.f fVar2) {
        this.A = fVar;
        this.C = obj;
        this.E = dVar;
        this.D = aVar;
        this.B = fVar2;
        this.I = fVar != this.f18672a.c().get(0);
        if (Thread.currentThread() != this.f18694z) {
            I(g.DECODE_DATA);
            return;
        }
        we.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            p();
        } finally {
            we.b.e();
        }
    }

    @Override // be.f.a
    public void g() {
        I(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // be.f.a
    public void j(zd.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, zd.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(fVar, aVar, dVar.a());
        this.f18673b.add(qVar);
        if (Thread.currentThread() != this.f18694z) {
            I(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            J();
        }
    }

    public void k() {
        this.H = true;
        be.f fVar = this.F;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(h<?> hVar) {
        int iT = t() - hVar.t();
        return iT == 0 ? this.f18688s - hVar.f18688s : iT;
    }

    @Override // java.lang.Runnable
    public void run() {
        we.b.c("DecodeJob#run(reason=%s, model=%s)", this.f18690v, this.f18693y);
        com.bumptech.glide.load.data.d<?> dVar = this.E;
        try {
            try {
                try {
                    if (this.H) {
                        A();
                        if (dVar != null) {
                            dVar.b();
                        }
                        we.b.e();
                        return;
                    }
                    N();
                    if (dVar != null) {
                        dVar.b();
                    }
                    we.b.e();
                } catch (be.b e15) {
                    throw e15;
                }
            } catch (Throwable th4) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Objects.toString(this.f18689t);
                }
                if (this.f18689t != EnumC0472h.ENCODE) {
                    this.f18673b.add(th4);
                    A();
                }
                if (!this.H) {
                    throw th4;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            if (dVar != null) {
                dVar.b();
            }
            we.b.e();
            throw th5;
        }
    }

    h<R> v(com.bumptech.glide.d dVar, Object obj, n nVar, zd.f fVar, int i15, int i16, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, zd.l<?>> map, boolean z15, boolean z16, boolean z17, zd.h hVar, b<R> bVar, int i17) {
        this.f18672a.v(dVar, obj, fVar, i15, i16, jVar, cls, cls2, gVar, hVar, map, z15, z16, this.f18675d);
        this.f18679h = dVar;
        this.f18680j = fVar;
        this.f18681k = gVar;
        this.f18682l = nVar;
        this.f18683m = i15;
        this.f18684n = i16;
        this.f18685p = jVar;
        this.f18692x = z17;
        this.f18686q = hVar;
        this.f18687r = bVar;
        this.f18688s = i17;
        this.f18690v = g.INITIALIZE;
        this.f18693y = obj;
        return this;
    }
}
