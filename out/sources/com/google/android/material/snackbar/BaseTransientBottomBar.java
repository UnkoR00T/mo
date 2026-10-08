package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.q;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import io.sentry.android.core.c2;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f35517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f35518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f35519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f35520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final o f35521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f35522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f35524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<m<B>> f35532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Behavior f35533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AccessibilityManager f35534u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    com.google.android.material.snackbar.b.InterfaceC0753b f35535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final TimeInterpolator f35510w = si.a.f181917b;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final TimeInterpolator f35511x = si.a.f181916a;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final TimeInterpolator f35512y = si.a.f181919d;
    private static final int[] A = {ri.b.L};
    private static final String B = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final Handler f35513z = new Handler(Looper.getMainLooper(), new h());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final n f35536l = new n(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void Q(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f35536l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f35536l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f35536l.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35537a;

        a(int i15) {
            this.f35537a = i15;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.A(this.f35537a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f35521h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f35521h.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f35521h.setScaleY(fFloatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.B();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f35522i.a(BaseTransientBottomBar.this.f35516c - BaseTransientBottomBar.this.f35514a, BaseTransientBottomBar.this.f35514a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f35521h.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35543a;

        f(int i15) {
            this.f35543a = i15;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.A(this.f35543a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f35522i.b(0, BaseTransientBottomBar.this.f35515b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f35521h.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i15 = message.what;
            if (i15 == 0) {
                ((BaseTransientBottomBar) message.obj).G();
                return true;
            }
            if (i15 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).u(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.A(3);
        }
    }

    class j implements SwipeDismissBehavior.c {
        j() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.o(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i15) {
            if (i15 == 0) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.f35535v);
            } else if (i15 == 1 || i15 == 2) {
                com.google.android.material.snackbar.b.c().j(BaseTransientBottomBar.this.f35535v);
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = BaseTransientBottomBar.this.f35521h;
            if (oVar == null) {
                return;
            }
            if (oVar.getParent() != null) {
                BaseTransientBottomBar.this.f35521h.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f35521h.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.I();
            } else {
                BaseTransientBottomBar.this.K();
            }
        }
    }

    class l extends AnimatorListenerAdapter {
        l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.B();
        }
    }

    public static abstract class m<B> {
        public void a(B b15, int i15) {
        }

        public void b(B b15) {
        }
    }

    public static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.material.snackbar.b.InterfaceC0753b f35550a;

        public n(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.M(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.N(0);
        }

        public boolean a(View view) {
            return view instanceof o;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.b.c().j(this.f35550a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.b.c().k(this.f35550a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f35550a = baseTransientBottomBar.f35535v;
        }
    }

    protected static class o extends FrameLayout {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final View.OnTouchListener f35551m = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BaseTransientBottomBar<?> f35552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        lj.l f35553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f35555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f35556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f35557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f35558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList f35559h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private PorterDuff.Mode f35560j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Rect f35561k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f35562l;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected o(Context context, AttributeSet attributeSet) {
            super(pj.a.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ri.l.B4);
            if (typedArrayObtainStyledAttributes.hasValue(ri.l.I4)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.I4, 0));
            }
            this.f35554c = typedArrayObtainStyledAttributes.getInt(ri.l.E4, 0);
            if (typedArrayObtainStyledAttributes.hasValue(ri.l.K4) || typedArrayObtainStyledAttributes.hasValue(ri.l.L4)) {
                this.f35553b = lj.l.e(context2, attributeSet, 0, 0).m();
            }
            this.f35555d = typedArrayObtainStyledAttributes.getFloat(ri.l.F4, 1.0f);
            setBackgroundTintList(ij.c.a(context2, typedArrayObtainStyledAttributes, ri.l.G4));
            setBackgroundTintMode(q.h(typedArrayObtainStyledAttributes.getInt(ri.l.H4, -1), PorterDuff.Mode.SRC_IN));
            this.f35556e = typedArrayObtainStyledAttributes.getFloat(ri.l.D4, 1.0f);
            this.f35557f = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.C4, -1);
            this.f35558g = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.J4, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f35551m);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(c());
            }
        }

        private Drawable c() {
            int iK = bj.a.k(this, ri.b.f173912g, ri.b.f173909d, getBackgroundOverlayColorAlpha());
            lj.l lVar = this.f35553b;
            Drawable drawableN = lVar != null ? BaseTransientBottomBar.n(iK, lVar) : BaseTransientBottomBar.m(iK, getResources());
            if (this.f35559h == null) {
                return y5.a.r(drawableN);
            }
            Drawable drawableR = y5.a.r(drawableN);
            drawableR.setTintList(this.f35559h);
            return drawableR;
        }

        private void d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f35561k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f35552a = baseTransientBottomBar;
        }

        void b(ViewGroup viewGroup) {
            this.f35562l = true;
            viewGroup.addView(this);
            this.f35562l = false;
        }

        float getActionTextColorAlpha() {
            return this.f35556e;
        }

        int getAnimationMode() {
            return this.f35554c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f35555d;
        }

        int getMaxInlineActionWidth() {
            return this.f35558g;
        }

        int getMaxWidth() {
            return this.f35557f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f35552a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.x();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f35552a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.y();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
            super.onLayout(z15, i15, i16, i17, i18);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f35552a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.z();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i15, int i16) {
            super.onMeasure(i15, i16);
            if (this.f35557f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i17 = this.f35557f;
                if (measuredWidth > i17) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), i16);
                }
            }
        }

        void setAnimationMode(int i15) {
            this.f35554c = i15;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f35559h != null) {
                drawable = y5.a.r(drawable.mutate());
                drawable.setTintList(this.f35559h);
                drawable.setTintMode(this.f35560j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f35559h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = y5.a.r(getBackground().mutate());
                drawableR.setTintList(colorStateList);
                drawableR.setTintMode(this.f35560j);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f35560j = mode;
            if (getBackground() != null) {
                Drawable drawableR = y5.a.r(getBackground().mutate());
                drawableR.setTintMode(mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f35562l || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            d((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f35552a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.M();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f35551m);
            super.setOnClickListener(onClickListener);
        }
    }

    private void C() {
        this.f35528o = l();
        M();
    }

    private void D(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorR = this.f35533t;
        if (swipeDismissBehaviorR == null) {
            swipeDismissBehaviorR = r();
        }
        if (swipeDismissBehaviorR instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorR).Q(this);
        }
        swipeDismissBehaviorR.L(new j());
        fVar.o(swipeDismissBehaviorR);
        if (q() == null) {
            fVar.f11789g = 80;
        }
    }

    private boolean F() {
        return this.f35529p > 0 && !this.f35523j && w();
    }

    private void H() {
        if (E()) {
            j();
            return;
        }
        if (this.f35521h.getParent() != null) {
            this.f35521h.setVisibility(0);
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        ValueAnimator valueAnimatorP = p(0.0f, 1.0f);
        ValueAnimator valueAnimatorS = s(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorP, valueAnimatorS);
        animatorSet.setDuration(this.f35514a);
        animatorSet.addListener(new l());
        animatorSet.start();
    }

    private void J(int i15) {
        ValueAnimator valueAnimatorP = p(1.0f, 0.0f);
        valueAnimatorP.setDuration(this.f35515b);
        valueAnimatorP.addListener(new a(i15));
        valueAnimatorP.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        int iT = t();
        this.f35521h.setTranslationY(iT);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iT, 0);
        valueAnimator.setInterpolator(this.f35518e);
        valueAnimator.setDuration(this.f35516c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e());
        valueAnimator.start();
    }

    private void L(int i15) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, t());
        valueAnimator.setInterpolator(this.f35518e);
        valueAnimator.setDuration(this.f35516c);
        valueAnimator.addListener(new f(i15));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        ViewGroup.LayoutParams layoutParams = this.f35521h.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            c2.g(B, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f35521h.f35561k == null) {
            c2.g(B, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f35521h.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i15 = this.f35521h.f35561k.bottom + (q() != null ? this.f35528o : this.f35525l);
        int i16 = this.f35521h.f35561k.left + this.f35526m;
        int i17 = this.f35521h.f35561k.right + this.f35527n;
        int i18 = this.f35521h.f35561k.top;
        boolean z15 = (marginLayoutParams.bottomMargin == i15 && marginLayoutParams.leftMargin == i16 && marginLayoutParams.rightMargin == i17 && marginLayoutParams.topMargin == i18) ? false : true;
        if (z15) {
            marginLayoutParams.bottomMargin = i15;
            marginLayoutParams.leftMargin = i16;
            marginLayoutParams.rightMargin = i17;
            marginLayoutParams.topMargin = i18;
            this.f35521h.requestLayout();
        }
        if ((z15 || this.f35530q != this.f35529p) && Build.VERSION.SDK_INT >= 29 && F()) {
            this.f35521h.removeCallbacks(this.f35524k);
            this.f35521h.post(this.f35524k);
        }
    }

    private void k(int i15) {
        if (this.f35521h.getAnimationMode() == 1) {
            J(i15);
        } else {
            L(i15);
        }
    }

    private int l() {
        if (q() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        q().getLocationOnScreen(iArr);
        int i15 = iArr[1];
        int[] iArr2 = new int[2];
        this.f35520g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f35520g.getHeight()) - i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable m(int i15, Resources resources) {
        float dimension = resources.getDimension(ri.d.f173961l0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i15);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static lj.h n(int i15, lj.l lVar) {
        lj.h hVar = new lj.h(lVar);
        hVar.g0(ColorStateList.valueOf(i15));
        return hVar;
    }

    private ValueAnimator p(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f35517d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator s(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f35519f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int t() {
        int height = this.f35521h.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f35521h.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    private boolean w() {
        ViewGroup.LayoutParams layoutParams = this.f35521h.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    void A(int i15) {
        com.google.android.material.snackbar.b.c().h(this.f35535v);
        List<m<B>> list = this.f35532s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f35532s.get(size).a(this, i15);
            }
        }
        ViewParent parent = this.f35521h.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f35521h);
        }
    }

    void B() {
        com.google.android.material.snackbar.b.c().i(this.f35535v);
        List<m<B>> list = this.f35532s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f35532s.get(size).b(this);
            }
        }
    }

    boolean E() {
        AccessibilityManager accessibilityManager = this.f35534u;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    final void G() {
        if (this.f35521h.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f35521h.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                D((CoordinatorLayout.f) layoutParams);
            }
            this.f35521h.b(this.f35520g);
            C();
            this.f35521h.setVisibility(4);
        }
        if (this.f35521h.isLaidOut()) {
            H();
        } else {
            this.f35531r = true;
        }
    }

    void j() {
        this.f35521h.post(new k());
    }

    protected void o(int i15) {
        com.google.android.material.snackbar.b.c().b(this.f35535v, i15);
    }

    public View q() {
        return null;
    }

    protected SwipeDismissBehavior<? extends View> r() {
        return new Behavior();
    }

    final void u(int i15) {
        if (E() && this.f35521h.getVisibility() == 0) {
            k(i15);
        } else {
            A(i15);
        }
    }

    public boolean v() {
        return com.google.android.material.snackbar.b.c().e(this.f35535v);
    }

    void x() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f35521h.getRootWindowInsets()) == null) {
            return;
        }
        this.f35529p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        M();
    }

    void y() {
        if (v()) {
            f35513z.post(new i());
        }
    }

    void z() {
        if (this.f35531r) {
            H();
            this.f35531r = false;
        }
    }
}
