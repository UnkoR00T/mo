package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.n41;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f118305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ RecyclerView.f0 f118306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewPropertyAnimator f118307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f118308d;

    a(b bVar, View view, RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator) {
        this.f118305a = view;
        this.f118306b = f0Var;
        this.f118307c = viewPropertyAnimator;
        Objects.requireNonNull(bVar);
        this.f118308d = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        try {
            b.e0(this.f118305a);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        try {
            ViewPropertyAnimator viewPropertyAnimator = this.f118307c;
            viewPropertyAnimator.setListener(null);
            b bVar = this.f118308d;
            RecyclerView.f0 f0Var = this.f118306b;
            bVar.A(f0Var);
            bVar.c0().remove(f0Var);
            bVar.a0();
            viewPropertyAnimator.setStartDelay(0L);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        try {
            this.f118305a.setAlpha(0.0f);
            this.f118308d.B(this.f118306b);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }
}
