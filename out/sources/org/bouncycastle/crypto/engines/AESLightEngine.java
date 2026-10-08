package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final int f149009m1 = -2139062144;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private static final int f149010m2 = 2139062143;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f149011m3 = 27;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f149012m4 = -1061109568;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    private static final int f149013m5 = 1061109567;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};

    public AESLightEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    private static int FFmulX(int i15) {
        return (((i15 & f149009m1) >>> 7) * 27) ^ ((f149010m2 & i15) << 1);
    }

    private static int FFmulX2(int i15) {
        int i16 = (f149013m5 & i15) << 2;
        int i17 = i15 & f149012m4;
        int i18 = i17 ^ (i17 >>> 1);
        return (i18 >>> 5) ^ (i16 ^ (i18 >>> 2));
    }

    private int bitsOfSecurity() {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            return 256;
        }
        return (iArr.length - 7) << 5;
    }

    private void decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i15);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i15 + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i15 + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i15 + 12);
        int i17 = this.ROUNDS;
        int[] iArr2 = iArr[i17];
        char c15 = 0;
        int i18 = iLittleEndianToInt ^ iArr2[0];
        int i19 = 1;
        int i25 = iLittleEndianToInt2 ^ iArr2[1];
        int i26 = iLittleEndianToInt3 ^ iArr2[2];
        int i27 = i17 - 1;
        int iInv_mcol = iLittleEndianToInt4 ^ iArr2[3];
        while (i27 > i19) {
            byte[] bArr3 = Si;
            int iInv_mcol2 = inv_mcol((((bArr3[i18 & GF2Field.MASK] & 255) ^ ((bArr3[(iInv_mcol >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i26 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(i25 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][c15];
            int iInv_mcol3 = inv_mcol((((bArr3[i25 & GF2Field.MASK] & 255) ^ ((bArr3[(i18 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iInv_mcol >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(i26 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][i19];
            char c16 = c15;
            int iInv_mcol4 = inv_mcol(((((bArr3[(i25 >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[i26 & GF2Field.MASK] & 255)) ^ ((bArr3[(i18 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(iInv_mcol >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][2];
            int iInv_mcol5 = inv_mcol((((bArr3[iInv_mcol & GF2Field.MASK] & 255) ^ ((bArr3[(i26 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i25 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(i18 >> 24) & GF2Field.MASK] << 24));
            int i28 = i27 - 1;
            int i29 = iInv_mcol5 ^ iArr[i27][3];
            int iInv_mcol6 = inv_mcol((((bArr3[iInv_mcol2 & GF2Field.MASK] & 255) ^ ((bArr3[(i29 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iInv_mcol4 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(iInv_mcol3 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i28][c16];
            int iInv_mcol7 = inv_mcol((((bArr3[iInv_mcol3 & GF2Field.MASK] & 255) ^ ((bArr3[(iInv_mcol2 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i29 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(iInv_mcol4 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i28][i19];
            int i35 = i19;
            int iInv_mcol8 = inv_mcol(((((bArr3[(iInv_mcol3 >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[iInv_mcol4 & GF2Field.MASK] & 255)) ^ ((bArr3[(iInv_mcol2 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(i29 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i28][2];
            i27 -= 2;
            iInv_mcol = inv_mcol((((bArr3[i29 & GF2Field.MASK] & 255) ^ ((bArr3[(iInv_mcol4 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iInv_mcol3 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(iInv_mcol2 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i28][3];
            c15 = c16;
            i18 = iInv_mcol6;
            i25 = iInv_mcol7;
            i26 = iInv_mcol8;
            i19 = i35;
        }
        char c17 = c15;
        int i36 = i19;
        byte[] bArr4 = Si;
        int iInv_mcol9 = inv_mcol((((bArr4[i18 & GF2Field.MASK] & 255) ^ ((bArr4[(iInv_mcol >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i26 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(i25 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][c17];
        int iInv_mcol10 = inv_mcol((((bArr4[i25 & GF2Field.MASK] & 255) ^ ((bArr4[(i18 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iInv_mcol >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(i26 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][i36];
        int iInv_mcol11 = inv_mcol((((bArr4[i26 & GF2Field.MASK] & 255) ^ ((bArr4[(i25 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i18 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iInv_mcol >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][2];
        int iInv_mcol12 = inv_mcol((((bArr4[iInv_mcol & GF2Field.MASK] & 255) ^ ((bArr4[(i26 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i25 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(i18 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][3];
        int i37 = (((bArr4[iInv_mcol9 & GF2Field.MASK] & 255) ^ ((bArr4[(iInv_mcol12 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iInv_mcol11 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iInv_mcol10 >> 24) & GF2Field.MASK] << 24);
        int[] iArr3 = iArr[c17];
        int i38 = i37 ^ iArr3[c17];
        int i39 = ((((bArr4[iInv_mcol10 & GF2Field.MASK] & 255) ^ ((bArr4[(iInv_mcol9 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iInv_mcol12 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iInv_mcol11 >> 24) & GF2Field.MASK] << 24)) ^ iArr3[i36];
        int i45 = ((((bArr4[iInv_mcol11 & GF2Field.MASK] & 255) ^ ((bArr4[(iInv_mcol10 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iInv_mcol9 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iInv_mcol12 >> 24) & GF2Field.MASK] << 24)) ^ iArr3[2];
        int i46 = ((((bArr4[iInv_mcol12 & GF2Field.MASK] & 255) ^ ((bArr4[(iInv_mcol11 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iInv_mcol10 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iInv_mcol9 >> 24) & GF2Field.MASK] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i38, bArr2, i16);
        Pack.intToLittleEndian(i39, bArr2, i16 + 4);
        Pack.intToLittleEndian(i45, bArr2, i16 + 8);
        Pack.intToLittleEndian(i46, bArr2, i16 + 12);
    }

    private void encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i15);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i15 + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i15 + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i15 + 12);
        char c15 = 0;
        int[] iArr2 = iArr[0];
        int i17 = iLittleEndianToInt ^ iArr2[0];
        int i18 = 1;
        int i19 = iLittleEndianToInt2 ^ iArr2[1];
        int i25 = iLittleEndianToInt3 ^ iArr2[2];
        int iMcol = iLittleEndianToInt4 ^ iArr2[3];
        int i26 = 1;
        while (i26 < this.ROUNDS - i18) {
            byte[] bArr3 = S;
            int iMcol2 = mcol((((bArr3[i17 & GF2Field.MASK] & 255) ^ ((bArr3[(i19 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i25 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(iMcol >> 24) & GF2Field.MASK] << 24)) ^ iArr[i26][c15];
            int iMcol3 = mcol((((bArr3[i19 & GF2Field.MASK] & 255) ^ ((bArr3[(i25 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iMcol >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(i17 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i26][i18];
            char c16 = c15;
            int iMcol4 = mcol(((((bArr3[(iMcol >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[i25 & GF2Field.MASK] & 255)) ^ ((bArr3[(i17 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(i19 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i26][2];
            int iMcol5 = mcol((((bArr3[iMcol & GF2Field.MASK] & 255) ^ ((bArr3[(i17 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i19 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(i25 >> 24) & GF2Field.MASK] << 24));
            int i27 = i26 + 1;
            int i28 = iMcol5 ^ iArr[i26][3];
            int iMcol6 = mcol((((bArr3[iMcol2 & GF2Field.MASK] & 255) ^ ((bArr3[(iMcol3 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iMcol4 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(i28 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][c16];
            int iMcol7 = mcol((((bArr3[iMcol3 & GF2Field.MASK] & 255) ^ ((bArr3[(iMcol4 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i28 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(iMcol2 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][i18];
            int i29 = i18;
            int iMcol8 = mcol(((((bArr3[(i28 >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[iMcol4 & GF2Field.MASK] & 255)) ^ ((bArr3[(iMcol2 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(iMcol3 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][2];
            i26 += 2;
            iMcol = mcol((((bArr3[i28 & GF2Field.MASK] & 255) ^ ((bArr3[(iMcol2 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iMcol3 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[(iMcol4 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i27][3];
            c15 = c16;
            i17 = iMcol6;
            i19 = iMcol7;
            i25 = iMcol8;
            i18 = i29;
        }
        char c17 = c15;
        int i35 = i18;
        byte[] bArr4 = S;
        int iMcol9 = mcol((((bArr4[i17 & GF2Field.MASK] & 255) ^ ((bArr4[(i19 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i25 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iMcol >> 24) & GF2Field.MASK] << 24)) ^ iArr[i26][c17];
        int iMcol10 = mcol((((bArr4[i19 & GF2Field.MASK] & 255) ^ ((bArr4[(i25 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iMcol >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(i17 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i26][i35];
        int iMcol11 = mcol((((bArr4[i25 & GF2Field.MASK] & 255) ^ ((bArr4[(iMcol >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i17 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(i19 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i26][2];
        int iMcol12 = mcol((((bArr4[iMcol & GF2Field.MASK] & 255) ^ ((bArr4[(i17 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i19 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(i25 >> 24) & GF2Field.MASK] << 24)) ^ iArr[i26][3];
        int i36 = (((bArr4[iMcol9 & GF2Field.MASK] & 255) ^ ((bArr4[(iMcol10 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iMcol11 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iMcol12 >> 24) & GF2Field.MASK] << 24);
        int[] iArr3 = iArr[i26 + 1];
        int i37 = i36 ^ iArr3[c17];
        int i38 = ((((bArr4[iMcol10 & GF2Field.MASK] & 255) ^ ((bArr4[(iMcol11 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iMcol12 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iMcol9 >> 24) & GF2Field.MASK] << 24)) ^ iArr3[i35];
        int i39 = iArr3[2] ^ ((((bArr4[iMcol11 & GF2Field.MASK] & 255) ^ ((bArr4[(iMcol12 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iMcol9 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iMcol10 >> 24) & GF2Field.MASK] << 24));
        int i45 = ((((bArr4[iMcol12 & GF2Field.MASK] & 255) ^ ((bArr4[(iMcol9 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iMcol10 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[(iMcol11 >> 24) & GF2Field.MASK] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i37, bArr2, i16);
        Pack.intToLittleEndian(i38, bArr2, i16 + 4);
        Pack.intToLittleEndian(i39, bArr2, i16 + 8);
        Pack.intToLittleEndian(i45, bArr2, i16 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z15) {
        int i15;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i16 = length >>> 2;
        this.ROUNDS = i16 + 6;
        int i17 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i16 + 7, 4);
        char c15 = 3;
        if (i16 == 4) {
            i15 = 1;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i18 = 1; i18 <= 10; i18++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i18 - 1];
                int[] iArr2 = iArr[i18];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i16 == 6) {
            i15 = 1;
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i19 = 1;
            int i25 = 1;
            while (true) {
                int[] iArr3 = iArr[i19];
                iArr3[0] = iLittleEndianToInt9;
                iArr3[1] = iLittleEndianToInt10;
                int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ i25);
                int[] iArr4 = iArr[i19];
                iArr4[2] = iSubWord;
                int i26 = iLittleEndianToInt6 ^ iSubWord;
                iArr4[3] = i26;
                int i27 = iLittleEndianToInt7 ^ i26;
                int[] iArr5 = iArr[i19 + 1];
                iArr5[0] = i27;
                int i28 = iLittleEndianToInt8 ^ i27;
                iArr5[1] = i28;
                int i29 = iLittleEndianToInt9 ^ i28;
                iArr5[2] = i29;
                int i35 = iLittleEndianToInt10 ^ i29;
                iArr5[3] = i35;
                int iSubWord2 = subWord(shift(i35, 8)) ^ (i25 << 1);
                i25 <<= 2;
                iLittleEndianToInt5 = iSubWord ^ iSubWord2;
                int[] iArr6 = iArr[i19 + 2];
                iArr6[0] = iLittleEndianToInt5;
                iLittleEndianToInt6 = i26 ^ iLittleEndianToInt5;
                iArr6[1] = iLittleEndianToInt6;
                iLittleEndianToInt7 = i27 ^ iLittleEndianToInt6;
                iArr6[2] = iLittleEndianToInt7;
                iLittleEndianToInt8 = i28 ^ iLittleEndianToInt7;
                iArr6[3] = iLittleEndianToInt8;
                i19 += 3;
                if (i19 >= 13) {
                    break;
                }
                iLittleEndianToInt9 = i29 ^ iLittleEndianToInt8;
                iLittleEndianToInt10 = i35 ^ iLittleEndianToInt9;
            }
        } else {
            if (i16 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i36 = 1;
            int i37 = 2;
            while (true) {
                int iSubWord3 = subWord(shift(iLittleEndianToInt18, 8)) ^ i36;
                i36 <<= i17;
                iLittleEndianToInt11 ^= iSubWord3;
                int[] iArr7 = iArr[i37];
                iArr7[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr7[i17] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr7[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr7[c15] = iLittleEndianToInt14;
                i15 = i17;
                int i38 = i37 + 1;
                char c16 = c15;
                if (i38 >= 15) {
                    break;
                }
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr8 = iArr[i38];
                iArr8[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr8[i15] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr8[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr8[c16] = iLittleEndianToInt18;
                i37 += 2;
                i17 = i15;
                c15 = c16;
            }
        }
        if (!z15) {
            for (int i39 = i15; i39 < this.ROUNDS; i39++) {
                for (int i45 = 0; i45 < 4; i45++) {
                    int[] iArr9 = iArr[i39];
                    iArr9[i45] = inv_mcol(iArr9[i45]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i15) {
        int iShift = shift(i15, 8) ^ i15;
        int iFFmulX = i15 ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    private static int mcol(int i15) {
        int iShift = shift(i15, 8);
        int i16 = i15 ^ iShift;
        return FFmulX(i16) ^ (iShift ^ shift(i16, 16));
    }

    private static int shift(int i15, int i16) {
        return (i15 << (-i16)) | (i15 >>> i16);
    }

    private static int subWord(int i15) {
        byte[] bArr = S;
        return (bArr[(i15 >> 24) & GF2Field.MASK] << 24) | (bArr[i15 & GF2Field.MASK] & 255) | ((bArr[(i15 >> 8) & GF2Field.MASK] & 255) << 8) | ((bArr[(i15 >> 16) & GF2Field.MASK] & 255) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z15);
            this.forEncryption = z15;
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z15)));
        } else {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i15 > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i15, bArr2, i16, iArr);
        } else {
            decryptBlock(bArr, i15, bArr2, i16, iArr);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
