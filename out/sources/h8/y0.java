package h8;

import a8.y1;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class y0 implements o8.s0 {
    private boolean B;
    private t7.p C;
    private t7.p D;
    private long E;
    private boolean G;
    private long H;
    private boolean I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0 f81835a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d8.u f81838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d8.t.a f81839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f81840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t7.p f81841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d8.m f81842h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f81850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f81851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f81852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f81853s;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f81859y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f81836b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f81843i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f81844j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f81845k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f81848n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f81847m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f81846l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o8.s0.a[] f81849o = new o8.s0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f1<c> f81837c = new f1<>(new w7.l() { // from class: h8.x0
        @Override // w7.l
        public final void accept(Object obj) {
            ((y0.c) obj).f81865b.b();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f81854t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f81856v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f81857w = Long.MIN_VALUE;
    private boolean A = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f81860z = true;
    private boolean F = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f81855u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f81858x = -1;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f81862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o8.s0.a f81863c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.p f81864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d8.u.b f81865b;

        private c(t7.p pVar, d8.u.b bVar) {
            this.f81864a = pVar;
            this.f81865b = bVar;
        }
    }

    public interface d {
        void j(t7.p pVar);
    }

    protected y0(k8.b bVar, d8.u uVar, d8.t.a aVar) {
        this.f81838d = uVar;
        this.f81839e = aVar;
        this.f81835a = new w0(bVar);
    }

    private int B(int i15) {
        int i16 = this.f81852r + i15;
        int i17 = this.f81843i;
        return i16 < i17 ? i16 : i16 - i17;
    }

    private boolean F() {
        return this.f81853s != this.f81850p;
    }

    private boolean J(int i15) {
        d8.m mVar = this.f81842h;
        if (mVar == null || mVar.getState() == 4) {
            return true;
        }
        return (this.f81847m[i15] & 1073741824) == 0 && this.f81842h.b();
    }

    private void L(t7.p pVar, y1 y1Var) {
        t7.p pVar2 = this.f81841g;
        boolean z15 = pVar2 == null;
        t7.l lVar = pVar2 == null ? null : pVar2.f188385t;
        this.f81841g = pVar;
        t7.l lVar2 = pVar.f188385t;
        d8.u uVar = this.f81838d;
        y1Var.f4794b = uVar != null ? pVar.c(uVar.c(pVar)) : pVar;
        y1Var.f4793a = this.f81842h;
        if (this.f81838d == null) {
            return;
        }
        if (z15 || !Objects.equals(lVar, lVar2)) {
            d8.m mVar = this.f81842h;
            d8.m mVarF = this.f81838d.f(this.f81839e, pVar);
            this.f81842h = mVarF;
            y1Var.f4793a = mVarF;
            if (mVar != null) {
                mVar.f(this.f81839e);
            }
        }
    }

    private synchronized int M(y1 y1Var, z7.f fVar, boolean z15, boolean z16, b bVar) {
        boolean z17 = false;
        fVar.f233229e = false;
        int iA = A();
        int i15 = this.f81858x;
        if (i15 != -1 && iA >= i15) {
            z17 = true;
        }
        if (F() && !z17) {
            t7.p pVar = this.f81837c.e(iA).f81864a;
            if (!z15 && pVar == this.f81841g) {
                int iB = B(this.f81853s);
                if (!J(iB)) {
                    fVar.f233229e = true;
                    return -3;
                }
                fVar.v(this.f81847m[iB]);
                if (this.f81853s == this.f81850p - 1 && (z16 || this.f81859y)) {
                    fVar.k(PKIFailureInfo.duplicateCertReq);
                }
                fVar.f233230f = this.f81848n[iB];
                bVar.f81861a = this.f81846l[iB];
                bVar.f81862b = this.f81845k[iB];
                bVar.f81863c = this.f81849o[iB];
                return -4;
            }
            L(pVar, y1Var);
            return -5;
        }
        if (!z16 && !this.f81859y && !z17) {
            t7.p pVar2 = this.D;
            if (pVar2 == null || (!z15 && pVar2 == this.f81841g)) {
                return -3;
            }
            L((t7.p) zj.p.q(pVar2), y1Var);
            return -5;
        }
        fVar.v(4);
        fVar.f233230f = Long.MIN_VALUE;
        return -4;
    }

    private void Q() {
        d8.m mVar = this.f81842h;
        if (mVar != null) {
            mVar.f(this.f81839e);
            this.f81842h = null;
            this.f81841g = null;
        }
    }

    private synchronized void T() {
        this.f81853s = 0;
        this.f81835a.n();
    }

    private synchronized boolean Y(t7.p pVar) {
        try {
            this.A = false;
            if (Objects.equals(pVar, this.D)) {
                return false;
            }
            if (this.f81837c.g() || !this.f81837c.f().f81864a.equals(pVar)) {
                this.D = pVar;
            } else {
                this.D = this.f81837c.f().f81864a;
            }
            boolean z15 = this.F;
            t7.p pVar2 = this.D;
            this.F = z15 & j(pVar2.f188381p, pVar2.f188376k);
            this.G = false;
            return true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private synchronized boolean i(long j15) {
        if (this.f81850p == 0) {
            return j15 > this.f81856v;
        }
        if (y() >= j15) {
            return false;
        }
        s(this.f81851q + l(j15));
        return true;
    }

    private static boolean j(String str, String str2) {
        return t7.w.f(str) == 1 && t7.w.a(str, str2);
    }

    private synchronized void k(long j15, int i15, long j16, int i16, o8.s0.a aVar) {
        try {
            int i17 = this.f81850p;
            if (i17 > 0) {
                int iB = B(i17 - 1);
                zj.p.d(this.f81845k[iB] + ((long) this.f81846l[iB]) <= j16);
            }
            this.f81859y = (536870912 & i15) != 0;
            this.f81857w = Math.max(this.f81857w, j15);
            long j17 = this.f81855u;
            if (j17 != Long.MIN_VALUE && this.f81858x == -1 && j15 >= j17) {
                this.f81858x = this.f81851q + this.f81850p;
            }
            int iB2 = B(this.f81850p);
            this.f81848n[iB2] = j15;
            this.f81845k[iB2] = j16;
            this.f81846l[iB2] = i16;
            this.f81847m[iB2] = i15;
            this.f81849o[iB2] = aVar;
            this.f81844j[iB2] = this.E;
            if (this.f81837c.g() || !this.f81837c.f().f81864a.equals(this.D)) {
                t7.p pVar = (t7.p) zj.p.q(this.D);
                d8.u uVar = this.f81838d;
                this.f81837c.a(E(), new c(pVar, uVar != null ? uVar.e(this.f81839e, pVar) : d8.u.b.f40328a));
            }
            int i18 = this.f81850p + 1;
            this.f81850p = i18;
            int i19 = this.f81843i;
            if (i18 == i19) {
                int i25 = i19 + 1000;
                long[] jArr = new long[i25];
                long[] jArr2 = new long[i25];
                long[] jArr3 = new long[i25];
                int[] iArr = new int[i25];
                int[] iArr2 = new int[i25];
                o8.s0.a[] aVarArr = new o8.s0.a[i25];
                int i26 = this.f81852r;
                int i27 = i19 - i26;
                System.arraycopy(this.f81845k, i26, jArr2, 0, i27);
                System.arraycopy(this.f81848n, this.f81852r, jArr3, 0, i27);
                System.arraycopy(this.f81847m, this.f81852r, iArr, 0, i27);
                System.arraycopy(this.f81846l, this.f81852r, iArr2, 0, i27);
                System.arraycopy(this.f81849o, this.f81852r, aVarArr, 0, i27);
                System.arraycopy(this.f81844j, this.f81852r, jArr, 0, i27);
                int i28 = this.f81852r;
                System.arraycopy(this.f81845k, 0, jArr2, i27, i28);
                System.arraycopy(this.f81848n, 0, jArr3, i27, i28);
                System.arraycopy(this.f81847m, 0, iArr, i27, i28);
                System.arraycopy(this.f81846l, 0, iArr2, i27, i28);
                System.arraycopy(this.f81849o, 0, aVarArr, i27, i28);
                System.arraycopy(this.f81844j, 0, jArr, i27, i28);
                this.f81845k = jArr2;
                this.f81848n = jArr3;
                this.f81847m = iArr;
                this.f81846l = iArr2;
                this.f81849o = aVarArr;
                this.f81844j = jArr;
                this.f81852r = 0;
                this.f81843i = i25;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private int l(long j15) {
        int i15 = this.f81850p;
        int iB = B(i15 - 1);
        while (i15 > this.f81853s && this.f81848n[iB] >= j15) {
            i15--;
            iB--;
            if (iB == -1) {
                iB = this.f81843i - 1;
            }
        }
        return i15;
    }

    public static y0 m(k8.b bVar, d8.u uVar, d8.t.a aVar) {
        return new y0(bVar, (d8.u) zj.p.q(uVar), (d8.t.a) zj.p.q(aVar));
    }

    private synchronized long n(long j15, boolean z15, boolean z16) throws Throwable {
        Throwable th4;
        try {
            try {
                int i15 = this.f81850p;
                if (i15 != 0) {
                    long[] jArr = this.f81848n;
                    int i16 = this.f81852r;
                    if (j15 >= jArr[i16]) {
                        if (z16) {
                            try {
                                int i17 = this.f81853s;
                                if (i17 != i15) {
                                    i15 = i17 + 1;
                                }
                            } catch (Throwable th5) {
                                th4 = th5;
                                throw th4;
                            }
                        }
                        int iU = u(i16, i15, j15, z15);
                        if (iU == -1) {
                            return -1L;
                        }
                        return p(iU);
                    }
                }
                return -1L;
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
                throw th4;
            }
        } catch (Throwable th7) {
            th = th7;
            th4 = th;
            throw th4;
        }
    }

    private synchronized long o() {
        int i15 = this.f81850p;
        if (i15 == 0) {
            return -1L;
        }
        return p(i15);
    }

    private long p(int i15) {
        this.f81856v = Math.max(this.f81856v, z(i15));
        this.f81850p -= i15;
        int i16 = this.f81851q + i15;
        this.f81851q = i16;
        int i17 = this.f81852r + i15;
        this.f81852r = i17;
        int i18 = this.f81843i;
        if (i17 >= i18) {
            this.f81852r = i17 - i18;
        }
        int i19 = this.f81853s - i15;
        this.f81853s = i19;
        if (i19 < 0) {
            this.f81853s = 0;
        }
        this.f81837c.d(i16);
        if (this.f81850p != 0) {
            return this.f81845k[this.f81852r];
        }
        int i25 = this.f81852r;
        if (i25 == 0) {
            i25 = this.f81843i;
        }
        int i26 = i25 - 1;
        return this.f81845k[i26] + ((long) this.f81846l[i26]);
    }

    private long s(int i15) {
        int iE = E() - i15;
        boolean z15 = false;
        zj.p.d(iE >= 0 && iE <= this.f81850p - this.f81853s);
        int i16 = this.f81850p - iE;
        this.f81850p = i16;
        this.f81857w = Math.max(this.f81856v, z(i16));
        if (iE == 0 && this.f81859y) {
            z15 = true;
        }
        this.f81859y = z15;
        int i17 = this.f81858x;
        if (i17 != -1 && i15 < i17) {
            this.f81858x = -1;
        }
        this.f81837c.c(i15);
        int i18 = this.f81850p;
        if (i18 == 0) {
            return 0L;
        }
        int iB = B(i18 - 1);
        return this.f81845k[iB] + ((long) this.f81846l[iB]);
    }

    private int t(int i15, int i16, long j15, boolean z15) {
        for (int i17 = 0; i17 < i16; i17++) {
            if (this.f81848n[i15] >= j15) {
                return i17;
            }
            i15++;
            if (i15 == this.f81843i) {
                i15 = 0;
            }
        }
        if (z15) {
            return i16;
        }
        return -1;
    }

    private int u(int i15, int i16, long j15, boolean z15) {
        int i17 = -1;
        for (int i18 = 0; i18 < i16; i18++) {
            long j16 = this.f81848n[i15];
            if (j16 > j15) {
                break;
            }
            if (!z15 || (this.f81847m[i15] & 1) != 0) {
                if (j16 == j15) {
                    return i18;
                }
                i17 = i18;
            }
            i15++;
            if (i15 == this.f81843i) {
                i15 = 0;
            }
        }
        return i17;
    }

    private long z(int i15) {
        long jMax = Long.MIN_VALUE;
        if (i15 == 0) {
            return Long.MIN_VALUE;
        }
        int iB = B(i15 - 1);
        for (int i16 = 0; i16 < i15; i16++) {
            jMax = Math.max(jMax, this.f81848n[iB]);
            if ((this.f81847m[iB] & 1) != 0) {
                return jMax;
            }
            iB--;
            if (iB == -1) {
                iB = this.f81843i - 1;
            }
        }
        return jMax;
    }

    public final int A() {
        return this.f81851q + this.f81853s;
    }

    public final synchronized int C(long j15, boolean z15) throws Throwable {
        Throwable th4;
        try {
            try {
                int iB = B(this.f81853s);
                if (!F() || j15 < this.f81848n[iB]) {
                    return 0;
                }
                if (j15 <= this.f81857w || !z15) {
                    int iU = u(iB, this.f81850p - this.f81853s, j15, true);
                    if (iU == -1) {
                        return 0;
                    }
                    return iU;
                }
                try {
                    return this.f81850p - this.f81853s;
                } catch (Throwable th5) {
                    th4 = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        throw th4;
    }

    public final synchronized t7.p D() {
        return this.A ? null : this.D;
    }

    public final int E() {
        return this.f81851q + this.f81850p;
    }

    public final synchronized boolean G() {
        return this.f81858x != -1;
    }

    public final synchronized boolean H() {
        return this.f81859y;
    }

    public synchronized boolean I(boolean z15) {
        t7.p pVar;
        int iA = A();
        int i15 = this.f81858x;
        boolean z16 = true;
        if (i15 != -1 && iA >= i15) {
            return true;
        }
        if (F()) {
            if (this.f81837c.e(iA).f81864a != this.f81841g) {
                return true;
            }
            return J(B(this.f81853s));
        }
        if (!z15 && !this.f81859y && ((pVar = this.D) == null || pVar == this.f81841g)) {
            z16 = false;
        }
        return z16;
    }

    public void K() throws d8.m.a {
        d8.m mVar = this.f81842h;
        if (mVar != null && mVar.getState() == 1) {
            throw ((d8.m.a) zj.p.q(this.f81842h.c()));
        }
    }

    public void N() {
        r();
        Q();
    }

    public int O(y1 y1Var, z7.f fVar, int i15, boolean z15) {
        int iM = M(y1Var, fVar, (i15 & 2) != 0, z15, this.f81836b);
        if (iM == -4 && !fVar.p()) {
            boolean z16 = (i15 & 1) != 0;
            if ((i15 & 4) == 0) {
                if (z16) {
                    this.f81835a.e(fVar, this.f81836b);
                } else {
                    this.f81835a.l(fVar, this.f81836b);
                }
            }
            if (!z16) {
                this.f81853s++;
            }
        }
        return iM;
    }

    public void P() {
        S(true);
        Q();
    }

    public final void R() {
        S(false);
    }

    public void S(boolean z15) {
        this.f81835a.m();
        this.f81850p = 0;
        this.f81851q = 0;
        this.f81852r = 0;
        this.f81853s = 0;
        this.f81858x = -1;
        this.f81860z = true;
        this.f81854t = Long.MIN_VALUE;
        this.f81856v = Long.MIN_VALUE;
        this.f81857w = Long.MIN_VALUE;
        this.f81859y = false;
        this.f81837c.b();
        if (z15) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized boolean U(int i15) {
        T();
        int i16 = this.f81851q;
        if (i15 >= i16 && i15 <= this.f81850p + i16) {
            int i17 = this.f81858x;
            if (i17 != -1 && i15 >= i17) {
                return false;
            }
            this.f81854t = Long.MIN_VALUE;
            this.f81853s = i15 - i16;
            return true;
        }
        return false;
    }

    public final synchronized boolean V(long j15, boolean z15) throws Throwable {
        Throwable th4;
        long jMin;
        y0 y0Var;
        long j16;
        int iU;
        try {
            try {
                T();
                int iB = B(this.f81853s);
                long j17 = this.f81855u;
                if (j17 != Long.MIN_VALUE) {
                    try {
                        jMin = Math.min(this.f81857w, j17);
                    } catch (Throwable th5) {
                        th4 = th5;
                    }
                } else {
                    jMin = this.f81857w;
                }
                if (!F() || j15 < this.f81848n[iB] || (j15 > jMin && !z15)) {
                    return false;
                }
                if (this.F) {
                    y0Var = this;
                    j16 = j15;
                    iU = y0Var.t(iB, this.f81850p - this.f81853s, j16, z15);
                } else {
                    y0Var = this;
                    j16 = j15;
                    iU = y0Var.u(iB, y0Var.f81850p - y0Var.f81853s, j16, true);
                }
                if (iU == -1) {
                    return false;
                }
                y0Var.f81854t = j16;
                y0Var.f81853s += iU;
                return true;
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
            }
        } catch (Throwable th7) {
            th = th7;
            th4 = th;
        }
        throw th4;
    }

    public final synchronized void W(long j15) throws Throwable {
        Throwable th4;
        y0 y0Var;
        long j16;
        int iT;
        try {
            try {
                if (j15 == this.f81855u) {
                    return;
                }
                int i15 = -1;
                if (j15 != Long.MIN_VALUE) {
                    if (j15 <= this.f81857w) {
                        y0Var = this;
                        j16 = j15;
                        iT = y0Var.t(this.f81852r, this.f81850p, j16, false);
                    } else {
                        y0Var = this;
                        j16 = j15;
                        iT = -1;
                    }
                    if (iT != -1) {
                        i15 = y0Var.f81851q + iT;
                    }
                    y0Var.f81858x = i15;
                    y0Var.f81855u = j16;
                    return;
                }
                try {
                    this.f81858x = -1;
                    return;
                } catch (Throwable th5) {
                    th4 = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
            }
        } catch (Throwable th7) {
            th = th7;
            th4 = th;
        }
        throw th4;
    }

    public final void X(long j15) {
        this.f81854t = j15;
    }

    public final void Z(d dVar) {
        this.f81840f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void a0(int i15) {
        boolean z15;
        if (i15 >= 0) {
            try {
                if (this.f81853s + i15 <= this.f81850p) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } else {
            z15 = false;
        }
        zj.p.d(z15);
        this.f81853s += i15;
    }

    @Override // o8.s0
    public final void b(w7.c0 c0Var, int i15, int i16) {
        this.f81835a.p(c0Var, i15);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // o8.s0
    public void c(long j15, int i15, int i16, int i17, o8.s0.a aVar) {
        int i18;
        if (this.B) {
            e((t7.p) zj.p.q(this.C));
        }
        int i19 = i15 & 1;
        boolean z15 = i19 != 0;
        if (this.f81860z) {
            if (!z15) {
                return;
            } else {
                this.f81860z = false;
            }
        }
        long j16 = this.H + j15;
        if (!this.F) {
            i18 = i15;
        } else {
            if (j16 < this.f81854t) {
                return;
            }
            if (i19 == 0) {
                if (!this.G) {
                    w7.t.h("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.D);
                    this.G = true;
                }
                i18 = i15 | 1;
            } else {
                i18 = i15;
            }
        }
        if (this.I) {
            if (!z15 || !i(j16)) {
                return;
            } else {
                this.I = false;
            }
        }
        k(j16, i18, (this.f81835a.d() - ((long) i16)) - ((long) i17), i16, aVar);
    }

    @Override // o8.s0
    public final void e(t7.p pVar) {
        t7.p pVarV = v(pVar);
        this.B = false;
        this.C = pVar;
        boolean zY = Y(pVarV);
        d dVar = this.f81840f;
        if (dVar == null || !zY) {
            return;
        }
        dVar.j(pVarV);
    }

    @Override // o8.s0
    public final int g(t7.h hVar, int i15, boolean z15, int i16) {
        return this.f81835a.o(hVar, i15, z15);
    }

    public final void q(long j15, boolean z15, boolean z16) {
        this.f81835a.b(n(j15, z15, z16));
    }

    public final void r() {
        this.f81835a.b(o());
    }

    protected t7.p v(t7.p pVar) {
        return (this.H == 0 || pVar.f188386u == Long.MAX_VALUE) ? pVar : pVar.b().E0(pVar.f188386u + this.H).Q();
    }

    public final int w() {
        return this.f81851q;
    }

    public final synchronized long x() {
        return this.f81857w;
    }

    public final synchronized long y() {
        return Math.max(this.f81856v, z(this.f81853s));
    }
}
