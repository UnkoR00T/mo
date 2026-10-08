package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8641c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8641c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p007NuL.v.N0);
        j6.l0.f0(this, context, p007NuL.v.N0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f8639a = typedArrayObtainStyledAttributes.getBoolean(p007NuL.v.O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f8639a);
        }
    }

    private int a(int i15) {
        int childCount = getChildCount();
        while (i15 < childCount) {
            if (getChildAt(i15).getVisibility() == 0) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    private boolean b() {
        return this.f8640b;
    }

    private void setStacked(boolean z15) {
        if (this.f8640b != z15) {
            if (!z15 || this.f8639a) {
                this.f8640b = z15;
                setOrientation(z15 ? 1 : 0);
                setGravity(z15 ? 8388613 : 80);
                View viewFindViewById = findViewById(p007NuL.r.f401x);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z15 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        int iMakeMeasureSpec;
        boolean z15;
        int size = View.MeasureSpec.getSize(i15);
        int paddingBottom = 0;
        if (this.f8639a) {
            if (size > this.f8641c && b()) {
                setStacked(false);
            }
            this.f8641c = size;
        }
        if (b() || View.MeasureSpec.getMode(i15) != 1073741824) {
            iMakeMeasureSpec = i15;
            z15 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, PKIFailureInfo.systemUnavail);
            z15 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i16);
        if (this.f8639a && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z15 = true;
        }
        if (z15) {
            super.onMeasure(i15, i16);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (j6.l0.z(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i16 == 0) {
                super.onMeasure(i15, i16);
            }
        }
    }

    public void setAllowStacking(boolean z15) {
        if (this.f8639a != z15) {
            this.f8639a = z15;
            if (!z15 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
