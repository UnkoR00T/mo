package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j6.l0;
import k6.p;
import k6.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    s6.c f34781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f34782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34784d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34786f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34785e = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f34787g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f34788h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f34789i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f34790j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s6.c.AbstractC4563c f34791k = new a();

    class a extends s6.c.AbstractC4563c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f34792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f34793b = -1;

        a() {
        }

        private boolean n(View view, float f15) {
            if (f15 == 0.0f) {
                return Math.abs(view.getLeft() - this.f34792a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f34788h);
            }
            boolean z15 = view.getLayoutDirection() == 1;
            int i15 = SwipeDismissBehavior.this.f34787g;
            if (i15 == 2) {
                return true;
            }
            if (i15 == 0) {
                if (z15) {
                    return f15 < 0.0f;
                }
                return f15 > 0.0f;
            }
            if (i15 == 1) {
                if (z15) {
                    return f15 > 0.0f;
                }
                if (f15 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // s6.c.AbstractC4563c
        public int a(View view, int i15, int i16) {
            int width;
            int width2;
            int width3;
            boolean z15 = view.getLayoutDirection() == 1;
            int i17 = SwipeDismissBehavior.this.f34787g;
            if (i17 == 0) {
                if (z15) {
                    width = this.f34792a - view.getWidth();
                    width2 = this.f34792a;
                } else {
                    width = this.f34792a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i17 != 1) {
                width = this.f34792a - view.getWidth();
                width2 = view.getWidth() + this.f34792a;
            } else if (z15) {
                width = this.f34792a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f34792a - view.getWidth();
                width2 = this.f34792a;
            }
            return SwipeDismissBehavior.H(width, i15, width2);
        }

        @Override // s6.c.AbstractC4563c
        public int b(View view, int i15, int i16) {
            return view.getTop();
        }

        @Override // s6.c.AbstractC4563c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // s6.c.AbstractC4563c
        public void i(View view, int i15) {
            this.f34793b = i15;
            this.f34792a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f34784d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f34784d = false;
            }
        }

        @Override // s6.c.AbstractC4563c
        public void j(int i15) {
            c cVar = SwipeDismissBehavior.this.f34782b;
            if (cVar != null) {
                cVar.b(i15);
            }
        }

        @Override // s6.c.AbstractC4563c
        public void k(View view, int i15, int i16, int i17, int i18) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f34789i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f34790j;
            float fAbs = Math.abs(i15 - this.f34792a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // s6.c.AbstractC4563c
        public void l(View view, float f15, float f16) {
            int i15;
            boolean z15;
            c cVar;
            this.f34793b = -1;
            int width = view.getWidth();
            if (n(view, f15)) {
                if (f15 >= 0.0f) {
                    int left = view.getLeft();
                    int i16 = this.f34792a;
                    if (left < i16) {
                        i15 = this.f34792a - width;
                    } else {
                        i15 = i16 + width;
                    }
                } else {
                    i15 = this.f34792a - width;
                }
                z15 = true;
            } else {
                i15 = this.f34792a;
                z15 = false;
            }
            if (SwipeDismissBehavior.this.f34781a.F(i15, view.getTop())) {
                view.postOnAnimation(new d(view, z15));
            } else {
                if (!z15 || (cVar = SwipeDismissBehavior.this.f34782b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // s6.c.AbstractC4563c
        public boolean m(View view, int i15) {
            int i16 = this.f34793b;
            return (i16 == -1 || i16 == i15) && SwipeDismissBehavior.this.F(view);
        }
    }

    class b implements s {
        b() {
        }

        @Override // k6.s
        public boolean a(View view, s.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z15 = view.getLayoutDirection() == 1;
            int i15 = SwipeDismissBehavior.this.f34787g;
            l0.Q(view, (!(i15 == 0 && z15) && (i15 != 1 || z15)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f34782b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i15);
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f34796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f34797b;

        d(View view, boolean z15) {
            this.f34796a = view;
            this.f34797b = z15;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            s6.c cVar2 = SwipeDismissBehavior.this.f34781a;
            if (cVar2 != null && cVar2.k(true)) {
                this.f34796a.postOnAnimation(this);
            } else {
                if (!this.f34797b || (cVar = SwipeDismissBehavior.this.f34782b) == null) {
                    return;
                }
                cVar.a(this.f34796a);
            }
        }
    }

    static float G(float f15, float f16, float f17) {
        return Math.min(Math.max(f15, f16), f17);
    }

    static int H(int i15, int i16, int i17) {
        return Math.min(Math.max(i15, i16), i17);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f34781a == null) {
            this.f34781a = this.f34786f ? s6.c.l(viewGroup, this.f34785e, this.f34791k) : s6.c.m(viewGroup, this.f34791k);
        }
    }

    static float J(float f15, float f16, float f17) {
        return (f17 - f15) / (f16 - f15);
    }

    private void O(View view) {
        l0.b0(view, PKIFailureInfo.badCertTemplate);
        if (F(view)) {
            l0.d0(view, p.a.f108681y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
        if (this.f34781a == null) {
            return false;
        }
        if (this.f34784d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f34781a.z(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f15) {
        this.f34790j = G(0.0f, f15, 1.0f);
    }

    public void L(c cVar) {
        this.f34782b = cVar;
    }

    public void M(float f15) {
        this.f34789i = G(0.0f, f15, 1.0f);
    }

    public void N(int i15) {
        this.f34787g = i15;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
        boolean zB = this.f34783c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(v15, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f34783c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f34783c = false;
        }
        if (zB) {
            I(coordinatorLayout);
            if (!this.f34784d && this.f34781a.G(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v15, int i15) {
        boolean zL = super.l(coordinatorLayout, v15, i15);
        if (v15.getImportantForAccessibility() == 0) {
            v15.setImportantForAccessibility(1);
            O(v15);
        }
        return zL;
    }
}
