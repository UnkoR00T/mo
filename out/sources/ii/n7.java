package ii;

/* JADX INFO: loaded from: classes4.dex */
final class n7 extends t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f92671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f92672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f92673c;

    n7() {
    }

    @Override // ii.t6
    public final t6 a(int i15) {
        this.f92671a = i15;
        this.f92673c = (byte) (this.f92673c | 1);
        return this;
    }

    @Override // ii.t6
    public final t6 b(int i15) {
        this.f92672b = i15;
        this.f92673c = (byte) (this.f92673c | 2);
        return this;
    }

    @Override // ii.t6
    public final u6 c() {
        if (this.f92673c == 3) {
            return new z3(this.f92671a, this.f92672b);
        }
        StringBuilder sb5 = new StringBuilder();
        if ((this.f92673c & 1) == 0) {
            sb5.append(" offset");
        }
        if ((this.f92673c & 2) == 0) {
            sb5.append(" length");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }
}
