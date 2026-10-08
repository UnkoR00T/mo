package ii;

/* JADX INFO: loaded from: classes4.dex */
final class r1 extends y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f92746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f92747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f92748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f92749d;

    r1() {
    }

    @Override // ii.y6
    final y6 a(int i15) {
        this.f92747b = i15;
        this.f92749d = (byte) (this.f92749d | 2);
        return this;
    }

    @Override // ii.y6
    final y6 b(int i15) {
        this.f92748c = i15;
        this.f92749d = (byte) (this.f92749d | 4);
        return this;
    }

    @Override // ii.y6
    final a0 c() {
        if (this.f92749d == 7) {
            return new e5(this.f92746a, this.f92747b, this.f92748c);
        }
        StringBuilder sb5 = new StringBuilder();
        if ((this.f92749d & 1) == 0) {
            sb5.append(" year");
        }
        if ((this.f92749d & 2) == 0) {
            sb5.append(" month");
        }
        if ((this.f92749d & 4) == 0) {
            sb5.append(" day");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    final y6 d(int i15) {
        this.f92746a = i15;
        this.f92749d = (byte) (this.f92749d | 1);
        return this;
    }
}
