package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class j4 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u3 f31104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f31106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31107d;

    j4(u3 u3Var, String str, Object[] objArr) {
        this.f31104a = u3Var;
        this.f31105b = str;
        this.f31106c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f31107d = cCharAt;
            return;
        }
        int i15 = cCharAt & 8191;
        int i16 = 13;
        int i17 = 1;
        while (true) {
            int i18 = i17 + 1;
            char cCharAt2 = str.charAt(i17);
            if (cCharAt2 < 55296) {
                this.f31107d = i15 | (cCharAt2 << i16);
                return;
            } else {
                i15 |= (cCharAt2 & 8191) << i16;
                i16 += 13;
                i17 = i18;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.s3
    public final u3 a() {
        return this.f31104a;
    }

    final String b() {
        return this.f31105b;
    }

    final Object[] c() {
        return this.f31106c;
    }

    @Override // com.google.android.gms.internal.vision.s3
    public final int zza() {
        return (this.f31107d & 1) == 1 ? i4.f31074a : i4.f31075b;
    }

    @Override // com.google.android.gms.internal.vision.s3
    public final boolean zzb() {
        return (this.f31107d & 2) == 2;
    }
}
