package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.q;
import io.sentry.android.core.c2;
import j6.f1;
import j6.l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k6.p;
import k6.s;
import lj.l;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ri.j;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f34832l0 = k.f174072f;
    private boolean A;
    private final BottomSheetBehavior<V>.h B;
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G;
    int H;
    float I;
    boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    int O;
    int P;
    s6.c Q;
    private boolean R;
    private int S;
    private boolean T;
    private float U;
    private int V;
    int W;
    int X;
    WeakReference<V> Y;
    WeakReference<View> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34833a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    WeakReference<View> f34834a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34835b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    WeakReference<View> f34836b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34837c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ArrayList<f> f34838c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f34839d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private VelocityTracker f34840d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34841e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    gj.b f34842e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34843f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f34844f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34845g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f34846g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34847h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    boolean f34848h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34849i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Map<View, Integer> f34850i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private lj.h f34851j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    final SparseIntArray f34852j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f34853k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final s6.c.AbstractC4563c f34854k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f34858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f34861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f34862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f34863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f34864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f34865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f34866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f34867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f34868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private l f34869z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34871b;

        a(View view, int i15) {
            this.f34870a = view;
            this.f34871b = i15;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.Y0(this.f34870a, this.f34871b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f34851j != null) {
                BottomSheetBehavior.this.f34851j.h0(fFloatValue);
            }
        }
    }

    class c implements q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34874a;

        c(boolean z15) {
            this.f34874a = z15;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.q.c
        public f1 a(View view, f1 f1Var, q.d dVar) {
            boolean z15;
            x5.h hVarF = f1Var.f(f1.p.i());
            x5.h hVarF2 = f1Var.f(f1.p.f());
            BottomSheetBehavior.this.f34867x = hVarF.f216814b;
            boolean zG = q.g(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f34859p) {
                BottomSheetBehavior.this.f34866w = f1Var.i();
                paddingBottom = dVar.f35437d + BottomSheetBehavior.this.f34866w;
            }
            if (BottomSheetBehavior.this.f34860q) {
                paddingLeft = (zG ? dVar.f35436c : dVar.f35434a) + hVarF.f216813a;
            }
            if (BottomSheetBehavior.this.f34861r) {
                paddingRight = (zG ? dVar.f35434a : dVar.f35436c) + hVarF.f216815c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z16 = true;
            if (BottomSheetBehavior.this.f34863t) {
                int i15 = marginLayoutParams.leftMargin;
                int i16 = hVarF.f216813a;
                if (i15 != i16) {
                    marginLayoutParams.leftMargin = i16;
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
            if (BottomSheetBehavior.this.f34864u) {
                int i17 = marginLayoutParams.rightMargin;
                int i18 = hVarF.f216815c;
                if (i17 != i18) {
                    marginLayoutParams.rightMargin = i18;
                    z15 = true;
                }
            }
            if (BottomSheetBehavior.this.f34865v) {
                int i19 = marginLayoutParams.topMargin;
                int i25 = hVarF.f216814b;
                if (i19 != i25) {
                    marginLayoutParams.topMargin = i25;
                } else {
                    z16 = z15;
                }
            } else {
                z16 = z15;
            }
            if (z16) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f34874a) {
                BottomSheetBehavior.this.f34857n = hVarF2.f216816d;
            }
            if (!BottomSheetBehavior.this.f34859p && !this.f34874a) {
                return f1Var;
            }
            BottomSheetBehavior.this.d1(false);
            return f1Var;
        }
    }

    class d extends s6.c.AbstractC4563c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f34876a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.X + bottomSheetBehavior.m0()) / 2;
        }

        @Override // s6.c.AbstractC4563c
        public int a(View view, int i15, int i16) {
            return view.getLeft();
        }

        @Override // s6.c.AbstractC4563c
        public int b(View view, int i15, int i16) {
            return c6.a.b(i15, BottomSheetBehavior.this.m0(), e(view));
        }

        @Override // s6.c.AbstractC4563c
        public int e(View view) {
            return BottomSheetBehavior.this.e0() ? BottomSheetBehavior.this.X : BottomSheetBehavior.this.H;
        }

        @Override // s6.c.AbstractC4563c
        public void j(int i15) {
            if (i15 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.R0(1);
            }
        }

        @Override // s6.c.AbstractC4563c
        public void k(View view, int i15, int i16, int i17, int i18) {
            BottomSheetBehavior.this.j0(i16);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // s6.c.AbstractC4563c
        public void l(View view, float f15, float f16) {
            int i15 = 6;
            if (f16 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J && bottomSheetBehavior.V0(view, f16)) {
                    if ((Math.abs(f15) < Math.abs(f16) && f16 > BottomSheetBehavior.this.f34841e) || n(view)) {
                        i15 = 5;
                    } else if (BottomSheetBehavior.this.f34835b || Math.abs(view.getTop() - BottomSheetBehavior.this.m0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.F)) {
                        i15 = 3;
                    }
                } else if (f16 == 0.0f || Math.abs(f15) > Math.abs(f16)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f34835b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i16 = bottomSheetBehavior2.F;
                        if (top < i16) {
                            if (top < Math.abs(top - bottomSheetBehavior2.H)) {
                                i15 = 3;
                            } else if (BottomSheetBehavior.this.W0()) {
                                i15 = 4;
                            }
                        } else if (Math.abs(top - i16) >= Math.abs(top - BottomSheetBehavior.this.H) || BottomSheetBehavior.this.W0()) {
                            i15 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.E) < Math.abs(top - BottomSheetBehavior.this.H)) {
                        i15 = 3;
                    } else {
                        i15 = 4;
                    }
                } else if (BottomSheetBehavior.this.f34835b) {
                    i15 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.F) >= Math.abs(top2 - BottomSheetBehavior.this.H) || BottomSheetBehavior.this.W0()) {
                        i15 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f34835b) {
                i15 = 3;
            } else {
                int top3 = view.getTop();
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f34876a;
                if (BottomSheetBehavior.this.W0()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.T0(jUptimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.X)) {
                        i15 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.F) {
                }
                i15 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.Y0(view, i15, bottomSheetBehavior4.X0());
        }

        @Override // s6.c.AbstractC4563c
        public boolean m(View view, int i15) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i16 = bottomSheetBehavior.O;
            if (i16 == 1 || bottomSheetBehavior.f34848h0) {
                return false;
            }
            if (i16 == 3 && bottomSheetBehavior.f34844f0 == i15) {
                WeakReference<View> weakReference = bottomSheetBehavior.f34836b0;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f34876a = SystemClock.uptimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.Y;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34878a;

        e(int i15) {
            this.f34878a = i15;
        }

        @Override // k6.s
        public boolean a(View view, s.a aVar) {
            BottomSheetBehavior.this.Q0(this.f34878a);
            return true;
        }
    }

    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f15);

        public abstract void c(View view, int i15);
    }

    public BottomSheetBehavior() {
        this.f34833a = 0;
        this.f34835b = true;
        this.f34837c = false;
        this.f34855l = -1;
        this.f34856m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.P = 4;
        this.U = 0.1f;
        this.f34838c0 = new ArrayList<>();
        this.f34846g0 = -1;
        this.f34852j0 = new SparseIntArray();
        this.f34854k0 = new d();
    }

    private void A0(g gVar) {
        int i15 = this.f34833a;
        if (i15 == 0) {
            return;
        }
        if (i15 == -1 || (i15 & 1) == 1) {
            this.f34843f = gVar.f34881d;
        }
        if (i15 == -1 || (i15 & 2) == 2) {
            this.f34835b = gVar.f34882e;
        }
        if (i15 == -1 || (i15 & 4) == 4) {
            this.J = gVar.f34883f;
        }
        if (i15 == -1 || (i15 & 8) == 8) {
            this.K = gVar.f34884g;
        }
    }

    private void B0(V v15, Runnable runnable) {
        if (u0(v15)) {
            v15.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void S0(View view) {
        boolean z15 = (Build.VERSION.SDK_INT < 29 || r0() || this.f34845g) ? false : true;
        if (this.f34859p || this.f34860q || this.f34861r || this.f34863t || this.f34864u || this.f34865v || z15) {
            q.b(view, new c(z15));
        }
    }

    private boolean U0() {
        if (this.Q != null) {
            return this.L || this.O == 1;
        }
        return false;
    }

    private int X(View view, int i15, int i16) {
        return l0.c(view, view.getResources().getString(i15), g0(i16));
    }

    private void Y() {
        int iC0 = c0();
        if (this.f34835b) {
            this.H = Math.max(this.X - iC0, this.E);
        } else {
            this.H = this.X - iC0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0(View view, int i15, boolean z15) {
        int iN0 = n0(i15);
        s6.c cVar = this.Q;
        if (cVar == null || (!z15 ? cVar.H(view, view.getLeft(), iN0) : cVar.F(view.getLeft(), iN0))) {
            R0(i15);
            return;
        }
        R0(2);
        b1(i15, true);
        this.B.c(i15);
    }

    private float Z(float f15, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f15 > 0.0f) {
                return radius / f15;
            }
        }
        return 0.0f;
    }

    private void Z0() {
        WeakReference<V> weakReference = this.Y;
        if (weakReference != null) {
            a1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.Z;
        if (weakReference2 != null) {
            a1(weakReference2.get(), 1);
        }
    }

    private void a0() {
        this.F = (int) (this.X * (1.0f - this.G));
    }

    private void a1(View view, int i15) {
        if (view == null) {
            return;
        }
        f0(view, i15);
        if (!this.f34835b && this.O != 6) {
            this.f34852j0.put(i15, X(view, j.f174041a, 6));
        }
        if (this.J && t0() && this.O != 5) {
            y0(view, p.a.f108681y, 5);
        }
        int i16 = this.O;
        if (i16 == 3) {
            y0(view, p.a.f108680x, this.f34835b ? 4 : 6);
            return;
        }
        if (i16 == 4) {
            y0(view, p.a.f108679w, this.f34835b ? 3 : 6);
        } else {
            if (i16 != 6) {
                return;
            }
            y0(view, p.a.f108680x, 4);
            y0(view, p.a.f108679w, 3);
        }
    }

    private float b0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f34851j == null || (weakReference = this.Y) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v15 = this.Y.get();
        if (!p0() || (rootWindowInsets = v15.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(Z(this.f34851j.N(), rootWindowInsets.getRoundedCorner(0)), Z(this.f34851j.O(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void b1(int i15, boolean z15) {
        boolean zQ0;
        ValueAnimator valueAnimator;
        if (i15 == 2 || this.A == (zQ0 = q0()) || this.f34851j == null) {
            return;
        }
        this.A = zQ0;
        if (!z15 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f34851j.h0(this.A ? b0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.f34851j.C(), zQ0 ? b0() : 1.0f);
            this.C.start();
        }
    }

    private int c0() {
        int i15;
        if (this.f34845g) {
            return Math.min(Math.max(this.f34847h, this.X - ((this.W * 9) / 16)), this.V) + this.f34866w;
        }
        return (this.f34858o || this.f34859p || (i15 = this.f34857n) <= 0) ? this.f34843f + this.f34866w : Math.max(this.f34843f, i15 + this.f34849i);
    }

    private void c1(boolean z15) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z15) {
                if (this.f34850i0 != null) {
                    return;
                } else {
                    this.f34850i0 = new HashMap(childCount);
                }
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = coordinatorLayout.getChildAt(i15);
                if (childAt != this.Y.get()) {
                    if (z15) {
                        this.f34850i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f34837c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f34837c && (map = this.f34850i0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.f34850i0.get(childAt).intValue());
                    }
                }
            }
            if (!z15) {
                this.f34850i0 = null;
            } else if (this.f34837c) {
                this.Y.get().sendAccessibilityEvent(8);
            }
        }
    }

    private float d0(int i15) {
        float f15;
        float fM0;
        int i16 = this.H;
        if (i15 > i16 || i16 == m0()) {
            int i17 = this.H;
            f15 = i17 - i15;
            fM0 = this.X - i17;
        } else {
            int i18 = this.H;
            f15 = i18 - i15;
            fM0 = i18 - m0();
        }
        return f15 / fM0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(boolean z15) {
        V v15;
        if (this.Y != null) {
            Y();
            if (this.O != 4 || (v15 = this.Y.get()) == null) {
                return;
            }
            if (z15) {
                Q0(4);
            } else {
                v15.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e0() {
        return s0() && t0();
    }

    private void f0(View view, int i15) {
        if (view == null) {
            return;
        }
        l0.b0(view, PKIFailureInfo.signerNotTrusted);
        l0.b0(view, PKIFailureInfo.transactionIdInUse);
        l0.b0(view, PKIFailureInfo.badCertTemplate);
        int i16 = this.f34852j0.get(i15, -1);
        if (i16 != -1) {
            l0.b0(view, i16);
            this.f34852j0.delete(i15);
        }
    }

    private s g0(int i15) {
        return new e(i15);
    }

    private void h0(Context context) {
        if (this.f34869z == null) {
            return;
        }
        lj.h hVar = new lj.h(this.f34869z);
        this.f34851j = hVar;
        hVar.U(context);
        ColorStateList colorStateList = this.f34853k;
        if (colorStateList != null) {
            this.f34851j.g0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f34851j.setTint(typedValue.data);
    }

    private void i0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(b0(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new b());
    }

    private int l0(int i15, int i16, int i17, int i18) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i15, i16, i18);
        if (i17 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i17), 1073741824);
        }
        if (size != 0) {
            i17 = Math.min(size, i17);
        }
        return View.MeasureSpec.makeMeasureSpec(i17, PKIFailureInfo.systemUnavail);
    }

    private int n0(int i15) {
        if (i15 == 3) {
            return m0();
        }
        if (i15 == 4) {
            return this.H;
        }
        if (i15 == 5) {
            return this.X;
        }
        if (i15 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i15);
    }

    private float o0() {
        VelocityTracker velocityTracker = this.f34840d0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f34839d);
        return this.f34840d0.getYVelocity(this.f34844f0);
    }

    private boolean p0() {
        WeakReference<V> weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.Y.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean q0() {
        if (this.O == 3) {
            return this.f34868y || p0();
        }
        return false;
    }

    private boolean u0(V v15) {
        ViewParent parent = v15.getParent();
        return parent != null && parent.isLayoutRequested() && v15.isAttachedToWindow();
    }

    private boolean w0(CoordinatorLayout coordinatorLayout, int i15, int i16) {
        WeakReference<View> weakReference = this.f34834a0;
        View view = weakReference != null ? weakReference.get() : null;
        return view != null && coordinatorLayout.B(view, i15, i16);
    }

    private boolean x0(CoordinatorLayout coordinatorLayout, int i15, int i16) {
        WeakReference<View> weakReference = this.f34836b0;
        View view = weakReference != null ? weakReference.get() : null;
        return view != null && coordinatorLayout.B(view, i15, i16);
    }

    private void y0(View view, p.a aVar, int i15) {
        l0.d0(view, aVar, null, g0(i15));
    }

    private void z0() {
        this.f34844f0 = -1;
        this.f34846g0 = -1;
        VelocityTracker velocityTracker = this.f34840d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f34840d0 = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v15, View view, View view2, int i15, int i16) {
        this.S = 0;
        this.T = false;
        return (i15 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v15, View view, int i15) {
        WeakReference<View> weakReference;
        int i16 = 3;
        if (v15.getTop() == m0()) {
            R0(3);
            return;
        }
        if (!v0() || ((weakReference = this.f34836b0) != null && view == weakReference.get() && this.T)) {
            if (this.S > 0) {
                if (!this.f34835b && v15.getTop() > this.F) {
                    i16 = 6;
                }
            } else if (this.J && V0(v15, o0())) {
                i16 = 5;
            } else if (this.S == 0) {
                int top = v15.getTop();
                if (!this.f34835b) {
                    int i17 = this.F;
                    if (top < i17) {
                        if (top >= Math.abs(top - this.H)) {
                            if (W0()) {
                                i16 = 4;
                            } else {
                                i16 = 6;
                            }
                        }
                    } else if (Math.abs(top - i17) < Math.abs(top - this.H)) {
                        i16 = 6;
                    } else {
                        i16 = 4;
                    }
                } else if (Math.abs(top - this.E) >= Math.abs(top - this.H)) {
                    i16 = 4;
                }
            } else {
                if (!this.f34835b) {
                    int top2 = v15.getTop();
                    if (Math.abs(top2 - this.F) < Math.abs(top2 - this.H)) {
                        i16 = 6;
                    }
                }
                i16 = 4;
            }
            Y0(v15, i16, false);
            this.T = false;
        }
    }

    public void C0(boolean z15) {
        this.L = z15;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
        if (!v15.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.O == 1 && actionMasked == 0) {
            return true;
        }
        if (U0()) {
            this.Q.z(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f34840d0 == null) {
            this.f34840d0 = VelocityTracker.obtain();
        }
        this.f34840d0.addMovement(motionEvent);
        if (U0() && actionMasked == 2 && !this.R && Math.abs(this.f34846g0 - motionEvent.getY()) > this.Q.u()) {
            this.Q.b(v15, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.R;
    }

    public void D0(boolean z15) {
        this.M = z15;
    }

    public void E0(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i15;
        b1(this.O, true);
    }

    public void F0(boolean z15) {
        if (this.f34835b == z15) {
            return;
        }
        this.f34835b = z15;
        if (this.Y != null) {
            Y();
        }
        R0((this.f34835b && this.O == 6) ? 3 : this.O);
        b1(this.O, true);
        Z0();
    }

    public void G0(boolean z15) {
        this.f34858o = z15;
    }

    public void H0(float f15) {
        if (f15 <= 0.0f || f15 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f15;
        if (this.Y != null) {
            a0();
        }
    }

    public void I0(boolean z15) {
        if (this.J != z15) {
            this.J = z15;
            if (!z15 && this.O == 5) {
                Q0(4);
            }
            Z0();
        }
    }

    public void J0(int i15) {
        this.f34856m = i15;
    }

    public void K0(int i15) {
        this.f34855l = i15;
    }

    public void L0(int i15) {
        M0(i15, false);
    }

    public final void M0(int i15, boolean z15) {
        if (i15 == -1) {
            if (this.f34845g) {
                return;
            } else {
                this.f34845g = true;
            }
        } else {
            if (!this.f34845g && this.f34843f == i15) {
                return;
            }
            this.f34845g = false;
            this.f34843f = Math.max(0, i15);
        }
        d1(z15);
    }

    public void N0(int i15) {
        this.f34833a = i15;
    }

    public void O0(int i15) {
        this.f34841e = i15;
    }

    public void P0(boolean z15) {
        this.K = z15;
    }

    public void Q0(int i15) {
        if (i15 == 1 || i15 == 2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("STATE_");
            sb5.append(i15 == 1 ? "DRAGGING" : "SETTLING");
            sb5.append(" should not be set externally.");
            throw new IllegalArgumentException(sb5.toString());
        }
        if (!this.J && i15 == 5) {
            c2.g("BottomSheetBehavior", "Cannot set state: " + i15);
            return;
        }
        int i16 = (i15 == 6 && this.f34835b && n0(i15) <= this.E) ? 3 : i15;
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            R0(i15);
        } else {
            V v15 = this.Y.get();
            B0(v15, new a(v15, i16));
        }
    }

    void R0(int i15) {
        V v15;
        if (this.O == i15) {
            return;
        }
        this.O = i15;
        if (i15 == 4 || i15 == 3 || i15 == 6 || (this.J && i15 == 5)) {
            this.P = i15;
        }
        WeakReference<V> weakReference = this.Y;
        if (weakReference == null || (v15 = weakReference.get()) == null) {
            return;
        }
        if (i15 == 3) {
            c1(true);
        } else if (i15 == 6 || i15 == 5 || i15 == 4) {
            c1(false);
        }
        b1(i15, true);
        for (int i16 = 0; i16 < this.f34838c0.size(); i16++) {
            this.f34838c0.get(i16).c(v15, i15);
        }
        Z0();
    }

    public boolean T0(long j15, float f15) {
        return false;
    }

    boolean V0(View view, float f15) {
        if (this.K) {
            return true;
        }
        if (t0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f15 * this.U)) - ((float) this.H)) / ((float) c0()) > 0.5f;
        }
        return false;
    }

    public boolean W0() {
        return false;
    }

    public boolean X0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.Y = null;
        this.Q = null;
        this.f34842e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.Y = null;
        this.Q = null;
        this.f34842e0 = null;
    }

    void j0(int i15) {
        V v15 = this.Y.get();
        if (v15 == null || this.f34838c0.isEmpty()) {
            return;
        }
        float fD0 = d0(i15);
        for (int i16 = 0; i16 < this.f34838c0.size(); i16++) {
            this.f34838c0.get(i16).b(v15, fD0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
        int i15;
        s6.c cVar;
        if (!v15.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f34840d0 == null) {
            this.f34840d0 = VelocityTracker.obtain();
        }
        this.f34840d0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x15 = (int) motionEvent.getX();
            int y15 = (int) motionEvent.getY();
            this.f34846g0 = y15;
            if (this.O != 2 && x0(coordinatorLayout, x15, y15)) {
                this.f34844f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!w0(coordinatorLayout, x15, this.f34846g0)) {
                    this.f34848h0 = true;
                }
            }
            this.R = this.f34844f0 == -1 && !coordinatorLayout.B(v15, x15, this.f34846g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f34848h0 = false;
            this.f34844f0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (!this.R && (cVar = this.Q) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference = this.f34836b0;
        View view = weakReference != null ? weakReference.get() : null;
        return (actionMasked != 2 || view == null || this.R || this.O == 1 || coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Q == null || (i15 = this.f34846g0) == -1 || Math.abs(((float) i15) - motionEvent.getY()) <= ((float) this.Q.u())) ? false : true;
    }

    View k0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View viewK0 = k0(viewGroup.getChildAt(i15));
                if (viewK0 != null) {
                    return viewK0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v15, int i15) {
        if (coordinatorLayout.getFitsSystemWindows() && !v15.getFitsSystemWindows()) {
            v15.setFitsSystemWindows(true);
        }
        if (this.Y == null) {
            this.f34847h = coordinatorLayout.getResources().getDimensionPixelSize(ri.d.f173938a);
            S0(v15);
            l0.w0(v15, new com.google.android.material.bottomsheet.a(v15));
            this.Y = new WeakReference<>(v15);
            this.f34842e0 = new gj.b(v15);
            lj.h hVar = this.f34851j;
            if (hVar != null) {
                v15.setBackground(hVar);
                lj.h hVar2 = this.f34851j;
                float elevation = this.I;
                if (elevation == -1.0f) {
                    elevation = v15.getElevation();
                }
                hVar2.f0(elevation);
            } else {
                ColorStateList colorStateList = this.f34853k;
                if (colorStateList != null) {
                    l0.k0(v15, colorStateList);
                }
            }
            Z0();
            if (v15.getImportantForAccessibility() == 0) {
                v15.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = s6.c.m(coordinatorLayout, this.f34854k0);
        }
        int top = v15.getTop();
        coordinatorLayout.I(v15, i15);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = v15.getHeight();
        this.V = height;
        int iMin = this.X;
        int i16 = iMin - height;
        int i17 = this.f34867x;
        if (i16 < i17) {
            if (this.f34862s) {
                int i18 = this.f34856m;
                if (i18 != -1) {
                    iMin = Math.min(iMin, i18);
                }
                this.V = iMin;
            } else {
                int iMin2 = iMin - i17;
                int i19 = this.f34856m;
                if (i19 != -1) {
                    iMin2 = Math.min(iMin2, i19);
                }
                this.V = iMin2;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        a0();
        Y();
        int i25 = this.O;
        if (i25 == 3) {
            l0.R(v15, m0());
        } else if (i25 == 6) {
            l0.R(v15, this.F);
        } else if (this.J && i25 == 5) {
            l0.R(v15, this.X);
        } else if (i25 == 4) {
            l0.R(v15, this.H);
        } else if (i25 == 1 || i25 == 2) {
            l0.R(v15, top - v15.getTop());
        }
        b1(this.O, false);
        this.f34836b0 = new WeakReference<>(k0(v15));
        for (int i26 = 0; i26 < this.f34838c0.size(); i26++) {
            this.f34838c0.get(i26).a(v15);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v15, int i15, int i16, int i17, int i18) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v15.getLayoutParams();
        v15.measure(l0(i15, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i16, this.f34855l, marginLayoutParams.width), l0(i17, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i18, this.f34856m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        if (this.f34835b) {
            return this.E;
        }
        return Math.max(this.D, this.f34862s ? 0 : this.f34867x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v15, View view, float f15, float f16) {
        WeakReference<View> weakReference;
        return v0() && (weakReference = this.f34836b0) != null && view == weakReference.get() && (!(this.O == 3 || this.N) || super.o(coordinatorLayout, v15, view, f15, f16));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int[] iArr, int i17) {
        if (i17 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f34836b0;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!v0() || view == view2) {
            int top = v15.getTop();
            int i18 = top - i16;
            if (i16 > 0) {
                if (!this.T && !this.M && view == view2 && view.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i18 < m0()) {
                    int iM0 = top - m0();
                    iArr[1] = iM0;
                    l0.R(v15, -iM0);
                    R0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i16;
                    l0.R(v15, -i16);
                    R0(1);
                }
            } else if (i16 < 0) {
                boolean zCanScrollVertically = view.canScrollVertically(-1);
                if (!this.T && !this.M && view == view2 && zCanScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i18 > this.H && !e0()) {
                        int i19 = top - this.H;
                        iArr[1] = i19;
                        l0.R(v15, -i19);
                        R0(4);
                    } else {
                        if (!this.L) {
                            return;
                        }
                        iArr[1] = i16;
                        l0.R(v15, -i16);
                        R0(1);
                    }
                }
            }
            j0(v15.getTop());
            this.S = i16;
            this.T = true;
            this.N = false;
        }
    }

    public boolean r0() {
        return this.f34858o;
    }

    public boolean s0() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
    }

    public boolean t0() {
        return true;
    }

    public boolean v0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v15, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, v15, gVar.a());
        A0(gVar);
        int i15 = gVar.f34880c;
        if (i15 == 1 || i15 == 2) {
            this.O = 4;
            this.P = 4;
        } else {
            this.O = i15;
            this.P = i15;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v15) {
        return new g(super.y(coordinatorLayout, v15), (BottomSheetBehavior<?>) this);
    }

    private class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f34885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f34886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f34887c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f34886b = false;
                s6.c cVar = BottomSheetBehavior.this.Q;
                if (cVar != null && cVar.k(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f34885a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.O == 2) {
                    bottomSheetBehavior.R0(hVar2.f34885a);
                }
            }
        }

        private h() {
            this.f34887c = new a();
        }

        void c(int i15) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f34885a = i15;
            if (this.f34886b) {
                return;
            }
            BottomSheetBehavior.this.Y.get().postOnAnimation(this.f34887c);
            this.f34886b = true;
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class g extends r6.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f34880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f34881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f34882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f34883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f34884g;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i15) {
                return new g[i15];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34880c = parcel.readInt();
            this.f34881d = parcel.readInt();
            this.f34882e = parcel.readInt() == 1;
            this.f34883f = parcel.readInt() == 1;
            this.f34884g = parcel.readInt() == 1;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f34880c);
            parcel.writeInt(this.f34881d);
            parcel.writeInt(this.f34882e ? 1 : 0);
            parcel.writeInt(this.f34883f ? 1 : 0);
            parcel.writeInt(this.f34884g ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f34880c = bottomSheetBehavior.O;
            this.f34881d = ((BottomSheetBehavior) bottomSheetBehavior).f34843f;
            this.f34882e = ((BottomSheetBehavior) bottomSheetBehavior).f34835b;
            this.f34883f = bottomSheetBehavior.J;
            this.f34884g = ((BottomSheetBehavior) bottomSheetBehavior).K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i15;
        super(context, attributeSet);
        this.f34833a = 0;
        this.f34835b = true;
        this.f34837c = false;
        this.f34855l = -1;
        this.f34856m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.P = 4;
        this.U = 0.1f;
        this.f34838c0 = new ArrayList<>();
        this.f34846g0 = -1;
        this.f34852j0 = new SparseIntArray();
        this.f34854k0 = new d();
        this.f34849i = context.getResources().getDimensionPixelSize(ri.d.f173957j0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ri.l.M);
        if (typedArrayObtainStyledAttributes.hasValue(ri.l.Q)) {
            this.f34853k = ij.c.a(context, typedArrayObtainStyledAttributes, ri.l.Q);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ri.l.f174166j0)) {
            this.f34869z = l.e(context, attributeSet, ri.b.f173907b, f34832l0).m();
        }
        h0(context);
        i0();
        this.I = typedArrayObtainStyledAttributes.getDimension(ri.l.P, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(ri.l.N)) {
            K0(typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.N, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ri.l.O)) {
            J0(typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.O, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(ri.l.X);
        if (typedValuePeekValue != null && (i15 = typedValuePeekValue.data) == -1) {
            L0(i15);
        } else {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.X, -1));
        }
        I0(typedArrayObtainStyledAttributes.getBoolean(ri.l.W, false));
        G0(typedArrayObtainStyledAttributes.getBoolean(ri.l.f174102b0, false));
        F0(typedArrayObtainStyledAttributes.getBoolean(ri.l.U, true));
        P0(typedArrayObtainStyledAttributes.getBoolean(ri.l.f174094a0, false));
        C0(typedArrayObtainStyledAttributes.getBoolean(ri.l.R, true));
        D0(typedArrayObtainStyledAttributes.getBoolean(ri.l.S, true));
        N0(typedArrayObtainStyledAttributes.getInt(ri.l.Y, 0));
        H0(typedArrayObtainStyledAttributes.getFloat(ri.l.V, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(ri.l.T);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            E0(typedValuePeekValue2.data);
        } else {
            E0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ri.l.T, 0));
        }
        O0(typedArrayObtainStyledAttributes.getInt(ri.l.Z, 500));
        this.f34859p = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174134f0, false);
        this.f34860q = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174142g0, false);
        this.f34861r = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174150h0, false);
        this.f34862s = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174158i0, true);
        this.f34863t = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174110c0, false);
        this.f34864u = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174118d0, false);
        this.f34865v = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174126e0, false);
        this.f34868y = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174174k0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f34839d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
