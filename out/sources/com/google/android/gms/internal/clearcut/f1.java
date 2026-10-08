package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.f1;
import com.google.android.gms.internal.clearcut.f1.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f1<MessageType extends f1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends q<MessageType, BuilderType> {
    private static Map<Object, f1<?, ?>> zzjr = new ConcurrentHashMap();
    protected v3 zzjp = v3.h();
    private int zzjq = -1;

    public static abstract class a<MessageType extends f1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends r<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f29314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f29315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected boolean f29316c = false;

        protected a(MessageType messagetype) {
            this.f29314a = messagetype;
            this.f29315b = (MessageType) messagetype.h(e.f29323d, null, null);
        }

        private static void o(MessageType messagetype, MessageType messagetype2) {
            x2.a().d(messagetype).g(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.clearcut.n2
        public final /* synthetic */ l2 b() {
            return this.f29314a;
        }

        @Override // com.google.android.gms.internal.clearcut.m2
        public final /* synthetic */ l2 b0() {
            f1 f1Var = (f1) O0();
            byte bByteValue = ((Byte) f1Var.h(e.f29320a, null, null)).byteValue();
            boolean zF = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zF = false;
                } else {
                    zF = x2.a().d(f1Var).f(f1Var);
                    f1Var.h(e.f29321b, zF ? f1Var : null, null);
                }
            }
            if (zF) {
                return f1Var;
            }
            throw new t3(f1Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f29314a.h(e.f29324e, null, null);
            aVar.m((f1) O0());
            return aVar;
        }

        @Override // com.google.android.gms.internal.clearcut.r
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final BuilderType m(MessageType messagetype) {
            p();
            o(this.f29315b, messagetype);
            return this;
        }

        protected void p() {
            if (this.f29316c) {
                MessageType messagetype = (MessageType) this.f29315b.h(e.f29323d, null, null);
                o(messagetype, this.f29315b);
                this.f29315b = messagetype;
                this.f29316c = false;
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType O0() {
            if (this.f29316c) {
                return this.f29315b;
            }
            MessageType messagetype = this.f29315b;
            x2.a().d(messagetype).a(messagetype);
            this.f29316c = true;
            return this.f29315b;
        }

        public final MessageType s() {
            MessageType messagetype = (MessageType) O0();
            byte bByteValue = ((Byte) messagetype.h(e.f29320a, null, null)).byteValue();
            boolean zF = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zF = false;
                } else {
                    zF = x2.a().d(messagetype).f(messagetype);
                    messagetype.h(e.f29321b, zF ? messagetype : null, null);
                }
            }
            if (zF) {
                return messagetype;
            }
            throw new t3(messagetype);
        }
    }

    public static class b<T extends f1<T, ?>> extends s<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f29317b;

        public b(T t15) {
            this.f29317b = t15;
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends f1<MessageType, BuilderType> implements n2 {
        protected w0<d> zzjv = w0.k();
    }

    static final class d implements z0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f29318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j4 f29319b;

        @Override // com.google.android.gms.internal.clearcut.z0
        public final j4 D3() {
            return this.f29319b;
        }

        @Override // com.google.android.gms.internal.clearcut.z0
        public final boolean H0() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.z0
        public final r2 Q1(r2 r2Var, r2 r2Var2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.clearcut.z0
        public final o4 Y0() {
            return this.f29319b.b();
        }

        @Override // com.google.android.gms.internal.clearcut.z0
        public final int a() {
            return this.f29318a;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.f29318a - ((d) obj).f29318a;
        }

        @Override // com.google.android.gms.internal.clearcut.z0
        public final boolean o1() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.z0
        public final m2 t2(m2 m2Var, l2 l2Var) {
            return ((a) m2Var).m((f1) l2Var);
        }
    }

    public static final enum e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f29320a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29321b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f29322c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f29323d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f29324e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f29325f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f29326g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f29327h = {1, 2, 3, 4, 5, 6, 7};

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f29328i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f29329j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ int[] f29330k = {1, 2};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f29331l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f29332m = 2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ int[] f29333n = {1, 2};

        public static int[] a() {
            return (int[]) f29327h.clone();
        }
    }

    private static <T extends f1<T, ?>> T f(T t15, byte[] bArr) throws l1 {
        T t16 = (T) t15.h(e.f29323d, null, null);
        try {
            x2.a().d(t16).i(t16, bArr, 0, bArr.length, new w());
            x2.a().d(t16).a(t16);
            if (t16.zzex == 0) {
                return t16;
            }
            throw new RuntimeException();
        } catch (IOException e15) {
            if (e15.getCause() instanceof l1) {
                throw ((l1) e15.getCause());
            }
            throw new l1(e15.getMessage()).f(t16);
        } catch (IndexOutOfBoundsException unused) {
            throw l1.a().f(t16);
        }
    }

    protected static Object k(l2 l2Var, String str, Object[] objArr) {
        return new z2(l2Var, str, objArr);
    }

    static Object m(Method method, Object obj, Object... objArr) {
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

    protected static <T extends f1<?, ?>> void n(Class<T> cls, T t15) {
        zzjr.put(cls, t15);
    }

    protected static <T extends f1<T, ?>> T o(T t15, byte[] bArr) throws l1 {
        h5.b bVar = (T) f(t15, bArr);
        if (bVar != null) {
            byte bByteValue = ((Byte) bVar.h(e.f29320a, null, null)).byteValue();
            boolean zF = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zF = false;
                } else {
                    zF = x2.a().d(bVar).f(bVar);
                    bVar.h(e.f29321b, zF ? bVar : null, null);
                }
            }
            if (!zF) {
                throw new l1(new t3(bVar).getMessage()).f(bVar);
            }
        }
        return bVar;
    }

    protected static <E> k1<E> p() {
        return y2.f();
    }

    static <T extends f1<?, ?>> T q(Class<T> cls) {
        T t15 = (T) zzjr.get(cls);
        if (t15 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t15 = (T) zzjr.get(cls);
            } catch (ClassNotFoundException e15) {
                throw new IllegalStateException("Class initialization cannot fail.", e15);
            }
        }
        if (t15 != null) {
            return t15;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    @Override // com.google.android.gms.internal.clearcut.q
    final void a(int i15) {
        this.zzjq = i15;
    }

    @Override // com.google.android.gms.internal.clearcut.n2
    public final /* synthetic */ l2 b() {
        return (f1) h(e.f29325f, null, null);
    }

    @Override // com.google.android.gms.internal.clearcut.n2
    public final boolean c() {
        byte bByteValue = ((Byte) h(e.f29320a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = x2.a().d(this).f(this);
        h(e.f29321b, zF ? this : null, null);
        return zF;
    }

    @Override // com.google.android.gms.internal.clearcut.q
    final int d() {
        return this.zzjq;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((f1) h(e.f29325f, null, null)).getClass().isInstance(obj)) {
            return x2.a().d(this).c(this, (f1) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.l2
    public final /* synthetic */ m2 g() {
        a aVar = (a) h(e.f29324e, null, null);
        aVar.m(this);
        return aVar;
    }

    protected abstract Object h(int i15, Object obj, Object obj2);

    public int hashCode() {
        int i15 = this.zzex;
        if (i15 != 0) {
            return i15;
        }
        int iB = x2.a().d(this).b(this);
        this.zzex = iB;
        return iB;
    }

    @Override // com.google.android.gms.internal.clearcut.l2
    public final void i(m0 m0Var) {
        x2.a().b(getClass()).e(this, o0.b(m0Var));
    }

    @Override // com.google.android.gms.internal.clearcut.l2
    public final /* synthetic */ m2 j() {
        return (a) h(e.f29324e, null, null);
    }

    @Override // com.google.android.gms.internal.clearcut.l2
    public final int l() {
        if (this.zzjq == -1) {
            this.zzjq = x2.a().d(this).h(this);
        }
        return this.zzjq;
    }

    public String toString() {
        return o2.a(this, super.toString());
    }
}
