package us;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends bt.i implements bt.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f200720h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static bt.s<d> f200721j = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f200722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f200723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bt.d f200725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f200726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f200727g;

    static class a extends bt.b<d> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public d b(bt.e eVar, bt.g gVar) {
            return new d(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<d, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f200728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f200729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private bt.d f200730d = bt.d.f21388a;

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
            d dVar = null;
            try {
                try {
                    d dVarB = d.f200721j.b(eVar, gVar);
                    if (dVarB != null) {
                        q(dVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    d dVar2 = (d) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        dVar = dVar2;
                        if (dVar != null) {
                            q(dVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (dVar != null) {
                    q(dVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b q(d dVar) {
            if (dVar == d.A()) {
                return this;
            }
            if (dVar.D()) {
                G(dVar.B());
            }
            if (dVar.C()) {
                F(dVar.y());
            }
            s(p().f(dVar.f200722b));
            return this;
        }

        public b F(bt.d dVar) {
            dVar.getClass();
            this.f200728b |= 2;
            this.f200730d = dVar;
            return this;
        }

        public b G(int i15) {
            this.f200728b |= 1;
            this.f200729c = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public d build() {
            d dVarW = w();
            if (dVarW.c()) {
                return dVarW;
            }
            throw bt.a.AbstractC0557a.n(dVarW);
        }

        public d w() {
            d dVar = new d(this);
            int i15 = this.f200728b;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            dVar.f200724d = this.f200729c;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            dVar.f200725e = this.f200730d;
            dVar.f200723c = i16;
            return dVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    static {
        d dVar = new d(true);
        f200720h = dVar;
        dVar.E();
    }

    public static d A() {
        return f200720h;
    }

    private void E() {
        this.f200724d = 0;
        this.f200725e = bt.d.f21388a;
    }

    public static b F() {
        return b.y();
    }

    public static b G(d dVar) {
        return F().q(dVar);
    }

    public int B() {
        return this.f200724d;
    }

    public boolean C() {
        return (this.f200723c & 2) == 2;
    }

    public boolean D() {
        return (this.f200723c & 1) == 1;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b g() {
        return F();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public b b() {
        return G(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200726f;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (!D()) {
            this.f200726f = (byte) 0;
            return false;
        }
        if (C()) {
            this.f200726f = (byte) 1;
            return true;
        }
        this.f200726f = (byte) 0;
        return false;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200727g;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200723c & 1) == 1 ? bt.f.o(1, this.f200724d) : 0;
        if ((this.f200723c & 2) == 2) {
            iO += bt.f.d(2, this.f200725e);
        }
        int size = iO + this.f200722b.size();
        this.f200727g = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<d> j() {
        return f200721j;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        if ((this.f200723c & 1) == 1) {
            fVar.a0(1, this.f200724d);
        }
        if ((this.f200723c & 2) == 2) {
            fVar.O(2, this.f200725e);
        }
        fVar.i0(this.f200722b);
    }

    public bt.d y() {
        return this.f200725e;
    }

    private d(bt.i.b bVar) {
        super(bVar);
        this.f200726f = (byte) -1;
        this.f200727g = -1;
        this.f200722b = bVar.p();
    }

    private d(boolean z15) {
        this.f200726f = (byte) -1;
        this.f200727g = -1;
        this.f200722b = bt.d.f21388a;
    }

    private d(bt.e eVar, bt.g gVar) {
        this.f200726f = (byte) -1;
        this.f200727g = -1;
        E();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f200723c |= 1;
                            this.f200724d = eVar.s();
                        } else if (iK != 18) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            this.f200723c |= 2;
                            this.f200725e = eVar.l();
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f200722b = bVarU.r();
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
            this.f200722b = bVarU.r();
        }
        n();
    }
}
