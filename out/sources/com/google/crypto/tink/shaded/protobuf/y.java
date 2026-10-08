package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected o1 unknownFields = o1.c();

    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f36317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f36318b;

        protected a(MessageType messagetype) {
            this.f36317a = messagetype;
            if (messagetype.F()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f36318b = (MessageType) F();
        }

        private static <MessageType> void D(MessageType messagetype, MessageType messagetype2) {
            c1.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType F() {
            return (MessageType) this.f36317a.L();
        }

        public BuilderType A(MessageType messagetype) {
            if (i().equals(messagetype)) {
                return this;
            }
            v();
            D(this.f36318b, messagetype);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0
        public final boolean c() {
            return y.D(this.f36318b, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) E();
            if (messagetype.c()) {
                return messagetype;
            }
            throw com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a.p(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public MessageType E() {
            if (!this.f36318b.F()) {
                return this.f36318b;
            }
            this.f36318b.G();
            return this.f36318b;
        }

        @Override // 
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) i().g();
            buildertype.f36318b = (MessageType) E();
            return buildertype;
        }

        protected final void v() {
            if (this.f36318b.F()) {
                return;
            }
            w();
        }

        protected void w() {
            MessageType messagetype = (MessageType) F();
            D(messagetype, this.f36318b);
            this.f36318b = messagetype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public MessageType i() {
            return this.f36317a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public BuilderType n(MessageType messagetype) {
            return (BuilderType) A(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public BuilderType o1(i iVar, p pVar) throws IOException {
            v();
            try {
                c1.a().d(this.f36318b).i(this.f36318b, j.P(iVar), pVar);
                return this;
            } catch (RuntimeException e15) {
                if (e15.getCause() instanceof IOException) {
                    throw ((IOException) e15.getCause());
                }
                throw e15;
            }
        }
    }

    protected static class b<T extends y<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f36319b;

        public b(T t15) {
            this.f36319b = t15;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.z0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T a(i iVar, p pVar) {
            return (T) y.Q(this.f36319b, iVar, pVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends y<MessageType, BuilderType> implements s0 {
        protected u<d> extensions = u.h();

        u<d> V() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a b() {
            return super.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a g() {
            return super.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ r0 i() {
            return super.i();
        }
    }

    static final class d implements u.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a0.d<?> f36320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f36321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final t1.b f36322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f36323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f36324e;

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public boolean C() {
            return this.f36323d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public t1.b E() {
            return this.f36322c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public t1.c L() {
            return this.f36322c.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public boolean M() {
            return this.f36324e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f36321b - dVar.f36321b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public r0.a d1(r0.a aVar, r0 r0Var) {
            return ((a) aVar).A((y) r0Var);
        }

        public a0.d<?> e() {
            return this.f36320a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public int h() {
            return this.f36321b;
        }
    }

    public static class e<ContainingType extends r0, Type> extends n<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r0 f36325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f36326b;

        public t1.b a() {
            return this.f36326b.E();
        }

        public r0 b() {
            return this.f36325a;
        }

        public int c() {
            return this.f36326b.h();
        }

        public boolean d() {
            return this.f36326b.f36323d;
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

    static Object C(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends y<T, ?>> boolean D(T t15, boolean z15) {
        byte bByteValue = ((Byte) t15.u(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = c1.a().d(t15).f(t15);
        if (z15) {
            t15.v(f.SET_MEMOIZED_IS_INITIALIZED, zF ? t15 : null);
        }
        return zF;
    }

    protected static <E> a0.i<E> I(a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.d0(size == 0 ? 10 : size * 2);
    }

    protected static Object K(r0 r0Var, String str, Object[] objArr) {
        return new e1(r0Var, str, objArr);
    }

    protected static <T extends y<T, ?>> T M(T t15, h hVar, p pVar) {
        return (T) o(P(t15, hVar, pVar));
    }

    protected static <T extends y<T, ?>> T N(T t15, InputStream inputStream, p pVar) {
        return (T) o(Q(t15, i.f(inputStream), pVar));
    }

    protected static <T extends y<T, ?>> T O(T t15, byte[] bArr, p pVar) {
        return (T) o(R(t15, bArr, 0, bArr.length, pVar));
    }

    private static <T extends y<T, ?>> T P(T t15, h hVar, p pVar) throws b0 {
        i iVarV = hVar.v();
        T t16 = (T) Q(t15, iVarV, pVar);
        try {
            iVarV.a(0);
            return t16;
        } catch (b0 e15) {
            throw e15.k(t16);
        }
    }

    static <T extends y<T, ?>> T Q(T t15, i iVar, p pVar) throws b0 {
        T t16 = (T) t15.L();
        try {
            g1 g1VarD = c1.a().d(t16);
            g1VarD.i(t16, j.P(iVar), pVar);
            g1VarD.e(t16);
            return t16;
        } catch (b0 e15) {
            e = e15;
            if (e.a()) {
                e = new b0(e);
            }
            throw e.k(t16);
        } catch (m1 e16) {
            throw e16.a().k(t16);
        } catch (IOException e17) {
            if (e17.getCause() instanceof b0) {
                throw ((b0) e17.getCause());
            }
            throw new b0(e17).k(t16);
        } catch (RuntimeException e18) {
            if (e18.getCause() instanceof b0) {
                throw ((b0) e18.getCause());
            }
            throw e18;
        }
    }

    private static <T extends y<T, ?>> T R(T t15, byte[] bArr, int i15, int i16, p pVar) throws b0 {
        T t16 = (T) t15.L();
        try {
            g1 g1VarD = c1.a().d(t16);
            g1VarD.h(t16, bArr, i15, i15 + i16, new com.google.crypto.tink.shaded.protobuf.e.b(pVar));
            g1VarD.e(t16);
            return t16;
        } catch (b0 e15) {
            b0 b0Var = e15;
            if (b0Var.a()) {
                b0Var = new b0(b0Var);
            }
            throw b0Var.k(t16);
        } catch (m1 e16) {
            throw e16.a().k(t16);
        } catch (IOException e17) {
            if (e17.getCause() instanceof b0) {
                throw ((b0) e17.getCause());
            }
            throw new b0(e17).k(t16);
        } catch (IndexOutOfBoundsException unused) {
            throw b0.n().k(t16);
        }
    }

    protected static <T extends y<?, ?>> void S(Class<T> cls, T t15) {
        t15.H();
        defaultInstanceMap.put(cls, t15);
    }

    private static <T extends y<T, ?>> T o(T t15) throws b0 {
        if (t15 == null || t15.c()) {
            return t15;
        }
        throw t15.h().a().k(t15);
    }

    private int s(g1<?> g1Var) {
        return g1Var == null ? c1.a().d(this).g(this) : g1Var.g(this);
    }

    protected static <E> a0.i<E> x() {
        return d1.g();
    }

    static <T extends y<?, ?>> T y(Class<T> cls) {
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
        T t16 = (T) ((y) r1.k(cls)).i();
        if (t16 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t16);
        return t16;
    }

    int A() {
        return this.memoizedHashCode;
    }

    boolean B() {
        return A() == 0;
    }

    boolean F() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void G() {
        c1.a().d(this).e(this);
        H();
    }

    void H() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final BuilderType g() {
        return (BuilderType) u(f.NEW_BUILDER);
    }

    MessageType L() {
        return (MessageType) u(f.NEW_MUTABLE_INSTANCE);
    }

    void T(int i15) {
        this.memoizedHashCode = i15;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final BuilderType b() {
        return (BuilderType) ((a) u(f.NEW_BUILDER)).A(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int a() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public final boolean c() {
        return D(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int d(g1 g1Var) {
        if (!F()) {
            if (a() != Integer.MAX_VALUE) {
                return a();
            }
            int iS = s(g1Var);
            k(iS);
            return iS;
        }
        int iS2 = s(g1Var);
        if (iS2 >= 0) {
            return iS2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iS2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public int e() {
        return d(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return c1.a().d(this).c(this, (y) obj);
        }
        return false;
    }

    public int hashCode() {
        if (F()) {
            return r();
        }
        if (B()) {
            T(r());
        }
        return A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final z0<MessageType> j() {
        return (z0) u(f.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    void k(int i15) {
        if (i15 >= 0) {
            this.memoizedSerializedSize = (i15 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i15);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void m(k kVar) {
        c1.a().d(this).j(this, l.P(kVar));
    }

    Object n() {
        return u(f.BUILD_MESSAGE_INFO);
    }

    void p() {
        this.memoizedHashCode = 0;
    }

    void q() {
        k(Integer.MAX_VALUE);
    }

    int r() {
        return c1.a().d(this).b(this);
    }

    protected final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType t() {
        return (BuilderType) u(f.NEW_BUILDER);
    }

    public String toString() {
        return t0.f(this, super.toString());
    }

    protected Object u(f fVar) {
        return w(fVar, null, null);
    }

    protected Object v(f fVar, Object obj) {
        return w(fVar, obj, null);
    }

    protected abstract Object w(f fVar, Object obj, Object obj2);

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final MessageType i() {
        return (MessageType) u(f.GET_DEFAULT_INSTANCE);
    }
}
