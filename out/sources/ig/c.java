package ig;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f92146e = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f92147a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f92148b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f92149c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f92150d = false;

    public interface a {
        void a(boolean z15);
    }

    private c() {
    }

    public static c b() {
        return f92146e;
    }

    public static void c(Application application) {
        c cVar = f92146e;
        synchronized (cVar) {
            try {
                if (!cVar.f92150d) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f92150d = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void f(boolean z15) {
        synchronized (f92146e) {
            try {
                Iterator it = this.f92149c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f92146e) {
            this.f92149c.add(aVar);
        }
    }

    public boolean d() {
        return this.f92147a.get();
    }

    public boolean e(boolean z15) {
        AtomicBoolean atomicBoolean = this.f92148b;
        if (!atomicBoolean.get()) {
            if (com.google.android.gms.common.util.k.b()) {
                return z15;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f92147a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f92148b;
        boolean zCompareAndSet = this.f92147a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f92148b;
        boolean zCompareAndSet = this.f92147a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i15) {
        if (i15 == 20 && this.f92147a.compareAndSet(false, true)) {
            this.f92148b.set(true);
            f(true);
        }
    }
}
