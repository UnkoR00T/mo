package g1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lg1/f;", "Lh1/w;", "Lg1/e1;", "state", "<init>", "(Lg1/e1;)V", "", "c", "()I", "a", "Lg1/e1;", "getState", "()Lg1/e1;", "itemCount", "", "b", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements p056h1.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e1 state;

    public f(e1 e1Var) {
        this.state = e1Var;
    }

    @Override // p056h1.w
    public int a() {
        return this.state.A().getTotalItemsCount();
    }

    @Override // p056h1.w
    public boolean b() {
        return !this.state.A().j().isEmpty();
    }

    @Override // p056h1.w
    public int c() {
        if (this.state.A().j().isEmpty()) {
            return 0;
        }
        int iA = a1.e.a(this.state.A());
        int iA2 = e0.a(this.state.A());
        if (iA2 == 0) {
            return 1;
        }
        return lr.m.e(iA / iA2, 1);
    }

    @Override // p056h1.w
    public int d() {
        return this.state.v();
    }

    @Override // p056h1.w
    public int e() {
        return ((m) pq.v.x0(this.state.A().j())).getIndex();
    }
}
