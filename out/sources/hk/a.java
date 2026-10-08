package hk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f85151a = e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = iArr[i15] + iArr[i16];
        iArr[i15] = i19;
        int iB = b(i19 ^ iArr[i18], 16);
        iArr[i18] = iB;
        int i25 = iArr[i17] + iB;
        iArr[i17] = i25;
        int iB2 = b(iArr[i16] ^ i25, 12);
        iArr[i16] = iB2;
        int i26 = iArr[i15] + iB2;
        iArr[i15] = i26;
        int iB3 = b(iArr[i18] ^ i26, 8);
        iArr[i18] = iB3;
        int i27 = iArr[i17] + iB3;
        iArr[i17] = i27;
        iArr[i16] = b(iArr[i16] ^ i27, 7);
    }

    private static int b(int i15, int i16) {
        return (i15 >>> (-i16)) | (i15 << i16);
    }

    static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f85151a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void d(int[] iArr) {
        for (int i15 = 0; i15 < 10; i15++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static int[] e(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
