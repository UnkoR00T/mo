package eh;

/* JADX INFO: loaded from: classes3.dex */
final class bd extends fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f50290d;

    bd() {
    }

    @Override // eh.fd
    public final fd a(boolean z15) {
        this.f50288b = true;
        this.f50290d = (byte) (1 | this.f50290d);
        return this;
    }

    @Override // eh.fd
    public final fd b(int i15) {
        this.f50289c = 1;
        this.f50290d = (byte) (this.f50290d | 2);
        return this;
    }

    @Override // eh.fd
    public final gd c() {
        String str;
        if (this.f50290d == 3 && (str = this.f50287a) != null) {
            return new dd(str, this.f50288b, this.f50289c, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f50287a == null) {
            sb5.append(" libraryName");
        }
        if ((this.f50290d & 1) == 0) {
            sb5.append(" enableFirelog");
        }
        if ((this.f50290d & 2) == 0) {
            sb5.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    public final fd d(String str) {
        this.f50287a = str;
        return this;
    }
}
