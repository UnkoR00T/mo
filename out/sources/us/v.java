package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends bt.i.d<v> implements bt.r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final v f201110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static bt.s<v> f201111r = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f201112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f201113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f201114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f201115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r f201116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f201117h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f201118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f201119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<us.b> f201120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private us.b.C5222b.c f201121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f201122n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f201123p;

    static class a extends bt.b<v> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public v b(bt.e eVar, bt.g gVar) {
            return new v(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<v, b> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f201124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f201125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f201126f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f201128h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f201130k;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private r f201127g = r.e0();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private r f201129j = r.e0();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<us.b> f201131l = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private us.b.C5222b.c f201132m = us.b.C5222b.c.Q();

        private b() {
            H();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f201124d & 64) != 64) {
                this.f201131l = new ArrayList(this.f201131l);
                this.f201124d |= 64;
            }
        }

        private void H() {
        }

        public v A() {
            v vVar = new v(this);
            int i15 = this.f201124d;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            vVar.f201114e = this.f201125e;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            vVar.f201115f = this.f201126f;
            if ((i15 & 4) == 4) {
                i16 |= 4;
            }
            vVar.f201116g = this.f201127g;
            if ((i15 & 8) == 8) {
                i16 |= 8;
            }
            vVar.f201117h = this.f201128h;
            if ((i15 & 16) == 16) {
                i16 |= 16;
            }
            vVar.f201118j = this.f201129j;
            if ((i15 & 32) == 32) {
                i16 |= 32;
            }
            vVar.f201119k = this.f201130k;
            if ((this.f201124d & 64) == 64) {
                this.f201131l = Collections.unmodifiableList(this.f201131l);
                this.f201124d &= -65;
            }
            vVar.f201120l = this.f201131l;
            if ((i15 & 128) == 128) {
                i16 |= 64;
            }
            vVar.f201121m = this.f201132m;
            vVar.f201113d = i16;
            return vVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        public b I(us.b.C5222b.c cVar) {
            if ((this.f201124d & 128) != 128 || this.f201132m == us.b.C5222b.c.Q()) {
                this.f201132m = cVar;
            } else {
                this.f201132m = us.b.C5222b.c.m0(this.f201132m).q(cVar).w();
            }
            this.f201124d |= 128;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            v vVar = null;
            try {
                try {
                    v vVarB = v.f201111r.b(eVar, gVar);
                    if (vVarB != null) {
                        q(vVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    v vVar2 = (v) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        vVar = vVar2;
                        if (vVar != null) {
                            q(vVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (vVar != null) {
                    q(vVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b q(v vVar) {
            if (vVar == v.V()) {
                return this;
            }
            if (vVar.f0()) {
                P(vVar.X());
            }
            if (vVar.g0()) {
                Q(vVar.Y());
            }
            if (vVar.h0()) {
                N(vVar.a0());
            }
            if (vVar.i0()) {
                R(vVar.b0());
            }
            if (vVar.j0()) {
                O(vVar.c0());
            }
            if (vVar.k0()) {
                S(vVar.d0());
            }
            if (!vVar.f201120l.isEmpty()) {
                if (this.f201131l.isEmpty()) {
                    this.f201131l = vVar.f201120l;
                    this.f201124d &= -65;
                } else {
                    G();
                    this.f201131l.addAll(vVar.f201120l);
                }
            }
            if (vVar.e0()) {
                I(vVar.U());
            }
            x(vVar);
            s(p().f(vVar.f201112c));
            return this;
        }

        public b N(r rVar) {
            if ((this.f201124d & 4) != 4 || this.f201127g == r.e0()) {
                this.f201127g = rVar;
            } else {
                this.f201127g = r.F0(this.f201127g).q(rVar).A();
            }
            this.f201124d |= 4;
            return this;
        }

        public b O(r rVar) {
            if ((this.f201124d & 16) != 16 || this.f201129j == r.e0()) {
                this.f201129j = rVar;
            } else {
                this.f201129j = r.F0(this.f201129j).q(rVar).A();
            }
            this.f201124d |= 16;
            return this;
        }

        public b P(int i15) {
            this.f201124d |= 1;
            this.f201125e = i15;
            return this;
        }

        public b Q(int i15) {
            this.f201124d |= 2;
            this.f201126f = i15;
            return this;
        }

        public b R(int i15) {
            this.f201124d |= 8;
            this.f201128h = i15;
            return this;
        }

        public b S(int i15) {
            this.f201124d |= 32;
            this.f201130k = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public v build() {
            v vVarA = A();
            if (vVarA.c()) {
                return vVarA;
            }
            throw bt.a.AbstractC0557a.n(vVarA);
        }
    }

    static {
        v vVar = new v(true);
        f201110q = vVar;
        vVar.l0();
    }

    public static v V() {
        return f201110q;
    }

    private void l0() {
        this.f201114e = 0;
        this.f201115f = 0;
        this.f201116g = r.e0();
        this.f201117h = 0;
        this.f201118j = r.e0();
        this.f201119k = 0;
        this.f201120l = Collections.EMPTY_LIST;
        this.f201121m = us.b.C5222b.c.Q();
    }

    public static b m0() {
        return b.F();
    }

    public static b n0(v vVar) {
        return m0().q(vVar);
    }

    public us.b Q(int i15) {
        return this.f201120l.get(i15);
    }

    public int R() {
        return this.f201120l.size();
    }

    public List<us.b> T() {
        return this.f201120l;
    }

    public us.b.C5222b.c U() {
        return this.f201121m;
    }

    @Override // bt.r
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public v i() {
        return f201110q;
    }

    public int X() {
        return this.f201114e;
    }

    public int Y() {
        return this.f201115f;
    }

    public r a0() {
        return this.f201116g;
    }

    public int b0() {
        return this.f201117h;
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f201122n;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (!g0()) {
            this.f201122n = (byte) 0;
            return false;
        }
        if (h0() && !a0().c()) {
            this.f201122n = (byte) 0;
            return false;
        }
        if (j0() && !c0().c()) {
            this.f201122n = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < R(); i15++) {
            if (!Q(i15).c()) {
                this.f201122n = (byte) 0;
                return false;
            }
        }
        if (e0() && !U().c()) {
            this.f201122n = (byte) 0;
            return false;
        }
        if (u()) {
            this.f201122n = (byte) 1;
            return true;
        }
        this.f201122n = (byte) 0;
        return false;
    }

    public r c0() {
        return this.f201118j;
    }

    public int d0() {
        return this.f201119k;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f201123p;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f201113d & 1) == 1 ? bt.f.o(1, this.f201114e) : 0;
        if ((this.f201113d & 2) == 2) {
            iO += bt.f.o(2, this.f201115f);
        }
        if ((this.f201113d & 4) == 4) {
            iO += bt.f.s(3, this.f201116g);
        }
        if ((this.f201113d & 16) == 16) {
            iO += bt.f.s(4, this.f201118j);
        }
        if ((this.f201113d & 8) == 8) {
            iO += bt.f.o(5, this.f201117h);
        }
        if ((this.f201113d & 32) == 32) {
            iO += bt.f.o(6, this.f201119k);
        }
        for (int i16 = 0; i16 < this.f201120l.size(); i16++) {
            iO += bt.f.s(7, this.f201120l.get(i16));
        }
        if ((this.f201113d & 64) == 64) {
            iO += bt.f.s(8, this.f201121m);
        }
        int iV = iO + v() + this.f201112c.size();
        this.f201123p = iV;
        return iV;
    }

    public boolean e0() {
        return (this.f201113d & 64) == 64;
    }

    public boolean f0() {
        return (this.f201113d & 1) == 1;
    }

    public boolean g0() {
        return (this.f201113d & 2) == 2;
    }

    public boolean h0() {
        return (this.f201113d & 4) == 4;
    }

    public boolean i0() {
        return (this.f201113d & 8) == 8;
    }

    @Override // bt.i, bt.q
    public bt.s<v> j() {
        return f201111r;
    }

    public boolean j0() {
        return (this.f201113d & 16) == 16;
    }

    public boolean k0() {
        return (this.f201113d & 32) == 32;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f201113d & 1) == 1) {
            fVar.a0(1, this.f201114e);
        }
        if ((this.f201113d & 2) == 2) {
            fVar.a0(2, this.f201115f);
        }
        if ((this.f201113d & 4) == 4) {
            fVar.d0(3, this.f201116g);
        }
        if ((this.f201113d & 16) == 16) {
            fVar.d0(4, this.f201118j);
        }
        if ((this.f201113d & 8) == 8) {
            fVar.a0(5, this.f201117h);
        }
        if ((this.f201113d & 32) == 32) {
            fVar.a0(6, this.f201119k);
        }
        for (int i15 = 0; i15 < this.f201120l.size(); i15++) {
            fVar.d0(7, this.f201120l.get(i15));
        }
        if ((this.f201113d & 64) == 64) {
            fVar.d0(8, this.f201121m);
        }
        aVarC.a(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, fVar);
        fVar.i0(this.f201112c);
    }

    @Override // bt.q
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return m0();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return n0(this);
    }

    private v(bt.i.c<v, ?> cVar) {
        super(cVar);
        this.f201122n = (byte) -1;
        this.f201123p = -1;
        this.f201112c = cVar.p();
    }

    private v(boolean z15) {
        this.f201122n = (byte) -1;
        this.f201123p = -1;
        this.f201112c = bt.d.f21388a;
    }

    private v(bt.e eVar, bt.g gVar) {
        this.f201122n = (byte) -1;
        this.f201123p = -1;
        l0();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        char c15 = 0;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f201113d |= 1;
                            this.f201114e = eVar.s();
                        } else if (iK != 16) {
                            if (iK == 26) {
                                r.c cVarB = (this.f201113d & 4) == 4 ? this.f201116g.b() : null;
                                r rVar = (r) eVar.u(r.f200992y, gVar);
                                this.f201116g = rVar;
                                if (cVarB != null) {
                                    cVarB.q(rVar);
                                    this.f201116g = cVarB.A();
                                }
                                this.f201113d |= 4;
                            } else if (iK == 34) {
                                r.c cVarB2 = (this.f201113d & 16) == 16 ? this.f201118j.b() : null;
                                r rVar2 = (r) eVar.u(r.f200992y, gVar);
                                this.f201118j = rVar2;
                                if (cVarB2 != null) {
                                    cVarB2.q(rVar2);
                                    this.f201118j = cVarB2.A();
                                }
                                this.f201113d |= 16;
                            } else if (iK == 40) {
                                this.f201113d |= 8;
                                this.f201117h = eVar.s();
                            } else if (iK == 48) {
                                this.f201113d |= 32;
                                this.f201119k = eVar.s();
                            } else if (iK == 58) {
                                int i15 = (c15 == true ? 1 : 0) & '@';
                                c15 = c15;
                                if (i15 != 64) {
                                    this.f201120l = new ArrayList();
                                    c15 = '@';
                                }
                                this.f201120l.add((us.b) eVar.u(us.b.f200603j, gVar));
                            } else if (iK != 66) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                us.b.C5222b.c.C5224b c5224bB = (this.f201113d & 64) == 64 ? this.f201121m.b() : null;
                                us.b.C5222b.c cVar = (us.b.C5222b.c) eVar.u(us.b.C5222b.c.f200622t, gVar);
                                this.f201121m = cVar;
                                if (c5224bB != null) {
                                    c5224bB.q(cVar);
                                    this.f201121m = c5224bB.w();
                                }
                                this.f201113d |= 64;
                            }
                        } else {
                            this.f201113d |= 2;
                            this.f201115f = eVar.s();
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    if (((c15 == true ? 1 : 0) & '@') == 64) {
                        this.f201120l = Collections.unmodifiableList(this.f201120l);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f201112c = bVarU.r();
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
        if (((c15 == true ? 1 : 0) & '@') == 64) {
            this.f201120l = Collections.unmodifiableList(this.f201120l);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f201112c = bVarU.r();
        }
        n();
    }
}
