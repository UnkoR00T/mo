package h9;

import c9.n;
import java.io.EOFException;
import java.math.RoundingMode;
import o8.e0;
import o8.g0;
import o8.i0;
import o8.k0;
import o8.p;
import o8.q;
import o8.r;
import o8.s0;
import o8.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t7.v;
import w7.c0;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u f81919w = new u() { // from class: h9.d
        @Override // o8.u
        public final p[] f() {
            return g.i();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final c9.h.a f81920x = new c9.h.a() { // from class: h9.e
        @Override // c9.h.a
        public final boolean a(int i15, int i16, int i17, int i18, int i19) {
            return g.j(i15, i16, i17, i18, i19);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f81921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f81922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f81923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i0.a f81924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e0 f81925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0 f81926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s0 f81927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f81928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s0 f81929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s0 f81930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f81931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v f81932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v f81933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f81934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f81935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f81936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f81937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f81938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f81939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f81940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f81941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f81942v;

    public g() {
        this(0);
    }

    private boolean A(q qVar, boolean z15) throws Throwable {
        int iJ;
        int i15;
        int iJ2;
        qVar.g();
        if (qVar.getPosition() == 0) {
            v vVarA = this.f81926f.a(qVar, (this.f81921a & 8) == 0 ? null : f81920x, PKIFailureInfo.unsupportedVersion);
            this.f81932l = vVarA;
            if (vVarA != null) {
                this.f81925e.e(vVarA);
            }
            iJ = (int) qVar.j();
            if (!z15) {
                qVar.n(iJ);
            }
            i15 = 0;
        } else {
            iJ = 0;
            i15 = 0;
        }
        int i16 = i15;
        int i17 = i16;
        while (true) {
            if (w(qVar)) {
                if (i16 > 0) {
                    break;
                }
                v();
                throw new EOFException();
            }
            this.f81923c.f0(0);
            int iZ = this.f81923c.z();
            if ((i15 == 0 || s(iZ, i15)) && (iJ2 = i0.j(iZ)) != -1) {
                i16++;
                if (i16 != 1) {
                    if (i16 == 4) {
                        break;
                    }
                } else {
                    this.f81924d.a(iZ);
                    i15 = iZ;
                }
                qVar.k(iJ2 - 4);
            } else {
                int i18 = i17 + 1;
                if (i17 == 131072) {
                    if (z15) {
                        return false;
                    }
                    v();
                    throw new EOFException();
                }
                if (z15) {
                    qVar.g();
                    qVar.k(iJ + i18);
                } else {
                    qVar.n(1);
                }
                i16 = 0;
                i17 = i18;
                i15 = 0;
            }
        }
        if (z15) {
            qVar.n(iJ + i17);
        } else {
            qVar.g();
        }
        this.f81931k = i15;
        return true;
    }

    public static /* synthetic */ p[] i() {
        return new p[]{new g()};
    }

    public static /* synthetic */ boolean j(int i15, int i16, int i17, int i18, int i19) {
        if (i16 == 67 && i17 == 79 && i18 == 77 && (i19 == 77 || i15 == 2)) {
            return true;
        }
        if (i16 == 77 && i17 == 76 && i18 == 76) {
            return i19 == 84 || i15 == 2;
        }
        return false;
    }

    private void k() {
        zj.p.q(this.f81929i);
        o0.h(this.f81928h);
    }

    private i l(q qVar) {
        i iVarU = u(qVar);
        c cVarT = t(this.f81932l, qVar.getPosition());
        if (this.f81940t) {
            return new i.a();
        }
        if (cVarT != null) {
            iVarU = cVarT;
        } else if (iVarU == null) {
            iVarU = null;
        }
        if (iVarU == null) {
            iVarU = p(qVar, (this.f81921a & 2) != 0);
        }
        if ((this.f81921a & 4) != 0 && !iVarU.e()) {
            iVarU = new b(iVarU.h(), qVar.getPosition(), iVarU.d());
        }
        if (z(iVarU) && iVarU.h() != -9223372036854775807L && (iVarU.d() != -1 || qVar.a() != -1)) {
            long jA = iVarU.a() != -1 ? iVarU.a() : 0L;
            long jD = iVarU.d() != -1 ? iVarU.d() : qVar.a();
            iVarU = new a(jD, jA, ek.g.m(o0.W0(jD - jA, 8000000L, iVarU.h(), RoundingMode.HALF_UP)), -1, false);
        } else if (z(iVarU)) {
            iVarU = p(qVar, (this.f81921a & 2) != 0);
        }
        this.f81929i.d(iVarU.h());
        return iVarU;
    }

    private long m(long j15) {
        return this.f81934n + ((j15 * 1000000) / ((long) this.f81924d.f143117d));
    }

    private i o(long j15, k kVar, long j16) {
        long j17;
        long j18;
        long jA = kVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j19 = kVar.f81957c;
        if (j19 != -1) {
            long j25 = j15 + j19;
            j17 = j19 - ((long) kVar.f81955a.f143116c);
            j18 = j25;
        } else {
            if (j16 == -1) {
                return null;
            }
            j17 = (j16 - j15) - ((long) kVar.f81955a.f143116c);
            j18 = j16;
        }
        long j26 = j17;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j18, j15 + ((long) kVar.f81955a.f143116c), ek.g.e(o0.W0(j26, 8000000L, jA, roundingMode)), ek.g.e(ck.d.b(j26, kVar.f81956b, roundingMode)), false);
    }

    private i p(q qVar, boolean z15) {
        qVar.p(this.f81923c.f(), 0, 4);
        this.f81923c.f0(0);
        this.f81924d.a(this.f81923c.z());
        return new a(qVar.a(), qVar.getPosition(), this.f81924d, z15);
    }

    private static long q(v vVar) {
        n nVar;
        if (vVar == null || (nVar = (n) vVar.h(n.class, new zj.q() { // from class: h9.f
            @Override // zj.q
            public final boolean apply(Object obj) {
                return ((n) obj).f24601a.equals("TLEN");
            }
        })) == null) {
            return -9223372036854775807L;
        }
        return o0.J0(Long.parseLong(nVar.f24615d.get(0)));
    }

    private static int r(c0 c0Var, int i15) {
        if (c0Var.j() >= i15 + 4) {
            c0Var.f0(i15);
            int iZ = c0Var.z();
            if (iZ == 1483304551 || iZ == 1231971951) {
                return iZ;
            }
        }
        if (c0Var.j() < 40) {
            return 0;
        }
        c0Var.f0(36);
        return c0Var.z() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean s(int i15, long j15) {
        return ((long) (i15 & (-128000))) == (j15 & (-128000));
    }

    private static c t(v vVar, long j15) {
        c9.l lVar;
        if (vVar == null || (lVar = (c9.l) vVar.g(c9.l.class)) == null) {
            return null;
        }
        return c.i(j15, lVar, q(vVar));
    }

    private i u(q qVar) {
        int i15;
        int i16;
        c0 c0Var = new c0(this.f81924d.f143116c);
        qVar.p(c0Var.f(), 0, this.f81924d.f143116c);
        i0.a aVar = this.f81924d;
        int i17 = 21;
        if ((aVar.f143114a & 1) != 0) {
            if (aVar.f143118e != 1) {
                i17 = 36;
            }
        } else if (aVar.f143118e == 1) {
            i17 = 13;
        }
        int iR = r(c0Var, i17);
        if (iR != 1231971951) {
            if (iR == 1447187017) {
                j jVarI = j.i(qVar.a(), qVar.getPosition(), this.f81924d, c0Var);
                qVar.n(this.f81924d.f143116c);
                return jVarI;
            }
            if (iR != 1483304551) {
                qVar.g();
                return null;
            }
        }
        k kVarC = k.c(this.f81924d, c0Var);
        if (!this.f81925e.c() && (i15 = kVarC.f81959e) != -1 && (i16 = kVarC.f81960f) != -1) {
            e0 e0Var = this.f81925e;
            e0Var.f143069a = i15;
            e0Var.f143070b = i16;
        }
        this.f81933m = kVarC.b();
        long position = qVar.getPosition();
        if (qVar.a() != -1 && kVarC.f81957c != -1 && qVar.a() != kVarC.f81957c + position) {
            t.f("Mp3Extractor", "Data size mismatch between stream (" + qVar.a() + ") and Xing frame (" + (kVarC.f81957c + position) + "), using Xing value.");
        }
        qVar.n(this.f81924d.f143116c);
        return iR == 1483304551 ? l.i(kVarC, position) : o(position, kVarC, qVar.a());
    }

    private void v() {
        i iVar = this.f81939s;
        if ((iVar instanceof a) && iVar.e()) {
            long j15 = this.f81937q;
            if (j15 == -1 || j15 == this.f81939s.d()) {
                return;
            }
            this.f81939s = ((a) this.f81939s).l(this.f81937q);
            ((r) zj.p.q(this.f81928h)).f(this.f81939s);
            ((s0) zj.p.q(this.f81929i)).d(this.f81939s.h());
        }
    }

    private boolean w(q qVar) {
        i iVar = this.f81939s;
        if (iVar != null) {
            long jD = iVar.d();
            if (jD != -1 && qVar.j() > jD - 4) {
                return true;
            }
        }
        try {
            return !qVar.e(this.f81923c.f(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int x(q qVar) throws Throwable {
        if (this.f81931k == 0) {
            try {
                A(qVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f81939s == null) {
            i iVarL = l(qVar);
            this.f81939s = iVarL;
            this.f81928h.f(iVarL);
            v vVarB = this.f81932l;
            if (vVarB == null || (this.f81921a & 8) != 0) {
                vVarB = this.f81933m;
            } else {
                v vVar = this.f81933m;
                if (vVar != null) {
                    vVarB = vVarB.b(vVar);
                }
            }
            t7.p.b bVarS0 = new t7.p.b().X("audio/mpeg").A0(this.f81924d.f143115b).p0(PKIFailureInfo.certConfirmed).U(this.f81924d.f143118e).B0(this.f81924d.f143117d).e0(this.f81925e.f143069a).f0(this.f81925e.f143070b).s0(vVarB);
            if (this.f81939s.g() != -2147483647) {
                bVarS0.T(this.f81939s.g());
            }
            this.f81930j.e(bVarS0.Q());
            this.f81936p = qVar.getPosition();
        } else if (this.f81936p != 0) {
            long position = qVar.getPosition();
            long j15 = this.f81936p;
            if (position < j15) {
                qVar.n((int) (j15 - position));
            }
        }
        return y(qVar);
    }

    private int y(q qVar) {
        if (this.f81938r == 0) {
            qVar.g();
            if (w(qVar)) {
                return -1;
            }
            this.f81923c.f0(0);
            int iZ = this.f81923c.z();
            if (!s(iZ, this.f81931k) || i0.j(iZ) == -1) {
                qVar.n(1);
                this.f81931k = 0;
                return 0;
            }
            this.f81924d.a(iZ);
            if (this.f81934n == -9223372036854775807L) {
                this.f81934n = this.f81939s.f(qVar.getPosition());
                if (this.f81922b != -9223372036854775807L) {
                    this.f81934n += this.f81922b - this.f81939s.f(0L);
                }
            }
            this.f81938r = this.f81924d.f143116c;
            long position = qVar.getPosition();
            i0.a aVar = this.f81924d;
            this.f81937q = position + ((long) aVar.f143116c);
            i iVar = this.f81939s;
            if (iVar instanceof b) {
                b bVar = (b) iVar;
                bVar.j(m(this.f81935o + ((long) aVar.f143120g)), this.f81937q);
                if (this.f81941u && bVar.i(this.f81942v)) {
                    this.f81941u = false;
                    this.f81930j = this.f81929i;
                }
            }
        }
        int iF = this.f81930j.f(qVar, this.f81938r, true);
        if (iF == -1) {
            return -1;
        }
        int i15 = this.f81938r - iF;
        this.f81938r = i15;
        if (i15 > 0) {
            return 0;
        }
        this.f81930j.c(m(this.f81935o), 1, this.f81924d.f143116c, 0, null);
        this.f81935o += (long) this.f81924d.f143120g;
        this.f81938r = 0;
        return 0;
    }

    private boolean z(i iVar) {
        return (iVar.e() || (iVar instanceof a) || (this.f81921a & 1) == 0) ? false : true;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f81931k = 0;
        this.f81934n = -9223372036854775807L;
        this.f81935o = 0L;
        this.f81938r = 0;
        this.f81937q = -1L;
        this.f81942v = j16;
        i iVar = this.f81939s;
        if (!(iVar instanceof b) || ((b) iVar).i(j16)) {
            return;
        }
        this.f81941u = true;
        this.f81930j = this.f81927g;
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        return A(qVar, true);
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f81928h = rVar;
        s0 s0VarV = rVar.v(0, 1);
        this.f81929i = s0VarV;
        this.f81930j = s0VarV;
        this.f81928h.s();
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) throws Throwable {
        k();
        int iX = x(qVar);
        if (iX == -1 && (this.f81939s instanceof b)) {
            long jM = m(this.f81935o);
            if (this.f81939s.h() != jM) {
                ((b) this.f81939s).k(jM);
                this.f81928h.f(this.f81939s);
                this.f81929i.d(this.f81939s.h());
            }
        }
        return iX;
    }

    public void n() {
        this.f81940t = true;
    }

    public g(int i15) {
        this(i15, -9223372036854775807L);
    }

    public g(int i15, long j15) {
        this.f81921a = (i15 & 2) != 0 ? i15 | 1 : i15;
        this.f81922b = j15;
        this.f81923c = new c0(10);
        this.f81924d = new i0.a();
        this.f81925e = new e0();
        this.f81934n = -9223372036854775807L;
        this.f81926f = new g0();
        o8.n nVar = new o8.n();
        this.f81927g = nVar;
        this.f81930j = nVar;
        this.f81937q = -1L;
    }
}
