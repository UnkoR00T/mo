package gn;

/* JADX INFO: loaded from: classes4.dex */
final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f74980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f74981d;

    b(g gVar, int i15, int i16) {
        super(gVar);
        this.f74980c = i15;
        this.f74981d = i16;
    }

    @Override // gn.g
    public void c(hn.a aVar, byte[] bArr) {
        int i15 = this.f74981d;
        for (int i16 = 0; i16 < i15; i16++) {
            if (i16 == 0 || (i16 == 31 && i15 <= 62)) {
                aVar.e(31, 5);
                if (i15 > 62) {
                    aVar.e(i15 - 31, 16);
                } else if (i16 == 0) {
                    aVar.e(Math.min(i15, 31), 5);
                } else {
                    aVar.e(i15 - 31, 5);
                }
            }
            aVar.e(bArr[this.f74980c + i16], 8);
        }
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<");
        sb5.append(this.f74980c);
        sb5.append("::");
        sb5.append((this.f74980c + this.f74981d) - 1);
        sb5.append('>');
        return sb5.toString();
    }
}
