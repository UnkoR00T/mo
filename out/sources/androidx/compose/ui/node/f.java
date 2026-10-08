package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Color;
import fr.t;
import g4.a0;
import g4.g0;
import g4.s0;
import g4.z;
import java.util.Map;
import n3.h1;
import n3.k2;
import n3.l2;
import n3.o0;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.x0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0002RSB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J5\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b-\u0010.R*\u00106\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010=\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010E\u001a\u0004\u0018\u00010>2\b\u0010/\u001a\u0004\u0018\u00010>8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010P\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006T"}, d2 = {"Landroidx/compose/ui/node/f;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/g;", "layoutNode", "Lg4/z;", "measureNode", "<init>", "(Landroidx/compose/ui/node/g;Lg4/z;)V", "Loq/i0;", "t4", "()V", "W2", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/a2;", "o0", "(J)Le4/a2;", "", "height", "e0", "(I)I", "m0", "width", "U", "n", "Lc5/n;", "position", "", "zIndex", "Lq3/c;", "layer", "Z0", "(JFLq3/c;)V", "Lkotlin/Function1;", "Ln3/a2;", "layerBlock", "W0", "(JFLer/l;)V", "Le4/a;", "alignmentLine", "p1", "(Le4/a;)I", "Ln3/h1;", "canvas", "graphicsLayer", "N3", "(Ln3/h1;Lq3/c;)V", "value", "z0", "Lg4/z;", "q4", "()Lg4/z;", "u4", "(Lg4/z;)V", "layoutModifierNode", "A0", "Lc5/b;", "r4", "()Lc5/b;", "v4", "(Lc5/b;)V", "lookaheadConstraints", "Landroidx/compose/ui/node/k;", "B0", "Landroidx/compose/ui/node/k;", "j3", "()Landroidx/compose/ui/node/k;", "w4", "(Landroidx/compose/ui/node/k;)V", "lookaheadDelegate", "Le4/g;", "C0", "Le4/g;", "approachMeasureScope", "Lf3/m$c;", "n3", "()Lf3/m$c;", "tail", "s4", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "D0", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends NodeCoordinator {
    private static final k2 E0;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private c5.b lookaheadConstraints;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private k lookaheadDelegate;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private p036e4.g approachMeasureScope;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private z layoutModifierNode;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/f$b;", "Landroidx/compose/ui/node/k;", "<init>", "(Landroidx/compose/ui/node/f;)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/a2;", "o0", "(J)Le4/a2;", "Le4/a;", "alignmentLine", "", "p1", "(Le4/a;)I", "height", "e0", "(I)I", "m0", "width", "U", "n", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b extends k {
        public b() {
            super(f.this);
        }

        @Override // androidx.compose.ui.node.k, p036e4.v
        public int U(int width) {
            return f.this.getLayoutModifierNode().H(this, f.this.s4().getLookaheadDelegate(), width);
        }

        @Override // androidx.compose.ui.node.k, p036e4.v
        public int e0(int height) {
            return f.this.getLayoutModifierNode().K(this, f.this.s4().getLookaheadDelegate(), height);
        }

        @Override // androidx.compose.ui.node.k, p036e4.v
        public int m0(int height) {
            return f.this.getLayoutModifierNode().k(this, f.this.s4().getLookaheadDelegate(), height);
        }

        @Override // androidx.compose.ui.node.k, p036e4.v
        public int n(int width) {
            return f.this.getLayoutModifierNode().O(this, f.this.s4().getLookaheadDelegate(), width);
        }

        @Override // p036e4.v0
        public a2 o0(long constraints) {
            f fVar = f.this;
            j1(constraints);
            fVar.v4(c5.b.a(constraints));
            O2(fVar.getLayoutModifierNode().c(this, fVar.s4().getLookaheadDelegate(), constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.j
        public int p1(p036e4.a alignmentLine) {
            int iB = a0.b(this, alignmentLine);
            D2().u(alignmentLine, iB);
            return iB;
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"androidx/compose/ui/node/f$c", "Le4/x0;", "Loq/i0;", "k", "()V", "", "b", "I", "l", "()I", "width", "c", "getHeight", "height", "", "Le4/a;", "i", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "m", "()Ler/l;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ x0 f10086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int height;

        c(x0 x0Var, f fVar) {
            this.f10086a = x0Var;
            this.width = fVar.getLookaheadDelegate().getWidth();
            this.height = fVar.getLookaheadDelegate().getHeight();
        }

        @Override // p036e4.x0
        public int getHeight() {
            return this.height;
        }

        @Override // p036e4.x0
        public Map<p036e4.a, Integer> i() {
            return this.f10086a.i();
        }

        @Override // p036e4.x0
        public void k() {
            this.f10086a.k();
        }

        @Override // p036e4.x0
        /* JADX INFO: renamed from: l, reason: from getter */
        public int getWidth() {
            return this.width;
        }

        @Override // p036e4.x0
        public er.l<p036e4.k2, i0> m() {
            return this.f10086a.m();
        }
    }

    static {
        k2 k2VarA = o0.a();
        k2VarA.m(Color.INSTANCE.b());
        k2VarA.v(1.0f);
        k2VarA.u(l2.INSTANCE.b());
        E0 = k2VarA;
    }

    public f(g gVar, z zVar) {
        super(gVar);
        this.layoutModifierNode = zVar;
        this.lookaheadDelegate = gVar.getLookaheadRoot() != null ? new b() : null;
        this.approachMeasureScope = (zVar.getNode().getKindSet() & s0.a(512)) != 0 ? new p036e4.g(this, (p036e4.e) zVar) : null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    private final void t4() {
        boolean z15;
        if (getIsShallowPlacing()) {
            return;
        }
        J3();
        NodeCoordinator nodeCoordinatorS4 = s4();
        p036e4.g gVar = this.approachMeasureScope;
        if (gVar != null) {
            if (gVar.getApproachNode().N1(getPlacementScope(), getLookaheadDelegate().getLookaheadLayoutCoordinates()) || gVar.getApproachMeasureRequired()) {
                z15 = false;
            } else {
                long jB = b();
                k lookaheadDelegate = getLookaheadDelegate();
                if (c5.r.d(jB, lookaheadDelegate != null ? c5.r.b(lookaheadDelegate.I2()) : null)) {
                    long jB2 = nodeCoordinatorS4.b();
                    k lookaheadDelegate2 = nodeCoordinatorS4.getLookaheadDelegate();
                    if (c5.r.d(jB2, lookaheadDelegate2 != null ? c5.r.b(lookaheadDelegate2.I2()) : null)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
            }
            nodeCoordinatorS4.U3(z15);
        }
        nodeCoordinatorS4.p2(getIsPlacingForAlignment());
        J1().k();
        nodeCoordinatorS4.p2(false);
        nodeCoordinatorS4.U3(false);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void N3(h1 canvas, q3.c graphicsLayer) {
        NodeCoordinator wrapped;
        s4().T2(canvas, graphicsLayer);
        if (!g0.b(getLayoutNode()).getShowLayoutBounds() || (wrapped = getWrapped()) == null) {
            return;
        }
        if (c5.r.e(b(), wrapped.b()) && c5.n.h(wrapped.getPosition(), c5.n.INSTANCE.b())) {
            return;
        }
        U2(canvas, E0);
    }

    @Override // p036e4.v
    public int U(int width) {
        p036e4.g gVar = this.approachMeasureScope;
        return gVar != null ? gVar.getApproachNode().O1(gVar, s4(), width) : this.layoutModifierNode.H(this, s4(), width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, p036e4.a2
    public void W0(long position, float zIndex, er.l<? super n3.a2, i0> layerBlock) {
        super.W0(position, zIndex, layerBlock);
        t4();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void W2() {
        if (getLookaheadDelegate() == null) {
            w4(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, p036e4.a2
    public void Z0(long position, float zIndex, q3.c layer) {
        super.Z0(position, zIndex, layer);
        t4();
    }

    @Override // p036e4.v
    public int e0(int height) {
        p036e4.g gVar = this.approachMeasureScope;
        return gVar != null ? gVar.getApproachNode().Z0(gVar, s4(), height) : this.layoutModifierNode.K(this, s4(), height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: j3, reason: from getter */
    public k getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // p036e4.v
    public int m0(int height) {
        p036e4.g gVar = this.approachMeasureScope;
        return gVar != null ? gVar.getApproachNode().p1(gVar, s4(), height) : this.layoutModifierNode.k(this, s4(), height);
    }

    @Override // p036e4.v
    public int n(int width) {
        p036e4.g gVar = this.approachMeasureScope;
        return gVar != null ? gVar.getApproachNode().R0(gVar, s4(), width) : this.layoutModifierNode.O(this, s4(), width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public f3.m.c n3() {
        return this.layoutModifierNode.getNode();
    }

    @Override // p036e4.v0
    public a2 o0(long constraints) {
        x0 x0VarC;
        if (getForceMeasureWithLookaheadConstraints()) {
            c5.b bVar = this.lookaheadConstraints;
            if (bVar == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            constraints = bVar.getValue();
        }
        j1(constraints);
        p036e4.g gVar = this.approachMeasureScope;
        if (gVar != null) {
            p036e4.e eVarF = gVar.getApproachNode();
            gVar.H(eVarF.y1(gVar.u1()) || !c5.b.e(constraints, getLookaheadConstraints()));
            if (!gVar.getApproachMeasureRequired()) {
                s4().T3(true);
            }
            x0VarC = eVarF.R1(gVar, s4(), constraints);
            s4().T3(false);
            boolean z15 = x0VarC.getWidth() == getLookaheadDelegate().getWidth() && x0VarC.getHeight() == getLookaheadDelegate().getHeight();
            if (!gVar.getApproachMeasureRequired()) {
                long jB = s4().b();
                k lookaheadDelegate = s4().getLookaheadDelegate();
                if (c5.r.d(jB, lookaheadDelegate != null ? c5.r.b(lookaheadDelegate.I2()) : null) && !z15) {
                    x0VarC = new c(x0VarC, this);
                }
            }
        } else {
            x0VarC = getLayoutModifierNode().c(this, s4(), constraints);
        }
        X3(x0VarC);
        I3();
        return this;
    }

    @Override // androidx.compose.ui.node.j
    public int p1(p036e4.a alignmentLine) {
        k lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.C2(alignmentLine) : a0.b(this, alignmentLine);
    }

    /* JADX INFO: renamed from: q4, reason: from getter */
    public final z getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* JADX INFO: renamed from: r4, reason: from getter */
    public final c5.b getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    public final NodeCoordinator s4() {
        return getWrapped();
    }

    public final void u4(z zVar) {
        if (!t.c(zVar, this.layoutModifierNode)) {
            f3.m.c node = zVar.getNode();
            if ((node.getKindSet() & s0.a(512)) != 0) {
                p036e4.e eVar = (p036e4.e) zVar;
                p036e4.g gVar = this.approachMeasureScope;
                if (gVar != null) {
                    gVar.I(eVar);
                } else {
                    gVar = new p036e4.g(this, eVar);
                }
                this.approachMeasureScope = gVar;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = zVar;
    }

    public final void v4(c5.b bVar) {
        this.lookaheadConstraints = bVar;
    }

    protected void w4(k kVar) {
        this.lookaheadDelegate = kVar;
    }
}
