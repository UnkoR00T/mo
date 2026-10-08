package g1;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.f2;
import p036e4.g2;
import p056h1.l1;
import p056h1.n1;
import p056h1.r2;
import p056h1.s2;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.x5;
import p143z0.C6466x2;
import p143z0.a2;
import p143z0.h2;
import p143z0.v2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0089\u0001\b\u0007\u0018\u0000 v2\u00020\u0001:\u00011B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001bH\u0096@¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0000¢\u0006\u0004\b%\u0010#J)\u0010*\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00152\b\b\u0002\u0010)\u001a\u00020\u0015H\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R$\u00109\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b \u00106\u001a\u0004\b7\u00108R(\u0010>\u001a\u0004\u0018\u00010&2\b\u00105\u001a\u0004\u0018\u00010&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020&0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010FR\u001a\u0010M\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010R\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010Z\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\"\u0010_\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u00106\u001a\u0004\b\\\u00108\"\u0004\b]\u0010^R(\u0010e\u001a\u0004\u0018\u00010`2\b\u00105\u001a\u0004\u0018\u00010`8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010k\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001a\u0010q\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010x\u001a\b\u0012\u0004\u0012\u00020s0r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010~\u001a\u00020y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R%\u0010\u0084\u0001\u001a\u00020\u007f8\u0000X\u0080\u0004¢\u0006\u0016\n\u0005\b*\u0010\u0080\u0001\u0012\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\bO\u0010\u0081\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010\u008a\u0001R\u001f\u0010\u0090\u0001\u001a\u00030\u008c\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bo\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\b|\u0010F\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001f\u0010\u0097\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010F\u001a\u0006\b\u0096\u0001\u0010\u0093\u0001R/\u0010\u009b\u0001\u001a\u00020\u00152\u0007\u0010\u0098\u0001\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u0099\u0001\u0010F\u001a\u0004\bB\u00108\"\u0005\b\u009a\u0001\u0010^R.\u0010\u009d\u0001\u001a\u00020\u00152\u0007\u0010\u0098\u0001\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b7\u0010F\u001a\u0004\b?\u00108\"\u0005\b\u009c\u0001\u0010^R\u0017\u0010 \u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010\u009f\u0001R\u0012\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010YR\u0012\u0010\u0004\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010YR\u0013\u0010\r\u001a\u00020\f8G¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R!\u0010¨\u0001\u001a\u00030£\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010¥\u0001*\u0006\b¦\u0001\u0010§\u0001R\u0015\u0010©\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0015\u0010ª\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010Q¨\u0006«\u0001"}, d2 = {"Lg1/e1;", "Lz0/v2;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Lg1/r0;", "prefetchStrategy", "<init>", "(IILg1/r0;)V", "(II)V", "", "delta", "Lg1/d0;", "layoutInfo", "Loq/i0;", "K", "(FLg1/d0;)V", "index", "scrollOffset", "N", "(IILtq/e;)Ljava/lang/Object;", "", "forceRemeasure", ip.a.f96137b, "(IIZ)V", "Lw0/z1;", "scrollPriority", "Lkotlin/Function2;", "Lz0/h2;", "Ltq/e;", "", "block", "b", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "f", "(F)F", "distance", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Lg1/k0;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "q", "(Lg1/k0;ZZ)V", "Lg1/o;", "itemProvider", "firstItemIndex", "T", "(Lg1/o;I)I", "a", "Lg1/r0;", "G", "()Lg1/r0;", "value", "Z", "x", "()Z", "hasLookaheadOccurred", "c", "Lg1/k0;", "s", "()Lg1/k0;", "approachLayoutInfo", "d", "executeRequestsInHighPriorityMode", "Lg1/u0;", "e", "Lg1/u0;", "scrollPosition", "Lm2/a3;", "Lm2/a3;", "layoutInfoState", "Lb1/l;", "g", "Lb1/l;", "y", "()Lb1/l;", "internalInteractionSource", "h", "F", "J", "()F", "scrollToBeConsumed", "i", "Lz0/v2;", "scrollableState", "j", "I", "getNumMeasurePasses$foundation", "()I", "numMeasurePasses", "k", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "(Z)V", "prefetchingEnabled", "Le4/f2;", "l", "Le4/f2;", "getRemeasurement$foundation", "()Le4/f2;", "remeasurement", "Le4/g2;", "m", "Le4/g2;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Le4/g2;", "remeasurementModifier", "Lh1/e;", "n", "Lh1/e;", "t", "()Lh1/e;", "awaitLayoutModifier", "Lh1/f0;", "Lg1/l0;", "o", "Lh1/f0;", "z", "()Lh1/f0;", "itemAnimator", "Lh1/r;", "p", "Lh1/r;", "u", "()Lh1/r;", "beyondBoundsInfo", "Lh1/l1;", "Lh1/l1;", "()Lh1/l1;", "getPrefetchState$foundation$annotations", "()V", "prefetchState", "Lg1/q0;", "r", "Lg1/q0;", "prefetchScope", "g1/e1$b", "Lg1/e1$b;", "_scrollIndicatorState", "Lh1/k1;", "Lh1/k1;", ip.a.f96138c, "()Lh1/k1;", "pinnedItems", "Lh1/s2;", "E", "()Lm2/a3;", "placementScopeInvalidator", "v", "B", "measurementScopeInvalidator", "<set-?>", "w", "R", "canScrollForward", "Q", "canScrollBackward", "Lh1/n1;", "Lh1/n1;", "_lazyLayoutScrollDeltaBetweenPasses", "A", "()Lg1/d0;", "Llr/i;", "C", "()Llr/i;", "getNearestRange$foundation$delegate", "(Lg1/e1;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "scrollDeltaBetweenPasses", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r0 prefetchStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private k0 approachLayoutInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean executeRequestsInHighPriorityMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u0 scrollPosition;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3<k0> layoutInfoState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b1.l internalInteractionSource;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final v2 scrollableState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private f2 remeasurement;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final g2 remeasurementModifier;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p056h1.e awaitLayoutModifier;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p056h1.f0<l0> itemAnimator;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p056h1.r beyondBoundsInfo;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final l1 prefetchState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final q0 prefetchScope;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b _scrollIndicatorState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p056h1.k1 pinnedItems;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final a3<oq.i0> placementScopeInvalidator;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final a3<oq.i0> measurementScopeInvalidator;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final a3 canScrollForward;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final a3 canScrollBackward;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final n1 _lazyLayoutScrollDeltaBetweenPasses;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b3.x<e1, ?> A = b3.b.b(new er.p() { // from class: g1.c1
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return e1.k((b3.b0) obj, (e1) obj2);
        }
    }, new er.l() { // from class: g1.d1
        @Override // er.l
        public final Object b(Object obj) {
            return e1.l((List) obj);
        }
    });

    /* JADX INFO: renamed from: g1.e1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg1/e1$a;", "", "<init>", "()V", "Lb3/x;", "Lg1/e1;", "Saver", "Lb3/x;", "a", "()Lb3/x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final b3.x<e1, ?> a() {
            return e1.A;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"g1/e1$b", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        b() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"g1/e1$c", "Lg1/q0;", "", "lineIndex", "", "Lh1/l1$b;", "a", "(I)Ljava/util/List;", "Lkotlin/Function1;", "", "Loq/i0;", "onPrefetchFinished", "c", "(ILer/l;)Ljava/util/List;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements q0 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d(List list, fr.n0 n0Var, List list2, er.l lVar, int i15, k0 k0Var, l1.c cVar) {
            int iC = cVar.c();
            int iD = 0;
            for (int i16 = 0; i16 < iC; i16++) {
                iD += (int) (k0Var.getOrientation() == a2.Vertical ? cVar.d(i16) & BodyPartID.bodyIdMax : cVar.d(i16) >> 32);
            }
            if (list != null) {
                list.add(Integer.valueOf(iD));
            }
            if (n0Var.f66407a != list2.size()) {
                n0Var.f66407a++;
            } else if (lVar != null && list != null) {
                lVar.b(new p0(i15, list));
            }
            return oq.i0.f148189a;
        }

        @Override // g1.q0
        public List<l1.b> a(int lineIndex) {
            return c(lineIndex, null);
        }

        public List<l1.b> c(final int lineIndex, final er.l<Object, oq.i0> onPrefetchFinished) {
            ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = onPrefetchFinished == null ? null : new ArrayList();
            c3.l.Companion companion = c3.l.INSTANCE;
            e1 e1Var = e1.this;
            c3.l lVarD = companion.d();
            er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                final k0 approachLayoutInfo = e1Var.getHasLookaheadOccurred() ? e1Var.getApproachLayoutInfo() : (k0) e1Var.layoutInfoState.getValue();
                if (approachLayoutInfo != null) {
                    final fr.n0 n0Var = new fr.n0();
                    n0Var.f66407a = 1;
                    final List<oq.r<Integer, c5.b>> listB = approachLayoutInfo.v().b(Integer.valueOf(lineIndex));
                    int size = listB.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        oq.r<Integer, c5.b> rVar = listB.get(i15);
                        arrayList.add(e1Var.getPrefetchState().i(rVar.c().intValue(), rVar.d().getValue(), e1Var.executeRequestsInHighPriorityMode, new er.l() { // from class: g1.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return e1.c.d(arrayList2, n0Var, listB, onPrefetchFinished, lineIndex, approachLayoutInfo, (l1.c) obj);
                            }
                        }));
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                }
                return arrayList;
            } finally {
                companion.l(lVarD, lVarE, lVarG);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"g1/e1$d", "Le4/g2;", "Le4/f2;", "remeasurement", "Loq/i0;", "v", "(Le4/f2;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements g2 {
        d() {
        }

        @Override // p036e4.g2
        public void v(f2 remeasurement) {
            e1.this.remeasurement = remeasurement;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f69302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f69303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69304f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f69306h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f69304f = obj;
            this.f69306h |= PKIFailureInfo.systemUnavail;
            return e1.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<h2, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69307e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f69309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f69310h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i15, int i16, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f69309g = i15;
            this.f69310h = i16;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f69307e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e1.this.S(this.f69309g, this.f69310h, true);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h2 h2Var, tq.e<? super oq.i0> eVar) {
            return ((f) v(h2Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return e1.this.new f(this.f69309g, this.f69310h, eVar);
        }
    }

    public e1() {
        this(0, 0, null, 7, null);
    }

    private final void K(float delta, d0 layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.d(this.prefetchScope, delta, layoutInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(e1 e1Var, int i15, r2 r2Var) {
        r0 r0Var = e1Var.prefetchStrategy;
        c3.l.Companion companion = c3.l.INSTANCE;
        c3.l lVarD = companion.d();
        companion.l(lVarD, companion.e(lVarD), lVarD != null ? lVarD.g() : null);
        r0Var.b(r2Var, i15);
        return oq.i0.f148189a;
    }

    public static /* synthetic */ Object O(e1 e1Var, int i15, int i16, tq.e eVar, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i16 = 0;
        }
        return e1Var.N(i15, i16, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float P(e1 e1Var, float f15) {
        return -e1Var.L(-f15);
    }

    private void Q(boolean z15) {
        this.canScrollBackward.setValue(Boolean.valueOf(z15));
    }

    private void R(boolean z15) {
        this.canScrollForward.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(b3.b0 b0Var, e1 e1Var) {
        return pq.v.q(Integer.valueOf(e1Var.v()), Integer.valueOf(e1Var.w()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 l(List list) {
        return new e1(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static /* synthetic */ void r(e1 e1Var, k0 k0Var, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        e1Var.q(k0Var, z15, z16);
    }

    public final d0 A() {
        return this.layoutInfoState.getValue();
    }

    public final a3<oq.i0> B() {
        return this.measurementScopeInvalidator;
    }

    public final lr.i C() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final p056h1.k1 getPinnedItems() {
        return this.pinnedItems;
    }

    public final a3<oq.i0> E() {
        return this.placementScopeInvalidator;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final l1 getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final r0 getPrefetchStrategy() {
        return this.prefetchStrategy;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final g2 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float I() {
        return this._lazyLayoutScrollDeltaBetweenPasses.b();
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final float L(float distance) {
        k0 k0Var;
        if ((distance < 0.0f && !e()) || (distance > 0.0f && !d())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            c1.e.c("entered drag with non-zero pending scroll");
        }
        float f15 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f15;
        if (Math.abs(f15) > 0.5f) {
            float f16 = this.scrollToBeConsumed;
            int iD = hr.a.d(f16);
            k0 k0VarN = this.layoutInfoState.getValue().n(iD, !this.hasLookaheadOccurred);
            if (k0VarN != null && (k0Var = this.approachLayoutInfo) != null) {
                k0 k0VarN2 = k0Var != null ? k0Var.n(iD, true) : null;
                if (k0VarN2 != null) {
                    this.approachLayoutInfo = k0VarN2;
                } else {
                    k0VarN = null;
                }
            }
            if (k0VarN != null) {
                q(k0VarN, this.hasLookaheadOccurred, true);
                s2.d(this.placementScopeInvalidator);
                K(f16 - this.scrollToBeConsumed, k0VarN);
            } else {
                f2 f2Var = this.remeasurement;
                if (f2Var != null) {
                    f2Var.k();
                }
                K(f16 - this.scrollToBeConsumed, A());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f17 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f17;
    }

    public final Object N(int i15, int i16, tq.e<? super oq.i0> eVar) {
        Object objA = v2.a(this, null, new f(i15, i16, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    public final void S(int index, int scrollOffset, boolean forceRemeasure) {
        if (this.scrollPosition.a() != index || this.scrollPosition.c() != scrollOffset) {
            this.itemAnimator.p();
            Object obj = this.prefetchStrategy;
            p056h1.i iVar = obj instanceof p056h1.i ? (p056h1.i) obj : null;
            if (iVar != null) {
                iVar.x();
            }
        }
        this.scrollPosition.d(index, scrollOffset);
        if (!forceRemeasure) {
            s2.d(this.measurementScopeInvalidator);
            return;
        }
        f2 f2Var = this.remeasurement;
        if (f2Var != null) {
            f2Var.k();
        }
    }

    public final int T(o itemProvider, int firstItemIndex) {
        return this.scrollPosition.j(itemProvider, firstItemIndex);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r8.b(r6, r7, r0) == r1) goto L23;
     */
    @Override // p143z0.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(w0.z1 r6, er.p<? super p143z0.h2, ? super tq.e<? super oq.i0>, ? extends java.lang.Object> r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof g1.e1.e
            if (r0 == 0) goto L13
            r0 = r8
            g1.e1$e r0 = (g1.e1.e) r0
            int r1 = r0.f69306h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69306h = r1
            goto L18
        L13:
            g1.e1$e r0 = new g1.e1$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f69304f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f69306h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r8)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f69303e
            r7 = r6
            er.p r7 = (er.p) r7
            java.lang.Object r6 = r0.f69302d
            w0.z1 r6 = (w0.z1) r6
            oq.u.b(r8)
            goto L5f
        L41:
            oq.u.b(r8)
            m2.a3<g1.k0> r8 = r5.layoutInfoState
            java.lang.Object r8 = r8.getValue()
            g1.k0 r2 = g1.j1.f()
            if (r8 != r2) goto L5f
            h1.e r8 = r5.awaitLayoutModifier
            r0.f69302d = r6
            r0.f69303e = r7
            r0.f69306h = r4
            java.lang.Object r8 = r8.r(r0)
            if (r8 != r1) goto L5f
            goto L6e
        L5f:
            z0.v2 r8 = r5.scrollableState
            r2 = 0
            r0.f69302d = r2
            r0.f69303e = r2
            r0.f69306h = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.e1.b(w0.z1, er.p, tq.e):java.lang.Object");
    }

    @Override // p143z0.v2
    public boolean c() {
        return this.scrollableState.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p143z0.v2
    public boolean d() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p143z0.v2
    public boolean e() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // p143z0.v2
    public float f(float delta) {
        return this.scrollableState.f(delta);
    }

    public final void q(k0 result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        n0 n0VarT;
        l0[] items;
        l0 l0Var;
        this.prefetchState.j(result.j().size());
        if (isLookingAhead || !this.hasLookaheadOccurred) {
            if (isLookingAhead) {
                this.hasLookaheadOccurred = true;
            }
            this.scrollToBeConsumed -= result.getConsumedScroll();
            this.layoutInfoState.setValue(result);
            Q(result.o());
            R(result.getCanScrollForward());
            if (visibleItemsStayedTheSame) {
                this.scrollPosition.i(result.getFirstVisibleLineScrollOffset());
            } else {
                this.scrollPosition.h(result);
                if (this.prefetchingEnabled) {
                    this.prefetchStrategy.c(this.prefetchScope, result);
                }
            }
            if (isLookingAhead) {
                this._lazyLayoutScrollDeltaBetweenPasses.e(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
            }
            this.numMeasurePasses++;
            return;
        }
        this.approachLayoutInfo = result;
        c3.l.Companion companion = c3.l.INSTANCE;
        c3.l lVarD = companion.d();
        er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
        c3.l lVarE = companion.e(lVarD);
        try {
            if (this._lazyLayoutScrollDeltaBetweenPasses.c() && result.getFirstVisibleLineScrollOffset() == this.scrollPosition.c() && (n0VarT = result.getFirstVisibleLine()) != null && (items = n0VarT.getItems()) != null && (l0Var = (l0) pq.n.p0(items)) != null && l0Var.getIndex() == this.scrollPosition.a()) {
                this._lazyLayoutScrollDeltaBetweenPasses.d();
            }
            oq.i0 i0Var = oq.i0.f148189a;
        } finally {
            companion.l(lVarD, lVarE, lVarG);
        }
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final k0 getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final p056h1.e getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final p056h1.r getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final int v() {
        return this.scrollPosition.a();
    }

    public final int w() {
        return this.scrollPosition.c();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final b1.l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final p056h1.f0<l0> z() {
        return this.itemAnimator;
    }

    public e1(final int i15, int i16, r0 r0Var) {
        this.prefetchStrategy = r0Var;
        u0 u0Var = new u0(i15, i16);
        this.scrollPosition = u0Var;
        this.layoutInfoState = x5.i(j1.f69349a, x5.k());
        this.internalInteractionSource = b1.k.a();
        this.scrollableState = C6466x2.b(new er.l() { // from class: g1.a1
            @Override // er.l
            public final Object b(Object obj) {
                return Float.valueOf(e1.P(this.f69240a, ((Float) obj).floatValue()));
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new d();
        this.awaitLayoutModifier = new p056h1.e();
        this.itemAnimator = new p056h1.f0<>();
        this.beyondBoundsInfo = new p056h1.r();
        this.prefetchState = new l1(r0Var.a(), new er.l() { // from class: g1.b1
            @Override // er.l
            public final Object b(Object obj) {
                return e1.M(this.f69246a, i15, (r2) obj);
            }
        });
        this.prefetchScope = new c();
        this._scrollIndicatorState = new b();
        this.pinnedItems = new p056h1.k1();
        u0Var.getNearestRangeState();
        this.placementScopeInvalidator = s2.c(null, 1, null);
        this.measurementScopeInvalidator = s2.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = c6.e(bool, null, 2, null);
        this.canScrollBackward = c6.e(bool, null, 2, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new n1();
    }

    public /* synthetic */ e1(int i15, int i16, r0 r0Var, int i17, fr.k kVar) {
        this((i17 & 1) != 0 ? 0 : i15, (i17 & 2) != 0 ? 0 : i16, (i17 & 4) != 0 ? s0.b(0, 1, null) : r0Var);
    }

    public e1(int i15, int i16) {
        this(i15, i16, s0.b(0, 1, null));
    }
}
