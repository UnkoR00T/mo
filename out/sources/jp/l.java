package jp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f104290a = new int[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f104291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f104292c;

    l() {
    }

    private static int a(byte b15) {
        return b15 < 0 ? b15 + HPKE.mode_base : b15;
    }

    private static void c(int[] iArr, int i15, int i16) {
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }

    public void b(byte[] bArr) {
        this.f104291b = 0;
        this.f104292c = 0;
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException("number of bytes must be between 1 and 32");
        }
        int i15 = 0;
        while (true) {
            int[] iArr = this.f104290a;
            if (i15 >= iArr.length) {
                break;
            }
            iArr[i15] = i15;
            i15++;
        }
        int length = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < this.f104290a.length; i17++) {
            int iA = a(bArr[length]);
            int[] iArr2 = this.f104290a;
            i16 = ((iA + iArr2[i17]) + i16) % 256;
            c(iArr2, i17, i16);
            length = (length + 1) % bArr.length;
        }
    }

    public void d(byte b15, OutputStream outputStream) throws IOException {
        int i15 = (this.f104291b + 1) % 256;
        this.f104291b = i15;
        int[] iArr = this.f104290a;
        int i16 = (iArr[i15] + this.f104292c) % 256;
        this.f104292c = i16;
        c(iArr, i15, i16);
        int[] iArr2 = this.f104290a;
        outputStream.write(b15 ^ ((byte) iArr2[(iArr2[this.f104291b] + iArr2[this.f104292c]) % 256]));
    }

    public void e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i15 = inputStream.read(bArr);
            if (i15 == -1) {
                return;
            } else {
                f(bArr, 0, i15, outputStream);
            }
        }
    }

    public void f(byte[] bArr, int i15, int i16, OutputStream outputStream) throws IOException {
        for (int i17 = i15; i17 < i15 + i16; i17++) {
            d(bArr[i17], outputStream);
        }
    }

    public void g(byte[] bArr, OutputStream outputStream) throws IOException {
        for (byte b15 : bArr) {
            d(b15, outputStream);
        }
    }
}
