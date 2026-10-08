package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class j0 implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q0 f36107b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f36108a;

    class a implements q0 {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public p0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    private static class b implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q0[] f36109a;

        b(q0... q0VarArr) {
            this.f36109a = q0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public p0 a(Class<?> cls) {
            for (q0 q0Var : this.f36109a) {
                if (q0Var.b(cls)) {
                    return q0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public boolean b(Class<?> cls) {
            for (q0 q0Var : this.f36109a) {
                if (q0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j0() {
        this(b());
    }

    private static q0 b() {
        return new b(x.c(), c());
    }

    private static q0 c() {
        try {
            return (q0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f36107b;
        }
    }

    private static boolean d(p0 p0Var) {
        return p0Var.c() == b1.PROTO2;
    }

    private static <T> g1<T> e(Class<T> cls, p0 p0Var) {
        if (y.class.isAssignableFrom(cls)) {
            return d(p0Var) ? u0.U(cls, p0Var, y0.b(), h0.b(), i1.M(), s.b(), o0.b()) : u0.U(cls, p0Var, y0.b(), h0.b(), i1.M(), null, o0.b());
        }
        return d(p0Var) ? u0.U(cls, p0Var, y0.a(), h0.a(), i1.H(), s.a(), o0.a()) : u0.U(cls, p0Var, y0.a(), h0.a(), i1.I(), null, o0.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public <T> g1<T> a(Class<T> cls) {
        i1.J(cls);
        p0 p0VarA = this.f36108a.a(cls);
        if (p0VarA.a()) {
            return y.class.isAssignableFrom(cls) ? v0.m(i1.M(), s.b(), p0VarA.b()) : v0.m(i1.H(), s.a(), p0VarA.b());
        }
        return e(cls, p0VarA);
    }

    private j0(q0 q0Var) {
        this.f36108a = (q0) a0.b(q0Var, "messageInfoFactory");
    }
}
