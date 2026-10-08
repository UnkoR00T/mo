package g4;

import androidx.compose.ui.node.NodeCoordinator;
import n3.a2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a'\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg4/z;", "Loq/i0;", "d", "(Lg4/z;)V", "a", "c", "b", "Lkotlin/Function1;", "Ln3/a2;", "layerBlock", "e", "(Lg4/z;Ler/l;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {
    public static final void a(z zVar) {
        h.n(zVar, s0.a(2)).z3();
    }

    public static final void b(z zVar) {
        h.s(zVar).W0();
    }

    public static final void c(z zVar) {
        androidx.compose.ui.node.g.M1(h.s(zVar), false, 1, null);
    }

    public static final void d(z zVar) {
        h.s(zVar).k();
    }

    public static final void e(z zVar, er.l<? super a2, oq.i0> lVar) {
        NodeCoordinator wrapped;
        if (zVar.getNode().getIsAttached() && (wrapped = h.n(zVar, s0.a(2)).getWrapped()) != null) {
            wrapped.k4(lVar, true);
        }
    }
}
