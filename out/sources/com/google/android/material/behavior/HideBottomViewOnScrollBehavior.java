package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import gj.e;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f34745m = ri.b.f173928w;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f34746n = ri.b.f173931z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f34747o = ri.b.F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<c> f34748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f34751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f34752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AccessibilityManager f34754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f34755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewPropertyAnimator f34759l;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f34755h == null || HideBottomViewOnScrollBehavior.this.f34754g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f34754g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f34755h);
            HideBottomViewOnScrollBehavior.this.f34755h = null;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f34759l = null;
        }
    }

    public interface c {
        void a(View view, int i15);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f34748a = new LinkedHashSet<>();
        this.f34753f = 0;
        this.f34756i = true;
        this.f34757j = 2;
        this.f34758k = 0;
    }

    public static /* synthetic */ void E(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z15) {
        if (!z15) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.L()) {
            hideBottomViewOnScrollBehavior.Q(view);
        }
    }

    private void J(V v15, int i15, long j15, TimeInterpolator timeInterpolator) {
        this.f34759l = v15.animate().translationY(i15).setInterpolator(timeInterpolator).setDuration(j15).setListener(new b());
    }

    private void K(final V v15) {
        if (this.f34754g == null) {
            this.f34754g = (AccessibilityManager) u5.a.k(v15.getContext(), AccessibilityManager.class);
        }
        if (this.f34754g == null || this.f34755h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: ui.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z15) {
                HideBottomViewOnScrollBehavior.E(this.f198522a, v15, z15);
            }
        };
        this.f34755h = touchExplorationStateChangeListener;
        this.f34754g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        v15.addOnAttachStateChangeListener(new a());
    }

    private void S(V v15, int i15) {
        this.f34757j = i15;
        Iterator<c> it = this.f34748a.iterator();
        while (it.hasNext()) {
            it.next().a(v15, this.f34757j);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v15, View view, View view2, int i15, int i16) {
        return i15 == 2;
    }

    public boolean L() {
        return this.f34757j == 1;
    }

    public boolean M() {
        return this.f34757j == 2;
    }

    public void N(V v15, int i15) {
        this.f34758k = i15;
        if (this.f34757j == 1) {
            v15.setTranslationY(this.f34753f + i15);
        }
    }

    public void O(V v15) {
        P(v15, true);
    }

    public void P(V v15, boolean z15) {
        AccessibilityManager accessibilityManager;
        if (L()) {
            return;
        }
        if (this.f34756i && (accessibilityManager = this.f34754g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34759l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v15.clearAnimation();
        }
        S(v15, 1);
        int i15 = this.f34753f + this.f34758k;
        if (z15) {
            J(v15, i15, this.f34750c, this.f34752e);
        } else {
            v15.setTranslationY(i15);
        }
    }

    public void Q(V v15) {
        R(v15, true);
    }

    public void R(V v15, boolean z15) {
        if (M()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34759l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v15.clearAnimation();
        }
        S(v15, 2);
        if (z15) {
            J(v15, 0, this.f34749b, this.f34751d);
        } else {
            v15.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v15, int i15) {
        this.f34753f = v15.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v15.getLayoutParams()).bottomMargin;
        this.f34749b = e.f(v15.getContext(), f34745m, 225);
        this.f34750c = e.f(v15.getContext(), f34746n, 175);
        Context context = v15.getContext();
        int i16 = f34747o;
        this.f34751d = e.g(context, i16, si.a.f181919d);
        this.f34752e = e.g(v15.getContext(), i16, si.a.f181918c);
        K(v15);
        return super.l(coordinatorLayout, v15, i15);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        if (i16 > 0) {
            O(v15);
        } else if (i16 < 0) {
            Q(v15);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34748a = new LinkedHashSet<>();
        this.f34753f = 0;
        this.f34756i = true;
        this.f34757j = 2;
        this.f34758k = 0;
    }
}
