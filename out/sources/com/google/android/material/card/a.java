package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import lj.l;
import lj.o;
import p082nUL.y;
import ri.b;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class a extends CardView implements Checkable, o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f34961n = {R.attr.state_checkable};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f34962p = {R.attr.state_checked};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f34963q = {b.O};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f34964r = k.f174084r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f34966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34967m;

    /* JADX INFO: renamed from: com.google.android.material.card.a$a, reason: collision with other inner class name */
    public interface InterfaceC0743a {
    }

    private void e() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this.f34967m;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public l getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f34966l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i15) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i15 + 3);
        if (f()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f34961n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f34962p);
        }
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f34963q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f34965k) {
            throw null;
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i15) {
        ColorStateList.valueOf(i15);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f15) {
        super.setCardElevation(f15);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z15) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z15) {
        if (this.f34966l != z15) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i15) {
        throw null;
    }

    public void setCheckedIconMargin(int i15) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i15) {
        if (i15 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i15);
        throw null;
    }

    public void setCheckedIconResource(int i15) {
        y.b(getContext(), i15);
        throw null;
    }

    public void setCheckedIconSize(int i15) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i15) {
        if (i15 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i15);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z15) {
        super.setClickable(z15);
    }

    public void setDragged(boolean z15) {
        if (this.f34967m != z15) {
            this.f34967m = z15;
            refreshDrawableState();
            e();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f15) {
        super.setMaxCardElevation(f15);
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC0743a interfaceC0743a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z15) {
        super.setPreventCornerOverlap(z15);
        throw null;
    }

    public void setProgress(float f15) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f15) {
        super.setRadius(f15);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i15) {
        y.a(getContext(), i15);
        throw null;
    }

    @Override // lj.o
    public void setShapeAppearanceModel(l lVar) {
        setClipToOutline(lVar.v(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i15) {
        setStrokeColor(ColorStateList.valueOf(i15));
    }

    public void setStrokeWidth(int i15) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z15) {
        super.setUseCompatPadding(z15);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (f() && isEnabled()) {
            this.f34966l = !this.f34966l;
            refreshDrawableState();
            e();
            throw null;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
