package a4;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010'\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"La4/f;", "", "Le4/b0;", "rootCoordinates", "<init>", "(Le4/b0;)V", "Lf3/m$c;", "pointerInputNode", "Loq/i0;", "g", "(Lf3/m$c;)V", "", "pointerId", "Lr0/q0;", "La4/l;", "hitNodes", "f", "(JLr0/q0;)V", "La4/a0;", "", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "b", "(JLjava/util/List;Z)V", "La4/h;", "internalPointerEvent", "isInBounds", "d", "(La4/h;Z)Z", "c", "()V", "e", "a", "Le4/b0;", "Z", "dispatchingEvent", "dispatchCancelAfterDispatchedEvent", "clearNodeCacheAfterDispatchedEvent", "removeSpecificNodesAfterDispatchedEvent", "Lr0/q0;", "nodesToRemove", "La4/m;", "La4/m;", "getRoot$ui", "()La4/m;", "root", "Lr0/m0;", "h", "Lr0/m0;", "hitPointerIdsAndNodesForPruningNonMatches", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p036e4.b0 rootCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchingEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchCancelAfterDispatchedEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean clearNodeCacheAfterDispatchedEvent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean removeSpecificNodesAfterDispatchedEvent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r0.q0<f3.m.c> nodesToRemove = new r0.q0<>(0, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m root = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final r0.m0<r0.q0<Node>> hitPointerIdsAndNodesForPruningNonMatches = new r0.m0<>(10);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<oq.i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m.c f2653c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f3.m.c cVar) {
            super(0);
            this.f2653c = cVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            f.this.g(this.f2653c);
        }
    }

    public f(p036e4.b0 b0Var) {
        this.rootCoordinates = b0Var;
    }

    private final void f(long pointerId, r0.q0<Node> hitNodes) {
        this.root.h(pointerId, hitNodes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(f3.m.c pointerInputNode) {
        if (!this.dispatchingEvent) {
            this.root.i(pointerInputNode);
        } else {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.n(pointerInputNode);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[LOOP:2: B:40:0x00bb->B:50:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7 A[EDGE_INSN: B:59:0x00f7->B:51:0x00f7 BREAK  A[LOOP:2: B:40:0x00bb->B:50:0x00f4], SYNTHETIC] */
    public final void b(long pointerId, List<? extends f3.m.c> pointerInputNodes, boolean prunePointerIdsAndChangesNotInNodesList) {
        Node node;
        m mVar = this.root;
        int size = pointerInputNodes.size();
        boolean z15 = true;
        for (int i15 = 0; i15 < size; i15++) {
            f3.m.c cVar = pointerInputNodes.get(i15);
            if (cVar.getIsAttached()) {
                cVar.f3(new a(cVar));
                if (z15) {
                    n2.c<Node> cVarG = mVar.g();
                    Node[] nodeArr = cVarG.content;
                    int size2 = cVarG.getSize();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size2) {
                            node = null;
                            break;
                        }
                        node = nodeArr[i16];
                        if (fr.t.c(node.getModifierNode(), cVar)) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    Node node2 = node;
                    if (node2 != null) {
                        node2.n();
                        node2.getPointerIds().a(pointerId);
                        if (prunePointerIdsAndChangesNotInNodesList) {
                            r0.m0<r0.q0<Node>> m0Var = this.hitPointerIdsAndNodesForPruningNonMatches;
                            r0.q0<Node> q0VarB = m0Var.b(pointerId);
                            if (q0VarB == null) {
                                q0VarB = new r0.q0<>(0, 1, null);
                                m0Var.q(pointerId, q0VarB);
                            }
                            q0VarB.n(node2);
                        }
                        mVar = node2;
                    } else {
                        z15 = false;
                    }
                }
                Node node3 = new Node(cVar);
                node3.getPointerIds().a(pointerId);
                if (prunePointerIdsAndChangesNotInNodesList) {
                    r0.m0<r0.q0<Node>> m0Var2 = this.hitPointerIdsAndNodesForPruningNonMatches;
                    r0.q0<Node> q0VarB2 = m0Var2.b(pointerId);
                    if (q0VarB2 == null) {
                        q0VarB2 = new r0.q0<>(0, 1, null);
                        m0Var2.q(pointerId, q0VarB2);
                    }
                    q0VarB2.n(node3);
                }
                mVar.g().d(node3);
                mVar = node3;
            }
        }
        if (prunePointerIdsAndChangesNotInNodesList) {
            r0.m0<r0.q0<Node>> m0Var3 = this.hitPointerIdsAndNodesForPruningNonMatches;
            long[] jArr = m0Var3.keys;
            Object[] objArr = m0Var3.values;
            long[] jArr2 = m0Var3.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i17 = 0;
                while (true) {
                    long j15 = jArr2[i17];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i17 != length) {
                            break;
                            break;
                        }
                        i17++;
                    } else {
                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((255 & j15) < 128) {
                                int i25 = (i17 << 3) + i19;
                                f(jArr[i25], (r0.q0) objArr[i25]);
                            }
                            j15 >>= 8;
                        }
                        if (i18 != 8) {
                            break;
                        } else if (i17 != length) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
            }
        }
        this.hitPointerIdsAndNodesForPruningNonMatches.g();
    }

    public final void c() {
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = true;
        } else {
            this.root.c();
        }
    }

    public final boolean d(h internalPointerEvent, boolean isInBounds) {
        if (!this.root.a(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return false;
        }
        boolean z15 = true;
        this.dispatchingEvent = true;
        boolean zF = this.root.f(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds);
        if (!this.root.e(internalPointerEvent) && !zF) {
            z15 = false;
        }
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = false;
            int i15 = this.nodesToRemove.get_size();
            for (int i16 = 0; i16 < i15; i16++) {
                g(this.nodesToRemove.d(i16));
            }
            this.nodesToRemove.u();
        }
        if (this.dispatchCancelAfterDispatchedEvent) {
            this.dispatchCancelAfterDispatchedEvent = false;
            e();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = false;
            c();
        }
        return z15;
    }

    public final void e() {
        if (this.dispatchingEvent) {
            this.dispatchCancelAfterDispatchedEvent = true;
        } else {
            this.root.d();
            c();
        }
    }
}
