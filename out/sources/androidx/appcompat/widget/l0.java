package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f8946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8947h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f8948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f8949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f8950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8952n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8954q;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i15, int i16) {
            super(i15, i16);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public l0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void i(int i15, int i16) {
        int i17;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i18 = 0;
        while (i18 < i15) {
            View viewQ = q(i18);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i19 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewQ.getMeasuredWidth();
                    i17 = i16;
                    measureChildWithMargins(viewQ, i17, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i19;
                } else {
                    i17 = i16;
                }
            } else {
                i17 = i16;
            }
            i18++;
            i16 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void j(int i15, int i16) {
        int i17;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i18 = 0;
        while (i18 < i15) {
            View viewQ = q(i18);
            if (viewQ.getVisibility() != 8) {
                a aVar = (a) viewQ.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i19 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewQ.getMeasuredHeight();
                    i17 = i16;
                    measureChildWithMargins(viewQ, iMakeMeasureSpec, 0, i17, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i19;
                } else {
                    i17 = i16;
                }
            } else {
                i17 = i16;
            }
            i18++;
            i16 = i17;
        }
    }

    private void y(View view, int i15, int i16, int i17, int i18) {
        view.layout(i15, i16, i17 + i15, i18 + i16);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int right;
        int left;
        int i15;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = g1.b(this);
        for (int i16 = 0; i16 < virtualChildCount; i16++) {
            View viewQ = q(i16);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i16)) {
                a aVar = (a) viewQ.getLayoutParams();
                h(canvas, zB ? viewQ.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewQ.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f8951m);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            if (viewQ2 != null) {
                a aVar2 = (a) viewQ2.getLayoutParams();
                if (zB) {
                    left = viewQ2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i15 = this.f8951m;
                    right = left - i15;
                } else {
                    right = viewQ2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i15 = this.f8951m;
                right = left - i15;
            }
            h(canvas, right);
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i15 = 0; i15 < virtualChildCount; i15++) {
            View viewQ = q(i15);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i15)) {
                g(canvas, (viewQ.getTop() - ((LinearLayout.LayoutParams) ((a) viewQ.getLayoutParams())).topMargin) - this.f8952n);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            g(canvas, viewQ2 == null ? (getHeight() - getPaddingBottom()) - this.f8952n : viewQ2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewQ2.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i15) {
        this.f8950l.setBounds(getPaddingLeft() + this.f8954q, i15, (getWidth() - getPaddingRight()) - this.f8954q, this.f8952n + i15);
        this.f8950l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i15;
        if (this.f8941b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i16 = this.f8941b;
        if (childCount <= i16) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i16);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8941b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f8942c;
        if (this.f8943d == 1 && (i15 = this.f8944e & 112) != 48) {
            if (i15 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8945f) / 2;
            } else if (i15 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8945f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8941b;
    }

    public Drawable getDividerDrawable() {
        return this.f8950l;
    }

    public int getDividerPadding() {
        return this.f8954q;
    }

    public int getDividerWidth() {
        return this.f8951m;
    }

    public int getGravity() {
        return this.f8944e;
    }

    public int getOrientation() {
        return this.f8943d;
    }

    public int getShowDividers() {
        return this.f8953p;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8946g;
    }

    void h(Canvas canvas, int i15) {
        this.f8950l.setBounds(i15, getPaddingTop() + this.f8954q, this.f8951m + i15, (getHeight() - getPaddingBottom()) - this.f8954q);
        this.f8950l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i15 = this.f8943d;
        if (i15 == 0) {
            return new a(-2, -2);
        }
        if (i15 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    int n(View view, int i15) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f8950l == null) {
            return;
        }
        if (this.f8943d == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        if (this.f8943d == 1) {
            t(i15, i16, i17, i18);
        } else {
            s(i15, i16, i17, i18);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        if (this.f8943d == 1) {
            x(i15, i16);
        } else {
            v(i15, i16);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i15) {
        return getChildAt(i15);
    }

    protected boolean r(int i15) {
        if (i15 == 0) {
            return (this.f8953p & 1) != 0;
        }
        if (i15 == getChildCount()) {
            return (this.f8953p & 4) != 0;
        }
        if ((this.f8953p & 2) != 0) {
            for (int i16 = i15 - 1; i16 >= 0; i16--) {
                if (getChildAt(i16).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    void s(int i15, int i16, int i17, int i18) {
        int paddingLeft;
        int i19;
        int i25;
        char c15;
        char c16;
        int i26;
        int iN;
        int i27;
        int baseline;
        int i28;
        int i29;
        int i35;
        int measuredHeight;
        int i36;
        boolean zB = g1.b(this);
        int paddingTop = getPaddingTop();
        int i37 = i18 - i16;
        int paddingBottom = i37 - getPaddingBottom();
        int paddingBottom2 = (i37 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i38 = this.f8944e;
        int i39 = i38 & 112;
        boolean z15 = this.f8940a;
        int[] iArr = this.f8948j;
        int[] iArr2 = this.f8949k;
        int iB = j6.k.b(8388615 & i38, getLayoutDirection());
        char c17 = 2;
        char c18 = 1;
        if (iB != 1) {
            paddingLeft = iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i17) - i15) - this.f8945f;
        } else {
            paddingLeft = getPaddingLeft() + (((i17 - i15) - this.f8945f) / 2);
        }
        if (zB) {
            i19 = virtualChildCount - 1;
            i25 = -1;
        } else {
            i19 = 0;
            i25 = 1;
        }
        int i45 = 0;
        while (i45 < virtualChildCount) {
            int i46 = i19 + (i25 * i45);
            int i47 = i45;
            View viewQ = q(i46);
            if (viewQ == null) {
                paddingLeft += w(i46);
                iN = i47;
                i26 = paddingTop;
                c15 = c17;
                c16 = c18;
            } else {
                c15 = c17;
                c16 = c18;
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight2 = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i48 = paddingLeft;
                    if (z15) {
                        i27 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewQ.getBaseline() : -1;
                        i28 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i28 < 0) {
                            i28 = i39;
                        }
                        i29 = i28 & 112;
                        i26 = paddingTop;
                        if (i29 != 16) {
                            if (i29 != 48) {
                                i35 = i26 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                if (baseline != -1) {
                                    i35 += iArr[c16] - baseline;
                                }
                            } else if (i29 != 80) {
                                i35 = i26;
                            } else {
                                i35 = (paddingBottom - i27) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c15] - (viewQ.getMeasuredHeight() - baseline);
                                }
                            }
                            if (r(i46)) {
                                i36 = i48 + this.f8951m;
                            } else {
                                i36 = i48;
                            }
                            int i49 = ((LinearLayout.LayoutParams) aVar).leftMargin + i36;
                            y(viewQ, o(viewQ) + i49, i35, measuredWidth, i27);
                            int iP = i49 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                            iN = n(viewQ, i46) + i47;
                            paddingLeft = iP;
                        } else {
                            i35 = i26 + ((paddingBottom2 - i27) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i35 -= measuredHeight;
                        if (r(i46)) {
                            i36 = i48 + this.f8951m;
                        } else {
                            i36 = i48;
                        }
                        int i410 = ((LinearLayout.LayoutParams) aVar).leftMargin + i36;
                        y(viewQ, o(viewQ) + i410, i35, measuredWidth, i27);
                        int iP2 = i410 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                        iN = n(viewQ, i46) + i47;
                        paddingLeft = iP2;
                    } else {
                        i27 = measuredHeight2;
                    }
                    i28 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i28 < 0) {
                        i28 = i39;
                    }
                    i29 = i28 & 112;
                    i26 = paddingTop;
                    if (i29 != 16) {
                        if (i29 != 48) {
                            i35 = i26 + ((LinearLayout.LayoutParams) aVar).topMargin;
                            if (baseline != -1) {
                                i35 += iArr[c16] - baseline;
                            }
                        } else if (i29 != 80) {
                            i35 = i26;
                        } else {
                            i35 = (paddingBottom - i27) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c15] - (viewQ.getMeasuredHeight() - baseline);
                            }
                        }
                        if (r(i46)) {
                            i36 = i48 + this.f8951m;
                        } else {
                            i36 = i48;
                        }
                        int i411 = ((LinearLayout.LayoutParams) aVar).leftMargin + i36;
                        y(viewQ, o(viewQ) + i411, i35, measuredWidth, i27);
                        int iP3 = i411 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                        iN = n(viewQ, i46) + i47;
                        paddingLeft = iP3;
                    } else {
                        i35 = i26 + ((paddingBottom2 - i27) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    i35 -= measuredHeight;
                    if (r(i46)) {
                        i36 = i48 + this.f8951m;
                    } else {
                        i36 = i48;
                    }
                    int i412 = ((LinearLayout.LayoutParams) aVar).leftMargin + i36;
                    y(viewQ, o(viewQ) + i412, i35, measuredWidth, i27);
                    int iP4 = i412 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + p(viewQ);
                    iN = n(viewQ, i46) + i47;
                    paddingLeft = iP4;
                } else {
                    i26 = paddingTop;
                    iN = i47;
                }
            }
            i45 = iN + 1;
            c17 = c15;
            c18 = c16;
            paddingTop = i26;
        }
    }

    public void setBaselineAligned(boolean z15) {
        this.f8940a = z15;
    }

    public void setBaselineAlignedChildIndex(int i15) {
        if (i15 >= 0 && i15 < getChildCount()) {
            this.f8941b = i15;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8950l) {
            return;
        }
        this.f8950l = drawable;
        if (drawable != null) {
            this.f8951m = drawable.getIntrinsicWidth();
            this.f8952n = drawable.getIntrinsicHeight();
        } else {
            this.f8951m = 0;
            this.f8952n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i15) {
        this.f8954q = i15;
    }

    public void setGravity(int i15) {
        if (this.f8944e != i15) {
            if ((8388615 & i15) == 0) {
                i15 |= 8388611;
            }
            if ((i15 & 112) == 0) {
                i15 |= 48;
            }
            this.f8944e = i15;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i15) {
        int i16 = i15 & 8388615;
        int i17 = this.f8944e;
        if ((8388615 & i17) != i16) {
            this.f8944e = i16 | ((-8388616) & i17);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z15) {
        this.f8947h = z15;
    }

    public void setOrientation(int i15) {
        if (this.f8943d != i15) {
            this.f8943d = i15;
            requestLayout();
        }
    }

    public void setShowDividers(int i15) {
        if (i15 != this.f8953p) {
            requestLayout();
        }
        this.f8953p = i15;
    }

    public void setVerticalGravity(int i15) {
        int i16 = i15 & 112;
        int i17 = this.f8944e;
        if ((i17 & 112) != i16) {
            this.f8944e = i16 | (i17 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f15) {
        this.f8946g = Math.max(0.0f, f15);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    void t(int i15, int i16, int i17, int i18) {
        int paddingTop;
        int i19;
        int i25;
        int i26;
        int paddingLeft = getPaddingLeft();
        int i27 = i17 - i15;
        int paddingRight = i27 - getPaddingRight();
        int paddingRight2 = (i27 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i28 = this.f8944e;
        int i29 = i28 & 112;
        int i35 = i28 & 8388615;
        if (i29 != 16) {
            paddingTop = i29 != 80 ? getPaddingTop() : ((getPaddingTop() + i18) - i16) - this.f8945f;
        } else {
            paddingTop = getPaddingTop() + (((i18 - i16) - this.f8945f) / 2);
        }
        int iN = 0;
        while (iN < virtualChildCount) {
            View viewQ = q(iN);
            if (viewQ == null) {
                paddingTop += w(iN);
            } else {
                if (viewQ.getVisibility() != 8) {
                    int measuredWidth = viewQ.getMeasuredWidth();
                    int measuredHeight = viewQ.getMeasuredHeight();
                    a aVar = (a) viewQ.getLayoutParams();
                    int i36 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i36 < 0) {
                        i36 = i35;
                    }
                    int iB = j6.k.b(i36, getLayoutDirection()) & 7;
                    if (iB != 1) {
                        if (iB != 5) {
                            i26 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i19 = paddingRight - measuredWidth;
                            i25 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        int i37 = i26;
                        if (r(iN)) {
                            paddingTop += this.f8952n;
                        }
                        int i38 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        y(viewQ, i37, i38 + o(viewQ), measuredWidth, measuredHeight);
                        paddingTop = i38 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                        iN += n(viewQ, iN);
                    } else {
                        i19 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i25 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i26 = i19 - i25;
                    int i39 = i26;
                    if (r(iN)) {
                        paddingTop += this.f8952n;
                    }
                    int i310 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(viewQ, i39, i310 + o(viewQ), measuredWidth, measuredHeight);
                    paddingTop = i310 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ);
                    iN += n(viewQ, iN);
                }
                iN++;
            }
            iN++;
        }
    }

    void u(View view, int i15, int i16, int i17, int i18, int i19) {
        measureChildWithMargins(view, i16, i17, i18, i19);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0461  */
    void v(int i15, int i16) {
        int i17;
        int i18;
        float f15;
        int i19;
        int i25;
        int i26;
        int i27;
        int iMax;
        int i28;
        int baseline;
        int i29;
        int i35;
        byte b15;
        int i36;
        int i37;
        int i38;
        boolean z15;
        View view;
        boolean z16;
        int baseline2;
        this.f8945f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i15);
        int mode2 = View.MeasureSpec.getMode(i16);
        if (this.f8948j == null || this.f8949k == null) {
            this.f8948j = new int[4];
            this.f8949k = new int[4];
        }
        int[] iArr = this.f8948j;
        int[] iArr2 = this.f8949k;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z17 = this.f8940a;
        boolean z18 = this.f8947h;
        int i39 = 1073741824;
        boolean z19 = mode == 1073741824;
        boolean z25 = z18;
        int iN = 0;
        int i45 = 0;
        int iMax2 = 0;
        boolean z26 = false;
        int iCombineMeasuredStates = 0;
        boolean z27 = false;
        boolean z28 = true;
        float f16 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i17 = i45;
            if (iN >= virtualChildCount) {
                break;
            }
            boolean z29 = z17;
            View viewQ = q(iN);
            if (viewQ == null) {
                this.f8945f += w(iN);
            } else {
                if (viewQ.getVisibility() == 8) {
                    iN += n(viewQ, iN);
                } else {
                    if (r(iN)) {
                        this.f8945f += this.f8951m;
                    }
                    a aVar = (a) viewQ.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f18 = f16 + f17;
                    if (mode == i39 && ((LinearLayout.LayoutParams) aVar).width == 0 && f17 > 0.0f) {
                        if (z19) {
                            this.f8945f += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i46 = this.f8945f;
                            this.f8945f = Math.max(i46, ((LinearLayout.LayoutParams) aVar).leftMargin + i46 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z29) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewQ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z26 = true;
                        }
                        i37 = i17;
                        i38 = 1073741824;
                        z15 = z25;
                        view = viewQ;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f17 <= 0.0f) {
                            b15 = -2;
                            i36 = PKIFailureInfo.systemUnavail;
                        } else {
                            b15 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i36 = 0;
                        }
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i37 = i17;
                        i38 = 1073741824;
                        z15 = z25;
                        iArr2 = iArr2;
                        int i47 = i36;
                        u(viewQ, iN, i15, f18 == 0.0f ? this.f8945f : 0, i16, 0);
                        view = viewQ;
                        if (i47 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i47;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z19) {
                            this.f8945f += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view);
                        } else {
                            int i48 = this.f8945f;
                            this.f8945f = Math.max(i48, i48 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view));
                        }
                        if (z15) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i38 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                        z16 = false;
                    } else {
                        z16 = true;
                        z27 = true;
                    }
                    int i49 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i49;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z29 && (baseline2 = view.getBaseline()) != -1) {
                        int i55 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i55 < 0) {
                            i55 = this.f8944e;
                        }
                        int i56 = (((i55 & 112) >> 4) & (-2)) >> 1;
                        iArr[i56] = Math.max(iArr[i56], baseline2);
                        iArr2[i56] = Math.max(iArr2[i56], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i37, measuredHeight);
                    z28 = z28 && ((LinearLayout.LayoutParams) aVar).height == -1;
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z16) {
                            i49 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i49);
                    } else {
                        if (z16 == 0) {
                            i49 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i49);
                    }
                    iN += n(view, iN);
                    i45 = iMax5;
                    f16 = f18;
                }
                iN++;
                z25 = z15;
                iArr2 = iArr2;
                z17 = z29;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i39 = 1073741824;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i45 = i17;
            z15 = z25;
            iN++;
            z25 = z15;
            iArr2 = iArr2;
            z17 = z29;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i39 = 1073741824;
        }
        boolean z35 = z17;
        int i57 = virtualChildCount;
        int i58 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i59 = iCombineMeasuredStates;
        boolean z36 = z25;
        if (this.f8945f > 0) {
            i18 = i57;
            if (r(i18)) {
                this.f8945f += this.f8951m;
            }
        } else {
            i18 = i57;
        }
        int i65 = iArr3[1];
        int iMax6 = (i65 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i17 : Math.max(i17, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i65, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
        if (z36) {
            i19 = i58;
            if (i19 == Integer.MIN_VALUE || i19 == 0) {
                this.f8945f = 0;
                int iN2 = 0;
                while (iN2 < i18) {
                    View viewQ2 = q(iN2);
                    if (viewQ2 == null) {
                        this.f8945f += w(iN2);
                    } else {
                        if (viewQ2.getVisibility() == 8) {
                            iN2 += n(viewQ2, iN2);
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            if (z19) {
                                this.f8945f += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2);
                            } else {
                                f16 = f16;
                                int i66 = this.f8945f;
                                this.f8945f = Math.max(i66, i66 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(viewQ2));
                            }
                        }
                        iN2++;
                        f16 = f16;
                        iMax6 = iMax6;
                    }
                    iN2++;
                    f16 = f16;
                    iMax6 = iMax6;
                }
            }
            f15 = f16;
        } else {
            f15 = f16;
            i19 = i58;
        }
        int iMax7 = iMax6;
        int paddingLeft = this.f8945f + getPaddingLeft() + getPaddingRight();
        this.f8945f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i15, 0);
        int i67 = (16777215 & iResolveSizeAndState) - this.f8945f;
        if (z26 || (i67 != 0 && f15 > 0.0f)) {
            float f19 = this.f8946g;
            if (f19 > 0.0f) {
                f15 = f19;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.f8945f = 0;
            int iCombineMeasuredStates2 = i59;
            int iMax8 = -1;
            int i68 = 0;
            while (i68 < i18) {
                View viewQ3 = q(i68);
                if (viewQ3 == null || viewQ3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) viewQ3.getLayoutParams();
                    float f25 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f25 > 0.0f) {
                        int i69 = (int) ((i67 * f25) / f15);
                        f15 -= f25;
                        i67 -= i69;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i16, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i35 = 1073741824;
                            if (i19 == 1073741824) {
                                if (i69 <= 0) {
                                    i69 = 0;
                                }
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(i69, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                        } else {
                            i35 = 1073741824;
                        }
                        int measuredWidth2 = viewQ3.getMeasuredWidth() + i69;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewQ3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i35), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewQ3.getMeasuredState() & (-16777216));
                    }
                    if (z19) {
                        this.f8945f += viewQ3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3);
                    } else {
                        int i75 = this.f8945f;
                        this.f8945f = Math.max(i75, viewQ3.getMeasuredWidth() + i75 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(viewQ3));
                    }
                    boolean z37 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i76 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewQ3.getMeasuredHeight() + i76;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z37) {
                        i76 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i76);
                    if (z28) {
                        i28 = -1;
                        boolean z38 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z35 && (baseline = viewQ3.getBaseline()) != i28) {
                            i29 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i29 < 0) {
                                i29 = this.f8944e;
                            }
                            int i77 = (((i29 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i77] = Math.max(iArr3[i77], baseline);
                            iArr4[i77] = Math.max(iArr4[i77], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax9;
                        z28 = z38;
                    } else {
                        i28 = -1;
                    }
                    if (z35) {
                        i29 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i29 < 0) {
                            i29 = this.f8944e;
                        }
                        int i78 = (((i29 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i78] = Math.max(iArr3[i78], baseline);
                        iArr4[i78] = Math.max(iArr4[i78], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax9;
                    z28 = z38;
                }
                i68++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i25 = iResolveSizeAndState;
            i26 = -16777216;
            this.f8945f += getPaddingLeft() + getPaddingRight();
            int i79 = iArr3[1];
            iMax7 = (i79 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i79, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
            i27 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z36 && i19 != 1073741824) {
                for (int i85 = 0; i85 < i18; i85++) {
                    View viewQ4 = q(i85);
                    if (viewQ4 != null && viewQ4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ4.getLayoutParams())).weight > 0.0f) {
                        viewQ4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(viewQ4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i25 = iResolveSizeAndState;
            i27 = i59;
            i26 = -16777216;
        }
        if (z28 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i25 | (i27 & i26), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i16, i27 << 16));
        if (z27) {
            i(i18, i15);
        }
    }

    int w(int i15) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    void x(int i15, int i16) {
        int i17;
        int iMax;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        View view;
        boolean z15;
        int iMax2;
        boolean z16;
        int iMax3;
        int i37;
        this.f8945f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i15);
        int mode2 = View.MeasureSpec.getMode(i16);
        int i38 = this.f8941b;
        boolean z17 = this.f8947h;
        int iN = 0;
        int i39 = 0;
        int iMax4 = 0;
        int i45 = 0;
        int i46 = 0;
        int iMax5 = 0;
        boolean z18 = false;
        boolean z19 = false;
        float f15 = 0.0f;
        boolean z25 = true;
        while (true) {
            int i47 = 8;
            if (iN >= virtualChildCount) {
                float f16 = f15;
                int i48 = i39;
                int i49 = virtualChildCount;
                int i55 = mode2;
                boolean z26 = z17;
                int i56 = iMax4;
                int iMax6 = i45;
                int iCombineMeasuredStates = i46;
                if (this.f8945f > 0) {
                    i17 = i49;
                    if (r(i17)) {
                        this.f8945f += this.f8952n;
                    }
                } else {
                    i17 = i49;
                }
                int i57 = i55;
                if (z26 && (i57 == Integer.MIN_VALUE || i57 == 0)) {
                    this.f8945f = 0;
                    int iN2 = 0;
                    while (iN2 < i17) {
                        View viewQ = q(iN2);
                        if (viewQ == null) {
                            this.f8945f += w(iN2);
                        } else if (viewQ.getVisibility() == i47) {
                            iN2 += n(viewQ, iN2);
                        } else {
                            a aVar = (a) viewQ.getLayoutParams();
                            int i58 = this.f8945f;
                            this.f8945f = Math.max(i58, i58 + i56 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(viewQ));
                        }
                        iN2++;
                        i47 = 8;
                    }
                }
                int paddingTop = this.f8945f + getPaddingTop() + getPaddingBottom();
                this.f8945f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i16, 0);
                int i59 = (16777215 & iResolveSizeAndState) - this.f8945f;
                if (z18 || (i59 != 0 && f16 > 0.0f)) {
                    float f17 = this.f8946g;
                    if (f17 <= 0.0f) {
                        f17 = f16;
                    }
                    this.f8945f = 0;
                    float f18 = f17;
                    int i65 = i59;
                    int i66 = 0;
                    while (i66 < i17) {
                        View viewQ2 = q(i66);
                        if (viewQ2.getVisibility() == 8) {
                            i57 = i57;
                            i66 = i66;
                        } else {
                            a aVar2 = (a) viewQ2.getLayoutParams();
                            float f19 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f19 > 0.0f) {
                                int i67 = (int) ((i65 * f19) / f18);
                                f18 -= f19;
                                i65 -= i67;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i15, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i19 = 1073741824;
                                    if (i57 == 1073741824) {
                                        viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i67 > 0 ? i67 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                                } else {
                                    i19 = 1073741824;
                                }
                                int measuredHeight = viewQ2.getMeasuredHeight() + i67;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewQ2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i19));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewQ2.getMeasuredState() & (-256));
                            } else {
                                i57 = i57;
                            }
                            int i68 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewQ2.getMeasuredWidth() + i68;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i18 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i68;
                                }
                            } else {
                                i18 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z27 = z25 && ((LinearLayout.LayoutParams) aVar2).width == i18;
                            int i69 = this.f8945f;
                            this.f8945f = Math.max(i69, i69 + viewQ2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(viewQ2));
                            iMax5 = iMax7;
                            z25 = z27;
                        }
                        i66++;
                        i57 = i57;
                    }
                    this.f8945f += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i48);
                    if (z26 && i57 != 1073741824) {
                        for (int i75 = 0; i75 < i17; i75++) {
                            View viewQ3 = q(i75);
                            if (viewQ3 != null && viewQ3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewQ3.getLayoutParams())).weight > 0.0f) {
                                viewQ3.measure(View.MeasureSpec.makeMeasureSpec(viewQ3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i56, 1073741824));
                            }
                        }
                    }
                }
                if (!z25 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i15, iCombineMeasuredStates), iResolveSizeAndState);
                if (z19) {
                    j(i17, i16);
                    return;
                }
                return;
            }
            float f25 = f15;
            View viewQ4 = q(iN);
            if (viewQ4 == null) {
                this.f8945f += w(iN);
            } else {
                if (viewQ4.getVisibility() == 8) {
                    iN += n(viewQ4, iN);
                } else {
                    if (r(iN)) {
                        this.f8945f += this.f8952n;
                    }
                    a aVar3 = (a) viewQ4.getLayoutParams();
                    float f26 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f27 = f25 + f26;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f26 > 0.0f) {
                        int i76 = this.f8945f;
                        this.f8945f = Math.max(i76, ((LinearLayout.LayoutParams) aVar3).topMargin + i76 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i39;
                        i28 = virtualChildCount;
                        i29 = mode2;
                        z18 = true;
                        i36 = i45;
                        i35 = i46;
                        z15 = z17;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f26 <= 0.0f) {
                            i25 = PKIFailureInfo.systemUnavail;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i25 = 0;
                        }
                        if (f27 == 0.0f) {
                            int i77 = i46;
                            i27 = this.f8945f;
                            i26 = i77;
                        } else {
                            i26 = i46;
                            i27 = 0;
                        }
                        int i78 = iMax4;
                        i28 = virtualChildCount;
                        i29 = mode2;
                        i35 = i26;
                        i36 = i45;
                        view = viewQ4;
                        z15 = z17;
                        iMax2 = i39;
                        u(view, iN, i15, 0, i16, i27);
                        if (i25 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i25;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i79 = this.f8945f;
                        this.f8945f = Math.max(i79, i79 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(view));
                        iMax4 = z15 ? Math.max(measuredHeight2, i78) : i78;
                    }
                    if (i38 >= 0 && i38 == iN + 1) {
                        view = viewQ4;
                        this.f8942c = this.f8945f;
                    }
                    if (iN < i38 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z16 = false;
                    } else {
                        z16 = true;
                        z19 = true;
                    }
                    int i85 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i85;
                    iMax3 = Math.max(i36, measuredWidth2);
                    int i86 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i35, view.getMeasuredState());
                    if (z25) {
                        i37 = iCombineMeasuredStates2;
                        z25 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (!z16) {
                                i85 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i85);
                        } else {
                            if (!z16) {
                                i85 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i85);
                        }
                        iN += n(view, iN);
                        f15 = f27;
                        iMax4 = i86;
                        i46 = i37;
                    } else {
                        i37 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z16) {
                            i85 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i85);
                    } else {
                        if (!z16) {
                            i85 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i85);
                    }
                    iN += n(view, iN);
                    f15 = f27;
                    iMax4 = i86;
                    i46 = i37;
                }
                iN++;
                i45 = iMax3;
                i39 = iMax2;
                z17 = z15;
                mode2 = i29;
                virtualChildCount = i28;
            }
            iMax2 = i39;
            i28 = virtualChildCount;
            i29 = mode2;
            z15 = z17;
            f15 = f25;
            iMax3 = i45;
            iN++;
            i45 = iMax3;
            i39 = iMax2;
            z17 = z15;
            mode2 = i29;
            virtualChildCount = i28;
        }
    }

    public l0(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f8940a = true;
        this.f8941b = -1;
        this.f8942c = 0;
        this.f8944e = 8388659;
        z0 z0VarV = z0.v(context, attributeSet, p007NuL.v.f439a1, i15, 0);
        j6.l0.f0(this, context, p007NuL.v.f439a1, attributeSet, z0VarV.r(), i15, 0);
        int iK = z0VarV.k(p007NuL.v.f449c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = z0VarV.k(p007NuL.v.f444b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = z0VarV.a(p007NuL.v.f454d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f8946g = z0VarV.i(p007NuL.v.f464f1, -1.0f);
        this.f8941b = z0VarV.k(p007NuL.v.f459e1, -1);
        this.f8947h = z0VarV.a(p007NuL.v.f479i1, false);
        setDividerDrawable(z0VarV.g(p007NuL.v.f469g1));
        this.f8953p = z0VarV.k(p007NuL.v.f484j1, 0);
        this.f8954q = z0VarV.f(p007NuL.v.f474h1, 0);
        z0VarV.x();
    }
}
