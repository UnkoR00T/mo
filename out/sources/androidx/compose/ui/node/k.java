package androidx.compose.ui.node;

import fr.t;
import java.util.LinkedHashMap;
import java.util.Map;
import n3.a2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.b0;
import p036e4.q0;
import p036e4.v0;
import p036e4.x0;
import p071kotlin.Metadata;
import r0.p0;
import r0.z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u000bR$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R(\u0010A\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010G\u001a\b\u0012\u0004\u0012\u00020\f0B8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020;8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0016\u0010]\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010IR\u0014\u0010a\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010/R\u0014\u0010k\u001a\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010/R\u0014\u0010o\u001a\u00020l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010s\u001a\u0004\u0018\u00010p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"Landroidx/compose/ui/node/k;", "Le4/v0;", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Lc5/n;", "position", "Loq/i0;", "K2", "(J)V", "Le4/a;", "alignmentLine", "", "C2", "(Le4/a;)I", "h2", "()V", "", "zIndex", "Lkotlin/Function1;", "Ln3/a2;", "layerBlock", "W0", "(JFLer/l;)V", "L2", "J2", "height", "e0", "(I)I", "m0", "width", "U", "n", "ancestor", "", "excludingAgnosticOffset", "M2", "(Landroidx/compose/ui/node/k;Z)J", "s", "Landroidx/compose/ui/node/NodeCoordinator;", "F2", "()Landroidx/compose/ui/node/NodeCoordinator;", "t", "J", "O1", "()J", "N2", "", "v", "Ljava/util/Map;", "oldAlignmentLines", "Le4/q0;", "w", "Le4/q0;", "G2", "()Le4/q0;", "lookaheadLayoutCoordinates", "Le4/x0;", "result", "x", "Le4/x0;", "O2", "(Le4/x0;)V", "_measureResult", "Lr0/p0;", "y", "Lr0/p0;", "D2", "()Lr0/p0;", "cachedAlignmentLinesMap", "E1", "()Landroidx/compose/ui/node/j;", "child", "G1", "()Z", "hasMeasureResult", "J1", "()Le4/x0;", "measureResult", "J0", "isLookingAhead", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "getDensity", "()F", "density", "i2", "fontScale", "M1", "parent", "Landroidx/compose/ui/node/g;", "A2", "()Landroidx/compose/ui/node/g;", "layoutNode", "Le4/b0;", "m", "()Le4/b0;", "coordinates", "Lc5/r;", "I2", "size", "Lc5/b;", "E2", CryptoServicesPermission.CONSTRAINTS, "Lg4/b;", "z2", "()Lg4/b;", "alignmentLinesOwner", "", "e", "()Ljava/lang/Object;", "parentData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k extends j implements v0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final NodeCoordinator coordinator;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Map<p036e4.a, Integer> oldAlignmentLines;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private x0 _measureResult;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long position = c5.n.INSTANCE.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final q0 lookaheadLayoutCoordinates = new q0(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final p0<p036e4.a> cachedAlignmentLinesMap = z0.b();

    public k(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    private final void K2(long position) {
        if (!c5.n.h(getPosition(), position)) {
            N2(position);
            l lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.r2();
            }
            R1(this.coordinator);
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        y1(J1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(x0 x0Var) {
        Map<p036e4.a, Integer> map;
        if (x0Var != null) {
            d1(c5.r.c((((long) x0Var.getF47224b()) & BodyPartID.bodyIdMax) | (((long) x0Var.getF47223a()) << 32)));
        } else {
            d1(c5.r.INSTANCE.a());
        }
        if (!t.c(this._measureResult, x0Var) && x0Var != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !x0Var.i().isEmpty()) && !t.c(x0Var.i(), this.oldAlignmentLines))) {
            z2().getAlignmentLines().m();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(x0Var.i());
        }
        this._measureResult = x0Var;
    }

    @Override // androidx.compose.ui.node.j, g4.j0
    /* JADX INFO: renamed from: A2 */
    public g getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public final int C2(p036e4.a alignmentLine) {
        return this.cachedAlignmentLinesMap.e(alignmentLine, PKIFailureInfo.systemUnavail);
    }

    protected final p0<p036e4.a> D2() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.ui.node.j
    public j E1() {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    public final long E2() {
        return getMeasurementConstraints();
    }

    /* JADX INFO: renamed from: F2, reason: from getter */
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.node.j
    public boolean G1() {
        return this._measureResult != null;
    }

    /* JADX INFO: renamed from: G2, reason: from getter */
    public final q0 getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final long I2() {
        return c5.r.c((((long) getHeight()) & BodyPartID.bodyIdMax) | (((long) getWidth()) << 32));
    }

    @Override // androidx.compose.ui.node.j, p036e4.w
    public boolean J0() {
        return true;
    }

    @Override // androidx.compose.ui.node.j
    public x0 J1() {
        x0 x0Var = this._measureResult;
        if (x0Var != null) {
            return x0Var;
        }
        d4.a.d("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new oq.g();
    }

    protected void J2() {
        J1().k();
    }

    public final void L2(long position) {
        K2(c5.n.m(position, getApparentToRealOffset()));
    }

    @Override // androidx.compose.ui.node.j
    public j M1() {
        NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    public final long M2(k ancestor, boolean excludingAgnosticOffset) {
        long jB = c5.n.INSTANCE.b();
        for (k lookaheadDelegate = this; !t.c(lookaheadDelegate, ancestor); lookaheadDelegate = lookaheadDelegate.coordinator.getWrappedBy().getLookaheadDelegate()) {
            if (!lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference() || !excludingAgnosticOffset) {
                jB = c5.n.m(jB, lookaheadDelegate.getPosition());
            }
        }
        return jB;
    }

    public void N2(long j15) {
        this.position = j15;
    }

    @Override // androidx.compose.ui.node.j
    /* JADX INFO: renamed from: O1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    public abstract int U(int width);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036e4.a2
    public final void W0(long position, float zIndex, er.l<? super a2, i0> layerBlock) {
        K2(position);
        if (getIsShallowPlacing()) {
            return;
        }
        J2();
    }

    @Override // p036e4.z0, p036e4.v
    /* JADX INFO: renamed from: e */
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    public abstract int e0(int height);

    @Override // c5.d
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // p036e4.w
    public c5.t getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.j
    public void h2() {
        W0(getPosition(), 0.0f, null);
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.j
    public b0 m() {
        return this.lookaheadLayoutCoordinates;
    }

    public abstract int m0(int height);

    public abstract int n(int width);

    public g4.b z2() {
        return this.coordinator.getLayoutNode().getLayoutDelegate().o();
    }
}
