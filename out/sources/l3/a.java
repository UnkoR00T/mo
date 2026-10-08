package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Ll3/p0;", "Ll3/g;", "direction", "Lkotlin/Function1;", "Le4/h$a;", "block", "a", "(Ll3/p0;ILer/l;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final <T> T a(p0 p0Var, int i15, er.l<? super e4.h.a, ? extends T> lVar) {
        f3.m.c cVarL;
        p036e4.h hVarX3;
        int iC;
        g4.p0 nodes;
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent = p0Var.getNode().getParent();
        androidx.compose.ui.node.g gVarS = g4.h.s(p0Var);
        loop0: while (true) {
            if (gVarS == null) {
                cVarL = null;
                break;
            }
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        cVarL = parent;
                        n2.c cVar = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                break loop0;
                            }
                            if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i16 = 0;
                                for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i16++;
                                        if (i16 == 1) {
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
                                if (i16 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        p0 p0Var2 = (p0) cVarL;
        if ((p0Var2 != null && fr.t.c(p0Var2.x3(), p0Var.x3())) || (hVarX3 = p0Var.x3()) == null) {
            return null;
        }
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.h())) {
            iC = e4.h.b.INSTANCE.a();
        } else if (g.l(i15, companion.a())) {
            iC = e4.h.b.INSTANCE.d();
        } else if (g.l(i15, companion.d())) {
            iC = e4.h.b.INSTANCE.e();
        } else if (g.l(i15, companion.g())) {
            iC = e4.h.b.INSTANCE.f();
        } else if (g.l(i15, companion.e())) {
            iC = e4.h.b.INSTANCE.b();
        } else {
            if (!g.l(i15, companion.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = e4.h.b.INSTANCE.c();
        }
        return (T) hVarX3.m0(iC, lVar);
    }
}
