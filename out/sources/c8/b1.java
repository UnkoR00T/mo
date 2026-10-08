package c8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f24157d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f24158e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f24159a = u7.l.f195962a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24161c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24160b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i15;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i16 = iLimit - iPosition;
        int i17 = (i16 + GF2Field.MASK) / GF2Field.MASK;
        int length = i17 + 27 + i16;
        if (this.f24160b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f24157d.length;
            length += f24158e.length + length2;
            i15 = length2;
        } else {
            i15 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f24160b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f24157d);
            }
            byteBufferC.put(f24158e);
        }
        int iJ = this.f24161c + x7.i.j(byteBuffer);
        this.f24161c = iJ;
        f(byteBufferC, iJ, this.f24160b, i17, false);
        for (int i18 = 0; i18 < i17; i18++) {
            if (i16 >= 255) {
                byteBufferC.put((byte) -1);
                i16 -= 255;
            } else {
                byteBufferC.put((byte) i16);
                i16 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f24160b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i15;
            byte[] bArr2 = f24158e;
            byteBufferC.putInt(i15 + bArr2.length + 22, w7.o0.w(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, w7.o0.w(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f24160b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i15) {
        if (this.f24159a.capacity() < i15) {
            this.f24159a = ByteBuffer.allocate(i15).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f24159a.clear();
        }
        return this.f24159a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(ek.j.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, w7.o0.w(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j15, int i15, int i16, boolean z15) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z15 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j15);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i15);
        byteBuffer.putInt(0);
        byteBuffer.put(ek.j.a(i16));
    }

    public void a(z7.f fVar, List<byte[]> list) {
        zj.p.q(fVar.f233228d);
        if (fVar.f233228d.limit() - fVar.f233228d.position() == 0) {
            return;
        }
        this.f24159a = b(fVar.f233228d, (this.f24160b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        fVar.l();
        fVar.x(this.f24159a.remaining());
        fVar.f233228d.put(this.f24159a);
        fVar.y();
    }

    public void d() {
        this.f24159a = u7.l.f195962a;
        this.f24161c = 0;
        this.f24160b = 2;
    }
}
