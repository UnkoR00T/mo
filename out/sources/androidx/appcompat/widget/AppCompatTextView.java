package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f8629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f8630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f8631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f8632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f8634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Future<h6.f> f8635g;

    private interface a {
        void a(int[] iArr, int i15);

        void b(int i15);

        int c();

        int d();

        void e(int i15, float f15);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i15, int i16, int i17, int i18);

        void k(int i15);

        int l();

        void m(int i15);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int[] iArr, int i15) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i15);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i15) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i15, float f15) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] f() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier g() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int h() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void i(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void j(int i15, int i16, int i17, int i18) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i15, i16, i17, i18);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void k(int i15) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int l() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void m(int i15) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i15);
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i15) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i15);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void k(int i15) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i15);
        }
    }

    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i15, float f15) {
            AppCompatTextView.super.setLineHeight(i15, f15);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private n getEmojiTextViewHelper() {
        if (this.f8632d == null) {
            this.f8632d = new n(this);
        }
        return this.f8632d;
    }

    private void r() {
        Future<h6.f> future = this.f8635g;
        if (future != null) {
            try {
                this.f8635g = null;
                androidx.core.widget.h.l(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f8629a;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f8873c) {
            return getSuperCaller().h();
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            return c0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f8873c) {
            return getSuperCaller().d();
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            return c0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f8873c) {
            return getSuperCaller().l();
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            return c0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f8873c) {
            return getSuperCaller().f();
        }
        c0 c0Var = this.f8630b;
        return c0Var != null ? c0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f8873c) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            return c0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.h.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.h.b(this);
    }

    a getSuperCaller() {
        if (this.f8634f == null) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 34) {
                this.f8634f = new d();
            } else if (i15 >= 28) {
                this.f8634f = new c();
            } else {
                this.f8634f = new b();
            }
        }
        return this.f8634f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f8629a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f8629a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8630b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8630b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        return (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f8631c) == null) ? getSuperCaller().g() : b0Var.a();
    }

    public h6.f.a getTextMetricsParamsCompat() {
        return androidx.core.widget.h.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8630b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 30 || i15 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.o(z15, i15, i16, i17, i18);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i15, int i16) {
        r();
        super.onMeasure(i15, i16);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
        super.onTextChanged(charSequence, i15, i16, i17);
        c0 c0Var = this.f8630b;
        if (c0Var == null || g1.f8873c || !c0Var.l()) {
            return;
        }
        this.f8630b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z15) {
        super.setAllCaps(z15);
        getEmojiTextViewHelper().c(z15);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i15, int i16, int i17, int i18) {
        if (g1.f8873c) {
            getSuperCaller().j(i15, i16, i17, i18);
            return;
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.t(i15, i16, i17, i18);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i15) {
        if (g1.f8873c) {
            getSuperCaller().a(iArr, i15);
            return;
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.u(iArr, i15);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i15) {
        if (g1.f8873c) {
            getSuperCaller().m(i15);
            return;
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.v(i15);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f8629a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i15) {
        super.setBackgroundResource(i15);
        e eVar = this.f8629a;
        if (eVar != null) {
            eVar.g(i15);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f8630b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i15) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i15);
        } else {
            androidx.core.widget.h.h(this, i15);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i15) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i15);
        } else {
            androidx.core.widget.h.i(this, i15);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i15) {
        androidx.core.widget.h.j(this, i15);
    }

    public void setPrecomputedText(h6.f fVar) {
        androidx.core.widget.h.l(this, fVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f8629a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f8629a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8630b.w(colorStateList);
        this.f8630b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8630b.x(mode);
        this.f8630b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i15) {
        super.setTextAppearance(context, i15);
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.q(context, i15);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f8631c) == null) {
            getSuperCaller().i(textClassifier);
        } else {
            b0Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<h6.f> future) {
        this.f8635g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(h6.f.a aVar) {
        androidx.core.widget.h.n(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i15, float f15) {
        if (g1.f8873c) {
            super.setTextSize(i15, f15);
            return;
        }
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.A(i15, f15);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i15) {
        if (this.f8633e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i15 <= 0) ? null : x5.p.a(getContext(), typeface, i15);
        this.f8633e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i15);
        } finally {
            this.f8633e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i15, float f15) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i15, f15);
        } else {
            androidx.core.widget.h.k(this, i15, f15);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i15) {
        super(w0.b(context), attributeSet, i15);
        this.f8633e = false;
        this.f8634f = null;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f8629a = eVar;
        eVar.e(attributeSet, i15);
        c0 c0Var = new c0(this);
        this.f8630b = c0Var;
        c0Var.m(attributeSet, i15);
        c0Var.b();
        this.f8631c = new b0(this);
        getEmojiTextViewHelper().b(attributeSet, i15);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i15, int i16, int i17, int i18) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i15 != 0 ? p082nUL.y.b(context, i15) : null, i16 != 0 ? p082nUL.y.b(context, i16) : null, i17 != 0 ? p082nUL.y.b(context, i17) : null, i18 != 0 ? p082nUL.y.b(context, i18) : null);
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i15, int i16, int i17, int i18) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i15 != 0 ? p082nUL.y.b(context, i15) : null, i16 != 0 ? p082nUL.y.b(context, i16) : null, i17 != 0 ? p082nUL.y.b(context, i17) : null, i18 != 0 ? p082nUL.y.b(context, i18) : null);
        c0 c0Var = this.f8630b;
        if (c0Var != null) {
            c0Var.p();
        }
    }
}
