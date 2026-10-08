package n4;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import g4.i1;
import g4.p0;
import g4.s0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\"\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/g;", "layoutNode", "", "mergingEnabled", "Ln4/w;", "a", "(Landroidx/compose/ui/node/g;Z)Ln4/w;", "", "e", "(Ln4/w;)I", "g", "Ln4/l;", "f", "(Ln4/w;)Ln4/l;", "role", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    public static final w a(androidx.compose.ui.node.g gVar, boolean z15) {
        p0 nodes = gVar.getNodes();
        int iA = s0.a(8);
        Object obj = null;
        if ((nodes.i() & iA) != 0) {
            loop0: for (f3.m.c head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) == 0) {
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    f3.m.c cVarL = head;
                    n2.c cVar = null;
                    while (cVarL != null) {
                        if (cVarL instanceof i1) {
                            obj = cVarL;
                            break loop0;
                        }
                        if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                            int i15 = 0;
                            for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        cVarL = delegate;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new n2.c(new f3.m.c[16], 0);
                                        }
                                        if (cVarL != null) {
                                            cVar.d(cVarL);
                                            cVarL = null;
                                        }
                                        cVar.d(delegate);
                                    }
                                }
                            }
                            if (i15 == 1) {
                            }
                        }
                        cVarL = g4.h.l(cVar);
                    }
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        f3.m.c node = ((i1) obj).getNode();
        SemanticsConfiguration semanticsConfigurationF = gVar.f();
        if (semanticsConfigurationF == null) {
            semanticsConfigurationF = new SemanticsConfiguration();
        }
        return new w(node, z15, gVar, semanticsConfigurationF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(w wVar) {
        return wVar.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l f(w wVar) {
        return (l) q.a(wVar.getUnmergedConfig(), c0.f131174a.F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(w wVar) {
        return wVar.getId() + 1000000000;
    }
}
