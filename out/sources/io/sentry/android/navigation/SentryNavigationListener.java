package io.sentry.android.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import fr.k;
import fr.t;
import fu.r;
import io.sentry.a1;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.c9;
import io.sentry.e9;
import io.sentry.f;
import io.sentry.f4;
import io.sentry.h4;
import io.sentry.j0;
import io.sentry.l1;
import io.sentry.n8;
import io.sentry.protocol.f0;
import io.sentry.r4;
import io.sentry.u8;
import io.sentry.util.i0;
import io.sentry.util.p;
import io.sentry.z6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import lr.m;
import p071kotlin.Metadata;
import p136y9.e0;
import p136y9.y0;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001!B3\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r*\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0014\u00105\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lio/sentry/android/navigation/SentryNavigationListener;", "Ly9/e0$c;", "Lio/sentry/c1;", "scopes", "", "enableNavigationBreadcrumbs", "enableNavigationTracing", "", "traceOriginAppendix", "<init>", "(Lio/sentry/c1;ZZLjava/lang/String;)V", "Ly9/y0;", "destination", "", "", "arguments", "Loq/i0;", "g", "(Ly9/y0;Ljava/util/Map;)V", "routeName", "l", "(Ljava/lang/String;Ly9/y0;Ljava/util/Map;)V", "o", "()V", "Landroid/os/Bundle;", "k", "(Landroid/os/Bundle;)Ljava/util/Map;", "Landroid/content/Context;", "context", "h", "(Ly9/y0;Landroid/content/Context;)Ljava/lang/String;", "Ly9/e0;", "controller", "a", "(Ly9/e0;Ly9/y0;Landroid/os/Bundle;)V", "Lio/sentry/c1;", "b", "Z", "c", "d", "Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "e", "Ljava/lang/ref/WeakReference;", "previousDestinationRef", "f", "Landroid/os/Bundle;", "previousArgs", "Lio/sentry/l1;", "Lio/sentry/l1;", "activeTransaction", "i", "()Z", "isPerformanceEnabled", "sentry-android-navigation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SentryNavigationListener implements e0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enableNavigationBreadcrumbs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enableNavigationTracing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String traceOriginAppendix;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private WeakReference<y0> previousDestinationRef;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Bundle previousArgs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private l1 activeTransaction;

    static {
        z6.d().b("maven:io.sentry:sentry-android-navigation", "8.22.0");
    }

    public SentryNavigationListener() {
        this(null, false, false, null, 15, null);
    }

    private final void g(y0 destination, Map<String, ? extends Object> arguments) {
        y0 y0Var;
        if (this.enableNavigationBreadcrumbs) {
            f fVar = new f();
            fVar.F("navigation");
            fVar.z("navigation");
            WeakReference<y0> weakReference = this.previousDestinationRef;
            String strU = (weakReference == null || (y0Var = weakReference.get()) == null) ? null : y0Var.u();
            if (strU != null) {
                fVar.p().put("from", '/' + strU);
            }
            Map<String, Object> mapK = k(this.previousArgs);
            if (!mapK.isEmpty()) {
                fVar.p().put("from_arguments", mapK);
            }
            String strU2 = destination.u();
            if (strU2 != null) {
                fVar.p().put("to", '/' + strU2);
            }
            if (!arguments.isEmpty()) {
                fVar.p().put("to_arguments", arguments);
            }
            fVar.B(b7.INFO);
            j0 j0Var = new j0();
            j0Var.k("android:navigationDestination", destination);
            this.scopes.q(fVar, j0Var);
        }
    }

    private final String h(y0 y0Var, Context context) {
        String strU = y0Var.u();
        if (strU == null) {
            try {
                strU = context.getResources().getResourceEntryName(y0Var.o());
            } catch (Resources.NotFoundException unused) {
                this.scopes.s().getLogger().c(b7.DEBUG, "Destination id cannot be retrieved from Resources, no transaction captured.", new Object[0]);
                strU = null;
            }
            if (strU == null) {
                return null;
            }
        }
        return '/' + r.n1(strU, '/', null, 2, null);
    }

    private final boolean i() {
        return this.scopes.s().isTracingEnabled() && this.enableNavigationTracing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(String str, a1 a1Var) {
        a1Var.O(str);
    }

    private final Map<String, Object> k(Bundle bundle) {
        if (bundle == null) {
            return v0.i();
        }
        Set<String> setKeySet = bundle.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!t.c((String) obj, "android-support-nav:controller:deepLinkIntent")) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, bundle.get((String) obj2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    private final void l(String routeName, y0 destination, Map<String, ? extends Object> arguments) {
        String str;
        if (!i()) {
            i0.j(this.scopes);
            return;
        }
        if (this.activeTransaction != null) {
            o();
        }
        if (t.c(destination.getNavigatorName(), "activity")) {
            this.scopes.s().getLogger().c(b7.DEBUG, "Navigating to activity destination, no transaction captured.", new Object[0]);
            return;
        }
        e9 e9Var = new e9();
        e9Var.v(true);
        e9Var.t(this.scopes.s().getIdleTimeout());
        long deadlineTimeout = this.scopes.s().getDeadlineTimeout();
        e9Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        e9Var.i(true);
        final l1 l1VarS = this.scopes.S(new c9(routeName, f0.ROUTE, "navigation"), e9Var);
        n8 n8VarW = l1VarS.w();
        if (this.traceOriginAppendix != null) {
            str = "auto.navigation." + this.traceOriginAppendix;
            if (str == null) {
                str = "auto.navigation";
            }
        } else {
            str = "auto.navigation";
        }
        n8VarW.r(str);
        if (!arguments.isEmpty()) {
            l1VarS.m("arguments", arguments);
        }
        this.scopes.J(new h4() { // from class: io.sentry.android.navigation.b
            @Override // io.sentry.h4
            public final void a(a1 a1Var) {
                SentryNavigationListener.m(l1VarS, a1Var);
            }
        });
        this.activeTransaction = l1VarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final l1 l1Var, final a1 a1Var) {
        a1Var.S(new f4.c() { // from class: io.sentry.android.navigation.c
            @Override // io.sentry.f4.c
            public final void a(l1 l1Var2) {
                SentryNavigationListener.n(a1Var, l1Var, l1Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(a1 a1Var, l1 l1Var, l1 l1Var2) {
        if (l1Var2 == null) {
            a1Var.F(l1Var);
        }
    }

    private final void o() {
        u8 u8VarB;
        l1 l1Var = this.activeTransaction;
        if (l1Var == null || (u8VarB = l1Var.b()) == null) {
            u8VarB = u8.OK;
        }
        l1 l1Var2 = this.activeTransaction;
        if (l1Var2 != null) {
            l1Var2.o(u8VarB);
        }
        this.scopes.J(new h4() { // from class: io.sentry.android.navigation.d
            @Override // io.sentry.h4
            public final void a(a1 a1Var) {
                SentryNavigationListener.p(this.f94227a, a1Var);
            }
        });
        this.activeTransaction = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final SentryNavigationListener sentryNavigationListener, final a1 a1Var) {
        a1Var.S(new f4.c() { // from class: io.sentry.android.navigation.e
            @Override // io.sentry.f4.c
            public final void a(l1 l1Var) {
                SentryNavigationListener.q(this.f94228a, a1Var, l1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SentryNavigationListener sentryNavigationListener, a1 a1Var, l1 l1Var) {
        if (t.c(l1Var, sentryNavigationListener.activeTransaction)) {
            a1Var.J();
        }
    }

    @Override // y9.e0.c
    public void a(e0 controller, y0 destination, Bundle arguments) {
        Map<String, Object> mapK = k(arguments);
        g(destination, mapK);
        final String strH = h(destination, controller.getContext());
        if (strH != null) {
            if (this.scopes.s().isEnableScreenTracking()) {
                this.scopes.J(new h4() { // from class: io.sentry.android.navigation.a
                    @Override // io.sentry.h4
                    public final void a(a1 a1Var) {
                        SentryNavigationListener.j(strH, a1Var);
                    }
                });
            }
            l(strH, destination, mapK);
        }
        this.previousDestinationRef = new WeakReference<>(destination);
        this.previousArgs = arguments;
    }

    public SentryNavigationListener(c1 c1Var, boolean z15, boolean z16, String str) {
        this.scopes = c1Var;
        this.enableNavigationBreadcrumbs = z15;
        this.enableNavigationTracing = z16;
        this.traceOriginAppendix = str;
        p.a("NavigationListener");
    }

    public /* synthetic */ SentryNavigationListener(c1 c1Var, boolean z15, boolean z16, String str, int i15, k kVar) {
        this((i15 & 1) != 0 ? r4.b() : c1Var, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? true : z16, (i15 & 8) != 0 ? null : str);
    }
}
