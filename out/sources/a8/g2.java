package a8;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class g2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b8.a f4446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w7.p f4447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d2.a f4448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f4449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x.c f4452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d2 f4453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d2 f4454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d2 f4455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d2 f4456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d2 f4457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f4458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object f4459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f4460q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t7.e0.b f4444a = new t7.e0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.e0.c f4445b = new t7.e0.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<d2> f4461r = new ArrayList();

    public g2(b8.a aVar, w7.p pVar, d2.a aVar2, x.c cVar) {
        this.f4446c = aVar;
        this.f4447d = pVar;
        this.f4448e = aVar2;
        this.f4452i = cVar;
    }

    private boolean A(Object obj, t7.e0 e0Var) {
        int iC = e0Var.h(obj, this.f4444a).c();
        int iP = this.f4444a.p();
        if (iC <= 0 || !this.f4444a.s(iP)) {
            return false;
        }
        return iC > 1 || this.f4444a.f(iP) != Long.MIN_VALUE;
    }

    private boolean C(h8.c0.b bVar) {
        return !bVar.b() && bVar.f81472e == -1;
    }

    private boolean D(t7.e0 e0Var, h8.c0.b bVar, boolean z15) {
        int iB = e0Var.b(bVar.f81468a);
        return !e0Var.n(e0Var.f(iB, this.f4444a).f188138c, this.f4445b).f188161i && e0Var.r(iB, this.f4444a, this.f4445b, this.f4450g, this.f4451h) && z15;
    }

    private boolean E(t7.e0 e0Var, h8.c0.b bVar) {
        if (C(bVar)) {
            return e0Var.n(e0Var.h(bVar.f81468a, this.f4444a).f188138c, this.f4445b).f188167o == e0Var.b(bVar.f81468a);
        }
        return false;
    }

    private static boolean H(t7.e0.b bVar) {
        int iC = bVar.c();
        if (iC != 0 && ((iC != 1 || !bVar.r(0)) && bVar.s(bVar.p()))) {
            long jI = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.f188139d == 0) {
                    return true;
                }
                int i15 = iC - (bVar.r(iC + (-1)) ? 2 : 1);
                for (int i16 = 0; i16 <= i15; i16++) {
                    jI += bVar.i(i16);
                }
                if (bVar.f188139d <= jI) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        final ak.n0.a aVarS = ak.n0.s();
        for (d2 d2VarK = this.f4453j; d2VarK != null; d2VarK = d2VarK.k()) {
            aVarS.a(d2VarK.f4346h.f4370a);
        }
        d2 d2Var = this.f4454k;
        final h8.c0.b bVar = d2Var == null ? null : d2Var.f4346h.f4370a;
        this.f4447d.j(new Runnable() { // from class: a8.f2
            @Override // java.lang.Runnable
            public final void run() {
                this.f4406a.f4446c.U(aVarS.k(), bVar);
            }
        });
    }

    private void L(List<d2> list) {
        for (int i15 = 0; i15 < this.f4461r.size(); i15++) {
            this.f4461r.get(i15).x();
        }
        this.f4461r = list;
        this.f4457n = null;
        I();
    }

    private d2 O(e2 e2Var) {
        for (int i15 = 0; i15 < this.f4461r.size(); i15++) {
            if (this.f4461r.get(i15).d(e2Var)) {
                return this.f4461r.remove(i15);
            }
        }
        return null;
    }

    private static h8.c0.b P(t7.e0 e0Var, Object obj, long j15, long j16, t7.e0.c cVar, t7.e0.b bVar) {
        e0Var.h(obj, bVar);
        e0Var.n(bVar.f188138c, cVar);
        for (int iB = e0Var.b(obj); H(bVar) && iB <= cVar.f188167o; iB++) {
            e0Var.g(iB, bVar, true);
            obj = zj.p.q(bVar.f188137b);
        }
        e0Var.h(obj, bVar);
        int iE = bVar.e(j15);
        return iE == -1 ? new h8.c0.b(obj, j16, bVar.d(j15)) : new h8.c0.b(obj, iE, bVar.l(iE), j16);
    }

    private long R(t7.e0 e0Var, Object obj) {
        int iB;
        int i15 = e0Var.h(obj, this.f4444a).f188138c;
        Object obj2 = this.f4459p;
        if (obj2 != null && (iB = e0Var.b(obj2)) != -1 && e0Var.f(iB, this.f4444a).f188138c == i15) {
            return this.f4460q;
        }
        for (d2 d2VarK = this.f4453j; d2VarK != null; d2VarK = d2VarK.k()) {
            if (d2VarK.f4340b.equals(obj)) {
                return d2VarK.f4346h.f4370a.f81471d;
            }
        }
        for (d2 d2VarK2 = this.f4453j; d2VarK2 != null; d2VarK2 = d2VarK2.k()) {
            int iB2 = e0Var.b(d2VarK2.f4340b);
            if (iB2 != -1 && e0Var.f(iB2, this.f4444a).f188138c == i15) {
                return d2VarK2.f4346h.f4370a.f81471d;
            }
        }
        long jS = S(obj);
        if (jS != -1) {
            return jS;
        }
        long j15 = this.f4449f;
        this.f4449f = 1 + j15;
        if (this.f4453j == null) {
            this.f4459p = obj;
            this.f4460q = j15;
        }
        return j15;
    }

    private long S(Object obj) {
        for (int i15 = 0; i15 < this.f4461r.size(); i15++) {
            d2 d2Var = this.f4461r.get(i15);
            if (d2Var.f4340b.equals(obj)) {
                return d2Var.f4346h.f4370a.f81471d;
            }
        }
        return -1L;
    }

    private static boolean U(t7.e0 e0Var, int i15, long j15, t7.e0.c cVar) {
        if (j15 != -9223372036854775807L) {
            return false;
        }
        e0Var.n(i15, cVar);
        return cVar.f188161i && !cVar.f188163k;
    }

    private int V(t7.e0 e0Var) {
        t7.e0 e0Var2;
        d2 d2VarK = this.f4453j;
        if (d2VarK == null) {
            return 0;
        }
        int iB = e0Var.b(d2VarK.f4340b);
        while (true) {
            e0Var2 = e0Var;
            iB = e0Var2.d(iB, this.f4444a, this.f4445b, this.f4450g, this.f4451h);
            while (((d2) zj.p.q(d2VarK)).k() != null && !d2VarK.f4346h.f4378i) {
                d2VarK = d2VarK.k();
            }
            d2 d2VarK2 = d2VarK.k();
            if (iB == -1 || d2VarK2 == null || e0Var2.b(d2VarK2.f4340b) != iB) {
                break;
            }
            d2VarK = d2VarK2;
            e0Var = e0Var2;
        }
        int iN = N(d2VarK);
        d2VarK.f4346h = z(e0Var2, d2VarK.f4346h);
        return iN;
    }

    static boolean e(long j15, long j16) {
        return j15 == -9223372036854775807L || j15 == j16;
    }

    private boolean f(e2 e2Var, e2 e2Var2) {
        if (!e2Var.f4370a.equals(e2Var2.f4370a)) {
            return false;
        }
        long j15 = e2Var.f4371b;
        long j16 = e2Var2.f4371b;
        if (j15 == j16) {
            return true;
        }
        long j17 = e2Var.f4372c;
        if (j17 != -9223372036854775807L) {
            long j18 = e2Var2.f4372c;
            if (j18 != -9223372036854775807L) {
                if (Math.abs((j16 - j18) - (j15 - j17)) < 5000000) {
                    return true;
                }
            }
        }
        return false;
    }

    private Pair<Object, Long> i(t7.e0 e0Var, Object obj, long j15) {
        int iE = e0Var.e(e0Var.h(obj, this.f4444a).f188138c, this.f4450g, this.f4451h);
        if (iE != -1) {
            return e0Var.k(this.f4445b, this.f4444a, iE, -9223372036854775807L, j15);
        }
        return null;
    }

    private e2 j(v2 v2Var) {
        return o(v2Var.f4649a, v2Var.f4650b, v2Var.f4651c, v2Var.f4667s, -9223372036854775807L);
    }

    private e2 k(t7.e0 e0Var, d2 d2Var, long j15) {
        Object obj;
        long j16;
        long j17;
        long j18;
        long j19;
        long j25;
        e2 e2Var = d2Var.f4346h;
        int iD = e0Var.d(e0Var.b(e2Var.f4370a.f81468a), this.f4444a, this.f4445b, this.f4450g, this.f4451h);
        if (iD == -1) {
            return null;
        }
        int i15 = e0Var.g(iD, this.f4444a, true).f188138c;
        Object objQ = zj.p.q(this.f4444a.f188137b);
        long j26 = e2Var.f4370a.f81471d;
        if (e0Var.n(i15, this.f4445b).f188166n == iD) {
            t7.e0.b bVar = this.f4444a;
            long jMax = U(e0Var, bVar.f188138c, bVar.f188139d, this.f4445b) ? Math.max(0L, j15) : -9223372036854775807L;
            Pair<Object, Long> pairK = e0Var.k(this.f4445b, this.f4444a, i15, -9223372036854775807L, jMax);
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            d2 d2VarK = d2Var.k();
            if (d2VarK == null || !d2VarK.f4340b.equals(obj2)) {
                long jS = S(obj2);
                if (jS == -1) {
                    jS = this.f4449f;
                    this.f4449f = 1 + jS;
                }
                j26 = jS;
            } else {
                j26 = d2VarK.f4346h.f4370a.f81471d;
            }
            obj = obj2;
            j16 = jLongValue;
            j17 = -9223372036854775807L;
            j18 = jMax;
        } else {
            obj = objQ;
            j16 = 0;
            j17 = 0;
            j18 = -9223372036854775807L;
        }
        h8.c0.b bVarP = P(e0Var, obj, j16, j26, this.f4445b, this.f4444a);
        if (j17 == -9223372036854775807L || e2Var.f4373d == -9223372036854775807L) {
            j19 = j16;
            j25 = j17;
        } else {
            boolean zA = A(e2Var.f4370a.f81468a, e0Var);
            if (bVarP.b() && zA) {
                j19 = j16;
                j25 = e2Var.f4373d;
            } else {
                if (zA) {
                    j16 = e2Var.f4373d;
                }
                j19 = j16;
                j25 = j17;
            }
        }
        return o(e0Var, bVarP, j25, j19, j18);
    }

    private e2 l(t7.e0 e0Var, d2 d2Var, long j15) {
        e2 e2Var = d2Var.f4346h;
        long jM = (d2Var.m() + e2Var.f4375f) - j15;
        return e2Var.f4378i ? k(e0Var, d2Var, jM) : m(e0Var, d2Var, jM);
    }

    private e2 m(t7.e0 e0Var, d2 d2Var, long j15) {
        t7.e0 e0Var2;
        long j16;
        e2 e2Var = d2Var.f4346h;
        h8.c0.b bVar = e2Var.f4370a;
        e0Var.h(bVar.f81468a, this.f4444a);
        boolean z15 = e2Var.f4377h;
        if (!bVar.b()) {
            int i15 = bVar.f81472e;
            if (i15 != -1 && this.f4444a.r(i15)) {
                return k(e0Var, d2Var, j15);
            }
            int iL = this.f4444a.l(bVar.f81472e);
            boolean z16 = this.f4444a.s(bVar.f81472e) && this.f4444a.h(bVar.f81472e, iL) == 3;
            if (iL == this.f4444a.a(bVar.f81472e) || z16) {
                return q(e0Var, bVar.f81468a, s(e0Var, bVar.f81468a, bVar.f81472e), -9223372036854775807L, e2Var.f4375f, bVar.f81471d, false);
            }
            return p(e0Var, bVar.f81468a, bVar.f81472e, iL, e2Var.f4375f, bVar.f81471d, z15);
        }
        int i16 = bVar.f81469b;
        int iA = this.f4444a.a(i16);
        if (iA == -1) {
            return null;
        }
        int iM = this.f4444a.m(i16, bVar.f81470c);
        if (iM < iA) {
            return p(e0Var, bVar.f81468a, i16, iM, e2Var.f4373d, bVar.f81471d, z15);
        }
        long jLongValue = e2Var.f4373d;
        if (jLongValue == -9223372036854775807L) {
            t7.e0.b bVar2 = this.f4444a;
            long jMax = U(e0Var, bVar2.f188138c, bVar2.f188139d, this.f4445b) ? Math.max(0L, j15) : -9223372036854775807L;
            t7.e0.c cVar = this.f4445b;
            t7.e0.b bVar3 = this.f4444a;
            e0Var2 = e0Var;
            Pair<Object, Long> pairK = e0Var2.k(cVar, bVar3, bVar3.f188138c, -9223372036854775807L, jMax);
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
            j16 = jMax;
        } else {
            e0Var2 = e0Var;
            j16 = -9223372036854775807L;
        }
        return q(e0Var2, bVar.f81468a, Math.max(s(e0Var2, bVar.f81468a, bVar.f81469b), jLongValue), j16, e2Var.f4373d, bVar.f81471d, z15);
    }

    private e2 o(t7.e0 e0Var, h8.c0.b bVar, long j15, long j16, long j17) {
        e0Var.h(bVar.f81468a, this.f4444a);
        return bVar.b() ? p(e0Var, bVar.f81468a, bVar.f81469b, bVar.f81470c, j15, bVar.f81471d, false) : q(e0Var, bVar.f81468a, j16, j17, j15, bVar.f81471d, false);
    }

    private e2 p(t7.e0 e0Var, Object obj, int i15, int i16, long j15, long j16, boolean z15) {
        h8.c0.b bVar = new h8.c0.b(obj, i15, i16, j16);
        long jB = e0Var.h(bVar.f81468a, this.f4444a).b(bVar.f81469b, bVar.f81470c);
        long jG = i16 == this.f4444a.l(i15) ? this.f4444a.g() : 0L;
        boolean zS = this.f4444a.s(bVar.f81469b);
        if (jB != -9223372036854775807L && jG >= jB) {
            jG = Math.max(0L, jB - 1);
        }
        return new e2(bVar, jG, -9223372036854775807L, j15, -9223372036854775807L, jB, z15, zS, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    private e2 q(t7.e0 e0Var, Object obj, long j15, long j16, long j17, long j18, boolean z15) {
        boolean z16;
        long j19;
        long jF;
        long j25;
        long jMax = j15;
        e0Var.h(obj, this.f4444a);
        int iD = this.f4444a.d(jMax);
        int i15 = 1;
        if (iD == -1) {
            if (this.f4444a.c() > 0) {
                t7.e0.b bVar = this.f4444a;
                if (bVar.s(bVar.p())) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } else {
                z16 = false;
            }
        } else if (this.f4444a.s(iD)) {
            long jF2 = this.f4444a.f(iD);
            t7.e0.b bVar2 = this.f4444a;
            if (jF2 == bVar2.f188139d && bVar2.q(iD)) {
                z16 = true;
                iD = -1;
            } else {
                z16 = false;
            }
        } else {
            z16 = false;
        }
        h8.c0.b bVar3 = new h8.c0.b(obj, j18, iD);
        boolean zC = C(bVar3);
        boolean zE = E(e0Var, bVar3);
        boolean zD = D(e0Var, bVar3, zC);
        boolean z17 = (iD == -1 || !this.f4444a.s(iD) || this.f4444a.r(iD)) ? false : true;
        boolean z18 = iD != -1 && this.f4444a.r(iD) && this.f4444a.s(iD);
        if (iD == -1 || z18) {
            if (z16) {
                jF = this.f4444a.f188139d;
            } else {
                j19 = -9223372036854775807L;
            }
            if (j19 != -9223372036854775807L || j19 == Long.MIN_VALUE) {
                j25 = this.f4444a.f188139d;
            } else {
                j25 = j19;
            }
            if (j25 != -9223372036854775807L && jMax >= j25) {
                if (!zD && z16) {
                    i15 = 0;
                }
                jMax = Math.max(0L, j25 - ((long) i15));
            }
            return new e2(bVar3, jMax, j16, j17, j19, j25, z15, z17, zC, zE, zD);
        }
        jF = this.f4444a.f(iD);
        j19 = jF;
        if (j19 != -9223372036854775807L) {
            j25 = this.f4444a.f188139d;
        } else {
            j25 = this.f4444a.f188139d;
        }
        if (j25 != -9223372036854775807L) {
            if (!zD) {
                i15 = 0;
            }
            jMax = Math.max(0L, j25 - ((long) i15));
        }
        return new e2(bVar3, jMax, j16, j17, j19, j25, z15, z17, zC, zE, zD);
    }

    private e2 r(t7.e0 e0Var, Object obj, long j15, long j16) {
        h8.c0.b bVarP = P(e0Var, obj, j15, j16, this.f4445b, this.f4444a);
        return bVarP.b() ? p(e0Var, bVarP.f81468a, bVarP.f81469b, bVarP.f81470c, j15, bVarP.f81471d, false) : q(e0Var, bVarP.f81468a, j15, -9223372036854775807L, -9223372036854775807L, bVarP.f81471d, false);
    }

    private long s(t7.e0 e0Var, Object obj, int i15) {
        e0Var.h(obj, this.f4444a);
        long jF = this.f4444a.f(i15);
        return jF == Long.MIN_VALUE ? this.f4444a.f188139d : jF + this.f4444a.i(i15);
    }

    public void B(t7.e0 e0Var) {
        d2 d2Var;
        if (this.f4452i.f4772a == -9223372036854775807L || (d2Var = this.f4456m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pairI = i(e0Var, d2Var.f4346h.f4370a.f81468a, 0L);
        if (pairI != null && !e0Var.n(e0Var.h(pairI.first, this.f4444a).f188138c, this.f4445b).f()) {
            long jS = S(pairI.first);
            if (jS == -1) {
                jS = this.f4449f;
                this.f4449f = 1 + jS;
            }
            e2 e2VarR = r(e0Var, pairI.first, ((Long) pairI.second).longValue(), jS);
            d2 d2VarO = O(e2VarR);
            if (d2VarO == null) {
                d2VarO = this.f4448e.a(e2VarR, (d2Var.m() + d2Var.f4346h.f4375f) - e2VarR.f4371b);
            }
            arrayList.add(d2VarO);
        }
        L(arrayList);
    }

    public boolean F(h8.b0 b0Var) {
        d2 d2Var = this.f4456m;
        return d2Var != null && d2Var.f4339a == b0Var;
    }

    public boolean G(h8.b0 b0Var) {
        d2 d2Var = this.f4457n;
        return d2Var != null && d2Var.f4339a == b0Var;
    }

    public void I() {
        d2 d2Var = this.f4457n;
        if (d2Var == null || d2Var.t()) {
            this.f4457n = null;
            for (int i15 = 0; i15 < this.f4461r.size(); i15++) {
                d2 d2Var2 = this.f4461r.get(i15);
                if (!d2Var2.t()) {
                    this.f4457n = d2Var2;
                    return;
                }
            }
        }
    }

    public void K(long j15) {
        d2 d2Var = this.f4456m;
        if (d2Var != null) {
            d2Var.w(j15);
        }
    }

    public void M() {
        if (this.f4461r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(d2 d2Var) {
        zj.p.q(d2Var);
        int i15 = 0;
        if (d2Var.equals(this.f4456m)) {
            return 0;
        }
        this.f4456m = d2Var;
        while (d2Var.k() != null) {
            d2Var = (d2) zj.p.q(d2Var.k());
            if (d2Var == this.f4454k) {
                d2 d2Var2 = this.f4453j;
                this.f4454k = d2Var2;
                this.f4455l = d2Var2;
                i15 = 3;
            }
            if (d2Var == this.f4455l) {
                this.f4455l = this.f4454k;
                i15 |= 2;
            }
            d2Var.x();
            this.f4458o--;
        }
        ((d2) zj.p.q(this.f4456m)).A(null);
        J();
        return i15;
    }

    public h8.c0.b Q(t7.e0 e0Var, Object obj, long j15) {
        long jR = R(e0Var, obj);
        e0Var.h(obj, this.f4444a);
        e0Var.n(this.f4444a.f188138c, this.f4445b);
        boolean z15 = false;
        for (int iB = e0Var.b(obj); iB >= this.f4445b.f188166n; iB--) {
            e0Var.g(iB, this.f4444a, true);
            boolean z16 = this.f4444a.c() > 0;
            z15 |= z16;
            t7.e0.b bVar = this.f4444a;
            if (bVar.e(bVar.f188139d) != -1) {
                obj = zj.p.q(this.f4444a.f188137b);
            }
            if (z15 && (!z16 || this.f4444a.f188139d != 0)) {
                break;
            }
        }
        return P(e0Var, obj, j15, jR, this.f4445b, this.f4444a);
    }

    public boolean T() {
        d2 d2Var = this.f4456m;
        if (d2Var != null) {
            return !d2Var.f4346h.f4380k && d2Var.s() && this.f4456m.f4346h.f4375f != -9223372036854775807L && this.f4458o < 100;
        }
        return true;
    }

    public void W(t7.e0 e0Var, x.c cVar) {
        this.f4452i = cVar;
        B(e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    public int X(t7.e0 e0Var, long j15, long j16, long j17) {
        e2 e2VarB;
        boolean z15;
        d2 d2VarK = this.f4453j;
        d2 d2Var = null;
        while (d2VarK != null) {
            e2 e2Var = d2VarK.f4346h;
            if (d2Var == null) {
                e2VarB = z(e0Var, e2Var);
            } else {
                e2 e2VarL = l(e0Var, d2Var, j15);
                if (e2VarL == null || !f(e2Var, e2VarL)) {
                    return N(d2Var);
                }
                long j18 = e2Var.f4371b;
                e2VarB = j18 != e2VarL.f4371b ? e2VarL.b(j18, e2Var.f4372c) : e2VarL;
            }
            d2VarK.f4346h = e2VarB.a(e2Var.f4373d);
            if (e2Var.f4375f != e2VarB.f4375f) {
                d2VarK.E();
                long j19 = e2VarB.f4375f;
                long jD = j19 == -9223372036854775807L ? Long.MAX_VALUE : d2VarK.D(j19);
                boolean z16 = d2VarK == this.f4454k && !d2VarK.f4346h.f4377h && (j16 == Long.MIN_VALUE || j16 >= jD);
                boolean z17 = d2VarK == this.f4455l && (j17 == Long.MIN_VALUE || j17 >= jD);
                int iN = N(d2VarK);
                if (iN != 0) {
                    return iN;
                }
                long j25 = e2Var.f4375f;
                if (j25 == -9223372036854775807L && e2Var.f4374e == Long.MIN_VALUE) {
                    long j26 = e2VarB.f4374e;
                    if (j26 == -9223372036854775807L || j26 == Long.MIN_VALUE) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                } else {
                    z15 = false;
                }
                int i15 = (!z16 || (j25 == -9223372036854775807L && !z15)) ? 0 : 1;
                return z17 ? i15 | 2 : i15;
            }
            d2Var = d2VarK;
            d2VarK = d2VarK.k();
        }
        return 0;
    }

    public int Y(t7.e0 e0Var, int i15) {
        this.f4450g = i15;
        return V(e0Var);
    }

    public int Z(t7.e0 e0Var, boolean z15) {
        this.f4451h = z15;
        return V(e0Var);
    }

    public d2 b() {
        d2 d2Var = this.f4453j;
        if (d2Var == null) {
            return null;
        }
        if (d2Var == this.f4454k) {
            this.f4454k = d2Var.k();
        }
        d2 d2Var2 = this.f4453j;
        if (d2Var2 == this.f4455l) {
            this.f4455l = d2Var2.k();
        }
        this.f4453j.x();
        int i15 = this.f4458o - 1;
        this.f4458o = i15;
        if (i15 == 0) {
            this.f4456m = null;
            d2 d2Var3 = this.f4453j;
            this.f4459p = d2Var3.f4340b;
            this.f4460q = d2Var3.f4346h.f4370a.f81471d;
        }
        this.f4453j = this.f4453j.k();
        J();
        return this.f4453j;
    }

    public d2 c() {
        this.f4455l = ((d2) zj.p.q(this.f4455l)).k();
        J();
        return (d2) zj.p.q(this.f4455l);
    }

    public d2 d() {
        d2 d2Var = this.f4455l;
        d2 d2Var2 = this.f4454k;
        if (d2Var == d2Var2) {
            this.f4455l = ((d2) zj.p.q(d2Var2)).k();
        }
        this.f4454k = ((d2) zj.p.q(this.f4454k)).k();
        J();
        return (d2) zj.p.q(this.f4454k);
    }

    public void g() {
        if (this.f4458o == 0) {
            return;
        }
        d2 d2VarK = (d2) zj.p.q(this.f4453j);
        this.f4459p = d2VarK.f4340b;
        this.f4460q = d2VarK.f4346h.f4370a.f81471d;
        while (d2VarK != null) {
            d2VarK.x();
            d2VarK = d2VarK.k();
        }
        this.f4453j = null;
        this.f4456m = null;
        this.f4454k = null;
        this.f4455l = null;
        this.f4458o = 0;
        J();
    }

    public d2 h(e2 e2Var) {
        d2 d2Var = this.f4456m;
        long jM = d2Var == null ? 1000000000000L : (d2Var.m() + this.f4456m.f4346h.f4375f) - e2Var.f4371b;
        d2 d2VarO = O(e2Var);
        if (d2VarO == null) {
            d2VarO = this.f4448e.a(e2Var, jM);
        } else {
            d2VarO.f4346h = e2Var;
            d2VarO.B(jM);
        }
        d2 d2Var2 = this.f4456m;
        if (d2Var2 != null) {
            d2Var2.A(d2VarO);
        } else {
            this.f4453j = d2VarO;
            this.f4454k = d2VarO;
            this.f4455l = d2VarO;
        }
        this.f4459p = null;
        this.f4456m = d2VarO;
        this.f4458o++;
        J();
        return d2VarO;
    }

    public d2 n() {
        return this.f4456m;
    }

    public e2 t(long j15, v2 v2Var) {
        d2 d2Var = this.f4456m;
        return d2Var == null ? j(v2Var) : l(v2Var.f4649a, d2Var, j15);
    }

    public d2 u() {
        return this.f4453j;
    }

    public d2 v(h8.b0 b0Var) {
        for (int i15 = 0; i15 < this.f4461r.size(); i15++) {
            d2 d2Var = this.f4461r.get(i15);
            if (d2Var.f4339a == b0Var) {
                return d2Var;
            }
        }
        return null;
    }

    public d2 w() {
        return this.f4457n;
    }

    public d2 x() {
        return this.f4455l;
    }

    public d2 y() {
        return this.f4454k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    public e2 z(t7.e0 e0Var, e2 e2Var) {
        long jK;
        long j15;
        int i15;
        boolean zS;
        int i16;
        h8.c0.b bVar = e2Var.f4370a;
        boolean zC = C(bVar);
        boolean zE = E(e0Var, bVar);
        boolean zD = D(e0Var, bVar, zC);
        e0Var.h(e2Var.f4370a.f81468a, this.f4444a);
        long jF = (bVar.b() || (i16 = bVar.f81472e) == -1) ? -9223372036854775807L : this.f4444a.f(i16);
        if (!bVar.b()) {
            if (jF == -9223372036854775807L || jF == Long.MIN_VALUE) {
                jK = this.f4444a.k();
            } else {
                j15 = jF;
            }
            if (bVar.b()) {
                zS = this.f4444a.s(bVar.f81469b);
            } else {
                i15 = bVar.f81472e;
                if (i15 == -1 && this.f4444a.s(i15)) {
                    zS = true;
                } else {
                    zS = false;
                }
            }
            return new e2(bVar, e2Var.f4371b, e2Var.f4372c, e2Var.f4373d, jF, j15, e2Var.f4376g, zS, zC, zE, zD);
        }
        jK = this.f4444a.b(bVar.f81469b, bVar.f81470c);
        j15 = jK;
        if (bVar.b()) {
            zS = this.f4444a.s(bVar.f81469b);
        } else {
            i15 = bVar.f81472e;
            if (i15 == -1) {
                zS = false;
            } else {
                zS = false;
            }
        }
        return new e2(bVar, e2Var.f4371b, e2Var.f4372c, e2Var.f4373d, jF, j15, e2Var.f4376g, zS, zC, zE, zD);
    }
}
