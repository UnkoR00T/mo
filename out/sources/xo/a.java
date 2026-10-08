package xo;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements DataInput {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f220172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f220173g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ByteOrder f220167a = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f220168b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f220169c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f220170d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f220171e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f220174h = new byte[8];

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long[] f220175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f220176b;

        private b() {
            this.f220175a = new long[10];
            this.f220176b = 0;
        }
    }

    public a() {
        this.f220172f = new b();
        this.f220173g = new b();
    }

    protected final void a() throws IOException {
        if (this.f220171e) {
            throw new IOException("stream is closed");
        }
    }

    public void b(long j15) {
        if (j15 > f()) {
            throw new IndexOutOfBoundsException("Trying to flush outside of current position");
        }
        if (j15 < this.f220169c) {
            throw new IndexOutOfBoundsException("Trying to flush within already flushed portion");
        }
        this.f220169c = j15;
    }

    public int c() throws IOException {
        a();
        return this.f220170d;
    }

    public void close() throws IOException {
        a();
        this.f220171e = true;
    }

    public ByteOrder d() {
        return this.f220167a;
    }

    public long e() {
        return this.f220169c;
    }

    public long f() throws IOException {
        a();
        return this.f220168b;
    }

    protected void finalize() throws Throwable {
        if (this.f220171e) {
            return;
        }
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public void flush() {
        b(f());
    }

    public int g() throws IOException {
        a();
        int i15 = this.f220170d;
        int i16 = read();
        if (i16 == -1) {
            throw new EOFException();
        }
        int i17 = (i15 + 1) & 7;
        if (i17 != 0) {
            i16 >>= 8 - i17;
            i(f() - 1);
        }
        this.f220170d = i17;
        return i16 & 1;
    }

    public long h(int i15) throws IOException {
        a();
        if (i15 < 0 || i15 > 64) {
            throw new IllegalArgumentException();
        }
        long jG = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            jG = (jG << 1) | ((long) g());
        }
        return jG;
    }

    public void i(long j15) throws IOException {
        a();
        if (j15 < e()) {
            throw new IllegalArgumentException("trying to seek before flushed pos");
        }
        this.f220170d = 0;
        this.f220168b = j15;
    }

    public void j(ByteOrder byteOrder) {
        this.f220167a = byteOrder;
    }

    public long k(long j15) throws IOException {
        i(f() + j15);
        return j15;
    }

    public abstract int read();

    public abstract int read(byte[] bArr, int i15, int i16);

    @Override // java.io.DataInput
    public boolean readBoolean() throws EOFException {
        int i15 = read();
        if (i15 >= 0) {
            return i15 != 0;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public byte readByte() throws EOFException {
        int i15 = read();
        if (i15 >= 0) {
            return (byte) i15;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public char readChar() {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i15, int i16) throws EOFException {
        if (i15 < 0 || i16 < 0 || i15 + i16 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (i16 > 0) {
            int i17 = read(bArr, i15, i16);
            if (i17 == -1) {
                throw new EOFException();
            }
            i15 += i17;
            i16 -= i17;
        }
    }

    @Override // java.io.DataInput
    public int readInt() throws EOFException {
        int i15;
        byte b15;
        if (read(this.f220174h, 0, 4) < 0) {
            throw new EOFException();
        }
        if (this.f220167a == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f220174h;
            i15 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
            b15 = bArr[3];
        } else {
            byte[] bArr2 = this.f220174h;
            i15 = ((bArr2[3] & 255) << 24) | ((bArr2[2] & 255) << 16) | ((bArr2[1] & 255) << 8);
            b15 = bArr2[0];
        }
        return (b15 & 255) | i15;
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException {
        StringBuilder sb5 = new StringBuilder(80);
        boolean z15 = true;
        while (true) {
            int i15 = read();
            if (i15 != -1) {
                if (i15 != 10) {
                    if (i15 == 13) {
                        int i16 = read();
                        if (i16 != 10 && i16 != -1) {
                            i(f() - 1);
                        }
                    } else {
                        sb5.append((char) i15);
                        z15 = false;
                    }
                }
                z15 = false;
                break;
            }
            break;
        }
        if (z15) {
            return null;
        }
        return sb5.toString();
    }

    @Override // java.io.DataInput
    public long readLong() throws EOFException {
        if (read(this.f220174h, 0, 8) < 0) {
            throw new EOFException();
        }
        if (this.f220167a == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f220174h;
            return ((((long) (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255))) & BodyPartID.bodyIdMax) << 32) | (((long) ((bArr[7] & 255) | ((bArr[6] & 255) << 8) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16))) & BodyPartID.bodyIdMax);
        }
        byte[] bArr2 = this.f220174h;
        int i15 = (bArr2[0] & 255) | ((bArr2[3] & 255) << 24) | ((bArr2[2] & 255) << 16) | ((bArr2[1] & 255) << 8);
        return (((long) i15) & BodyPartID.bodyIdMax) | ((((long) ((bArr2[4] & 255) | (((bArr2[5] & 255) << 8) | (((bArr2[7] & 255) << 24) | ((bArr2[6] & 255) << 16))))) & BodyPartID.bodyIdMax) << 32);
    }

    @Override // java.io.DataInput
    public short readShort() throws EOFException {
        int i15;
        byte b15;
        if (read(this.f220174h, 0, 2) < 0) {
            throw new EOFException();
        }
        if (this.f220167a == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f220174h;
            i15 = bArr[0] << 8;
            b15 = bArr[1];
        } else {
            byte[] bArr2 = this.f220174h;
            i15 = bArr2[1] << 8;
            b15 = bArr2[0];
        }
        return (short) ((b15 & 255) | i15);
    }

    @Override // java.io.DataInput
    public String readUTF() throws EOFException {
        ByteOrder byteOrderD = d();
        j(ByteOrder.BIG_ENDIAN);
        int unsignedShort = readUnsignedShort();
        char[] cArr = new char[unsignedShort];
        readFully(new byte[unsignedShort], 0, unsignedShort);
        j(byteOrderD);
        return new DataInputStream(new ByteArrayInputStream(this.f220174h)).readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws EOFException {
        int i15 = read();
        if (i15 >= 0) {
            return i15;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        return readShort() & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i15) {
        return (int) k(i15);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws EOFException {
        readFully(bArr, 0, bArr.length);
    }
}
