package us;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends bt.i implements bt.r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final w f201133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static bt.s<w> f201134n = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f201135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f201136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f201137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f201138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f201139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f201140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f201141h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f201142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte f201143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f201144l;

    static class a extends bt.b<w> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public w b(bt.e eVar, bt.g gVar) {
            return new w(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<w, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f201145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f201146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f201147d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f201149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f201150g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f201148e = c.ERROR;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f201151h = d.LANGUAGE_VERSION;

        private b() {
            z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b y() {
            return new b();
        }

        private void z() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            w wVar = null;
            try {
                try {
                    w wVarB = w.f201134n.b(eVar, gVar);
                    if (wVarB != null) {
                        q(wVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    w wVar2 = (w) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        wVar = wVar2;
                        if (wVar != null) {
                            q(wVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (wVar != null) {
                    q(wVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b q(w wVar) {
            if (wVar == w.D()) {
                return this;
            }
            if (wVar.N()) {
                I(wVar.H());
            }
            if (wVar.O()) {
                J(wVar.I());
            }
            if (wVar.L()) {
                G(wVar.F());
            }
            if (wVar.K()) {
                F(wVar.E());
            }
            if (wVar.M()) {
                H(wVar.G());
            }
            if (wVar.Q()) {
                K(wVar.J());
            }
            s(p().f(wVar.f201135b));
            return this;
        }

        public b F(int i15) {
            this.f201145b |= 8;
            this.f201149f = i15;
            return this;
        }

        public b G(c cVar) {
            cVar.getClass();
            this.f201145b |= 4;
            this.f201148e = cVar;
            return this;
        }

        public b H(int i15) {
            this.f201145b |= 16;
            this.f201150g = i15;
            return this;
        }

        public b I(int i15) {
            this.f201145b |= 1;
            this.f201146c = i15;
            return this;
        }

        public b J(int i15) {
            this.f201145b |= 2;
            this.f201147d = i15;
            return this;
        }

        public b K(d dVar) {
            dVar.getClass();
            this.f201145b |= 32;
            this.f201151h = dVar;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public w build() {
            w wVarW = w();
            if (wVarW.c()) {
                return wVarW;
            }
            throw bt.a.AbstractC0557a.n(wVarW);
        }

        public w w() {
            w wVar = new w(this);
            int i15 = this.f201145b;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            wVar.f201137d = this.f201146c;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            wVar.f201138e = this.f201147d;
            if ((i15 & 4) == 4) {
                i16 |= 4;
            }
            wVar.f201139f = this.f201148e;
            if ((i15 & 8) == 8) {
                i16 |= 8;
            }
            wVar.f201140g = this.f201149f;
            if ((i15 & 16) == 16) {
                i16 |= 16;
            }
            wVar.f201141h = this.f201150g;
            if ((i15 & 32) == 32) {
                i16 |= 32;
            }
            wVar.f201142j = this.f201151h;
            wVar.f201136c = i16;
            return wVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    public enum c implements bt.j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static bt.j.b<c> f201155e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f201157a;

        static class a implements bt.j.b<c> {
            a() {
            }

            @Override // bt.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i15) {
                return c.b(i15);
            }
        }

        c(int i15, int i16) {
            this.f201157a = i16;
        }

        public static c b(int i15) {
            if (i15 == 0) {
                return WARNING;
            }
            if (i15 == 1) {
                return ERROR;
            }
            if (i15 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // bt.j.a
        public final int h() {
            return this.f201157a;
        }
    }

    public enum d implements bt.j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static bt.j.b<d> f201161e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f201163a;

        static class a implements bt.j.b<d> {
            a() {
            }

            @Override // bt.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i15) {
                return d.b(i15);
            }
        }

        d(int i15, int i16) {
            this.f201163a = i16;
        }

        public static d b(int i15) {
            if (i15 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i15 == 1) {
                return COMPILER_VERSION;
            }
            if (i15 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // bt.j.a
        public final int h() {
            return this.f201163a;
        }
    }

    static {
        w wVar = new w(true);
        f201133m = wVar;
        wVar.R();
    }

    public static w D() {
        return f201133m;
    }

    private void R() {
        this.f201137d = 0;
        this.f201138e = 0;
        this.f201139f = c.ERROR;
        this.f201140g = 0;
        this.f201141h = 0;
        this.f201142j = d.LANGUAGE_VERSION;
    }

    public static b T() {
        return b.y();
    }

    public static b U(w wVar) {
        return T().q(wVar);
    }

    public int E() {
        return this.f201140g;
    }

    public c F() {
        return this.f201139f;
    }

    public int G() {
        return this.f201141h;
    }

    public int H() {
        return this.f201137d;
    }

    public int I() {
        return this.f201138e;
    }

    public d J() {
        return this.f201142j;
    }

    public boolean K() {
        return (this.f201136c & 8) == 8;
    }

    public boolean L() {
        return (this.f201136c & 4) == 4;
    }

    public boolean M() {
        return (this.f201136c & 16) == 16;
    }

    public boolean N() {
        return (this.f201136c & 1) == 1;
    }

    public boolean O() {
        return (this.f201136c & 2) == 2;
    }

    public boolean Q() {
        return (this.f201136c & 32) == 32;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public b g() {
        return T();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b b() {
        return U(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f201143k;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        this.f201143k = (byte) 1;
        return true;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f201144l;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f201136c & 1) == 1 ? bt.f.o(1, this.f201137d) : 0;
        if ((this.f201136c & 2) == 2) {
            iO += bt.f.o(2, this.f201138e);
        }
        if ((this.f201136c & 4) == 4) {
            iO += bt.f.h(3, this.f201139f.h());
        }
        if ((this.f201136c & 8) == 8) {
            iO += bt.f.o(4, this.f201140g);
        }
        if ((this.f201136c & 16) == 16) {
            iO += bt.f.o(5, this.f201141h);
        }
        if ((this.f201136c & 32) == 32) {
            iO += bt.f.h(6, this.f201142j.h());
        }
        int size = iO + this.f201135b.size();
        this.f201144l = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<w> j() {
        return f201134n;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        if ((this.f201136c & 1) == 1) {
            fVar.a0(1, this.f201137d);
        }
        if ((this.f201136c & 2) == 2) {
            fVar.a0(2, this.f201138e);
        }
        if ((this.f201136c & 4) == 4) {
            fVar.S(3, this.f201139f.h());
        }
        if ((this.f201136c & 8) == 8) {
            fVar.a0(4, this.f201140g);
        }
        if ((this.f201136c & 16) == 16) {
            fVar.a0(5, this.f201141h);
        }
        if ((this.f201136c & 32) == 32) {
            fVar.S(6, this.f201142j.h());
        }
        fVar.i0(this.f201135b);
    }

    private w(bt.i.b bVar) {
        super(bVar);
        this.f201143k = (byte) -1;
        this.f201144l = -1;
        this.f201135b = bVar.p();
    }

    private w(boolean z15) {
        this.f201143k = (byte) -1;
        this.f201144l = -1;
        this.f201135b = bt.d.f21388a;
    }

    private w(bt.e eVar, bt.g gVar) {
        this.f201143k = (byte) -1;
        this.f201144l = -1;
        R();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f201136c |= 1;
                            this.f201137d = eVar.s();
                        } else if (iK == 16) {
                            this.f201136c |= 2;
                            this.f201138e = eVar.s();
                        } else if (iK == 24) {
                            int iN = eVar.n();
                            c cVarB = c.b(iN);
                            if (cVarB == null) {
                                fVarJ.o0(iK);
                                fVarJ.o0(iN);
                            } else {
                                this.f201136c |= 4;
                                this.f201139f = cVarB;
                            }
                        } else if (iK == 32) {
                            this.f201136c |= 8;
                            this.f201140g = eVar.s();
                        } else if (iK == 40) {
                            this.f201136c |= 16;
                            this.f201141h = eVar.s();
                        } else if (iK != 48) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            int iN2 = eVar.n();
                            d dVarB = d.b(iN2);
                            if (dVarB == null) {
                                fVarJ.o0(iK);
                                fVarJ.o0(iN2);
                            } else {
                                this.f201136c |= 32;
                                this.f201142j = dVarB;
                            }
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f201135b = bVarU.r();
                    }
                    n();
                    throw th4;
                }
            } catch (bt.k e15) {
                throw e15.i(this);
            } catch (IOException e16) {
                throw new bt.k(e16.getMessage()).i(this);
            }
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f201135b = bVarU.r();
        }
        n();
    }
}
