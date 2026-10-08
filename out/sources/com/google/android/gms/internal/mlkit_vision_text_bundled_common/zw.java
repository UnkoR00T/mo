package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class zw implements hx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hx[] f30722a;

    zw(hx... hxVarArr) {
        this.f30722a = hxVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.hx
    public final gx a(Class cls) {
        for (int i15 = 0; i15 < 2; i15++) {
            hx hxVar = this.f30722a[i15];
            if (hxVar.b(cls)) {
                return hxVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.hx
    public final boolean b(Class cls) {
        for (int i15 = 0; i15 < 2; i15++) {
            if (this.f30722a[i15].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
