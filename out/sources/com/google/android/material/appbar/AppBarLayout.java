package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j6.f1;
import j6.l0;
import j6.t;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k6.p;
import lj.h;
import lj.i;
import p082nUL.y;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int E = k.f174071e;
    private Drawable A;
    private Integer B;
    private final float C;
    private Behavior D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f1 f34672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<a> f34673h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f34676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f34678n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WeakReference<View> f34680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f34681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f34682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<e> f34683t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final LinkedHashSet<f> f34684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f34685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final TimeInterpolator f34686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int[] f34687y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f34688z;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.c<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f34689k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f34690l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ValueAnimator f34691m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c f34692n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private WeakReference<View> f34693o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f34694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f34695b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f34694a = coordinatorLayout;
                this.f34695b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f34694a, this.f34695b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends j6.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f34697d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f34698e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f34697d = appBarLayout;
                this.f34698e = coordinatorLayout;
            }

            @Override // j6.a
            public void g(View view, p pVar) {
                View viewF0;
                super.g(view, pVar);
                pVar.o0(ScrollView.class.getName());
                if (this.f34697d.getTotalScrollRange() == 0 || (viewF0 = BaseBehavior.this.f0(this.f34698e)) == null || !BaseBehavior.this.b0(this.f34697d)) {
                    return;
                }
                if (BaseBehavior.this.M() != (-this.f34697d.getTotalScrollRange())) {
                    pVar.b(p.a.f108673q);
                    pVar.Q0(true);
                }
                if (BaseBehavior.this.M() != 0) {
                    if (!viewF0.canScrollVertically(-1)) {
                        pVar.b(p.a.f108674r);
                        pVar.Q0(true);
                    } else if ((-this.f34697d.getDownNestedPreScrollRange()) != 0) {
                        pVar.b(p.a.f108674r);
                        pVar.Q0(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // j6.a
            public boolean j(View view, int i15, Bundle bundle) {
                if (i15 == 4096) {
                    this.f34697d.setExpanded(false);
                    return true;
                }
                if (i15 != 8192) {
                    return super.j(view, i15, bundle);
                }
                if (BaseBehavior.this.M() != 0) {
                    View viewF0 = BaseBehavior.this.f0(this.f34698e);
                    if (!viewF0.canScrollVertically(-1)) {
                        this.f34697d.setExpanded(true);
                        return true;
                    }
                    int i16 = -this.f34697d.getDownNestedPreScrollRange();
                    if (i16 != 0) {
                        BaseBehavior.this.q(this.f34698e, this.f34697d, viewF0, 0, i16, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void U(CoordinatorLayout coordinatorLayout, T t15) {
            if (l0.J(coordinatorLayout)) {
                return;
            }
            l0.h0(coordinatorLayout, new b(t15, coordinatorLayout));
        }

        private void V(CoordinatorLayout coordinatorLayout, T t15, int i15, float f15) {
            int iAbs = Math.abs(M() - i15);
            float fAbs = Math.abs(f15);
            W(coordinatorLayout, t15, i15, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t15.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, T t15, int i15, int i16) {
            int iM = M();
            if (iM == i15) {
                ValueAnimator valueAnimator = this.f34691m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f34691m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f34691m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f34691m = valueAnimator3;
                valueAnimator3.setInterpolator(si.a.f181920e);
                this.f34691m.addUpdateListener(new a(coordinatorLayout, t15));
            } else {
                valueAnimator2.cancel();
            }
            this.f34691m.setDuration(Math.min(i16, 600));
            this.f34691m.setIntValues(iM, i15);
            this.f34691m.start();
        }

        private int X(int i15, int i16, int i17) {
            return i15 < (i16 + i17) / 2 ? i16 : i17;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, T t15, View view) {
            return t15.l() && coordinatorLayout.getHeight() - view.getHeight() <= t15.getHeight();
        }

        private static boolean a0(int i15, int i16) {
            return (i15 & i16) == i16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                if (((d) appBarLayout.getChildAt(i15).getLayoutParams()).f34707a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = coordinatorLayout.getChildAt(i15);
                if ((childAt instanceof t) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i15) {
            int iAbs = Math.abs(i15);
            int childCount = appBarLayout.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = appBarLayout.getChildAt(i16);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(T t15, int i15) {
            int childCount = t15.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = t15.getChildAt(i16);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (a0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i17 = -i15;
                if (top <= i17 && bottom >= i17) {
                    return i16;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = coordinatorLayout.getChildAt(i15);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(T t15, int i15) {
            int iAbs = Math.abs(i15);
            int childCount = t15.getChildCount();
            int topInset = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = t15.getChildAt(i16);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorD = dVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= t15.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f15 = topInset;
                    return Integer.signum(i15) * (childAt.getTop() + Math.round(f15 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f15)));
                }
            }
            return i15;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, T t15) {
            List<View> listS = coordinatorLayout.s(t15);
            int size = listS.size();
            for (int i15 = 0; i15 < size; i15++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) listS.get(i15).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, T t15) {
            int topInset = t15.getTopInset() + t15.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(t15, iM);
            if (iE0 >= 0) {
                View childAt = t15.getChildAt(iE0);
                d dVar = (d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iE0 == 0 && t15.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= t15.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (a0(iC, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iM < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    V(coordinatorLayout, t15, c6.a.b(X(iM, minimumHeight, topInset2) + topInset, -t15.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, T t15, int i15, int i16, boolean z15) {
            View viewD0 = d0(t15, i15);
            boolean zD = false;
            if (viewD0 != null) {
                int iC = ((d) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int minimumHeight = viewD0.getMinimumHeight();
                    if (i16 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i15) < (viewD0.getBottom() - minimumHeight) - t15.getTopInset()) : (-i15) >= (viewD0.getBottom() - minimumHeight) - t15.getTopInset()) {
                        zD = true;
                    }
                }
            }
            if (t15.p()) {
                zD = t15.D(c0(coordinatorLayout));
            }
            boolean zA = t15.A(zD);
            if (z15 || (zA && v0(coordinatorLayout, t15))) {
                if (t15.getBackground() != null) {
                    t15.getBackground().jumpToCurrentState();
                }
                if (t15.getForeground() != null) {
                    t15.getForeground().jumpToCurrentState();
                }
                if (t15.getStateListAnimator() != null) {
                    t15.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.c
        int M() {
            return E() + this.f34689k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(T t15) {
            WeakReference<View> weakReference = this.f34693o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(T t15) {
            return (-t15.getDownNestedScrollRange()) + t15.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(T t15) {
            return t15.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, T t15) {
            w0(coordinatorLayout, t15);
            if (t15.p()) {
                t15.A(t15.D(c0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, T t15, int i15) {
            boolean zL = super.l(coordinatorLayout, t15, i15);
            int pendingAction = t15.getPendingAction();
            c cVar = this.f34692n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z15 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i16 = -t15.getUpNestedPreScrollRange();
                        if (z15) {
                            V(coordinatorLayout, t15, i16, 0.0f);
                        } else {
                            P(coordinatorLayout, t15, i16);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z15) {
                            V(coordinatorLayout, t15, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, t15, 0);
                        }
                    }
                }
            } else if (cVar.f34700c) {
                P(coordinatorLayout, t15, -t15.getTotalScrollRange());
            } else if (cVar.f34701d) {
                P(coordinatorLayout, t15, 0);
            } else {
                View childAt = t15.getChildAt(cVar.f34702e);
                P(coordinatorLayout, t15, (-childAt.getBottom()) + (this.f34692n.f34704g ? childAt.getMinimumHeight() + t15.getTopInset() : Math.round(childAt.getHeight() * this.f34692n.f34703f)));
            }
            t15.w();
            this.f34692n = null;
            G(c6.a.b(E(), -t15.getTotalScrollRange(), 0));
            x0(coordinatorLayout, t15, E(), 0, true);
            t15.u(E());
            U(coordinatorLayout, t15);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, T t15, int i15, int i16, int i17, int i18) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t15.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, t15, i15, i16, i17, i18);
            }
            coordinatorLayout.J(t15, i15, i16, View.MeasureSpec.makeMeasureSpec(0, 0), i18);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, T t15, View view, int i15, int i16, int[] iArr, int i17) {
            T t16;
            int i18;
            int downNestedPreScrollRange;
            if (i16 == 0) {
                t16 = t15;
            } else {
                if (i16 < 0) {
                    i18 = -t15.getTotalScrollRange();
                    downNestedPreScrollRange = t15.getDownNestedPreScrollRange() + i18;
                } else {
                    i18 = -t15.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i19 = i18;
                int i25 = downNestedPreScrollRange;
                if (i19 != i25) {
                    t16 = t15;
                    iArr[1] = O(coordinatorLayout, t16, i16, i19, i25);
                } else {
                    t16 = t15;
                }
            }
            if (t16.p()) {
                t16.A(t16.D(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, T t15, View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t16;
            int i25;
            if (i18 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t16 = t15;
                i25 = i18;
                iArr[1] = O(coordinatorLayout2, t16, i25, -t15.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t16 = t15;
                i25 = i18;
            }
            if (i25 == 0) {
                U(coordinatorLayout2, t16);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, T t15, Parcelable parcelable) {
            if (parcelable instanceof c) {
                s0((c) parcelable, true);
                super.x(coordinatorLayout, t15, this.f34692n.a());
            } else {
                super.x(coordinatorLayout, t15, parcelable);
                this.f34692n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t15) {
            Parcelable parcelableY = super.y(coordinatorLayout, t15);
            c cVarT0 = t0(parcelableY, t15);
            return cVarT0 == null ? parcelableY : cVarT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, T t15, View view, View view2, int i15, int i16) {
            ValueAnimator valueAnimator;
            boolean z15 = (i15 & 2) != 0 && (t15.p() || t15.r() || Z(coordinatorLayout, t15, view));
            if (z15 && (valueAnimator = this.f34691m) != null) {
                valueAnimator.cancel();
            }
            this.f34693o = null;
            this.f34690l = i16;
            return z15;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, T t15, View view, int i15) {
            if (this.f34690l == 0 || i15 == 1) {
                w0(coordinatorLayout, t15);
                if (t15.p()) {
                    t15.A(t15.D(view));
                }
            }
            this.f34693o = new WeakReference<>(view);
        }

        void s0(c cVar, boolean z15) {
            if (this.f34692n == null || z15) {
                this.f34692n = cVar;
            }
        }

        c t0(Parcelable parcelable, T t15) {
            int iE = E();
            int childCount = t15.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = t15.getChildAt(i15);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = r6.a.f171967b;
                    }
                    c cVar = new c(parcelable);
                    boolean z15 = iE == 0;
                    cVar.f34701d = z15;
                    cVar.f34700c = !z15 && (-iE) >= t15.getTotalScrollRange();
                    cVar.f34702e = i15;
                    cVar.f34704g = bottom == childAt.getMinimumHeight() + t15.getTopInset();
                    cVar.f34703f = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, T t15, int i15, int i16, int i17) {
            CoordinatorLayout coordinatorLayout2;
            T t16;
            int iM = M();
            int i18 = 0;
            if (i16 == 0 || iM < i16 || iM > i17) {
                coordinatorLayout2 = coordinatorLayout;
                t16 = t15;
                this.f34689k = 0;
            } else {
                int iB = c6.a.b(i15, i16, i17);
                if (iM != iB) {
                    int iI0 = t15.j() ? i0(t15, iB) : iB;
                    boolean zG = G(iI0);
                    int i19 = iM - iB;
                    this.f34689k = iB - iI0;
                    if (zG) {
                        while (i18 < t15.getChildCount()) {
                            d dVar = (d) t15.getChildAt(i18).getLayoutParams();
                            b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(t15, t15.getChildAt(i18), E());
                            }
                            i18++;
                        }
                    }
                    if (!zG && t15.j()) {
                        coordinatorLayout.g(t15);
                    }
                    t15.u(E());
                    coordinatorLayout2 = coordinatorLayout;
                    t16 = t15;
                    x0(coordinatorLayout2, t16, iB, iB < iM ? -1 : 1, false);
                    i18 = i19;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t16 = t15;
                }
            }
            U(coordinatorLayout2, t16);
            return i18;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends r6.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f34700c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f34701d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f34702e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            float f34703f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            boolean f34704g;

            class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c[] newArray(int i15) {
                    return new c[i15];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f34700c = parcel.readByte() != 0;
                this.f34701d = parcel.readByte() != 0;
                this.f34702e = parcel.readInt();
                this.f34703f = parcel.readFloat();
                this.f34704g = parcel.readByte() != 0;
            }

            @Override // r6.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i15) {
                super.writeToParcel(parcel, i15);
                parcel.writeByte(this.f34700c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f34701d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f34702e);
                parcel.writeFloat(this.f34703f);
                parcel.writeByte(this.f34704g ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ boolean G(int i15) {
            return super.G(i15);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i15) {
            return super.l(coordinatorLayout, appBarLayout, i15);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i15, int i16, int i17, int i18) {
            return super.m(coordinatorLayout, appBarLayout, i15, i16, i17, i18);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i15, int i16, int[] iArr, int i17) {
            super.q(coordinatorLayout, appBarLayout, view, i15, i16, iArr, i17);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i15, i16, i17, i18, i19, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i15, int i16) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i15, i16);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i15) {
            super.C(coordinatorLayout, appBarLayout, view, i15);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.d {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                l0.R(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f34689k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.p()) {
                    appBarLayout.A(appBarLayout.D(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.d
        float J(View view) {
            int i15;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i15 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i15) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.d
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                View view = list.get(i15);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                l0.h0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i15) {
            return super.l(coordinatorLayout, view, i15);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i15, int i16, int i17, int i18) {
            return super.m(coordinatorLayout, view, i15, i16, i17, i18);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z15) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.r(view));
            if (appBarLayoutH != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f34730d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutH.x(false, !z15);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.U3);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.V3, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t15, int i15);
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f15);
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f34705a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f34706b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, View view, float f15) {
            b(this.f34705a, appBarLayout, view);
            float fAbs = this.f34705a.top - Math.abs(f15);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fA = 1.0f - c6.a.a(Math.abs(fAbs / this.f34705a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f34705a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f34706b);
            this.f34706b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f34706b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f34706b);
        }
    }

    @Deprecated
    public interface e {
        void a(float f15, int i15);
    }

    public static abstract class f {
        public abstract void a(float f15, int i15, float f16);
    }

    private boolean C() {
        return this.A != null && getTopInset() > 0;
    }

    private boolean E() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    private void F(float f15, float f16) {
        ValueAnimator valueAnimator = this.f34681r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f15, f16);
        this.f34681r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f34685w);
        this.f34681r.setInterpolator(this.f34686x);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f34682s;
        if (animatorUpdateListener != null) {
            this.f34681r.addUpdateListener(animatorUpdateListener);
        }
        this.f34681r.start();
    }

    private void G() {
        setWillNotDraw(!C());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, h hVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hVar.f0(fFloatValue);
        Drawable drawable = appBarLayout.A;
        if (drawable instanceof h) {
            ((h) drawable).f0(fFloatValue);
        }
        Iterator<e> it = appBarLayout.f34683t.iterator();
        while (it.hasNext()) {
            it.next().a(fFloatValue, hVar.E());
        }
        Iterator<f> it4 = appBarLayout.f34684v.iterator();
        while (it4.hasNext()) {
            it4.next().a(fFloatValue, hVar.E(), fFloatValue / appBarLayout.C);
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, h hVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int iJ = bj.a.j(appBarLayout.f34688z, colorStateList.getDefaultColor(), fFloatValue);
        hVar.g0(ColorStateList.valueOf(iJ));
        if (appBarLayout.A != null && (num2 = appBarLayout.B) != null && num2.equals(num)) {
            appBarLayout.A.setTint(iJ);
        }
        if (!appBarLayout.f34683t.isEmpty()) {
            for (e eVar : appBarLayout.f34683t) {
                if (hVar.B() != null) {
                    eVar.a(0.0f, iJ);
                }
            }
        }
        if (appBarLayout.f34684v.isEmpty()) {
            return;
        }
        Iterator<f> it = appBarLayout.f34684v.iterator();
        while (it.hasNext()) {
            it.next().a(0.0f, iJ, fFloatValue);
        }
    }

    private void d() {
        WeakReference<View> weakReference = this.f34680q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f34680q = null;
    }

    private Integer e() {
        Drawable drawable = this.A;
        if (drawable instanceof h) {
            return Integer.valueOf(((h) drawable).E());
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.c.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private View f(View view) {
        int i15;
        if (this.f34680q == null && (i15 = this.f34679p) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i15) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f34679p);
            }
            if (viewFindViewById != null) {
                this.f34680q = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f34680q;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean k() {
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (((d) getChildAt(i15).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void m(final h hVar, final ColorStateList colorStateList) {
        final Integer numF = bj.a.f(getContext(), ri.b.f173912g);
        this.f34682s = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f34714a, colorStateList, hVar, numF, valueAnimator);
            }
        };
    }

    private void n(Context context, final h hVar) {
        hVar.U(context);
        this.f34682s = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f34718a, hVar, valueAnimator);
            }
        };
    }

    private void o() {
        Behavior behavior = this.D;
        BaseBehavior.c cVarT0 = (behavior == null || this.f34667b == -1 || this.f34671f != 0) ? null : behavior.t0(r6.a.f171967b, this);
        this.f34667b = -1;
        this.f34668c = -1;
        this.f34669d = -1;
        if (cVarT0 != null) {
            this.D.s0(cVarT0, false);
        }
    }

    private boolean q() {
        return getBackground() instanceof h;
    }

    private h s(Drawable drawable) {
        if (drawable instanceof h) {
            return (h) drawable;
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.c.f(drawable);
        if (colorStateListF == null) {
            return null;
        }
        h hVar = new h();
        hVar.g0(colorStateListF);
        return hVar;
    }

    private Drawable t(Context context, Drawable drawable) {
        h hVarS = s(drawable);
        if (hVarS == null || hVarS.B() == null) {
            return drawable;
        }
        this.f34688z = hVarS.B().getDefaultColor();
        ColorStateList colorStateList = this.f34678n;
        if (colorStateList != null) {
            m(hVarS, colorStateList);
            return hVarS;
        }
        n(context, hVarS);
        return hVarS;
    }

    private void y(boolean z15, boolean z16, boolean z17) {
        this.f34671f = (z15 ? 1 : 2) | (z16 ? 4 : 0) | (z17 ? 8 : 0);
        requestLayout();
    }

    private boolean z(boolean z15) {
        if (this.f34675k == z15) {
            return false;
        }
        this.f34675k = z15;
        refreshDrawableState();
        return true;
    }

    boolean A(boolean z15) {
        return B(z15, !this.f34674j);
    }

    boolean B(boolean z15, boolean z16) {
        if (!z16 || this.f34676l == z15) {
            return false;
        }
        this.f34676l = z15;
        refreshDrawableState();
        if (!q()) {
            return true;
        }
        if (this.f34678n != null) {
            F(z15 ? 0.0f : 1.0f, z15 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f34677m) {
            return true;
        }
        F(z15 ? 0.0f : this.C, z15 ? this.C : 0.0f);
        return true;
    }

    boolean D(View view) {
        View viewF = f(view);
        if (viewF != null) {
            view = viewF;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public void c(f fVar) {
        this.f34684v.add(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (C()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f34666a);
            this.A.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.D = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i15 = this.f34668c;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i17 = dVar.f34707a;
                if ((i17 & 5) != 5) {
                    if (i16 > 0) {
                        break;
                    }
                } else {
                    int i18 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i17 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i17 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i18 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i16 += iMin;
                    }
                    iMin = i18 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i16 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i16);
        this.f34668c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i15 = this.f34669d;
        if (i15 != -1) {
            return i15;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i17 = dVar.f34707a;
                if ((i17 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i17 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f34669d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f34679p;
    }

    public h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof h) {
            return (h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i15 = (minimumHeight * 2) + topInset;
            return i15 < getHeight() ? i15 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i16 = (minimumHeight2 * 2) + topInset;
        return i16 < getHeight() ? i16 : minimumHeight2 + topInset;
    }

    int getPendingAction() {
        return this.f34671f;
    }

    public Drawable getStatusBarForeground() {
        return this.A;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        f1 f1Var = this.f34672g;
        if (f1Var != null) {
            return f1Var.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i15 = this.f34667b;
        if (i15 != -1) {
            return i15;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i17 = dVar.f34707a;
                if ((i17 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i16 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i17 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f34667b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    boolean j() {
        return this.f34670e;
    }

    boolean l() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i15) {
        if (this.f34687y == null) {
            this.f34687y = new int[4];
        }
        int[] iArr = this.f34687y;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i15 + iArr.length);
        boolean z15 = this.f34675k;
        int i16 = ri.b.R;
        if (!z15) {
            i16 = -i16;
        }
        iArr[0] = i16;
        iArr[1] = (z15 && this.f34676l) ? ri.b.S : -ri.b.S;
        int i17 = ri.b.N;
        if (!z15) {
            i17 = -i17;
        }
        iArr[2] = i17;
        iArr[3] = (z15 && this.f34676l) ? ri.b.M : -ri.b.M;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        boolean z16 = true;
        if (getFitsSystemWindows() && E()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                l0.R(getChildAt(childCount), topInset);
            }
        }
        o();
        this.f34670e = false;
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            if (((d) getChildAt(i19).getLayoutParams()).d() != null) {
                this.f34670e = true;
                break;
            }
        }
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f34674j) {
            return;
        }
        if (!this.f34677m && !k()) {
            z16 = false;
        }
        z(z16);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        int mode = View.MeasureSpec.getMode(i16);
        if (mode != 1073741824 && getFitsSystemWindows() && E()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = c6.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i16));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    public boolean p() {
        return this.f34677m;
    }

    public boolean r() {
        return this.f34676l;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(t(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        i.d(this, f15);
    }

    public void setExpanded(boolean z15) {
        x(z15, isLaidOut());
    }

    public void setLiftOnScroll(boolean z15) {
        this.f34677m = z15;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f34678n != colorStateList) {
            this.f34678n = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f34679p = -1;
        if (view == null) {
            d();
        } else {
            this.f34680q = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i15) {
        this.f34679p = i15;
        d();
    }

    public void setLiftableOverrideEnabled(boolean z15) {
        this.f34674j = z15;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i15) {
        if (i15 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i15);
    }

    void setPendingAction(int i15) {
        this.f34671f = i15;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A = drawable != null ? drawable.mutate() : null;
            this.B = e();
            Drawable drawable3 = this.A;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A.setState(getDrawableState());
                }
                y5.a.m(this.A, getLayoutDirection());
                this.A.setVisible(getVisibility() == 0, false);
                this.A.setCallback(this);
            }
            G();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i15) {
        setStatusBarForeground(new ColorDrawable(i15));
    }

    public void setStatusBarForegroundResource(int i15) {
        setStatusBarForeground(y.b(getContext(), i15));
    }

    @Deprecated
    public void setTargetElevation(float f15) {
        g.a(this, f15);
    }

    @Override // android.view.View
    public void setVisibility(int i15) {
        super.setVisibility(i15);
        boolean z15 = i15 == 0;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setVisible(z15, false);
        }
    }

    void u(int i15) {
        this.f34666a = i15;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List<a> list = this.f34673h;
        if (list != null) {
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                a aVar = this.f34673h.get(i16);
                if (aVar != null) {
                    aVar.a(this, i15);
                }
            }
        }
    }

    public boolean v(f fVar) {
        return this.f34684v.remove(fVar);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A;
    }

    void w() {
        this.f34671f = 0;
    }

    public void x(boolean z15, boolean z16) {
        y(z15, z16, true);
    }

    public static class d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f34708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f34709c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34707a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f174109c);
            this.f34707a = typedArrayObtainStyledAttributes.getInt(l.f174125e, 0);
            f(typedArrayObtainStyledAttributes.getInt(l.f174117d, 0));
            if (typedArrayObtainStyledAttributes.hasValue(l.f174133f)) {
                this.f34709c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(l.f174133f, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private b a(int i15) {
            if (i15 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.f34708b;
        }

        public int c() {
            return this.f34707a;
        }

        public Interpolator d() {
            return this.f34709c;
        }

        boolean e() {
            int i15 = this.f34707a;
            return (i15 & 1) == 1 && (i15 & 10) != 0;
        }

        public void f(int i15) {
            this.f34708b = a(i15);
        }

        public void g(int i15) {
            this.f34707a = i15;
        }

        public d(int i15, int i16) {
            super(i15, i16);
            this.f34707a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34707a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f34707a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34707a = 1;
        }
    }
}
