package androidx.compose.ui.node;

import android.os.Trace;
import fr.t;
import fr.w;
import g4.c1;
import g4.d0;
import g4.g0;
import g4.h0;
import g4.m0;
import java.util.List;
import java.util.Map;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u000bJ\u000f\u0010#\u001a\u00020\tH\u0000¢\u0006\u0004\b#\u0010\u000bJ\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010*J\u0018\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0096\u0002¢\u0006\u0004\b.\u0010/J5\u00100\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017H\u0014¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\t2\u0006\u00104\u001a\u00020(H\u0016¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\t¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00109\u001a\u00020-2\u0006\u00108\u001a\u00020-H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020-2\u0006\u00108\u001a\u00020-H\u0016¢\u0006\u0004\b;\u0010:J\u0017\u0010=\u001a\u00020-2\u0006\u0010<\u001a\u00020-H\u0016¢\u0006\u0004\b=\u0010:J\u0017\u0010>\u001a\u00020-2\u0006\u0010<\u001a\u00020-H\u0016¢\u0006\u0004\b>\u0010:J\r\u0010?\u001a\u00020\t¢\u0006\u0004\b?\u0010\u000bJ\r\u0010@\u001a\u00020(¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020-0BH\u0016¢\u0006\u0004\bC\u0010DJ#\u0010F\u001a\u00020\t2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010\u000bJ\u000f\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bI\u0010\u000bJ\r\u0010J\u001a\u00020\t¢\u0006\u0004\bJ\u0010\u000bJ\u0015\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020(¢\u0006\u0004\bL\u00106J\r\u0010M\u001a\u00020\t¢\u0006\u0004\bM\u0010\u000bJ\r\u0010N\u001a\u00020\t¢\u0006\u0004\bN\u0010\u000bJ\u000f\u0010O\u001a\u00020\tH\u0000¢\u0006\u0004\bO\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010Y\u001a\u00020-2\u0006\u0010U\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010.\u001a\u0004\bW\u0010XR$\u0010\\\u001a\u00020-2\u0006\u0010U\u001a\u00020-8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bZ\u0010.\u001a\u0004\b[\u0010XR\u0016\u0010^\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010SR$\u0010a\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010S\u001a\u0004\b`\u0010AR\"\u0010i\u001a\u00020b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010l\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010S\u001a\u0004\bj\u0010A\"\u0004\bk\u00106R$\u0010q\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR$\u0010t\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010y\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010FR\u0016\u0010{\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010SR*\u0010\u0081\u0001\u001a\u0004\u0018\u00010|2\b\u0010U\u001a\u0004\u0018\u00010|8\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0085\u0001\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010S\u001a\u0005\b\u0083\u0001\u0010A\"\u0005\b\u0084\u0001\u00106R.\u0010\u0089\u0001\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010S\u001a\u0005\b\u0087\u0001\u0010A\"\u0005\b\u0088\u0001\u00106R&\u0010\u008b\u0001\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\bC\u0010S\u001a\u0005\b\u008a\u0001\u0010AR'\u0010\u008e\u0001\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010S\u001a\u0005\b\u008d\u0001\u0010AR\u0018\u0010\u0090\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010SR \u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010\u009e\u0001\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010S\u001a\u0005\b\u009c\u0001\u0010A\"\u0005\b\u009d\u0001\u00106R'\u0010¡\u0001\u001a\u00020(2\u0006\u0010U\u001a\u00020(8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010S\u001a\u0005\b \u0001\u0010AR\u0017\u0010¢\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010nR&\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\t0£\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001e\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020\t0£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010¥\u0001R&\u0010\u0016\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0004\b.\u0010F\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010SR&\u0010°\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¯\u0001\u0010sR\u001a\u0010²\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010vR\u0018\u0010´\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010nR\u0017\u0010µ\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010FR\u001d\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\t0£\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010¥\u0001R\u0018\u0010¸\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0001\u0010SR&\u0010º\u0001\u001a\u00020(8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b¹\u0001\u0010S\u001a\u0005\bº\u0001\u0010A\"\u0005\b»\u0001\u00106R\u001a\u0010¿\u0001\u001a\u0005\u0018\u00010¼\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010Â\u0001\u001a\u0004\u0018\u00010$8F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0014\u0010Å\u0001\u001a\u00020\u000f8F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R+\u0010Ë\u0001\u001a\u00030Æ\u00012\u0007\u0010U\u001a\u00030Æ\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R\u0015\u0010Ï\u0001\u001a\u00030Ì\u00018F¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ð\u0001\u001a\u00030Ì\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010Î\u0001R\u001e\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Ñ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010Ö\u0001\u001a\u00020-8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010XR\u0016\u0010Ø\u0001\u001a\u00020-8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010XR\u0019\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010Ù\u0001¨\u0006Û\u0001"}, d2 = {"Landroidx/compose/ui/node/n;", "Le4/v0;", "Le4/a2;", "Lg4/b;", "Lg4/m0;", "Landroidx/compose/ui/node/h;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/h;)V", "Loq/i0;", "C1", "()V", "z2", "v2", "E1", "Landroidx/compose/ui/node/g;", "node", "R2", "(Landroidx/compose/ui/node/g;)V", "Lc5/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Ln3/a2;", "layerBlock", "Lq3/c;", "layer", "I2", "(JFLer/l;Lq3/c;)V", "G2", "D2", "C2", "p2", "T", "F2", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "o0", "(J)Le4/a2;", "", "J2", "(J)Z", "Le4/a;", "alignmentLine", "", "I", "(Le4/a;)I", "W0", "(JFLer/l;)V", "Z0", "(JFLq3/c;)V", "newMFR", "R", "(Z)V", "K2", "height", "e0", "(I)I", "m0", "width", "U", "n", "a2", "S2", "()Z", "", "y", "()Ljava/util/Map;", "block", "F", "(Ler/l;)V", "requestLayout", "B0", "L2", "forceRequest", "Z1", "E2", "r2", "t2", "f", "Landroidx/compose/ui/node/h;", "g", "Z", "relayoutWithoutParentInProgress", "value", "h", "getPreviousPlaceOrder$ui", "()I", "previousPlaceOrder", "j", "i0", "placeOrder", "k", "measuredOnce", "l", "getPlacedOnce", "placedOnce", "Landroidx/compose/ui/node/g$g;", "m", "Landroidx/compose/ui/node/g$g;", "V1", "()Landroidx/compose/ui/node/g$g;", "O2", "(Landroidx/compose/ui/node/g$g;)V", "measuredByParent", "getDuringAlignmentLinesQuery$ui", "setDuringAlignmentLinesQuery$ui", "duringAlignmentLinesQuery", "p", "J", "getLastPosition-nOcc-ac$ui", "()J", "lastPosition", "q", "Ler/l;", "lastLayerBlock", "r", "Lq3/c;", "lastExplicitLayer", "s", "lastZIndex", "t", "parentDataDirty", "", "v", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "parentData", "w", "h2", "P2", "isPlaced", "x", "m2", "setPlacedByParent$ui", "isPlacedByParent", "R1", "measurePending", "z", "N1", "layoutPending", "A", "layoutPendingForAlignment", "Lg4/a;", "B", "Lg4/a;", "i", "()Lg4/a;", "alignmentLines", "Ln2/c;", "C", "Ln2/c;", "_childDelegates", ip.a.f96138c, "getChildDelegatesDirty$ui", "M2", "childDelegatesDirty", "E", "M1", "layingOutChildren", "performMeasureConstraints", "Lkotlin/Function0;", "G", "Ler/a;", "X1", "()Ler/a;", "performMeasureBlock", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "layoutChildrenBlock", "Y1", "()F", "K", "onNodePlacedCalled", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "placeOuterCoordinatorLayerBlock", "O", "placeOuterCoordinatorLayer", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "placeOuterCoordinatorPosition", "placeOuterCoordinatorZIndex", "placeOuterCoordinatorBlock", "X", "needsCoordinatesUpdate", "Y", "isPlacedUnderMotionFrameOfReference", "Q2", "Landroidx/compose/ui/node/l;", "Q1", "()Landroidx/compose/ui/node/l;", "lookaheadPassDelegate", "J1", "()Lc5/b;", "lastConstraints", "A2", "()Landroidx/compose/ui/node/g;", "layoutNode", "Landroidx/compose/ui/node/g$e;", "O1", "()Landroidx/compose/ui/node/g$e;", "N2", "(Landroidx/compose/ui/node/g$e;)V", "layoutState", "Landroidx/compose/ui/node/NodeCoordinator;", "W1", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "innerCoordinator", "", "G1", "()Ljava/util/List;", "childDelegates", "P0", "measuredWidth", "L0", "measuredHeight", "()Lg4/b;", "parentAlignmentLinesOwner", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends a2 implements v0, g4.b, m0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final g4.a alignmentLines;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final n2.c<n> _childDelegates;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean childDelegatesDirty;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean layingOutChildren;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long performMeasureConstraints;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final er.a<i0> performMeasureBlock;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final er.a<i0> layoutChildrenBlock;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private er.l<? super n3.a2, i0> placeOuterCoordinatorLayerBlock;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private q3.c placeOuterCoordinatorLayer;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private long placeOuterCoordinatorPosition;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private float placeOuterCoordinatorZIndex;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final er.a<i0> placeOuterCoordinatorBlock;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private boolean needsCoordinatesUpdate;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h layoutNodeLayoutDelegate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean measuredOnce;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean placedOnce;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long lastPosition;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private er.l<? super n3.a2, i0> lastLayerBlock;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private q3.c lastExplicitLayer;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float lastZIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean parentDataDirty;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Object parentData;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isPlaced;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedByParent;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean measurePending;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPending;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int previousPlaceOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int placeOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private g.EnumC0220g measuredByParent = g.EnumC0220g.NotUsed;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f10255b;

        static {
            int[] iArr = new int[g.e.values().length];
            try {
                iArr[g.e.Measuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.e.LayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10254a = iArr;
            int[] iArr2 = new int[g.EnumC0220g.values().length];
            try {
                iArr2[g.EnumC0220g.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g.EnumC0220g.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f10255b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements er.a<i0> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4/b;", "it", "Loq/i0;", "c", "(Lg4/b;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends w implements er.l<g4.b, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f10257b = new a();

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

        /* JADX INFO: renamed from: androidx.compose.ui.node.n$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4/b;", "it", "Loq/i0;", "c", "(Lg4/b;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0221b extends w implements er.l<g4.b, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0221b f10258b = new C0221b();

            C0221b() {
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

        b() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            n.this.E1();
            n.this.F(a.f10257b);
            if (n.this.X().getIsPlacingForAlignment()) {
                List<g> listR = n.this.A2().R();
                int size = listR.size();
                for (int i15 = 0; i15 < size; i15++) {
                    listR.get(i15).y0().p2(true);
                }
            }
            n.this.X().J1().k();
            if (n.this.X().getIsPlacingForAlignment()) {
                List<g> listR2 = n.this.A2().R();
                int size2 = listR2.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    listR2.get(i16).y0().p2(false);
                }
            }
            n.this.C1();
            n.this.F(C0221b.f10258b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.a<i0> {
        c() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            n.this.W1().o0(n.this.performMeasureConstraints);
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
            a2.a placementScope;
            NodeCoordinator wrappedBy = n.this.W1().getWrappedBy();
            if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                placementScope = g0.b(n.this.A2()).getPlacementScope();
            }
            a2.a aVar = placementScope;
            n nVar = n.this;
            er.l<? super n3.a2, i0> lVar = nVar.placeOuterCoordinatorLayerBlock;
            q3.c cVar = nVar.placeOuterCoordinatorLayer;
            if (cVar != null) {
                aVar.i0(nVar.W1(), nVar.placeOuterCoordinatorPosition, cVar, nVar.placeOuterCoordinatorZIndex);
            } else if (lVar == null) {
                aVar.F(nVar.W1(), nVar.placeOuterCoordinatorPosition, nVar.placeOuterCoordinatorZIndex);
            } else {
                aVar.e0(nVar.W1(), nVar.placeOuterCoordinatorPosition, nVar.placeOuterCoordinatorZIndex, lVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg4/b;", "it", "Loq/i0;", "c", "(Lg4/b;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends w implements er.l<g4.b, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f10261b = new e();

        e() {
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

    public n(h hVar) {
        this.layoutNodeLayoutDelegate = hVar;
        c5.n.Companion companion = c5.n.INSTANCE;
        this.lastPosition = companion.b();
        this.parentDataDirty = true;
        this.alignmentLines = new d0(this);
        this._childDelegates = new n2.c<>(new n[16], 0);
        this.childDelegatesDirty = true;
        this.performMeasureConstraints = c5.c.b(0, 0, 0, 0, 15, null);
        this.performMeasureBlock = new c();
        this.layoutChildrenBlock = new b();
        this.placeOuterCoordinatorPosition = companion.b();
        this.placeOuterCoordinatorBlock = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1() {
        g gVarA2 = A2();
        n2.c<g> cVarL0 = gVarA2.L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = gVarArr[i15];
            if (gVar.o0().previousPlaceOrder != gVar.D0()) {
                gVarA2.x1();
                gVarA2.T0();
                if (gVar.D0() == Integer.MAX_VALUE) {
                    if (gVar.getLayoutDelegate().getDetachedFromParentLookaheadPlacement() || h0.a(gVar)) {
                        gVar.l0().m2(false);
                    }
                    gVar.o0().z2();
                }
            }
        }
    }

    private final void C2() {
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = gVarArr[i15];
            if (gVar.p0() && gVar.r0() == g.EnumC0220g.InMeasureBlock && g.B1(gVar, null, 1, null)) {
                g.O1(A2(), false, false, false, 7, null);
            }
        }
    }

    private final void D2() {
        g.EnumC0220g intrinsicsUsageByParent;
        g.O1(A2(), false, false, false, 7, null);
        g gVarC0 = A2().C0();
        if (gVarC0 == null || A2().getIntrinsicsUsageByParent() != g.EnumC0220g.NotUsed) {
            return;
        }
        g gVarA2 = A2();
        int i15 = a.f10254a[gVarC0.i0().ordinal()];
        if (i15 != 1) {
            intrinsicsUsageByParent = i15 != 2 ? gVarC0.getIntrinsicsUsageByParent() : g.EnumC0220g.InLayoutBlock;
        } else {
            intrinsicsUsageByParent = g.EnumC0220g.InMeasureBlock;
        }
        gVarA2.Z1(intrinsicsUsageByParent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1() {
        this.layoutNodeLayoutDelegate.Y(0);
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            n nVarO0 = gVarArr[i15].o0();
            nVarO0.previousPlaceOrder = nVarO0.getPlaceOrder();
            nVarO0.placeOrder = Integer.MAX_VALUE;
            nVarO0.isPlacedByParent = false;
            if (nVarO0.measuredByParent == g.EnumC0220g.InLayoutBlock) {
                nVarO0.measuredByParent = g.EnumC0220g.NotUsed;
            }
        }
    }

    private final void G2(long position, float zIndex, er.l<? super n3.a2, i0> layerBlock, q3.c layer) {
        if (A2().getIsDeactivated()) {
            d4.a.a("place is called on a deactivated node");
        }
        N2(g.e.LayingOut);
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = layerBlock;
        this.lastExplicitLayer = layer;
        this.onNodePlacedCalled = false;
        Owner ownerB = g0.b(A2());
        if (this.layoutPending || !this.isPlaced) {
            getAlignmentLines().r(false);
            this.layoutNodeLayoutDelegate.N(false);
            this.placeOuterCoordinatorLayerBlock = layerBlock;
            this.placeOuterCoordinatorPosition = position;
            this.placeOuterCoordinatorZIndex = zIndex;
            this.placeOuterCoordinatorLayer = layer;
            c1 snapshotObserver = ownerB.getSnapshotObserver();
            g gVarA2 = A2();
            er.a<i0> aVar = this.placeOuterCoordinatorBlock;
            snapshotObserver.observer.k(gVarA2, snapshotObserver.onCommitAffectingLayoutModifier, aVar);
        } else {
            W1().P3(position, zIndex, layerBlock, layer);
            F2();
        }
        N2(g.e.Idle);
        if (W1().getIsPlacingForAlignment() && (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement())) {
            requestLayout();
        }
        this.placedOnce = true;
    }

    private final void I2(long position, float zIndex, er.l<? super n3.a2, i0> layerBlock, q3.c layer) throws Throwable {
        a2.a placementScope;
        g gVarA2 = A2();
        boolean z15 = true;
        try {
            this.isPlacedByParent = true;
            if (!c5.n.h(position, this.lastPosition) || layerBlock != this.lastLayerBlock || this.needsCoordinatesUpdate) {
                if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                    this.layoutPending = true;
                    this.needsCoordinatesUpdate = false;
                }
            }
            l lVarQ1 = Q1();
            if (lVarQ1 != null) {
                lVarQ1.t2();
            }
            l lVarQ2 = Q1();
            if (lVarQ2 != null && lVarQ2.V1()) {
                NodeCoordinator wrappedBy = W1().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = g0.b(A2()).getPlacementScope();
                }
                a2.a aVar = placementScope;
                l lVarQ3 = Q1();
                g gVarC0 = A2().C0();
                if (gVarC0 != null) {
                    gVarC0.getLayoutDelegate().X(0);
                }
                lVarQ3.Q2(Integer.MAX_VALUE);
                a2.a.E(aVar, lVarQ3, c5.n.i(position), c5.n.j(position), 0.0f, 4, null);
            }
            l lVarQ4 = Q1();
            if (lVarQ4 == null || lVarQ4.getPlacedOnce()) {
                z15 = false;
            }
            if (z15) {
                d4.a.c("Error: Placement happened before lookahead.");
            }
            G2(position, zIndex, layerBlock, layer);
            i0 i0Var = i0.f148189a;
        } catch (Throwable th4) {
            gVarA2.S1(th4);
            throw new oq.g();
        }
    }

    private final l Q1() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate();
    }

    private final void R2(g node) {
        g.EnumC0220g enumC0220g;
        g gVarC0 = node.C0();
        if (gVarC0 == null) {
            this.measuredByParent = g.EnumC0220g.NotUsed;
            return;
        }
        if (!(this.measuredByParent == g.EnumC0220g.NotUsed || node.getCanMultiMeasure())) {
            d4.a.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
        }
        int i15 = a.f10254a[gVarC0.i0().ordinal()];
        if (i15 == 1) {
            enumC0220g = g.EnumC0220g.InMeasureBlock;
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + gVarC0.i0());
            }
            enumC0220g = g.EnumC0220g.InLayoutBlock;
        }
        this.measuredByParent = enumC0220g;
    }

    private final void v2() {
        boolean z15 = this.isPlaced;
        this.isPlaced = true;
        g gVarA2 = A2();
        if (!z15) {
            gVarA2.b0().J3();
            g0.b(gVarA2).getRectManager().l(A2());
            if (gVarA2.p0()) {
                g.O1(gVarA2, true, false, false, 6, null);
            } else if (gVarA2.k0()) {
                g.J1(gVarA2, true, false, false, 6, null);
            }
        }
        NodeCoordinator wrapped = gVarA2.b0().getWrapped();
        for (NodeCoordinator nodeCoordinatorY0 = gVarA2.y0(); !t.c(nodeCoordinatorY0, wrapped) && nodeCoordinatorY0 != null; nodeCoordinatorY0 = nodeCoordinatorY0.getWrapped()) {
            if (nodeCoordinatorY0.getLastLayerDrawingWasSkipped()) {
                nodeCoordinatorY0.z3();
            }
        }
        n2.c<g> cVarL0 = gVarA2.L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = gVarArr[i15];
            if (gVar.D0() != Integer.MAX_VALUE) {
                gVar.o0().v2();
                gVarA2.P1(gVar);
            }
        }
    }

    private final void z2() {
        if (this.isPlaced) {
            this.isPlaced = false;
            g0.b(A2()).getRectManager().n(A2());
            g gVarA2 = A2();
            NodeCoordinator wrapped = gVarA2.b0().getWrapped();
            for (NodeCoordinator nodeCoordinatorY0 = gVarA2.y0(); !t.c(nodeCoordinatorY0, wrapped) && nodeCoordinatorY0 != null; nodeCoordinatorY0 = nodeCoordinatorY0.getWrapped()) {
                nodeCoordinatorY0.L3();
                nodeCoordinatorY0.S3();
            }
            n2.c<g> cVarL0 = A2().L0();
            g[] gVarArr = cVarL0.content;
            int size = cVarL0.getSize();
            for (int i15 = 0; i15 < size; i15++) {
                gVarArr[i15].o0().z2();
            }
        }
    }

    public final g A2() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    @Override // g4.b
    public void B0() {
        g.O1(A2(), false, false, false, 7, null);
    }

    public final void E2() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    @Override // g4.b
    public void F(er.l<? super g4.b, i0> block) {
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            block.b(gVarArr[i15].getLayoutDelegate().b());
        }
    }

    public final void F2() {
        this.onNodePlacedCalled = true;
        g gVarC0 = A2().C0();
        float zIndex = X().getZIndex();
        g gVarA2 = A2();
        NodeCoordinator nodeCoordinatorY0 = gVarA2.y0();
        NodeCoordinator nodeCoordinatorB0 = gVarA2.b0();
        while (nodeCoordinatorY0 != nodeCoordinatorB0) {
            f fVar = (f) nodeCoordinatorY0;
            zIndex += fVar.getZIndex();
            nodeCoordinatorY0 = fVar.getWrapped();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (gVarC0 != null) {
                gVarC0.x1();
            }
            if (gVarC0 != null) {
                gVarC0.T0();
            }
        }
        if (!X().getIsPlacingForAlignment()) {
            boolean z15 = this.isPlaced;
            if (!z15 || getAlignmentLines().j()) {
                v2();
            }
            if (z15) {
                A2().b0().J3();
            } else {
                if (gVarC0 != null) {
                    gVarC0.T0();
                }
                if (this.relayoutWithoutParentInProgress && gVarC0 != null) {
                    g.M1(gVarC0, false, 1, null);
                }
            }
        }
        if (gVarC0 == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && gVarC0.i0() == g.e.LayingOut) {
            if (!(getPlaceOrder() == Integer.MAX_VALUE)) {
                d4.a.c("Place was called on a node which was placed already");
            }
            this.placeOrder = gVarC0.getLayoutDelegate().getNextChildPlaceOrder();
            h layoutDelegate = gVarC0.getLayoutDelegate();
            layoutDelegate.Y(layoutDelegate.getNextChildPlaceOrder() + 1);
        }
        T();
    }

    public final List<n> G1() {
        A2().l2();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.i();
        }
        g gVarA2 = A2();
        n2.c<n> cVar = this._childDelegates;
        n2.c<g> cVarL0 = gVarA2.L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = gVarArr[i15];
            if (cVar.getSize() <= i15) {
                cVar.d(gVar.getLayoutDelegate().getMeasurePassDelegate());
            } else {
                cVar.z(i15, gVar.getLayoutDelegate().getMeasurePassDelegate());
            }
        }
        cVar.w(gVarA2.R().size(), cVar.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.i();
    }

    @Override // g4.b
    public g4.b H() {
        h layoutDelegate;
        g gVarC0 = A2().C0();
        if (gVarC0 == null || (layoutDelegate = gVarC0.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.b();
    }

    @Override // p036e4.z0
    public int I(p036e4.a alignmentLine) {
        g gVarC0 = A2().C0();
        if ((gVarC0 != null ? gVarC0.i0() : null) == g.e.Measuring) {
            getAlignmentLines().u(true);
        } else {
            g gVarC1 = A2().C0();
            if ((gVarC1 != null ? gVarC1.i0() : null) == g.e.LayingOut) {
                getAlignmentLines().t(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int I = W1().I(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return I;
    }

    public final c5.b J1() {
        if (this.measuredOnce) {
            return c5.b.a(getMeasurementConstraints());
        }
        return null;
    }

    public final boolean J2(long constraints) throws Throwable {
        g gVarA2 = A2();
        try {
            if (A2().getIsDeactivated()) {
                d4.a.a("measure is called on a deactivated node");
            }
            Owner ownerB = g0.b(A2());
            g gVarC0 = A2().C0();
            boolean z15 = true;
            A2().U1(A2().getCanMultiMeasure() || (gVarC0 != null && gVarC0.getCanMultiMeasure()));
            if (!A2().p0() && c5.b.f(getMeasurementConstraints(), constraints)) {
                Owner.u(ownerB, A2(), false, 2, null);
                A2().R1();
                return false;
            }
            getAlignmentLines().s(false);
            F(e.f10261b);
            this.measuredOnce = true;
            long jB = W1().b();
            j1(constraints);
            g.e eVarO1 = O1();
            g.e eVar = g.e.Idle;
            if (!(eVarO1 == eVar)) {
                d4.a.c("layout state is not idle before measure starts");
            }
            this.performMeasureConstraints = constraints;
            g.e eVar2 = g.e.Measuring;
            N2(eVar2);
            this.measurePending = false;
            c1 snapshotObserver = g0.b(A2()).getSnapshotObserver();
            snapshotObserver.observer.k(A2(), snapshotObserver.onCommitAffectingMeasure, X1());
            if (O1() == eVar2) {
                r2();
                N2(eVar);
            }
            if (c5.r.e(W1().b(), jB) && W1().getWidth() == getWidth() && W1().getHeight() == getHeight()) {
                z15 = false;
            }
            d1(c5.r.c((((long) W1().getHeight()) & BodyPartID.bodyIdMax) | (((long) W1().getWidth()) << 32)));
            return z15;
        } catch (Throwable th4) {
            gVarA2.S1(th4);
            throw new oq.g();
        }
    }

    public final void K2() {
        n nVar;
        g gVarC0;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                d4.a.c("replace called on unplaced item");
            }
            boolean z15 = this.isPlaced;
            nVar = this;
            try {
                nVar.G2(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (z15 && !nVar.onNodePlacedCalled && (gVarC0 = A2().C0()) != null) {
                    g.M1(gVarC0, false, 1, null);
                }
                nVar.relayoutWithoutParentInProgress = false;
            } catch (Throwable th4) {
                th = th4;
                try {
                    A2().S1(th);
                    throw new oq.g();
                } catch (Throwable th5) {
                    nVar.relayoutWithoutParentInProgress = false;
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            nVar = this;
        }
    }

    @Override // p036e4.a2
    public int L0() {
        return W1().L0();
    }

    public final void L2() {
        if (!A2().p() || this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() <= 0) {
            return;
        }
        h layoutDelegate = A2().getLayoutDelegate();
        if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.m()) {
            g.M1(A2(), false, 1, null);
        }
        n2.c<g> cVarL0 = A2().L0();
        g[] gVarArr = cVarL0.content;
        int size = cVarL0.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            gVarArr[i15].o0().L2();
        }
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final void M2(boolean z15) {
        this.childDelegatesDirty = z15;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    public final void N2(g.e eVar) {
        this.layoutNodeLayoutDelegate.R(eVar);
    }

    public final g.e O1() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    public final void O2(g.EnumC0220g enumC0220g) {
        this.measuredByParent = enumC0220g;
    }

    @Override // p036e4.a2
    public int P0() {
        return W1().P0();
    }

    public final void P2(boolean z15) {
        this.isPlaced = z15;
    }

    public void Q2(boolean z15) {
        this.isPlacedUnderMotionFrameOfReference = z15;
    }

    @Override // g4.m0
    public void R(boolean newMFR) {
        if (newMFR != W1().getIsPlacedUnderMotionFrameOfReference()) {
            W1().m2(newMFR);
            this.needsCoordinatesUpdate = true;
        }
        Q2(newMFR);
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    public final boolean S2() {
        if ((getParentData() == null && W1().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = W1().getParentData();
        return true;
    }

    @Override // g4.b
    public void T() {
        this.layingOutChildren = true;
        getAlignmentLines().o();
        if (this.layoutPending) {
            C2();
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !X().getIsPlacingForAlignment() && this.layoutPending)) {
            this.layoutPending = false;
            g.e eVarO1 = O1();
            N2(g.e.LayingOut);
            this.layoutNodeLayoutDelegate.O(false);
            g gVarA2 = A2();
            c1 snapshotObserver = g0.b(gVarA2).getSnapshotObserver();
            er.a<i0> aVar = this.layoutChildrenBlock;
            snapshotObserver.observer.k(gVarA2, snapshotObserver.onCommitAffectingLayout, aVar);
            N2(eVarO1);
            this.layoutPendingForAlignment = false;
        }
        if (getAlignmentLines().getUsedDuringParentLayout()) {
            getAlignmentLines().q(true);
        }
        if (getAlignmentLines().getDirty() && getAlignmentLines().k()) {
            getAlignmentLines().n();
        }
        this.layingOutChildren = false;
    }

    @Override // p036e4.v
    public int U(int width) {
        if (h0.a(A2())) {
            return Q1().U(width);
        }
        D2();
        return W1().U(width);
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final g.EnumC0220g getMeasuredByParent() {
        return this.measuredByParent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036e4.a2
    public void W0(long position, float zIndex, er.l<? super n3.a2, i0> layerBlock) throws Throwable {
        I2(position, zIndex, layerBlock, null);
    }

    public final NodeCoordinator W1() {
        return this.layoutNodeLayoutDelegate.z();
    }

    @Override // g4.b
    public NodeCoordinator X() {
        return A2().b0();
    }

    public final er.a<i0> X1() {
        return this.performMeasureBlock;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036e4.a2
    public void Z0(long position, float zIndex, q3.c layer) throws Throwable {
        I2(position, zIndex, null, layer);
    }

    public final void Z1(boolean forceRequest) {
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
        int i15 = a.f10255b[intrinsicsUsageByParent.ordinal()];
        if (i15 == 1) {
            g.O1(gVar, forceRequest, false, false, 6, null);
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            gVar.L1(forceRequest);
        }
    }

    public final void a2() {
        this.parentDataDirty = true;
    }

    @Override // p036e4.z0, p036e4.v
    /* JADX INFO: renamed from: e, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    @Override // p036e4.v
    public int e0(int height) {
        if (h0.a(A2())) {
            return Q1().e0(height);
        }
        D2();
        return W1().e0(height);
    }

    /* JADX INFO: renamed from: h2, reason: from getter */
    public final boolean getIsPlaced() {
        return this.isPlaced;
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
        if (h0.a(A2())) {
            return Q1().m0(height);
        }
        D2();
        return W1().m0(height);
    }

    /* JADX INFO: renamed from: m2, reason: from getter */
    public final boolean getIsPlacedByParent() {
        return this.isPlacedByParent;
    }

    @Override // p036e4.v
    public int n(int width) {
        if (h0.a(A2())) {
            return Q1().n(width);
        }
        D2();
        return W1().n(width);
    }

    @Override // p036e4.v0
    public a2 o0(long constraints) throws Throwable {
        g.EnumC0220g intrinsicsUsageByParent = A2().getIntrinsicsUsageByParent();
        g.EnumC0220g enumC0220g = g.EnumC0220g.NotUsed;
        if (intrinsicsUsageByParent == enumC0220g) {
            A2().D();
        }
        if (h0.a(A2())) {
            l lVarQ1 = Q1();
            lVarQ1.P2(enumC0220g);
            if (e3.g.isVerboseTracingEnabled) {
                Trace.beginSection("Compose:lookaheadMeasure");
                try {
                    lVarQ1.o0(constraints);
                    Trace.endSection();
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            } else {
                lVarQ1.o0(constraints);
            }
        }
        R2(A2());
        J2(constraints);
        return this;
    }

    public final void p2() {
        this.layoutNodeLayoutDelegate.P(true);
    }

    public final void r2() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    @Override // g4.b
    public void requestLayout() {
        g.M1(A2(), false, 1, null);
    }

    public final void t2() {
        this.measurePending = true;
    }

    @Override // g4.b
    public Map<p036e4.a, Integer> y() {
        if (!this.duringAlignmentLinesQuery) {
            if (O1() == g.e.Measuring) {
                getAlignmentLines().s(true);
                if (getAlignmentLines().getDirty()) {
                    r2();
                }
            } else {
                getAlignmentLines().r(true);
            }
        }
        NodeCoordinator nodeCoordinatorX = X();
        boolean isPlacingForAlignment = nodeCoordinatorX.getIsPlacingForAlignment();
        nodeCoordinatorX.p2(true);
        T();
        nodeCoordinatorX.p2(isPlacingForAlignment);
        return getAlignmentLines().h();
    }
}
