package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.s0;
import j6.l0;
import j6.v0;
import j6.w0;
import j6.x0;
import j6.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p007NuL.v;

/* JADX INFO: loaded from: classes.dex */
public class s extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f8277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f8279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f8280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f8281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g0 f8282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f8283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f8284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    s0 f8285i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d f8289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b f8290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    androidx.appcompat.view.b.a f8291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8292p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8294r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f8297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f8298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8299w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.h f8301y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8302z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f8286j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8287k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<androidx.appcompat.app.a.b> f8293q = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8295s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f8296t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8300x = true;
    final w0 B = new a();
    final w0 C = new b();
    final y0 D = new c();

    class a extends x0 {
        a() {
        }

        @Override // j6.w0
        public void b(View view) {
            View view2;
            s sVar = s.this;
            if (sVar.f8296t && (view2 = sVar.f8284h) != null) {
                view2.setTranslationY(0.0f);
                s.this.f8281e.setTranslationY(0.0f);
            }
            s.this.f8281e.setVisibility(8);
            s.this.f8281e.setTransitioning(false);
            s sVar2 = s.this;
            sVar2.f8301y = null;
            sVar2.B();
            ActionBarOverlayLayout actionBarOverlayLayout = s.this.f8280d;
            if (actionBarOverlayLayout != null) {
                l0.e0(actionBarOverlayLayout);
            }
        }
    }

    class b extends x0 {
        b() {
        }

        @Override // j6.w0
        public void b(View view) {
            s sVar = s.this;
            sVar.f8301y = null;
            sVar.f8281e.requestLayout();
        }
    }

    class c implements y0 {
        c() {
        }

        @Override // j6.y0
        public void a(View view) {
            ((View) s.this.f8281e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f8306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f8307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.appcompat.view.b.a f8308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference<View> f8309f;

        public d(Context context, androidx.appcompat.view.b.a aVar) {
            this.f8306c = context;
            this.f8308e = aVar;
            androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(context).T(1);
            this.f8307d = eVarT;
            eVarT.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.b.a aVar = this.f8308e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f8308e == null) {
                return;
            }
            k();
            s.this.f8283g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            s sVar = s.this;
            if (sVar.f8289m != this) {
                return;
            }
            if (s.A(sVar.f8297u, sVar.f8298v, false)) {
                this.f8308e.a(this);
            } else {
                s sVar2 = s.this;
                sVar2.f8290n = this;
                sVar2.f8291o = this.f8308e;
            }
            this.f8308e = null;
            s.this.z(false);
            s.this.f8283g.g();
            s sVar3 = s.this;
            sVar3.f8280d.setHideOnContentScrollEnabled(sVar3.A);
            s.this.f8289m = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f8309f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f8307d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f8306c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return s.this.f8283g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return s.this.f8283g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (s.this.f8289m != this) {
                return;
            }
            this.f8307d.e0();
            try {
                this.f8308e.d(this, this.f8307d);
            } finally {
                this.f8307d.d0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return s.this.f8283g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            s.this.f8283g.setCustomView(view);
            this.f8309f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i15) {
            o(s.this.f8277a.getResources().getString(i15));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            s.this.f8283g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i15) {
            r(s.this.f8277a.getResources().getString(i15));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            s.this.f8283g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z15) {
            super.s(z15);
            s.this.f8283g.setTitleOptional(z15);
        }

        public boolean t() {
            this.f8307d.e0();
            try {
                return this.f8308e.b(this, this.f8307d);
            } finally {
                this.f8307d.d0();
            }
        }
    }

    public s(Activity activity, boolean z15) {
        this.f8279c = activity;
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (z15) {
            return;
        }
        this.f8284h = decorView.findViewById(R.id.content);
    }

    static boolean A(boolean z15, boolean z16, boolean z17) {
        if (z17) {
            return true;
        }
        return (z15 || z16) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g0 E(View view) {
        if (view instanceof g0) {
            return (g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Can't make a decor toolbar out of ");
        sb5.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb5.toString());
    }

    private void G() {
        if (this.f8299w) {
            this.f8299w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f8280d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            P(false);
        }
    }

    private void H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(p007NuL.r.f393p);
        this.f8280d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f8282f = E(view.findViewById(p007NuL.r.f378a));
        this.f8283g = (ActionBarContextView) view.findViewById(p007NuL.r.f383f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(p007NuL.r.f380c);
        this.f8281e = actionBarContainer;
        g0 g0Var = this.f8282f;
        if (g0Var == null || this.f8283g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f8277a = g0Var.c();
        boolean z15 = (this.f8282f.u() & 4) != 0;
        if (z15) {
            this.f8288l = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f8277a);
        M(aVarB.a() || z15);
        K(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f8277a.obtainStyledAttributes(null, v.f437a, p007NuL.m.f310c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(v.f487k, false)) {
            L(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(v.f477i, 0);
        if (dimensionPixelSize != 0) {
            J(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void K(boolean z15) {
        this.f8294r = z15;
        if (z15) {
            this.f8281e.setTabContainer(null);
            this.f8282f.q(this.f8285i);
        } else {
            this.f8282f.q(null);
            this.f8281e.setTabContainer(this.f8285i);
        }
        boolean z16 = F() == 2;
        s0 s0Var = this.f8285i;
        if (s0Var != null) {
            if (z16) {
                s0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8280d;
                if (actionBarOverlayLayout != null) {
                    l0.e0(actionBarOverlayLayout);
                }
            } else {
                s0Var.setVisibility(8);
            }
        }
        this.f8282f.o(!this.f8294r && z16);
        this.f8280d.setHasNonEmbeddedTabs(!this.f8294r && z16);
    }

    private boolean N() {
        return this.f8281e.isLaidOut();
    }

    private void O() {
        if (this.f8299w) {
            return;
        }
        this.f8299w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8280d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        P(false);
    }

    private void P(boolean z15) {
        if (A(this.f8297u, this.f8298v, this.f8299w)) {
            if (this.f8300x) {
                return;
            }
            this.f8300x = true;
            D(z15);
            return;
        }
        if (this.f8300x) {
            this.f8300x = false;
            C(z15);
        }
    }

    void B() {
        androidx.appcompat.view.b.a aVar = this.f8291o;
        if (aVar != null) {
            aVar.a(this.f8290n);
            this.f8290n = null;
            this.f8291o = null;
        }
    }

    public void C(boolean z15) {
        View view;
        androidx.appcompat.view.h hVar = this.f8301y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f8295s != 0 || (!this.f8302z && !z15)) {
            this.B.b(null);
            return;
        }
        this.f8281e.setAlpha(1.0f);
        this.f8281e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f15 = -this.f8281e.getHeight();
        if (z15) {
            int[] iArr = {0, 0};
            this.f8281e.getLocationInWindow(iArr);
            f15 -= iArr[1];
        }
        v0 v0VarL = l0.f(this.f8281e).l(f15);
        v0VarL.j(this.D);
        hVar2.c(v0VarL);
        if (this.f8296t && (view = this.f8284h) != null) {
            hVar2.c(l0.f(view).l(f15));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f8301y = hVar2;
        hVar2.h();
    }

    public void D(boolean z15) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f8301y;
        if (hVar != null) {
            hVar.a();
        }
        this.f8281e.setVisibility(0);
        if (this.f8295s == 0 && (this.f8302z || z15)) {
            this.f8281e.setTranslationY(0.0f);
            float f15 = -this.f8281e.getHeight();
            if (z15) {
                int[] iArr = {0, 0};
                this.f8281e.getLocationInWindow(iArr);
                f15 -= iArr[1];
            }
            this.f8281e.setTranslationY(f15);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            v0 v0VarL = l0.f(this.f8281e).l(0.0f);
            v0VarL.j(this.D);
            hVar2.c(v0VarL);
            if (this.f8296t && (view2 = this.f8284h) != null) {
                view2.setTranslationY(f15);
                hVar2.c(l0.f(this.f8284h).l(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f8301y = hVar2;
            hVar2.h();
        } else {
            this.f8281e.setAlpha(1.0f);
            this.f8281e.setTranslationY(0.0f);
            if (this.f8296t && (view = this.f8284h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8280d;
        if (actionBarOverlayLayout != null) {
            l0.e0(actionBarOverlayLayout);
        }
    }

    public int F() {
        return this.f8282f.k();
    }

    public void I(int i15, int i16) {
        int iU = this.f8282f.u();
        if ((i16 & 4) != 0) {
            this.f8288l = true;
        }
        this.f8282f.j((i15 & i16) | ((~i16) & iU));
    }

    public void J(float f15) {
        l0.m0(this.f8281e, f15);
    }

    public void L(boolean z15) {
        if (z15 && !this.f8280d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z15;
        this.f8280d.setHideOnContentScrollEnabled(z15);
    }

    public void M(boolean z15) {
        this.f8282f.m(z15);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f8298v) {
            this.f8298v = false;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z15) {
        this.f8296t = z15;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f8298v) {
            return;
        }
        this.f8298v = true;
        P(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f8301y;
        if (hVar != null) {
            hVar.a();
            this.f8301y = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        g0 g0Var = this.f8282f;
        if (g0Var == null || !g0Var.i()) {
            return false;
        }
        this.f8282f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z15) {
        if (z15 == this.f8292p) {
            return;
        }
        this.f8292p = z15;
        int size = this.f8293q.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f8293q.get(i15).onMenuVisibilityChanged(z15);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f8282f.u();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f8278b == null) {
            TypedValue typedValue = new TypedValue();
            this.f8277a.getTheme().resolveAttribute(p007NuL.m.f314g, typedValue, true);
            int i15 = typedValue.resourceId;
            if (i15 != 0) {
                this.f8278b = new ContextThemeWrapper(this.f8277a, i15);
            } else {
                this.f8278b = this.f8277a;
            }
        }
        return this.f8278b;
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        if (this.f8297u) {
            return;
        }
        this.f8297u = true;
        P(false);
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        K(androidx.appcompat.view.a.b(this.f8277a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i15, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f8289m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i15, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i15) {
        this.f8295s = i15;
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z15) {
        if (this.f8288l) {
            return;
        }
        s(z15);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z15) {
        I(z15 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z15) {
        I(z15 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void u(Drawable drawable) {
        this.f8282f.r(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z15) {
        androidx.appcompat.view.h hVar;
        this.f8302z = z15;
        if (z15 || (hVar = this.f8301y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f8282f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f8282f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b y(androidx.appcompat.view.b.a aVar) {
        d dVar = this.f8289m;
        if (dVar != null) {
            dVar.c();
        }
        this.f8280d.setHideOnContentScrollEnabled(false);
        this.f8283g.k();
        d dVar2 = new d(this.f8283g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f8289m = dVar2;
        dVar2.k();
        this.f8283g.h(dVar2);
        z(true);
        return dVar2;
    }

    public void z(boolean z15) {
        v0 v0VarL;
        v0 v0VarF;
        if (z15) {
            O();
        } else {
            G();
        }
        if (!N()) {
            if (z15) {
                this.f8282f.t(4);
                this.f8283g.setVisibility(0);
                return;
            } else {
                this.f8282f.t(0);
                this.f8283g.setVisibility(8);
                return;
            }
        }
        if (z15) {
            v0VarF = this.f8282f.l(4, 100L);
            v0VarL = this.f8283g.f(0, 200L);
        } else {
            v0VarL = this.f8282f.l(0, 200L);
            v0VarF = this.f8283g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(v0VarF, v0VarL);
        hVar.h();
    }

    public s(Dialog dialog) {
        H(dialog.getWindow().getDecorView());
    }
}
