package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;

/* JADX INFO: loaded from: classes5.dex */
public class CamelliaLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int MASK8 = 255;
    private int _keySize;
    private boolean forEncryption;
    private static final int[] SIGMA = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};
    private static final byte[] SBOX1 = {112, -126, 44, -20, -77, 39, -64, -27, -28, -123, 87, 53, -22, 12, -82, 65, 35, -17, 107, -109, 69, 25, -91, 33, -19, 14, 79, 78, 29, 101, -110, -67, -122, -72, -81, -113, 124, -21, 31, -50, 62, 48, -36, 95, 94, -59, 11, 26, -90, -31, 57, -54, -43, 71, 93, 61, -39, 1, 90, -42, 81, 86, 108, 77, -117, 13, -102, 102, -5, -52, -80, 45, 116, 18, 43, 32, -16, -79, -124, -103, -33, 76, -53, -62, 52, 126, 118, 5, 109, -73, -87, 49, -47, 23, 4, -41, 20, 88, 58, 97, -34, 27, 17, 28, 50, 15, -100, 22, 83, 24, -14, 34, -2, 68, -49, -78, -61, -75, 122, -111, 36, 8, -24, -88, 96, -4, 105, 80, -86, -48, -96, 125, -95, -119, 98, -105, 84, 91, 30, -107, -32, -1, 100, -46, 16, -60, 0, 72, -93, -9, 117, -37, -118, 3, -26, -38, 9, 63, -35, -108, -121, 92, -125, 2, -51, 74, -112, 51, 115, 103, -10, -13, -99, 127, -65, -30, 82, -101, -40, 38, -56, 55, -58, 59, -127, -106, 111, 75, 19, -66, 99, 46, -23, 121, -89, -116, -97, 110, PSSSigner.TRAILER_IMPLICIT, -114, 41, -11, -7, -74, 47, -3, -76, 89, 120, -104, 6, 106, -25, 70, 113, -70, -44, 37, -85, 66, -120, -94, -115, -6, 114, 7, -71, 85, -8, -18, -84, 10, 54, 73, 42, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, -55, 67, -63, 21, -29, -83, -12, 119, -57, -128, -98};
    private boolean initialized = false;
    private int[] subkey = new int[96];

    /* JADX INFO: renamed from: kw, reason: collision with root package name */
    private int[] f149024kw = new int[8];

    /* JADX INFO: renamed from: ke, reason: collision with root package name */
    private int[] f149023ke = new int[12];

    public CamelliaLightEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    private int bitsOfSecurity() {
        return this._keySize * 8;
    }

    private int bytes2int(byte[] bArr, int i15) {
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            i16 = (i16 << 8) + (bArr[i17 + i15] & 255);
        }
        return i16;
    }

    private void camelliaF2(int[] iArr, int[] iArr2, int i15) {
        int i16 = iArr[0] ^ iArr2[i15];
        int iSbox4 = sbox4(i16 & 255) | (sbox3((i16 >>> 8) & 255) << 8) | (sbox2((i16 >>> 16) & 255) << 16);
        byte[] bArr = SBOX1;
        int i17 = ((bArr[(i16 >>> 24) & 255] & 255) << 24) | iSbox4;
        int i18 = iArr[1] ^ iArr2[i15 + 1];
        int iLeftRotate = leftRotate((sbox2((i18 >>> 24) & 255) << 24) | (bArr[i18 & 255] & 255) | (sbox4((i18 >>> 8) & 255) << 8) | (sbox3((i18 >>> 16) & 255) << 16), 8);
        int i19 = i17 ^ iLeftRotate;
        int iLeftRotate2 = leftRotate(iLeftRotate, 8) ^ i19;
        int iRightRotate = rightRotate(i19, 8) ^ iLeftRotate2;
        iArr[2] = (leftRotate(iLeftRotate2, 16) ^ iRightRotate) ^ iArr[2];
        iArr[3] = leftRotate(iRightRotate, 8) ^ iArr[3];
        int i25 = iArr[2] ^ iArr2[i15 + 2];
        int iSbox5 = ((bArr[(i25 >>> 24) & 255] & 255) << 24) | sbox4(i25 & 255) | (sbox3((i25 >>> 8) & 255) << 8) | (sbox2((i25 >>> 16) & 255) << 16);
        int i26 = iArr2[i15 + 3] ^ iArr[3];
        int iLeftRotate3 = leftRotate((sbox2((i26 >>> 24) & 255) << 24) | (bArr[i26 & 255] & 255) | (sbox4((i26 >>> 8) & 255) << 8) | (sbox3((i26 >>> 16) & 255) << 16), 8);
        int i27 = iSbox5 ^ iLeftRotate3;
        int iLeftRotate4 = leftRotate(iLeftRotate3, 8) ^ i27;
        int iRightRotate2 = rightRotate(i27, 8) ^ iLeftRotate4;
        iArr[0] = (leftRotate(iLeftRotate4, 16) ^ iRightRotate2) ^ iArr[0];
        iArr[1] = iArr[1] ^ leftRotate(iRightRotate2, 8);
    }

    private void camelliaFLs(int[] iArr, int[] iArr2, int i15) {
        int iLeftRotate = iArr[1] ^ leftRotate(iArr[0] & iArr2[i15], 1);
        iArr[1] = iLeftRotate;
        iArr[0] = (iLeftRotate | iArr2[i15 + 1]) ^ iArr[0];
        int i16 = iArr[2];
        int i17 = iArr2[i15 + 3];
        int i18 = iArr[3];
        int i19 = i16 ^ (i17 | i18);
        iArr[2] = i19;
        iArr[3] = leftRotate(iArr2[i15 + 2] & i19, 1) ^ i18;
    }

    private static void decroldq(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        int i18 = i17 + 2;
        int i19 = i16 + 1;
        int i25 = 32 - i15;
        iArr2[i18] = (iArr[i16] << i15) | (iArr[i19] >>> i25);
        int i26 = i17 + 3;
        int i27 = i16 + 2;
        iArr2[i26] = (iArr[i19] << i15) | (iArr[i27] >>> i25);
        int i28 = i16 + 3;
        iArr2[i17] = (iArr[i27] << i15) | (iArr[i28] >>> i25);
        int i29 = i17 + 1;
        iArr2[i29] = (iArr[i28] << i15) | (iArr[i16] >>> i25);
        iArr[i16] = iArr2[i18];
        iArr[i19] = iArr2[i26];
        iArr[i27] = iArr2[i17];
        iArr[i28] = iArr2[i29];
    }

    private static void decroldqo32(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        int i18 = i17 + 2;
        int i19 = i16 + 1;
        int i25 = i15 - 32;
        int i26 = i16 + 2;
        int i27 = 64 - i15;
        iArr2[i18] = (iArr[i19] << i25) | (iArr[i26] >>> i27);
        int i28 = i17 + 3;
        int i29 = i16 + 3;
        iArr2[i28] = (iArr[i26] << i25) | (iArr[i29] >>> i27);
        iArr2[i17] = (iArr[i29] << i25) | (iArr[i16] >>> i27);
        int i35 = i17 + 1;
        iArr2[i35] = (iArr[i19] >>> i27) | (iArr[i16] << i25);
        iArr[i16] = iArr2[i18];
        iArr[i19] = iArr2[i28];
        iArr[i26] = iArr2[i17];
        iArr[i29] = iArr2[i35];
    }

    private void int2bytes(int i15, byte[] bArr, int i16) {
        for (int i17 = 0; i17 < 4; i17++) {
            bArr[(3 - i17) + i16] = (byte) i15;
            i15 >>>= 8;
        }
    }

    private byte lRot8(byte b15, int i15) {
        return (byte) (((b15 & 255) >>> (8 - i15)) | (b15 << i15));
    }

    private static int leftRotate(int i15, int i16) {
        return (i15 << i16) + (i15 >>> (32 - i16));
    }

    private int processBlock128(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[] iArr = new int[4];
        for (int i17 = 0; i17 < 4; i17++) {
            iArr[i17] = bytes2int(bArr, (i17 * 4) + i15) ^ this.f149024kw[i17];
        }
        camelliaF2(iArr, this.subkey, 0);
        camelliaF2(iArr, this.subkey, 4);
        camelliaF2(iArr, this.subkey, 8);
        camelliaFLs(iArr, this.f149023ke, 0);
        camelliaF2(iArr, this.subkey, 12);
        camelliaF2(iArr, this.subkey, 16);
        camelliaF2(iArr, this.subkey, 20);
        camelliaFLs(iArr, this.f149023ke, 4);
        camelliaF2(iArr, this.subkey, 24);
        camelliaF2(iArr, this.subkey, 28);
        camelliaF2(iArr, this.subkey, 32);
        int i18 = iArr[2];
        int[] iArr2 = this.f149024kw;
        int i19 = iArr2[4] ^ i18;
        iArr[2] = i19;
        iArr[3] = iArr[3] ^ iArr2[5];
        iArr[0] = iArr[0] ^ iArr2[6];
        iArr[1] = iArr2[7] ^ iArr[1];
        int2bytes(i19, bArr2, i16);
        int2bytes(iArr[3], bArr2, i16 + 4);
        int2bytes(iArr[0], bArr2, i16 + 8);
        int2bytes(iArr[1], bArr2, i16 + 12);
        return 16;
    }

    private int processBlock192or256(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[] iArr = new int[4];
        for (int i17 = 0; i17 < 4; i17++) {
            iArr[i17] = bytes2int(bArr, (i17 * 4) + i15) ^ this.f149024kw[i17];
        }
        camelliaF2(iArr, this.subkey, 0);
        camelliaF2(iArr, this.subkey, 4);
        camelliaF2(iArr, this.subkey, 8);
        camelliaFLs(iArr, this.f149023ke, 0);
        camelliaF2(iArr, this.subkey, 12);
        camelliaF2(iArr, this.subkey, 16);
        camelliaF2(iArr, this.subkey, 20);
        camelliaFLs(iArr, this.f149023ke, 4);
        camelliaF2(iArr, this.subkey, 24);
        camelliaF2(iArr, this.subkey, 28);
        camelliaF2(iArr, this.subkey, 32);
        camelliaFLs(iArr, this.f149023ke, 8);
        camelliaF2(iArr, this.subkey, 36);
        camelliaF2(iArr, this.subkey, 40);
        camelliaF2(iArr, this.subkey, 44);
        int i18 = iArr[2];
        int[] iArr2 = this.f149024kw;
        int i19 = i18 ^ iArr2[4];
        iArr[2] = i19;
        iArr[3] = iArr[3] ^ iArr2[5];
        iArr[0] = iArr[0] ^ iArr2[6];
        iArr[1] = iArr2[7] ^ iArr[1];
        int2bytes(i19, bArr2, i16);
        int2bytes(iArr[3], bArr2, i16 + 4);
        int2bytes(iArr[0], bArr2, i16 + 8);
        int2bytes(iArr[1], bArr2, i16 + 12);
        return 16;
    }

    private static int rightRotate(int i15, int i16) {
        return (i15 >>> i16) + (i15 << (32 - i16));
    }

    private static void roldq(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        int i18 = i16 + 1;
        int i19 = 32 - i15;
        iArr2[i17] = (iArr[i16] << i15) | (iArr[i18] >>> i19);
        int i25 = i17 + 1;
        int i26 = i16 + 2;
        iArr2[i25] = (iArr[i18] << i15) | (iArr[i26] >>> i19);
        int i27 = i17 + 2;
        int i28 = i16 + 3;
        iArr2[i27] = (iArr[i26] << i15) | (iArr[i28] >>> i19);
        int i29 = i17 + 3;
        iArr2[i29] = (iArr[i28] << i15) | (iArr[i16] >>> i19);
        iArr[i16] = iArr2[i17];
        iArr[i18] = iArr2[i25];
        iArr[i26] = iArr2[i27];
        iArr[i28] = iArr2[i29];
    }

    private static void roldqo32(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        int i18 = i16 + 1;
        int i19 = i15 - 32;
        int i25 = i16 + 2;
        int i26 = 64 - i15;
        iArr2[i17] = (iArr[i18] << i19) | (iArr[i25] >>> i26);
        int i27 = i17 + 1;
        int i28 = i16 + 3;
        iArr2[i27] = (iArr[i25] << i19) | (iArr[i28] >>> i26);
        int i29 = i17 + 2;
        iArr2[i29] = (iArr[i28] << i19) | (iArr[i16] >>> i26);
        int i35 = i17 + 3;
        iArr2[i35] = (iArr[i18] >>> i26) | (iArr[i16] << i19);
        iArr[i16] = iArr2[i17];
        iArr[i18] = iArr2[i27];
        iArr[i25] = iArr2[i29];
        iArr[i28] = iArr2[i35];
    }

    private int sbox2(int i15) {
        return lRot8(SBOX1[i15], 1) & 255;
    }

    private int sbox3(int i15) {
        return lRot8(SBOX1[i15], 7) & 255;
    }

    private int sbox4(int i15) {
        return SBOX1[lRot8((byte) i15, 1) & 255] & 255;
    }

    private void setKey(boolean z15, byte[] bArr) {
        this.forEncryption = z15;
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        this._keySize = bArr.length;
        int length = bArr.length;
        if (length == 16) {
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[7] = 0;
            iArr[6] = 0;
            iArr[5] = 0;
            iArr[4] = 0;
        } else if (length == 24) {
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[4] = bytes2int(bArr, 16);
            int iBytes2int = bytes2int(bArr, 20);
            iArr[5] = iBytes2int;
            iArr[6] = ~iArr[4];
            iArr[7] = ~iBytes2int;
        } else {
            if (length != 32) {
                throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
            }
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[4] = bytes2int(bArr, 16);
            iArr[5] = bytes2int(bArr, 20);
            iArr[6] = bytes2int(bArr, 24);
            iArr[7] = bytes2int(bArr, 28);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            iArr2[i15] = iArr[i15] ^ iArr[i15 + 4];
        }
        camelliaF2(iArr2, SIGMA, 0);
        for (int i16 = 0; i16 < 4; i16++) {
            iArr2[i16] = iArr2[i16] ^ iArr[i16];
        }
        camelliaF2(iArr2, SIGMA, 4);
        if (this._keySize == 16) {
            if (z15) {
                int[] iArr5 = this.f149024kw;
                iArr5[0] = iArr[0];
                iArr5[1] = iArr[1];
                iArr5[2] = iArr[2];
                iArr5[3] = iArr[3];
                roldq(15, iArr, 0, this.subkey, 4);
                roldq(30, iArr, 0, this.subkey, 12);
                roldq(15, iArr, 0, iArr4, 0);
                int[] iArr6 = this.subkey;
                iArr6[18] = iArr4[2];
                iArr6[19] = iArr4[3];
                roldq(17, iArr, 0, this.f149023ke, 4);
                roldq(17, iArr, 0, this.subkey, 24);
                roldq(17, iArr, 0, this.subkey, 32);
                int[] iArr7 = this.subkey;
                iArr7[0] = iArr2[0];
                iArr7[1] = iArr2[1];
                iArr7[2] = iArr2[2];
                iArr7[3] = iArr2[3];
                roldq(15, iArr2, 0, iArr7, 8);
                roldq(15, iArr2, 0, this.f149023ke, 0);
                roldq(15, iArr2, 0, iArr4, 0);
                int[] iArr8 = this.subkey;
                iArr8[16] = iArr4[0];
                iArr8[17] = iArr4[1];
                roldq(15, iArr2, 0, iArr8, 20);
                roldqo32(34, iArr2, 0, this.subkey, 28);
                roldq(17, iArr2, 0, this.f149024kw, 4);
                return;
            }
            int[] iArr9 = this.f149024kw;
            iArr9[4] = iArr[0];
            iArr9[5] = iArr[1];
            iArr9[6] = iArr[2];
            iArr9[7] = iArr[3];
            decroldq(15, iArr, 0, this.subkey, 28);
            decroldq(30, iArr, 0, this.subkey, 20);
            decroldq(15, iArr, 0, iArr4, 0);
            int[] iArr10 = this.subkey;
            iArr10[16] = iArr4[0];
            iArr10[17] = iArr4[1];
            decroldq(17, iArr, 0, this.f149023ke, 0);
            decroldq(17, iArr, 0, this.subkey, 8);
            decroldq(17, iArr, 0, this.subkey, 0);
            int[] iArr11 = this.subkey;
            iArr11[34] = iArr2[0];
            iArr11[35] = iArr2[1];
            iArr11[32] = iArr2[2];
            iArr11[33] = iArr2[3];
            decroldq(15, iArr2, 0, iArr11, 24);
            decroldq(15, iArr2, 0, this.f149023ke, 4);
            decroldq(15, iArr2, 0, iArr4, 0);
            int[] iArr12 = this.subkey;
            iArr12[18] = iArr4[2];
            iArr12[19] = iArr4[3];
            decroldq(15, iArr2, 0, iArr12, 12);
            decroldqo32(34, iArr2, 0, this.subkey, 4);
            roldq(17, iArr2, 0, this.f149024kw, 0);
            return;
        }
        for (int i17 = 0; i17 < 4; i17++) {
            iArr3[i17] = iArr2[i17] ^ iArr[i17 + 4];
        }
        camelliaF2(iArr3, SIGMA, 8);
        if (z15) {
            int[] iArr13 = this.f149024kw;
            iArr13[0] = iArr[0];
            iArr13[1] = iArr[1];
            iArr13[2] = iArr[2];
            iArr13[3] = iArr[3];
            roldqo32(45, iArr, 0, this.subkey, 16);
            roldq(15, iArr, 0, this.f149023ke, 4);
            roldq(17, iArr, 0, this.subkey, 32);
            roldqo32(34, iArr, 0, this.subkey, 44);
            roldq(15, iArr, 4, this.subkey, 4);
            roldq(15, iArr, 4, this.f149023ke, 0);
            roldq(30, iArr, 4, this.subkey, 24);
            roldqo32(34, iArr, 4, this.subkey, 36);
            roldq(15, iArr2, 0, this.subkey, 8);
            roldq(30, iArr2, 0, this.subkey, 20);
            int[] iArr14 = this.f149023ke;
            iArr14[8] = iArr2[1];
            iArr14[9] = iArr2[2];
            iArr14[10] = iArr2[3];
            iArr14[11] = iArr2[0];
            roldqo32(49, iArr2, 0, this.subkey, 40);
            int[] iArr15 = this.subkey;
            iArr15[0] = iArr3[0];
            iArr15[1] = iArr3[1];
            iArr15[2] = iArr3[2];
            iArr15[3] = iArr3[3];
            roldq(30, iArr3, 0, iArr15, 12);
            roldq(30, iArr3, 0, this.subkey, 28);
            roldqo32(51, iArr3, 0, this.f149024kw, 4);
            return;
        }
        int[] iArr16 = this.f149024kw;
        iArr16[4] = iArr[0];
        iArr16[5] = iArr[1];
        iArr16[6] = iArr[2];
        iArr16[7] = iArr[3];
        decroldqo32(45, iArr, 0, this.subkey, 28);
        decroldq(15, iArr, 0, this.f149023ke, 4);
        decroldq(17, iArr, 0, this.subkey, 12);
        decroldqo32(34, iArr, 0, this.subkey, 0);
        decroldq(15, iArr, 4, this.subkey, 40);
        decroldq(15, iArr, 4, this.f149023ke, 8);
        decroldq(30, iArr, 4, this.subkey, 20);
        decroldqo32(34, iArr, 4, this.subkey, 8);
        decroldq(15, iArr2, 0, this.subkey, 36);
        decroldq(30, iArr2, 0, this.subkey, 24);
        int[] iArr17 = this.f149023ke;
        iArr17[2] = iArr2[1];
        iArr17[3] = iArr2[2];
        iArr17[0] = iArr2[3];
        iArr17[1] = iArr2[0];
        decroldqo32(49, iArr2, 0, this.subkey, 4);
        int[] iArr18 = this.subkey;
        iArr18[46] = iArr3[0];
        iArr18[47] = iArr3[1];
        iArr18[44] = iArr3[2];
        iArr18[45] = iArr3[3];
        decroldq(30, iArr3, 0, iArr18, 32);
        decroldq(30, iArr3, 0, this.subkey, 16);
        roldqo32(51, iArr3, 0, this.f149024kw, 0);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Camellia";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        setKey(z15, ((KeyParameter) cipherParameters).getKey());
        this.initialized = true;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z15)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (!this.initialized) {
            throw new IllegalStateException("Camellia is not initialized");
        }
        if (i15 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + 16 <= bArr2.length) {
            return this._keySize == 16 ? processBlock128(bArr, i15, bArr2, i16) : processBlock192or256(bArr, i15, bArr2, i16);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
