package io.sentry.android.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import fr.p0;
import io.sentry.a1;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.f;
import io.sentry.h4;
import io.sentry.j0;
import io.sentry.j1;
import io.sentry.u8;
import java.util.Set;
import java.util.WeakHashMap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00011B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b$\u0010\"J1\u0010'\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010*J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010*J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010*J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010*J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010*J\u001f\u00100\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\b4\u00105R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u00106\u001a\u0004\b7\u00108R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010;R\u0014\u0010>\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u00108¨\u0006?"}, d2 = {"Lio/sentry/android/fragment/d;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lio/sentry/c1;", "scopes", "", "Lio/sentry/android/fragment/a;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Lio/sentry/c1;Ljava/util/Set;Z)V", "Landroidx/fragment/app/o;", "fragment", "state", "Loq/i0;", "q", "(Landroidx/fragment/app/o;Lio/sentry/android/fragment/a;)V", "", "r", "(Landroidx/fragment/app/o;)Ljava/lang/String;", "t", "(Landroidx/fragment/app/o;)Z", "v", "(Landroidx/fragment/app/o;)V", "x", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroid/content/Context;", "context", "b", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/o;Landroid/content/Context;)V", "Landroid/os/Bundle;", "outState", "j", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/o;Landroid/os/Bundle;)V", "savedInstanceState", "c", "Landroid/view/View;", "view", "m", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/o;Landroid/view/View;Landroid/os/Bundle;)V", "k", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/o;)V", "i", "f", "l", "n", "d", "e", "a", "Lio/sentry/c1;", "Ljava/util/Set;", "getFilterFragmentLifecycleBreadcrumbs$sentry_android_fragment_release", "()Ljava/util/Set;", "Z", "getEnableAutoFragmentLifecycleTracing$sentry_android_fragment_release", "()Z", "Ljava/util/WeakHashMap;", "Lio/sentry/j1;", "Ljava/util/WeakHashMap;", "fragmentsWithOngoingTransactions", "s", "isPerformanceEnabled", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends FragmentManager.FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<a> filterFragmentLifecycleBreadcrumbs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enableAutoFragmentLifecycleTracing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<o, j1> fragmentsWithOngoingTransactions = new WeakHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public d(c1 c1Var, Set<? extends a> set, boolean z15) {
        this.scopes = c1Var;
        this.filterFragmentLifecycleBreadcrumbs = set;
        this.enableAutoFragmentLifecycleTracing = z15;
    }

    private final void q(o fragment, a state) {
        if (this.filterFragmentLifecycleBreadcrumbs.contains(state)) {
            f fVar = new f();
            fVar.F("navigation");
            fVar.A("state", state.getBreadcrumbName());
            fVar.A("screen", r(fragment));
            fVar.z("ui.fragment.lifecycle");
            fVar.B(b7.INFO);
            j0 j0Var = new j0();
            j0Var.k("android:fragment", fragment);
            this.scopes.q(fVar, j0Var);
        }
    }

    private final String r(o fragment) {
        String canonicalName = fragment.getClass().getCanonicalName();
        return canonicalName == null ? fragment.getClass().getSimpleName() : canonicalName;
    }

    private final boolean s() {
        return this.scopes.s().isTracingEnabled() && this.enableAutoFragmentLifecycleTracing;
    }

    private final boolean t(o fragment) {
        return this.fragmentsWithOngoingTransactions.containsKey(fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(d dVar, o oVar, a1 a1Var) {
        a1Var.O(dVar.r(oVar));
    }

    private final void v(o fragment) {
        if (!s() || t(fragment)) {
            return;
        }
        final p0 p0Var = new p0();
        this.scopes.J(new h4() { // from class: io.sentry.android.fragment.c
            @Override // io.sentry.h4
            public final void a(a1 a1Var) {
                d.w(p0Var, a1Var);
            }
        });
        String strR = r(fragment);
        j1 j1Var = (j1) p0Var.f66410a;
        j1 j1VarZ = j1Var != null ? j1Var.z("ui.load", strR) : null;
        if (j1VarZ != null) {
            this.fragmentsWithOngoingTransactions.put(fragment, j1VarZ);
            j1VarZ.w().r("auto.ui.fragment");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, io.sentry.l1] */
    public static final void w(p0 p0Var, a1 a1Var) {
        p0Var.f66410a = a1Var.u();
    }

    private final void x(o fragment) {
        j1 j1Var;
        if (s() && t(fragment) && (j1Var = this.fragmentsWithOngoingTransactions.get(fragment)) != null) {
            u8 u8VarB = j1Var.b();
            if (u8VarB == null) {
                u8VarB = u8.OK;
            }
            j1Var.o(u8VarB);
            this.fragmentsWithOngoingTransactions.remove(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void b(FragmentManager fragmentManager, o fragment, Context context) {
        q(fragment, a.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void c(FragmentManager fragmentManager, final o fragment, Bundle savedInstanceState) {
        q(fragment, a.CREATED);
        if (fragment.i0()) {
            if (this.scopes.s().isEnableScreenTracking()) {
                this.scopes.J(new h4() { // from class: io.sentry.android.fragment.b
                    @Override // io.sentry.h4
                    public final void a(a1 a1Var) {
                        d.u(this.f94207a, fragment, a1Var);
                    }
                });
            }
            v(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void d(FragmentManager fragmentManager, o fragment) {
        q(fragment, a.DESTROYED);
        x(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void e(FragmentManager fragmentManager, o fragment) {
        q(fragment, a.DETACHED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void f(FragmentManager fragmentManager, o fragment) {
        q(fragment, a.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void i(FragmentManager fragmentManager, o fragment) {
        q(fragment, a.RESUMED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void j(FragmentManager fragmentManager, o fragment, Bundle outState) {
        q(fragment, a.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void k(FragmentManager fragmentManager, o fragment) {
        q(fragment, a.STARTED);
        x(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void l(FragmentManager fragmentManager, o fragment) {
        q(fragment, a.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void m(FragmentManager fragmentManager, o fragment, View view, Bundle savedInstanceState) {
        q(fragment, a.VIEW_CREATED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void n(FragmentManager fragmentManager, o fragment) {
        q(fragment, a.VIEW_DESTROYED);
    }
}
