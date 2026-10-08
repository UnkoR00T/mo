package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class a2 implements d3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k2 f29154b = new b2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f29155a;

    public a2() {
        this(new c2(e1.c(), c()));
    }

    private static boolean b(j2 j2Var) {
        return j2Var.a() == f1.e.f29328i;
    }

    private static k2 c() {
        try {
            return (k2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f29154b;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.d3
    public final <T> c3<T> a(Class<T> cls) {
        e3.I(cls);
        j2 j2VarB = this.f29155a.b(cls);
        if (j2VarB.b()) {
            return f1.class.isAssignableFrom(cls) ? q2.j(e3.B(), v0.b(), j2VarB.c()) : q2.j(e3.z(), v0.c(), j2VarB.c());
        }
        if (f1.class.isAssignableFrom(cls)) {
            return b(j2VarB) ? p2.s(cls, j2VarB, u2.b(), v1.d(), e3.B(), v0.b(), i2.b()) : p2.s(cls, j2VarB, u2.b(), v1.d(), e3.B(), null, i2.b());
        }
        boolean zB = b(j2VarB);
        s2 s2VarA = u2.a();
        v1 v1VarC = v1.c();
        return zB ? p2.s(cls, j2VarB, s2VarA, v1VarC, e3.z(), v0.c(), i2.a()) : p2.s(cls, j2VarB, s2VarA, v1VarC, e3.A(), null, i2.a());
    }

    private a2(k2 k2Var) {
        this.f29155a = (k2) h1.e(k2Var, "messageInfoFactory");
    }
}
