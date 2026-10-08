package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class n3 implements v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v3[] f31201a;

    n3(v3... v3VarArr) {
        this.f31201a = v3VarArr;
    }

    @Override // com.google.android.gms.internal.vision.v3
    public final boolean a(Class<?> cls) {
        for (v3 v3Var : this.f31201a) {
            if (v3Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.v3
    public final s3 b(Class<?> cls) {
        for (v3 v3Var : this.f31201a) {
            if (v3Var.a(cls)) {
                return v3Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
