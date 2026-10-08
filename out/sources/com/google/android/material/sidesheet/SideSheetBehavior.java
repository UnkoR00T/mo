package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j6.l0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k6.p;
import k6.s;
import lj.h;
import lj.l;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ri.j;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f35476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f35477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f35478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f35479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f35480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SideSheetBehavior<V>.c f35481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f35482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f35483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s6.c f35486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f35488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference<V> f35493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference<View> f35494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35495t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private VelocityTracker f35496u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private gj.d f35497v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f35498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set<g> f35499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final s6.c.AbstractC4563c f35500y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f35475z = j.D;
    private static final int A = k.f174080n;

    class a extends s6.c.AbstractC4563c {
        a() {
        }

        @Override // s6.c.AbstractC4563c
        public int a(View view, int i15, int i16) {
            return c6.a.b(i15, SideSheetBehavior.this.f35476a.f(), SideSheetBehavior.this.f35476a.e());
        }

        @Override // s6.c.AbstractC4563c
        public int b(View view, int i15, int i16) {
            return view.getTop();
        }

        @Override // s6.c.AbstractC4563c
        public int d(View view) {
            return SideSheetBehavior.this.f35489n + SideSheetBehavior.this.d0();
        }

        @Override // s6.c.AbstractC4563c
        public void j(int i15) {
            if (i15 == 1 && SideSheetBehavior.this.f35483h) {
                SideSheetBehavior.this.z0(1);
            }
        }

        @Override // s6.c.AbstractC4563c
        public void k(View view, int i15, int i16, int i17, int i18) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewZ = SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                SideSheetBehavior.this.f35476a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i15);
        }

        @Override // s6.c.AbstractC4563c
        public void l(View view, float f15, float f16) {
            int iR = SideSheetBehavior.this.R(view, f15, f16);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.E0(view, iR, sideSheetBehavior.D0());
        }

        @Override // s6.c.AbstractC4563c
        public boolean m(View view, int i15) {
            return (SideSheetBehavior.this.f35484i == 1 || SideSheetBehavior.this.f35493r == null || SideSheetBehavior.this.f35493r.get() != view) ? false : true;
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f35504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f35505c = new Runnable() { // from class: com.google.android.material.sidesheet.f
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(this.f35509a);
            }
        };

        c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f35504b = false;
            if (SideSheetBehavior.this.f35486k != null && SideSheetBehavior.this.f35486k.k(true)) {
                cVar.b(cVar.f35503a);
            } else if (SideSheetBehavior.this.f35484i == 2) {
                SideSheetBehavior.this.z0(cVar.f35503a);
            }
        }

        void b(int i15) {
            if (SideSheetBehavior.this.f35493r == null || SideSheetBehavior.this.f35493r.get() == null) {
                return;
            }
            this.f35503a = i15;
            if (this.f35504b) {
                return;
            }
            ((View) SideSheetBehavior.this.f35493r.get()).postOnAnimation(this.f35505c);
            this.f35504b = true;
        }
    }

    public SideSheetBehavior() {
        this.f35481f = new c();
        this.f35483h = true;
        this.f35484i = 5;
        this.f35485j = 5;
        this.f35488m = 0.1f;
        this.f35495t = -1;
        this.f35499x = new LinkedHashSet();
        this.f35500y = new a();
    }

    private boolean A0() {
        if (this.f35486k != null) {
            return this.f35483h || this.f35484i == 1;
        }
        return false;
    }

    private boolean C0(V v15) {
        return (v15.isShown() || l0.o(v15) != null) && this.f35483h;
    }

    public static /* synthetic */ boolean E(SideSheetBehavior sideSheetBehavior, int i15, View view, s.a aVar) {
        sideSheetBehavior.y0(i15);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(View view, int i15, boolean z15) {
        if (!p0(view, i15, z15)) {
            z0(i15);
        } else {
            z0(2);
            this.f35481f.b(i15);
        }
    }

    public static /* synthetic */ void F(SideSheetBehavior sideSheetBehavior, int i15) {
        V v15 = sideSheetBehavior.f35493r.get();
        if (v15 != null) {
            sideSheetBehavior.E0(v15, i15, false);
        }
    }

    private void F0() {
        V v15;
        WeakReference<V> weakReference = this.f35493r;
        if (weakReference == null || (v15 = weakReference.get()) == null) {
            return;
        }
        l0.b0(v15, PKIFailureInfo.transactionIdInUse);
        l0.b0(v15, PKIFailureInfo.badCertTemplate);
        if (this.f35484i != 5) {
            r0(v15, p.a.f108681y, 5);
        }
        if (this.f35484i != 3) {
            r0(v15, p.a.f108679w, 3);
        }
    }

    private void G0(l lVar) {
        h hVar = this.f35478c;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
    }

    private void H0(View view) {
        int i15 = this.f35484i == 5 ? 4 : 0;
        if (view.getVisibility() != i15) {
            view.setVisibility(i15);
        }
    }

    private int P(int i15, V v15) {
        int i16 = this.f35484i;
        if (i16 == 1 || i16 == 2) {
            return i15 - this.f35476a.g(v15);
        }
        if (i16 == 3) {
            return 0;
        }
        if (i16 == 5) {
            return this.f35476a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f35484i);
    }

    private float Q(float f15, float f16) {
        return Math.abs(f15 - f16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(View view, float f15, float f16) {
        if (n0(f15)) {
            return 3;
        }
        if (B0(view, f15)) {
            return (this.f35476a.l(f15, f16) || this.f35476a.k(view)) ? 5 : 3;
        }
        if (f15 != 0.0f && e.a(f15, f16)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - a0()) < Math.abs(left - this.f35476a.d()) ? 3 : 5;
    }

    private void S() {
        WeakReference<View> weakReference = this.f35494s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f35494s = null;
    }

    private s T(final int i15) {
        return new s() { // from class: mj.a
            @Override // k6.s
            public final boolean a(View view, s.a aVar) {
                return SideSheetBehavior.E(this.f126713a, i15, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f35480e == null) {
            return;
        }
        h hVar = new h(this.f35480e);
        this.f35478c = hVar;
        hVar.U(context);
        ColorStateList colorStateList = this.f35479d;
        if (colorStateList != null) {
            this.f35478c.g0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f35478c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i15) {
        if (this.f35499x.isEmpty()) {
            return;
        }
        float fB = this.f35476a.b(i15);
        Iterator<g> it = this.f35499x.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    private void W(View view) {
        if (l0.o(view) == null) {
            l0.j0(view, view.getResources().getString(f35475z));
        }
    }

    private int X(int i15, int i16, int i17, int i18) {
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

    private CoordinatorLayout.f j0() {
        V v15;
        WeakReference<V> weakReference = this.f35493r;
        if (weakReference == null || (v15 = weakReference.get()) == null || !(v15.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v15.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return A0() && Q((float) this.f35498w, motionEvent.getX()) > ((float) this.f35486k.u());
    }

    private boolean n0(float f15) {
        return this.f35476a.j(f15);
    }

    private boolean o0(V v15) {
        ViewParent parent = v15.getParent();
        return parent != null && parent.isLayoutRequested() && v15.isAttachedToWindow();
    }

    private boolean p0(View view, int i15, boolean z15) {
        int iE0 = e0(i15);
        s6.c cVarI0 = i0();
        if (cVarI0 == null) {
            return false;
        }
        if (z15) {
            return cVarI0.F(iE0, view.getTop());
        }
        return cVarI0.H(view, iE0, view.getTop());
    }

    private void q0(CoordinatorLayout coordinatorLayout) {
        int i15;
        View viewFindViewById;
        if (this.f35494s != null || (i15 = this.f35495t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i15)) == null) {
            return;
        }
        this.f35494s = new WeakReference<>(viewFindViewById);
    }

    private void r0(V v15, p.a aVar, int i15) {
        l0.d0(v15, aVar, null, T(i15));
    }

    private void s0() {
        VelocityTracker velocityTracker = this.f35496u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f35496u = null;
        }
    }

    private void t0(V v15, Runnable runnable) {
        if (o0(v15)) {
            v15.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void w0(int i15) {
        d dVar = this.f35476a;
        if (dVar == null || dVar.i() != i15) {
            if (i15 == 0) {
                this.f35476a = new com.google.android.material.sidesheet.b(this);
                if (this.f35480e == null || l0()) {
                    return;
                }
                l.b bVarW = this.f35480e.w();
                bVarW.G(0.0f).y(0.0f);
                G0(bVarW.m());
                return;
            }
            if (i15 == 1) {
                this.f35476a = new com.google.android.material.sidesheet.a(this);
                if (this.f35480e == null || k0()) {
                    return;
                }
                l.b bVarW2 = this.f35480e.w();
                bVarW2.C(0.0f).u(0.0f);
                G0(bVarW2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i15 + ". Must be 0 or 1.");
        }
    }

    private void x0(V v15, int i15) {
        w0(Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v15.getLayoutParams()).f11785c, i15) == 3 ? 1 : 0);
    }

    boolean B0(View view, float f15) {
        return this.f35476a.m(view, f15);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
        if (!v15.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f35484i == 1 && actionMasked == 0) {
            return true;
        }
        if (A0()) {
            this.f35486k.z(motionEvent);
        }
        if (actionMasked == 0) {
            s0();
        }
        if (this.f35496u == null) {
            this.f35496u = VelocityTracker.obtain();
        }
        this.f35496u.addMovement(motionEvent);
        if (A0() && actionMasked == 2 && !this.f35487l && m0(motionEvent)) {
            this.f35486k.b(v15, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f35487l;
    }

    public boolean D0() {
        return true;
    }

    int Y() {
        return this.f35489n;
    }

    public View Z() {
        WeakReference<View> weakReference = this.f35494s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f35476a.c();
    }

    public float b0() {
        return this.f35488m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f35492q;
    }

    int e0(int i15) {
        if (i15 == 3) {
            return a0();
        }
        if (i15 == 5) {
            return this.f35476a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i15);
    }

    int f0() {
        return this.f35491p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f35493r = null;
        this.f35486k = null;
        this.f35497v = null;
    }

    int g0() {
        return this.f35490o;
    }

    int h0() {
        return 500;
    }

    s6.c i0() {
        return this.f35486k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f35493r = null;
        this.f35486k = null;
        this.f35497v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
        s6.c cVar;
        if (!C0(v15)) {
            this.f35487l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s0();
        }
        if (this.f35496u == null) {
            this.f35496u = VelocityTracker.obtain();
        }
        this.f35496u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f35498w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f35487l) {
            this.f35487l = false;
            return false;
        }
        return (this.f35487l || (cVar = this.f35486k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v15, int i15) {
        if (coordinatorLayout.getFitsSystemWindows() && !v15.getFitsSystemWindows()) {
            v15.setFitsSystemWindows(true);
        }
        if (this.f35493r == null) {
            this.f35493r = new WeakReference<>(v15);
            this.f35497v = new gj.d(v15);
            h hVar = this.f35478c;
            if (hVar != null) {
                v15.setBackground(hVar);
                h hVar2 = this.f35478c;
                float elevation = this.f35482g;
                if (elevation == -1.0f) {
                    elevation = v15.getElevation();
                }
                hVar2.f0(elevation);
            } else {
                ColorStateList colorStateList = this.f35479d;
                if (colorStateList != null) {
                    l0.k0(v15, colorStateList);
                }
            }
            H0(v15);
            F0();
            if (v15.getImportantForAccessibility() == 0) {
                v15.setImportantForAccessibility(1);
            }
            W(v15);
        }
        x0(v15, i15);
        if (this.f35486k == null) {
            this.f35486k = s6.c.m(coordinatorLayout, this.f35500y);
        }
        int iG = this.f35476a.g(v15);
        coordinatorLayout.I(v15, i15);
        this.f35490o = coordinatorLayout.getWidth();
        this.f35491p = this.f35476a.h(coordinatorLayout);
        this.f35489n = v15.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v15.getLayoutParams();
        this.f35492q = marginLayoutParams != null ? this.f35476a.a(marginLayoutParams) : 0;
        l0.Q(v15, P(iG, v15));
        q0(coordinatorLayout);
        for (g gVar : this.f35499x) {
            if (gVar instanceof g) {
                gVar.c(v15);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v15, int i15, int i16, int i17, int i18) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v15.getLayoutParams();
        v15.measure(X(i15, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i16, -1, marginLayoutParams.width), X(i17, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i18, -1, marginLayoutParams.height));
        return true;
    }

    public void u0(int i15) {
        this.f35495t = i15;
        S();
        WeakReference<V> weakReference = this.f35493r;
        if (weakReference != null) {
            V v15 = weakReference.get();
            if (i15 == -1 || !v15.isLaidOut()) {
                return;
            }
            v15.requestLayout();
        }
    }

    public void v0(boolean z15) {
        this.f35483h = z15;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v15, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, v15, bVar.a());
        }
        int i15 = bVar.f35502c;
        if (i15 == 1 || i15 == 2) {
            i15 = 5;
        }
        this.f35484i = i15;
        this.f35485j = i15;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v15) {
        return new b(super.y(coordinatorLayout, v15), (SideSheetBehavior<?>) this);
    }

    public void y0(final int i15) {
        if (i15 == 1 || i15 == 2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("STATE_");
            sb5.append(i15 == 1 ? "DRAGGING" : "SETTLING");
            sb5.append(" should not be set externally.");
            throw new IllegalArgumentException(sb5.toString());
        }
        WeakReference<V> weakReference = this.f35493r;
        if (weakReference == null || weakReference.get() == null) {
            z0(i15);
        } else {
            t0(this.f35493r.get(), new Runnable() { // from class: mj.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.F(this.f126715a, i15);
                }
            });
        }
    }

    void z0(int i15) {
        V v15;
        if (this.f35484i == i15) {
            return;
        }
        this.f35484i = i15;
        if (i15 == 3 || i15 == 5) {
            this.f35485j = i15;
        }
        WeakReference<V> weakReference = this.f35493r;
        if (weakReference == null || (v15 = weakReference.get()) == null) {
            return;
        }
        H0(v15);
        Iterator<g> it = this.f35499x.iterator();
        while (it.hasNext()) {
            it.next().a(v15, i15);
        }
        F0();
    }

    protected static class b extends r6.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f35502c;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i15) {
                return new b[i15];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35502c = parcel.readInt();
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f35502c);
        }

        public b(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f35502c = ((SideSheetBehavior) sideSheetBehavior).f35484i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35481f = new c();
        this.f35483h = true;
        this.f35484i = 5;
        this.f35485j = 5;
        this.f35488m = 0.1f;
        this.f35495t = -1;
        this.f35499x = new LinkedHashSet();
        this.f35500y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ri.l.f174250t4);
        if (typedArrayObtainStyledAttributes.hasValue(ri.l.f174266v4)) {
            this.f35479d = ij.c.a(context, typedArrayObtainStyledAttributes, ri.l.f174266v4);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ri.l.f174290y4)) {
            this.f35480e = l.e(context, attributeSet, 0, A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(ri.l.f174282x4)) {
            u0(typedArrayObtainStyledAttributes.getResourceId(ri.l.f174282x4, -1));
        }
        U(context);
        this.f35482g = typedArrayObtainStyledAttributes.getDimension(ri.l.f174258u4, -1.0f);
        v0(typedArrayObtainStyledAttributes.getBoolean(ri.l.f174274w4, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f35477b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
