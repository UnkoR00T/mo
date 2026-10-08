package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class j10 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j10 f32623f = new j10(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f32625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f32626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32628e;

    private j10(int i15, int[] iArr, Object[] objArr, boolean z15) {
        this.f32627d = -1;
        this.f32624a = i15;
        this.f32625b = iArr;
        this.f32626c = objArr;
        this.f32628e = z15;
    }

    public static j10 a() {
        return f32623f;
    }

    static j10 b() {
        return new j10(0, new int[8], new Object[8], true);
    }

    static j10 c(j10 j10Var, j10 j10Var2) {
        int i15 = j10Var.f32624a + j10Var2.f32624a;
        int[] iArrCopyOf = Arrays.copyOf(j10Var.f32625b, i15);
        System.arraycopy(j10Var2.f32625b, 0, iArrCopyOf, j10Var.f32624a, j10Var2.f32624a);
        Object[] objArrCopyOf = Arrays.copyOf(j10Var.f32626c, i15);
        System.arraycopy(j10Var2.f32626c, 0, objArrCopyOf, j10Var.f32624a, j10Var2.f32624a);
        return new j10(i15, iArrCopyOf, objArrCopyOf, true);
    }

    private final void m(int i15) {
        int[] iArr = this.f32625b;
        if (i15 > iArr.length) {
            int i16 = this.f32624a;
            int i17 = i16 + (i16 / 2);
            if (i17 >= i15) {
                i15 = i17;
            }
            if (i15 < 8) {
                i15 = 8;
            }
            this.f32625b = Arrays.copyOf(iArr, i15);
            this.f32626c = Arrays.copyOf(this.f32626c, i15);
        }
    }

    public final void d() {
        if (this.f32628e) {
            this.f32628e = false;
        }
    }

    final void e() {
        if (!this.f32628e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j10)) {
            return false;
        }
        j10 j10Var = (j10) obj;
        int i15 = this.f32624a;
        if (i15 == j10Var.f32624a) {
            int[] iArr = this.f32625b;
            int[] iArr2 = j10Var.f32625b;
            for (int i16 = 0; i16 < i15; i16++) {
                if (iArr[i16] == iArr2[i16]) {
                }
            }
            Object[] objArr = this.f32626c;
            Object[] objArr2 = j10Var.f32626c;
            int i17 = this.f32624a;
            for (int i18 = 0; i18 < i17; i18++) {
                if (objArr[i18].equals(objArr2[i18])) {
                }
            }
            return true;
        }
        return false;
    }

    final void f(w10 w10Var) {
        for (int i15 = 0; i15 < this.f32624a; i15++) {
            w10Var.x(this.f32625b[i15] >>> 3, this.f32626c[i15]);
        }
    }

    public final void g(w10 w10Var) {
        if (this.f32624a != 0) {
            for (int i15 = 0; i15 < this.f32624a; i15++) {
                int i16 = this.f32625b[i15];
                Object obj = this.f32626c[i15];
                int i17 = i16 & 7;
                int i18 = i16 >>> 3;
                if (i17 == 0) {
                    w10Var.a(i18, ((Long) obj).longValue());
                } else if (i17 == 1) {
                    w10Var.z(i18, ((Long) obj).longValue());
                } else if (i17 == 2) {
                    w10Var.d(i18, (tx) obj);
                } else if (i17 == 3) {
                    w10Var.b(i18);
                    ((j10) obj).g(w10Var);
                    w10Var.t(i18);
                } else {
                    if (i17 != 5) {
                        throw new RuntimeException(new kz("Protocol message tag had invalid wire type."));
                    }
                    w10Var.I(i18, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int h() {
        int i15 = this.f32627d;
        if (i15 != -1) {
            return i15;
        }
        int iD = 0;
        for (int i16 = 0; i16 < this.f32624a; i16++) {
            int i17 = this.f32625b[i16] >>> 3;
            tx txVar = (tx) this.f32626c[i16];
            int iD2 = dy.d(8);
            int iD3 = dy.d(16) + dy.d(i17);
            int iD4 = dy.d(24);
            int iF = txVar.f();
            iD += iD2 + iD2 + iD3 + iD4 + dy.d(iF) + iF;
        }
        this.f32627d = iD;
        return iD;
    }

    public final int hashCode() {
        int i15 = this.f32624a;
        int i16 = i15 + 527;
        int[] iArr = this.f32625b;
        int iHashCode = 17;
        int i17 = 17;
        for (int i18 = 0; i18 < i15; i18++) {
            i17 = (i17 * 31) + iArr[i18];
        }
        int i19 = ((i16 * 31) + i17) * 31;
        Object[] objArr = this.f32626c;
        int i25 = this.f32624a;
        for (int i26 = 0; i26 < i25; i26++) {
            iHashCode = (iHashCode * 31) + objArr[i26].hashCode();
        }
        return i19 + iHashCode;
    }

    public final int i() {
        int iD;
        int iE;
        int iD2;
        int i15 = this.f32627d;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f32624a; i17++) {
            int i18 = this.f32625b[i17];
            int i19 = i18 >>> 3;
            int i25 = i18 & 7;
            if (i25 != 0) {
                if (i25 == 1) {
                    ((Long) this.f32626c[i17]).getClass();
                    iD2 = dy.d(i19 << 3) + 8;
                } else if (i25 == 2) {
                    int i26 = i19 << 3;
                    tx txVar = (tx) this.f32626c[i17];
                    int iD3 = dy.d(i26);
                    int iF = txVar.f();
                    iD2 = iD3 + dy.d(iF) + iF;
                } else if (i25 == 3) {
                    int iD4 = dy.d(i19 << 3);
                    iD = iD4 + iD4;
                    iE = ((j10) this.f32626c[i17]).i();
                } else {
                    if (i25 != 5) {
                        throw new IllegalStateException(new kz("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f32626c[i17]).getClass();
                    iD2 = dy.d(i19 << 3) + 4;
                }
                i16 += iD2;
            } else {
                int i27 = i19 << 3;
                long jLongValue = ((Long) this.f32626c[i17]).longValue();
                iD = dy.d(i27);
                iE = dy.e(jLongValue);
            }
            iD2 = iD + iE;
            i16 += iD2;
        }
        this.f32627d = i16;
        return i16;
    }

    final void j(StringBuilder sb5, int i15) {
        for (int i16 = 0; i16 < this.f32624a; i16++) {
            j00.b(sb5, i15, String.valueOf(this.f32625b[i16] >>> 3), this.f32626c[i16]);
        }
    }

    final void k(int i15, Object obj) {
        e();
        m(this.f32624a + 1);
        int[] iArr = this.f32625b;
        int i16 = this.f32624a;
        iArr[i16] = i15;
        this.f32626c[i16] = obj;
        this.f32624a = i16 + 1;
    }

    final j10 l(j10 j10Var) {
        if (j10Var.equals(f32623f)) {
            return this;
        }
        e();
        int i15 = this.f32624a + j10Var.f32624a;
        m(i15);
        System.arraycopy(j10Var.f32625b, 0, this.f32625b, this.f32624a, j10Var.f32624a);
        System.arraycopy(j10Var.f32626c, 0, this.f32626c, this.f32624a, j10Var.f32624a);
        this.f32624a = i15;
        return this;
    }

    private j10() {
        this(0, new int[8], new Object[8], true);
    }
}
