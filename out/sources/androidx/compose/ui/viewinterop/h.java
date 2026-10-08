package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import l3.p;
import l3.s;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lf3/m;", "e", "(Lf3/m;)Lf3/m;", "Lf3/m$c;", "Landroid/view/View;", "g", "(Lf3/m$c;)Landroid/view/View;", "other", "", "d", "(Landroid/view/View;Landroid/view/View;)Z", "Ll3/s;", "focusOwner", "hostView", "embeddedView", "Landroid/graphics/Rect;", "f", "(Ll3/s;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final f3.m e(f3.m mVar) {
        return p.a(mVar.u(i.f11007d)).u(m.f11019d).u(k.f11014d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect f(s sVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        m3.g gVarD = sVar.d();
        if (gVarD == null) {
            return null;
        }
        return new Rect((((int) gVarD.getLeft()) + iArr[0]) - iArr2[0], (((int) gVarD.getTop()) + iArr[1]) - iArr2[1], (((int) gVarD.getRight()) + iArr[0]) - iArr2[0], (((int) gVarD.getBottom()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View g(f3.m.c cVar) {
        View viewD0 = g4.h.s(cVar.getNode()).d0();
        if (viewD0 != null) {
            return viewD0;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
