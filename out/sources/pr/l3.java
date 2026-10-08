package pr;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public class l3 {

    public static class a<T> extends b<T> implements er.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final er.a<T> f161889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile SoftReference<Object> f161890c;

        public a(T t15, er.a<T> aVar) {
            if (aVar == null) {
                h(0);
            }
            this.f161890c = null;
            this.f161889b = aVar;
            if (t15 != null) {
                this.f161890c = new SoftReference<>(c(t15));
            }
        }

        private static /* synthetic */ void h(int i15) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // pr.l3.b, er.a
        public T a() {
            Object obj;
            SoftReference<Object> softReference = this.f161890c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return f(obj);
            }
            T tA = this.f161889b.a();
            this.f161890c = new SoftReference<>(c(tA));
            return tA;
        }
    }

    public static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f161891a = new a();

        static class a {
            a() {
            }
        }

        public abstract T a();

        protected Object c(T t15) {
            return t15 == null ? f161891a : t15;
        }

        public final T e(Object obj, Object obj2) {
            return a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T f(Object obj) {
            if (obj == f161891a) {
                return null;
            }
            return obj;
        }
    }

    private static /* synthetic */ void a(int i15) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static <T> a<T> b(er.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return c(null, aVar);
    }

    public static <T> a<T> c(T t15, er.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new a<>(t15, aVar);
    }
}
