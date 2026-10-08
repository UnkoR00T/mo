package c8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 {
    public static ByteBuffer a(ByteBuffer byteBuffer, int i15, int i16, int i17, int i18) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i17 < i18) {
            c(byteBufferOrder, (int) ((((long) b(byteBuffer, i15)) * ((long) i17)) / ((long) i18)), i15);
            if (byteBuffer.position() == iPosition + i16) {
                i17++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }

    public static int b(ByteBuffer byteBuffer, int i15) {
        if (i15 == 2) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i15 == 3) {
            return (byteBuffer.get() & 255) << 24;
        }
        if (i15 == 4) {
            float fN = w7.o0.n(byteBuffer.getFloat(), -1.0f, 1.0f);
            return fN < 0.0f ? (int) ((-fN) * (-2.1474836E9f)) : (int) (fN * 2.1474836E9f);
        }
        if (i15 == 21) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i15 == 22) {
            return ((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i15 == 268435456) {
            return ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
        }
        if (i15 == 1342177280) {
            return ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i15 == 1610612736) {
            return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
        }
        if (i15 != 1879048192) {
            throw new IllegalStateException();
        }
        double dM = w7.o0.m(byteBuffer.getDouble(), -1.0d, 1.0d);
        return dM < 0.0d ? (int) ((-dM) * (-2.147483648E9d)) : (int) (dM * 2.147483647E9d);
    }

    public static void c(ByteBuffer byteBuffer, int i15, int i16) {
        if (i16 == 2) {
            byteBuffer.put((byte) (i15 >> 16));
            byteBuffer.put((byte) (i15 >> 24));
            return;
        }
        if (i16 == 3) {
            byteBuffer.put((byte) (i15 >> 24));
            return;
        }
        if (i16 == 4) {
            if (i15 < 0) {
                byteBuffer.putFloat((-i15) / (-2.1474836E9f));
                return;
            } else {
                byteBuffer.putFloat(i15 / 2.1474836E9f);
                return;
            }
        }
        if (i16 == 21) {
            byteBuffer.put((byte) (i15 >> 8));
            byteBuffer.put((byte) (i15 >> 16));
            byteBuffer.put((byte) (i15 >> 24));
            return;
        }
        if (i16 == 22) {
            byteBuffer.put((byte) i15);
            byteBuffer.put((byte) (i15 >> 8));
            byteBuffer.put((byte) (i15 >> 16));
            byteBuffer.put((byte) (i15 >> 24));
            return;
        }
        if (i16 == 268435456) {
            byteBuffer.put((byte) (i15 >> 24));
            byteBuffer.put((byte) (i15 >> 16));
            return;
        }
        if (i16 == 1342177280) {
            byteBuffer.put((byte) (i15 >> 24));
            byteBuffer.put((byte) (i15 >> 16));
            byteBuffer.put((byte) (i15 >> 8));
        } else {
            if (i16 == 1610612736) {
                byteBuffer.put((byte) (i15 >> 24));
                byteBuffer.put((byte) (i15 >> 16));
                byteBuffer.put((byte) (i15 >> 8));
                byteBuffer.put((byte) i15);
                return;
            }
            if (i16 != 1879048192) {
                throw new IllegalStateException();
            }
            if (i15 < 0) {
                byteBuffer.putDouble((-i15) / (-2.147483648E9d));
            } else {
                byteBuffer.putDouble(((double) i15) / 2.147483647E9d);
            }
        }
    }
}
