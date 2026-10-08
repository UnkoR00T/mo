package g1;

import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.k2;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÙ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u0004\u0018\u00010\u00002\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b@\u00105\u001a\u0004\bA\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bK\u00103R5\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u00138\u0006¢\u0006\f\n\u0004\b*\u0010L\u001a\u0004\bM\u0010NR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00138\u0006¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bJ\u0010SR\u001a\u0010\u001b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b@\u00103R\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u00101\u001a\u0004\b8\u00103R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b<\u00103R\u001a\u0010\u001e\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\bU\u00107R\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010V\u001a\u0004\b,\u0010WR\u001a\u0010!\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\b4\u00103R\u001a\u0010\"\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\bB\u00103R\u0011\u0010X\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bT\u00107R\u0014\u0010[\u001a\u00020Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010ZR\u0014\u0010\\\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00103R\u0014\u0010]\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u00103R\u0014\u0010_\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u00103R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00050`8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010bR\"\u0010e\u001a\u0010\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020)\u0018\u00010\u00138VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010N¨\u0006f"}, d2 = {"Lg1/k0;", "Lg1/d0;", "Le4/x0;", "Lg1/n0;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lju/p0;", "coroutineScope", "Lc5/d;", "density", "slotsPerLine", "Lkotlin/Function1;", "", "Loq/r;", "Lc5/b;", "prefetchInfoRetriever", "lineIndexProvider", "Lg1/l0;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Lz0/a2;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Lg1/n0;IZFLe4/x0;FZLju/p0;Lc5/d;ILer/l;Ler/l;Ljava/util/List;IIIZLz0/a2;II)V", "delta", "updateAnimations", "n", "(IZ)Lg1/k0;", "Loq/i0;", "k", "()V", "a", "Lg1/n0;", "t", "()Lg1/n0;", "b", "I", "u", "()I", "c", "Z", "p", "()Z", "d", "F", "q", "()F", "e", "Le4/x0;", "f", "x", "g", "getRemeasureNeeded", "h", "Lju/p0;", "r", "()Lju/p0;", "i", "Lc5/d;", "s", "()Lc5/d;", "j", "getSlotsPerLine", "Ler/l;", "v", "()Ler/l;", "l", "getLineIndexProvider", "m", "Ljava/util/List;", "()Ljava/util/List;", "o", "w", "Lz0/a2;", "()Lz0/a2;", "canScrollBackward", "Lc5/r;", "()J", "viewportSize", "beforeContentPadding", "width", "getHeight", "height", "", "Le4/a;", "()Ljava/util/Map;", "alignmentLines", "Le4/k2;", "rulers", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 implements d0, p036e4.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n0 firstVisibleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int firstVisibleLineScrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float consumedScroll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p036e4.x0 measureResult;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float scrollBackAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 coroutineScope;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c5.d density;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int slotsPerLine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final er.l<Integer, List<oq.r<Integer, c5.b>>> prefetchInfoRetriever;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final er.l<Integer, Integer> lineIndexProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<l0> visibleItemsInfo;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(n0 n0Var, int i15, boolean z15, float f15, p036e4.x0 x0Var, float f16, boolean z16, ju.p0 p0Var, c5.d dVar, int i16, er.l<? super Integer, ? extends List<oq.r<Integer, c5.b>>> lVar, er.l<? super Integer, Integer> lVar2, List<l0> list, int i17, int i18, int i19, boolean z17, a2 a2Var, int i25, int i26) {
        this.firstVisibleLine = n0Var;
        this.firstVisibleLineScrollOffset = i15;
        this.canScrollForward = z15;
        this.consumedScroll = f15;
        this.measureResult = x0Var;
        this.scrollBackAmount = f16;
        this.remeasureNeeded = z16;
        this.coroutineScope = p0Var;
        this.density = dVar;
        this.slotsPerLine = i16;
        this.prefetchInfoRetriever = lVar;
        this.lineIndexProvider = lVar2;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i17;
        this.viewportEndOffset = i18;
        this.totalItemsCount = i19;
        this.reverseLayout = z17;
        this.orientation = a2Var;
        this.afterContentPadding = i25;
        this.mainAxisItemSpacing = i26;
    }

    @Override // g1.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public a2 getOrientation() {
        return this.orientation;
    }

    @Override // g1.d0
    public long b() {
        return c5.r.c((((long) getHeight()) & BodyPartID.bodyIdMax) | (((long) getWidth()) << 32));
    }

    @Override // g1.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // g1.d0
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // g1.d0
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // g1.d0
    public int f() {
        return -getViewportStartOffset();
    }

    @Override // g1.d0
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // p036e4.x0
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // g1.d0
    /* JADX INFO: renamed from: h, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // p036e4.x0
    public Map<p036e4.a, Integer> i() {
        return this.measureResult.i();
    }

    @Override // g1.d0
    public List<l0> j() {
        return this.visibleItemsInfo;
    }

    @Override // p036e4.x0
    public void k() {
        this.measureResult.k();
    }

    @Override // p036e4.x0
    /* JADX INFO: renamed from: l */
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // p036e4.x0
    public er.l<k2, oq.i0> m() {
        return this.measureResult.m();
    }

    public final k0 n(int delta, boolean updateAnimations) {
        n0 n0Var;
        if (!this.remeasureNeeded && !j().isEmpty() && (n0Var = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = n0Var.getMainAxisSizeWithSpacings();
            int i15 = this.firstVisibleLineScrollOffset - delta;
            if (i15 >= 0 && i15 < mainAxisSizeWithSpacings) {
                l0 l0Var = (l0) pq.v.l0(j());
                l0 l0Var2 = (l0) pq.v.x0(j());
                if (!l0Var.getNonScrollableItem() && !l0Var2.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - a1.e.b(l0Var, getOrientation()), getViewportEndOffset() - a1.e.b(l0Var2, getOrientation())) > delta : Math.min((a1.e.b(l0Var, getOrientation()) + l0Var.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (a1.e.b(l0Var2, getOrientation()) + l0Var2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    List<l0> listJ = j();
                    int size = listJ.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        listJ.get(i16).p(delta, updateAnimations);
                    }
                    return new k0(this.firstVisibleLine, this.firstVisibleLineScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.slotsPerLine, this.prefetchInfoRetriever, this.lineIndexProvider, j(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing());
                }
            }
        }
        return null;
    }

    public final boolean o() {
        n0 n0Var = this.firstVisibleLine;
        return ((n0Var != null ? n0Var.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final ju.p0 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final c5.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final n0 getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public final er.l<Integer, List<oq.r<Integer, c5.b>>> v() {
        return this.prefetchInfoRetriever;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }
}
