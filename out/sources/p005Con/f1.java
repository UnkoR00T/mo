package p005Con;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f256a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f257b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

    public final byte[] a(byte[] bArr) {
        int length = ((bArr.length + 2) / 3) * 4;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length;
        char[] cArr = f256a;
        int i15 = (length2 / 3) * 3;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i15) {
            int iMin = Math.min(i16 + i15, i15);
            int i18 = i16;
            int i19 = i17;
            while (i18 < iMin) {
                int i25 = i18 + 2;
                int i26 = ((bArr[i18 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16);
                i18 += 3;
                int i27 = i26 | (bArr[i25] & 255);
                char[] cArr2 = f256a;
                bArr2[i19] = (byte) cArr2[(i27 >>> 18) & 63];
                bArr2[i19 + 1] = (byte) cArr2[(i27 >>> 12) & 63];
                int i28 = i19 + 3;
                bArr2[i19 + 2] = (byte) cArr2[(i27 >>> 6) & 63];
                i19 += 4;
                bArr2[i28] = (byte) cArr2[i27 & 63];
            }
            int i29 = ((iMin - i16) / 3) * 4;
            i17 += i29;
            if (i29 == -1 && iMin < length2) {
                throw null;
            }
            i16 = iMin;
        }
        if (i16 < length2) {
            int i35 = i16 + 1;
            int i36 = bArr[i16] & 255;
            int i37 = i17 + 1;
            bArr2[i17] = (byte) cArr[i36 >> 2];
            if (i35 == length2) {
                bArr2[i37] = (byte) cArr[(i36 << 4) & 63];
                int i38 = i17 + 3;
                bArr2[i17 + 2] = 61;
                i17 += 4;
                bArr2[i38] = 61;
            } else {
                int i39 = bArr[i35] & 255;
                bArr2[i37] = (byte) cArr[((i36 << 4) & 63) | (i39 >> 4)];
                int i45 = i17 + 3;
                bArr2[i17 + 2] = (byte) cArr[(i39 << 2) & 63];
                i17 += 4;
                bArr2[i45] = 61;
            }
        }
        return i17 != length ? Arrays.copyOf(bArr2, i17) : bArr2;
    }
}
