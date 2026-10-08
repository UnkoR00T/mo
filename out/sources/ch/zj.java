package ch;

/* JADX INFO: loaded from: classes3.dex */
final class zj extends ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f26767d;

    zj() {
    }

    @Override // ch.ek
    public final ek a(boolean z15) {
        this.f26765b = true;
        this.f26767d = (byte) (1 | this.f26767d);
        return this;
    }

    @Override // ch.ek
    public final ek b(int i15) {
        this.f26766c = 1;
        this.f26767d = (byte) (this.f26767d | 2);
        return this;
    }

    @Override // ch.ek
    public final fk c() {
        String str;
        if (this.f26767d == 3 && (str = this.f26764a) != null) {
            return new bk(str, this.f26765b, this.f26766c, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f26764a == null) {
            sb5.append(" libraryName");
        }
        if ((this.f26767d & 1) == 0) {
            sb5.append(" enableFirelog");
        }
        if ((this.f26767d & 2) == 0) {
            sb5.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    public final ek d(String str) {
        this.f26764a = str;
        return this;
    }
}
