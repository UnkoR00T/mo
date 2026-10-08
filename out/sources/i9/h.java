package i9;

import ak.n0;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import o8.e0;
import o8.l0;
import o8.p0;
import o8.s0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.c0;
import w7.k0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class h implements o8.p {

    @Deprecated
    public static final o8.u P = new o8.u() { // from class: i9.f
        @Override // o8.u
        public final o8.p[] f() {
            return h.h();
        }
    };
    private static final byte[] Q = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final t7.p R = new t7.p.b().A0("application/x-emsg").Q();
    private long A;
    private long B;
    private long C;
    private b D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private o8.r J;
    private s0[] K;
    private s0[] L;
    private boolean M;
    private boolean N;
    private long O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l9.s.a f90390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f90391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f90392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<t7.p> f90393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b> f90394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f90395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f90396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f90397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f90398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c0 f90399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k0 f90400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final z8.c f90401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c0 f90402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque<x7.d.b> f90403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque<a> f90404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x7.k f90405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s0 f90406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o8.h f90407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private n0<p0> f90408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f90409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f90410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f90411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f90412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c0 f90413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f90414y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f90415z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f90416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f90418c;

        public a(long j15, boolean z15, int i15) {
            this.f90416a = j15;
            this.f90417b = z15;
            this.f90418c = i15;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f90419a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z f90422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f90423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f90424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f90425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f90426h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f90427i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final t7.p f90428j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f90431m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f90420b = new y();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0 f90421c = new c0();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final c0 f90429k = new c0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final c0 f90430l = new c0();

        public b(s0 s0Var, z zVar, c cVar, t7.p pVar) {
            this.f90419a = s0Var;
            this.f90422d = zVar;
            this.f90423e = cVar;
            this.f90428j = pVar;
            j(zVar, cVar);
        }

        public int c() {
            int i15;
            if (this.f90431m) {
                i15 = this.f90420b.f90511k[this.f90424f] ? 1 : 0;
            } else {
                i15 = this.f90422d.f90525g[this.f90424f];
            }
            return g() != null ? i15 | 1073741824 : i15;
        }

        public long d() {
            return !this.f90431m ? this.f90422d.f90521c[this.f90424f] : this.f90420b.f90507g[this.f90426h];
        }

        public long e() {
            return !this.f90431m ? this.f90422d.f90524f[this.f90424f] : this.f90420b.c(this.f90424f);
        }

        public int f() {
            return !this.f90431m ? this.f90422d.f90522d[this.f90424f] : this.f90420b.f90509i[this.f90424f];
        }

        public x g() {
            if (!this.f90431m) {
                return null;
            }
            int i15 = ((c) o0.h(this.f90420b.f90501a)).f90377a;
            x xVarB = this.f90420b.f90514n;
            if (xVarB == null) {
                xVarB = this.f90422d.f90519a.b(i15);
            }
            if (xVarB == null || !xVarB.f90496a) {
                return null;
            }
            return xVarB;
        }

        public boolean h() {
            this.f90424f++;
            if (!this.f90431m) {
                return false;
            }
            int i15 = this.f90425g + 1;
            this.f90425g = i15;
            int[] iArr = this.f90420b.f90508h;
            int i16 = this.f90426h;
            if (i15 != iArr[i16]) {
                return true;
            }
            this.f90426h = i16 + 1;
            this.f90425g = 0;
            return false;
        }

        public int i(int i15, int i16) {
            c0 c0Var;
            x xVarG = g();
            if (xVarG == null) {
                return 0;
            }
            int length = xVarG.f90499d;
            if (length != 0) {
                c0Var = this.f90420b.f90515o;
            } else {
                byte[] bArr = (byte[]) o0.h(xVarG.f90500e);
                this.f90430l.d0(bArr, bArr.length);
                c0 c0Var2 = this.f90430l;
                length = bArr.length;
                c0Var = c0Var2;
            }
            boolean zG = this.f90420b.g(this.f90424f);
            boolean z15 = zG || i16 != 0;
            this.f90429k.f()[0] = (byte) ((z15 ? 128 : 0) | length);
            this.f90429k.f0(0);
            this.f90419a.b(this.f90429k, 1, 1);
            this.f90419a.b(c0Var, length, 1);
            if (!z15) {
                return length + 1;
            }
            if (!zG) {
                this.f90421c.b0(8);
                byte[] bArrF = this.f90421c.f();
                bArrF[0] = 0;
                bArrF[1] = 1;
                bArrF[2] = (byte) ((i16 >> 8) & GF2Field.MASK);
                bArrF[3] = (byte) (i16 & GF2Field.MASK);
                bArrF[4] = (byte) ((i15 >> 24) & GF2Field.MASK);
                bArrF[5] = (byte) ((i15 >> 16) & GF2Field.MASK);
                bArrF[6] = (byte) ((i15 >> 8) & GF2Field.MASK);
                bArrF[7] = (byte) (i15 & GF2Field.MASK);
                this.f90419a.b(this.f90421c, 8, 1);
                return length + 9;
            }
            c0 c0Var3 = this.f90420b.f90515o;
            int iY = c0Var3.Y();
            c0Var3.g0(-2);
            int i17 = (iY * 6) + 2;
            if (i16 != 0) {
                this.f90421c.b0(i17);
                byte[] bArrF2 = this.f90421c.f();
                c0Var3.u(bArrF2, 0, i17);
                int i18 = (((bArrF2[2] & 255) << 8) | (bArrF2[3] & 255)) + i16;
                bArrF2[2] = (byte) ((i18 >> 8) & GF2Field.MASK);
                bArrF2[3] = (byte) (i18 & GF2Field.MASK);
                c0Var3 = this.f90421c;
            }
            this.f90419a.b(c0Var3, i17, 1);
            return length + 1 + i17;
        }

        public void j(z zVar, c cVar) {
            this.f90422d = zVar;
            this.f90423e = cVar;
            this.f90419a.e(this.f90428j);
            k();
        }

        public void k() {
            this.f90420b.f();
            this.f90424f = 0;
            this.f90426h = 0;
            this.f90425g = 0;
            this.f90427i = 0;
            this.f90431m = false;
        }

        public void l(long j15) {
            int i15 = this.f90424f;
            while (true) {
                y yVar = this.f90420b;
                if (i15 >= yVar.f90506f || yVar.c(i15) > j15) {
                    return;
                }
                if (this.f90420b.f90511k[i15]) {
                    this.f90427i = i15;
                }
                i15++;
            }
        }

        public void m() {
            x xVarG = g();
            if (xVarG == null) {
                return;
            }
            c0 c0Var = this.f90420b.f90515o;
            int i15 = xVarG.f90499d;
            if (i15 != 0) {
                c0Var.g0(i15);
            }
            if (this.f90420b.g(this.f90424f)) {
                c0Var.g0(c0Var.Y() * 6);
            }
        }

        public void n(t7.l lVar) {
            x xVarB = this.f90422d.f90519a.b(((c) o0.h(this.f90420b.f90501a)).f90377a);
            this.f90419a.e(this.f90428j.b().d0(lVar.b(xVarB != null ? xVarB.f90497b : null)).Q());
        }
    }

    public h(l9.s.a aVar, int i15) {
        this(aVar, i15, null, null, n0.C(), null);
    }

    private void A(long j15) {
        while (!this.f90404o.isEmpty()) {
            a aVarRemoveFirst = this.f90404o.removeFirst();
            this.f90415z -= aVarRemoveFirst.f90418c;
            long jA = aVarRemoveFirst.f90416a;
            if (aVarRemoveFirst.f90417b) {
                jA += j15;
            }
            k0 k0Var = this.f90400k;
            if (k0Var != null) {
                jA = k0Var.a(jA);
            }
            long j16 = jA;
            for (s0 s0Var : this.K) {
                s0Var.c(j16, 1, aVarRemoveFirst.f90418c, this.f90415z, null);
            }
        }
    }

    private static long B(c0 c0Var) {
        c0Var.f0(8);
        return i9.b.q(c0Var.z()) == 0 ? c0Var.S() : c0Var.X();
    }

    private static void C(x7.d.b bVar, SparseArray<b> sparseArray, boolean z15, int i15, byte[] bArr) throws t7.x {
        int size = bVar.f217153d.size();
        for (int i16 = 0; i16 < size; i16++) {
            x7.d.b bVar2 = bVar.f217153d.get(i16);
            if (bVar2.f217150a == 1953653094) {
                L(bVar2, sparseArray, z15, i15, bArr);
            }
        }
    }

    private static void D(c0 c0Var, y yVar) throws t7.x {
        c0Var.f0(8);
        int iZ = c0Var.z();
        if ((i9.b.p(iZ) & 1) == 1) {
            c0Var.g0(8);
        }
        int iU = c0Var.U();
        if (iU == 1) {
            yVar.f90504d += i9.b.q(iZ) == 0 ? c0Var.S() : c0Var.X();
        } else {
            throw t7.x.a("Unexpected saio entry count: " + iU, null);
        }
    }

    private static void E(x xVar, c0 c0Var, y yVar) throws t7.x {
        int i15;
        int i16 = xVar.f90499d;
        c0Var.f0(8);
        if ((i9.b.p(c0Var.z()) & 1) == 1) {
            c0Var.g0(8);
        }
        int iQ = c0Var.Q();
        int iU = c0Var.U();
        if (iU > yVar.f90506f) {
            throw t7.x.a("Saiz sample count " + iU + " is greater than fragment sample count" + yVar.f90506f, null);
        }
        if (iQ == 0) {
            boolean[] zArr = yVar.f90513m;
            i15 = 0;
            for (int i17 = 0; i17 < iU; i17++) {
                int iQ2 = c0Var.Q();
                i15 += iQ2;
                zArr[i17] = iQ2 > i16;
            }
        } else {
            i15 = iQ * iU;
            Arrays.fill(yVar.f90513m, 0, iU, iQ > i16);
        }
        Arrays.fill(yVar.f90513m, iU, yVar.f90506f, false);
        if (i15 > 0) {
            yVar.d(i15);
        }
    }

    private static void F(x7.d.b bVar, String str, y yVar) throws t7.x {
        byte[] bArr = null;
        c0 c0Var = null;
        c0 c0Var2 = null;
        for (int i15 = 0; i15 < bVar.f217152c.size(); i15++) {
            x7.d.c cVar = bVar.f217152c.get(i15);
            c0 c0Var3 = cVar.f217154b;
            int i16 = cVar.f217150a;
            if (i16 == 1935828848) {
                c0Var3.f0(12);
                if (c0Var3.z() == 1936025959) {
                    c0Var = c0Var3;
                }
            } else if (i16 == 1936158820) {
                c0Var3.f0(12);
                if (c0Var3.z() == 1936025959) {
                    c0Var2 = c0Var3;
                }
            }
        }
        if (c0Var == null || c0Var2 == null) {
            return;
        }
        c0Var.f0(8);
        int iQ = i9.b.q(c0Var.z());
        c0Var.g0(4);
        if (iQ == 1) {
            c0Var.g0(4);
        }
        if (c0Var.z() != 1) {
            throw t7.x.c("Entry count in sbgp != 1 (unsupported).");
        }
        c0Var2.f0(8);
        int iQ2 = i9.b.q(c0Var2.z());
        c0Var2.g0(4);
        if (iQ2 == 1) {
            if (c0Var2.S() == 0) {
                throw t7.x.c("Variable length description in sgpd found (unsupported)");
            }
        } else if (iQ2 >= 2) {
            c0Var2.g0(4);
        }
        if (c0Var2.S() != 1) {
            throw t7.x.c("Entry count in sgpd != 1 (unsupported).");
        }
        c0Var2.g0(1);
        int iQ3 = c0Var2.Q();
        int i17 = (iQ3 & 240) >> 4;
        int i18 = iQ3 & 15;
        boolean z15 = c0Var2.Q() == 1;
        if (z15) {
            int iQ4 = c0Var2.Q();
            byte[] bArr2 = new byte[16];
            c0Var2.u(bArr2, 0, 16);
            if (iQ4 == 0) {
                int iQ5 = c0Var2.Q();
                bArr = new byte[iQ5];
                c0Var2.u(bArr, 0, iQ5);
            }
            yVar.f90512l = true;
            yVar.f90514n = new x(z15, str, iQ4, bArr2, i17, i18, bArr);
        }
    }

    private static void G(c0 c0Var, int i15, y yVar) throws t7.x {
        c0Var.f0(i15 + 8);
        int iP = i9.b.p(c0Var.z());
        if ((iP & 1) != 0) {
            throw t7.x.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z15 = (iP & 2) != 0;
        int iU = c0Var.U();
        if (iU == 0) {
            Arrays.fill(yVar.f90513m, 0, yVar.f90506f, false);
            return;
        }
        if (iU == yVar.f90506f) {
            Arrays.fill(yVar.f90513m, 0, iU, z15);
            yVar.d(c0Var.a());
            yVar.b(c0Var);
        } else {
            throw t7.x.a("Senc sample count " + iU + " is different from fragment sample count" + yVar.f90506f, null);
        }
    }

    private static void H(c0 c0Var, y yVar) throws t7.x {
        G(c0Var, 0, yVar);
    }

    private static Pair<Long, o8.g> I(c0 c0Var, long j15) throws t7.x {
        long jX;
        long jX2;
        c0Var.f0(8);
        int iQ = i9.b.q(c0Var.z());
        c0Var.g0(4);
        long jS = c0Var.S();
        if (iQ == 0) {
            jX = c0Var.S();
            jX2 = c0Var.S();
        } else {
            jX = c0Var.X();
            jX2 = c0Var.X();
        }
        long j16 = j15 + jX2;
        long jU0 = o0.U0(jX, 1000000L, jS);
        c0Var.g0(2);
        int iY = c0Var.Y();
        int[] iArr = new int[iY];
        long[] jArr = new long[iY];
        long[] jArr2 = new long[iY];
        long[] jArr3 = new long[iY];
        long j17 = j16;
        long jU1 = jU0;
        int i15 = 0;
        while (i15 < iY) {
            int iZ = c0Var.z();
            if ((Integer.MIN_VALUE & iZ) != 0) {
                throw t7.x.a("Unhandled indirect reference", null);
            }
            long jS2 = c0Var.S();
            iArr[i15] = iZ & Integer.MAX_VALUE;
            jArr[i15] = j17;
            jArr3[i15] = jU1;
            jX += jS2;
            long[] jArr4 = jArr3;
            jU1 = o0.U0(jX, 1000000L, jS);
            jArr2[i15] = jU1 - jArr4[i15];
            c0Var.g0(4);
            j17 += (long) iArr[i15];
            i15++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jU0), new o8.g(iArr, jArr, jArr2, jArr3));
    }

    private static long J(c0 c0Var) {
        c0Var.f0(8);
        return i9.b.q(c0Var.z()) == 1 ? c0Var.X() : c0Var.S();
    }

    private static b K(c0 c0Var, SparseArray<b> sparseArray, boolean z15) {
        c0Var.f0(8);
        int iP = i9.b.p(c0Var.z());
        b bVarValueAt = z15 ? sparseArray.valueAt(0) : sparseArray.get(c0Var.z());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iP & 1) != 0) {
            long jX = c0Var.X();
            y yVar = bVarValueAt.f90420b;
            yVar.f90503c = jX;
            yVar.f90504d = jX;
        }
        c cVar = bVarValueAt.f90423e;
        bVarValueAt.f90420b.f90501a = new c((iP & 2) != 0 ? c0Var.z() - 1 : cVar.f90377a, (iP & 8) != 0 ? c0Var.z() : cVar.f90378b, (iP & 16) != 0 ? c0Var.z() : cVar.f90379c, (iP & 32) != 0 ? c0Var.z() : cVar.f90380d);
        return bVarValueAt;
    }

    private static void L(x7.d.b bVar, SparseArray<b> sparseArray, boolean z15, int i15, byte[] bArr) throws t7.x {
        b bVarK = K(((x7.d.c) zj.p.q(bVar.e(1952868452))).f217154b, sparseArray, z15);
        if (bVarK == null) {
            return;
        }
        y yVar = bVarK.f90420b;
        long j15 = yVar.f90517q;
        boolean z16 = yVar.f90518r;
        bVarK.k();
        bVarK.f90431m = true;
        x7.d.c cVarE = bVar.e(1952867444);
        if (cVarE == null || (i15 & 2) != 0) {
            yVar.f90517q = j15;
            yVar.f90518r = z16;
        } else {
            yVar.f90517q = J(cVarE.f217154b);
            yVar.f90518r = true;
        }
        O(bVar, bVarK, i15);
        x xVarB = bVarK.f90422d.f90519a.b(((c) zj.p.q(yVar.f90501a)).f90377a);
        x7.d.c cVarE2 = bVar.e(1935763834);
        if (cVarE2 != null) {
            E((x) zj.p.q(xVarB), cVarE2.f217154b, yVar);
        }
        x7.d.c cVarE3 = bVar.e(1935763823);
        if (cVarE3 != null) {
            D(cVarE3.f217154b, yVar);
        }
        x7.d.c cVarE4 = bVar.e(1936027235);
        if (cVarE4 != null) {
            H(cVarE4.f217154b, yVar);
        }
        F(bVar, xVarB != null ? xVarB.f90497b : null, yVar);
        int size = bVar.f217152c.size();
        for (int i16 = 0; i16 < size; i16++) {
            x7.d.c cVar = bVar.f217152c.get(i16);
            if (cVar.f217150a == 1970628964) {
                P(cVar.f217154b, yVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> M(c0 c0Var) {
        c0Var.f0(12);
        return Pair.create(Integer.valueOf(c0Var.z()), new c(c0Var.z() - 1, c0Var.z(), c0Var.z(), c0Var.z()));
    }

    private static int N(b bVar, int i15, int i16, c0 c0Var, int i17) throws t7.x {
        int iZ;
        c0Var.f0(8);
        int iP = i9.b.p(c0Var.z());
        w wVar = bVar.f90422d.f90519a;
        y yVar = bVar.f90420b;
        c cVar = (c) o0.h(yVar.f90501a);
        yVar.f90508h[i15] = c0Var.U();
        long[] jArr = yVar.f90507g;
        long j15 = yVar.f90503c;
        jArr[i15] = j15;
        if ((iP & 1) != 0) {
            jArr[i15] = j15 + ((long) c0Var.z());
        }
        boolean z15 = (iP & 4) != 0;
        int iZ2 = cVar.f90380d;
        if (z15) {
            iZ2 = c0Var.z();
        }
        boolean z16 = (iP & 256) != 0;
        boolean z17 = (iP & 512) != 0;
        boolean z18 = (iP & 1024) != 0;
        boolean z19 = (iP & 2048) != 0;
        long j16 = s(wVar) ? ((long[]) o0.h(wVar.f90493j))[0] : 0L;
        int[] iArr = yVar.f90509i;
        long[] jArr2 = yVar.f90510j;
        boolean[] zArr = yVar.f90511k;
        boolean z25 = z19;
        boolean z26 = wVar.f90485b == 2 && (i16 & 1) != 0;
        int i18 = i17 + yVar.f90508h[i15];
        boolean z27 = z15;
        long j17 = wVar.f90486c;
        long j18 = yVar.f90517q;
        int i19 = i17;
        while (i19 < i18) {
            int iK = k(z16 ? c0Var.z() : cVar.f90378b);
            int iK2 = k(z17 ? c0Var.z() : cVar.f90379c);
            if (z18) {
                iZ = c0Var.z();
            } else {
                iZ = (i19 == 0 && z27) ? iZ2 : cVar.f90380d;
            }
            int i25 = i19;
            long jU0 = o0.U0((((long) (z25 ? c0Var.z() : 0)) + j18) - j16, 1000000L, j17);
            jArr2[i25] = jU0;
            if (!yVar.f90518r) {
                jArr2[i25] = jU0 + bVar.f90422d.f90527i;
            }
            iArr[i25] = iK2;
            zArr[i25] = ((iZ >> 16) & 1) == 0 && (!z26 || i25 == 0);
            j18 += (long) iK;
            i19 = i25 + 1;
            i18 = i18;
            z26 = z26;
        }
        int i26 = i18;
        yVar.f90517q = j18;
        return i26;
    }

    private static void O(x7.d.b bVar, b bVar2, int i15) throws t7.x {
        List<x7.d.c> list = bVar.f217152c;
        int size = list.size();
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            x7.d.c cVar = list.get(i18);
            if (cVar.f217150a == 1953658222) {
                c0 c0Var = cVar.f217154b;
                c0Var.f0(12);
                int iU = c0Var.U();
                if (iU > 0) {
                    i17 += iU;
                    i16++;
                }
            }
        }
        bVar2.f90426h = 0;
        bVar2.f90425g = 0;
        bVar2.f90424f = 0;
        bVar2.f90420b.e(i16, i17);
        int i19 = 0;
        int iN = 0;
        for (int i25 = 0; i25 < size; i25++) {
            x7.d.c cVar2 = list.get(i25);
            if (cVar2.f217150a == 1953658222) {
                iN = N(bVar2, i19, i15, cVar2.f217154b, iN);
                i19++;
            }
        }
    }

    private static void P(c0 c0Var, y yVar, byte[] bArr) throws t7.x {
        c0Var.f0(8);
        c0Var.u(bArr, 0, 16);
        if (Arrays.equals(bArr, Q)) {
            G(c0Var, 16, yVar);
        }
    }

    private void Q(long j15) throws t7.x {
        while (!this.f90403n.isEmpty() && this.f90403n.peek().f217151b == j15) {
            v(this.f90403n.pop());
        }
        m();
    }

    private boolean R(o8.q qVar) throws t7.x {
        if (this.f90412w == 0) {
            if (!qVar.h(this.f90402m.f(), 0, 8, true)) {
                return false;
            }
            this.f90412w = 8;
            this.f90402m.f0(0);
            this.f90411v = this.f90402m.S();
            this.f90410u = this.f90402m.z();
        }
        long j15 = this.f90411v;
        if (j15 == 1) {
            qVar.readFully(this.f90402m.f(), 8, 8);
            this.f90412w += 8;
            this.f90411v = this.f90402m.X();
        } else if (j15 == 0) {
            long jA = qVar.a();
            if (jA == -1 && !this.f90403n.isEmpty()) {
                jA = this.f90403n.peek().f217151b;
            }
            if (jA != -1) {
                this.f90411v = (jA - qVar.getPosition()) + ((long) this.f90412w);
            }
        }
        long j16 = this.f90411v;
        int i15 = this.f90412w;
        if (j16 < i15) {
            if (this.f90410u != 1718773093 || i15 != 8) {
                throw t7.x.c("Atom size less than header length (unsupported).");
            }
            this.f90411v = i15;
        }
        if (this.O != -1) {
            if (this.f90410u == 1936286840) {
                this.f90399j.b0((int) this.f90411v);
                System.arraycopy(this.f90402m.f(), 0, this.f90399j.f(), 0, 8);
                qVar.readFully(this.f90399j.f(), 8, (int) (this.f90411v - ((long) this.f90412w)));
                this.f90407r.a((o8.g) I(new x7.d.c(1936286840, this.f90399j).f217154b, qVar.j()).second);
            } else {
                qVar.d((int) (this.f90411v - ((long) i15)), true);
            }
            m();
            return true;
        }
        long position = qVar.getPosition() - ((long) this.f90412w);
        int i16 = this.f90410u;
        if ((i16 == 1836019558 || i16 == 1835295092) && !this.M) {
            this.J.f(new l0.b(this.B, position));
            this.M = true;
        }
        if (this.f90410u == 1836019558) {
            int size = this.f90394e.size();
            for (int i17 = 0; i17 < size; i17++) {
                y yVar = this.f90394e.valueAt(i17).f90420b;
                yVar.f90502b = position;
                yVar.f90504d = position;
                yVar.f90503c = position;
            }
        }
        int i18 = this.f90410u;
        if (i18 == 1835295092) {
            this.D = null;
            this.f90414y = position + this.f90411v;
            this.f90409t = 2;
            return true;
        }
        if (V(i18)) {
            long position2 = qVar.getPosition();
            long j17 = this.f90411v;
            long j18 = (position2 + j17) - 8;
            if (j17 != this.f90412w && this.f90410u == 1835365473) {
                t(qVar);
            }
            this.f90403n.push(new x7.d.b(this.f90410u, j18));
            if (this.f90411v == this.f90412w) {
                Q(j18);
            } else {
                m();
            }
        } else if (W(this.f90410u)) {
            if (this.f90412w != 8) {
                throw t7.x.c("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f90411v > 2147483647L) {
                throw t7.x.c("Leaf atom with length > 2147483647 (unsupported).");
            }
            c0 c0Var = new c0((int) this.f90411v);
            System.arraycopy(this.f90402m.f(), 0, c0Var.f(), 0, 8);
            this.f90413x = c0Var;
            this.f90409t = 1;
        } else {
            if (this.f90411v > 2147483647L) {
                throw t7.x.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f90413x = null;
            this.f90409t = 1;
        }
        return true;
    }

    private void S(o8.q qVar) throws t7.x {
        int i15 = (int) (this.f90411v - ((long) this.f90412w));
        c0 c0Var = this.f90413x;
        if (c0Var != null) {
            qVar.readFully(c0Var.f(), 8, i15);
            x(new x7.d.c(this.f90410u, c0Var), qVar);
        } else {
            qVar.n(i15);
        }
        Q(qVar.getPosition());
    }

    private void T(o8.q qVar) throws t7.x {
        int size = this.f90394e.size();
        long j15 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i15 = 0; i15 < size; i15++) {
            y yVar = this.f90394e.valueAt(i15).f90420b;
            if (yVar.f90516p) {
                long j16 = yVar.f90504d;
                if (j16 < j15) {
                    bVarValueAt = this.f90394e.valueAt(i15);
                    j15 = j16;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f90409t = 3;
            return;
        }
        int position = (int) (j15 - qVar.getPosition());
        if (position < 0) {
            throw t7.x.a("Offset to encryption data was negative.", null);
        }
        qVar.n(position);
        bVarValueAt.f90420b.a(qVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    private boolean U(o8.q qVar) throws t7.x {
        int iF;
        int iP;
        b bVarP = this.D;
        if (bVarP == null) {
            bVarP = p(this.f90394e);
            if (bVarP == null) {
                int position = (int) (this.f90414y - qVar.getPosition());
                if (position < 0) {
                    throw t7.x.a("Offset to end of mdat was negative.", null);
                }
                qVar.n(position);
                m();
                return false;
            }
            int iD = (int) (bVarP.d() - qVar.getPosition());
            if (iD < 0) {
                w7.t.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            qVar.n(iD);
            this.D = bVarP;
        }
        if (this.f90409t == 3) {
            this.E = bVarP.f();
            this.H = !j(bVarP.f90422d.f90519a.f90490g);
            if (bVarP.f90424f < bVarP.f90427i) {
                qVar.n(this.E);
                bVarP.m();
                if (!bVarP.h()) {
                    this.D = null;
                }
                this.f90409t = 3;
                return true;
            }
            if (bVarP.f90422d.f90519a.f90491h == 1) {
                this.E -= 8;
                qVar.n(8);
            }
            if ("audio/ac4".equals(bVarP.f90422d.f90519a.f90490g.f188381p)) {
                this.F = bVarP.i(this.E, 7);
                o8.c.b(this.E, this.f90399j);
                bVarP.f90419a.a(this.f90399j, 7);
                this.F += 7;
            } else {
                this.F = bVarP.i(this.E, 0);
            }
            this.E += this.F;
            this.f90409t = 4;
            this.G = 0;
        }
        w wVar = bVarP.f90422d.f90519a;
        s0 s0Var = bVarP.f90419a;
        long jE = bVarP.e();
        k0 k0Var = this.f90400k;
        if (k0Var != null) {
            jE = k0Var.a(jE);
        }
        if (wVar.f90494k == 0) {
            while (true) {
                int i15 = this.F;
                int i16 = this.E;
                if (i15 >= i16) {
                    break;
                }
                this.F += s0Var.f(qVar, i16 - i15, false);
            }
        } else {
            byte[] bArrF = this.f90396g.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i17 = 4 - wVar.f90494k;
            while (this.F < this.E) {
                int i18 = this.G;
                if (i18 == 0) {
                    if (this.L.length > 0 || !this.H) {
                        iP = x7.g.p(wVar.f90490g);
                        if (wVar.f90494k + iP > this.E - this.F) {
                            iP = 0;
                        }
                    } else {
                        iP = 0;
                    }
                    qVar.readFully(bArrF, i17, wVar.f90494k + iP);
                    this.f90396g.f0(0);
                    int iZ = this.f90396g.z();
                    if (iZ < 0) {
                        throw t7.x.a("Invalid NAL length", null);
                    }
                    this.G = iZ - iP;
                    this.f90395f.f0(0);
                    s0Var.a(this.f90395f, 4);
                    this.F += 4;
                    this.E += i17;
                    this.I = this.L.length > 0 && iP > 0 && x7.g.o(wVar.f90490g, bArrF, 4);
                    s0Var.a(this.f90396g, iP);
                    this.F += iP;
                    if (iP > 0 && !this.H && x7.g.l(bArrF, 4, iP, wVar.f90490g)) {
                        this.H = true;
                    }
                } else {
                    if (this.I) {
                        this.f90397h.b0(i18);
                        qVar.readFully(this.f90397h.f(), 0, this.G);
                        s0Var.a(this.f90397h, this.G);
                        iF = this.G;
                        int iM = x7.g.M(this.f90397h.f(), this.f90397h.j());
                        this.f90397h.f0(0);
                        this.f90397h.e0(iM);
                        if (wVar.f90490g.f188383r != -1) {
                            int iF2 = this.f90405p.f();
                            int i19 = wVar.f90490g.f188383r;
                            if (iF2 != i19) {
                                this.f90405p.g(i19);
                            }
                        } else if (this.f90405p.f() != 0) {
                            this.f90405p.g(0);
                        }
                        this.f90405p.a(jE, this.f90397h);
                        if ((bVarP.c() & 4) != 0) {
                            this.f90405p.d();
                        }
                    } else {
                        iF = s0Var.f(qVar, i18, false);
                    }
                    this.F += iF;
                    this.G -= iF;
                }
            }
        }
        int iC = bVarP.c();
        if (!this.H) {
            iC |= 67108864;
        }
        int i25 = iC;
        x xVarG = bVarP.g();
        s0Var.c(jE, i25, this.E, 0, xVarG != null ? xVarG.f90498c : null);
        A(jE);
        if (!bVarP.h()) {
            this.D = null;
        }
        this.f90409t = 3;
        return true;
    }

    private static boolean V(int i15) {
        return i15 == 1836019574 || i15 == 1953653099 || i15 == 1835297121 || i15 == 1835626086 || i15 == 1937007212 || i15 == 1836019558 || i15 == 1953653094 || i15 == 1836475768 || i15 == 1701082227 || i15 == 1835365473;
    }

    private static boolean W(int i15) {
        return i15 == 1751411826 || i15 == 1835296868 || i15 == 1836476516 || i15 == 1936286840 || i15 == 1937011556 || i15 == 1937011827 || i15 == 1668576371 || i15 == 1937011555 || i15 == 1937011578 || i15 == 1937013298 || i15 == 1937007471 || i15 == 1668232756 || i15 == 1937011571 || i15 == 1952867444 || i15 == 1952868452 || i15 == 1953196132 || i15 == 1953654136 || i15 == 1953658222 || i15 == 1886614376 || i15 == 1935763834 || i15 == 1935763823 || i15 == 1936027235 || i15 == 1970628964 || i15 == 1935828848 || i15 == 1936158820 || i15 == 1701606260 || i15 == 1835362404 || i15 == 1701671783 || i15 == 1969517665 || i15 == 1801812339 || i15 == 1768715124;
    }

    public static /* synthetic */ o8.p[] h() {
        return new o8.p[]{new h(l9.s.a.f117245a, 32)};
    }

    private boolean j(t7.p pVar) {
        if (Objects.equals(pVar.f188381p, "video/avc")) {
            return (this.f90391b & 64) != 0;
        }
        return Objects.equals(pVar.f188381p, "video/hevc") && (this.f90391b & 128) != 0;
    }

    private static int k(int i15) throws t7.x {
        if (i15 >= 0) {
            return i15;
        }
        throw t7.x.a("Unexpected negative value: " + i15, null);
    }

    public static int l(int i15) {
        int i16 = (i15 & 1) != 0 ? 64 : 0;
        return (i15 & 2) != 0 ? i16 | 128 : i16;
    }

    private void m() {
        this.f90409t = 0;
        this.f90412w = 0;
    }

    private c n(SparseArray<c> sparseArray, int i15) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) zj.p.q(sparseArray.get(i15));
    }

    private static t7.l o(List<x7.d.c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i15 = 0; i15 < size; i15++) {
            x7.d.c cVar = list.get(i15);
            if (cVar.f217150a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrF = cVar.f217154b.f();
                UUID uuidF = s.f(bArrF);
                if (uuidF == null) {
                    w7.t.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new t7.l.b(uuidF, "video/mp4", bArrF));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new t7.l(arrayList);
    }

    private static b p(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j15 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < size; i15++) {
            b bVarValueAt = sparseArray.valueAt(i15);
            if ((bVarValueAt.f90431m || bVarValueAt.f90424f != bVarValueAt.f90422d.f90520b) && (!bVarValueAt.f90431m || bVarValueAt.f90426h != bVarValueAt.f90420b.f90505e)) {
                long jD = bVarValueAt.d();
                if (jD < j15) {
                    bVar = bVarValueAt;
                    j15 = jD;
                }
            }
        }
        return bVar;
    }

    private void r() {
        int i15;
        s0[] s0VarArr = new s0[2];
        this.K = s0VarArr;
        s0 s0Var = this.f90406q;
        int i16 = 0;
        if (s0Var != null) {
            s0VarArr[0] = s0Var;
            i15 = 1;
        } else {
            i15 = 0;
        }
        int i17 = 100;
        if ((this.f90391b & 4) != 0) {
            s0VarArr[i15] = this.J.v(100, 5);
            i17 = 101;
            i15++;
        }
        s0[] s0VarArr2 = (s0[]) o0.O0(this.K, i15);
        this.K = s0VarArr2;
        for (s0 s0Var2 : s0VarArr2) {
            s0Var2.e(R);
        }
        this.L = new s0[this.f90393d.size()];
        while (i16 < this.L.length) {
            s0 s0VarV = this.J.v(i17, 3);
            s0VarV.e(this.f90393d.get(i16));
            this.L[i16] = s0VarV;
            i16++;
            i17++;
        }
    }

    private static boolean s(w wVar) {
        long[] jArr = wVar.f90492i;
        if (jArr != null && jArr.length == 1 && wVar.f90493j != null) {
            long j15 = jArr[0];
            if (j15 == 0 || o0.U0(j15, 1000000L, wVar.f90487d) + o0.U0(wVar.f90493j[0], 1000000L, wVar.f90486c) >= wVar.f90488e) {
                return true;
            }
        }
        return false;
    }

    private void t(o8.q qVar) {
        this.f90399j.b0(8);
        qVar.p(this.f90399j.f(), 0, 8);
        i9.b.g(this.f90399j);
        qVar.n(this.f90399j.g());
        qVar.g();
    }

    private void v(x7.d.b bVar) throws t7.x {
        int i15 = bVar.f217150a;
        if (i15 == 1836019574) {
            z(bVar);
        } else if (i15 == 1836019558) {
            y(bVar);
        } else {
            if (this.f90403n.isEmpty()) {
                return;
            }
            this.f90403n.peek().b(bVar);
        }
    }

    private void w(c0 c0Var) {
        String str;
        String str2;
        long jU0;
        long jU1;
        long jS;
        long jA;
        if (this.K.length == 0) {
            return;
        }
        c0Var.f0(8);
        int iQ = i9.b.q(c0Var.z());
        if (iQ == 0) {
            str = (String) zj.p.q(c0Var.K());
            str2 = (String) zj.p.q(c0Var.K());
            long jS2 = c0Var.S();
            jU0 = o0.U0(c0Var.S(), 1000000L, jS2);
            long j15 = this.C;
            long j16 = j15 != -9223372036854775807L ? j15 + jU0 : -9223372036854775807L;
            jU1 = o0.U0(c0Var.S(), 1000L, jS2);
            jS = c0Var.S();
            jA = j16;
        } else {
            if (iQ != 1) {
                w7.t.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iQ);
                return;
            }
            long jS3 = c0Var.S();
            jA = o0.U0(c0Var.X(), 1000000L, jS3);
            long jU2 = o0.U0(c0Var.S(), 1000L, jS3);
            long jS4 = c0Var.S();
            str = (String) zj.p.q(c0Var.K());
            str2 = (String) zj.p.q(c0Var.K());
            jU1 = jU2;
            jS = jS4;
            jU0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[c0Var.a()];
        c0Var.u(bArr, 0, c0Var.a());
        c0 c0Var2 = new c0(this.f90401l.a(new z8.a(str3, str4, jU1, jS, bArr)));
        int iA = c0Var2.a();
        for (s0 s0Var : this.K) {
            c0Var2.f0(0);
            s0Var.a(c0Var2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f90404o.addLast(new a(jU0, true, iA));
            this.f90415z += iA;
            return;
        }
        if (!this.f90404o.isEmpty()) {
            this.f90404o.addLast(new a(jA, false, iA));
            this.f90415z += iA;
            return;
        }
        k0 k0Var = this.f90400k;
        if (k0Var != null && !k0Var.g()) {
            this.f90404o.addLast(new a(jA, false, iA));
            this.f90415z += iA;
            return;
        }
        k0 k0Var2 = this.f90400k;
        if (k0Var2 != null) {
            jA = k0Var2.a(jA);
        }
        long j17 = jA;
        for (s0 s0Var2 : this.K) {
            s0Var2.c(j17, 1, iA, 0, null);
        }
    }

    private void x(x7.d.c cVar, o8.q qVar) throws t7.x {
        if (!this.f90403n.isEmpty()) {
            this.f90403n.peek().c(cVar);
            return;
        }
        int i15 = cVar.f217150a;
        if (i15 != 1936286840) {
            if (i15 == 1701671783) {
                w(cVar.f217154b);
                return;
            }
            return;
        }
        Pair<Long, o8.g> pairI = I(cVar.f217154b, qVar.getPosition());
        this.f90407r.a((o8.g) pairI.second);
        this.C = ((Long) pairI.first).longValue();
        if (!this.M) {
            this.J.f((l0) pairI.second);
            this.M = true;
        } else {
            if ((this.f90391b & 256) == 0 || this.N || this.f90407r.c() <= 1) {
                return;
            }
            this.O = qVar.getPosition();
        }
    }

    private void y(x7.d.b bVar) throws t7.x {
        C(bVar, this.f90394e, this.f90392c != null, this.f90391b, this.f90398i);
        t7.l lVarO = o(bVar.f217152c);
        if (lVarO != null) {
            int size = this.f90394e.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.f90394e.valueAt(i15).n(lVarO);
            }
        }
        if (this.A != -9223372036854775807L) {
            int size2 = this.f90394e.size();
            for (int i16 = 0; i16 < size2; i16++) {
                this.f90394e.valueAt(i16).l(this.A);
            }
            this.A = -9223372036854775807L;
        }
    }

    private void z(x7.d.b bVar) {
        int i15 = 0;
        zj.p.x(this.f90392c == null, "Unexpected moov box.");
        t7.l lVarO = o(bVar.f217152c);
        x7.d.b bVar2 = (x7.d.b) zj.p.q(bVar.d(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = bVar2.f217152c.size();
        long jB = -9223372036854775807L;
        for (int i16 = 0; i16 < size; i16++) {
            x7.d.c cVar = bVar2.f217152c.get(i16);
            int i17 = cVar.f217150a;
            if (i17 == 1953654136) {
                Pair<Integer, c> pairM = M(cVar.f217154b);
                sparseArray.put(((Integer) pairM.first).intValue(), (c) pairM.second);
            } else if (i17 == 1835362404) {
                jB = B(cVar.f217154b);
            }
        }
        x7.d.b bVarD = bVar.d(1835365473);
        t7.v vVarI = null;
        t7.v vVarU = bVarD != null ? i9.b.u(bVarD) : null;
        e0 e0Var = new e0();
        x7.d.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            vVarI = i9.b.I(cVarE);
            e0Var.e(vVarI);
        }
        t7.v vVar = vVarI;
        t7.v vVar2 = new t7.v(i9.b.w(((x7.d.c) zj.p.q(bVar.e(1836476516))).f217154b));
        List<z> listH = i9.b.H(bVar, e0Var, jB, lVarO, (this.f90391b & 16) != 0, false, new zj.g() { // from class: i9.e
            @Override // zj.g
            public final Object apply(Object obj) {
                return this.f90388a.u((w) obj);
            }
        }, false);
        int size2 = listH.size();
        if (this.f90394e.size() != 0) {
            zj.p.w(this.f90394e.size() == size2);
            while (i15 < size2) {
                z zVar = listH.get(i15);
                w wVar = zVar.f90519a;
                this.f90394e.get(wVar.f90484a).j(zVar, n(sparseArray, wVar.f90484a));
                i15++;
            }
            return;
        }
        String strA = k.a(listH);
        while (i15 < size2) {
            z zVar2 = listH.get(i15);
            w wVar2 = zVar2.f90519a;
            s0 s0VarV = this.J.v(i15, wVar2.f90485b);
            s0VarV.d(wVar2.f90488e);
            t7.p.b bVarB = wVar2.f90490g.b();
            bVarB.X(strA);
            j.k(wVar2.f90485b, e0Var, bVarB);
            j.l(wVar2.f90485b, vVarU, bVarB, wVar2.f90490g.f188377l, vVar, vVar2);
            this.f90394e.put(wVar2.f90484a, new b(s0VarV, zVar2, n(sparseArray, wVar2.f90484a), bVarB.Q()));
            this.B = Math.max(this.B, wVar2.f90488e);
            i15++;
            e0Var = e0Var;
        }
        this.J.s();
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        int size = this.f90394e.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f90394e.valueAt(i15).k();
        }
        this.f90404o.clear();
        this.f90415z = 0;
        this.f90405p.b();
        this.A = j16;
        this.f90403n.clear();
        m();
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(o8.q qVar) {
        p0 p0VarB = v.b(qVar);
        this.f90408s = p0VarB != null ? n0.E(p0VarB) : n0.C();
        return p0VarB == null;
    }

    @Override // o8.p
    public void d(o8.r rVar) {
        this.J = (this.f90391b & 32) == 0 ? new l9.t(rVar, this.f90390a) : rVar;
        m();
        r();
        w wVar = this.f90392c;
        if (wVar != null) {
            t7.p.b bVarB = wVar.f90490g.b();
            bVarB.X(k.b(this.f90392c.f90490g));
            this.f90394e.put(0, new b(this.J.v(0, this.f90392c.f90485b), new z(this.f90392c, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0), new c(0, 0, 0, 0), bVarB.Q()));
            this.J.s();
        }
    }

    @Override // o8.p
    public int g(o8.q qVar, o8.k0 k0Var) throws t7.x {
        while (true) {
            int i15 = this.f90409t;
            if (i15 != 0) {
                if (i15 == 1) {
                    S(qVar);
                } else if (i15 == 2) {
                    T(qVar);
                } else if (U(qVar)) {
                    return 0;
                }
            } else if (!R(qVar)) {
                long j15 = this.O;
                if (j15 == -1) {
                    this.f90405p.d();
                    return -1;
                }
                k0Var.f143128a = j15;
                this.O = -1L;
                this.J.f(this.f90407r.b());
                this.N = true;
                return 1;
            }
        }
    }

    @Override // o8.p
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public n0<p0> f() {
        return this.f90408s;
    }

    protected w u(w wVar) {
        return wVar;
    }

    public h(l9.s.a aVar, int i15, k0 k0Var, w wVar, List<t7.p> list, s0 s0Var) {
        this.f90390a = aVar;
        this.f90391b = i15;
        this.f90400k = k0Var;
        this.f90392c = wVar;
        this.f90393d = Collections.unmodifiableList(list);
        this.f90406q = s0Var;
        this.f90401l = new z8.c();
        this.f90402m = new c0(16);
        this.f90395f = new c0(x7.g.f217160a);
        this.f90396g = new c0(6);
        this.f90397h = new c0();
        byte[] bArr = new byte[16];
        this.f90398i = bArr;
        this.f90399j = new c0(bArr);
        this.f90403n = new ArrayDeque<>();
        this.f90404o = new ArrayDeque<>();
        this.f90394e = new SparseArray<>();
        this.f90408s = n0.C();
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.J = o8.r.f143186j0;
        this.K = new s0[0];
        this.L = new s0[0];
        this.f90405p = new x7.k(new x7.k.b() { // from class: i9.g
            @Override // x7.k.b
            public final void a(long j15, c0 c0Var) {
                o8.f.a(j15, c0Var, this.f90389a.L);
            }
        });
        this.f90407r = new o8.h();
        this.O = -1L;
    }
}
