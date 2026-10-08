package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class c2 implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k2[] f29278a;

    c2(k2... k2VarArr) {
        this.f29278a = k2VarArr;
    }

    @Override // com.google.android.gms.internal.clearcut.k2
    public final boolean a(Class<?> cls) {
        for (k2 k2Var : this.f29278a) {
            if (k2Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.k2
    public final j2 b(Class<?> cls) {
        for (k2 k2Var : this.f29278a) {
            if (k2Var.a(cls)) {
                return k2Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
