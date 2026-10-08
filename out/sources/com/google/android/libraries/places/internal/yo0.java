package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class yo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f34423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class[] f34425c;

    public yo0(Class cls, String str, Class... clsArr) {
        this.f34423a = cls;
        this.f34424b = str;
        this.f34425c = clsArr;
    }

    private final Method d(Class cls) {
        Class cls2;
        Method methodE = e(cls, this.f34424b, this.f34425c);
        if (methodE == null || (cls2 = this.f34423a) == null || cls2.isAssignableFrom(methodE.getReturnType())) {
            return methodE;
        }
        return null;
    }

    private static Method e(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return e(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final boolean a(Object obj) {
        return d(obj.getClass()) != null;
    }

    public final Object b(Object obj, Object... objArr) {
        try {
            Method methodD = d(obj.getClass());
            if (methodD == null) {
                return null;
            }
            try {
                return methodD.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        } catch (InvocationTargetException e15) {
            Throwable targetException = e15.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object c(Object obj, Object... objArr) {
        try {
            Method methodD = d(obj.getClass());
            if (methodD != null) {
                try {
                    return methodD.invoke(obj, objArr);
                } catch (IllegalAccessException e15) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(methodD.toString()));
                    assertionError.initCause(e15);
                    throw assertionError;
                }
            }
            String str = this.f34424b;
            String strValueOf = String.valueOf(obj);
            StringBuilder sb5 = new StringBuilder(str.length() + 33 + strValueOf.length());
            sb5.append("Method ");
            sb5.append(str);
            sb5.append(" not supported for object ");
            sb5.append(strValueOf);
            throw new AssertionError(sb5.toString());
        } catch (InvocationTargetException e16) {
            Throwable targetException = e16.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }
}
