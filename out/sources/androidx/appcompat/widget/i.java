package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f8881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f8882b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f8883c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8884d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8885e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8886f;

    i(CheckedTextView checkedTextView) {
        this.f8881a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f8881a);
        if (drawableA != null) {
            if (this.f8884d || this.f8885e) {
                Drawable drawableMutate = y5.a.r(drawableA).mutate();
                if (this.f8884d) {
                    y5.a.o(drawableMutate, this.f8882b);
                }
                if (this.f8885e) {
                    y5.a.p(drawableMutate, this.f8883c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f8881a.getDrawableState());
                }
                this.f8881a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f8882b;
    }

    PorterDuff.Mode c() {
        return this.f8883c;
    }

    void d(AttributeSet attributeSet, int i15) {
        int iN;
        int iN2;
        z0 z0VarV = z0.v(this.f8881a.getContext(), attributeSet, p007NuL.v.P0, i15, 0);
        CheckedTextView checkedTextView = this.f8881a;
        j6.l0.f0(checkedTextView, checkedTextView.getContext(), p007NuL.v.P0, attributeSet, z0VarV.r(), i15, 0);
        try {
            if (z0VarV.s(p007NuL.v.R0) && (iN2 = z0VarV.n(p007NuL.v.R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f8881a;
                    checkedTextView2.setCheckMarkDrawable(p082nUL.y.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (z0VarV.s(p007NuL.v.Q0)) {
                        CheckedTextView checkedTextView3 = this.f8881a;
                        checkedTextView3.setCheckMarkDrawable(p082nUL.y.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (z0VarV.s(p007NuL.v.Q0) && (iN = z0VarV.n(p007NuL.v.Q0, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f8881a;
                checkedTextView4.setCheckMarkDrawable(p082nUL.y.b(checkedTextView4.getContext(), iN));
            }
            if (z0VarV.s(p007NuL.v.S0)) {
                androidx.core.widget.b.b(this.f8881a, z0VarV.c(p007NuL.v.S0));
            }
            if (z0VarV.s(p007NuL.v.T0)) {
                androidx.core.widget.b.c(this.f8881a, h0.d(z0VarV.k(p007NuL.v.T0, -1), null));
            }
        } finally {
            z0VarV.x();
        }
    }

    void e() {
        if (this.f8886f) {
            this.f8886f = false;
        } else {
            this.f8886f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f8882b = colorStateList;
        this.f8884d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f8883c = mode;
        this.f8885e = true;
        a();
    }
}
