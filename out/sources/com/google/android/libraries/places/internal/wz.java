package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class wz implements e00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e00[] f34219a;

    wz(e00... e00VarArr) {
        this.f34219a = e00VarArr;
    }

    @Override // com.google.android.libraries.places.internal.e00
    public final d00 a(Class cls) {
        for (int i15 = 0; i15 < 2; i15++) {
            e00 e00Var = this.f34219a[i15];
            if (e00Var.b(cls)) {
                return e00Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.libraries.places.internal.e00
    public final boolean b(Class cls) {
        for (int i15 = 0; i15 < 2; i15++) {
            if (this.f34219a[i15].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
