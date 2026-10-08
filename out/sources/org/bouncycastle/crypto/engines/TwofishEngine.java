package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public final class TwofishEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int GF256_FDBK = 361;
    private static final int GF256_FDBK_2 = 180;
    private static final int GF256_FDBK_4 = 90;
    private static final int INPUT_WHITEN = 0;
    private static final int MAX_KEY_BITS = 256;
    private static final int MAX_ROUNDS = 16;
    private static final int OUTPUT_WHITEN = 4;
    private static final byte[][] P = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, -128, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, 127, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, -79, 14, -128, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, 127, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    private static final int P_00 = 1;
    private static final int P_01 = 0;
    private static final int P_02 = 0;
    private static final int P_03 = 1;
    private static final int P_04 = 1;
    private static final int P_10 = 0;
    private static final int P_11 = 0;
    private static final int P_12 = 1;
    private static final int P_13 = 1;
    private static final int P_14 = 0;
    private static final int P_20 = 1;
    private static final int P_21 = 1;
    private static final int P_22 = 0;
    private static final int P_23 = 0;
    private static final int P_24 = 0;
    private static final int P_30 = 0;
    private static final int P_31 = 1;
    private static final int P_32 = 1;
    private static final int P_33 = 0;
    private static final int P_34 = 1;
    private static final int ROUNDS = 16;
    private static final int ROUND_SUBKEYS = 8;
    private static final int RS_GF_FDBK = 333;
    private static final int SK_BUMP = 16843009;
    private static final int SK_ROTL = 9;
    private static final int SK_STEP = 33686018;
    private static final int TOTAL_SUBKEYS = 40;
    private int[] gSBox;
    private int[] gSubKeys;
    private boolean encrypting = false;
    private int[] gMDS0 = new int[256];
    private int[] gMDS1 = new int[256];
    private int[] gMDS2 = new int[256];
    private int[] gMDS3 = new int[256];
    private int k64Cnt = 0;
    private byte[] workingKey = null;

    public TwofishEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256));
        for (int i15 = 0; i15 < 256; i15++) {
            byte[][] bArr = P;
            int i16 = bArr[0][i15] & 255;
            int iMx_X = Mx_X(i16) & GF2Field.MASK;
            int iMx_Y = Mx_Y(i16) & GF2Field.MASK;
            int i17 = bArr[1][i15] & GF2Field.MASK;
            int[] iArr = {i16, i17};
            int[] iArr2 = {iMx_X, Mx_X(i17) & GF2Field.MASK};
            int[] iArr3 = {iMx_Y, Mx_Y(i17) & GF2Field.MASK};
            int[] iArr4 = this.gMDS0;
            int i18 = iArr[1] | (iArr2[1] << 8);
            int i19 = iArr3[1];
            iArr4[i15] = i18 | (i19 << 16) | (i19 << 24);
            int[] iArr5 = this.gMDS1;
            int i25 = iArr3[0];
            iArr5[i15] = i25 | (i25 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = this.gMDS2;
            int i26 = iArr2[1];
            int i27 = iArr3[1];
            iArr6[i15] = (iArr[1] << 16) | i26 | (i27 << 8) | (i27 << 24);
            int[] iArr7 = this.gMDS3;
            int i28 = iArr2[0];
            iArr7[i15] = (iArr3[0] << 16) | (iArr[0] << 8) | i28 | (i28 << 24);
        }
    }

    private int F32(int i15, int[] iArr) {
        int i16;
        int i17;
        int iB0 = b0(i15);
        int iB1 = b1(i15);
        int iB2 = b2(i15);
        int iB3 = b3(i15);
        int i18 = iArr[0];
        int i19 = iArr[1];
        int i25 = iArr[2];
        int i26 = iArr[3];
        int i27 = this.k64Cnt & 3;
        if (i27 != 0) {
            if (i27 != 1) {
                if (i27 != 2) {
                    if (i27 != 3) {
                        return 0;
                    }
                }
                int[] iArr2 = this.gMDS0;
                byte[][] bArr = P;
                byte[] bArr2 = bArr[0];
                i16 = (iArr2[(bArr2[(bArr2[iB0] & 255) ^ b0(i19)] & 255) ^ b0(i18)] ^ this.gMDS1[(bArr[0][(bArr[1][iB1] & 255) ^ b1(i19)] & 255) ^ b1(i18)]) ^ this.gMDS2[(bArr[1][(bArr[0][iB2] & 255) ^ b2(i19)] & 255) ^ b2(i18)];
                int[] iArr3 = this.gMDS3;
                byte[] bArr3 = bArr[1];
                i17 = iArr3[(bArr3[(bArr3[iB3] & 255) ^ b3(i19)] & 255) ^ b3(i18)];
            } else {
                int[] iArr4 = this.gMDS0;
                byte[][] bArr4 = P;
                i16 = (iArr4[(bArr4[0][iB0] & 255) ^ b0(i18)] ^ this.gMDS1[(bArr4[0][iB1] & 255) ^ b1(i18)]) ^ this.gMDS2[(bArr4[1][iB2] & 255) ^ b2(i18)];
                i17 = this.gMDS3[(bArr4[1][iB3] & 255) ^ b3(i18)];
            }
            return i17 ^ i16;
        }
        byte[][] bArr5 = P;
        iB0 = (bArr5[1][iB0] & 255) ^ b0(i26);
        iB1 = (bArr5[0][iB1] & 255) ^ b1(i26);
        iB2 = (bArr5[0][iB2] & 255) ^ b2(i26);
        iB3 = (bArr5[1][iB3] & 255) ^ b3(i26);
        byte[][] bArr6 = P;
        iB0 = (bArr6[1][iB0] & 255) ^ b0(i25);
        iB1 = (bArr6[1][iB1] & 255) ^ b1(i25);
        iB2 = (bArr6[0][iB2] & 255) ^ b2(i25);
        iB3 = (bArr6[0][iB3] & 255) ^ b3(i25);
        int[] iArr5 = this.gMDS0;
        byte[][] bArr7 = P;
        byte[] bArr8 = bArr7[0];
        i16 = (iArr5[(bArr8[(bArr8[iB0] & 255) ^ b0(i19)] & 255) ^ b0(i18)] ^ this.gMDS1[(bArr7[0][(bArr7[1][iB1] & 255) ^ b1(i19)] & 255) ^ b1(i18)]) ^ this.gMDS2[(bArr7[1][(bArr7[0][iB2] & 255) ^ b2(i19)] & 255) ^ b2(i18)];
        int[] iArr6 = this.gMDS3;
        byte[] bArr9 = bArr7[1];
        i17 = iArr6[(bArr9[(bArr9[iB3] & 255) ^ b3(i19)] & 255) ^ b3(i18)];
        return i17 ^ i16;
    }

    private int Fe32_0(int i15) {
        int[] iArr = this.gSBox;
        return iArr[(((i15 >>> 24) & GF2Field.MASK) * 2) + 513] ^ ((iArr[(i15 & GF2Field.MASK) * 2] ^ iArr[(((i15 >>> 8) & GF2Field.MASK) * 2) + 1]) ^ iArr[(((i15 >>> 16) & GF2Field.MASK) * 2) + 512]);
    }

    private int Fe32_3(int i15) {
        int[] iArr = this.gSBox;
        return iArr[(((i15 >>> 16) & GF2Field.MASK) * 2) + 513] ^ ((iArr[((i15 >>> 24) & GF2Field.MASK) * 2] ^ iArr[((i15 & GF2Field.MASK) * 2) + 1]) ^ iArr[(((i15 >>> 8) & GF2Field.MASK) * 2) + 512]);
    }

    private int LFSR1(int i15) {
        return ((i15 & 1) != 0 ? GF256_FDBK_2 : 0) ^ (i15 >> 1);
    }

    private int LFSR2(int i15) {
        return ((i15 >> 2) ^ ((i15 & 2) != 0 ? GF256_FDBK_2 : 0)) ^ ((i15 & 1) != 0 ? GF256_FDBK_4 : 0);
    }

    private int Mx_X(int i15) {
        return i15 ^ LFSR2(i15);
    }

    private int Mx_Y(int i15) {
        return LFSR2(i15) ^ (LFSR1(i15) ^ i15);
    }

    private int RS_MDS_Encode(int i15, int i16) {
        for (int i17 = 0; i17 < 4; i17++) {
            i16 = RS_rem(i16);
        }
        int iRS_rem = i15 ^ i16;
        for (int i18 = 0; i18 < 4; i18++) {
            iRS_rem = RS_rem(iRS_rem);
        }
        return iRS_rem;
    }

    private int RS_rem(int i15) {
        int i16 = i15 >>> 24;
        int i17 = i16 & GF2Field.MASK;
        int i18 = ((i17 << 1) ^ ((i16 & 128) != 0 ? RS_GF_FDBK : 0)) & GF2Field.MASK;
        int i19 = ((i17 >>> 1) ^ ((i16 & 1) != 0 ? 166 : 0)) ^ i18;
        return ((((i15 << 8) ^ (i19 << 24)) ^ (i18 << 16)) ^ (i19 << 8)) ^ i17;
    }

    private int b0(int i15) {
        return i15 & GF2Field.MASK;
    }

    private int b1(int i15) {
        return (i15 >>> 8) & GF2Field.MASK;
    }

    private int b2(int i15) {
        return (i15 >>> 16) & GF2Field.MASK;
    }

    private int b3(int i15) {
        return (i15 >>> 24) & GF2Field.MASK;
    }

    private void decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i15) ^ this.gSubKeys[4];
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i15 + 4) ^ this.gSubKeys[5];
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i15 + 8) ^ this.gSubKeys[6];
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i15 + 12) ^ this.gSubKeys[7];
        int i17 = 39;
        for (int i18 = 0; i18 < 16; i18 += 2) {
            int iFe32_0 = Fe32_0(iLittleEndianToInt);
            int iFe32_3 = Fe32_3(iLittleEndianToInt2);
            int i19 = iLittleEndianToInt4 ^ (((iFe32_3 * 2) + iFe32_0) + this.gSubKeys[i17]);
            iLittleEndianToInt3 = Integers.rotateLeft(iLittleEndianToInt3, 1) ^ ((iFe32_0 + iFe32_3) + this.gSubKeys[i17 - 1]);
            iLittleEndianToInt4 = Integers.rotateRight(i19, 1);
            int iFe32_1 = Fe32_0(iLittleEndianToInt3);
            int iFe32_4 = Fe32_3(iLittleEndianToInt4);
            int i25 = i17 - 3;
            int i26 = iLittleEndianToInt2 ^ (((iFe32_4 * 2) + iFe32_1) + this.gSubKeys[i17 - 2]);
            i17 -= 4;
            iLittleEndianToInt = Integers.rotateLeft(iLittleEndianToInt, 1) ^ ((iFe32_1 + iFe32_4) + this.gSubKeys[i25]);
            iLittleEndianToInt2 = Integers.rotateRight(i26, 1);
        }
        Pack.intToLittleEndian(iLittleEndianToInt3 ^ this.gSubKeys[0], bArr2, i16);
        Pack.intToLittleEndian(iLittleEndianToInt4 ^ this.gSubKeys[1], bArr2, i16 + 4);
        Pack.intToLittleEndian(this.gSubKeys[2] ^ iLittleEndianToInt, bArr2, i16 + 8);
        Pack.intToLittleEndian(this.gSubKeys[3] ^ iLittleEndianToInt2, bArr2, i16 + 12);
    }

    private void encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = 0;
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i15) ^ this.gSubKeys[0];
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i15 + 4) ^ this.gSubKeys[1];
        int i18 = 2;
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i15 + 8) ^ this.gSubKeys[2];
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i15 + 12) ^ this.gSubKeys[3];
        int i19 = 8;
        while (i17 < 16) {
            int iFe32_0 = Fe32_0(iLittleEndianToInt);
            int iFe32_3 = Fe32_3(iLittleEndianToInt2);
            iLittleEndianToInt3 = Integers.rotateRight(iLittleEndianToInt3 ^ ((iFe32_0 + iFe32_3) + this.gSubKeys[i19]), 1);
            iLittleEndianToInt4 = Integers.rotateLeft(iLittleEndianToInt4, 1) ^ ((iFe32_0 + (iFe32_3 * i18)) + this.gSubKeys[i19 + 1]);
            int iFe32_1 = Fe32_0(iLittleEndianToInt3);
            int iFe32_4 = Fe32_3(iLittleEndianToInt4);
            int i25 = i18;
            int i26 = i19 + 3;
            iLittleEndianToInt = Integers.rotateRight(iLittleEndianToInt ^ ((iFe32_1 + iFe32_4) + this.gSubKeys[i19 + 2]), 1);
            i19 += 4;
            iLittleEndianToInt2 = Integers.rotateLeft(iLittleEndianToInt2, 1) ^ ((iFe32_1 + (iFe32_4 * 2)) + this.gSubKeys[i26]);
            i17 += 2;
            i18 = i25;
        }
        Pack.intToLittleEndian(this.gSubKeys[4] ^ iLittleEndianToInt3, bArr2, i16);
        Pack.intToLittleEndian(iLittleEndianToInt4 ^ this.gSubKeys[5], bArr2, i16 + 4);
        Pack.intToLittleEndian(this.gSubKeys[6] ^ iLittleEndianToInt, bArr2, i16 + 8);
        Pack.intToLittleEndian(this.gSubKeys[7] ^ iLittleEndianToInt2, bArr2, i16 + 12);
    }

    private void setKey(byte[] bArr) {
        int iB0;
        int iB1;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.gSubKeys = new int[40];
        for (int i15 = 0; i15 < this.k64Cnt; i15++) {
            int i16 = i15 * 8;
            iArr[i15] = Pack.littleEndianToInt(bArr, i16);
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i16 + 4);
            iArr2[i15] = iLittleEndianToInt;
            iArr3[(this.k64Cnt - 1) - i15] = RS_MDS_Encode(iArr[i15], iLittleEndianToInt);
        }
        for (int i17 = 0; i17 < 20; i17++) {
            int i18 = SK_STEP * i17;
            int iF32 = F32(i18, iArr);
            int iRotateLeft = Integers.rotateLeft(F32(i18 + 16843009, iArr2), 8);
            int i19 = iF32 + iRotateLeft;
            int[] iArr4 = this.gSubKeys;
            int i25 = i17 * 2;
            iArr4[i25] = i19;
            int i26 = i19 + iRotateLeft;
            iArr4[i25 + 1] = (i26 << 9) | (i26 >>> 23);
        }
        int i27 = iArr3[0];
        int i28 = iArr3[1];
        int i29 = 2;
        int i35 = iArr3[2];
        int i36 = iArr3[3];
        this.gSBox = new int[1024];
        int i37 = 0;
        while (i37 < 256) {
            int i38 = this.k64Cnt & 3;
            if (i38 != 0) {
                if (i38 == 1) {
                    int[] iArr5 = this.gSBox;
                    int i39 = i37 * 2;
                    int[] iArr6 = this.gMDS0;
                    byte[][] bArr2 = P;
                    iArr5[i39] = iArr6[(bArr2[0][i37] & 255) ^ b0(i27)];
                    this.gSBox[i39 + 1] = this.gMDS1[(bArr2[0][i37] & 255) ^ b1(i27)];
                    this.gSBox[i39 + 512] = this.gMDS2[(bArr2[1][i37] & 255) ^ b2(i27)];
                    this.gSBox[i39 + 513] = this.gMDS3[(bArr2[1][i37] & 255) ^ b3(i27)];
                } else if (i38 == i29) {
                    iB7 = i37;
                    iB6 = iB7;
                    iB5 = iB6;
                    iB4 = iB5;
                    int[] iArr7 = this.gSBox;
                    int i45 = i37 * 2;
                    int[] iArr8 = this.gMDS0;
                    byte[][] bArr3 = P;
                    byte[] bArr4 = bArr3[0];
                    iArr7[i45] = iArr8[(bArr4[(bArr4[iB6] & 255) ^ b0(i28)] & 255) ^ b0(i27)];
                    this.gSBox[i45 + 1] = this.gMDS1[(bArr3[0][(bArr3[1][iB5] & 255) ^ b1(i28)] & 255) ^ b1(i27)];
                    this.gSBox[i45 + 512] = this.gMDS2[(bArr3[1][(bArr3[0][iB4] & 255) ^ b2(i28)] & 255) ^ b2(i27)];
                    int[] iArr9 = this.gMDS3;
                    byte[] bArr5 = bArr3[1];
                    this.gSBox[i45 + 513] = iArr9[(bArr5[(bArr5[iB7] & 255) ^ b3(i28)] & 255) ^ b3(i27)];
                } else if (i38 == 3) {
                    iB3 = i37;
                    iB0 = iB3;
                    iB1 = iB0;
                    iB2 = iB1;
                }
                i37++;
                i29 = 2;
            } else {
                byte[][] bArr6 = P;
                iB0 = (bArr6[1][i37] & 255) ^ b0(i36);
                iB1 = (bArr6[0][i37] & 255) ^ b1(i36);
                iB2 = (bArr6[0][i37] & 255) ^ b2(i36);
                iB3 = (bArr6[1][i37] & 255) ^ b3(i36);
            }
            byte[][] bArr7 = P;
            iB6 = (bArr7[1][iB0] & 255) ^ b0(i35);
            iB5 = (bArr7[1][iB1] & 255) ^ b1(i35);
            iB4 = (bArr7[0][iB2] & 255) ^ b2(i35);
            iB7 = (bArr7[0][iB3] & 255) ^ b3(i35);
            int[] iArr10 = this.gSBox;
            int i46 = i37 * 2;
            int[] iArr11 = this.gMDS0;
            byte[][] bArr8 = P;
            byte[] bArr9 = bArr8[0];
            iArr10[i46] = iArr11[(bArr9[(bArr9[iB6] & 255) ^ b0(i28)] & 255) ^ b0(i27)];
            this.gSBox[i46 + 1] = this.gMDS1[(bArr8[0][(bArr8[1][iB5] & 255) ^ b1(i28)] & 255) ^ b1(i27)];
            this.gSBox[i46 + 512] = this.gMDS2[(bArr8[1][(bArr8[0][iB4] & 255) ^ b2(i28)] & 255) ^ b2(i27)];
            int[] iArr12 = this.gMDS3;
            byte[] bArr10 = bArr8[1];
            this.gSBox[i46 + 513] = iArr12[(bArr10[(bArr10[iB7] & 255) ^ b3(i28)] & 255) ^ b3(i27)];
            i37++;
            i29 = 2;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + cipherParameters.getClass().getName());
        }
        this.encrypting = z15;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        int length = key.length * 8;
        if (length != 128 && length != 192 && length != 256) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), length, cipherParameters, Utils.getPurpose(z15)));
        byte[] bArr = this.workingKey;
        this.k64Cnt = bArr.length / 8;
        setKey(bArr);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i15 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i15, bArr2, i16);
            return 16;
        }
        decryptBlock(bArr, i15, bArr2, i16);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.workingKey;
        if (bArr != null) {
            setKey(bArr);
        }
    }
}
