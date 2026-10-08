package com.google.android.libraries.places.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class p10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f33248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f33249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f33250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o10 f33251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f33252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f33253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final boolean f33254g;

    static {
        boolean z15;
        o10 o10Var;
        Unsafe unsafeT = t();
        f33248a = unsafeT;
        int i15 = kx.f32765a;
        f33249b = Memory.class;
        Class cls = Long.TYPE;
        boolean zU = u(cls);
        f33250c = zU;
        Class cls2 = Integer.TYPE;
        boolean zU2 = u(cls2);
        o10 m10Var = null;
        if (unsafeT != null) {
            if (zU) {
                m10Var = new n10(unsafeT);
            } else if (zU2) {
                m10Var = new m10(unsafeT);
            }
        }
        f33251d = m10Var;
        if (m10Var != null) {
            try {
                Class<?> cls3 = m10Var.f33119a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th4) {
                B(th4);
            }
        }
        o10 o10Var2 = f33251d;
        if (o10Var2 == null) {
            z15 = false;
        } else {
            try {
                Class<?> cls4 = o10Var2.f33119a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z15 = true;
            } catch (Throwable th5) {
                B(th5);
                z15 = false;
            }
        }
        f33252e = z15;
        f33253f = C(byte[].class);
        C(boolean[].class);
        D(boolean[].class);
        C(int[].class);
        D(int[].class);
        C(long[].class);
        D(long[].class);
        C(float[].class);
        D(float[].class);
        C(double[].class);
        D(double[].class);
        C(Object[].class);
        D(Object[].class);
        Field fieldA = a();
        if (fieldA != null && (o10Var = f33251d) != null) {
            o10Var.f33119a.objectFieldOffset(fieldA);
        }
        f33254g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private p10() {
    }

    static /* synthetic */ void B(Throwable th4) {
        Logger.getLogger(p10.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th4.toString()));
    }

    private static int C(Class cls) {
        if (f33252e) {
            return f33251d.f33119a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int D(Class cls) {
        if (f33252e) {
            return f33251d.f33119a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field a() {
        int i15 = kx.f32765a;
        Field fieldB = b(Buffer.class, "effectiveDirectAddress");
        if (fieldB != null) {
            return fieldB;
        }
        Field fieldB2 = b(Buffer.class, "address");
        if (fieldB2 == null || fieldB2.getType() != Long.TYPE) {
            return null;
        }
        return fieldB2;
    }

    private static Field b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, long j15, byte b15) {
        Unsafe unsafe = f33251d.f33119a;
        long j16 = (-4) & j15;
        int i15 = unsafe.getInt(obj, j16);
        int i16 = ((~((int) j15)) & 3) << 3;
        unsafe.putInt(obj, j16, ((255 & b15) << i16) | (i15 & (~(GF2Field.MASK << i16))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j15, byte b15) {
        Unsafe unsafe = f33251d.f33119a;
        long j16 = (-4) & j15;
        int i15 = (((int) j15) & 3) << 3;
        unsafe.putInt(obj, j16, ((255 & b15) << i15) | (unsafe.getInt(obj, j16) & (~(GF2Field.MASK << i15))));
    }

    static boolean e() {
        return f33252e;
    }

    static Object f(Class cls) {
        try {
            return f33248a.allocateInstance(cls);
        } catch (InstantiationException e15) {
            throw new IllegalStateException(e15);
        }
    }

    static int g(Object obj, long j15) {
        return f33251d.f33119a.getInt(obj, j15);
    }

    static void h(Object obj, long j15, int i15) {
        f33251d.f33119a.putInt(obj, j15, i15);
    }

    static long i(Object obj, long j15) {
        return f33251d.f33119a.getLong(obj, j15);
    }

    static void j(Object obj, long j15, long j16) {
        f33251d.f33119a.putLong(obj, j15, j16);
    }

    static boolean k(Object obj, long j15) {
        return f33251d.b(obj, j15);
    }

    static void l(Object obj, long j15, boolean z15) {
        f33251d.c(obj, j15, z15);
    }

    static float m(Object obj, long j15) {
        return f33251d.d(obj, j15);
    }

    static void n(Object obj, long j15, float f15) {
        f33251d.e(obj, j15, f15);
    }

    static double o(Object obj, long j15) {
        return f33251d.f(obj, j15);
    }

    static void p(Object obj, long j15, double d15) {
        f33251d.g(obj, j15, d15);
    }

    static Object q(Object obj, long j15) {
        return f33251d.f33119a.getObject(obj, j15);
    }

    static void r(Object obj, long j15, Object obj2) {
        f33251d.f33119a.putObject(obj, j15, obj2);
    }

    static void s(byte[] bArr, long j15, byte b15) {
        f33251d.a(bArr, f33253f + j15, b15);
    }

    static Unsafe t() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new l10());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(p10.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    static boolean u(Class cls) {
        int i15 = kx.f32765a;
        try {
            Class cls2 = f33249b;
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

    static /* synthetic */ boolean x(Object obj, long j15) {
        return ((byte) ((f33251d.f33119a.getInt(obj, (-4) & j15) >>> ((int) (((~j15) & 3) << 3))) & GF2Field.MASK)) != 0;
    }

    static /* synthetic */ boolean y(Object obj, long j15) {
        return ((byte) ((f33251d.f33119a.getInt(obj, (-4) & j15) >>> ((int) ((j15 & 3) << 3))) & GF2Field.MASK)) != 0;
    }
}
