package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class tx implements gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jx f30640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f30642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30643d;

    tx(jx jxVar, String str, Object[] objArr) {
        this.f30640a = jxVar;
        this.f30641b = str;
        this.f30642c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f30643d = cCharAt;
            return;
        }
        int i15 = cCharAt & 8191;
        int i16 = 1;
        int i17 = 13;
        while (true) {
            int i18 = i16 + 1;
            char cCharAt2 = str.charAt(i16);
            if (cCharAt2 < 55296) {
                this.f30643d = i15 | (cCharAt2 << i17);
                return;
            } else {
                i15 |= (cCharAt2 & 8191) << i17;
                i17 += 13;
                i16 = i18;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gx
    public final boolean N() {
        return (this.f30643d & 2) == 2;
    }

    final String a() {
        return this.f30641b;
    }

    final Object[] b() {
        return this.f30642c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gx
    public final jx m() {
        return this.f30640a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gx
    public final int r() {
        int i15 = this.f30643d;
        if ((i15 & 1) != 0) {
            return 1;
        }
        return (i15 & 4) == 4 ? 3 : 2;
    }
}
