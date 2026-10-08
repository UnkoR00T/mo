package up;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[][] f199553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f199554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f199555c;

    public a(InputStream inputStream, int[] iArr) {
        super(inputStream);
        this.f199555c = 0L;
        b(iArr);
    }

    private void b(int[] iArr) {
        this.f199553a = new int[iArr.length / 2][];
        for (int i15 = 0; i15 < iArr.length / 2; i15++) {
            int[][] iArr2 = this.f199553a;
            int i16 = i15 * 2;
            int i17 = iArr[i16];
            iArr2[i15] = new int[]{i17, iArr[i16 + 1] + i17};
        }
        this.f199554b = -1;
    }

    private long h() {
        return ((long) this.f199553a[this.f199554b][1]) - this.f199555c;
    }

    private boolean m() throws IOException {
        int i15 = this.f199554b;
        if (i15 + 1 >= this.f199553a.length) {
            return false;
        }
        this.f199554b = i15 + 1;
        while (true) {
            long j15 = this.f199555c;
            int i16 = this.f199553a[this.f199554b][0];
            if (j15 >= i16) {
                return true;
            }
            long jSkip = super.skip(((long) i16) - j15);
            if (jSkip == 0) {
                throw new IOException("FilterInputStream.skip() returns 0, range: " + Arrays.toString(this.f199553a[this.f199554b]));
            }
            this.f199555c += jSkip;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if ((this.f199554b == -1 || h() <= 0) && !m()) {
            return -1;
        }
        int i15 = super.read();
        this.f199555c++;
        return i15;
    }

    public a(byte[] bArr, int[] iArr) {
        this(new ByteArrayInputStream(bArr), iArr);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        if ((this.f199554b == -1 || h() <= 0) && !m()) {
            return -1;
        }
        int i17 = super.read(bArr, i15, (int) Math.min(i16, h()));
        this.f199555c += (long) i17;
        return i17;
    }
}
