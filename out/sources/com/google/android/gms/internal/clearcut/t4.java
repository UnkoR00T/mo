package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u4 f29543e = new u4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f29545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u4[] f29546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29547d;

    t4() {
        this(10);
    }

    public final boolean b() {
        return this.f29547d == 0;
    }

    final int c() {
        return this.f29547d;
    }

    public final /* synthetic */ Object clone() {
        int i15 = this.f29547d;
        t4 t4Var = new t4(i15);
        System.arraycopy(this.f29545b, 0, t4Var.f29545b, 0, i15);
        for (int i16 = 0; i16 < i15; i16++) {
            u4 u4Var = this.f29546c[i16];
            if (u4Var != null) {
                t4Var.f29546c[i16] = (u4) u4Var.clone();
            }
        }
        t4Var.f29547d = i15;
        return t4Var;
    }

    final u4 e(int i15) {
        return this.f29546c[i15];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        int i15 = this.f29547d;
        if (i15 != t4Var.f29547d) {
            return false;
        }
        int[] iArr = this.f29545b;
        int[] iArr2 = t4Var.f29545b;
        for (int i16 = 0; i16 < i15; i16++) {
            if (iArr[i16] != iArr2[i16]) {
                return false;
            }
        }
        u4[] u4VarArr = this.f29546c;
        u4[] u4VarArr2 = t4Var.f29546c;
        int i17 = this.f29547d;
        for (int i18 = 0; i18 < i17; i18++) {
            if (!u4VarArr[i18].equals(u4VarArr2[i18])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i15 = 0; i15 < this.f29547d; i15++) {
            iHashCode = (((iHashCode * 31) + this.f29545b[i15]) * 31) + this.f29546c[i15].hashCode();
        }
        return iHashCode;
    }

    private t4(int i15) {
        this.f29544a = false;
        int i16 = i15 << 2;
        for (int i17 = 4; i17 < 32; i17++) {
            int i18 = (1 << i17) - 12;
            if (i16 <= i18) {
                i16 = i18;
                break;
            }
        }
        int i19 = i16 / 4;
        this.f29545b = new int[i19];
        this.f29546c = new u4[i19];
        this.f29547d = 0;
    }
}
