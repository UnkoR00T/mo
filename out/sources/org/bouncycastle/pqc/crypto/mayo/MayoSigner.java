package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class MayoSigner implements MessageSigner {
    private static final long EVEN_2BYTES = 281470681808895L;
    private static final long EVEN_BYTES = 71777214294589695L;
    private static final int F_TAIL_LEN = 4;
    private MayoParameters params;
    private MayoPrivateKeyParameters privKey;
    private MayoPublicKeyParameters pubKey;
    private SecureRandom random;

    private static long ctCompare64(int i15, int i16) {
        return (-(i15 ^ i16)) >> 63;
    }

    private static void mVecMultiplyBins(int i15, int i16, long[] jArr, long[] jArr2) {
        int i17 = i15 + i15;
        int i18 = i17 + i15;
        int i19 = i18 + i15;
        int i25 = i19 + i15;
        int i26 = i25 + i15;
        int i27 = i26 + i15;
        int i28 = i27 + i15;
        int i29 = i28 + i15;
        int i35 = i29 + i15;
        int i36 = i35 + i15;
        int i37 = i36 + i15;
        int i38 = i37 + i15;
        int i39 = i38 + i15;
        int i45 = i39 + i15;
        int i46 = 0;
        int i47 = 0;
        while (i46 < i16) {
            int i48 = i46;
            int i49 = i47;
            int i55 = 0;
            while (i55 < i15) {
                long j15 = jArr[i49 + i25];
                long j16 = j15 & 1229782938247303441L;
                long j17 = (jArr[i49 + i35] ^ ((j15 & (-1229782938247303442L)) >>> 1)) ^ ((j16 << 3) + j16);
                long j18 = jArr[i49 + i36];
                long j19 = (j18 & (-8608480567731124088L)) >>> 3;
                long j25 = (jArr[i49 + i37] ^ ((j18 & 8608480567731124087L) << 1)) ^ ((j19 << 1) + j19);
                long j26 = j17 & 1229782938247303441L;
                long j27 = (jArr[i49 + i27] ^ ((j17 & (-1229782938247303442L)) >>> 1)) ^ ((j26 << 3) + j26);
                long j28 = (j25 & (-8608480567731124088L)) >>> 3;
                long j29 = (jArr[i49 + i26] ^ ((j25 & 8608480567731124087L) << 1)) ^ ((j28 << 1) + j28);
                long j35 = j27 & 1229782938247303441L;
                long j36 = (jArr[i49 + i39] ^ ((j27 & (-1229782938247303442L)) >>> 1)) ^ ((j35 << 3) + j35);
                long j37 = (j29 & (-8608480567731124088L)) >>> 3;
                long j38 = (jArr[i49 + i18] ^ ((j29 & 8608480567731124087L) << 1)) ^ ((j37 << 1) + j37);
                long j39 = j36 & 1229782938247303441L;
                long j45 = (jArr[i49 + i45] ^ ((j36 & (-1229782938247303442L)) >>> 1)) ^ ((j39 << 3) + j39);
                long j46 = (j38 & (-8608480567731124088L)) >>> 3;
                long j47 = (jArr[i49 + i28] ^ ((j38 & 8608480567731124087L) << 1)) ^ ((j46 << 1) + j46);
                long j48 = j45 & 1229782938247303441L;
                long j49 = (jArr[i49 + i38] ^ ((j45 & (-1229782938247303442L)) >>> 1)) ^ ((j48 << 3) + j48);
                long j55 = (j47 & (-8608480567731124088L)) >>> 3;
                long j56 = (jArr[i49 + i19] ^ ((j47 & 8608480567731124087L) << 1)) ^ ((j55 << 1) + j55);
                long j57 = j49 & 1229782938247303441L;
                long j58 = (jArr[i49 + i29] ^ ((j49 & (-1229782938247303442L)) >>> 1)) ^ ((j57 << 3) + j57);
                long j59 = (j56 & (-8608480567731124088L)) >>> 3;
                long j65 = (jArr[i49 + i17] ^ ((j56 & 8608480567731124087L) << 1)) ^ ((j59 << 1) + j59);
                long j66 = j58 & 1229782938247303441L;
                long j67 = (jArr[i49 + i15] ^ ((j58 & (-1229782938247303442L)) >>> 1)) ^ ((j66 << 3) + j66);
                long j68 = (j65 & (-8608480567731124088L)) >>> 3;
                jArr2[(i47 >> 4) + i55] = (j67 ^ ((j65 & 8608480567731124087L) << 1)) ^ ((j68 << 1) + j68);
                i55++;
                i49++;
            }
            i46 = i48 + 1;
            i47 += i15 << 4;
        }
    }

    private static void mayoGenericMCalculatePS(MayoParameters mayoParameters, long[] jArr, int i15, int i16, byte[] bArr, int i17, int i18, int i19, long[] jArr2) {
        int i25 = i17;
        int i26 = i18;
        int i27 = i26 + i25;
        int mVecLimbs = mayoParameters.getMVecLimbs();
        long[] jArr3 = new long[(((mayoParameters.getK() * mVecLimbs) * mayoParameters.getN()) * mVecLimbs) << 4];
        int i28 = i26 * mVecLimbs;
        int i29 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        while (i29 < i25) {
            for (int i38 = i29; i38 < i25; i38++) {
                int i39 = 0;
                int i45 = 0;
                while (i39 < i19) {
                    Longs.xorTo(mVecLimbs, jArr, i36, jArr3, (((i37 + i39) << 4) + (bArr[i45 + i38] & GF2Field.MASK)) * mVecLimbs);
                    i39++;
                    i45 += i27;
                }
                i36 += mVecLimbs;
            }
            int i46 = i35;
            int i47 = 0;
            while (i47 < i26) {
                int i48 = 0;
                int i49 = 0;
                while (i48 < i19) {
                    Longs.xorTo(mVecLimbs, jArr, i15 + i46, jArr3, (((i37 + i48) << 4) + (bArr[i49 + i47 + i17] & GF2Field.MASK)) * mVecLimbs);
                    i48++;
                    i49 += i27;
                }
                i47++;
                i46 += mVecLimbs;
                i26 = i18;
            }
            i29++;
            i37 += i19;
            i35 += i28;
            i25 = i17;
            i26 = i18;
        }
        int i55 = i17 * i19;
        int i56 = 0;
        int i57 = i17;
        while (i57 < i27) {
            for (int i58 = i57; i58 < i27; i58++) {
                int i59 = 0;
                int i65 = 0;
                while (i59 < i19) {
                    Longs.xorTo(mVecLimbs, jArr, i16 + i56, jArr3, (((i55 + i59) << 4) + (bArr[i65 + i58] & GF2Field.MASK)) * mVecLimbs);
                    i59++;
                    i65 += i27;
                }
                i56 += mVecLimbs;
            }
            i57++;
            i55 += i19;
        }
        mVecMultiplyBins(mVecLimbs, i27 * i19, jArr3, jArr2);
    }

    private static void mayoGenericMCalculateSPS(long[] jArr, byte[] bArr, int i15, int i16, int i17, long[] jArr2) {
        int i18 = i16;
        int i19 = i18 * i18;
        long[] jArr3 = new long[(i15 * i19) << 4];
        int i25 = i18 * i15;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < i18) {
            int i29 = 0;
            int i35 = 0;
            while (i29 < i17) {
                int i36 = ((bArr[i27 + i29] & GF2Field.MASK) * i15) + i28;
                int i37 = 0;
                int i38 = 0;
                while (i37 < i18) {
                    Longs.xorTo(i15, jArr, i35 + i38, jArr3, i36 + (i38 << 4));
                    i37++;
                    i38 += i15;
                    i18 = i16;
                }
                i29++;
                i35 += i25;
                i18 = i16;
            }
            i26++;
            i27 += i17;
            i28 += i25 << 4;
            i18 = i16;
        }
        mVecMultiplyBins(i15, i19, jArr3, jArr2);
    }

    private static int mulTable(int i15) {
        int i16 = i15 * 134480385;
        int i17 = (-252645136) & i16;
        return (i16 ^ (i17 >>> 4)) ^ (i17 >>> 3);
    }

    private static void transpose16x16Nibbles(long[] jArr, int i15) {
        for (int i16 = 0; i16 < 16; i16 += 2) {
            int i17 = i15 + i16;
            int i18 = i17 + 1;
            long j15 = jArr[i17];
            long j16 = ((j15 >>> 4) ^ jArr[i18]) & 1085102592571150095L;
            jArr[i17] = j15 ^ (j16 << 4);
            jArr[i18] = jArr[i18] ^ j16;
        }
        int i19 = i15;
        for (int i25 = 0; i25 < 16; i25 += 4) {
            long j17 = jArr[i19];
            long j18 = ((j17 >>> 8) ^ jArr[i19 + 2]) & EVEN_BYTES;
            int i26 = i19 + 1;
            long j19 = EVEN_BYTES & ((jArr[i26] >>> 8) ^ jArr[i19 + 3]);
            jArr[i19] = j17 ^ (j18 << 8);
            int i27 = i19 + 2;
            jArr[i26] = jArr[i26] ^ (j19 << 8);
            int i28 = i19 + 3;
            jArr[i27] = jArr[i27] ^ j18;
            i19 += 4;
            jArr[i28] = jArr[i28] ^ j19;
        }
        for (int i29 = 0; i29 < 4; i29++) {
            int i35 = i15 + i29;
            long j25 = jArr[i35];
            int i36 = i35 + 4;
            long j26 = ((j25 >>> 16) ^ jArr[i36]) & EVEN_2BYTES;
            int i37 = i35 + 8;
            int i38 = i35 + 12;
            long j27 = EVEN_2BYTES & ((jArr[i37] >>> 16) ^ jArr[i38]);
            jArr[i35] = j25 ^ (j26 << 16);
            jArr[i37] = jArr[i37] ^ (j27 << 16);
            jArr[i36] = jArr[i36] ^ j26;
            jArr[i38] = jArr[i38] ^ j27;
        }
        for (int i39 = 0; i39 < 8; i39++) {
            int i45 = i15 + i39;
            long j28 = jArr[i45];
            int i46 = i45 + 8;
            long j29 = ((j28 >>> 32) ^ jArr[i46]) & BodyPartID.bodyIdMax;
            jArr[i45] = j28 ^ (j29 << 32);
            jArr[i46] = jArr[i46] ^ j29;
        }
    }

    private static void vecMulAddU64(int i15, long[] jArr, byte b15, long[] jArr2) {
        int iMulTable = mulTable(b15 & 255);
        for (int i16 = 0; i16 < i15; i16++) {
            long j15 = jArr[i16];
            jArr2[i16] = ((((j15 >>> 3) & 1229782938247303441L) * ((long) ((iMulTable >>> 24) & 15))) ^ ((((j15 & 1229782938247303441L) * ((long) (iMulTable & GF2Field.MASK))) ^ (((j15 >>> 1) & 1229782938247303441L) * ((long) ((iMulTable >>> 8) & 15)))) ^ (((j15 >>> 2) & 1229782938247303441L) * ((long) ((iMulTable >>> 16) & 15))))) ^ jArr2[i16];
        }
    }

    void computeA(long[] jArr, byte[] bArr) {
        int i15;
        char c15;
        int i16;
        int k15 = this.params.getK();
        int o15 = this.params.getO();
        int m15 = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int aCols = this.params.getACols();
        int[] fTail = this.params.getFTail();
        int i17 = o15 * k15;
        int i18 = o15 * mVecLimbs;
        int i19 = 4;
        int i25 = ((i17 + 15) >> 4) << 4;
        long[] jArr2 = new long[(((m15 + 7) >>> 3) * i25) << 4];
        int i26 = m15 & 15;
        if (i26 != 0) {
            long j15 = (1 << (i26 << 2)) - 1;
            int i27 = mVecLimbs - 1;
            int i28 = 0;
            while (i28 < i17) {
                jArr[i27] = jArr[i27] & j15;
                i28++;
                i27 += mVecLimbs;
            }
        }
        int i29 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        while (i29 < k15) {
            int i39 = k15 - 1;
            int i45 = i39 * i18;
            int i46 = i39 * o15;
            int i47 = i39;
            while (i47 >= i29) {
                int i48 = 0;
                int i49 = 0;
                while (true) {
                    i16 = i19;
                    if (i48 >= o15) {
                        break;
                    }
                    int i55 = 0;
                    int i56 = 0;
                    while (i55 < mVecLimbs) {
                        long j16 = jArr[i45 + i55 + i49];
                        int i57 = i36 + i48 + i38 + i56;
                        jArr2[i57] = jArr2[i57] ^ (j16 << i37);
                        if (i37 > 0) {
                            int i58 = i57 + i25;
                            jArr2[i58] = jArr2[i58] ^ (j16 >>> (64 - i37));
                        }
                        i55++;
                        i56 += i25;
                    }
                    i48++;
                    i49 += mVecLimbs;
                    i19 = i16;
                }
                if (i29 != i47) {
                    int i59 = 0;
                    int i65 = 0;
                    while (i59 < o15) {
                        int i66 = 0;
                        int i67 = 0;
                        while (i66 < mVecLimbs) {
                            long j17 = jArr[i35 + i66 + i65];
                            int i68 = i46 + i59 + i38 + i67;
                            jArr2[i68] = jArr2[i68] ^ (j17 << i37);
                            if (i37 > 0) {
                                int i69 = i68 + i25;
                                jArr2[i69] = jArr2[i69] ^ (j17 >>> (64 - i37));
                            }
                            i66++;
                            i67 += i25;
                        }
                        i59++;
                        i65 += mVecLimbs;
                    }
                }
                int i75 = i37 + 4;
                if (i75 == 64) {
                    i38 += i25;
                    i37 = 0;
                } else {
                    i37 = i75;
                }
                i47--;
                i45 -= i18;
                i46 -= o15;
                i19 = i16;
            }
            i29++;
            i36 += o15;
            i35 += i18;
        }
        int i76 = i19;
        int i77 = 0;
        while (true) {
            i15 = (k15 + 1) * k15;
            if (i77 >= ((((i15 >> 1) + m15) + 15) >>> 4) * i25) {
                break;
            }
            transpose16x16Nibbles(jArr2, i77);
            i77 += 16;
        }
        byte[] bArr2 = new byte[16];
        int i78 = 0;
        int i79 = 0;
        while (true) {
            c15 = 1;
            if (i78 >= i76) {
                break;
            }
            int i85 = fTail[i78];
            bArr2[i79] = (byte) GF16.mul(i85, 1);
            bArr2[i79 + 1] = (byte) GF16.mul(i85, 2);
            int i86 = i79 + 3;
            bArr2[i79 + 2] = (byte) GF16.mul(i85, 4);
            i79 += 4;
            bArr2[i86] = (byte) GF16.mul(i85, 8);
            i78++;
            i76 = 4;
        }
        int i87 = 0;
        while (i87 < i25) {
            int i88 = m15;
            while (i88 < (i15 >>> 1) + m15) {
                long j18 = jArr2[((i88 >>> 4) * i25) + i87 + (i88 & 15)];
                long j19 = j18 & 1229782938247303441L;
                long j25 = (j18 >>> c15) & 1229782938247303441L;
                long j26 = (j18 >>> 2) & 1229782938247303441L;
                long j27 = (j18 >>> 3) & 1229782938247303441L;
                int i89 = 0;
                int i95 = 0;
                while (i89 < 4) {
                    int i96 = (i88 + i89) - m15;
                    int i97 = ((i96 >> 4) * i25) + i87 + (i96 & 15);
                    int i98 = i95;
                    byte[] bArr3 = bArr2;
                    jArr2[i97] = jArr2[i97] ^ ((((((long) bArr2[i98 + 1]) * j25) ^ (((long) bArr2[i95]) * j19)) ^ (((long) bArr3[i98 + 2]) * j26)) ^ (((long) bArr3[i98 + 3]) * j27));
                    i89++;
                    i95 = i98 + 4;
                    bArr2 = bArr3;
                }
                i88++;
                c15 = 1;
            }
            i87 += 16;
            c15 = 1;
        }
        byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr2);
        for (int i99 = 0; i99 < m15; i99 += 16) {
            int i100 = 0;
            while (true) {
                int i101 = aCols - 1;
                if (i100 < i101) {
                    int i102 = 0;
                    while (true) {
                        int i103 = i102 + i99;
                        if (i103 < m15) {
                            GF16.decode(bArrLongToLittleEndian, ((((i99 * i25) >> 4) + i100) + i102) << 3, bArr, (i103 * aCols) + i100, Math.min(16, i101 - i100));
                            i102++;
                        }
                    }
                    i100 += 16;
                }
            }
        }
    }

    void computeRHS(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i15;
        int[] iArr;
        int m15 = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int k15 = this.params.getK();
        int[] fTail = this.params.getFTail();
        int i16 = ((m15 - 1) & 15) << 2;
        int i17 = m15 & 15;
        int i18 = 0;
        if (i17 != 0) {
            long j15 = (1 << (i17 << 2)) - 1;
            int i19 = k15 * k15;
            int i25 = mVecLimbs - 1;
            int i26 = 0;
            while (i26 < i19) {
                jArr[i25] = jArr[i25] & j15;
                i26++;
                i25 += mVecLimbs;
            }
        }
        long[] jArr2 = new long[mVecLimbs];
        byte[] bArr3 = new byte[mVecLimbs << 3];
        int i27 = k15 * mVecLimbs;
        int i28 = k15 - 1;
        int i29 = i28 * mVecLimbs;
        int i35 = i29 * k15;
        while (i28 >= 0) {
            int i36 = i28;
            int i37 = i29;
            int i38 = i35;
            while (i36 < k15) {
                int i39 = mVecLimbs - 1;
                long j16 = jArr2[i39];
                int i45 = i36;
                int i46 = (int) ((j16 >>> i16) & 15);
                jArr2[i39] = j16 << 4;
                for (int i47 = mVecLimbs - 2; i47 >= 0; i47--) {
                    int i48 = i47 + 1;
                    jArr2[i48] = jArr2[i48] ^ (jArr2[i47] >>> 60);
                    jArr2[i47] = jArr2[i47] << 4;
                }
                Pack.longToLittleEndian(jArr2, bArr3, i18);
                int i49 = i18;
                for (int i55 = 4; i49 < i55; i55 = 4) {
                    int i56 = fTail[i49];
                    if (i56 == 0) {
                        i15 = k15;
                        iArr = fTail;
                    } else {
                        i15 = k15;
                        iArr = fTail;
                        long jMul = GF16.mul(i46, i56);
                        if ((i49 & 1) == 0) {
                            int i57 = i49 >> 1;
                            bArr3[i57] = (byte) (bArr3[i57] ^ ((byte) (jMul & 15)));
                        } else {
                            int i58 = i49 >> 1;
                            bArr3[i58] = (byte) (bArr3[i58] ^ ((byte) ((jMul & 15) << 4)));
                        }
                    }
                    i49++;
                    k15 = i15;
                    fTail = iArr;
                }
                int i59 = k15;
                int[] iArr2 = fTail;
                Pack.littleEndianToLong(bArr3, 0, jArr2);
                int i65 = i35 + i37;
                int i66 = i38 + i29;
                boolean z15 = i28 == i45;
                for (int i67 = 0; i67 < mVecLimbs; i67++) {
                    long j17 = jArr[i65 + i67];
                    if (!z15) {
                        j17 ^= jArr[i66 + i67];
                    }
                    jArr2[i67] = jArr2[i67] ^ j17;
                }
                i36 = i45 + 1;
                i37 += mVecLimbs;
                i38 += i27;
                k15 = i59;
                fTail = iArr2;
                i18 = 0;
            }
            i28--;
            i29 -= mVecLimbs;
            i35 -= i27;
            i18 = 0;
        }
        Pack.longToLittleEndian(jArr2, bArr3, i18);
        while (i18 < m15) {
            int i68 = i18 >> 1;
            bArr2[i18] = (byte) (bArr[i18] ^ (bArr3[i68] & 15));
            int i69 = i18 + 1;
            bArr2[i69] = (byte) (((bArr3[i68] >>> 4) & 15) ^ bArr[i69]);
            i18 += 2;
        }
    }

    void ef(byte[] bArr, int i15, int i16) {
        int i17;
        int i18 = (i16 + 15) >> 4;
        long[] jArr = new long[i18];
        long[] jArr2 = new long[i18];
        long[] jArr3 = new long[i15 * i18];
        int i19 = 16;
        int o15 = (this.params.getO() * this.params.getK()) + 16;
        byte[] bArr2 = new byte[o15 >> 1];
        int i25 = o15 >> 4;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < i15) {
            int i29 = 0;
            while (i29 < i18) {
                long j15 = 0;
                int i35 = 0;
                while (i35 < i19) {
                    int i36 = (i29 << 4) + i35;
                    if (i36 < i16) {
                        i17 = i35;
                        j15 |= (((long) bArr[i36 + i27]) & 15) << (i17 << 2);
                    } else {
                        i17 = i35;
                    }
                    i35 = i17 + 1;
                    i26 = i26;
                    i19 = 16;
                }
                jArr3[i29 + i28] = j15;
                i29++;
                i19 = 16;
            }
            i26++;
            i27 += i16;
            i28 += i18;
            i19 = 16;
        }
        int i37 = 0;
        int i38 = 0;
        while (i37 < i16) {
            int iMax = Math.max(0, (i37 + i15) - i16);
            int i39 = i15 - 1;
            int iMin = Math.min(i39, i37);
            Arrays.clear(jArr);
            Arrays.clear(jArr2);
            int iMin2 = Math.min(i39, iMin + 32);
            int i45 = iMax * i18;
            int i46 = i45;
            int i47 = 0;
            int i48 = i25;
            int i49 = i37;
            long j16 = -1;
            while (iMax <= iMin2) {
                long j17 = ~ctCompare64(iMax, i38);
                long j18 = (((long) i38) - ((long) iMax)) >> 63;
                for (int i55 = 0; i55 < i18; i55++) {
                    jArr[i55] = jArr[i55] ^ ((j17 | (j18 & j16)) & jArr3[i46 + i55]);
                }
                i47 = (int) ((jArr[i49 >>> 4] >>> ((i49 & 15) << 2)) & 15);
                j16 = ~((-i47) >> 63);
                iMax++;
                i46 += i18;
            }
            vecMulAddU64(i18, jArr, GF16.inv((byte) i47), jArr2);
            int i56 = i45;
            int i57 = iMax;
            while (i57 <= iMin) {
                int i58 = i56;
                int i59 = i47;
                int i65 = i57;
                long j19 = (~j16) & (~ctCompare64(i57, i38));
                long j25 = ~j19;
                int i66 = i58;
                int i67 = 0;
                while (i67 < i18) {
                    jArr3[i66] = (j25 & jArr3[i66]) | (j19 & jArr2[i67]);
                    i67++;
                    i66++;
                }
                i57 = i65 + 1;
                i56 = i58 + i18;
                i47 = i59;
            }
            int i68 = i47;
            int i69 = iMax;
            while (i69 < i15) {
                vecMulAddU64(i18, jArr2, (byte) (((int) ((jArr3[(i49 >>> 4) + i45] >>> ((i49 & 15) << 2)) & 15)) & (i69 > i38 ? -1 : 0)), jArr3, i45);
                i69++;
                i45 += i18;
            }
            if (i68 != 0) {
                i38++;
            }
            i37 = i49 + 1;
            i25 = i48;
        }
        int i75 = i25;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        while (i78 < i15) {
            Pack.longToLittleEndian(jArr3, i76, i75, bArr2, 0);
            GF16.decode(bArr2, 0, bArr, i77, i16);
            i77 += i16;
            i78++;
            i76 += i18;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) throws Throwable {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        int i15;
        int i16;
        byte[] bArr10;
        int i17;
        int i18;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        int i19;
        long[] jArr;
        int i25;
        int k15 = this.params.getK();
        int v15 = this.params.getV();
        int o15 = this.params.getO();
        int n15 = this.params.getN();
        int m15 = this.params.getM();
        int vBytes = this.params.getVBytes();
        int oBytes = this.params.getOBytes();
        int saltBytes = this.params.getSaltBytes();
        int mVecLimbs = this.params.getMVecLimbs();
        int p1Limbs = this.params.getP1Limbs();
        int pkSeedBytes = this.params.getPkSeedBytes();
        int digestBytes = this.params.getDigestBytes();
        int skSeedBytes = this.params.getSkSeedBytes();
        byte[] bArr14 = new byte[this.params.getMBytes()];
        byte[] bArr15 = new byte[m15];
        byte[] bArr16 = new byte[saltBytes];
        byte[] bArr17 = new byte[m15];
        int i26 = k15 * vBytes;
        int rBytes = this.params.getRBytes() + i26;
        int i27 = i26;
        int i28 = v15 * k15;
        int i29 = k15;
        byte[] bArr18 = new byte[i28];
        int i35 = i29 * o15;
        int i36 = i29 * n15;
        byte[] bArr19 = bArr18;
        int i37 = i35 + 1;
        byte[] bArr20 = new byte[rBytes];
        byte[] bArr21 = new byte[((m15 + 7) / 8) * 8 * i37];
        byte[] bArr22 = new byte[i36];
        byte[] bArr23 = new byte[i36];
        int i38 = digestBytes + saltBytes;
        int i39 = i36;
        int i45 = i38 + skSeedBytes;
        byte[] bArr24 = new byte[i37];
        int i46 = i45 + 1;
        int i47 = rBytes;
        byte[] bArr25 = new byte[i46];
        int i48 = i46;
        int sigBytes = this.params.getSigBytes();
        byte[] bArr26 = new byte[sigBytes];
        long[] jArr2 = new long[p1Limbs + this.params.getP2Limbs()];
        int i49 = v15 * o15;
        byte[] bArr27 = new byte[i49];
        byte[] bArr28 = bArr14;
        long[] jArr3 = new long[i35 * mVecLimbs];
        long[] jArr4 = new long[i29 * i29 * mVecLimbs];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        try {
            byte[] seedSk = this.privKey.getSeedSk();
            int i55 = pkSeedBytes + oBytes;
            byte[] bArr29 = new byte[i55];
            byte[] bArr30 = bArr16;
            try {
                sHAKEDigest.update(seedSk, 0, seedSk.length);
                sHAKEDigest.doFinal(bArr29, 0, i55);
                GF16.decode(bArr29, pkSeedBytes, bArr27, 0, i49);
                Utils.expandP1P2(this.params, jArr2, bArr29);
                int i56 = o15 * mVecLimbs;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                int i65 = 0;
                while (i57 < v15) {
                    int i66 = i58;
                    int i67 = i59;
                    int i68 = i65;
                    int i69 = i57;
                    while (i69 < v15) {
                        if (i69 == i57) {
                            i68 += mVecLimbs;
                            jArr = jArr2;
                            i25 = mVecLimbs;
                        } else {
                            int i75 = p1Limbs;
                            int i76 = 0;
                            while (i76 < o15) {
                                long[] jArr5 = jArr2;
                                GF16Utils.mVecMulAdd(mVecLimbs, jArr5, i68, bArr27[i66 + i76], jArr2, i59 + i75);
                                int i77 = mVecLimbs;
                                GF16Utils.mVecMulAdd(i77, jArr5, i68, bArr27[i58 + i76], jArr5, i67 + i75);
                                i76++;
                                i75 += i77;
                                mVecLimbs = i77;
                                jArr2 = jArr5;
                            }
                            jArr = jArr2;
                            i25 = mVecLimbs;
                            i68 += i25;
                        }
                        i69++;
                        i66 += o15;
                        i67 += i56;
                        mVecLimbs = i25;
                        jArr2 = jArr;
                        i56 = i56;
                    }
                    i57++;
                    i58 += o15;
                    i59 += i56;
                    jArr2 = jArr2;
                    i65 = i68;
                }
                long[] jArr6 = jArr2;
                int i78 = mVecLimbs;
                Arrays.fill(bArr29, (byte) 0);
                sHAKEDigest.update(bArr, 0, bArr.length);
                sHAKEDigest.doFinal(bArr25, 0, digestBytes);
                try {
                    this.random.nextBytes(bArr30);
                    int i79 = saltBytes;
                    System.arraycopy(bArr30, 0, bArr25, digestBytes, i79);
                    System.arraycopy(seedSk, 0, bArr25, i38, skSeedBytes);
                    int i85 = i45;
                    sHAKEDigest.update(bArr25, 0, i85);
                    sHAKEDigest.doFinal(bArr30, 0, i79);
                    System.arraycopy(bArr30, 0, bArr25, digestBytes, i79);
                    sHAKEDigest.update(bArr25, 0, i38);
                    byte[] bArr31 = bArr28;
                    try {
                        sHAKEDigest.doFinal(bArr31, 0, this.params.getMBytes());
                        try {
                            GF16.decode(bArr31, bArr15, m15);
                            long[] jArr7 = new long[i28 * i78];
                            bArr30 = bArr30;
                            try {
                                byte[] bArr32 = new byte[v15];
                                int i86 = 0;
                                while (true) {
                                    if (i86 > 255) {
                                        i15 = i79;
                                        bArr25 = bArr25;
                                        i16 = v15;
                                        bArr10 = bArr32;
                                        bArr28 = bArr31;
                                        bArr17 = bArr17;
                                        i17 = i29;
                                        bArr4 = bArr20;
                                        bArr5 = bArr21;
                                        i18 = i39;
                                        bArr11 = bArr24;
                                        bArr12 = bArr26;
                                        break;
                                    }
                                    try {
                                        bArr25[i85] = (byte) i86;
                                        int i87 = i78;
                                        int i88 = i48;
                                        int i89 = 0;
                                        sHAKEDigest.update(bArr25, 0, i88);
                                        i48 = i88;
                                        bArr28 = bArr31;
                                        bArr4 = bArr20;
                                        int i95 = i47;
                                        try {
                                            sHAKEDigest.doFinal(bArr4, 0, i95);
                                            i47 = i95;
                                            while (true) {
                                                i19 = i29;
                                                if (i89 >= i19) {
                                                    break;
                                                }
                                                i29 = i19;
                                                byte[] bArr33 = bArr25;
                                                int i96 = i85;
                                                byte[] bArr34 = bArr19;
                                                try {
                                                    GF16.decode(bArr4, i89 * vBytes, bArr34, i89 * v15, v15);
                                                    i89++;
                                                    bArr19 = bArr34;
                                                    bArr25 = bArr33;
                                                    i85 = i96;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    bArr3 = bArr34;
                                                    bArr8 = bArr15;
                                                    bArr25 = bArr33;
                                                    bArr17 = bArr17;
                                                    bArr5 = bArr21;
                                                    bArr6 = bArr22;
                                                    bArr7 = bArr24;
                                                    bArr9 = bArr28;
                                                    bArr2 = bArr30;
                                                    Arrays.fill(bArr9, (byte) 0);
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    Arrays.fill(bArr17, (byte) 0);
                                                    Arrays.fill(bArr2, (byte) 0);
                                                    Arrays.fill(bArr4, (byte) 0);
                                                    Arrays.fill(bArr3, (byte) 0);
                                                    Arrays.fill(bArr5, (byte) 0);
                                                    Arrays.fill(bArr6, (byte) 0);
                                                    Arrays.fill(bArr7, (byte) 0);
                                                    Arrays.fill(bArr23, (byte) 0);
                                                    Arrays.fill(bArr25, (byte) 0);
                                                    throw th;
                                                }
                                            }
                                            i15 = i79;
                                            bArr25 = bArr25;
                                            int i97 = i85;
                                            long[] jArr8 = jArr7;
                                            int i98 = i86;
                                            long[] jArr9 = jArr6;
                                            byte[] bArr35 = bArr19;
                                            i18 = i39;
                                            bArr12 = bArr26;
                                            long[] jArr10 = jArr3;
                                            bArr10 = bArr32;
                                            SHAKEDigest sHAKEDigest2 = sHAKEDigest;
                                            int i99 = i35;
                                            bArr11 = bArr24;
                                            try {
                                                GF16Utils.mulAddMatXMMat(i87, bArr35, jArr9, p1Limbs, jArr10, i19, v15, o15);
                                                int i100 = v15;
                                                try {
                                                    GF16Utils.mulAddMUpperTriangularMatXMatTrans(i87, jArr9, bArr35, jArr8, i100, i19);
                                                    bArr35 = bArr35;
                                                    long[] jArr11 = jArr4;
                                                    GF16Utils.mulAddMatXMMat(i87, bArr35, jArr8, jArr11, i19, i100);
                                                    i17 = i19;
                                                    i16 = i100;
                                                    bArr17 = bArr17;
                                                    try {
                                                        computeRHS(jArr11, bArr15, bArr17);
                                                        bArr5 = bArr21;
                                                        try {
                                                            computeA(jArr10, bArr5);
                                                            bArr19 = bArr35;
                                                            int i101 = i27;
                                                            try {
                                                                GF16.decode(bArr4, i101, bArr11, 0, i99);
                                                                byte[] bArr36 = bArr22;
                                                                try {
                                                                    if (sampleSolution(bArr5, bArr17, bArr11, bArr36)) {
                                                                        bArr22 = bArr36;
                                                                        break;
                                                                    }
                                                                    i27 = i101;
                                                                    bArr22 = bArr36;
                                                                    Arrays.fill(jArr10, 0L);
                                                                    Arrays.fill(jArr11, 0L);
                                                                    bArr17 = bArr17;
                                                                    bArr21 = bArr5;
                                                                    jArr4 = jArr11;
                                                                    i29 = i17;
                                                                    jArr3 = jArr10;
                                                                    i35 = i99;
                                                                    bArr24 = bArr11;
                                                                    bArr20 = bArr4;
                                                                    bArr32 = bArr10;
                                                                    sHAKEDigest = sHAKEDigest2;
                                                                    jArr6 = jArr9;
                                                                    i78 = i87;
                                                                    jArr7 = jArr8;
                                                                    bArr31 = bArr28;
                                                                    i85 = i97;
                                                                    i79 = i15;
                                                                    i39 = i18;
                                                                    bArr26 = bArr12;
                                                                    v15 = i16;
                                                                    i86 = i98 + 1;
                                                                    bArr25 = bArr25;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    bArr22 = bArr36;
                                                                    bArr8 = bArr15;
                                                                    bArr7 = bArr11;
                                                                    bArr3 = bArr19;
                                                                    bArr6 = bArr22;
                                                                    bArr23 = bArr23;
                                                                    bArr9 = bArr28;
                                                                    bArr2 = bArr30;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            bArr19 = bArr35;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        bArr19 = bArr35;
                                                        bArr5 = bArr21;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    bArr19 = bArr35;
                                                    bArr17 = bArr17;
                                                    bArr5 = bArr21;
                                                    bArr8 = bArr15;
                                                    bArr7 = bArr11;
                                                    bArr3 = bArr19;
                                                    bArr6 = bArr22;
                                                    bArr23 = bArr23;
                                                    bArr9 = bArr28;
                                                    bArr2 = bArr30;
                                                    bArr25 = bArr25;
                                                    Arrays.fill(bArr9, (byte) 0);
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    Arrays.fill(bArr17, (byte) 0);
                                                    Arrays.fill(bArr2, (byte) 0);
                                                    Arrays.fill(bArr4, (byte) 0);
                                                    Arrays.fill(bArr3, (byte) 0);
                                                    Arrays.fill(bArr5, (byte) 0);
                                                    Arrays.fill(bArr6, (byte) 0);
                                                    Arrays.fill(bArr7, (byte) 0);
                                                    Arrays.fill(bArr23, (byte) 0);
                                                    Arrays.fill(bArr25, (byte) 0);
                                                    throw th;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                bArr19 = bArr35;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            bArr5 = bArr21;
                                            bArr11 = bArr24;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        bArr28 = bArr31;
                                        bArr4 = bArr20;
                                    }
                                    bArr8 = bArr15;
                                    bArr7 = bArr11;
                                    bArr3 = bArr19;
                                    bArr6 = bArr22;
                                    bArr23 = bArr23;
                                    bArr9 = bArr28;
                                    bArr2 = bArr30;
                                    bArr25 = bArr25;
                                    Arrays.fill(bArr9, (byte) 0);
                                    Arrays.fill(bArr8, (byte) 0);
                                    Arrays.fill(bArr17, (byte) 0);
                                    Arrays.fill(bArr2, (byte) 0);
                                    Arrays.fill(bArr4, (byte) 0);
                                    Arrays.fill(bArr3, (byte) 0);
                                    Arrays.fill(bArr5, (byte) 0);
                                    Arrays.fill(bArr6, (byte) 0);
                                    Arrays.fill(bArr7, (byte) 0);
                                    Arrays.fill(bArr23, (byte) 0);
                                    Arrays.fill(bArr25, (byte) 0);
                                    throw th;
                                }
                                byte[] bArr37 = bArr15;
                                int i102 = 0;
                                int i103 = 0;
                                int i104 = 0;
                                int i105 = 0;
                                while (i104 < i17) {
                                    int i106 = i103;
                                    bArr7 = bArr11;
                                    byte[] bArr38 = bArr27;
                                    byte[] bArr39 = bArr10;
                                    bArr8 = bArr37;
                                    int i107 = i102;
                                    int i108 = i16;
                                    int i109 = o15;
                                    byte[] bArr40 = bArr22;
                                    bArr9 = bArr28;
                                    bArr2 = bArr30;
                                    try {
                                        GF16Utils.matMul(bArr38, bArr40, i105, bArr39, i109, i108);
                                        bArr13 = bArr7;
                                        int i110 = i104;
                                        int i111 = i17;
                                        int i112 = i105;
                                        bArr3 = bArr19;
                                        bArr6 = bArr22;
                                        bArr23 = bArr23;
                                        try {
                                            Bytes.xor(i108, bArr3, i107, bArr39, bArr23, i106);
                                            System.arraycopy(bArr6, i112, bArr23, i106 + i108, i109);
                                            int i113 = i112 + i109;
                                            bArr37 = bArr8;
                                            bArr30 = bArr2;
                                            bArr28 = bArr9;
                                            bArr22 = bArr6;
                                            i16 = i108;
                                            bArr19 = bArr3;
                                            bArr23 = bArr23;
                                            i102 = i107 + i108;
                                            i17 = i111;
                                            bArr11 = bArr13;
                                            o15 = i109;
                                            i104 = i110 + 1;
                                            bArr10 = bArr39;
                                            i105 = i113;
                                            i103 = i106 + n15;
                                            bArr27 = bArr38;
                                        } catch (Throwable th13) {
                                            th = th13;
                                            bArr7 = bArr13;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        bArr6 = bArr40;
                                        bArr3 = bArr19;
                                        bArr23 = bArr23;
                                    }
                                }
                                bArr13 = bArr11;
                                bArr3 = bArr19;
                                bArr6 = bArr22;
                                bArr23 = bArr23;
                                bArr8 = bArr37;
                                bArr9 = bArr28;
                                bArr2 = bArr30;
                                byte[] bArr41 = bArr12;
                                GF16.encode(bArr23, bArr41, i18);
                                System.arraycopy(bArr2, 0, bArr41, sigBytes - i15, i15);
                                byte[] bArrConcatenate = Arrays.concatenate(bArr41, bArr);
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr17, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr13, (byte) 0);
                                Arrays.fill(bArr23, (byte) 0);
                                Arrays.fill(bArr25, (byte) 0);
                                return bArrConcatenate;
                            } catch (Throwable th15) {
                                th = th15;
                                bArr25 = bArr25;
                                bArr8 = bArr15;
                                bArr9 = bArr31;
                                bArr17 = bArr17;
                                bArr3 = bArr19;
                                bArr4 = bArr20;
                                bArr5 = bArr21;
                                bArr6 = bArr22;
                                bArr23 = bArr23;
                                bArr7 = bArr24;
                                bArr2 = bArr30;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            bArr25 = bArr25;
                            bArr8 = bArr15;
                            bArr2 = bArr30;
                            bArr9 = bArr31;
                            bArr17 = bArr17;
                            bArr3 = bArr19;
                            bArr4 = bArr20;
                            bArr5 = bArr21;
                            bArr6 = bArr22;
                            bArr23 = bArr23;
                            bArr7 = bArr24;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        bArr25 = bArr25;
                        bArr2 = bArr30;
                        bArr9 = bArr31;
                        bArr17 = bArr17;
                        bArr3 = bArr19;
                        bArr4 = bArr20;
                        bArr5 = bArr21;
                        bArr6 = bArr22;
                        bArr23 = bArr23;
                        bArr7 = bArr24;
                        bArr8 = bArr15;
                    }
                } catch (Throwable th18) {
                    th = th18;
                    bArr2 = bArr30;
                    bArr17 = bArr17;
                    bArr3 = bArr19;
                    bArr4 = bArr20;
                    bArr5 = bArr21;
                    bArr6 = bArr22;
                    bArr23 = bArr23;
                    bArr7 = bArr24;
                    bArr8 = bArr15;
                    bArr9 = bArr28;
                }
            } catch (Throwable th19) {
                th = th19;
                bArr25 = bArr25;
                bArr17 = bArr17;
                bArr3 = bArr19;
                bArr4 = bArr20;
                bArr5 = bArr21;
                bArr6 = bArr22;
                bArr7 = bArr24;
                bArr8 = bArr15;
            }
        } catch (Throwable th20) {
            th = th20;
            bArr2 = bArr16;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z15, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (!z15) {
            MayoPublicKeyParameters mayoPublicKeyParameters = (MayoPublicKeyParameters) cipherParameters;
            this.pubKey = mayoPublicKeyParameters;
            this.params = mayoPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
            return;
        }
        this.pubKey = null;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (MayoPrivateKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.privKey = (MayoPrivateKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        this.params = this.privKey.getParameters();
    }

    boolean sampleSolution(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i15;
        boolean z15;
        int i16;
        int k15 = this.params.getK();
        int o15 = this.params.getO();
        int m15 = this.params.getM();
        int aCols = this.params.getACols();
        int i17 = k15 * o15;
        byte b15 = 0;
        System.arraycopy(bArr3, 0, bArr4, 0, i17);
        byte[] bArr5 = new byte[m15];
        int i18 = i17 + 1;
        byte[] bArr6 = bArr;
        GF16Utils.matMul(bArr6, bArr3, 0, bArr5, i18, m15);
        int i19 = i17;
        int i25 = 0;
        while (i25 < m15) {
            bArr6[i19] = (byte) (bArr2[i25] ^ bArr5[i25]);
            i25++;
            i19 += i18;
        }
        ef(bArr6, m15, aCols);
        int i26 = m15 - 1;
        int i27 = i26 * aCols;
        int i28 = i27;
        int i29 = 0;
        boolean z16 = false;
        while (true) {
            i15 = aCols - 1;
            z15 = true;
            if (i29 >= i15) {
                break;
            }
            if (bArr6[i28] == 0) {
                z15 = false;
            }
            z16 |= z15;
            i29++;
            i28++;
        }
        if (!z16) {
            return false;
        }
        while (i26 >= 0) {
            int iMin = Math.min((32 / (m15 - i26)) + i26, i17);
            int i35 = i26;
            byte b16 = b15;
            while (i35 <= iMin) {
                byte b17 = (byte) ((-(bArr6[i27 + i35] & 255)) >> 31);
                byte b18 = (byte) ((~b16) & b17 & bArr6[(i27 + aCols) - 1]);
                bArr4[i35] = (byte) (bArr4[i35] ^ b18);
                int i36 = i35;
                int i37 = i15;
                int i38 = 0;
                while (i38 < i26) {
                    boolean z17 = z15;
                    byte b19 = b17;
                    long j15 = 0;
                    int i39 = 0;
                    int i45 = 0;
                    while (true) {
                        if (i39 >= 8) {
                            break;
                        }
                        int i46 = i39;
                        j15 ^= ((long) (bArr[i36 + i45] & 255)) << (i46 << 3);
                        i39 = i46 + 1;
                        i45 += aCols;
                    }
                    long jMulFx8 = GF16Utils.mulFx8(b18, j15);
                    int i47 = 0;
                    int i48 = 0;
                    for (i16 = 8; i47 < i16; i16 = 8) {
                        int i49 = i37 + i48;
                        bArr[i49] = (byte) (bArr[i49] ^ ((byte) ((jMulFx8 >> (i47 << 3)) & 15)));
                        i47++;
                        i48 += aCols;
                        i26 = i26;
                    }
                    i38 += 8;
                    int i55 = aCols << 3;
                    i36 += i55;
                    i37 += i55;
                    z15 = z17;
                    b17 = b19;
                }
                b16 = (byte) (b16 | b17);
                i35++;
                bArr6 = bArr;
            }
            i26--;
            i27 -= aCols;
            bArr6 = bArr;
            b15 = 0;
        }
        return z15;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        int m15 = this.params.getM();
        int n15 = this.params.getN();
        int k15 = this.params.getK();
        int i15 = k15 * n15;
        int p1Limbs = this.params.getP1Limbs();
        int p2Limbs = this.params.getP2Limbs();
        int p3Limbs = this.params.getP3Limbs();
        int mBytes = this.params.getMBytes();
        int sigBytes = this.params.getSigBytes();
        int digestBytes = this.params.getDigestBytes();
        int saltBytes = this.params.getSaltBytes();
        int mVecLimbs = this.params.getMVecLimbs();
        byte[] bArr3 = new byte[mBytes];
        byte[] bArr4 = new byte[m15];
        byte[] bArr5 = new byte[m15 << 1];
        byte[] bArr6 = new byte[i15];
        int i16 = p1Limbs + p2Limbs;
        long[] jArr = new long[i16 + p3Limbs];
        byte[] bArr7 = new byte[digestBytes + saltBytes];
        byte[] encoded = this.pubKey.getEncoded();
        Utils.expandP1P2(this.params, jArr, encoded);
        Utils.unpackMVecs(encoded, this.params.getPkSeedBytes(), jArr, i16, p3Limbs / mVecLimbs, m15);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr2, sigBytes - saltBytes, saltBytes);
        sHAKEDigest.doFinal(bArr3, 0, mBytes);
        GF16.decode(bArr3, bArr4, m15);
        GF16.decode(bArr2, bArr6, i15);
        long[] jArr2 = new long[k15 * k15 * mVecLimbs];
        long[] jArr3 = new long[i15 * mVecLimbs];
        MayoParameters mayoParameters = this.params;
        mayoGenericMCalculatePS(mayoParameters, jArr, p1Limbs, i16, bArr6, mayoParameters.getV(), this.params.getO(), k15, jArr3);
        mayoGenericMCalculateSPS(jArr3, bArr6, mVecLimbs, k15, n15, jArr2);
        computeRHS(jArr2, new byte[m15], bArr5);
        return Arrays.constantTimeAreEqual(m15, bArr5, 0, bArr4, 0);
    }

    private static void vecMulAddU64(int i15, long[] jArr, byte b15, long[] jArr2, int i16) {
        int iMulTable = mulTable(b15 & 255);
        for (int i17 = 0; i17 < i15; i17++) {
            long j15 = jArr[i17];
            int i18 = i16 + i17;
            jArr2[i18] = ((((j15 >>> 3) & 1229782938247303441L) * ((long) ((iMulTable >>> 24) & 15))) ^ ((((j15 & 1229782938247303441L) * ((long) (iMulTable & GF2Field.MASK))) ^ (((j15 >>> 1) & 1229782938247303441L) * ((long) ((iMulTable >>> 8) & 15)))) ^ (((j15 >>> 2) & 1229782938247303441L) * ((long) ((iMulTable >>> 16) & 15))))) ^ jArr2[i18];
        }
    }
}
