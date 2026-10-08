package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32341a = 0;

    static {
        Object obj;
        Class<?> cls;
        dr0 dr0Var;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th4) {
            obj = th4;
            cls = null;
        }
        if (cls != null) {
            try {
                dr0Var = (dr0) cls.asSubclass(dr0.class).getConstructor(gr0.class).newInstance(dr0.f32076a);
            } catch (Throwable th5) {
                obj = th5;
                dr0Var = null;
            }
        } else {
            dr0Var = null;
        }
        if (dr0Var == null) {
            new dr0(dr0.f32076a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, fr0.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private fr0() {
    }

    public static gr0 a(String str) {
        return dr0.f32076a;
    }

    public static er0 b() {
        return dr0.f32077b;
    }
}
