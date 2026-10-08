package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f12066a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f12067b = androidx.datastore.preferences.protobuf.d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f12068c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f12069d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f12070e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f12071f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f12072g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f12073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f12074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f12075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f12076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f12077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f12078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f12079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f12080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f12081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f12082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f12083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f12084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f12085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f12086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f12087v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f12088w;

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

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public boolean c(Object obj, long j15) {
            return q1.f12088w ? q1.q(obj, j15) : q1.r(obj, j15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public double d(Object obj, long j15) {
            return Double.longBitsToDouble(g(obj, j15));
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public float e(Object obj, long j15) {
            return Float.intBitsToFloat(f(obj, j15));
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void j(Object obj, long j15, boolean z15) {
            if (q1.f12088w) {
                q1.F(obj, j15, z15);
            } else {
                q1.G(obj, j15, z15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void k(Object obj, long j15, byte b15) {
            if (q1.f12088w) {
                q1.I(obj, j15, b15);
            } else {
                q1.J(obj, j15, b15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void l(Object obj, long j15, double d15) {
            o(obj, j15, Double.doubleToLongBits(d15));
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void m(Object obj, long j15, float f15) {
            n(obj, j15, Float.floatToIntBits(f15));
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public boolean c(Object obj, long j15) {
            return q1.f12088w ? q1.q(obj, j15) : q1.r(obj, j15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public double d(Object obj, long j15) {
            return Double.longBitsToDouble(g(obj, j15));
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public float e(Object obj, long j15) {
            return Float.intBitsToFloat(f(obj, j15));
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void j(Object obj, long j15, boolean z15) {
            if (q1.f12088w) {
                q1.F(obj, j15, z15);
            } else {
                q1.G(obj, j15, z15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void k(Object obj, long j15, byte b15) {
            if (q1.f12088w) {
                q1.I(obj, j15, b15);
            } else {
                q1.J(obj, j15, b15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void l(Object obj, long j15, double d15) {
            o(obj, j15, Double.doubleToLongBits(d15));
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void m(Object obj, long j15, float f15) {
            n(obj, j15, Float.floatToIntBits(f15));
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public boolean c(Object obj, long j15) {
            return this.f12089a.getBoolean(obj, j15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public double d(Object obj, long j15) {
            return this.f12089a.getDouble(obj, j15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public float e(Object obj, long j15) {
            return this.f12089a.getFloat(obj, j15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void j(Object obj, long j15, boolean z15) {
            this.f12089a.putBoolean(obj, j15, z15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void k(Object obj, long j15, byte b15) {
            this.f12089a.putByte(obj, j15, b15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void l(Object obj, long j15, double d15) {
            this.f12089a.putDouble(obj, j15, d15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public void m(Object obj, long j15, float f15) {
            this.f12089a.putFloat(obj, j15, f15);
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f12089a.getClass();
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
                q1.D(th4);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f12089a.getClass();
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
                q1.D(th4);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f12089a;

        e(Unsafe unsafe) {
            this.f12089a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f12089a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f12089a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j15);

        public abstract double d(Object obj, long j15);

        public abstract float e(Object obj, long j15);

        public final int f(Object obj, long j15) {
            return this.f12089a.getInt(obj, j15);
        }

        public final long g(Object obj, long j15) {
            return this.f12089a.getLong(obj, j15);
        }

        public final Object h(Object obj, long j15) {
            return this.f12089a.getObject(obj, j15);
        }

        public final long i(Field field) {
            return this.f12089a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j15, boolean z15);

        public abstract void k(Object obj, long j15, byte b15);

        public abstract void l(Object obj, long j15, double d15);

        public abstract void m(Object obj, long j15, float f15);

        public final void n(Object obj, long j15, int i15) {
            this.f12089a.putInt(obj, j15, i15);
        }

        public final void o(Object obj, long j15, long j16) {
            this.f12089a.putLong(obj, j15, j16);
        }

        public final void p(Object obj, long j15, Object obj2) {
            this.f12089a.putObject(obj, j15, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f12089a;
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
                q1.D(th4);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f12089a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return q1.l() != null;
            } catch (Throwable th4) {
                q1.D(th4);
                return false;
            }
        }
    }

    static {
        long j15 = j(byte[].class);
        f12073h = j15;
        f12074i = j(boolean[].class);
        f12075j = k(boolean[].class);
        f12076k = j(int[].class);
        f12077l = k(int[].class);
        f12078m = j(long[].class);
        f12079n = k(long[].class);
        f12080o = j(float[].class);
        f12081p = k(float[].class);
        f12082q = j(double[].class);
        f12083r = k(double[].class);
        f12084s = j(Object[].class);
        f12085t = k(Object[].class);
        f12086u = o(l());
        f12087v = (int) (j15 & 7);
        f12088w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private q1() {
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f12072g;
    }

    static boolean C() {
        return f12071f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th4) {
        Logger.getLogger(q1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th4);
    }

    static void E(Object obj, long j15, boolean z15) {
        f12070e.j(obj, j15, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j15, boolean z15) {
        I(obj, j15, z15 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j15, boolean z15) {
        J(obj, j15, z15 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j15, byte b15) {
        f12070e.k(bArr, f12073h + j15, b15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j15, byte b15) {
        long j16 = (-4) & j15;
        int iW = w(obj, j16);
        int i15 = ((~((int) j15)) & 3) << 3;
        M(obj, j16, ((255 & b15) << i15) | (iW & (~(GF2Field.MASK << i15))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j15, byte b15) {
        long j16 = (-4) & j15;
        int i15 = (((int) j15) & 3) << 3;
        M(obj, j16, ((255 & b15) << i15) | (w(obj, j16) & (~(GF2Field.MASK << i15))));
    }

    static void K(Object obj, long j15, double d15) {
        f12070e.l(obj, j15, d15);
    }

    static void L(Object obj, long j15, float f15) {
        f12070e.m(obj, j15, f15);
    }

    static void M(Object obj, long j15, int i15) {
        f12070e.n(obj, j15, i15);
    }

    static void N(Object obj, long j15, long j16) {
        f12070e.o(obj, j15, j16);
    }

    static void O(Object obj, long j15, Object obj2) {
        f12070e.p(obj, j15, obj2);
    }

    private static boolean P() {
        e eVar = f12070e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f12070e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) f12066a.allocateInstance(cls);
        } catch (InstantiationException e15) {
            throw new IllegalStateException(e15);
        }
    }

    private static int j(Class<?> cls) {
        if (f12072g) {
            return f12070e.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f12072g) {
            return f12070e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (androidx.datastore.preferences.protobuf.d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    static boolean m(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f12067b;
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

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f12070e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j15) {
        return f12070e.c(obj, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j15) {
        return s(obj, j15) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j15) {
        return t(obj, j15) != 0;
    }

    private static byte s(Object obj, long j15) {
        return (byte) ((w(obj, (-4) & j15) >>> ((int) (((~j15) & 3) << 3))) & GF2Field.MASK);
    }

    private static byte t(Object obj, long j15) {
        return (byte) ((w(obj, (-4) & j15) >>> ((int) ((j15 & 3) << 3))) & GF2Field.MASK);
    }

    static double u(Object obj, long j15) {
        return f12070e.d(obj, j15);
    }

    static float v(Object obj, long j15) {
        return f12070e.e(obj, j15);
    }

    static int w(Object obj, long j15) {
        return f12070e.f(obj, j15);
    }

    static long x(Object obj, long j15) {
        return f12070e.g(obj, j15);
    }

    private static e y() {
        Unsafe unsafe = f12066a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f12068c) {
            return new c(unsafe);
        }
        if (f12069d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j15) {
        return f12070e.h(obj, j15);
    }
}
