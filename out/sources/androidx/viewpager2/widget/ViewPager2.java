package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import j6.l0;
import k6.p;
import k6.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static boolean f13659x = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f13660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f13661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.b f13662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f13663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f13664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.j f13665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LinearLayoutManager f13666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13667h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Parcelable f13668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    RecyclerView f13669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f13670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    androidx.viewpager2.widget.e f13671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.b f13672n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.viewpager2.widget.c f13673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.viewpager2.widget.d f13674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RecyclerView.m f13675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f13676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13677t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f13678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    e f13679w;

    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f13664e = true;
            viewPager2.f13671m.l();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i15) {
            if (i15 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i15) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f13663d != i15) {
                viewPager2.f13663d = i15;
                viewPager2.f13679w.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i15) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f13669k.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.r {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i15) {
            return false;
        }

        boolean c(int i15, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.h<?> hVar) {
        }

        void f(RecyclerView.h<?> hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(p pVar) {
        }

        void k(View view, p pVar) {
        }

        boolean l(int i15) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i15, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void n() {
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i15) {
            return (i15 == 8192 || i15 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(p pVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            pVar.f0(p.a.f108674r);
            pVar.f0(p.a.f108673q);
            pVar.Q0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i15) {
            if (b(i15)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i15, int i16) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i15, int i16, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i15, int i16) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i15, int i16, int i17) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i15, int i16) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void Q0(RecyclerView.w wVar, RecyclerView.b0 b0Var, p pVar) {
            super.Q0(wVar, b0Var, pVar);
            ViewPager2.this.f13679w.j(pVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(RecyclerView.b0 b0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.Q1(b0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void T0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, p pVar) {
            ViewPager2.this.f13679w.k(view, pVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean l1(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i15, Bundle bundle) {
            return ViewPager2.this.f13679w.b(i15) ? ViewPager2.this.f13679w.l(i15) : super.l1(wVar, b0Var, i15, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z15, boolean z16) {
            return false;
        }
    }

    public static abstract class i {
        public void a(int i15) {
        }

        public void b(int i15, float f15, int i16) {
        }

        public void c(int i15) {
        }
    }

    class j extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f13686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s f13687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RecyclerView.j f13688d;

        class a implements s {
            a() {
            }

            @Override // k6.s
            public boolean a(View view, s.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements s {
            b() {
            }

            @Override // k6.s
            public boolean a(View view, s.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f13686b = new a();
            this.f13687c = new b();
        }

        private void u(p pVar) {
            int iG;
            int iG2;
            if (ViewPager2.this.getAdapter() != null) {
                iG2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    iG2 = ViewPager2.this.getAdapter().g();
                    iG = 1;
                } else {
                    iG = ViewPager2.this.getAdapter().g();
                }
            } else {
                iG = 0;
                iG2 = 0;
            }
            pVar.q0(p.f.a(iG2, iG, false, 0));
        }

        private void v(View view, p pVar) {
            pVar.r0(p.g.a(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f13666g.l0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f13666g.l0(view) : 0, 1, false, false));
        }

        private void w(p pVar) {
            int iG;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (iG = adapter.g()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f13663d > 0) {
                pVar.a(PKIFailureInfo.certRevoked);
            }
            if (ViewPager2.this.f13663d < iG - 1) {
                pVar.a(PKIFailureInfo.certConfirmed);
            }
            pVar.Q0(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i15, Bundle bundle) {
            return i15 == 8192 || i15 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.z(this.f13688d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.B(this.f13688d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f13688d = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            p pVarF1 = p.f1(accessibilityNodeInfo);
            u(pVarF1);
            w(pVarF1);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(View view, p pVar) {
            v(view, pVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i15, Bundle bundle) {
            if (!c(i15, bundle)) {
                throw new IllegalStateException();
            }
            x(i15 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i15) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i15, true);
            }
        }

        void y() {
            int iG;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i15 = R.id.accessibilityActionPageLeft;
            l0.b0(viewPager2, R.id.accessibilityActionPageLeft);
            l0.b0(viewPager2, R.id.accessibilityActionPageRight);
            l0.b0(viewPager2, R.id.accessibilityActionPageUp);
            l0.b0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (iG = ViewPager2.this.getAdapter().g()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f13663d < iG - 1) {
                    l0.d0(viewPager2, new p.a(R.id.accessibilityActionPageDown, null), null, this.f13686b);
                }
                if (ViewPager2.this.f13663d > 0) {
                    l0.d0(viewPager2, new p.a(R.id.accessibilityActionPageUp, null), null, this.f13687c);
                    return;
                }
                return;
            }
            boolean zD = ViewPager2.this.d();
            int i16 = zD ? 16908360 : 16908361;
            if (zD) {
                i15 = 16908361;
            }
            if (ViewPager2.this.f13663d < iG - 1) {
                l0.d0(viewPager2, new p.a(i16, null), null, this.f13686b);
            }
            if (ViewPager2.this.f13663d > 0) {
                l0.d0(viewPager2, new p.a(i15, null), null, this.f13687c);
            }
        }
    }

    public interface k {
    }

    private class l extends q {
        l() {
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.u
        public View f(RecyclerView.p pVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(pVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f13679w.d() ? ViewPager2.this.f13679w.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f13663d);
            accessibilityEvent.setToIndex(ViewPager2.this.f13663d);
            ViewPager2.this.f13679w.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    private static class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RecyclerView f13699b;

        o(int i15, RecyclerView recyclerView) {
            this.f13698a = i15;
            this.f13699b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13699b.z1(this.f13698a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13660a = new Rect();
        this.f13661b = new Rect();
        this.f13662c = new androidx.viewpager2.widget.b(3);
        this.f13664e = false;
        this.f13665f = new a();
        this.f13667h = -1;
        this.f13675r = null;
        this.f13676s = false;
        this.f13677t = true;
        this.f13678v = -1;
        b(context, attributeSet);
    }

    private RecyclerView.r a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f13679w = f13659x ? new j() : new f();
        m mVar = new m(context);
        this.f13669k = mVar;
        mVar.setId(View.generateViewId());
        this.f13669k.setDescendantFocusability(PKIFailureInfo.unsupportedVersion);
        h hVar = new h(context);
        this.f13666g = hVar;
        this.f13669k.setLayoutManager(hVar);
        this.f13669k.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f13669k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f13669k.l(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f13671m = eVar;
        this.f13673p = new androidx.viewpager2.widget.c(this, eVar, this.f13669k);
        l lVar = new l();
        this.f13670l = lVar;
        lVar.b(this.f13669k);
        this.f13669k.n(this.f13671m);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f13672n = bVar;
        this.f13671m.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f13672n.d(bVar2);
        this.f13672n.d(cVar);
        this.f13679w.h(this.f13672n, this.f13669k);
        this.f13672n.d(this.f13662c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f13666g);
        this.f13674q = dVar;
        this.f13672n.d(dVar);
        RecyclerView recyclerView = this.f13669k;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.z(this.f13665f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        RecyclerView.h adapter;
        if (this.f13667h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f13668j;
        if (parcelable != null) {
            if (adapter instanceof ib.c) {
                ((ib.c) adapter).b(parcelable);
            }
            this.f13668j = null;
        }
        int iMax = Math.max(0, Math.min(this.f13667h, adapter.g() - 1));
        this.f13663d = iMax;
        this.f13667h = -1;
        this.f13669k.q1(iMax);
        this.f13679w.n();
    }

    private void l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hb.a.f82749a);
        l0.f0(this, context, hb.a.f82749a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(hb.a.f82750b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.B(this.f13665f);
        }
    }

    public boolean c() {
        return this.f13673p.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i15) {
        return this.f13669k.canScrollHorizontally(i15);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i15) {
        return this.f13669k.canScrollVertically(i15);
    }

    boolean d() {
        return this.f13666g.d0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i15 = ((n) parcelable).f13695a;
            sparseArray.put(this.f13669k.getId(), sparseArray.get(i15));
            sparseArray.remove(i15);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f13677t;
    }

    public void g(i iVar) {
        this.f13662c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f13679w.a() ? this.f13679w.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f13669k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f13663d;
    }

    public int getItemDecorationCount() {
        return this.f13669k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f13678v;
    }

    public int getOrientation() {
        return this.f13666g.p2() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f13669k;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f13671m.h();
    }

    public void h() {
        this.f13674q.d();
    }

    public void j(int i15, boolean z15) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        k(i15, z15);
    }

    void k(int i15, boolean z15) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f13667h != -1) {
                this.f13667h = Math.max(i15, 0);
                return;
            }
            return;
        }
        if (adapter.g() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i15, 0), adapter.g() - 1);
        if (iMin == this.f13663d && this.f13671m.j()) {
            return;
        }
        int i16 = this.f13663d;
        if (iMin == i16 && z15) {
            return;
        }
        double dG = i16;
        this.f13663d = iMin;
        this.f13679w.r();
        if (!this.f13671m.j()) {
            dG = this.f13671m.g();
        }
        this.f13671m.m(iMin, z15);
        if (!z15) {
            this.f13669k.q1(iMin);
            return;
        }
        double d15 = iMin;
        if (Math.abs(d15 - dG) <= 3.0d) {
            this.f13669k.z1(iMin);
            return;
        }
        this.f13669k.q1(d15 > dG ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f13669k;
        recyclerView.post(new o(iMin, recyclerView));
    }

    public void n(i iVar) {
        this.f13662c.e(iVar);
    }

    void o() {
        q qVar = this.f13670l;
        if (qVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = qVar.f(this.f13666g);
        if (viewF == null) {
            return;
        }
        int iL0 = this.f13666g.l0(viewF);
        if (iL0 != this.f13663d && getScrollState() == 0) {
            this.f13672n.c(iL0);
        }
        this.f13664e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f13679w.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        int measuredWidth = this.f13669k.getMeasuredWidth();
        int measuredHeight = this.f13669k.getMeasuredHeight();
        this.f13660a.left = getPaddingLeft();
        this.f13660a.right = (i17 - i15) - getPaddingRight();
        this.f13660a.top = getPaddingTop();
        this.f13660a.bottom = (i18 - i16) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f13660a, this.f13661b);
        RecyclerView recyclerView = this.f13669k;
        Rect rect = this.f13661b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f13664e) {
            o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        measureChild(this.f13669k, i15, i16);
        int measuredWidth = this.f13669k.getMeasuredWidth();
        int measuredHeight = this.f13669k.getMeasuredHeight();
        int measuredState = this.f13669k.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i15, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i16, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f13667h = nVar.f13696b;
        this.f13668j = nVar.f13697c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f13695a = this.f13669k.getId();
        int i15 = this.f13667h;
        if (i15 == -1) {
            i15 = this.f13663d;
        }
        nVar.f13696b = i15;
        Parcelable parcelable = this.f13668j;
        if (parcelable != null) {
            nVar.f13697c = parcelable;
            return nVar;
        }
        Object adapter = this.f13669k.getAdapter();
        if (adapter instanceof ib.c) {
            nVar.f13697c = ((ib.c) adapter).a();
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i15, Bundle bundle) {
        return this.f13679w.c(i15, bundle) ? this.f13679w.m(i15, bundle) : super.performAccessibilityAction(i15, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f13669k.getAdapter();
        this.f13679w.f(adapter);
        m(adapter);
        this.f13669k.setAdapter(hVar);
        this.f13663d = 0;
        i();
        this.f13679w.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i15) {
        j(i15, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i15) {
        super.setLayoutDirection(i15);
        this.f13679w.q();
    }

    public void setOffscreenPageLimit(int i15) {
        if (i15 < 1 && i15 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f13678v = i15;
        this.f13669k.requestLayout();
    }

    public void setOrientation(int i15) {
        this.f13666g.C2(i15);
        this.f13679w.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f13676s) {
                this.f13675r = this.f13669k.getItemAnimator();
                this.f13676s = true;
            }
            this.f13669k.setItemAnimator(null);
        } else if (this.f13676s) {
            this.f13669k.setItemAnimator(this.f13675r);
            this.f13675r = null;
            this.f13676s = false;
        }
        this.f13674q.d();
        if (kVar == null) {
            return;
        }
        this.f13674q.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z15) {
        this.f13677t = z15;
        this.f13679w.t();
    }

    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f13697c;

        class a implements Parcelable.ClassLoaderCreator<n> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i15) {
                return new n[i15];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f13695a = parcel.readInt();
            this.f13696b = parcel.readInt();
            this.f13697c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f13695a);
            parcel.writeInt(this.f13696b);
            parcel.writeParcelable(this.f13697c, i15);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
