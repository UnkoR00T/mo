package org.bouncycastle.pqc.crypto.ntruprime;

import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    Utils() {
    }

    static int bToUnsignedInt(byte b15) {
        return b15 & 255;
    }

    protected static void checkForSmallPolynomial(byte[] bArr, byte[] bArr2, int i15, int i16) {
        int i17 = 0;
        for (int i18 = 0; i18 != bArr2.length; i18++) {
            i17 += bArr2[i18] & 1;
        }
        int iCheckNotEqualToZero = checkNotEqualToZero(i17 - i16);
        for (int i19 = 0; i19 < i16; i19++) {
            bArr[i19] = (byte) (((bArr2[i19] ^ 1) & (~iCheckNotEqualToZero)) ^ 1);
        }
        while (i16 < i15) {
            bArr[i16] = (byte) (bArr2[i16] & (~iCheckNotEqualToZero));
            i16++;
        }
    }

    private static int checkLessThanZero(int i15) {
        return -(i15 >>> 31);
    }

    private static int checkNotEqualToZero(int i15) {
        return -((int) ((-iToUnsignedLong(i15)) >>> 63));
    }

    protected static void cryptoSort(int[] iArr, int i15) {
        if (i15 < 2) {
            return;
        }
        int i16 = 1;
        while (i16 < i15 - i16) {
            i16 += i16;
        }
        for (int i17 = i16; i17 > 0; i17 >>>= 1) {
            for (int i18 = 0; i18 < i15 - i17; i18++) {
                if ((i18 & i17) == 0) {
                    minmax(iArr, i18, i18 + i17);
                }
            }
            for (int i19 = i16; i19 > i17; i19 >>>= 1) {
                for (int i25 = 0; i25 < i15 - i19; i25++) {
                    if ((i25 & i17) == 0) {
                        minmax(iArr, i25 + i17, i25 + i19);
                    }
                }
            }
        }
    }

    private static void decode(short[] sArr, byte[] bArr, short[] sArr2, int i15, int i16, int i17) {
        int i18;
        if (i15 == 1) {
            short s15 = sArr2[0];
            if (s15 == 1) {
                sArr[i16] = 0;
            } else if (s15 <= 256) {
                sArr[i16] = (short) getUnsignedMod(bToUnsignedInt(bArr[i17]), sArr2[0]);
            } else {
                sArr[i16] = (short) getUnsignedMod(bToUnsignedInt(bArr[i17]) + (bArr[i17 + 1] << 8), sArr2[0]);
            }
        }
        if (i15 > 1) {
            int i19 = (i15 + 1) / 2;
            short[] sArr3 = new short[i19];
            short[] sArr4 = new short[i19];
            int i25 = i15 / 2;
            short[] sArr5 = new short[i25];
            int[] iArr = new int[i25];
            int i26 = i17;
            int i27 = 0;
            while (true) {
                i18 = i15 - 1;
                if (i27 >= i18) {
                    break;
                }
                int i28 = sArr2[i27] * sArr2[i27 + 1];
                if (i28 > 4194048) {
                    int i29 = i27 / 2;
                    iArr[i29] = 65536;
                    sArr5[i29] = (short) (bToUnsignedInt(bArr[i26]) + (bToUnsignedInt(bArr[i26 + 1]) * 256));
                    i26 += 2;
                    sArr4[i29] = (short) ((((i28 + GF2Field.MASK) >>> 8) + GF2Field.MASK) >>> 8);
                } else if (i28 >= 16384) {
                    int i35 = i27 / 2;
                    iArr[i35] = 256;
                    sArr5[i35] = (short) bToUnsignedInt(bArr[i26]);
                    i26++;
                    sArr4[i35] = (short) ((i28 + GF2Field.MASK) >>> 8);
                } else {
                    int i36 = i27 / 2;
                    iArr[i36] = 1;
                    sArr5[i36] = 0;
                    sArr4[i36] = (short) i28;
                }
                i27 += 2;
            }
            if (i27 < i15) {
                sArr4[i27 / 2] = sArr2[i27];
            }
            decode(sArr3, bArr, sArr4, i19, i16, i26);
            int i37 = i16;
            int i38 = 0;
            while (i38 < i18) {
                int i39 = i38 / 2;
                int[] unsignedDivMod = getUnsignedDivMod(sToUnsignedInt(sArr5[i39]) + (iArr[i39] * sToUnsignedInt(sArr3[i39])), sArr2[i38]);
                int i45 = i37 + 1;
                sArr[i37] = (short) unsignedDivMod[1];
                i37 += 2;
                sArr[i45] = (short) getUnsignedMod(unsignedDivMod[0], sArr2[i38 + 1]);
                i38 += 2;
            }
            if (i38 < i15) {
                sArr[i37] = sArr3[i38 / 2];
            }
        }
    }

    private static void encode(byte[] bArr, short[] sArr, short[] sArr2, int i15, int i16) {
        int i17 = 0;
        if (i15 == 1) {
            short s15 = sArr[0];
            short s16 = sArr2[0];
            while (s16 > 1) {
                bArr[i16] = (byte) s15;
                s15 = (short) (s15 >>> 8);
                s16 = (short) ((s16 + 255) >>> 8);
                i16++;
            }
        }
        if (i15 > 1) {
            int i18 = (i15 + 1) / 2;
            short[] sArr3 = new short[i18];
            short[] sArr4 = new short[i18];
            while (i17 < i15 - 1) {
                short s17 = sArr2[i17];
                int i19 = i17 + 1;
                int i25 = sArr[i17] + (sArr[i19] * s17);
                int i26 = sArr2[i19] * s17;
                while (i26 >= 16384) {
                    bArr[i16] = (byte) i25;
                    i25 >>>= 8;
                    i26 = (i26 + GF2Field.MASK) >>> 8;
                    i16++;
                }
                int i27 = i17 / 2;
                sArr3[i27] = (short) i25;
                sArr4[i27] = (short) i26;
                i17 += 2;
            }
            if (i17 < i15) {
                int i28 = i17 / 2;
                sArr3[i28] = sArr[i17];
                sArr4[i28] = sArr2[i17];
            }
            encode(bArr, sArr3, sArr4, i18, i16);
        }
    }

    protected static void expand(int[] iArr, byte[] bArr) {
        byte[] bArr2 = new byte[iArr.length * 4];
        byte[] bArr3 = new byte[iArr.length * 4];
        generateAES256CTRStream(bArr2, bArr3, new byte[16], bArr);
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = i15 * 4;
            iArr[i15] = bToUnsignedInt(bArr3[i16]) + (bToUnsignedInt(bArr3[i16 + 1]) << 8) + (bToUnsignedInt(bArr3[i16 + 2]) << 16) + (bToUnsignedInt(bArr3[i16 + 3]) << 24);
        }
    }

    private static void generateAES256CTRStream(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
        cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(bArr4), bArr3));
        cTRModeCipherNewInstance.processBytes(bArr, 0, bArr2.length, bArr2, 0);
    }

    protected static void generatePolynomialInRQFromSeed(short[] sArr, byte[] bArr, int i15, int i16) {
        int[] iArr = new int[i15];
        expand(iArr, bArr);
        for (int i17 = 0; i17 < i15; i17++) {
            sArr[i17] = (short) (getUnsignedMod(iArr[i17], i16) - ((i16 - 1) / 2));
        }
    }

    protected static void getDecodedPolynomial(short[] sArr, byte[] bArr, int i15, int i16) {
        short[] sArr2 = new short[i15];
        short[] sArr3 = new short[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            sArr3[i17] = (short) i16;
        }
        decode(sArr2, bArr, sArr3, i15, 0, 0);
        for (int i18 = 0; i18 < i15; i18++) {
            sArr[i18] = (short) (sArr2[i18] - ((i16 - 1) / 2));
        }
    }

    protected static void getDecodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i15) {
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15 / 4) {
            int i19 = i17 + 1;
            byte b15 = bArr2[i17];
            bArr[i18] = (byte) ((bToUnsignedInt(b15) & 3) - 1);
            byte b16 = (byte) (b15 >>> 2);
            bArr[i18 + 1] = (byte) ((bToUnsignedInt(b16) & 3) - 1);
            byte b17 = (byte) (b16 >>> 2);
            int i25 = i18 + 3;
            bArr[i18 + 2] = (byte) ((bToUnsignedInt(b17) & 3) - 1);
            i18 += 4;
            bArr[i25] = (byte) ((bToUnsignedInt((byte) (b17 >>> 2)) & 3) - 1);
            i16++;
            i17 = i19;
        }
        bArr[i18] = (byte) ((bToUnsignedInt(bArr2[i17]) & 3) - 1);
    }

    protected static void getEncodedInputs(byte[] bArr, byte[] bArr2) {
        for (int i15 = 0; i15 < bArr2.length; i15++) {
            int i16 = i15 >>> 3;
            bArr[i16] = (byte) (bArr[i16] | (bArr2[i15] << (i15 & 7)));
        }
    }

    protected static void getEncodedPolynomial(byte[] bArr, short[] sArr, int i15, int i16) {
        short[] sArr2 = new short[i15];
        short[] sArr3 = new short[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            sArr2[i17] = (short) (sArr[i17] + ((i16 - 1) / 2));
        }
        for (int i18 = 0; i18 < i15; i18++) {
            sArr3[i18] = (short) i16;
        }
        encode(bArr, sArr2, sArr3, i15, 0);
    }

    protected static void getEncodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i15) {
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15 / 4) {
            int i19 = i18 + 3;
            byte b15 = (byte) (((byte) (((byte) (bArr2[i18] + 1)) + (((byte) (bArr2[i18 + 1] + 1)) << 2))) + (((byte) (bArr2[i18 + 2] + 1)) << 4));
            i18 += 4;
            bArr[i17] = (byte) (b15 + (((byte) (bArr2[i19] + 1)) << 6));
            i16++;
            i17++;
        }
        bArr[i17] = (byte) (bArr2[i18] + 1);
    }

    protected static byte[] getHashWithPrefix(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        int length = bArr.length + bArr2.length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        SHA512Digest sHA512Digest = new SHA512Digest();
        sHA512Digest.update(bArr4, 0, length);
        sHA512Digest.doFinal(bArr3, 0);
        return bArr3;
    }

    protected static int getInverseInRQ(int i15, int i16) {
        int modFreeze = i15;
        for (int i17 = 1; i17 < i16 - 2; i17++) {
            modFreeze = getModFreeze(modFreeze * i15, i16);
        }
        return modFreeze;
    }

    protected static int getModFreeze(int i15, int i16) {
        int i17 = (i16 - 1) / 2;
        return getSignedDivMod(i15 + i17, i16)[1] - i17;
    }

    protected static void getOneThirdInverseInRQ(short[] sArr, byte[] bArr, int i15, int i16) {
        int i17 = i15 + 1;
        short[] sArr2 = new short[i17];
        short[] sArr3 = new short[i17];
        short[] sArr4 = new short[i17];
        short[] sArr5 = new short[i17];
        sArr4[0] = (short) getInverseInRQ(3, i16);
        sArr2[0] = 1;
        int i18 = i15 - 1;
        sArr2[i18] = -1;
        sArr2[i15] = -1;
        for (int i19 = 0; i19 < i15; i19++) {
            sArr3[i18 - i19] = bArr[i19];
        }
        sArr3[i15] = 0;
        int i25 = 1;
        for (int i26 = 0; i26 < (i15 * 2) - 1; i26++) {
            System.arraycopy(sArr5, 0, sArr5, 1, i15);
            sArr5[0] = 0;
            int i27 = -i25;
            int iCheckLessThanZero = checkLessThanZero(i27) & checkNotEqualToZero(sArr3[0]);
            i25 = (i25 ^ ((i27 ^ i25) & iCheckLessThanZero)) + 1;
            for (int i28 = 0; i28 < i17; i28++) {
                short s15 = sArr2[i28];
                int i29 = (sArr3[i28] ^ s15) & iCheckLessThanZero;
                sArr2[i28] = (short) (s15 ^ i29);
                sArr3[i28] = (short) (sArr3[i28] ^ i29);
                short s16 = sArr5[i28];
                int i35 = (sArr4[i28] ^ s16) & iCheckLessThanZero;
                sArr5[i28] = (short) (s16 ^ i35);
                sArr4[i28] = (short) (sArr4[i28] ^ i35);
            }
            short s17 = sArr2[0];
            short s18 = sArr3[0];
            for (int i36 = 0; i36 < i17; i36++) {
                sArr3[i36] = (short) getModFreeze((sArr3[i36] * s17) - (sArr2[i36] * s18), i16);
            }
            for (int i37 = 0; i37 < i17; i37++) {
                sArr4[i37] = (short) getModFreeze((sArr4[i37] * s17) - (sArr5[i37] * s18), i16);
            }
            int i38 = 0;
            while (i38 < i15) {
                int i39 = i38 + 1;
                sArr3[i38] = sArr3[i39];
                i38 = i39;
            }
            sArr3[i15] = 0;
        }
        int inverseInRQ = getInverseInRQ(sArr2[0], i16);
        for (int i45 = 0; i45 < i15; i45++) {
            sArr[i45] = (short) getModFreeze(sArr5[i18 - i45] * inverseInRQ, i16);
        }
    }

    protected static void getRandomInputs(SecureRandom secureRandom, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length / 8];
        secureRandom.nextBytes(bArr2);
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr[i15] = (byte) ((bArr2[i15 >>> 3] >>> (i15 & 7)) & 1);
        }
    }

    protected static void getRandomShortPolynomial(SecureRandom secureRandom, byte[] bArr, int i15, int i16) {
        int[] iArr = new int[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            iArr[i17] = getRandomUnsignedInteger(secureRandom);
        }
        sortGenerateShortPolynomial(bArr, iArr, i15, i16);
    }

    protected static void getRandomSmallPolynomial(SecureRandom secureRandom, byte[] bArr) {
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr[i15] = (byte) ((((getRandomUnsignedInteger(secureRandom) & 1073741823) * 3) >>> 30) - 1);
        }
    }

    protected static int getRandomUnsignedInteger(SecureRandom secureRandom) {
        byte[] bArr = new byte[4];
        secureRandom.nextBytes(bArr);
        return bToUnsignedInt(bArr[0]) + (bToUnsignedInt(bArr[1]) << 8) + (bToUnsignedInt(bArr[2]) << 16) + (bToUnsignedInt(bArr[3]) << 24);
    }

    protected static void getRoundedDecodedPolynomial(short[] sArr, byte[] bArr, int i15, int i16) {
        short[] sArr2 = new short[i15];
        short[] sArr3 = new short[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            sArr3[i17] = (short) ((i16 + 2) / 3);
        }
        decode(sArr2, bArr, sArr3, i15, 0, 0);
        for (int i18 = 0; i18 < i15; i18++) {
            sArr[i18] = (short) ((sArr2[i18] * 3) - ((i16 - 1) / 2));
        }
    }

    protected static void getRoundedEncodedPolynomial(byte[] bArr, short[] sArr, int i15, int i16) {
        short[] sArr2 = new short[i15];
        short[] sArr3 = new short[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            sArr2[i17] = (short) (((sArr[i17] + ((i16 - 1) / 2)) * 10923) >>> 15);
            sArr3[i17] = (short) ((i16 + 2) / 3);
        }
        encode(bArr, sArr2, sArr3, i15, 0);
    }

    private static int[] getSignedDivMod(int i15, int i16) {
        int[] unsignedDivMod = getUnsignedDivMod(toIntExact(iToUnsignedLong(i15) - 2147483648L), i16);
        int[] unsignedDivMod2 = getUnsignedDivMod(PKIFailureInfo.systemUnavail, i16);
        int intExact = toIntExact(iToUnsignedLong(unsignedDivMod[0]) - iToUnsignedLong(unsignedDivMod2[0]));
        int intExact2 = toIntExact(iToUnsignedLong(unsignedDivMod[1]) - iToUnsignedLong(unsignedDivMod2[1]));
        int i17 = -(intExact2 >>> 31);
        return new int[]{intExact + i17, intExact2 + (i16 & i17)};
    }

    protected static void getTopDecodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i15 = 0; i15 < bArr2.length; i15++) {
            int i16 = i15 * 2;
            bArr[i16] = (byte) (bArr2[i15] & 15);
            bArr[i16 + 1] = (byte) (bArr2[i15] >>> 4);
        }
    }

    protected static void getTopEncodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i15 = 0; i15 < bArr.length; i15++) {
            int i16 = i15 * 2;
            bArr[i15] = (byte) (bArr2[i16] + (bArr2[i16 + 1] << 4));
        }
    }

    private static int[] getUnsignedDivMod(int i15, int i16) {
        long jIToUnsignedLong = iToUnsignedLong(i15);
        long j15 = i16;
        long jIToUnsignedLong2 = iToUnsignedLong(PKIFailureInfo.systemUnavail) / j15;
        long j16 = (jIToUnsignedLong * jIToUnsignedLong2) >>> 31;
        long j17 = jIToUnsignedLong - (j16 * j15);
        long j18 = (jIToUnsignedLong2 * j17) >>> 31;
        long j19 = (j17 - (j18 * j15)) - j15;
        long j25 = j16 + j18 + 1;
        long j26 = -(j19 >>> 63);
        return new int[]{toIntExact(j25 + j26), toIntExact(j19 + (j15 & j26))};
    }

    private static int getUnsignedMod(int i15, int i16) {
        return getUnsignedDivMod(i15, i16)[1];
    }

    static long iToUnsignedLong(int i15) {
        return ((long) i15) & BodyPartID.bodyIdMax;
    }

    protected static boolean isInvertiblePolynomialInR3(byte[] bArr, byte[] bArr2, int i15) {
        int i16 = i15 + 1;
        byte[] bArr3 = new byte[i16];
        byte[] bArr4 = new byte[i16];
        byte[] bArr5 = new byte[i16];
        byte[] bArr6 = new byte[i16];
        bArr5[0] = 1;
        bArr3[0] = 1;
        int i17 = i15 - 1;
        bArr3[i17] = -1;
        bArr3[i15] = -1;
        for (int i18 = 0; i18 < i15; i18++) {
            bArr4[i17 - i18] = bArr[i18];
        }
        bArr4[i15] = 0;
        int i19 = 1;
        for (int i25 = 0; i25 < (i15 * 2) - 1; i25++) {
            System.arraycopy(bArr6, 0, bArr6, 1, i15);
            bArr6[0] = 0;
            int i26 = (-bArr4[0]) * bArr3[0];
            int i27 = -i19;
            int iCheckLessThanZero = checkLessThanZero(i27) & checkNotEqualToZero(bArr4[0]);
            i19 = (i19 ^ ((i27 ^ i19) & iCheckLessThanZero)) + 1;
            for (int i28 = 0; i28 < i16; i28++) {
                byte b15 = bArr3[i28];
                int i29 = (bArr4[i28] ^ b15) & iCheckLessThanZero;
                bArr3[i28] = (byte) (b15 ^ i29);
                bArr4[i28] = (byte) (bArr4[i28] ^ i29);
                byte b16 = bArr6[i28];
                int i35 = (bArr5[i28] ^ b16) & iCheckLessThanZero;
                bArr6[i28] = (byte) (b16 ^ i35);
                bArr5[i28] = (byte) (bArr5[i28] ^ i35);
            }
            for (int i36 = 0; i36 < i16; i36++) {
                bArr4[i36] = (byte) getModFreeze(bArr4[i36] + (bArr3[i36] * i26), 3);
            }
            for (int i37 = 0; i37 < i16; i37++) {
                bArr5[i37] = (byte) getModFreeze(bArr5[i37] + (bArr6[i37] * i26), 3);
            }
            int i38 = 0;
            while (i38 < i15) {
                int i39 = i38 + 1;
                bArr4[i38] = bArr4[i39];
                i38 = i39;
            }
            bArr4[i15] = 0;
        }
        byte b17 = bArr3[0];
        for (int i45 = 0; i45 < i15; i45++) {
            bArr2[i45] = (byte) (bArr6[i17 - i45] * b17);
        }
        return i19 == 0;
    }

    protected static void minmax(int[] iArr, int i15, int i16) {
        int i17 = iArr[i15];
        int i18 = iArr[i16];
        int i19 = i17 ^ i18;
        int i25 = i18 - i17;
        int i26 = i19 & (-((i25 ^ (((i25 ^ i18) ^ PKIFailureInfo.systemUnavail) & i19)) >>> 31));
        iArr[i15] = i17 ^ i26;
        iArr[i16] = i18 ^ i26;
    }

    protected static void multiplicationInR3(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        int i16 = i15 + i15;
        int i17 = i16 - 1;
        byte[] bArr4 = new byte[i17];
        for (int i18 = 0; i18 < i15; i18++) {
            byte modFreeze = 0;
            for (int i19 = 0; i19 <= i18; i19++) {
                modFreeze = (byte) getModFreeze(modFreeze + (bArr2[i19] * bArr3[i18 - i19]), 3);
            }
            bArr4[i18] = modFreeze;
        }
        for (int i25 = i15; i25 < i17; i25++) {
            byte modFreeze2 = 0;
            for (int i26 = (i25 - i15) + 1; i26 < i15; i26++) {
                modFreeze2 = (byte) getModFreeze(modFreeze2 + (bArr2[i26] * bArr3[i25 - i26]), 3);
            }
            bArr4[i25] = modFreeze2;
        }
        for (int i27 = i16 - 2; i27 >= i15; i27--) {
            int i28 = i27 - i15;
            bArr4[i28] = (byte) getModFreeze(bArr4[i28] + bArr4[i27], 3);
            int i29 = i28 + 1;
            bArr4[i29] = (byte) getModFreeze(bArr4[i29] + bArr4[i27], 3);
        }
        for (int i35 = 0; i35 < i15; i35++) {
            bArr[i35] = bArr4[i35];
        }
    }

    protected static void multiplicationInRQ(short[] sArr, short[] sArr2, byte[] bArr, int i15, int i16) {
        int i17 = i15 + i15;
        int i18 = i17 - 1;
        short[] sArr3 = new short[i18];
        for (int i19 = 0; i19 < i15; i19++) {
            short modFreeze = 0;
            for (int i25 = 0; i25 <= i19; i25++) {
                modFreeze = (short) getModFreeze(modFreeze + (sArr2[i25] * bArr[i19 - i25]), i16);
            }
            sArr3[i19] = modFreeze;
        }
        for (int i26 = i15; i26 < i18; i26++) {
            short modFreeze2 = 0;
            for (int i27 = (i26 - i15) + 1; i27 < i15; i27++) {
                modFreeze2 = (short) getModFreeze(modFreeze2 + (sArr2[i27] * bArr[i26 - i27]), i16);
            }
            sArr3[i26] = modFreeze2;
        }
        for (int i28 = i17 - 2; i28 >= i15; i28--) {
            int i29 = i28 - i15;
            sArr3[i29] = (short) getModFreeze(sArr3[i29] + sArr3[i28], i16);
            int i35 = i29 + 1;
            sArr3[i35] = (short) getModFreeze(sArr3[i35] + sArr3[i28], i16);
        }
        for (int i36 = 0; i36 < i15; i36++) {
            sArr[i36] = sArr3[i36];
        }
    }

    protected static void right(byte[] bArr, short[] sArr, byte[] bArr2, int i15, int i16, int i17, int i18) {
        for (int i19 = 0; i19 < bArr.length; i19++) {
            bArr[i19] = (byte) (-checkLessThanZero(getModFreeze((getModFreeze((bArr2[i19] * i18) - i17, i15) - sArr[i19]) + (i16 * 4) + 1, i15)));
        }
    }

    protected static void roundPolynomial(short[] sArr, short[] sArr2) {
        for (int i15 = 0; i15 < sArr.length; i15++) {
            short s15 = sArr2[i15];
            sArr[i15] = (short) (s15 - getModFreeze(s15, 3));
        }
    }

    static int sToUnsignedInt(short s15) {
        return s15 & HPKE.aead_EXPORT_ONLY;
    }

    protected static void scalarMultiplicationInRQ(short[] sArr, short[] sArr2, int i15, int i16) {
        for (int i17 = 0; i17 < sArr2.length; i17++) {
            sArr[i17] = (short) getModFreeze(sArr2[i17] * i15, i16);
        }
    }

    protected static void sortGenerateShortPolynomial(byte[] bArr, int[] iArr, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            iArr[i17] = iArr[i17] & (-2);
        }
        while (i16 < i15) {
            iArr[i16] = (iArr[i16] & (-3)) | 1;
            i16++;
        }
        cryptoSort(iArr, i15);
        for (int i18 = 0; i18 < i15; i18++) {
            bArr[i18] = (byte) ((iArr[i18] & 3) - 1);
        }
    }

    static int toIntExact(long j15) {
        int i15 = (int) j15;
        if (i15 == j15) {
            return i15;
        }
        throw new IllegalStateException("value out of integer range");
    }

    protected static void top(byte[] bArr, short[] sArr, byte[] bArr2, int i15, int i16, int i17) {
        for (int i18 = 0; i18 < bArr.length; i18++) {
            bArr[i18] = (byte) ((((getModFreeze(sArr[i18] + (bArr2[i18] * ((i15 - 1) / 2)), i15) + i16) * i17) + 16384) >>> 15);
        }
    }

    protected static void transformRQToR3(byte[] bArr, short[] sArr) {
        for (int i15 = 0; i15 < sArr.length; i15++) {
            bArr[i15] = (byte) getModFreeze(sArr[i15], 3);
        }
    }

    protected static void updateDiffMask(byte[] bArr, byte[] bArr2, int i15) {
        for (int i16 = 0; i16 < bArr.length; i16++) {
            int i17 = bArr[i16];
            bArr[i16] = (byte) (i17 ^ ((bArr2[i16] ^ i17) & i15));
        }
    }
}
