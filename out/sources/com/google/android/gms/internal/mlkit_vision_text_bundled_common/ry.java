package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class ry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f30616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f30617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f30618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final qy f30619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f30620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f30621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f30622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f30623h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z15;
        boolean z16;
        qy qyVar;
        Unsafe unsafeL = l();
        f30616a = unsafeL;
        int i15 = hu.f30448a;
        f30617b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f30618c = zA;
        Class cls2 = Integer.TYPE;
        boolean zA2 = A(cls2);
        qy oyVar = null;
        if (unsafeL != null) {
            if (zA) {
                oyVar = new py(unsafeL);
            } else if (zA2) {
                oyVar = new oy(unsafeL);
            }
        }
        f30619d = oyVar;
        if (oyVar == null) {
            z15 = false;
        } else {
            try {
                Class<?> cls3 = oyVar.f30569a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z15 = false;
                } else {
                    z15 = true;
                }
            } catch (Throwable th4) {
                m(th4);
            }
        }
        f30620e = z15;
        qy qyVar2 = f30619d;
        if (qyVar2 == null) {
            z16 = false;
        } else {
            try {
                Class<?> cls4 = qyVar2.f30569a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z16 = true;
            } catch (Throwable th5) {
                m(th5);
                z16 = false;
            }
        }
        f30621f = z16;
        f30622g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (qyVar = f30619d) != null) {
            qyVar.f30569a.objectFieldOffset(fieldB);
        }
        f30623h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private ry() {
    }

    static boolean A(Class cls) {
        int i15 = hu.f30448a;
        try {
            Class cls2 = f30617b;
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

    static boolean B(Object obj, long j15) {
        return f30619d.g(obj, j15);
    }

    static boolean C() {
        return f30621f;
    }

    static boolean D() {
        return f30620e;
    }

    private static int E(Class cls) {
        if (f30621f) {
            return f30619d.f30569a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f30621f) {
            return f30619d.f30569a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i15 = hu.f30448a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j15, byte b15) {
        qy qyVar = f30619d;
        long j16 = (-4) & j15;
        int i15 = qyVar.f30569a.getInt(obj, j16);
        int i16 = ((~((int) j15)) & 3) << 3;
        qyVar.f30569a.putInt(obj, j16, ((255 & b15) << i16) | (i15 & (~(GF2Field.MASK << i16))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j15, byte b15) {
        qy qyVar = f30619d;
        long j16 = (-4) & j15;
        int i15 = (((int) j15) & 3) << 3;
        qyVar.f30569a.putInt(obj, j16, ((255 & b15) << i15) | (qyVar.f30569a.getInt(obj, j16) & (~(GF2Field.MASK << i15))));
    }

    static double f(Object obj, long j15) {
        return f30619d.a(obj, j15);
    }

    static float g(Object obj, long j15) {
        return f30619d.b(obj, j15);
    }

    static int h(Object obj, long j15) {
        return f30619d.f30569a.getInt(obj, j15);
    }

    static long i(Object obj, long j15) {
        return f30619d.f30569a.getLong(obj, j15);
    }

    static Object j(Class cls) {
        try {
            return f30616a.allocateInstance(cls);
        } catch (InstantiationException e15) {
            throw new IllegalStateException(e15);
        }
    }

    static Object k(Object obj, long j15) {
        return f30619d.f30569a.getObject(obj, j15);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ny());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th4) {
        Logger.getLogger(ry.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th4.toString()));
    }

    static void r(Object obj, long j15, boolean z15) {
        f30619d.c(obj, j15, z15);
    }

    static void s(byte[] bArr, long j15, byte b15) {
        f30619d.d(bArr, f30622g + j15, b15);
    }

    static void t(Object obj, long j15, double d15) {
        f30619d.e(obj, j15, d15);
    }

    static void u(Object obj, long j15, float f15) {
        f30619d.f(obj, j15, f15);
    }

    static void v(Object obj, long j15, int i15) {
        f30619d.f30569a.putInt(obj, j15, i15);
    }

    static void w(Object obj, long j15, long j16) {
        f30619d.f30569a.putLong(obj, j15, j16);
    }

    static void x(Object obj, long j15, Object obj2) {
        f30619d.f30569a.putObject(obj, j15, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j15) {
        return ((byte) ((f30619d.f30569a.getInt(obj, (-4) & j15) >>> ((int) (((~j15) & 3) << 3))) & GF2Field.MASK)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j15) {
        return ((byte) ((f30619d.f30569a.getInt(obj, (-4) & j15) >>> ((int) ((j15 & 3) << 3))) & GF2Field.MASK)) != 0;
    }
}
