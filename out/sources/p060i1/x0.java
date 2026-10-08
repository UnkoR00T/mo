package p060i1;

import p056h1.f1;
import p056h1.p0;
import p071kotlin.Metadata;
import p076m2.m5;
import p076m2.x2;
import p076m2.x3;
import p076m2.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010\u001dR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010\u001aR\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0017\u00103\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b+\u00102¨\u00064"}, d2 = {"Li1/x0;", "", "", "currentPage", "", "currentPageOffsetFraction", "Li1/i1;", "state", "<init>", "(IFLi1/i1;)V", "page", "offsetFraction", "Loq/i0;", "i", "(IF)V", "Li1/u0;", "measureResult", "k", "(Li1/u0;)V", "index", "f", "Li1/l0;", "itemProvider", "e", "(Li1/l0;I)I", "j", "(F)V", "delta", "a", "(I)V", "Li1/i1;", "getState", "()Li1/i1;", "<set-?>", "b", "Lm2/y2;", "()I", "g", "c", "Lm2/x2;", "()F", "h", "", "d", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownCurrentPageKey", "Lh1/f1;", "Lh1/f1;", "()Lh1/f1;", "nearestRangeState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i1 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y2 currentPage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x2 currentPageOffsetFraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object lastKnownCurrentPageKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final f1 nearestRangeState;

    public x0(int i15, float f15, i1 i1Var) {
        this.state = i1Var;
        this.currentPage = m5.a(i15);
        this.currentPageOffsetFraction = x3.a(f15);
        this.nearestRangeState = new f1(i15, 30, 100);
    }

    private final void g(int i15) {
        this.currentPage.g(i15);
    }

    private final void h(float f15) {
        this.currentPageOffsetFraction.p(f15);
    }

    private final void i(int page, float offsetFraction) {
        g(page);
        this.nearestRangeState.t(page);
        h(offsetFraction);
    }

    public final void a(int delta) {
        h(c() + (this.state.P() == 0 ? 0.0f : delta / this.state.P()));
    }

    public final int b() {
        return this.currentPage.d();
    }

    public final float c() {
        return this.currentPageOffsetFraction.a();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f1 getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int e(l0 itemProvider, int index) {
        int iA = p0.a(itemProvider, this.lastKnownCurrentPageKey, index);
        if (index != iA) {
            g(iA);
            this.nearestRangeState.t(index);
        }
        return iA;
    }

    public final void f(int index, float offsetFraction) {
        i(index, offsetFraction);
        this.lastKnownCurrentPageKey = null;
    }

    public final void j(float offsetFraction) {
        h(offsetFraction);
    }

    public final void k(u0 measureResult) {
        n currentPage = measureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || !measureResult.j().isEmpty()) {
            this.hadFirstNotEmptyLayout = true;
            n currentPage2 = measureResult.getCurrentPage();
            i(currentPage2 != null ? currentPage2.getIndex() : 0, measureResult.getCurrentPageOffsetFraction());
        }
    }
}
