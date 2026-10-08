package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
class z extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f9094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f9095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f9096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f9097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9099i;

    z(SeekBar seekBar) {
        super(seekBar);
        this.f9096f = null;
        this.f9097g = null;
        this.f9098h = false;
        this.f9099i = false;
        this.f9094d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f9095e;
        if (drawable != null) {
            if (this.f9098h || this.f9099i) {
                Drawable drawableR = y5.a.r(drawable.mutate());
                this.f9095e = drawableR;
                if (this.f9098h) {
                    y5.a.o(drawableR, this.f9096f);
                }
                if (this.f9099i) {
                    y5.a.p(this.f9095e, this.f9097g);
                }
                if (this.f9095e.isStateful()) {
                    this.f9095e.setState(this.f9094d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.u
    void c(AttributeSet attributeSet, int i15) {
        super.c(attributeSet, i15);
        z0 z0VarV = z0.v(this.f9094d.getContext(), attributeSet, p007NuL.v.T, i15, 0);
        SeekBar seekBar = this.f9094d;
        j6.l0.f0(seekBar, seekBar.getContext(), p007NuL.v.T, attributeSet, z0VarV.r(), i15, 0);
        Drawable drawableH = z0VarV.h(p007NuL.v.U);
        if (drawableH != null) {
            this.f9094d.setThumb(drawableH);
        }
        j(z0VarV.g(p007NuL.v.V));
        if (z0VarV.s(p007NuL.v.X)) {
            this.f9097g = h0.d(z0VarV.k(p007NuL.v.X, -1), this.f9097g);
            this.f9099i = true;
        }
        if (z0VarV.s(p007NuL.v.W)) {
            this.f9096f = z0VarV.c(p007NuL.v.W);
            this.f9098h = true;
        }
        z0VarV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f9095e != null) {
            int max = this.f9094d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f9095e.getIntrinsicWidth();
                int intrinsicHeight = this.f9095e.getIntrinsicHeight();
                int i15 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i16 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f9095e.setBounds(-i15, -i16, i15, i16);
                float width = ((this.f9094d.getWidth() - this.f9094d.getPaddingLeft()) - this.f9094d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f9094d.getPaddingLeft(), this.f9094d.getHeight() / 2);
                for (int i17 = 0; i17 <= max; i17++) {
                    this.f9095e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f9095e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f9094d.getDrawableState())) {
            this.f9094d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f9095e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f9095e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9095e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f9094d);
            y5.a.m(drawable, this.f9094d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f9094d.getDrawableState());
            }
            f();
        }
        this.f9094d.invalidate();
    }
}
