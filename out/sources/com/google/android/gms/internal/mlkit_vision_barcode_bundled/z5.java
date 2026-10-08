package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class z5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z5 f30342f = new z5(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f30344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f30345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f30347e;

    private z5(int i15, int[] iArr, Object[] objArr, boolean z15) {
        this.f30346d = -1;
        this.f30343a = i15;
        this.f30344b = iArr;
        this.f30345c = objArr;
        this.f30347e = z15;
    }

    public static z5 c() {
        return f30342f;
    }

    static z5 e(z5 z5Var, z5 z5Var2) {
        int i15 = z5Var.f30343a + z5Var2.f30343a;
        int[] iArrCopyOf = Arrays.copyOf(z5Var.f30344b, i15);
        System.arraycopy(z5Var2.f30344b, 0, iArrCopyOf, z5Var.f30343a, z5Var2.f30343a);
        Object[] objArrCopyOf = Arrays.copyOf(z5Var.f30345c, i15);
        System.arraycopy(z5Var2.f30345c, 0, objArrCopyOf, z5Var.f30343a, z5Var2.f30343a);
        return new z5(i15, iArrCopyOf, objArrCopyOf, true);
    }

    static z5 f() {
        return new z5(0, new int[8], new Object[8], true);
    }

    private final void m(int i15) {
        int[] iArr = this.f30344b;
        if (i15 > iArr.length) {
            int i16 = this.f30343a;
            int i17 = i16 + (i16 / 2);
            if (i17 >= i15) {
                i15 = i17;
            }
            if (i15 < 8) {
                i15 = 8;
            }
            this.f30344b = Arrays.copyOf(iArr, i15);
            this.f30345c = Arrays.copyOf(this.f30345c, i15);
        }
    }

    public final int a() {
        int iA;
        int iB;
        int iA2;
        int i15 = this.f30346d;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f30343a; i17++) {
            int i18 = this.f30344b[i17];
            int i19 = i18 >>> 3;
            int i25 = i18 & 7;
            if (i25 != 0) {
                if (i25 == 1) {
                    ((Long) this.f30345c[i17]).getClass();
                    iA2 = r2.a(i19 << 3) + 8;
                } else if (i25 == 2) {
                    int i26 = i19 << 3;
                    j2 j2Var = (j2) this.f30345c[i17];
                    int iA3 = r2.a(i26);
                    int iH = j2Var.h();
                    iA2 = iA3 + r2.a(iH) + iH;
                } else if (i25 == 3) {
                    int iA4 = r2.a(i19 << 3);
                    iA = iA4 + iA4;
                    iB = ((z5) this.f30345c[i17]).a();
                } else {
                    if (i25 != 5) {
                        throw new IllegalStateException(new u3("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f30345c[i17]).getClass();
                    iA2 = r2.a(i19 << 3) + 4;
                }
                i16 += iA2;
            } else {
                int i27 = i19 << 3;
                long jLongValue = ((Long) this.f30345c[i17]).longValue();
                iA = r2.a(i27);
                iB = r2.b(jLongValue);
            }
            iA2 = iA + iB;
            i16 += iA2;
        }
        this.f30346d = i16;
        return i16;
    }

    public final int b() {
        int i15 = this.f30346d;
        if (i15 != -1) {
            return i15;
        }
        int iA = 0;
        for (int i16 = 0; i16 < this.f30343a; i16++) {
            int i17 = this.f30344b[i16] >>> 3;
            j2 j2Var = (j2) this.f30345c[i16];
            int iA2 = r2.a(8);
            int iA3 = r2.a(16) + r2.a(i17);
            int iA4 = r2.a(24);
            int iH = j2Var.h();
            iA += iA2 + iA2 + iA3 + iA4 + r2.a(iH) + iH;
        }
        this.f30346d = iA;
        return iA;
    }

    final z5 d(z5 z5Var) {
        if (z5Var.equals(f30342f)) {
            return this;
        }
        g();
        int i15 = this.f30343a + z5Var.f30343a;
        m(i15);
        System.arraycopy(z5Var.f30344b, 0, this.f30344b, this.f30343a, z5Var.f30343a);
        System.arraycopy(z5Var.f30345c, 0, this.f30345c, this.f30343a, z5Var.f30343a);
        this.f30343a = i15;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        int i15 = this.f30343a;
        if (i15 == z5Var.f30343a) {
            int[] iArr = this.f30344b;
            int[] iArr2 = z5Var.f30344b;
            for (int i16 = 0; i16 < i15; i16++) {
                if (iArr[i16] == iArr2[i16]) {
                }
            }
            Object[] objArr = this.f30345c;
            Object[] objArr2 = z5Var.f30345c;
            int i17 = this.f30343a;
            for (int i18 = 0; i18 < i17; i18++) {
                if (objArr[i18].equals(objArr2[i18])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g() {
        if (!this.f30347e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f30347e) {
            this.f30347e = false;
        }
    }

    public final int hashCode() {
        int i15 = this.f30343a;
        int i16 = i15 + 527;
        int[] iArr = this.f30344b;
        int iHashCode = 17;
        int i17 = 17;
        for (int i18 = 0; i18 < i15; i18++) {
            i17 = (i17 * 31) + iArr[i18];
        }
        int i19 = ((i16 * 31) + i17) * 31;
        Object[] objArr = this.f30345c;
        int i25 = this.f30343a;
        for (int i26 = 0; i26 < i25; i26++) {
            iHashCode = (iHashCode * 31) + objArr[i26].hashCode();
        }
        return i19 + iHashCode;
    }

    final void i(StringBuilder sb5, int i15) {
        for (int i16 = 0; i16 < this.f30343a; i16++) {
            t4.b(sb5, i15, String.valueOf(this.f30344b[i16] >>> 3), this.f30345c[i16]);
        }
    }

    final void j(int i15, Object obj) {
        g();
        m(this.f30343a + 1);
        int[] iArr = this.f30344b;
        int i16 = this.f30343a;
        iArr[i16] = i15;
        this.f30345c[i16] = obj;
        this.f30343a = i16 + 1;
    }

    final void k(o6 o6Var) {
        for (int i15 = 0; i15 < this.f30343a; i15++) {
            o6Var.e0(this.f30344b[i15] >>> 3, this.f30345c[i15]);
        }
    }

    public final void l(o6 o6Var) {
        if (this.f30343a != 0) {
            for (int i15 = 0; i15 < this.f30343a; i15++) {
                int i16 = this.f30344b[i15];
                Object obj = this.f30345c[i15];
                int i17 = i16 & 7;
                int i18 = i16 >>> 3;
                if (i17 == 0) {
                    o6Var.Q(i18, ((Long) obj).longValue());
                } else if (i17 == 1) {
                    o6Var.f0(i18, ((Long) obj).longValue());
                } else if (i17 == 2) {
                    o6Var.T(i18, (j2) obj);
                } else if (i17 == 3) {
                    o6Var.Y(i18);
                    ((z5) obj).l(o6Var);
                    o6Var.D(i18);
                } else {
                    if (i17 != 5) {
                        throw new RuntimeException(new u3("Protocol message tag had invalid wire type."));
                    }
                    o6Var.I(i18, ((Integer) obj).intValue());
                }
            }
        }
    }

    private z5() {
        this(0, new int[8], new Object[8], true);
    }
}
