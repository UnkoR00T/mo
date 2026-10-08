package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import p011Prn.b2;

/* JADX INFO: loaded from: classes.dex */
public class d1 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f8831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f8833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f8834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f8835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f8836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f8837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f8839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f8840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f8841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f8842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f8843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f8844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f8847q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b2 f8848a;

        a() {
            this.f8848a = new b2(d1.this.f8831a.getContext(), 0, R.id.home, 0, 0, d1.this.f8839i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d1 d1Var = d1.this;
            Window.Callback callback = d1Var.f8842l;
            if (callback == null || !d1Var.f8843m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f8848a);
        }
    }

    class b extends j6.x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8850a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8851b;

        b(int i15) {
            this.f8851b = i15;
        }

        @Override // j6.x0, j6.w0
        public void a(View view) {
            this.f8850a = true;
        }

        @Override // j6.w0
        public void b(View view) {
            if (this.f8850a) {
                return;
            }
            d1.this.f8831a.setVisibility(this.f8851b);
        }

        @Override // j6.x0, j6.w0
        public void c(View view) {
            d1.this.f8831a.setVisibility(0);
        }
    }

    public d1(Toolbar toolbar, boolean z15) {
        this(toolbar, z15, p007NuL.t.f421a, p007NuL.q.f365n);
    }

    private void D(CharSequence charSequence) {
        this.f8839i = charSequence;
        if ((this.f8832b & 8) != 0) {
            this.f8831a.setTitle(charSequence);
            if (this.f8838h) {
                j6.l0.j0(this.f8831a.getRootView(), charSequence);
            }
        }
    }

    private void E() {
        if ((this.f8832b & 4) != 0) {
            if (TextUtils.isEmpty(this.f8841k)) {
                this.f8831a.setNavigationContentDescription(this.f8846p);
            } else {
                this.f8831a.setNavigationContentDescription(this.f8841k);
            }
        }
    }

    private void F() {
        if ((this.f8832b & 4) == 0) {
            this.f8831a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f8831a;
        Drawable drawable = this.f8837g;
        if (drawable == null) {
            drawable = this.f8847q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void G() {
        Drawable drawable;
        int i15 = this.f8832b;
        if ((i15 & 2) == 0) {
            drawable = null;
        } else if ((i15 & 1) == 0 || (drawable = this.f8836f) == null) {
            drawable = this.f8835e;
        }
        this.f8831a.setLogo(drawable);
    }

    private int w() {
        if (this.f8831a.getNavigationIcon() == null) {
            return 11;
        }
        this.f8847q = this.f8831a.getNavigationIcon();
        return 15;
    }

    public void A(CharSequence charSequence) {
        this.f8841k = charSequence;
        E();
    }

    public void B(Drawable drawable) {
        this.f8837g = drawable;
        F();
    }

    public void C(CharSequence charSequence) {
        this.f8840j = charSequence;
        if ((this.f8832b & 8) != 0) {
            this.f8831a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.g0
    public boolean a() {
        return this.f8831a.d();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean b() {
        return this.f8831a.w();
    }

    @Override // androidx.appcompat.widget.g0
    public Context c() {
        return this.f8831a.getContext();
    }

    @Override // androidx.appcompat.widget.g0
    public void collapseActionView() {
        this.f8831a.e();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean d() {
        return this.f8831a.R();
    }

    @Override // androidx.appcompat.widget.g0
    public void e(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        if (this.f8844n == null) {
            c cVar = new c(this.f8831a.getContext());
            this.f8844n = cVar;
            cVar.p(p007NuL.r.f384g);
        }
        this.f8844n.e(aVar);
        this.f8831a.M((androidx.appcompat.view.menu.e) menu, this.f8844n);
    }

    @Override // androidx.appcompat.widget.g0
    public boolean f() {
        return this.f8831a.D();
    }

    @Override // androidx.appcompat.widget.g0
    public void g() {
        this.f8843m = true;
    }

    @Override // androidx.appcompat.widget.g0
    public CharSequence getTitle() {
        return this.f8831a.getTitle();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean h() {
        return this.f8831a.C();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean i() {
        return this.f8831a.v();
    }

    @Override // androidx.appcompat.widget.g0
    public void j(int i15) {
        View view;
        int i16 = this.f8832b ^ i15;
        this.f8832b = i15;
        if (i16 != 0) {
            if ((i16 & 4) != 0) {
                if ((i15 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i16 & 3) != 0) {
                G();
            }
            if ((i16 & 8) != 0) {
                if ((i15 & 8) != 0) {
                    this.f8831a.setTitle(this.f8839i);
                    this.f8831a.setSubtitle(this.f8840j);
                } else {
                    this.f8831a.setTitle((CharSequence) null);
                    this.f8831a.setSubtitle((CharSequence) null);
                }
            }
            if ((i16 & 16) == 0 || (view = this.f8834d) == null) {
                return;
            }
            if ((i15 & 16) != 0) {
                this.f8831a.addView(view);
            } else {
                this.f8831a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.g0
    public int k() {
        return this.f8845o;
    }

    @Override // androidx.appcompat.widget.g0
    public j6.v0 l(int i15, long j15) {
        return j6.l0.f(this.f8831a).b(i15 == 0 ? 1.0f : 0.0f).e(j15).g(new b(i15));
    }

    @Override // androidx.appcompat.widget.g0
    public void m(boolean z15) {
    }

    @Override // androidx.appcompat.widget.g0
    public void n() {
    }

    @Override // androidx.appcompat.widget.g0
    public void o(boolean z15) {
        this.f8831a.setCollapsible(z15);
    }

    @Override // androidx.appcompat.widget.g0
    public void p() {
        this.f8831a.f();
    }

    @Override // androidx.appcompat.widget.g0
    public void q(s0 s0Var) {
        View view = this.f8833c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f8831a;
            if (parent == toolbar) {
                toolbar.removeView(this.f8833c);
            }
        }
        this.f8833c = s0Var;
        if (s0Var == null || this.f8845o != 2) {
            return;
        }
        this.f8831a.addView(s0Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.f8833c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f8161a = 8388691;
        s0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.g0
    public void r(Drawable drawable) {
        this.f8836f = drawable;
        G();
    }

    @Override // androidx.appcompat.widget.g0
    public void s(int i15) {
        r(i15 != 0 ? p082nUL.y.b(c(), i15) : null);
    }

    @Override // androidx.appcompat.widget.g0
    public void setIcon(int i15) {
        setIcon(i15 != 0 ? p082nUL.y.b(c(), i15) : null);
    }

    @Override // androidx.appcompat.widget.g0
    public void setTitle(CharSequence charSequence) {
        this.f8838h = true;
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowCallback(Window.Callback callback) {
        this.f8842l = callback;
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f8838h) {
            return;
        }
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.g0
    public void t(int i15) {
        this.f8831a.setVisibility(i15);
    }

    @Override // androidx.appcompat.widget.g0
    public int u() {
        return this.f8832b;
    }

    @Override // androidx.appcompat.widget.g0
    public void v() {
    }

    public void x(View view) {
        View view2 = this.f8834d;
        if (view2 != null && (this.f8832b & 16) != 0) {
            this.f8831a.removeView(view2);
        }
        this.f8834d = view;
        if (view == null || (this.f8832b & 16) == 0) {
            return;
        }
        this.f8831a.addView(view);
    }

    public void y(int i15) {
        if (i15 == this.f8846p) {
            return;
        }
        this.f8846p = i15;
        if (TextUtils.isEmpty(this.f8831a.getNavigationContentDescription())) {
            z(this.f8846p);
        }
    }

    public void z(int i15) {
        A(i15 == 0 ? null : c().getString(i15));
    }

    public d1(Toolbar toolbar, boolean z15, int i15, int i16) {
        Drawable drawable;
        this.f8845o = 0;
        this.f8846p = 0;
        this.f8831a = toolbar;
        this.f8839i = toolbar.getTitle();
        this.f8840j = toolbar.getSubtitle();
        this.f8838h = this.f8839i != null;
        this.f8837g = toolbar.getNavigationIcon();
        z0 z0VarV = z0.v(toolbar.getContext(), null, p007NuL.v.f437a, p007NuL.m.f310c, 0);
        this.f8847q = z0VarV.g(p007NuL.v.f492l);
        if (z15) {
            CharSequence charSequenceP = z0VarV.p(p007NuL.v.f522r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = z0VarV.p(p007NuL.v.f512p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                C(charSequenceP2);
            }
            Drawable drawableG = z0VarV.g(p007NuL.v.f502n);
            if (drawableG != null) {
                r(drawableG);
            }
            Drawable drawableG2 = z0VarV.g(p007NuL.v.f497m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f8837g == null && (drawable = this.f8847q) != null) {
                B(drawable);
            }
            j(z0VarV.k(p007NuL.v.f472h, 0));
            int iN = z0VarV.n(p007NuL.v.f467g, 0);
            if (iN != 0) {
                x(LayoutInflater.from(this.f8831a.getContext()).inflate(iN, (ViewGroup) this.f8831a, false));
                j(this.f8832b | 16);
            }
            int iM = z0VarV.m(p007NuL.v.f482j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f8831a.getLayoutParams();
                layoutParams.height = iM;
                this.f8831a.setLayoutParams(layoutParams);
            }
            int iE = z0VarV.e(p007NuL.v.f462f, -1);
            int iE2 = z0VarV.e(p007NuL.v.f457e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f8831a.L(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = z0VarV.n(p007NuL.v.f527s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f8831a;
                toolbar2.O(toolbar2.getContext(), iN2);
            }
            int iN3 = z0VarV.n(p007NuL.v.f517q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f8831a;
                toolbar3.N(toolbar3.getContext(), iN3);
            }
            int iN4 = z0VarV.n(p007NuL.v.f507o, 0);
            if (iN4 != 0) {
                this.f8831a.setPopupTheme(iN4);
            }
        } else {
            this.f8832b = w();
        }
        z0VarV.x();
        y(i15);
        this.f8841k = this.f8831a.getNavigationContentDescription();
        this.f8831a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.g0
    public void setIcon(Drawable drawable) {
        this.f8835e = drawable;
        G();
    }
}
