package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.c2;
import j6.l0;
import j6.o0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, j6.t {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    static boolean f12997c1 = false;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    static boolean f12998d1 = false;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final int[] f12999e1 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final float f13000f1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    static final boolean f13001g1 = false;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    static final boolean f13002h1 = true;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    static final boolean f13003i1 = true;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    static final boolean f13004j1 = true;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final boolean f13005k1 = false;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final boolean f13006l1 = false;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final Class<?>[] f13007m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    static final Interpolator f13008n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    static final c0 f13009o1;
    private int A;
    private s A0;
    boolean B;
    private final int B0;
    boolean C;
    private final int C0;
    private boolean D;
    private float D0;
    private int E;
    private float E0;
    boolean F;
    private boolean F0;
    private final AccessibilityManager G;
    final e0 G0;
    private List<r> H;
    androidx.recyclerview.widget.j H0;
    boolean I;
    androidx.recyclerview.widget.j.b I0;
    final b0 J0;
    boolean K;
    private u K0;
    private int L;
    private List<u> L0;
    boolean M0;
    boolean N0;
    private int O;
    private m.b O0;
    private l P;
    boolean P0;
    androidx.recyclerview.widget.r Q0;
    private EdgeEffect R;
    private final int[] R0;
    private j6.u S0;
    private EdgeEffect T;
    private final int[] T0;
    private final int[] U0;
    final int[] V0;
    final List<f0> W0;
    private Runnable X0;
    private boolean Y0;
    private int Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13010a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f13011a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f13012b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private final androidx.recyclerview.widget.w.b f13013b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final w f13014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    z f13015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.recyclerview.widget.a f13016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.recyclerview.widget.f f13017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.recyclerview.widget.w f13018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f13019h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private EdgeEffect f13020h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Runnable f13021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Rect f13022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f13023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final RectF f13024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    h f13025n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    p f13026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    x f13027q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private EdgeEffect f13028q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final List<x> f13029r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    m f13030r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ArrayList<o> f13031s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f13032s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList<t> f13033t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f13034t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private VelocityTracker f13035u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private t f13036v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f13037v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f13038w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f13039w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f13040x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f13041x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f13042y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f13043y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f13044z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f13045z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f13044z || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f13038w) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.C) {
                recyclerView2.B = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    public static abstract class a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f13048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f13049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f13052f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f13054h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13047a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f13053g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f13055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f13056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f13057c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f13058d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f13059e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f13060f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f13061g;

            public a(int i15, int i16) {
                this(i15, i16, PKIFailureInfo.systemUnavail, null);
            }

            private void e() {
                if (this.f13059e != null && this.f13057c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f13057c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f13058d >= 0;
            }

            public void b(int i15) {
                this.f13058d = i15;
            }

            void c(RecyclerView recyclerView) {
                int i15 = this.f13058d;
                if (i15 >= 0) {
                    this.f13058d = -1;
                    recyclerView.C0(i15);
                    this.f13060f = false;
                } else {
                    if (!this.f13060f) {
                        this.f13061g = 0;
                        return;
                    }
                    e();
                    recyclerView.G0.e(this.f13055a, this.f13056b, this.f13057c, this.f13059e);
                    int i16 = this.f13061g + 1;
                    this.f13061g = i16;
                    if (i16 > 10) {
                        c2.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f13060f = false;
                }
            }

            public void d(int i15, int i16, int i17, Interpolator interpolator) {
                this.f13055a = i15;
                this.f13056b = i16;
                this.f13057c = i17;
                this.f13059e = interpolator;
                this.f13060f = true;
            }

            public a(int i15, int i16, int i17, Interpolator interpolator) {
                this.f13058d = -1;
                this.f13060f = false;
                this.f13061g = 0;
                this.f13055a = i15;
                this.f13056b = i16;
                this.f13057c = i17;
                this.f13059e = interpolator;
            }
        }

        public interface b {
            PointF d(int i15);
        }

        public PointF a(int i15) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).d(i15);
            }
            c2.g("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i15) {
            return this.f13048b.f13026p.H(i15);
        }

        public int c() {
            return this.f13048b.f13026p.O();
        }

        public int d(View view) {
            return this.f13048b.j0(view);
        }

        public p e() {
            return this.f13049c;
        }

        public int f() {
            return this.f13047a;
        }

        public boolean g() {
            return this.f13050d;
        }

        public boolean h() {
            return this.f13051e;
        }

        protected void i(PointF pointF) {
            float f15 = pointF.x;
            float f16 = pointF.y;
            float fSqrt = (float) Math.sqrt((f15 * f15) + (f16 * f16));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i15, int i16) {
            PointF pointFA;
            RecyclerView recyclerView = this.f13048b;
            if (this.f13047a == -1 || recyclerView == null) {
                r();
            }
            if (this.f13050d && this.f13052f == null && this.f13049c != null && (pointFA = a(this.f13047a)) != null) {
                float f15 = pointFA.x;
                if (f15 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.p1((int) Math.signum(f15), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f13050d = false;
            View view = this.f13052f;
            if (view != null) {
                if (d(view) == this.f13047a) {
                    o(this.f13052f, recyclerView.J0, this.f13053g);
                    this.f13053g.c(recyclerView);
                    r();
                } else {
                    c2.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f13052f = null;
                }
            }
            if (this.f13051e) {
                l(i15, i16, recyclerView.J0, this.f13053g);
                boolean zA = this.f13053g.a();
                this.f13053g.c(recyclerView);
                if (zA && this.f13051e) {
                    this.f13050d = true;
                    recyclerView.G0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f13052f = view;
                boolean z15 = RecyclerView.f12997c1;
            }
        }

        protected abstract void l(int i15, int i16, b0 b0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i15) {
            this.f13047a = i15;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.G0.f();
            if (this.f13054h) {
                c2.g("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f13048b = recyclerView;
            this.f13049c = pVar;
            int i15 = this.f13047a;
            if (i15 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.J0.f13063a = i15;
            this.f13051e = true;
            this.f13050d = true;
            this.f13052f = b(f());
            m();
            this.f13048b.G0.d();
            this.f13054h = true;
        }

        protected final void r() {
            if (this.f13051e) {
                this.f13051e = false;
                n();
                this.f13048b.J0.f13063a = -1;
                this.f13052f = null;
                this.f13047a = -1;
                this.f13050d = false;
                this.f13049c.j1(this);
                this.f13049c = null;
                this.f13048b = null;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f13030r0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.P0 = false;
        }
    }

    public static class b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f13064b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13075m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f13076n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f13077o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f13078p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13079q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13063a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13065c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13066d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13067e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13068f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f13069g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f13070h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f13071i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13072j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f13073k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f13074l = false;

        void a(int i15) {
            if ((this.f13067e & i15) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i15) + " but it is " + Integer.toBinaryString(this.f13067e));
        }

        public int b() {
            return this.f13070h ? this.f13065c - this.f13066d : this.f13068f;
        }

        public int c() {
            return this.f13063a;
        }

        public boolean d() {
            return this.f13063a != -1;
        }

        public boolean e() {
            return this.f13070h;
        }

        void f(h hVar) {
            this.f13067e = 1;
            this.f13068f = hVar.g();
            this.f13070h = false;
            this.f13071i = false;
            this.f13072j = false;
        }

        public boolean g() {
            return this.f13074l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f13063a + ", mData=" + this.f13064b + ", mItemCount=" + this.f13068f + ", mIsMeasuring=" + this.f13072j + ", mPreviousLayoutItemCount=" + this.f13065c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f13066d + ", mStructureChanged=" + this.f13069g + ", mInPreLayout=" + this.f13070h + ", mRunSimpleAnimations=" + this.f13073k + ", mRunPredictiveAnimations=" + this.f13074l + '}';
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f15) {
            float f16 = f15 - 1.0f;
            return (f16 * f16 * f16 * f16 * f16) + 1.0f;
        }
    }

    static class c0 extends l {
        c0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i15) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    class d implements androidx.recyclerview.widget.w.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.w.b
        public void a(f0 f0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.o(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void b(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f13026p.q1(f0Var.f13091a, recyclerView.f13014c);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void c(f0 f0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.f13014c.O(f0Var);
            RecyclerView.this.q(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void d(f0 f0Var, m.c cVar, m.c cVar2) {
            f0Var.I(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.I) {
                if (recyclerView.f13030r0.b(f0Var, f0Var, cVar, cVar2)) {
                    RecyclerView.this.T0();
                }
            } else if (recyclerView.f13030r0.d(f0Var, cVar, cVar2)) {
                RecyclerView.this.T0();
            }
        }
    }

    public static abstract class d0 {
    }

    class e implements androidx.recyclerview.widget.f.b {
        e() {
        }

        @Override // androidx.recyclerview.widget.f.b
        public View a(int i15) {
            return RecyclerView.this.getChildAt(i15);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void b(View view) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (f0VarL0 != null) {
                f0VarL0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public f0 d(View view) {
            return RecyclerView.l0(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void e(int i15) {
            View viewA = a(i15);
            if (viewA != null) {
                f0 f0VarL0 = RecyclerView.l0(viewA);
                if (f0VarL0 != null) {
                    if (f0VarL0.z() && !f0VarL0.L()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + f0VarL0 + RecyclerView.this.V());
                    }
                    if (RecyclerView.f12998d1) {
                        f0VarL0.toString();
                    }
                    f0VarL0.b(256);
                }
            } else if (RecyclerView.f12997c1) {
                throw new IllegalArgumentException("No view at offset " + i15 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i15);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void f(View view, int i15) {
            RecyclerView.this.addView(view, i15);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void g() {
            int iC = c();
            for (int i15 = 0; i15 < iC; i15++) {
                View viewA = a(i15);
                RecyclerView.this.F(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(View view) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (f0VarL0 != null) {
                f0VarL0.E(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public void j(int i15) {
            View childAt = RecyclerView.this.getChildAt(i15);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i15);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void k(View view, int i15, ViewGroup.LayoutParams layoutParams) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (f0VarL0 != null) {
                if (!f0VarL0.z() && !f0VarL0.L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f0VarL0 + RecyclerView.this.V());
                }
                if (RecyclerView.f12998d1) {
                    f0VarL0.toString();
                }
                f0VarL0.f();
            } else if (RecyclerView.f12997c1) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i15 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i15, layoutParams);
        }
    }

    class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f13084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f13085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f13087f;

        e0() {
            Interpolator interpolator = RecyclerView.f13008n1;
            this.f13085d = interpolator;
            this.f13086e = false;
            this.f13087f = false;
            this.f13084c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i15, int i16) {
            int iAbs = Math.abs(i15);
            int iAbs2 = Math.abs(i16);
            boolean z15 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z15 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z15) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            l0.Z(RecyclerView.this, this);
        }

        public void b(int i15, int i16) {
            RecyclerView.this.setScrollState(2);
            this.f13083b = 0;
            this.f13082a = 0;
            Interpolator interpolator = this.f13085d;
            Interpolator interpolator2 = RecyclerView.f13008n1;
            if (interpolator != interpolator2) {
                this.f13085d = interpolator2;
                this.f13084c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f13084c.fling(0, 0, i15, i16, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f13086e) {
                this.f13087f = true;
            } else {
                c();
            }
        }

        public void e(int i15, int i16, int i17, Interpolator interpolator) {
            if (i17 == Integer.MIN_VALUE) {
                i17 = a(i15, i16);
            }
            int i18 = i17;
            if (interpolator == null) {
                interpolator = RecyclerView.f13008n1;
            }
            if (this.f13085d != interpolator) {
                this.f13085d = interpolator;
                this.f13084c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f13083b = 0;
            this.f13082a = 0;
            RecyclerView.this.setScrollState(2);
            this.f13084c.startScroll(0, 0, i15, i16, i18);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f13084c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i15;
            int i16;
            int i17;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f13026p == null) {
                f();
                return;
            }
            this.f13087f = false;
            this.f13086e = true;
            recyclerView.A();
            OverScroller overScroller = this.f13084c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i18 = currX - this.f13082a;
                int i19 = currY - this.f13083b;
                this.f13082a = currX;
                this.f13083b = currY;
                int iX = RecyclerView.this.x(i18);
                int iZ = RecyclerView.this.z(i19);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.V0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(iX, iZ, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.V0;
                    iX -= iArr2[0];
                    iZ -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(iX, iZ);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f13025n != null) {
                    int[] iArr3 = recyclerView3.V0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.p1(iX, iZ, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.V0;
                    int i25 = iArr4[0];
                    int i26 = iArr4[1];
                    iX -= i25;
                    iZ -= i26;
                    a0 a0Var = recyclerView4.f13026p.f13135g;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int iB = RecyclerView.this.J0.b();
                        if (iB == 0) {
                            a0Var.r();
                        } else if (a0Var.f() >= iB) {
                            a0Var.p(iB - 1);
                            a0Var.j(i25, i26);
                        } else {
                            a0Var.j(i25, i26);
                        }
                    }
                    i16 = i26;
                    i15 = i25;
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                int i27 = iX;
                int i28 = iZ;
                if (!RecyclerView.this.f13031s.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.V0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i15, i16, i27, i28, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.V0;
                int i29 = i27 - iArr6[0];
                int i35 = i28 - iArr6[1];
                if (i15 != 0 || i16 != 0) {
                    recyclerView6.O(i15, i16);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z15 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i29 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i35 != 0));
                a0 a0Var2 = RecyclerView.this.f13026p.f13135g;
                if ((a0Var2 == null || !a0Var2.g()) && z15) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i29 < 0) {
                            i17 = -currVelocity;
                        } else {
                            i17 = i29 > 0 ? currVelocity : 0;
                        }
                        if (i35 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i35 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i17, currVelocity);
                    }
                    if (RecyclerView.f13004j1) {
                        RecyclerView.this.I0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.j jVar = recyclerView7.H0;
                    if (jVar != null) {
                        jVar.f(recyclerView7, i15, i16);
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.f13026p.f13135g;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f13086e = false;
            if (this.f13087f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.E1(1);
            }
        }
    }

    class f implements androidx.recyclerview.widget.a.InterfaceC0276a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0276a
        public void a(int i15, int i16) {
            RecyclerView.this.J0(i15, i16);
            RecyclerView.this.M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0276a
        public void b(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0276a
        public void c(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0276a
        public void d(int i15, int i16) {
            RecyclerView.this.K0(i15, i16, false);
            RecyclerView.this.M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0276a
        public void e(int i15, int i16, Object obj) {
            RecyclerView.this.H1(i15, i16, obj);
            RecyclerView.this.N0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0276a
        public f0 f(int i15) {
            f0 f0VarF0 = RecyclerView.this.f0(i15, true);
            if (f0VarF0 == null) {
                return null;
            }
            if (!RecyclerView.this.f13017f.n(f0VarF0.f13091a)) {
                return f0VarF0;
            }
            boolean z15 = RecyclerView.f12997c1;
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0276a
        public void g(int i15, int i16) {
            RecyclerView.this.I0(i15, i16);
            RecyclerView.this.M0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0276a
        public void h(int i15, int i16) {
            RecyclerView.this.K0(i15, i16, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.M0 = true;
            recyclerView.J0.f13066d += i16;
        }

        void i(androidx.recyclerview.widget.a.b bVar) {
            int i15 = bVar.f13222a;
            if (i15 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f13026p.V0(recyclerView, bVar.f13223b, bVar.f13225d);
                return;
            }
            if (i15 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f13026p.Y0(recyclerView2, bVar.f13223b, bVar.f13225d);
            } else if (i15 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f13026p.a1(recyclerView3, bVar.f13223b, bVar.f13225d, bVar.f13224c);
            } else {
                if (i15 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f13026p.X0(recyclerView4, bVar.f13223b, bVar.f13225d, 1);
            }
        }
    }

    public static abstract class f0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final List<Object> f13090t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f13091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<RecyclerView> f13092b;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f13100j;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        RecyclerView f13108r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        h<? extends f0> f13109s;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13093c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13094d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f13095e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13096f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f13097g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        f0 f13098h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        f0 f13099i = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        List<Object> f13101k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List<Object> f13102l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f13103m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        w f13104n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f13105o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f13106p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13107q = -1;

        public f0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f13091a = view;
        }

        private void g() {
            if (this.f13101k == null) {
                ArrayList arrayList = new ArrayList();
                this.f13101k = arrayList;
                this.f13102l = Collections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.f13100j & 2) != 0;
        }

        boolean B() {
            return (this.f13100j & 2) != 0;
        }

        void C(int i15, boolean z15) {
            if (this.f13094d == -1) {
                this.f13094d = this.f13093c;
            }
            if (this.f13097g == -1) {
                this.f13097g = this.f13093c;
            }
            if (z15) {
                this.f13097g += i15;
            }
            this.f13093c += i15;
            if (this.f13091a.getLayoutParams() != null) {
                ((q) this.f13091a.getLayoutParams()).f13155c = true;
            }
        }

        void D(RecyclerView recyclerView) {
            int i15 = this.f13107q;
            if (i15 != -1) {
                this.f13106p = i15;
            } else {
                this.f13106p = l0.w(this.f13091a);
            }
            recyclerView.s1(this, 4);
        }

        void E(RecyclerView recyclerView) {
            recyclerView.s1(this, this.f13106p);
            this.f13106p = 0;
        }

        void F() {
            if (RecyclerView.f12997c1 && z()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f13100j = 0;
            this.f13093c = -1;
            this.f13094d = -1;
            this.f13095e = -1L;
            this.f13097g = -1;
            this.f13103m = 0;
            this.f13098h = null;
            this.f13099i = null;
            d();
            this.f13106p = 0;
            this.f13107q = -1;
            RecyclerView.u(this);
        }

        void G() {
            if (this.f13094d == -1) {
                this.f13094d = this.f13093c;
            }
        }

        void H(int i15, int i16) {
            this.f13100j = (i15 & i16) | (this.f13100j & (~i16));
        }

        public final void I(boolean z15) {
            int i15 = this.f13103m;
            int i16 = z15 ? i15 - 1 : i15 + 1;
            this.f13103m = i16;
            if (i16 < 0) {
                this.f13103m = 0;
                if (RecyclerView.f12997c1) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                c2.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z15 && i16 == 1) {
                this.f13100j |= 16;
            } else if (z15 && i16 == 0) {
                this.f13100j &= -17;
            }
            if (RecyclerView.f12998d1) {
                toString();
            }
        }

        void J(w wVar, boolean z15) {
            this.f13104n = wVar;
            this.f13105o = z15;
        }

        boolean K() {
            return (this.f13100j & 16) != 0;
        }

        boolean L() {
            return (this.f13100j & 128) != 0;
        }

        void M() {
            this.f13104n.O(this);
        }

        boolean N() {
            return (this.f13100j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f13100j) == 0) {
                g();
                this.f13101k.add(obj);
            }
        }

        void b(int i15) {
            this.f13100j = i15 | this.f13100j;
        }

        void c() {
            this.f13094d = -1;
            this.f13097g = -1;
        }

        void d() {
            List<Object> list = this.f13101k;
            if (list != null) {
                list.clear();
            }
            this.f13100j &= -1025;
        }

        void e() {
            this.f13100j &= -33;
        }

        void f() {
            this.f13100j &= -257;
        }

        boolean h() {
            return (this.f13100j & 16) == 0 && l0.K(this.f13091a);
        }

        void i(int i15, int i16, boolean z15) {
            b(8);
            C(i16, z15);
            this.f13093c = i15;
        }

        public final int j() {
            RecyclerView recyclerView = this.f13108r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.h0(this);
        }

        @Deprecated
        public final int k() {
            return l();
        }

        public final int l() {
            RecyclerView recyclerView;
            h adapter;
            int iH0;
            if (this.f13109s == null || (recyclerView = this.f13108r) == null || (adapter = recyclerView.getAdapter()) == null || (iH0 = this.f13108r.h0(this)) == -1) {
                return -1;
            }
            return adapter.f(this.f13109s, this, iH0);
        }

        public final long m() {
            return this.f13095e;
        }

        public final int n() {
            return this.f13096f;
        }

        public final int o() {
            int i15 = this.f13097g;
            return i15 == -1 ? this.f13093c : i15;
        }

        public final int p() {
            return this.f13094d;
        }

        List<Object> q() {
            if ((this.f13100j & 1024) != 0) {
                return f13090t;
            }
            List<Object> list = this.f13101k;
            return (list == null || list.size() == 0) ? f13090t : this.f13102l;
        }

        boolean r(int i15) {
            return (i15 & this.f13100j) != 0;
        }

        boolean s() {
            return (this.f13100j & 512) != 0 || v();
        }

        boolean t() {
            return (this.f13091a.getParent() == null || this.f13091a.getParent() == this.f13108r) ? false : true;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f13093c + " id=" + this.f13095e + ", oldPos=" + this.f13094d + ", pLpos:" + this.f13097g);
            if (y()) {
                sb5.append(" scrap ");
                sb5.append(this.f13105o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (v()) {
                sb5.append(" invalid");
            }
            if (!u()) {
                sb5.append(" unbound");
            }
            if (B()) {
                sb5.append(" update");
            }
            if (x()) {
                sb5.append(" removed");
            }
            if (L()) {
                sb5.append(" ignored");
            }
            if (z()) {
                sb5.append(" tmpDetached");
            }
            if (!w()) {
                sb5.append(" not recyclable(" + this.f13103m + ")");
            }
            if (s()) {
                sb5.append(" undefined adapter position");
            }
            if (this.f13091a.getParent() == null) {
                sb5.append(" no parent");
            }
            sb5.append("}");
            return sb5.toString();
        }

        boolean u() {
            return (this.f13100j & 1) != 0;
        }

        boolean v() {
            return (this.f13100j & 4) != 0;
        }

        public final boolean w() {
            return (this.f13100j & 16) == 0 && !l0.K(this.f13091a);
        }

        boolean x() {
            return (this.f13100j & 8) != 0;
        }

        boolean y() {
            return this.f13104n != null;
        }

        boolean z() {
            return (this.f13100j & 256) != 0;
        }
    }

    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13110a;

        static {
            int[] iArr = new int[h.a.values().length];
            f13110a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13110a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h<VH extends f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f13111a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f13112b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f13113c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public void A(boolean z15) {
            if (j()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f13112b = z15;
        }

        public void B(j jVar) {
            this.f13111a.unregisterObserver(jVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(VH vh4, int i15) {
            boolean z15 = vh4.f13109s == null;
            if (z15) {
                vh4.f13093c = i15;
                if (k()) {
                    vh4.f13095e = h(i15);
                }
                vh4.H(1, 519);
                e6.l.a("RV OnBindView");
            }
            vh4.f13109s = this;
            if (RecyclerView.f12997c1) {
                if (vh4.f13091a.getParent() == null && l0.M(vh4.f13091a) != vh4.z()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh4.z() + ", attached to window: " + l0.M(vh4.f13091a) + ", holder: " + vh4);
                }
                if (vh4.f13091a.getParent() == null && l0.M(vh4.f13091a)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh4);
                }
            }
            s(vh4, i15, vh4.q());
            if (z15) {
                vh4.d();
                ViewGroup.LayoutParams layoutParams = vh4.f13091a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f13155c = true;
                }
                e6.l.b();
            }
        }

        boolean d() {
            int i15 = g.f13110a[this.f13113c.ordinal()];
            return i15 != 1 && (i15 != 2 || g() > 0);
        }

        public final VH e(ViewGroup viewGroup, int i15) {
            try {
                e6.l.a("RV CreateView");
                VH vh4 = (VH) t(viewGroup, i15);
                if (vh4.f13091a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh4.f13096f = i15;
                e6.l.b();
                return vh4;
            } catch (Throwable th4) {
                e6.l.b();
                throw th4;
            }
        }

        public int f(h<? extends f0> hVar, f0 f0Var, int i15) {
            if (hVar == this) {
                return i15;
            }
            return -1;
        }

        public abstract int g();

        public long h(int i15) {
            return -1L;
        }

        public int i(int i15) {
            return 0;
        }

        public final boolean j() {
            return this.f13111a.a();
        }

        public final boolean k() {
            return this.f13112b;
        }

        public final void l() {
            this.f13111a.b();
        }

        public final void m(int i15, int i16) {
            this.f13111a.c(i15, i16);
        }

        public final void n(int i15, int i16, Object obj) {
            this.f13111a.d(i15, i16, obj);
        }

        public final void o(int i15, int i16) {
            this.f13111a.e(i15, i16);
        }

        public final void p(int i15, int i16) {
            this.f13111a.f(i15, i16);
        }

        public void q(RecyclerView recyclerView) {
        }

        public abstract void r(VH vh4, int i15);

        public void s(VH vh4, int i15, List<Object> list) {
            r(vh4, i15);
        }

        public abstract VH t(ViewGroup viewGroup, int i15);

        public void u(RecyclerView recyclerView) {
        }

        public boolean v(VH vh4) {
            return false;
        }

        public void w(VH vh4) {
        }

        public void x(VH vh4) {
        }

        public void y(VH vh4) {
        }

        public void z(j jVar) {
            this.f13111a.registerObserver(jVar);
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i15, int i16) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i15, i16, 1);
            }
        }

        public void d(int i15, int i16, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i15, i16, obj);
            }
        }

        public void e(int i15, int i16) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i15, i16);
            }
        }

        public void f(int i15, int i16) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i15, i16);
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i15, int i16) {
        }

        public void c(int i15, int i16, Object obj) {
            b(i15, i16);
        }

        public void d(int i15, int i16) {
        }

        public void e(int i15, int i16, int i17) {
        }

        public void f(int i15, int i16) {
        }
    }

    public interface k {
    }

    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i15) {
            throw null;
        }
    }

    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f13118a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<a> f13119b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f13120c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f13121d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f13122e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f13123f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(f0 f0Var);
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13124a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13125b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f13126c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f13127d;

            public c a(f0 f0Var) {
                return b(f0Var, 0);
            }

            public c b(f0 f0Var, int i15) {
                View view = f0Var.f13091a;
                this.f13124a = view.getLeft();
                this.f13125b = view.getTop();
                this.f13126c = view.getRight();
                this.f13127d = view.getBottom();
                return this;
            }
        }

        static int e(f0 f0Var) {
            int i15 = f0Var.f13100j;
            int i16 = i15 & 14;
            if (f0Var.v()) {
                return 4;
            }
            if ((i15 & 4) == 0) {
                int iP = f0Var.p();
                int iJ = f0Var.j();
                if (iP != -1 && iJ != -1 && iP != iJ) {
                    return i16 | 2048;
                }
            }
            return i16;
        }

        public abstract boolean a(f0 f0Var, c cVar, c cVar2);

        public abstract boolean b(f0 f0Var, f0 f0Var2, c cVar, c cVar2);

        public abstract boolean c(f0 f0Var, c cVar, c cVar2);

        public abstract boolean d(f0 f0Var, c cVar, c cVar2);

        public abstract boolean f(f0 f0Var);

        public boolean g(f0 f0Var, List<Object> list) {
            return f(f0Var);
        }

        public final void h(f0 f0Var) {
            r(f0Var);
            b bVar = this.f13118a;
            if (bVar != null) {
                bVar.a(f0Var);
            }
        }

        public final void i() {
            int size = this.f13119b.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.f13119b.get(i15).a();
            }
            this.f13119b.clear();
        }

        public abstract void j(f0 f0Var);

        public abstract void k();

        public long l() {
            return this.f13120c;
        }

        public long m() {
            return this.f13123f;
        }

        public long n() {
            return this.f13122e;
        }

        public long o() {
            return this.f13121d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(f0 f0Var) {
        }

        public c s(b0 b0Var, f0 f0Var) {
            return q().a(f0Var);
        }

        public c t(b0 b0Var, f0 f0Var, int i15, List<Object> list) {
            return q().a(f0Var);
        }

        public abstract void u();

        void v(b bVar) {
            this.f13118a = bVar;
        }
    }

    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(f0 f0Var) {
            f0Var.I(true);
            if (f0Var.f13098h != null && f0Var.f13099i == null) {
                f0Var.f13098h = null;
            }
            f0Var.f13099i = null;
            if (f0Var.K() || RecyclerView.this.e1(f0Var.f13091a) || !f0Var.z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.f13091a, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void d(Rect rect, int i15, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.f f13129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f13130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.recyclerview.widget.v.b f13131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.recyclerview.widget.v.b f13132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.v f13133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.v f13134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        a0 f13135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f13136h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f13137i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13138j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f13139k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f13140l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13141m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f13142n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f13143o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f13144p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f13145q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f13146r;

        class a implements androidx.recyclerview.widget.v.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i15) {
                return p.this.N(i15);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b(View view) {
                return p.this.V(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return p.this.i0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d() {
                return p.this.s0() - p.this.j0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return p.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements androidx.recyclerview.widget.v.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i15) {
                return p.this.N(i15);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b(View view) {
                return p.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return p.this.k0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d() {
                return p.this.b0() - p.this.h0();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i15, int i16);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13149a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13150b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f13151c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f13152d;
        }

        public p() {
            a aVar = new a();
            this.f13131c = aVar;
            b bVar = new b();
            this.f13132d = bVar;
            this.f13133e = new androidx.recyclerview.widget.v(aVar);
            this.f13134f = new androidx.recyclerview.widget.v(bVar);
            this.f13136h = false;
            this.f13137i = false;
            this.f13138j = false;
            this.f13139k = true;
            this.f13140l = true;
        }

        private static boolean A0(int i15, int i16, int i17) {
            int mode = View.MeasureSpec.getMode(i16);
            int size = View.MeasureSpec.getSize(i16);
            if (i17 > 0 && i15 != i17) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i15;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i15;
            }
            return true;
        }

        private void D(int i15, View view) {
            this.f13129a.d(i15);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int P(int i15, int i16, int i17, int i18, boolean z15) {
            int iMax = Math.max(0, i15 - i17);
            if (z15) {
                if (i18 >= 0) {
                    i16 = 1073741824;
                } else if (i18 != -1 || (i16 != Integer.MIN_VALUE && (i16 == 0 || i16 != 1073741824))) {
                    i16 = 0;
                    i18 = 0;
                } else {
                    i18 = iMax;
                }
            } else if (i18 >= 0) {
                i16 = 1073741824;
            } else if (i18 == -1) {
                i18 = iMax;
            } else if (i18 != -2) {
                i16 = 0;
                i18 = 0;
            } else if (i16 == Integer.MIN_VALUE || i16 == 1073741824) {
                i18 = iMax;
                i16 = Integer.MIN_VALUE;
            } else {
                i18 = iMax;
                i16 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i18, i16);
        }

        private int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i15 = left - iI0;
            int iMin = Math.min(0, i15);
            int i16 = top - iK0;
            int iMin2 = Math.min(0, i16);
            int i17 = iWidth - iS0;
            int iMax = Math.max(0, i17);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i15, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i17);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i16, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void k(View view, int i15, boolean z15) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (z15 || f0VarL0.x()) {
                this.f13130b.f13018g.b(f0VarL0);
            } else {
                this.f13130b.f13018g.p(f0VarL0);
            }
            q qVar = (q) view.getLayoutParams();
            if (f0VarL0.N() || f0VarL0.y()) {
                if (f0VarL0.y()) {
                    f0VarL0.M();
                } else {
                    f0VarL0.e();
                }
                this.f13129a.c(view, i15, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f13130b) {
                int iM = this.f13129a.m(view);
                if (i15 == -1) {
                    i15 = this.f13129a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f13130b.indexOfChild(view) + this.f13130b.V());
                }
                if (iM != i15) {
                    this.f13130b.f13026p.F0(iM, i15);
                }
            } else {
                this.f13129a.a(view, i15, false);
                qVar.f13155c = true;
                a0 a0Var = this.f13135g;
                if (a0Var != null && a0Var.h()) {
                    this.f13135g.k(view);
                }
            }
            if (qVar.f13156d) {
                if (RecyclerView.f12998d1) {
                    Objects.toString(qVar.f13153a);
                }
                f0VarL0.f13091a.invalidate();
                qVar.f13156d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i15, int i16) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, na.c.f133680a, i15, i16);
            dVar.f13149a = typedArrayObtainStyledAttributes.getInt(na.c.f133681b, 1);
            dVar.f13150b = typedArrayObtainStyledAttributes.getInt(na.c.f133691l, 1);
            dVar.f13151c = typedArrayObtainStyledAttributes.getBoolean(na.c.f133690k, false);
            dVar.f13152d = typedArrayObtainStyledAttributes.getBoolean(na.c.f133692m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i15, int i16, int i17) {
            int mode = View.MeasureSpec.getMode(i15);
            int size = View.MeasureSpec.getSize(i15);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i16, i17) : size;
            }
            return Math.min(size, Math.max(i16, i17));
        }

        private boolean x0(RecyclerView recyclerView, int i15, int i16) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.f13130b.f13022k;
            U(focusedChild, rect);
            return rect.left - i15 < iS0 && rect.right - i15 > iI0 && rect.top - i16 < iB0 && rect.bottom - i16 > iK0;
        }

        private void z1(w wVar, int i15, View view) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (f0VarL0.L()) {
                if (RecyclerView.f12998d1) {
                    f0VarL0.toString();
                }
            } else if (f0VarL0.v() && !f0VarL0.x() && !this.f13130b.f13025n.k()) {
                u1(i15);
                wVar.H(f0VarL0);
            } else {
                C(i15);
                wVar.I(view);
                this.f13130b.f13018g.k(f0VarL0);
            }
        }

        public int A(b0 b0Var) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int A1(int i15, w wVar, b0 b0Var) {
            return 0;
        }

        public void B(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                z1(wVar, iO, N(iO));
            }
        }

        public boolean B0() {
            a0 a0Var = this.f13135g;
            return a0Var != null && a0Var.h();
        }

        public void B1(int i15) {
            if (RecyclerView.f12998d1) {
                c2.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public void C(int i15) {
            D(i15, N(i15));
        }

        public boolean C0(View view, boolean z15, boolean z16) {
            boolean z17 = this.f13133e.b(view, 24579) && this.f13134f.b(view, 24579);
            return z15 ? z17 : !z17;
        }

        @SuppressLint({"UnknownNullness"})
        public int C1(int i15, w wVar, b0 b0Var) {
            return 0;
        }

        public void D0(View view, int i15, int i16, int i17, int i18) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f13154b;
            view.layout(i15 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i16 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i17 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i18 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void D1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void E(RecyclerView recyclerView) {
            this.f13137i = true;
            K0(recyclerView);
        }

        public void E0(View view, int i15, int i16) {
            q qVar = (q) view.getLayoutParams();
            Rect rectP0 = this.f13130b.p0(view);
            int i17 = i15 + rectP0.left + rectP0.right;
            int i18 = i16 + rectP0.top + rectP0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i17, ((ViewGroup.MarginLayoutParams) qVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i18, ((ViewGroup.MarginLayoutParams) qVar).height, q());
            if (J1(view, iP, iP2, qVar)) {
                view.measure(iP, iP2);
            }
        }

        void E1(int i15, int i16) {
            this.f13145q = View.MeasureSpec.getSize(i15);
            int mode = View.MeasureSpec.getMode(i15);
            this.f13143o = mode;
            if (mode == 0 && !RecyclerView.f13002h1) {
                this.f13145q = 0;
            }
            this.f13146r = View.MeasureSpec.getSize(i16);
            int mode2 = View.MeasureSpec.getMode(i16);
            this.f13144p = mode2;
            if (mode2 != 0 || RecyclerView.f13002h1) {
                return;
            }
            this.f13146r = 0;
        }

        void F(RecyclerView recyclerView, w wVar) {
            this.f13137i = false;
            M0(recyclerView, wVar);
        }

        public void F0(int i15, int i16) {
            View viewN = N(i15);
            if (viewN != null) {
                C(i15);
                m(viewN, i16);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i15 + this.f13130b.toString());
            }
        }

        public void F1(int i15, int i16) {
            this.f13130b.setMeasuredDimension(i15, i16);
        }

        public View G(View view) {
            View viewX;
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView == null || (viewX = recyclerView.X(view)) == null || this.f13129a.n(viewX)) {
                return null;
            }
            return viewX;
        }

        public void G0(int i15) {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                recyclerView.G0(i15);
            }
        }

        public void G1(Rect rect, int i15, int i16) {
            F1(s(i15, rect.width() + i0() + j0(), g0()), s(i16, rect.height() + k0() + h0(), f0()));
        }

        public View H(int i15) {
            int iO = O();
            for (int i16 = 0; i16 < iO; i16++) {
                View viewN = N(i16);
                f0 f0VarL0 = RecyclerView.l0(viewN);
                if (f0VarL0 != null && f0VarL0.o() == i15 && !f0VarL0.L() && (this.f13130b.J0.e() || !f0VarL0.x())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i15) {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                recyclerView.H0(i15);
            }
        }

        void H1(int i15, int i16) {
            int iO = O();
            if (iO == 0) {
                this.f13130b.C(i15, i16);
                return;
            }
            int i17 = PKIFailureInfo.systemUnavail;
            int i18 = Integer.MAX_VALUE;
            int i19 = Integer.MIN_VALUE;
            int i25 = Integer.MAX_VALUE;
            for (int i26 = 0; i26 < iO; i26++) {
                View viewN = N(i26);
                Rect rect = this.f13130b.f13022k;
                U(viewN, rect);
                int i27 = rect.left;
                if (i27 < i25) {
                    i25 = i27;
                }
                int i28 = rect.right;
                if (i28 > i17) {
                    i17 = i28;
                }
                int i29 = rect.top;
                if (i29 < i18) {
                    i18 = i29;
                }
                int i35 = rect.bottom;
                if (i35 > i19) {
                    i19 = i35;
                }
            }
            this.f13130b.f13022k.set(i25, i18, i17, i19);
            G1(this.f13130b.f13022k, i15, i16);
        }

        @SuppressLint({"UnknownNullness"})
        public abstract q I();

        public void I0(h hVar, h hVar2) {
        }

        void I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f13130b = null;
                this.f13129a = null;
                this.f13145q = 0;
                this.f13146r = 0;
            } else {
                this.f13130b = recyclerView;
                this.f13129a = recyclerView.f13017f;
                this.f13145q = recyclerView.getWidth();
                this.f13146r = recyclerView.getHeight();
            }
            this.f13143o = 1073741824;
            this.f13144p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public q J(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean J0(RecyclerView recyclerView, ArrayList<View> arrayList, int i15, int i16) {
            return false;
        }

        boolean J1(View view, int i15, int i16, q qVar) {
            return (!view.isLayoutRequested() && this.f13139k && A0(view.getWidth(), i15, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getHeight(), i16, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public q K(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void K0(RecyclerView recyclerView) {
        }

        boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        @Deprecated
        public void L0(RecyclerView recyclerView) {
        }

        boolean L1(View view, int i15, int i16, q qVar) {
            return (this.f13139k && A0(view.getMeasuredWidth(), i15, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getMeasuredHeight(), i16, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((q) view.getLayoutParams()).f13154b.bottom;
        }

        @SuppressLint({"UnknownNullness"})
        public void M0(RecyclerView recyclerView, w wVar) {
            L0(recyclerView);
        }

        @SuppressLint({"UnknownNullness"})
        public void M1(RecyclerView recyclerView, b0 b0Var, int i15) {
            c2.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public View N(int i15) {
            androidx.recyclerview.widget.f fVar = this.f13129a;
            if (fVar != null) {
                return fVar.f(i15);
            }
            return null;
        }

        public View N0(View view, int i15, w wVar, b0 b0Var) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void N1(a0 a0Var) {
            a0 a0Var2 = this.f13135g;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.f13135g.r();
            }
            this.f13135g = a0Var;
            a0Var.q(this.f13130b, this);
        }

        public int O() {
            androidx.recyclerview.widget.f fVar = this.f13129a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public void O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f13130b;
            P0(recyclerView.f13014c, recyclerView.J0, accessibilityEvent);
        }

        void O1() {
            a0 a0Var = this.f13135g;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public void P0(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z15 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f13130b.canScrollVertically(-1) && !this.f13130b.canScrollHorizontally(-1) && !this.f13130b.canScrollHorizontally(1)) {
                z15 = false;
            }
            accessibilityEvent.setScrollable(z15);
            h hVar = this.f13130b.f13025n;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.g());
            }
        }

        public boolean P1() {
            return false;
        }

        public void Q0(w wVar, b0 b0Var, k6.p pVar) {
            if (this.f13130b.canScrollVertically(-1) || this.f13130b.canScrollHorizontally(-1)) {
                pVar.a(PKIFailureInfo.certRevoked);
                pVar.Q0(true);
            }
            if (this.f13130b.canScrollVertically(1) || this.f13130b.canScrollHorizontally(1)) {
                pVar.a(PKIFailureInfo.certConfirmed);
                pVar.Q0(true);
            }
            pVar.q0(k6.p.f.a(o0(wVar, b0Var), S(wVar, b0Var), z0(wVar, b0Var), p0(wVar, b0Var)));
        }

        public boolean R() {
            RecyclerView recyclerView = this.f13130b;
            return recyclerView != null && recyclerView.f13019h;
        }

        void R0(k6.p pVar) {
            RecyclerView recyclerView = this.f13130b;
            Q0(recyclerView.f13014c, recyclerView.J0, pVar);
        }

        public int S(w wVar, b0 b0Var) {
            return -1;
        }

        void S0(View view, k6.p pVar) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (f0VarL0 == null || f0VarL0.x() || this.f13129a.n(f0VarL0.f13091a)) {
                return;
            }
            RecyclerView recyclerView = this.f13130b;
            T0(recyclerView.f13014c, recyclerView.J0, view, pVar);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void T0(w wVar, b0 b0Var, View view, k6.p pVar) {
        }

        public void U(View view, Rect rect) {
            RecyclerView.m0(view, rect);
        }

        public View U0(View view, int i15) {
            return null;
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(RecyclerView recyclerView, int i15, int i16) {
        }

        public int W(View view) {
            Rect rect = ((q) view.getLayoutParams()).f13154b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(RecyclerView recyclerView) {
        }

        public int X(View view) {
            Rect rect = ((q) view.getLayoutParams()).f13154b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i15, int i16, int i17) {
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(RecyclerView recyclerView, int i15, int i16) {
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(RecyclerView recyclerView, int i15, int i16) {
        }

        public int a() {
            RecyclerView recyclerView = this.f13130b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.g();
            }
            return 0;
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f13129a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i15, int i16, Object obj) {
            Z0(recyclerView, i15, i16);
        }

        public int b0() {
            return this.f13146r;
        }

        @SuppressLint({"UnknownNullness"})
        public void b1(w wVar, b0 b0Var) {
            c2.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int c0() {
            return this.f13144p;
        }

        @SuppressLint({"UnknownNullness"})
        public void c1(b0 b0Var) {
        }

        public int d0() {
            return l0.y(this.f13130b);
        }

        public void d1(w wVar, b0 b0Var, int i15, int i16) {
            this.f13130b.C(i15, i16);
        }

        public int e0(View view) {
            return ((q) view.getLayoutParams()).f13154b.left;
        }

        @Deprecated
        public boolean e1(RecyclerView recyclerView, View view, View view2) {
            return B0() || recyclerView.A0();
        }

        @SuppressLint({"UnknownNullness"})
        public void f(View view) {
            h(view, -1);
        }

        public int f0() {
            return l0.z(this.f13130b);
        }

        public boolean f1(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return e1(recyclerView, view, view2);
        }

        public int g0() {
            return l0.A(this.f13130b);
        }

        @SuppressLint({"UnknownNullness"})
        public void g1(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        public void h(View view, int i15) {
            k(view, i15, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable h1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void i1(int i15) {
        }

        @SuppressLint({"UnknownNullness"})
        public void j(View view, int i15) {
            k(view, i15, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void j1(a0 a0Var) {
            if (this.f13135g == a0Var) {
                this.f13135g = null;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean k1(int i15, Bundle bundle) {
            RecyclerView recyclerView = this.f13130b;
            return l1(recyclerView.f13014c, recyclerView.J0, i15, bundle);
        }

        @SuppressLint({"UnknownNullness"})
        public void l(String str) {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int l0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
          0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean l1(w wVar, b0 b0Var, int i15, Bundle bundle) {
            int iK0;
            int iI0;
            int i16;
            int i17;
            if (this.f13130b == null) {
                return false;
            }
            int iB0 = b0();
            int iS0 = s0();
            Rect rect = new Rect();
            if (this.f13130b.getMatrix().isIdentity() && this.f13130b.getGlobalVisibleRect(rect)) {
                iB0 = rect.height();
                iS0 = rect.width();
            }
            if (i15 == 4096) {
                iK0 = this.f13130b.canScrollVertically(1) ? (iB0 - k0()) - h0() : 0;
                if (this.f13130b.canScrollHorizontally(1)) {
                    iI0 = (iS0 - i0()) - j0();
                    i16 = iK0;
                    i17 = iI0;
                } else {
                    i16 = iK0;
                    i17 = 0;
                }
            } else if (i15 != 8192) {
                i17 = 0;
                i16 = 0;
            } else {
                iK0 = this.f13130b.canScrollVertically(-1) ? -((iB0 - k0()) - h0()) : 0;
                if (this.f13130b.canScrollHorizontally(-1)) {
                    iI0 = -((iS0 - i0()) - j0());
                    i16 = iK0;
                    i17 = iI0;
                } else {
                    i16 = iK0;
                    i17 = 0;
                }
            }
            if (i16 == 0 && i17 == 0) {
                return false;
            }
            this.f13130b.y1(i17, i16, null, PKIFailureInfo.systemUnavail, true);
            return true;
        }

        public void m(View view, int i15) {
            n(view, i15, (q) view.getLayoutParams());
        }

        boolean m1(View view, int i15, Bundle bundle) {
            RecyclerView recyclerView = this.f13130b;
            return n1(recyclerView.f13014c, recyclerView.J0, view, i15, bundle);
        }

        public void n(View view, int i15, q qVar) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (f0VarL0.x()) {
                this.f13130b.f13018g.b(f0VarL0);
            } else {
                this.f13130b.f13018g.p(f0VarL0);
            }
            this.f13129a.c(view, i15, qVar, f0VarL0.x());
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).f13154b.right;
        }

        public boolean n1(w wVar, b0 b0Var, View view, int i15, Bundle bundle) {
            return false;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.p0(view));
            }
        }

        public int o0(w wVar, b0 b0Var) {
            return -1;
        }

        public void o1(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.l0(N(iO)).L()) {
                    r1(iO, wVar);
                }
            }
        }

        public boolean p() {
            return false;
        }

        public int p0(w wVar, b0 b0Var) {
            return 0;
        }

        void p1(w wVar) {
            int iJ = wVar.j();
            for (int i15 = iJ - 1; i15 >= 0; i15--) {
                View viewN = wVar.n(i15);
                f0 f0VarL0 = RecyclerView.l0(viewN);
                if (!f0VarL0.L()) {
                    f0VarL0.I(false);
                    if (f0VarL0.z()) {
                        this.f13130b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.f13130b.f13030r0;
                    if (mVar != null) {
                        mVar.j(f0VarL0);
                    }
                    f0VarL0.I(true);
                    wVar.D(viewN);
                }
            }
            wVar.e();
            if (iJ > 0) {
                this.f13130b.invalidate();
            }
        }

        public boolean q() {
            return false;
        }

        public int q0(View view) {
            return ((q) view.getLayoutParams()).f13154b.top;
        }

        public void q1(View view, w wVar) {
            t1(view);
            wVar.G(view);
        }

        public boolean r(q qVar) {
            return qVar != null;
        }

        public void r0(View view, boolean z15, Rect rect) {
            Matrix matrix;
            if (z15) {
                Rect rect2 = ((q) view.getLayoutParams()).f13154b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f13130b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f13130b.f13024m;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i15, w wVar) {
            View viewN = N(i15);
            u1(i15);
            wVar.G(viewN);
        }

        public int s0() {
            return this.f13145q;
        }

        public boolean s1(Runnable runnable) {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void t(int i15, int i16, b0 b0Var, c cVar) {
        }

        public int t0() {
            return this.f13143o;
        }

        @SuppressLint({"UnknownNullness"})
        public void t1(View view) {
            this.f13129a.p(view);
        }

        @SuppressLint({"UnknownNullness"})
        public void u(int i15, c cVar) {
        }

        boolean u0() {
            int iO = O();
            for (int i15 = 0; i15 < iO; i15++) {
                ViewGroup.LayoutParams layoutParams = N(i15).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i15) {
            if (N(i15) != null) {
                this.f13129a.q(i15);
            }
        }

        public int v(b0 b0Var) {
            return 0;
        }

        public boolean v0() {
            return this.f13137i;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z15) {
            return w1(recyclerView, view, rect, z15, false);
        }

        public int w(b0 b0Var) {
            return 0;
        }

        public boolean w0() {
            return this.f13138j;
        }

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z15, boolean z16) {
            int[] iArrQ = Q(view, rect);
            int i15 = iArrQ[0];
            int i16 = iArrQ[1];
            if ((z16 && !x0(recyclerView, i15, i16)) || (i15 == 0 && i16 == 0)) {
                return false;
            }
            if (z15) {
                recyclerView.scrollBy(i15, i16);
            } else {
                recyclerView.v1(i15, i16);
            }
            return true;
        }

        public int x(b0 b0Var) {
            return 0;
        }

        public void x1() {
            RecyclerView recyclerView = this.f13130b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int y(b0 b0Var) {
            return 0;
        }

        public final boolean y0() {
            return this.f13140l;
        }

        public void y1() {
            this.f13136h = true;
        }

        public int z(b0 b0Var) {
            return 0;
        }

        public boolean z0(w wVar, b0 b0Var) {
            return false;
        }
    }

    public interface r {
        void a(View view);

        void b(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i15, int i16);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z15);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i15) {
        }

        public void b(RecyclerView recyclerView, int i15, int i16) {
        }
    }

    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<a> f13157a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13158b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Set<h<?>> f13159c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList<f0> f13160a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f13161b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f13162c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f13163d = 0;

            a() {
            }
        }

        private a i(int i15) {
            a aVar = this.f13157a.get(i15);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f13157a.put(i15, aVar2);
            return aVar2;
        }

        void a() {
            this.f13158b++;
        }

        void b(h<?> hVar) {
            this.f13159c.add(hVar);
        }

        public void c() {
            for (int i15 = 0; i15 < this.f13157a.size(); i15++) {
                a aVarValueAt = this.f13157a.valueAt(i15);
                Iterator<f0> it = aVarValueAt.f13160a.iterator();
                while (it.hasNext()) {
                    q6.a.b(it.next().f13091a);
                }
                aVarValueAt.f13160a.clear();
            }
        }

        void d() {
            this.f13158b--;
        }

        void e(h<?> hVar, boolean z15) {
            this.f13159c.remove(hVar);
            if (this.f13159c.size() != 0 || z15) {
                return;
            }
            for (int i15 = 0; i15 < this.f13157a.size(); i15++) {
                SparseArray<a> sparseArray = this.f13157a;
                ArrayList<f0> arrayList = sparseArray.get(sparseArray.keyAt(i15)).f13160a;
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    q6.a.b(arrayList.get(i16).f13091a);
                }
            }
        }

        void f(int i15, long j15) {
            a aVarI = i(i15);
            aVarI.f13163d = l(aVarI.f13163d, j15);
        }

        void g(int i15, long j15) {
            a aVarI = i(i15);
            aVarI.f13162c = l(aVarI.f13162c, j15);
        }

        public f0 h(int i15) {
            a aVar = this.f13157a.get(i15);
            if (aVar == null || aVar.f13160a.isEmpty()) {
                return null;
            }
            ArrayList<f0> arrayList = aVar.f13160a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).t()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h<?> hVar, h<?> hVar2, boolean z15) {
            if (hVar != null) {
                d();
            }
            if (!z15 && this.f13158b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(f0 f0Var) {
            int iN = f0Var.n();
            ArrayList<f0> arrayList = i(iN).f13160a;
            if (this.f13157a.get(iN).f13161b <= arrayList.size()) {
                q6.a.b(f0Var.f13091a);
            } else {
                if (RecyclerView.f12997c1 && arrayList.contains(f0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f0Var.F();
                arrayList.add(f0Var);
            }
        }

        long l(long j15, long j16) {
            return j15 == 0 ? j16 : ((j15 / 4) * 3) + (j16 / 4);
        }

        boolean m(int i15, long j15, long j16) {
            long j17 = i(i15).f13163d;
            return j17 == 0 || j15 + j17 < j16;
        }

        boolean n(int i15, long j15, long j16) {
            long j17 = i(i15).f13162c;
            return j17 == 0 || j15 + j17 < j16;
        }
    }

    public final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<f0> f13164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<f0> f13165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f0> f13166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<f0> f13167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f13168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        v f13170g;

        public w() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.f13164a = arrayList;
            this.f13165b = null;
            this.f13166c = new ArrayList<>();
            this.f13167d = Collections.unmodifiableList(arrayList);
            this.f13168e = 2;
            this.f13169f = 2;
        }

        private void B(h<?> hVar) {
            C(hVar, false);
        }

        private void C(h<?> hVar, boolean z15) {
            v vVar = this.f13170g;
            if (vVar != null) {
                vVar.e(hVar, z15);
            }
        }

        private boolean M(f0 f0Var, int i15, int i16, long j15) {
            f0Var.f13109s = null;
            f0Var.f13108r = RecyclerView.this;
            int iN = f0Var.n();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z15 = false;
            if (j15 != Long.MAX_VALUE && !this.f13170g.m(iN, nanoTime, j15)) {
                return false;
            }
            if (f0Var.z()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f0Var.f13091a, recyclerView.getChildCount(), f0Var.f13091a.getLayoutParams());
                z15 = true;
            }
            RecyclerView.this.f13025n.c(f0Var, i15);
            if (z15) {
                RecyclerView.this.detachViewFromParent(f0Var.f13091a);
            }
            this.f13170g.f(f0Var.n(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f0Var);
            if (RecyclerView.this.J0.e()) {
                f0Var.f13097g = i16;
            }
            return true;
        }

        private void b(f0 f0Var) {
            if (RecyclerView.this.z0()) {
                View view = f0Var.f13091a;
                if (l0.w(view) == 0) {
                    l0.n0(view, 1);
                }
                androidx.recyclerview.widget.r rVar = RecyclerView.this.Q0;
                if (rVar == null) {
                    return;
                }
                j6.a aVarN = rVar.n();
                if (aVarN instanceof androidx.recyclerview.widget.r.a) {
                    ((androidx.recyclerview.widget.r.a) aVarN).o(view);
                }
                l0.h0(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z15) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z15) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(f0 f0Var) {
            View view = f0Var.f13091a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f13170g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f13025n == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f13170g.b(RecyclerView.this.f13025n);
            }
        }

        void A() {
            for (int i15 = 0; i15 < this.f13166c.size(); i15++) {
                q6.a.b(this.f13166c.get(i15).f13091a);
            }
            B(RecyclerView.this.f13025n);
        }

        void D(View view) {
            f0 f0VarL0 = RecyclerView.l0(view);
            f0VarL0.f13104n = null;
            f0VarL0.f13105o = false;
            f0VarL0.e();
            H(f0VarL0);
        }

        void E() {
            for (int size = this.f13166c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f13166c.clear();
            if (RecyclerView.f13004j1) {
                RecyclerView.this.I0.b();
            }
        }

        void F(int i15) {
            boolean z15 = RecyclerView.f12997c1;
            f0 f0Var = this.f13166c.get(i15);
            if (RecyclerView.f12998d1) {
                Objects.toString(f0Var);
            }
            a(f0Var, true);
            this.f13166c.remove(i15);
        }

        public void G(View view) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (f0VarL0.z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f0VarL0.y()) {
                f0VarL0.M();
            } else if (f0VarL0.N()) {
                f0VarL0.e();
            }
            H(f0VarL0);
            if (RecyclerView.this.f13030r0 == null || f0VarL0.w()) {
                return;
            }
            RecyclerView.this.f13030r0.j(f0VarL0);
        }

        void H(f0 f0Var) {
            boolean z15;
            boolean z16 = false;
            boolean z17 = true;
            if (f0Var.y() || f0Var.f13091a.getParent() != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Scrapped or attached views may not be recycled. isScrap:");
                sb5.append(f0Var.y());
                sb5.append(" isAttached:");
                sb5.append(f0Var.f13091a.getParent() != null);
                sb5.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb5.toString());
            }
            if (f0Var.z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.V());
            }
            if (f0Var.L()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean zH = f0Var.h();
            h hVar = RecyclerView.this.f13025n;
            boolean z18 = hVar != null && zH && hVar.v(f0Var);
            if (RecyclerView.f12997c1 && this.f13166c.contains(f0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f0Var + RecyclerView.this.V());
            }
            if (z18 || f0Var.w()) {
                if (this.f13169f <= 0 || f0Var.r(526)) {
                    z15 = false;
                } else {
                    int size = this.f13166c.size();
                    if (size >= this.f13169f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.f13004j1 && size > 0 && !RecyclerView.this.I0.d(f0Var.f13093c)) {
                        int i15 = size - 1;
                        while (i15 >= 0) {
                            if (!RecyclerView.this.I0.d(this.f13166c.get(i15).f13093c)) {
                                break;
                            } else {
                                i15--;
                            }
                        }
                        size = i15 + 1;
                    }
                    this.f13166c.add(size, f0Var);
                    z15 = true;
                }
                if (z15) {
                    z17 = false;
                } else {
                    a(f0Var, true);
                }
                z16 = z15;
            } else {
                if (RecyclerView.f12998d1) {
                    RecyclerView.this.V();
                }
                z17 = false;
            }
            RecyclerView.this.f13018g.q(f0Var);
            if (z16 || z17 || !zH) {
                return;
            }
            q6.a.b(f0Var.f13091a);
            f0Var.f13109s = null;
            f0Var.f13108r = null;
        }

        void I(View view) {
            f0 f0VarL0 = RecyclerView.l0(view);
            if (!f0VarL0.r(12) && f0VarL0.A() && !RecyclerView.this.s(f0VarL0)) {
                if (this.f13165b == null) {
                    this.f13165b = new ArrayList<>();
                }
                f0VarL0.J(this, true);
                this.f13165b.add(f0VarL0);
                return;
            }
            if (!f0VarL0.v() || f0VarL0.x() || RecyclerView.this.f13025n.k()) {
                f0VarL0.J(this, false);
                this.f13164a.add(f0VarL0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.f13025n);
            v vVar2 = this.f13170g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f13170g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f13170g.a();
            }
            u();
        }

        void K(d0 d0Var) {
        }

        public void L(int i15) {
            this.f13168e = i15;
            P();
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:67:0x014e  */
        /* JADX WARN: Code duplicated, block: B:73:0x017a  */
        /* JADX WARN: Code duplicated, block: B:75:0x0180  */
        /* JADX WARN: Code duplicated, block: B:83:0x0193  */
        /* JADX WARN: Code duplicated, block: B:91:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:92:0x01de  */
        /* JADX WARN: Code duplicated, block: B:94:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:98:0x01fa A[ADDED_TO_REGION] */
        f0 N(int i15, boolean z15, long j15) {
            f0 f0VarE;
            boolean z16;
            f0 f0Var;
            boolean z17;
            boolean zM;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            int iM;
            RecyclerView recyclerViewB0;
            if (i15 < 0 || i15 >= RecyclerView.this.J0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i15 + "(" + i15 + "). Item count:" + RecyclerView.this.J0.b() + RecyclerView.this.V());
            }
            if (RecyclerView.this.J0.e()) {
                f0VarE = h(i15);
                if (f0VarE != null) {
                    z16 = true;
                }
                if (f0VarE == null && (f0VarE = m(i15, z15)) != null) {
                    if (Q(f0VarE)) {
                        z16 = true;
                    } else {
                        if (!z15) {
                            f0VarE.b(4);
                            if (f0VarE.y()) {
                                RecyclerView.this.removeDetachedView(f0VarE.f13091a, false);
                                f0VarE.M();
                            } else if (f0VarE.N()) {
                                f0VarE.e();
                            }
                            H(f0VarE);
                        }
                        f0VarE = null;
                    }
                }
                if (f0VarE == null) {
                    iM = RecyclerView.this.f13016e.m(i15);
                    if (iM >= 0 || iM >= RecyclerView.this.f13025n.g()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i15 + "(offset:" + iM + ").state:" + RecyclerView.this.J0.b() + RecyclerView.this.V());
                    }
                    int i16 = RecyclerView.this.f13025n.i(iM);
                    if (RecyclerView.this.f13025n.k() && (f0VarE = l(RecyclerView.this.f13025n.h(iM), i16, z15)) != null) {
                        f0VarE.f13093c = iM;
                        z16 = true;
                    }
                    if (f0VarE == null) {
                        boolean z18 = RecyclerView.f12997c1;
                        f0 f0VarH = i().h(i16);
                        if (f0VarH != null) {
                            f0VarH.F();
                            if (RecyclerView.f13001g1) {
                                r(f0VarH);
                            }
                        }
                        f0VarE = f0VarH;
                    }
                    if (f0VarE == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j15 != Long.MAX_VALUE && !this.f13170g.n(i16, nanoTime, j15)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        f0VarE = recyclerView.f13025n.e(recyclerView, i16);
                        if (RecyclerView.f13004j1 && (recyclerViewB0 = RecyclerView.b0(f0VarE.f13091a)) != null) {
                            f0VarE.f13092b = new WeakReference<>(recyclerViewB0);
                        }
                        this.f13170g.g(i16, RecyclerView.this.getNanoTime() - nanoTime);
                        boolean z19 = RecyclerView.f12997c1;
                    }
                }
                f0Var = f0VarE;
                z17 = z16;
                if (z17 && !RecyclerView.this.J0.e() && f0Var.r(PKIFailureInfo.certRevoked)) {
                    f0Var.H(0, PKIFailureInfo.certRevoked);
                    if (RecyclerView.this.J0.f13073k) {
                        int iE = m.e(f0Var) | PKIFailureInfo.certConfirmed;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.Y0(f0Var, recyclerView2.f13030r0.t(recyclerView2.J0, f0Var, iE, f0Var.q()));
                    }
                }
                if (RecyclerView.this.J0.e() || !f0Var.u()) {
                    if (f0Var.u() || f0Var.B() || f0Var.v()) {
                        if (!RecyclerView.f12997c1 && f0Var.x()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + f0Var + RecyclerView.this.V());
                        }
                        zM = M(f0Var, RecyclerView.this.f13016e.m(i15), i15, j15);
                    }
                    layoutParams = f0Var.f13091a.getLayoutParams();
                    if (layoutParams == null) {
                        qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                        f0Var.f13091a.setLayoutParams(qVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        qVar = (q) layoutParams;
                    } else {
                        qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                        f0Var.f13091a.setLayoutParams(qVar);
                    }
                    qVar.f13153a = f0Var;
                    qVar.f13156d = !z17 && zM;
                    return f0Var;
                }
                f0Var.f13097g = i15;
                zM = false;
                layoutParams = f0Var.f13091a.getLayoutParams();
                if (layoutParams == null) {
                    qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                    f0Var.f13091a.setLayoutParams(qVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                    f0Var.f13091a.setLayoutParams(qVar);
                } else {
                    qVar = (q) layoutParams;
                }
                qVar.f13153a = f0Var;
                qVar.f13156d = !z17 && zM;
                return f0Var;
            }
            f0VarE = null;
            z16 = false;
            if (f0VarE == null) {
                if (Q(f0VarE)) {
                    if (!z15) {
                        f0VarE.b(4);
                        if (f0VarE.y()) {
                            RecyclerView.this.removeDetachedView(f0VarE.f13091a, false);
                            f0VarE.M();
                        } else if (f0VarE.N()) {
                            f0VarE.e();
                        }
                        H(f0VarE);
                    }
                    f0VarE = null;
                } else {
                    z16 = true;
                }
            }
            if (f0VarE == null) {
                iM = RecyclerView.this.f13016e.m(i15);
                if (iM >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i15 + "(offset:" + iM + ").state:" + RecyclerView.this.J0.b() + RecyclerView.this.V());
            }
            f0Var = f0VarE;
            z17 = z16;
            if (z17) {
                f0Var.H(0, PKIFailureInfo.certRevoked);
                if (RecyclerView.this.J0.f13073k) {
                    int iE2 = m.e(f0Var) | PKIFailureInfo.certConfirmed;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.Y0(f0Var, recyclerView3.f13030r0.t(recyclerView3.J0, f0Var, iE2, f0Var.q()));
                }
            }
            if (RecyclerView.this.J0.e()) {
                if (f0Var.u()) {
                }
                if (!RecyclerView.f12997c1) {
                }
                zM = M(f0Var, RecyclerView.this.f13016e.m(i15), i15, j15);
            } else {
                if (f0Var.u()) {
                }
                if (!RecyclerView.f12997c1) {
                }
                zM = M(f0Var, RecyclerView.this.f13016e.m(i15), i15, j15);
            }
            layoutParams = f0Var.f13091a.getLayoutParams();
            if (layoutParams == null) {
                qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                f0Var.f13091a.setLayoutParams(qVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                f0Var.f13091a.setLayoutParams(qVar);
            } else {
                qVar = (q) layoutParams;
            }
            qVar.f13153a = f0Var;
            qVar.f13156d = !z17 && zM;
            return f0Var;
        }

        void O(f0 f0Var) {
            if (f0Var.f13105o) {
                this.f13165b.remove(f0Var);
            } else {
                this.f13164a.remove(f0Var);
            }
            f0Var.f13104n = null;
            f0Var.f13105o = false;
            f0Var.e();
        }

        void P() {
            p pVar = RecyclerView.this.f13026p;
            this.f13169f = this.f13168e + (pVar != null ? pVar.f13141m : 0);
            for (int size = this.f13166c.size() - 1; size >= 0 && this.f13166c.size() > this.f13169f; size--) {
                F(size);
            }
        }

        boolean Q(f0 f0Var) {
            if (f0Var.x()) {
                if (!RecyclerView.f12997c1 || RecyclerView.this.J0.e()) {
                    return RecyclerView.this.J0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i15 = f0Var.f13093c;
            if (i15 >= 0 && i15 < RecyclerView.this.f13025n.g()) {
                if (RecyclerView.this.J0.e() || RecyclerView.this.f13025n.i(f0Var.f13093c) == f0Var.n()) {
                    return !RecyclerView.this.f13025n.k() || f0Var.m() == RecyclerView.this.f13025n.h(f0Var.f13093c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.V());
        }

        void R(int i15, int i16) {
            int i17;
            int i18 = i16 + i15;
            for (int size = this.f13166c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f13166c.get(size);
                if (f0Var != null && (i17 = f0Var.f13093c) >= i15 && i17 < i18) {
                    f0Var.b(2);
                    F(size);
                }
            }
        }

        void a(f0 f0Var, boolean z15) {
            RecyclerView.u(f0Var);
            View view = f0Var.f13091a;
            androidx.recyclerview.widget.r rVar = RecyclerView.this.Q0;
            if (rVar != null) {
                j6.a aVarN = rVar.n();
                l0.h0(view, aVarN instanceof androidx.recyclerview.widget.r.a ? ((androidx.recyclerview.widget.r.a) aVarN).n(view) : null);
            }
            if (z15) {
                g(f0Var);
            }
            f0Var.f13109s = null;
            f0Var.f13108r = null;
            i().k(f0Var);
        }

        public void c() {
            this.f13164a.clear();
            E();
        }

        void d() {
            int size = this.f13166c.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.f13166c.get(i15).c();
            }
            int size2 = this.f13164a.size();
            for (int i16 = 0; i16 < size2; i16++) {
                this.f13164a.get(i16).c();
            }
            ArrayList<f0> arrayList = this.f13165b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    this.f13165b.get(i17).c();
                }
            }
        }

        void e() {
            this.f13164a.clear();
            ArrayList<f0> arrayList = this.f13165b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i15) {
            if (i15 >= 0 && i15 < RecyclerView.this.J0.b()) {
                return !RecyclerView.this.J0.e() ? i15 : RecyclerView.this.f13016e.m(i15);
            }
            throw new IndexOutOfBoundsException("invalid position " + i15 + ". State item count is " + RecyclerView.this.J0.b() + RecyclerView.this.V());
        }

        void g(f0 f0Var) {
            x xVar = RecyclerView.this.f13027q;
            if (xVar != null) {
                xVar.a(f0Var);
            }
            int size = RecyclerView.this.f13029r.size();
            for (int i15 = 0; i15 < size; i15++) {
                RecyclerView.this.f13029r.get(i15).a(f0Var);
            }
            h hVar = RecyclerView.this.f13025n;
            if (hVar != null) {
                hVar.y(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.J0 != null) {
                recyclerView.f13018g.q(f0Var);
            }
            if (RecyclerView.f12998d1) {
                Objects.toString(f0Var);
            }
        }

        f0 h(int i15) {
            int size;
            int iM;
            ArrayList<f0> arrayList = this.f13165b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i16 = 0; i16 < size; i16++) {
                    f0 f0Var = this.f13165b.get(i16);
                    if (!f0Var.N() && f0Var.o() == i15) {
                        f0Var.b(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.f13025n.k() && (iM = RecyclerView.this.f13016e.m(i15)) > 0 && iM < RecyclerView.this.f13025n.g()) {
                    long jH = RecyclerView.this.f13025n.h(iM);
                    for (int i17 = 0; i17 < size; i17++) {
                        f0 f0Var2 = this.f13165b.get(i17);
                        if (!f0Var2.N() && f0Var2.m() == jH) {
                            f0Var2.b(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f13170g == null) {
                this.f13170g = new v();
                u();
            }
            return this.f13170g;
        }

        int j() {
            return this.f13164a.size();
        }

        public List<f0> k() {
            return this.f13167d;
        }

        f0 l(long j15, int i15, boolean z15) {
            for (int size = this.f13164a.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f13164a.get(size);
                if (f0Var.m() == j15 && !f0Var.N()) {
                    if (i15 == f0Var.n()) {
                        f0Var.b(32);
                        if (f0Var.x() && !RecyclerView.this.J0.e()) {
                            f0Var.H(2, 14);
                        }
                        return f0Var;
                    }
                    if (!z15) {
                        this.f13164a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.f13091a, false);
                        D(f0Var.f13091a);
                    }
                }
            }
            int size2 = this.f13166c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.f13166c.get(size2);
                if (f0Var2.m() == j15 && !f0Var2.t()) {
                    if (i15 == f0Var2.n()) {
                        if (!z15) {
                            this.f13166c.remove(size2);
                        }
                        return f0Var2;
                    }
                    if (!z15) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        f0 m(int i15, boolean z15) {
            View viewE;
            int size = this.f13164a.size();
            for (int i16 = 0; i16 < size; i16++) {
                f0 f0Var = this.f13164a.get(i16);
                if (!f0Var.N() && f0Var.o() == i15 && !f0Var.v() && (RecyclerView.this.J0.f13070h || !f0Var.x())) {
                    f0Var.b(32);
                    return f0Var;
                }
            }
            if (z15 || (viewE = RecyclerView.this.f13017f.e(i15)) == null) {
                int size2 = this.f13166c.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    f0 f0Var2 = this.f13166c.get(i17);
                    if (!f0Var2.v() && f0Var2.o() == i15 && !f0Var2.t()) {
                        if (!z15) {
                            this.f13166c.remove(i17);
                        }
                        if (RecyclerView.f12998d1) {
                            f0Var2.toString();
                        }
                        return f0Var2;
                    }
                }
                return null;
            }
            f0 f0VarL0 = RecyclerView.l0(viewE);
            RecyclerView.this.f13017f.s(viewE);
            int iM = RecyclerView.this.f13017f.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f13017f.d(iM);
                I(viewE);
                f0VarL0.b(8224);
                return f0VarL0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f0VarL0 + RecyclerView.this.V());
        }

        View n(int i15) {
            return this.f13164a.get(i15).f13091a;
        }

        public View o(int i15) {
            return p(i15, false);
        }

        View p(int i15, boolean z15) {
            return N(i15, z15, Long.MAX_VALUE).f13091a;
        }

        void s() {
            int size = this.f13166c.size();
            for (int i15 = 0; i15 < size; i15++) {
                q qVar = (q) this.f13166c.get(i15).f13091a.getLayoutParams();
                if (qVar != null) {
                    qVar.f13155c = true;
                }
            }
        }

        void t() {
            int size = this.f13166c.size();
            for (int i15 = 0; i15 < size; i15++) {
                f0 f0Var = this.f13166c.get(i15);
                if (f0Var != null) {
                    f0Var.b(6);
                    f0Var.a(null);
                }
            }
            h hVar = RecyclerView.this.f13025n;
            if (hVar == null || !hVar.k()) {
                E();
            }
        }

        void v(int i15, int i16) {
            int size = this.f13166c.size();
            for (int i17 = 0; i17 < size; i17++) {
                f0 f0Var = this.f13166c.get(i17);
                if (f0Var != null && f0Var.f13093c >= i15) {
                    if (RecyclerView.f12998d1) {
                        f0Var.toString();
                    }
                    f0Var.C(i16, false);
                }
            }
        }

        void w(int i15, int i16) {
            int i17;
            int i18;
            int i19;
            int i25;
            if (i15 < i16) {
                i17 = -1;
                i19 = i15;
                i18 = i16;
            } else {
                i17 = 1;
                i18 = i15;
                i19 = i16;
            }
            int size = this.f13166c.size();
            for (int i26 = 0; i26 < size; i26++) {
                f0 f0Var = this.f13166c.get(i26);
                if (f0Var != null && (i25 = f0Var.f13093c) >= i19 && i25 <= i18) {
                    if (i25 == i15) {
                        f0Var.C(i16 - i15, false);
                    } else {
                        f0Var.C(i17, false);
                    }
                    if (RecyclerView.f12998d1) {
                        f0Var.toString();
                    }
                }
            }
        }

        void x(int i15, int i16, boolean z15) {
            int i17 = i15 + i16;
            for (int size = this.f13166c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f13166c.get(size);
                if (f0Var != null) {
                    int i18 = f0Var.f13093c;
                    if (i18 >= i17) {
                        if (RecyclerView.f12998d1) {
                            f0Var.toString();
                        }
                        f0Var.C(-i16, z15);
                    } else if (i18 >= i15) {
                        f0Var.b(8);
                        F(size);
                    }
                }
            }
        }

        void y(h<?> hVar, h<?> hVar2, boolean z15) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z15);
            u();
        }

        void z() {
            u();
        }
    }

    public interface x {
        void a(f0 f0Var);
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.J0.f13069g = true;
            recyclerView.W0(true);
            if (RecyclerView.this.f13016e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i15, int i16, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f13016e.r(i15, i16, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i15, int i16) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f13016e.s(i15, i16)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i15, int i16, int i17) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f13016e.t(i15, i16, i17)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i15, int i16) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f13016e.u(i15, i16)) {
                g();
            }
        }

        void g() {
            if (RecyclerView.f13003i1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f13040x && recyclerView.f13038w) {
                    l0.Z(recyclerView, recyclerView.f13021j);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.F = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f13007m1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f13008n1 = new c();
        f13009o1 = new c0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i15, int i16) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strO0 = o0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strO0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f13007m1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i15), Integer.valueOf(i16)};
                } catch (NoSuchMethodException e15) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e16) {
                        e16.initCause(e15);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strO0, e16);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e17) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strO0, e17);
            } catch (ClassNotFoundException e18) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strO0, e18);
            } catch (IllegalAccessException e19) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strO0, e19);
            } catch (InstantiationException e25) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strO0, e25);
            } catch (InvocationTargetException e26) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strO0, e26);
            }
        }
    }

    private boolean B0(View view, View view2, int i15) {
        int i16;
        if (view2 == null || view2 == this || view2 == view || X(view2) == null) {
            return false;
        }
        if (view == null || X(view) == null) {
            return true;
        }
        this.f13022k.set(0, 0, view.getWidth(), view.getHeight());
        this.f13023l.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f13022k);
        offsetDescendantRectToMyCoords(view2, this.f13023l);
        byte b15 = -1;
        int i17 = this.f13026p.d0() == 1 ? -1 : 1;
        Rect rect = this.f13022k;
        int i18 = rect.left;
        Rect rect2 = this.f13023l;
        int i19 = rect2.left;
        if ((i18 < i19 || rect.right <= i19) && rect.right < rect2.right) {
            i16 = 1;
        } else {
            int i25 = rect.right;
            int i26 = rect2.right;
            i16 = ((i25 > i26 || i18 >= i26) && i18 > i19) ? -1 : 0;
        }
        int i27 = rect.top;
        int i28 = rect2.top;
        if ((i27 < i28 || rect.bottom <= i28) && rect.bottom < rect2.bottom) {
            b15 = 1;
        } else {
            int i29 = rect.bottom;
            int i35 = rect2.bottom;
            if ((i29 <= i35 && i27 < i35) || i27 <= i28) {
                b15 = 0;
            }
        }
        if (i15 == 1) {
            return b15 < 0 || (b15 == 0 && i16 * i17 < 0);
        }
        if (i15 == 2) {
            return b15 > 0 || (b15 == 0 && i16 * i17 > 0);
        }
        if (i15 == 17) {
            return i16 < 0;
        }
        if (i15 == 33) {
            return b15 < 0;
        }
        if (i15 == 66) {
            return i16 > 0;
        }
        if (i15 == 130) {
            return b15 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i15 + V());
    }

    private boolean C1(MotionEvent motionEvent) {
        boolean z15;
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z15 = false;
        } else {
            androidx.core.widget.d.d(this.R, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z15 = true;
        }
        EdgeEffect edgeEffect2 = this.f13020h0;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.f13020h0, 0.0f, motionEvent.getY() / getHeight());
            z15 = true;
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.T, 0.0f, motionEvent.getX() / getWidth());
            z15 = true;
        }
        EdgeEffect edgeEffect4 = this.f13028q0;
        if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z15;
        }
        androidx.core.widget.d.d(this.f13028q0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private boolean D(int i15, int i16) {
        a0(this.R0);
        int[] iArr = this.R0;
        return (iArr[0] == i15 && iArr[1] == i16) ? false : true;
    }

    private void F0(int i15, int i16, MotionEvent motionEvent, int i17) {
        p pVar = this.f13026p;
        if (pVar == null) {
            c2.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        int[] iArr = this.V0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = pVar.p();
        boolean zQ = this.f13026p.q();
        int i18 = zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iB1 = i15 - b1(i15, height);
        int iC1 = i16 - c1(i16, width);
        B1(i18, i17);
        if (L(zP ? iB1 : 0, zQ ? iC1 : 0, this.V0, this.T0, i17)) {
            int[] iArr2 = this.V0;
            iB1 -= iArr2[0];
            iC1 -= iArr2[1];
        }
        o1(zP ? iB1 : 0, zQ ? iC1 : 0, motionEvent, i17);
        androidx.recyclerview.widget.j jVar = this.H0;
        if (jVar != null && (iB1 != 0 || iC1 != 0)) {
            jVar.f(this, iB1, iC1);
        }
        E1(i17);
    }

    private void G() {
        int i15 = this.E;
        this.E = 0;
        if (i15 == 0 || !z0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        k6.b.c(accessibilityEventObtain, i15);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void G1() {
        this.G0.f();
        p pVar = this.f13026p;
        if (pVar != null) {
            pVar.O1();
        }
    }

    private void I() {
        this.J0.a(1);
        W(this.J0);
        this.J0.f13072j = false;
        A1();
        this.f13018g.f();
        N0();
        V0();
        m1();
        b0 b0Var = this.J0;
        b0Var.f13071i = b0Var.f13073k && this.N0;
        this.N0 = false;
        this.M0 = false;
        b0Var.f13070h = b0Var.f13074l;
        b0Var.f13068f = this.f13025n.g();
        a0(this.R0);
        if (this.J0.f13073k) {
            int iG = this.f13017f.g();
            for (int i15 = 0; i15 < iG; i15++) {
                f0 f0VarL0 = l0(this.f13017f.f(i15));
                if (!f0VarL0.L() && (!f0VarL0.v() || this.f13025n.k())) {
                    this.f13018g.e(f0VarL0, this.f13030r0.t(this.J0, f0VarL0, m.e(f0VarL0), f0VarL0.q()));
                    if (this.J0.f13071i && f0VarL0.A() && !f0VarL0.x() && !f0VarL0.L() && !f0VarL0.v()) {
                        this.f13018g.c(i0(f0VarL0), f0VarL0);
                    }
                }
            }
        }
        if (this.J0.f13074l) {
            n1();
            b0 b0Var2 = this.J0;
            boolean z15 = b0Var2.f13069g;
            b0Var2.f13069g = false;
            this.f13026p.b1(this.f13014c, b0Var2);
            this.J0.f13069g = z15;
            for (int i16 = 0; i16 < this.f13017f.g(); i16++) {
                f0 f0VarL1 = l0(this.f13017f.f(i16));
                if (!f0VarL1.L() && !this.f13018g.i(f0VarL1)) {
                    int iE = m.e(f0VarL1);
                    boolean zR = f0VarL1.r(PKIFailureInfo.certRevoked);
                    if (!zR) {
                        iE |= PKIFailureInfo.certConfirmed;
                    }
                    m.c cVarT = this.f13030r0.t(this.J0, f0VarL1, iE, f0VarL1.q());
                    if (zR) {
                        Y0(f0VarL1, cVarT);
                    } else {
                        this.f13018g.a(f0VarL1, cVarT);
                    }
                }
            }
            v();
        } else {
            v();
        }
        O0();
        D1(false);
        this.J0.f13067e = 2;
    }

    private void J() {
        A1();
        N0();
        this.J0.a(6);
        this.f13016e.j();
        this.J0.f13068f = this.f13025n.g();
        this.J0.f13066d = 0;
        if (this.f13015d != null && this.f13025n.d()) {
            Parcelable parcelable = this.f13015d.f13173c;
            if (parcelable != null) {
                this.f13026p.g1(parcelable);
            }
            this.f13015d = null;
        }
        b0 b0Var = this.J0;
        b0Var.f13070h = false;
        this.f13026p.b1(this.f13014c, b0Var);
        b0 b0Var2 = this.J0;
        b0Var2.f13069g = false;
        b0Var2.f13073k = b0Var2.f13073k && this.f13030r0 != null;
        b0Var2.f13067e = 4;
        O0();
        D1(false);
    }

    private void K() {
        RecyclerView recyclerView;
        this.J0.a(4);
        A1();
        N0();
        b0 b0Var = this.J0;
        b0Var.f13067e = 1;
        if (b0Var.f13073k) {
            for (int iG = this.f13017f.g() - 1; iG >= 0; iG--) {
                f0 f0VarL0 = l0(this.f13017f.f(iG));
                if (!f0VarL0.L()) {
                    long jI0 = i0(f0VarL0);
                    m.c cVarS = this.f13030r0.s(this.J0, f0VarL0);
                    f0 f0VarG = this.f13018g.g(jI0);
                    if (f0VarG == null || f0VarG.L()) {
                        this.f13018g.d(f0VarL0, cVarS);
                    } else {
                        boolean zH = this.f13018g.h(f0VarG);
                        boolean zH2 = this.f13018g.h(f0VarL0);
                        if (zH && f0VarG == f0VarL0) {
                            this.f13018g.d(f0VarL0, cVarS);
                        } else {
                            m.c cVarN = this.f13018g.n(f0VarG);
                            this.f13018g.d(f0VarL0, cVarS);
                            m.c cVarM = this.f13018g.m(f0VarL0);
                            if (cVarN == null) {
                                r0(jI0, f0VarL0, f0VarG);
                            } else {
                                p(f0VarG, f0VarL0, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f13018g.o(recyclerView.f13013b1);
        } else {
            recyclerView = this;
        }
        recyclerView.f13026p.p1(recyclerView.f13014c);
        b0 b0Var2 = recyclerView.J0;
        b0Var2.f13065c = b0Var2.f13068f;
        recyclerView.I = false;
        recyclerView.K = false;
        b0Var2.f13073k = false;
        b0Var2.f13074l = false;
        recyclerView.f13026p.f13136h = false;
        ArrayList<f0> arrayList = recyclerView.f13014c.f13165b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.f13026p;
        if (pVar.f13142n) {
            pVar.f13141m = 0;
            pVar.f13142n = false;
            recyclerView.f13014c.P();
        }
        recyclerView.f13026p.c1(recyclerView.J0);
        O0();
        D1(false);
        recyclerView.f13018g.f();
        int[] iArr = recyclerView.R0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        Z0();
        k1();
    }

    private boolean Q(MotionEvent motionEvent) {
        t tVar = this.f13036v;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return Z(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f13036v = null;
        }
        return true;
    }

    private void Q0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13034t0) {
            int i15 = actionIndex == 0 ? 1 : 0;
            this.f13034t0 = motionEvent.getPointerId(i15);
            int x15 = (int) (motionEvent.getX(i15) + 0.5f);
            this.f13041x0 = x15;
            this.f13037v0 = x15;
            int y15 = (int) (motionEvent.getY(i15) + 0.5f);
            this.f13043y0 = y15;
            this.f13039w0 = y15;
        }
    }

    private boolean U0() {
        return this.f13030r0 != null && this.f13026p.P1();
    }

    private void V0() {
        boolean z15;
        if (this.I) {
            this.f13016e.y();
            if (this.K) {
                this.f13026p.W0(this);
            }
        }
        if (U0()) {
            this.f13016e.w();
        } else {
            this.f13016e.j();
        }
        boolean z16 = this.M0 || this.N0;
        this.J0.f13073k = this.f13044z && this.f13030r0 != null && ((z15 = this.I) || z16 || this.f13026p.f13136h) && (!z15 || this.f13025n.k());
        b0 b0Var = this.J0;
        b0Var.f13074l = b0Var.f13073k && z16 && !this.I && U0();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void X0(float f15, float f16, float f17, float f18) {
        boolean z15;
        boolean z16 = true;
        if (f16 >= 0.0f) {
            if (f16 > 0.0f) {
                T();
                androidx.core.widget.d.d(this.f13020h0, f16 / getWidth(), f17 / getHeight());
            } else {
                z15 = false;
            }
            if (f18 < 0.0f) {
                U();
                androidx.core.widget.d.d(this.T, (-f18) / getHeight(), f15 / getWidth());
            } else if (f18 > 0.0f) {
                R();
                androidx.core.widget.d.d(this.f13028q0, f18 / getHeight(), 1.0f - (f15 / getWidth()));
            } else {
                z16 = z15;
            }
            if (z16 && f16 == 0.0f && f18 == 0.0f) {
                return;
            }
            l0.Y(this);
        }
        S();
        androidx.core.widget.d.d(this.R, (-f16) / getWidth(), 1.0f - (f17 / getHeight()));
        z15 = true;
        if (f18 < 0.0f) {
            U();
            androidx.core.widget.d.d(this.T, (-f18) / getHeight(), f15 / getWidth());
        } else if (f18 > 0.0f) {
            R();
            androidx.core.widget.d.d(this.f13028q0, f18 / getHeight(), 1.0f - (f15 / getWidth()));
        } else {
            z16 = z15;
        }
        if (z16) {
        }
        l0.Y(this);
    }

    private boolean Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f13033t.size();
        for (int i15 = 0; i15 < size; i15++) {
            t tVar = this.f13033t.get(i15);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.f13036v = tVar;
                return true;
            }
        }
        return false;
    }

    private void Z0() {
        View viewFindViewById;
        if (!this.F0 || this.f13025n == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f13006l1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f13017f.n(focusedChild)) {
                    return;
                }
            } else if (this.f13017f.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewC0 = null;
        f0 f0VarE0 = (this.J0.f13076n == -1 || !this.f13025n.k()) ? null : e0(this.J0.f13076n);
        if (f0VarE0 != null && !this.f13017f.n(f0VarE0.f13091a) && f0VarE0.f13091a.hasFocusable()) {
            viewC0 = f0VarE0.f13091a;
        } else if (this.f13017f.g() > 0) {
            viewC0 = c0();
        }
        if (viewC0 != null) {
            int i15 = this.J0.f13077o;
            if (i15 != -1 && (viewFindViewById = viewC0.findViewById(i15)) != null && viewFindViewById.isFocusable()) {
                viewC0 = viewFindViewById;
            }
            viewC0.requestFocus();
        }
    }

    private void a0(int[] iArr) {
        int iG = this.f13017f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i15 = Integer.MAX_VALUE;
        int i16 = PKIFailureInfo.systemUnavail;
        for (int i17 = 0; i17 < iG; i17++) {
            f0 f0VarL0 = l0(this.f13017f.f(i17));
            if (!f0VarL0.L()) {
                int iO = f0VarL0.o();
                if (iO < i15) {
                    i15 = iO;
                }
                if (iO > i16) {
                    i16 = iO;
                }
            }
        }
        iArr[0] = i15;
        iArr[1] = i16;
    }

    private void a1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.R.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f13020h0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f13020h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f13028q0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f13028q0.isFinished();
        }
        if (zIsFinished) {
            l0.Y(this);
        }
    }

    static RecyclerView b0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            RecyclerView recyclerViewB0 = b0(viewGroup.getChildAt(i15));
            if (recyclerViewB0 != null) {
                return recyclerViewB0;
            }
        }
        return null;
    }

    private int b1(int i15, float f15) {
        float height = f15 / getHeight();
        float width = i15 / getWidth();
        EdgeEffect edgeEffect = this.R;
        float f16 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f13020h0;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f13020h0.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.f13020h0, width, height);
                    if (androidx.core.widget.d.b(this.f13020h0) == 0.0f) {
                        this.f13020h0.onRelease();
                    }
                    f16 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.R.onRelease();
            } else {
                float f17 = -androidx.core.widget.d.d(this.R, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.R) == 0.0f) {
                    this.R.onRelease();
                }
                f16 = f17;
            }
            invalidate();
        }
        return Math.round(f16 * getWidth());
    }

    private View c0() {
        f0 f0VarD0;
        b0 b0Var = this.J0;
        int i15 = b0Var.f13075m;
        if (i15 == -1) {
            i15 = 0;
        }
        int iB = b0Var.b();
        for (int i16 = i15; i16 < iB; i16++) {
            f0 f0VarD1 = d0(i16);
            if (f0VarD1 == null) {
                break;
            }
            if (f0VarD1.f13091a.hasFocusable()) {
                return f0VarD1.f13091a;
            }
        }
        int iMin = Math.min(iB, i15);
        do {
            iMin--;
            if (iMin < 0 || (f0VarD0 = d0(iMin)) == null) {
                return null;
            }
        } while (!f0VarD0.f13091a.hasFocusable());
        return f0VarD0.f13091a;
    }

    private int c1(int i15, float f15) {
        float width = f15 / getWidth();
        float height = i15 / getHeight();
        EdgeEffect edgeEffect = this.T;
        float f16 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f13028q0;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f13028q0.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.f13028q0, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.f13028q0) == 0.0f) {
                        this.f13028q0.onRelease();
                    }
                    f16 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.T.onRelease();
            } else {
                float f17 = -androidx.core.widget.d.d(this.T, -height, width);
                if (androidx.core.widget.d.b(this.T) == 0.0f) {
                    this.T.onRelease();
                }
                f16 = f17;
            }
            invalidate();
        }
        return Math.round(f16 * getHeight());
    }

    private j6.u getScrollingChildHelper() {
        if (this.S0 == null) {
            this.S0 = new j6.u(this);
        }
        return this.S0;
    }

    private void i(f0 f0Var) {
        View view = f0Var.f13091a;
        boolean z15 = view.getParent() == this;
        this.f13014c.O(k0(view));
        if (f0Var.z()) {
            this.f13017f.c(view, -1, view.getLayoutParams(), true);
        } else if (z15) {
            this.f13017f.k(view);
        } else {
            this.f13017f.b(view, true);
        }
    }

    private void j1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f13022k.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f13155c) {
                Rect rect = qVar.f13154b;
                Rect rect2 = this.f13022k;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f13022k);
            offsetRectIntoDescendantCoords(view, this.f13022k);
        }
        this.f13026p.w1(this, view, this.f13022k, !this.f13044z, view2 == null);
    }

    private void k1() {
        b0 b0Var = this.J0;
        b0Var.f13076n = -1L;
        b0Var.f13075m = -1;
        b0Var.f13077o = -1;
    }

    static f0 l0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f13153a;
    }

    private void l1() {
        VelocityTracker velocityTracker = this.f13035u0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        E1(0);
        a1();
    }

    static void m0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f13154b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private void m1() {
        int iJ;
        View focusedChild = (this.F0 && hasFocus() && this.f13025n != null) ? getFocusedChild() : null;
        f0 f0VarY = focusedChild != null ? Y(focusedChild) : null;
        if (f0VarY == null) {
            k1();
            return;
        }
        this.J0.f13076n = this.f13025n.k() ? f0VarY.m() : -1L;
        b0 b0Var = this.J0;
        if (this.I) {
            iJ = -1;
        } else {
            iJ = f0VarY.x() ? f0VarY.f13094d : f0VarY.j();
        }
        b0Var.f13075m = iJ;
        this.J0.f13077o = n0(f0VarY.f13091a);
    }

    private int n0(View view) {
        int id5 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id5 = view.getId();
            }
        }
        return id5;
    }

    private String o0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void p(f0 f0Var, f0 f0Var2, m.c cVar, m.c cVar2, boolean z15, boolean z16) {
        f0Var.I(false);
        if (z15) {
            i(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z16) {
                i(f0Var2);
            }
            f0Var.f13098h = f0Var2;
            i(f0Var);
            this.f13014c.O(f0Var);
            f0Var2.I(false);
            f0Var2.f13099i = f0Var;
        }
        if (this.f13030r0.b(f0Var, f0Var2, cVar, cVar2)) {
            T0();
        }
    }

    private float q0(int i15) {
        double dLog = Math.log((Math.abs(i15) * 0.35f) / (this.f13010a * 0.015f));
        float f15 = f13000f1;
        return (float) (((double) (this.f13010a * 0.015f)) * Math.exp((((double) f15) / (((double) f15) - 1.0d)) * dLog));
    }

    private void r0(long j15, f0 f0Var, f0 f0Var2) {
        int iG = this.f13017f.g();
        for (int i15 = 0; i15 < iG; i15++) {
            f0 f0VarL0 = l0(this.f13017f.f(i15));
            if (f0VarL0 != f0Var && i0(f0VarL0) == j15) {
                h hVar = this.f13025n;
                if (hVar == null || !hVar.k()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f0VarL0 + " \n View Holder 2:" + f0Var + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f0VarL0 + " \n View Holder 2:" + f0Var + V());
            }
        }
        c2.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + V());
    }

    private void r1(h<?> hVar, boolean z15, boolean z16) {
        h hVar2 = this.f13025n;
        if (hVar2 != null) {
            hVar2.B(this.f13012b);
            this.f13025n.u(this);
        }
        if (!z15 || z16) {
            d1();
        }
        this.f13016e.y();
        h<?> hVar3 = this.f13025n;
        this.f13025n = hVar;
        if (hVar != null) {
            hVar.z(this.f13012b);
            hVar.q(this);
        }
        p pVar = this.f13026p;
        if (pVar != null) {
            pVar.I0(hVar3, this.f13025n);
        }
        this.f13014c.y(hVar3, this.f13025n, z15);
        this.J0.f13069g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z15) {
        f12997c1 = z15;
    }

    public static void setVerboseLoggingEnabled(boolean z15) {
        f12998d1 = z15;
    }

    private void t() {
        l1();
        setScrollState(0);
    }

    private boolean t0() {
        int iG = this.f13017f.g();
        for (int i15 = 0; i15 < iG; i15++) {
            f0 f0VarL0 = l0(this.f13017f.f(i15));
            if (f0VarL0 != null && !f0VarL0.L() && f0VarL0.A()) {
                return true;
            }
        }
        return false;
    }

    private boolean t1(EdgeEffect edgeEffect, int i15, int i16) {
        if (i15 > 0) {
            return true;
        }
        return q0(-i15) < androidx.core.widget.d.b(edgeEffect) * ((float) i16);
    }

    static void u(f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.f13092b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.f13091a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f0Var.f13092b = null;
        }
    }

    @SuppressLint({"InlinedApi"})
    private void v0() {
        if (l0.x(this) == 0) {
            l0.p0(this, 8);
        }
    }

    private void w0() {
        this.f13017f = new androidx.recyclerview.widget.f(new e());
    }

    private int y(int i15, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i16) {
        if (i15 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i16) / 4.0f) * androidx.core.widget.d.d(edgeEffect, ((-i15) * 4.0f) / i16, 0.5f));
            if (iRound != i15) {
                edgeEffect.finish();
            }
            return i15 - iRound;
        }
        if (i15 >= 0 || edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
            return i15;
        }
        float f15 = i16;
        int iRound2 = Math.round((f15 / 4.0f) * androidx.core.widget.d.d(edgeEffect2, (i15 * 4.0f) / f15, 0.5f));
        if (iRound2 != i15) {
            edgeEffect2.finish();
        }
        return i15 - iRound2;
    }

    void A() {
        if (!this.f13044z || this.I) {
            e6.l.a("RV FullInvalidate");
            H();
            e6.l.b();
            return;
        }
        if (this.f13016e.p()) {
            if (!this.f13016e.o(4) || this.f13016e.o(11)) {
                if (this.f13016e.p()) {
                    e6.l.a("RV FullInvalidate");
                    H();
                    e6.l.b();
                    return;
                }
                return;
            }
            e6.l.a("RV PartialInvalidate");
            A1();
            N0();
            this.f13016e.w();
            if (!this.B) {
                if (t0()) {
                    H();
                } else {
                    this.f13016e.i();
                }
            }
            D1(true);
            O0();
            e6.l.b();
        }
    }

    public boolean A0() {
        return this.L > 0;
    }

    void A1() {
        int i15 = this.A + 1;
        this.A = i15;
        if (i15 != 1 || this.C) {
            return;
        }
        this.B = false;
    }

    public boolean B1(int i15, int i16) {
        return getScrollingChildHelper().p(i15, i16);
    }

    void C(int i15, int i16) {
        setMeasuredDimension(p.s(i15, getPaddingLeft() + getPaddingRight(), l0.A(this)), p.s(i16, getPaddingTop() + getPaddingBottom(), l0.z(this)));
    }

    void C0(int i15) {
        if (this.f13026p == null) {
            return;
        }
        setScrollState(2);
        this.f13026p.B1(i15);
        awakenScrollBars();
    }

    void D0() {
        int iJ = this.f13017f.j();
        for (int i15 = 0; i15 < iJ; i15++) {
            ((q) this.f13017f.i(i15).getLayoutParams()).f13155c = true;
        }
        this.f13014c.s();
    }

    void D1(boolean z15) {
        if (this.A < 1) {
            if (f12997c1) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.A = 1;
        }
        if (!z15 && !this.C) {
            this.B = false;
        }
        if (this.A == 1) {
            if (z15 && this.B && !this.C && this.f13026p != null && this.f13025n != null) {
                H();
            }
            if (!this.C) {
                this.B = false;
            }
        }
        this.A--;
    }

    void E(View view) {
        f0 f0VarL0 = l0(view);
        L0(view);
        h hVar = this.f13025n;
        if (hVar != null && f0VarL0 != null) {
            hVar.w(f0VarL0);
        }
        List<r> list = this.H;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.H.get(size).b(view);
            }
        }
    }

    void E0() {
        int iJ = this.f13017f.j();
        for (int i15 = 0; i15 < iJ; i15++) {
            f0 f0VarL0 = l0(this.f13017f.i(i15));
            if (f0VarL0 != null && !f0VarL0.L()) {
                f0VarL0.b(6);
            }
        }
        D0();
        this.f13014c.t();
    }

    public void E1(int i15) {
        getScrollingChildHelper().r(i15);
    }

    void F(View view) {
        f0 f0VarL0 = l0(view);
        M0(view);
        h hVar = this.f13025n;
        if (hVar != null && f0VarL0 != null) {
            hVar.x(f0VarL0);
        }
        List<r> list = this.H;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.H.get(size).a(view);
            }
        }
    }

    public void F1() {
        setScrollState(0);
        G1();
    }

    public void G0(int i15) {
        int iG = this.f13017f.g();
        for (int i16 = 0; i16 < iG; i16++) {
            this.f13017f.f(i16).offsetLeftAndRight(i15);
        }
    }

    void H() {
        if (this.f13025n == null) {
            c2.g("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f13026p == null) {
            c2.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.J0.f13072j = false;
        boolean z15 = this.Y0 && !(this.Z0 == getWidth() && this.f13011a1 == getHeight());
        this.Z0 = 0;
        this.f13011a1 = 0;
        this.Y0 = false;
        if (this.J0.f13067e == 1) {
            I();
            this.f13026p.D1(this);
            J();
        } else if (this.f13016e.q() || z15 || this.f13026p.s0() != getWidth() || this.f13026p.b0() != getHeight()) {
            this.f13026p.D1(this);
            J();
        } else {
            this.f13026p.D1(this);
        }
        K();
    }

    public void H0(int i15) {
        int iG = this.f13017f.g();
        for (int i16 = 0; i16 < iG; i16++) {
            this.f13017f.f(i16).offsetTopAndBottom(i15);
        }
    }

    void H1(int i15, int i16, Object obj) {
        int i17;
        int iJ = this.f13017f.j();
        int i18 = i15 + i16;
        for (int i19 = 0; i19 < iJ; i19++) {
            View viewI = this.f13017f.i(i19);
            f0 f0VarL0 = l0(viewI);
            if (f0VarL0 != null && !f0VarL0.L() && (i17 = f0VarL0.f13093c) >= i15 && i17 < i18) {
                f0VarL0.b(2);
                f0VarL0.a(obj);
                ((q) viewI.getLayoutParams()).f13155c = true;
            }
        }
        this.f13014c.R(i15, i16);
    }

    void I0(int i15, int i16) {
        int iJ = this.f13017f.j();
        for (int i17 = 0; i17 < iJ; i17++) {
            f0 f0VarL0 = l0(this.f13017f.i(i17));
            if (f0VarL0 != null && !f0VarL0.L() && f0VarL0.f13093c >= i15) {
                if (f12998d1) {
                    f0VarL0.toString();
                }
                f0VarL0.C(i16, false);
                this.J0.f13069g = true;
            }
        }
        this.f13014c.v(i15, i16);
        requestLayout();
    }

    void J0(int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i25;
        int iJ = this.f13017f.j();
        if (i15 < i16) {
            i19 = -1;
            i18 = i15;
            i17 = i16;
        } else {
            i17 = i15;
            i18 = i16;
            i19 = 1;
        }
        for (int i26 = 0; i26 < iJ; i26++) {
            f0 f0VarL0 = l0(this.f13017f.i(i26));
            if (f0VarL0 != null && (i25 = f0VarL0.f13093c) >= i18 && i25 <= i17) {
                if (f12998d1) {
                    f0VarL0.toString();
                }
                if (f0VarL0.f13093c == i15) {
                    f0VarL0.C(i16 - i15, false);
                } else {
                    f0VarL0.C(i19, false);
                }
                this.J0.f13069g = true;
            }
        }
        this.f13014c.w(i15, i16);
        requestLayout();
    }

    void K0(int i15, int i16, boolean z15) {
        int i17 = i15 + i16;
        int iJ = this.f13017f.j();
        for (int i18 = 0; i18 < iJ; i18++) {
            f0 f0VarL0 = l0(this.f13017f.i(i18));
            if (f0VarL0 != null && !f0VarL0.L()) {
                int i19 = f0VarL0.f13093c;
                if (i19 >= i17) {
                    if (f12998d1) {
                        f0VarL0.toString();
                    }
                    f0VarL0.C(-i16, z15);
                    this.J0.f13069g = true;
                } else if (i19 >= i15) {
                    if (f12998d1) {
                        f0VarL0.toString();
                    }
                    f0VarL0.i(i15 - 1, -i16, z15);
                    this.J0.f13069g = true;
                }
            }
        }
        this.f13014c.x(i15, i16, z15);
        requestLayout();
    }

    public boolean L(int i15, int i16, int[] iArr, int[] iArr2, int i17) {
        return getScrollingChildHelper().d(i15, i16, iArr, iArr2, i17);
    }

    public void L0(View view) {
    }

    public final void M(int i15, int i16, int i17, int i18, int[] iArr, int i19, int[] iArr2) {
        getScrollingChildHelper().e(i15, i16, i17, i18, iArr, i19, iArr2);
    }

    public void M0(View view) {
    }

    void N(int i15) {
        p pVar = this.f13026p;
        if (pVar != null) {
            pVar.i1(i15);
        }
        R0(i15);
        u uVar = this.K0;
        if (uVar != null) {
            uVar.a(this, i15);
        }
        List<u> list = this.L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.L0.get(size).a(this, i15);
            }
        }
    }

    void N0() {
        this.L++;
    }

    void O(int i15, int i16) {
        this.O++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i15, scrollY - i16);
        S0(i15, i16);
        u uVar = this.K0;
        if (uVar != null) {
            uVar.b(this, i15, i16);
        }
        List<u> list = this.L0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.L0.get(size).b(this, i15, i16);
            }
        }
        this.O--;
    }

    void O0() {
        P0(true);
    }

    void P() {
        int i15;
        for (int size = this.W0.size() - 1; size >= 0; size--) {
            f0 f0Var = this.W0.get(size);
            if (f0Var.f13091a.getParent() == this && !f0Var.L() && (i15 = f0Var.f13107q) != -1) {
                l0.n0(f0Var.f13091a, i15);
                f0Var.f13107q = -1;
            }
        }
        this.W0.clear();
    }

    void P0(boolean z15) {
        int i15 = this.L - 1;
        this.L = i15;
        if (i15 < 1) {
            if (f12997c1 && i15 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.L = 0;
            if (z15) {
                G();
                P();
            }
        }
    }

    void R() {
        if (this.f13028q0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.P.a(this, 3);
        this.f13028q0 = edgeEffectA;
        if (this.f13019h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void R0(int i15) {
    }

    void S() {
        if (this.R != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.P.a(this, 0);
        this.R = edgeEffectA;
        if (this.f13019h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void S0(int i15, int i16) {
    }

    void T() {
        if (this.f13020h0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.P.a(this, 2);
        this.f13020h0 = edgeEffectA;
        if (this.f13019h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T0() {
        if (this.P0 || !this.f13038w) {
            return;
        }
        l0.Z(this, this.X0);
        this.P0 = true;
    }

    void U() {
        if (this.T != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.P.a(this, 1);
        this.T = edgeEffectA;
        if (this.f13019h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String V() {
        return " " + super.toString() + ", adapter:" + this.f13025n + ", layout:" + this.f13026p + ", context:" + getContext();
    }

    final void W(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.f13078p = 0;
            b0Var.f13079q = 0;
        } else {
            OverScroller overScroller = this.G0.f13084c;
            b0Var.f13078p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f13079q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void W0(boolean z15) {
        this.K = z15 | this.K;
        this.I = true;
        E0();
    }

    public View X(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public f0 Y(View view) {
        View viewX = X(view);
        if (viewX == null) {
            return null;
        }
        return k0(viewX);
    }

    void Y0(f0 f0Var, m.c cVar) {
        f0Var.H(0, PKIFailureInfo.certRevoked);
        if (this.J0.f13071i && f0Var.A() && !f0Var.x() && !f0Var.L()) {
            this.f13018g.c(i0(f0Var), f0Var);
        }
        this.f13018g.e(f0Var, cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i15, int i16) {
        p pVar = this.f13026p;
        if (pVar == null || !pVar.J0(this, arrayList, i15, i16)) {
            super.addFocusables(arrayList, i15, i16);
        }
    }

    void b(int i15, int i16) {
        if (i15 < 0) {
            S();
            if (this.R.isFinished()) {
                this.R.onAbsorb(-i15);
            }
        } else if (i15 > 0) {
            T();
            if (this.f13020h0.isFinished()) {
                this.f13020h0.onAbsorb(i15);
            }
        }
        if (i16 < 0) {
            U();
            if (this.T.isFinished()) {
                this.T.onAbsorb(-i16);
            }
        } else if (i16 > 0) {
            R();
            if (this.f13028q0.isFinished()) {
                this.f13028q0.onAbsorb(i16);
            }
        }
        if (i15 == 0 && i16 == 0) {
            return;
        }
        l0.Y(this);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f13026p.r((q) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        p pVar = this.f13026p;
        if (pVar != null && pVar.p()) {
            return this.f13026p.v(this.J0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        p pVar = this.f13026p;
        if (pVar != null && pVar.p()) {
            return this.f13026p.w(this.J0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        p pVar = this.f13026p;
        if (pVar != null && pVar.p()) {
            return this.f13026p.x(this.J0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        p pVar = this.f13026p;
        if (pVar != null && pVar.q()) {
            return this.f13026p.y(this.J0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        p pVar = this.f13026p;
        if (pVar != null && pVar.q()) {
            return this.f13026p.z(this.J0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        p pVar = this.f13026p;
        if (pVar != null && pVar.q()) {
            return this.f13026p.A(this.J0);
        }
        return 0;
    }

    public f0 d0(int i15) {
        f0 f0Var = null;
        if (this.I) {
            return null;
        }
        int iJ = this.f13017f.j();
        for (int i16 = 0; i16 < iJ; i16++) {
            f0 f0VarL0 = l0(this.f13017f.i(i16));
            if (f0VarL0 != null && !f0VarL0.x() && h0(f0VarL0) == i15) {
                if (!this.f13017f.n(f0VarL0.f13091a)) {
                    return f0VarL0;
                }
                f0Var = f0VarL0;
            }
        }
        return f0Var;
    }

    void d1() {
        m mVar = this.f13030r0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f13026p;
        if (pVar != null) {
            pVar.o1(this.f13014c);
            this.f13026p.p1(this.f13014c);
        }
        this.f13014c.c();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f15, float f16, boolean z15) {
        return getScrollingChildHelper().a(f15, f16, z15);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f15, float f16) {
        return getScrollingChildHelper().b(f15, f16);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i15, int i16, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i15, i16, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i15, int i16, int i17, int i18, int[] iArr) {
        return getScrollingChildHelper().f(i15, i16, i17, i18, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z15;
        super.draw(canvas);
        int size = this.f13031s.size();
        boolean z16 = false;
        for (int i15 = 0; i15 < size; i15++) {
            this.f13031s.get(i15).i(canvas, this, this.J0);
        }
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z15 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f13019h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.R;
            z15 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f13019h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.T;
            z15 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f13020h0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f13019h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f13020h0;
            z15 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f13028q0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f13019h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f13028q0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z16 = true;
            }
            z15 |= z16;
            canvas.restoreToCount(iSave4);
        }
        if ((z15 || this.f13030r0 == null || this.f13031s.size() <= 0 || !this.f13030r0.p()) ? z15 : true) {
            l0.Y(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j15) {
        return super.drawChild(canvas, view, j15);
    }

    public f0 e0(long j15) {
        h hVar = this.f13025n;
        f0 f0Var = null;
        if (hVar != null && hVar.k()) {
            int iJ = this.f13017f.j();
            for (int i15 = 0; i15 < iJ; i15++) {
                f0 f0VarL0 = l0(this.f13017f.i(i15));
                if (f0VarL0 != null && !f0VarL0.x() && f0VarL0.m() == j15) {
                    if (!this.f13017f.n(f0VarL0.f13091a)) {
                        return f0VarL0;
                    }
                    f0Var = f0VarL0;
                }
            }
        }
        return f0Var;
    }

    boolean e1(View view) {
        A1();
        boolean zR = this.f13017f.r(view);
        if (zR) {
            f0 f0VarL0 = l0(view);
            this.f13014c.O(f0VarL0);
            this.f13014c.H(f0VarL0);
            if (f12998d1) {
                Objects.toString(view);
                toString();
            }
        }
        D1(!zR);
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    f0 f0(int i15, boolean z15) {
        int iJ = this.f13017f.j();
        f0 f0Var = null;
        for (int i16 = 0; i16 < iJ; i16++) {
            f0 f0VarL0 = l0(this.f13017f.i(i16));
            if (f0VarL0 != null && !f0VarL0.x()) {
                if (z15) {
                    if (f0VarL0.f13093c != i15) {
                        continue;
                    } else {
                        if (this.f13017f.n(f0VarL0.f13091a)) {
                            return f0VarL0;
                        }
                        f0Var = f0VarL0;
                    }
                } else if (f0VarL0.o() != i15) {
                    continue;
                } else {
                    if (this.f13017f.n(f0VarL0.f13091a)) {
                        return f0VarL0;
                    }
                    f0Var = f0VarL0;
                }
            }
        }
        return f0Var;
    }

    public void f1(o oVar) {
        p pVar = this.f13026p;
        if (pVar != null) {
            pVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f13031s.remove(oVar);
        if (this.f13031s.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        D0();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i15) {
        View viewN0;
        boolean z15;
        View viewU0 = this.f13026p.U0(view, i15);
        if (viewU0 != null) {
            return viewU0;
        }
        boolean z16 = (this.f13025n == null || this.f13026p == null || A0() || this.C) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z16 && (i15 == 2 || i15 == 1)) {
            if (this.f13026p.q()) {
                int i16 = i15 == 2 ? 130 : 33;
                z15 = focusFinder.findNextFocus(this, view, i16) == null;
                if (f13005k1) {
                    i15 = i16;
                }
            } else {
                z15 = false;
            }
            if (!z15 && this.f13026p.p()) {
                int i17 = (this.f13026p.d0() == 1) ^ (i15 == 2) ? 66 : 17;
                boolean z17 = focusFinder.findNextFocus(this, view, i17) == null;
                if (f13005k1) {
                    i15 = i17;
                }
                z15 = z17;
            }
            if (z15) {
                A();
                if (X(view) == null) {
                    return null;
                }
                A1();
                this.f13026p.N0(view, i15, this.f13014c, this.J0);
                D1(false);
            }
            viewN0 = focusFinder.findNextFocus(this, view, i15);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i15);
            if (viewFindNextFocus == null && z16) {
                A();
                if (X(view) == null) {
                    return null;
                }
                A1();
                viewN0 = this.f13026p.N0(view, i15, this.f13014c, this.J0);
                D1(false);
            } else {
                viewN0 = viewFindNextFocus;
            }
        }
        if (viewN0 == null || viewN0.hasFocusable()) {
            return B0(view, viewN0, i15) ? viewN0 : super.focusSearch(view, i15);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i15);
        }
        j1(viewN0, null);
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean g0(int i15, int i16) {
        int iMax;
        int i17;
        p pVar = this.f13026p;
        if (pVar == null) {
            c2.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.C) {
            return false;
        }
        int iP = pVar.p();
        boolean zQ = this.f13026p.q();
        if (iP == 0 || Math.abs(i15) < this.B0) {
            i15 = 0;
        }
        if (!zQ || Math.abs(i16) < this.B0) {
            i16 = 0;
        }
        if (i15 == 0 && i16 == 0) {
            return false;
        }
        if (i15 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.R;
            if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f13020h0;
                if (edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (t1(this.f13020h0, i15, getWidth())) {
                    this.f13020h0.onAbsorb(i15);
                    i15 = 0;
                }
            } else {
                int i18 = -i15;
                if (t1(this.R, i18, getWidth())) {
                    this.R.onAbsorb(i18);
                    i15 = 0;
                }
            }
            iMax = i15;
            i15 = 0;
        }
        if (i16 == 0) {
            i17 = i16;
            i16 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.T;
            if (edgeEffect3 == null || androidx.core.widget.d.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f13028q0;
                if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f) {
                    i17 = i16;
                    i16 = 0;
                } else if (t1(this.f13028q0, i16, getHeight())) {
                    this.f13028q0.onAbsorb(i16);
                    i16 = 0;
                }
            } else {
                int i19 = -i16;
                if (t1(this.T, i19, getHeight())) {
                    this.T.onAbsorb(i19);
                    i16 = 0;
                }
            }
            i17 = 0;
        }
        if (iMax != 0 || i16 != 0) {
            int i25 = this.C0;
            iMax = Math.max(-i25, Math.min(iMax, i25));
            int i26 = this.C0;
            i16 = Math.max(-i26, Math.min(i16, i26));
            this.G0.b(iMax, i16);
        }
        if (i15 == 0 && i17 == 0) {
            return (iMax == 0 && i16 == 0) ? false : true;
        }
        float f15 = i15;
        float f16 = i17;
        if (!dispatchNestedPreFling(f15, f16)) {
            boolean z15 = iP != 0 || zQ;
            dispatchNestedFling(f15, f16, z15);
            s sVar = this.A0;
            if (sVar != null && sVar.a(i15, i17)) {
                return true;
            }
            if (z15) {
                if (zQ) {
                    iP = (iP == true ? 1 : 0) | 2;
                }
                B1(iP, 1);
                int i27 = this.C0;
                int iMax2 = Math.max(-i27, Math.min(i15, i27));
                int i28 = this.C0;
                this.G0.b(iMax2, Math.max(-i28, Math.min(i17, i28)));
                return true;
            }
        }
        return false;
    }

    public void g1(t tVar) {
        this.f13033t.remove(tVar);
        if (this.f13036v == tVar) {
            this.f13036v = null;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f13026p;
        if (pVar != null) {
            return pVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f13026p;
        if (pVar != null) {
            return pVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f13025n;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f13026p;
        return pVar != null ? pVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i15, int i16) {
        return super.getChildDrawingOrder(i15, i16);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f13019h;
    }

    public androidx.recyclerview.widget.r getCompatAccessibilityDelegate() {
        return this.Q0;
    }

    public l getEdgeEffectFactory() {
        return this.P;
    }

    public m getItemAnimator() {
        return this.f13030r0;
    }

    public int getItemDecorationCount() {
        return this.f13031s.size();
    }

    public p getLayoutManager() {
        return this.f13026p;
    }

    public int getMaxFlingVelocity() {
        return this.C0;
    }

    public int getMinFlingVelocity() {
        return this.B0;
    }

    long getNanoTime() {
        if (f13004j1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.A0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.F0;
    }

    public v getRecycledViewPool() {
        return this.f13014c.i();
    }

    public int getScrollState() {
        return this.f13032s0;
    }

    int h0(f0 f0Var) {
        if (f0Var.r(524) || !f0Var.u()) {
            return -1;
        }
        return this.f13016e.e(f0Var.f13093c);
    }

    public void h1(u uVar) {
        List<u> list = this.L0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    long i0(f0 f0Var) {
        return this.f13025n.k() ? f0Var.m() : f0Var.f13093c;
    }

    void i1() {
        f0 f0Var;
        int iG = this.f13017f.g();
        for (int i15 = 0; i15 < iG; i15++) {
            View viewF = this.f13017f.f(i15);
            f0 f0VarK0 = k0(viewF);
            if (f0VarK0 != null && (f0Var = f0VarK0.f13099i) != null) {
                View view = f0Var.f13091a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f13038w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.C;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(o oVar) {
        k(oVar, -1);
    }

    public int j0(View view) {
        f0 f0VarL0 = l0(view);
        if (f0VarL0 != null) {
            return f0VarL0.o();
        }
        return -1;
    }

    public void k(o oVar, int i15) {
        p pVar = this.f13026p;
        if (pVar != null) {
            pVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f13031s.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i15 < 0) {
            this.f13031s.add(oVar);
        } else {
            this.f13031s.add(i15, oVar);
        }
        D0();
        requestLayout();
    }

    public f0 k0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return l0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void l(r rVar) {
        if (this.H == null) {
            this.H = new ArrayList();
        }
        this.H.add(rVar);
    }

    public void m(t tVar) {
        this.f13033t.add(tVar);
    }

    public void n(u uVar) {
        if (this.L0 == null) {
            this.L0 = new ArrayList();
        }
        this.L0.add(uVar);
    }

    void n1() {
        int iJ = this.f13017f.j();
        for (int i15 = 0; i15 < iJ; i15++) {
            f0 f0VarL0 = l0(this.f13017f.i(i15));
            if (f12997c1 && f0VarL0.f13093c == -1 && !f0VarL0.x()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!f0VarL0.L()) {
                f0VarL0.G();
            }
        }
    }

    void o(f0 f0Var, m.c cVar, m.c cVar2) {
        f0Var.I(false);
        if (this.f13030r0.a(f0Var, cVar, cVar2)) {
            T0();
        }
    }

    boolean o1(int i15, int i16, MotionEvent motionEvent, int i17) {
        int i18;
        int i19;
        int i25;
        int i26;
        A();
        if (this.f13025n != null) {
            int[] iArr = this.V0;
            iArr[0] = 0;
            iArr[1] = 0;
            p1(i15, i16, iArr);
            int[] iArr2 = this.V0;
            int i27 = iArr2[0];
            int i28 = iArr2[1];
            i25 = i15 - i27;
            i26 = i16 - i28;
            i19 = i28;
            i18 = i27;
        } else {
            i18 = 0;
            i19 = 0;
            i25 = 0;
            i26 = 0;
        }
        if (!this.f13031s.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.V0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i18, i19, i25, i26, this.T0, i17, iArr3);
        int[] iArr4 = this.V0;
        int i29 = iArr4[0];
        int i35 = i25 - i29;
        int i36 = iArr4[1];
        int i37 = i26 - i36;
        boolean z15 = (i29 == 0 && i36 == 0) ? false : true;
        int i38 = this.f13041x0;
        int[] iArr5 = this.T0;
        int i39 = iArr5[0];
        this.f13041x0 = i38 - i39;
        int i45 = this.f13043y0;
        int i46 = iArr5[1];
        this.f13043y0 = i45 - i46;
        int[] iArr6 = this.U0;
        iArr6[0] = iArr6[0] + i39;
        iArr6[1] = iArr6[1] + i46;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !j6.s.a(motionEvent, 8194)) {
                X0(motionEvent.getX(), i35, motionEvent.getY(), i37);
            }
            w(i15, i16);
        }
        if (i18 != 0 || i19 != 0) {
            O(i18, i19);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z15 && i18 == 0 && i19 == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.L = 0;
        this.f13038w = true;
        this.f13044z = this.f13044z && !isLayoutRequested();
        this.f13014c.z();
        p pVar = this.f13026p;
        if (pVar != null) {
            pVar.E(this);
        }
        this.P0 = false;
        if (f13004j1) {
            ThreadLocal<androidx.recyclerview.widget.j> threadLocal = androidx.recyclerview.widget.j.f13371e;
            androidx.recyclerview.widget.j jVar = threadLocal.get();
            this.H0 = jVar;
            if (jVar == null) {
                this.H0 = new androidx.recyclerview.widget.j();
                Display displayT = l0.t(this);
                if (isInEditMode() || displayT == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayT.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.j jVar2 = this.H0;
                jVar2.f13375c = (long) (1.0E9f / refreshRate);
                threadLocal.set(jVar2);
            }
            this.H0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.j jVar;
        super.onDetachedFromWindow();
        m mVar = this.f13030r0;
        if (mVar != null) {
            mVar.k();
        }
        F1();
        this.f13038w = false;
        p pVar = this.f13026p;
        if (pVar != null) {
            pVar.F(this, this.f13014c);
        }
        this.W0.clear();
        removeCallbacks(this.X0);
        this.f13018g.j();
        this.f13014c.A();
        q6.a.c(this);
        if (!f13004j1 || (jVar = this.H0) == null) {
            return;
        }
        jVar.j(this);
        this.H0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f13031s.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f13031s.get(i15).g(canvas, this, this.J0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f15;
        float axisValue;
        if (this.f13026p != null && !this.C && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f15 = this.f13026p.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f13026p.p() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f13026p.q()) {
                    f15 = -axisValue2;
                } else if (this.f13026p.p()) {
                    axisValue = axisValue2;
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f15 = 0.0f;
                axisValue = 0.0f;
            }
            if (f15 != 0.0f || axisValue != 0.0f) {
                F0((int) (axisValue * this.D0), (int) (f15 * this.E0), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z15;
        if (this.C) {
            return false;
        }
        this.f13036v = null;
        if (Z(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.f13026p;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f13026p.q();
        if (this.f13035u0 == null) {
            this.f13035u0 = VelocityTracker.obtain();
        }
        this.f13035u0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.D) {
                this.D = false;
            }
            this.f13034t0 = motionEvent.getPointerId(0);
            int x15 = (int) (motionEvent.getX() + 0.5f);
            this.f13041x0 = x15;
            this.f13037v0 = x15;
            int y15 = (int) (motionEvent.getY() + 0.5f);
            this.f13043y0 = y15;
            this.f13039w0 = y15;
            if (C1(motionEvent) || this.f13032s0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                E1(1);
            }
            int[] iArr = this.U0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i15 = zP;
            if (zQ) {
                i15 = (zP ? 1 : 0) | 2;
            }
            B1(i15, 0);
        } else if (actionMasked == 1) {
            this.f13035u0.clear();
            E1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f13034t0);
            if (iFindPointerIndex < 0) {
                c2.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f13034t0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x16 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y16 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f13032s0 != 1) {
                int i16 = x16 - this.f13037v0;
                int i17 = y16 - this.f13039w0;
                if (!zP || Math.abs(i16) <= this.f13045z0) {
                    z15 = false;
                } else {
                    this.f13041x0 = x16;
                    z15 = true;
                }
                if (zQ && Math.abs(i17) > this.f13045z0) {
                    this.f13043y0 = y16;
                    z15 = true;
                }
                if (z15) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.f13034t0 = motionEvent.getPointerId(actionIndex);
            int x17 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f13041x0 = x17;
            this.f13037v0 = x17;
            int y17 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f13043y0 = y17;
            this.f13039w0 = y17;
        } else if (actionMasked == 6) {
            Q0(motionEvent);
        }
        return this.f13032s0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        e6.l.a("RV OnLayout");
        H();
        e6.l.b();
        this.f13044z = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        p pVar = this.f13026p;
        if (pVar == null) {
            C(i15, i16);
            return;
        }
        boolean z15 = false;
        if (pVar.w0()) {
            int mode = View.MeasureSpec.getMode(i15);
            int mode2 = View.MeasureSpec.getMode(i16);
            this.f13026p.d1(this.f13014c, this.J0, i15, i16);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z15 = true;
            }
            this.Y0 = z15;
            if (z15 || this.f13025n == null) {
                return;
            }
            if (this.J0.f13067e == 1) {
                I();
            }
            this.f13026p.E1(i15, i16);
            this.J0.f13072j = true;
            J();
            this.f13026p.H1(i15, i16);
            if (this.f13026p.K1()) {
                this.f13026p.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.J0.f13072j = true;
                J();
                this.f13026p.H1(i15, i16);
            }
            this.Z0 = getMeasuredWidth();
            this.f13011a1 = getMeasuredHeight();
            return;
        }
        if (this.f13040x) {
            this.f13026p.d1(this.f13014c, this.J0, i15, i16);
            return;
        }
        if (this.F) {
            A1();
            N0();
            V0();
            O0();
            b0 b0Var = this.J0;
            if (b0Var.f13074l) {
                b0Var.f13070h = true;
            } else {
                this.f13016e.j();
                this.J0.f13070h = false;
            }
            this.F = false;
            D1(false);
        } else if (this.J0.f13074l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f13025n;
        if (hVar != null) {
            this.J0.f13068f = hVar.g();
        } else {
            this.J0.f13068f = 0;
        }
        A1();
        this.f13026p.d1(this.f13014c, this.J0, i15, i16);
        D1(false);
        this.J0.f13070h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i15, Rect rect) {
        if (A0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i15, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f13015d = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f13015d;
        if (zVar2 != null) {
            zVar.b(zVar2);
            return zVar;
        }
        p pVar = this.f13026p;
        if (pVar != null) {
            zVar.f13173c = pVar.h1();
            return zVar;
        }
        zVar.f13173c = null;
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i15, int i16, int i17, int i18) {
        super.onSizeChanged(i15, i16, i17, i18);
        if (i15 == i17 && i16 == i18) {
            return;
        }
        y0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i15;
        boolean z15;
        if (this.C || this.D) {
            return false;
        }
        if (Q(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.f13026p;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f13026p.q();
        if (this.f13035u0 == null) {
            this.f13035u0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.U0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.U0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f13035u0.addMovement(motionEventObtain);
                this.f13035u0.computeCurrentVelocity(1000, this.C0);
                float f15 = zP ? -this.f13035u0.getXVelocity(this.f13034t0) : 0.0f;
                float f16 = zQ ? -this.f13035u0.getYVelocity(this.f13034t0) : 0.0f;
                if ((f15 == 0.0f && f16 == 0.0f) || !g0((int) f15, (int) f16)) {
                    setScrollState(0);
                }
                l1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f13034t0);
                if (iFindPointerIndex < 0) {
                    c2.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f13034t0 + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x15 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y15 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f13041x0 - x15;
                int iMax2 = this.f13043y0 - y15;
                if (this.f13032s0 != 1) {
                    if (zP) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.f13045z0) : Math.min(0, iMax + this.f13045z0);
                        if (iMax != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                    if (zQ) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f13045z0) : Math.min(0, iMax2 + this.f13045z0);
                        if (iMax2 != 0) {
                            z15 = true;
                        }
                    }
                    if (z15) {
                        setScrollState(1);
                    }
                }
                if (this.f13032s0 == 1) {
                    int[] iArr3 = this.V0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iB1 = iMax - b1(iMax, motionEvent.getY());
                    int iC1 = iMax2 - c1(iMax2, motionEvent.getX());
                    if (L(zP ? iB1 : 0, zQ ? iC1 : 0, this.V0, this.T0, 0)) {
                        int[] iArr4 = this.V0;
                        iB1 -= iArr4[0];
                        iC1 -= iArr4[1];
                        int[] iArr5 = this.U0;
                        int i16 = iArr5[0];
                        int[] iArr6 = this.T0;
                        iArr5[0] = i16 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.T0;
                    this.f13041x0 = x15 - iArr7[0];
                    this.f13043y0 = y15 - iArr7[1];
                    if (o1(zP ? iB1 : 0, zQ ? iC1 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.j jVar = this.H0;
                    if (jVar != null && (iB1 != 0 || iC1 != 0)) {
                        jVar.f(this, iB1, iC1);
                    }
                }
            } else if (actionMasked == 3) {
                t();
            } else if (actionMasked == 5) {
                this.f13034t0 = motionEvent.getPointerId(actionIndex);
                int x16 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f13041x0 = x16;
                this.f13037v0 = x16;
                int y16 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f13043y0 = y16;
                this.f13039w0 = y16;
            } else if (actionMasked == 6) {
                Q0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.f13034t0 = motionEvent.getPointerId(0);
        int x17 = (int) (motionEvent.getX() + 0.5f);
        this.f13041x0 = x17;
        this.f13037v0 = x17;
        int y17 = (int) (motionEvent.getY() + 0.5f);
        this.f13043y0 = y17;
        this.f13039w0 = y17;
        if (zQ) {
            i15 = zP;
            i15 = (zP ? 1 : 0) | 2;
        }
        i15 = zP;
        B1(i15, 0);
        this.f13035u0.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    Rect p0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f13155c) {
            return qVar.f13154b;
        }
        if (this.J0.e() && (qVar.b() || qVar.d())) {
            return qVar.f13154b;
        }
        Rect rect = qVar.f13154b;
        rect.set(0, 0, 0, 0);
        int size = this.f13031s.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f13022k.set(0, 0, 0, 0);
            this.f13031s.get(i15).e(this.f13022k, view, this, this.J0);
            int i16 = rect.left;
            Rect rect2 = this.f13022k;
            rect.left = i16 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f13155c = false;
        return rect;
    }

    void p1(int i15, int i16, int[] iArr) {
        A1();
        N0();
        e6.l.a("RV Scroll");
        W(this.J0);
        int iA1 = i15 != 0 ? this.f13026p.A1(i15, this.f13014c, this.J0) : 0;
        int iC1 = i16 != 0 ? this.f13026p.C1(i16, this.f13014c, this.J0) : 0;
        e6.l.b();
        i1();
        O0();
        D1(false);
        if (iArr != null) {
            iArr[0] = iA1;
            iArr[1] = iC1;
        }
    }

    void q(f0 f0Var, m.c cVar, m.c cVar2) {
        i(f0Var);
        f0Var.I(false);
        if (this.f13030r0.c(f0Var, cVar, cVar2)) {
            T0();
        }
    }

    public void q1(int i15) {
        if (this.C) {
            return;
        }
        F1();
        p pVar = this.f13026p;
        if (pVar == null) {
            c2.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.B1(i15);
            awakenScrollBars();
        }
    }

    void r(String str) {
        if (A0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.O > 0) {
            c2.h("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z15) {
        f0 f0VarL0 = l0(view);
        if (f0VarL0 != null) {
            if (f0VarL0.z()) {
                f0VarL0.f();
            } else if (!f0VarL0.L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f0VarL0 + V());
            }
        } else if (f12997c1) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f13026p.f1(this, this.J0, view, view2) && view2 != null) {
            j1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z15) {
        return this.f13026p.v1(this, view, rect, z15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z15) {
        int size = this.f13033t.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f13033t.get(i15).c(z15);
        }
        super.requestDisallowInterceptTouchEvent(z15);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A != 0 || this.C) {
            this.B = true;
        } else {
            super.requestLayout();
        }
    }

    boolean s(f0 f0Var) {
        m mVar = this.f13030r0;
        return mVar == null || mVar.g(f0Var, f0Var.q());
    }

    public boolean s0() {
        return !this.f13044z || this.I || this.f13016e.p();
    }

    boolean s1(f0 f0Var, int i15) {
        if (!A0()) {
            l0.n0(f0Var.f13091a, i15);
            return true;
        }
        f0Var.f13107q = i15;
        this.W0.add(f0Var);
        return false;
    }

    @Override // android.view.View
    public void scrollBy(int i15, int i16) {
        p pVar = this.f13026p;
        if (pVar == null) {
            c2.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f13026p.q();
        if (zP || zQ) {
            if (!zP) {
                i15 = 0;
            }
            if (!zQ) {
                i16 = 0;
            }
            o1(i15, i16, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i15, int i16) {
        c2.g("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (u1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.r rVar) {
        this.Q0 = rVar;
        l0.h0(this, rVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        r1(hVar, false, true);
        W0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z15) {
        if (z15 != this.f13019h) {
            y0();
        }
        this.f13019h = z15;
        super.setClipToPadding(z15);
        if (this.f13044z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        i6.i.g(lVar);
        this.P = lVar;
        y0();
    }

    public void setHasFixedSize(boolean z15) {
        this.f13040x = z15;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f13030r0;
        if (mVar2 != null) {
            mVar2.k();
            this.f13030r0.v(null);
        }
        this.f13030r0 = mVar;
        if (mVar != null) {
            mVar.v(this.O0);
        }
    }

    public void setItemViewCacheSize(int i15) {
        this.f13014c.L(i15);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z15) {
        suppressLayout(z15);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f13026p) {
            return;
        }
        F1();
        if (this.f13026p != null) {
            m mVar = this.f13030r0;
            if (mVar != null) {
                mVar.k();
            }
            this.f13026p.o1(this.f13014c);
            this.f13026p.p1(this.f13014c);
            this.f13014c.c();
            if (this.f13038w) {
                this.f13026p.F(this, this.f13014c);
            }
            this.f13026p.I1(null);
            this.f13026p = null;
        } else {
            this.f13014c.c();
        }
        this.f13017f.o();
        this.f13026p = pVar;
        if (pVar != null) {
            if (pVar.f13130b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f13130b.V());
            }
            pVar.I1(this);
            if (this.f13038w) {
                this.f13026p.E(this);
            }
        }
        this.f13014c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z15) {
        getScrollingChildHelper().m(z15);
    }

    public void setOnFlingListener(s sVar) {
        this.A0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.K0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z15) {
        this.F0 = z15;
    }

    public void setRecycledViewPool(v vVar) {
        this.f13014c.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.f13027q = xVar;
    }

    void setScrollState(int i15) {
        if (i15 == this.f13032s0) {
            return;
        }
        if (f12998d1) {
            new Exception();
        }
        this.f13032s0 = i15;
        if (i15 != 2) {
            G1();
        }
        N(i15);
    }

    public void setScrollingTouchSlop(int i15) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i15 != 0) {
            if (i15 == 1) {
                this.f13045z0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            c2.g("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i15 + "; using default value");
        }
        this.f13045z0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.f13014c.K(d0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i15) {
        return getScrollingChildHelper().o(i15);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z15) {
        if (z15 != this.C) {
            r("Do not suppressLayout in layout or scroll");
            if (z15) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.C = true;
                this.D = true;
                F1();
                return;
            }
            this.C = false;
            if (this.B && this.f13026p != null && this.f13025n != null) {
                requestLayout();
            }
            this.B = false;
        }
    }

    void u0() {
        this.f13016e = new androidx.recyclerview.widget.a(new f());
    }

    boolean u1(AccessibilityEvent accessibilityEvent) {
        if (!A0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? k6.b.a(accessibilityEvent) : 0;
        this.E |= iA != 0 ? iA : 0;
        return true;
    }

    void v() {
        int iJ = this.f13017f.j();
        for (int i15 = 0; i15 < iJ; i15++) {
            f0 f0VarL0 = l0(this.f13017f.i(i15));
            if (!f0VarL0.L()) {
                f0VarL0.c();
            }
        }
        this.f13014c.d();
    }

    public void v1(int i15, int i16) {
        w1(i15, i16, null);
    }

    void w(int i15, int i16) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect == null || edgeEffect.isFinished() || i15 <= 0) {
            zIsFinished = false;
        } else {
            this.R.onRelease();
            zIsFinished = this.R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f13020h0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i15 < 0) {
            this.f13020h0.onRelease();
            zIsFinished |= this.f13020h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i16 > 0) {
            this.T.onRelease();
            zIsFinished |= this.T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f13028q0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i16 < 0) {
            this.f13028q0.onRelease();
            zIsFinished |= this.f13028q0.isFinished();
        }
        if (zIsFinished) {
            l0.Y(this);
        }
    }

    public void w1(int i15, int i16, Interpolator interpolator) {
        x1(i15, i16, interpolator, PKIFailureInfo.systemUnavail);
    }

    int x(int i15) {
        return y(i15, this.R, this.f13020h0, getWidth());
    }

    void x0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(na.b.f133677a), resources.getDimensionPixelSize(na.b.f133679c), resources.getDimensionPixelOffset(na.b.f133678b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void x1(int i15, int i16, Interpolator interpolator, int i17) {
        y1(i15, i16, interpolator, i17, false);
    }

    void y0() {
        this.f13028q0 = null;
        this.T = null;
        this.f13020h0 = null;
        this.R = null;
    }

    void y1(int i15, int i16, Interpolator interpolator, int i17, boolean z15) {
        p pVar = this.f13026p;
        if (pVar == null) {
            c2.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        if (!pVar.p()) {
            i15 = 0;
        }
        if (!this.f13026p.q()) {
            i16 = 0;
        }
        if (i15 == 0 && i16 == 0) {
            return;
        }
        if (i17 != Integer.MIN_VALUE && i17 <= 0) {
            scrollBy(i15, i16);
            return;
        }
        if (z15) {
            int i18 = i15 != 0 ? 1 : 0;
            if (i16 != 0) {
                i18 |= 2;
            }
            B1(i18, 1);
        }
        this.G0.e(i15, i16, i17, interpolator);
    }

    int z(int i15) {
        return y(i15, this.T, this.f13028q0, getHeight());
    }

    boolean z0() {
        AccessibilityManager accessibilityManager = this.G;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void z1(int i15) {
        if (this.C) {
            return;
        }
        p pVar = this.f13026p;
        if (pVar == null) {
            c2.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.M1(this, this.J0, i15);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, na.a.f133676a);
    }

    public static class z extends r6.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f13173c;

        class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i15) {
                return new z[i15];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13173c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f13173c = zVar.f13173c;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeParcelable(this.f13173c, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f13012b = new y();
        this.f13014c = new w();
        this.f13018g = new androidx.recyclerview.widget.w();
        this.f13021j = new a();
        this.f13022k = new Rect();
        this.f13023l = new Rect();
        this.f13024m = new RectF();
        this.f13029r = new ArrayList();
        this.f13031s = new ArrayList<>();
        this.f13033t = new ArrayList<>();
        this.A = 0;
        this.I = false;
        this.K = false;
        this.L = 0;
        this.O = 0;
        this.P = f13009o1;
        this.f13030r0 = new androidx.recyclerview.widget.g();
        this.f13032s0 = 0;
        this.f13034t0 = -1;
        this.D0 = Float.MIN_VALUE;
        this.E0 = Float.MIN_VALUE;
        this.F0 = true;
        this.G0 = new e0();
        this.I0 = f13004j1 ? new androidx.recyclerview.widget.j.b() : null;
        this.J0 = new b0();
        this.M0 = false;
        this.N0 = false;
        this.O0 = new n();
        this.P0 = false;
        this.R0 = new int[2];
        this.T0 = new int[2];
        this.U0 = new int[2];
        this.V0 = new int[2];
        this.W0 = new ArrayList();
        this.X0 = new b();
        this.Z0 = 0;
        this.f13011a1 = 0;
        this.f13013b1 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f13045z0 = viewConfiguration.getScaledTouchSlop();
        this.D0 = o0.e(viewConfiguration, context);
        this.E0 = o0.h(viewConfiguration, context);
        this.B0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.C0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f13010a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f13030r0.v(this.O0);
        u0();
        w0();
        v0();
        if (l0.w(this) == 0) {
            l0.n0(this, 1);
        }
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.r(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, na.c.f133680a, i15, 0);
        l0.f0(this, context, na.c.f133680a, attributeSet, typedArrayObtainStyledAttributes, i15, 0);
        String string = typedArrayObtainStyledAttributes.getString(na.c.f133689j);
        if (typedArrayObtainStyledAttributes.getInt(na.c.f133683d, -1) == -1) {
            setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        }
        this.f13019h = typedArrayObtainStyledAttributes.getBoolean(na.c.f133682c, true);
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(na.c.f133684e, false);
        this.f13042y = z15;
        if (z15) {
            x0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(na.c.f133687h), typedArrayObtainStyledAttributes.getDrawable(na.c.f133688i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(na.c.f133685f), typedArrayObtainStyledAttributes.getDrawable(na.c.f133686g));
        }
        typedArrayObtainStyledAttributes.recycle();
        B(context, string, attributeSet, i15, 0);
        int[] iArr = f12999e1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i15, 0);
        l0.f0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i15, 0);
        boolean z16 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z16);
        q6.a.h(this, true);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f0 f13153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f13154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f13156d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13154b = new Rect();
            this.f13155c = true;
            this.f13156d = false;
        }

        public int a() {
            return this.f13153a.o();
        }

        public boolean b() {
            return this.f13153a.A();
        }

        public boolean c() {
            return this.f13153a.x();
        }

        public boolean d() {
            return this.f13153a.v();
        }

        public q(int i15, int i16) {
            super(i15, i16);
            this.f13154b = new Rect();
            this.f13155c = true;
            this.f13156d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13154b = new Rect();
            this.f13155c = true;
            this.f13156d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13154b = new Rect();
            this.f13155c = true;
            this.f13156d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f13154b = new Rect();
            this.f13155c = true;
            this.f13156d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f13026p;
        if (pVar != null) {
            return pVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }
}
