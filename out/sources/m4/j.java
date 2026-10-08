package m4;

import androidx.compose.ui.node.NodeCoordinator;
import er.l;
import er.p;
import java.util.List;
import n4.ScrollAxisRange;
import n4.b0;
import n4.c0;
import n4.q;
import n4.w;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0013\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln4/w;", "fromNode", "", "depth", "Lkotlin/Function1;", "Lm4/i;", "Loq/i0;", "onCandidate", "d", "(Ln4/w;ILer/l;)V", "", "b", "(Ln4/w;)Ljava/util/List;", "Lkotlin/Function2;", "Lm3/e;", "Ltq/e;", "", "c", "(Ln4/w;)Ler/p;", "scrollCaptureScrollByAction", "", "a", "(Ln4/w;)Z", "canScrollVertically", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    private static final boolean a(w wVar) {
        p<m3.e, tq.e<? super m3.e>, Object> pVarC = c(wVar);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) q.a(wVar.getUnmergedConfig(), c0.f131174a.S());
        return (pVarC == null || scrollAxisRange == null || scrollAxisRange.a().a().floatValue() <= 0.0f) ? false : true;
    }

    private static final List<w> b(w wVar) {
        return wVar.n(false, false, false);
    }

    public static final p<m3.e, tq.e<? super m3.e>, Object> c(w wVar) {
        return (p) q.a(wVar.getUnmergedConfig(), n4.p.f131279a.w());
    }

    private static final void d(w wVar, int i15, l<? super ScrollCaptureCandidate, i0> lVar) {
        n2.c cVar = new n2.c(new w[16], 0);
        List<w> listB = b(wVar);
        while (true) {
            cVar.f(cVar.getSize(), listB);
            while (cVar.getSize() != 0) {
                w wVar2 = (w) cVar.v(cVar.getSize() - 1);
                if (!b0.g(wVar2) && !wVar2.getUnmergedConfig().g(c0.f131174a.f())) {
                    NodeCoordinator nodeCoordinatorF = wVar2.f();
                    if (nodeCoordinatorF == null) {
                        d4.a.d("Expected semantics node to have a coordinator.");
                        throw new oq.g();
                    }
                    p036e4.b0 b0VarM = nodeCoordinatorF.m();
                    c5.p pVarB = c5.q.b(p036e4.c0.d(b0VarM, false, 1, null));
                    if (pVarB.l()) {
                        continue;
                    } else if (a(wVar2)) {
                        int i16 = 1 + i15;
                        lVar.b(new ScrollCaptureCandidate(wVar2, i16, pVarB, b0VarM));
                        d(wVar2, i16, lVar);
                    } else {
                        listB = b(wVar2);
                    }
                }
            }
            return;
        }
    }

    static /* synthetic */ void e(w wVar, int i15, l lVar, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        d(wVar, i15, lVar);
    }
}
