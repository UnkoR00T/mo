package com.google.android.libraries.places.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class wj0 implements ig0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f34167b = Logger.getLogger(wj0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f34168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f34169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final RuntimeException f34170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object[] f34171f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34172a;

    static {
        Throwable th4;
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method2 = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i15];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
                th4 = null;
            } catch (Throwable th5) {
                th4 = th5;
                method = method2;
                f34167b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th4);
                method2 = method;
                constructor = null;
            }
        } catch (Throwable th6) {
            th4 = th6;
            method = null;
        }
        if (th4 != null || constructor == null) {
            f34168c = null;
            f34169d = null;
            f34170e = new RuntimeException(th4);
        } else {
            f34168c = constructor;
            f34169d = method2;
            f34170e = null;
        }
        f34171f = new Object[]{1L};
    }

    wj0() {
        RuntimeException runtimeException = f34170e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f34172a = f34168c.newInstance(null);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException(e15);
        } catch (InstantiationException e16) {
            throw new RuntimeException(e16);
        } catch (InvocationTargetException e17) {
            throw new RuntimeException(e17);
        }
    }

    static boolean b() {
        return f34170e == null;
    }

    @Override // com.google.android.libraries.places.internal.ig0
    public final void a(long j15) {
        try {
            f34169d.invoke(this.f34172a, f34171f);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException(e15);
        } catch (InvocationTargetException e16) {
            throw new RuntimeException(e16);
        }
    }
}
