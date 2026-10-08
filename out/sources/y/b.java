package y;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
class b extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final OutputStream f222442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteOrder f222443b;

    b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f222442a = outputStream;
        this.f222443b = byteOrder;
    }

    public void b(ByteOrder byteOrder) {
        this.f222443b = byteOrder;
    }

    public void h(int i15) throws IOException {
        this.f222442a.write(i15);
    }

    public void m(int i15) throws IOException {
        ByteOrder byteOrder = this.f222443b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f222442a.write(i15 & GF2Field.MASK);
            this.f222442a.write((i15 >>> 8) & GF2Field.MASK);
            this.f222442a.write((i15 >>> 16) & GF2Field.MASK);
            this.f222442a.write((i15 >>> 24) & GF2Field.MASK);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f222442a.write((i15 >>> 24) & GF2Field.MASK);
            this.f222442a.write((i15 >>> 16) & GF2Field.MASK);
            this.f222442a.write((i15 >>> 8) & GF2Field.MASK);
            this.f222442a.write(i15 & GF2Field.MASK);
        }
    }

    public void p(short s15) throws IOException {
        ByteOrder byteOrder = this.f222443b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f222442a.write(s15 & 255);
            this.f222442a.write((s15 >>> 8) & GF2Field.MASK);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f222442a.write((s15 >>> 8) & GF2Field.MASK);
            this.f222442a.write(s15 & 255);
        }
    }

    public void r(long j15) throws IOException {
        m((int) j15);
    }

    public void u(int i15) throws IOException {
        p((short) i15);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f222442a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        this.f222442a.write(bArr, i15, i16);
    }
}
