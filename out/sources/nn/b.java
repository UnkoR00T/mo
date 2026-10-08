package nn;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f137279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137280b = 0;

    b(int i15) {
        this.f137279a = new byte[i15];
    }

    private void c(int i15, boolean z15) {
        this.f137279a[i15] = z15 ? (byte) 1 : (byte) 0;
    }

    void a(boolean z15, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f137280b;
            this.f137280b = i17 + 1;
            c(i17, z15);
        }
    }

    byte[] b(int i15) {
        int length = this.f137279a.length * i15;
        byte[] bArr = new byte[length];
        for (int i16 = 0; i16 < length; i16++) {
            bArr[i16] = this.f137279a[i16 / i15];
        }
        return bArr;
    }
}
