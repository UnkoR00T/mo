package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ly {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ly f30489f = new ly(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f30491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f30492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f30494e;

    private ly(int i15, int[] iArr, Object[] objArr, boolean z15) {
        this.f30493d = -1;
        this.f30490a = i15;
        this.f30491b = iArr;
        this.f30492c = objArr;
        this.f30494e = z15;
    }

    public static ly c() {
        return f30489f;
    }

    static ly e(ly lyVar, ly lyVar2) {
        int i15 = lyVar.f30490a + lyVar2.f30490a;
        int[] iArrCopyOf = Arrays.copyOf(lyVar.f30491b, i15);
        System.arraycopy(lyVar2.f30491b, 0, iArrCopyOf, lyVar.f30490a, lyVar2.f30490a);
        Object[] objArrCopyOf = Arrays.copyOf(lyVar.f30492c, i15);
        System.arraycopy(lyVar2.f30492c, 0, objArrCopyOf, lyVar.f30490a, lyVar2.f30490a);
        return new ly(i15, iArrCopyOf, objArrCopyOf, true);
    }

    static ly f() {
        return new ly(0, new int[8], new Object[8], true);
    }

    private final void m(int i15) {
        int[] iArr = this.f30491b;
        if (i15 > iArr.length) {
            int i16 = this.f30490a;
            int i17 = i16 + (i16 / 2);
            if (i17 >= i15) {
                i15 = i17;
            }
            if (i15 < 8) {
                i15 = 8;
            }
            this.f30491b = Arrays.copyOf(iArr, i15);
            this.f30492c = Arrays.copyOf(this.f30492c, i15);
        }
    }

    public final int a() {
        int iD;
        int iE;
        int iD2;
        int i15 = this.f30493d;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f30490a; i17++) {
            int i18 = this.f30491b[i17];
            int i19 = i18 >>> 3;
            int i25 = i18 & 7;
            if (i25 != 0) {
                if (i25 == 1) {
                    ((Long) this.f30492c[i17]).getClass();
                    iD2 = gv.d(i19 << 3) + 8;
                } else if (i25 == 2) {
                    int i26 = i19 << 3;
                    yu yuVar = (yu) this.f30492c[i17];
                    int iD3 = gv.d(i26);
                    int iG = yuVar.g();
                    iD2 = iD3 + gv.d(iG) + iG;
                } else if (i25 == 3) {
                    int iD4 = gv.d(i19 << 3);
                    iD = iD4 + iD4;
                    iE = ((ly) this.f30492c[i17]).a();
                } else {
                    if (i25 != 5) {
                        throw new IllegalStateException(new lw("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f30492c[i17]).getClass();
                    iD2 = gv.d(i19 << 3) + 4;
                }
                i16 += iD2;
            } else {
                int i27 = i19 << 3;
                long jLongValue = ((Long) this.f30492c[i17]).longValue();
                iD = gv.d(i27);
                iE = gv.e(jLongValue);
            }
            iD2 = iD + iE;
            i16 += iD2;
        }
        this.f30493d = i16;
        return i16;
    }

    public final int b() {
        int i15 = this.f30493d;
        if (i15 != -1) {
            return i15;
        }
        int iD = 0;
        for (int i16 = 0; i16 < this.f30490a; i16++) {
            int i17 = this.f30491b[i16] >>> 3;
            yu yuVar = (yu) this.f30492c[i16];
            int iD2 = gv.d(8);
            int iD3 = gv.d(16) + gv.d(i17);
            int iD4 = gv.d(24);
            int iG = yuVar.g();
            iD += iD2 + iD2 + iD3 + iD4 + gv.d(iG) + iG;
        }
        this.f30493d = iD;
        return iD;
    }

    final ly d(ly lyVar) {
        if (lyVar.equals(f30489f)) {
            return this;
        }
        g();
        int i15 = this.f30490a + lyVar.f30490a;
        m(i15);
        System.arraycopy(lyVar.f30491b, 0, this.f30491b, this.f30490a, lyVar.f30490a);
        System.arraycopy(lyVar.f30492c, 0, this.f30492c, this.f30490a, lyVar.f30490a);
        this.f30490a = i15;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ly)) {
            return false;
        }
        ly lyVar = (ly) obj;
        int i15 = this.f30490a;
        if (i15 == lyVar.f30490a) {
            int[] iArr = this.f30491b;
            int[] iArr2 = lyVar.f30491b;
            for (int i16 = 0; i16 < i15; i16++) {
                if (iArr[i16] == iArr2[i16]) {
                }
            }
            Object[] objArr = this.f30492c;
            Object[] objArr2 = lyVar.f30492c;
            int i17 = this.f30490a;
            for (int i18 = 0; i18 < i17; i18++) {
                if (objArr[i18].equals(objArr2[i18])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g() {
        if (!this.f30494e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f30494e) {
            this.f30494e = false;
        }
    }

    public final int hashCode() {
        int i15 = this.f30490a;
        int i16 = i15 + 527;
        int[] iArr = this.f30491b;
        int iHashCode = 17;
        int i17 = 17;
        for (int i18 = 0; i18 < i15; i18++) {
            i17 = (i17 * 31) + iArr[i18];
        }
        int i19 = ((i16 * 31) + i17) * 31;
        Object[] objArr = this.f30492c;
        int i25 = this.f30490a;
        for (int i26 = 0; i26 < i25; i26++) {
            iHashCode = (iHashCode * 31) + objArr[i26].hashCode();
        }
        return i19 + iHashCode;
    }

    final void i(StringBuilder sb5, int i15) {
        for (int i16 = 0; i16 < this.f30490a; i16++) {
            lx.b(sb5, i15, String.valueOf(this.f30491b[i16] >>> 3), this.f30492c[i16]);
        }
    }

    final void j(int i15, Object obj) {
        g();
        m(this.f30490a + 1);
        int[] iArr = this.f30491b;
        int i16 = this.f30490a;
        iArr[i16] = i15;
        this.f30492c[i16] = obj;
        this.f30490a = i16 + 1;
    }

    final void k(xy xyVar) {
        for (int i15 = 0; i15 < this.f30490a; i15++) {
            xyVar.p(this.f30491b[i15] >>> 3, this.f30492c[i15]);
        }
    }

    public final void l(xy xyVar) {
        if (this.f30490a != 0) {
            for (int i15 = 0; i15 < this.f30490a; i15++) {
                int i16 = this.f30491b[i15];
                Object obj = this.f30492c[i15];
                int i17 = i16 & 7;
                int i18 = i16 >>> 3;
                if (i17 == 0) {
                    xyVar.C(i18, ((Long) obj).longValue());
                } else if (i17 == 1) {
                    xyVar.c(i18, ((Long) obj).longValue());
                } else if (i17 == 2) {
                    xyVar.G(i18, (yu) obj);
                } else if (i17 == 3) {
                    xyVar.K(i18);
                    ((ly) obj).l(xyVar);
                    xyVar.w(i18);
                } else {
                    if (i17 != 5) {
                        throw new RuntimeException(new lw("Protocol message tag had invalid wire type."));
                    }
                    xyVar.f(i18, ((Integer) obj).intValue());
                }
            }
        }
    }

    private ly() {
        this(0, new int[8], new Object[8], true);
    }
}
