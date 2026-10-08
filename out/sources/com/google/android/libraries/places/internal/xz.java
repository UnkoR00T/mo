package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class xz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e00 f34326b = new vz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e00 f34327a;

    public xz() {
        ty tyVarC = ty.c();
        int i15 = kx.f32765a;
        this.f34327a = new wz(tyVarC, f34326b);
    }

    public final v00 a(Class cls) {
        int i15 = w00.f34098b;
        if (!az.class.isAssignableFrom(cls)) {
            int i16 = kx.f32765a;
        }
        d00 d00VarA = this.f34327a.a(cls);
        if (d00VarA.zza()) {
            int i17 = kx.f32765a;
            return l00.i(w00.a(), oy.a(), d00VarA.zzb());
        }
        int i18 = kx.f32765a;
        return k00.w(cls, d00VarA, o00.a(), tz.a(), w00.a(), d00VarA.a() + (-1) != 1 ? oy.a() : null, c00.a());
    }
}
