package g4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\r\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0012\u0010\u000e\u001a/\u0010\u0013\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lg4/g;", "", "key", "Lg4/q1;", "a", "(Lg4/g;Ljava/lang/Object;)Lg4/q1;", "T", "b", "(Lg4/q1;)Lg4/q1;", "Lkotlin/Function1;", "", "block", "Loq/i0;", "c", "(Lg4/g;Ljava/lang/Object;Ler/l;)V", "d", "(Lg4/q1;Ler/l;)V", "Lg4/p1;", "e", "f", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r1 {
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    public static final q1 a(g gVar, Object obj) {
        p0 nodes;
        int iA = s0.a(PKIFailureInfo.transactionIdInUse);
        boolean z15 = f3.h.isTraversableDelegatesFixEnabled;
        if (!gVar.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent = gVar.getNode().getParent();
        androidx.compose.ui.node.g gVarS = h.s(gVar);
        while (gVarS != null) {
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        f3.m.c cVarL = parent;
                        n2.c cVar = null;
                        while (cVarL != null) {
                            if (cVarL instanceof q1) {
                                q1 q1Var = (q1) cVarL;
                                if (fr.t.c(obj, q1Var.getTraverseKey())) {
                                    return q1Var;
                                }
                                if (z15) {
                                    if ((cVarL.getKindSet() & iA) == 0 && (cVarL instanceof j)) {
                                        int i15 = 0;
                                        for (f3.m.c delegate = ((j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
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
                                }
                                cVarL = h.l(cVar);
                            } else {
                                if ((cVarL.getKindSet() & iA) == 0) {
                                }
                                cVarL = h.l(cVar);
                            }
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public static final <T extends q1> T b(T t15) {
        p0 nodes;
        int iA = s0.a(PKIFailureInfo.transactionIdInUse);
        boolean z15 = f3.h.isTraversableDelegatesFixEnabled;
        if (!t15.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent = t15.getNode().getParent();
        androidx.compose.ui.node.g gVarS = h.s(t15);
        while (gVarS != null) {
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        f3.m.c cVarL = parent;
                        n2.c cVar = null;
                        while (cVarL != null) {
                            if (cVarL instanceof q1) {
                                T t16 = (T) cVarL;
                                if (fr.t.c(t15.getTraverseKey(), t16.getTraverseKey()) && f3.b.a(t15, t16)) {
                                    return t16;
                                }
                                if (z15) {
                                    if ((cVarL.getKindSet() & iA) == 0 && (cVarL instanceof j)) {
                                        int i15 = 0;
                                        for (f3.m.c delegate = ((j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
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
                                }
                                cVarL = h.l(cVar);
                            } else {
                                if ((cVarL.getKindSet() & iA) == 0) {
                                }
                                cVarL = h.l(cVar);
                            }
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    public static final void c(g gVar, Object obj, er.l<? super q1, Boolean> lVar) {
        p0 nodes;
        boolean z15;
        int iA = s0.a(PKIFailureInfo.transactionIdInUse);
        if (!gVar.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent = gVar.getNode().getParent();
        androidx.compose.ui.node.g gVarS = h.s(gVar);
        while (gVarS != null) {
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        f3.m.c cVarL = parent;
                        n2.c cVar = null;
                        while (cVarL != null) {
                            if (cVarL instanceof q1) {
                                q1 q1Var = (q1) cVarL;
                                if (!(fr.t.c(obj, q1Var.getTraverseKey()) ? lVar.b(q1Var).booleanValue() : true)) {
                                    return;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = true;
                            }
                            if (z15) {
                                if (((cVarL.getKindSet() & iA) != 0) && (cVarL instanceof j)) {
                                    int i15 = 0;
                                    for (f3.m.c delegate = ((j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
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
                            }
                            cVarL = h.l(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final <T extends q1> void d(T t15, er.l<? super T, Boolean> lVar) {
        p0 nodes;
        boolean z15;
        int iA = s0.a(PKIFailureInfo.transactionIdInUse);
        if (!t15.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent = t15.getNode().getParent();
        androidx.compose.ui.node.g gVarS = h.s(t15);
        while (gVarS != null) {
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        f3.m.c cVarL = parent;
                        n2.c cVar = null;
                        while (cVarL != null) {
                            if (cVarL instanceof q1) {
                                q1 q1Var = (q1) cVarL;
                                if (!((fr.t.c(t15.getTraverseKey(), q1Var.getTraverseKey()) && f3.b.a(t15, q1Var)) ? lVar.b(q1Var).booleanValue() : true)) {
                                    return;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = true;
                            }
                            if (z15) {
                                if (((cVarL.getKindSet() & iA) != 0) && (cVarL instanceof j)) {
                                    int i15 = 0;
                                    for (f3.m.c delegate = ((j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
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
                            }
                            cVarL = h.l(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final void e(g4.g r12, java.lang.Object r13, er.l<? super g4.q1, ? extends g4.p1> r14) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r1.e(g4.g, java.lang.Object, er.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final <T extends g4.q1> void f(T r13, er.l<? super T, ? extends g4.p1> r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r1.f(g4.q1, er.l):void");
    }
}
