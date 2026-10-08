package po;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f161381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f161382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f161383c;

    public d(byte[] bArr, byte[] bArr2) {
        this.f161383c = 0;
        if (bArr.length != bArr2.length && bArr.length == 1 && bArr[0] == 0) {
            bArr = new byte[bArr2.length];
        } else if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("The start and the end values must not have different lengths.");
        }
        this.f161381a = new int[bArr.length];
        this.f161382b = new int[bArr2.length];
        for (int i15 = 0; i15 < bArr.length; i15++) {
            this.f161381a[i15] = bArr[i15] & 255;
            this.f161382b[i15] = bArr2[i15] & 255;
        }
        this.f161383c = bArr2.length;
    }

    public int a() {
        return this.f161383c;
    }

    public boolean b(byte[] bArr, int i15) {
        if (this.f161383c != i15) {
            return false;
        }
        for (int i16 = 0; i16 < this.f161383c; i16++) {
            int i17 = bArr[i16] & 255;
            if (i17 < this.f161381a[i16] || i17 > this.f161382b[i16]) {
                return false;
            }
        }
        return true;
    }

    public d() {
        this.f161383c = 0;
    }
}
