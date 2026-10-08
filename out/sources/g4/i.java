package g4;

import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg4/g;", "Landroid/view/View;", "a", "(Lg4/g;)Landroid/view/View;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final View a(g gVar) {
        if (!gVar.getNode().getIsAttached()) {
            d4.a.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) g0.b(h.s(gVar));
    }
}
