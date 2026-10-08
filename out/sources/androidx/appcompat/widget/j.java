package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f8907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f8908b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f8909c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8910d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8911e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8912f;

    j(CompoundButton compoundButton) {
        this.f8907a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f8907a);
        if (drawableA != null) {
            if (this.f8910d || this.f8911e) {
                Drawable drawableMutate = y5.a.r(drawableA).mutate();
                if (this.f8910d) {
                    y5.a.o(drawableMutate, this.f8908b);
                }
                if (this.f8911e) {
                    y5.a.p(drawableMutate, this.f8909c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f8907a.getDrawableState());
                }
                this.f8907a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f8908b;
    }

    PorterDuff.Mode c() {
        return this.f8909c;
    }

    void d(AttributeSet attributeSet, int i15) {
        int iN;
        int iN2;
        z0 z0VarV = z0.v(this.f8907a.getContext(), attributeSet, p007NuL.v.U0, i15, 0);
        CompoundButton compoundButton = this.f8907a;
        j6.l0.f0(compoundButton, compoundButton.getContext(), p007NuL.v.U0, attributeSet, z0VarV.r(), i15, 0);
        try {
            if (z0VarV.s(p007NuL.v.W0) && (iN2 = z0VarV.n(p007NuL.v.W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f8907a;
                    compoundButton2.setButtonDrawable(p082nUL.y.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (z0VarV.s(p007NuL.v.V0)) {
                        CompoundButton compoundButton3 = this.f8907a;
                        compoundButton3.setButtonDrawable(p082nUL.y.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (z0VarV.s(p007NuL.v.V0) && (iN = z0VarV.n(p007NuL.v.V0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f8907a;
                compoundButton4.setButtonDrawable(p082nUL.y.b(compoundButton4.getContext(), iN));
            }
            if (z0VarV.s(p007NuL.v.X0)) {
                androidx.core.widget.c.d(this.f8907a, z0VarV.c(p007NuL.v.X0));
            }
            if (z0VarV.s(p007NuL.v.Y0)) {
                androidx.core.widget.c.e(this.f8907a, h0.d(z0VarV.k(p007NuL.v.Y0, -1), null));
            }
        } finally {
            z0VarV.x();
        }
    }

    void e() {
        if (this.f8912f) {
            this.f8912f = false;
        } else {
            this.f8912f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f8908b = colorStateList;
        this.f8910d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f8909c = mode;
        this.f8911e = true;
        a();
    }
}
