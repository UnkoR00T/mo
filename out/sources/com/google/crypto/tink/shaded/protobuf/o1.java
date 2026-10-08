package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o1 f36156f = new o1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f36158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f36159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36161e;

    private o1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i15) {
        int[] iArr = this.f36158b;
        if (i15 > iArr.length) {
            int i16 = this.f36157a;
            int i17 = i16 + (i16 / 2);
            if (i17 >= i15) {
                i15 = i17;
            }
            if (i15 < 8) {
                i15 = 8;
            }
            this.f36158b = Arrays.copyOf(iArr, i15);
            this.f36159c = Arrays.copyOf(this.f36159c, i15);
        }
    }

    public static o1 c() {
        return f36156f;
    }

    private static int f(int[] iArr, int i15) {
        int i16 = 17;
        for (int i17 = 0; i17 < i15; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        return i16;
    }

    private static int g(Object[] objArr, int i15) {
        int iHashCode = 17;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return iHashCode;
    }

    static o1 j(o1 o1Var, o1 o1Var2) {
        int i15 = o1Var.f36157a + o1Var2.f36157a;
        int[] iArrCopyOf = Arrays.copyOf(o1Var.f36158b, i15);
        System.arraycopy(o1Var2.f36158b, 0, iArrCopyOf, o1Var.f36157a, o1Var2.f36157a);
        Object[] objArrCopyOf = Arrays.copyOf(o1Var.f36159c, i15);
        System.arraycopy(o1Var2.f36159c, 0, objArrCopyOf, o1Var.f36157a, o1Var2.f36157a);
        return new o1(i15, iArrCopyOf, objArrCopyOf, true);
    }

    static o1 k() {
        return new o1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            if (!objArr[i16].equals(objArr2[i16])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            if (iArr[i16] != iArr2[i16]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i15, Object obj, u1 u1Var) {
        int iA = t1.a(i15);
        int iB = t1.b(i15);
        if (iB == 0) {
            u1Var.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            u1Var.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            u1Var.M(iA, (h) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(b0.e());
            }
            u1Var.c(iA, ((Integer) obj).intValue());
        } else if (u1Var.t() == u1.a.ASCENDING) {
            u1Var.x(iA);
            ((o1) obj).r(u1Var);
            u1Var.C(iA);
        } else {
            u1Var.C(iA);
            ((o1) obj).r(u1Var);
            u1Var.x(iA);
        }
    }

    void a() {
        if (!this.f36161e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iW;
        int i15 = this.f36160d;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f36157a; i17++) {
            int i18 = this.f36158b[i17];
            int iA = t1.a(i18);
            int iB = t1.b(i18);
            if (iB == 0) {
                iW = k.W(iA, ((Long) this.f36159c[i17]).longValue());
            } else if (iB == 1) {
                iW = k.o(iA, ((Long) this.f36159c[i17]).longValue());
            } else if (iB == 2) {
                iW = k.g(iA, (h) this.f36159c[i17]);
            } else if (iB == 3) {
                iW = (k.T(iA) * 2) + ((o1) this.f36159c[i17]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(b0.e());
                }
                iW = k.m(iA, ((Integer) this.f36159c[i17]).intValue());
            }
            i16 += iW;
        }
        this.f36160d = i16;
        return i16;
    }

    public int e() {
        int i15 = this.f36160d;
        if (i15 != -1) {
            return i15;
        }
        int I = 0;
        for (int i16 = 0; i16 < this.f36157a; i16++) {
            I += k.I(t1.a(this.f36158b[i16]), (h) this.f36159c[i16]);
        }
        this.f36160d = I;
        return I;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i15 = this.f36157a;
        return i15 == o1Var.f36157a && o(this.f36158b, o1Var.f36158b, i15) && l(this.f36159c, o1Var.f36159c, this.f36157a);
    }

    public void h() {
        this.f36161e = false;
    }

    public int hashCode() {
        int i15 = this.f36157a;
        return ((((527 + i15) * 31) + f(this.f36158b, i15)) * 31) + g(this.f36159c, this.f36157a);
    }

    o1 i(o1 o1Var) {
        if (o1Var.equals(c())) {
            return this;
        }
        a();
        int i15 = this.f36157a + o1Var.f36157a;
        b(i15);
        System.arraycopy(o1Var.f36158b, 0, this.f36158b, this.f36157a, o1Var.f36157a);
        System.arraycopy(o1Var.f36159c, 0, this.f36159c, this.f36157a, o1Var.f36157a);
        this.f36157a = i15;
        return this;
    }

    final void m(StringBuilder sb5, int i15) {
        for (int i16 = 0; i16 < this.f36157a; i16++) {
            t0.d(sb5, i15, String.valueOf(t1.a(this.f36158b[i16])), this.f36159c[i16]);
        }
    }

    void n(int i15, Object obj) {
        a();
        b(this.f36157a + 1);
        int[] iArr = this.f36158b;
        int i16 = this.f36157a;
        iArr[i16] = i15;
        this.f36159c[i16] = obj;
        this.f36157a = i16 + 1;
    }

    void p(u1 u1Var) {
        if (u1Var.t() == u1.a.DESCENDING) {
            for (int i15 = this.f36157a - 1; i15 >= 0; i15--) {
                u1Var.b(t1.a(this.f36158b[i15]), this.f36159c[i15]);
            }
            return;
        }
        for (int i16 = 0; i16 < this.f36157a; i16++) {
            u1Var.b(t1.a(this.f36158b[i16]), this.f36159c[i16]);
        }
    }

    public void r(u1 u1Var) {
        if (this.f36157a == 0) {
            return;
        }
        if (u1Var.t() == u1.a.ASCENDING) {
            for (int i15 = 0; i15 < this.f36157a; i15++) {
                q(this.f36158b[i15], this.f36159c[i15], u1Var);
            }
            return;
        }
        for (int i16 = this.f36157a - 1; i16 >= 0; i16--) {
            q(this.f36158b[i16], this.f36159c[i16], u1Var);
        }
    }

    private o1(int i15, int[] iArr, Object[] objArr, boolean z15) {
        this.f36160d = -1;
        this.f36157a = i15;
        this.f36158b = iArr;
        this.f36159c = objArr;
        this.f36161e = z15;
    }
}
