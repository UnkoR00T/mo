package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
class f extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f35708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f35709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f35710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f35711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f35712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f35713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f35714m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f35771b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f35771b.a0(false);
        }
    }

    f(r rVar) {
        super(rVar);
        this.f35711j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f35699a, view);
            }
        };
        this.f35712k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z15) {
                f fVar = this.f35701a;
                fVar.A(fVar.E());
            }
        };
        this.f35706e = gj.e.f(rVar.getContext(), ri.b.B, 100);
        this.f35707f = gj.e.f(rVar.getContext(), ri.b.B, 150);
        this.f35708g = gj.e.g(rVar.getContext(), ri.b.G, si.a.f181916a);
        this.f35709h = gj.e.g(rVar.getContext(), ri.b.F, si.a.f181919d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z15) {
        boolean z16 = this.f35771b.F() == z15;
        if (z15 && !this.f35713l.isRunning()) {
            this.f35714m.cancel();
            this.f35713l.start();
            if (z16) {
                this.f35713l.end();
                return;
            }
            return;
        }
        if (z15) {
            return;
        }
        this.f35713l.cancel();
        this.f35714m.start();
        if (z16) {
            this.f35714m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f35708g);
        valueAnimatorOfFloat.setDuration(this.f35706e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f35702a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f35709h);
        valueAnimatorOfFloat.setDuration(this.f35707f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f35705a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35713l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f35713l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f35714m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f35710i;
        if (editText != null) {
            return (editText.hasFocus() || this.f35773d.hasFocus()) && this.f35710i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f35710i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f35773d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f35773d.setScaleX(fFloatValue);
        fVar.f35773d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.s
    void a(Editable editable) {
        if (this.f35771b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return ri.j.f174045e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return ri.e.f173989j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f35712k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f35711j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f35712k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f35710i = editText;
        this.f35770a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z15) {
        if (this.f35771b.w() == null) {
            return;
        }
        A(z15);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f35710i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35704a.A(true);
                }
            });
        }
    }
}
