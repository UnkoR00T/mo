package x7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i {
    public static List<byte[]> a(byte[] bArr) {
        long jK = k(f(bArr));
        long jK2 = k(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(jK));
        arrayList.add(b(jK2));
        return arrayList;
    }

    private static byte[] b(long j15) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j15).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long d(byte b15, byte b16) {
        int i15;
        int i16;
        int i17 = b15 & 255;
        int i18 = b15 & 3;
        if (i18 != 0) {
            i15 = 2;
            if (i18 != 1 && i18 != 2) {
                i15 = b16 & 63;
            }
        } else {
            i15 = 1;
        }
        int i19 = i17 >> 3;
        int i25 = i19 & 3;
        if (i19 >= 16) {
            i16 = 2500 << i25;
        } else if (i19 >= 12) {
            i16 = 10000 << (i19 & 1);
        } else {
            i16 = i25 == 3 ? 60000 : 10000 << i25;
        }
        return ((long) i15) * ((long) i16);
    }

    public static long e(byte[] bArr) {
        return d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean g(long j15, long j16) {
        return j15 - j16 <= k(3840L) / 1000;
    }

    public static int h(ByteBuffer byteBuffer) {
        int i15 = i(byteBuffer);
        int i16 = byteBuffer.get(i15 + 26) + 27 + i15;
        return (int) ((d(byteBuffer.get(i16), byteBuffer.limit() - i16 > 1 ? byteBuffer.get(i16 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int i(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b15 = byteBuffer.get(26);
        int i15 = 28;
        int i16 = 28;
        for (int i17 = 0; i17 < b15; i17++) {
            i16 += byteBuffer.get(i17 + 27);
        }
        byte b16 = byteBuffer.get(i16 + 26);
        for (int i18 = 0; i18 < b16; i18++) {
            i15 += byteBuffer.get(i16 + 27 + i18);
        }
        return i16 + i15;
    }

    public static int j(ByteBuffer byteBuffer) {
        return (int) ((d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    private static long k(long j15) {
        return (j15 * 1000000000) / 48000;
    }
}
