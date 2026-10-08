package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.t0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class p implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f94007a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f94008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f94009c;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(p.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private p(View view, Runnable runnable) {
        this.f94008b = new AtomicReference<>(view);
        this.f94009c = runnable;
    }

    public static /* synthetic */ void a(p pVar, View view) {
        pVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(pVar);
    }

    public static /* synthetic */ void b(Window window, Window.Callback callback, Runnable runnable, t0 t0Var) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            e(viewPeekDecorView, runnable, t0Var);
        }
    }

    private static boolean c(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void d(Activity activity, final Runnable runnable, final t0 t0Var) {
        final Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                e(viewPeekDecorView, runnable, t0Var);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.j(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new Runnable() { // from class: io.sentry.android.core.internal.util.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.b(window, callback, runnable, t0Var);
                    }
                }));
            }
        }
    }

    public static void e(View view, Runnable runnable, t0 t0Var) {
        p pVar = new p(view, runnable);
        if (t0Var.d() >= 26 || c(view)) {
            view.getViewTreeObserver().addOnDrawListener(pVar);
        } else {
            view.addOnAttachStateChangeListener(pVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f94008b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                p.a(this.f94005a, andSet);
            }
        });
        this.f94007a.postAtFrontOfQueue(this.f94009c);
    }
}
