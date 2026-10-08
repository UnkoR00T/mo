package l3;

import androidx.compose.ui.node.NodeCoordinator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u0019"}, d2 = {"Ll3/p0;", "Ll3/g;", "focusDirection", "Lc5/t;", "layoutDirection", "Ll3/d0;", "a", "(Ll3/p0;ILc5/t;)Ll3/d0;", "Lm3/g;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "e", "(Ll3/p0;ILc5/t;Lm3/g;Ler/l;)Ljava/lang/Boolean;", "d", "(Ll3/p0;)Lm3/g;", "b", "(Ll3/p0;)Ll3/p0;", "c", "g", "(Ll3/p0;)Z", "isEligibleForFocusSearch", "f", "activeChild", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f115610b;

        static {
            int[] iArr = new int[c5.t.values().length];
            try {
                iArr[c5.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c5.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f115609a = iArr;
            int[] iArr2 = new int[m0.values().length];
            try {
                iArr2[m0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[m0.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[m0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f115610b = iArr2;
        }
    }

    public static final d0 a(p0 p0Var, int i15, c5.t tVar) {
        d0 end;
        d0 d0Var;
        d0 start;
        v vVarU3 = p0Var.u3();
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.e())) {
            return vVarU3.getNext();
        }
        if (g.l(i15, companion.f())) {
            return vVarU3.getPrevious();
        }
        if (g.l(i15, companion.h())) {
            return vVarU3.getUp();
        }
        if (g.l(i15, companion.a())) {
            return vVarU3.getDown();
        }
        if (g.l(i15, companion.d())) {
            int i16 = a.f115609a[tVar.ordinal()];
            if (i16 == 1) {
                start = vVarU3.getStart();
            } else {
                if (i16 != 2) {
                    throw new oq.p();
                }
                start = vVarU3.getEnd();
            }
            d0Var = start != d0.INSTANCE.c() ? start : null;
            return d0Var == null ? vVarU3.getLeft() : d0Var;
        }
        if (g.l(i15, companion.g())) {
            int i17 = a.f115609a[tVar.ordinal()];
            if (i17 == 1) {
                end = vVarU3.getEnd();
            } else {
                if (i17 != 2) {
                    throw new oq.p();
                }
                end = vVarU3.getStart();
            }
            d0Var = end != d0.INSTANCE.c() ? end : null;
            return d0Var == null ? vVarU3.getRight() : d0Var;
        }
        if (!g.l(i15, companion.b()) && !g.l(i15, companion.c())) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        b bVar = new b(i15, null);
        s focusOwner = g4.h.t(p0Var).getFocusOwner();
        p0 p0VarK = focusOwner.k();
        if (g.l(i15, companion.b())) {
            vVarU3.o().b(bVar);
        } else {
            vVarU3.q().b(bVar);
        }
        if (bVar.getIsCanceled()) {
            return d0.INSTANCE.b();
        }
        return p0VarK != focusOwner.k() ? d0.INSTANCE.d() : d0.INSTANCE.c();
    }

    public static final p0 b(p0 p0Var) {
        p0 p0VarK = g4.h.t(p0Var).getFocusOwner().k();
        if (p0VarK == null || !p0VarK.getIsAttached()) {
            return null;
        }
        return p0VarK;
    }

    private static final p0 c(p0 p0Var) {
        g4.p0 nodes;
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent = p0Var.getNode().getParent();
        androidx.compose.ui.node.g gVarS = g4.h.s(p0Var);
        while (gVarS != null) {
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        f3.m.c cVarL = parent;
                        n2.c cVar = null;
                        while (cVarL != null) {
                            if (cVarL instanceof p0) {
                                p0 p0Var2 = (p0) cVarL;
                                if (p0Var2.u3().getCanFocus()) {
                                    return p0Var2;
                                }
                            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
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
                    }
                    parent = parent.getParent();
                }
            }
            gVarS = gVarS.C0();
            parent = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    public static final m3.g d(p0 p0Var) {
        p036e4.b0 b0VarE;
        if (!p0Var.getIsAttached()) {
            return m3.g.INSTANCE.a();
        }
        NodeCoordinator coordinator = p0Var.getCoordinator();
        if (coordinator != null && (b0VarE = p036e4.c0.e(coordinator)) != null) {
            if (!b0VarE.c()) {
                b0VarE = null;
            }
            if (b0VarE != null) {
                return p0Var.v3(b0VarE);
            }
        }
        return m3.g.INSTANCE.a();
    }

    public static final Boolean e(p0 p0Var, int i15, c5.t tVar, m3.g gVar, er.l<? super p0, Boolean> lVar) {
        int iG;
        g.Companion companion = g.INSTANCE;
        if (g.l(i15, companion.e()) || g.l(i15, companion.f())) {
            return Boolean.valueOf(v0.f(p0Var, i15, lVar));
        }
        if (g.l(i15, companion.d()) || g.l(i15, companion.g()) || g.l(i15, companion.h()) || g.l(i15, companion.a())) {
            return x0.t(p0Var, i15, gVar, lVar);
        }
        if (!g.l(i15, companion.b())) {
            if (g.l(i15, companion.c())) {
                p0 p0VarB = b(p0Var);
                p0 p0VarC = p0VarB != null ? c(p0VarB) : null;
                return Boolean.valueOf((p0VarC == null || fr.t.c(p0VarC, p0Var)) ? false : lVar.b(p0VarC).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) g.n(i15))).toString());
        }
        int i16 = a.f115609a[tVar.ordinal()];
        if (i16 == 1) {
            iG = companion.g();
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            iG = companion.d();
        }
        p0 p0VarB2 = b(p0Var);
        if (p0VarB2 != null) {
            return x0.t(p0VarB2, iG, gVar, lVar);
        }
        return null;
    }

    public static final p0 f(p0 p0Var) {
        if (!p0Var.getNode().getIsAttached()) {
            return null;
        }
        int iA = g4.s0.a(1024);
        if (!p0Var.getNode().getIsAttached()) {
            d4.a.c("visitChildren called on an unattached node");
        }
        n2.c cVar = new n2.c(new f3.m.c[16], 0);
        f3.m.c child = p0Var.getNode().getChild();
        if (child == null) {
            g4.h.c(cVar, p0Var.getNode(), false);
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
                                p0 p0Var2 = (p0) cVarL;
                                if (p0Var2.getNode().getIsAttached()) {
                                    int i15 = a.f115610b[p0Var2.d0().ordinal()];
                                    if (i15 == 1 || i15 == 2 || i15 == 3) {
                                        return p0Var2;
                                    }
                                    if (i15 != 4) {
                                        throw new oq.p();
                                    }
                                }
                            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                int i16 = 0;
                                for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i16++;
                                        if (i16 == 1) {
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
                                if (i16 == 1) {
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
        return null;
    }

    public static final boolean g(p0 p0Var) {
        androidx.compose.ui.node.g layoutNode;
        NodeCoordinator coordinator;
        androidx.compose.ui.node.g layoutNode2;
        NodeCoordinator coordinator2 = p0Var.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.p() || (coordinator = p0Var.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.c()) ? false : true;
    }
}
