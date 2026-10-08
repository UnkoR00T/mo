package p036e4;

import androidx.compose.ui.node.g;
import androidx.compose.ui.node.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/k;", "a", "(Landroidx/compose/ui/node/k;)Landroidx/compose/ui/node/k;", "rootLookaheadDelegate", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {
    public static final k a(k kVar) {
        g layoutNode = kVar.getLayoutNode();
        while (true) {
            g gVarC0 = layoutNode.C0();
            if ((gVarC0 != null ? gVarC0.getLookaheadRoot() : null) == null) {
                return layoutNode.y0().getLookaheadDelegate();
            }
            g gVarC1 = layoutNode.C0();
            layoutNode = (gVarC1 != null ? gVarC1.getLookaheadRoot() : null).getIsVirtualLookaheadRoot() ? layoutNode.C0() : layoutNode.C0().getLookaheadRoot();
        }
    }
}
