package g4;

import androidx.compose.ui.node.NodeCoordinator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0010¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\"\u0010\u0003R \u0010(\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0015¨\u0006/"}, d2 = {"Lg4/j;", "Lf3/m$c;", "<init>", "()V", "", "delegateKindSet", "delegateNode", "Loq/i0;", "s3", "(ILf3/m$c;)V", "newKindSet", "", "recalculateOwner", "r3", "(IZ)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "m3", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "owner", "d3", "(Lf3/m$c;)V", "Lg4/g;", "T", "delegatableNode", "n3", "(Lg4/g;)Lg4/g;", "instance", "q3", "(Lg4/g;)V", "U2", "a3", "b3", "V2", "Z2", "r", "I", "p3", "()I", "getSelfKindSet$ui$annotations", "selfKindSet", "s", "Lf3/m$c;", "o3", "()Lf3/m$c;", "setDelegate$ui", "delegate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j extends f3.m.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f70339t = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int selfKindSet = t0.g(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private f3.m.c delegate;

    private final void r3(int newKindSet, boolean recalculateOwner) {
        f3.m.c child;
        int kindSet = getKindSet();
        h3(newKindSet);
        if (kindSet != newKindSet) {
            if (h.k(this)) {
                c3(newKindSet);
            }
            if (getIsAttached()) {
                f3.m.c node = getNode();
                f3.m.c parent = this;
                while (parent != null) {
                    newKindSet |= parent.getKindSet();
                    parent.h3(newKindSet);
                    if (parent == node) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (recalculateOwner && parent == node) {
                    newKindSet = t0.h(node);
                    node.h3(newKindSet);
                }
                int aggregateChildKindSet = newKindSet | ((parent == null || (child = parent.getChild()) == null) ? 0 : child.getAggregateChildKindSet());
                while (parent != null) {
                    aggregateChildKindSet |= parent.getKindSet();
                    parent.c3(aggregateChildKindSet);
                    parent = parent.getParent();
                }
            }
        }
    }

    private final void s3(int delegateKindSet, f3.m.c delegateNode) {
        int kindSet = getKindSet();
        if ((delegateKindSet & s0.a(2)) == 0 || (s0.a(2) & kindSet) == 0 || (this instanceof z)) {
            return;
        }
        d4.a.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode);
    }

    @Override // f3.m.c
    public void U2() {
        super.U2();
        for (f3.m.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.m3(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.U2();
            }
        }
    }

    @Override // f3.m.c
    public void V2() {
        for (f3.m.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.V2();
        }
        super.V2();
    }

    @Override // f3.m.c
    public void Z2() {
        super.Z2();
        for (f3.m.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.Z2();
        }
    }

    @Override // f3.m.c
    public void a3() {
        for (f3.m.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.a3();
        }
        super.a3();
    }

    @Override // f3.m.c
    public void b3() {
        super.b3();
        for (f3.m.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.b3();
        }
    }

    @Override // f3.m.c
    public void d3(f3.m.c owner) {
        super.d3(owner);
        for (f3.m.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.d3(owner);
        }
    }

    @Override // f3.m.c
    public void m3(NodeCoordinator coordinator) {
        super.m3(coordinator);
        for (f3.m.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.m3(coordinator);
        }
    }

    protected final <T extends g> T n3(T delegatableNode) {
        f3.m.c node = delegatableNode.getNode();
        if (node != delegatableNode) {
            f3.m.c cVar = delegatableNode instanceof f3.m.c ? (f3.m.c) delegatableNode : null;
            f3.m.c parent = cVar != null ? cVar.getParent() : null;
            if (node == getNode() && fr.t.c(parent, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.getIsAttached()) {
            d4.a.c("Cannot delegate to an already attached node");
        }
        node.d3(getNode());
        int kindSet = getKindSet();
        int iH = t0.h(node);
        node.h3(iH);
        s3(iH, node);
        node.e3(this.delegate);
        this.delegate = node;
        node.j3(this);
        r3(getKindSet() | iH, false);
        if (getIsAttached()) {
            if ((iH & s0.a(2)) == 0 || (kindSet & s0.a(2)) != 0) {
                m3(getCoordinator());
            } else {
                p0 nodes = h.s(this).getNodes();
                getNode().m3(null);
                nodes.D();
            }
            node.U2();
            node.a3();
            t0.a(node);
        }
        return delegatableNode;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final f3.m.c getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    protected final void q3(g instance) {
        f3.m.c cVar = null;
        for (f3.m.c child = this.delegate; child != null; child = child.getChild()) {
            if (child == instance) {
                if (child.getIsAttached()) {
                    t0.d(child);
                    child.b3();
                    child.V2();
                }
                child.d3(child);
                child.c3(0);
                if (cVar == null) {
                    this.delegate = child.getChild();
                } else {
                    cVar.e3(child.getChild());
                }
                child.e3(null);
                child.j3(null);
                int kindSet = getKindSet();
                int iH = t0.h(this);
                r3(iH, true);
                if (getIsAttached() && (kindSet & s0.a(2)) != 0 && (s0.a(2) & iH) == 0) {
                    p0 nodes = h.s(this).getNodes();
                    getNode().m3(null);
                    nodes.D();
                    return;
                }
                return;
            }
            cVar = child;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }
}
