package us;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends bt.i implements bt.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final q f200983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static bt.s<q> f200984g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f200985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private bt.o f200986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f200987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200988e;

    static class a extends bt.b<q> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public q b(bt.e eVar, bt.g gVar) {
            return new q(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<q, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f200989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private bt.o f200990c = bt.n.f21453b;

        private b() {
            A();
        }

        private void A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b y() {
            return new b();
        }

        private void z() {
            if ((this.f200989b & 1) != 1) {
                this.f200990c = new bt.n(this.f200990c);
                this.f200989b |= 1;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            q qVar = null;
            try {
                try {
                    q qVarB = q.f200984g.b(eVar, gVar);
                    if (qVarB != null) {
                        q(qVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    q qVar2 = (q) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        qVar = qVar2;
                        if (qVar != null) {
                            q(qVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (qVar != null) {
                    q(qVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b q(q qVar) {
            if (qVar == q.w()) {
                return this;
            }
            if (!qVar.f200986c.isEmpty()) {
                if (this.f200990c.isEmpty()) {
                    this.f200990c = qVar.f200986c;
                    this.f200989b &= -2;
                } else {
                    z();
                    this.f200990c.addAll(qVar.f200986c);
                }
            }
            s(p().f(qVar.f200985b));
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public q build() {
            q qVarW = w();
            if (qVarW.c()) {
                return qVarW;
            }
            throw bt.a.AbstractC0557a.n(qVarW);
        }

        public q w() {
            q qVar = new q(this);
            if ((this.f200989b & 1) == 1) {
                this.f200990c = this.f200990c.n0();
                this.f200989b &= -2;
            }
            qVar.f200986c = this.f200990c;
            return qVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    static {
        q qVar = new q(true);
        f200983f = qVar;
        qVar.B();
    }

    private void B() {
        this.f200986c = bt.n.f21453b;
    }

    public static b C() {
        return b.y();
    }

    public static b D(q qVar) {
        return C().q(qVar);
    }

    public static q w() {
        return f200983f;
    }

    public bt.t A() {
        return this.f200986c;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b g() {
        return C();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b b() {
        return D(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200987d;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        this.f200987d = (byte) 1;
        return true;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200988e;
        if (i15 != -1) {
            return i15;
        }
        int iE = 0;
        for (int i16 = 0; i16 < this.f200986c.size(); i16++) {
            iE += bt.f.e(this.f200986c.P1(i16));
        }
        int size = iE + A().size() + this.f200985b.size();
        this.f200988e = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<q> j() {
        return f200984g;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        for (int i15 = 0; i15 < this.f200986c.size(); i15++) {
            fVar.O(1, this.f200986c.P1(i15));
        }
        fVar.i0(this.f200985b);
    }

    public String y(int i15) {
        return this.f200986c.get(i15);
    }

    private q(bt.i.b bVar) {
        super(bVar);
        this.f200987d = (byte) -1;
        this.f200988e = -1;
        this.f200985b = bVar.p();
    }

    private q(boolean z15) {
        this.f200987d = (byte) -1;
        this.f200988e = -1;
        this.f200985b = bt.d.f21388a;
    }

    private q(bt.e eVar, bt.g gVar) {
        this.f200987d = (byte) -1;
        this.f200988e = -1;
        B();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        boolean z16 = false;
        while (!z15) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK != 10) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                bt.d dVarL = eVar.l();
                                if (!z16) {
                                    this.f200986c = new bt.n();
                                    z16 = true;
                                }
                                this.f200986c.i1(dVarL);
                            }
                        }
                        z15 = true;
                    } catch (bt.k e15) {
                        throw e15.i(this);
                    }
                } catch (IOException e16) {
                    throw new bt.k(e16.getMessage()).i(this);
                }
            } catch (Throwable th4) {
                if (z16) {
                    this.f200986c = this.f200986c.n0();
                }
                try {
                    fVarJ.I();
                } catch (IOException unused) {
                } finally {
                    this.f200985b = bVarU.r();
                }
                n();
                throw th4;
            }
        }
        if (z16) {
            this.f200986c = this.f200986c.n0();
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200985b = bVarU.r();
        }
        n();
    }
}
