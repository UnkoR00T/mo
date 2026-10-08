package rt;

import fu.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import oq.i0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public class f implements rt.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f175954d = r.q1(f.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rt.n f175955e = new a("NO_LOCKS", InterfaceC4486f.f175964a, rt.e.f175953b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final rt.k f175956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4486f f175957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f175958c;

    static class a extends f {
        a(String str, InterfaceC4486f interfaceC4486f, rt.k kVar) {
            super(str, interfaceC4486f, kVar, null);
        }

        private static /* synthetic */ void j(int i15) {
            String str = i15 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i15 != 1 ? 3 : 2];
            if (i15 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i15 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i15 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i15 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // rt.f
        protected <K, V> o<V> p(String str, K k15) {
            if (str == null) {
                j(0);
            }
            o<V> oVarA = o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends j<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f175959d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, er.a aVar, Object obj) {
            super(fVar, aVar);
            this.f175959d = obj;
        }

        private static /* synthetic */ void c(int i15) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // rt.f.h
        protected o<T> f(boolean z15) {
            o<T> oVarD = o.d(this.f175959d);
            if (oVarD == null) {
                c(0);
            }
            return oVarD;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> extends k<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.l f175961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l f175962f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, er.a aVar, er.l lVar, er.l lVar2) {
            super(fVar, aVar);
            this.f175961e = lVar;
            this.f175962f = lVar2;
        }

        private static /* synthetic */ void c(int i15) {
            String str = i15 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i15 != 2 ? 2 : 3];
            if (i15 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i15 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i15 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i15 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // rt.f.h
        protected o<T> f(boolean z15) {
            er.l lVar = this.f175961e;
            if (lVar == null) {
                o<T> oVarF = super.f(z15);
                if (oVarF == null) {
                    c(0);
                }
                return oVarF;
            }
            o<T> oVarD = o.d(lVar.b(Boolean.valueOf(z15)));
            if (oVarD == null) {
                c(1);
            }
            return oVarD;
        }

        @Override // rt.f.i
        protected void h(T t15) {
            if (t15 == null) {
                c(2);
            }
            this.f175962f.b(t15);
        }
    }

    private static class d<K, V> extends e<K, V> implements rt.a<K, V> {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void e(int i15) {
            String str = i15 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i15 != 3 ? 3 : 2];
            if (i15 == 1) {
                objArr[0] = "map";
            } else if (i15 == 2) {
                objArr[0] = "computation";
            } else if (i15 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i15 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i15 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i15 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // rt.f.e, rt.a
        public V c(K k15, er.a<? extends V> aVar) {
            if (aVar == null) {
                e(2);
            }
            V v15 = (V) super.c(k15, aVar);
            if (v15 == null) {
                e(3);
            }
            return v15;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                e(0);
            }
            if (concurrentMap == null) {
                e(1);
            }
        }
    }

    private static class e<K, V> extends l<g<K, V>, V> implements rt.b<K, V> {

        class a implements er.l<g<K, V>, V> {
            a() {
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public V b(g<K, V> gVar) {
                return (V) ((g) gVar).f175966b.a();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void e(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "map";
            } else if (i15 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i15 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V c(K k15, er.a<? extends V> aVar) {
            if (aVar == null) {
                e(2);
            }
            return b(new g(k15, aVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                e(0);
            }
            if (concurrentMap == null) {
                e(1);
            }
        }
    }

    /* JADX INFO: renamed from: rt.f$f, reason: collision with other inner class name */
    public interface InterfaceC4486f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterfaceC4486f f175964a = new a();

        /* JADX INFO: renamed from: rt.f$f$a */
        static class a implements InterfaceC4486f {
            a() {
            }

            private static /* synthetic */ void b(int i15) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // rt.f.InterfaceC4486f
            public RuntimeException a(Throwable th4) {
                if (th4 == null) {
                    b(0);
                }
                throw cu.c.b(th4);
            }
        }

        RuntimeException a(Throwable th4);
    }

    private static class g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f175965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final er.a<? extends V> f175966b;

        public g(K k15, er.a<? extends V> aVar) {
            this.f175965a = k15;
            this.f175966b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f175965a.equals(((g) obj).f175965a);
        }

        public int hashCode() {
            return this.f175965a.hashCode();
        }
    }

    private static class h<T> implements rt.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f175967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final er.a<? extends T> f175968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f175969c;

        public h(f fVar, er.a<? extends T> aVar) {
            if (fVar == null) {
                c(0);
            }
            if (aVar == null) {
                c(1);
            }
            this.f175969c = n.NOT_COMPUTED;
            this.f175967a = fVar;
            this.f175968b = aVar;
        }

        private static /* synthetic */ void c(int i15) {
            String str = (i15 == 2 || i15 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i15 == 2 || i15 == 3) ? 2 : 3];
            if (i15 == 1) {
                objArr[0] = "computable";
            } else if (i15 == 2 || i15 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i15 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i15 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i15 != 2 && i15 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 != 2 && i15 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // er.a
        public T a() {
            T tA;
            o<T> oVarF;
            Object obj = this.f175969c;
            if (!(obj instanceof n)) {
                return (T) cu.l.f(obj);
            }
            this.f175967a.f175956a.lock();
            try {
                Object obj2 = this.f175969c;
                if (obj2 instanceof n) {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f175969c = n.RECURSION_WAS_DETECTED;
                        o<T> oVarF2 = f(true);
                        if (!oVarF2.c()) {
                            tA = oVarF2.b();
                        } else if (obj2 == n.RECURSION_WAS_DETECTED) {
                            oVarF = f(false);
                            if (oVarF.c()) {
                                this.f175969c = nVar;
                                try {
                                    tA = this.f175968b.a();
                                    e(tA);
                                    this.f175969c = tA;
                                } catch (Throwable th4) {
                                    if (cu.c.a(th4)) {
                                        this.f175969c = n.NOT_COMPUTED;
                                        throw th4;
                                    }
                                    if (this.f175969c == n.COMPUTING) {
                                        this.f175969c = cu.l.c(th4);
                                    }
                                    throw this.f175967a.f175957b.a(th4);
                                }
                            } else {
                                tA = oVarF.b();
                            }
                        } else {
                            this.f175969c = nVar;
                            tA = this.f175968b.a();
                            e(tA);
                            this.f175969c = tA;
                        }
                    } else if (obj2 == n.RECURSION_WAS_DETECTED) {
                        oVarF = f(false);
                        if (oVarF.c()) {
                            tA = oVarF.b();
                        } else {
                            this.f175969c = nVar;
                            tA = this.f175968b.a();
                            e(tA);
                            this.f175969c = tA;
                        }
                    } else {
                        this.f175969c = nVar;
                        tA = this.f175968b.a();
                        e(tA);
                        this.f175969c = tA;
                    }
                } else {
                    tA = (T) cu.l.f(obj2);
                }
                this.f175967a.f175956a.unlock();
                return tA;
            } catch (Throwable th5) {
                this.f175967a.f175956a.unlock();
                throw th5;
            }
        }

        protected void e(T t15) {
        }

        protected o<T> f(boolean z15) {
            o<T> oVarP = this.f175967a.p("in a lazy value", null);
            if (oVarP == null) {
                c(2);
            }
            return oVarP;
        }

        public boolean t() {
            return (this.f175969c == n.NOT_COMPUTED || this.f175969c == n.COMPUTING) ? false : true;
        }
    }

    private static abstract class i<T> extends h<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile rt.l<T> f175970d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, er.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                c(0);
            }
            if (aVar == null) {
                c(1);
            }
            this.f175970d = null;
        }

        private static /* synthetic */ void c(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // rt.f.h, er.a
        public T a() {
            rt.l<T> lVar = this.f175970d;
            return (lVar == null || !lVar.b()) ? (T) super.a() : lVar.a();
        }

        @Override // rt.f.h
        protected final void e(T t15) {
            this.f175970d = new rt.l<>(t15);
            try {
                h(t15);
            } finally {
                this.f175970d = null;
            }
        }

        protected abstract void h(T t15);
    }

    private static class j<T> extends h<T> implements rt.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, er.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                c(0);
            }
            if (aVar == null) {
                c(1);
            }
        }

        private static /* synthetic */ void c(int i15) {
            String str = i15 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i15 != 2 ? 3 : 2];
            if (i15 == 1) {
                objArr[0] = "computable";
            } else if (i15 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i15 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i15 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // rt.f.h, er.a
        public T a() {
            T t15 = (T) super.a();
            if (t15 == null) {
                c(2);
            }
            return t15;
        }
    }

    private static abstract class k<T> extends i<T> implements rt.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, er.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                c(0);
            }
            if (aVar == null) {
                c(1);
            }
        }

        private static /* synthetic */ void c(int i15) {
            String str = i15 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i15 != 2 ? 3 : 2];
            if (i15 == 1) {
                objArr[0] = "computable";
            } else if (i15 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i15 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i15 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // rt.f.i, rt.f.h, er.a
        public T a() {
            T t15 = (T) super.a();
            if (t15 == null) {
                c(2);
            }
            return t15;
        }
    }

    private static class l<K, V> implements rt.h<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f175971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentMap<K, Object> f175972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final er.l<? super K, ? extends V> f175973c;

        public l(f fVar, ConcurrentMap<K, Object> concurrentMap, er.l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                e(0);
            }
            if (concurrentMap == null) {
                e(1);
            }
            if (lVar == null) {
                e(2);
            }
            this.f175971a = fVar;
            this.f175972b = concurrentMap;
            this.f175973c = lVar;
        }

        private static /* synthetic */ void e(int i15) {
            String str = (i15 == 3 || i15 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i15 == 3 || i15 == 4) ? 2 : 3];
            if (i15 == 1) {
                objArr[0] = "map";
            } else if (i15 == 2) {
                objArr[0] = "compute";
            } else if (i15 == 3 || i15 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i15 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i15 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i15 != 3 && i15 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 != 3 && i15 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        private AssertionError f(K k15, Object obj) {
            return (AssertionError) f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k15 + " under " + this.f175971a));
        }

        private AssertionError h(K k15, Object obj) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + k15 + ". Old value is " + obj + " under " + this.f175971a));
            if (assertionError == null) {
                e(4);
            }
            return assertionError;
        }

        private AssertionError l(K k15, Throwable th4) {
            return (AssertionError) f.q(new AssertionError("Unable to remove " + k15 + " under " + this.f175971a, th4));
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #3 {all -> 0x007e, blocks: (B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x005a, outer: #1 }] */
        @Override // er.l
        public V b(K k15) {
            AssertionError assertionErrorH;
            V vB;
            Object objPut;
            V vB2;
            o<V> oVarI;
            Object obj = this.f175972b.get(k15);
            if (obj != null && obj != n.COMPUTING) {
                return (V) cu.l.d(obj);
            }
            this.f175971a.f175956a.lock();
            try {
                Object obj2 = this.f175972b.get(k15);
                n nVar = n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = n.RECURSION_WAS_DETECTED;
                    o<V> oVarI2 = i(k15, true);
                    if (!oVarI2.c()) {
                        vB2 = oVarI2.b();
                    } else if (obj2 == n.RECURSION_WAS_DETECTED) {
                        oVarI = i(k15, false);
                        if (!oVarI.c()) {
                            vB2 = oVarI.b();
                        } else {
                            if (obj2 != null) {
                                assertionErrorH = null;
                                try {
                                    this.f175972b.put(k15, nVar);
                                    vB = this.f175973c.b(k15);
                                    objPut = this.f175972b.put(k15, cu.l.b(vB));
                                    if (objPut == nVar) {
                                        this.f175971a.f175956a.unlock();
                                        return vB;
                                    }
                                    assertionErrorH = h(k15, objPut);
                                    throw assertionErrorH;
                                } catch (Throwable th4) {
                                    if (cu.c.a(th4)) {
                                        try {
                                            Object objRemove = this.f175972b.remove(k15);
                                            if (objRemove != n.COMPUTING) {
                                                throw f(k15, objRemove);
                                            }
                                            throw th4;
                                        } catch (Throwable th5) {
                                            throw l(k15, th5);
                                        }
                                    }
                                    if (th4 != assertionErrorH) {
                                        Object objPut2 = this.f175972b.put(k15, cu.l.c(th4));
                                        if (objPut2 != n.COMPUTING) {
                                            throw h(k15, objPut2);
                                        }
                                        throw this.f175971a.f175957b.a(th4);
                                    }
                                    try {
                                        this.f175972b.remove(k15);
                                        throw this.f175971a.f175957b.a(th4);
                                    } catch (Throwable th6) {
                                        throw l(k15, th6);
                                    }
                                }
                                this.f175971a.f175956a.unlock();
                                throw th;
                            }
                            vB2 = (V) cu.l.d(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            assertionErrorH = null;
                            this.f175972b.put(k15, nVar);
                            vB = this.f175973c.b(k15);
                            objPut = this.f175972b.put(k15, cu.l.b(vB));
                            if (objPut == nVar) {
                                this.f175971a.f175956a.unlock();
                                return vB;
                            }
                            assertionErrorH = h(k15, objPut);
                            throw assertionErrorH;
                            this.f175971a.f175956a.unlock();
                            throw th;
                        }
                        vB2 = (V) cu.l.d(obj2);
                    }
                } else if (obj2 == n.RECURSION_WAS_DETECTED) {
                    oVarI = i(k15, false);
                    if (!oVarI.c()) {
                        vB2 = oVarI.b();
                    } else {
                        if (obj2 != null) {
                            assertionErrorH = null;
                            this.f175972b.put(k15, nVar);
                            vB = this.f175973c.b(k15);
                            objPut = this.f175972b.put(k15, cu.l.b(vB));
                            if (objPut == nVar) {
                                this.f175971a.f175956a.unlock();
                                return vB;
                            }
                            assertionErrorH = h(k15, objPut);
                            throw assertionErrorH;
                            this.f175971a.f175956a.unlock();
                            throw th;
                        }
                        vB2 = (V) cu.l.d(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        assertionErrorH = null;
                        this.f175972b.put(k15, nVar);
                        vB = this.f175973c.b(k15);
                        objPut = this.f175972b.put(k15, cu.l.b(vB));
                        if (objPut == nVar) {
                            this.f175971a.f175956a.unlock();
                            return vB;
                        }
                        assertionErrorH = h(k15, objPut);
                        throw assertionErrorH;
                        this.f175971a.f175956a.unlock();
                        throw th;
                    }
                    vB2 = (V) cu.l.d(obj2);
                }
                this.f175971a.f175956a.unlock();
                return vB2;
            } catch (Throwable th7) {
                this.f175971a.f175956a.unlock();
                throw th7;
            }
        }

        protected o<V> i(K k15, boolean z15) {
            o<V> oVarP = this.f175971a.p("", k15);
            if (oVarP == null) {
                e(3);
            }
            return oVarP;
        }

        @Override // rt.h
        public boolean y(K k15) {
            Object obj = this.f175972b.get(k15);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }
    }

    private static class m<K, V> extends l<K, V> implements rt.g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap<K, Object> concurrentMap, er.l<? super K, ? extends V> lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                e(0);
            }
            if (concurrentMap == null) {
                e(1);
            }
            if (lVar == null) {
                e(2);
            }
        }

        private static /* synthetic */ void e(int i15) {
            String str = i15 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i15 != 3 ? 3 : 2];
            if (i15 == 1) {
                objArr[0] = "map";
            } else if (i15 == 2) {
                objArr[0] = "compute";
            } else if (i15 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i15 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i15 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // rt.f.l, er.l
        public V b(K k15) {
            V v15 = (V) super.b(k15);
            if (v15 == null) {
                e(3);
            }
            return v15;
        }
    }

    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f175978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f175979b;

        private o(T t15, boolean z15) {
            this.f175978a = t15;
            this.f175979b = z15;
        }

        public static <T> o<T> a() {
            return new o<>(null, true);
        }

        public static <T> o<T> d(T t15) {
            return new o<>(t15, false);
        }

        public T b() {
            return this.f175978a;
        }

        public boolean c() {
            return this.f175979b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f175978a);
        }
    }

    /* synthetic */ f(String str, InterfaceC4486f interfaceC4486f, rt.k kVar, a aVar) {
        this(str, interfaceC4486f, kVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    private static /* synthetic */ void j(int i15) {
        String str = (i15 == 10 || i15 == 13 || i15 == 20 || i15 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 10 || i15 == 13 || i15 == 20 || i15 == 37) ? 2 : 3];
        if (i15 == 1 || i15 == 3 || i15 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i15 != 6) {
            switch (i15) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case BERTags.DATE /* 31 */:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i15 == 10 || i15 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i15 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i15 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i15) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case BERTags.DATE /* 31 */:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 10 && i15 != 13 && i15 != 20 && i15 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Throwable> T q(T t15) {
        if (t15 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t15.getStackTrace();
        int length = stackTrace.length;
        int i15 = 0;
        while (i15 < length) {
            if (!stackTrace[i15].getClassName().startsWith(f175954d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i15, length);
                t15.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
                return t15;
            }
            i15++;
        }
        i15 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i15, length);
        t15.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
        return t15;
    }

    @Override // rt.n
    public <K, V> rt.h<K, V> a(er.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        rt.h<K, V> hVarO = o(lVar, m());
        if (hVarO == null) {
            j(20);
        }
        return hVarO;
    }

    @Override // rt.n
    public <K, V> rt.a<K, V> b() {
        return new d(this, m(), null);
    }

    @Override // rt.n
    public <T> rt.j<T> c(er.a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    @Override // rt.n
    public <T> rt.i<T> d(er.a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // rt.n
    public <T> T e(er.a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f175956a.lock();
        try {
            T tA = aVar.a();
            this.f175956a.unlock();
            return tA;
        } catch (Throwable th4) {
            try {
                throw this.f175957b.a(th4);
            } catch (Throwable th5) {
                this.f175956a.unlock();
                throw th5;
            }
        }
    }

    @Override // rt.n
    public <T> rt.i<T> f(er.a<? extends T> aVar, T t15) {
        if (aVar == null) {
            j(26);
        }
        if (t15 == null) {
            j(27);
        }
        return new b(this, aVar, t15);
    }

    @Override // rt.n
    public <K, V> rt.b<K, V> g() {
        return new e(this, m(), null);
    }

    @Override // rt.n
    public <T> rt.i<T> h(er.a<? extends T> aVar, er.l<? super Boolean, ? extends T> lVar, er.l<? super T, i0> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // rt.n
    public <K, V> rt.g<K, V> i(er.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        rt.g<K, V> gVarN = n(lVar, m());
        if (gVarN == null) {
            j(10);
        }
        return gVarN;
    }

    public <K, V> rt.g<K, V> n(er.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    public <K, V> rt.h<K, V> o(er.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    protected <K, V> o<V> p(String str, K k15) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Recursion detected ");
        sb5.append(str);
        if (k15 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k15;
        }
        sb5.append(str2);
        sb5.append(" under ");
        sb5.append(this);
        throw ((AssertionError) q(new AssertionError(sb5.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f175958c + ")";
    }

    private f(String str, InterfaceC4486f interfaceC4486f, rt.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC4486f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f175956a = kVar;
        this.f175957b = interfaceC4486f;
        this.f175958c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (er.l<InterruptedException, i0>) null);
    }

    public f(String str, Runnable runnable, er.l<InterruptedException, i0> lVar) {
        this(str, InterfaceC4486f.f175964a, rt.k.f175980a.a(runnable, lVar));
    }
}
