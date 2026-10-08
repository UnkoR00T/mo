package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.l2;
import com.google.android.gms.internal.vision.l2.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l2<MessageType extends l2<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends u0<MessageType, BuilderType> {
    private static Map<Object, l2<?, ?>> zzd = new ConcurrentHashMap();
    protected f5 zzb = f5.a();
    private int zzc = -1;

    protected static class a<T extends l2<T, ?>> extends v0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f31125b;

        public a(T t15) {
            this.f31125b = t15;
        }
    }

    public static abstract class b<MessageType extends l2<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends t0<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f31126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f31127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected boolean f31128c = false;

        protected b(MessageType messagetype) {
            this.f31126a = messagetype;
            this.f31127b = (MessageType) messagetype.o(f.f31137d, null, null);
        }

        private static void n(MessageType messagetype, MessageType messagetype2) {
            h4.a().c(messagetype).e(messagetype, messagetype2);
        }

        private final BuilderType o(byte[] bArr, int i15, int i16, y1 y1Var) throws u2 {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            try {
                h4.a().c(this.f31127b).h(this.f31127b, bArr, 0, i16, new a1(y1Var));
                return this;
            } catch (u2 e15) {
                throw e15;
            } catch (IOException e16) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e16);
            } catch (IndexOutOfBoundsException unused) {
                throw u2.a();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f31126a.o(f.f31138e, null, null);
            bVar.j((l2) d());
            return bVar;
        }

        @Override // com.google.android.gms.internal.vision.w3
        public final /* synthetic */ u3 e() {
            return this.f31126a;
        }

        @Override // com.google.android.gms.internal.vision.t0
        public final /* synthetic */ t0 l(byte[] bArr, int i15, int i16, y1 y1Var) {
            return o(bArr, 0, i16, y1Var);
        }

        @Override // com.google.android.gms.internal.vision.t0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final BuilderType j(MessageType messagetype) {
            if (this.f31128c) {
                p();
                this.f31128c = false;
            }
            n(this.f31127b, messagetype);
            return this;
        }

        protected void p() {
            MessageType messagetype = (MessageType) this.f31127b.o(f.f31137d, null, null);
            n(messagetype, this.f31127b);
            this.f31127b = messagetype;
        }

        @Override // com.google.android.gms.internal.vision.x3
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public MessageType d() {
            if (this.f31128c) {
                return this.f31127b;
            }
            MessageType messagetype = this.f31127b;
            h4.a().c(messagetype).a(messagetype);
            this.f31128c = true;
            return this.f31127b;
        }

        @Override // com.google.android.gms.internal.vision.x3
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final MessageType f() {
            MessageType messagetype = (MessageType) d();
            if (messagetype.h()) {
                return messagetype;
            }
            throw new d5(messagetype);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends l2<MessageType, BuilderType> implements w3 {
        protected e2<e> zzc = e2.c();

        final e2<e> x() {
            if (this.zzc.n()) {
                this.zzc = (e2) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static class d<ContainingType extends u3, Type> extends w1<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final u3 f31129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e f31130b;
    }

    static final class e implements g2<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f31131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t5 f31132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f31133c;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.g2
        public final x3 U3(x3 x3Var, u3 u3Var) {
            return ((b) x3Var).j((l2) u3Var);
        }

        @Override // com.google.android.gms.internal.vision.g2
        public final w5 a() {
            return this.f31132b.b();
        }

        @Override // com.google.android.gms.internal.vision.g2
        public final boolean c() {
            return this.f31133c;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.f31131a - ((e) obj).f31131a;
        }

        @Override // com.google.android.gms.internal.vision.g2
        public final boolean d() {
            return false;
        }

        @Override // com.google.android.gms.internal.vision.g2
        public final c4 s1(c4 c4Var, c4 c4Var2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.vision.g2
        public final int zza() {
            return this.f31131a;
        }

        @Override // com.google.android.gms.internal.vision.g2
        public final t5 zzb() {
            return this.f31132b;
        }
    }

    public static final enum f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f31134a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31135b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f31136c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f31137d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f31138e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f31139f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f31140g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f31141h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f31141h.clone();
        }
    }

    static <T extends l2<?, ?>> T m(Class<T> cls) {
        T t15 = (T) zzd.get(cls);
        if (t15 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t15 = (T) zzd.get(cls);
            } catch (ClassNotFoundException e15) {
                throw new IllegalStateException("Class initialization cannot fail.", e15);
            }
        }
        if (t15 != null) {
            return t15;
        }
        T t16 = (T) ((l2) i5.c(cls)).o(f.f31139f, null, null);
        if (t16 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, t16);
        return t16;
    }

    protected static <E> v2<E> n(v2<E> v2Var) {
        int size = v2Var.size();
        return v2Var.b(size == 0 ? 10 : size << 1);
    }

    protected static Object p(u3 u3Var, String str, Object[] objArr) {
        return new j4(u3Var, str, objArr);
    }

    static Object r(Method method, Object obj, Object... objArr) {
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

    protected static <T extends l2<?, ?>> void s(Class<T> cls, T t15) {
        zzd.put(cls, t15);
    }

    protected static final <T extends l2<T, ?>> boolean t(T t15, boolean z15) {
        byte bByteValue = ((Byte) t15.o(f.f31134a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = h4.a().c(t15).f(t15);
        if (z15) {
            t15.o(f.f31135b, zF ? t15 : null, null);
        }
        return zF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.n2, com.google.android.gms.internal.vision.t2] */
    protected static t2 v() {
        return n2.h();
    }

    protected static <E> v2<E> w() {
        return k4.h();
    }

    @Override // com.google.android.gms.internal.vision.u3
    public final /* synthetic */ x3 b() {
        b bVar = (b) o(f.f31138e, null, null);
        bVar.j(this);
        return bVar;
    }

    @Override // com.google.android.gms.internal.vision.u3
    public final /* synthetic */ x3 c() {
        return (b) o(f.f31138e, null, null);
    }

    @Override // com.google.android.gms.internal.vision.w3
    public final /* synthetic */ u3 e() {
        return (l2) o(f.f31139f, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return h4.a().c(this).g(this, (l2) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.u3
    public final void g(t1 t1Var) {
        h4.a().c(this).d(this, v1.O(t1Var));
    }

    @Override // com.google.android.gms.internal.vision.w3
    public final boolean h() {
        return t(this, true);
    }

    public int hashCode() {
        int i15 = this.zza;
        if (i15 != 0) {
            return i15;
        }
        int iB = h4.a().c(this).b(this);
        this.zza = iB;
        return iB;
    }

    @Override // com.google.android.gms.internal.vision.u0
    final void j(int i15) {
        this.zzc = i15;
    }

    @Override // com.google.android.gms.internal.vision.u0
    final int l() {
        return this.zzc;
    }

    protected abstract Object o(int i15, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.vision.u3
    public final int q() {
        if (this.zzc == -1) {
            this.zzc = h4.a().c(this).c(this);
        }
        return this.zzc;
    }

    public String toString() {
        return z3.a(this, super.toString());
    }

    protected final <MessageType extends l2<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType u() {
        return (BuilderType) o(f.f31138e, null, null);
    }
}
