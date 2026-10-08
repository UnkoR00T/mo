package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import gj.e;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f34762o = ri.b.f173928w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f34763p = ri.b.f173931z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f34764q = ri.b.F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f34765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AccessibilityManager f34766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f34767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet<c> f34769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TimeInterpolator f34772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimeInterpolator f34773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewPropertyAnimator f34777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34778n;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f34767c == null || HideViewOnScrollBehavior.this.f34766b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f34766b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f34767c);
            HideViewOnScrollBehavior.this.f34767c = null;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f34777m = null;
        }
    }

    public interface c {
        void a(View view, int i15);
    }

    public HideViewOnScrollBehavior() {
        this.f34768d = true;
        this.f34769e = new LinkedHashSet<>();
        this.f34774j = 0;
        this.f34775k = 2;
        this.f34776l = 0;
        this.f34778n = false;
    }

    public static /* synthetic */ void E(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z15) {
        if (hideViewOnScrollBehavior.f34768d && z15 && hideViewOnScrollBehavior.O()) {
            hideViewOnScrollBehavior.R(view);
        }
    }

    private void J(V v15, int i15, long j15, TimeInterpolator timeInterpolator) {
        this.f34777m = this.f34765a.d(v15, i15).setInterpolator(timeInterpolator).setDuration(j15).setListener(new b());
    }

    private void K(final V v15) {
        if (this.f34766b == null) {
            this.f34766b = (AccessibilityManager) u5.a.k(v15.getContext(), AccessibilityManager.class);
        }
        if (this.f34766b == null || this.f34767c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: ui.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z15) {
                HideViewOnScrollBehavior.E(this.f198524a, v15, z15);
            }
        };
        this.f34767c = touchExplorationStateChangeListener;
        this.f34766b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        v15.addOnAttachStateChangeListener(new a());
    }

    private boolean L(int i15) {
        return i15 == 80 || i15 == 81;
    }

    private boolean M(int i15) {
        return i15 == 3 || i15 == 19;
    }

    private void P(V v15, int i15) {
        if (this.f34778n) {
            return;
        }
        int i16 = ((CoordinatorLayout.f) v15.getLayoutParams()).f11785c;
        if (L(i16)) {
            Q(1);
        } else {
            Q(M(Gravity.getAbsoluteGravity(i16, i15)) ? 2 : 0);
        }
    }

    private void Q(int i15) {
        d dVar = this.f34765a;
        if (dVar == null || dVar.c() != i15) {
            if (i15 == 0) {
                this.f34765a = new com.google.android.material.behavior.c();
                return;
            }
            if (i15 == 1) {
                this.f34765a = new com.google.android.material.behavior.a();
                return;
            }
            if (i15 == 2) {
                this.f34765a = new com.google.android.material.behavior.b();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i15 + ". Must be 0, 1 or 2.");
        }
    }

    private void V(V v15, int i15) {
        this.f34775k = i15;
        Iterator<c> it = this.f34769e.iterator();
        while (it.hasNext()) {
            it.next().a(v15, this.f34775k);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v15, View view, View view2, int i15, int i16) {
        return i15 == 2;
    }

    public boolean N() {
        return this.f34775k == 2;
    }

    public boolean O() {
        return this.f34775k == 1;
    }

    public void R(V v15) {
        S(v15, true);
    }

    public void S(V v15, boolean z15) {
        if (N()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34777m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v15.clearAnimation();
        }
        V(v15, 2);
        int iB = this.f34765a.b();
        if (z15) {
            J(v15, iB, this.f34770f, this.f34772h);
        } else {
            this.f34765a.e(v15, iB);
        }
    }

    public void T(V v15) {
        U(v15, true);
    }

    public void U(V v15, boolean z15) {
        AccessibilityManager accessibilityManager;
        if (O()) {
            return;
        }
        if (this.f34768d && (accessibilityManager = this.f34766b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34777m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v15.clearAnimation();
        }
        V(v15, 1);
        int i15 = this.f34774j + this.f34776l;
        if (z15) {
            J(v15, i15, this.f34771g, this.f34773i);
        } else {
            this.f34765a.e(v15, i15);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v15, int i15) {
        K(v15);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v15.getLayoutParams();
        P(v15, i15);
        this.f34774j = this.f34765a.a(v15, marginLayoutParams);
        this.f34770f = e.f(v15.getContext(), f34762o, 225);
        this.f34771g = e.f(v15.getContext(), f34763p, 175);
        Context context = v15.getContext();
        int i16 = f34764q;
        this.f34772h = e.g(context, i16, si.a.f181919d);
        this.f34773i = e.g(v15.getContext(), i16, si.a.f181918c);
        return super.l(coordinatorLayout, v15, i15);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        if (i16 > 0) {
            T(v15);
        } else if (i16 < 0) {
            R(v15);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34768d = true;
        this.f34769e = new LinkedHashSet<>();
        this.f34774j = 0;
        this.f34775k = 2;
        this.f34776l = 0;
        this.f34778n = false;
    }
}
