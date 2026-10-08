package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import lj.h;
import lj.l;
import lj.o;
import lj.q;
import z6.j;

/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f34938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f34939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f34940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f34941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.d f34942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f34949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f34950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f34951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f34952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f34953p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f34957t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LayerDrawable f34959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f34960w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34954q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f34955r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f34956s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f34958u = true;

    e(MaterialButton materialButton, l lVar) {
        this.f34938a = materialButton;
        this.f34939b = lVar;
    }

    private void L(int i15, int i16) {
        int paddingStart = this.f34938a.getPaddingStart();
        int paddingTop = this.f34938a.getPaddingTop();
        int paddingEnd = this.f34938a.getPaddingEnd();
        int paddingBottom = this.f34938a.getPaddingBottom();
        int i17 = this.f34945h;
        int i18 = this.f34946i;
        this.f34946i = i16;
        this.f34945h = i15;
        if (!this.f34955r) {
            M();
        }
        this.f34938a.setPaddingRelative(paddingStart, (paddingTop + i15) - i17, paddingEnd, (paddingBottom + i16) - i18);
    }

    private void M() {
        this.f34938a.setInternalBackground(a());
        h hVarG = g();
        if (hVarG != null) {
            hVarG.f0(this.f34960w);
            hVarG.setState(this.f34938a.getDrawableState());
        }
    }

    private void N() {
        h hVarG = g();
        if (hVarG != null) {
            q qVar = this.f34940c;
            if (qVar != null) {
                hVarG.l0(qVar);
            } else {
                hVarG.setShapeAppearanceModel(this.f34939b);
            }
            j jVar = this.f34941d;
            if (jVar != null) {
                hVarG.e0(jVar);
            }
        }
        h hVarP = p();
        if (hVarP != null) {
            q qVar2 = this.f34940c;
            if (qVar2 != null) {
                hVarP.l0(qVar2);
            } else {
                hVarP.setShapeAppearanceModel(this.f34939b);
            }
            j jVar2 = this.f34941d;
            if (jVar2 != null) {
                hVarP.e0(jVar2);
            }
        }
        o oVarF = f();
        if (oVarF != null) {
            oVarF.setShapeAppearanceModel(this.f34939b);
            if (oVarF instanceof h) {
                h hVar = (h) oVarF;
                q qVar3 = this.f34940c;
                if (qVar3 != null) {
                    hVar.l0(qVar3);
                }
                j jVar3 = this.f34941d;
                if (jVar3 != null) {
                    hVar.e0(jVar3);
                }
            }
        }
    }

    private void O() {
        h hVarG = g();
        h hVarP = p();
        if (hVarG != null) {
            hVarG.n0(this.f34948k, this.f34951n);
            if (hVarP != null) {
                hVarP.m0(this.f34948k, this.f34954q ? bj.a.d(this.f34938a, ri.b.f173912g) : 0);
            }
        }
    }

    private InsetDrawable P(Drawable drawable) {
        return new InsetDrawable(drawable, this.f34943f, this.f34945h, this.f34944g, this.f34946i);
    }

    private Drawable a() {
        h hVar = new h(this.f34939b);
        q qVar = this.f34940c;
        if (qVar != null) {
            hVar.l0(qVar);
        }
        j jVar = this.f34941d;
        if (jVar != null) {
            hVar.e0(jVar);
        }
        h.d dVar = this.f34942e;
        if (dVar != null) {
            hVar.i0(dVar);
        }
        hVar.U(this.f34938a.getContext());
        hVar.setTintList(this.f34950m);
        PorterDuff.Mode mode = this.f34949l;
        if (mode != null) {
            hVar.setTintMode(mode);
        }
        hVar.n0(this.f34948k, this.f34951n);
        h hVar2 = new h(this.f34939b);
        q qVar2 = this.f34940c;
        if (qVar2 != null) {
            hVar2.l0(qVar2);
        }
        j jVar2 = this.f34941d;
        if (jVar2 != null) {
            hVar2.e0(jVar2);
        }
        hVar2.setTint(0);
        hVar2.m0(this.f34948k, this.f34954q ? bj.a.d(this.f34938a, ri.b.f173912g) : 0);
        h hVar3 = new h(this.f34939b);
        this.f34953p = hVar3;
        q qVar3 = this.f34940c;
        if (qVar3 != null) {
            hVar3.l0(qVar3);
        }
        j jVar3 = this.f34941d;
        if (jVar3 != null) {
            ((h) this.f34953p).e0(jVar3);
        }
        this.f34953p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(jj.a.d(this.f34952o), P(new LayerDrawable(new Drawable[]{hVar2, hVar})), this.f34953p);
        this.f34959v = rippleDrawable;
        return rippleDrawable;
    }

    private h h(boolean z15) {
        LayerDrawable layerDrawable = this.f34959v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.f34959v.getDrawable(0)).getDrawable()).getDrawable(!z15 ? 1 : 0);
    }

    private h p() {
        return h(true);
    }

    public void A(int i15) {
        L(this.f34945h, i15);
    }

    public void B(int i15) {
        L(i15, this.f34946i);
    }

    void C(ColorStateList colorStateList) {
        if (this.f34952o != colorStateList) {
            this.f34952o = colorStateList;
            if (this.f34938a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f34938a.getBackground()).setColor(jj.a.d(colorStateList));
            }
        }
    }

    void D(l lVar) {
        this.f34939b = lVar;
        this.f34940c = null;
        N();
    }

    void E(boolean z15) {
        this.f34954q = z15;
        O();
    }

    void F(q qVar) {
        this.f34940c = qVar;
        N();
    }

    void G(ColorStateList colorStateList) {
        if (this.f34951n != colorStateList) {
            this.f34951n = colorStateList;
            O();
        }
    }

    void H(int i15) {
        if (this.f34948k != i15) {
            this.f34948k = i15;
            O();
        }
    }

    void I(ColorStateList colorStateList) {
        if (this.f34950m != colorStateList) {
            this.f34950m = colorStateList;
            if (g() != null) {
                g().setTintList(this.f34950m);
            }
        }
    }

    void J(PorterDuff.Mode mode) {
        if (this.f34949l != mode) {
            this.f34949l = mode;
            if (g() == null || this.f34949l == null) {
                return;
            }
            g().setTintMode(this.f34949l);
        }
    }

    void K(boolean z15) {
        this.f34958u = z15;
    }

    int b() {
        return this.f34947j;
    }

    j c() {
        return this.f34941d;
    }

    public int d() {
        return this.f34946i;
    }

    public int e() {
        return this.f34945h;
    }

    public o f() {
        LayerDrawable layerDrawable = this.f34959v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f34959v.getNumberOfLayers() > 2 ? (o) this.f34959v.getDrawable(2) : (o) this.f34959v.getDrawable(1);
    }

    h g() {
        return h(false);
    }

    ColorStateList i() {
        return this.f34952o;
    }

    l j() {
        return this.f34939b;
    }

    q k() {
        return this.f34940c;
    }

    ColorStateList l() {
        return this.f34951n;
    }

    int m() {
        return this.f34948k;
    }

    ColorStateList n() {
        return this.f34950m;
    }

    PorterDuff.Mode o() {
        return this.f34949l;
    }

    boolean q() {
        return this.f34955r;
    }

    boolean r() {
        return this.f34957t;
    }

    boolean s() {
        return this.f34958u;
    }

    void t(TypedArray typedArray) {
        this.f34943f = typedArray.getDimensionPixelOffset(ri.l.R1, 0);
        this.f34944g = typedArray.getDimensionPixelOffset(ri.l.S1, 0);
        this.f34945h = typedArray.getDimensionPixelOffset(ri.l.T1, 0);
        this.f34946i = typedArray.getDimensionPixelOffset(ri.l.U1, 0);
        if (typedArray.hasValue(ri.l.Y1)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(ri.l.Y1, -1);
            this.f34947j = dimensionPixelSize;
            D(this.f34939b.x(dimensionPixelSize));
            this.f34956s = true;
        }
        this.f34948k = typedArray.getDimensionPixelSize(ri.l.f174176k2, 0);
        this.f34949l = com.google.android.material.internal.q.h(typedArray.getInt(ri.l.X1, -1), PorterDuff.Mode.SRC_IN);
        this.f34950m = ij.c.a(this.f34938a.getContext(), typedArray, ri.l.W1);
        this.f34951n = ij.c.a(this.f34938a.getContext(), typedArray, ri.l.f174168j2);
        this.f34952o = ij.c.a(this.f34938a.getContext(), typedArray, ri.l.f174152h2);
        this.f34957t = typedArray.getBoolean(ri.l.V1, false);
        this.f34960w = typedArray.getDimensionPixelSize(ri.l.Z1, 0);
        this.f34958u = typedArray.getBoolean(ri.l.f174184l2, true);
        int paddingStart = this.f34938a.getPaddingStart();
        int paddingTop = this.f34938a.getPaddingTop();
        int paddingEnd = this.f34938a.getPaddingEnd();
        int paddingBottom = this.f34938a.getPaddingBottom();
        if (typedArray.hasValue(ri.l.P1)) {
            v();
        } else {
            M();
        }
        this.f34938a.setPaddingRelative(paddingStart + this.f34943f, paddingTop + this.f34945h, paddingEnd + this.f34944g, paddingBottom + this.f34946i);
    }

    void u(int i15) {
        if (g() != null) {
            g().setTint(i15);
        }
    }

    void v() {
        this.f34955r = true;
        this.f34938a.setSupportBackgroundTintList(this.f34950m);
        this.f34938a.setSupportBackgroundTintMode(this.f34949l);
    }

    void w(boolean z15) {
        this.f34957t = z15;
    }

    void x(int i15) {
        if (this.f34956s && this.f34947j == i15) {
            return;
        }
        this.f34947j = i15;
        this.f34956s = true;
        D(this.f34939b.x(i15));
    }

    void y(h.d dVar) {
        this.f34942e = dVar;
        h hVarG = g();
        if (hVarG != null) {
            hVarG.i0(dVar);
        }
    }

    void z(j jVar) {
        this.f34941d = jVar;
        if (this.f34940c != null) {
            N();
        }
    }
}
