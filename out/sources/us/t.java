package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends bt.i.d<t> implements bt.r {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final t f201073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static bt.s<t> f201074q = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f201075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f201076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f201077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f201078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f201079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f201080h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<r> f201081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<Integer> f201082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f201083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte f201084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f201085n;

    static class a extends bt.b<t> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public t b(bt.e eVar, bt.g gVar) {
            return new t(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<t, b> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f201086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f201087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f201088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f201089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c f201090h = c.INV;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<r> f201091j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<Integer> f201092k;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f201091j = list;
            this.f201092k = list;
            I();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f201086d & 32) != 32) {
                this.f201092k = new ArrayList(this.f201092k);
                this.f201086d |= 32;
            }
        }

        private void H() {
            if ((this.f201086d & 16) != 16) {
                this.f201091j = new ArrayList(this.f201091j);
                this.f201086d |= 16;
            }
        }

        private void I() {
        }

        public t A() {
            t tVar = new t(this);
            int i15 = this.f201086d;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            tVar.f201077e = this.f201087e;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            tVar.f201078f = this.f201088f;
            if ((i15 & 4) == 4) {
                i16 |= 4;
            }
            tVar.f201079g = this.f201089g;
            if ((i15 & 8) == 8) {
                i16 |= 8;
            }
            tVar.f201080h = this.f201090h;
            if ((this.f201086d & 16) == 16) {
                this.f201091j = Collections.unmodifiableList(this.f201091j);
                this.f201086d &= -17;
            }
            tVar.f201081j = this.f201091j;
            if ((this.f201086d & 32) == 32) {
                this.f201092k = Collections.unmodifiableList(this.f201092k);
                this.f201086d &= -33;
            }
            tVar.f201082k = this.f201092k;
            tVar.f201076d = i16;
            return tVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            t tVar = null;
            try {
                try {
                    t tVarB = t.f201074q.b(eVar, gVar);
                    if (tVarB != null) {
                        q(tVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    t tVar2 = (t) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        tVar = tVar2;
                        if (tVar != null) {
                            q(tVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (tVar != null) {
                    q(tVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b q(t tVar) {
            if (tVar == t.O()) {
                return this;
            }
            if (tVar.b0()) {
                N(tVar.R());
            }
            if (tVar.c0()) {
                O(tVar.T());
            }
            if (tVar.d0()) {
                P(tVar.U());
            }
            if (tVar.e0()) {
                Q(tVar.a0());
            }
            if (!tVar.f201081j.isEmpty()) {
                if (this.f201091j.isEmpty()) {
                    this.f201091j = tVar.f201081j;
                    this.f201086d &= -17;
                } else {
                    H();
                    this.f201091j.addAll(tVar.f201081j);
                }
            }
            if (!tVar.f201082k.isEmpty()) {
                if (this.f201092k.isEmpty()) {
                    this.f201092k = tVar.f201082k;
                    this.f201086d &= -33;
                } else {
                    G();
                    this.f201092k.addAll(tVar.f201082k);
                }
            }
            x(tVar);
            s(p().f(tVar.f201075c));
            return this;
        }

        public b N(int i15) {
            this.f201086d |= 1;
            this.f201087e = i15;
            return this;
        }

        public b O(int i15) {
            this.f201086d |= 2;
            this.f201088f = i15;
            return this;
        }

        public b P(boolean z15) {
            this.f201086d |= 4;
            this.f201089g = z15;
            return this;
        }

        public b Q(c cVar) {
            cVar.getClass();
            this.f201086d |= 8;
            this.f201090h = cVar;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public t build() {
            t tVarA = A();
            if (tVarA.c()) {
                return tVarA;
            }
            throw bt.a.AbstractC0557a.n(tVarA);
        }
    }

    public enum c implements bt.j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static bt.j.b<c> f201096e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f201098a;

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
            this.f201098a = i16;
        }

        public static c b(int i15) {
            if (i15 == 0) {
                return IN;
            }
            if (i15 == 1) {
                return OUT;
            }
            if (i15 != 2) {
                return null;
            }
            return INV;
        }

        @Override // bt.j.a
        public final int h() {
            return this.f201098a;
        }
    }

    static {
        t tVar = new t(true);
        f201073p = tVar;
        tVar.f0();
    }

    public static t O() {
        return f201073p;
    }

    private void f0() {
        this.f201077e = 0;
        this.f201078f = 0;
        this.f201079g = false;
        this.f201080h = c.INV;
        List list = Collections.EMPTY_LIST;
        this.f201081j = list;
        this.f201082k = list;
    }

    public static b g0() {
        return b.F();
    }

    public static b h0(t tVar) {
        return g0().q(tVar);
    }

    @Override // bt.r
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public t i() {
        return f201073p;
    }

    public int R() {
        return this.f201077e;
    }

    public int T() {
        return this.f201078f;
    }

    public boolean U() {
        return this.f201079g;
    }

    public r V(int i15) {
        return this.f201081j.get(i15);
    }

    public int W() {
        return this.f201081j.size();
    }

    public List<Integer> X() {
        return this.f201082k;
    }

    public List<r> Y() {
        return this.f201081j;
    }

    public c a0() {
        return this.f201080h;
    }

    public boolean b0() {
        return (this.f201076d & 1) == 1;
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f201084m;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (!b0()) {
            this.f201084m = (byte) 0;
            return false;
        }
        if (!c0()) {
            this.f201084m = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < W(); i15++) {
            if (!V(i15).c()) {
                this.f201084m = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.f201084m = (byte) 1;
            return true;
        }
        this.f201084m = (byte) 0;
        return false;
    }

    public boolean c0() {
        return (this.f201076d & 2) == 2;
    }

    public boolean d0() {
        return (this.f201076d & 4) == 4;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f201085n;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f201076d & 1) == 1 ? bt.f.o(1, this.f201077e) : 0;
        if ((this.f201076d & 2) == 2) {
            iO += bt.f.o(2, this.f201078f);
        }
        if ((this.f201076d & 4) == 4) {
            iO += bt.f.a(3, this.f201079g);
        }
        if ((this.f201076d & 8) == 8) {
            iO += bt.f.h(4, this.f201080h.h());
        }
        for (int i16 = 0; i16 < this.f201081j.size(); i16++) {
            iO += bt.f.s(5, this.f201081j.get(i16));
        }
        int iP = 0;
        for (int i17 = 0; i17 < this.f201082k.size(); i17++) {
            iP += bt.f.p(this.f201082k.get(i17).intValue());
        }
        int iP2 = iO + iP;
        if (!X().isEmpty()) {
            iP2 = iP2 + 1 + bt.f.p(iP);
        }
        this.f201083l = iP;
        int iV = iP2 + v() + this.f201075c.size();
        this.f201085n = iV;
        return iV;
    }

    public boolean e0() {
        return (this.f201076d & 8) == 8;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return g0();
    }

    @Override // bt.i, bt.q
    public bt.s<t> j() {
        return f201074q;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return h0(this);
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f201076d & 1) == 1) {
            fVar.a0(1, this.f201077e);
        }
        if ((this.f201076d & 2) == 2) {
            fVar.a0(2, this.f201078f);
        }
        if ((this.f201076d & 4) == 4) {
            fVar.L(3, this.f201079g);
        }
        if ((this.f201076d & 8) == 8) {
            fVar.S(4, this.f201080h.h());
        }
        for (int i15 = 0; i15 < this.f201081j.size(); i15++) {
            fVar.d0(5, this.f201081j.get(i15));
        }
        if (X().size() > 0) {
            fVar.o0(50);
            fVar.o0(this.f201083l);
        }
        for (int i16 = 0; i16 < this.f201082k.size(); i16++) {
            fVar.b0(this.f201082k.get(i16).intValue());
        }
        aVarC.a(1000, fVar);
        fVar.i0(this.f201075c);
    }

    private t(bt.i.c<t, ?> cVar) {
        super(cVar);
        this.f201083l = -1;
        this.f201084m = (byte) -1;
        this.f201085n = -1;
        this.f201075c = cVar.p();
    }

    private t(boolean z15) {
        this.f201083l = -1;
        this.f201084m = (byte) -1;
        this.f201085n = -1;
        this.f201075c = bt.d.f21388a;
    }

    private t(bt.e eVar, bt.g gVar) {
        this.f201083l = -1;
        this.f201084m = (byte) -1;
        this.f201085n = -1;
        f0();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        int i15 = 0;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f201076d |= 1;
                            this.f201077e = eVar.s();
                        } else if (iK == 16) {
                            this.f201076d |= 2;
                            this.f201078f = eVar.s();
                        } else if (iK == 24) {
                            this.f201076d |= 4;
                            this.f201079g = eVar.k();
                        } else if (iK == 32) {
                            int iN = eVar.n();
                            c cVarB = c.b(iN);
                            if (cVarB == null) {
                                fVarJ.o0(iK);
                                fVarJ.o0(iN);
                            } else {
                                this.f201076d |= 8;
                                this.f201080h = cVarB;
                            }
                        } else if (iK == 42) {
                            if ((i15 & 16) != 16) {
                                this.f201081j = new ArrayList();
                                i15 |= 16;
                            }
                            this.f201081j.add((r) eVar.u(r.f200992y, gVar));
                        } else if (iK == 48) {
                            if ((i15 & 32) != 32) {
                                this.f201082k = new ArrayList();
                                i15 |= 32;
                            }
                            this.f201082k.add(Integer.valueOf(eVar.s()));
                        } else if (iK != 50) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            int iJ = eVar.j(eVar.A());
                            if ((i15 & 32) != 32 && eVar.e() > 0) {
                                this.f201082k = new ArrayList();
                                i15 |= 32;
                            }
                            while (eVar.e() > 0) {
                                this.f201082k.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ);
                        }
                    }
                    z15 = true;
                } catch (bt.k e15) {
                    throw e15.i(this);
                } catch (IOException e16) {
                    throw new bt.k(e16.getMessage()).i(this);
                }
            } catch (Throwable th4) {
                if ((i15 & 16) == 16) {
                    this.f201081j = Collections.unmodifiableList(this.f201081j);
                }
                if ((i15 & 32) == 32) {
                    this.f201082k = Collections.unmodifiableList(this.f201082k);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused) {
                } finally {
                    this.f201075c = bVarU.r();
                }
                n();
                throw th4;
            }
        }
        if ((i15 & 16) == 16) {
            this.f201081j = Collections.unmodifiableList(this.f201081j);
        }
        if ((i15 & 32) == 32) {
            this.f201082k = Collections.unmodifiableList(this.f201082k);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f201075c = bVarU.r();
        }
        n();
    }
}
