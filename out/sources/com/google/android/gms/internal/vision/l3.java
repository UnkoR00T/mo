package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class l3 implements n4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v3 f31142b = new k3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v3 f31143a;

    public l3() {
        this(new n3(m2.c(), b()));
    }

    private static v3 b() {
        try {
            return (v3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f31142b;
        }
    }

    private static boolean c(s3 s3Var) {
        return s3Var.zza() == i4.f31074a;
    }

    @Override // com.google.android.gms.internal.vision.n4
    public final <T> l4<T> a(Class<T> cls) {
        m4.p(cls);
        s3 s3VarB = this.f31143a.b(cls);
        if (s3VarB.zzb()) {
            return l2.class.isAssignableFrom(cls) ? a4.i(m4.B(), b2.a(), s3VarB.a()) : a4.i(m4.f(), b2.b(), s3VarB.a());
        }
        if (l2.class.isAssignableFrom(cls)) {
            return c(s3VarB) ? y3.o(cls, s3VarB, d4.b(), e3.c(), m4.B(), b2.a(), t3.b()) : y3.o(cls, s3VarB, d4.b(), e3.c(), m4.B(), null, t3.b());
        }
        return c(s3VarB) ? y3.o(cls, s3VarB, d4.a(), e3.a(), m4.f(), b2.b(), t3.a()) : y3.o(cls, s3VarB, d4.a(), e3.a(), m4.v(), null, t3.a());
    }

    private l3(v3 v3Var) {
        this.f31143a = (v3) p2.f(v3Var, "messageInfoFactory");
    }
}
