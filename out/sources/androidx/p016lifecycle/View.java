package androidx.p016lifecycle;

import o6.b;
import p071kotlin.Metadata;
import p7.e;

/* JADX INFO: renamed from: androidx.lifecycle.a1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/y0;", "viewModelStoreOwner", "Loq/i0;", "b", "(Landroid/view/View;Landroidx/lifecycle/y0;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/y0;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class View {
    public static final y0 a(android.view.View view) {
        while (view != null) {
            Object tag = view.getTag(e.f153225a);
            y0 y0Var = tag instanceof y0 ? (y0) tag : null;
            if (y0Var != null) {
                return y0Var;
            }
            Object objA = b.a(view);
            view = objA instanceof android.view.View ? (android.view.View) objA : null;
        }
        return null;
    }

    public static final void b(android.view.View view, y0 y0Var) {
        view.setTag(e.f153225a, y0Var);
    }
}
