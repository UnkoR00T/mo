package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class g extends CheckBox implements androidx.core.widget.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f8867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f8868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f8869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f8870d;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.f325r);
    }

    private n getEmojiTextViewHelper() {
        if (this.f8870d == null) {
            this.f8870d = new n(this);
        }
        return this.f8870d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f8868b;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f8869c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f8868b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f8868b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f8867a;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f8867a;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8869c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8869c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z15) {
        super.setAllCaps(z15);
        getEmojiTextViewHelper().c(z15);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f8868b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i15) {
        super.setBackgroundResource(i15);
        e eVar = this.f8868b;
        if (eVar != null) {
            eVar.g(i15);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f8867a;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f8869c;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f8869c;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z15) {
        getEmojiTextViewHelper().d(z15);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f8868b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f8868b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f8867a;
        if (jVar != null) {
            jVar.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f8867a;
        if (jVar != null) {
            jVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8869c.w(colorStateList);
        this.f8869c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8869c.x(mode);
        this.f8869c.b();
    }

    public g(Context context, AttributeSet attributeSet, int i15) {
        super(w0.b(context), attributeSet, i15);
        u0.a(this, getContext());
        j jVar = new j(this);
        this.f8867a = jVar;
        jVar.d(attributeSet, i15);
        e eVar = new e(this);
        this.f8868b = eVar;
        eVar.e(attributeSet, i15);
        c0 c0Var = new c0(this);
        this.f8869c = c0Var;
        c0Var.m(attributeSet, i15);
        getEmojiTextViewHelper().b(attributeSet, i15);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i15) {
        setButtonDrawable(p082nUL.y.b(getContext(), i15));
    }
}
