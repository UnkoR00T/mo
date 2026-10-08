package g4;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import n3.x1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000e\u001a\u00020\u0001*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u000b¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010\"\u001a\u00020!*\u00020\u000b¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010%\u001a\u00020$*\u00020\u000b¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010(\u001a\u00020'*\u00020\u000b¢\u0006\u0004\b(\u0010)\u001a\u0011\u0010*\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b*\u0010\u001d\u001a\u0011\u0010+\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b+\u0010\u001d\u001a\u0019\u0010.\u001a\u00020\b*\u00020\u000b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0013\u00101\u001a\u0004\u0018\u000100*\u00020\u000b¢\u0006\u0004\b1\u00102\u001a\u0015\u00104\u001a\u0004\u0018\u000103*\u00020\u0006H\u0000¢\u0006\u0004\b4\u00105\u001a\u001d\u00106\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b6\u00107\"\u0018\u0010:\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Landroidx/compose/ui/node/g;", "", "zOrder", "Ln2/c;", "g", "(Landroidx/compose/ui/node/g;Z)Ln2/c;", "Lf3/m$c;", "node", "Loq/i0;", "c", "(Ln2/c;Lf3/m$c;Z)V", "Lg4/g;", "Lg4/s0;", "type", "h", "(Lg4/g;I)Z", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "n", "(Lg4/g;I)Landroidx/compose/ui/node/NodeCoordinator;", "s", "(Lg4/g;)Landroidx/compose/ui/node/g;", "Ln4/r;", "u", "(Lg4/g;)Ln4/r;", "Landroidx/compose/ui/node/Owner;", "t", "(Lg4/g;)Landroidx/compose/ui/node/Owner;", "m", "(Lg4/g;)V", "Lc5/d;", "o", "(Lg4/g;)Lc5/d;", "Ln3/x1;", "p", "(Lg4/g;)Ln3/x1;", "Lc5/t;", "r", "(Lg4/g;)Lc5/t;", "Le4/b0;", "q", "(Lg4/g;)Le4/b0;", "j", "i", "Lm3/e;", "delta", "e", "(Lg4/g;J)V", "Le4/h;", "f", "(Lg4/g;)Le4/h;", "Lg4/z;", "d", "(Lf3/m$c;)Lg4/z;", "l", "(Ln2/c;)Lf3/m$c;", "k", "(Lg4/g;)Z", "isDelegationRoot", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(n2.c<f3.m.c> cVar, f3.m.c cVar2, boolean z15) {
        n2.c<androidx.compose.ui.node.g> cVarG = g(s(cVar2), z15);
        int iO = cVarG.getSize() - 1;
        androidx.compose.ui.node.g[] gVarArr = cVarG.content;
        if (iO < gVarArr.length) {
            while (iO >= 0) {
                cVar.d(gVarArr[iO].getNodes().getHead());
                iO--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z d(f3.m.c cVar) {
        if ((s0.a(2) & cVar.getKindSet()) != 0) {
            if (cVar instanceof z) {
                return (z) cVar;
            }
            if (cVar instanceof j) {
                f3.m.c cVarO3 = ((j) cVar).getDelegate();
                while (cVarO3 != 0) {
                    if (cVarO3 instanceof z) {
                        return (z) cVarO3;
                    }
                    cVarO3 = (!(cVarO3 instanceof j) || (s0.a(2) & cVarO3.getKindSet()) == 0) ? cVarO3.getChild() : ((j) cVarO3).getDelegate();
                }
            }
        }
        return null;
    }

    public static final void e(g gVar, long j15) {
        t(gVar).v(j15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [f3.m$c] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final p036e4.h f(g gVar) {
        p0 nodes;
        ?? parent;
        ?? r15;
        int iA = s0.a(8388608) | s0.a(32);
        if (!gVar.getNode().getIsAttached()) {
            d4.a.c("visitAncestors called on an unattached node");
        }
        f3.m.c parent2 = gVar.getNode().getParent();
        androidx.compose.ui.node.g gVarS = s(gVar);
        while (gVarS != null) {
            if ((gVarS.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != 0) {
                    if ((parent.getKindSet() & iA) != 0) {
                        if ((s0.a(8388608) & parent.getKindSet()) != 0) {
                            if (!(parent instanceof p036e4.j)) {
                                if (parent instanceof j) {
                                    f3.m.c cVarO3 = ((j) parent).getDelegate();
                                    parent = 0;
                                    while (cVarO3 != null) {
                                        if (cVarO3 instanceof p036e4.j) {
                                            parent = cVarO3;
                                        }
                                        cVarO3 = cVarO3.getChild();
                                        parent = parent;
                                    }
                                } else {
                                    parent = 0;
                                }
                            }
                            p036e4.j jVar = (p036e4.j) parent;
                            if (jVar != null) {
                                return jVar.p2();
                            }
                            return null;
                        }
                        if ((s0.a(32) & parent.getKindSet()) == 0) {
                            continue;
                        } else {
                            if (parent instanceof f4.h) {
                                r15 = parent;
                            } else if (parent instanceof j) {
                                f3.m.c cVarO4 = ((j) parent).getDelegate();
                                r15 = 0;
                                while (cVarO4 != null) {
                                    if (cVarO4 instanceof f4.h) {
                                        r15 = cVarO4;
                                    }
                                    cVarO4 = cVarO4.getChild();
                                    r15 = r15;
                                }
                            } else {
                                r15 = 0;
                            }
                            f4.h hVar = (f4.h) r15;
                            if (hVar != null && hVar.F0().a(p036e4.i.a())) {
                                return (p036e4.h) hVar.F0().b(p036e4.i.a());
                            }
                        }
                    }
                    parent = parent.getParent();
                }
            }
            parent = parent2;
            gVarS = gVarS.C0();
            parent2 = (gVarS == null || (nodes = gVarS.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    private static final n2.c<androidx.compose.ui.node.g> g(androidx.compose.ui.node.g gVar, boolean z15) {
        return z15 ? gVar.K0() : gVar.L0();
    }

    public static final boolean h(g gVar, int i15) {
        return (gVar.getNode().getAggregateChildKindSet() & i15) != 0;
    }

    public static final void i(g gVar) {
        if (gVar.getNode().getIsAttached()) {
            androidx.compose.ui.node.g.S0(s(gVar), false, 1, null);
        }
    }

    public static final void j(g gVar) {
        if (gVar.getNode().getIsAttached()) {
            s(gVar).V0();
        }
    }

    public static final boolean k(g gVar) {
        return gVar.getNode() == gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m.c l(n2.c<f3.m.c> cVar) {
        if (cVar == null || cVar.getSize() == 0) {
            return null;
        }
        return cVar.v(cVar.getSize() - 1);
    }

    public static final void m(g gVar) {
        s(gVar).F1();
    }

    public static final NodeCoordinator n(g gVar, int i15) {
        NodeCoordinator coordinator = gVar.getNode().getCoordinator();
        return (coordinator.n3() == gVar && t0.i(i15)) ? coordinator.getWrapped() : coordinator;
    }

    public static final c5.d o(g gVar) {
        return s(gVar).getDensity();
    }

    public static final x1 p(g gVar) {
        return t(gVar).getGraphicsContext();
    }

    public static final p036e4.b0 q(g gVar) {
        if (!gVar.getNode().getIsAttached()) {
            d4.a.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        p036e4.b0 b0VarM = n(gVar, s0.a(2)).m();
        if (!b0VarM.c()) {
            d4.a.c("LayoutCoordinates is not attached.");
        }
        return b0VarM;
    }

    public static final c5.t r(g gVar) {
        return s(gVar).getLayoutDirection();
    }

    public static final androidx.compose.ui.node.g s(g gVar) {
        NodeCoordinator coordinator = gVar.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        d4.a.d("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new oq.g();
    }

    public static final Owner t(g gVar) {
        Owner owner = s(gVar).getOwner();
        if (owner != null) {
            return owner;
        }
        d4.a.d("This node does not have an owner.");
        throw new oq.g();
    }

    public static final n4.r u(g gVar) {
        return s(gVar);
    }
}
