package hi;

/* JADX INFO: loaded from: classes4.dex */
final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f84784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f84787d;

    d() {
    }

    @Override // hi.b
    public final b a(boolean z15) {
        this.f84784a = z15;
        this.f84787d = (byte) 1;
        return this;
    }

    @Override // hi.b
    public final c b() {
        if (this.f84787d == 1) {
            return new e(this.f84784a, this.f84785b, this.f84786c, null);
        }
        throw new IllegalStateException("Missing required properties: appCheckEnabled");
    }
}
