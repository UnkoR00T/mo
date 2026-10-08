package yu;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u000b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\n\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\"\u0010\u000b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\n\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\"\u0010\u000b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\n\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a%\u0010\u0011\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001aQ\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00062\"\u0010\u000b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\n\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u000f\u001aM\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\"\u0010\u000b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\n\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001e\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a)\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b \u0010!\u001a+\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\"\u0010!\u001a#\u0010$\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030#H\u0000¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"", "T", "Lmr/c;", "Lkotlinx/serialization/KSerializer;", "b", "(Lmr/c;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "", "n", "(Ljava/lang/Class;)Ljava/lang/Void;", "", "args", "d", "(Lmr/c;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "c", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "f", "g", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "l", "(Ljava/lang/Class;)Z", "m", "jClass", "k", "companion", "j", "(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "companionName", "a", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/lang/Class;)Lkotlinx/serialization/KSerializer;", "h", "", "i", "()Ljava/util/Map;", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class b1 {
    private static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> KSerializer<T> b(mr.c<T> cVar) {
        return d(cVar, new KSerializer[0]);
    }

    public static final <T> KSerializer<T> c(Class<T> cls, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        if (cls.isEnum() && l(cls)) {
            return e(cls);
        }
        KSerializer<T> kSerializerK = k(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerK != null) {
            return kSerializerK;
        }
        KSerializer<T> kSerializerH = h(cls);
        if (kSerializerH != null) {
            return kSerializerH;
        }
        KSerializer<T> kSerializerF = f(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerF != null) {
            return kSerializerF;
        }
        if (m(cls)) {
            return new uu.f(dr.a.e(cls));
        }
        return null;
    }

    public static final <T> KSerializer<T> d(mr.c<T> cVar, KSerializer<Object>... kSerializerArr) {
        return c(dr.a.b(cVar), (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final <T> KSerializer<T> e(Class<T> cls) {
        return new v(cls.getCanonicalName(), (Enum[]) cls.getEnumConstants());
    }

    private static final <T> KSerializer<T> f(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        Field field;
        KSerializer<T> kSerializerJ;
        Object objG = g(cls);
        if (objG != null && (kSerializerJ = j(objG, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return kSerializerJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            int length = declaredClasses.length;
            int i15 = 0;
            Class<?> cls2 = null;
            boolean z15 = false;
            while (true) {
                if (i15 >= length) {
                    if (z15) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i15];
                    if (fr.t.c(cls3.getSimpleName(), "$serializer")) {
                        if (!z15) {
                            z15 = true;
                            cls2 = cls3;
                        }
                    }
                    i15++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final <T> Object g(Class<T> cls) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i15];
            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(r0.class) != null) {
                break;
            }
            i15++;
        }
        if (field == null) {
            return null;
        }
        try {
            field.setAccessible(true);
            return field.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final <T> KSerializer<T> h(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i15 = 0;
            if (!fu.r.V(canonicalName, "java.", false, 2, null) && !fu.r.V(canonicalName, "kotlin.", false, 2, null)) {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                Field field = null;
                int i16 = 0;
                boolean z15 = false;
                while (true) {
                    if (i16 >= length) {
                        if (!z15) {
                            break;
                        }
                        break;
                    }
                    Field field2 = declaredFields[i16];
                    if (fr.t.c(field2.getName(), "INSTANCE") && fr.t.c(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (!z15) {
                            z15 = true;
                            field = field2;
                        }
                    }
                    i16++;
                    field = null;
                    break;
                }
                if (field == null) {
                    return null;
                }
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                int length2 = methods.length;
                Method method = null;
                boolean z16 = false;
                while (true) {
                    if (i15 >= length2) {
                        if (!z16) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i15];
                    if (fr.t.c(method2.getName(), "serializer") && method2.getParameterTypes().length == 0 && fr.t.c(method2.getReturnType(), KSerializer.class)) {
                        if (!z16) {
                            method = method2;
                            z16 = true;
                        }
                    }
                    i15++;
                    method = null;
                    break;
                }
                if (method == null) {
                    return null;
                }
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof KSerializer) {
                    return (KSerializer) objInvoke;
                }
            }
        }
        return null;
    }

    public static final Map<mr.c<?>, KSerializer<?>> i() {
        Map mapC = pq.v0.c();
        mapC.put(fr.q0.c(String.class), vu.a.D(fr.v0.f66418a));
        mapC.put(fr.q0.c(Character.TYPE), vu.a.x(fr.g.f66397a));
        mapC.put(fr.q0.c(char[].class), vu.a.d());
        mapC.put(fr.q0.c(Double.TYPE), vu.a.y(fr.l.f66403a));
        mapC.put(fr.q0.c(double[].class), vu.a.e());
        mapC.put(fr.q0.c(Float.TYPE), vu.a.z(fr.m.f66405a));
        mapC.put(fr.q0.c(float[].class), vu.a.f());
        mapC.put(fr.q0.c(Long.TYPE), vu.a.B(fr.x.f66420a));
        mapC.put(fr.q0.c(long[].class), vu.a.i());
        mapC.put(fr.q0.c(oq.d0.class), vu.a.J(oq.d0.INSTANCE));
        mapC.put(fr.q0.c(Integer.TYPE), vu.a.A(fr.s.f66413a));
        mapC.put(fr.q0.c(int[].class), vu.a.g());
        mapC.put(fr.q0.c(oq.b0.class), vu.a.I(oq.b0.INSTANCE));
        mapC.put(fr.q0.c(Short.TYPE), vu.a.C(fr.t0.f66414a));
        mapC.put(fr.q0.c(short[].class), vu.a.o());
        mapC.put(fr.q0.c(oq.g0.class), vu.a.K(oq.g0.INSTANCE));
        mapC.put(fr.q0.c(Byte.TYPE), vu.a.w(fr.e.f66388a));
        mapC.put(fr.q0.c(byte[].class), vu.a.c());
        mapC.put(fr.q0.c(oq.z.class), vu.a.H(oq.z.INSTANCE));
        mapC.put(fr.q0.c(Boolean.TYPE), vu.a.v(fr.d.f66385a));
        mapC.put(fr.q0.c(boolean[].class), vu.a.b());
        mapC.put(fr.q0.c(oq.i0.class), vu.a.L(oq.i0.f148189a));
        mapC.put(fr.q0.c(Void.class), vu.a.l());
        try {
            mapC.put(fr.q0.c(gu.b.class), vu.a.E(gu.b.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapC.put(fr.q0.c(oq.e0.class), vu.a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapC.put(fr.q0.c(oq.c0.class), vu.a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapC.put(fr.q0.c(oq.h0.class), vu.a.t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapC.put(fr.q0.c(oq.a0.class), vu.a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapC.put(fr.q0.c(hu.a.class), vu.a.G(hu.a.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            mapC.put(fr.q0.c(gu.h.class), vu.a.F(gu.h.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        return pq.v0.b(mapC);
    }

    private static final <T> KSerializer<T> j(Object obj, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i15 = 0; i15 < length; i15++) {
                    clsArr2[i15] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e15) {
            Throwable cause = e15.getCause();
            if (cause == null) {
                throw e15;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e15.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> KSerializer<T> k(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return j(objA, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final <T> boolean l(Class<T> cls) {
        return cls.getAnnotation(uu.m.class) == null && cls.getAnnotation(uu.c.class) == null;
    }

    private static final <T> boolean m(Class<T> cls) {
        if (cls.getAnnotation(uu.c.class) != null) {
            return true;
        }
        uu.m mVar = (uu.m) cls.getAnnotation(uu.m.class);
        return mVar != null && fr.t.c(fr.q0.c(mVar.with()), fr.q0.c(uu.f.class));
    }

    public static final Void n(Class<?> cls) {
        throw new uu.n(c1.d(dr.a.e(cls)));
    }
}
