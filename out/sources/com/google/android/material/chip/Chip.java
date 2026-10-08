package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.n;
import ij.d;
import ij.f;
import io.sentry.android.core.c2;
import j6.l0;
import java.util.List;
import k6.p;
import lj.i;
import lj.o;
import ri.j;
import ri.k;
import ri.l;
import si.h;

/* JADX INFO: loaded from: classes4.dex */
public class Chip extends g implements com.google.android.material.chip.a.InterfaceC0745a, o, Checkable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.material.chip.a f35036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InsetDrawable f35037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RippleDrawable f35038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View.OnClickListener f35039h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f35040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f35044n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f35045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f35048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final c f35049t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f35051w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final RectF f35052x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final f f35053y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f35035z = k.f174086t;
    private static final Rect A = new Rect();
    private static final int[] B = {R.attr.state_selected};
    private static final int[] C = {R.attr.state_checkable};

    class a extends f {
        a() {
        }

        @Override // ij.f
        public void a(int i15) {
        }

        @Override // ij.f
        public void b(Typeface typeface, boolean z15) {
            Chip chip = Chip.this;
            chip.setText(chip.f35036e.Z2() ? Chip.this.f35036e.t1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f35036e != null) {
                Chip.this.f35036e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends s6.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // s6.a
        protected int B(float f15, float f16) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f15, f16)) ? 1 : 0;
        }

        @Override // s6.a
        protected void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f35039h != null) {
                list.add(1);
            }
        }

        @Override // s6.a
        protected boolean J(int i15, int i16, Bundle bundle) {
            if (i16 != 16) {
                return false;
            }
            if (i15 == 0) {
                return Chip.this.performClick();
            }
            if (i15 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // s6.a
        protected void M(p pVar) {
            pVar.m0(Chip.this.r());
            pVar.p0(Chip.this.isClickable());
            pVar.o0(Chip.this.getAccessibilityClassName());
            pVar.V0(Chip.this.getText());
        }

        @Override // s6.a
        protected void N(int i15, p pVar) {
            if (i15 != 1) {
                pVar.s0("");
                pVar.k0(Chip.A);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                pVar.s0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                pVar.s0(Chip.this.getContext().getString(j.f174054n, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            pVar.k0(Chip.this.getCloseIconTouchBoundsInt());
            pVar.b(p.a.f108665i);
            pVar.w0(Chip.this.isEnabled());
            pVar.o0(Button.class.getName());
        }

        @Override // s6.a
        protected void O(int i15, boolean z15) {
            if (i15 == 1) {
                Chip.this.f35044n = z15;
            }
            if (Chip.this.f35036e.J1(Chip.this.f35044n)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ri.b.f173908c);
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f35036e) == null) {
            return;
        }
        int iV0 = (int) (aVar.V0() + this.f35036e.v1() + this.f35036e.C0());
        int iA1 = (int) (this.f35036e.a1() + this.f35036e.w1() + this.f35036e.y0());
        if (this.f35037f != null) {
            Rect rect = new Rect();
            this.f35037f.getPadding(rect);
            iA1 += rect.left;
            iV0 += rect.right;
        }
        setPaddingRelative(iA1, getPaddingTop(), iV0, getPaddingBottom());
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.p(getContext(), paint, this.f35053y);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            c2.g("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            c2.g("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z15) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f35040j;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f35052x.setEmpty();
        if (n() && this.f35039h != null) {
            this.f35036e.k1(this.f35052x);
        }
        return this.f35052x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f35051w.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f35051w;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.u1();
        }
        return null;
    }

    private void k(com.google.android.material.chip.a aVar) {
        aVar.C2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] l() {
        ?? IsEnabled = isEnabled();
        int i15 = IsEnabled;
        if (this.f35044n) {
            i15 = IsEnabled + 1;
        }
        int i16 = i15;
        if (this.f35043m) {
            i16 = i15 + 1;
        }
        int i17 = i16;
        if (this.f35042l) {
            i17 = i16 + 1;
        }
        int i18 = i17;
        if (isChecked()) {
            i18 = i17 + 1;
        }
        int[] iArr = new int[i18];
        int i19 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i19 = 1;
        }
        if (this.f35044n) {
            iArr[i19] = 16842908;
            i19++;
        }
        if (this.f35043m) {
            iArr[i19] = 16843623;
            i19++;
        }
        if (this.f35042l) {
            iArr[i19] = 16842919;
            i19++;
        }
        if (isChecked()) {
            iArr[i19] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f35036e;
        return (aVar == null || aVar.d1() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i15) {
        TypedArray typedArrayI = n.i(context, attributeSet, l.f174198n0, i15, f35035z, new int[0]);
        this.f35045p = typedArrayI.getBoolean(l.T0, false);
        this.f35047r = (int) Math.ceil(typedArrayI.getDimension(l.H0, ij.b.e(context)));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i15, int i16, int i17, int i18) {
        this.f35037f = new InsetDrawable((Drawable) this.f35036e, i15, i16, i17, i18);
    }

    private void setCloseIconHovered(boolean z15) {
        if (this.f35043m != z15) {
            this.f35043m = z15;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z15) {
        if (this.f35042l != z15) {
            this.f35042l = z15;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.f35037f != null) {
            this.f35037f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.C2(null);
        }
    }

    private void x() {
        if (n() && s() && this.f35039h != null) {
            l0.h0(this, this.f35049t);
            this.f35050v = true;
        } else {
            l0.h0(this, null);
            this.f35050v = false;
        }
    }

    private void y() {
        z();
    }

    private void z() {
        this.f35038g = new RippleDrawable(jj.a.d(this.f35036e.r1()), getBackgroundDrawable(), null);
        this.f35036e.Y2(false);
        setBackground(this.f35038g);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0745a
    public void a() {
        m(this.f35047r);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f35050v) {
            return this.f35049t.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f35050v) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f35049t.w(keyEvent) || this.f35049t.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f35036e;
        if ((aVar == null || !aVar.B1()) ? false : this.f35036e.y2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f35048s)) {
            return this.f35048s;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof com.google.android.material.chip.b) && ((com.google.android.material.chip.b) parent).f()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f35037f;
        return insetDrawable == null ? this.f35036e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.U0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f35036e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f35050v && (this.f35049t.A() == 1 || this.f35049t.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.o1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.p1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.q1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    public lj.l getShapeAppearanceModel() {
        return this.f35036e.I();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.s1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.v1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            return aVar.w1();
        }
        return 0.0f;
    }

    public boolean m(int i15) {
        this.f35047r = i15;
        if (!v()) {
            if (this.f35037f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i15 - this.f35036e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i15 - this.f35036e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f35037f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i16 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i17 = iMax > 0 ? iMax / 2 : 0;
        if (this.f35037f != null) {
            Rect rect = new Rect();
            this.f35037f.getPadding(rect);
            if (rect.top == i17 && rect.bottom == i17 && rect.left == i16 && rect.right == i16) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i15) {
            setMinHeight(i15);
        }
        if (getMinWidth() != i15) {
            setMinWidth(i15);
        }
        q(i16, i17, i16, i17);
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.f(this, this.f35036e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i15) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i15 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z15, int i15, Rect rect) {
        super.onFocusChanged(z15, i15, rect);
        if (this.f35050v) {
            this.f35049t.I(z15, i15, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof com.google.android.material.chip.b) {
            com.google.android.material.chip.b bVar = (com.google.android.material.chip.b) getParent();
            p.f1(accessibilityNodeInfo).r0(p.g.a(bVar.b(this), 1, bVar.c() ? bVar.d(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i15) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i15);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i15) {
        super.onRtlPropertiesChanged(i15);
        if (this.f35046q != i15) {
            this.f35046q = i15;
            A();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z15;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f35042l) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z15 = true;
                }
                z15 = false;
            } else {
                if (this.f35042l) {
                    t();
                    z15 = true;
                }
                setCloseIconPressed(false);
            }
            z15 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z15 = true;
        } else {
            z15 = false;
        }
        return z15 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f35036e;
        return aVar != null && aVar.A1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f35036e;
        return aVar != null && aVar.C1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f35048s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f35038g) {
            super.setBackground(drawable);
        } else {
            c2.g("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i15) {
        c2.g("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f35038g) {
            super.setBackgroundDrawable(drawable);
        } else {
            c2.g("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(int i15) {
        c2.g("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        c2.g("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        c2.g("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.K1(z15);
        }
    }

    public void setCheckableResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.L1(i15);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar == null) {
            this.f35041k = z15;
        } else if (aVar.A1()) {
            super.setChecked(z15);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.M1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z15) {
        setCheckedIconVisible(z15);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i15) {
        setCheckedIconVisible(i15);
    }

    public void setCheckedIconResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.N1(i15);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.O1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.P1(i15);
        }
    }

    public void setCheckedIconVisible(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.Q1(i15);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.S1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.T1(i15);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.U1(f15);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.V1(i15);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f35036e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f35036e = aVar;
            aVar.N2(false);
            k(this.f35036e);
            m(this.f35047r);
        }
    }

    public void setChipEndPadding(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.W1(f15);
        }
    }

    public void setChipEndPaddingResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.X1(i15);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.Y1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z15) {
        setChipIconVisible(z15);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i15) {
        setChipIconVisible(i15);
    }

    public void setChipIconResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.Z1(i15);
        }
    }

    public void setChipIconSize(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.a2(f15);
        }
    }

    public void setChipIconSizeResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.b2(i15);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.c2(colorStateList);
        }
    }

    public void setChipIconTintResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.d2(i15);
        }
    }

    public void setChipIconVisible(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.e2(i15);
        }
    }

    public void setChipMinHeight(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.g2(f15);
        }
    }

    public void setChipMinHeightResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.h2(i15);
        }
    }

    public void setChipStartPadding(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.i2(f15);
        }
    }

    public void setChipStartPaddingResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.j2(i15);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.k2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.l2(i15);
        }
    }

    public void setChipStrokeWidth(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.m2(f15);
        }
    }

    public void setChipStrokeWidthResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.n2(i15);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i15) {
        setText(getResources().getString(i15));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.p2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.q2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z15) {
        setCloseIconVisible(z15);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i15) {
        setCloseIconVisible(i15);
    }

    public void setCloseIconEndPadding(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.r2(f15);
        }
    }

    public void setCloseIconEndPaddingResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.s2(i15);
        }
    }

    public void setCloseIconResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.t2(i15);
        }
        x();
    }

    public void setCloseIconSize(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.u2(f15);
        }
    }

    public void setCloseIconSizeResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.v2(i15);
        }
    }

    public void setCloseIconStartPadding(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.w2(f15);
        }
    }

    public void setCloseIconStartPaddingResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.x2(i15);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.z2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.A2(i15);
        }
    }

    public void setCloseIconVisible(int i15) {
        setCloseIconVisible(getResources().getBoolean(i15));
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i15, int i16, int i17, int i18) {
        if (i15 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i17 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i15, i16, i17, i18);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i15, int i16, int i17, int i18) {
        if (i15 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i17 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i15, i16, i17, i18);
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.f0(f15);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f35036e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.D2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z15) {
        this.f35045p = z15;
        m(this.f35047r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i15) {
        if (i15 != 8388627) {
            c2.g("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i15);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.E2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.F2(i15);
        }
    }

    public void setIconEndPadding(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.G2(f15);
        }
    }

    public void setIconEndPaddingResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.H2(i15);
        }
    }

    public void setIconStartPadding(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.I2(f15);
        }
    }

    public void setIconStartPaddingResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.J2(i15);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.i<Chip> iVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i15) {
        if (this.f35036e == null) {
            return;
        }
        super.setLayoutDirection(i15);
    }

    @Override // android.widget.TextView
    public void setLines(int i15) {
        if (i15 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i15);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i15) {
        if (i15 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i15);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i15) {
        super.setMaxWidth(i15);
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.K2(i15);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i15) {
        if (i15 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i15);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f35040j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f35039h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.L2(colorStateList);
        }
        if (this.f35036e.y1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.M2(i15);
            if (this.f35036e.y1()) {
                return;
            }
            z();
        }
    }

    @Override // lj.o
    public void setShapeAppearanceModel(lj.l lVar) {
        this.f35036e.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.O2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.P2(i15);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z15) {
        if (!z15) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z15);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.Z2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f35036e;
        if (aVar2 != null) {
            aVar2.Q2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.R2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i15) {
        setTextAppearance(getContext(), i15);
    }

    public void setTextEndPadding(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.T2(f15);
        }
    }

    public void setTextEndPaddingResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.U2(i15);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i15, float f15) {
        super.setTextSize(i15, f15);
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.V2(TypedValue.applyDimension(i15, f15, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.W2(f15);
        }
    }

    public void setTextStartPaddingResource(int i15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.X2(i15);
        }
    }

    public boolean t() {
        boolean z15 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f35039h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z15 = true;
        }
        if (this.f35050v) {
            this.f35049t.U(1, 1);
        }
        return z15;
    }

    public boolean v() {
        return this.f35045p;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i15) {
        int i16 = f35035z;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        this.f35051w = new Rect();
        this.f35052x = new RectF();
        this.f35053y = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarH0 = com.google.android.material.chip.a.H0(context2, attributeSet, i15, i16);
        o(context2, attributeSet, i15);
        setChipDrawable(aVarH0);
        aVarH0.f0(getElevation());
        TypedArray typedArrayI = n.i(context2, attributeSet, l.f174198n0, i15, i16, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(l.Y0);
        typedArrayI.recycle();
        this.f35049t = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f35041k);
        setText(aVarH0.t1());
        setEllipsize(aVarH0.n1());
        B();
        if (!this.f35036e.Z2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f35047r);
        }
        this.f35046q = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yi.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z15) {
                Chip.b(this.f227138a, compoundButton, z15);
            }
        });
    }

    public void setCloseIconVisible(boolean z15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.B2(z15);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.R1(z15);
        }
    }

    public void setChipIconVisible(boolean z15) {
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.f2(z15);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i15) {
        super.setTextAppearance(context, i15);
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.S2(i15);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i15) {
        super.setTextAppearance(i15);
        com.google.android.material.chip.a aVar = this.f35036e;
        if (aVar != null) {
            aVar.S2(i15);
        }
        B();
    }
}
