package so;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
class w extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f182824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f182825b = 0;

    w(InputStream inputStream) throws IOException {
        this.f182824a = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int i15 = inputStream.read(bArr);
                if (i15 == -1) {
                    this.f182824a = byteArrayOutputStream.toByteArray();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i15);
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // so.i0
    public short E() throws EOFException {
        int i15 = read();
        int i16 = read();
        if ((i15 | i16) >= 0) {
            return (short) ((i15 << 8) + i16);
        }
        throw new EOFException();
    }

    @Override // so.i0
    public int N() throws EOFException {
        int i15 = read();
        int i16 = read();
        if ((i15 | i16) >= 0) {
            return (i15 << 8) + i16;
        }
        throw new EOFException();
    }

    public int V() throws EOFException {
        int i15 = read();
        int i16 = read();
        int i17 = read();
        int i18 = read();
        if ((i15 | i16 | i17 | i18) >= 0) {
            return (i15 << 24) + (i16 << 16) + (i17 << 8) + i18;
        }
        throw new EOFException();
    }

    @Override // so.i0
    public long b() {
        return this.f182825b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // so.i0
    public InputStream h() {
        return new ByteArrayInputStream(this.f182824a);
    }

    @Override // so.i0
    public long m() {
        return this.f182824a.length;
    }

    @Override // so.i0
    public int read() {
        int i15 = this.f182825b;
        byte[] bArr = this.f182824a;
        if (i15 >= bArr.length) {
            return -1;
        }
        byte b15 = bArr[i15];
        this.f182825b = i15 + 1;
        return (b15 + HPKE.mode_base) % 256;
    }

    @Override // so.i0
    public void seek(long j15) throws IOException {
        if (j15 >= 0 && j15 <= 2147483647L) {
            this.f182825b = (int) j15;
            return;
        }
        throw new IOException("Illegal seek position: " + j15);
    }

    @Override // so.i0
    public long y() {
        return (((long) V()) << 32) + (((long) V()) & BodyPartID.bodyIdMax);
    }

    @Override // so.i0
    public int read(byte[] bArr, int i15, int i16) {
        int i17 = this.f182825b;
        byte[] bArr2 = this.f182824a;
        if (i17 >= bArr2.length) {
            return -1;
        }
        int iMin = Math.min(i16, bArr2.length - i17);
        System.arraycopy(this.f182824a, this.f182825b, bArr, i15, iMin);
        this.f182825b += iMin;
        return iMin;
    }
}
