package o4;

import android.os.Trace;
import androidx.compose.ui.node.NodeCoordinator;
import c5.n;
import er.l;
import fr.w;
import g4.a1;
import g4.s0;
import m3.MutableRect;
import n3.g2;
import n3.h2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import r0.q;
import r0.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u001b\u0010\u0012\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010#\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001bJ\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u001bJ\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u001bJA\u00105\u001a\u0002042\u0006\u0010+\u001a\u00020 2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\t01¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b7\u0010\u000bJ%\u0010:\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u0014¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b<\u0010\u000bJ\u0015\u0010=\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b=\u0010\u0019J\u0015\u0010>\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b>\u0010\u000bJ\u0015\u0010?\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b?\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0017\u0010G\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b&\u0010D\u001a\u0004\bE\u0010FR \u0010M\u001a\u00020H8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b=\u0010I\u0012\u0004\bL\u0010\u001b\u001a\u0004\bJ\u0010KR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010PR\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010RR\u0016\u0010U\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010VR\u0016\u0010Y\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010ZR\u0014\u0010]\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\\¨\u0006^"}, d2 = {"Lo4/d;", "", "Lr0/q;", "Landroidx/compose/ui/node/g;", "layoutNodes", "Lo4/a;", "executeDelayed", "<init>", "(Lr0/q;Lo4/a;)V", "Loq/i0;", "p", "(Landroidx/compose/ui/node/g;)V", "layoutNode", "h", "g", "Landroidx/compose/ui/node/NodeCoordinator;", "Lm3/c;", "rect", "b", "(Landroidx/compose/ui/node/NodeCoordinator;Lm3/c;)V", "", "f", "(Landroidx/compose/ui/node/NodeCoordinator;)Z", "Lc5/n;", "k", "(Landroidx/compose/ui/node/g;)J", "i", "()V", "screenOffset", "windowOffset", "Ln3/g2;", "viewToWindowMatrix", "", "windowWidth", "windowHeight", "u", "(JJ[FII)V", "q", "c", "ensureSomethingScheduled", "r", "(Z)V", "o", "id", "", "throttleMillis", "debounceMillis", "Lg4/g;", "node", "Lkotlin/Function1;", "Lo4/f;", "callback", "Lg4/g$a;", "m", "(IJJLg4/g;Ler/l;)Lg4/g$a;", "j", "focusable", "gesturable", "t", "(Landroidx/compose/ui/node/g;ZZ)V", "l", "d", "n", "s", "a", "Lr0/q;", "Lo4/a;", "Lo4/b;", "Lo4/b;", "e", "()Lo4/b;", "rects", "Lo4/g;", "Lo4/g;", "getThrottledCallbacks$ui", "()Lo4/g;", "getThrottledCallbacks$ui$annotations", "throttledCallbacks", "Lr0/q0;", "Lkotlin/Function0;", "Lr0/q0;", "callbacks", "Z", "isDirty", "isScreenOrWindowDirty", "isFragmented", "Ljava/lang/Object;", "dispatchToken", "J", "scheduledDispatchDeadline", "Ler/a;", "dispatchLambda", "Lm3/c;", "cachedRect", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q<androidx.compose.ui.node.g> layoutNodes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o4.a executeDelayed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isScreenOrWindowDirty;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isFragmented;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Object dispatchToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b rects = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g throttledCallbacks = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q0<er.a<i0>> callbacks = new q0<>(0, 1, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long scheduledDispatchDeadline = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> dispatchLambda = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final MutableRect cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.a<i0> {
        a() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            d.this.dispatchToken = null;
            d dVar = d.this;
            Trace.beginSection("OnPositionedDispatch");
            try {
                dVar.c();
                i0 i0Var = i0.f148189a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public d(q<androidx.compose.ui.node.g> qVar, o4.a aVar) {
        this.layoutNodes = qVar;
        this.executeDelayed = aVar;
    }

    private final void b(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            androidx.compose.ui.node.g layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.y0() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                long jD = d(layoutNode);
                if (!n.h(jD, n.INSTANCE.a())) {
                    float fI = n.i(jD);
                    mutableRect.m(m3.e.e((((long) Float.floatToRawIntBits(n.j(jD))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fI) << 32)));
                    return;
                }
            }
            a1 layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] fArrMo27getUnderlyingMatrixsQKQjiQ = layer.mo27getUnderlyingMatrixsQKQjiQ();
                if (!h2.a(fArrMo27getUnderlyingMatrixsQKQjiQ)) {
                    g2.h(fArrMo27getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long position = nodeCoordinator.getPosition();
            float fI2 = n.i(position);
            mutableRect.m(m3.e.e((((long) Float.floatToRawIntBits(n.j(position))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fI2) << 32)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
        }
    }

    private final boolean f(NodeCoordinator nodeCoordinator) {
        a1 layer = nodeCoordinator.getLayer();
        return (layer == null || h2.a(layer.mo27getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    private final void g(androidx.compose.ui.node.g layoutNode) {
        layoutNode.W1(true);
        NodeCoordinator nodeCoordinatorY0 = layoutNode.y0();
        androidx.compose.ui.node.n nVarO0 = layoutNode.o0();
        int iP0 = nVarO0.P0();
        int iL0 = nVarO0.L0();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.g(0.0f, 0.0f, iP0, iL0);
        b(nodeCoordinatorY0, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        boolean addedToRectList = layoutNode.getAddedToRectList();
        layoutNode.T1(true);
        if (!addedToRectList || !this.rects.m(semanticsId, left, top, right, bottom)) {
            androidx.compose.ui.node.g gVarC0 = layoutNode.C0();
            b.f(this.rects, semanticsId, left, top, right, bottom, gVarC0 != null ? gVarC0.getSemanticsId() : -1, layoutNode.getNodes().q(s0.a(1024)), layoutNode.getNodes().q(s0.a(16)), this.throttledCallbacks.j().a(semanticsId), 0, 512, null);
        }
        layoutNode.g2(false);
        i();
    }

    private final void h(androidx.compose.ui.node.g layoutNode) {
        g(layoutNode);
        n2.c<androidx.compose.ui.node.g> cVarL0 = layoutNode.L0();
        androidx.compose.ui.node.g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            androidx.compose.ui.node.g gVar = gVarArr[i15];
            if (gVar.p()) {
                h(gVar);
            }
        }
    }

    private final long k(androidx.compose.ui.node.g gVar) {
        NodeCoordinator nodeCoordinatorY0 = gVar.y0();
        long jB = n.INSTANCE.b();
        for (NodeCoordinator nodeCoordinatorB0 = gVar.b0(); nodeCoordinatorB0 != null && nodeCoordinatorB0 != nodeCoordinatorY0; nodeCoordinatorB0 = nodeCoordinatorB0.getWrappedBy()) {
            if (f(nodeCoordinatorB0)) {
                return n.INSTANCE.a();
            }
            jB = n.m(jB, nodeCoordinatorB0.getPosition());
        }
        return jB;
    }

    private final void p(androidx.compose.ui.node.g gVar) {
        if (!gVar.getHasPositionalLayerTransformationsInOffsetFromRoot() || f(gVar.y0())) {
            return;
        }
        gVar.W1(false);
        if (gVar.getOuterToInnerOffsetDirty()) {
            gVar.e2(k(gVar));
            gVar.f2(false);
        }
        if (n.h(gVar.getOuterToInnerOffset(), n.INSTANCE.a())) {
            return;
        }
        n2.c<androidx.compose.ui.node.g> cVarL0 = gVar.L0();
        androidx.compose.ui.node.g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            p(gVarArr[i15]);
        }
    }

    public final void c() {
        o();
        long jC = f3.b.c();
        boolean z15 = this.isDirty;
        boolean z16 = z15 || this.isScreenOrWindowDirty;
        if (z15) {
            this.isDirty = false;
            q0<er.a<i0>> q0Var = this.callbacks;
            Object[] objArr = q0Var.content;
            int i15 = q0Var._size;
            for (int i16 = 0; i16 < i15; i16++) {
                ((er.a) objArr[i16]).a();
            }
            b bVar = this.rects;
            long[] jArr = bVar.items;
            int i17 = bVar.itemsSize;
            for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
                long j15 = jArr[i18 + 2];
                if ((((int) (j15 >> 60)) & 1) != 0) {
                    this.throttledCallbacks.g(33554431 & ((int) j15), jArr[i18], jArr[i18 + 1], jC);
                }
            }
            this.rects.a();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.f(jC);
        }
        if (z16) {
            this.throttledCallbacks.e(jC);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.b();
        }
        this.throttledCallbacks.p(jC);
        if (this.throttledCallbacks.getMinDebounceDeadline() > 0) {
            r(true);
        }
    }

    public final long d(androidx.compose.ui.node.g layoutNode) {
        long jD = this.rects.d(layoutNode.getSemanticsId());
        if (jD == Long.MAX_VALUE) {
            return n.INSTANCE.a();
        }
        return n.d((((long) ((int) (jD >> 32))) << 32) | (((long) ((int) jD)) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getRects() {
        return this.rects;
    }

    public final void i() {
        this.isDirty = true;
    }

    public final void j(androidx.compose.ui.node.g layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.isDirty = true;
            this.rects.h(layoutNode.getSemanticsId());
        }
        r(true);
    }

    public final void l(androidx.compose.ui.node.g layoutNode) {
        long jB;
        if (layoutNode.p() && layoutNode.getRectInParentDirty()) {
            androidx.compose.ui.node.g gVarC0 = layoutNode.C0();
            if (gVarC0 == null || gVarC0.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                jB = gVarC0 == null ? n.INSTANCE.b() : n.INSTANCE.a();
            } else {
                if (gVarC0.getOuterToInnerOffsetDirty()) {
                    gVarC0.f2(false);
                    gVarC0.e2(k(gVarC0));
                }
                jB = gVarC0.getOuterToInnerOffset();
            }
            NodeCoordinator nodeCoordinatorY0 = layoutNode.y0();
            if (!e.d(jB) || f(nodeCoordinatorY0)) {
                h(layoutNode);
            } else if (layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                h(layoutNode);
                p(layoutNode);
            } else {
                long jM = n.m(jB, nodeCoordinatorY0.getPosition());
                androidx.compose.ui.node.n nVarO0 = layoutNode.o0();
                int iP0 = nVarO0.P0();
                int iL0 = nVarO0.L0();
                int semanticsId = layoutNode.getSemanticsId();
                if (!layoutNode.getAddedToRectList()) {
                    layoutNode.T1(true);
                    boolean zQ = layoutNode.getNodes().q(s0.a(1024));
                    boolean zQ2 = layoutNode.getNodes().q(s0.a(16));
                    boolean zA = this.throttledCallbacks.j().a(semanticsId);
                    if (gVarC0 != null) {
                        this.rects.g(semanticsId, gVarC0.getSemanticsId(), n.i(jM), n.j(jM), iP0, iL0, zQ, zQ2, zA);
                    } else {
                        b.f(this.rects, semanticsId, n.i(jM), n.j(jM), n.i(jM) + iP0, n.j(jM) + iL0, 0, zQ, zQ2, zA, 0, 544, null);
                    }
                } else if (gVarC0 != null) {
                    this.rects.j(semanticsId, gVarC0.getSemanticsId(), n.i(jM), n.j(jM), iP0, iL0);
                } else {
                    this.rects.i(semanticsId, n.i(jM), n.j(jM), n.i(jM) + iP0, n.j(jM) + iL0);
                }
            }
            layoutNode.g2(false);
            i();
            r(true);
        }
    }

    public final g4.g.a m(int id5, long throttleMillis, long debounceMillis, g4.g node, l<? super f, i0> callback) {
        g4.g.a aVarN = this.throttledCallbacks.n(id5, throttleMillis, debounceMillis, node, callback);
        if (g4.h.s(node.getNode()).getAddedToRectList()) {
            this.rects.o(id5, true);
        }
        i();
        r(true);
        return aVarN;
    }

    public final void n(androidx.compose.ui.node.g layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.rects.k(layoutNode.getSemanticsId());
            layoutNode.T1(false);
            layoutNode.g2(true);
            i();
            this.isFragmented = true;
        }
    }

    public final void o() {
        Object obj = this.dispatchToken;
        if (obj != null) {
            this.executeDelayed.p(obj);
            this.dispatchToken = null;
        }
    }

    public final void q() {
        g gVar = this.throttledCallbacks;
        n.Companion companion = n.INSTANCE;
        this.isScreenOrWindowDirty = gVar.q(companion.b(), companion.b(), null, 0, 0);
    }

    public final void r(boolean ensureSomethingScheduled) {
        boolean z15 = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long jI = this.throttledCallbacks.getMinDebounceDeadline();
        if (jI >= 0 || !z15) {
            if (this.scheduledDispatchDeadline == jI && z15) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                this.executeDelayed.p(obj);
            }
            long jC = f3.b.c();
            long jMax = Math.max(jI, ((long) 16) + jC);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = this.executeDelayed.M(jMax - jC, this.dispatchLambda);
        }
    }

    public final void s(androidx.compose.ui.node.g layoutNode) {
        this.rects.o(layoutNode.getSemanticsId(), false);
    }

    public final void t(androidx.compose.ui.node.g layoutNode, boolean focusable, boolean gesturable) {
        if (layoutNode.c()) {
            this.rects.n(layoutNode.getSemanticsId(), focusable, gesturable);
        }
    }

    public final void u(long screenOffset, long windowOffset, float[] viewToWindowMatrix, int windowWidth, int windowHeight) {
        int iC = e.c(viewToWindowMatrix);
        g gVar = this.throttledCallbacks;
        if ((iC & 2) != 0) {
            viewToWindowMatrix = null;
        }
        this.isScreenOrWindowDirty = gVar.q(screenOffset, windowOffset, viewToWindowMatrix, windowWidth, windowHeight) || this.isScreenOrWindowDirty;
    }
}
