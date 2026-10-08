package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "", "a", "(Landroidx/compose/ui/node/g;)Z", "isOutMostLookaheadRoot", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {
    public static final boolean a(androidx.compose.ui.node.g gVar) {
        if (gVar.getLookaheadRoot() == null) {
            return false;
        }
        androidx.compose.ui.node.g gVarC0 = gVar.C0();
        return (gVarC0 != null ? gVarC0.getLookaheadRoot() : null) == null || gVar.getLayoutDelegate().getDetachedFromParentLookaheadPass();
    }
}
