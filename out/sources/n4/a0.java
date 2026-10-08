package n4;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import p071kotlin.Metadata;
import r0.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0011\u0010\"\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010!R\u0014\u0010$\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010#¨\u0006%"}, d2 = {"Ln4/a0;", "", "Landroidx/compose/ui/node/g;", "rootNode", "Ln4/h;", "outerSemanticsNode", "Lr0/q;", "nodes", "<init>", "(Landroidx/compose/ui/node/g;Ln4/h;Lr0/q;)V", "", "semanticsId", "Ln4/r;", "a", "(I)Ln4/r;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "Loq/i0;", "e", "(Ln4/r;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Landroidx/compose/ui/node/g;", "b", "Ln4/h;", "c", "Lr0/q;", "Lr0/q0;", "Ln4/t;", "d", "Lr0/q0;", "()Lr0/q0;", "listeners", "Ln4/w;", "()Ln4/w;", "unmergedRootSemanticsNode", "()Ln4/r;", "rootInfo", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.g rootNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h outerSemanticsNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r0.q<androidx.compose.ui.node.g> nodes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q0<t> listeners = new q0<>(2);

    public a0(androidx.compose.ui.node.g gVar, h hVar, r0.q<androidx.compose.ui.node.g> qVar) {
        this.rootNode = gVar;
        this.outerSemanticsNode = hVar;
        this.nodes = qVar;
    }

    public final r a(int semanticsId) {
        return this.nodes.b(semanticsId);
    }

    public final q0<t> b() {
        return this.listeners;
    }

    public final r c() {
        return this.rootNode;
    }

    public final w d() {
        return new w(this.outerSemanticsNode, false, this.rootNode, new SemanticsConfiguration());
    }

    public final void e(r semanticsInfo, SemanticsConfiguration previousSemanticsConfiguration) {
        q0<t> q0Var = this.listeners;
        Object[] objArr = q0Var.content;
        int i15 = q0Var._size;
        for (int i16 = 0; i16 < i15; i16++) {
            ((t) objArr[i16]).a(semanticsInfo, previousSemanticsConfiguration);
        }
    }
}
