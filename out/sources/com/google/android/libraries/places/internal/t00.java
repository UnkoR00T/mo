package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class t00 implements d00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g00 f33735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f33737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33738d;

    t00(g00 g00Var, String str, Object[] objArr) {
        this.f33735a = g00Var;
        this.f33736b = str;
        this.f33737c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f33738d = cCharAt;
            return;
        }
        int i15 = cCharAt & 8191;
        int i16 = 1;
        int i17 = 13;
        while (true) {
            int i18 = i16 + 1;
            char cCharAt2 = str.charAt(i16);
            if (cCharAt2 < 55296) {
                this.f33738d = i15 | (cCharAt2 << i17);
                return;
            } else {
                i15 |= (cCharAt2 & 8191) << i17;
                i17 += 13;
                i16 = i18;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.d00
    public final int a() {
        int i15 = this.f33738d;
        if ((i15 & 1) != 0) {
            return 1;
        }
        return (i15 & 4) == 4 ? 3 : 2;
    }

    final String b() {
        return this.f33736b;
    }

    final Object[] c() {
        return this.f33737c;
    }

    @Override // com.google.android.libraries.places.internal.d00
    public final boolean zza() {
        return (this.f33738d & 2) == 2;
    }

    @Override // com.google.android.libraries.places.internal.d00
    public final g00 zzb() {
        return this.f33735a;
    }
}
