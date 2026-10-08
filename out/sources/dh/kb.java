package dh;

/* JADX INFO: loaded from: classes3.dex */
final class kb extends qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f41989d;

    kb() {
    }

    @Override // dh.qb
    public final qb a(boolean z15) {
        this.f41987b = true;
        this.f41989d = (byte) (1 | this.f41989d);
        return this;
    }

    @Override // dh.qb
    public final qb b(int i15) {
        this.f41988c = 1;
        this.f41989d = (byte) (this.f41989d | 2);
        return this;
    }

    @Override // dh.qb
    public final rb c() {
        String str;
        if (this.f41989d == 3 && (str = this.f41986a) != null) {
            return new nb(str, this.f41987b, this.f41988c, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f41986a == null) {
            sb5.append(" libraryName");
        }
        if ((this.f41989d & 1) == 0) {
            sb5.append(" enableFirelog");
        }
        if ((this.f41989d & 2) == 0) {
            sb5.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    public final qb d(String str) {
        this.f41986a = "vision-common";
        return this;
    }
}
