package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lg4/y0;", "", "<init>", "()V", "Landroidx/compose/ui/node/g;", "layoutNode", "Loq/i0;", "b", "(Landroidx/compose/ui/node/g;)V", "", "c", "()Z", "node", "d", "f", "rootNode", "e", "a", "Ln2/c;", "Ln2/c;", "layoutNodes", "", "[Landroidx/compose/ui/node/g;", "cachedNodes", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f70424d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n2.c<androidx.compose.ui.node.g> layoutNodes = new n2.c<>(new androidx.compose.ui.node.g[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.node.g[] cachedNodes;

    private final void b(androidx.compose.ui.node.g layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            layoutNode.I();
            layoutNode.b2(false);
            n2.c<androidx.compose.ui.node.g> cVarL0 = layoutNode.L0();
            androidx.compose.ui.node.g[] gVarArr = cVarL0.content;
            int size = cVarL0.getSize();
            for (int i15 = 0; i15 < size; i15++) {
                b(gVarArr[i15]);
            }
        }
    }

    public final void a() {
        this.layoutNodes.B(Companion.C1597a.f70427a);
        int size = this.layoutNodes.getSize();
        androidx.compose.ui.node.g[] gVarArr = this.cachedNodes;
        if (gVarArr == null || gVarArr.length < size) {
            gVarArr = new androidx.compose.ui.node.g[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i15 = 0; i15 < size; i15++) {
            gVarArr[i15] = this.layoutNodes.content[i15];
        }
        this.layoutNodes.j();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = gVarArr;
                return;
            }
            androidx.compose.ui.node.g gVar = gVarArr[size];
            if (gVar.getNeedsOnGloballyPositionedDispatch()) {
                b(gVar);
            }
            gVarArr[size] = null;
        }
    }

    public final boolean c() {
        return this.layoutNodes.getSize() != 0;
    }

    public final void d(androidx.compose.ui.node.g node) {
        if (node.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.d(node);
            node.b2(true);
        }
    }

    public final void e(androidx.compose.ui.node.g rootNode) {
        if (rootNode.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.j();
            this.layoutNodes.d(rootNode);
            rootNode.b2(true);
        }
    }

    public final void f(androidx.compose.ui.node.g node) {
        this.layoutNodes.t(node);
    }
}
