package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.f;
import java.util.List;
import k6.p;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class b extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f35089j = k.f174085s;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f35092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35093h;

    class a implements d {
        a(c cVar) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.b$b, reason: collision with other inner class name */
    public static class C0746b extends ViewGroup.MarginLayoutParams {
        public C0746b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0746b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0746b(int i15, int i16) {
            super(i15, i16);
        }
    }

    @Deprecated
    public interface c {
    }

    public interface d {
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        static /* synthetic */ ViewGroup.OnHierarchyChangeListener a(e eVar, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            throw null;
        }
    }

    private boolean e(int i15) {
        return getChildAt(i15).getVisibility() == 0;
    }

    private int getVisibleChipCount() {
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            if ((getChildAt(i16) instanceof Chip) && e(i16)) {
                i15++;
            }
        }
        return i15;
    }

    @Override // com.google.android.material.internal.f
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0746b);
    }

    int d(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if ((childAt instanceof Chip) && e(i16)) {
                if (((Chip) childAt) == view) {
                    return i15;
                }
                i15++;
            }
        }
        return -1;
    }

    public boolean f() {
        throw null;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0746b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0746b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f35090e;
    }

    public int getChipSpacingVertical() {
        return this.f35091f;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.f35093h != -1) {
            throw null;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.f1(accessibilityNodeInfo).q0(p.f.a(getRowCount(), c() ? getVisibleChipCount() : -1, false, f() ? 1 : 2));
    }

    public void setChipSpacing(int i15) {
        setChipSpacingHorizontal(i15);
        setChipSpacingVertical(i15);
    }

    public void setChipSpacingHorizontal(int i15) {
        if (this.f35090e != i15) {
            this.f35090e = i15;
            setItemSpacing(i15);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i15) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i15));
    }

    public void setChipSpacingResource(int i15) {
        setChipSpacing(getResources().getDimensionPixelOffset(i15));
    }

    public void setChipSpacingVertical(int i15) {
        if (this.f35091f != i15) {
            this.f35091f = i15;
            setLineSpacing(i15);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i15) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i15));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i15) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f35092g = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        e.a(null, onHierarchyChangeListener);
    }

    public void setSelectionRequired(boolean z15) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i15) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i15) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.f
    public void setSingleLine(boolean z15) {
        super.setSingleLine(z15);
    }

    public void setSingleSelection(boolean z15) {
        throw null;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0746b(layoutParams);
    }

    public void setSingleLine(int i15) {
        setSingleLine(getResources().getBoolean(i15));
    }

    public void setSingleSelection(int i15) {
        setSingleSelection(getResources().getBoolean(i15));
    }
}
