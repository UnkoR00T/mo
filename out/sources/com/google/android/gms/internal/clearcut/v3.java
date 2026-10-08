package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class v3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v3 f29559f = new v3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f29561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f29562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29564e;

    private v3() {
        this(0, new int[8], new Object[8], true);
    }

    static v3 a(v3 v3Var, v3 v3Var2) {
        int i15 = v3Var.f29560a + v3Var2.f29560a;
        int[] iArrCopyOf = Arrays.copyOf(v3Var.f29561b, i15);
        System.arraycopy(v3Var2.f29561b, 0, iArrCopyOf, v3Var.f29560a, v3Var2.f29560a);
        Object[] objArrCopyOf = Arrays.copyOf(v3Var.f29562c, i15);
        System.arraycopy(v3Var2.f29562c, 0, objArrCopyOf, v3Var.f29560a, v3Var2.f29560a);
        return new v3(i15, iArrCopyOf, objArrCopyOf, true);
    }

    private static void f(int i15, Object obj, p4 p4Var) {
        int i16 = i15 >>> 3;
        int i17 = i15 & 7;
        if (i17 == 0) {
            p4Var.O(i16, ((Long) obj).longValue());
            return;
        }
        if (i17 == 1) {
            p4Var.a(i16, ((Long) obj).longValue());
            return;
        }
        if (i17 == 2) {
            p4Var.K(i16, (a0) obj);
            return;
        }
        if (i17 != 3) {
            if (i17 != 5) {
                throw new RuntimeException(l1.c());
            }
            p4Var.s(i16, ((Integer) obj).intValue());
        } else if (p4Var.N() == f1.e.f29331l) {
            p4Var.Q(i16);
            ((v3) obj).g(p4Var);
            p4Var.J(i16);
        } else {
            p4Var.J(i16);
            ((v3) obj).g(p4Var);
            p4Var.Q(i16);
        }
    }

    public static v3 h() {
        return f29559f;
    }

    static v3 i() {
        return new v3();
    }

    final void b(p4 p4Var) {
        if (p4Var.N() == f1.e.f29332m) {
            for (int i15 = this.f29560a - 1; i15 >= 0; i15--) {
                p4Var.m(this.f29561b[i15] >>> 3, this.f29562c[i15]);
            }
            return;
        }
        for (int i16 = 0; i16 < this.f29560a; i16++) {
            p4Var.m(this.f29561b[i16] >>> 3, this.f29562c[i16]);
        }
    }

    final void c(StringBuilder sb5, int i15) {
        for (int i16 = 0; i16 < this.f29560a; i16++) {
            o2.c(sb5, i15, String.valueOf(this.f29561b[i16] >>> 3), this.f29562c[i16]);
        }
    }

    public final int d() {
        int iD0;
        int i15 = this.f29563d;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f29560a; i17++) {
            int i18 = this.f29561b[i17];
            int i19 = i18 >>> 3;
            int i25 = i18 & 7;
            if (i25 == 0) {
                iD0 = m0.d0(i19, ((Long) this.f29562c[i17]).longValue());
            } else if (i25 == 1) {
                iD0 = m0.k0(i19, ((Long) this.f29562c[i17]).longValue());
            } else if (i25 == 2) {
                iD0 = m0.N(i19, (a0) this.f29562c[i17]);
            } else if (i25 == 3) {
                iD0 = (m0.B0(i19) << 1) + ((v3) this.f29562c[i17]).d();
            } else {
                if (i25 != 5) {
                    throw new IllegalStateException(l1.c());
                }
                iD0 = m0.t0(i19, ((Integer) this.f29562c[i17]).intValue());
            }
            i16 += iD0;
        }
        this.f29563d = i16;
        return i16;
    }

    final void e(int i15, Object obj) {
        if (!this.f29564e) {
            throw new UnsupportedOperationException();
        }
        int i16 = this.f29560a;
        int[] iArr = this.f29561b;
        if (i16 == iArr.length) {
            int i17 = i16 + (i16 < 4 ? 8 : i16 >> 1);
            this.f29561b = Arrays.copyOf(iArr, i17);
            this.f29562c = Arrays.copyOf(this.f29562c, i17);
        }
        int[] iArr2 = this.f29561b;
        int i18 = this.f29560a;
        iArr2[i18] = i15;
        this.f29562c[i18] = obj;
        this.f29560a = i18 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        int i15 = this.f29560a;
        if (i15 == v3Var.f29560a) {
            int[] iArr = this.f29561b;
            int[] iArr2 = v3Var.f29561b;
            for (int i16 = 0; i16 < i15; i16++) {
                if (iArr[i16] == iArr2[i16]) {
                }
            }
            Object[] objArr = this.f29562c;
            Object[] objArr2 = v3Var.f29562c;
            int i17 = this.f29560a;
            for (int i18 = 0; i18 < i17; i18++) {
                if (objArr[i18].equals(objArr2[i18])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(p4 p4Var) {
        if (this.f29560a == 0) {
            return;
        }
        if (p4Var.N() == f1.e.f29331l) {
            for (int i15 = 0; i15 < this.f29560a; i15++) {
                f(this.f29561b[i15], this.f29562c[i15], p4Var);
            }
            return;
        }
        for (int i16 = this.f29560a - 1; i16 >= 0; i16--) {
            f(this.f29561b[i16], this.f29562c[i16], p4Var);
        }
    }

    public final int hashCode() {
        int i15 = this.f29560a;
        int i16 = (i15 + 527) * 31;
        int[] iArr = this.f29561b;
        int iHashCode = 17;
        int i17 = 17;
        for (int i18 = 0; i18 < i15; i18++) {
            i17 = (i17 * 31) + iArr[i18];
        }
        int i19 = (i16 + i17) * 31;
        Object[] objArr = this.f29562c;
        int i25 = this.f29560a;
        for (int i26 = 0; i26 < i25; i26++) {
            iHashCode = (iHashCode * 31) + objArr[i26].hashCode();
        }
        return i19 + iHashCode;
    }

    public final int j() {
        int i15 = this.f29563d;
        if (i15 != -1) {
            return i15;
        }
        int iX = 0;
        for (int i16 = 0; i16 < this.f29560a; i16++) {
            iX += m0.X(this.f29561b[i16] >>> 3, (a0) this.f29562c[i16]);
        }
        this.f29563d = iX;
        return iX;
    }

    public final void k() {
        this.f29564e = false;
    }

    private v3(int i15, int[] iArr, Object[] objArr, boolean z15) {
        this.f29563d = -1;
        this.f29560a = i15;
        this.f29561b = iArr;
        this.f29562c = objArr;
        this.f29564e = z15;
    }
}
