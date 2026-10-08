package s5;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import io.sentry.android.core.c2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class<?> f177857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f177858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f177859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f177860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f177861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f177862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f177863g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4547d f177864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f177865b;

        a(C4547d c4547d, Object obj) {
            this.f177864a = c4547d;
            this.f177865b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f177864a.f177870a = this.f177865b;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f177866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4547d f177867b;

        b(Application application, C4547d c4547d) {
            this.f177866a = application;
            this.f177867b = c4547d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f177866a.unregisterActivityLifecycleCallbacks(this.f177867b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f177868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f177869b;

        c(Object obj, Object obj2) {
            this.f177868a = obj;
            this.f177869b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f177860d;
                if (method != null) {
                    method.invoke(this.f177868a, this.f177869b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f177861e.invoke(this.f177868a, this.f177869b, Boolean.FALSE);
                }
            } catch (RuntimeException e15) {
                if (e15.getClass() == RuntimeException.class && e15.getMessage() != null && e15.getMessage().startsWith("Unable to stop")) {
                    throw e15;
                }
            } catch (Throwable th4) {
                c2.f("ActivityRecreator", "Exception while invoking performStopActivity", th4);
            }
        }
    }

    /* JADX INFO: renamed from: s5.d$d, reason: collision with other inner class name */
    private static final class C4547d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f177870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f177871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f177872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f177873d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f177874e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f177875f = false;

        C4547d(Activity activity) {
            this.f177871b = activity;
            this.f177872c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f177871b == activity) {
                this.f177871b = null;
                this.f177874e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f177874e || this.f177875f || this.f177873d || !d.h(this.f177870a, this.f177872c, activity)) {
                return;
            }
            this.f177875f = true;
            this.f177870a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f177871b == activity) {
                this.f177873d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f177857a = clsA;
        f177858b = b();
        f177859c = f();
        f177860d = d(clsA);
        f177861e = c(clsA);
        f177862f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i15 = Build.VERSION.SDK_INT;
        return i15 == 26 || i15 == 27;
    }

    protected static boolean h(Object obj, int i15, Activity activity) {
        try {
            Object obj2 = f177859c.get(activity);
            if (obj2 == obj && activity.hashCode() == i15) {
                f177863g.postAtFrontOfQueue(new c(f177858b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th4) {
            c2.f("ActivityRecreator", "Exception while fetching field values", th4);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f177862f == null) {
            return false;
        }
        if (f177861e == null && f177860d == null) {
            return false;
        }
        try {
            Object obj2 = f177859c.get(activity);
            if (obj2 == null || (obj = f177858b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C4547d c4547d = new C4547d(activity);
            application.registerActivityLifecycleCallbacks(c4547d);
            f177863g.post(new a(c4547d, obj2));
            try {
                if (g()) {
                    Method method = f177862f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f177863g.post(new b(application, c4547d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
