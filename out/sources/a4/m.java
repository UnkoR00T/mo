package a4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0003J%\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\"8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'¨\u0006)"}, d2 = {"La4/m;", "", "<init>", "()V", "Lr0/a0;", "La4/b0;", "changes", "Le4/b0;", "parentCoordinates", "La4/h;", "internalPointerEvent", "", "isInBounds", "a", "(Lr0/a0;Le4/b0;La4/h;Z)Z", "f", "e", "(La4/h;)Z", "Loq/i0;", "d", "Lf3/m$c;", "pointerInputModifierNode", "i", "(Lf3/m$c;)V", "c", "", "pointerIdValue", "Lr0/q0;", "La4/l;", "hitNodes", "h", "(JLr0/q0;)V", "b", "(La4/h;)V", "Ln2/c;", "Ln2/c;", "g", "()Ln2/c;", "children", "Lr0/q0;", "removeMatchingPointerInputModifierNodeList", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n2.c<Node> children = new n2.c<>(new Node[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r0.q0<m> removeMatchingPointerInputModifierNodeList = new r0.q0<>(10);

    public boolean a(r0.a0<PointerInputChange> changes, p036e4.b0 parentCoordinates, h internalPointerEvent, boolean isInBounds) {
        n2.c<Node> cVar = this.children;
        Node[] lVarArr = cVar.content;
        int size = cVar.getSize();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            z15 = lVarArr[i15].a(changes, parentCoordinates, internalPointerEvent, isInBounds) || z15;
        }
        return z15;
    }

    public void b(h internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.content[size].getPointerIds().f()) {
                this.children.v(size);
            }
        }
    }

    public final void c() {
        this.children.j();
    }

    public void d() {
        n2.c<Node> cVar = this.children;
        Node[] lVarArr = cVar.content;
        int size = cVar.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            lVarArr[i15].d();
        }
    }

    public boolean e(h internalPointerEvent) {
        n2.c<Node> cVar = this.children;
        Node[] lVarArr = cVar.content;
        int size = cVar.getSize();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            z15 = lVarArr[i15].e(internalPointerEvent) || z15;
        }
        b(internalPointerEvent);
        return z15;
    }

    public boolean f(r0.a0<PointerInputChange> changes, p036e4.b0 parentCoordinates, h internalPointerEvent, boolean isInBounds) {
        n2.c<Node> cVar = this.children;
        Node[] lVarArr = cVar.content;
        int size = cVar.getSize();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            z15 = lVarArr[i15].f(changes, parentCoordinates, internalPointerEvent, isInBounds) || z15;
        }
        return z15;
    }

    public final n2.c<Node> g() {
        return this.children;
    }

    public void h(long pointerIdValue, r0.q0<Node> hitNodes) {
        n2.c<Node> cVar = this.children;
        Node[] lVarArr = cVar.content;
        int size = cVar.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            lVarArr[i15].h(pointerIdValue, hitNodes);
        }
    }

    public void i(f3.m.c pointerInputModifierNode) {
        this.removeMatchingPointerInputModifierNodeList.u();
        this.removeMatchingPointerInputModifierNodeList.n(this);
        while (this.removeMatchingPointerInputModifierNodeList.h()) {
            r0.q0<m> q0Var = this.removeMatchingPointerInputModifierNodeList;
            m mVarB = q0Var.B(q0Var.get_size() - 1);
            int i15 = 0;
            while (i15 < mVarB.children.getSize()) {
                Node lVar = mVarB.children.content[i15];
                if (fr.t.c(lVar.getModifierNode(), pointerInputModifierNode)) {
                    mVarB.children.t(lVar);
                    lVar.d();
                } else {
                    this.removeMatchingPointerInputModifierNodeList.n(lVar);
                    i15++;
                }
            }
        }
    }
}
