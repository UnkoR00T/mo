package androidx.compose.ui.node;

import fr.t;
import fr.w;
import g4.c1;
import g4.g0;
import g4.h0;
import g4.m0;
import java.util.List;
import java.util.Map;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ø\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&H\u0016¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u000bJ\u000f\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u000bJ\u0017\u00103\u001a\u00020\u00012\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\"2\u0006\u00102\u001a\u000201¢\u0006\u0004\b7\u00108J5\u00109\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014H\u0014¢\u0006\u0004\b9\u0010:J'\u0010;\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\b>\u0010%J\u0018\u0010@\u001a\u00020(2\u0006\u0010?\u001a\u00020'H\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020(2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020(2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bE\u0010DJ\u0017\u0010G\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016¢\u0006\u0004\bG\u0010DJ\u0017\u0010H\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016¢\u0006\u0004\bH\u0010DJ\u0015\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020\"¢\u0006\u0004\bJ\u0010%J\r\u0010K\u001a\u00020\t¢\u0006\u0004\bK\u0010\u000bJ\r\u0010L\u001a\u00020\"¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\tH\u0000¢\u0006\u0004\bN\u0010\u000bJ\r\u0010O\u001a\u00020\t¢\u0006\u0004\bO\u0010\u000bJ\r\u0010P\u001a\u00020\t¢\u0006\u0004\bP\u0010\u000bJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010@R*\u0010_\u001a\u00020(2\u0006\u0010Y\u001a\u00020(8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010UR\"\u0010m\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010U\u001a\u0004\bk\u0010M\"\u0004\bl\u0010%R\u0016\u0010n\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010UR\u0018\u0010q\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010t\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010,R$\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0017\u0010\u0080\u0001\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R%\u0010\u008d\u0001\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b)\u0010U\u001a\u0005\b\u008b\u0001\u0010M\"\u0005\b\u008c\u0001\u0010%R'\u0010\u0090\u0001\u001a\u00020\"2\u0006\u0010Y\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010U\u001a\u0005\b\u008f\u0001\u0010MR\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010UR/\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0097\u00012\t\u0010Y\u001a\u0005\u0018\u00010\u0097\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009e\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010sR&\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0091\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u0093\u0001\u001a\u0006\b \u0001\u0010¡\u0001R%\u0010£\u0001\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\b,\u0010U\u001a\u0005\b£\u0001\u0010M\"\u0005\b¤\u0001\u0010%R\u001e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u0093\u0001R\u0018\u0010¨\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010UR'\u0010«\u0001\u001a\u00020\"2\u0006\u0010Y\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b©\u0001\u0010M\"\u0005\bª\u0001\u0010%R'\u0010®\u0001\u001a\u00020\"2\u0006\u0010Y\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b¬\u0001\u0010M\"\u0005\b\u00ad\u0001\u0010%R'\u0010±\u0001\u001a\u00020\"2\u0006\u0010Y\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b¯\u0001\u0010M\"\u0005\b°\u0001\u0010%R\u0017\u0010´\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u0018\u0010¸\u0001\u001a\u00030µ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R+\u0010¾\u0001\u001a\u00030¹\u00012\u0007\u0010Y\u001a\u00030¹\u00018B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010À\u0001\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010MR\u0018\u0010Ä\u0001\u001a\u00030Á\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010Ç\u0001\u001a\u0004\u0018\u0001018F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0016\u0010É\u0001\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010MR\u0018\u0010Ë\u0001\u001a\u00030µ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010·\u0001R\u0013\u0010Í\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010MR\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Î\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0019\u0010Ó\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010Ò\u0001R\u0016\u0010Õ\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\\R\u0016\u0010×\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\\¨\u0006Ù\u0001"}, d2 = {"Landroidx/compose/ui/node/l;", "Le4/a2;", "Le4/v0;", "Lg4/b;", "Lg4/m0;", "Landroidx/compose/ui/node/h;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/h;)V", "Loq/i0;", "y1", "()V", "Landroidx/compose/ui/node/g;", "node", "S2", "(Landroidx/compose/ui/node/g;)V", "Lc5/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Ln3/a2;", "layerBlock", "Lq3/c;", "layer", "G2", "(JFLer/l;Lq3/c;)V", "C2", "B1", "p2", "z2", "h2", "t2", "T", "", "inLookahead", "m2", "(Z)V", "", "Le4/a;", "", "y", "()Ljava/util/Map;", "block", "F", "(Ler/l;)V", "requestLayout", "B0", "r2", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "o0", "(J)Le4/a2;", "F2", "(J)V", "I2", "(J)Z", "W0", "(JFLer/l;)V", "Z0", "(JFLq3/c;)V", "newMFR", "R", "alignmentLine", "I", "(Le4/a;)I", "height", "e0", "(I)I", "m0", "width", "U", "n", "forceRequest", "Y1", "Z1", "T2", "()Z", "E2", "J2", "D2", "v2", "f", "Landroidx/compose/ui/node/h;", "g", "Z", "relayoutWithoutParentInProgress", "h", "previousPlaceOrder", "value", "j", "i0", "()I", "Q2", "(I)V", "placeOrder", "Landroidx/compose/ui/node/g$g;", "k", "Landroidx/compose/ui/node/g$g;", "R1", "()Landroidx/compose/ui/node/g$g;", "P2", "(Landroidx/compose/ui/node/g$g;)V", "measuredByParent", "l", "duringAlignmentLinesQuery", "m", "X1", "setPlacedOnce$ui", "placedOnce", "measuredOnce", "p", "Lc5/b;", "lookaheadConstraints", "q", "J", "lastPosition", "r", "lastZIndex", "s", "Ler/l;", "lastLayerBlock", "t", "Lq3/c;", "lastExplicitLayer", "Landroidx/compose/ui/node/l$a;", "v", "Landroidx/compose/ui/node/l$a;", "_placedState", "Lg4/a;", "w", "Lg4/a;", "i", "()Lg4/a;", "alignmentLines", "Ln2/c;", "x", "Ln2/c;", "_childDelegates", "getChildDelegatesDirty$ui", "K2", "childDelegatesDirty", "z", "J1", "layingOutChildren", "Lkotlin/Function0;", "A", "Ler/a;", "layoutChildrenBlock", "B", "parentDataDirty", "", "C", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "parentData", ip.a.f96138c, "performMeasureConstraints", "E", "getPerformMeasureBlock$ui", "()Ler/a;", "performMeasureBlock", "isPlacedUnderMotionFrameOfReference", "R2", "G", "layoutModifierBlock", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "onNodePlacedCalled", "getMeasurePending", "O2", "measurePending", "M1", "L2", "layoutPending", "N1", "M2", "layoutPendingForAlignment", "A2", "()Landroidx/compose/ui/node/g;", "layoutNode", "Landroidx/compose/ui/node/NodeCoordinator;", "W1", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "Landroidx/compose/ui/node/g$e;", "O1", "()Landroidx/compose/ui/node/g$e;", "N2", "(Landroidx/compose/ui/node/g$e;)V", "layoutState", "E1", "detachedFromParentLookaheadPlacement", "Landroidx/compose/ui/node/n;", "Q1", "()Landroidx/compose/ui/node/n;", "measurePassDelegate", "G1", "()Lc5/b;", "lastConstraints", "a2", "isPlaced", "X", "innerCoordinator", "V1", "needsToBePlacedInApproach", "", "C1", "()Ljava/util/List;", "childDelegates", "()Lg4/b;", "parentAlignmentLinesOwner", "P0", "measuredWidth", "L0", "measuredHeight", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends a2 implements v0, g4.b, m0 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h layoutNodeLayoutDelegate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean placedOnce;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean measuredOnce;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private c5.b lookaheadConstraints;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float lastZIndex;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private er.l<? super n3.a2, i0> lastLayerBlock;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private q3.c lastExplicitLayer;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean layingOutChildren;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int previousPlaceOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int placeOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private g.EnumC0220g measuredByParent = g.EnumC0220g.NotUsed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long lastPosition = c5.n.INSTANCE.b();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private a _placedState = a.IsNotPlaced;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final g4.a alignmentLines = new g4.i0(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final n2.c<l> _childDelegates = new n2.c<>(new l[16], 0);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean childDelegatesDirty = true;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final er.a<i0> layoutChildrenBlock = new c();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean parentDataDirty = true;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private Object parentData = Q1().getParentData();

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private long performMeasureConstraints = c5.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final er.a<i0> performMeasureBlock = new e();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final er.a<i0> layoutModifierBlock = new d();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum a {
        IsPlacedInLookahead,
        IsPlacedInApproach,
        IsNotPlaced;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f10213e = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f10215b;

        static {
            int[] iArr = new int[g.e.values().length];
            try {
                iArr[g.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.e.LayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.e.LookaheadLayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10214a = iArr;
            int[] iArr2 = new int[g.EnumC0220g.values().length];
            try {
                iArr2[g.EnumC0220g.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g.EnumC0220g.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f10215b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.a<i0> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4/b;", "child", "Loq/i0;", "c", "(Lg4/b;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends w implements er.l<g4.b, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f10217b = new a();

            a() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(g4.b bVar) {
                c(bVar);
                return i0.f148189a;
            }

            public final void c(g4.b bVar) {
                bVar.getAlignmentLines().t(false);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4/b;", "child", "Loq/i0;", "c", "(Lg4/b;)V"}, k = 3, mv = {2, 1, 0})
        static final class b extends w implements er.l<g4.b, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f10218b = new b();

            b() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(g4.b bVar) {
                c(bVar);
                return i0.f148189a;
            }

            public final void c(g4.b bVar) {
                bVar.getAlignmentLines().q(bVar.getAlignmentLines().getUsedDuringParentLayout());
            }
        }

        c() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            l.this.B1();
            l.this.F(a.f10217b);
            k lookaheadDelegate = l.this.X().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
                List<g> listR = l.this.A2().R();
                int size = listR.size();
                for (int i15 = 0; i15 < size; i15++) {
                    k lookaheadDelegate2 = listR.get(i15).y0().getLookaheadDelegate();
                    if (lookaheadDelegate2 != null) {
                        lookaheadDelegate2.p2(isPlacingForAlignment);
                    }
                }
            }
            l.this.X().getLookaheadDelegate().J1().k();
            k lookaheadDelegate3 = l.this.X().getLookaheadDelegate();
            if (lookaheadDelegate3 != null) {
                lookaheadDelegate3.getIsPlacingForAlignment();
                List<g> listR2 = l.this.A2().R();
                int size2 = listR2.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    k lookaheadDelegate4 = listR2.get(i16).y0().getLookaheadDelegate();
                    if (lookaheadDelegate4 != null) {
                        lookaheadDelegate4.p2(false);
                    }
                }
            }
            l.this.y1();
            l.this.F(b.f10218b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements er.a<i0> {
        d() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            k lookaheadDelegate;
            a2.a placementScope = null;
            if (h0.a(l.this.A2()) || l.this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement()) {
                NodeCoordinator wrappedBy = l.this.W1().getWrappedBy();
                if (wrappedBy != null) {
                    placementScope = wrappedBy.getPlacementScope();
                }
            } else {
                NodeCoordinator wrappedBy2 = l.this.W1().getWrappedBy();
                if (wrappedBy2 != null && (lookaheadDelegate = wrappedBy2.getLookaheadDelegate()) != null) {
                    placementScope = lookaheadDelegate.getPlacementScope();
                }
            }
            if (placementScope == null) {
                placementScope = g0.b(l.this.A2()).getPlacementScope();
            }
            l lVar = l.this;
            a2.a.G(placementScope, lVar.W1().getLookaheadDelegate(), lVar.lastPosition, 0.0f, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class e extends w implements er.a<i0> {
        e() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            l.this.W1().getLookaheadDelegate().o0(l.this.performMeasureConstraints);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4/b;", "it", "Loq/i0;", "c", "(Lg4/b;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends w implements er.l<g4.b, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f10221b = new f();

        f() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(g4.b bVar) {
            c(bVar);
            return i0.f148189a;
        }

        public final void c(g4.b bVar) {
            bVar.getAlignmentLines().u(false);
        }
    }

    public l(h hVar) {
        this.layoutNodeLayoutDelegate = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g A2() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1() {
        this.layoutNodeLayoutDelegate.X(0);
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            l lookaheadPassDelegate = gVarArr[i15].getLayoutDelegate().getLookaheadPassDelegate();
            lookaheadPassDelegate.previousPlaceOrder = lookaheadPassDelegate.getPlaceOrder();
            lookaheadPassDelegate.Q2(Integer.MAX_VALUE);
            if (lookaheadPassDelegate.measuredByParent == g.EnumC0220g.InLayoutBlock) {
                lookaheadPassDelegate.measuredByParent = g.EnumC0220g.NotUsed;
            }
        }
    }

    private final void C2() {
        g.EnumC0220g intrinsicsUsageByParent;
        g.J1(A2(), false, false, false, 7, null);
        g gVarC0 = A2().C0();
        if (gVarC0 == null || A2().getIntrinsicsUsageByParent() != g.EnumC0220g.NotUsed) {
            return;
        }
        g gVarA2 = A2();
        int i15 = b.f10214a[gVarC0.i0().ordinal()];
        if (i15 != 2) {
            intrinsicsUsageByParent = i15 != 3 ? gVarC0.getIntrinsicsUsageByParent() : g.EnumC0220g.InLayoutBlock;
        } else {
            intrinsicsUsageByParent = g.EnumC0220g.InMeasureBlock;
        }
        gVarA2.Z1(intrinsicsUsageByParent);
    }

    private final boolean E1() {
        return this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement();
    }

    private final void G2(long position, float zIndex, er.l<? super n3.a2, i0> layerBlock, q3.c layer) throws Throwable {
        g gVarA2 = A2();
        try {
            g gVarC0 = A2().C0();
            g.e eVarI0 = gVarC0 != null ? gVarC0.i0() : null;
            g.e eVar = g.e.LookaheadLayingOut;
            if (eVarI0 == eVar) {
                this.layoutNodeLayoutDelegate.Q(false);
            }
            if (A2().getIsDeactivated()) {
                d4.a.a("place is called on a deactivated node");
            }
            N2(eVar);
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!c5.n.h(position, this.lastPosition)) {
                if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    L2(true);
                }
                r2();
            }
            Owner ownerB = g0.b(A2());
            this.lastPosition = position;
            if (M1() || !a2()) {
                this.layoutNodeLayoutDelegate.S(false);
                getAlignmentLines().r(false);
                c1 snapshotObserver = ownerB.getSnapshotObserver();
                snapshotObserver.observer.k(A2(), snapshotObserver.onCommitAffectingLayoutModifierInLookahead, this.layoutModifierBlock);
            } else {
                W1().getLookaheadDelegate().L2(position);
                E2();
            }
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.lastExplicitLayer = layer;
            N2(g.e.Idle);
            i0 i0Var = i0.f148189a;
        } catch (Throwable th4) {
            gVarA2.S1(th4);
            throw new oq.g();
        }
    }

    private final void L2(boolean z15) {
        this.layoutNodeLayoutDelegate.U(z15);
    }

    private final boolean M1() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPending();
    }

    private final void M2(boolean z15) {
        this.layoutNodeLayoutDelegate.V(z15);
    }

    private final boolean N1() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPendingForAlignment();
    }

    private final void N2(g.e eVar) {
        this.layoutNodeLayoutDelegate.R(eVar);
    }

    private final g.e O1() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    private final void O2(boolean z15) {
        this.layoutNodeLayoutDelegate.W(z15);
    }

    private final void S2(g node) {
        g.EnumC0220g enumC0220g;
        g gVarC0 = node.C0();
        if (gVarC0 == null) {
            this.measuredByParent = g.EnumC0220g.NotUsed;
            return;
        }
        if (!(this.measuredByParent == g.EnumC0220g.NotUsed || node.getCanMultiMeasure())) {
            d4.a.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
        }
        int i15 = b.f10214a[gVarC0.i0().ordinal()];
        if (i15 == 1 || i15 == 2) {
            enumC0220g = g.EnumC0220g.InMeasureBlock;
        } else {
            if (i15 != 3 && i15 != 4) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + gVarC0.i0());
            }
            enumC0220g = g.EnumC0220g.InLayoutBlock;
        }
        this.measuredByParent = enumC0220g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCoordinator W1() {
        return this.layoutNodeLayoutDelegate.z();
    }

    private final void p2() {
        a aVar = this._placedState;
        if (E1()) {
            this._placedState = a.IsPlacedInApproach;
        } else {
            this._placedState = a.IsPlacedInLookahead;
        }
        if (aVar != a.IsPlacedInLookahead && this.layoutNodeLayoutDelegate.getLookaheadMeasurePending()) {
            g.J1(A2(), true, false, false, 6, null);
        }
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = gVarArr[i15];
            l lVarL0 = gVar.l0();
            if (lVarL0 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (lVarL0.getPlaceOrder() != Integer.MAX_VALUE) {
                lVarL0.p2();
                gVar.P1(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1() {
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            l lookaheadPassDelegate = gVarArr[i15].getLayoutDelegate().getLookaheadPassDelegate();
            if (lookaheadPassDelegate.previousPlaceOrder != lookaheadPassDelegate.getPlaceOrder() && lookaheadPassDelegate.getPlaceOrder() == Integer.MAX_VALUE) {
                lookaheadPassDelegate.m2(true);
            }
        }
    }

    private final void z2() {
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = gVarArr[i15];
            if (gVar.k0() && gVar.s0() == g.EnumC0220g.InMeasureBlock && gVar.getLayoutDelegate().getLookaheadPassDelegate().I2(gVar.getLayoutDelegate().k().getValue())) {
                g.J1(A2(), false, false, false, 7, null);
            }
        }
    }

    @Override // g4.b
    public void B0() {
        g.J1(A2(), false, false, false, 7, null);
    }

    public final List<l> C1() {
        A2().R();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.i();
        }
        g gVarA2 = A2();
        n2.c<l> cVar = this._childDelegates;
        n2.c<g> cVarL0 = gVarA2.L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = gVarArr[i15];
            if (cVar.getSize() <= i15) {
                cVar.d(gVar.getLayoutDelegate().getLookaheadPassDelegate());
            } else {
                cVar.z(i15, gVar.getLayoutDelegate().getLookaheadPassDelegate());
            }
        }
        cVar.w(gVarA2.R().size(), cVar.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.i();
    }

    public final void D2() {
        Q2(Integer.MAX_VALUE);
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this._placedState = a.IsNotPlaced;
    }

    public final void E2() {
        this.onNodePlacedCalled = true;
        g gVarC0 = A2().C0();
        if ((this._placedState != a.IsPlacedInLookahead && !E1()) || (this._placedState != a.IsPlacedInApproach && E1())) {
            p2();
            if (this.relayoutWithoutParentInProgress && gVarC0 != null) {
                g.H1(gVarC0, false, 1, null);
            }
        }
        if (gVarC0 == null) {
            Q2(0);
        } else if (!this.relayoutWithoutParentInProgress && (gVarC0.i0() == g.e.LayingOut || gVarC0.i0() == g.e.LookaheadLayingOut)) {
            if (!(getPlaceOrder() == Integer.MAX_VALUE)) {
                d4.a.c("Place was called on a node which was placed already");
            }
            Q2(gVarC0.getLayoutDelegate().getNextChildLookaheadPlaceOrder());
            h layoutDelegate = gVarC0.getLayoutDelegate();
            layoutDelegate.X(layoutDelegate.getNextChildLookaheadPlaceOrder() + 1);
        }
        T();
    }

    @Override // g4.b
    public void F(er.l<? super g4.b, i0> block) {
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            block.b(gVarArr[i15].getLayoutDelegate().o());
        }
    }

    public final void F2(long constraints) {
        N2(g.e.LookaheadMeasuring);
        O2(false);
        this.performMeasureConstraints = constraints;
        c1 snapshotObserver = g0.b(A2()).getSnapshotObserver();
        g gVarA2 = A2();
        er.a<i0> aVar = this.performMeasureBlock;
        snapshotObserver.observer.k(gVarA2, snapshotObserver.onCommitAffectingLookaheadMeasure, aVar);
        h2();
        if (h0.a(A2())) {
            Q1().r2();
        } else {
            Q1().t2();
        }
        N2(g.e.Idle);
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final c5.b getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    @Override // g4.b
    public g4.b H() {
        h layoutDelegate;
        g gVarC0 = A2().C0();
        if (gVarC0 == null || (layoutDelegate = gVarC0.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.o();
    }

    @Override // p036e4.z0
    public int I(p036e4.a alignmentLine) {
        g gVarC0 = A2().C0();
        if ((gVarC0 != null ? gVarC0.i0() : null) == g.e.LookaheadMeasuring) {
            getAlignmentLines().u(true);
        } else {
            g gVarC1 = A2().C0();
            if ((gVarC1 != null ? gVarC1.i0() : null) == g.e.LookaheadLayingOut) {
                getAlignmentLines().t(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int I = W1().getLookaheadDelegate().I(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return I;
    }

    public final boolean I2(long constraints) throws Throwable {
        long jC;
        g gVarA2 = A2();
        try {
            if (A2().getIsDeactivated()) {
                d4.a.a("measure is called on a deactivated node");
            }
            g gVarC0 = A2().C0();
            A2().U1(A2().getCanMultiMeasure() || (gVarC0 != null && gVarC0.getCanMultiMeasure()));
            if (!A2().k0()) {
                c5.b bVar = this.lookaheadConstraints;
                if (bVar == null ? false : c5.b.f(bVar.getValue(), constraints)) {
                    Owner owner = A2().getOwner();
                    if (owner != null) {
                        owner.s(A2(), true);
                    }
                    A2().R1();
                    return false;
                }
            }
            this.lookaheadConstraints = c5.b.a(constraints);
            j1(constraints);
            getAlignmentLines().s(false);
            F(f.f10221b);
            if (this.measuredOnce) {
                jC = getMeasuredSize();
            } else {
                long j15 = PKIFailureInfo.systemUnavail;
                jC = c5.r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
            }
            this.measuredOnce = true;
            k lookaheadDelegate = W1().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                d4.a.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            this.layoutNodeLayoutDelegate.J(constraints);
            d1(c5.r.c((((long) lookaheadDelegate.getHeight()) & BodyPartID.bodyIdMax) | (((long) lookaheadDelegate.getWidth()) << 32)));
            return (((int) (jC >> 32)) == lookaheadDelegate.getWidth() && ((int) (jC & BodyPartID.bodyIdMax)) == lookaheadDelegate.getHeight()) ? false : true;
        } catch (Throwable th4) {
            gVarA2.S1(th4);
            throw new oq.g();
        }
    }

    /* JADX INFO: renamed from: J1, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final void J2() {
        l lVar;
        g gVarC0;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                d4.a.c("replace() called on item that was not placed");
            }
            this.onNodePlacedCalled = false;
            boolean zA2 = a2();
            lVar = this;
            try {
                lVar.G2(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
                if (zA2 && !lVar.onNodePlacedCalled && (gVarC0 = A2().C0()) != null) {
                    g.H1(gVarC0, false, 1, null);
                }
                lVar.relayoutWithoutParentInProgress = false;
            } catch (Throwable th4) {
                th = th4;
                lVar.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            lVar = this;
        }
    }

    public final void K2(boolean z15) {
        this.childDelegatesDirty = z15;
    }

    @Override // p036e4.a2
    public int L0() {
        return W1().getLookaheadDelegate().L0();
    }

    @Override // p036e4.a2
    public int P0() {
        return W1().getLookaheadDelegate().P0();
    }

    public final void P2(g.EnumC0220g enumC0220g) {
        this.measuredByParent = enumC0220g;
    }

    public final n Q1() {
        return this.layoutNodeLayoutDelegate.getMeasurePassDelegate();
    }

    public void Q2(int i15) {
        this.placeOrder = i15;
    }

    @Override // g4.m0
    public void R(boolean newMFR) {
        k lookaheadDelegate;
        k lookaheadDelegate2 = W1().getLookaheadDelegate();
        if (!t.c(Boolean.valueOf(newMFR), lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.getIsPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = W1().getLookaheadDelegate()) != null) {
            lookaheadDelegate.m2(newMFR);
        }
        R2(newMFR);
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final g.EnumC0220g getMeasuredByParent() {
        return this.measuredByParent;
    }

    public void R2(boolean z15) {
        this.isPlacedUnderMotionFrameOfReference = z15;
    }

    @Override // g4.b
    public void T() {
        this.layingOutChildren = true;
        getAlignmentLines().o();
        if (M1()) {
            z2();
        }
        k lookaheadDelegate = X().getLookaheadDelegate();
        if (N1() || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && M1())) {
            L2(false);
            g.e eVarO1 = O1();
            N2(g.e.LookaheadLayingOut);
            this.layoutNodeLayoutDelegate.T(false);
            c1 snapshotObserver = g0.b(A2()).getSnapshotObserver();
            g gVarA2 = A2();
            er.a<i0> aVar = this.layoutChildrenBlock;
            snapshotObserver.observer.k(gVarA2, snapshotObserver.onCommitAffectingLookahead, aVar);
            N2(eVarO1);
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                requestLayout();
            }
            M2(false);
        }
        if (getAlignmentLines().getUsedDuringParentLayout()) {
            getAlignmentLines().q(true);
        }
        if (getAlignmentLines().getDirty() && getAlignmentLines().k()) {
            getAlignmentLines().n();
        }
        this.layingOutChildren = false;
    }

    public final boolean T2() {
        if ((getParentData() == null && W1().getLookaheadDelegate().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = W1().getLookaheadDelegate().getParentData();
        return true;
    }

    @Override // p036e4.v
    public int U(int width) {
        C2();
        return W1().getLookaheadDelegate().U(width);
    }

    public final boolean V1() {
        return h0.a(A2()) || E1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036e4.a2
    public void W0(long position, float zIndex, er.l<? super n3.a2, i0> layerBlock) throws Throwable {
        G2(position, zIndex, layerBlock, null);
    }

    @Override // g4.b
    public NodeCoordinator X() {
        return A2().b0();
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final boolean getPlacedOnce() {
        return this.placedOnce;
    }

    public final void Y1(boolean forceRequest) {
        g gVar;
        g gVarC0 = A2().C0();
        g.EnumC0220g intrinsicsUsageByParent = A2().getIntrinsicsUsageByParent();
        if (gVarC0 == null || intrinsicsUsageByParent == g.EnumC0220g.NotUsed) {
            return;
        }
        do {
            gVar = gVarC0;
            if (gVar.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                break;
            } else {
                gVarC0 = gVar.C0();
            }
        } while (gVarC0 != null);
        int i15 = b.f10215b[intrinsicsUsageByParent.ordinal()];
        if (i15 == 1) {
            if (gVar.getLookaheadRoot() != null) {
                g.J1(gVar, forceRequest, false, false, 6, null);
                return;
            } else {
                g.O1(gVar, forceRequest, false, false, 6, null);
                return;
            }
        }
        if (i15 != 2) {
            throw new IllegalStateException("Intrinsics isn't used by the parent");
        }
        if (gVar.getLookaheadRoot() != null) {
            gVar.G1(forceRequest);
        } else {
            gVar.L1(forceRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036e4.a2
    public void Z0(long position, float zIndex, q3.c layer) throws Throwable {
        G2(position, zIndex, null, layer);
    }

    public final void Z1() {
        this.parentDataDirty = true;
    }

    public final boolean a2() {
        return this._placedState != a.IsNotPlaced;
    }

    @Override // p036e4.z0, p036e4.v
    /* JADX INFO: renamed from: e, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    @Override // p036e4.v
    public int e0(int height) {
        C2();
        return W1().getLookaheadDelegate().e0(height);
    }

    public final void h2() {
        L2(true);
        M2(true);
    }

    @Override // g4.b
    /* JADX INFO: renamed from: i, reason: from getter */
    public g4.a getAlignmentLines() {
        return this.alignmentLines;
    }

    @Override // g4.b
    /* JADX INFO: renamed from: i0, reason: from getter */
    public int getPlaceOrder() {
        return this.placeOrder;
    }

    @Override // p036e4.v
    public int m0(int height) {
        C2();
        return W1().getLookaheadDelegate().m0(height);
    }

    public final void m2(boolean inLookahead) {
        if (inLookahead && V1()) {
            return;
        }
        if (inLookahead || V1()) {
            this._placedState = a.IsNotPlaced;
            n2.c<g> cVarL0 = A2().L0();
            g[] gVarArr = cVarL0.content;
            int size = cVarL0.getSize();
            for (int i15 = 0; i15 < size; i15++) {
                gVarArr[i15].getLayoutDelegate().getLookaheadPassDelegate().m2(true);
            }
        }
    }

    @Override // p036e4.v
    public int n(int width) {
        C2();
        return W1().getLookaheadDelegate().n(width);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // p036e4.v0
    public a2 o0(long constraints) throws Throwable {
        g gVarC0 = A2().C0();
        if ((gVarC0 != null ? gVarC0.i0() : null) == g.e.LookaheadMeasuring) {
            this.layoutNodeLayoutDelegate.P(false);
        } else {
            g gVarC1 = A2().C0();
            if ((gVarC1 != null ? gVarC1.i0() : null) == g.e.LookaheadLayingOut) {
                this.layoutNodeLayoutDelegate.P(false);
            }
        }
        S2(A2());
        if (A2().getIntrinsicsUsageByParent() == g.EnumC0220g.NotUsed) {
            A2().D();
        }
        I2(constraints);
        return this;
    }

    public final void r2() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
            n2.c<g> cVarL0 = A2().L0();
            g[] gVarArr = cVarL0.content;
            int size = cVarL0.getSize();
            for (int i15 = 0; i15 < size; i15++) {
                g gVar = gVarArr[i15];
                h layoutDelegate = gVar.getLayoutDelegate();
                if ((layoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLookaheadLayoutPending()) {
                    g.H1(gVar, false, 1, null);
                }
                l lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.r2();
                }
            }
        }
    }

    @Override // g4.b
    public void requestLayout() {
        g.H1(A2(), false, 1, null);
    }

    public final void t2() {
        if (this._placedState != a.IsNotPlaced || h0.a(A2())) {
            return;
        }
        this.layoutNodeLayoutDelegate.Q(true);
    }

    public final void v2() {
        this._placedState = a.IsPlacedInLookahead;
    }

    @Override // g4.b
    public Map<p036e4.a, Integer> y() {
        if (!this.duringAlignmentLinesQuery) {
            if (O1() == g.e.LookaheadMeasuring) {
                getAlignmentLines().s(true);
                if (getAlignmentLines().getDirty()) {
                    this.layoutNodeLayoutDelegate.E();
                }
            } else {
                getAlignmentLines().r(true);
            }
        }
        k lookaheadDelegate = X().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            lookaheadDelegate.p2(true);
        }
        T();
        k lookaheadDelegate2 = X().getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            lookaheadDelegate2.p2(false);
        }
        return getAlignmentLines().h();
    }
}
