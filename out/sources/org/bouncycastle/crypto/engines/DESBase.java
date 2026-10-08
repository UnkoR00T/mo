package org.bouncycastle.crypto.engines;

import android.R;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class DESBase {
    protected static final int BLOCK_SIZE = 8;
    private static final short[] bytebit = {128, 64, 32, 16, 8, 4, 2, 1};
    private static final int[] bigbyte = {8388608, 4194304, PKIFailureInfo.badSenderNonce, PKIFailureInfo.badCertTemplate, PKIFailureInfo.signerNotTrusted, PKIFailureInfo.transactionIdInUse, PKIFailureInfo.unsupportedVersion, PKIFailureInfo.notAuthorized, 32768, 16384, PKIFailureInfo.certRevoked, PKIFailureInfo.certConfirmed, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: pc1, reason: collision with root package name */
    private static final byte[] f149029pc1 = {56, 48, 40, 32, 24, 16, 8, 0, 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 60, 52, 44, 36, 28, 20, 12, 4, 27, 19, 11, 3};
    private static final byte[] totrot = {1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, 21, 23, 25, 27, 28};

    /* JADX INFO: renamed from: pc2, reason: collision with root package name */
    private static final byte[] f149030pc2 = {13, 16, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 26, 19, 12, 1, 40, 51, 30, 36, 46, 54, 29, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, 28, 31};
    private static final int[] SP1 = {R.attr.transitionName, 0, PKIFailureInfo.notAuthorized, R.attr.fillColor, R.attr.manageSpaceActivity, 66564, 4, PKIFailureInfo.notAuthorized, 1024, R.attr.transitionName, R.attr.fillColor, 1024, 16778244, R.attr.manageSpaceActivity, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, R.attr.theme, R.attr.theme, 16778244, 65540, 16777220, 16777220, 65540, 0, 1028, 66564, 16777216, PKIFailureInfo.notAuthorized, R.attr.fillColor, 4, R.attr.theme, R.attr.transitionName, 16777216, 16777216, 1024, R.attr.manageSpaceActivity, PKIFailureInfo.notAuthorized, 66560, 16777220, 1024, 4, 16778244, 66564, R.attr.fillColor, 65540, R.attr.theme, 16778244, 16777220, 1028, 66564, R.attr.transitionName, 1028, 16778240, 16778240, 0, 65540, 66560, 0, R.attr.manageSpaceActivity};
    private static final int[] SP2 = {-2146402272, -2147450880, 32768, 1081376, PKIFailureInfo.badCertTemplate, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, PKIFailureInfo.systemUnavail, -2147450880, PKIFailureInfo.badCertTemplate, 32, -2146435040, 1081344, 1048608, -2147450848, 0, PKIFailureInfo.systemUnavail, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, PKIFailureInfo.badCertTemplate, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, PKIFailureInfo.systemUnavail, 32800, -2146402304, PKIFailureInfo.badCertTemplate, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, PKIFailureInfo.systemUnavail, -2146435040, -2146402272, 1081344};
    private static final int[] SP3 = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, PKIFailureInfo.unsupportedVersion, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, PKIFailureInfo.unsupportedVersion, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, PKIFailureInfo.unsupportedVersion, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, PKIFailureInfo.unsupportedVersion, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};
    private static final int[] SP4 = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, PKIFailureInfo.certRevoked, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, PKIFailureInfo.certRevoked, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, PKIFailureInfo.certRevoked, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, PKIFailureInfo.certRevoked, 8396928};
    private static final int[] SP5 = {256, 34078976, 34078720, 1107296512, PKIFailureInfo.signerNotTrusted, 256, 1073741824, 34078720, 1074266368, PKIFailureInfo.signerNotTrusted, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, PKIFailureInfo.signerNotTrusted, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, PKIFailureInfo.signerNotTrusted, 0, 1074266112, 34078976, 1073742080};
    private static final int[] SP6 = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, PKIFailureInfo.duplicateCertReq, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, PKIFailureInfo.duplicateCertReq, 4194320, 536887312};
    private static final int[] SP7 = {PKIFailureInfo.badSenderNonce, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, PKIFailureInfo.badSenderNonce, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, PKIFailureInfo.badSenderNonce, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, PKIFailureInfo.badSenderNonce, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
    private static final int[] SP8 = {268439616, PKIFailureInfo.certConfirmed, PKIFailureInfo.transactionIdInUse, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, PKIFailureInfo.certConfirmed, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, PKIFailureInfo.transactionIdInUse, 266304, PKIFailureInfo.transactionIdInUse, 268701696, PKIFailureInfo.certConfirmed, 64, 268697664, PKIFailureInfo.certConfirmed, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, PKIFailureInfo.transactionIdInUse, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    protected void desFunc(int[] iArr, byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i15);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i15 + 4);
        int i17 = ((iBigEndianToInt >>> 4) ^ iBigEndianToInt2) & 252645135;
        int i18 = iBigEndianToInt2 ^ i17;
        int i19 = iBigEndianToInt ^ (i17 << 4);
        int i25 = ((i19 >>> 16) ^ i18) & 65535;
        int i26 = i18 ^ i25;
        int i27 = i19 ^ (i25 << 16);
        int i28 = ((i26 >>> 2) ^ i27) & 858993459;
        int i29 = i27 ^ i28;
        int i35 = i26 ^ (i28 << 2);
        int i36 = ((i35 >>> 8) ^ i29) & 16711935;
        int i37 = i29 ^ i36;
        int i38 = i35 ^ (i36 << 8);
        int i39 = (i38 >>> 31) | (i38 << 1);
        int i45 = (i37 ^ i39) & (-1431655766);
        int i46 = i37 ^ i45;
        int i47 = i39 ^ i45;
        int i48 = (i46 >>> 31) | (i46 << 1);
        for (int i49 = 0; i49 < 8; i49++) {
            int i55 = i49 * 4;
            int i56 = ((i47 << 28) | (i47 >>> 4)) ^ iArr[i55];
            int[] iArr2 = SP7;
            int i57 = iArr2[i56 & 63];
            int[] iArr3 = SP5;
            int i58 = i57 | iArr3[(i56 >>> 8) & 63];
            int[] iArr4 = SP3;
            int i59 = i58 | iArr4[(i56 >>> 16) & 63];
            int[] iArr5 = SP1;
            int i65 = iArr5[(i56 >>> 24) & 63] | i59;
            int i66 = iArr[i55 + 1] ^ i47;
            int[] iArr6 = SP8;
            int i67 = i65 | iArr6[i66 & 63];
            int[] iArr7 = SP6;
            int i68 = i67 | iArr7[(i66 >>> 8) & 63];
            int[] iArr8 = SP4;
            int i69 = i68 | iArr8[(i66 >>> 16) & 63];
            int[] iArr9 = SP2;
            i48 ^= i69 | iArr9[(i66 >>> 24) & 63];
            int i75 = ((i48 << 28) | (i48 >>> 4)) ^ iArr[i55 + 2];
            int i76 = iArr5[(i75 >>> 24) & 63] | iArr2[i75 & 63] | iArr3[(i75 >>> 8) & 63] | iArr4[(i75 >>> 16) & 63];
            int i77 = iArr[i55 + 3] ^ i48;
            i47 ^= (((i76 | iArr6[i77 & 63]) | iArr7[(i77 >>> 8) & 63]) | iArr8[(i77 >>> 16) & 63]) | iArr9[(i77 >>> 24) & 63];
        }
        int i78 = (i47 >>> 1) | (i47 << 31);
        int i79 = (i48 ^ i78) & (-1431655766);
        int i85 = i48 ^ i79;
        int i86 = i78 ^ i79;
        int i87 = (i85 >>> 1) | (i85 << 31);
        int i88 = ((i87 >>> 8) ^ i86) & 16711935;
        int i89 = i86 ^ i88;
        int i95 = i87 ^ (i88 << 8);
        int i96 = ((i95 >>> 2) ^ i89) & 858993459;
        int i97 = i89 ^ i96;
        int i98 = i95 ^ (i96 << 2);
        int i99 = ((i97 >>> 16) ^ i98) & 65535;
        int i100 = i98 ^ i99;
        int i101 = i97 ^ (i99 << 16);
        int i102 = ((i101 >>> 4) ^ i100) & 252645135;
        Pack.intToBigEndian(i101 ^ (i102 << 4), bArr2, i16);
        Pack.intToBigEndian(i100 ^ i102, bArr2, i16 + 4);
    }

    protected int[] generateWorkingKey(boolean z15, byte[] bArr) {
        int i15;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i16 = 0;
        while (true) {
            boolean z16 = true;
            if (i16 >= 56) {
                break;
            }
            byte b15 = f149029pc1[i16];
            if ((bytebit[b15 & 7] & bArr[b15 >>> 3]) == 0) {
                z16 = false;
            }
            zArr[i16] = z16;
            i16++;
        }
        for (int i17 = 0; i17 < 16; i17++) {
            int i18 = z15 ? i17 << 1 : (15 - i17) << 1;
            int i19 = i18 + 1;
            iArr[i19] = 0;
            iArr[i18] = 0;
            int i25 = 0;
            while (true) {
                if (i25 >= 28) {
                    break;
                }
                int i26 = totrot[i17] + i25;
                if (i26 < 28) {
                    zArr2[i25] = zArr[i26];
                } else {
                    zArr2[i25] = zArr[i26 - 28];
                }
                i25++;
            }
            for (i15 = 28; i15 < 56; i15++) {
                int i27 = totrot[i17] + i15;
                if (i27 < 56) {
                    zArr2[i15] = zArr[i27];
                } else {
                    zArr2[i15] = zArr[i27 - 28];
                }
            }
            for (int i28 = 0; i28 < 24; i28++) {
                byte[] bArr2 = f149030pc2;
                if (zArr2[bArr2[i28]]) {
                    iArr[i18] = iArr[i18] | bigbyte[i28];
                }
                if (zArr2[bArr2[i28 + 24]]) {
                    iArr[i19] = iArr[i19] | bigbyte[i28];
                }
            }
        }
        for (int i29 = 0; i29 != 32; i29 += 2) {
            int i35 = iArr[i29];
            int i36 = i29 + 1;
            int i37 = iArr[i36];
            iArr[i29] = ((16515072 & i37) >>> 10) | ((i35 & 16515072) << 6) | ((i35 & 4032) << 10) | ((i37 & 4032) >>> 6);
            iArr[i36] = ((i35 & 63) << 16) | ((i35 & 258048) << 12) | ((258048 & i37) >>> 4) | (i37 & 63);
        }
        return iArr;
    }
}
