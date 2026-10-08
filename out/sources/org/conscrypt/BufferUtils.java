package org.conscrypt;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
final class BufferUtils {
    private BufferUtils() {
    }

    static void checkNotNull(ByteBuffer[] byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null buffer in array");
            }
        }
    }

    static void consume(ByteBuffer[] byteBufferArr, int i15) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            int iMin = Math.min(byteBuffer.remaining(), i15);
            if (iMin > 0) {
                byteBuffer.position(byteBuffer.position() + iMin);
                i15 -= iMin;
                if (i15 == 0) {
                    break;
                }
            }
        }
        if (i15 > 0) {
            throw new IllegalArgumentException("toConsume > data size");
        }
    }

    static ByteBuffer copyNoConsume(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer, int i15) {
        Preconditions.checkArgument(byteBuffer.remaining() >= i15, "Destination buffer too small");
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            int iRemaining = byteBuffer2.remaining();
            if (iRemaining > 0) {
                int iPosition = byteBuffer2.position();
                if (iRemaining <= i15) {
                    byteBuffer.put(byteBuffer2);
                    i15 -= iRemaining;
                } else {
                    int iLimit = byteBuffer2.limit();
                    byteBuffer2.limit(byteBuffer2.position() + i15);
                    byteBuffer.put(byteBuffer2);
                    byteBuffer2.limit(iLimit);
                    i15 = 0;
                }
                byteBuffer2.position(iPosition);
                if (i15 == 0) {
                    break;
                }
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    static ByteBuffer getBufferLargerThan(ByteBuffer[] byteBufferArr, int i15) {
        int length = byteBufferArr.length;
        int i16 = 0;
        while (i16 < length) {
            ByteBuffer byteBuffer = byteBufferArr[i16];
            int iRemaining = byteBuffer.remaining();
            if (iRemaining > 0) {
                if (iRemaining < i15) {
                    do {
                        i16++;
                        if (i16 < length) {
                        }
                    } while (byteBufferArr[i16].remaining() <= 0);
                    return null;
                }
                return byteBuffer;
            }
            i16++;
        }
        return null;
    }

    static long remaining(ByteBuffer[] byteBufferArr) {
        long jRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            jRemaining += (long) byteBuffer.remaining();
        }
        return jRemaining;
    }
}
