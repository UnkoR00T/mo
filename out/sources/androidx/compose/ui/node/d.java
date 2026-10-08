package androidx.compose.ui.node;

import a4.p0;
import androidx.compose.ui.graphics.Color;
import g4.g0;
import g4.m1;
import g4.t;
import n3.h1;
import n3.k2;
import n3.l2;
import n3.o0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 H2\u00020\u0001:\u0002IJB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\"\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001fH\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b+\u0010,J7\u00107\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010>\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R.\u0010G\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006K"}, d2 = {"Landroidx/compose/ui/node/d;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/g;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/g;)V", "Loq/i0;", "q4", "()V", "W2", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/a2;", "o0", "(J)Le4/a2;", "", "height", "e0", "(I)I", "width", "U", "m0", "n", "Lc5/n;", "position", "", "zIndex", "Lq3/c;", "layer", "Z0", "(JFLq3/c;)V", "Lkotlin/Function1;", "Ln3/a2;", "layerBlock", "W0", "(JFLer/l;)V", "Le4/a;", "alignmentLine", "p1", "(Le4/a;)I", "Ln3/h1;", "canvas", "graphicsLayer", "N3", "(Ln3/h1;Lq3/c;)V", "Landroidx/compose/ui/node/NodeCoordinator$f;", "hitTestSource", "Lm3/e;", "pointerPosition", "Lg4/t;", "hitTestResult", "La4/p0;", "pointerType", "", "isInLayer", "y3", "(Landroidx/compose/ui/node/NodeCoordinator$f;JLg4/t;IZ)V", "Lg4/m1;", "z0", "Lg4/m1;", "p4", "()Lg4/m1;", "tail", "Landroidx/compose/ui/node/k;", "value", "A0", "Landroidx/compose/ui/node/k;", "j3", "()Landroidx/compose/ui/node/k;", "r4", "(Landroidx/compose/ui/node/k;)V", "lookaheadDelegate", "B0", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends NodeCoordinator {
    private static final k2 C0;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private k lookaheadDelegate;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private final m1 tail;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/d$b;", "Landroidx/compose/ui/node/k;", "<init>", "(Landroidx/compose/ui/node/d;)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/a2;", "o0", "(J)Le4/a2;", "Le4/a;", "alignmentLine", "", "p1", "(Le4/a;)I", "Loq/i0;", "J2", "()V", "height", "e0", "(I)I", "width", "U", "m0", "n", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b extends k {
        public b() {
            super(d.this);
        }

        @Override // androidx.compose.ui.node.k
        protected void J2() {
            getLayoutNode().l0().E2();
        }

        @Override // androidx.compose.ui.node.k, p036e4.v
        public int U(int width) {
            return getLayoutNode().r1(width);
        }

        @Override // androidx.compose.ui.node.k, p036e4.v
        public int e0(int height) {
            return getLayoutNode().s1(height);
        }

        @Override // androidx.compose.ui.node.k, p036e4.v
        public int m0(int height) {
            return getLayoutNode().o1(height);
        }

        @Override // androidx.compose.ui.node.k, p036e4.v
        public int n(int width) {
            return getLayoutNode().n1(width);
        }

        @Override // p036e4.v0
        public a2 o0(long constraints) {
            j1(constraints);
            n2.c<g> cVarL0 = getLayoutNode().L0();
            g[] gVarArr = cVarL0.content;
            int size = cVarL0.getSize();
            for (int i15 = 0; i15 < size; i15++) {
                gVarArr[i15].l0().P2(g.EnumC0220g.NotUsed);
            }
            O2(getLayoutNode().getMeasurePolicy().e(this, getLayoutNode().P(), constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.j
        public int p1(p036e4.a alignmentLine) {
            Integer num = z2().y().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : PKIFailureInfo.systemUnavail;
            D2().u(alignmentLine, iIntValue);
            return iIntValue;
        }
    }

    static {
        k2 k2VarA = o0.a();
        k2VarA.m(Color.INSTANCE.f());
        k2VarA.v(1.0f);
        k2VarA.u(l2.INSTANCE.b());
        C0 = k2VarA;
    }

    public d(g gVar) {
        super(gVar);
        this.tail = new m1();
        n3().m3(this);
        this.lookaheadDelegate = gVar.getLookaheadRoot() != null ? new b() : null;
    }

    private final void q4() {
        if (getIsShallowPlacing()) {
            return;
        }
        getLayoutNode().o0().F2();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void N3(h1 canvas, q3.c graphicsLayer) throws Throwable {
        Owner ownerB = g0.b(getLayoutNode());
        n2.c<g> cVarK0 = getLayoutNode().K0();
        g[] gVarArr = cVarK0.content;
        int size = cVarK0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = gVarArr[i15];
            if (gVar.p()) {
                gVar.J(canvas, graphicsLayer);
            }
        }
        if (ownerB.getShowLayoutBounds()) {
            U2(canvas, C0);
        }
    }

    @Override // p036e4.v
    public int U(int width) {
        return getLayoutNode().p1(width);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, p036e4.a2
    public void W0(long position, float zIndex, er.l<? super n3.a2, i0> layerBlock) {
        super.W0(position, zIndex, layerBlock);
        q4();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void W2() {
        if (getLookaheadDelegate() == null) {
            r4(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, p036e4.a2
    public void Z0(long position, float zIndex, q3.c layer) {
        super.Z0(position, zIndex, layer);
        q4();
    }

    @Override // p036e4.v
    public int e0(int height) {
        return getLayoutNode().q1(height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: j3, reason: from getter */
    public k getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // p036e4.v
    public int m0(int height) {
        return getLayoutNode().m1(height);
    }

    @Override // p036e4.v
    public int n(int width) {
        return getLayoutNode().l1(width);
    }

    @Override // p036e4.v0
    public a2 o0(long constraints) {
        if (getForceMeasureWithLookaheadConstraints()) {
            constraints = getLookaheadDelegate().E2();
        }
        j1(constraints);
        n2.c<g> cVarL0 = getLayoutNode().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            gVarArr[i15].o0().O2(g.EnumC0220g.NotUsed);
        }
        X3(getLayoutNode().getMeasurePolicy().e(this, getLayoutNode().Q(), constraints));
        I3();
        return this;
    }

    @Override // androidx.compose.ui.node.j
    public int p1(p036e4.a alignmentLine) {
        k lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.p1(alignmentLine);
        }
        Integer num = b3().y().get(alignmentLine);
        return num != null ? num.intValue() : PKIFailureInfo.systemUnavail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: p4, reason: from getter and merged with bridge method [inline-methods] */
    public m1 n3() {
        return this.tail;
    }

    protected void r4(k kVar) {
        this.lookaheadDelegate = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:33:0x0090 BREAK  A[LOOP:0: B:17:0x0053->B:32:0x008b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x008b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    public void y3(NodeCoordinator.f hitTestSource, long pointerPosition, t hitTestResult, int pointerType, boolean isInLayer) {
        int i15;
        boolean z15;
        g[] gVarArr;
        int size;
        g gVar;
        boolean z16;
        boolean zS;
        boolean z17 = false;
        if (hitTestSource.e(getLayoutNode())) {
            if (!o4(pointerPosition)) {
                i15 = pointerType;
                if (!p0.i(pointerType, p0.INSTANCE.d()) || (Float.floatToRawIntBits(S2(pointerPosition, k3())) & Integer.MAX_VALUE) >= 2139095040) {
                }
                if (z15) {
                    int i16 = hitTestResult.hitDepth;
                    n2.c<g> cVarK0 = getLayoutNode().K0();
                    gVarArr = cVarK0.content;
                    size = cVarK0.getSize() - 1;
                    while (size >= 0) {
                        gVar = gVarArr[size];
                        if (gVar.p()) {
                            int i17 = i15;
                            z16 = z17;
                            hitTestSource.c(gVar, pointerPosition, hitTestResult, i17, z16);
                            zS = hitTestResult.s();
                            if (f3.h.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                                if (!zS && !hitTestSource.d(hitTestResult, gVar)) {
                                    break;
                                }
                            } else if (!zS) {
                                if (!gVar.y0().c4()) {
                                    break;
                                } else {
                                    hitTestResult.e();
                                }
                            } else {
                                continue;
                            }
                        } else {
                            z16 = z17;
                        }
                        size--;
                        z17 = z16;
                        i15 = pointerType;
                    }
                    hitTestResult.hitDepth = i16;
                }
            }
            i15 = pointerType;
            z17 = isInLayer;
            z15 = true;
            if (z15) {
                int i18 = hitTestResult.hitDepth;
                n2.c<g> cVarK1 = getLayoutNode().K0();
                gVarArr = cVarK1.content;
                size = cVarK1.getSize() - 1;
                while (size >= 0) {
                    gVar = gVarArr[size];
                    if (gVar.p()) {
                        int i19 = i15;
                        z16 = z17;
                        hitTestSource.c(gVar, pointerPosition, hitTestResult, i19, z16);
                        zS = hitTestResult.s();
                        if (f3.h.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                            if (!zS) {
                                if (!gVar.y0().c4()) {
                                    break;
                                    break;
                                }
                                hitTestResult.e();
                            } else {
                                continue;
                            }
                        } else if (!zS) {
                            continue;
                        }
                    } else {
                        z16 = z17;
                    }
                    size--;
                    z17 = z16;
                    i15 = pointerType;
                }
                hitTestResult.hitDepth = i18;
            }
        }
        i15 = pointerType;
        z15 = false;
        z17 = isInLayer;
        if (z15) {
            int i110 = hitTestResult.hitDepth;
            n2.c<g> cVarK2 = getLayoutNode().K0();
            gVarArr = cVarK2.content;
            size = cVarK2.getSize() - 1;
            while (size >= 0) {
                gVar = gVarArr[size];
                if (gVar.p()) {
                    int i111 = i15;
                    z16 = z17;
                    hitTestSource.c(gVar, pointerPosition, hitTestResult, i111, z16);
                    zS = hitTestResult.s();
                    if (f3.h.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                        if (!zS) {
                            if (!gVar.y0().c4()) {
                                break;
                                break;
                            }
                            hitTestResult.e();
                        } else {
                            continue;
                        }
                    } else if (!zS) {
                        continue;
                    }
                } else {
                    z16 = z17;
                }
                size--;
                z17 = z16;
                i15 = pointerType;
            }
            hitTestResult.hitDepth = i110;
        }
    }
}
