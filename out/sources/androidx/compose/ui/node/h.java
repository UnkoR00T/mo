package androidx.compose.ui.node;

import g4.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010,\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\"\u00104\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\"\u00107\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\"\u0010=\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0016\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R*\u0010E\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0012\u001a\u0004\b1\u0010\u001d\"\u0004\bD\u0010\u001fR*\u0010H\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0012\u001a\u0004\b-\u0010\u001d\"\u0004\bG\u0010\u001fR*\u0010J\u001a\u0002082\u0006\u0010B\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b!\u0010:\"\u0004\bI\u0010<R*\u0010N\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0012\u001a\u0004\bL\u0010\u001d\"\u0004\bM\u0010\u001fR*\u0010Q\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001fR*\u0010T\u001a\u0002082\u0006\u0010B\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0016\u001a\u0004\b&\u0010:\"\u0004\bS\u0010<R\u001a\u0010Y\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010V\u001a\u0004\bW\u0010XR(\u0010^\u001a\u0004\u0018\u00010Z2\b\u0010B\u001a\u0004\u0018\u00010Z8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010[\u001a\u0004\b\\\u0010]R\u0011\u0010b\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010d\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bC\u0010cR\u0013\u0010e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bF\u0010cR\u0014\u0010f\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0014\u0010h\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010:R\u0014\u0010j\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u001dR\u0014\u0010k\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u001dR\u0014\u0010n\u001a\u00020l8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010mR\u0016\u0010o\u001a\u0004\u0018\u00010l8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010m¨\u0006p"}, d2 = {"Landroidx/compose/ui/node/h;", "", "Landroidx/compose/ui/node/g;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/g;)V", "Loq/i0;", ip.a.f96138c, "()V", "G", "E", "F", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "J", "(J)V", "a", "Z", "B", "K", "C", "I", "Landroidx/compose/ui/node/g;", "l", "()Landroidx/compose/ui/node/g;", "", "b", "g", "()Z", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Z)V", "detachedFromParentLookaheadPass", "c", "h", "Q", "detachedFromParentLookaheadPlacement", "Landroidx/compose/ui/node/g$e;", "d", "Landroidx/compose/ui/node/g$e;", "n", "()Landroidx/compose/ui/node/g$e;", "R", "(Landroidx/compose/ui/node/g$e;)V", "layoutState", "e", "t", "W", "lookaheadMeasurePending", "f", "r", "U", "lookaheadLayoutPending", "s", "V", "lookaheadLayoutPendingForAlignment", "", "x", "()I", "X", "(I)V", "nextChildLookaheadPlaceOrder", "i", "y", "Y", "nextChildPlaceOrder", "value", "j", "O", "coordinatesAccessedDuringPlacement", "k", "N", "coordinatesAccessedDuringModifierPlacement", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "childrenAccessingCoordinatesDuringPlacement", "m", "q", "T", "lookaheadCoordinatesAccessedDuringPlacement", "p", ip.a.f96137b, "lookaheadCoordinatesAccessedDuringModifierPlacement", "o", "M", "childrenAccessingLookaheadCoordinatesDuringPlacement", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/n;", "v", "()Landroidx/compose/ui/node/n;", "measurePassDelegate", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/l;", "u", "()Landroidx/compose/ui/node/l;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "z", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "()Lc5/b;", "lastConstraints", "lastLookaheadConstraints", "height", "A", "width", "w", "measurePending", "layoutPending", "Lg4/b;", "()Lg4/b;", "alignmentLinesOwner", "lookaheadAlignmentLinesOwner", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean detachedFromParentLookaheadPass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean detachedFromParentLookaheadPlacement;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadMeasurePending;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPending;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPendingForAlignment;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int nextChildLookaheadPlaceOrder;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int nextChildPlaceOrder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l lookaheadPassDelegate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private g.e layoutState = g.e.Idle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final n measurePassDelegate = new n(this);

    public h(g gVar) {
        this.layoutNode = gVar;
    }

    public final int A() {
        return this.measurePassDelegate.getWidth();
    }

    public final void B() {
        this.measurePassDelegate.a2();
        l lVar = this.lookaheadPassDelegate;
        if (lVar != null) {
            lVar.Z1();
        }
    }

    public final void C() {
        this.measurePassDelegate.M2(true);
        l lVar = this.lookaheadPassDelegate;
        if (lVar != null) {
            lVar.K2(true);
        }
    }

    public final void D() {
        this.measurePassDelegate.r2();
    }

    public final void E() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void F() {
        this.lookaheadMeasurePending = true;
    }

    public final void G() {
        this.measurePassDelegate.t2();
    }

    public final void H() {
        g.e eVarI0 = this.layoutNode.i0();
        if (eVarI0 == g.e.LayingOut || eVarI0 == g.e.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                O(true);
            } else {
                N(true);
            }
        }
        if (eVarI0 == g.e.LookaheadLayingOut) {
            l lVar = this.lookaheadPassDelegate;
            if (lVar == null || !lVar.getLayingOutChildren()) {
                S(true);
            } else {
                T(true);
            }
        }
    }

    public final void I() {
        this.lookaheadPassDelegate = null;
        this.lookaheadLayoutPending = false;
        this.lookaheadMeasurePending = false;
    }

    public final void J(long constraints) {
        l lVar = this.lookaheadPassDelegate;
        if (lVar != null) {
            lVar.F2(constraints);
        }
    }

    public final void K() {
        g4.a aVarI;
        this.measurePassDelegate.getAlignmentLines().p();
        l lVar = this.lookaheadPassDelegate;
        if (lVar == null || (aVarI = lVar.getAlignmentLines()) == null) {
            return;
        }
        aVarI.p();
    }

    public final void L(int i15) {
        int i16 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i15;
        if ((i16 == 0) != (i15 == 0)) {
            g gVarC0 = this.layoutNode.C0();
            h layoutDelegate = gVarC0 != null ? gVarC0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i15 == 0) {
                    layoutDelegate.L(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.L(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void M(int i15) {
        int i16 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i15;
        if ((i16 == 0) != (i15 == 0)) {
            g gVarC0 = this.layoutNode.C0();
            h layoutDelegate = gVarC0 != null ? gVarC0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i15 == 0) {
                    layoutDelegate.M(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.M(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void N(boolean z15) {
        if (this.coordinatesAccessedDuringModifierPlacement != z15) {
            this.coordinatesAccessedDuringModifierPlacement = z15;
            if (z15 && !this.coordinatesAccessedDuringPlacement) {
                L(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z15 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                L(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void O(boolean z15) {
        if (this.coordinatesAccessedDuringPlacement != z15) {
            this.coordinatesAccessedDuringPlacement = z15;
            if (z15 && !this.coordinatesAccessedDuringModifierPlacement) {
                L(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z15 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                L(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void P(boolean z15) {
        this.detachedFromParentLookaheadPass = z15;
    }

    public final void Q(boolean z15) {
        this.detachedFromParentLookaheadPlacement = z15;
    }

    public final void R(g.e eVar) {
        this.layoutState = eVar;
    }

    public final void S(boolean z15) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z15) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z15;
            if (z15 && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z15 || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void T(boolean z15) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z15) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z15;
            if (z15 && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z15 || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                M(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void U(boolean z15) {
        this.lookaheadLayoutPending = z15;
    }

    public final void V(boolean z15) {
        this.lookaheadLayoutPendingForAlignment = z15;
    }

    public final void W(boolean z15) {
        this.lookaheadMeasurePending = z15;
    }

    public final void X(int i15) {
        this.nextChildLookaheadPlaceOrder = i15;
    }

    public final void Y(int i15) {
        this.nextChildPlaceOrder = i15;
    }

    public final void Z() {
        g gVarC0;
        if (this.measurePassDelegate.S2() && (gVarC0 = this.layoutNode.C0()) != null) {
            g.O1(gVarC0, false, false, false, 7, null);
        }
        l lVar = this.lookaheadPassDelegate;
        if (lVar == null || !lVar.T2()) {
            return;
        }
        if (h0.a(this.layoutNode)) {
            g gVarC1 = this.layoutNode.C0();
            if (gVarC1 != null) {
                g.O1(gVarC1, false, false, false, 7, null);
                return;
            }
            return;
        }
        g gVarC2 = this.layoutNode.C0();
        if (gVarC2 != null) {
            g.J1(gVarC2, false, false, false, 7, null);
        }
    }

    public final void a() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new l(this);
        }
    }

    public final g4.b b() {
        return this.measurePassDelegate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPlacement() {
        return this.detachedFromParentLookaheadPlacement;
    }

    public final int i() {
        return this.measurePassDelegate.getHeight();
    }

    public final c5.b j() {
        return this.measurePassDelegate.J1();
    }

    public final c5.b k() {
        l lVar = this.lookaheadPassDelegate;
        if (lVar != null) {
            return lVar.getLookaheadConstraints();
        }
        return null;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final g getLayoutNode() {
        return this.layoutNode;
    }

    public final boolean m() {
        return this.measurePassDelegate.getLayoutPending();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final g.e getLayoutState() {
        return this.layoutState;
    }

    public final g4.b o() {
        return this.lookaheadPassDelegate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getLookaheadLayoutPendingForAlignment() {
        return this.lookaheadLayoutPendingForAlignment;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final l getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final n getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    public final boolean w() {
        return this.measurePassDelegate.getMeasurePending();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getNextChildLookaheadPlaceOrder() {
        return this.nextChildLookaheadPlaceOrder;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getNextChildPlaceOrder() {
        return this.nextChildPlaceOrder;
    }

    public final NodeCoordinator z() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }
}
