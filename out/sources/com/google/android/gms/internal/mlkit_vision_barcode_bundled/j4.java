package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class j4 implements l5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p4 f29742b = new h4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p4 f29743a;

    public j4() {
        f3 f3VarC = f3.c();
        int i15 = z4.f30339d;
        i4 i4Var = new i4(f3VarC, f29742b);
        byte[] bArr = t3.f30242b;
        this.f29743a = i4Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l5
    public final k5 a(Class cls) {
        int i15 = m5.f29765b;
        if (!l3.class.isAssignableFrom(cls)) {
            int i16 = z4.f30339d;
        }
        o4 o4VarB = this.f29743a.b(cls);
        if (o4VarB.zzb()) {
            int i17 = z4.f30339d;
            return v4.a(m5.r(), z2.a(), o4VarB.zza());
        }
        int i18 = z4.f30339d;
        return u4.w(cls, o4VarB, y4.a(), f4.a(), m5.r(), o4VarB.a() + (-1) != 1 ? z2.a() : null, n4.a());
    }
}
