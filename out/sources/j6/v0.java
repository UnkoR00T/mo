package j6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f99753a;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f99754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f99755b;

        a(w0 w0Var, View view) {
            this.f99754a = w0Var;
            this.f99755b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f99754a.a(this.f99755b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f99754a.b(this.f99755b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f99754a.c(this.f99755b);
        }
    }

    v0(View view) {
        this.f99753a = new WeakReference<>(view);
    }

    private void h(View view, w0 w0Var) {
        if (w0Var != null) {
            view.animate().setListener(new a(w0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public v0 b(float f15) {
        View view = this.f99753a.get();
        if (view != null) {
            view.animate().alpha(f15);
        }
        return this;
    }

    public void c() {
        View view = this.f99753a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f99753a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public v0 e(long j15) {
        View view = this.f99753a.get();
        if (view != null) {
            view.animate().setDuration(j15);
        }
        return this;
    }

    public v0 f(Interpolator interpolator) {
        View view = this.f99753a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public v0 g(w0 w0Var) {
        View view = this.f99753a.get();
        if (view != null) {
            h(view, w0Var);
        }
        return this;
    }

    public v0 i(long j15) {
        View view = this.f99753a.get();
        if (view != null) {
            view.animate().setStartDelay(j15);
        }
        return this;
    }

    public v0 j(final y0 y0Var) {
        final View view = this.f99753a.get();
        if (view != null) {
            view.animate().setUpdateListener(y0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: j6.u0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    y0Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = this.f99753a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public v0 l(float f15) {
        View view = this.f99753a.get();
        if (view != null) {
            view.animate().translationY(f15);
        }
        return this;
    }
}
