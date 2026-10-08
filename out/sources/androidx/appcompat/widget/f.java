package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class f extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f8862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f8863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f8864c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.f324q);
    }

    private n getEmojiTextViewHelper() {
        if (this.f8864c == null) {
            this.f8864c = new n(this);
        }
        return this.f8864c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f8862a;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f8873c) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            return c0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f8873c) {
            return super.getAutoSizeMinTextSize();
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            return c0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f8873c) {
            return super.getAutoSizeStepGranularity();
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            return c0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f8873c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c0 c0Var = this.f8863b;
        return c0Var != null ? c0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f8873c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            return c0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f8862a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f8862a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8863b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8863b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            c0Var.o(z15, i15, i16, i17, i18);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
        super.onTextChanged(charSequence, i15, i16, i17);
        c0 c0Var = this.f8863b;
        if (c0Var == null || g1.f8873c || !c0Var.l()) {
            return;
        }
        this.f8863b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z15) {
        super.setAllCaps(z15);
        getEmojiTextViewHelper().c(z15);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i15, int i16, int i17, int i18) {
        if (g1.f8873c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i15, i16, i17, i18);
            return;
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            c0Var.t(i15, i16, i17, i18);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i15) {
        if (g1.f8873c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i15);
            return;
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            c0Var.u(iArr, i15);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i15) {
        if (g1.f8873c) {
            super.setAutoSizeTextTypeWithDefaults(i15);
            return;
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            c0Var.v(i15);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f8862a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i15) {
        super.setBackgroundResource(i15);
        e eVar = this.f8862a;
        if (eVar != null) {
            eVar.g(i15);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z15) {
        getEmojiTextViewHelper().d(z15);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z15) {
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            c0Var.s(z15);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f8862a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f8862a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8863b.w(colorStateList);
        this.f8863b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8863b.x(mode);
        this.f8863b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i15) {
        super.setTextAppearance(context, i15);
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            c0Var.q(context, i15);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i15, float f15) {
        if (g1.f8873c) {
            super.setTextSize(i15, f15);
            return;
        }
        c0 c0Var = this.f8863b;
        if (c0Var != null) {
            c0Var.A(i15, f15);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i15) {
        super(w0.b(context), attributeSet, i15);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f8862a = eVar;
        eVar.e(attributeSet, i15);
        c0 c0Var = new c0(this);
        this.f8863b = c0Var;
        c0Var.m(attributeSet, i15);
        c0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i15);
    }
}
