package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class i4 implements p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p4[] f29736a;

    i4(p4... p4VarArr) {
        this.f29736a = p4VarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p4
    public final boolean a(Class cls) {
        for (int i15 = 0; i15 < 2; i15++) {
            if (this.f29736a[i15].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p4
    public final o4 b(Class cls) {
        for (int i15 = 0; i15 < 2; i15++) {
            p4 p4Var = this.f29736a[i15];
            if (p4Var.a(cls)) {
                return p4Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
