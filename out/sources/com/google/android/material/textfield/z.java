package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.z0;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ViewConstructor"})
class z extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextInputLayout f35822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f35823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f35824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f35825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f35826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f35827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f35829h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View.OnLongClickListener f35830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35831k;

    z(TextInputLayout textInputLayout, z0 z0Var) {
        super(textInputLayout.getContext());
        this.f35822a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(ri.h.f174024e, (ViewGroup) this, false);
        this.f35825d = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f35823b = appCompatTextView;
        j(z0Var);
        i(z0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i15 = (this.f35824c == null || this.f35831k) ? 8 : 0;
        setVisibility((this.f35825d.getVisibility() == 0 || i15 == 0) ? 0 : 8);
        this.f35823b.setVisibility(i15);
        this.f35822a.p0();
    }

    private void i(z0 z0Var) {
        this.f35823b.setVisibility(8);
        this.f35823b.setId(ri.f.Q);
        this.f35823b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f35823b.setAccessibilityLiveRegion(1);
        o(z0Var.n(ri.l.E6, 0));
        if (z0Var.s(ri.l.F6)) {
            p(z0Var.c(ri.l.F6));
        }
        n(z0Var.p(ri.l.D6));
    }

    private void j(z0 z0Var) {
        if (ij.c.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f35825d.getLayoutParams()).setMarginEnd(0);
        }
        u(null);
        v(null);
        if (z0Var.s(ri.l.L6)) {
            this.f35826e = ij.c.b(getContext(), z0Var, ri.l.L6);
        }
        if (z0Var.s(ri.l.M6)) {
            this.f35827f = com.google.android.material.internal.q.h(z0Var.k(ri.l.M6, -1), null);
        }
        if (z0Var.s(ri.l.I6)) {
            s(z0Var.g(ri.l.I6));
            if (z0Var.s(ri.l.H6)) {
                r(z0Var.p(ri.l.H6));
            }
            q(z0Var.a(ri.l.G6, true));
        }
        t(z0Var.f(ri.l.J6, getResources().getDimensionPixelSize(ri.d.f173957j0)));
        if (z0Var.s(ri.l.K6)) {
            w(t.b(z0Var.k(ri.l.K6, -1)));
        }
    }

    void A(k6.p pVar) {
        if (this.f35823b.getVisibility() != 0) {
            pVar.Y0(this.f35825d);
        } else {
            pVar.D0(this.f35823b);
            pVar.Y0(this.f35823b);
        }
    }

    void B() {
        EditText editText = this.f35822a.f35660e;
        if (editText == null) {
            return;
        }
        this.f35823b.setPaddingRelative(k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(ri.d.P), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f35824c;
    }

    ColorStateList b() {
        return this.f35823b.getTextColors();
    }

    int c() {
        return getPaddingStart() + this.f35823b.getPaddingStart() + (k() ? this.f35825d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f35825d.getLayoutParams()).getMarginEnd() : 0);
    }

    TextView d() {
        return this.f35823b;
    }

    CharSequence e() {
        return this.f35825d.getContentDescription();
    }

    Drawable f() {
        return this.f35825d.getDrawable();
    }

    int g() {
        return this.f35828g;
    }

    ImageView.ScaleType h() {
        return this.f35829h;
    }

    boolean k() {
        return this.f35825d.getVisibility() == 0;
    }

    void l(boolean z15) {
        this.f35831k = z15;
        C();
    }

    void m() {
        t.d(this.f35822a, this.f35825d, this.f35826e);
    }

    void n(CharSequence charSequence) {
        this.f35824c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f35823b.setText(charSequence);
        C();
    }

    void o(int i15) {
        androidx.core.widget.h.m(this.f35823b, i15);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f35823b.setTextColor(colorStateList);
    }

    void q(boolean z15) {
        this.f35825d.setCheckable(z15);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f35825d.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f35825d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f35822a, this.f35825d, this.f35826e, this.f35827f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i15 != this.f35828g) {
            this.f35828g = i15;
            t.g(this.f35825d, i15);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.f35825d, onClickListener, this.f35830j);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f35830j = onLongClickListener;
        t.i(this.f35825d, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f35829h = scaleType;
        t.j(this.f35825d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f35826e != colorStateList) {
            this.f35826e = colorStateList;
            t.a(this.f35822a, this.f35825d, colorStateList, this.f35827f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f35827f != mode) {
            this.f35827f = mode;
            t.a(this.f35822a, this.f35825d, this.f35826e, mode);
        }
    }

    void z(boolean z15) {
        if (k() != z15) {
            this.f35825d.setVisibility(z15 ? 0 : 8);
            B();
            C();
        }
    }
}
