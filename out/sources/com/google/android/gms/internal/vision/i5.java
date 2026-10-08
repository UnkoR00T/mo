package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f31077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f31078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f31079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f31080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f31081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f31082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f31083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f31084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f31085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f31086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f31087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f31088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f31089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f31090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f31091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f31092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f31093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f31094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f31095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f31096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f31097u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f31098v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f31099w;

    private static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final byte a(Object obj, long j15) {
            return i5.f31099w ? i5.L(obj, j15) : i5.M(obj, j15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void b(Object obj, long j15, byte b15) {
            if (i5.f31099w) {
                i5.u(obj, j15, b15);
            } else {
                i5.y(obj, j15, b15);
            }
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void c(Object obj, long j15, double d15) {
            f(obj, j15, Double.doubleToLongBits(d15));
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void d(Object obj, long j15, float f15) {
            e(obj, j15, Float.floatToIntBits(f15));
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void g(Object obj, long j15, boolean z15) {
            if (i5.f31099w) {
                i5.z(obj, j15, z15);
            } else {
                i5.D(obj, j15, z15);
            }
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final boolean h(Object obj, long j15) {
            return i5.f31099w ? i5.N(obj, j15) : i5.O(obj, j15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final float i(Object obj, long j15) {
            return Float.intBitsToFloat(k(obj, j15));
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final double j(Object obj, long j15) {
            return Double.longBitsToDouble(l(obj, j15));
        }
    }

    private static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final byte a(Object obj, long j15) {
            return this.f31100a.getByte(obj, j15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void b(Object obj, long j15, byte b15) {
            this.f31100a.putByte(obj, j15, b15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void c(Object obj, long j15, double d15) {
            this.f31100a.putDouble(obj, j15, d15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void d(Object obj, long j15, float f15) {
            this.f31100a.putFloat(obj, j15, f15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void g(Object obj, long j15, boolean z15) {
            this.f31100a.putBoolean(obj, j15, z15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final boolean h(Object obj, long j15) {
            return this.f31100a.getBoolean(obj, j15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final float i(Object obj, long j15) {
            return this.f31100a.getFloat(obj, j15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final double j(Object obj, long j15) {
            return this.f31100a.getDouble(obj, j15);
        }
    }

    private static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final byte a(Object obj, long j15) {
            return i5.f31099w ? i5.L(obj, j15) : i5.M(obj, j15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void b(Object obj, long j15, byte b15) {
            if (i5.f31099w) {
                i5.u(obj, j15, b15);
            } else {
                i5.y(obj, j15, b15);
            }
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void c(Object obj, long j15, double d15) {
            f(obj, j15, Double.doubleToLongBits(d15));
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void d(Object obj, long j15, float f15) {
            e(obj, j15, Float.floatToIntBits(f15));
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final void g(Object obj, long j15, boolean z15) {
            if (i5.f31099w) {
                i5.z(obj, j15, z15);
            } else {
                i5.D(obj, j15, z15);
            }
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final boolean h(Object obj, long j15) {
            return i5.f31099w ? i5.N(obj, j15) : i5.O(obj, j15);
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final float i(Object obj, long j15) {
            return Float.intBitsToFloat(k(obj, j15));
        }

        @Override // com.google.android.gms.internal.vision.i5.d
        public final double j(Object obj, long j15) {
            return Double.longBitsToDouble(l(obj, j15));
        }
    }

    private static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f31100a;

        d(Unsafe unsafe) {
            this.f31100a = unsafe;
        }

        public abstract byte a(Object obj, long j15);

        public abstract void b(Object obj, long j15, byte b15);

        public abstract void c(Object obj, long j15, double d15);

        public abstract void d(Object obj, long j15, float f15);

        public final void e(Object obj, long j15, int i15) {
            this.f31100a.putInt(obj, j15, i15);
        }

        public final void f(Object obj, long j15, long j16) {
            this.f31100a.putLong(obj, j15, j16);
        }

        public abstract void g(Object obj, long j15, boolean z15);

        public abstract boolean h(Object obj, long j15);

        public abstract float i(Object obj, long j15);

        public abstract double j(Object obj, long j15);

        public final int k(Object obj, long j15) {
            return this.f31100a.getInt(obj, j15);
        }

        public final long l(Object obj, long j15) {
            return this.f31100a.getLong(obj, j15);
        }
    }

    static {
        Unsafe unsafeT = t();
        f31077a = unsafeT;
        f31078b = w0.c();
        boolean zB = B(Long.TYPE);
        f31079c = zB;
        boolean zB2 = B(Integer.TYPE);
        f31080d = zB2;
        d bVar = null;
        if (unsafeT != null) {
            if (!w0.b()) {
                bVar = new b(unsafeT);
            } else if (zB) {
                bVar = new c(unsafeT);
            } else if (zB2) {
                bVar = new a(unsafeT);
            }
        }
        f31081e = bVar;
        f31082f = E();
        f31083g = A();
        long jN = n(byte[].class);
        f31084h = jN;
        f31085i = n(boolean[].class);
        f31086j = s(boolean[].class);
        f31087k = n(int[].class);
        f31088l = s(int[].class);
        f31089m = n(long[].class);
        f31090n = s(long[].class);
        f31091o = n(float[].class);
        f31092p = s(float[].class);
        f31093q = n(double[].class);
        f31094r = s(double[].class);
        f31095s = n(Object[].class);
        f31096t = s(Object[].class);
        Field fieldG = G();
        f31097u = (fieldG == null || bVar == null) ? -1L : bVar.f31100a.objectFieldOffset(fieldG);
        f31098v = (int) (jN & 7);
        f31099w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private i5() {
    }

    private static boolean A() {
        Unsafe unsafe = f31077a;
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
            if (w0.b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(i5.class.getName());
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th4);
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 71);
            sb5.append("platform method missing - proto runtime falling back to safer methods: ");
            sb5.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb5.toString());
            return false;
        }
    }

    private static boolean B(Class<?> cls) {
        if (!w0.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f31078b;
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

    static double C(Object obj, long j15) {
        return f31081e.j(obj, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Object obj, long j15, boolean z15) {
        y(obj, j15, z15 ? (byte) 1 : (byte) 0);
    }

    private static boolean E() {
        Unsafe unsafe = f31077a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (G() == null) {
                return false;
            }
            if (w0.b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(i5.class.getName());
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th4);
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 71);
            sb5.append("platform method missing - proto runtime falling back to safer methods: ");
            sb5.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb5.toString());
            return false;
        }
    }

    static Object F(Object obj, long j15) {
        return f31081e.f31100a.getObject(obj, j15);
    }

    private static Field G() {
        Field fieldD;
        if (w0.b() && (fieldD = d(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, "address");
        if (fieldD2 == null || fieldD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte L(Object obj, long j15) {
        return (byte) (b(obj, (-4) & j15) >>> ((int) (((~j15) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte M(Object obj, long j15) {
        return (byte) (b(obj, (-4) & j15) >>> ((int) ((j15 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(Object obj, long j15) {
        return L(obj, j15) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O(Object obj, long j15) {
        return M(obj, j15) != 0;
    }

    static byte a(byte[] bArr, long j15) {
        return f31081e.a(bArr, f31084h + j15);
    }

    static int b(Object obj, long j15) {
        return f31081e.k(obj, j15);
    }

    static <T> T c(Class<T> cls) {
        try {
            return (T) f31077a.allocateInstance(cls);
        } catch (InstantiationException e15) {
            throw new IllegalStateException(e15);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j15, double d15) {
        f31081e.c(obj, j15, d15);
    }

    static void g(Object obj, long j15, float f15) {
        f31081e.d(obj, j15, f15);
    }

    static void h(Object obj, long j15, int i15) {
        f31081e.e(obj, j15, i15);
    }

    static void i(Object obj, long j15, long j16) {
        f31081e.f(obj, j15, j16);
    }

    static void j(Object obj, long j15, Object obj2) {
        f31081e.f31100a.putObject(obj, j15, obj2);
    }

    static void k(Object obj, long j15, boolean z15) {
        f31081e.g(obj, j15, z15);
    }

    static void l(byte[] bArr, long j15, byte b15) {
        f31081e.b(bArr, f31084h + j15, b15);
    }

    static boolean m() {
        return f31083g;
    }

    private static int n(Class<?> cls) {
        if (f31083g) {
            return f31081e.f31100a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j15) {
        return f31081e.l(obj, j15);
    }

    static boolean r() {
        return f31082f;
    }

    private static int s(Class<?> cls) {
        if (f31083g) {
            return f31081e.f31100a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new k5());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j15, byte b15) {
        long j16 = (-4) & j15;
        int iB = b(obj, j16);
        int i15 = ((~((int) j15)) & 3) << 3;
        h(obj, j16, ((255 & b15) << i15) | (iB & (~(GF2Field.MASK << i15))));
    }

    static boolean w(Object obj, long j15) {
        return f31081e.h(obj, j15);
    }

    static float x(Object obj, long j15) {
        return f31081e.i(obj, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j15, byte b15) {
        long j16 = (-4) & j15;
        int i15 = (((int) j15) & 3) << 3;
        h(obj, j16, ((255 & b15) << i15) | (b(obj, j16) & (~(GF2Field.MASK << i15))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(Object obj, long j15, boolean z15) {
        u(obj, j15, z15 ? (byte) 1 : (byte) 0);
    }
}
