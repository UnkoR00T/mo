package p060i1;

import lr.m;
import p056h1.w;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Li1/r;", "Lh1/w;", "Li1/i1;", "state", "", "beyondViewportPageCount", "<init>", "(Li1/i1;I)V", "c", "()I", "a", "Li1/i1;", "b", "I", "itemCount", "", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i1 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int beyondViewportPageCount;

    public r(i1 i1Var, int i15) {
        this.state = i1Var;
        this.beyondViewportPageCount = i15;
    }

    @Override // p056h1.w
    public int a() {
        return this.state.N();
    }

    @Override // p056h1.w
    public boolean b() {
        return !this.state.I().j().isEmpty();
    }

    @Override // p056h1.w
    public int c() {
        if (this.state.I().j().size() == 0) {
            return 0;
        }
        int iA = h0.a(this.state.I());
        int pageSize = this.state.I().getPageSize() + this.state.I().getPageSpacing();
        if (pageSize == 0) {
            return 1;
        }
        return m.e(iA / pageSize, 1);
    }

    @Override // p056h1.w
    public int d() {
        return Math.max(0, this.state.getFirstVisiblePage() - this.beyondViewportPageCount);
    }

    @Override // p056h1.w
    public int e() {
        return Math.min(a() - 1, ((o) v.x0(this.state.I().j())).getIndex() + this.beyondViewportPageCount);
    }
}
