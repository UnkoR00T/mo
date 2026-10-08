package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;
import p011Prn.f2;

/* JADX INFO: loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements j6.b.a {
    private final SparseBooleanArray A;
    e B;
    a C;
    RunnableC0189c D;
    private b E;
    final f F;
    int G;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    d f8770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f8771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8772n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8777t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8778v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8779w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8780x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8781y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f8782z;

    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, p007NuL.m.f319l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f8770l;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f8418j : view2);
            }
            j(c.this.F);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.C = null;
            cVar.G = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public f2 a() {
            a aVar = c.this.C;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0189c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f8785a;

        public RunnableC0189c(e eVar) {
            this.f8785a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f8412c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f8412c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f8418j;
            if (view != null && view.getWindowToken() != null && this.f8785a.m()) {
                c.this.B = this.f8785a;
            }
            c.this.D = null;
        }
    }

    private class d extends r implements ActionMenuView.a {

        class a extends k0 {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c f8788k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f8788k = cVar;
            }

            @Override // androidx.appcompat.widget.k0
            public f2 b() {
                e eVar = c.this.B;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.k0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.k0
            public boolean d() {
                c cVar = c.this;
                if (cVar.D != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, p007NuL.m.f318k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i15, int i16, int i17, int i18) {
            boolean frame = super.setFrame(i15, i16, i17, i18);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                y5.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z15) {
            super(context, eVar, view, z15, p007NuL.m.f319l);
            h(8388613);
            j(c.this.F);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f8412c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f8412c.close();
            }
            c.this.B = null;
            super.e();
        }
    }

    private class f implements androidx.appcompat.view.menu.j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z15) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            androidx.appcompat.view.menu.j.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.c(eVar, z15);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f8412c) {
                return false;
            }
            c.this.G = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            androidx.appcompat.view.menu.j.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.d(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, p007NuL.s.f406c, p007NuL.s.f405b);
        this.A = new SparseBooleanArray();
        this.F = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f8418j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = viewGroup.getChildAt(i15);
            if ((childAt instanceof androidx.appcompat.view.menu.k.a) && ((androidx.appcompat.view.menu.k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f8770l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f8772n) {
            return this.f8771m;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0189c runnableC0189c = this.D;
        if (runnableC0189c != null && (obj = this.f8418j) != null) {
            ((View) obj).removeCallbacks(runnableC0189c);
            this.D = null;
            return true;
        }
        e eVar = this.B;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.C;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.D != null || E();
    }

    public boolean E() {
        e eVar = this.B;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f8778v) {
            this.f8777t = androidx.appcompat.view.a.b(this.f8411b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f8412c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z15) {
        this.f8781y = z15;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f8418j = actionMenuView;
        actionMenuView.a(this.f8412c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f8770l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f8772n = true;
            this.f8771m = drawable;
        }
    }

    public void J(boolean z15) {
        this.f8773p = z15;
        this.f8774q = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f8773p || E() || (eVar = this.f8412c) == null || this.f8418j == null || this.D != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0189c runnableC0189c = new RunnableC0189c(new e(this.f8411b, this.f8412c, this.f8770l, true));
        this.D = runnableC0189c;
        ((View) this.f8418j).post(runnableC0189c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f8418j);
        if (this.E == null) {
            this.E = new b();
        }
        actionMenuItemView.setPopupCallback(this.E);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar, boolean z15) {
        y();
        super.c(eVar, z15);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean f(androidx.appcompat.view.menu.m mVar) {
        boolean z15 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.f0() != this.f8412c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.f0();
        }
        View viewZ = z(mVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.G = mVar.getItem().getItemId();
        int size = mVar.size();
        for (int i15 = 0; i15 < size; i15++) {
            MenuItem item = mVar.getItem(i15);
            if (item.isVisible() && item.getIcon() != null) {
                z15 = true;
                break;
            }
        }
        a aVar = new a(this.f8411b, mVar, viewZ);
        this.C = aVar;
        aVar.g(z15);
        this.C.k();
        super.f(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void g(boolean z15) {
        super.g(z15);
        ((View) this.f8418j).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f8412c;
        boolean z16 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i15 = 0; i15 < size; i15++) {
                j6.b bVarB = arrayListS.get(i15).b();
                if (bVarB != null) {
                    bVarB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f8412c;
        ArrayList<androidx.appcompat.view.menu.g> arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f8773p && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z16 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z16 = true;
            }
        }
        if (z16) {
            if (this.f8770l == null) {
                this.f8770l = new d(this.f8410a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f8770l.getParent();
            if (viewGroup != this.f8418j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f8770l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8418j;
                actionMenuView.addView(this.f8770l, actionMenuView.D());
            }
        } else {
            d dVar = this.f8770l;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f8418j;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8770l);
                }
            }
        }
        ((ActionMenuView) this.f8418j).setOverflowReserved(this.f8773p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        ArrayList<androidx.appcompat.view.menu.g> arrayListE;
        int size;
        int i15;
        int iJ;
        ?? r15;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f8412c;
        View view = null;
        ?? r16 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i16 = cVar.f8777t;
        int i17 = cVar.f8776s;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f8418j;
        boolean z15 = false;
        int i18 = 0;
        int i19 = 0;
        for (int i25 = 0; i25 < size; i25++) {
            androidx.appcompat.view.menu.g gVar = arrayListE.get(i25);
            if (gVar.o()) {
                i18++;
            } else if (gVar.n()) {
                i19++;
            } else {
                z15 = true;
            }
            if (cVar.f8781y && gVar.isActionViewExpanded()) {
                i16 = 0;
            }
        }
        if (cVar.f8773p && (z15 || i19 + i18 > i16)) {
            i16--;
        }
        int i26 = i16 - i18;
        SparseBooleanArray sparseBooleanArray = cVar.A;
        sparseBooleanArray.clear();
        if (cVar.f8779w) {
            int i27 = cVar.f8782z;
            iJ = i17 / i27;
            i15 = i27 + ((i17 % i27) / iJ);
        } else {
            i15 = 0;
            iJ = 0;
        }
        int i28 = 0;
        int i29 = 0;
        ?? r17 = cVar;
        while (i28 < size) {
            androidx.appcompat.view.menu.g gVar2 = arrayListE.get(i28);
            if (gVar2.o()) {
                View viewN = r17.n(gVar2, view, viewGroup);
                if (r17.f8779w) {
                    iJ -= ActionMenuView.J(viewN, i15, iJ, iMakeMeasureSpec, r16);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i17 -= measuredWidth;
                if (i29 == 0) {
                    i29 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                r15 = r16;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z16 = sparseBooleanArray.get(groupId2);
                boolean z17 = (i26 > 0 || z16) && i17 > 0 && (!r17.f8779w || iJ > 0);
                boolean z18 = z17;
                if (z17) {
                    View viewN2 = r17.n(gVar2, null, viewGroup);
                    if (r17.f8779w) {
                        int iJ2 = ActionMenuView.J(viewN2, i15, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z18 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z19 = z18;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i17 -= measuredWidth2;
                    if (i29 == 0) {
                        i29 = measuredWidth2;
                    }
                    z17 = z19 & (!r17.f8779w ? i17 + i29 <= 0 : i17 < 0);
                }
                if (z17 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z16) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i35 = 0; i35 < i28; i35++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayListE.get(i35);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i26++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z17) {
                    i26--;
                }
                gVar2.u(z17);
                r15 = 0;
            } else {
                r15 = r16;
                gVar2.u(r15);
            }
            i28++;
            r16 = r15;
            size = size;
            view = null;
            r17 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        super.j(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f8774q) {
            this.f8773p = aVarB.h();
        }
        if (!this.f8780x) {
            this.f8775r = aVarB.c();
        }
        if (!this.f8778v) {
            this.f8777t = aVarB.d();
        }
        int measuredWidth = this.f8775r;
        if (this.f8773p) {
            if (this.f8770l == null) {
                d dVar = new d(this.f8410a);
                this.f8770l = dVar;
                if (this.f8772n) {
                    dVar.setImageDrawable(this.f8771m);
                    this.f8771m = null;
                    this.f8772n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8770l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f8770l.getMeasuredWidth();
        } else {
            this.f8770l = null;
        }
        this.f8776s = measuredWidth;
        this.f8782z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i15) {
        if (viewGroup.getChildAt(i15) == this.f8770l) {
            return false;
        }
        return super.l(viewGroup, i15);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f8418j;
        androidx.appcompat.view.menu.k kVarO = super.o(viewGroup);
        if (kVar != kVarO) {
            ((ActionMenuView) kVarO).setPresenter(this);
        }
        return kVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i15, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
