package f1;

import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.k2;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010I\u001a\u0004\bE\u0010JR\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010,\u001a\u0004\b;\u0010.R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010,\u001a\u0004\b3\u0010.R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b7\u0010.R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u00100\u001a\u0004\bN\u00102R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010O\u001a\u0004\b'\u0010PR\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b=\u0010.R\u0011\u0010Q\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bM\u00102R\u0014\u0010S\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010HR\u0014\u0010T\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010.R\u0014\u0010U\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010.R\u0014\u0010W\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010.R \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00050X8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010ZR\"\u0010_\u001a\u0010\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020$\u0018\u00010\\8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010^¨\u0006`"}, d2 = {"Lf1/i0;", "Lf1/b0;", "Le4/x0;", "Lf1/j0;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lju/p0;", "coroutineScope", "Lc5/d;", "density", "Lc5/b;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Lz0/a2;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Lf1/j0;IZFLe4/x0;FZLju/p0;Lc5/d;JLjava/util/List;IIIZLz0/a2;IILfr/k;)V", "delta", "updateAnimations", "n", "(IZ)Lf1/i0;", "Loq/i0;", "k", "()V", "a", "Lf1/j0;", "u", "()Lf1/j0;", "b", "I", "v", "()I", "c", "Z", "p", "()Z", "d", "F", "r", "()F", "e", "Le4/x0;", "f", "x", "g", "getRemeasureNeeded", "h", "Lju/p0;", "s", "()Lju/p0;", "i", "Lc5/d;", "t", "()Lc5/d;", "j", "J", "q", "()J", "Ljava/util/List;", "()Ljava/util/List;", "l", "m", "o", "w", "Lz0/a2;", "()Lz0/a2;", "canScrollBackward", "Lc5/r;", "viewportSize", "beforeContentPadding", "width", "getHeight", "height", "", "Le4/a;", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "()Ler/l;", "rulers", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements b0, p036e4.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 firstVisibleItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int firstVisibleItemScrollOffset;

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
    private final long childConstraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<j0> visibleItemsInfo;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    public /* synthetic */ i0(j0 j0Var, int i15, boolean z15, float f15, p036e4.x0 x0Var, float f16, boolean z16, ju.p0 p0Var, c5.d dVar, long j15, List list, int i16, int i17, int i18, boolean z17, a2 a2Var, int i19, int i25, fr.k kVar) {
        this(j0Var, i15, z15, f15, x0Var, f16, z16, p0Var, dVar, j15, list, i16, i17, i18, z17, a2Var, i19, i25);
    }

    @Override // f1.b0
    /* JADX INFO: renamed from: a, reason: from getter */
    public a2 getOrientation() {
        return this.orientation;
    }

    @Override // f1.b0
    public long b() {
        return c5.r.c((((long) getF10180b()) & BodyPartID.bodyIdMax) | (((long) getF10179a()) << 32));
    }

    @Override // f1.b0
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // f1.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // f1.b0
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // f1.b0
    public int f() {
        return -getViewportStartOffset();
    }

    @Override // f1.b0
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // p036e4.x0
    /* JADX INFO: renamed from: getHeight */
    public int getF10180b() {
        return this.measureResult.getF10180b();
    }

    @Override // f1.b0
    /* JADX INFO: renamed from: h, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // p036e4.x0
    public Map<p036e4.a, Integer> i() {
        return this.measureResult.i();
    }

    @Override // f1.b0
    public List<j0> j() {
        return this.visibleItemsInfo;
    }

    @Override // p036e4.x0
    public void k() {
        this.measureResult.k();
    }

    @Override // p036e4.x0
    /* JADX INFO: renamed from: l */
    public int getF10179a() {
        return this.measureResult.getF10179a();
    }

    @Override // p036e4.x0
    public er.l<k2, oq.i0> m() {
        return this.measureResult.m();
    }

    public final i0 n(int delta, boolean updateAnimations) {
        j0 j0Var;
        if (!this.remeasureNeeded && !j().isEmpty() && (j0Var = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = j0Var.getMainAxisSizeWithSpacings();
            int i15 = this.firstVisibleItemScrollOffset - delta;
            if (i15 >= 0 && i15 < mainAxisSizeWithSpacings) {
                j0 j0Var2 = (j0) pq.v.l0(j());
                j0 j0Var3 = (j0) pq.v.x0(j());
                if (!j0Var2.getNonScrollableItem() && !j0Var3.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - j0Var2.getOffset(), getViewportEndOffset() - j0Var3.getOffset()) > delta : Math.min((j0Var2.getOffset() + j0Var2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (j0Var3.getOffset() + j0Var3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    List<j0> listJ = j();
                    int size = listJ.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        listJ.get(i16).b(delta, updateAnimations);
                    }
                    return new i0(this.firstVisibleItem, this.firstVisibleItemScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.childConstraints, j(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
                }
            }
        }
        return null;
    }

    public final boolean o() {
        j0 j0Var = this.firstVisibleItem;
        return ((j0Var != null ? j0Var.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final ju.p0 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final c5.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final j0 getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    private i0(j0 j0Var, int i15, boolean z15, float f15, p036e4.x0 x0Var, float f16, boolean z16, ju.p0 p0Var, c5.d dVar, long j15, List<j0> list, int i16, int i17, int i18, boolean z17, a2 a2Var, int i19, int i25) {
        this.firstVisibleItem = j0Var;
        this.firstVisibleItemScrollOffset = i15;
        this.canScrollForward = z15;
        this.consumedScroll = f15;
        this.measureResult = x0Var;
        this.scrollBackAmount = f16;
        this.remeasureNeeded = z16;
        this.coroutineScope = p0Var;
        this.density = dVar;
        this.childConstraints = j15;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i16;
        this.viewportEndOffset = i17;
        this.totalItemsCount = i18;
        this.reverseLayout = z17;
        this.orientation = a2Var;
        this.afterContentPadding = i19;
        this.mainAxisItemSpacing = i25;
    }
}
