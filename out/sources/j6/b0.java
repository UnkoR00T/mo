package j6;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f99619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f99620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f99621c;

    private b0(View view, Runnable runnable) {
        this.f99619a = view;
        this.f99620b = view.getViewTreeObserver();
        this.f99621c = runnable;
    }

    public static b0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        b0 b0Var = new b0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(b0Var);
        view.addOnAttachStateChangeListener(b0Var);
        return b0Var;
    }

    public void b() {
        if (this.f99620b.isAlive()) {
            this.f99620b.removeOnPreDrawListener(this);
        } else {
            this.f99619a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f99619a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f99621c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f99620b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
