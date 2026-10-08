package n4;

import android.os.Trace;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0003\"\u0018\u0010\u0017\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0003\"\u0018\u0010\u0019\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0003¨\u0006\u001a"}, d2 = {"Ln4/w;", "", "h", "(Ln4/w;)Z", "Ln4/a0;", "", "customRootNodeId", "Lkotlin/Function1;", "shouldIgnoreNode", "Lr0/q;", "Ln4/y;", "a", "(Ln4/a0;ILer/l;)Lr0/q;", "f", "(Ln4/w;)Ln4/w;", "Lm3/g;", "Lm3/g;", "DefaultFakeNodeBounds", "g", "isHidden$annotations", "(Ln4/w;)V", "isHidden", "i", "isPartiallyOffscreenInScrollParent", "j", "isScrollNode", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m3.g f131172a = new m3.g(0.0f, 0.0f, 10.0f, 10.0f);

    public static final r0.q<y> a(a0 a0Var, int i15, er.l<? super w, Boolean> lVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            w wVarD = a0Var.d();
            if (wVarD.getLayoutNode().p() && wVarD.getLayoutNode().c()) {
                m3.g gVarK = wVarD.k();
                r0.j0 j0Var = new r0.j0(48);
                j0 j0VarA = k0.a();
                j0VarA.b(c5.q.b(gVarK));
                d(wVarD, j0Var, lVar, i15, wVarD, k0.a(), j0VarA);
                return j0Var;
            }
            return r0.r.a();
        } finally {
            Trace.endSection();
        }
    }

    private static final void b(r0.j0<y> j0Var, er.l<? super w, Boolean> lVar, w wVar, int i15, w wVar2, j0 j0Var2, j0 j0Var3) {
        if (!wVar2.getLayoutNode().p() || !wVar2.getLayoutNode().c() || j0Var3.isEmpty()) {
            if (wVar2.A()) {
                c(j0Var, wVar, i15, wVar2);
                return;
            }
            return;
        }
        m3.g gVarX = wVar2.x();
        if (gVarX.r()) {
            gVarX = wVar2.y();
        }
        c5.p pVarB = c5.q.b(gVarX);
        j0Var2.b(pVarB);
        if (j0Var2.a(j0Var3)) {
            j0Var.r(e(wVar, i15, wVar2), new y(wVar2, j0Var2.getBounds()));
            List<w> listV = wVar2.v();
            for (int size = listV.size() - 1; -1 < size; size--) {
                if (!lVar.b(listV.get(size)).booleanValue()) {
                    b(j0Var, lVar, wVar, i15, listV.get(size), j0Var2, j0Var3);
                }
            }
            if (h(wVar2)) {
                j0Var3.c(pVarB);
            }
        }
    }

    private static final void c(r0.j0<y> j0Var, w wVar, int i15, w wVar2) {
        p036e4.i0 i0VarR;
        w wVarT = wVar2.t();
        j0Var.r(e(wVar, i15, wVar2), new y(wVar2, c5.q.b((wVarT == null || (i0VarR = wVarT.r()) == null || !i0VarR.p()) ? f131172a : wVarT.k())));
    }

    private static final void d(w wVar, r0.j0<y> j0Var, er.l<? super w, Boolean> lVar, int i15, w wVar2, j0 j0Var2, j0 j0Var3) {
        int i16 = i15;
        boolean z15 = (wVar2.getLayoutNode().p() && wVar2.getLayoutNode().c()) ? false : true;
        if (!j0Var3.isEmpty() || wVar2.getId() == wVar.getId()) {
            if (!z15 || wVar2.A()) {
                c5.p pVarB = c5.q.b(wVar2.x());
                j0 j0Var4 = j0Var2;
                j0Var4.b(pVarB);
                int iE = e(wVar, i15, wVar2);
                if (!j0Var2.a(j0Var3)) {
                    if (wVar2.A()) {
                        c(j0Var, wVar, i15, wVar2);
                        return;
                    } else {
                        if (iE == i16) {
                            j0Var.r(iE, new y(wVar2, j0Var2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                j0Var.r(iE, new y(wVar2, j0Var4.getBounds()));
                List<w> listV = wVar2.v();
                if (f3.h.isAccessibilityShouldIncludeOffscreenChildrenEnabled && wVar2.getUnmergedConfig().getIsMergingSemanticsOfDescendants() && i(wVar2)) {
                    j0 j0VarA = k0.a();
                    j0VarA.b(c5.q.b(wVar2.y()));
                    int size = listV.size() - 1;
                    while (-1 < size) {
                        if (!lVar.b(listV.get(size)).booleanValue()) {
                            b(j0Var, lVar, wVar, i16, listV.get(size), k0.a(), j0VarA);
                        }
                        size--;
                        i16 = i15;
                    }
                } else {
                    int size2 = listV.size() - 1;
                    while (-1 < size2) {
                        if (!lVar.b(listV.get(size2)).booleanValue()) {
                            d(wVar, j0Var, lVar, i15, listV.get(size2), j0Var4, j0Var3);
                        }
                        size2--;
                        j0Var4 = j0Var2;
                    }
                }
                if (h(wVar2)) {
                    j0Var3.c(pVarB);
                }
            }
        }
    }

    private static final int e(w wVar, int i15, w wVar2) {
        return wVar2.getId() == wVar.getId() ? i15 : wVar2.getId();
    }

    private static final w f(w wVar) {
        for (w wVarT = wVar.t(); wVarT != null; wVarT = wVarT.t()) {
            if (j(wVarT)) {
                return wVarT;
            }
        }
        return null;
    }

    public static final boolean g(w wVar) {
        if (wVar.C()) {
            return true;
        }
        SemanticsConfiguration unmergedConfig = wVar.getUnmergedConfig();
        c0 c0Var = c0.f131174a;
        return unmergedConfig.g(c0Var.l()) || wVar.getUnmergedConfig().g(c0Var.r());
    }

    public static final boolean h(w wVar) {
        if (g(wVar)) {
            return false;
        }
        return wVar.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || wVar.getUnmergedConfig().h();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    private static final boolean i(w wVar) {
        p036e4.b0 b0VarM;
        w wVarF = f(wVar);
        if (wVarF != null) {
            NodeCoordinator nodeCoordinatorF = wVar.f();
            p036e4.b0 b0VarM2 = null;
            if (nodeCoordinatorF == null) {
                b0VarM = null;
            } else {
                if (!nodeCoordinatorF.c()) {
                    nodeCoordinatorF = null;
                }
                if (nodeCoordinatorF != null) {
                    b0VarM = nodeCoordinatorF.m();
                } else {
                    b0VarM = null;
                }
            }
            NodeCoordinator nodeCoordinatorF2 = wVarF.f();
            if (nodeCoordinatorF2 != null) {
                if (!nodeCoordinatorF2.c()) {
                    nodeCoordinatorF2 = null;
                }
                if (nodeCoordinatorF2 != null) {
                    b0VarM2 = nodeCoordinatorF2.m();
                }
            }
            if (b0VarM != null && b0VarM2 != null) {
                m3.g gVarY = b0VarM2.Y(b0VarM, false);
                return !fr.t.c(gVarY, gVarY.q(m3.h.c(m3.e.INSTANCE.c(), c5.s.e(b0VarM2.b()))));
            }
        }
        return false;
    }

    private static final boolean j(w wVar) {
        SemanticsConfiguration unmergedConfig = wVar.getUnmergedConfig();
        c0 c0Var = c0.f131174a;
        return unmergedConfig.g(c0Var.S()) || wVar.getUnmergedConfig().g(c0Var.m());
    }
}
