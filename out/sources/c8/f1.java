package c8;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends u7.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f24198i = Float.floatToIntBits(Float.NaN);

    private static void p(int i15, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i15) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f24198i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // u7.l
    public void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferO;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i15 = iLimit - iPosition;
        int i16 = this.f195971b.f195966c;
        if (i16 == 2) {
            byteBufferO = o(i15 * 2);
            while (iPosition < iLimit) {
                p(((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24), byteBufferO);
                iPosition += 2;
            }
        } else if (i16 == 1342177280) {
            byteBufferO = o((i15 / 3) * 4);
            while (iPosition < iLimit) {
                p(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferO);
                iPosition += 3;
            }
        } else if (i16 == 1610612736) {
            byteBufferO = o(i15);
            while (iPosition < iLimit) {
                p((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferO);
                iPosition += 4;
            }
        } else if (i16 == 1879048192) {
            byteBufferO = o(i15 / 2);
            while (iPosition < iLimit) {
                byteBufferO.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i16 == 21) {
            byteBufferO = o((i15 / 3) * 4);
            while (iPosition < iLimit) {
                p(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferO);
                iPosition += 3;
            }
        } else {
            if (i16 != 22) {
                throw new IllegalStateException();
            }
            byteBufferO = o(i15);
            while (iPosition < iLimit) {
                p((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferO);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferO.flip();
    }

    @Override // u7.n
    public u7.l.a j(u7.l.a aVar) throws u7.l.c {
        int i15 = aVar.f195966c;
        if (w7.o0.x0(i15) || i15 == 2) {
            return i15 != 4 ? new u7.l.a(aVar.f195964a, aVar.f195965b, 4) : u7.l.a.f195963e;
        }
        throw new u7.l.c(aVar);
    }
}
