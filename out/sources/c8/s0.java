package c8;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends u7.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f24369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f24370j;

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    @Override // u7.l
    public void c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) zj.p.q(this.f24370j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferO = o(((iLimit - iPosition) / this.f195971b.f195967d) * this.f195972c.f195967d);
        while (iPosition < iLimit) {
            for (int i15 : iArr) {
                int iP = (w7.o0.P(this.f195971b.f195966c) * i15) + iPosition;
                int i16 = this.f195971b.f195966c;
                if (i16 == 2) {
                    byteBufferO.putShort(byteBuffer.getShort(iP));
                } else if (i16 == 3) {
                    byteBufferO.put(byteBuffer.get(iP));
                } else if (i16 == 4) {
                    byteBufferO.putFloat(byteBuffer.getFloat(iP));
                } else if (i16 == 21) {
                    w7.o0.S0(byteBufferO, w7.o0.Y(byteBuffer, iP));
                } else if (i16 == 22) {
                    byteBufferO.putInt(byteBuffer.getInt(iP));
                } else if (i16 == 268435456) {
                    byteBufferO.putShort(byteBuffer.getShort(iP));
                } else if (i16 == 1342177280) {
                    w7.o0.S0(byteBufferO, w7.o0.Y(byteBuffer, iP));
                } else if (i16 == 1610612736) {
                    byteBufferO.putInt(byteBuffer.getInt(iP));
                } else {
                    if (i16 != 1879048192) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f195971b.f195966c);
                    }
                    byteBufferO.putDouble(byteBuffer.getDouble(iP));
                }
            }
            iPosition += this.f195971b.f195967d;
        }
        byteBuffer.position(iLimit);
        byteBufferO.flip();
    }

    @Override // u7.n
    public u7.l.a j(u7.l.a aVar) throws u7.l.c {
        int[] iArr = this.f24369i;
        if (iArr == null) {
            return u7.l.a.f195963e;
        }
        if (!w7.o0.y0(aVar.f195966c)) {
            throw new u7.l.c(aVar);
        }
        boolean z15 = aVar.f195965b != iArr.length;
        int i15 = 0;
        while (i15 < iArr.length) {
            int i16 = iArr[i15];
            if (i16 >= aVar.f195965b) {
                throw new u7.l.c("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z15 |= i16 != i15;
            i15++;
        }
        return z15 ? new u7.l.a(aVar.f195964a, iArr.length, aVar.f195966c) : u7.l.a.f195963e;
    }

    @Override // u7.n
    protected void l(u7.l.b bVar) {
        this.f24370j = this.f24369i;
    }

    @Override // u7.n
    protected void n() {
        this.f24370j = null;
        this.f24369i = null;
    }

    public void p(int[] iArr) {
        this.f24369i = iArr;
    }
}
