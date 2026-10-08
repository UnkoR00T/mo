package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f9006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x0 f9007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x0 f9008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x0 f9009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9010e = 0;

    public q(ImageView imageView) {
        this.f9006a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f9009d == null) {
            this.f9009d = new x0();
        }
        x0 x0Var = this.f9009d;
        x0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f9006a);
        if (colorStateListA != null) {
            x0Var.f9091d = true;
            x0Var.f9088a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f9006a);
        if (modeB != null) {
            x0Var.f9090c = true;
            x0Var.f9089b = modeB;
        }
        if (!x0Var.f9091d && !x0Var.f9090c) {
            return false;
        }
        k.i(drawable, x0Var, this.f9006a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f9007b != null;
    }

    void b() {
        if (this.f9006a.getDrawable() != null) {
            this.f9006a.getDrawable().setLevel(this.f9010e);
        }
    }

    void c() {
        Drawable drawable = this.f9006a.getDrawable();
        if (drawable != null) {
            h0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            x0 x0Var = this.f9008c;
            if (x0Var != null) {
                k.i(drawable, x0Var, this.f9006a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f9007b;
            if (x0Var2 != null) {
                k.i(drawable, x0Var2, this.f9006a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        x0 x0Var = this.f9008c;
        if (x0Var != null) {
            return x0Var.f9088a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        x0 x0Var = this.f9008c;
        if (x0Var != null) {
            return x0Var.f9089b;
        }
        return null;
    }

    boolean f() {
        return !(this.f9006a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i15) {
        int iN;
        z0 z0VarV = z0.v(this.f9006a.getContext(), attributeSet, p007NuL.v.P, i15, 0);
        ImageView imageView = this.f9006a;
        j6.l0.f0(imageView, imageView.getContext(), p007NuL.v.P, attributeSet, z0VarV.r(), i15, 0);
        try {
            Drawable drawable = this.f9006a.getDrawable();
            if (drawable == null && (iN = z0VarV.n(p007NuL.v.Q, -1)) != -1 && (drawable = p082nUL.y.b(this.f9006a.getContext(), iN)) != null) {
                this.f9006a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h0.b(drawable);
            }
            if (z0VarV.s(p007NuL.v.R)) {
                androidx.core.widget.e.c(this.f9006a, z0VarV.c(p007NuL.v.R));
            }
            if (z0VarV.s(p007NuL.v.S)) {
                androidx.core.widget.e.d(this.f9006a, h0.d(z0VarV.k(p007NuL.v.S, -1), null));
            }
        } finally {
            z0VarV.x();
        }
    }

    void h(Drawable drawable) {
        this.f9010e = drawable.getLevel();
    }

    public void i(int i15) {
        if (i15 != 0) {
            Drawable drawableB = p082nUL.y.b(this.f9006a.getContext(), i15);
            if (drawableB != null) {
                h0.b(drawableB);
            }
            this.f9006a.setImageDrawable(drawableB);
        } else {
            this.f9006a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f9008c == null) {
            this.f9008c = new x0();
        }
        x0 x0Var = this.f9008c;
        x0Var.f9088a = colorStateList;
        x0Var.f9091d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f9008c == null) {
            this.f9008c = new x0();
        }
        x0 x0Var = this.f9008c;
        x0Var.f9089b = mode;
        x0Var.f9090c = true;
        c();
    }
}
