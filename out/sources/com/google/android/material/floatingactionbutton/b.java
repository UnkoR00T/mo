package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import lj.h;
import lj.i;
import lj.l;
import lj.o;
import si.g;

/* JADX INFO: loaded from: classes4.dex */
class b {
    static final TimeInterpolator B = si.a.f181918c;
    private static final int C = ri.b.f173928w;
    private static final int D = ri.b.F;
    private static final int E = ri.b.f173929x;
    private static final int F = ri.b.D;
    static final int[] G = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] H = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] I = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] J = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] K = {R.attr.state_enabled};
    static final int[] L = new int[0];
    private ViewTreeObserver.OnPreDrawListener A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    l f35271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h f35272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f35273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Drawable f35274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f35275e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f35277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f35278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f35279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f35280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private StateListAnimator f35281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f35282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private si.h f35283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private si.h f35284n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35286p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f35288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f35289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<e> f35290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final FloatingActionButton f35291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final kj.b f35292v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f35276f = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35285o = 1.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35287q = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f35293w = new Rect();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final RectF f35294x = new RectF();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final RectF f35295y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Matrix f35296z = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f35299c;

        a(boolean z15, f fVar) {
            this.f35298b = z15;
            this.f35299c = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35297a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f35287q = 0;
            b.this.f35282l = null;
            if (this.f35297a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.f35291u;
            boolean z15 = this.f35298b;
            floatingActionButton.b(z15 ? 8 : 4, z15);
            f fVar = this.f35299c;
            if (fVar != null) {
                fVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f35291u.b(0, this.f35298b);
            b.this.f35287q = 1;
            b.this.f35282l = animator;
            this.f35297a = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    class C0749b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f35302b;

        C0749b(boolean z15, f fVar) {
            this.f35301a = z15;
            this.f35302b = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.f35287q = 0;
            b.this.f35282l = null;
            f fVar = this.f35302b;
            if (fVar != null) {
                fVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f35291u.b(0, this.f35301a);
            b.this.f35287q = 2;
            b.this.f35282l = animator;
        }
    }

    class c extends g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f15, Matrix matrix, Matrix matrix2) {
            b.this.f35285o = f15;
            return super.evaluate(f15, matrix, matrix2);
        }
    }

    class d implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final FloatEvaluator f35305a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f15, Float f16, Float f17) {
            float fFloatValue = this.f35305a.evaluate(f15, (Number) f16, (Number) f17).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    interface e {
        void a();

        void b();
    }

    interface f {
        void a();

        void b();
    }

    b(FloatingActionButton floatingActionButton, kj.b bVar) {
        this.f35291u = floatingActionButton;
        this.f35292v = bVar;
    }

    private boolean V() {
        return this.f35291u.isLaidOut() && !this.f35291u.isInEditMode();
    }

    public static /* synthetic */ void a(b bVar, float f15, float f16, float f17, float f18, float f19, float f25, float f26, Matrix matrix, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f35291u.setAlpha(si.a.b(f15, f16, 0.0f, 0.2f, fFloatValue));
        bVar.f35291u.setScaleX(si.a.a(f17, f18, fFloatValue));
        bVar.f35291u.setScaleY(si.a.a(f19, f18, fFloatValue));
        bVar.f35285o = si.a.a(f25, f26, fFloatValue);
        bVar.h(si.a.a(f25, f26, fFloatValue), matrix);
        bVar.f35291u.setImageMatrix(matrix);
    }

    private void a0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    private void h(float f15, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f35291u.getDrawable();
        if (drawable == null || this.f35286p == 0) {
            return;
        }
        RectF rectF = this.f35294x;
        RectF rectF2 = this.f35295y;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i15 = this.f35286p;
        rectF2.set(0.0f, 0.0f, i15, i15);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i16 = this.f35286p;
        matrix.postScale(f15, f15, i16 / 2.0f, i16 / 2.0f);
    }

    private AnimatorSet i(si.h hVar, float f15, float f16, float f17) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35291u, (Property<FloatingActionButton, Float>) View.ALPHA, f15);
        hVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f35291u, (Property<FloatingActionButton, Float>) View.SCALE_X, f16);
        hVar.e("scale").a(objectAnimatorOfFloat2);
        a0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f35291u, (Property<FloatingActionButton, Float>) View.SCALE_Y, f16);
        hVar.e("scale").a(objectAnimatorOfFloat3);
        a0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f17, this.f35296z);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f35291u, new si.f(), new c(), new Matrix(this.f35296z));
        hVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        si.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(final float f15, final float f16, final float f17, int i15, int i16) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f35291u.getAlpha();
        final float scaleX = this.f35291u.getScaleX();
        final float scaleY = this.f35291u.getScaleY();
        final float f18 = this.f35285o;
        final Matrix matrix = new Matrix(this.f35296z);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.a(this.f35262a, alpha, f15, scaleX, f16, scaleY, f18, f17, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        si.b.a(animatorSet, arrayList);
        animatorSet.setDuration(gj.e.f(this.f35291u.getContext(), i15, this.f35291u.getContext().getResources().getInteger(ri.g.f174018b)));
        animatorSet.setInterpolator(gj.e.g(this.f35291u.getContext(), i16, si.a.f181917b));
        return animatorSet;
    }

    private StateListAnimator k(float f15, float f16, float f17) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(G, l(f15, f17));
        stateListAnimator.addState(H, l(f15, f16));
        stateListAnimator.addState(I, l(f15, f16));
        stateListAnimator.addState(J, l(f15, f16));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f35291u, "elevation", f15).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f35291u, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(B);
        stateListAnimator.addState(K, animatorSet);
        stateListAnimator.addState(L, l(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator l(float f15, float f16) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f35291u, "elevation", f15).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f35291u, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f16).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

    void A() {
        h hVar = this.f35272b;
        if (hVar != null) {
            i.f(this.f35291u, hVar);
        }
    }

    void B() {
        Y();
    }

    void C() {
        ViewTreeObserver viewTreeObserver = this.f35291u.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.A;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.A = null;
        }
    }

    void D(float f15, float f16, float f17) {
        if (this.f35291u.getStateListAnimator() == this.f35281k) {
            StateListAnimator stateListAnimatorK = k(f15, f16, f17);
            this.f35281k = stateListAnimatorK;
            this.f35291u.setStateListAnimator(stateListAnimatorK);
        }
        if (U()) {
            Y();
        }
    }

    void E(Rect rect) {
        i6.i.h(this.f35274d, "Didn't initialize content background");
        if (!U()) {
            this.f35292v.c(this.f35274d);
        } else {
            this.f35292v.c(new InsetDrawable(this.f35274d, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void F() {
        ArrayList<e> arrayList = this.f35290t;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void G() {
        ArrayList<e> arrayList = this.f35290t;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    void H(ColorStateList colorStateList) {
        h hVar = this.f35272b;
        if (hVar != null) {
            hVar.setTintList(colorStateList);
        }
    }

    void I(PorterDuff.Mode mode) {
        h hVar = this.f35272b;
        if (hVar != null) {
            hVar.setTintMode(mode);
        }
    }

    final void J(float f15) {
        if (this.f35277g != f15) {
            this.f35277g = f15;
            D(f15, this.f35278h, this.f35279i);
        }
    }

    void K(boolean z15) {
        this.f35275e = z15;
    }

    final void L(si.h hVar) {
        this.f35284n = hVar;
    }

    final void M(float f15) {
        if (this.f35278h != f15) {
            this.f35278h = f15;
            D(this.f35277g, f15, this.f35279i);
        }
    }

    final void N(float f15) {
        this.f35285o = f15;
        Matrix matrix = this.f35296z;
        h(f15, matrix);
        this.f35291u.setImageMatrix(matrix);
    }

    final void O(int i15) {
        if (this.f35286p != i15) {
            this.f35286p = i15;
            X();
        }
    }

    final void P(float f15) {
        if (this.f35279i != f15) {
            this.f35279i = f15;
            D(this.f35277g, this.f35278h, f15);
        }
    }

    void Q(ColorStateList colorStateList) {
        Drawable drawable = this.f35273c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(jj.a.d(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(jj.a.d(colorStateList));
        }
    }

    void R(boolean z15) {
        this.f35276f = z15;
        Y();
    }

    final void S(l lVar) {
        this.f35271a = lVar;
        h hVar = this.f35272b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
        Object obj = this.f35273c;
        if (obj instanceof o) {
            ((o) obj).setShapeAppearanceModel(lVar);
        }
    }

    final void T(si.h hVar) {
        this.f35283m = hVar;
    }

    boolean U() {
        return this.f35292v.b() || x();
    }

    void W(f fVar, boolean z15) {
        AnimatorSet animatorSetJ;
        b bVar;
        if (z()) {
            return;
        }
        Animator animator = this.f35282l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z16 = this.f35283m == null;
        if (!V()) {
            this.f35291u.b(0, z15);
            this.f35291u.setAlpha(1.0f);
            this.f35291u.setScaleY(1.0f);
            this.f35291u.setScaleX(1.0f);
            N(1.0f);
            if (fVar != null) {
                fVar.a();
                return;
            }
            return;
        }
        if (this.f35291u.getVisibility() != 0) {
            this.f35291u.setAlpha(0.0f);
            this.f35291u.setScaleY(z16 ? 0.4f : 0.0f);
            this.f35291u.setScaleX(z16 ? 0.4f : 0.0f);
            N(z16 ? 0.4f : 0.0f);
        }
        si.h hVar = this.f35283m;
        if (hVar != null) {
            animatorSetJ = i(hVar, 1.0f, 1.0f, 1.0f);
            bVar = this;
        } else {
            animatorSetJ = j(1.0f, 1.0f, 1.0f, C, D);
            bVar = this;
        }
        animatorSetJ.addListener(new C0749b(z15, fVar));
        ArrayList<Animator.AnimatorListener> arrayList = bVar.f35288r;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetJ.addListener(it.next());
            }
        }
        animatorSetJ.start();
    }

    final void X() {
        N(this.f35285o);
    }

    final void Y() {
        Rect rect = this.f35293w;
        r(rect);
        E(rect);
        this.f35292v.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void Z(float f15) {
        h hVar = this.f35272b;
        if (hVar != null) {
            hVar.f0(f15);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f35289s == null) {
            this.f35289s = new ArrayList<>();
        }
        this.f35289s.add(animatorListener);
    }

    void f(Animator.AnimatorListener animatorListener) {
        if (this.f35288r == null) {
            this.f35288r = new ArrayList<>();
        }
        this.f35288r.add(animatorListener);
    }

    void g(e eVar) {
        if (this.f35290t == null) {
            this.f35290t = new ArrayList<>();
        }
        this.f35290t.add(eVar);
    }

    final Drawable m() {
        return this.f35274d;
    }

    float n() {
        return this.f35291u.getElevation();
    }

    boolean o() {
        return this.f35275e;
    }

    final si.h p() {
        return this.f35284n;
    }

    float q() {
        return this.f35278h;
    }

    void r(Rect rect) {
        if (this.f35292v.b()) {
            int iV = v();
            float fN = this.f35276f ? n() + this.f35279i : 0.0f;
            int iMax = Math.max(iV, (int) Math.ceil(fN));
            int iMax2 = Math.max(iV, (int) Math.ceil(fN * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!x()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f35280j - this.f35291u.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    float s() {
        return this.f35279i;
    }

    final l t() {
        return this.f35271a;
    }

    final si.h u() {
        return this.f35283m;
    }

    int v() {
        if (this.f35275e) {
            return Math.max((this.f35280j - this.f35291u.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void w(f fVar, boolean z15) {
        b bVar;
        AnimatorSet animatorSetJ;
        if (y()) {
            return;
        }
        Animator animator = this.f35282l;
        if (animator != null) {
            animator.cancel();
        }
        if (!V()) {
            this.f35291u.b(z15 ? 8 : 4, z15);
            if (fVar != null) {
                fVar.b();
                return;
            }
            return;
        }
        si.h hVar = this.f35284n;
        if (hVar != null) {
            animatorSetJ = i(hVar, 0.0f, 0.0f, 0.0f);
            bVar = this;
        } else {
            bVar = this;
            animatorSetJ = bVar.j(0.0f, 0.4f, 0.4f, E, F);
        }
        animatorSetJ.addListener(new a(z15, fVar));
        ArrayList<Animator.AnimatorListener> arrayList = bVar.f35289s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetJ.addListener(it.next());
            }
        }
        animatorSetJ.start();
    }

    final boolean x() {
        return this.f35275e && this.f35291u.getSizeDimension() < this.f35280j;
    }

    boolean y() {
        if (this.f35291u.getVisibility() == 0) {
            return this.f35287q == 1;
        }
        return this.f35287q != 2;
    }

    boolean z() {
        if (this.f35291u.getVisibility() != 0) {
            return this.f35287q == 2;
        }
        return this.f35287q != 1;
    }
}
