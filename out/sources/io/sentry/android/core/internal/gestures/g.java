package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.a1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.c9;
import io.sentry.e9;
import io.sentry.f4;
import io.sentry.h4;
import io.sentry.j0;
import io.sentry.l1;
import io.sentry.protocol.f0;
import io.sentry.u8;
import io.sentry.util.i0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f93908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f93909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f93910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.internal.gestures.b f93911d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l1 f93912e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f93913f = b.Unknown;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f93914g = new c(null);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93915a;

        static {
            int[] iArr = new int[b.values().length];
            f93915a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93915a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93915a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93915a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public g(Activity activity, c1 c1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f93908a = new WeakReference<>(activity);
        this.f93909b = c1Var;
        this.f93910c = sentryAndroidOptions;
    }

    public static /* synthetic */ void b(g gVar, a1 a1Var, l1 l1Var, l1 l1Var2) {
        if (l1Var2 != null) {
            gVar.f93910c.getLogger().c(b7.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", l1Var.getName());
        } else {
            gVar.getClass();
            a1Var.F(l1Var);
        }
    }

    public static /* synthetic */ void d(g gVar, a1 a1Var, l1 l1Var) {
        if (l1Var == gVar.f93912e) {
            a1Var.J();
        }
    }

    private void e(io.sentry.internal.gestures.b bVar, b bVar2, Map<String, Object> map, MotionEvent motionEvent) {
        if (this.f93910c.isEnableUserInteractionBreadcrumbs()) {
            String strJ = j(bVar2);
            j0 j0Var = new j0();
            j0Var.k("android:motionEvent", motionEvent);
            j0Var.k("android:view", bVar.f());
            this.f93909b.q(io.sentry.f.H(strJ, bVar.d(), bVar.a(), bVar.e(), map), j0Var);
        }
    }

    private View h(String str) {
        Activity activity = this.f93908a.get();
        if (activity == null) {
            this.f93910c.getLogger().c(b7.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f93910c.getLogger().c(b7.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f93910c.getLogger().c(b7.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    private String i(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private static String j(b bVar) {
        int i15 = a.f93915a[bVar.ordinal()];
        if (i15 == 1) {
            return "click";
        }
        if (i15 != 2) {
            return i15 != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    private void l(io.sentry.internal.gestures.b bVar, b bVar2) {
        boolean z15 = bVar2 == b.Click || !(bVar2 == this.f93913f && bVar.equals(this.f93911d));
        if (!this.f93910c.isTracingEnabled() || !this.f93910c.isEnableUserInteractionTracing()) {
            if (z15) {
                if (this.f93910c.isEnableAutoTraceIdGeneration()) {
                    i0.j(this.f93909b);
                }
                this.f93911d = bVar;
                this.f93913f = bVar2;
                return;
            }
            return;
        }
        Activity activity = this.f93908a.get();
        if (activity == null) {
            this.f93910c.getLogger().c(b7.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strB = bVar.b();
        l1 l1Var = this.f93912e;
        if (l1Var != null) {
            if (!z15 && !l1Var.d()) {
                this.f93910c.getLogger().c(b7.DEBUG, "The view with id: " + strB + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f93910c.getIdleTimeout() != null) {
                    this.f93912e.v();
                    return;
                }
                return;
            }
            m(u8.OK);
        }
        String str = i(activity) + "." + strB;
        String str2 = "ui.action." + j(bVar2);
        e9 e9Var = new e9();
        e9Var.v(true);
        long deadlineTimeout = this.f93910c.getDeadlineTimeout();
        e9Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        e9Var.t(this.f93910c.getIdleTimeout());
        e9Var.i(true);
        e9Var.g("auto.ui.gesture_listener." + bVar.c());
        final l1 l1VarS = this.f93909b.S(new c9(str, f0.COMPONENT, str2), e9Var);
        this.f93909b.J(new h4() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.h4
            public final void a(a1 a1Var) {
                this.f93901a.f(a1Var, l1VarS);
            }
        });
        this.f93912e = l1VarS;
        this.f93911d = bVar;
        this.f93913f = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(final a1 a1Var, final l1 l1Var) {
        a1Var.S(new f4.c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.f4.c
            public final void a(l1 l1Var2) {
                g.b(this.f93903a, a1Var, l1Var, l1Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(final a1 a1Var) {
        a1Var.S(new f4.c() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.f4.c
            public final void a(l1 l1Var) {
                g.d(this.f93906a, a1Var, l1Var);
            }
        });
    }

    public void k(MotionEvent motionEvent) {
        View viewH = h("onUp");
        io.sentry.internal.gestures.b bVar = this.f93914g.f93917b;
        if (viewH == null || bVar == null) {
            return;
        }
        if (this.f93914g.f93916a == b.Unknown) {
            this.f93910c.getLogger().c(b7.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        e(bVar, this.f93914g.f93916a, Collections.singletonMap("direction", this.f93914g.i(motionEvent)), motionEvent);
        l(bVar, this.f93914g.f93916a);
        this.f93914g.j();
    }

    void m(u8 u8Var) {
        l1 l1Var = this.f93912e;
        if (l1Var != null) {
            if (l1Var.b() == null) {
                this.f93912e.o(u8Var);
            } else {
                this.f93912e.g();
            }
        }
        this.f93909b.J(new h4() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.h4
            public final void a(a1 a1Var) {
                this.f93900a.g(a1Var);
            }
        });
        this.f93912e = null;
        if (this.f93911d != null) {
            this.f93911d = null;
        }
        this.f93913f = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f93914g.j();
        this.f93914g.f93918c = motionEvent.getX();
        this.f93914g.f93919d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f15, float f16) {
        this.f93914g.f93916a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f15, float f16) {
        View viewH = h("onScroll");
        if (viewH != null && motionEvent != null && this.f93914g.f93916a == b.Unknown) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f93910c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.SCROLLABLE);
            if (bVarA == null) {
                this.f93910c.getLogger().c(b7.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                this.f93914g.f93916a = b.Scroll;
                return false;
            }
            this.f93910c.getLogger().c(b7.DEBUG, "Scroll target found: " + bVarA.b(), new Object[0]);
            this.f93914g.k(bVarA);
            this.f93914g.f93916a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewH = h("onSingleTapUp");
        if (viewH != null && motionEvent != null) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f93910c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.CLICKABLE);
            if (bVarA == null) {
                this.f93910c.getLogger().c(b7.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            e(bVarA, bVar, Collections.EMPTY_MAP, motionEvent);
            l(bVarA, bVar);
        }
        return false;
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f93916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.sentry.internal.gestures.b f93917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f93918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f93919d;

        private c() {
            this.f93916a = b.Unknown;
            this.f93918c = 0.0f;
            this.f93919d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String i(MotionEvent motionEvent) {
            float x15 = motionEvent.getX() - this.f93918c;
            float y15 = motionEvent.getY() - this.f93919d;
            if (Math.abs(x15) > Math.abs(y15)) {
                return x15 > 0.0f ? "right" : "left";
            }
            return y15 > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f93917b = null;
            this.f93916a = b.Unknown;
            this.f93918c = 0.0f;
            this.f93919d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(io.sentry.internal.gestures.b bVar) {
            this.f93917b = bVar;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}
