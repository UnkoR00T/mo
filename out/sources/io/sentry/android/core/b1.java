package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b1 f93761b = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f93762a;

    private b1() {
    }

    public static b1 c() {
        return f93761b;
    }

    public void a(Activity activity) {
        WeakReference<Activity> weakReference = this.f93762a;
        if (weakReference == null || weakReference.get() == activity) {
            this.f93762a = null;
        }
    }

    public Activity b() {
        WeakReference<Activity> weakReference = this.f93762a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference<Activity> weakReference = this.f93762a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f93762a = new WeakReference<>(activity);
        }
    }
}
