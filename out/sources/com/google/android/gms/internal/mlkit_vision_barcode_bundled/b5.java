package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class b5 implements o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r4 f29652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f29654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29655d;

    b5(r4 r4Var, String str, Object[] objArr) {
        this.f29652a = r4Var;
        this.f29653b = str;
        this.f29654c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f29655d = cCharAt;
            return;
        }
        int i15 = cCharAt & 8191;
        int i16 = 1;
        int i17 = 13;
        while (true) {
            int i18 = i16 + 1;
            char cCharAt2 = str.charAt(i16);
            if (cCharAt2 < 55296) {
                this.f29655d = i15 | (cCharAt2 << i17);
                return;
            } else {
                i15 |= (cCharAt2 & 8191) << i17;
                i17 += 13;
                i16 = i18;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o4
    public final int a() {
        int i15 = this.f29655d;
        if ((i15 & 1) != 0) {
            return 1;
        }
        return (i15 & 4) == 4 ? 3 : 2;
    }

    final String b() {
        return this.f29653b;
    }

    final Object[] c() {
        return this.f29654c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o4
    public final r4 zza() {
        return this.f29652a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o4
    public final boolean zzb() {
        return (this.f29655d & 2) == 2;
    }
}
