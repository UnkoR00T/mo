package gn;

/* JADX INFO: loaded from: classes4.dex */
final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f74990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f74991d;

    e(g gVar, int i15, int i16) {
        super(gVar);
        this.f74990c = (short) i15;
        this.f74991d = (short) i16;
    }

    @Override // gn.g
    void c(hn.a aVar, byte[] bArr) {
        aVar.e(this.f74990c, this.f74991d);
    }

    public String toString() {
        short s15 = this.f74990c;
        short s16 = this.f74991d;
        return '<' + Integer.toBinaryString((s15 & ((1 << s16) - 1)) | (1 << s16) | (1 << this.f74991d)).substring(1) + '>';
    }
}
