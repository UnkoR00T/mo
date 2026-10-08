package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class wl extends yl {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ xl f30680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    wl(xl xlVar, zl zlVar, CharSequence charSequence) {
        super(zlVar, charSequence);
        this.f30680f = xlVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yl
    public final int d(int i15) {
        return i15 + this.f30680f.f30701a.length();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yl
    public final int e(int i15) {
        int length = this.f30706c.length();
        int length2 = this.f30680f.f30701a.length();
        int i16 = length - length2;
        while (i15 <= i16) {
            for (int i17 = 0; i17 < length2; i17++) {
                if (this.f30706c.charAt(i17 + i15) != this.f30680f.f30701a.charAt(i17)) {
                    i15++;
                }
            }
            return i15;
        }
        return -1;
    }
}
