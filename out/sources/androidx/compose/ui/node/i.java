package androidx.compose.ui.node;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/i;", "", "Landroidx/compose/ui/node/g;", "root", "Lg4/m;", "relayoutNodes", "", "Landroidx/compose/ui/node/m$a;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/g;Lg4/m;Ljava/util/List;)V", "node", "", "c", "(Landroidx/compose/ui/node/g;)Z", "b", "", "f", "(Landroidx/compose/ui/node/g;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "Loq/i0;", "a", "()V", "Landroidx/compose/ui/node/g;", "Lg4/m;", "Ljava/util/List;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g4.m relayoutNodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<m.a> postponedMeasureRequests;

    public i(g gVar, g4.m mVar, List<m.a> list) {
        this.root = gVar;
        this.relayoutNodes = mVar;
        this.postponedMeasureRequests = list;
    }

    private final boolean b(g gVar) {
        m.a aVar;
        g gVarC0 = gVar.C0();
        m.a aVar2 = null;
        g.e eVarI0 = gVarC0 != null ? gVarC0.i0() : null;
        if (gVar.p() || (gVar.D0() != Integer.MAX_VALUE && gVarC0 != null && gVarC0.p())) {
            if (gVar.p0()) {
                List<m.a> list = this.postponedMeasureRequests;
                int size = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        aVar = null;
                        break;
                    }
                    aVar = list.get(i15);
                    m.a aVar3 = aVar;
                    if (t.c(aVar3.getNode(), gVar) && !aVar3.getIsLookahead()) {
                        break;
                    }
                    i15++;
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (gVar.getIsDeactivated()) {
                return true;
            }
            if (gVar.p0()) {
                return this.relayoutNodes.e(gVar) || gVar.i0() == g.e.LookaheadMeasuring || (gVarC0 != null && gVarC0.p0()) || ((gVarC0 != null && gVarC0.k0()) || eVarI0 == g.e.Measuring);
            }
            if (gVar.h0()) {
                if (!this.relayoutNodes.e(gVar) && gVarC0 != null && !gVarC0.p0() && !gVarC0.h0() && eVarI0 != g.e.Measuring && eVarI0 != g.e.LayingOut) {
                    List<m.a> list2 = this.postponedMeasureRequests;
                    int size2 = list2.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        if (!t.c(list2.get(i16).getNode(), gVar)) {
                        }
                    }
                    if (gVar.i0() != g.e.Measuring && gVar.i0() != g.e.LayingOut) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (t.c(gVar.c1(), Boolean.TRUE)) {
            if (gVar.k0()) {
                List<m.a> list3 = this.postponedMeasureRequests;
                int size3 = list3.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    m.a aVar4 = list3.get(i17);
                    m.a aVar5 = aVar4;
                    if (t.c(aVar5.getNode(), gVar) && aVar5.getIsLookahead()) {
                        aVar2 = aVar4;
                        break;
                    }
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (gVar.k0()) {
                return this.relayoutNodes.f(gVar, true) || (gVarC0 != null && gVarC0.k0()) || eVarI0 == g.e.LookaheadMeasuring || (gVarC0 != null && gVarC0.p0() && t.c(gVar.getLookaheadRoot(), gVar));
            }
            if (gVar.j0() && !this.relayoutNodes.f(gVar, true) && gVarC0 != null && !gVarC0.k0() && !gVarC0.j0() && eVarI0 != g.e.LookaheadMeasuring && eVarI0 != g.e.LookaheadLayingOut && (!gVarC0.h0() || !t.c(gVar.getLookaheadRoot(), gVar))) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(g node) {
        if (!b(node)) {
            return false;
        }
        List<g> listR = node.R();
        int size = listR.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (!c(listR.get(i15))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Tree state:");
        sb5.append('\n');
        e(this, sb5, this.root, 0);
        return sb5.toString();
    }

    private static final void e(i iVar, StringBuilder sb5, g gVar, int i15) {
        String strF = iVar.f(gVar);
        if (strF.length() > 0) {
            for (int i16 = 0; i16 < i15; i16++) {
                sb5.append("..");
            }
            sb5.append(strF);
            sb5.append('\n');
            i15++;
        }
        List<g> listR = gVar.R();
        int size = listR.size();
        for (int i17 = 0; i17 < size; i17++) {
            e(iVar, sb5, listR.get(i17), i15);
        }
    }

    private final String f(g node) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(node);
        StringBuilder sb6 = new StringBuilder();
        sb6.append('[');
        sb6.append(node.i0());
        sb6.append(']');
        sb5.append(sb6.toString());
        if (!node.p()) {
            sb5.append("[!isPlaced]");
        }
        sb5.append("[measuredByParent=" + node.r0() + ']');
        if (!b(node)) {
            sb5.append("[INCONSISTENT]");
        }
        return sb5.toString();
    }

    public final void a() {
        if (c(this.root)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
