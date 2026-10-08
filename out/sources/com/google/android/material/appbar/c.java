package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
abstract class c<V extends View> extends e<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f34720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f34721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f34726j;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f34727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f34728b;

        a(CoordinatorLayout coordinatorLayout, V v15) {
            this.f34727a = coordinatorLayout;
            this.f34728b = v15;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f34728b == null || (overScroller = c.this.f34721e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                c.this.N(this.f34727a, this.f34728b);
                return;
            }
            c cVar = c.this;
            cVar.P(this.f34727a, this.f34728b, cVar.f34721e.getCurrY());
            this.f34728b.postOnAnimation(this);
        }
    }

    public c() {
        this.f34723g = -1;
        this.f34725i = -1;
    }

    private void I() {
        if (this.f34726j == null) {
            this.f34726j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
        boolean z15;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f34726j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f34726j.computeCurrentVelocity(1000);
                J(coordinatorLayout, v15, -L(v15), 0, this.f34726j.getYVelocity(this.f34723g));
                z15 = true;
            }
            this.f34722f = false;
            this.f34723g = -1;
            velocityTracker = this.f34726j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f34726j = null;
            }
            velocityTracker2 = this.f34726j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f34722f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f34723g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y15 = (int) motionEvent.getY(iFindPointerIndex);
            int i15 = this.f34724h - y15;
            this.f34724h = y15;
            O(coordinatorLayout, v15, i15, K(v15), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i16 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f34723g = motionEvent.getPointerId(i16);
                this.f34724h = (int) (motionEvent.getY(i16) + 0.5f);
            }
        }
        z15 = false;
        velocityTracker2 = this.f34726j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f34722f || z15;
        z15 = false;
        this.f34722f = false;
        this.f34723g = -1;
        velocityTracker = this.f34726j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f34726j = null;
        }
        velocityTracker2 = this.f34726j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f34722f) {
        }
    }

    boolean H(V v15) {
        return false;
    }

    final boolean J(CoordinatorLayout coordinatorLayout, V v15, int i15, int i16, float f15) {
        Runnable runnable = this.f34720d;
        if (runnable != null) {
            v15.removeCallbacks(runnable);
            this.f34720d = null;
        }
        if (this.f34721e == null) {
            this.f34721e = new OverScroller(v15.getContext());
        }
        this.f34721e.fling(0, E(), 0, Math.round(f15), 0, 0, i15, i16);
        if (!this.f34721e.computeScrollOffset()) {
            N(coordinatorLayout, v15);
            return false;
        }
        a aVar = new a(coordinatorLayout, v15);
        this.f34720d = aVar;
        v15.postOnAnimation(aVar);
        return true;
    }

    int K(V v15) {
        return -v15.getHeight();
    }

    int L(V v15) {
        return v15.getHeight();
    }

    int M() {
        return E();
    }

    void N(CoordinatorLayout coordinatorLayout, V v15) {
    }

    final int O(CoordinatorLayout coordinatorLayout, V v15, int i15, int i16, int i17) {
        return Q(coordinatorLayout, v15, M() - i15, i16, i17);
    }

    int P(CoordinatorLayout coordinatorLayout, V v15, int i15) {
        return Q(coordinatorLayout, v15, i15, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
    }

    int Q(CoordinatorLayout coordinatorLayout, V v15, int i15, int i16, int i17) {
        int iB;
        int iE = E();
        if (i16 == 0 || iE < i16 || iE > i17 || iE == (iB = c6.a.b(i15, i16, i17))) {
            return 0;
        }
        G(iB);
        return iE - iB;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f34725i < 0) {
            this.f34725i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f34722f) {
            int i15 = this.f34723g;
            if (i15 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i15)) == -1) {
                return false;
            }
            int y15 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y15 - this.f34724h) > this.f34725i) {
                this.f34724h = y15;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f34723g = -1;
            int x15 = (int) motionEvent.getX();
            int y16 = (int) motionEvent.getY();
            boolean z15 = H(v15) && coordinatorLayout.B(v15, x15, y16);
            this.f34722f = z15;
            if (z15) {
                this.f34724h = y16;
                this.f34723g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f34721e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f34721e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f34726j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34723g = -1;
        this.f34725i = -1;
    }
}
