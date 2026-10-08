package p060i1;

import a1.o;
import c5.d;
import c5.r;
import er.l;
import fr.k;
import java.util.List;
import java.util.Map;
import ju.p0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.a;
import p036e4.k2;
import p036e4.x0;
import p071kotlin.Metadata;
import p143z0.a2;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÑ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\u00002\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b3\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b+\u00108R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b5\u00102R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010;\u001a\u0004\b6\u0010<R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u00102R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010;\u001a\u0004\bI\u0010<R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010MR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010;\u001a\u0004\bN\u0010<R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\bO\u0010,\u001a\u0004\bP\u0010.R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\bI\u0010,\u001a\u0004\bQ\u0010.R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bT\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bB\u0010Y\u001a\u0004\bR\u0010ZR\u0014\u0010\\\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010ZR\u0014\u0010]\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00102R\u0011\u0010^\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bO\u0010<R\u0014\u0010_\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u00102R\u0014\u0010a\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u00102R \u0010e\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\u00060b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010dR\"\u0010i\u001a\u0010\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020(\u0018\u00010f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010h¨\u0006j"}, d2 = {"Li1/u0;", "Li1/g0;", "Le4/x0;", "", "Li1/n;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Lz0/a2;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "La1/o;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lju/p0;", "coroutineScope", "Lc5/d;", "density", "Lc5/b;", "childConstraints", "<init>", "(Ljava/util/List;IIILz0/a2;IIZILi1/n;Li1/n;FIZLa1/o;Le4/x0;ZLjava/util/List;Ljava/util/List;Lju/p0;Lc5/d;JLfr/k;)V", "delta", "q", "(I)Li1/u0;", "Loq/i0;", "k", "()V", "a", "Ljava/util/List;", "j", "()Ljava/util/List;", "b", "I", "h", "()I", "c", "n", "d", "e", "Lz0/a2;", "()Lz0/a2;", "f", "g", "Z", "()Z", "i", "o", "Li1/n;", "A", "()Li1/n;", "v", "l", "F", "w", "()F", "m", "B", "s", "La1/o;", "p", "()La1/o;", "Le4/x0;", "getRemeasureNeeded", "r", "z", "y", "t", "Lju/p0;", "u", "()Lju/p0;", "Lc5/d;", "x", "()Lc5/d;", "J", "()J", "Lc5/r;", "viewportSize", "beforeContentPadding", "canScrollBackward", "width", "getHeight", "height", "", "Le4/a;", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "()Ler/l;", "rulers", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 implements g0, x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<n> visiblePagesInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int pageSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pageSpacing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int beyondViewportPageCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final n firstVisiblePage;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final n currentPage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float currentPageOffsetFraction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int firstVisiblePageScrollOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final o snapPosition;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final x0 measureResult;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List<n> extraPagesBefore;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final List<n> extraPagesAfter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0 coroutineScope;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final d density;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long childConstraints;

    public /* synthetic */ u0(List list, int i15, int i16, int i17, a2 a2Var, int i18, int i19, boolean z15, int i25, n nVar, n nVar2, float f15, int i26, boolean z16, o oVar, x0 x0Var, boolean z17, List list2, List list3, p0 p0Var, d dVar, long j15, k kVar) {
        this(list, i15, i16, i17, a2Var, i18, i19, z15, i25, nVar, nVar2, f15, i26, z16, oVar, x0Var, z17, list2, list3, p0Var, dVar, j15);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final n getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: a, reason: from getter */
    public a2 getOrientation() {
        return this.orientation;
    }

    @Override // p060i1.g0
    public long b() {
        return r.c((((long) getHeight()) & BodyPartID.bodyIdMax) | (((long) getWidth()) << 32));
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // p060i1.g0
    public int f() {
        return -getViewportStartOffset();
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // p036e4.x0
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: h, reason: from getter */
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // p036e4.x0
    public Map<a, Integer> i() {
        return this.measureResult.i();
    }

    @Override // p060i1.g0
    public List<n> j() {
        return this.visiblePagesInfo;
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
    public l<k2, i0> m() {
        return this.measureResult.m();
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: o, reason: from getter */
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    @Override // p060i1.g0
    /* JADX INFO: renamed from: p, reason: from getter */
    public o getSnapPosition() {
        return this.snapPosition;
    }

    public final u0 q(int delta) {
        int i15;
        int pageSize = getPageSize() + getPageSpacing();
        if (!this.remeasureNeeded && !j().isEmpty() && this.firstVisiblePage != null && (i15 = this.firstVisiblePageScrollOffset - delta) >= 0 && i15 < pageSize) {
            float f15 = pageSize != 0 ? delta / pageSize : 0.0f;
            float f16 = this.currentPageOffsetFraction - f15;
            if (this.currentPage != null && f16 < 0.5f && f16 > -0.5f) {
                n nVar = (n) v.l0(j());
                n nVar2 = (n) v.x0(j());
                if (delta >= 0 ? Math.min(getViewportStartOffset() - nVar.getOffset(), getViewportEndOffset() - nVar2.getOffset()) > delta : Math.min((nVar.getOffset() + pageSize) - getViewportStartOffset(), (nVar2.getOffset() + pageSize) - getViewportEndOffset()) > (-delta)) {
                    List<n> listJ = j();
                    int size = listJ.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        listJ.get(i16).a(delta);
                    }
                    List<n> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        list.get(i17).a(delta);
                    }
                    List<n> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i18 = 0; i18 < size3; i18++) {
                        list2.get(i18).a(delta);
                    }
                    return new u0(j(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f15, this.firstVisiblePageScrollOffset - delta, this.canScrollForward || delta > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope, this.density, this.childConstraints, null);
                }
            }
        }
        return null;
    }

    public final boolean r() {
        n nVar = this.firstVisiblePage;
        return ((nVar != null ? nVar.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final p0 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final n getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final d getDensity() {
        return this.density;
    }

    public final List<n> y() {
        return this.extraPagesAfter;
    }

    public final List<n> z() {
        return this.extraPagesBefore;
    }

    private u0(List<n> list, int i15, int i16, int i17, a2 a2Var, int i18, int i19, boolean z15, int i25, n nVar, n nVar2, float f15, int i26, boolean z16, o oVar, x0 x0Var, boolean z17, List<n> list2, List<n> list3, p0 p0Var, d dVar, long j15) {
        this.visiblePagesInfo = list;
        this.pageSize = i15;
        this.pageSpacing = i16;
        this.afterContentPadding = i17;
        this.orientation = a2Var;
        this.viewportStartOffset = i18;
        this.viewportEndOffset = i19;
        this.reverseLayout = z15;
        this.beyondViewportPageCount = i25;
        this.firstVisiblePage = nVar;
        this.currentPage = nVar2;
        this.currentPageOffsetFraction = f15;
        this.firstVisiblePageScrollOffset = i26;
        this.canScrollForward = z16;
        this.snapPosition = oVar;
        this.measureResult = x0Var;
        this.remeasureNeeded = z17;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = p0Var;
        this.density = dVar;
        this.childConstraints = j15;
    }

    public /* synthetic */ u0(List list, int i15, int i16, int i17, a2 a2Var, int i18, int i19, boolean z15, int i25, n nVar, n nVar2, float f15, int i26, boolean z16, o oVar, x0 x0Var, boolean z17, List list2, List list3, p0 p0Var, d dVar, long j15, int i27, k kVar) {
        this(list, i15, i16, i17, a2Var, i18, i19, z15, i25, nVar, nVar2, f15, i26, z16, oVar, x0Var, z17, (i27 & PKIFailureInfo.unsupportedVersion) != 0 ? v.n() : list2, (i27 & PKIFailureInfo.transactionIdInUse) != 0 ? v.n() : list3, p0Var, dVar, j15, null);
    }
}
