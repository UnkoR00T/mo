package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f5 f31045f = new f5(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f31047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f31048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31050e;

    private f5() {
        this(0, new int[8], new Object[8], true);
    }

    public static f5 a() {
        return f31045f;
    }

    static f5 b(f5 f5Var, f5 f5Var2) {
        int i15 = f5Var.f31046a + f5Var2.f31046a;
        int[] iArrCopyOf = Arrays.copyOf(f5Var.f31047b, i15);
        System.arraycopy(f5Var2.f31047b, 0, iArrCopyOf, f5Var.f31046a, f5Var2.f31046a);
        Object[] objArrCopyOf = Arrays.copyOf(f5Var.f31048c, i15);
        System.arraycopy(f5Var2.f31048c, 0, objArrCopyOf, f5Var.f31046a, f5Var2.f31046a);
        return new f5(i15, iArrCopyOf, objArrCopyOf, true);
    }

    private static void d(int i15, Object obj, z5 z5Var) {
        int i16 = i15 >>> 3;
        int i17 = i15 & 7;
        if (i17 == 0) {
            z5Var.o(i16, ((Long) obj).longValue());
            return;
        }
        if (i17 == 1) {
            z5Var.w(i16, ((Long) obj).longValue());
            return;
        }
        if (i17 == 2) {
            z5Var.I(i16, (e1) obj);
            return;
        }
        if (i17 != 3) {
            if (i17 != 5) {
                throw new RuntimeException(u2.d());
            }
            z5Var.v(i16, ((Integer) obj).intValue());
        } else if (z5Var.zza() == y5.f31358a) {
            z5Var.b(i16);
            ((f5) obj).h(z5Var);
            z5Var.p(i16);
        } else {
            z5Var.p(i16);
            ((f5) obj).h(z5Var);
            z5Var.b(i16);
        }
    }

    static f5 g() {
        return new f5();
    }

    final void c(int i15, Object obj) {
        if (!this.f31050e) {
            throw new UnsupportedOperationException();
        }
        int i16 = this.f31046a;
        int[] iArr = this.f31047b;
        if (i16 == iArr.length) {
            int i17 = i16 + (i16 < 4 ? 8 : i16 >> 1);
            this.f31047b = Arrays.copyOf(iArr, i17);
            this.f31048c = Arrays.copyOf(this.f31048c, i17);
        }
        int[] iArr2 = this.f31047b;
        int i18 = this.f31046a;
        iArr2[i18] = i15;
        this.f31048c[i18] = obj;
        this.f31046a = i18 + 1;
    }

    final void e(z5 z5Var) {
        if (z5Var.zza() == y5.f31359b) {
            for (int i15 = this.f31046a - 1; i15 >= 0; i15--) {
                z5Var.m(this.f31047b[i15] >>> 3, this.f31048c[i15]);
            }
            return;
        }
        for (int i16 = 0; i16 < this.f31046a; i16++) {
            z5Var.m(this.f31047b[i16] >>> 3, this.f31048c[i16]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        int i15 = this.f31046a;
        if (i15 == f5Var.f31046a) {
            int[] iArr = this.f31047b;
            int[] iArr2 = f5Var.f31047b;
            for (int i16 = 0; i16 < i15; i16++) {
                if (iArr[i16] == iArr2[i16]) {
                }
            }
            Object[] objArr = this.f31048c;
            Object[] objArr2 = f5Var.f31048c;
            int i17 = this.f31046a;
            for (int i18 = 0; i18 < i17; i18++) {
                if (objArr[i18].equals(objArr2[i18])) {
                }
            }
            return true;
        }
        return false;
    }

    final void f(StringBuilder sb5, int i15) {
        for (int i16 = 0; i16 < this.f31046a; i16++) {
            z3.d(sb5, i15, String.valueOf(this.f31047b[i16] >>> 3), this.f31048c[i16]);
        }
    }

    public final void h(z5 z5Var) {
        if (this.f31046a == 0) {
            return;
        }
        if (z5Var.zza() == y5.f31358a) {
            for (int i15 = 0; i15 < this.f31046a; i15++) {
                d(this.f31047b[i15], this.f31048c[i15], z5Var);
            }
            return;
        }
        for (int i16 = this.f31046a - 1; i16 >= 0; i16--) {
            d(this.f31047b[i16], this.f31048c[i16], z5Var);
        }
    }

    public final int hashCode() {
        int i15 = this.f31046a;
        int i16 = (i15 + 527) * 31;
        int[] iArr = this.f31047b;
        int iHashCode = 17;
        int i17 = 17;
        for (int i18 = 0; i18 < i15; i18++) {
            i17 = (i17 * 31) + iArr[i18];
        }
        int i19 = (i16 + i17) * 31;
        Object[] objArr = this.f31048c;
        int i25 = this.f31046a;
        for (int i26 = 0; i26 < i25; i26++) {
            iHashCode = (iHashCode * 31) + objArr[i26].hashCode();
        }
        return i19 + iHashCode;
    }

    public final void i() {
        this.f31050e = false;
    }

    public final int j() {
        int i15 = this.f31049d;
        if (i15 != -1) {
            return i15;
        }
        int iC0 = 0;
        for (int i16 = 0; i16 < this.f31046a; i16++) {
            iC0 += t1.c0(this.f31047b[i16] >>> 3, (e1) this.f31048c[i16]);
        }
        this.f31049d = iC0;
        return iC0;
    }

    public final int k() {
        int iH0;
        int i15 = this.f31049d;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f31046a; i17++) {
            int i18 = this.f31047b[i17];
            int i19 = i18 >>> 3;
            int i25 = i18 & 7;
            if (i25 == 0) {
                iH0 = t1.h0(i19, ((Long) this.f31048c[i17]).longValue());
            } else if (i25 == 1) {
                iH0 = t1.q0(i19, ((Long) this.f31048c[i17]).longValue());
            } else if (i25 == 2) {
                iH0 = t1.T(i19, (e1) this.f31048c[i17]);
            } else if (i25 == 3) {
                iH0 = (t1.g0(i19) << 1) + ((f5) this.f31048c[i17]).k();
            } else {
                if (i25 != 5) {
                    throw new IllegalStateException(u2.d());
                }
                iH0 = t1.x0(i19, ((Integer) this.f31048c[i17]).intValue());
            }
            i16 += iH0;
        }
        this.f31049d = i16;
        return i16;
    }

    private f5(int i15, int[] iArr, Object[] objArr, boolean z15) {
        this.f31049d = -1;
        this.f31046a = i15;
        this.f31047b = iArr;
        this.f31048c = objArr;
        this.f31050e = z15;
    }
}
