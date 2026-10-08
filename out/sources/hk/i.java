package hk;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jC = c(bArr, 0, 0) & 67108863;
        int i15 = 3;
        int i16 = 2;
        long jC2 = c(bArr, 3, 2) & 67108611;
        long jC3 = c(bArr, 6, 4) & 67092735;
        long jC4 = c(bArr, 9, 6) & 66076671;
        long jC5 = c(bArr, 12, 8) & 1048575;
        long j15 = jC2 * 5;
        long j16 = jC3 * 5;
        long j17 = jC4 * 5;
        long j18 = jC5 * 5;
        byte[] bArr3 = new byte[17];
        long j19 = 0;
        int i17 = 0;
        long j25 = 0;
        long j26 = 0;
        long j27 = 0;
        long j28 = 0;
        while (i17 < bArr2.length) {
            b(bArr3, bArr2, i17);
            long jC6 = j28 + c(bArr3, 0, 0);
            long jC7 = j19 + c(bArr3, i15, i16);
            long jC8 = j25 + c(bArr3, 6, 4);
            long jC9 = j26 + c(bArr3, 9, 6);
            long j29 = jC2;
            long jC10 = j27 + (c(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j35 = (jC6 * jC) + (jC7 * j18) + (jC8 * j17) + (jC9 * j16) + (jC10 * j15);
            long j36 = (jC6 * j29) + (jC7 * jC) + (jC8 * j18) + (jC9 * j17) + (jC10 * j16);
            long j37 = (jC6 * jC3) + (jC7 * j29) + (jC8 * jC) + (jC9 * j18) + (jC10 * j17);
            long j38 = (jC6 * jC4) + (jC7 * jC3) + (jC8 * j29) + (jC9 * jC) + (jC10 * j18);
            long j39 = (jC6 * jC5) + (jC7 * jC4) + (jC8 * jC3) + (jC9 * j29) + (jC10 * jC);
            long j45 = j36 + (j35 >> 26);
            long j46 = j37 + (j45 >> 26);
            j25 = j46 & 67108863;
            long j47 = j38 + (j46 >> 26);
            j26 = j47 & 67108863;
            long j48 = j39 + (j47 >> 26);
            j27 = j48 & 67108863;
            long j49 = (j35 & 67108863) + ((j48 >> 26) * 5);
            j28 = j49 & 67108863;
            j19 = (j45 & 67108863) + (j49 >> 26);
            i17 += 16;
            jC2 = j29;
            i15 = 3;
            i16 = 2;
        }
        long j55 = j25 + (j19 >> 26);
        long j56 = j55 & 67108863;
        long j57 = j26 + (j55 >> 26);
        long j58 = j57 & 67108863;
        long j59 = j27 + (j57 >> 26);
        long j65 = j59 & 67108863;
        long j66 = j28 + ((j59 >> 26) * 5);
        long j67 = j66 & 67108863;
        long j68 = (j19 & 67108863) + (j66 >> 26);
        long j69 = j67 + 5;
        long j75 = j69 & 67108863;
        long j76 = (j69 >> 26) + j68;
        long j77 = j56 + (j76 >> 26);
        long j78 = j58 + (j77 >> 26);
        long j79 = j78 & 67108863;
        long j85 = (j65 + (j78 >> 26)) - 67108864;
        long j86 = j85 >> 63;
        long j87 = j67 & j86;
        long j88 = j68 & j86;
        long j89 = j56 & j86;
        long j95 = j58 & j86;
        long j96 = j65 & j86;
        long j97 = ~j86;
        long j98 = (j76 & 67108863 & j97) | j88;
        long j99 = (j77 & 67108863 & j97) | j89;
        long j100 = (j79 & j97) | j95;
        long j101 = j96 | (j85 & j97);
        long j102 = (j87 | (j75 & j97) | (j98 << 26)) & BodyPartID.bodyIdMax;
        long j103 = ((j98 >> 6) | (j99 << 20)) & BodyPartID.bodyIdMax;
        long j104 = ((j99 >> 12) | (j100 << 14)) & BodyPartID.bodyIdMax;
        long j105 = ((j100 >> 18) | (j101 << 8)) & BodyPartID.bodyIdMax;
        long jD = j102 + d(bArr, 16);
        long j106 = jD & BodyPartID.bodyIdMax;
        long jD2 = j103 + d(bArr, 20) + (jD >> 32);
        long j107 = jD2 & BodyPartID.bodyIdMax;
        long jD3 = j104 + d(bArr, 24) + (jD2 >> 32);
        long j108 = jD3 & BodyPartID.bodyIdMax;
        long jD4 = (j105 + d(bArr, 28) + (jD3 >> 32)) & BodyPartID.bodyIdMax;
        byte[] bArr4 = new byte[16];
        e(bArr4, j106, 0);
        e(bArr4, j107, 4);
        e(bArr4, j108, 8);
        e(bArr4, jD4, 12);
        return bArr4;
    }

    private static void b(byte[] bArr, byte[] bArr2, int i15) {
        int iMin = Math.min(16, bArr2.length - i15);
        System.arraycopy(bArr2, i15, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    private static long c(byte[] bArr, int i15, int i16) {
        return (d(bArr, i15) >> i16) & 67108863;
    }

    private static long d(byte[] bArr, int i15) {
        return ((long) (((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16))) & BodyPartID.bodyIdMax;
    }

    private static void e(byte[] bArr, long j15, int i15) {
        int i16 = 0;
        while (i16 < 4) {
            bArr[i15 + i16] = (byte) (255 & j15);
            i16++;
            j15 >>= 8;
        }
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!tk.f.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
