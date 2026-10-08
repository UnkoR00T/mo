package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class k5 extends s4<k5> implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f29395c = z4.f29624h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29396d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[][] f29397e = z4.f29623g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29398f = false;

    public k5() {
        this.f29537b = null;
        this.f29584a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final k5 clone() {
        try {
            k5 k5Var = (k5) super.clone();
            byte[][] bArr = this.f29397e;
            if (bArr != null && bArr.length > 0) {
                k5Var.f29397e = (byte[][]) bArr.clone();
            }
            return k5Var;
        } catch (CloneNotSupportedException e15) {
            throw new AssertionError(e15);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    public final void b(q4 q4Var) throws r4 {
        if (!Arrays.equals(this.f29395c, z4.f29624h)) {
            q4Var.d(1, this.f29395c);
        }
        byte[][] bArr = this.f29397e;
        if (bArr != null && bArr.length > 0) {
            int i15 = 0;
            while (true) {
                byte[][] bArr2 = this.f29397e;
                if (i15 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i15];
                if (bArr3 != null) {
                    q4Var.d(2, bArr3);
                }
                i15++;
            }
        }
        String str = this.f29396d;
        if (str != null && !str.equals("")) {
            q4Var.c(4, this.f29396d);
        }
        super.b(q4Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        if (!Arrays.equals(this.f29395c, k5Var.f29395c)) {
            return false;
        }
        String str = this.f29396d;
        if (str == null) {
            if (k5Var.f29396d != null) {
                return false;
            }
        } else if (!str.equals(k5Var.f29396d)) {
            return false;
        }
        if (!v4.i(this.f29397e, k5Var.f29397e)) {
            return false;
        }
        t4 t4Var = this.f29537b;
        if (t4Var != null && !t4Var.b()) {
            return this.f29537b.equals(k5Var.f29537b);
        }
        t4 t4Var2 = k5Var.f29537b;
        return t4Var2 == null || t4Var2.b();
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    protected final int g() {
        int iG = super.g();
        if (!Arrays.equals(this.f29395c, z4.f29624h)) {
            iG += q4.i(1, this.f29395c);
        }
        byte[][] bArr = this.f29397e;
        if (bArr != null && bArr.length > 0) {
            int i15 = 0;
            int iS = 0;
            int i16 = 0;
            while (true) {
                byte[][] bArr2 = this.f29397e;
                if (i15 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i15];
                if (bArr3 != null) {
                    i16++;
                    iS += q4.s(bArr3);
                }
                i15++;
            }
            iG = iG + iS + i16;
        }
        String str = this.f29396d;
        return (str == null || str.equals("")) ? iG : iG + q4.h(4, this.f29396d);
    }

    public final int hashCode() {
        int iHashCode = (((k5.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f29395c)) * 31;
        String str = this.f29396d;
        int iHashCode2 = 0;
        int iHashCode3 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + v4.g(this.f29397e)) * 31) + 1237) * 31;
        t4 t4Var = this.f29537b;
        if (t4Var != null && !t4Var.b()) {
            iHashCode2 = this.f29537b.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ w4 clone() {
        return (k5) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.s4
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ s4 clone() {
        return (k5) clone();
    }
}
