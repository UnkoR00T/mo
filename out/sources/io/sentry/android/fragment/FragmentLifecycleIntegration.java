package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import fr.k;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.q7;
import io.sentry.r1;
import io.sentry.util.p;
import io.sentry.z6;
import java.io.Closeable;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010 J\u001f\u0010%\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010&\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lio/sentry/r1;", "Ljava/io/Closeable;", "Landroid/app/Application;", "application", "", "Lio/sentry/android/fragment/a;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Landroid/app/Application;Ljava/util/Set;Z)V", "(Landroid/app/Application;)V", "enableFragmentLifecycleBreadcrumbs", "(Landroid/app/Application;ZZ)V", "Lio/sentry/c1;", "scopes", "Lio/sentry/q7;", "options", "Loq/i0;", "m", "(Lio/sentry/c1;Lio/sentry/q7;)V", "close", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "a", "Landroid/app/Application;", "b", "Ljava/util/Set;", "c", "Z", "d", "Lio/sentry/c1;", "e", "Lio/sentry/q7;", "f", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, r1, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f94201f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<io.sentry.android.fragment.a> filterFragmentLifecycleBreadcrumbs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enableAutoFragmentLifecycleTracing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private c1 scopes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private q7 options;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration$a;", "", "<init>", "()V", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static {
        z6.d().b("maven:io.sentry:sentry-android-fragment", "8.22.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentLifecycleIntegration(Application application, Set<? extends io.sentry.android.fragment.a> set, boolean z15) {
        this.application = application;
        this.filterFragmentLifecycleBreadcrumbs = set;
        this.enableAutoFragmentLifecycleTracing = z15;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.application.unregisterActivityLifecycleCallbacks(this);
        q7 q7Var = this.options;
        if (q7Var != null) {
            if (q7Var == null) {
                q7Var = null;
            }
            q7Var.getLogger().c(b7.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.r1
    public void m(c1 scopes, q7 options) {
        this.scopes = scopes;
        this.options = options;
        this.application.registerActivityLifecycleCallbacks(this);
        options.getLogger().c(b7.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        p.a("FragmentLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        FragmentManager fragmentManagerW0;
        androidx.fragment.app.p pVar = activity instanceof androidx.fragment.app.p ? (androidx.fragment.app.p) activity : null;
        if (pVar == null || (fragmentManagerW0 = pVar.w0()) == null) {
            return;
        }
        c1 c1Var = this.scopes;
        fragmentManagerW0.h1(new d(c1Var != null ? c1Var : null, this.filterFragmentLifecycleBreadcrumbs, this.enableAutoFragmentLifecycleTracing), true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public FragmentLifecycleIntegration(Application application) {
        this(application, (Set<? extends io.sentry.android.fragment.a>) io.sentry.android.fragment.a.INSTANCE.a(), false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentLifecycleIntegration(Application application, boolean z15, boolean z16) {
        Set<io.sentry.android.fragment.a> setA = z15 ? io.sentry.android.fragment.a.INSTANCE.a() : null;
        this(application, setA == null ? e1.e() : setA, z16);
    }
}
