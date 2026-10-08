package ii;

/* JADX INFO: loaded from: classes4.dex */
final class t1 extends z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f92769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f92770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f92771c;

    t1() {
    }

    @Override // ii.z6
    final z6 a(int i15) {
        this.f92770b = i15;
        this.f92771c = (byte) (this.f92771c | 2);
        return this;
    }

    @Override // ii.z6
    final b0 b() {
        if (this.f92771c == 3) {
            return new g5(this.f92769a, this.f92770b);
        }
        StringBuilder sb5 = new StringBuilder();
        if ((this.f92771c & 1) == 0) {
            sb5.append(" hours");
        }
        if ((this.f92771c & 2) == 0) {
            sb5.append(" minutes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    final z6 c(int i15) {
        this.f92769a = i15;
        this.f92771c = (byte) (this.f92771c | 1);
        return this;
    }
}
