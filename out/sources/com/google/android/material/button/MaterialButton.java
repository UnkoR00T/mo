package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.f;
import com.google.android.material.internal.n;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lj.h;
import lj.l;
import lj.o;
import lj.q;
import lj.r;
import p082nUL.y;
import ri.k;
import z6.i;
import z6.j;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialButton extends f implements Checkable, o {
    private static final int[] I = {R.attr.state_checkable};
    private static final int[] K = {R.attr.state_checked};
    private static final int L = k.f174083q;
    private static final int O = ri.b.f173925t;
    private static final z6.f<MaterialButton> P = new a("widthIncrease");
    private int A;
    private boolean B;
    int C;
    r D;
    int E;
    private float F;
    private float G;
    private i H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f34894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet<b> f34895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f34896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f34897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f34898h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f34899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f34900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34903n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f34906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f34907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f34908t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f34909v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f34910w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f34911x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private LinearLayout.LayoutParams f34912y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f34913z;

    class a extends z6.f<MaterialButton> {
        a(String str) {
            super(str);
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialButton materialButton, float f15) {
            materialButton.setDisplayedWidthIncrease(f15);
        }
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z15);
    }

    interface c {
        void a(MaterialButton materialButton, boolean z15);
    }

    static class d extends r6.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f34914c;

        class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i15) {
                return new d[i15];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f34914c = parcel.readInt() == 1;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f34914c ? 1 : 0);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ri.b.f173920o);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.A = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f15) {
        int i15 = (int) (f15 * 0.11f);
        if (materialButton.A != i15) {
            materialButton.A = i15;
            materialButton.s();
            materialButton.invalidate();
        }
    }

    private j e() {
        return gj.e.h(getContext(), ri.b.H, k.f174067a);
    }

    private void f() {
        i iVar = new i(this, P);
        this.H = iVar;
        iVar.x(e());
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.F;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        h hVarG;
        if (this.f34913z && this.B && (hVarG = this.f34894d.g()) != null) {
            return (int) (hVarG.z() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i15 = 0; i15 < lineCount; i15++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i15));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean h() {
        int i15 = this.f34907s;
        return i15 == 3 || i15 == 4;
    }

    private boolean i() {
        int i15 = this.f34907s;
        return i15 == 1 || i15 == 2;
    }

    private boolean j() {
        int i15 = this.f34907s;
        return i15 == 16 || i15 == 32;
    }

    private boolean k() {
        return (getParent() instanceof com.google.android.material.button.d) && ((com.google.android.material.button.d) getParent()).getOrientation() == 0;
    }

    private boolean l() {
        return getLayoutDirection() == 1;
    }

    private boolean m() {
        e eVar = this.f34894d;
        return (eVar == null || eVar.q()) ? false : true;
    }

    private void n(boolean z15) {
        if (this.D == null) {
            return;
        }
        if (this.H == null) {
            f();
        }
        if (this.B) {
            this.H.t(Math.min(this.E, this.D.e(getDrawableState()).f118622a.a(getWidth())));
            if (z15) {
                this.H.y();
            }
        }
    }

    private void p() {
        if (i()) {
            setCompoundDrawablesRelative(this.f34899j, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.f34899j, null);
        } else if (j()) {
            setCompoundDrawablesRelative(null, this.f34899j, null, null);
        }
    }

    private void q(boolean z15) {
        Drawable drawable = this.f34899j;
        if (drawable != null) {
            Drawable drawableMutate = y5.a.r(drawable).mutate();
            this.f34899j = drawableMutate;
            drawableMutate.setTintList(this.f34898h);
            PorterDuff.Mode mode = this.f34897g;
            if (mode != null) {
                this.f34899j.setTintMode(mode);
            }
            int intrinsicWidth = this.f34901l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f34899j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f34901l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f34899j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f34899j;
            int i15 = this.f34902m;
            int i16 = this.f34903n;
            drawable2.setBounds(i15, i16, intrinsicWidth + i15, intrinsicHeight + i16);
            this.f34899j.setVisible(true, z15);
        }
        if (z15) {
            p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!i() || drawable3 == this.f34899j) && ((!h() || drawable5 == this.f34899j) && (!j() || drawable4 == this.f34899j))) {
            return;
        }
        p();
    }

    private void r(int i15, int i16) {
        if (this.f34899j == null || getLayout() == null) {
            return;
        }
        if (!i() && !h()) {
            if (j()) {
                this.f34902m = 0;
                if (this.f34907s == 16) {
                    this.f34903n = 0;
                    q(false);
                    return;
                }
                int intrinsicHeight = this.f34901l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f34899j.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i16 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f34904p) - getPaddingBottom()) / 2);
                if (this.f34903n != iMax) {
                    this.f34903n = iMax;
                    q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f34903n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i17 = this.f34907s;
        if (i17 == 1 || i17 == 3 || ((i17 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i17 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f34902m = 0;
            q(false);
            return;
        }
        int intrinsicWidth = this.f34901l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f34899j.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i15 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f34904p) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (l() != (this.f34907s == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f34902m != textLayoutWidth) {
            this.f34902m = textLayoutWidth;
            q(false);
        }
    }

    private void s() {
        int i15 = (int) (this.F - this.G);
        int i16 = (i15 / 2) + this.A;
        getLayoutParams().width = (int) (this.f34909v + i15);
        setPaddingRelative(this.f34910w + i16, getPaddingTop(), (this.f34911x + i15) - i16, getPaddingBottom());
    }

    private void setCheckedInternal(boolean z15) {
        if (!g() || this.f34905q == z15) {
            return;
        }
        this.f34905q = z15;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).w(this, this.f34905q);
        }
        if (this.f34906r) {
            return;
        }
        this.f34906r = true;
        Iterator<b> it = this.f34895e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f34905q);
        }
        this.f34906r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f15) {
        if (this.F != f15) {
            this.F = f15;
            s();
            invalidate();
            if (getParent() instanceof com.google.android.material.button.d) {
                ((com.google.android.material.button.d) getParent()).k(this, (int) this.F);
            }
        }
    }

    public boolean g() {
        e eVar = this.f34894d;
        return eVar != null && eVar.r();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f34900k)) {
            return (g() ? CompoundButton.class : Button.class).getName();
        }
        return this.f34900k;
    }

    int getAllowedWidthDecrease() {
        return this.C;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m()) {
            return this.f34894d.b();
        }
        return 0;
    }

    public j getCornerSpringForce() {
        return this.f34894d.c();
    }

    public Drawable getIcon() {
        return this.f34899j;
    }

    public int getIconGravity() {
        return this.f34907s;
    }

    public int getIconPadding() {
        return this.f34904p;
    }

    public int getIconSize() {
        return this.f34901l;
    }

    public ColorStateList getIconTint() {
        return this.f34898h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f34897g;
    }

    public int getInsetBottom() {
        return this.f34894d.d();
    }

    public int getInsetTop() {
        return this.f34894d.e();
    }

    public ColorStateList getRippleColor() {
        if (m()) {
            return this.f34894d.i();
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        if (m()) {
            return this.f34894d.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public q getStateListShapeAppearanceModel() {
        if (m()) {
            return this.f34894d.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m()) {
            return this.f34894d.l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m()) {
            return this.f34894d.m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        return m() ? this.f34894d.n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m() ? this.f34894d.o() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f34905q;
    }

    void o() {
        LinearLayout.LayoutParams layoutParams = this.f34912y;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.f34912y = null;
            this.f34909v = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            lj.i.f(this, this.f34894d.g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i15) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i15 + 2);
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        int i19;
        super.onLayout(z15, i15, i16, i17, i18);
        r(getMeasuredWidth(), getMeasuredHeight());
        int i25 = getResources().getConfiguration().orientation;
        if (this.f34908t != i25) {
            this.f34908t = i25;
            this.f34909v = -1.0f;
        }
        if (this.f34909v == -1.0f) {
            this.f34909v = getMeasuredWidth();
            if (this.f34912y == null && (getParent() instanceof com.google.android.material.button.d) && ((com.google.android.material.button.d) getParent()).getButtonSizeChange() != null) {
                this.f34912y = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f34912y);
                layoutParams.width = (int) this.f34909v;
                setLayoutParams(layoutParams);
            }
        }
        if (this.C == -1) {
            if (this.f34899j == null) {
                i19 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f34901l;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f34899j.getIntrinsicWidth();
                }
                i19 = iconPadding + intrinsicWidth;
            }
            this.C = (getMeasuredWidth() - getTextLayoutWidth()) - i19;
        }
        if (this.f34910w == -1) {
            this.f34910w = getPaddingStart();
        }
        if (this.f34911x == -1) {
            this.f34911x = getPaddingEnd();
        }
        this.B = k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        setChecked(dVar.f34914c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f34914c = this.f34905q;
        return dVar;
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
        super.onTextChanged(charSequence, i15, i16, i17);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f34894d.s()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f34899j != null) {
            if (this.f34899j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f34900k = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i15) {
        if (m()) {
            this.f34894d.u(i15);
        } else {
            super.setBackgroundColor(i15);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            c2.g("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f34894d.v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i15) {
        setBackgroundDrawable(i15 != 0 ? y.b(getContext(), i15) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z15) {
        if (m()) {
            this.f34894d.w(z15);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z15) {
        setCheckedInternal(z15);
    }

    public void setCornerRadius(int i15) {
        if (m()) {
            this.f34894d.x(i15);
        }
    }

    public void setCornerRadiusResource(int i15) {
        if (m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i15));
        }
    }

    public void setCornerSpringForce(j jVar) {
        this.f34894d.z(jVar);
    }

    void setDisplayedWidthDecrease(int i15) {
        this.G = Math.min(i15, this.C);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        if (m()) {
            this.f34894d.g().f0(f15);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f34899j != drawable) {
            this.f34899j = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i15) {
        if (this.f34907s != i15) {
            this.f34907s = i15;
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i15) {
        if (this.f34904p != i15) {
            this.f34904p = i15;
            setCompoundDrawablePadding(i15);
        }
    }

    public void setIconResource(int i15) {
        setIcon(i15 != 0 ? y.b(getContext(), i15) : null);
    }

    public void setIconSize(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f34901l != i15) {
            this.f34901l = i15;
            q(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f34898h != colorStateList) {
            this.f34898h = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f34897g != mode) {
            this.f34897g = mode;
            q(false);
        }
    }

    public void setIconTintResource(int i15) {
        setIconTint(y.a(getContext(), i15));
    }

    public void setInsetBottom(int i15) {
        this.f34894d.A(i15);
    }

    public void setInsetTop(int i15) {
        this.f34894d.B(i15);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(c cVar) {
        this.f34896f = cVar;
    }

    public void setOpticalCenterEnabled(boolean z15) {
        if (this.f34913z != z15) {
            this.f34913z = z15;
            if (z15) {
                this.f34894d.y(new h.d() { // from class: com.google.android.material.button.a
                    @Override // lj.h.d
                    public final void a(float f15) {
                        MaterialButton.b(this.f34923a, f15);
                    }
                });
            } else {
                this.f34894d.y(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(this.f34924a);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z15) {
        c cVar = this.f34896f;
        if (cVar != null) {
            cVar.a(this, z15);
        }
        super.setPressed(z15);
        n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m()) {
            this.f34894d.C(colorStateList);
        }
    }

    public void setRippleColorResource(int i15) {
        if (m()) {
            setRippleColor(y.a(getContext(), i15));
        }
    }

    @Override // lj.o
    public void setShapeAppearanceModel(l lVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f34894d.D(lVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z15) {
        if (m()) {
            this.f34894d.E(z15);
        }
    }

    void setSizeChange(r rVar) {
        if (this.D != rVar) {
            this.D = rVar;
            n(true);
        }
    }

    public void setStateListShapeAppearanceModel(q qVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f34894d.c() == null && qVar.f()) {
            this.f34894d.z(e());
        }
        this.f34894d.F(qVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m()) {
            this.f34894d.G(colorStateList);
        }
    }

    public void setStrokeColorResource(int i15) {
        if (m()) {
            setStrokeColor(y.a(getContext(), i15));
        }
    }

    public void setStrokeWidth(int i15) {
        if (m()) {
            this.f34894d.H(i15);
        }
    }

    public void setStrokeWidthResource(int i15) {
        if (m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i15));
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m()) {
            this.f34894d.I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m()) {
            this.f34894d.J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i15) {
        super.setTextAlignment(i15);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z15) {
        this.f34894d.K(z15);
    }

    @Override // android.widget.TextView
    public void setWidth(int i15) {
        this.f34909v = -1.0f;
        super.setWidth(i15);
    }

    void setWidthChangeMax(int i15) {
        if (this.E != i15) {
            this.E = i15;
            n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f34905q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i15) {
        int i16 = L;
        super(pj.a.e(context, attributeSet, i15, i16, new int[]{O}), attributeSet, i15);
        this.f34895e = new LinkedHashSet<>();
        this.f34905q = false;
        this.f34906r = false;
        this.f34908t = -1;
        this.f34909v = -1.0f;
        this.f34910w = -1;
        this.f34911x = -1;
        this.C = -1;
        Context context2 = getContext();
        TypedArray typedArrayI = n.i(context2, attributeSet, ri.l.O1, i15, i16, new int[0]);
        this.f34904p = typedArrayI.getDimensionPixelSize(ri.l.f174112c2, 0);
        this.f34897g = com.google.android.material.internal.q.h(typedArrayI.getInt(ri.l.f174136f2, -1), PorterDuff.Mode.SRC_IN);
        this.f34898h = ij.c.a(getContext(), typedArrayI, ri.l.f174128e2);
        this.f34899j = ij.c.d(getContext(), typedArrayI, ri.l.f174096a2);
        this.f34907s = typedArrayI.getInteger(ri.l.f174104b2, 1);
        this.f34901l = typedArrayI.getDimensionPixelSize(ri.l.f174120d2, 0);
        q qVarB = q.b(context2, typedArrayI, ri.l.f174160i2);
        l lVarC = qVarB != null ? qVarB.c(true) : l.e(context2, attributeSet, i15, i16).m();
        boolean z15 = typedArrayI.getBoolean(ri.l.f174144g2, false);
        e eVar = new e(this, lVarC);
        this.f34894d = eVar;
        eVar.t(typedArrayI);
        setCheckedInternal(typedArrayI.getBoolean(ri.l.Q1, false));
        if (qVarB != null) {
            eVar.z(e());
            eVar.F(qVarB);
        }
        setOpticalCenterEnabled(z15);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f34904p);
        q(this.f34899j != null);
    }
}
