package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll3/z;", "Loq/i0;", "a", "(Ll3/z;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {
    public static final void a(z zVar) {
        int iA = g4.s0.a(1024);
        if (!zVar.getNode().getIsAttached()) {
            d4.a.c("visitChildren called on an unattached node");
        }
        n2.c cVar = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = zVar.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar, zVar.getNode(), false);
        } else {
            cVar.d(child);
        }
        while (cVar.getSize() != 0) {
            f3.m.c cVarL = (f3.m.c) cVar.v(cVar.getSize() - 1);
            if ((cVarL.getAggregateChildKindSet() & iA) == 0) {
                g4.h.c(cVar, cVarL, false);
            } else {
                while (cVarL != null) {
                    if ((cVarL.getKindSet() & iA) != 0) {
                        n2.c cVar2 = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                q0.a((p0) cVarL);
                            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i15 = 0;
                                for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarL = delegate;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL != null) {
                                                cVar2.d(cVarL);
                                                cVarL = null;
                                            }
                                            cVar2.d(delegate);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar2);
                        }
                        break;
                    }
                    cVarL = cVarL.getChild();
                }
            }
        }
    }
}
