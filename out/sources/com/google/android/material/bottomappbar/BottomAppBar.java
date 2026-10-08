package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lj.i;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int S0 = k.f174082p;
    private static final int T0 = ri.b.f173928w;
    private static final int U0 = ri.b.F;
    private int A0;
    private int B0;
    private int C0;
    private final int D0;
    private int E0;
    private int F0;
    private final boolean G0;
    private boolean H0;
    private int I0;
    private ArrayList<g> J0;
    private int K0;
    private boolean L0;
    private boolean M0;
    private Behavior N0;
    private int O0;
    private int P0;
    private int Q0;
    AnimatorListenerAdapter R0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Integer f34799w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final lj.h f34800x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private Animator f34801y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private Animator f34802z0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.t0();
            BottomAppBar.this.f34801y0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.u0();
        }
    }

    class b extends FloatingActionButton.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34809a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.t0();
            }
        }

        b(int i15) {
            this.f34809a = i15;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.y0(this.f34809a));
            floatingActionButton.q(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.t0();
            BottomAppBar.this.L0 = false;
            BottomAppBar.this.f34802z0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.u0();
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f34813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f34814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f34816d;

        d(ActionMenuView actionMenuView, int i15, boolean z15) {
            this.f34814b = actionMenuView;
            this.f34815c = i15;
            this.f34816d = z15;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f34813a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f34813a) {
                return;
            }
            boolean z15 = BottomAppBar.this.K0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.D0(bottomAppBar.K0);
            BottomAppBar.this.J0(this.f34814b, this.f34815c, this.f34816d, z15);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f34818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34820c;

        e(ActionMenuView actionMenuView, int i15, boolean z15) {
            this.f34818a = actionMenuView;
            this.f34819b = i15;
            this.f34820c = z15;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f34818a;
            actionMenuView.setTranslationX(BottomAppBar.this.x0(actionMenuView, this.f34819b, this.f34820c));
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.R0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonV0 = BottomAppBar.this.v0();
            if (floatingActionButtonV0 != null) {
                floatingActionButtonV0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class h extends r6.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f34824d;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i15) {
                return new h[i15];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f34823c);
            parcel.writeInt(this.f34824d ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34823c = parcel.readInt();
            this.f34824d = parcel.readInt() != 0;
        }
    }

    private void A0(int i15, boolean z15) {
        if (!isLaidOut()) {
            this.L0 = false;
            D0(this.K0);
            return;
        }
        Animator animator = this.f34802z0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!z0()) {
            i15 = 0;
            z15 = false;
        }
        s0(i15, z15, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f34802z0 = animatorSet;
        animatorSet.addListener(new c());
        this.f34802z0.start();
    }

    private void B0(int i15) {
        if (this.A0 == i15 || !isLaidOut()) {
            return;
        }
        Animator animator = this.f34801y0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.B0 == 1) {
            r0(i15, arrayList);
        } else {
            q0(i15, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(gj.e.g(getContext(), U0, si.a.f181916a));
        this.f34801y0 = animatorSet;
        animatorSet.addListener(new a());
        this.f34801y0.start();
    }

    private Drawable C0(Drawable drawable) {
        if (drawable == null || this.f34799w0 == null) {
            return drawable;
        }
        Drawable drawableR = y5.a.r(drawable.mutate());
        drawableR.setTint(this.f34799w0.intValue());
        return drawableR;
    }

    private void E0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f34802z0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (z0()) {
            I0(actionMenuView, this.A0, this.M0);
        } else {
            I0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        getTopEdgeTreatment().s(getFabTranslationX());
        this.f34800x0.h0((this.M0 && z0() && this.C0 == 1) ? 1.0f : 0.0f);
        View viewW0 = w0();
        if (viewW0 != null) {
            viewW0.setTranslationY(getFabTranslationY());
            viewW0.setTranslationX(getFabTranslationX());
        }
    }

    private void I0(ActionMenuView actionMenuView, int i15, boolean z15) {
        J0(actionMenuView, i15, z15, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(ActionMenuView actionMenuView, int i15, boolean z15, boolean z16) {
        e eVar = new e(actionMenuView, i15, z15);
        if (z16) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f11786d = 17;
        int i15 = bottomAppBar.C0;
        if (i15 == 1) {
            fVar.f11786d = 17 | 48;
        }
        if (i15 == 0) {
            fVar.f11786d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.O0;
    }

    private int getFabAlignmentAnimationDuration() {
        return gj.e.f(getContext(), T0, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return y0(this.A0);
    }

    private float getFabTranslationY() {
        if (this.C0 == 1) {
            return -getTopEdgeTreatment().e();
        }
        View viewW0 = w0();
        return viewW0 != null ? (-((getMeasuredHeight() + getBottomInset()) - viewW0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.Q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.P0;
    }

    private com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.f34800x0.I().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.R0);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    private void p0() {
        Animator animator = this.f34802z0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f34801y0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void r0(int i15, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v0(), "translationX", y0(i15));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void s0(int i15, boolean z15, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - x0(actionMenuView, i15, z15)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new d(actionMenuView, i15, z15));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        ArrayList<g> arrayList;
        int i15 = this.I0 - 1;
        this.I0 = i15;
        if (i15 != 0 || (arrayList = this.J0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        ArrayList<g> arrayList;
        int i15 = this.I0;
        this.I0 = i15 + 1;
        if (i15 != 0 || (arrayList = this.J0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton v0() {
        View viewW0 = w0();
        if (viewW0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewW0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View w0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float y0(int i15) {
        boolean zG = q.g(this);
        if (i15 != 1) {
            return 0.0f;
        }
        View viewW0 = w0();
        return ((getMeasuredWidth() / 2) - ((zG ? this.Q0 : this.P0) + ((this.E0 == -1 || viewW0 == null) ? this.D0 : (viewW0.getMeasuredWidth() / 2) + this.E0))) * (zG ? -1 : 1);
    }

    private boolean z0() {
        FloatingActionButton floatingActionButtonV0 = v0();
        return floatingActionButtonV0 != null && floatingActionButtonV0.n();
    }

    public void D0(int i15) {
        if (i15 != 0) {
            this.K0 = 0;
            getMenu().clear();
            x(i15);
        }
    }

    public void G0(int i15, int i16) {
        this.K0 = i16;
        this.L0 = true;
        A0(i15, this.M0);
        B0(i15);
        this.A0 = i15;
    }

    boolean H0(int i15) {
        float f15 = i15;
        if (f15 == getTopEdgeTreatment().l()) {
            return false;
        }
        getTopEdgeTreatment().q(f15);
        this.f34800x0.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f34800x0.M();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e();
    }

    public int getFabAlignmentMode() {
        return this.A0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.E0;
    }

    public int getFabAnchorMode() {
        return this.C0;
    }

    public int getFabAnimationMode() {
        return this.B0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().i();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().j();
    }

    public boolean getHideOnScroll() {
        return this.H0;
    }

    public int getMenuAlignmentMode() {
        return this.F0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.f(this, this.f34800x0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        if (z15) {
            p0();
            F0();
            final View viewW0 = w0();
            if (viewW0 != null && viewW0.isLaidOut()) {
                viewW0.post(new Runnable() { // from class: com.google.android.material.bottomappbar.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewW0.requestLayout();
                    }
                });
            }
        }
        E0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.A0 = hVar.f34823c;
        this.M0 = hVar.f34824d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f34823c = this.A0;
        hVar.f34824d = this.M0;
        return hVar;
    }

    protected void q0(int i15, List<Animator> list) {
        FloatingActionButton floatingActionButtonV0 = v0();
        if (floatingActionButtonV0 == null || floatingActionButtonV0.m()) {
            return;
        }
        u0();
        floatingActionButtonV0.k(new b(i15));
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.f34800x0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f15) {
        if (f15 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m(f15);
            this.f34800x0.invalidateSelf();
            F0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        this.f34800x0.f0(f15);
        getBehavior().N(this, this.f34800x0.H() - this.f34800x0.G());
    }

    public void setFabAlignmentMode(int i15) {
        G0(i15, 0);
    }

    public void setFabAlignmentModeEndMargin(int i15) {
        if (this.E0 != i15) {
            this.E0 = i15;
            F0();
        }
    }

    public void setFabAnchorMode(int i15) {
        this.C0 = i15;
        F0();
        View viewW0 = w0();
        if (viewW0 != null) {
            K0(this, viewW0);
            viewW0.requestLayout();
            this.f34800x0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i15) {
        this.B0 = i15;
    }

    void setFabCornerSize(float f15) {
        if (f15 != getTopEdgeTreatment().g()) {
            getTopEdgeTreatment().n(f15);
            this.f34800x0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f15) {
        if (f15 != getFabCradleMargin()) {
            getTopEdgeTreatment().o(f15);
            this.f34800x0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f15) {
        if (f15 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().p(f15);
            this.f34800x0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z15) {
        this.H0 = z15;
    }

    public void setMenuAlignmentMode(int i15) {
        if (this.F0 != i15) {
            this.F0 = i15;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                I0(actionMenuView, this.A0, z0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(C0(drawable));
    }

    public void setNavigationIconTint(int i15) {
        this.f34799w0 = Integer.valueOf(i15);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    protected int x0(ActionMenuView actionMenuView, int i15, boolean z15) {
        int dimensionPixelOffset = 0;
        if (this.F0 != 1 && (i15 != 1 || !z15)) {
            return 0;
        }
        boolean zG = q.g(this);
        int measuredWidth = zG ? getMeasuredWidth() : 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f8161a & 8388615) == 8388611) {
                measuredWidth = zG ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zG ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i17 = zG ? this.P0 : -this.Q0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(ri.d.f173971r);
            if (!zG) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i17) + dimensionPixelOffset);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.N0 == null) {
            this.N0 = new Behavior();
        }
        return this.N0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Rect f34803p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private WeakReference<BottomAppBar> f34804q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f34805r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final View.OnLayoutChangeListener f34806s;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f34804q.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.h(Behavior.this.f34803p);
                    int iHeight = Behavior.this.f34803p.height();
                    bottomAppBar.H0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f34803p)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f34805r == 0) {
                    if (bottomAppBar.C0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(ri.d.V) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (q.g(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.D0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.D0;
                    }
                }
                bottomAppBar.F0();
            }
        }

        public Behavior() {
            this.f34806s = new a();
            this.f34803p = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i15) {
            this.f34804q = new WeakReference<>(bottomAppBar);
            View viewW0 = bottomAppBar.w0();
            if (viewW0 != null && !viewW0.isLaidOut()) {
                BottomAppBar.K0(bottomAppBar, viewW0);
                this.f34805r = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewW0.getLayoutParams())).bottomMargin;
                if (viewW0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewW0;
                    if (bottomAppBar.C0 == 0 && bottomAppBar.G0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(ri.a.f173903b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(ri.a.f173902a);
                    }
                    bottomAppBar.o0(floatingActionButton);
                }
                viewW0.addOnLayoutChangeListener(this.f34806s);
                bottomAppBar.F0();
            }
            coordinatorLayout.I(bottomAppBar, i15);
            return super.l(coordinatorLayout, bottomAppBar, i15);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i15, int i16) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i15, i16);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34806s = new a();
            this.f34803p = new Rect();
        }
    }
}
