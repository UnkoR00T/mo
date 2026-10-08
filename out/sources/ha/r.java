package ha;

import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lha/d;", "navigationEventDispatcherOwner", "Loq/i0;", "b", "(Landroid/view/View;Lha/d;)V", "a", "(Landroid/view/View;)Lha/d;", "navigationevent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r {
    public static final d a(View view) {
        while (view != null) {
            Object tag = view.getTag(q.f82275a);
            d dVar = tag instanceof d ? (d) tag : null;
            if (dVar != null) {
                return dVar;
            }
            Object objA = o6.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, d dVar) {
        view.setTag(q.f82275a, dVar);
    }
}
