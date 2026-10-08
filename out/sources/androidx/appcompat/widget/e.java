package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f8853a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x0 f8856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x0 f8857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x0 f8858f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8855c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f8854b = k.b();

    e(View view) {
        this.f8853a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f8858f == null) {
            this.f8858f = new x0();
        }
        x0 x0Var = this.f8858f;
        x0Var.a();
        ColorStateList colorStateListR = j6.l0.r(this.f8853a);
        if (colorStateListR != null) {
            x0Var.f9091d = true;
            x0Var.f9088a = colorStateListR;
        }
        PorterDuff.Mode modeS = j6.l0.s(this.f8853a);
        if (modeS != null) {
            x0Var.f9090c = true;
            x0Var.f9089b = modeS;
        }
        if (!x0Var.f9091d && !x0Var.f9090c) {
            return false;
        }
        k.i(drawable, x0Var, this.f8853a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f8856d != null;
    }

    void b() {
        Drawable background = this.f8853a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            x0 x0Var = this.f8857e;
            if (x0Var != null) {
                k.i(background, x0Var, this.f8853a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f8856d;
            if (x0Var2 != null) {
                k.i(background, x0Var2, this.f8853a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        x0 x0Var = this.f8857e;
        if (x0Var != null) {
            return x0Var.f9088a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        x0 x0Var = this.f8857e;
        if (x0Var != null) {
            return x0Var.f9089b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i15) {
        z0 z0VarV = z0.v(this.f8853a.getContext(), attributeSet, p007NuL.v.f496l3, i15, 0);
        View view = this.f8853a;
        j6.l0.f0(view, view.getContext(), p007NuL.v.f496l3, attributeSet, z0VarV.r(), i15, 0);
        try {
            if (z0VarV.s(p007NuL.v.f501m3)) {
                this.f8855c = z0VarV.n(p007NuL.v.f501m3, -1);
                ColorStateList colorStateListF = this.f8854b.f(this.f8853a.getContext(), this.f8855c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (z0VarV.s(p007NuL.v.f506n3)) {
                j6.l0.k0(this.f8853a, z0VarV.c(p007NuL.v.f506n3));
            }
            if (z0VarV.s(p007NuL.v.f511o3)) {
                j6.l0.l0(this.f8853a, h0.d(z0VarV.k(p007NuL.v.f511o3, -1), null));
            }
        } finally {
            z0VarV.x();
        }
    }

    void f(Drawable drawable) {
        this.f8855c = -1;
        h(null);
        b();
    }

    void g(int i15) {
        this.f8855c = i15;
        k kVar = this.f8854b;
        h(kVar != null ? kVar.f(this.f8853a.getContext(), i15) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f8856d == null) {
                this.f8856d = new x0();
            }
            x0 x0Var = this.f8856d;
            x0Var.f9088a = colorStateList;
            x0Var.f9091d = true;
        } else {
            this.f8856d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f8857e == null) {
            this.f8857e = new x0();
        }
        x0 x0Var = this.f8857e;
        x0Var.f9088a = colorStateList;
        x0Var.f9091d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f8857e == null) {
            this.f8857e = new x0();
        }
        x0 x0Var = this.f8857e;
        x0Var.f9089b = mode;
        x0Var.f9090c = true;
        b();
    }
}
