package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f36175a = D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f36176b = com.google.crypto.tink.shaded.protobuf.d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f36177c = o(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f36178d = o(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f36179e = B();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f36180f = T();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f36181g = S();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f36182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f36183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f36184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f36185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f36186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f36187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f36188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f36189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f36190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f36191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f36192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f36193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f36194t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f36195u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f36196v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f36197w;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean c(Object obj, long j15) {
            return r1.f36197w ? r1.s(obj, j15) : r1.t(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public byte d(Object obj, long j15) {
            return r1.f36197w ? r1.v(obj, j15) : r1.w(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public double e(Object obj, long j15) {
            return Double.longBitsToDouble(h(obj, j15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public float f(Object obj, long j15) {
            return Float.intBitsToFloat(g(obj, j15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void k(Object obj, long j15, boolean z15) {
            if (r1.f36197w) {
                r1.I(obj, j15, z15);
            } else {
                r1.J(obj, j15, z15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void l(Object obj, long j15, byte b15) {
            if (r1.f36197w) {
                r1.L(obj, j15, b15);
            } else {
                r1.M(obj, j15, b15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void m(Object obj, long j15, double d15) {
            p(obj, j15, Double.doubleToLongBits(d15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void n(Object obj, long j15, float f15) {
            o(obj, j15, Float.floatToIntBits(f15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean s() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean c(Object obj, long j15) {
            return r1.f36197w ? r1.s(obj, j15) : r1.t(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public byte d(Object obj, long j15) {
            return r1.f36197w ? r1.v(obj, j15) : r1.w(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public double e(Object obj, long j15) {
            return Double.longBitsToDouble(h(obj, j15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public float f(Object obj, long j15) {
            return Float.intBitsToFloat(g(obj, j15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void k(Object obj, long j15, boolean z15) {
            if (r1.f36197w) {
                r1.I(obj, j15, z15);
            } else {
                r1.J(obj, j15, z15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void l(Object obj, long j15, byte b15) {
            if (r1.f36197w) {
                r1.L(obj, j15, b15);
            } else {
                r1.M(obj, j15, b15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void m(Object obj, long j15, double d15) {
            p(obj, j15, Double.doubleToLongBits(d15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void n(Object obj, long j15, float f15) {
            o(obj, j15, Float.floatToIntBits(f15));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean s() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean c(Object obj, long j15) {
            return this.f36198a.getBoolean(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public byte d(Object obj, long j15) {
            return this.f36198a.getByte(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public double e(Object obj, long j15) {
            return this.f36198a.getDouble(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public float f(Object obj, long j15) {
            return this.f36198a.getFloat(obj, j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void k(Object obj, long j15, boolean z15) {
            this.f36198a.putBoolean(obj, j15, z15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void l(Object obj, long j15, byte b15) {
            this.f36198a.putByte(obj, j15, b15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void m(Object obj, long j15, double d15) {
            this.f36198a.putDouble(obj, j15, d15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void n(Object obj, long j15, float f15) {
            this.f36198a.putFloat(obj, j15, f15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f36198a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th4) {
                r1.G(th4);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f36198a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th4) {
                r1.G(th4);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f36198a;

        e(Unsafe unsafe) {
            this.f36198a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f36198a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f36198a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j15);

        public abstract byte d(Object obj, long j15);

        public abstract double e(Object obj, long j15);

        public abstract float f(Object obj, long j15);

        public final int g(Object obj, long j15) {
            return this.f36198a.getInt(obj, j15);
        }

        public final long h(Object obj, long j15) {
            return this.f36198a.getLong(obj, j15);
        }

        public final Object i(Object obj, long j15) {
            return this.f36198a.getObject(obj, j15);
        }

        public final long j(Field field) {
            return this.f36198a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j15, boolean z15);

        public abstract void l(Object obj, long j15, byte b15);

        public abstract void m(Object obj, long j15, double d15);

        public abstract void n(Object obj, long j15, float f15);

        public final void o(Object obj, long j15, int i15) {
            this.f36198a.putInt(obj, j15, i15);
        }

        public final void p(Object obj, long j15, long j16) {
            this.f36198a.putLong(obj, j15, j16);
        }

        public final void q(Object obj, long j15, Object obj2) {
            this.f36198a.putObject(obj, j15, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f36198a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th4) {
                r1.G(th4);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f36198a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return r1.n() != null;
            } catch (Throwable th4) {
                r1.G(th4);
                return false;
            }
        }
    }

    static {
        long jL = l(byte[].class);
        f36182h = jL;
        f36183i = l(boolean[].class);
        f36184j = m(boolean[].class);
        f36185k = l(int[].class);
        f36186l = m(int[].class);
        f36187m = l(long[].class);
        f36188n = m(long[].class);
        f36189o = l(float[].class);
        f36190p = m(float[].class);
        f36191q = l(double[].class);
        f36192r = m(double[].class);
        f36193s = l(Object[].class);
        f36194t = m(Object[].class);
        f36195u = q(n());
        f36196v = (int) (jL & 7);
        f36197w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private r1() {
    }

    static long A(Object obj, long j15) {
        return f36179e.h(obj, j15);
    }

    private static e B() {
        Unsafe unsafe = f36175a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f36177c) {
            return new c(unsafe);
        }
        if (f36178d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object C(Object obj, long j15) {
        return f36179e.i(obj, j15);
    }

    static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f36181g;
    }

    static boolean F() {
        return f36180f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th4) {
        Logger.getLogger(r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th4);
    }

    static void H(Object obj, long j15, boolean z15) {
        f36179e.k(obj, j15, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j15, boolean z15) {
        L(obj, j15, z15 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j15, boolean z15) {
        M(obj, j15, z15 ? (byte) 1 : (byte) 0);
    }

    static void K(byte[] bArr, long j15, byte b15) {
        f36179e.l(bArr, f36182h + j15, b15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Object obj, long j15, byte b15) {
        long j16 = (-4) & j15;
        int iZ = z(obj, j16);
        int i15 = ((~((int) j15)) & 3) << 3;
        P(obj, j16, ((255 & b15) << i15) | (iZ & (~(GF2Field.MASK << i15))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j15, byte b15) {
        long j16 = (-4) & j15;
        int i15 = (((int) j15) & 3) << 3;
        P(obj, j16, ((255 & b15) << i15) | (z(obj, j16) & (~(GF2Field.MASK << i15))));
    }

    static void N(Object obj, long j15, double d15) {
        f36179e.m(obj, j15, d15);
    }

    static void O(Object obj, long j15, float f15) {
        f36179e.n(obj, j15, f15);
    }

    static void P(Object obj, long j15, int i15) {
        f36179e.o(obj, j15, i15);
    }

    static void Q(Object obj, long j15, long j16) {
        f36179e.p(obj, j15, j16);
    }

    static void R(Object obj, long j15, Object obj2) {
        f36179e.q(obj, j15, obj2);
    }

    private static boolean S() {
        e eVar = f36179e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f36179e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static <T> T k(Class<T> cls) {
        try {
            return (T) f36175a.allocateInstance(cls);
        } catch (InstantiationException e15) {
            throw new IllegalStateException(e15);
        }
    }

    private static int l(Class<?> cls) {
        if (f36181g) {
            return f36179e.a(cls);
        }
        return -1;
    }

    private static int m(Class<?> cls) {
        if (f36181g) {
            return f36179e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field n() {
        Field fieldP;
        if (com.google.crypto.tink.shaded.protobuf.d.c() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldP;
        }
        Field fieldP2 = p(Buffer.class, "address");
        if (fieldP2 == null || fieldP2.getType() != Long.TYPE) {
            return null;
        }
        return fieldP2;
    }

    static boolean o(Class<?> cls) {
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f36176b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f36179e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean r(Object obj, long j15) {
        return f36179e.c(obj, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Object obj, long j15) {
        return v(obj, j15) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(Object obj, long j15) {
        return w(obj, j15) != 0;
    }

    static byte u(byte[] bArr, long j15) {
        return f36179e.d(bArr, f36182h + j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(Object obj, long j15) {
        return (byte) ((z(obj, (-4) & j15) >>> ((int) (((~j15) & 3) << 3))) & GF2Field.MASK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j15) {
        return (byte) ((z(obj, (-4) & j15) >>> ((int) ((j15 & 3) << 3))) & GF2Field.MASK);
    }

    static double x(Object obj, long j15) {
        return f36179e.e(obj, j15);
    }

    static float y(Object obj, long j15) {
        return f36179e.f(obj, j15);
    }

    static int z(Object obj, long j15) {
        return f36179e.g(obj, j15);
    }
}
