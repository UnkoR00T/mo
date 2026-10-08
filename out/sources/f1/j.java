package f1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t¨\u0006\u0019"}, d2 = {"Lf1/j;", "Lh1/w;", "Lf1/y0;", "state", "", "beyondBoundsItemCount", "<init>", "(Lf1/y0;I)V", "c", "()I", "a", "Lf1/y0;", "getState", "()Lf1/y0;", "b", "I", "getBeyondBoundsItemCount", "itemCount", "", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements p056h1.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int beyondBoundsItemCount;

    public j(y0 y0Var, int i15) {
        this.state = y0Var;
        this.beyondBoundsItemCount = i15;
    }

    @Override // p056h1.w
    public int a() {
        return this.state.C().getTotalItemsCount();
    }

    @Override // p056h1.w
    public boolean b() {
        return !this.state.C().j().isEmpty();
    }

    @Override // p056h1.w
    public int c() {
        if (this.state.C().j().isEmpty()) {
            return 0;
        }
        int iD = a1.f.d(this.state.C());
        int iA = c0.a(this.state.C());
        if (iA == 0) {
            return 1;
        }
        return lr.m.e(iD / iA, 1);
    }

    @Override // p056h1.w
    public int d() {
        return Math.max(0, this.state.x() - this.beyondBoundsItemCount);
    }

    @Override // p056h1.w
    public int e() {
        return Math.min(a() - 1, ((q) pq.v.x0(this.state.C().j())).getIndex() + this.beyondBoundsItemCount);
    }
}
