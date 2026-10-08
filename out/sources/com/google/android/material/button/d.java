package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.internal.n;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import lj.l;
import lj.p;
import lj.q;
import lj.r;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class d extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f34926l = k.f174077k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<l> f34927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<q> f34928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f34929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator<MaterialButton> f34930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer[] f34931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    p f34932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f34933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34934h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f34935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34936k;

    private class b implements MaterialButton.c {
        private b() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(MaterialButton materialButton, boolean z15) {
            d.this.invalidate();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ri.b.f173919n);
    }

    public static /* synthetic */ int a(d dVar, MaterialButton materialButton, MaterialButton materialButton2) {
        dVar.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(dVar.indexOfChild(materialButton), dVar.indexOfChild(materialButton2));
    }

    private void b() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i15 = firstVisibleChildIndex + 1; i15 < getChildCount(); i15++) {
            MaterialButton materialButtonF = f(i15);
            MaterialButton materialButtonF2 = f(i15 - 1);
            if (this.f34934h <= 0) {
                iMin = Math.min(materialButtonF.getStrokeWidth(), materialButtonF2.getStrokeWidth());
                materialButtonF.setShouldDrawSurfaceColorStroke(true);
                materialButtonF2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButtonF.setShouldDrawSurfaceColorStroke(false);
                materialButtonF2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonF);
            if (getOrientation() == 0) {
                layoutParamsD.setMarginEnd(0);
                layoutParamsD.setMarginStart(this.f34934h - iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = this.f34934h - iMin;
                layoutParamsD.setMarginStart(0);
            }
            materialButtonF.setLayoutParams(layoutParamsD);
        }
        m(firstVisibleChildIndex);
    }

    private void c() {
        if (this.f34935j == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i15 = firstVisibleChildIndex; i15 <= lastVisibleChildIndex; i15++) {
            if (j(i15)) {
                int iE = e(i15);
                if (i15 != firstVisibleChildIndex && i15 != lastVisibleChildIndex) {
                    iE /= 2;
                }
                iMin = Math.min(iMin, iE);
            }
        }
        int i16 = firstVisibleChildIndex;
        while (i16 <= lastVisibleChildIndex) {
            if (j(i16)) {
                f(i16).setSizeChange(this.f34935j);
                f(i16).setWidthChangeMax((i16 == firstVisibleChildIndex || i16 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i16++;
        }
    }

    private int e(int i15) {
        if (!j(i15) || this.f34935j == null) {
            return 0;
        }
        int iMax = Math.max(0, this.f34935j.c(f(i15).getWidth()));
        MaterialButton materialButtonI = i(i15);
        int allowedWidthDecrease = materialButtonI == null ? 0 : materialButtonI.getAllowedWidthDecrease();
        MaterialButton materialButtonG = g(i15);
        return Math.min(iMax, allowedWidthDecrease + (materialButtonG != null ? materialButtonG.getAllowedWidthDecrease() : 0));
    }

    private MaterialButton g(int i15) {
        int childCount = getChildCount();
        do {
            i15++;
            if (i15 >= childCount) {
                return null;
            }
        } while (!j(i15));
        return f(i15);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (j(i15)) {
                return i15;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private q.b h(boolean z15, boolean z16, int i15) {
        q qVar = this.f34933g;
        if (qVar == null || (!z15 && !z16)) {
            qVar = this.f34928b.get(i15);
        }
        return qVar == null ? new q.b(this.f34927a.get(i15)) : qVar.i();
    }

    private MaterialButton i(int i15) {
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            if (j(i16)) {
                return f(i16);
            }
        }
        return null;
    }

    private boolean j(int i15) {
        return getChildAt(i15).getVisibility() != 8;
    }

    private void l() {
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            f(i15).o();
        }
    }

    private void m(int i15) {
        if (getChildCount() == 0 || i15 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f(i15).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void n() {
        TreeMap treeMap = new TreeMap(this.f34930d);
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            treeMap.put(f(i15), Integer.valueOf(i15));
        }
        this.f34931e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            c2.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        l();
        this.f34936k = true;
        super.addView(view, i15, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f34929c);
        this.f34927a.add(materialButton.getShapeAppearanceModel());
        this.f34928b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        n();
        super.dispatchDraw(canvas);
    }

    MaterialButton f(int i15) {
        return (MaterialButton) getChildAt(i15);
    }

    public r getButtonSizeChange() {
        return this.f34935j;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i15, int i16) {
        Integer[] numArr = this.f34931e;
        if (numArr != null && i16 < numArr.length) {
            return numArr[i16].intValue();
        }
        c2.g("MButtonGroup", "Child order wasn't updated");
        return i16;
    }

    public lj.d getInnerCornerSize() {
        return this.f34932f.e();
    }

    public p getInnerCornerSizeStateList() {
        return this.f34932f;
    }

    public l getShapeAppearance() {
        q qVar = this.f34933g;
        if (qVar == null) {
            return null;
        }
        return qVar.c(true);
    }

    public int getSpacing() {
        return this.f34934h;
    }

    public q getStateListShapeAppearance() {
        return this.f34933g;
    }

    void k(MaterialButton materialButton, int i15) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonI = i(iIndexOfChild);
        MaterialButton materialButtonG = g(iIndexOfChild);
        if (materialButtonI == null && materialButtonG == null) {
            return;
        }
        if (materialButtonI == null) {
            materialButtonG.setDisplayedWidthDecrease(i15);
        }
        if (materialButtonG == null) {
            materialButtonI.setDisplayedWidthDecrease(i15);
        }
        if (materialButtonI == null || materialButtonG == null) {
            return;
        }
        materialButtonI.setDisplayedWidthDecrease(i15 / 2);
        materialButtonG.setDisplayedWidthDecrease((i15 + 1) / 2);
    }

    void o() {
        int iH;
        if (!(this.f34932f == null && this.f34933g == null) && this.f34936k) {
            this.f34936k = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i15 = 0;
            while (i15 < childCount) {
                MaterialButton materialButtonF = f(i15);
                if (materialButtonF.getVisibility() != 8) {
                    boolean z15 = i15 == firstVisibleChildIndex;
                    boolean z16 = i15 == lastVisibleChildIndex;
                    q.b bVarH = h(z15, z16, i15);
                    boolean z17 = getOrientation() == 0;
                    boolean zG = com.google.android.material.internal.q.g(this);
                    if (z17) {
                        iH = z15 ? 5 : 0;
                        if (z16) {
                            iH |= 10;
                        }
                        if (zG) {
                            iH = q.h(iH);
                        }
                    } else {
                        iH = z15 ? 3 : 0;
                        if (z16) {
                            iH |= 12;
                        }
                    }
                    q qVarJ = bVarH.n(this.f34932f, ~iH).j();
                    if (qVarJ.f()) {
                        materialButtonF.setStateListShapeAppearanceModel(qVarJ);
                    } else {
                        materialButtonF.setShapeAppearanceModel(qVarJ.c(true));
                    }
                }
                i15++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        if (z15) {
            l();
            c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        o();
        b();
        super.onMeasure(i15, i16);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f34927a.remove(iIndexOfChild);
            this.f34928b.remove(iIndexOfChild);
        }
        this.f34936k = true;
        o();
        l();
        b();
    }

    public void setButtonSizeChange(r rVar) {
        if (this.f34935j != rVar) {
            this.f34935j = rVar;
            c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z15) {
        super.setEnabled(z15);
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            f(i15).setEnabled(z15);
        }
    }

    public void setInnerCornerSize(lj.d dVar) {
        this.f34932f = p.c(dVar);
        this.f34936k = true;
        o();
        invalidate();
    }

    public void setInnerCornerSizeStateList(p pVar) {
        this.f34932f = pVar;
        this.f34936k = true;
        o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i15) {
        if (getOrientation() != i15) {
            this.f34936k = true;
        }
        super.setOrientation(i15);
    }

    public void setShapeAppearance(l lVar) {
        this.f34933g = new q.b(lVar).j();
        this.f34936k = true;
        o();
        invalidate();
    }

    public void setSpacing(int i15) {
        this.f34934h = i15;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(q qVar) {
        this.f34933g = qVar;
        this.f34936k = true;
        o();
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, AttributeSet attributeSet, int i15) {
        int i16 = f34926l;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        this.f34927a = new ArrayList();
        this.f34928b = new ArrayList();
        this.f34929c = new b();
        this.f34930d = new Comparator() { // from class: com.google.android.material.button.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.a(this.f34925a, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f34936k = true;
        Context context2 = getContext();
        TypedArray typedArrayI = n.i(context2, attributeSet, ri.l.f174192m2, i15, i16, new int[0]);
        if (typedArrayI.hasValue(ri.l.f174216p2)) {
            this.f34935j = r.b(context2, typedArrayI, ri.l.f174216p2);
        }
        if (typedArrayI.hasValue(ri.l.f174232r2)) {
            q qVarB = q.b(context2, typedArrayI, ri.l.f174232r2);
            this.f34933g = qVarB;
            if (qVarB == null) {
                this.f34933g = new q.b(l.b(context2, typedArrayI.getResourceId(ri.l.f174232r2, 0), typedArrayI.getResourceId(ri.l.f174240s2, 0)).m()).j();
            }
        }
        if (typedArrayI.hasValue(ri.l.f174224q2)) {
            this.f34932f = p.b(context2, typedArrayI, ri.l.f174224q2, new lj.a(0.0f));
        }
        this.f34934h = typedArrayI.getDimensionPixelSize(ri.l.f174208o2, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(ri.l.f174200n2, true));
        typedArrayI.recycle();
    }
}
