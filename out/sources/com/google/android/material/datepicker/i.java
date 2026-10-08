package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import j6.l0;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class i<S> extends t<S> {
    static final Object V0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object W0 = "NAVIGATION_PREV_TAG";
    static final Object X0 = "NAVIGATION_NEXT_TAG";
    static final Object Y0 = "SELECTOR_TOGGLE_TAG";
    private int G0;
    private com.google.android.material.datepicker.d<S> H0;
    private com.google.android.material.datepicker.a I0;
    private com.google.android.material.datepicker.g J0;
    private p K0;
    private l L0;
    private com.google.android.material.datepicker.c M0;
    private RecyclerView N0;
    private RecyclerView O0;
    private View P0;
    private View Q0;
    private View R0;
    private View S0;
    private MaterialButton T0;
    private AccessibilityManager U0;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f35131a;

        a(r rVar) {
            this.f35131a = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.o2(this.f35131a.D(i.this.k2().e2() - 1));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35133a;

        b(int i15) {
            this.f35133a = i15;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.O0.z1(this.f35133a);
        }
    }

    class c extends j6.a {
        c() {
        }

        @Override // j6.a
        public void g(View view, k6.p pVar) {
            super.g(view, pVar);
            pVar.q0(null);
        }
    }

    class d extends u {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i15, boolean z15, int i16) {
            super(context, i15, z15);
            this.I = i16;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(RecyclerView.b0 b0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = i.this.O0.getWidth();
                iArr[1] = i.this.O0.getWidth();
            } else {
                iArr[0] = i.this.O0.getHeight();
                iArr[1] = i.this.O0.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.i.m
        public void a(long j15) {
            if (i.this.I0.g().F1(j15)) {
                i.this.H0.X3(j15);
                Iterator<s<S>> it = i.this.F0.iterator();
                while (it.hasNext()) {
                    it.next().a(i.this.H0.N3());
                }
                i.this.O0.getAdapter().l();
                if (i.this.N0 != null) {
                    i.this.N0.getAdapter().l();
                }
            }
        }
    }

    class f extends j6.a {
        f() {
        }

        @Override // j6.a
        public void g(View view, k6.p pVar) {
            super.g(view, pVar);
            pVar.Q0(false);
        }
    }

    class g extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f35138a = w.i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f35139b = w.i();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                x xVar = (x) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (i6.d<Long, Long> dVar : i.this.H0.A2()) {
                    Long l15 = dVar.f89682a;
                    if (l15 != null && dVar.f89683b != null) {
                        this.f35138a.setTimeInMillis(l15.longValue());
                        this.f35139b.setTimeInMillis(dVar.f89683b.longValue());
                        int iE = xVar.E(this.f35138a.get(1));
                        int iE2 = xVar.E(this.f35139b.get(1));
                        View viewH = gridLayoutManager.H(iE);
                        View viewH2 = gridLayoutManager.H(iE2);
                        int iX2 = iE / gridLayoutManager.X2();
                        int iX3 = iE2 / gridLayoutManager.X2();
                        int i15 = iX2;
                        while (i15 <= iX3) {
                            View viewH3 = gridLayoutManager.H(gridLayoutManager.X2() * i15);
                            if (viewH3 != null) {
                                canvas.drawRect((i15 != iX2 || viewH == null) ? 0 : viewH.getLeft() + (viewH.getWidth() / 2), viewH3.getTop() + i.this.M0.f35121d.c(), (i15 != iX3 || viewH2 == null) ? recyclerView.getWidth() : viewH2.getLeft() + (viewH2.getWidth() / 2), viewH3.getBottom() - i.this.M0.f35121d.b(), i.this.M0.f35125h);
                            }
                            i15++;
                        }
                    }
                }
            }
        }
    }

    class h extends j6.a {
        h() {
        }

        @Override // j6.a
        public void g(View view, k6.p pVar) {
            super.g(view, pVar);
            pVar.b(new k6.p.a(16, i.this.S0.getVisibility() == 0 ? i.this.Z(ri.j.f174066z) : i.this.Z(ri.j.f174064x)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    class C0748i extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f35142a;

        C0748i(r rVar) {
            this.f35142a = rVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i15, int i16) {
            int iC2 = i15 < 0 ? i.this.k2().c2() : i.this.k2().e2();
            p pVarD = this.f35142a.D(iC2);
            i.this.K0 = pVarD;
            i.this.T0.setText(this.f35142a.E(iC2));
            i.this.s2(this.f35142a.F(pVarD));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.r2();
        }
    }

    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f35145a;

        k(r rVar) {
            this.f35145a = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.o2(this.f35145a.D(i.this.k2().c2() + 1));
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j15);
    }

    private void c2(View view, r rVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ri.f.f174008r);
        this.T0 = materialButton;
        materialButton.setTag(Y0);
        l0.h0(this.T0, new h());
        View viewFindViewById = view.findViewById(ri.f.f174010t);
        this.P0 = viewFindViewById;
        viewFindViewById.setTag(W0);
        View viewFindViewById2 = view.findViewById(ri.f.f174009s);
        this.Q0 = viewFindViewById2;
        viewFindViewById2.setTag(X0);
        this.R0 = view.findViewById(ri.f.A);
        this.S0 = view.findViewById(ri.f.f174012v);
        p2(l.DAY);
        this.T0.setText(this.K0.o());
        this.O0.n(new C0748i(rVar));
        this.T0.setOnClickListener(new j());
        this.Q0.setOnClickListener(new k(rVar));
        this.P0.setOnClickListener(new a(rVar));
        s2(rVar.F(this.K0));
    }

    private RecyclerView.o d2() {
        return new g();
    }

    static int i2(Context context) {
        return context.getResources().getDimensionPixelSize(ri.d.Y);
    }

    private static int j2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ri.d.f173949f0) + resources.getDimensionPixelOffset(ri.d.f173951g0) + resources.getDimensionPixelOffset(ri.d.f173947e0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ri.d.f173939a0);
        int i15 = q.f35194g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(ri.d.Y) * i15) + ((i15 - 1) * resources.getDimensionPixelOffset(ri.d.f173945d0)) + resources.getDimensionPixelOffset(ri.d.W);
    }

    public static <T> i<T> l2(com.google.android.material.datepicker.d<T> dVar, int i15, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i<T> iVar = new i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i15);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.k());
        iVar.F1(bundle);
        return iVar;
    }

    private void m2(int i15) {
        this.O0.post(new b(i15));
    }

    private void q2() {
        l0.h0(this.O0, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2(int i15) {
        this.Q0.setEnabled(i15 + 1 < this.O0.getAdapter().g());
        this.P0.setEnabled(i15 - 1 >= 0);
    }

    @Override // androidx.fragment.app.o
    public View B0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i15;
        int i16;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(z(), this.G0);
        this.M0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.U0 = (AccessibilityManager) z1().getSystemService("accessibility");
        p pVarL = this.I0.l();
        if (com.google.android.material.datepicker.m.u2(contextThemeWrapper)) {
            i15 = ri.h.f174036q;
            i16 = 1;
        } else {
            i15 = ri.h.f174034o;
            i16 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i15, viewGroup, false);
        viewInflate.setMinimumHeight(j2(z1()));
        GridView gridView = (GridView) viewInflate.findViewById(ri.f.f174013w);
        l0.h0(gridView, new c());
        int i17 = this.I0.i();
        gridView.setAdapter((ListAdapter) (i17 > 0 ? new com.google.android.material.datepicker.h(i17) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(pVarL.f35190d);
        gridView.setEnabled(false);
        this.O0 = (RecyclerView) viewInflate.findViewById(ri.f.f174016z);
        this.O0.setLayoutManager(new d(z(), i16, false, i16));
        this.O0.setTag(V0);
        r rVar = new r(contextThemeWrapper, this.H0, this.I0, this.J0, new e());
        this.O0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(ri.g.f174019c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ri.f.A);
        this.N0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.N0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.N0.setAdapter(new x(this));
            this.N0.j(d2());
        }
        if (viewInflate.findViewById(ri.f.f174008r) != null) {
            c2(viewInflate, rVar);
        }
        if (!com.google.android.material.datepicker.m.u2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.q().b(this.O0);
        }
        this.O0.q1(rVar.F(this.K0));
        q2();
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.t
    public boolean R1(s<S> sVar) {
        return super.R1(sVar);
    }

    @Override // androidx.fragment.app.o
    public void T0(Bundle bundle) {
        super.T0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.G0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.H0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.I0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.J0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.K0);
    }

    com.google.android.material.datepicker.a e2() {
        return this.I0;
    }

    com.google.android.material.datepicker.c f2() {
        return this.M0;
    }

    p g2() {
        return this.K0;
    }

    public com.google.android.material.datepicker.d<S> h2() {
        return this.H0;
    }

    LinearLayoutManager k2() {
        return (LinearLayoutManager) this.O0.getLayoutManager();
    }

    void n2() {
        MaterialButton materialButton = this.T0;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    void o2(p pVar) {
        r rVar = (r) this.O0.getAdapter();
        int iF = rVar.F(pVar);
        AccessibilityManager accessibilityManager = this.U0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iF2 = iF - rVar.F(this.K0);
            boolean z15 = Math.abs(iF2) > 3;
            boolean z16 = iF2 > 0;
            this.K0 = pVar;
            if (z15 && z16) {
                this.O0.q1(iF - 3);
                m2(iF);
            } else if (z15) {
                this.O0.q1(iF + 3);
                m2(iF);
            } else {
                m2(iF);
            }
        } else {
            this.K0 = pVar;
            this.O0.q1(iF);
        }
        s2(iF);
    }

    void p2(l lVar) {
        this.L0 = lVar;
        if (lVar == l.YEAR) {
            this.N0.getLayoutManager().B1(((x) this.N0.getAdapter()).E(this.K0.f35189c));
            this.R0.setVisibility(0);
            this.S0.setVisibility(8);
            this.P0.setVisibility(8);
            this.Q0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.R0.setVisibility(8);
            this.S0.setVisibility(0);
            this.P0.setVisibility(0);
            this.Q0.setVisibility(0);
            o2(this.K0);
        }
    }

    void r2() {
        l lVar = this.L0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            p2(l.DAY);
            this.O0.announceForAccessibility(Z(ri.j.A));
        } else if (lVar == l.DAY) {
            p2(lVar2);
            this.N0.announceForAccessibility(Z(ri.j.B));
        }
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle bundle) {
        super.x0(bundle);
        if (bundle == null) {
            bundle = v();
        }
        this.G0 = bundle.getInt("THEME_RES_ID_KEY");
        this.H0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.I0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.J0 = (com.google.android.material.datepicker.g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.K0 = (p) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
