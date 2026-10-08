package fb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class c extends h0 {

    private static class a extends AnimatorListenerAdapter implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f60570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f60571b = false;

        a(View view) {
            this.f60570a = view;
        }

        @Override // fb.k.h
        public void a(k kVar) {
            this.f60570a.setTag(h.f60601d, null);
        }

        @Override // fb.k.h
        public void d(k kVar) {
            this.f60570a.setTag(h.f60601d, Float.valueOf(this.f60570a.getVisibility() == 0 ? b0.b(this.f60570a) : 0.0f));
        }

        @Override // fb.k.h
        public void e(k kVar, boolean z15) {
        }

        @Override // fb.k.h
        public void h(k kVar) {
        }

        @Override // fb.k.h
        public void k(k kVar) {
        }

        @Override // fb.k.h
        public void l(k kVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            b0.e(this.f60570a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f60570a.hasOverlappingRendering() && this.f60570a.getLayerType() == 0) {
                this.f60571b = true;
                this.f60570a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z15) {
            if (this.f60571b) {
                this.f60570a.setLayerType(0, null);
            }
            if (z15) {
                return;
            }
            b0.e(this.f60570a, 1.0f);
            b0.a(this.f60570a);
        }
    }

    public c(int i15) {
        I0(i15);
    }

    private Animator J0(View view, float f15, float f16) {
        if (f15 == f16) {
            return null;
        }
        b0.e(view, f15);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, b0.f60568b, f16);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        J().e(aVar);
        return objectAnimatorOfFloat;
    }

    private static float K0(x xVar, float f15) {
        Float f16;
        return (xVar == null || (f16 = (Float) xVar.f60691a.get("android:fade:transitionAlpha")) == null) ? f15 : f16.floatValue();
    }

    @Override // fb.h0
    public Animator D0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        b0.c(view);
        return J0(view, K0(xVar, 0.0f), 1.0f);
    }

    @Override // fb.h0
    public Animator F0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        b0.c(view);
        Animator animatorJ0 = J0(view, K0(xVar, 1.0f), 0.0f);
        if (animatorJ0 == null) {
            b0.e(view, K0(xVar2, 1.0f));
        }
        return animatorJ0;
    }

    @Override // fb.k
    public boolean X() {
        return true;
    }

    @Override // fb.h0, fb.k
    public void p(x xVar) {
        super.p(xVar);
        Float fValueOf = (Float) xVar.f60692b.getTag(h.f60601d);
        if (fValueOf == null) {
            fValueOf = xVar.f60692b.getVisibility() == 0 ? Float.valueOf(b0.b(xVar.f60692b)) : Float.valueOf(0.0f);
        }
        xVar.f60691a.put("android:fade:transitionAlpha", fValueOf);
    }

    public c() {
    }
}
