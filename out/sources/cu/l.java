package cu;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f37896a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f37897b = false;

    static class a {
        a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f37898a;

        /* synthetic */ b(Throwable th4, a aVar) {
            this(th4);
        }

        private static /* synthetic */ void a(int i15) {
            String str = i15 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i15 != 1 ? 3 : 2];
            if (i15 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i15 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i15 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        public Throwable b() {
            Throwable th4 = this.f37898a;
            if (th4 == null) {
                a(1);
            }
            return th4;
        }

        public String toString() {
            return this.f37898a.toString();
        }

        private b(Throwable th4) {
            if (th4 == null) {
                a(0);
            }
            this.f37898a = th4;
        }
    }

    public static class c extends RuntimeException {
        public c(Throwable th4) {
            super("Rethrow stored exception", th4);
        }
    }

    private static /* synthetic */ void a(int i15) {
        String str = (i15 == 1 || i15 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 1 || i15 == 2) ? 2 : 3];
        if (i15 == 1 || i15 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i15 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i15 == 1 || i15 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i15 != 1 && i15 != 2) {
            if (i15 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i15 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i15 != 1 && i15 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static <V> Object b(V v15) {
        if (v15 == null && (v15 = (V) f37896a) == null) {
            a(1);
        }
        return v15;
    }

    public static Object c(Throwable th4) {
        if (th4 == null) {
            a(3);
        }
        return new b(th4, null);
    }

    public static <V> V d(Object obj) {
        if (obj == null) {
            a(4);
        }
        return (V) e(f(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V e(Object obj) {
        if (obj == 0) {
            a(0);
        }
        if (obj == f37896a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V f(Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable thB = ((b) obj).b();
        if (f37897b && cu.c.a(thB)) {
            throw new c(thB);
        }
        throw cu.c.b(thB);
    }
}
