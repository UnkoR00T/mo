package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f29193a = Logger.getLogger(b4.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Unsafe f29194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f29195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f29196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f29197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f29198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f29199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f29200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f29201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f29202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f29203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f29204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f29205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f29206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f29207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f29208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f29209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f29210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f29211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f29212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f29213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f29214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f29215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final boolean f29216x;

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void b(long j15, byte b15) {
            Memory.pokeByte((int) j15, b15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void c(Object obj, long j15, double d15) {
            f(obj, j15, Double.doubleToLongBits(d15));
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void d(Object obj, long j15, float f15) {
            e(obj, j15, Float.floatToIntBits(f15));
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void g(Object obj, long j15, boolean z15) {
            if (b4.f29216x) {
                b4.r(obj, j15, z15);
            } else {
                b4.t(obj, j15, z15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void h(byte[] bArr, long j15, long j16, long j17) {
            Memory.pokeByteArray((int) j16, bArr, (int) j15, (int) j17);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void i(Object obj, long j15, byte b15) {
            if (b4.f29216x) {
                b4.d(obj, j15, b15);
            } else {
                b4.q(obj, j15, b15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final boolean l(Object obj, long j15) {
            return b4.f29216x ? b4.P(obj, j15) : b4.Q(obj, j15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final float m(Object obj, long j15) {
            return Float.intBitsToFloat(j(obj, j15));
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final double n(Object obj, long j15) {
            return Double.longBitsToDouble(k(obj, j15));
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final byte o(Object obj, long j15) {
            return b4.f29216x ? b4.N(obj, j15) : b4.O(obj, j15);
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void b(long j15, byte b15) {
            Memory.pokeByte(j15, b15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void c(Object obj, long j15, double d15) {
            f(obj, j15, Double.doubleToLongBits(d15));
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void d(Object obj, long j15, float f15) {
            e(obj, j15, Float.floatToIntBits(f15));
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void g(Object obj, long j15, boolean z15) {
            if (b4.f29216x) {
                b4.r(obj, j15, z15);
            } else {
                b4.t(obj, j15, z15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void h(byte[] bArr, long j15, long j16, long j17) {
            Memory.pokeByteArray(j16, bArr, (int) j15, (int) j17);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void i(Object obj, long j15, byte b15) {
            if (b4.f29216x) {
                b4.d(obj, j15, b15);
            } else {
                b4.q(obj, j15, b15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final boolean l(Object obj, long j15) {
            return b4.f29216x ? b4.P(obj, j15) : b4.Q(obj, j15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final float m(Object obj, long j15) {
            return Float.intBitsToFloat(j(obj, j15));
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final double n(Object obj, long j15) {
            return Double.longBitsToDouble(k(obj, j15));
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final byte o(Object obj, long j15) {
            return b4.f29216x ? b4.N(obj, j15) : b4.O(obj, j15);
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void b(long j15, byte b15) {
            this.f29217a.putByte(j15, b15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void c(Object obj, long j15, double d15) {
            this.f29217a.putDouble(obj, j15, d15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void d(Object obj, long j15, float f15) {
            this.f29217a.putFloat(obj, j15, f15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void g(Object obj, long j15, boolean z15) {
            this.f29217a.putBoolean(obj, j15, z15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void h(byte[] bArr, long j15, long j16, long j17) {
            this.f29217a.copyMemory(bArr, b4.f29201i + j15, (Object) null, j16, j17);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final void i(Object obj, long j15, byte b15) {
            this.f29217a.putByte(obj, j15, b15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final boolean l(Object obj, long j15) {
            return this.f29217a.getBoolean(obj, j15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final float m(Object obj, long j15) {
            return this.f29217a.getFloat(obj, j15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final double n(Object obj, long j15) {
            return this.f29217a.getDouble(obj, j15);
        }

        @Override // com.google.android.gms.internal.clearcut.b4.d
        public final byte o(Object obj, long j15) {
            return this.f29217a.getByte(obj, j15);
        }
    }

    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f29217a;

        d(Unsafe unsafe) {
            this.f29217a = unsafe;
        }

        public final long a(Field field) {
            return this.f29217a.objectFieldOffset(field);
        }

        public abstract void b(long j15, byte b15);

        public abstract void c(Object obj, long j15, double d15);

        public abstract void d(Object obj, long j15, float f15);

        public final void e(Object obj, long j15, int i15) {
            this.f29217a.putInt(obj, j15, i15);
        }

        public final void f(Object obj, long j15, long j16) {
            this.f29217a.putLong(obj, j15, j16);
        }

        public abstract void g(Object obj, long j15, boolean z15);

        public abstract void h(byte[] bArr, long j15, long j16, long j17);

        public abstract void i(Object obj, long j15, byte b15);

        public final int j(Object obj, long j15) {
            return this.f29217a.getInt(obj, j15);
        }

        public final long k(Object obj, long j15) {
            return this.f29217a.getLong(obj, j15);
        }

        public abstract boolean l(Object obj, long j15);

        public abstract float m(Object obj, long j15);

        public abstract double n(Object obj, long j15);

        public abstract byte o(Object obj, long j15);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x002b  */
    static {
        d cVar;
        Unsafe unsafeZ = z();
        f29194b = unsafeZ;
        f29195c = u.c();
        boolean zG = G(Long.TYPE);
        f29196d = zG;
        boolean zG2 = G(Integer.TYPE);
        f29197e = zG2;
        Field field = null;
        if (unsafeZ == null) {
            cVar = null;
        } else if (!u.b()) {
            cVar = new c(unsafeZ);
        } else if (zG) {
            cVar = new b(unsafeZ);
        } else if (zG2) {
            cVar = new a(unsafeZ);
        } else {
            cVar = null;
        }
        f29198f = cVar;
        f29199g = B();
        f29200h = A();
        f29201i = E(byte[].class);
        f29202j = E(boolean[].class);
        f29203k = F(boolean[].class);
        f29204l = E(int[].class);
        f29205m = F(int[].class);
        f29206n = E(long[].class);
        f29207o = F(long[].class);
        f29208p = E(float[].class);
        f29209q = F(float[].class);
        f29210r = E(double[].class);
        f29211s = F(double[].class);
        f29212t = E(Object[].class);
        f29213u = F(Object[].class);
        f29214v = n(C());
        Field fieldP = p(String.class, "value");
        if (fieldP != null && fieldP.getType() == char[].class) {
            field = fieldP;
        }
        f29215w = n(field);
        f29216x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private b4() {
    }

    private static boolean A() {
        Unsafe unsafe = f29194b;
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
            if (u.b()) {
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
            Logger logger = f29193a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th4);
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 71);
            sb5.append("platform method missing - proto runtime falling back to safer methods: ");
            sb5.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb5.toString());
            return false;
        }
    }

    private static boolean B() {
        Unsafe unsafe = f29194b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (C() == null) {
                return false;
            }
            if (u.b()) {
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
            Logger logger = f29193a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th4);
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 71);
            sb5.append("platform method missing - proto runtime falling back to safer methods: ");
            sb5.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb5.toString());
            return false;
        }
    }

    private static Field C() {
        Field fieldP;
        if (u.b() && (fieldP = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldP;
        }
        Field fieldP2 = p(Buffer.class, "address");
        if (fieldP2 == null || fieldP2.getType() != Long.TYPE) {
            return null;
        }
        return fieldP2;
    }

    private static int E(Class<?> cls) {
        if (f29200h) {
            return f29198f.f29217a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int F(Class<?> cls) {
        if (f29200h) {
            return f29198f.f29217a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean G(Class<?> cls) {
        if (!u.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f29195c;
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

    static int H(Object obj, long j15) {
        return f29198f.j(obj, j15);
    }

    static long I(Object obj, long j15) {
        return f29198f.k(obj, j15);
    }

    static boolean J(Object obj, long j15) {
        return f29198f.l(obj, j15);
    }

    static float K(Object obj, long j15) {
        return f29198f.m(obj, j15);
    }

    static double L(Object obj, long j15) {
        return f29198f.n(obj, j15);
    }

    static Object M(Object obj, long j15) {
        return f29198f.f29217a.getObject(obj, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte N(Object obj, long j15) {
        return (byte) (H(obj, (-4) & j15) >>> ((int) (((~j15) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte O(Object obj, long j15) {
        return (byte) (H(obj, (-4) & j15) >>> ((int) ((j15 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean P(Object obj, long j15) {
        return N(obj, j15) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q(Object obj, long j15) {
        return O(obj, j15) != 0;
    }

    static byte a(byte[] bArr, long j15) {
        return f29198f.o(bArr, f29201i + j15);
    }

    static long b(Field field) {
        return f29198f.a(field);
    }

    static void c(long j15, byte b15) {
        f29198f.b(j15, b15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j15, byte b15) {
        long j16 = (-4) & j15;
        int iH = H(obj, j16);
        int i15 = ((~((int) j15)) & 3) << 3;
        g(obj, j16, ((255 & b15) << i15) | (iH & (~(GF2Field.MASK << i15))));
    }

    static void e(Object obj, long j15, double d15) {
        f29198f.c(obj, j15, d15);
    }

    static void f(Object obj, long j15, float f15) {
        f29198f.d(obj, j15, f15);
    }

    static void g(Object obj, long j15, int i15) {
        f29198f.e(obj, j15, i15);
    }

    static void h(Object obj, long j15, long j16) {
        f29198f.f(obj, j15, j16);
    }

    static void i(Object obj, long j15, Object obj2) {
        f29198f.f29217a.putObject(obj, j15, obj2);
    }

    static void j(Object obj, long j15, boolean z15) {
        f29198f.g(obj, j15, z15);
    }

    static void k(byte[] bArr, long j15, byte b15) {
        f29198f.i(bArr, f29201i + j15, b15);
    }

    static void l(byte[] bArr, long j15, long j16, long j17) {
        f29198f.h(bArr, j15, j16, j17);
    }

    private static long n(Field field) {
        d dVar;
        if (field == null || (dVar = f29198f) == null) {
            return -1L;
        }
        return dVar.a(field);
    }

    static long o(ByteBuffer byteBuffer) {
        return f29198f.k(byteBuffer, f29214v);
    }

    private static Field p(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(Object obj, long j15, byte b15) {
        long j16 = (-4) & j15;
        int i15 = (((int) j15) & 3) << 3;
        g(obj, j16, ((255 & b15) << i15) | (H(obj, j16) & (~(GF2Field.MASK << i15))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(Object obj, long j15, boolean z15) {
        d(obj, j15, z15 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(Object obj, long j15, boolean z15) {
        q(obj, j15, z15 ? (byte) 1 : (byte) 0);
    }

    static boolean x() {
        return f29200h;
    }

    static boolean y() {
        return f29199g;
    }

    static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new c4());
        } catch (Throwable unused) {
            return null;
        }
    }
}
