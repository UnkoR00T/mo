package eo;

import ao.i0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import yn.m;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f52195a;

    private static abstract class b {
        private b() {
        }

        public abstract Method a(Class<?> cls, Field field);

        abstract <T> Constructor<T> b(Class<T> cls);

        abstract String[] c(Class<?> cls);

        abstract boolean d(Class<?> cls);
    }

    private static class c extends b {
        private c() {
            super();
        }

        @Override // eo.a.b
        public Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // eo.a.b
        <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // eo.a.b
        String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // eo.a.b
        boolean d(Class<?> cls) {
            return false;
        }
    }

    private static class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f52196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f52197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f52198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f52199d;

        @Override // eo.a.b
        public Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e15) {
                throw a.d(e15);
            }
        }

        @Override // eo.a.b
        public <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f52197b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i15 = 0; i15 < objArr.length; i15++) {
                    clsArr[i15] = (Class) this.f52199d.invoke(objArr[i15], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e15) {
                throw a.d(e15);
            }
        }

        @Override // eo.a.b
        String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f52197b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i15 = 0; i15 < objArr.length; i15++) {
                    strArr[i15] = (String) this.f52198c.invoke(objArr[i15], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e15) {
                throw a.d(e15);
            }
        }

        @Override // eo.a.b
        boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f52196a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e15) {
                throw a.d(e15);
            }
        }

        private d() throws ClassNotFoundException {
            super();
            this.f52196a = Class.class.getMethod("isRecord", null);
            this.f52197b = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f52198c = cls.getMethod("getName", null);
            this.f52199d = cls.getMethod("getType", null);
        }
    }

    static {
        b cVar;
        try {
            cVar = new d();
        } catch (ReflectiveOperationException unused) {
            cVar = new c();
        }
        f52195a = cVar;
    }

    private static void b(AccessibleObject accessibleObject, StringBuilder sb5) {
        sb5.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i15 = 0; i15 < parameterTypes.length; i15++) {
            if (i15 > 0) {
                sb5.append(", ");
            }
            sb5.append(parameterTypes[i15].getSimpleName());
        }
        sb5.append(')');
    }

    public static String c(Constructor<?> constructor) {
        StringBuilder sb5 = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb5);
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z15) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb5 = new StringBuilder(method.getName());
            b(method, sb5);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb5.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z15 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method h(Class<?> cls, Field field) {
        return f52195a.a(cls, field);
    }

    public static <T> Constructor<T> i(Class<T> cls) {
        return f52195a.b(cls);
    }

    private static String j(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + i0.a((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static String[] k(Class<?> cls) {
        return f52195a.c(cls);
    }

    public static boolean l(Class<?> cls) {
        if (n(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean m(Class<?> cls) {
        return f52195a.d(cls);
    }

    public static boolean n(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void o(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e15) {
            throw new m("Failed making " + g(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + j(e15), e15);
        }
    }

    public static String p(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e15) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e15.getMessage() + j(e15);
        }
    }
}
