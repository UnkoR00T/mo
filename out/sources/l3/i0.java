package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll3/h0;", "", "a", "(Ll3/h0;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {
    public static final boolean a(h0 h0Var) {
        int iA = g4.s0.a(1024);
        f3.m.c node = h0Var.getNode();
        n2.c cVar = null;
        while (node != null) {
            if (node instanceof p0) {
                return n0.X1((p0) node, 0, 1, null);
            }
            if ((node.getKindSet() & iA) != 0 && (node instanceof g4.j)) {
                int i15 = 0;
                for (f3.m.c delegate = ((g4.j) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i15++;
                        if (i15 == 1) {
                            node = delegate;
                        } else {
                            if (cVar == null) {
                                cVar = new n2.c(new f3.m.c[16], 0);
                            }
                            if (node != null) {
                                cVar.d(node);
                                node = null;
                            }
                            cVar.d(delegate);
                        }
                    }
                }
                if (i15 == 1) {
                }
            }
            node = g4.h.l(cVar);
        }
        if (!h0Var.getNode().getIsAttached()) {
            d4.a.c("visitChildren called on an unattached node");
        }
        n2.c cVar2 = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = h0Var.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar2, h0Var.getNode(), false);
        } else {
            cVar2.d(child);
        }
        while (cVar2.getSize() != 0) {
            f3.m.c cVarL = (f3.m.c) cVar2.v(cVar2.getSize() - 1);
            if ((cVarL.getAggregateChildKindSet() & iA) == 0) {
                g4.h.c(cVar2, cVarL, false);
            } else {
                while (cVarL != null) {
                    if ((cVarL.getKindSet() & iA) != 0) {
                        n2.c cVar3 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                return n0.X1((p0) cVarL, 0, 1, null);
                            }
                            if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i16 = 0;
                                for (f3.m.c delegate2 = ((g4.j) cVarL).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & iA) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            cVarL = delegate2;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL != null) {
                                                cVar3.d(cVarL);
                                                cVarL = null;
                                            }
                                            cVar3.d(delegate2);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar3);
                        }
                        break;
                    }
                    cVarL = cVarL.getChild();
                }
            }
        }
        return false;
    }
}
