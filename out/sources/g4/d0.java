package g4;

import androidx.compose.ui.node.NodeCoordinator;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lg4/d0;", "Lg4/a;", "Lg4/b;", "alignmentLinesOwner", "<init>", "(Lg4/b;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "Le4/a;", "alignmentLine", "", "i", "(Landroidx/compose/ui/node/NodeCoordinator;Le4/a;)I", "Lm3/e;", "position", "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "", "e", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 extends a {
    public d0(b bVar) {
        super(bVar, null);
    }

    @Override // g4.a
    protected long d(NodeCoordinator nodeCoordinator, long j15) {
        return NodeCoordinator.g4(nodeCoordinator, j15, false, 2, null);
    }

    @Override // g4.a
    protected Map<p036e4.a, Integer> e(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.J1().i();
    }

    @Override // g4.a
    protected int i(NodeCoordinator nodeCoordinator, p036e4.a aVar) {
        return nodeCoordinator.I(aVar);
    }
}
