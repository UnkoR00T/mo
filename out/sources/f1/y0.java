package f1;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.f2;
import p036e4.g2;
import p056h1.k1;
import p056h1.l1;
import p056h1.n1;
import p056h1.p1;
import p056h1.r2;
import p056h1.s1;
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
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\u0090\u0001\b\u0007\u0018\u0000 O2\u00020\u0001:\u00015B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001fH\u0096@¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0000¢\u0006\u0004\b)\u0010'J$\u0010*\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b*\u0010\u0018J)\u0010.\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00192\b\b\u0002\u0010-\u001a\u00020\u0019H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u00104R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010=\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u0010:\u001a\u0004\b;\u0010<R(\u0010B\u001a\u0004\u0018\u00010\u00112\b\u00109\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010:R\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010JR\u001a\u0010Q\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR$\u0010V\u001a\u00020\n2\u0006\u00109\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\"\u0010[\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010:\u001a\u0004\bX\u0010<\"\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010b\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b_\u00107\u001a\u0004\b`\u0010aR\"\u0010f\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010:\u001a\u0004\bd\u0010<\"\u0004\be\u0010ZR(\u0010l\u001a\u0004\u0018\u00010g2\b\u00109\u001a\u0004\u0018\u00010g8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010r\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010x\u001a\u00020s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR \u0010\u007f\u001a\b\u0012\u0004\u0012\u00020z0y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001f\u0010\u0084\u0001\u001a\u00030\u0080\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b*\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R(\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u0012\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001e\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bv\u0010\u0095\u0001\u001a\u0005\bS\u0010\u0096\u0001R\u001f\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010J\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R/\u0010\u009f\u0001\u001a\u00020\u00192\u0007\u0010\u009c\u0001\u001a\u00020\u00198V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u009d\u0001\u0010J\u001a\u0004\bF\u0010<\"\u0005\b\u009e\u0001\u0010ZR/\u0010¢\u0001\u001a\u00020\u00192\u0007\u0010\u009c\u0001\u001a\u00020\u00198V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b \u0001\u0010J\u001a\u0004\bC\u0010<\"\u0005\b¡\u0001\u0010ZR\u001f\u0010¥\u0001\u001a\u00030\u0098\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b£\u0001\u0010J\u001a\u0006\b¤\u0001\u0010\u009a\u0001R\u0017\u0010¨\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010§\u0001R\u0012\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b \u0001\u0010aR\u0012\u0010\u0004\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b£\u0001\u0010aR\u0013\u0010\r\u001a\u00020\f8G¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030«\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010¬\u0001R!\u0010³\u0001\u001a\u00030®\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¯\u0001\u0010°\u0001*\u0006\b±\u0001\u0010²\u0001R\u0015\u0010´\u0001\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0016\u0010¶\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010U¨\u0006·\u0001"}, d2 = {"Lf1/y0;", "Lz0/v2;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Lf1/n0;", "prefetchStrategy", "<init>", "(IILf1/n0;)V", "(II)V", "", "delta", "Lf1/b0;", "layoutInfo", "Loq/i0;", "N", "(FLf1/b0;)V", "Lf1/i0;", "measureResult", "W", "(Lf1/i0;)V", "index", "scrollOffset", "Q", "(IILtq/e;)Ljava/lang/Object;", "", "forceRemeasure", "V", "(IIZ)V", "Lw0/z1;", "scrollPriority", "Lkotlin/Function2;", "Lz0/h2;", "Ltq/e;", "", "block", "b", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "f", "(F)F", "distance", "O", "q", "result", "isLookingAhead", "visibleItemsStayedTheSame", "s", "(Lf1/i0;ZZ)V", "Lf1/r;", "itemProvider", "firstItemIndex", "X", "(Lf1/r;I)I", "a", "Lf1/n0;", "I", "()Lf1/n0;", "value", "Z", "z", "()Z", "hasLookaheadOccurred", "c", "Lf1/i0;", "getApproachLayoutInfo$foundation", "()Lf1/i0;", "approachLayoutInfo", "d", "executeRequestsInHighPriorityMode", "Lf1/r0;", "e", "Lf1/r0;", "scrollPosition", "Lm2/a3;", "Lm2/a3;", "layoutInfoState", "Lb1/l;", "g", "Lb1/l;", "A", "()Lb1/l;", "internalInteractionSource", "h", "F", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()F", "scrollToBeConsumed", "i", "M", "setSkipItemPlacementAnimation$foundation", "(Z)V", "skipItemPlacementAnimation", "j", "Lz0/v2;", "scrollableState", "k", "getNumMeasurePasses$foundation", "()I", "numMeasurePasses", "l", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "prefetchingEnabled", "Le4/f2;", "m", "Le4/f2;", "getRemeasurement$foundation", "()Le4/f2;", "remeasurement", "Le4/g2;", "n", "Le4/g2;", "J", "()Le4/g2;", "remeasurementModifier", "Lh1/e;", "o", "Lh1/e;", "u", "()Lh1/e;", "awaitLayoutModifier", "Lh1/f0;", "Lf1/j0;", "p", "Lh1/f0;", "B", "()Lh1/f0;", "itemAnimator", "Lh1/r;", "Lh1/r;", "v", "()Lh1/r;", "beyondBoundsInfo", "Lh1/l1;", "r", "Lh1/l1;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lh1/l1;", "getPrefetchState$foundation$annotations", "()V", "prefetchState", "Lf1/m0;", "Lf1/m0;", "prefetchScope", "f1/y0$b", "t", "Lf1/y0$b;", "_scrollIndicatorState", "Lh1/k1;", "Lh1/k1;", "()Lh1/k1;", "pinnedItems", "Lh1/s2;", ip.a.f96138c, "()Lm2/a3;", "measurementScopeInvalidator", "<set-?>", "w", "U", "canScrollForward", "x", "T", "canScrollBackward", "y", "G", "placementScopeInvalidator", "Lh1/n1;", "Lh1/n1;", "_lazyLayoutScrollDeltaBetweenPasses", "C", "()Lf1/b0;", "Lc5/d;", "()Lc5/d;", "density", "Llr/i;", "E", "()Llr/i;", "getNearestRange$foundation$delegate", "(Lf1/y0;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "K", "scrollDeltaBetweenPasses", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 implements v2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b3.x<y0, ?> B = b3.b.b(new er.p() { // from class: f1.u0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return y0.k((b3.b0) obj, (y0) obj2);
        }
    }, new er.l() { // from class: f1.v0
        @Override // er.l
        public final Object b(Object obj) {
            return y0.l((List) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n0 prefetchStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i0 approachLayoutInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean executeRequestsInHighPriorityMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r0 scrollPosition;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3<i0> layoutInfoState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b1.l internalInteractionSource;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean skipItemPlacementAnimation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final v2 scrollableState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private f2 remeasurement;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final g2 remeasurementModifier;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p056h1.e awaitLayoutModifier;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p056h1.f0<j0> itemAnimator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p056h1.r beyondBoundsInfo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final l1 prefetchState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final m0 prefetchScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final b _scrollIndicatorState;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final k1 pinnedItems;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final a3<oq.i0> measurementScopeInvalidator;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final a3 canScrollForward;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final a3 canScrollBackward;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final a3<oq.i0> placementScopeInvalidator;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final n1 _lazyLayoutScrollDeltaBetweenPasses;

    /* JADX INFO: renamed from: f1.y0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf1/y0$a;", "", "<init>", "()V", "Lb3/x;", "Lf1/y0;", "Saver", "Lb3/x;", "a", "()Lb3/x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final b3.x<y0, ?> a() {
            return y0.B;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f1/y0$b", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f54911d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f54913f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f54911d = obj;
            this.f54913f |= PKIFailureInfo.systemUnavail;
            return y0.this.q(0, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<h2, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f54915f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f54917h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f54918j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i15, int i16, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f54917h = i15;
            this.f54918j = i16;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f54914e;
            if (i15 == 0) {
                oq.u.b(obj);
                p1 p1VarA = s0.a(y0.this, (h2) this.f54915f);
                int i16 = this.f54917h;
                int i17 = this.f54918j;
                c5.d dVarW = y0.this.w();
                this.f54914e = 1;
                if (s1.c(p1VarA, i16, i17, 100, dVarW, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h2 h2Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(h2Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = y0.this.new d(this.f54917h, this.f54918j, eVar);
            dVar.f54915f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"f1/y0$e", "Lf1/m0;", "", "index", "Lkotlin/Function1;", "", "Loq/i0;", "onPrefetchFinished", "Lh1/l1$b;", "a", "(ILer/l;)Lh1/l1$b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements m0 {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d(er.l lVar, int i15, i0 i0Var, l1.c cVar) {
            if (lVar != null) {
                int iC = cVar.c();
                int iD = 0;
                for (int i16 = 0; i16 < iC; i16++) {
                    iD += (int) (i0Var.getOrientation() == a2.Vertical ? cVar.d(i16) & BodyPartID.bodyIdMax : cVar.d(i16) >> 32);
                }
                lVar.b(new l0(i15, iD));
            }
            return oq.i0.f148189a;
        }

        @Override // f1.m0
        public l1.b a(final int index, final er.l<Object, oq.i0> onPrefetchFinished) {
            c3.l.Companion companion = c3.l.INSTANCE;
            y0 y0Var = y0.this;
            c3.l lVarD = companion.d();
            er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                final i0 i0Var = (i0) y0Var.layoutInfoState.getValue();
                return y0.this.getPrefetchState().i(index, i0Var.getChildConstraints(), y0.this.executeRequestsInHighPriorityMode, new er.l() { // from class: f1.z0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return y0.e.d(onPrefetchFinished, index, i0Var, (l1.c) obj);
                    }
                });
            } finally {
                companion.l(lVarD, lVarE, lVarG);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"f1/y0$f", "Le4/g2;", "Le4/f2;", "remeasurement", "Loq/i0;", "v", "(Le4/f2;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements g2 {
        f() {
        }

        @Override // p036e4.g2
        public void v(f2 remeasurement) {
            y0.this.remeasurement = remeasurement;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f54921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f54922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54923f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f54925h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f54923f = obj;
            this.f54925h |= PKIFailureInfo.systemUnavail;
            return y0.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends vq.k implements er.p<h2, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54926e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f54928g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f54929h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i15, int i16, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f54928g = i15;
            this.f54929h = i16;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f54926e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y0.this.V(this.f54928g, this.f54929h, true);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h2 h2Var, tq.e<? super oq.i0> eVar) {
            return ((h) v(h2Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return y0.this.new h(this.f54928g, this.f54929h, eVar);
        }
    }

    public y0() {
        this(0, 0, null, 7, null);
    }

    private final void N(float delta, b0 layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.c(this.prefetchScope, delta, layoutInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(y0 y0Var, int i15, r2 r2Var) {
        n0 n0Var = y0Var.prefetchStrategy;
        c3.l.Companion companion = c3.l.INSTANCE;
        c3.l lVarD = companion.d();
        companion.l(lVarD, companion.e(lVarD), lVarD != null ? lVarD.g() : null);
        n0Var.b(r2Var, i15);
        return oq.i0.f148189a;
    }

    public static /* synthetic */ Object R(y0 y0Var, int i15, int i16, tq.e eVar, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i16 = 0;
        }
        return y0Var.Q(i15, i16, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float S(y0 y0Var, float f15) {
        return -y0Var.O(-f15);
    }

    private void T(boolean z15) {
        this.canScrollBackward.setValue(Boolean.valueOf(z15));
    }

    private void U(boolean z15) {
        this.canScrollForward.setValue(Boolean.valueOf(z15));
    }

    private final void W(i0 measureResult) {
        j0 j0Var = (j0) pq.v.n0(measureResult.j());
        j0 j0Var2 = (j0) pq.v.z0(measureResult.j());
        e5.a.a("firstVisibleItem:index", j0Var != null ? j0Var.getIndex() : -1L);
        e5.a.a("lastVisibleItem:index", j0Var2 != null ? j0Var2.getIndex() : -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(b3.b0 b0Var, y0 y0Var) {
        return pq.v.q(Integer.valueOf(y0Var.x()), Integer.valueOf(y0Var.y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 l(List list) {
        return new y0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static /* synthetic */ Object r(y0 y0Var, int i15, int i16, tq.e eVar, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i16 = 0;
        }
        return y0Var.q(i15, i16, eVar);
    }

    public static /* synthetic */ void t(y0 y0Var, i0 i0Var, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        y0Var.s(i0Var, z15, z16);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final b1.l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final p056h1.f0<j0> B() {
        return this.itemAnimator;
    }

    public final b0 C() {
        return this.layoutInfoState.getValue();
    }

    public final a3<oq.i0> D() {
        return this.measurementScopeInvalidator;
    }

    public final lr.i E() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final k1 getPinnedItems() {
        return this.pinnedItems;
    }

    public final a3<oq.i0> G() {
        return this.placementScopeInvalidator;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final l1 getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final n0 getPrefetchStrategy() {
        return this.prefetchStrategy;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final g2 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float K() {
        return this._lazyLayoutScrollDeltaBetweenPasses.b();
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getSkipItemPlacementAnimation() {
        return this.skipItemPlacementAnimation;
    }

    public final float O(float distance) {
        i0 i0Var;
        if ((distance < 0.0f && !e()) || (distance > 0.0f && !d())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            c1.e.c("entered drag with non-zero pending scroll");
        }
        this.executeRequestsInHighPriorityMode = true;
        float f15 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f15;
        if (Math.abs(f15) > 0.5f) {
            float f16 = this.scrollToBeConsumed;
            int iRound = Math.round(f16);
            i0 i0VarN = this.layoutInfoState.getValue().n(iRound, !this.hasLookaheadOccurred);
            if (i0VarN != null && (i0Var = this.approachLayoutInfo) != null) {
                i0 i0VarN2 = i0Var != null ? i0Var.n(iRound, true) : null;
                if (i0VarN2 != null) {
                    this.approachLayoutInfo = i0VarN2;
                } else {
                    i0VarN = null;
                }
            }
            if (i0VarN != null) {
                s(i0VarN, this.hasLookaheadOccurred, true);
                s2.d(this.placementScopeInvalidator);
                N(f16 - this.scrollToBeConsumed, i0VarN);
            } else {
                f2 f2Var = this.remeasurement;
                if (f2Var != null) {
                    f2Var.k();
                }
                N(f16 - this.scrollToBeConsumed, C());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f17 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f17;
    }

    public final Object Q(int i15, int i16, tq.e<? super oq.i0> eVar) {
        Object objA = v2.a(this, null, new h(i15, i16, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    public final void V(int index, int scrollOffset, boolean forceRemeasure) {
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

    public final int X(r itemProvider, int firstItemIndex) {
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
            boolean r0 = r8 instanceof f1.y0.g
            if (r0 == 0) goto L13
            r0 = r8
            f1.y0$g r0 = (f1.y0.g) r0
            int r1 = r0.f54925h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54925h = r1
            goto L18
        L13:
            f1.y0$g r0 = new f1.y0$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f54923f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f54925h
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
            java.lang.Object r6 = r0.f54922e
            r7 = r6
            er.p r7 = (er.p) r7
            java.lang.Object r6 = r0.f54921d
            w0.z1 r6 = (w0.z1) r6
            oq.u.b(r8)
            goto L5f
        L41:
            oq.u.b(r8)
            m2.a3<f1.i0> r8 = r5.layoutInfoState
            java.lang.Object r8 = r8.getValue()
            f1.i0 r2 = f1.b1.b()
            if (r8 != r2) goto L5f
            h1.e r8 = r5.awaitLayoutModifier
            r0.f54921d = r6
            r0.f54922e = r7
            r0.f54925h = r4
            java.lang.Object r8 = r8.r(r0)
            if (r8 != r1) goto L5f
            goto L6e
        L5f:
            z0.v2 r8 = r5.scrollableState
            r2 = 0
            r0.f54921d = r2
            r0.f54922e = r2
            r0.f54925h = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.y0.b(w0.z1, er.p, tq.e):java.lang.Object");
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(int i15, int i16, tq.e<? super oq.i0> eVar) throws Throwable {
        c cVar;
        y0 y0Var;
        Throwable th4;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i17 = cVar.f54913f;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f54913f = i17 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f54911d;
        Object objE = uq.b.e();
        int i18 = cVar2.f54913f;
        if (i18 != 0) {
            if (i18 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                oq.u.b(obj);
                y0Var = this;
                y0Var.skipItemPlacementAnimation = false;
                return oq.i0.f148189a;
            } catch (Throwable th5) {
                th4 = th5;
                y0Var = this;
                y0Var.skipItemPlacementAnimation = false;
                throw th4;
            }
        }
        oq.u.b(obj);
        try {
            this.skipItemPlacementAnimation = true;
            d dVar = new d(i15, i16, null);
            cVar2.f54913f = 1;
            y0Var = this;
            try {
                if (v2.a(y0Var, null, dVar, cVar2, 1, null) == objE) {
                    return objE;
                }
                y0Var.skipItemPlacementAnimation = false;
                return oq.i0.f148189a;
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
                y0Var.skipItemPlacementAnimation = false;
                throw th4;
            }
        } catch (Throwable th7) {
            th = th7;
            y0Var = this;
        }
    }

    public final void s(i0 result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        j0 firstVisibleItem;
        this.prefetchState.j(result.j().size());
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            c3.l.Companion companion = c3.l.INSTANCE;
            c3.l lVarD = companion.d();
            er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                if (this._lazyLayoutScrollDeltaBetweenPasses.c() && (firstVisibleItem = result.getFirstVisibleItem()) != null && firstVisibleItem.getIndex() == this.scrollPosition.a() && result.getFirstVisibleItemScrollOffset() == this.scrollPosition.c()) {
                    this._lazyLayoutScrollDeltaBetweenPasses.d();
                }
                oq.i0 i0Var = oq.i0.f148189a;
                return;
            } finally {
                companion.l(lVarD, lVarE, lVarG);
            }
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        T(result.o());
        U(result.getCanScrollForward());
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.i(result.getFirstVisibleItemScrollOffset());
        } else {
            W(result);
            this.scrollPosition.h(result);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.d(this.prefetchScope, result);
            }
        }
        if (isLookingAhead) {
            this._lazyLayoutScrollDeltaBetweenPasses.e(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final p056h1.e getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final p056h1.r getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final c5.d w() {
        return this.layoutInfoState.getValue().getDensity();
    }

    public final int x() {
        return this.scrollPosition.a();
    }

    public final int y() {
        return this.scrollPosition.c();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public y0(final int i15, int i16, n0 n0Var) {
        this.prefetchStrategy = n0Var;
        r0 r0Var = new r0(i15, i16);
        this.scrollPosition = r0Var;
        this.layoutInfoState = x5.i(b1.f54742a, x5.k());
        this.internalInteractionSource = b1.k.a();
        this.scrollableState = C6466x2.b(new er.l() { // from class: f1.w0
            @Override // er.l
            public final Object b(Object obj) {
                return Float.valueOf(y0.S(this.f54864a, ((Float) obj).floatValue()));
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new f();
        this.awaitLayoutModifier = new p056h1.e();
        this.itemAnimator = new p056h1.f0<>();
        this.beyondBoundsInfo = new p056h1.r();
        this.prefetchState = new l1(n0Var.a(), new er.l() { // from class: f1.x0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.P(this.f54865a, i15, (r2) obj);
            }
        });
        this.prefetchScope = new e();
        this._scrollIndicatorState = new b();
        this.pinnedItems = new k1();
        r0Var.getNearestRangeState();
        this.measurementScopeInvalidator = s2.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = c6.e(bool, null, 2, null);
        this.canScrollBackward = c6.e(bool, null, 2, null);
        this.placementScopeInvalidator = s2.c(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new n1();
    }

    public /* synthetic */ y0(int i15, int i16, n0 n0Var, int i17, fr.k kVar) {
        this((i17 & 1) != 0 ? 0 : i15, (i17 & 2) != 0 ? 0 : i16, (i17 & 4) != 0 ? o0.b(0, 1, null) : n0Var);
    }

    public y0(int i15, int i16) {
        this(i15, i16, o0.b(0, 1, null));
    }
}
