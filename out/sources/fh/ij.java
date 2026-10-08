package fh;

/* JADX INFO: loaded from: classes3.dex */
final class ij extends nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f63139d;

    ij() {
    }

    @Override // fh.nj
    public final nj a(boolean z15) {
        this.f63137b = true;
        this.f63139d = (byte) (1 | this.f63139d);
        return this;
    }

    @Override // fh.nj
    public final nj b(int i15) {
        this.f63138c = 1;
        this.f63139d = (byte) (this.f63139d | 2);
        return this;
    }

    @Override // fh.nj
    public final oj c() {
        String str;
        if (this.f63139d == 3 && (str = this.f63136a) != null) {
            return new kj(str, this.f63137b, this.f63138c, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f63136a == null) {
            sb5.append(" libraryName");
        }
        if ((this.f63139d & 1) == 0) {
            sb5.append(" enableFirelog");
        }
        if ((this.f63139d & 2) == 0) {
            sb5.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    public final nj d(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f63136a = str;
        return this;
    }
}
