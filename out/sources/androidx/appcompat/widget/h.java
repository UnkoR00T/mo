package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class h extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f8875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f8876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f8877d;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.f326s);
    }

    private n getEmojiTextViewHelper() {
        if (this.f8877d == null) {
            this.f8877d = new n(this);
        }
        return this.f8877d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c0 c0Var = this.f8876c;
        if (c0Var != null) {
            c0Var.b();
        }
        e eVar = this.f8875b;
        if (eVar != null) {
            eVar.b();
        }
        i iVar = this.f8874a;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f8875b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f8875b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        i iVar = this.f8874a;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i iVar = this.f8874a;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8876c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8876c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z15) {
        super.setAllCaps(z15);
        getEmojiTextViewHelper().c(z15);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f8875b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i15) {
        super.setBackgroundResource(i15);
        e eVar = this.f8875b;
        if (eVar != null) {
            eVar.g(i15);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i iVar = this.f8874a;
        if (iVar != null) {
            iVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f8876c;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f8876c;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z15) {
        getEmojiTextViewHelper().d(z15);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f8875b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f8875b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i iVar = this.f8874a;
        if (iVar != null) {
            iVar.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i iVar = this.f8874a;
        if (iVar != null) {
            iVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8876c.w(colorStateList);
        this.f8876c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8876c.x(mode);
        this.f8876c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i15) {
        super.setTextAppearance(context, i15);
        c0 c0Var = this.f8876c;
        if (c0Var != null) {
            c0Var.q(context, i15);
        }
    }

    public h(Context context, AttributeSet attributeSet, int i15) {
        super(w0.b(context), attributeSet, i15);
        u0.a(this, getContext());
        c0 c0Var = new c0(this);
        this.f8876c = c0Var;
        c0Var.m(attributeSet, i15);
        c0Var.b();
        e eVar = new e(this);
        this.f8875b = eVar;
        eVar.e(attributeSet, i15);
        i iVar = new i(this);
        this.f8874a = iVar;
        iVar.d(attributeSet, i15);
        getEmojiTextViewHelper().b(attributeSet, i15);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i15) {
        setCheckMarkDrawable(p082nUL.y.b(getContext(), i15));
    }
}
