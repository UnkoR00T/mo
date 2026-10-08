package io.sentry.compose;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.q;
import er.l;
import fr.w;
import io.sentry.android.navigation.SentryNavigationListener;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.f6;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import p076m2.x5;
import p136y9.g1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f²\u0006\f\u0010\f\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ly9/g1;", "Lio/sentry/android/navigation/SentryNavigationListener;", "navListener", "b", "(Ly9/g1;Lio/sentry/android/navigation/SentryNavigationListener;Lm2/r;I)Ly9/g1;", "", "enableNavigationBreadcrumbs", "enableNavigationTracing", "d", "(Ly9/g1;ZZLm2/r;II)Ly9/g1;", "c", "(Ly9/g1;Lm2/r;I)Ly9/g1;", "navListenerSnapshot", "enableBreadcrumbsSnapshot", "enableTracingSnapshot", "sentry-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "c", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {1, 9, 0})
    static final class a extends w implements l<s0, r0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g1 f94797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f94798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f6<SentryNavigationListener> f94799d;

        /* JADX INFO: renamed from: io.sentry.compose.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/sentry/compose/d$a$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C2234a implements r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f94800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f94801b;

            public C2234a(c cVar, j jVar) {
                this.f94800a = cVar;
                this.f94801b = jVar;
            }

            @Override // p076m2.r0
            public void j() {
                this.f94800a.a();
                this.f94801b.d(this.f94800a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g1 g1Var, j jVar, f6<SentryNavigationListener> f6Var) {
            super(1);
            this.f94797b = g1Var;
            this.f94798c = jVar;
            this.f94799d = f6Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 b(s0 s0Var) {
            c cVar = new c(this.f94797b, d.e(this.f94799d));
            this.f94798c.a(cVar);
            return new C2234a(cVar, this.f94798c);
        }
    }

    public static final g1 b(g1 g1Var, SentryNavigationListener sentryNavigationListener, r rVar, int i15) {
        rVar.C(-1995447566);
        if (t.k()) {
            t.o(-1995447566, i15, -1, "io.sentry.compose.withSentryObservableEffect (SentryNavigationIntegration.kt:62)");
        }
        f6 f6VarP = x5.p(sentryNavigationListener, rVar, (i15 >> 3) & 14);
        j lifecycleRegistry = ((q) rVar.N(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
        rVar.C(-1960975799);
        boolean zG = rVar.G(g1Var) | rVar.W(f6VarP) | rVar.G(lifecycleRegistry);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new a(g1Var, lifecycleRegistry, f6VarP);
            rVar.v(objE);
        }
        rVar.V();
        Function0.b(lifecycleRegistry, g1Var, (l) objE, rVar, (i15 << 3) & 112);
        if (t.k()) {
            t.n();
        }
        rVar.V();
        return g1Var;
    }

    public static final g1 c(g1 g1Var, r rVar, int i15) {
        rVar.C(-941334997);
        if (t.k()) {
            t.o(-941334997, i15, -1, "io.sentry.compose.withSentryObservableEffect (SentryNavigationIntegration.kt:119)");
        }
        g1 g1VarD = d(g1Var, true, true, rVar, (i15 & 14) | 432, 0);
        if (t.k()) {
            t.n();
        }
        rVar.V();
        return g1VarD;
    }

    public static final g1 d(g1 g1Var, boolean z15, boolean z16, r rVar, int i15, int i16) {
        rVar.C(-2071393061);
        if ((i16 & 1) != 0) {
            z15 = true;
        }
        if ((i16 & 2) != 0) {
            z16 = true;
        }
        if (t.k()) {
            t.o(-2071393061, i15, -1, "io.sentry.compose.withSentryObservableEffect (SentryNavigationIntegration.kt:97)");
        }
        g1 g1VarB = b(g1Var, new SentryNavigationListener(null, f(x5.p(Boolean.valueOf(z15), rVar, (i15 >> 3) & 14)), g(x5.p(Boolean.valueOf(z16), rVar, (i15 >> 6) & 14)), "jetpack_compose", 1, null), rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
        rVar.V();
        return g1VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SentryNavigationListener e(f6<SentryNavigationListener> f6Var) {
        return f6Var.getValue();
    }

    private static final boolean f(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    private static final boolean g(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }
}
