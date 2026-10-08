package u7;

import java.nio.ByteBuffer;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends n {
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    @Override // u7.l
    public void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i15 = iLimit - iPosition;
        int i16 = this.f195971b.f195966c;
        if (i16 == 3) {
            i15 *= 2;
        } else if (i16 == 4) {
            i15 /= 2;
        } else {
            if (i16 != 21) {
                if (i16 == 22) {
                    i15 /= 2;
                } else if (i16 != 268435456) {
                    if (i16 != 1342177280) {
                        if (i16 == 1610612736) {
                            i15 /= 2;
                        } else {
                            if (i16 != 1879048192) {
                                throw new IllegalStateException();
                            }
                            i15 /= 4;
                        }
                    }
                }
            }
            i15 /= 3;
            i15 *= 2;
        }
        ByteBuffer byteBufferO = o(i15);
        int i17 = this.f195971b.f195966c;
        if (i17 == 3) {
            while (iPosition < iLimit) {
                byteBufferO.put((byte) 0);
                byteBufferO.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i17 == 4) {
            while (iPosition < iLimit) {
                short sN = (short) (o0.n(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferO.put((byte) (sN & 255));
                byteBufferO.put((byte) ((sN >> 8) & GF2Field.MASK));
                iPosition += 4;
            }
        } else if (i17 == 21) {
            while (iPosition < iLimit) {
                byteBufferO.put(byteBuffer.get(iPosition + 1));
                byteBufferO.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i17 == 22) {
            while (iPosition < iLimit) {
                byteBufferO.put(byteBuffer.get(iPosition + 2));
                byteBufferO.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i17 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferO.put(byteBuffer.get(iPosition + 1));
                byteBufferO.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i17 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferO.put(byteBuffer.get(iPosition + 1));
                byteBufferO.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i17 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferO.put(byteBuffer.get(iPosition + 1));
                byteBufferO.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else {
            if (i17 != 1879048192) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                short sM = (short) (o0.m(byteBuffer.getDouble(iPosition), -1.0d, 1.0d) * 32767.0d);
                byteBufferO.put((byte) (sM & 255));
                byteBufferO.put((byte) ((sM >> 8) & GF2Field.MASK));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferO.flip();
    }

    @Override // u7.n
    public l.a j(l.a aVar) throws l.c {
        int i15 = aVar.f195966c;
        if (i15 == 3 || i15 == 2 || i15 == 268435456 || i15 == 21 || i15 == 1342177280 || i15 == 22 || i15 == 1610612736 || i15 == 4 || i15 == 1879048192) {
            return i15 != 2 ? new l.a(aVar.f195964a, aVar.f195965b, 2) : l.a.f195963e;
        }
        throw new l.c(aVar);
    }
}
