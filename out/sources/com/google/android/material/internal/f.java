package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class f extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35397d;

    private static int a(int i15, int i16, int i17) {
        if (i16 != Integer.MIN_VALUE) {
            return i16 != 1073741824 ? i17 : i15;
        }
        return Math.min(i17, i15);
    }

    public int b(View view) {
        Object tag = view.getTag(ri.f.G);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f35396c;
    }

    protected int getItemSpacing() {
        return this.f35395b;
    }

    protected int getLineSpacing() {
        return this.f35394a;
    }

    protected int getRowCount() {
        return this.f35397d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.f35397d = 0;
            return;
        }
        boolean z16 = true;
        this.f35397d = 1;
        boolean z17 = getLayoutDirection() == 1;
        int paddingRight = z17 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z17 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i19 = 0;
        int measuredWidth = paddingRight;
        int i25 = paddingTop;
        while (i19 < getChildCount()) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(ri.f.G, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                int i26 = i17 - i15;
                int i27 = i26 - paddingLeft;
                if (!this.f35396c && measuredWidth2 > i27) {
                    measuredWidth2 = paddingRight + marginStart + childAt.getMeasuredWidth();
                    i25 = paddingTop + this.f35394a;
                    this.f35397d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(ri.f.G, Integer.valueOf(this.f35397d - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i25;
                if (z17) {
                    childAt.layout(i26 - measuredWidth2, i25, (i26 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i25, measuredWidth2, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.f35395b;
                paddingTop = measuredHeight;
            }
            i19++;
            z16 = z16;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        int i17;
        int i18;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i15);
        int mode = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i16);
        int mode2 = View.MeasureSpec.getMode(i16);
        int i19 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i19 - getPaddingRight();
        int i25 = paddingTop;
        int i26 = 0;
        for (int i27 = 0; i27 < getChildCount(); i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i15, i16);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i17 = marginLayoutParams.leftMargin;
                    i18 = marginLayoutParams.rightMargin;
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                int i28 = paddingLeft2;
                if (paddingLeft2 + i17 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i28;
                } else {
                    paddingLeft = getPaddingLeft();
                    i25 = this.f35394a + paddingTop;
                }
                int measuredWidth = paddingLeft + i17 + childAt.getMeasuredWidth();
                int measuredHeight = i25 + childAt.getMeasuredHeight();
                if (measuredWidth > i26) {
                    i26 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i17 + i18 + childAt.getMeasuredWidth() + this.f35395b;
                if (i27 == getChildCount() - 1) {
                    i26 += i18;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i26 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i15) {
        this.f35395b = i15;
    }

    protected void setLineSpacing(int i15) {
        this.f35394a = i15;
    }

    public void setSingleLine(boolean z15) {
        this.f35396c = z15;
    }
}
