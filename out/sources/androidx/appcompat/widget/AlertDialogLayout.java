package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends l0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean A(int i15, int i16) {
        int iCombineMeasuredStates;
        int iZ;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int id5 = childAt.getId();
                if (id5 == p007NuL.r.F) {
                    view = childAt;
                } else if (id5 == p007NuL.r.f388k) {
                    view2 = childAt;
                } else {
                    if ((id5 != p007NuL.r.f390m && id5 != p007NuL.r.f392o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i16);
        int size = View.MeasureSpec.getSize(i16);
        int mode2 = View.MeasureSpec.getMode(i15);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i15, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i15, 0);
            iZ = z(view2);
            measuredHeight = view2.getMeasuredHeight() - iZ;
            paddingTop += iZ;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iZ = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i15, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i18 = size - paddingTop;
        if (view2 != null) {
            int i19 = paddingTop - iZ;
            int iMin = Math.min(i18, measuredHeight);
            if (iMin > 0) {
                i18 -= iMin;
                iZ += iMin;
            }
            view2.measure(i15, View.MeasureSpec.makeMeasureSpec(iZ, 1073741824));
            paddingTop = i19 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i18 > 0) {
            view3.measure(i15, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i18, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = getChildAt(i25);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i15, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i16, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        j(childCount, i16);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void j(int i15, int i16) {
        int i17;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i18 = 0;
        while (i18 < i15) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                l0.a aVar = (l0.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i19 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    i17 = i16;
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i17, 0);
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

    private static int z(View view) {
        int iZ = j6.l0.z(view);
        if (iZ > 0) {
            return iZ;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return z(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        int i19;
        int i25;
        int i26;
        int paddingLeft = getPaddingLeft();
        int i27 = i17 - i15;
        int paddingRight = i27 - getPaddingRight();
        int paddingRight2 = (i27 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i28 = gravity & 112;
        int i29 = gravity & 8388615;
        int paddingTop = i28 != 16 ? i28 != 80 ? getPaddingTop() : ((getPaddingTop() + i18) - i16) - measuredHeight : getPaddingTop() + (((i18 - i16) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i35 = 0; i35 < childCount; i35++) {
            View childAt = getChildAt(i35);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                l0.a aVar = (l0.a) childAt.getLayoutParams();
                int i36 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i36 < 0) {
                    i36 = i29;
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
                    if (r(i35)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i38 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(childAt, i37, i38, measuredWidth, measuredHeight2);
                    paddingTop = i38 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                } else {
                    i19 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i25 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i26 = i19 - i25;
                int i39 = i26;
                if (r(i35)) {
                    paddingTop += intrinsicHeight;
                }
                int i310 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                y(childAt, i39, i310, measuredWidth, measuredHeight2);
                paddingTop = i310 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.l0, android.view.View
    protected void onMeasure(int i15, int i16) {
        if (A(i15, i16)) {
            return;
        }
        super.onMeasure(i15, i16);
    }
}
