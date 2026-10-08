package vr;

/* JADX INFO: loaded from: classes4.dex */
public interface h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f208052a = new a();

    static class a implements h1 {
        a() {
        }

        private static /* synthetic */ void d(int i15) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // vr.h1
        public i1 b() {
            i1 i1Var = i1.f208053a;
            if (i1Var == null) {
                d(0);
            }
            return i1Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    i1 b();
}
