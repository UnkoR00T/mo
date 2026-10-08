package g4;

import androidx.compose.ui.node.NodeCoordinator;
import java.util.List;
import p036e4.ModifierInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d*\u0001H\b\u0001\u0018\u00002\u00020\u0001:\u0002EIB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\u0013\u0010:\u001a\b\u0012\u0004\u0012\u00020908¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0000¢\u0006\u0004\b<\u0010\u000eJ\u000f\u0010=\u001a\u00020\fH\u0000¢\u0006\u0004\b=\u0010\u000eJ\u001b\u0010@\u001a\u00020\u00162\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b1\u0010GR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010Q\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR$\u0010W\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b[\u0010Y\u001a\u0004\b\\\u0010\bR\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010]R\u001e\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u0002000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010]R\u001c\u0010c\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u0014\u0010e\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010dR\u0014\u0010h\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lg4/p0;", "", "Landroidx/compose/ui/node/g;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/g;)V", "Lf3/m$c;", "v", "()Lf3/m$c;", "paddedHead", "E", "(Lf3/m$c;)Lf3/m$c;", "Loq/i0;", "C", "()V", "head", "", "offset", "Ln2/c;", "Lf3/m$b;", "before", "after", "", "shouldAttachOnInsert", "Lg4/p0$a;", "j", "(Lf3/m$c;ILn2/c;Ln2/c;Z)Lg4/p0$a;", "start", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "w", "(Lf3/m$c;Landroidx/compose/ui/node/NodeCoordinator;)V", "tail", "B", "(ILn2/c;Ln2/c;Lf3/m$c;Z)V", "node", "h", "x", "element", "parent", "g", "(Lf3/m$b;Lf3/m$c;)Lf3/m$c;", "r", "(Lf3/m$c;Lf3/m$c;)Lf3/m$c;", "prev", "next", "G", "(Lf3/m$b;Lf3/m$b;Lf3/m$c;)V", "Lf3/m;", "m", "F", "(Lf3/m;)V", "y", ip.a.f96138c, "t", "z", "", "Le4/b1;", "n", "()Ljava/util/List;", "u", "A", "Lg4/s0;", "type", "q", "(I)Z", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/node/g;", "()Landroidx/compose/ui/node/g;", "g4/p0$c", "b", "Lg4/p0$c;", "sentinelHead", "Landroidx/compose/ui/node/d;", "c", "Landroidx/compose/ui/node/d;", "l", "()Landroidx/compose/ui/node/d;", "innerCoordinator", "value", "d", "Landroidx/compose/ui/node/NodeCoordinator;", "o", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "e", "Lf3/m$c;", "p", "f", "k", "Ln2/c;", "current", "buffer", "i", "stack", "Lg4/p0$a;", "cachedDiffer", "()I", "aggregateChildKindSet", "s", "()Z", "isUpdating", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.g layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c sentinelHead;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.d innerCoordinator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private NodeCoordinator outerCoordinator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f3.m.c tail;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private f3.m.c head;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private n2.c<f3.m.b> current;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private n2.c<f3.m.b> buffer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final n2.c<f3.m> stack;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private a cachedDiffer;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010#\u001a\u0004\b(\u0010%\"\u0004\b\u0019\u0010'R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Lg4/p0$a;", "Lg4/n;", "Lf3/m$c;", "node", "", "offset", "Ln2/c;", "Lf3/m$b;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(Lg4/p0;Lf3/m$c;ILn2/c;Ln2/c;Z)V", "oldIndex", "newIndex", "c", "(II)Z", "Loq/i0;", "d", "(I)V", "atIndex", "b", "(II)V", "e", "a", "Lf3/m$c;", "getNode", "()Lf3/m$c;", "g", "(Lf3/m$c;)V", "I", "getOffset", "()I", "h", "Ln2/c;", "getBefore", "()Ln2/c;", "f", "(Ln2/c;)V", "getAfter", "Z", "getShouldAttachOnInsert", "()Z", "i", "(Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private f3.m.c node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int offset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private n2.c<f3.m.b> before;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private n2.c<f3.m.b> after;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean shouldAttachOnInsert;

        public a(f3.m.c cVar, int i15, n2.c<f3.m.b> cVar2, n2.c<f3.m.b> cVar3, boolean z15) {
            this.node = cVar;
            this.offset = i15;
            this.before = cVar2;
            this.after = cVar3;
            this.shouldAttachOnInsert = z15;
        }

        public final void a(n2.c<f3.m.b> cVar) {
            this.after = cVar;
        }

        @Override // g4.n
        public void b(int atIndex, int oldIndex) {
            f3.m.c child = this.node.getChild();
            p0.d(p0.this);
            if ((s0.a(2) & child.getKindSet()) != 0) {
                NodeCoordinator coordinator = child.getCoordinator();
                NodeCoordinator nodeCoordinatorQ3 = coordinator.getWrappedBy();
                NodeCoordinator nodeCoordinatorP3 = coordinator.getWrapped();
                if (nodeCoordinatorQ3 != null) {
                    nodeCoordinatorQ3.a4(nodeCoordinatorP3);
                }
                nodeCoordinatorP3.b4(nodeCoordinatorQ3);
                p0.this.w(this.node, nodeCoordinatorP3);
            }
            this.node = p0.this.h(child);
        }

        @Override // g4.n
        public boolean c(int oldIndex, int newIndex) {
            n2.c<f3.m.b> cVar = this.before;
            int i15 = this.offset;
            return q0.c(cVar.content[oldIndex + i15], this.after.content[i15 + newIndex]) != 0;
        }

        @Override // g4.n
        public void d(int newIndex) {
            int i15 = this.offset + newIndex;
            this.node = p0.this.g(this.after.content[i15], this.node);
            p0.d(p0.this);
            if (!this.shouldAttachOnInsert) {
                this.node.g3(true);
                return;
            }
            NodeCoordinator coordinator = this.node.getChild().getCoordinator();
            z zVarD = h.d(this.node);
            if (zVarD != null) {
                androidx.compose.ui.node.f fVar = new androidx.compose.ui.node.f(p0.this.getLayoutNode(), zVarD);
                this.node.m3(fVar);
                p0.this.w(this.node, fVar);
                fVar.b4(coordinator.getWrappedBy());
                fVar.a4(coordinator);
                coordinator.b4(fVar);
            } else {
                this.node.m3(coordinator);
            }
            this.node.U2();
            this.node.a3();
            t0.a(this.node);
        }

        @Override // g4.n
        public void e(int oldIndex, int newIndex) {
            this.node = this.node.getChild();
            n2.c<f3.m.b> cVar = this.before;
            int i15 = this.offset;
            f3.m.b bVar = cVar.content[oldIndex + i15];
            f3.m.b bVar2 = this.after.content[i15 + newIndex];
            if (fr.t.c(bVar, bVar2)) {
                p0.d(p0.this);
            } else {
                p0.this.G(bVar, bVar2, this.node);
                p0.d(p0.this);
            }
        }

        public final void f(n2.c<f3.m.b> cVar) {
            this.before = cVar;
        }

        public final void g(f3.m.c cVar) {
            this.node = cVar;
        }

        public final void h(int i15) {
            this.offset = i15;
        }

        public final void i(boolean z15) {
            this.shouldAttachOnInsert = z15;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lg4/p0$b;", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"g4/p0$c", "Lf3/m$c;", "", "toString", "()Ljava/lang/String;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends f3.m.c {
        c() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    public p0(androidx.compose.ui.node.g gVar) {
        this.layoutNode = gVar;
        c cVar = new c();
        cVar.c3(-1);
        this.sentinelHead = cVar;
        androidx.compose.ui.node.d dVar = new androidx.compose.ui.node.d(gVar);
        this.innerCoordinator = dVar;
        this.outerCoordinator = dVar;
        m1 m1VarP4 = dVar.n3();
        this.tail = m1VarP4;
        this.head = m1VarP4;
        this.stack = new n2.c<>(new f3.m[16], 0);
    }

    private final void B(int offset, n2.c<f3.m.b> before, n2.c<f3.m.b> after, f3.m.c tail, boolean shouldAttachOnInsert) {
        o0.e(before.getSize() - offset, after.getSize() - offset, j(tail, offset, before, after, shouldAttachOnInsert));
        C();
    }

    private final void C() {
        int kindSet = 0;
        for (f3.m.c parent = this.tail.getParent(); parent != null && parent != this.sentinelHead; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.c3(kindSet);
        }
    }

    private final f3.m.c E(f3.m.c paddedHead) {
        if (!(paddedHead == this.sentinelHead)) {
            d4.a.c("trimChain called on already trimmed chain");
        }
        f3.m.c child = this.sentinelHead.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.j3(null);
        this.sentinelHead.e3(null);
        this.sentinelHead.c3(-1);
        this.sentinelHead.m3(null);
        if (!(child != this.sentinelHead)) {
            d4.a.c("trimChain did not update the head");
        }
        return child;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(f3.m.b prev, f3.m.b next, f3.m.c node) {
        if ((prev instanceof l0) && (next instanceof l0)) {
            q0.e((l0) next, node);
            if (node.getIsAttached()) {
                t0.e(node);
                return;
            } else {
                node.k3(true);
                return;
            }
        }
        if (!(node instanceof androidx.compose.ui.node.a)) {
            d4.a.c("Unknown Modifier.Node type");
            return;
        }
        ((androidx.compose.ui.node.a) node).s3(next);
        if (node.getIsAttached()) {
            t0.e(node);
        } else {
            node.k3(true);
        }
    }

    public static final /* synthetic */ b d(p0 p0Var) {
        p0Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f3.m.c g(f3.m.b element, f3.m.c parent) {
        f3.m.c aVar;
        if (element instanceof l0) {
            aVar = ((l0) element).create();
            aVar.h3(t0.h(aVar));
        } else {
            aVar = new androidx.compose.ui.node.a(element);
        }
        if (aVar.getIsAttached()) {
            d4.a.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        aVar.g3(true);
        return r(aVar, parent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f3.m.c h(f3.m.c node) {
        if (node.getIsAttached()) {
            t0.d(node);
            node.b3();
            node.V2();
        }
        return x(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.head.getAggregateChildKindSet();
    }

    private final a j(f3.m.c head, int offset, n2.c<f3.m.b> before, n2.c<f3.m.b> after, boolean shouldAttachOnInsert) {
        a aVar = this.cachedDiffer;
        if (aVar == null) {
            a aVar2 = new a(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = aVar2;
            return aVar2;
        }
        aVar.g(head);
        aVar.h(offset);
        aVar.f(before);
        aVar.a(after);
        aVar.i(shouldAttachOnInsert);
        return aVar;
    }

    private final f3.m.c r(f3.m.c node, f3.m.c parent) {
        f3.m.c child = parent.getChild();
        if (child != null) {
            child.j3(node);
            node.e3(child);
        }
        parent.e3(node);
        node.j3(parent);
        return node;
    }

    private final f3.m.c v() {
        if (!(this.head != this.sentinelHead)) {
            d4.a.c("padChain called on already padded chain");
        }
        f3.m.c cVar = this.head;
        cVar.j3(this.sentinelHead);
        this.sentinelHead.e3(cVar);
        return this.sentinelHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(f3.m.c start, NodeCoordinator coordinator) {
        for (f3.m.c parent = start.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.sentinelHead) {
                androidx.compose.ui.node.g gVarC0 = this.layoutNode.C0();
                coordinator.b4(gVarC0 != null ? gVarC0.b0() : null);
                this.outerCoordinator = coordinator;
                return;
            } else {
                if ((s0.a(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.m3(coordinator);
            }
        }
    }

    private final f3.m.c x(f3.m.c node) {
        f3.m.c child = node.getChild();
        f3.m.c parent = node.getParent();
        if (child != null) {
            child.j3(parent);
            node.e3(null);
        }
        if (parent != null) {
            parent.e3(child);
            node.j3(null);
        }
        return parent;
    }

    public final void A() {
        for (f3.m.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.b3();
            }
        }
    }

    public final void D() {
        NodeCoordinator fVar;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (f3.m.c parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            z zVarD = h.d(parent);
            if (zVarD != null) {
                if (parent.getCoordinator() != null) {
                    fVar = (androidx.compose.ui.node.f) parent.getCoordinator();
                    z zVarQ4 = fVar.getLayoutModifierNode();
                    fVar.u4(zVarD);
                    if (zVarQ4 != parent) {
                        fVar.F3();
                    }
                } else {
                    fVar = new androidx.compose.ui.node.f(this.layoutNode, zVarD);
                    parent.m3(fVar);
                }
                nodeCoordinator.b4(fVar);
                fVar.a4(nodeCoordinator);
                nodeCoordinator = fVar;
            } else {
                parent.m3(nodeCoordinator);
            }
        }
        androidx.compose.ui.node.g gVarC0 = this.layoutNode.C0();
        nodeCoordinator.b4(gVarC0 != null ? gVarC0.b0() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    public final void F(f3.m m15) {
        p0 p0Var;
        f3.m.c cVarV = v();
        n2.c<f3.m.b> cVar = this.current;
        int i15 = 0;
        int iO = cVar != null ? cVar.getSize() : 0;
        n2.c<f3.m.b> cVar2 = this.buffer;
        if (cVar2 == null) {
            cVar2 = new n2.c<>(new f3.m.b[16], 0);
        }
        n2.c<f3.m.b> cVarD = q0.d(m15, cVar2, this.stack);
        n2.c<f3.m.b> cVar3 = null;
        if (cVarD.getSize() == iO) {
            f3.m.c child = cVarV.getChild();
            int i16 = 0;
            while (child != null && i16 < iO) {
                if (cVar == null) {
                    d4.a.d("expected prior modifier list to be non-empty");
                    throw new oq.g();
                }
                f3.m.b bVar = cVar.content[i16];
                f3.m.b bVar2 = cVarD.content[i16];
                int iC = q0.c(bVar, bVar2);
                if (iC == 0) {
                    child = child.getParent();
                    break;
                }
                if (iC == 1) {
                    G(bVar, bVar2, child);
                }
                child = child.getChild();
                i16++;
            }
            f3.m.c cVar4 = child;
            if (i16 >= iO) {
                p0Var = this;
            } else {
                if (cVar == null) {
                    d4.a.d("expected prior modifier list to be non-empty");
                    throw new oq.g();
                }
                if (cVar4 == null) {
                    d4.a.d("structuralUpdate requires a non-null tail");
                    throw new oq.g();
                }
                p0Var = this;
                p0Var.B(i16, cVar, cVarD, cVar4, !this.layoutNode.N());
                i15 = 1;
            }
        } else {
            p0Var = this;
            if (p0Var.layoutNode.N() && iO == 0) {
                f3.m.c cVarG = cVarV;
                while (i15 < cVarD.getSize()) {
                    cVarG = g(cVarD.content[i15], cVarG);
                    i15++;
                }
                C();
            } else if (cVarD.getSize() != 0) {
                if (cVar == null) {
                    cVar = new n2.c<>(new f3.m.b[16], 0);
                }
                n2.c<f3.m.b> cVar5 = cVar;
                p0Var.B(0, cVar5, cVarD, cVarV, !p0Var.layoutNode.N());
                p0Var = p0Var;
                cVar = cVar5;
            } else {
                if (cVar == null) {
                    d4.a.d("expected prior modifier list to be non-empty");
                    throw new oq.g();
                }
                f3.m.c child2 = cVarV.getChild();
                for (int i17 = 0; child2 != null && i17 < cVar.getSize(); i17++) {
                    child2 = h(child2).getChild();
                }
                androidx.compose.ui.node.d dVar = p0Var.innerCoordinator;
                androidx.compose.ui.node.g gVarC0 = p0Var.layoutNode.C0();
                dVar.b4(gVarC0 != null ? gVarC0.b0() : null);
                p0Var.outerCoordinator = p0Var.innerCoordinator;
            }
            i15 = 1;
        }
        p0Var.current = cVarD;
        if (cVar != null) {
            cVar.j();
            cVar3 = cVar;
        }
        p0Var.buffer = cVar3;
        p0Var.head = E(cVarV);
        if (i15 != 0) {
            D();
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final f3.m.c getHead() {
        return this.head;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final androidx.compose.ui.node.d getInnerCoordinator() {
        return this.innerCoordinator;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final androidx.compose.ui.node.g getLayoutNode() {
        return this.layoutNode;
    }

    public final List<ModifierInfo> n() {
        n2.c<f3.m.b> cVar = this.current;
        if (cVar == null) {
            return pq.v.n();
        }
        int i15 = 0;
        n2.c cVar2 = new n2.c(new ModifierInfo[cVar.getSize()], 0);
        f3.m.c head = getHead();
        while (head != null && head != getTail()) {
            NodeCoordinator coordinator = head.getCoordinator();
            if (coordinator == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            a1 a1VarI3 = coordinator.getLayer();
            a1 a1VarI4 = this.innerCoordinator.getLayer();
            f3.m.c child = head.getChild();
            if (child != this.tail || head.getCoordinator() == child.getCoordinator()) {
                a1VarI4 = null;
            }
            if (a1VarI3 == null) {
                a1VarI3 = a1VarI4;
            }
            cVar2.d(new ModifierInfo(cVar.content[i15], coordinator, a1VarI3));
            head = head.getChild();
            i15++;
        }
        return cVar2.i();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final f3.m.c getTail() {
        return this.tail;
    }

    public final boolean q(int type) {
        return (type & i()) != 0;
    }

    public final boolean s() {
        return this.sentinelHead.getChild() != null;
    }

    public final void t() {
        for (f3.m.c head = getHead(); head != null; head = head.getChild()) {
            head.U2();
        }
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[");
        if (this.head == this.tail) {
            sb5.append("]");
        } else {
            for (f3.m.c head = getHead(); head != null && head != getTail(); head = head.getChild()) {
                sb5.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb5.append("]");
                    break;
                }
                sb5.append(",");
            }
        }
        return sb5.toString();
    }

    public final void u() {
        for (f3.m.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.V2();
            }
        }
    }

    public final void y() {
        for (f3.m.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.Z2();
            }
        }
        A();
        u();
    }

    public final void z() {
        for (f3.m.c head = getHead(); head != null; head = head.getChild()) {
            head.a3();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                t0.a(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                t0.e(head);
            }
            head.g3(false);
            head.k3(false);
        }
    }
}
