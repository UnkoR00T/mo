package ro;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f175347c = {1, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f175348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f175349b;

    public a(InputStream inputStream) throws IOException {
        c(d(inputStream));
    }

    private void c(byte[] bArr) throws IOException {
        if (bArr.length < 18) {
            throw new IOException("PFB header missing");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        this.f175348a = new byte[bArr.length - 18];
        this.f175349b = new int[f175347c.length];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = f175347c;
            if (i15 >= iArr.length) {
                return;
            }
            if (byteArrayInputStream.read() != 128) {
                throw new IOException("Start marker missing");
            }
            if (byteArrayInputStream.read() != iArr[i15]) {
                throw new IOException("Incorrect record type");
            }
            int i17 = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8) + (byteArrayInputStream.read() << 16) + (byteArrayInputStream.read() << 24);
            if (i17 < 0) {
                throw new IOException("PFB record size is negative: " + i17);
            }
            this.f175349b[i15] = i17;
            byte[] bArr2 = this.f175348a;
            if (i16 >= bArr2.length) {
                throw new EOFException("attempted to read past EOF");
            }
            if (i17 > bArr2.length - i16) {
                throw new EOFException("attempted to read " + i17 + " bytes at position " + i16 + " into array of size " + this.f175348a.length + ", but only space for " + (this.f175348a.length - i16) + " bytes left");
            }
            int i18 = byteArrayInputStream.read(bArr2, i16, i17);
            if (i18 < 0) {
                throw new EOFException();
            }
            i16 += i18;
            i15++;
        }
    }

    private byte[] d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[65535];
        while (true) {
            int i15 = inputStream.read(bArr);
            if (i15 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i15);
        }
    }

    public byte[] a() {
        return Arrays.copyOfRange(this.f175348a, 0, this.f175349b[0]);
    }

    public byte[] b() {
        byte[] bArr = this.f175348a;
        int[] iArr = this.f175349b;
        int i15 = iArr[0];
        return Arrays.copyOfRange(bArr, i15, iArr[1] + i15);
    }

    public a(byte[] bArr) throws IOException {
        c(bArr);
    }
}
