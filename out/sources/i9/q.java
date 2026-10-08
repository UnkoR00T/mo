package i9;

import ak.n0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o8.e0;
import o8.i0;
import o8.k0;
import o8.l0;
import o8.m0;
import o8.p0;
import o8.s0;
import o8.t0;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements o8.p {

    @Deprecated
    public static final o8.u G = new o8.u() { // from class: i9.m
        @Override // o8.u
        public final o8.p[] f() {
            return q.j();
        }
    };
    private long A;
    private o8.r B;
    private b[] C;
    private long[][] D;
    private int E;
    private x8.c F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l9.s.a f90435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f90436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f90437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0 f90438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f90439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f90440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f90441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayDeque<x7.d.b> f90442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f90443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<t7.v.a> f90444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n0<p0> f90445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f90446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f90447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f90448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f90449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c0 f90450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f90451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f90452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f90453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f90454t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f90455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f90456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f90457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f90458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f90459y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f90460z;

    private static final class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f90461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f90462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f90463c;

        public a(long j15, b[] bVarArr, int i15) {
            this.f90461a = j15;
            this.f90462b = bVarArr;
            this.f90463c = i15;
        }

        @Override // o8.l0
        public l0.a c(long j15) {
            return i(j15, -1);
        }

        @Override // o8.l0
        public boolean e() {
            return true;
        }

        @Override // o8.l0
        public long h() {
            return this.f90461a;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0062  */
        /* JADX WARN: Code duplicated, block: B:30:0x0068  */
        /* JADX WARN: Code duplicated, block: B:32:0x006c  */
        /* JADX WARN: Code duplicated, block: B:34:0x0078  */
        /* JADX WARN: Code duplicated, block: B:39:0x0089  */
        /* JADX WARN: Code duplicated, block: B:41:0x008f  */
        /* JADX WARN: Code duplicated, block: B:43:0x0080 A[EDGE_INSN: B:43:0x0080->B:37:0x0080 BREAK  A[LOOP:0: B:28:0x0063->B:36:0x007d], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x007d A[SYNTHETIC] */
        public l0.a i(long j15, int i15) {
            long j16;
            long j17;
            long jY;
            long j18;
            int i16;
            b[] bVarArr;
            z zVar;
            int iB;
            b[] bVarArr2 = this.f90462b;
            if (bVarArr2.length == 0) {
                return new l0.a(m0.f143157c);
            }
            int i17 = i15 != -1 ? i15 : this.f90463c;
            if (i17 != -1) {
                z zVar2 = bVarArr2[i17].f90465b;
                int iW = q.w(zVar2, j15);
                if (iW == -1) {
                    return new l0.a(m0.f143157c);
                }
                j17 = zVar2.f90524f[iW];
                j16 = zVar2.f90521c[iW];
                if (j17 < j15 && iW < zVar2.f90520b - 1 && (iB = zVar2.b(j15)) != -1 && iB != iW) {
                    j18 = zVar2.f90524f[iB];
                    jY = zVar2.f90521c[iB];
                }
                if (i15 == -1) {
                    i16 = 0;
                    while (true) {
                        bVarArr = this.f90462b;
                        if (i16 < bVarArr.length) {
                            break;
                        }
                        if (i16 != this.f90463c) {
                            zVar = bVarArr[i16].f90465b;
                            long jY2 = q.y(zVar, j17, j16);
                            if (j18 != -9223372036854775807L) {
                                jY = q.y(zVar, j18, jY);
                            }
                            j16 = jY2;
                        }
                        i16++;
                    }
                }
                m0 m0Var = new m0(j17, j16);
                return j18 == -9223372036854775807L ? new l0.a(m0Var) : new l0.a(m0Var, new m0(j18, jY));
            }
            j16 = Long.MAX_VALUE;
            j17 = j15;
            jY = -1;
            j18 = -9223372036854775807L;
            if (i15 == -1) {
                i16 = 0;
                while (true) {
                    bVarArr = this.f90462b;
                    if (i16 < bVarArr.length) {
                        break;
                        break;
                    }
                    if (i16 != this.f90463c) {
                        zVar = bVarArr[i16].f90465b;
                        long jY3 = q.y(zVar, j17, j16);
                        if (j18 != -9223372036854775807L) {
                            jY = q.y(zVar, j18, jY);
                        }
                        j16 = jY3;
                    }
                    i16++;
                }
            }
            m0 m0Var2 = new m0(j17, j16);
            if (j18 == -9223372036854775807L) {
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f90464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z f90465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s0 f90466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t0 f90467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f90468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public t7.p f90469f;

        public b(w wVar, z zVar, s0 s0Var) {
            this.f90464a = wVar;
            this.f90465b = zVar;
            this.f90466c = s0Var;
            this.f90467d = "audio/true-hd".equals(wVar.f90490g.f188381p) ? new t0() : null;
        }
    }

    @Deprecated
    public q() {
        this(l9.s.a.f117245a, 16);
    }

    private void A(o8.q qVar) {
        this.f90440f.b0(8);
        qVar.p(this.f90440f.f(), 0, 8);
        i9.b.g(this.f90440f);
        qVar.n(this.f90440f.g());
        qVar.g();
    }

    private void B(long j15) {
        while (!this.f90442h.isEmpty() && this.f90442h.peek().f217151b == j15) {
            x7.d.b bVarPop = this.f90442h.pop();
            if (bVarPop.f217150a == 1836019574) {
                E(bVarPop);
                this.f90442h.clear();
                this.f90460z = true;
                if (!this.f90457w && !this.f90437c) {
                    this.f90446l = 2;
                }
            } else if (!this.f90442h.isEmpty()) {
                this.f90442h.peek().b(bVarPop);
            }
        }
        if (this.f90446l != 2) {
            s();
        }
    }

    private void C() {
        if (this.E != 2 || (this.f90436b & 2) == 0) {
            return;
        }
        s0 s0VarV = this.B.v(0, 4);
        x8.c cVar = this.F;
        s0VarV.e(new t7.p.b().s0(cVar == null ? null : new t7.v(cVar)).Q());
        this.B.s();
        this.B.f(new l0.b(-9223372036854775807L));
    }

    private static int D(c0 c0Var) {
        c0Var.f0(8);
        int iO = o(c0Var.z());
        if (iO != 0) {
            return iO;
        }
        c0Var.g0(4);
        while (c0Var.a() > 0) {
            int iO2 = o(c0Var.z());
            if (iO2 != 0) {
                return iO2;
            }
        }
        return 0;
    }

    private void E(x7.d.b bVar) {
        List<Integer> list;
        t7.v vVar;
        t7.v vVarI;
        int i15;
        t7.v vVar2;
        t7.v vVar3;
        ArrayList arrayList;
        x7.d.b bVarD = bVar.d(1835365473);
        List<Integer> arrayList2 = new ArrayList<>();
        if (bVarD != null) {
            t7.v vVarU = i9.b.u(bVarD);
            if (this.f90459y) {
                zj.p.q(vVarU);
                z(vVarU);
                arrayList2 = u(vVarU);
            } else if (M(vVarU)) {
                this.f90457w = true;
                return;
            }
            vVar = vVarU;
            list = arrayList2;
        } else {
            list = arrayList2;
            vVar = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z15 = this.E == 1;
        e0 e0Var = new e0();
        x7.d.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            vVarI = i9.b.I(cVarE);
            e0Var.e(vVarI);
        } else {
            vVarI = null;
        }
        t7.v vVar4 = new t7.v(i9.b.w(((x7.d.c) zj.p.q(bVar.e(1836476516))).f217154b));
        t7.v vVar5 = vVarI;
        List<z> listH = i9.b.H(bVar, e0Var, -9223372036854775807L, null, (this.f90436b & 1) != 0, z15, new zj.g() { // from class: i9.l
            @Override // zj.g
            public final Object apply(Object obj) {
                return q.h((w) obj);
            }
        }, this.f90437c);
        if (this.f90459y) {
            zj.p.x(list.size() == listH.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listH.size())));
        }
        String strA = k.a(listH);
        int i16 = 0;
        int i17 = 0;
        long j15 = -9223372036854775807L;
        int size = -1;
        while (i16 < listH.size()) {
            z zVar = listH.get(i16);
            if (zVar.f90520b == 0) {
                i15 = i17;
                vVar2 = vVar5;
                vVar3 = vVar;
                arrayList = arrayList3;
            } else {
                w wVar = zVar.f90519a;
                ArrayList arrayList4 = arrayList3;
                i15 = i17 + 1;
                String str = strA;
                b bVar2 = new b(wVar, zVar, this.B.v(i17, wVar.f90485b));
                vVar2 = vVar5;
                t7.v vVar6 = vVar;
                long j16 = wVar.f90488e;
                if (j16 == -9223372036854775807L) {
                    j16 = zVar.f90527i;
                }
                bVar2.f90466c.d(j16);
                long jMax = Math.max(j15, j16);
                int i18 = "audio/true-hd".equals(wVar.f90490g.f188381p) ? zVar.f90523e * 16 : zVar.f90523e + 30;
                t7.p.b bVarB = wVar.f90490g.b();
                bVarB.p0(i18);
                if (wVar.f90485b == 2) {
                    int i19 = wVar.f90490g.f188371f;
                    if ((this.f90436b & 8) != 0) {
                        i19 |= size == -1 ? 1 : 2;
                    }
                    if (this.f90459y) {
                        i19 |= 32768;
                        bVarB.S(list.get(i16).intValue());
                    }
                    bVarB.y0(i19);
                }
                long jT = t(zVar, j16);
                t7.v vVar7 = jT != -9223372036854775807L ? new t7.v(new x8.e(jT)) : null;
                j.k(wVar.f90485b, e0Var, bVarB);
                vVar3 = vVar6;
                j.l(wVar.f90485b, vVar3, bVarB, wVar.f90490g.f188377l, this.f90444j.isEmpty() ? null : new t7.v(this.f90444j), vVar2, vVar4, vVar7);
                strA = str;
                bVarB.X(strA);
                if (Objects.equals(wVar.f90490g.f188381p, "audio/mpeg")) {
                    bVar2.f90469f = bVarB.Q();
                } else {
                    bVar2.f90466c.e(bVarB.Q());
                }
                if (wVar.f90485b == 2 && size == -1) {
                    size = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(bVar2);
                j15 = jMax;
            }
            i16++;
            vVar = vVar3;
            arrayList3 = arrayList;
            listH = listH;
            vVar5 = vVar2;
            i17 = i15;
        }
        b[] bVarArr = (b[]) arrayList3.toArray(new b[0]);
        this.C = bVarArr;
        this.D = !this.f90437c ? p(bVarArr) : null;
        this.B.s();
        this.B.f(new a(j15, this.C, size));
    }

    private void F(long j15) {
        if (this.f90447m == 1836086884) {
            int i15 = this.f90449o;
            this.F = new x8.c(0L, j15, -9223372036854775807L, j15 + ((long) i15), this.f90448n - ((long) i15));
        }
    }

    private boolean G(o8.q qVar) throws t7.x {
        x7.d.b bVarPeek;
        if (this.f90449o == 0) {
            if (!qVar.h(this.f90441g.f(), 0, 8, true)) {
                C();
                return false;
            }
            this.f90449o = 8;
            this.f90441g.f0(0);
            this.f90448n = this.f90441g.S();
            this.f90447m = this.f90441g.z();
        }
        long j15 = this.f90448n;
        if (j15 == 1) {
            qVar.readFully(this.f90441g.f(), 8, 8);
            this.f90449o += 8;
            this.f90448n = this.f90441g.X();
        } else if (j15 == 0) {
            long jA = qVar.a();
            if (jA == -1 && (bVarPeek = this.f90442h.peek()) != null) {
                jA = bVarPeek.f217151b;
            }
            if (jA != -1) {
                this.f90448n = (jA - qVar.getPosition()) + ((long) this.f90449o);
            }
        }
        long j16 = this.f90448n;
        int i15 = this.f90449o;
        if (j16 < i15) {
            if (this.f90447m != 1718773093 || i15 != 8) {
                throw t7.x.c("Atom size less than header length (unsupported).");
            }
            this.f90448n = i15;
        }
        if (K(this.f90447m)) {
            long position = qVar.getPosition();
            long j17 = this.f90448n;
            int i16 = this.f90449o;
            long j18 = (position + j17) - ((long) i16);
            if (j17 != i16 && this.f90447m == 1835365473) {
                A(qVar);
            }
            this.f90442h.push(new x7.d.b(this.f90447m, j18));
            if (this.f90448n == this.f90449o) {
                B(j18);
            } else {
                s();
            }
        } else if (L(this.f90447m)) {
            zj.p.w(this.f90449o == 8);
            zj.p.w(this.f90448n <= 2147483647L);
            c0 c0Var = new c0((int) this.f90448n);
            System.arraycopy(this.f90441g.f(), 0, c0Var.f(), 0, 8);
            this.f90450p = c0Var;
            this.f90446l = 1;
        } else {
            F(qVar.getPosition() - ((long) this.f90449o));
            this.f90450p = null;
            this.f90446l = 1;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    private boolean H(o8.q qVar, k0 k0Var) {
        boolean z15;
        long j15 = this.f90448n - ((long) this.f90449o);
        long position = qVar.getPosition() + j15;
        c0 c0Var = this.f90450p;
        if (c0Var == null) {
            if (!this.f90456v && this.f90447m == 1835295092) {
                this.E = 1;
            }
            if (j15 < 262144) {
                qVar.n((int) j15);
            } else {
                k0Var.f143128a = qVar.getPosition() + j15;
                z15 = true;
            }
            B(position);
            if (this.f90457w) {
                this.f90459y = true;
                k0Var.f143128a = this.f90458x;
                this.f90457w = false;
                z15 = true;
            }
            return (z15 || this.f90446l == 2) ? false : true;
        }
        qVar.readFully(c0Var.f(), this.f90449o, (int) j15);
        if (this.f90447m == 1718909296) {
            this.f90456v = true;
            this.E = D(c0Var);
        } else if (!this.f90442h.isEmpty()) {
            this.f90442h.peek().c(new x7.d.c(this.f90447m, c0Var));
        }
        z15 = false;
        B(position);
        if (this.f90457w) {
            this.f90459y = true;
            k0Var.f143128a = this.f90458x;
            this.f90457w = false;
            z15 = true;
        }
        if (z15) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    private int I(o8.q qVar, k0 k0Var) throws t7.x {
        s0.a aVar;
        ?? r15;
        boolean z15;
        int iP;
        long position = qVar.getPosition();
        if (this.f90451q == -1) {
            int iX = x(position);
            this.f90451q = iX;
            if (iX == -1) {
                return -1;
            }
        }
        b bVar = this.C[this.f90451q];
        s0 s0Var = bVar.f90466c;
        int i15 = bVar.f90468e;
        z zVar = bVar.f90465b;
        long j15 = zVar.f90521c[i15] + this.A;
        int i16 = zVar.f90522d[i15];
        t0 t0Var = bVar.f90467d;
        long j16 = (j15 - position) + ((long) this.f90452r);
        if (j16 < 0 || j16 >= 262144) {
            k0Var.f143128a = j15;
            return 1;
        }
        if (bVar.f90464a.f90491h == 1) {
            j16 += 8;
            i16 -= 8;
        }
        qVar.n((int) j16);
        if (!q(bVar.f90464a.f90490g)) {
            this.f90455u = true;
        }
        w wVar = bVar.f90464a;
        if (wVar.f90494k == 0) {
            if ("audio/ac4".equals(wVar.f90490g.f188381p)) {
                if (this.f90453s == 0) {
                    o8.c.b(i16, this.f90440f);
                    s0Var.a(this.f90440f, 7);
                    this.f90453s += 7;
                }
                i16 += 7;
                aVar = null;
            } else if (bVar.f90469f == null || !Objects.equals(bVar.f90464a.f90490g.f188381p, "audio/mpeg")) {
                aVar = null;
                if (t0Var != null) {
                    t0Var.d(qVar);
                }
            } else {
                t7.p pVarQ = bVar.f90469f;
                this.f90440f.b0(4);
                qVar.p(this.f90440f.f(), 0, 4);
                qVar.g();
                i0.a aVar2 = new i0.a();
                s0 s0Var2 = bVar.f90466c;
                if (aVar2.a(this.f90440f.z()) && !Objects.equals(pVarQ.f188381p, aVar2.f143115b)) {
                    pVarQ = pVarQ.b().A0((String) zj.p.q(aVar2.f143115b)).Q();
                }
                s0Var2.e(pVarQ);
                aVar = null;
                bVar.f90469f = null;
            }
            while (true) {
                int i17 = this.f90453s;
                if (i17 >= i16) {
                    break;
                }
                int iF = s0Var.f(qVar, i16 - i17, false);
                this.f90452r += iF;
                this.f90453s += iF;
                this.f90454t -= iF;
            }
        } else {
            byte[] bArrF = this.f90439e.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i18 = 4 - bVar.f90464a.f90494k;
            i16 += i18;
            while (this.f90453s < i16) {
                int i19 = this.f90454t;
                if (i19 == 0) {
                    w wVar2 = bVar.f90464a;
                    int i25 = wVar2.f90494k;
                    if (this.f90455u || x7.g.p(wVar2.f90490g) + i25 > bVar.f90465b.f90522d[i15] - this.f90452r) {
                        iP = 0;
                    } else {
                        iP = x7.g.p(bVar.f90464a.f90490g);
                        i25 = bVar.f90464a.f90494k + iP;
                    }
                    qVar.readFully(bArrF, i18, i25);
                    this.f90452r += i25;
                    this.f90439e.f0(0);
                    int iZ = this.f90439e.z();
                    if (iZ < 0) {
                        throw t7.x.a("Invalid NAL length", null);
                    }
                    this.f90454t = iZ - iP;
                    this.f90438d.f0(0);
                    s0Var.a(this.f90438d, 4);
                    this.f90453s += 4;
                    if (iP > 0) {
                        s0Var.a(this.f90439e, iP);
                        this.f90453s += iP;
                        if (x7.g.l(bArrF, 4, iP, bVar.f90464a.f90490g)) {
                            this.f90455u = true;
                        }
                    }
                } else {
                    int iF2 = s0Var.f(qVar, i19, false);
                    this.f90452r += iF2;
                    this.f90453s += iF2;
                    this.f90454t -= iF2;
                }
            }
            aVar = null;
        }
        int i26 = i16;
        z zVar2 = bVar.f90465b;
        long j17 = zVar2.f90524f[i15];
        int i27 = zVar2.f90525g[i15];
        if (!this.f90455u) {
            i27 |= 67108864;
        }
        int i28 = i27;
        if (t0Var != null) {
            z15 = false;
            t0Var.c(s0Var, j17, i28, i26, 0, null);
            if (i15 + 1 == bVar.f90465b.f90520b) {
                r15 = z15;
                t0Var.a(s0Var, aVar);
                r15 = z15;
            }
        } else {
            r15 = 0;
            s0Var.c(j17, i28, i26, 0, null);
        }
        r15 = z15;
        bVar.f90468e++;
        this.f90451q = -1;
        this.f90452r = r15;
        this.f90453s = r15;
        this.f90454t = r15;
        this.f90455u = r15;
        return r15;
    }

    private int J(o8.q qVar, k0 k0Var) throws t7.x {
        int iC = this.f90443i.c(qVar, k0Var, this.f90444j);
        if (iC == 1 && k0Var.f143128a == 0) {
            s();
        }
        return iC;
    }

    private static boolean K(int i15) {
        return i15 == 1836019574 || i15 == 1953653099 || i15 == 1835297121 || i15 == 1835626086 || i15 == 1937007212 || i15 == 1701082227 || i15 == 1835365473 || i15 == 1635284069;
    }

    private static boolean L(int i15) {
        return i15 == 1835296868 || i15 == 1836476516 || i15 == 1751411826 || i15 == 1937011556 || i15 == 1937011827 || i15 == 1937011571 || i15 == 1668576371 || i15 == 1701606260 || i15 == 1937011555 || i15 == 1937011578 || i15 == 1937013298 || i15 == 1937007471 || i15 == 1668232756 || i15 == 1953196132 || i15 == 1718909296 || i15 == 1969517665 || i15 == 1801812339 || i15 == 1768715124;
    }

    private boolean M(t7.v vVar) {
        x7.b bVar;
        if (vVar == null || (this.f90436b & 64) == 0 || (bVar = (x7.b) vVar.h(x7.b.class, new zj.q() { // from class: i9.o
            @Override // zj.q
            public final boolean apply(Object obj) {
                return ((x7.b) obj).f217145a.equals("auxiliary.tracks.offset");
            }
        })) == null) {
            return false;
        }
        long jX = new c0(bVar.f217146b).X();
        if (jX <= 0) {
            return false;
        }
        this.f90458x = jX;
        return true;
    }

    private void N(b bVar, long j15) {
        z zVar = bVar.f90465b;
        int iA = zVar.a(j15);
        if (iA == -1) {
            iA = zVar.b(j15);
        }
        bVar.f90468e = iA;
    }

    public static /* synthetic */ w h(w wVar) {
        return wVar;
    }

    public static /* synthetic */ o8.p[] j() {
        return new o8.p[]{new q(l9.s.a.f117245a, 16)};
    }

    private static int o(int i15) {
        if (i15 != 1751476579) {
            return i15 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] p(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i15 = 0; i15 < bVarArr.length; i15++) {
            jArr[i15] = new long[bVarArr[i15].f90465b.f90520b];
            jArr2[i15] = bVarArr[i15].f90465b.f90524f[0];
        }
        long j15 = 0;
        int i16 = 0;
        while (i16 < bVarArr.length) {
            long j16 = Long.MAX_VALUE;
            int i17 = -1;
            for (int i18 = 0; i18 < bVarArr.length; i18++) {
                if (!zArr[i18]) {
                    long j17 = jArr2[i18];
                    if (j17 <= j16) {
                        i17 = i18;
                        j16 = j17;
                    }
                }
            }
            int i19 = iArr[i17];
            long[] jArr3 = jArr[i17];
            jArr3[i19] = j15;
            z zVar = bVarArr[i17].f90465b;
            j15 += (long) zVar.f90522d[i19];
            int i25 = i19 + 1;
            iArr[i17] = i25;
            if (i25 < jArr3.length) {
                jArr2[i17] = zVar.f90524f[i25];
            } else {
                zArr[i17] = true;
                i16++;
            }
        }
        return jArr;
    }

    private boolean q(t7.p pVar) {
        if (Objects.equals(pVar.f188381p, "video/avc")) {
            return (this.f90436b & 32) != 0;
        }
        return Objects.equals(pVar.f188381p, "video/hevc") && (this.f90436b & 128) != 0;
    }

    public static int r(int i15) {
        int i16 = (i15 & 1) != 0 ? 32 : 0;
        return (i15 & 2) != 0 ? i16 | 128 : i16;
    }

    private void s() {
        this.f90446l = 0;
        this.f90449o = 0;
    }

    private static long t(z zVar, long j15) {
        int i15;
        if (!t7.w.k(zVar.f90519a.f90490g.f188381p)) {
            return -9223372036854775807L;
        }
        int iMin = Math.min(zVar.f90528j ? zVar.f90520b : zVar.f90526h.length, 20);
        zj.p.w(j15 != -9223372036854775807L);
        long jMin = Math.min(j15, 10000000L);
        int i16 = -1;
        int i17 = 0;
        for (int i18 = 0; i18 < iMin; i18++) {
            int i19 = zVar.f90528j ? i18 : zVar.f90526h[i18];
            long j16 = zVar.f90524f[i19];
            if (j16 > jMin) {
                break;
            }
            if (j16 >= 0 && (i15 = zVar.f90522d[i19]) > i17) {
                i16 = i19;
                i17 = i15;
            }
        }
        if (i16 == -1) {
            return -9223372036854775807L;
        }
        return zVar.f90524f[i16];
    }

    private List<Integer> u(t7.v vVar) {
        List<Integer> listD = ((x7.b) zj.p.q((x7.b) vVar.h(x7.b.class, new zj.q() { // from class: i9.p
            @Override // zj.q
            public final boolean apply(Object obj) {
                return ((x7.b) obj).f217145a.equals("auxiliary.tracks.map");
            }
        }))).d();
        ArrayList arrayList = new ArrayList(listD.size());
        for (int i15 = 0; i15 < listD.size(); i15++) {
            int iIntValue = listD.get(i15).intValue();
            int i16 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i16 = 3;
                    if (iIntValue != 2) {
                        i16 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i16 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i16));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(z zVar, long j15) {
        int iA = zVar.a(j15);
        return iA == -1 ? zVar.b(j15) : iA;
    }

    private int x(long j15) {
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        long j16 = Long.MAX_VALUE;
        boolean z15 = true;
        long j17 = Long.MAX_VALUE;
        boolean z16 = true;
        long j18 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.C;
            if (i17 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i17];
            int i18 = bVar.f90468e;
            z zVar = bVar.f90465b;
            if (i18 != zVar.f90520b) {
                long j19 = zVar.f90521c[i18];
                long j25 = ((long[][]) zj.p.q(this.D))[i17][i18];
                long j26 = j19 - j15;
                boolean z17 = j26 < 0 || j26 >= 262144;
                if ((!z17 && z16) || (z17 == z16 && j26 < j18)) {
                    z16 = z17;
                    j17 = j25;
                    i16 = i17;
                    j18 = j26;
                }
                if (j25 < j16) {
                    z15 = z17;
                    j16 = j25;
                    i15 = i17;
                }
            }
            i17++;
        }
        return (j16 == Long.MAX_VALUE || !z15 || j17 < j16 + 10485760) ? i16 : i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long y(z zVar, long j15, long j16) {
        int iW = w(zVar, j15);
        return iW == -1 ? j16 : Math.min(zVar.f90521c[iW], j16);
    }

    private void z(t7.v vVar) {
        x7.b bVar = (x7.b) vVar.h(x7.b.class, new zj.q() { // from class: i9.n
            @Override // zj.q
            public final boolean apply(Object obj) {
                return ((x7.b) obj).f217145a.equals("auxiliary.tracks.interleaved");
            }
        });
        if (bVar == null || bVar.f217146b[0] != 0) {
            return;
        }
        this.A = this.f90458x + 16;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f90442h.clear();
        this.f90449o = 0;
        this.f90451q = -1;
        this.f90452r = 0;
        this.f90453s = 0;
        this.f90454t = 0;
        this.f90455u = false;
        this.f90460z = false;
        if (j15 == 0) {
            if (this.f90446l != 3) {
                s();
                return;
            } else {
                this.f90443i.g();
                this.f90444j.clear();
                return;
            }
        }
        for (b bVar : this.C) {
            N(bVar, j16);
            t0 t0Var = bVar.f90467d;
            if (t0Var != null) {
                t0Var.b();
            }
        }
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(o8.q qVar) {
        p0 p0VarD = v.d(qVar, (this.f90436b & 2) != 0);
        this.f90445k = p0VarD != null ? n0.E(p0VarD) : n0.C();
        return p0VarD == null;
    }

    @Override // o8.p
    public void d(o8.r rVar) {
        if ((this.f90436b & 16) == 0) {
            rVar = new l9.t(rVar, this.f90435a);
        }
        this.B = rVar;
    }

    @Override // o8.p
    public int g(o8.q qVar, k0 k0Var) {
        if (this.f90437c && this.f90460z) {
            return -1;
        }
        while (true) {
            int i15 = this.f90446l;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        return I(qVar, k0Var);
                    }
                    if (i15 == 3) {
                        return J(qVar, k0Var);
                    }
                    throw new IllegalStateException();
                }
                if (H(qVar, k0Var)) {
                    return 1;
                }
            } else if (!G(qVar)) {
                return -1;
            }
        }
    }

    @Override // o8.p
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public n0<p0> f() {
        return this.f90445k;
    }

    public q(l9.s.a aVar, int i15) {
        this.f90435a = aVar;
        this.f90436b = i15;
        this.f90437c = (i15 & 256) != 0;
        this.f90445k = n0.C();
        this.f90446l = (i15 & 4) != 0 ? 3 : 0;
        this.f90443i = new t();
        this.f90444j = new ArrayList();
        this.f90441g = new c0(16);
        this.f90442h = new ArrayDeque<>();
        this.f90438d = new c0(x7.g.f217160a);
        this.f90439e = new c0(6);
        this.f90440f = new c0();
        this.f90451q = -1;
        this.B = o8.r.f143186j0;
        this.C = new b[0];
    }
}
