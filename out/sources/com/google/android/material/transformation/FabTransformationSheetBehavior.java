package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.HashMap;
import java.util.Map;
import ri.a;
import si.h;
import si.j;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<View, Integer> f35912i;

    public FabTransformationSheetBehavior() {
    }

    private void g0(View view, boolean z15) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z15) {
                this.f35912i = new HashMap(childCount);
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = coordinatorLayout.getChildAt(i15);
                boolean z16 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z16) {
                    if (z15) {
                        this.f35912i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else {
                        Map<View, Integer> map = this.f35912i;
                        if (map != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(this.f35912i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z15) {
                return;
            }
            this.f35912i = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean H(View view, View view2, boolean z15, boolean z16) {
        g0(view2, z15);
        return super.H(view, view2, z15, z16);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e e0(Context context, boolean z15) {
        int i15 = z15 ? a.f173905d : a.f173904c;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f35905a = h.c(context, i15);
        eVar.f35906b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
