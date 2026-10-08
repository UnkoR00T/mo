package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class s extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f9023d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f9024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f9025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f9026c;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.f323p);
    }

    void a(m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = mVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f9024a;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f9025b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f9024a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f9024a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9025b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9025b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f9026c.d(o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f9024a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i15) {
        super.setBackgroundResource(i15);
        e eVar = this.f9024a;
        if (eVar != null) {
            eVar.g(i15);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f9025b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f9025b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i15) {
        setDropDownBackgroundDrawable(p082nUL.y.b(getContext(), i15));
    }

    public void setEmojiCompatEnabled(boolean z15) {
        this.f9026c.e(z15);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9026c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f9024a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f9024a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f9025b.w(colorStateList);
        this.f9025b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f9025b.x(mode);
        this.f9025b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i15) {
        super.setTextAppearance(context, i15);
        c0 c0Var = this.f9025b;
        if (c0Var != null) {
            c0Var.q(context, i15);
        }
    }

    public s(Context context, AttributeSet attributeSet, int i15) {
        super(w0.b(context), attributeSet, i15);
        u0.a(this, getContext());
        z0 z0VarV = z0.v(getContext(), attributeSet, f9023d, i15, 0);
        if (z0VarV.s(0)) {
            setDropDownBackgroundDrawable(z0VarV.g(0));
        }
        z0VarV.x();
        e eVar = new e(this);
        this.f9024a = eVar;
        eVar.e(attributeSet, i15);
        c0 c0Var = new c0(this);
        this.f9025b = c0Var;
        c0Var.m(attributeSet, i15);
        c0Var.b();
        m mVar = new m(this);
        this.f9026c = mVar;
        mVar.c(attributeSet, i15);
        a(mVar);
    }
}
