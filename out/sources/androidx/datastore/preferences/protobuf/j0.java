package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class j0 implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q0 f12010b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f12011a;

    class a implements q0 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public p0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12012a;

        static {
            int[] iArr = new int[b1.values().length];
            f12012a = iArr;
            try {
                iArr[b1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q0[] f12013a;

        c(q0... q0VarArr) {
            this.f12013a = q0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public p0 a(Class<?> cls) {
            for (q0 q0Var : this.f12013a) {
                if (q0Var.b(cls)) {
                    return q0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public boolean b(Class<?> cls) {
            for (q0 q0Var : this.f12013a) {
                if (q0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j0() {
        this(c());
    }

    private static boolean b(p0 p0Var) {
        return b.f12012a[p0Var.c().ordinal()] != 1;
    }

    private static q0 c() {
        return new c(w.c(), d());
    }

    private static q0 d() {
        if (c1.f11932d) {
            return f12010b;
        }
        try {
            return (q0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f12010b;
        }
    }

    private static <T> g1<T> e(Class<T> cls, p0 p0Var) {
        if (f(cls)) {
            return u0.O(cls, p0Var, y0.b(), h0.b(), i1.L(), b(p0Var) ? r.b() : null, o0.b());
        }
        w0 w0VarA = y0.a();
        p<?> pVarA = null;
        f0 f0VarA = h0.a();
        n1<?, ?> n1VarK = i1.K();
        if (b(p0Var)) {
            pVarA = r.a();
        }
        return u0.O(cls, p0Var, w0VarA, f0VarA, n1VarK, pVarA, o0.a());
    }

    private static boolean f(Class<?> cls) {
        return c1.f11932d || x.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.h1
    public <T> g1<T> a(Class<T> cls) {
        i1.H(cls);
        p0 p0VarA = this.f12011a.a(cls);
        if (p0VarA.a()) {
            return f(cls) ? v0.l(i1.L(), r.b(), p0VarA.b()) : v0.l(i1.K(), r.a(), p0VarA.b());
        }
        return e(cls, p0VarA);
    }

    private j0(q0 q0Var) {
        this.f12011a = (q0) z.b(q0Var, "messageInfoFactory");
    }
}
