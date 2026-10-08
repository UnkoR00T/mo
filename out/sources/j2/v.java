package j2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import n3.p1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lb1/j;", "interactionSource", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "color", "Lkotlin/Function0;", "Landroidx/compose/material3/internal/ripple/b;", "rippleNodeConfig", "Lg4/g;", "d", "(Lb1/j;ZFLn3/p1;Ler/a;)Lg4/g;", "Landroid/view/ViewGroup;", "view", "Lj2/j;", "c", "(Landroid/view/ViewGroup;)Lj2/j;", "Landroid/view/View;", "initialView", "e", "(Landroid/view/View;)Landroid/view/ViewGroup;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    /* JADX INFO: Access modifiers changed from: private */
    public static final j c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = viewGroup.getChildAt(i15);
            if (childAt instanceof j) {
                return (j) childAt;
            }
        }
        j jVar = new j(viewGroup.getContext());
        viewGroup.addView(jVar);
        return jVar;
    }

    public static final g4.g d(b1.j jVar, boolean z15, float f15, p1 p1Var, er.a<androidx.compose.material3.internal.ripple.b> aVar) {
        return new androidx.compose.material3.internal.ripple.a(jVar, z15, f15, p1Var, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup e(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
