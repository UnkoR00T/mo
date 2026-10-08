package a4;

import androidx.compose.ui.node.NodeCoordinator;
import g4.f1;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a4.l, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001d\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00109¨\u0006>"}, d2 = {"La4/l;", "La4/m;", "Lf3/m$c;", "modifierNode", "<init>", "(Lf3/m$c;)V", "La4/o;", "oldEvent", "newEvent", "", "m", "(La4/o;La4/o;)Z", "Loq/i0;", "j", "()V", "", "pointerIdValue", "Lr0/q0;", "hitNodes", "h", "(JLr0/q0;)V", "Lr0/a0;", "La4/b0;", "changes", "Le4/b0;", "parentCoordinates", "La4/h;", "internalPointerEvent", "isInBounds", "f", "(Lr0/a0;Le4/b0;La4/h;Z)Z", "e", "(La4/h;)Z", "a", "d", "n", "b", "(La4/h;)V", "", "toString", "()Ljava/lang/String;", "c", "Lf3/m$c;", "k", "()Lf3/m$c;", "Lb4/e;", "Lb4/e;", "l", "()Lb4/e;", "pointerIds", "Lr0/a0;", "relevantChanges", "Le4/b0;", "coordinates", "g", "La4/o;", "pointerEvent", "Z", "wasIn", "i", "isIn", "hasExited", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Node extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f3.m.c modifierNode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p036e4.b0 coordinates;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private o pointerEvent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean wasIn;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b4.e pointerIds = new b4.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r0.a0<PointerInputChange> relevantChanges = new r0.a0<>(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isIn = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean hasExited = true;

    public Node(f3.m.c cVar) {
        this.modifierNode = cVar;
    }

    private final void j() {
        this.relevantChanges.b();
        this.coordinates = null;
    }

    private final boolean m(o oldEvent, o newEvent) {
        if (oldEvent == null || oldEvent.c().size() != newEvent.c().size()) {
            return true;
        }
        int size = newEvent.c().size();
        for (int i15 = 0; i15 < size; i15++) {
            if (!m3.e.j(oldEvent.c().get(i15).getPosition(), newEvent.c().get(i15).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x027c  */
    /* JADX WARN: Code duplicated, block: B:107:0x028a  */
    /* JADX WARN: Code duplicated, block: B:98:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // a4.m
    public boolean a(r0.a0<a4.PointerInputChange> r49, p036e4.b0 r50, a4.h r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.Node.a(r0.a0, e4.b0, a4.h, boolean):boolean");
    }

    @Override // a4.m
    public void b(h internalPointerEvent) {
        super.b(internalPointerEvent);
        o oVar = this.pointerEvent;
        if (oVar == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> listC = oVar.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            PointerInputChange pointerInputChange = listC.get(i15);
            boolean pressed = pointerInputChange.getPressed();
            boolean zA = internalPointerEvent.a(pointerInputChange.getId());
            boolean z15 = this.isIn;
            if ((!pressed && !zA) || (!pressed && !z15)) {
                this.pointerIds.g(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = s.o(oVar.getType(), s.INSTANCE.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // a4.m
    public void d() {
        n2.c<Node> cVarG = g();
        Node[] nodeArr = cVarG.content;
        int size = cVarG.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            nodeArr[i15].d();
        }
        f3.m.c cVarL = this.modifierNode;
        int iA = g4.s0.a(16);
        n2.c cVar = null;
        while (cVarL != 0) {
            if (cVarL instanceof f1) {
                ((f1) cVarL).Z1();
            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                f3.m.c delegate = ((g4.j) cVarL).getDelegate();
                int i16 = 0;
                cVarL = cVarL;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i16++;
                        if (i16 == 1) {
                            cVarL = delegate;
                        } else {
                            if (cVar == null) {
                                cVar = new n2.c(new f3.m.c[16], 0);
                            }
                            if (cVarL != 0) {
                                cVar.d(cVarL);
                                cVarL = 0;
                            }
                            cVar.d(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    cVarL = cVarL;
                }
                if (i16 == 1) {
                }
            }
            cVarL = g4.h.l(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a4.m
    public boolean e(h internalPointerEvent) {
        Object[] objArr;
        androidx.compose.ui.node.g layoutNode;
        boolean z15 = false;
        z15 = false;
        z15 = false;
        if (!this.relevantChanges.j() && this.modifierNode.getIsAttached()) {
            NodeCoordinator coordinator = this.modifierNode.getCoordinator();
            if ((coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null) ? false : layoutNode.p()) {
                o oVar = this.pointerEvent;
                long jB = this.coordinates.b();
                f3.m.c cVarL = this.modifierNode;
                int iA = g4.s0.a(16);
                n2.c cVar = null;
                while (cVarL != null) {
                    if (cVarL instanceof f1) {
                        ((f1) cVarL).Y(oVar, q.Final, jB);
                        objArr = false;
                    } else {
                        objArr = true;
                    }
                    if (objArr != false) {
                        if (((cVarL.getKindSet() & iA) != 0) != false && (cVarL instanceof g4.j)) {
                            int i15 = 0;
                            for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if (((delegate.getKindSet() & iA) != 0) != false) {
                                    i15++;
                                    if (i15 == 1) {
                                        cVarL = delegate;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new n2.c(new f3.m.c[16], 0);
                                        }
                                        if (cVarL != null) {
                                            cVar.d(cVarL);
                                            cVarL = null;
                                        }
                                        cVar.d(delegate);
                                    }
                                }
                            }
                            if (i15 == 1) {
                            }
                        }
                    }
                    cVarL = g4.h.l(cVar);
                }
                if (this.modifierNode.getIsAttached()) {
                    n2.c<Node> cVarG = g();
                    Node[] nodeArr = cVarG.content;
                    int size = cVarG.getSize();
                    for (int i16 = 0; i16 < size; i16++) {
                        nodeArr[i16].e(internalPointerEvent);
                    }
                }
                z15 = true;
            }
        }
        b(internalPointerEvent);
        j();
        return z15;
    }

    @Override // a4.m
    public boolean f(r0.a0<PointerInputChange> changes, p036e4.b0 parentCoordinates, h internalPointerEvent, boolean isInBounds) {
        boolean z15;
        boolean z16;
        androidx.compose.ui.node.g layoutNode;
        if (this.relevantChanges.j() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        NodeCoordinator coordinator = this.modifierNode.getCoordinator();
        if (!((coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null) ? false : layoutNode.p())) {
            return false;
        }
        o oVar = this.pointerEvent;
        long jB = this.coordinates.b();
        f3.m.c cVarL = this.modifierNode;
        int iA = g4.s0.a(16);
        n2.c cVar = null;
        while (cVarL != null) {
            if (cVarL instanceof f1) {
                ((f1) cVarL).Y(oVar, q.Initial, jB);
                z16 = false;
            } else {
                z16 = true;
            }
            if (z16) {
                if (((cVarL.getKindSet() & iA) != 0) && (cVarL instanceof g4.j)) {
                    int i15 = 0;
                    for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                        if ((delegate.getKindSet() & iA) != 0) {
                            i15++;
                            if (i15 == 1) {
                                cVarL = delegate;
                            } else {
                                if (cVar == null) {
                                    cVar = new n2.c(new f3.m.c[16], 0);
                                }
                                if (cVarL != null) {
                                    cVar.d(cVarL);
                                    cVarL = null;
                                }
                                cVar.d(delegate);
                            }
                        }
                    }
                    if (i15 == 1) {
                    }
                }
            }
            cVarL = g4.h.l(cVar);
        }
        if (this.modifierNode.getIsAttached()) {
            n2.c<Node> cVarG = g();
            Node[] nodeArr = cVarG.content;
            int size = cVarG.getSize();
            for (int i16 = 0; i16 < size; i16++) {
                nodeArr[i16].f(this.relevantChanges, this.coordinates, internalPointerEvent, isInBounds);
            }
        }
        if (this.modifierNode.getIsAttached()) {
            f3.m.c cVarL2 = this.modifierNode;
            int iA2 = g4.s0.a(16);
            n2.c cVar2 = null;
            while (cVarL2 != null) {
                if (cVarL2 instanceof f1) {
                    ((f1) cVarL2).Y(oVar, q.Main, jB);
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15) {
                    if (((cVarL2.getKindSet() & iA2) != 0) && (cVarL2 instanceof g4.j)) {
                        int i17 = 0;
                        for (f3.m.c delegate2 = ((g4.j) cVarL2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                            if ((delegate2.getKindSet() & iA2) != 0) {
                                i17++;
                                if (i17 == 1) {
                                    cVarL2 = delegate2;
                                } else {
                                    if (cVar2 == null) {
                                        cVar2 = new n2.c(new f3.m.c[16], 0);
                                    }
                                    if (cVarL2 != null) {
                                        cVar2.d(cVarL2);
                                        cVarL2 = null;
                                    }
                                    cVar2.d(delegate2);
                                }
                            }
                        }
                        if (i17 == 1) {
                        }
                    }
                }
                cVarL2 = g4.h.l(cVar2);
            }
        }
        return true;
    }

    @Override // a4.m
    public void h(long pointerIdValue, r0.q0<Node> hitNodes) {
        if (this.pointerIds.c(pointerIdValue) && !hitNodes.a(this)) {
            this.pointerIds.g(pointerIdValue);
            this.relevantChanges.o(pointerIdValue);
        }
        n2.c<Node> cVarG = g();
        Node[] nodeArr = cVarG.content;
        int size = cVarG.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            nodeArr[i15].h(pointerIdValue, hitNodes);
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final f3.m.c getModifierNode() {
        return this.modifierNode;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final b4.e getPointerIds() {
        return this.pointerIds;
    }

    public final void n() {
        this.isIn = true;
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + g() + ", pointerIds=" + this.pointerIds + ')';
    }
}
