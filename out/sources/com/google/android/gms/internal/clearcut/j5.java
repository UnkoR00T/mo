package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public final class j5 extends s4<j5> implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f29390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f29391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f29392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long[] f29393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long[] f29394g;

    public j5() {
        String[] strArr = z4.f29622f;
        this.f29390c = strArr;
        this.f29391d = strArr;
        this.f29392e = z4.f29617a;
        long[] jArr = z4.f29618b;
        this.f29393f = jArr;
        this.f29394g = jArr;
        this.f29537b = null;
        this.f29584a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final j5 clone() {
        try {
            j5 j5Var = (j5) super.clone();
            String[] strArr = this.f29390c;
            if (strArr != null && strArr.length > 0) {
                j5Var.f29390c = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f29391d;
            if (strArr2 != null && strArr2.length > 0) {
                j5Var.f29391d = (String[]) strArr2.clone();
            }
            int[] iArr = this.f29392e;
            if (iArr != null && iArr.length > 0) {
                j5Var.f29392e = (int[]) iArr.clone();
            }
            long[] jArr = this.f29393f;
            if (jArr != null && jArr.length > 0) {
                j5Var.f29393f = (long[]) jArr.clone();
            }
            long[] jArr2 = this.f29394g;
            if (jArr2 != null && jArr2.length > 0) {
                j5Var.f29394g = (long[]) jArr2.clone();
            }
            return j5Var;
        } catch (CloneNotSupportedException e15) {
            throw new AssertionError(e15);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    public final void b(q4 q4Var) throws r4 {
        String[] strArr = this.f29390c;
        int i15 = 0;
        if (strArr != null && strArr.length > 0) {
            int i16 = 0;
            while (true) {
                String[] strArr2 = this.f29390c;
                if (i16 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i16];
                if (str != null) {
                    q4Var.c(1, str);
                }
                i16++;
            }
        }
        String[] strArr3 = this.f29391d;
        if (strArr3 != null && strArr3.length > 0) {
            int i17 = 0;
            while (true) {
                String[] strArr4 = this.f29391d;
                if (i17 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i17];
                if (str2 != null) {
                    q4Var.c(2, str2);
                }
                i17++;
            }
        }
        int[] iArr = this.f29392e;
        if (iArr != null && iArr.length > 0) {
            int i18 = 0;
            while (true) {
                int[] iArr2 = this.f29392e;
                if (i18 >= iArr2.length) {
                    break;
                }
                q4Var.l(3, iArr2[i18]);
                i18++;
            }
        }
        long[] jArr = this.f29393f;
        if (jArr != null && jArr.length > 0) {
            int i19 = 0;
            while (true) {
                long[] jArr2 = this.f29393f;
                if (i19 >= jArr2.length) {
                    break;
                }
                q4Var.u(4, jArr2[i19]);
                i19++;
            }
        }
        long[] jArr3 = this.f29394g;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f29394g;
                if (i15 >= jArr4.length) {
                    break;
                }
                q4Var.u(5, jArr4[i15]);
                i15++;
            }
        }
        super.b(q4Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        if (!v4.c(this.f29390c, j5Var.f29390c) || !v4.c(this.f29391d, j5Var.f29391d) || !v4.a(this.f29392e, j5Var.f29392e) || !v4.b(this.f29393f, j5Var.f29393f) || !v4.b(this.f29394g, j5Var.f29394g)) {
            return false;
        }
        t4 t4Var = this.f29537b;
        if (t4Var != null && !t4Var.b()) {
            return this.f29537b.equals(j5Var.f29537b);
        }
        t4 t4Var2 = j5Var.f29537b;
        return t4Var2 == null || t4Var2.b();
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    protected final int g() {
        long[] jArr;
        int[] iArr;
        int iG = super.g();
        String[] strArr = this.f29390c;
        int i15 = 0;
        if (strArr != null && strArr.length > 0) {
            int i16 = 0;
            int iR = 0;
            int i17 = 0;
            while (true) {
                String[] strArr2 = this.f29390c;
                if (i16 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i16];
                if (str != null) {
                    i17++;
                    iR += q4.r(str);
                }
                i16++;
            }
            iG = iG + iR + i17;
        }
        String[] strArr3 = this.f29391d;
        if (strArr3 != null && strArr3.length > 0) {
            int i18 = 0;
            int iR2 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr4 = this.f29391d;
                if (i18 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i18];
                if (str2 != null) {
                    i19++;
                    iR2 += q4.r(str2);
                }
                i18++;
            }
            iG = iG + iR2 + i19;
        }
        int[] iArr2 = this.f29392e;
        if (iArr2 != null && iArr2.length > 0) {
            int i25 = 0;
            int iZ = 0;
            while (true) {
                iArr = this.f29392e;
                if (i25 >= iArr.length) {
                    break;
                }
                iZ += q4.z(iArr[i25]);
                i25++;
            }
            iG = iG + iZ + iArr.length;
        }
        long[] jArr2 = this.f29393f;
        if (jArr2 != null && jArr2.length > 0) {
            int i26 = 0;
            int iX = 0;
            while (true) {
                jArr = this.f29393f;
                if (i26 >= jArr.length) {
                    break;
                }
                iX += q4.x(jArr[i26]);
                i26++;
            }
            iG = iG + iX + jArr.length;
        }
        long[] jArr3 = this.f29394g;
        if (jArr3 == null || jArr3.length <= 0) {
            return iG;
        }
        int iX2 = 0;
        while (true) {
            long[] jArr4 = this.f29394g;
            if (i15 >= jArr4.length) {
                return iG + iX2 + jArr4.length;
            }
            iX2 += q4.x(jArr4[i15]);
            i15++;
        }
    }

    public final int hashCode() {
        int iHashCode = (((((((((((j5.class.getName().hashCode() + 527) * 31) + v4.f(this.f29390c)) * 31) + v4.f(this.f29391d)) * 31) + v4.d(this.f29392e)) * 31) + v4.e(this.f29393f)) * 31) + v4.e(this.f29394g)) * 31;
        t4 t4Var = this.f29537b;
        return iHashCode + ((t4Var == null || t4Var.b()) ? 0 : this.f29537b.hashCode());
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ w4 clone() {
        return (j5) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.s4
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ s4 clone() {
        return (j5) clone();
    }
}
