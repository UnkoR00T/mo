package a8;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes3.dex */
final class w1 implements Handler.Callback, h8.b0.a, j8.x.a, u2.d, i.a, x2.a, u7.g.a, m8.t {
    private static final long L0 = w7.o0.g1(10000);
    private final boolean A;
    private long A0;
    private final b8.a B;
    private int B0;
    private final w7.p C;
    private boolean C0;
    private final boolean D;
    private w D0;
    private final u7.g E;
    private long E0;
    private final boolean F;
    private f3 G;
    private x.c G0;
    private f3 I;
    private boolean J0;
    private boolean K;
    private boolean L;
    private h O;
    private int P;
    private v2 R;
    private e T;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c3[] f4677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a3[] f4678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f4679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j8.x f4680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j8.y f4681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a2 f4682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8.d f4683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w7.p f4684h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f4685h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w2 f4686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Looper f4687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t7.e0.c f4688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t7.e0.b f4689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f4690n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f4691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f4692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList<d> f4694r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f4695r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final w7.h f4696s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f4697s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f f4698t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f4699t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f4700u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final g2 f4701v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f4702v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final u2 f4703w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f4704w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final z1 f4705x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f4706x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final long f4707y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private h f4708y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final b8.e2 f4709z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private long f4710z0;
    private long I0 = -9223372036854775807L;
    private float K0 = 1.0f;
    private e3 H = e3.f4381j;
    private long F0 = -9223372036854775807L;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private long f4693q0 = -9223372036854775807L;
    private t7.e0 H0 = t7.e0.f188127a;

    class a implements z2.a {
        a() {
        }

        @Override // a8.z2.a
        public void a() {
            w1.this.f4702v0 = true;
        }

        @Override // a8.z2.a
        public void b() {
            if (w1.this.g0() || w1.this.f4704w0) {
                w1.this.f4684h.l(2);
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<u2.c> f4712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h8.b1 f4713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f4714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f4715d;

        /* synthetic */ b(List list, h8.b1 b1Var, int i15, long j15, a aVar) {
            this(list, b1Var, i15, j15);
        }

        private b(List<u2.c> list, h8.b1 b1Var, int i15, long j15) {
            this.f4712a = list;
            this.f4713b = b1Var;
            this.f4714c = i15;
            this.f4715d = j15;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h8.b1 f4719d;
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x2 f4720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f4722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f4723d;

        public d(x2 x2Var) {
            this.f4720a = x2Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f4723d;
            if ((obj == null) != (dVar.f4723d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i15 = this.f4721b - dVar.f4721b;
            return i15 != 0 ? i15 : Long.compare(this.f4722c, dVar.f4722c);
        }

        public void e(int i15, long j15, Object obj) {
            this.f4721b = i15;
            this.f4722c = j15;
            this.f4723d = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v2 f4725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4728e;

        public e(v2 v2Var) {
            this.f4725b = v2Var;
        }

        public void b(int i15) {
            this.f4724a |= i15 > 0;
            this.f4726c += i15;
        }

        public void c(v2 v2Var) {
            this.f4724a |= this.f4725b != v2Var;
            this.f4725b = v2Var;
        }

        public void d(int i15) {
            if (this.f4727d && this.f4728e != 5) {
                zj.p.d(i15 == 5);
                return;
            }
            this.f4724a = true;
            this.f4727d = true;
            this.f4728e = i15;
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h8.c0.b f4729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f4732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f4733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f4734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f4735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f4736h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f4737i;

        public g(h8.c0.b bVar, long j15, long j16, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i15) {
            this.f4729a = bVar;
            this.f4730b = j15;
            this.f4731c = j16;
            this.f4732d = z15;
            this.f4733e = z16;
            this.f4734f = z17;
            this.f4735g = z18;
            this.f4736h = z19;
            this.f4737i = i15;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.e0 f4738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4740c;

        public h(t7.e0 e0Var, int i15, long j15) {
            this.f4738a = e0Var;
            this.f4739b = i15;
            this.f4740c = j15;
        }
    }

    public w1(Context context, z2[] z2VarArr, z2[] z2VarArr2, j8.x xVar, j8.y yVar, a2 a2Var, k8.d dVar, int i15, boolean z15, b8.a aVar, f3 f3Var, z1 z1Var, long j15, boolean z16, boolean z17, Looper looper, w7.h hVar, f fVar, b8.e2 e2Var, w2 w2Var, x.c cVar, final m8.t tVar, boolean z18) {
        this.f4698t = fVar;
        this.f4680d = xVar;
        this.f4681e = yVar;
        this.f4682f = a2Var;
        this.f4683g = dVar;
        this.f4697s0 = i15;
        this.f4699t0 = z15;
        this.G = f3Var;
        this.f4705x = z1Var;
        this.f4707y = j15;
        this.E0 = j15;
        this.Y = z16;
        this.A = z17;
        this.f4696s = hVar;
        this.f4709z = e2Var;
        this.G0 = cVar;
        this.B = aVar;
        this.F = z18;
        this.f4690n = a2Var.j(e2Var);
        this.f4691p = a2Var.p(e2Var);
        v2 v2VarK = v2.k(yVar);
        this.R = v2VarK;
        this.T = new e(v2VarK);
        this.f4678b = new a3[z2VarArr.length];
        this.f4679c = new boolean[z2VarArr.length];
        a3.a aVarC = xVar.c();
        this.f4677a = new c3[z2VarArr.length];
        boolean z19 = false;
        for (int i16 = 0; i16 < z2VarArr.length; i16++) {
            z2VarArr[i16].P(i16, e2Var, hVar);
            this.f4678b[i16] = z2VarArr[i16].M();
            if (aVarC != null) {
                this.f4678b[i16].u(aVarC);
            }
            z2 z2Var = z2VarArr2[i16];
            if (z2Var != null) {
                z2Var.P(i16, e2Var, hVar);
                z19 = true;
            }
            this.f4677a[i16] = new c3(z2VarArr[i16], z2VarArr2[i16], i16);
        }
        this.D = z19;
        this.f4692q = new i(this, hVar);
        this.f4694r = new ArrayList<>();
        this.f4688l = new t7.e0.c();
        this.f4689m = new t7.e0.b();
        xVar.d(this, dVar);
        this.C0 = true;
        w7.p pVarE = hVar.e(looper, null);
        this.C = pVarE;
        this.f4701v = new g2(aVar, pVarE, new d2.a() { // from class: a8.t1
            @Override // a8.d2.a
            public final d2 a(e2 e2Var2, long j16) {
                return this.f4614a.y(e2Var2, j16);
            }
        }, cVar);
        this.f4703w = new u2(this, aVar, pVarE, e2Var);
        w2 w2Var2 = w2Var == null ? new w2() : w2Var;
        this.f4686j = w2Var2;
        Looper looperA = w2Var2.a();
        this.f4687k = looperA;
        w7.p pVarE2 = hVar.e(looperA, this);
        this.f4684h = pVarE2;
        this.E = new u7.g(context, looperA, this);
        pVarE2.e(35, new m8.t() { // from class: a8.u1
            @Override // m8.t
            public final void d(long j16, long j17, t7.p pVar, MediaFormat mediaFormat) {
                w1.m(this.f4620a, tVar, j16, j17, pVar, mediaFormat);
            }
        }).a();
    }

    private void A() {
        if (this.D && w()) {
            for (c3 c3Var : this.f4677a) {
                int iH = c3Var.h();
                c3Var.c(this.f4692q);
                this.f4706x0 -= iH - c3Var.h();
            }
            this.I0 = -9223372036854775807L;
        }
    }

    private void A0() {
        d2 d2VarY = this.f4701v.y();
        if (d2VarY == null || this.f4701v.u() == d2VarY || d2VarY.f4347i || !c2()) {
            return;
        }
        this.f4701v.y().f4347i = true;
    }

    private void A1(h8.b1 b1Var) throws Throwable {
        this.T.b(1);
        a0(this.f4703w.D(b1Var), false);
    }

    private void B(int i15) {
        int iH = this.f4677a[i15].h();
        this.f4677a[i15].b(this.f4692q);
        s0(i15, false);
        this.f4706x0 -= iH;
    }

    private void B0() throws Throwable {
        a0(this.f4703w.i(), true);
    }

    private void B1(int i15) {
        v2 v2Var = this.R;
        if (v2Var.f4653e != i15) {
            if (i15 != 2) {
                this.F0 = -9223372036854775807L;
            }
            if (i15 != 3 && v2Var.f4664p) {
                this.R = v2Var.i(false);
            }
            this.R = this.R.h(i15);
        }
    }

    private void C() {
        for (int i15 = 0; i15 < this.f4677a.length; i15++) {
            B(i15);
        }
        this.I0 = -9223372036854775807L;
    }

    private void C0(c cVar) throws Throwable {
        this.T.b(1);
        a0(this.f4703w.v(cVar.f4716a, cVar.f4717b, cVar.f4718c, cVar.f4719d), false);
    }

    private void C1(m8.t tVar) {
        for (c3 c3Var : this.f4677a) {
            c3Var.T(tVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:109:0x019b  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01af  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:140:0x014a A[EDGE_INSN: B:140:0x014a->B:90:0x014a BREAK  A[LOOP:1: B:84:0x0137->B:89:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    /* JADX WARN: Code duplicated, block: B:92:0x0150  */
    private void D() throws w {
        boolean z15;
        boolean z16;
        long j15;
        boolean z17;
        boolean z18;
        boolean z19;
        v2 v2Var;
        int i15;
        int i16;
        c3[] c3VarArr;
        v2 v2Var2;
        long jD = this.f4696s.d();
        this.f4684h.n(2);
        if (!this.F) {
            T1();
        }
        int i17 = this.R.f4653e;
        if (i17 == 1 || i17 == 4) {
            return;
        }
        if (this.F) {
            T1();
        }
        d2 d2VarU = this.f4701v.u();
        if (d2VarU == null) {
            Y0(jD);
            return;
        }
        w7.l0.a("doSomeWork");
        Y1();
        if (d2VarU.f4344f) {
            this.A0 = w7.o0.J0(this.f4696s.b());
            d2VarU.f4339a.w(this.R.f4667s - this.f4690n, this.f4691p);
            z15 = true;
            z16 = true;
            int i18 = 0;
            while (true) {
                c3[] c3VarArr2 = this.f4677a;
                if (i18 >= c3VarArr2.length) {
                    break;
                }
                c3 c3Var = c3VarArr2[i18];
                if (c3Var.h() == 0) {
                    s0(i18, false);
                } else {
                    c3Var.I(this.f4710z0, this.A0);
                    z15 = z15 && c3Var.t();
                    boolean zA = c3Var.a(d2VarU);
                    s0(i18, zA);
                    z16 = z16 && zA;
                    if (!zA) {
                        r0(i18);
                    }
                }
                i18++;
            }
        } else {
            d2VarU.f4339a.q();
            z15 = true;
            z16 = true;
        }
        long j16 = d2VarU.f4346h.f4375f;
        if (z15 && d2VarU.f4344f) {
            if (j16 != -9223372036854775807L) {
                j15 = -9223372036854775807L;
                if (j16 <= this.R.f4667s) {
                }
                if (z17 && this.Z) {
                    this.Z = false;
                    r1(false, this.R.f4662n, false, 5);
                }
                if (!z17 && d2VarU.f4346h.f4380k) {
                    B1(4);
                    P1();
                } else if (this.R.f4653e != 2 && K1(z16)) {
                    B1(3);
                    this.D0 = null;
                    if (I1()) {
                        b2(false, false);
                        this.f4692q.f();
                        M1();
                    }
                } else if (this.R.f4653e == 3 && (this.f4706x0 != 0 ? !z16 : !k0())) {
                    b2(I1(), false);
                    B1(2);
                    if (this.f4685h0) {
                        F0();
                        this.f4705x.c();
                    }
                    P1();
                }
                if (this.R.f4653e == 2) {
                    i16 = 0;
                    while (true) {
                        c3VarArr = this.f4677a;
                        if (i16 >= c3VarArr.length) {
                            break;
                        }
                        if (c3VarArr[i16].x(d2VarU)) {
                            r0(i16);
                        }
                        i16++;
                    }
                    v2Var2 = this.R;
                    if (!v2Var2.f4655g || v2Var2.f4666r >= 500000 || !i0(this.f4701v.n()) || !I1()) {
                        this.F0 = j15;
                    } else if (this.F0 == j15) {
                        this.F0 = this.f4696s.b();
                    } else if (this.f4696s.b() - this.F0 >= 4000) {
                        throw new w7.g0(0, 4000);
                    }
                } else {
                    this.F0 = j15;
                }
                if (I1() || this.R.f4653e != 3) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                z19 = !this.f4704w0 && this.f4702v0 && z18;
                v2Var = this.R;
                if (v2Var.f4664p != z19) {
                    this.R = v2Var.i(z19);
                }
                this.f4702v0 = false;
                if (!z19 && (i15 = this.R.f4653e) != 4 && (z18 || i15 == 2 || (i15 == 3 && this.f4706x0 != 0))) {
                    Y0(jD);
                }
                w7.l0.b();
            }
            j15 = -9223372036854775807L;
            z17 = true;
            if (z17) {
                this.Z = false;
                r1(false, this.R.f4662n, false, 5);
            }
            if (!z17) {
                if (this.R.f4653e != 2) {
                    if (this.R.f4653e == 3) {
                        b2(I1(), false);
                        B1(2);
                        if (this.f4685h0) {
                            F0();
                            this.f4705x.c();
                        }
                        P1();
                    }
                } else if (this.R.f4653e == 3) {
                    b2(I1(), false);
                    B1(2);
                    if (this.f4685h0) {
                        F0();
                        this.f4705x.c();
                    }
                    P1();
                }
            } else if (this.R.f4653e != 2) {
                if (this.R.f4653e == 3) {
                    b2(I1(), false);
                    B1(2);
                    if (this.f4685h0) {
                        F0();
                        this.f4705x.c();
                    }
                    P1();
                }
            } else if (this.R.f4653e == 3) {
                b2(I1(), false);
                B1(2);
                if (this.f4685h0) {
                    F0();
                    this.f4705x.c();
                }
                P1();
            }
            if (this.R.f4653e == 2) {
                i16 = 0;
                while (true) {
                    c3VarArr = this.f4677a;
                    if (i16 >= c3VarArr.length) {
                        break;
                        break;
                    } else {
                        if (c3VarArr[i16].x(d2VarU)) {
                            r0(i16);
                        }
                        i16++;
                    }
                }
                v2Var2 = this.R;
                if (!v2Var2.f4655g) {
                    this.F0 = j15;
                } else {
                    this.F0 = j15;
                }
            } else {
                this.F0 = j15;
            }
            if (I1()) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (this.f4704w0) {
            }
            v2Var = this.R;
            if (v2Var.f4664p != z19) {
                this.R = v2Var.i(z19);
            }
            this.f4702v0 = false;
            if (!z19) {
                Y0(jD);
            }
            w7.l0.b();
        }
        j15 = -9223372036854775807L;
        z17 = false;
        if (z17) {
            this.Z = false;
            r1(false, this.R.f4662n, false, 5);
        }
        if (!z17) {
            if (this.R.f4653e != 2) {
                if (this.R.f4653e == 3) {
                    b2(I1(), false);
                    B1(2);
                    if (this.f4685h0) {
                        F0();
                        this.f4705x.c();
                    }
                    P1();
                }
            } else if (this.R.f4653e == 3) {
                b2(I1(), false);
                B1(2);
                if (this.f4685h0) {
                    F0();
                    this.f4705x.c();
                }
                P1();
            }
        } else if (this.R.f4653e != 2) {
            if (this.R.f4653e == 3) {
                b2(I1(), false);
                B1(2);
                if (this.f4685h0) {
                    F0();
                    this.f4705x.c();
                }
                P1();
            }
        } else if (this.R.f4653e == 3) {
            b2(I1(), false);
            B1(2);
            if (this.f4685h0) {
                F0();
                this.f4705x.c();
            }
            P1();
        }
        if (this.R.f4653e == 2) {
            i16 = 0;
            while (true) {
                c3VarArr = this.f4677a;
                if (i16 >= c3VarArr.length) {
                    break;
                    break;
                } else {
                    if (c3VarArr[i16].x(d2VarU)) {
                        r0(i16);
                    }
                    i16++;
                }
            }
            v2Var2 = this.R;
            if (!v2Var2.f4655g) {
                this.F0 = j15;
            } else {
                this.F0 = j15;
            }
        } else {
            this.F0 = j15;
        }
        if (I1()) {
            z18 = false;
        } else {
            z18 = false;
        }
        if (this.f4704w0) {
        }
        v2Var = this.R;
        if (v2Var.f4664p != z19) {
            this.R = v2Var.i(z19);
        }
        this.f4702v0 = false;
        if (!z19) {
            Y0(jD);
        }
        w7.l0.b();
    }

    private void D0() {
        for (d2 d2VarU = this.f4701v.u(); d2VarU != null; d2VarU = d2VarU.k()) {
            for (j8.r rVar : d2VarU.p().f100153c) {
                if (rVar != null) {
                    rVar.g();
                }
            }
        }
    }

    private void E(d2 d2Var, int i15, boolean z15, long j15) throws w {
        c3 c3Var = this.f4677a[i15];
        if (c3Var.y()) {
            return;
        }
        boolean z16 = d2Var == this.f4701v.u();
        j8.y yVarP = d2Var.p();
        b3 b3Var = yVarP.f100152b[i15];
        j8.r rVar = yVarP.f100153c[i15];
        boolean z17 = I1() && this.R.f4653e == 3;
        boolean z18 = !z15 && z17;
        this.f4706x0++;
        c3Var.e(b3Var, rVar, d2Var.f4341c[i15], this.f4710z0, z18, z16, j15, d2Var.m(), d2Var.f4346h.f4370a, this.f4692q);
        c3Var.n(11, new a(), d2Var);
        if (z17 && z16) {
            c3Var.W();
        }
    }

    private void E0(boolean z15) {
        for (d2 d2VarU = this.f4701v.u(); d2VarU != null; d2VarU = d2VarU.k()) {
            for (j8.r rVar : d2VarU.p().f100153c) {
                if (rVar != null) {
                    rVar.j(z15);
                }
            }
        }
    }

    private void E1(Object obj, w7.k kVar) {
        for (c3 c3Var : this.f4677a) {
            c3Var.U(obj);
        }
        int i15 = this.R.f4653e;
        if (i15 == 3 || i15 == 2) {
            this.f4684h.l(2);
        }
        if (kVar != null) {
            kVar.f();
        }
    }

    private void F() throws w {
        G(new boolean[this.f4677a.length], this.f4701v.y().n());
    }

    private void F0() {
        for (d2 d2VarU = this.f4701v.u(); d2VarU != null; d2VarU = d2VarU.k()) {
            for (j8.r rVar : d2VarU.p().f100153c) {
                if (rVar != null) {
                    rVar.m();
                }
            }
        }
    }

    private void F1(float f15) {
        this.K0 = f15;
        float f16 = f15 * this.E.f();
        for (c3 c3Var : this.f4677a) {
            c3Var.V(f16);
        }
    }

    private void G(boolean[] zArr, long j15) throws w {
        long j16;
        d2 d2VarY = this.f4701v.y();
        j8.y yVarP = d2VarY.p();
        for (int i15 = 0; i15 < this.f4677a.length; i15++) {
            if (!yVarP.c(i15)) {
                this.f4677a[i15].L();
            }
        }
        int i16 = 0;
        while (i16 < this.f4677a.length) {
            if (!yVarP.c(i16) || this.f4677a[i16].x(d2VarY)) {
                j16 = j15;
            } else {
                j16 = j15;
                E(d2VarY, i16, zArr[i16], j16);
            }
            i16++;
            j15 = j16;
        }
    }

    private boolean G1() {
        d2 d2VarU;
        d2 d2VarK;
        return I1() && !this.Z && (d2VarU = this.f4701v.u()) != null && (d2VarK = d2VarU.k()) != null && this.f4710z0 >= d2VarK.n() && d2VarK.f4347i;
    }

    private boolean H1() {
        if (!i0(this.f4701v.n())) {
            return false;
        }
        d2 d2VarN = this.f4701v.n();
        long jT = T(d2VarN.l());
        a2.a aVar = new a2.a(this.f4709z, this.R.f4649a, d2VarN.f4346h.f4370a, d2VarN == this.f4701v.u() ? d2VarN.C(this.f4710z0) : d2VarN.C(this.f4710z0) - d2VarN.f4346h.f4371b, jT, this.f4692q.d().f188663a, this.R.f4660l, this.f4685h0, L1(this.R.f4649a, d2VarN.f4346h.f4370a) ? this.f4705x.b() : -9223372036854775807L, this.f4693q0);
        boolean zH = this.f4682f.h(aVar);
        d2 d2VarU = this.f4701v.u();
        if (zH || !d2VarU.f4344f || jT >= 500000) {
            return zH;
        }
        if (this.f4690n <= 0 && !this.f4691p) {
            return zH;
        }
        d2VarU.f4339a.w(this.R.f4667s, false);
        return this.f4682f.h(aVar);
    }

    private ak.n0<t7.v> I(j8.r[] rVarArr) {
        ak.n0.a aVar = new ak.n0.a();
        boolean z15 = false;
        for (j8.r rVar : rVarArr) {
            if (rVar != null) {
                t7.v vVar = rVar.d(0).f188377l;
                if (vVar == null) {
                    aVar.a(new t7.v(new t7.v.a[0]));
                } else {
                    aVar.a(vVar);
                    z15 = true;
                }
            }
        }
        return z15 ? aVar.k() : ak.n0.C();
    }

    private void I0() {
        this.T.b(1);
        P0(false, false, false, true);
        this.f4682f.o(this.f4709z);
        B1(this.R.f4649a.q() ? 4 : 2);
        V1();
        this.f4703w.w(this.f4683g.d());
        this.f4684h.l(2);
    }

    private boolean I1() {
        v2 v2Var = this.R;
        return v2Var.f4660l && v2Var.f4662n == 0;
    }

    private long J() {
        v2 v2Var = this.R;
        return M(v2Var.f4649a, v2Var.f4650b.f81468a, v2Var.f4667s);
    }

    private boolean J1(d2 d2Var, long j15) {
        if (!this.R.f4649a.q() && d2Var.f4346h.f4370a.equals(this.R.f4650b)) {
            long jD = d2Var.D(j15);
            boolean Z = true;
            for (c3 c3Var : this.f4677a) {
                if (c3Var.y()) {
                    Z &= c3Var.Z(d2Var, jD);
                }
            }
            if (!Z) {
                return false;
            }
            h8.b0 b0Var = d2Var.f4339a;
            long j16 = this.R.f4667s;
            f3 f3Var = f3.f4411e;
            if (b0Var.h(j16, f3Var) == d2Var.f4339a.h(j15, f3Var)) {
                return true;
            }
        }
        return false;
    }

    private long K(d2 d2Var) {
        zj.p.w(d2Var.f4344f);
        return (long) ((d2Var.n() - this.f4710z0) / this.f4692q.d().f188663a);
    }

    private void K0(w7.k kVar) {
        try {
            P0(true, false, true, false);
            L0();
            this.f4682f.r(this.f4709z);
            this.E.h();
            this.f4680d.i();
            B1(1);
        } finally {
            this.f4684h.f(null);
            this.f4686j.b();
            kVar.f();
        }
    }

    private boolean K1(boolean z15) {
        if (this.f4706x0 == 0) {
            return k0();
        }
        boolean z16 = false;
        if (!z15) {
            return false;
        }
        if (!this.R.f4655g) {
            return true;
        }
        d2 d2VarU = this.f4701v.u();
        long jB = L1(this.R.f4649a, d2VarU.f4346h.f4370a) ? this.f4705x.b() : -9223372036854775807L;
        d2 d2VarN = this.f4701v.n();
        boolean z17 = d2VarN.s() && d2VarN.f4346h.f4380k;
        if (d2VarN.f4346h.f4370a.b() && !d2VarN.f4344f) {
            z16 = true;
        }
        if (z17 || z16) {
            return true;
        }
        return this.f4682f.i(new a2.a(this.f4709z, this.R.f4649a, d2VarU.f4346h.f4370a, d2VarU.C(this.f4710z0), T(d2VarN.j()), this.f4692q.d().f188663a, this.R.f4660l, this.f4685h0, jB, this.f4693q0));
    }

    private long L() {
        long jMin = this.R.f4653e == 3 ? 1000L : L0;
        for (c3 c3Var : this.f4677a) {
            jMin = Math.min(jMin, w7.o0.g1(c3Var.j(this.f4710z0, this.A0)));
        }
        if (!this.R.n()) {
            return jMin;
        }
        d2 d2VarK = this.f4701v.u() != null ? this.f4701v.u().k() : null;
        return (d2VarK == null || ((float) this.f4710z0) + (((float) w7.o0.J0(jMin)) * this.R.f4663o.f188663a) < ((float) d2VarK.n())) ? jMin : Math.min(jMin, L0);
    }

    private void L0() {
        for (int i15 = 0; i15 < this.f4677a.length; i15++) {
            this.f4678b[i15].k();
            this.f4677a[i15].H();
        }
    }

    private boolean L1(t7.e0 e0Var, h8.c0.b bVar) {
        if (!bVar.b() && !e0Var.q()) {
            e0Var.n(e0Var.h(bVar.f81468a, this.f4689m).f188138c, this.f4688l);
            if (this.f4688l.f()) {
                t7.e0.c cVar = this.f4688l;
                if (cVar.f188161i && cVar.f188158f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private long M(t7.e0 e0Var, Object obj, long j15) {
        e0Var.n(e0Var.h(obj, this.f4689m).f188138c, this.f4688l);
        t7.e0.c cVar = this.f4688l;
        if (cVar.f188158f != -9223372036854775807L && cVar.f()) {
            t7.e0.c cVar2 = this.f4688l;
            if (cVar2.f188161i) {
                return w7.o0.J0(cVar2.a() - this.f4688l.f188158f) - (j15 + this.f4689m.o());
            }
        }
        return -9223372036854775807L;
    }

    private void M0(int i15, int i16, h8.b1 b1Var) throws Throwable {
        this.T.b(1);
        a0(this.f4703w.A(i15, i16, b1Var), false);
    }

    private void M1() {
        d2 d2VarU = this.f4701v.u();
        if (d2VarU == null) {
            return;
        }
        j8.y yVarP = d2VarU.p();
        for (int i15 = 0; i15 < this.f4677a.length; i15++) {
            if (yVarP.c(i15)) {
                this.f4677a[i15].W();
            }
        }
    }

    private long N(d2 d2Var) {
        if (d2Var == null) {
            return 0L;
        }
        long jM = d2Var.m();
        if (!d2Var.f4344f) {
            return jM;
        }
        int i15 = 0;
        while (true) {
            c3[] c3VarArr = this.f4677a;
            if (i15 >= c3VarArr.length) {
                return jM;
            }
            if (c3VarArr[i15].x(d2Var)) {
                long jK = this.f4677a[i15].k(d2Var);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i15++;
        }
    }

    private void N0() throws w {
        float f15 = this.f4692q.d().f188663a;
        d2 d2VarY = this.f4701v.y();
        j8.y yVar = null;
        boolean z15 = true;
        for (d2 d2VarU = this.f4701v.u(); d2VarU != null && d2VarU.f4344f; d2VarU = d2VarU.k()) {
            v2 v2Var = this.R;
            j8.y yVarZ = d2VarU.z(f15, v2Var.f4649a, v2Var.f4660l);
            if (d2VarU == this.f4701v.u()) {
                yVar = yVarZ;
            }
            if (!yVarZ.a(d2VarU.p())) {
                if (z15) {
                    d2 d2VarU2 = this.f4701v.u();
                    boolean z16 = (this.f4701v.N(d2VarU2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f4677a.length];
                    long jB = d2VarU2.b((j8.y) zj.p.q(yVar), this.R.f4667s, z16, zArr);
                    v2 v2Var2 = this.R;
                    boolean z17 = (v2Var2.f4653e == 4 || jB == v2Var2.f4667s) ? false : true;
                    v2 v2Var3 = this.R;
                    this.R = e0(v2Var3.f4650b, jB, v2Var3.f4651c, v2Var3.f4652d, z17, 5);
                    if (z17) {
                        R0(jB, true);
                    }
                    A();
                    boolean[] zArr2 = new boolean[this.f4677a.length];
                    int i15 = 0;
                    while (true) {
                        c3[] c3VarArr = this.f4677a;
                        if (i15 >= c3VarArr.length) {
                            break;
                        }
                        int iH = c3VarArr[i15].h();
                        zArr2[i15] = this.f4677a[i15].y();
                        this.f4677a[i15].B(d2VarU2.f4341c[i15], this.f4692q, this.f4710z0, zArr[i15]);
                        if (iH - this.f4677a[i15].h() > 0) {
                            s0(i15, false);
                        }
                        this.f4706x0 -= iH - this.f4677a[i15].h();
                        i15++;
                    }
                    G(zArr2, this.f4710z0);
                    d2VarU2.f4347i = true;
                } else {
                    this.f4701v.N(d2VarU);
                    if (d2VarU.f4344f) {
                        long jMax = Math.max(d2VarU.f4346h.f4371b, d2VarU.C(this.f4710z0));
                        if (this.D && w() && this.f4701v.x() == d2VarU) {
                            A();
                        }
                        d2VarU.a(yVarZ, jMax, false);
                    }
                }
                Y(true);
                if (this.R.f4653e != 4) {
                    m0();
                    Y1();
                    this.f4684h.l(2);
                    return;
                }
                return;
            }
            if (d2VarU == d2VarY) {
                z15 = false;
            }
        }
    }

    private Pair<h8.c0.b, Long> O(t7.e0 e0Var) {
        if (e0Var.q()) {
            return Pair.create(v2.l(), 0L);
        }
        Pair<Object, Long> pairJ = e0Var.j(this.f4688l, this.f4689m, e0Var.a(this.f4699t0), -9223372036854775807L);
        h8.c0.b bVarQ = this.f4701v.Q(e0Var, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (bVarQ.b()) {
            e0Var.h(bVarQ.f81468a, this.f4689m);
            jLongValue = bVarQ.f81470c == this.f4689m.l(bVarQ.f81469b) ? this.f4689m.g() : 0L;
        }
        return Pair.create(bVarQ, Long.valueOf(jLongValue));
    }

    private void O0() throws w {
        N0();
        a1(true);
    }

    private void O1(boolean z15, boolean z16) {
        P0(z15 || !this.f4700u0, false, true, false);
        this.T.b(z16 ? 1 : 0);
        this.f4682f.n(this.f4709z);
        this.E.n(this.R.f4660l, 1);
        B1(1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009e A[PHI: r2 r6 r8
      0x009e: PHI (r2v2 h8.c0$b) = (r2v1 h8.c0$b), (r2v12 h8.c0$b) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5 A[PHI: r0
      0x00e5: PHI (r0v12 t7.e0) = (r0v11 t7.e0), (r0v11 t7.e0), (r0v22 t7.e0), (r0v22 t7.e0) binds: [B:34:0x00ab, B:36:0x00af, B:38:0x00c0, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    private void P0(boolean z15, boolean z16, boolean z17, boolean z18) {
        boolean z19;
        t7.e0 e0Var;
        h8.c0.b bVar;
        this.f4684h.n(2);
        this.L = false;
        if (this.O != null) {
            this.T.b(1);
            this.O = null;
        }
        this.D0 = null;
        b2(false, true);
        this.f4692q.g();
        this.f4710z0 = 1000000000000L;
        try {
            C();
        } catch (w | RuntimeException e15) {
            w7.t.d("ExoPlayerImplInternal", "Disable failed.", e15);
        }
        if (z15) {
            for (c3 c3Var : this.f4677a) {
                try {
                    c3Var.L();
                } catch (RuntimeException e16) {
                    w7.t.d("ExoPlayerImplInternal", "Reset failed.", e16);
                }
            }
        }
        this.f4706x0 = 0;
        v2 v2Var = this.R;
        h8.c0.b bVar2 = v2Var.f4650b;
        long jLongValue = v2Var.f4667s;
        long j15 = (this.R.f4650b.b() || l0(this.R, this.f4689m)) ? this.R.f4651c : this.R.f4667s;
        if (z16) {
            this.f4708y0 = null;
            Pair<h8.c0.b, Long> pairO = O(this.R.f4649a);
            bVar2 = (h8.c0.b) pairO.first;
            jLongValue = ((Long) pairO.second).longValue();
            j15 = -9223372036854775807L;
            z19 = bVar2.equals(this.R.f4650b) ? false : true;
        }
        long j16 = jLongValue;
        long j17 = j15;
        this.f4701v.g();
        this.f4695r0 = false;
        t7.e0 e0VarE = this.R.f4649a;
        if (z17 && (e0VarE instanceof y2)) {
            e0VarE = ((y2) e0VarE).E(this.f4703w.q());
            if (bVar2.f81469b != -1) {
                e0VarE.h(bVar2.f81468a, this.f4689m);
                if (e0VarE.n(this.f4689m.f188138c, this.f4688l).f()) {
                    e0Var = e0VarE;
                    bVar = new h8.c0.b(bVar2.f81468a, bVar2.f81471d);
                } else {
                    e0Var = e0VarE;
                    bVar = bVar2;
                }
            } else {
                e0Var = e0VarE;
                bVar = bVar2;
            }
        } else {
            e0Var = e0VarE;
            bVar = bVar2;
        }
        v2 v2Var2 = this.R;
        int i15 = v2Var2.f4653e;
        w wVar = z18 ? null : v2Var2.f4654f;
        h8.j1 j1Var = z19 ? h8.j1.f81614d : v2Var2.f4656h;
        j8.y yVar = z19 ? this.f4681e : v2Var2.f4657i;
        List listC = z19 ? ak.n0.C() : v2Var2.f4658j;
        v2 v2Var3 = this.R;
        this.R = new v2(e0Var, bVar, j17, j16, i15, wVar, false, j1Var, yVar, listC, bVar, v2Var3.f4660l, v2Var3.f4661m, v2Var3.f4662n, v2Var3.f4663o, j16, 0L, j16, 0L, false);
        if (z17) {
            this.f4701v.M();
            this.f4703w.y();
        }
    }

    private void P1() {
        this.f4692q.g();
        for (c3 c3Var : this.f4677a) {
            c3Var.Y();
        }
    }

    private f3 Q(long j15) {
        e3 e3Var;
        Double d15;
        if (!this.K || j15 == -9223372036854775807L || (d15 = (e3Var = this.H).f4383b) == null || e3Var.f4384c == null) {
            return this.G;
        }
        double d16 = j15;
        double dDoubleValue = d15.doubleValue() * d16;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long jF = ck.a.f(dDoubleValue, roundingMode);
        long jF2 = ck.a.f(this.H.f4384c.doubleValue() * d16, roundingMode);
        f3 f3Var = this.I;
        if (f3Var == null || f3Var.f4414a != jF || f3Var.f4415b != jF2) {
            this.I = new f3(jF, jF2);
        }
        return this.I;
    }

    private void Q0() {
        d2 d2VarU = this.f4701v.u();
        this.Z = d2VarU != null && d2VarU.f4346h.f4379j && this.Y;
    }

    private void Q1() {
        d2 d2VarN = this.f4701v.n();
        boolean z15 = this.f4695r0 || (d2VarN != null && d2VarN.f4339a.b());
        v2 v2Var = this.R;
        if (z15 != v2Var.f4655g) {
            this.R = v2Var.b(z15);
        }
    }

    private long R() {
        if (this.R.f4653e != 3 || I1()) {
            return L0;
        }
        return 1000L;
    }

    private void R0(long j15, boolean z15) {
        d2 d2VarU = this.f4701v.u();
        long jD = d2VarU == null ? j15 + 1000000000000L : d2VarU.D(j15);
        this.f4710z0 = jD;
        this.f4692q.c(jD);
        for (c3 c3Var : this.f4677a) {
            c3Var.M(d2VarU, this.f4710z0, z15);
        }
        D0();
    }

    private void R1(h8.c0.b bVar, h8.j1 j1Var, j8.y yVar) {
        d2 d2Var = (d2) zj.p.q(this.f4701v.n());
        this.f4682f.q(new a2.a(this.f4709z, this.R.f4649a, bVar, d2Var == this.f4701v.u() ? d2Var.C(this.f4710z0) : d2Var.C(this.f4710z0) - d2Var.f4346h.f4371b, T(d2Var.j()), this.f4692q.d().f188663a, this.R.f4660l, this.f4685h0, L1(this.R.f4649a, d2Var.f4346h.f4370a) ? this.f4705x.b() : -9223372036854775807L, this.f4693q0), j1Var, yVar.f100153c);
    }

    private long S() {
        return T(this.R.f4665q);
    }

    private static void S0(t7.e0 e0Var, d dVar, t7.e0.c cVar, t7.e0.b bVar) {
        int i15 = e0Var.n(e0Var.h(dVar.f4723d, bVar).f188138c, cVar).f188167o;
        Object obj = e0Var.g(i15, bVar, true).f188137b;
        long j15 = bVar.f188139d;
        dVar.e(i15, j15 != -9223372036854775807L ? j15 - 1 : Long.MAX_VALUE, obj);
    }

    private void S1(int i15, int i16, List<t7.s> list) throws Throwable {
        this.T.b(1);
        a0(this.f4703w.E(i15, i16, list), false);
    }

    private long T(long j15) {
        d2 d2VarN = this.f4701v.n();
        if (d2VarN == null) {
            return 0L;
        }
        return Math.max(0L, j15 - d2VarN.C(this.f4710z0));
    }

    private static boolean T0(d dVar, t7.e0 e0Var, t7.e0 e0Var2, int i15, boolean z15, t7.e0.c cVar, t7.e0.b bVar) {
        Object obj = dVar.f4723d;
        if (obj == null) {
            Pair<Object, Long> pairW0 = W0(e0Var, new h(dVar.f4720a.g(), dVar.f4720a.c(), dVar.f4720a.e() == Long.MIN_VALUE ? -9223372036854775807L : w7.o0.J0(dVar.f4720a.e())), false, i15, z15, cVar, bVar);
            if (pairW0 == null) {
                return false;
            }
            dVar.e(e0Var.b(pairW0.first), ((Long) pairW0.second).longValue(), pairW0.first);
            if (dVar.f4720a.e() == Long.MIN_VALUE) {
                S0(e0Var, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = e0Var.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f4720a.e() == Long.MIN_VALUE) {
            S0(e0Var, dVar, cVar, bVar);
            return true;
        }
        dVar.f4721b = iB;
        e0Var2.h(dVar.f4723d, bVar);
        if (bVar.f188141f && e0Var2.n(bVar.f188138c, cVar).f188166n == e0Var2.b(dVar.f4723d)) {
            Pair<Object, Long> pairJ = e0Var.j(cVar, bVar, e0Var.h(dVar.f4723d, bVar).f188138c, dVar.f4722c + bVar.o());
            dVar.e(e0Var.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    private void T1() throws w {
        if (this.R.f4649a.q() || !this.f4703w.t()) {
            return;
        }
        boolean zU0 = u0();
        y0();
        z0();
        A0();
        w0();
        x0(zU0);
    }

    private void U(int i15) {
        v2 v2Var = this.R;
        X1(v2Var.f4660l, i15, v2Var.f4662n, v2Var.f4661m);
    }

    private void U0(t7.e0 e0Var, t7.e0 e0Var2) {
        if (e0Var.q() && e0Var2.q()) {
            return;
        }
        int size = this.f4694r.size() - 1;
        while (size >= 0) {
            t7.e0 e0Var3 = e0Var;
            t7.e0 e0Var4 = e0Var2;
            if (!T0(this.f4694r.get(size), e0Var3, e0Var4, this.f4697s0, this.f4699t0, this.f4688l, this.f4689m)) {
                this.f4694r.get(size).f4720a.j(false);
                this.f4694r.remove(size);
            }
            size--;
            e0Var = e0Var3;
            e0Var2 = e0Var4;
        }
        Collections.sort(this.f4694r);
    }

    private static int U1(int i15, int i16) {
        if (i15 == -1) {
            return 2;
        }
        if (i16 == 2) {
            return 1;
        }
        return i16;
    }

    private void V() {
        F1(this.K0);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0245  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c0  */
    private static g V0(t7.e0 e0Var, v2 v2Var, h hVar, g2 g2Var, int i15, boolean z15, boolean z16, t7.e0.c cVar, t7.e0.b bVar) {
        int i16;
        t7.e0.b bVar2;
        t7.e0 e0Var2;
        int iA;
        long jP;
        boolean z17;
        boolean z18;
        boolean z19;
        int iA2;
        boolean z25;
        long j15;
        int i17;
        int i18;
        long jMin;
        long j16;
        int i19;
        int i25;
        long jLongValue;
        int iA3;
        boolean z26;
        boolean z27;
        boolean z28;
        v2 v2Var2 = v2Var;
        if (e0Var.q()) {
            h8.c0.b bVarL = v2.l();
            boolean z29 = (bVarL.equals(v2Var2.f4650b) && v2Var2.f4667s == 0) ? false : true;
            return new g(bVarL, 0L, -9223372036854775807L, false, true, false, z29, z29 && z16 && !v2Var2.f4649a.q() && !v2Var2.f4649a.h(v2Var2.f4650b.f81468a, bVar).f188141f, 4);
        }
        h8.c0.b bVar3 = v2Var2.f4650b;
        Object obj = bVar3.f81468a;
        boolean zL0 = l0(v2Var2, bVar);
        long jLongValue2 = (v2Var2.f4650b.b() || zL0) ? v2Var2.f4651c : v2Var2.f4667s;
        if (hVar != null) {
            i16 = -1;
            e0Var2 = e0Var;
            Pair<Object, Long> pairW0 = W0(e0Var2, hVar, true, i15, z15, cVar, bVar);
            if (pairW0 == null) {
                iA3 = e0Var2.a(z15);
                jLongValue = jLongValue2;
                z26 = false;
                z27 = false;
                z28 = true;
            } else {
                if (hVar.f4740c == -9223372036854775807L) {
                    iA3 = e0Var2.h(pairW0.first, bVar).f188138c;
                    jLongValue = jLongValue2;
                    z26 = false;
                } else {
                    obj = pairW0.first;
                    jLongValue = ((Long) pairW0.second).longValue();
                    iA3 = -1;
                    z26 = true;
                }
                z27 = v2Var2.f4653e == 4;
                z28 = false;
            }
            z19 = z26;
            z17 = z27;
            z18 = z28;
            jLongValue2 = jLongValue;
            bVar2 = bVar;
            iA = iA3;
        } else {
            i16 = -1;
            bVar2 = bVar;
            e0Var2 = e0Var;
            if (v2Var2.f4649a.q()) {
                iA = e0Var2.a(z15);
            } else if (e0Var2.b(obj) == -1) {
                int iX0 = X0(cVar, bVar2, i15, z15, obj, v2Var2.f4649a, e0Var2);
                if (iX0 == -1) {
                    e0Var2 = e0Var2;
                    iA2 = e0Var2.a(z15);
                    z25 = true;
                } else {
                    e0Var2 = e0Var2;
                    iA2 = iX0;
                    z25 = false;
                }
                iA = iA2;
                obj = obj;
                bVar2 = bVar2;
                z18 = z25;
                z17 = false;
                z19 = false;
            } else if (jLongValue2 == -9223372036854775807L) {
                iA = e0Var2.h(obj, bVar2).f188138c;
                obj = obj;
            } else if (zL0) {
                v2Var2.f4649a.h(bVar3.f81468a, bVar2);
                if (v2Var2.f4649a.n(bVar2.f188138c, cVar).f188166n == v2Var2.f4649a.b(bVar3.f81468a)) {
                    bVar2 = bVar2;
                    Pair<Object, Long> pairJ = e0Var2.j(cVar, bVar2, e0Var2.h(obj, bVar2).f188138c, bVar2.o() + jLongValue2);
                    obj = pairJ.first;
                    jP = ((Long) pairJ.second).longValue();
                } else {
                    bVar2 = bVar2;
                    if (e0Var2.h(obj, bVar2).f188139d != -9223372036854775807L) {
                        obj = obj;
                        jP = w7.o0.p(jLongValue2, 0L, bVar2.f188139d - 1);
                    } else {
                        obj = obj;
                        jP = jLongValue2;
                    }
                }
                jLongValue2 = jP;
                iA = -1;
                z17 = false;
                z18 = false;
                z19 = true;
            } else {
                obj = obj;
                iA = -1;
                z17 = false;
                z18 = false;
                z19 = false;
            }
            z17 = false;
            z18 = false;
            z19 = false;
        }
        if (iA != i16) {
            Pair<Object, Long> pairJ2 = e0Var2.j(cVar, bVar2, iA, -9223372036854775807L);
            obj = pairJ2.first;
            jLongValue2 = ((Long) pairJ2.second).longValue();
            j15 = -9223372036854775807L;
        } else {
            j15 = jLongValue2;
        }
        h8.c0.b bVarQ = g2Var.Q(e0Var2, obj, jLongValue2);
        int i26 = bVarQ.f81472e;
        boolean z35 = i26 == i16 || ((i25 = bVar3.f81472e) != i16 && i26 >= i25);
        boolean zEquals = bVar3.f81468a.equals(obj);
        h8.c0.b bVar4 = ((zEquals && !bVar3.b() && !bVarQ.b() && z35) || h0(zL0, bVar3, jLongValue2, bVarQ, e0Var2.h(obj, bVar2), j15)) ? bVar3 : bVarQ;
        if (!bVar4.b()) {
            if (zEquals && bVar3.b()) {
                t7.a.C4892a c4892aA = e0Var2.h(obj, bVar2).f188142g.a(bVar3.f81469b);
                long j17 = c4892aA.f188061j;
                long j18 = v2Var2.f4651c;
                if (j18 != -9223372036854775807L) {
                    long j19 = c4892aA.f188052a;
                    if (j19 == Long.MIN_VALUE || j19 + j17 > j18) {
                        i17 = c4892aA.f188053b;
                        i18 = bVar3.f81470c;
                        if (i17 <= i18 && c4892aA.f188057f[i18] == 2) {
                            long j25 = e0Var2.h(obj, bVar2).f188139d;
                            v2Var2 = v2Var;
                            jMin = j25 != -9223372036854775807L ? Math.min(j25 - 1, jLongValue2 + j17) : jLongValue2 + j17;
                            j16 = jMin;
                        }
                    }
                } else {
                    i17 = c4892aA.f188053b;
                    i18 = bVar3.f81470c;
                    if (i17 <= i18) {
                    }
                }
            }
            v2Var2 = v2Var;
            jMin = jLongValue2;
            j16 = j15;
        } else if (bVar4.equals(bVar3)) {
            jLongValue2 = v2Var2.f4667s;
            jMin = jLongValue2;
            j16 = j15;
        } else {
            e0Var2.h(bVar4.f81468a, bVar2);
            j16 = j15;
            jMin = bVar4.f81470c == bVar2.l(bVar4.f81469b) ? bVar2.g() : 0L;
        }
        boolean z36 = (bVar4.equals(v2Var2.f4650b) && jMin == v2Var2.f4667s) ? false : true;
        int i27 = e0Var2.b(v2Var2.f4650b.f81468a) == -1 ? 4 : 3;
        if (!bVar4.f81468a.equals(v2Var2.f4650b.f81468a) || bVar4.f81469b == -1) {
            i19 = i27;
        } else {
            t7.a.C4892a c4892aA2 = e0Var2.h(bVar4.f81468a, bVar2).f188142g.a(bVar4.f81469b);
            int i28 = bVar4.f81470c;
            int[] iArr = c4892aA2.f188057f;
            if (i28 >= iArr.length || iArr[i28] != 2) {
                i19 = 0;
            } else {
                i19 = i27;
            }
        }
        return new g(bVar4, jMin, j16, z17, z18, z19, z36, z36 && z16 && !v2Var2.f4649a.q() && !v2Var2.f4649a.h(v2Var2.f4650b.f81468a, bVar2).f188141f, i19);
    }

    private void V1() {
        v2 v2Var = this.R;
        W1(v2Var.f4660l, v2Var.f4662n, v2Var.f4661m);
    }

    private void W(h8.b0 b0Var) {
        if (this.f4701v.F(b0Var)) {
            this.f4701v.K(this.f4710z0);
            m0();
        } else if (this.f4701v.G(b0Var)) {
            n0();
        }
    }

    private static Pair<Object, Long> W0(t7.e0 e0Var, h hVar, boolean z15, int i15, boolean z16, t7.e0.c cVar, t7.e0.b bVar) {
        t7.e0 e0Var2;
        int iX0;
        t7.e0 e0Var3 = hVar.f4738a;
        if (e0Var.q()) {
            return null;
        }
        if (e0Var3.q()) {
            e0Var2 = e0Var3;
            e0Var2 = e0Var;
        }
        try {
            e0Var2 = e0Var3;
            Pair<Object, Long> pairJ = e0Var2.j(cVar, bVar, hVar.f4739b, hVar.f4740c);
            t7.e0 e0Var4 = e0Var2;
            if (e0Var.equals(e0Var4)) {
                return pairJ;
            }
            if (e0Var.b(pairJ.first) != -1) {
                return (e0Var4.h(pairJ.first, bVar).f188141f && e0Var4.n(bVar.f188138c, cVar).f188166n == e0Var4.b(pairJ.first)) ? e0Var.j(cVar, bVar, e0Var.h(pairJ.first, bVar).f188138c, hVar.f4740c) : pairJ;
            }
            if (z15 && (iX0 = X0(cVar, bVar, i15, z16, pairJ.first, e0Var4, e0Var)) != -1) {
                return e0Var.j(cVar, bVar, iX0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private void W1(boolean z15, int i15, int i16) {
        X1(z15, this.E.n(z15, this.R.f4653e), i15, i16);
    }

    private void X(IOException iOException, int i15) {
        w wVarC = w.c(iOException, i15);
        d2 d2VarU = this.f4701v.u();
        if (d2VarU != null) {
            wVarC = wVarC.a(d2VarU.f4346h.f4370a);
        }
        w7.t.d("ExoPlayerImplInternal", "Playback error", wVarC);
        O1(false, false);
        this.R = this.R.f(wVarC);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    static int X0(t7.e0.c cVar, t7.e0.b bVar, int i15, boolean z15, Object obj, t7.e0 e0Var, t7.e0 e0Var2) {
        t7.e0.b bVar2;
        Object obj2 = e0Var.n(e0Var.h(obj, bVar).f188138c, cVar).f188153a;
        int i16 = 0;
        for (int i17 = 0; i17 < e0Var2.p(); i17++) {
            if (e0Var2.n(i17, cVar).f188153a.equals(obj2)) {
                return i17;
            }
        }
        int iB = e0Var.b(obj);
        int i18 = e0Var.i();
        int iD = iB;
        int iB2 = -1;
        while (i16 < i18 && iB2 == -1) {
            t7.e0.c cVar2 = cVar;
            bVar2 = bVar;
            int i19 = i15;
            boolean z16 = z15;
            t7.e0 e0Var3 = e0Var;
            iD = e0Var3.d(iD, bVar2, cVar2, i19, z16);
            if (iD == -1) {
                if (iB2 == -1) {
                    return -1;
                }
                return e0Var2.f(iB2, bVar2).f188138c;
            }
            iB2 = e0Var2.b(e0Var3.m(iD));
            i16++;
            e0Var = e0Var3;
            bVar = bVar2;
            cVar = cVar2;
            i15 = i19;
            z15 = z16;
        }
        bVar2 = bVar;
        if (iB2 == -1) {
            return -1;
        }
        return e0Var2.f(iB2, bVar2).f188138c;
    }

    private void X1(boolean z15, int i15, int i16, int i17) {
        boolean z16 = z15 && i15 != -1;
        int iU1 = U1(i15, i17);
        int iA2 = a2(i15, i16, this.K);
        v2 v2Var = this.R;
        if (v2Var.f4660l == z16 && v2Var.f4662n == iA2 && v2Var.f4661m == iU1) {
            return;
        }
        this.R = v2Var.e(z16, iU1, iA2);
        b2(false, false);
        E0(z16);
        if (!I1()) {
            P1();
            Y1();
            v2 v2Var2 = this.R;
            if (v2Var2.f4664p) {
                this.R = v2Var2.i(false);
            }
            this.f4701v.K(this.f4710z0);
            return;
        }
        int i18 = this.R.f4653e;
        if (i18 == 3) {
            this.f4692q.f();
            M1();
            this.f4684h.l(2);
        } else if (i18 == 2) {
            this.f4684h.l(2);
        }
    }

    private void Y(boolean z15) {
        d2 d2VarN = this.f4701v.n();
        h8.c0.b bVar = d2VarN == null ? this.R.f4650b : d2VarN.f4346h.f4370a;
        boolean zEquals = this.R.f4659k.equals(bVar);
        if (!zEquals) {
            this.R = this.R.c(bVar);
        }
        v2 v2Var = this.R;
        v2Var.f4665q = d2VarN == null ? v2Var.f4667s : d2VarN.j();
        this.R.f4666r = S();
        if ((!zEquals || z15) && d2VarN != null && d2VarN.f4344f) {
            R1(d2VarN.f4346h.f4370a, d2VarN.o(), d2VarN.p());
        }
    }

    private void Y0(long j15) {
        this.f4684h.m(2, j15 + (g0() ? L() : R()));
    }

    private void Y1() {
        d2 d2VarU = this.f4701v.u();
        if (d2VarU == null) {
            return;
        }
        long jK = d2VarU.f4344f ? d2VarU.f4339a.k() : -9223372036854775807L;
        if (jK != -9223372036854775807L) {
            if (!d2VarU.s()) {
                this.f4701v.N(d2VarU);
                Y(false);
                m0();
            }
            R0(jK, true);
            if (jK != this.R.f4667s) {
                v2 v2Var = this.R;
                long j15 = jK;
                this.R = e0(v2Var.f4650b, j15, v2Var.f4651c, j15, true, 5);
            }
        } else {
            long jH = this.f4692q.h(d2VarU != this.f4701v.y());
            this.f4710z0 = jH;
            long jC = d2VarU.C(jH);
            t0(this.R.f4667s, jC);
            if (this.f4692q.z()) {
                boolean z15 = !this.T.f4727d;
                v2 v2Var2 = this.R;
                this.R = e0(v2Var2.f4650b, jC, v2Var2.f4651c, jC, z15, 6);
            } else {
                this.R.o(jC);
            }
        }
        this.R.f4665q = this.f4701v.n().j();
        this.R.f4666r = S();
        v2 v2Var3 = this.R;
        if (v2Var3.f4660l && v2Var3.f4653e == 3 && L1(v2Var3.f4649a, v2Var3.f4650b) && this.R.f4663o.f188663a == 1.0f) {
            float fA = this.f4705x.a(J(), this.R.f4666r);
            if (this.f4692q.d().f188663a != fA) {
                l1(this.R.f4663o.b(fA));
                c0(this.R.f4663o, this.f4692q.d().f188663a, false, false);
            }
        }
    }

    private void Z(d2 d2Var) throws w {
        if (!d2Var.f4344f) {
            float f15 = this.f4692q.d().f188663a;
            v2 v2Var = this.R;
            d2Var.q(f15, v2Var.f4649a, v2Var.f4660l);
        }
        R1(d2Var.f4346h.f4370a, d2Var.o(), d2Var.p());
        if (d2Var == this.f4701v.u()) {
            R0(d2Var.f4346h.f4371b, true);
            F();
            d2Var.f4347i = true;
            v2 v2Var2 = this.R;
            h8.c0.b bVar = v2Var2.f4650b;
            long j15 = d2Var.f4346h.f4371b;
            this.R = e0(bVar, j15, v2Var2.f4651c, j15, false, 5);
        }
        m0();
    }

    private void Z1(t7.e0 e0Var, h8.c0.b bVar, t7.e0 e0Var2, h8.c0.b bVar2, long j15, boolean z15) {
        if (!L1(e0Var, bVar)) {
            t7.z zVar = bVar.b() ? t7.z.f188660d : this.R.f4663o;
            if (this.f4692q.d().equals(zVar)) {
                return;
            }
            l1(zVar);
            c0(this.R.f4663o, zVar.f188663a, false, false);
            return;
        }
        e0Var.n(e0Var.h(bVar.f81468a, this.f4689m).f188138c, this.f4688l);
        this.f4705x.d((t7.s.g) w7.o0.h(this.f4688l.f188162j));
        if (j15 != -9223372036854775807L) {
            this.f4705x.e(M(e0Var, bVar.f81468a, j15));
            return;
        }
        if (!Objects.equals(!e0Var2.q() ? e0Var2.n(e0Var2.h(bVar2.f81468a, this.f4689m).f188138c, this.f4688l).f188153a : null, this.f4688l.f188153a) || z15) {
            this.f4705x.e(-9223372036854775807L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0166  */
    /* JADX WARN: Code duplicated, block: B:78:0x0168  */
    /* JADX WARN: Code duplicated, block: B:83:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x018e  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ba  */
    private void a0(t7.e0 e0Var, boolean z15) throws Throwable {
        t7.e0 e0Var2;
        h8.c0.b bVar;
        boolean z16;
        long j15;
        h8.c0.b bVar2;
        long j16;
        int i15;
        t7.e0 e0Var3 = e0Var;
        g gVarV0 = V0(e0Var3, this.R, this.f4708y0, this.f4701v, this.f4697s0, this.f4699t0, z15, this.f4688l, this.f4689m);
        h8.c0.b bVar3 = gVarV0.f4729a;
        long jC1 = gVarV0.f4730b;
        try {
            if (gVarV0.f4733e) {
                if (this.R.f4653e != 1) {
                    B1(4);
                }
                P0(false, false, false, true);
            }
            for (c3 c3Var : this.f4677a) {
                c3Var.S(e0Var3);
            }
            try {
                if (gVarV0.f4735g) {
                    i15 = 2;
                    z16 = false;
                    if (!e0Var3.q()) {
                        for (d2 d2VarU = this.f4701v.u(); d2VarU != null; d2VarU = d2VarU.k()) {
                            if (d2VarU.f4346h.f4370a.equals(bVar3)) {
                                d2VarU.f4346h = this.f4701v.z(e0Var3, d2VarU.f4346h);
                                d2VarU.E();
                            }
                        }
                        jC1 = c1(bVar3, jC1, gVarV0.f4732d);
                    }
                } else {
                    try {
                        long jN = 0;
                        long jN2 = this.f4701v.y() == null ? 0L : N(this.f4701v.y());
                        if (w() && this.f4701v.x() != null) {
                            jN = N(this.f4701v.x());
                        }
                        try {
                            try {
                                i15 = 2;
                                z16 = false;
                                try {
                                    int iX = this.f4701v.X(e0Var, this.f4710z0, jN2, jN);
                                    e0Var3 = e0Var;
                                    if ((iX & 1) != 0) {
                                        a1(false);
                                    } else if ((iX & 2) != 0) {
                                        A();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    e0Var3 = e0Var;
                                    e0Var2 = e0Var3;
                                    bVar = bVar3;
                                    v2 v2Var = this.R;
                                    t7.e0 e0Var4 = v2Var.f4649a;
                                    h8.c0.b bVar4 = v2Var.f4650b;
                                    if (gVarV0.f4734f) {
                                        j15 = jC1;
                                    } else {
                                        j15 = -9223372036854775807L;
                                    }
                                    bVar2 = bVar;
                                    Z1(e0Var2, bVar2, e0Var4, bVar4, j15, false);
                                    if (gVarV0.f4735g) {
                                        long j17 = gVarV0.f4731c;
                                        if (gVarV0.f4736h) {
                                            j16 = jC1;
                                        } else {
                                            j16 = this.R.f4652d;
                                        }
                                        this.R = e0(bVar2, jC1, j17, j16, gVarV0.f4736h, gVarV0.f4737i);
                                    } else {
                                        long j18 = gVarV0.f4731c;
                                        if (gVarV0.f4736h) {
                                            j16 = jC1;
                                        } else {
                                            j16 = this.R.f4652d;
                                        }
                                        this.R = e0(bVar2, jC1, j18, j16, gVarV0.f4736h, gVarV0.f4737i);
                                    }
                                    Q0();
                                    U0(e0Var2, this.R.f4649a);
                                    this.R = this.R.j(e0Var2);
                                    if (!e0Var2.q()) {
                                        this.f4708y0 = null;
                                    }
                                    Y(z16);
                                    this.f4684h.l(2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                e0Var3 = e0Var;
                                z16 = false;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            e0Var3 = e0Var;
                            z16 = false;
                            e0Var2 = e0Var3;
                            bVar = bVar3;
                            v2 v2Var2 = this.R;
                            t7.e0 e0Var5 = v2Var2.f4649a;
                            h8.c0.b bVar5 = v2Var2.f4650b;
                            if (gVarV0.f4734f) {
                                j15 = jC1;
                            } else {
                                j15 = -9223372036854775807L;
                            }
                            bVar2 = bVar;
                            Z1(e0Var2, bVar2, e0Var5, bVar5, j15, false);
                            if (gVarV0.f4735g || gVarV0.f4731c != this.R.f4651c) {
                                long j19 = gVarV0.f4731c;
                                if (gVarV0.f4736h) {
                                    j16 = jC1;
                                } else {
                                    j16 = this.R.f4652d;
                                }
                                this.R = e0(bVar2, jC1, j19, j16, gVarV0.f4736h, gVarV0.f4737i);
                            }
                            Q0();
                            U0(e0Var2, this.R.f4649a);
                            this.R = this.R.j(e0Var2);
                            if (!e0Var2.q()) {
                                this.f4708y0 = null;
                            }
                            Y(z16);
                            this.f4684h.l(2);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
                v2 v2Var3 = this.R;
                Z1(e0Var3, bVar3, v2Var3.f4649a, v2Var3.f4650b, gVarV0.f4734f ? jC1 : -9223372036854775807L, false);
                t7.e0 e0Var6 = e0Var3;
                if (gVarV0.f4735g || gVarV0.f4731c != this.R.f4651c) {
                    this.R = e0(bVar3, jC1, gVarV0.f4731c, gVarV0.f4736h ? jC1 : this.R.f4652d, gVarV0.f4736h, gVarV0.f4737i);
                }
                Q0();
                U0(e0Var6, this.R.f4649a);
                this.R = this.R.j(e0Var6);
                if (!e0Var6.q()) {
                    this.f4708y0 = null;
                }
                Y(z16);
                this.f4684h.l(i15);
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            e0Var2 = e0Var3;
            bVar = bVar3;
            z16 = false;
        }
    }

    private void a1(boolean z15) throws w {
        h8.c0.b bVar = this.f4701v.u().f4346h.f4370a;
        long jD1 = d1(bVar, this.R.f4667s, true, false);
        if (jD1 != this.R.f4667s) {
            v2 v2Var = this.R;
            this.R = e0(bVar, jD1, v2Var.f4651c, v2Var.f4652d, z15, 5);
        }
    }

    private static int a2(int i15, int i16, boolean z15) {
        if (i15 == 0) {
            return 1;
        }
        if (i16 == 1) {
            return z15 ? 4 : 0;
        }
        return i16;
    }

    private void b0(h8.b0 b0Var) throws w {
        if (this.f4701v.F(b0Var)) {
            Z((d2) zj.p.q(this.f4701v.n()));
            return;
        }
        d2 d2VarV = this.f4701v.v(b0Var);
        if (d2VarV != null) {
            zj.p.w(!d2VarV.f4344f);
            float f15 = this.f4692q.d().f188663a;
            v2 v2Var = this.R;
            d2VarV.q(f15, v2Var.f4649a, v2Var.f4660l);
            if (this.f4701v.G(b0Var)) {
                n0();
            }
        }
    }

    private void b1(h hVar) throws Throwable {
        long jLongValue;
        h8.c0.b bVarQ;
        long j15;
        boolean z15;
        long jMax;
        long j16;
        long jH;
        h8.c0.b bVar;
        long j17;
        v2 v2Var;
        int i15;
        int i16;
        long j18;
        w1 w1Var = this;
        if (w1Var.L) {
            if (w1Var.O != null) {
                w1Var.P++;
                w1Var.T.b(1);
            }
            w1Var.O = hVar;
            return;
        }
        w1Var.T.b(1);
        Pair<Object, Long> pairW0 = W0(w1Var.R.f4649a, hVar, true, w1Var.f4697s0, w1Var.f4699t0, w1Var.f4688l, w1Var.f4689m);
        if (pairW0 == null) {
            Pair<h8.c0.b, Long> pairO = w1Var.O(w1Var.R.f4649a);
            bVarQ = (h8.c0.b) pairO.first;
            jLongValue = ((Long) pairO.second).longValue();
            z15 = !w1Var.R.f4649a.q();
            jMax = -9223372036854775807L;
            j15 = 0;
        } else {
            Object obj = pairW0.first;
            jLongValue = ((Long) pairW0.second).longValue();
            long j19 = hVar.f4740c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            bVarQ = w1Var.f4701v.Q(w1Var.R.f4649a, obj, jLongValue);
            if (bVarQ.b()) {
                w1Var.R.f4649a.h(bVarQ.f81468a, w1Var.f4689m);
                jLongValue = w1Var.f4689m.l(bVarQ.f81469b) == bVarQ.f81470c ? w1Var.f4689m.g() : 0L;
                t7.a.C4892a c4892aA = w1Var.f4689m.f188142g.a(bVarQ.f81469b);
                j15 = 0;
                jMax = Math.max(j19, c4892aA.f188052a + c4892aA.f188061j);
                z15 = true;
            } else {
                j15 = 0;
                z15 = hVar.f4740c == -9223372036854775807L;
                jMax = j19;
            }
        }
        try {
            try {
                if (!w1Var.R.f4649a.q()) {
                    if (pairW0 == null) {
                        if (w1Var.R.f4653e != 1) {
                            w1Var.B1(4);
                        }
                        w1Var.P0(false, true, false, true);
                    } else {
                        if (bVarQ.equals(w1Var.R.f4650b)) {
                            d2 d2VarU = w1Var.f4701v.u();
                            jH = (d2VarU == null || !d2VarU.f4344f || jLongValue == j15) ? jLongValue : d2VarU.f4339a.h(jLongValue, w1Var.Q(w1Var.f4688l.f188165m));
                            if (w7.o0.g1(jH) == w7.o0.g1(w1Var.R.f4667s) && ((i15 = (v2Var = w1Var.R).f4653e) == 2 || i15 == 3)) {
                                j17 = v2Var.f4667s;
                                bVar = bVarQ;
                                i16 = 2;
                                z15 = z15;
                                j18 = j17;
                            }
                        } else {
                            jH = jLongValue;
                        }
                        try {
                            if (w1Var.K) {
                                for (c3 c3Var : w1Var.f4677a) {
                                    if (c3Var.y() && c3Var.m() == 2) {
                                        w1Var.L = true;
                                        break;
                                    }
                                }
                            }
                            long jC1 = w1Var.c1(bVarQ, jH, w1Var.R.f4653e == 4);
                            z15 = (jLongValue != jC1) | z15;
                            try {
                                v2 v2Var2 = w1Var.R;
                                h8.c0.b bVar2 = bVarQ;
                                try {
                                    t7.e0 e0Var = v2Var2.f4649a;
                                    long j25 = jMax;
                                    try {
                                        w1Var.Z1(e0Var, bVar2, e0Var, v2Var2.f4650b, j25, true);
                                        bVar = bVar2;
                                        jMax = j25;
                                        j17 = jC1;
                                        i16 = 2;
                                        j18 = j17;
                                        w1Var = this;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bVarQ = bVar2;
                                        jMax = j25;
                                        j16 = jC1;
                                        w1Var.R = w1Var.e0(bVarQ, j16, jMax, j16, z15, 2);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVarQ = bVar2;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j16 = jLongValue;
                            w1Var.R = w1Var.e0(bVarQ, j16, jMax, j16, z15, 2);
                            throw th;
                        }
                    }
                    w1Var.R = w1Var.e0(bVar, j17, jMax, j18, z15, i16);
                }
                w1Var.f4708y0 = hVar;
                z15 = z15;
                bVar = bVarQ;
                j17 = jLongValue;
                i16 = 2;
                j18 = j17;
                w1Var = this;
                w1Var.R = w1Var.e0(bVar, j17, jMax, j18, z15, i16);
            } catch (Throwable th8) {
                th = th8;
                bVarQ = bVarQ;
                j16 = jLongValue;
                w1Var.R = w1Var.e0(bVarQ, j16, jMax, j16, z15, 2);
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            bVarQ = bVarQ;
        }
    }

    private void b2(boolean z15, boolean z16) {
        this.f4685h0 = z15;
        this.f4693q0 = (!z15 || z16) ? -9223372036854775807L : this.f4696s.b();
    }

    private void c0(t7.z zVar, float f15, boolean z15, boolean z16) {
        if (z15) {
            if (z16) {
                this.T.b(1);
            }
            this.R = this.R.g(zVar);
        }
        d2(zVar.f188663a);
        for (c3 c3Var : this.f4677a) {
            c3Var.Q(f15, zVar.f188663a);
        }
    }

    private long c1(h8.c0.b bVar, long j15, boolean z15) {
        return d1(bVar, j15, this.f4701v.u() != this.f4701v.y(), z15);
    }

    private boolean c2() throws w {
        d2 d2VarY = this.f4701v.y();
        j8.y yVarP = d2VarY.p();
        boolean z15 = true;
        int i15 = 0;
        while (true) {
            c3[] c3VarArr = this.f4677a;
            if (i15 >= c3VarArr.length) {
                break;
            }
            int iH = c3VarArr[i15].h();
            int iJ = this.f4677a[i15].J(d2VarY, yVarP, this.f4692q);
            if ((iJ & 2) != 0 && this.f4704w0) {
                o1(false);
            }
            this.f4706x0 -= iH - this.f4677a[i15].h();
            z15 &= (iJ & 1) != 0;
            i15++;
        }
        if (z15) {
            for (int i16 = 0; i16 < this.f4677a.length; i16++) {
                if (yVarP.c(i16) && !this.f4677a[i16].x(d2VarY)) {
                    E(d2VarY, i16, false, d2VarY.n());
                }
            }
        }
        return z15;
    }

    private void d0(t7.z zVar, boolean z15) {
        c0(zVar, zVar.f188663a, true, z15);
    }

    private long d1(h8.c0.b bVar, long j15, boolean z15, boolean z16) throws w {
        P1();
        boolean z17 = true;
        b2(false, true);
        if (z16 || this.R.f4653e == 3) {
            B1(2);
        }
        d2 d2VarU = this.f4701v.u();
        d2 d2VarK = d2VarU;
        while (d2VarK != null && !bVar.equals(d2VarK.f4346h.f4370a)) {
            d2VarK = d2VarK.k();
        }
        if (z15 || d2VarU != d2VarK || (d2VarK != null && d2VarK.D(j15) < 0)) {
            C();
            if (d2VarK != null) {
                while (this.f4701v.u() != d2VarK) {
                    this.f4701v.b();
                }
                this.f4701v.N(d2VarK);
                d2VarK.B(1000000000000L);
                F();
                d2VarK.f4347i = true;
            }
        }
        A();
        if (d2VarK != null) {
            this.f4701v.N(d2VarK);
            if (!d2VarK.f4344f) {
                d2VarK.f4346h = d2VarK.f4346h.b(j15, -9223372036854775807L);
            } else if (d2VarK.f4345g) {
                if (this.K && this.H.f4390i && J1(d2VarK, j15)) {
                    z17 = false;
                } else {
                    j15 = d2VarK.f4339a.i(j15);
                    d2VarK.f4339a.w(j15 - this.f4690n, this.f4691p);
                }
            }
            R0(j15, z17);
            m0();
        } else {
            this.f4701v.g();
            R0(j15, true);
        }
        Y(false);
        this.f4684h.l(2);
        return j15;
    }

    private void d2(float f15) {
        for (d2 d2VarU = this.f4701v.u(); d2VarU != null; d2VarU = d2VarU.k()) {
            for (j8.r rVar : d2VarU.p().f100153c) {
                if (rVar != null) {
                    rVar.f(f15);
                }
            }
        }
    }

    private v2 e0(h8.c0.b bVar, long j15, long j16, long j17, boolean z15, int i15) {
        List<t7.v> list;
        h8.j1 j1Var;
        j8.y yVar;
        this.C0 = (!this.C0 && j15 == this.R.f4667s && bVar.equals(this.R.f4650b)) ? false : true;
        Q0();
        v2 v2Var = this.R;
        h8.j1 j1Var2 = v2Var.f4656h;
        j8.y yVar2 = v2Var.f4657i;
        List<t7.v> listC = v2Var.f4658j;
        if (this.f4703w.t()) {
            d2 d2VarU = this.f4701v.u();
            h8.j1 j1VarO = d2VarU == null ? h8.j1.f81614d : d2VarU.o();
            j8.y yVarP = d2VarU == null ? this.f4681e : d2VarU.p();
            ak.n0<t7.v> n0VarI = I(yVarP.f100153c);
            if (d2VarU != null) {
                e2 e2Var = d2VarU.f4346h;
                if (e2Var.f4373d != j16) {
                    d2VarU.f4346h = e2Var.a(j16);
                }
            }
            v0();
            j1Var = j1VarO;
            yVar = yVarP;
            list = n0VarI;
        } else {
            if (!bVar.equals(this.R.f4650b)) {
                j1Var2 = h8.j1.f81614d;
                yVar2 = this.f4681e;
                listC = ak.n0.C();
            }
            list = listC;
            j1Var = j1Var2;
            yVar = yVar2;
        }
        if (z15) {
            this.T.d(i15);
        }
        return this.R.d(bVar, j15, j16, j17, S(), j1Var, yVar, list);
    }

    private void e1(x2 x2Var) {
        if (x2Var.e() == -9223372036854775807L) {
            f1(x2Var);
            return;
        }
        if (this.R.f4649a.q()) {
            this.f4694r.add(new d(x2Var));
            return;
        }
        d dVar = new d(x2Var);
        t7.e0 e0Var = this.R.f4649a;
        if (!T0(dVar, e0Var, e0Var, this.f4697s0, this.f4699t0, this.f4688l, this.f4689m)) {
            x2Var.j(false);
        } else {
            this.f4694r.add(dVar);
            Collections.sort(this.f4694r);
        }
    }

    private boolean f0() {
        d2 d2VarY = this.f4701v.y();
        if (!d2VarY.f4344f) {
            return false;
        }
        int i15 = 0;
        while (true) {
            c3[] c3VarArr = this.f4677a;
            if (i15 >= c3VarArr.length) {
                return true;
            }
            if (!c3VarArr[i15].o(d2VarY)) {
                return false;
            }
            i15++;
        }
    }

    private void f1(x2 x2Var) {
        if (x2Var.b() != this.f4687k) {
            this.f4684h.e(15, x2Var).a();
            return;
        }
        z(x2Var);
        int i15 = this.R.f4653e;
        if (i15 == 3 || i15 == 2) {
            this.f4684h.l(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g0() {
        if (this.A) {
            return true;
        }
        return this.K && this.H.f4388g;
    }

    private void g1(final x2 x2Var) {
        Looper looperB = x2Var.b();
        if (looperB.getThread().isAlive()) {
            this.f4696s.e(looperB, null).j(new Runnable() { // from class: a8.v1
                @Override // java.lang.Runnable
                public final void run() {
                    w1.l(this.f4646a, x2Var);
                }
            });
        } else {
            w7.t.h("TAG", "Trying to send message on a dead thread.");
            x2Var.j(false);
        }
    }

    private static boolean h0(boolean z15, h8.c0.b bVar, long j15, h8.c0.b bVar2, t7.e0.b bVar3, long j16) {
        if (!z15 && j15 == j16 && bVar.f81468a.equals(bVar2.f81468a)) {
            if (bVar.b() && bVar3.s(bVar.f81469b)) {
                return (bVar3.h(bVar.f81469b, bVar.f81470c) == 4 || bVar3.h(bVar.f81469b, bVar.f81470c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.s(bVar2.f81469b)) {
                return true;
            }
        }
        return false;
    }

    private void h1(long j15) {
        for (c3 c3Var : this.f4677a) {
            c3Var.N(j15);
        }
    }

    private boolean i0(d2 d2Var) {
        return (d2Var == null || d2Var.r() || d2Var.l() == Long.MIN_VALUE) ? false : true;
    }

    private boolean j0(int i15, h8.c0.b bVar) {
        if (this.f4701v.x() == null || !this.f4701v.x().f4346h.f4370a.equals(bVar)) {
            return false;
        }
        return this.f4677a[i15].v(this.f4701v.x());
    }

    private void j1(t7.b bVar, boolean z15) {
        this.f4680d.k(bVar);
        u7.g gVar = this.E;
        if (!z15) {
            bVar = null;
        }
        gVar.k(bVar);
        V1();
    }

    private boolean k0() {
        d2 d2VarU = this.f4701v.u();
        long j15 = d2VarU.f4346h.f4375f;
        if (d2VarU.f4344f) {
            return j15 == -9223372036854775807L || this.R.f4667s < j15 || !I1();
        }
        return false;
    }

    private void k1(boolean z15, w7.k kVar) {
        if (this.f4700u0 != z15) {
            this.f4700u0 = z15;
            if (!z15) {
                for (c3 c3Var : this.f4677a) {
                    c3Var.L();
                }
            }
        }
        if (kVar != null) {
            kVar.f();
        }
    }

    public static /* synthetic */ void l(w1 w1Var, x2 x2Var) {
        w1Var.getClass();
        try {
            w1Var.z(x2Var);
        } catch (w e15) {
            w7.t.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e15);
            throw new RuntimeException(e15);
        }
    }

    private static boolean l0(v2 v2Var, t7.e0.b bVar) {
        h8.c0.b bVar2 = v2Var.f4650b;
        t7.e0 e0Var = v2Var.f4649a;
        return e0Var.q() || e0Var.h(bVar2.f81468a, bVar).f188141f;
    }

    private void l1(t7.z zVar) {
        this.f4684h.n(16);
        this.f4692q.i(zVar);
    }

    public static /* synthetic */ void m(w1 w1Var, m8.t tVar, long j15, long j16, t7.p pVar, MediaFormat mediaFormat) {
        w1Var.getClass();
        tVar.d(j15, j16, pVar, mediaFormat);
        w1Var.d(j15, j16, pVar, mediaFormat);
    }

    private void m0() {
        boolean zH1 = H1();
        this.f4695r0 = zH1;
        if (zH1) {
            d2 d2Var = (d2) zj.p.q(this.f4701v.n());
            d2Var.e(new b2.b().f(d2Var.C(this.f4710z0)).g(this.f4692q.d().f188663a).e(this.f4693q0).d());
        }
        Q1();
    }

    private void m1(b bVar) throws Throwable {
        this.T.b(1);
        if (bVar.f4714c != -1) {
            this.f4708y0 = new h(new y2(bVar.f4712a, bVar.f4713b), bVar.f4714c, bVar.f4715d);
        }
        a0(this.f4703w.C(bVar.f4712a, bVar.f4713b), false);
    }

    private void n0() {
        this.f4701v.I();
        d2 d2VarW = this.f4701v.w();
        if (d2VarW != null) {
            if ((!d2VarW.f4343e || d2VarW.f4344f) && !d2VarW.f4339a.b()) {
                if (this.f4682f.d(this.f4709z, this.R.f4649a, d2VarW.f4346h.f4370a, d2VarW.f4344f ? d2VarW.f4339a.d() : 0L)) {
                    if (d2VarW.f4343e) {
                        d2VarW.e(new b2.b().f(d2VarW.C(this.f4710z0)).g(this.f4692q.d().f188663a).e(this.f4693q0).d());
                    } else {
                        d2VarW.v(this, d2VarW.f4346h.f4371b);
                    }
                }
            }
        }
    }

    private void o0() {
        for (c3 c3Var : this.f4677a) {
            c3Var.D();
        }
    }

    private void o1(boolean z15) {
        if (z15 == this.f4704w0) {
            return;
        }
        this.f4704w0 = z15;
        if (z15 || !this.R.f4664p) {
            return;
        }
        this.f4684h.l(2);
    }

    private void p0() {
        this.T.c(this.R);
        if (this.T.f4724a) {
            this.f4698t.a(this.T);
            this.T = new e(this.R);
        }
    }

    private void p1(boolean z15) throws w {
        this.Y = z15;
        Q0();
        if (!this.Z || this.f4701v.y() == this.f4701v.u()) {
            return;
        }
        a1(true);
        Y(false);
    }

    private void q0() throws w {
        d2 d2VarX = this.f4701v.x();
        if (d2VarX == null) {
            return;
        }
        j8.y yVarP = d2VarX.p();
        for (int i15 = 0; i15 < this.f4677a.length; i15++) {
            if (yVarP.c(i15) && this.f4677a[i15].s() && !this.f4677a[i15].u()) {
                this.f4677a[i15].X();
                E(d2VarX, i15, false, d2VarX.n());
            }
        }
        if (w()) {
            this.I0 = d2VarX.f4339a.k();
            if (d2VarX.s()) {
                return;
            }
            this.f4701v.N(d2VarX);
            Y(false);
            m0();
        }
    }

    private void r0(int i15) {
        c3 c3Var = this.f4677a[i15];
        try {
            c3Var.G((d2) zj.p.q(this.f4701v.u()));
        } catch (IOException | RuntimeException e15) {
            int iM = c3Var.m();
            if (iM != 3 && iM != 5) {
                throw e15;
            }
            j8.y yVarP = this.f4701v.u().p();
            w7.t.d("ExoPlayerImplInternal", "Disabling track due to error: " + t7.p.h(yVarP.f100153c[i15].l()), e15);
            j8.y yVar = new j8.y((b3[]) yVarP.f100152b.clone(), (j8.r[]) yVarP.f100153c.clone(), yVarP.f100154d, yVarP.f100155e);
            yVar.f100152b[i15] = null;
            yVar.f100153c[i15] = null;
            B(i15);
            this.f4701v.u().a(yVar, this.R.f4667s, false);
        }
    }

    private void r1(boolean z15, int i15, boolean z16, int i16) {
        this.T.b(z16 ? 1 : 0);
        W1(z15, i15, i16);
    }

    private void s(b bVar, int i15) throws Throwable {
        this.T.b(1);
        u2 u2Var = this.f4703w;
        if (i15 == -1) {
            i15 = u2Var.r();
        }
        a0(u2Var.f(i15, bVar.f4712a, bVar.f4713b), false);
    }

    private void s0(final int i15, final boolean z15) {
        boolean[] zArr = this.f4679c;
        if (zArr[i15] != z15) {
            zArr[i15] = z15;
            this.C.j(new Runnable() { // from class: a8.s1
                @Override // java.lang.Runnable
                public final void run() {
                    w1 w1Var = this.f4607a;
                    int i16 = i15;
                    w1Var.B.g0(i16, w1Var.f4677a[i16].m(), z15);
                }
            });
        }
    }

    private void s1(t7.z zVar) {
        l1(zVar);
        d0(this.f4692q.d(), true);
    }

    private void t() {
        j8.y yVarP = this.f4701v.u().p();
        for (int i15 = 0; i15 < this.f4677a.length; i15++) {
            if (yVarP.c(i15)) {
                this.f4677a[i15].f();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.w1.t0(long, long):void");
    }

    private void t1(x.c cVar) {
        this.G0 = cVar;
        this.f4701v.W(this.R.f4649a, cVar);
    }

    private boolean u0() {
        e2 e2VarT;
        this.f4701v.K(this.f4710z0);
        boolean z15 = false;
        if (this.f4701v.T() && (e2VarT = this.f4701v.t(this.f4710z0, this.R)) != null) {
            d2 d2VarH = this.f4701v.h(e2VarT);
            if (!d2VarH.f4343e) {
                d2VarH.v(this, e2VarT.f4371b);
            } else if (d2VarH.f4344f) {
                this.f4684h.e(8, d2VarH.f4339a).a();
            }
            if (this.f4701v.u() == d2VarH) {
                R0(e2VarT.f4371b, true);
            }
            Y(false);
            z15 = true;
        }
        if (!this.f4695r0) {
            m0();
            return z15;
        }
        this.f4695r0 = i0(this.f4701v.n());
        Q1();
        return z15;
    }

    private void u1(int i15) throws w {
        this.f4697s0 = i15;
        int iY = this.f4701v.Y(this.R.f4649a, i15);
        if ((iY & 1) != 0) {
            a1(true);
        } else if ((iY & 2) != 0) {
            A();
        }
        Y(false);
    }

    private void v() {
        for (c3 c3Var : this.f4677a) {
            c3Var.R(this.K ? this.H : null);
        }
    }

    private void v0() {
        d2 d2VarU;
        boolean z15;
        if (this.f4701v.u() == this.f4701v.y() && (d2VarU = this.f4701v.u()) != null) {
            j8.y yVarP = d2VarU.p();
            boolean z16 = false;
            int i15 = 0;
            boolean z17 = false;
            while (true) {
                if (i15 >= this.f4677a.length) {
                    z15 = true;
                    break;
                }
                if (yVarP.c(i15)) {
                    if (this.f4677a[i15].m() != 1) {
                        z15 = false;
                        break;
                    } else if (yVarP.f100152b[i15].f4257a != 0) {
                        z17 = true;
                    }
                }
                i15++;
            }
            if (z17 && z15) {
                z16 = true;
            }
            o1(z16);
        }
    }

    private void v1(boolean z15) throws Throwable {
        if (!z15) {
            if (this.O != null && this.L && !this.f4684h.c(37)) {
                this.P++;
            }
            final int i15 = this.P;
            if (i15 > 0) {
                this.C.j(new Runnable() { // from class: a8.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4599a.B.X(i15);
                    }
                });
            }
            this.P = 0;
            this.L = false;
            this.f4684h.n(37);
            h hVar = this.O;
            if (hVar != null) {
                b1(hVar);
                this.O = null;
                this.L = false;
            }
        }
        this.K = z15;
        v();
    }

    private boolean w() {
        if (!this.D) {
            return false;
        }
        for (c3 c3Var : this.f4677a) {
            if (c3Var.u()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    private void w0() {
        boolean z15;
        boolean z16 = false;
        while (G1()) {
            if (z16) {
                p0();
            }
            this.J0 = false;
            d2 d2Var = (d2) zj.p.q(this.f4701v.b());
            if (this.R.f4650b.f81468a.equals(d2Var.f4346h.f4370a.f81468a)) {
                h8.c0.b bVar = this.R.f4650b;
                if (bVar.f81469b == -1) {
                    h8.c0.b bVar2 = d2Var.f4346h.f4370a;
                    if (bVar2.f81469b != -1 || bVar.f81472e == bVar2.f81472e) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                } else {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
            e2 e2Var = d2Var.f4346h;
            h8.c0.b bVar3 = e2Var.f4370a;
            long j15 = e2Var.f4371b;
            this.R = e0(bVar3, j15, e2Var.f4373d, j15, !z15, 0);
            Q0();
            Y1();
            if (w() && d2Var == this.f4701v.x()) {
                o0();
            }
            if (this.R.f4653e == 3) {
                M1();
            }
            t();
            z16 = true;
        }
    }

    private void x() throws w {
        O0();
    }

    private void x0(boolean z15) {
        if (this.G0.f4772a == -9223372036854775807L) {
            return;
        }
        if (z15 || !this.R.f4649a.equals(this.H0)) {
            t7.e0 e0Var = this.R.f4649a;
            this.H0 = e0Var;
            this.f4701v.B(e0Var);
        }
        n0();
    }

    private void x1(e3 e3Var) {
        this.H = e3Var;
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d2 y(e2 e2Var, long j15) {
        return new d2(this.f4678b, j15, this.f4680d, this.f4682f.k(this.f4709z), this.f4703w, e2Var, this.f4681e, this.G0.f4772a);
    }

    private void y0() throws w {
        d2 d2VarX;
        if (this.Z || !this.D || this.J0 || w() || (d2VarX = this.f4701v.x()) == null || d2VarX != this.f4701v.y() || d2VarX.k() == null || !d2VarX.k().f4344f || K(d2VarX.k()) > 10000000) {
            return;
        }
        this.f4701v.c();
        q0();
    }

    private void y1(f3 f3Var) {
        this.G = f3Var;
    }

    private void z(x2 x2Var) {
        if (x2Var.i()) {
            return;
        }
        try {
            x2Var.f().A(x2Var.h(), x2Var.d());
        } finally {
            x2Var.j(true);
        }
    }

    private void z0() {
        d2 d2VarY = this.f4701v.y();
        if (d2VarY == null) {
            return;
        }
        int i15 = 0;
        if (d2VarY.k() == null || this.Z) {
            if (d2VarY.f4346h.f4380k || this.Z) {
                c3[] c3VarArr = this.f4677a;
                int length = c3VarArr.length;
                while (i15 < length) {
                    c3 c3Var = c3VarArr[i15];
                    if (c3Var.x(d2VarY) && c3Var.r(d2VarY)) {
                        long j15 = d2VarY.f4346h.f4375f;
                        c3Var.O(d2VarY, (j15 == -9223372036854775807L || j15 == Long.MIN_VALUE) ? -9223372036854775807L : d2VarY.m() + d2VarY.f4346h.f4375f);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (f0()) {
            if (w() && this.f4701v.x() == this.f4701v.y()) {
                return;
            }
            if (d2VarY.k().f4344f || this.f4710z0 >= d2VarY.k().n()) {
                if (!d2VarY.k().f4344f || K(d2VarY.k()) <= 10000000) {
                    j8.y yVarP = d2VarY.p();
                    d2 d2VarD = this.f4701v.d();
                    j8.y yVarP2 = d2VarD.p();
                    t7.e0 e0Var = this.R.f4649a;
                    Z1(e0Var, d2VarD.f4346h.f4370a, e0Var, d2VarY.f4346h.f4370a, -9223372036854775807L, false);
                    if (d2VarD.f4344f && ((this.D && this.I0 != -9223372036854775807L) || d2VarD.f4339a.k() != -9223372036854775807L)) {
                        this.I0 = -9223372036854775807L;
                        boolean z15 = this.D && !this.J0;
                        if (z15) {
                            for (int i16 = 0; i16 < this.f4677a.length; i16++) {
                                if (yVarP2.c(i16) && this.f4677a[i16].m() != -2 && !t7.w.a(yVarP2.f100153c[i16].l().f188381p, yVarP2.f100153c[i16].l().f188376k) && !this.f4677a[i16].u()) {
                                    z15 = false;
                                    break;
                                }
                            }
                        }
                        if (!z15) {
                            h1(d2VarD.n());
                            if (d2VarD.s()) {
                                return;
                            }
                            this.f4701v.N(d2VarD);
                            Y(false);
                            m0();
                            return;
                        }
                    }
                    c3[] c3VarArr2 = this.f4677a;
                    int length2 = c3VarArr2.length;
                    while (i15 < length2) {
                        c3VarArr2[i15].F(yVarP, yVarP2, d2VarD.n());
                        i15++;
                    }
                }
            }
        }
    }

    private void z1(boolean z15) throws w {
        this.f4699t0 = z15;
        int iZ = this.f4701v.Z(this.R.f4649a, z15);
        if ((iZ & 1) != 0) {
            a1(true);
        } else if ((iZ & 2) != 0) {
            A();
        }
        Y(false);
    }

    public boolean D1(Object obj, long j15) {
        if (!this.X && this.f4687k.getThread().isAlive()) {
            w7.k kVar = new w7.k(this.f4696s);
            this.f4684h.e(30, new Pair(obj, kVar)).a();
            if (j15 != -9223372036854775807L) {
                return kVar.c(j15);
            }
        }
        return true;
    }

    @Override // h8.a1.a
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public void g(h8.b0 b0Var) {
        this.f4684h.e(9, b0Var).a();
    }

    public void H(long j15) {
        this.E0 = j15;
    }

    public void H0() {
        this.f4684h.b(29).a();
    }

    public boolean J0() {
        if (this.X || !this.f4687k.getThread().isAlive()) {
            return true;
        }
        this.X = true;
        w7.k kVar = new w7.k(this.f4696s);
        this.f4684h.e(7, kVar).a();
        return kVar.c(this.f4707y);
    }

    public void N1() {
        this.f4684h.b(6).a();
    }

    public Looper P() {
        return this.f4687k;
    }

    public void Z0(t7.e0 e0Var, int i15, long j15) {
        this.f4684h.e(3, new h(e0Var, i15, j15)).a();
    }

    @Override // j8.x.a
    public void a(z2 z2Var) {
        this.f4684h.l(26);
    }

    @Override // j8.x.a
    public void b() {
        this.f4684h.l(10);
    }

    @Override // a8.u2.d
    public void c() {
        this.f4684h.n(2);
        this.f4684h.l(22);
    }

    @Override // m8.t
    public void d(long j15, long j16, t7.p pVar, MediaFormat mediaFormat) {
        if (this.L) {
            this.f4684h.b(37).a();
        }
    }

    @Override // u7.g.a
    public void e(float f15) {
        this.f4684h.l(34);
    }

    @Override // h8.b0.a
    public void f(h8.b0 b0Var) {
        this.f4684h.e(8, b0Var).a();
    }

    @Override // u7.g.a
    public void h(int i15) {
        this.f4684h.h(33, i15, 0).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i15;
        h8.c0.b bVar;
        d2 d2VarY;
        int i16 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z15 = message.arg1 != 0;
                    int i17 = message.arg2;
                    r1(z15, i17 >> 4, true, i17 & 15);
                    break;
                case 2:
                    D();
                    break;
                case 3:
                    b1((h) message.obj);
                    break;
                case 4:
                    s1((t7.z) message.obj);
                    break;
                case 5:
                    y1((f3) message.obj);
                    break;
                case 6:
                    O1(false, true);
                    break;
                case 7:
                    K0((w7.k) message.obj);
                    return true;
                case 8:
                    b0((h8.b0) message.obj);
                    break;
                case 9:
                    W((h8.b0) message.obj);
                    break;
                case 10:
                    N0();
                    break;
                case 11:
                    u1(message.arg1);
                    break;
                case 12:
                    z1(message.arg1 != 0);
                    break;
                case 13:
                    k1(message.arg1 != 0, (w7.k) message.obj);
                    break;
                case 14:
                    e1((x2) message.obj);
                    break;
                case 15:
                    g1((x2) message.obj);
                    break;
                case 16:
                    d0((t7.z) message.obj, false);
                    break;
                case 17:
                    m1((b) message.obj);
                    break;
                case 18:
                    s((b) message.obj, message.arg1);
                    break;
                case 19:
                    C0((c) message.obj);
                    break;
                case 20:
                    M0(message.arg1, message.arg2, (h8.b1) message.obj);
                    break;
                case 21:
                    A1((h8.b1) message.obj);
                    break;
                case 22:
                    B0();
                    break;
                case 23:
                    p1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    x();
                    break;
                case 26:
                    O0();
                    break;
                case 27:
                    S1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    t1((x.c) message.obj);
                    break;
                case 29:
                    I0();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    E1(pair.first, (w7.k) pair.second);
                    break;
                case BERTags.DATE /* 31 */:
                    j1((t7.b) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    F1(((Float) message.obj).floatValue());
                    break;
                case 33:
                    U(message.arg1);
                    break;
                case 34:
                    V();
                    break;
                case 35:
                    C1((m8.t) message.obj);
                    break;
                case 36:
                    v1(((Boolean) message.obj).booleanValue());
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    this.L = false;
                    h hVar = this.O;
                    if (hVar != null) {
                        b1(hVar);
                        this.O = null;
                    }
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    x1((e3) message.obj);
                    break;
            }
        } catch (w e15) {
            e = e15;
            if (e.f4669k == 1 && (d2VarY = this.f4701v.y()) != null && e.f4674q == null) {
                e = e.a(d2VarY.f4346h.f4370a);
            }
            if (e.f4669k == 1 && (bVar = e.f4674q) != null && j0(e.f4671m, bVar)) {
                this.J0 = true;
                A();
                d2 d2VarX = this.f4701v.x();
                d2 d2VarU = this.f4701v.u();
                if (this.f4701v.u() != d2VarX) {
                    while (d2VarU != null && d2VarU.k() != d2VarX) {
                        d2VarU = d2VarU.k();
                    }
                }
                this.f4701v.N(d2VarU);
                if (this.R.f4653e != 4) {
                    m0();
                    this.f4684h.l(2);
                }
            } else {
                w wVar = this.D0;
                if (wVar != null) {
                    wVar.addSuppressed(e);
                    e = this.D0;
                }
                if (e.f4669k == 1 && this.f4701v.u() != this.f4701v.y()) {
                    while (this.f4701v.u() != this.f4701v.y()) {
                        this.f4701v.b();
                    }
                    d2 d2Var = (d2) zj.p.q(this.f4701v.u());
                    p0();
                    e2 e2Var = d2Var.f4346h;
                    h8.c0.b bVar2 = e2Var.f4370a;
                    long j15 = e2Var.f4371b;
                    this.R = e0(bVar2, j15, e2Var.f4373d, j15, true, 0);
                }
                if (e.f4675r && (this.D0 == null || (i15 = e.f188657a) == 5004 || i15 == 5003)) {
                    w7.t.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.D0 == null) {
                        this.D0 = e;
                    }
                    w7.p pVar = this.f4684h;
                    pVar.i(pVar.e(25, e));
                } else {
                    w7.t.d("ExoPlayerImplInternal", "Playback error", e);
                    O1(true, false);
                    this.R = this.R.f(e);
                }
            }
        } catch (d8.m.a e16) {
            X(e16, e16.f40306a);
        } catch (t7.x e17) {
            int i18 = e17.f188650b;
            if (i18 == 1) {
                i16 = e17.f188649a ? 3001 : 3003;
            } else if (i18 == 4) {
                i16 = e17.f188649a ? 3002 : 3004;
            }
            X(e17, i16);
        } catch (y7.g e18) {
            X(e18, e18.f224858a);
        } catch (IOException e19) {
            X(e19, 2000);
        } catch (RuntimeException e25) {
            w wVarD = w.d(e25, ((e25 instanceof IllegalStateException) || (e25 instanceof IllegalArgumentException)) ? 1004 : 1000);
            w7.t.d("ExoPlayerImplInternal", "Playback error", wVarD);
            O1(true, false);
            this.R = this.R.f(wVarD);
        }
        p0();
        return true;
    }

    @Override // a8.x2.a
    public void i(x2 x2Var) {
        if (!this.X && this.f4687k.getThread().isAlive()) {
            this.f4684h.e(14, x2Var).a();
        } else {
            w7.t.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            x2Var.j(false);
        }
    }

    public void i1(t7.b bVar, boolean z15) {
        this.f4684h.d(31, z15 ? 1 : 0, 0, bVar).a();
    }

    public void n1(List<u2.c> list, int i15, long j15, h8.b1 b1Var) {
        this.f4684h.e(17, new b(list, b1Var, i15, j15, null)).a();
    }

    public void q1(boolean z15, int i15, int i16) {
        this.f4684h.h(1, z15 ? 1 : 0, i15 | (i16 << 4)).a();
    }

    @Override // a8.i.a
    public void u(t7.z zVar) {
        this.f4684h.e(16, zVar).a();
    }

    public void w1(e3 e3Var) {
        this.f4684h.e(38, e3Var).a();
    }
}
