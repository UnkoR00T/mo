package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected o1 unknownFields = o1.c();

    public static abstract class a<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a.AbstractC0256a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f12205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f12206b;

        protected a(MessageType messagetype) {
            this.f12205a = messagetype;
            if (messagetype.H()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f12206b = (MessageType) H();
        }

        private static <MessageType> void G(MessageType messagetype, MessageType messagetype2) {
            c1.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType H() {
            return (MessageType) this.f12205a.N();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0256a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public BuilderType p(MessageType messagetype) {
            return (BuilderType) F(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public BuilderType Y0(h hVar, o oVar) throws IOException {
            x();
            try {
                c1.a().d(this.f12206b).h(this.f12206b, i.P(hVar), oVar);
                return this;
            } catch (RuntimeException e15) {
                if (e15.getCause() instanceof IOException) {
                    throw ((IOException) e15.getCause());
                }
                throw e15;
            }
        }

        public BuilderType F(MessageType messagetype) {
            if (i().equals(messagetype)) {
                return this;
            }
            x();
            G(this.f12206b, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.s0
        public final boolean c() {
            return x.G(this.f12206b, false);
        }

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) E();
            if (messagetype.c()) {
                return messagetype;
            }
            throw androidx.datastore.preferences.protobuf.a.AbstractC0256a.s(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public MessageType E() {
            if (!this.f12206b.H()) {
                return this.f12206b;
            }
            this.f12206b.I();
            return this.f12206b;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) i().g();
            buildertype.f12206b = (MessageType) E();
            return buildertype;
        }

        protected final void x() {
            if (this.f12206b.H()) {
                return;
            }
            y();
        }

        protected void y() {
            MessageType messagetype = (MessageType) H();
            G(messagetype, this.f12206b);
            this.f12206b = messagetype;
        }

        @Override // androidx.datastore.preferences.protobuf.s0
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public MessageType i() {
            return this.f12205a;
        }
    }

    protected static class b<T extends x<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f12207b;

        public b(T t15) {
            this.f12207b = t15;
        }

        @Override // androidx.datastore.preferences.protobuf.z0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(h hVar, o oVar) {
            return (T) x.P(this.f12207b, hVar, oVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends x<MessageType, BuilderType> implements s0 {
        protected t<d> extensions = t.h();

        t<d> T() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a b() {
            return super.b();
        }

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a g() {
            return super.g();
        }

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.s0
        public /* bridge */ /* synthetic */ r0 i() {
            return super.i();
        }
    }

    static final class d implements t.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f12208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s1.b f12209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f12210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f12211d;

        @Override // androidx.datastore.preferences.protobuf.t.b
        public boolean C() {
            return this.f12210c;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public s1.b E() {
            return this.f12209b;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public s1.c L() {
            return this.f12209b.b();
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public boolean M() {
            return this.f12211d;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f12208a - dVar.f12208a;
        }

        public z.b<?> e() {
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public int h() {
            return this.f12208a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.t.b
        public r0.a i2(r0.a aVar, r0 r0Var) {
            return ((a) aVar).F((x) r0Var);
        }
    }

    public static class e<ContainingType extends r0, Type> extends m<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r0 f12212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f12213b;

        public s1.b a() {
            return this.f12213b.E();
        }

        public r0 b() {
            return this.f12212a;
        }

        public int c() {
            return this.f12213b.h();
        }

        public boolean d() {
            return this.f12213b.f12210c;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    static <T extends x<?, ?>> T A(Class<T> cls) {
        T t15 = (T) defaultInstanceMap.get(cls);
        if (t15 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t15 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e15) {
                throw new IllegalStateException("Class initialization cannot fail.", e15);
            }
        }
        if (t15 != null) {
            return t15;
        }
        T t16 = (T) ((x) q1.i(cls)).i();
        if (t16 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t16);
        return t16;
    }

    static Object F(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e15);
        } catch (InvocationTargetException e16) {
            Throwable cause = e16.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends x<T, ?>> boolean G(T t15, boolean z15) {
        byte bByteValue = ((Byte) t15.w(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = c1.a().d(t15).f(t15);
        if (z15) {
            t15.x(f.SET_MEMOIZED_IS_INITIALIZED, zF ? t15 : null);
        }
        return zF;
    }

    protected static <E> z.f<E> K(z.f<E> fVar) {
        int size = fVar.size();
        return fVar.d0(size == 0 ? 10 : size * 2);
    }

    protected static Object M(r0 r0Var, String str, Object[] objArr) {
        return new e1(r0Var, str, objArr);
    }

    protected static <T extends x<T, ?>> T O(T t15, InputStream inputStream) {
        return (T) q(P(t15, h.g(inputStream), o.b()));
    }

    static <T extends x<T, ?>> T P(T t15, h hVar, o oVar) throws a0 {
        T t16 = (T) t15.N();
        try {
            g1 g1VarD = c1.a().d(t16);
            g1VarD.h(t16, i.P(hVar), oVar);
            g1VarD.e(t16);
            return t16;
        } catch (a0 e15) {
            e = e15;
            if (e.a()) {
                e = new a0(e);
            }
            throw e.k(t16);
        } catch (m1 e16) {
            throw e16.a().k(t16);
        } catch (IOException e17) {
            if (e17.getCause() instanceof a0) {
                throw ((a0) e17.getCause());
            }
            throw new a0(e17).k(t16);
        } catch (RuntimeException e18) {
            if (e18.getCause() instanceof a0) {
                throw ((a0) e18.getCause());
            }
            throw e18;
        }
    }

    protected static <T extends x<?, ?>> void Q(Class<T> cls, T t15) {
        t15.J();
        defaultInstanceMap.put(cls, t15);
    }

    private static <T extends x<T, ?>> T q(T t15) throws a0 {
        if (t15 == null || t15.c()) {
            return t15;
        }
        throw t15.k().a().k(t15);
    }

    private int u(g1<?> g1Var) {
        return g1Var == null ? c1.a().d(this).g(this) : g1Var.g(this);
    }

    protected static <E> z.f<E> z() {
        return d1.g();
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final MessageType i() {
        return (MessageType) w(f.GET_DEFAULT_INSTANCE);
    }

    int C() {
        return this.memoizedHashCode;
    }

    boolean D() {
        return C() == 0;
    }

    boolean H() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void I() {
        c1.a().d(this).e(this);
        J();
    }

    void J() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final BuilderType g() {
        return (BuilderType) w(f.NEW_BUILDER);
    }

    MessageType N() {
        return (MessageType) w(f.NEW_MUTABLE_INSTANCE);
    }

    void R(int i15) {
        this.memoizedHashCode = i15;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final BuilderType b() {
        return (BuilderType) ((a) w(f.NEW_BUILDER)).F(this);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final boolean c() {
        return G(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int e() {
        return f(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return c1.a().d(this).c(this, (x) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int f(g1 g1Var) {
        if (!H()) {
            if (d() != Integer.MAX_VALUE) {
                return d();
            }
            int iU = u(g1Var);
            n(iU);
            return iU;
        }
        int iU2 = u(g1Var);
        if (iU2 >= 0) {
            return iU2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iU2);
    }

    public int hashCode() {
        if (H()) {
            return t();
        }
        if (D()) {
            R(t());
        }
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final z0<MessageType> j() {
        return (z0) w(f.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void m(j jVar) {
        c1.a().d(this).i(this, k.P(jVar));
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void n(int i15) {
        if (i15 >= 0) {
            this.memoizedSerializedSize = (i15 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i15);
        }
    }

    Object p() {
        return w(f.BUILD_MESSAGE_INFO);
    }

    void r() {
        this.memoizedHashCode = 0;
    }

    void s() {
        n(Integer.MAX_VALUE);
    }

    int t() {
        return c1.a().d(this).b(this);
    }

    public String toString() {
        return t0.f(this, super.toString());
    }

    protected final <MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType v() {
        return (BuilderType) w(f.NEW_BUILDER);
    }

    protected Object w(f fVar) {
        return y(fVar, null, null);
    }

    protected Object x(f fVar, Object obj) {
        return y(fVar, obj, null);
    }

    protected abstract Object y(f fVar, Object obj, Object obj2);
}
