package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;

    /* JADX INFO: renamed from: gf, reason: collision with root package name */
    private GF f149436gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i15, int i16, int i17, int[] iArr, boolean z15, int i18) {
        BENES benes13;
        this.usePivots = z15;
        this.SYS_N = i16;
        this.SYS_T = i17;
        this.GFBITS = i15;
        this.poly = iArr;
        this.defaultKeySize = i18;
        this.IRR_BYTES = i17 * 2;
        this.COND_BYTES = (1 << (i15 - 4)) * ((i15 * 2) - 1);
        int i19 = i17 * i15;
        this.PK_NROWS = i19;
        int i25 = i16 - i19;
        this.PK_NCOLS = i25;
        this.PK_ROW_BYTES = (i25 + 7) / 8;
        this.SYND_BYTES = (i19 + 7) / 8;
        this.GFMASK = (1 << i15) - 1;
        if (i15 == 12) {
            this.f149436gf = new GF12();
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.f149436gf = new GF13();
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private void bm(short[] sArr, short[] sArr2) {
        int i15;
        int i16 = this.SYS_T;
        short[] sArr3 = new short[i16 + 1];
        short[] sArr4 = new short[i16 + 1];
        short s15 = 1;
        short[] sArr5 = new short[i16 + 1];
        int i17 = 0;
        for (int i18 = 0; i18 < this.SYS_T + 1; i18++) {
            sArr5[i18] = 0;
            sArr4[i18] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s16 = 1;
        short s17 = 0;
        short s18 = 0;
        while (s17 < this.SYS_T * 2) {
            int iGf_mul_ext = 0;
            for (int i19 = 0; i19 <= min(s17, this.SYS_T); i19++) {
                iGf_mul_ext ^= this.f149436gf.gf_mul_ext(sArr4[i19], sArr2[s17 - i19]);
            }
            short sGf_reduce = this.f149436gf.gf_reduce(iGf_mul_ext);
            short s19 = (short) (((short) (((short) (((short) (sGf_reduce - 1)) >> 15)) & s15)) - s15);
            short s25 = (short) (((short) (((short) (((short) (((short) (s17 - (s18 * 2))) >> 15)) & s15)) - s15)) & s19);
            for (int i25 = 0; i25 <= this.SYS_T; i25++) {
                sArr3[i25] = sArr4[i25];
            }
            short sGf_frac = this.f149436gf.gf_frac(s16, sGf_reduce);
            int i26 = 0;
            while (true) {
                i15 = this.SYS_T;
                if (i26 > i15) {
                    break;
                }
                sArr4[i26] = (short) ((this.f149436gf.gf_mul(sGf_frac, sArr5[i26]) & s19) ^ sArr4[i26]);
                i26++;
            }
            int i27 = ~s25;
            int i28 = s17 + 1;
            s18 = (short) (((i28 - s18) & s25) | (s18 & i27));
            for (int i29 = i15 - 1; i29 >= 0; i29--) {
                sArr5[i29 + 1] = (short) ((sArr5[i29] & i27) | (sArr3[i29] & s25));
            }
            sArr5[0] = 0;
            s16 = (short) ((i27 & s16) | (sGf_reduce & s25));
            s17 = (short) i28;
            s15 = 1;
        }
        while (true) {
            int i35 = this.SYS_T;
            if (i17 > i35) {
                return;
            }
            sArr[i17] = sArr4[i35 - i17];
            i17++;
        }
    }

    static void cbrecursion(byte[] bArr, long j15, long j16, short[] sArr, int i15, long j17, long j18, int[] iArr) {
        long j19;
        int i16;
        int i17;
        int i18;
        char c15;
        long j25;
        long j26;
        long j27;
        long j28 = j18;
        long j29 = 1;
        long j35 = 7;
        char c16 = 3;
        if (j17 == 1) {
            int i19 = (int) (j15 >> 3);
            bArr[i19] = (byte) ((get_q_short(iArr, i15) << ((int) (j15 & 7))) ^ bArr[i19]);
            return;
        }
        if (sArr != null) {
            long j36 = 0;
            while (j36 < j28) {
                int i25 = (int) j36;
                long j37 = j29;
                iArr[i25] = sArr[(int) (j36 ^ j37)] | ((sArr[i25] ^ 1) << 16);
                j36 += j37;
                j29 = j37;
            }
            j19 = j29;
        } else {
            j19 = 1;
            long j38 = 0;
            while (j38 < j28) {
                long j39 = i15;
                iArr[(int) j38] = ((get_q_short(iArr, (int) (j39 + j38)) ^ 1) << 16) | get_q_short(iArr, (int) (j39 + (j38 ^ 1)));
                j38++;
                j35 = j35;
            }
        }
        long j45 = j35;
        int i26 = (int) j28;
        sort32(iArr, 0, i26);
        long j46 = 0;
        while (true) {
            i16 = 65535;
            if (j46 >= j28) {
                break;
            }
            int i27 = (int) j46;
            int i28 = 65535 & iArr[i27];
            if (j46 >= i28) {
                i27 = i28;
            }
            iArr[(int) (j28 + j46)] = i27 | (i28 << 16);
            j46 += j19;
        }
        for (long j47 = 0; j47 < j28; j47 += j19) {
            int i29 = (int) j47;
            iArr[i29] = (int) (((long) (iArr[i29] << 16)) | j47);
        }
        sort32(iArr, 0, i26);
        long j48 = 0;
        while (j48 < j28) {
            int i35 = (int) j48;
            iArr[i35] = (iArr[i35] << 16) + (iArr[(int) (j28 + j48)] >> 16);
            j48 += j19;
            c16 = c16;
        }
        char c17 = c16;
        sort32(iArr, 0, i26);
        if (j17 <= 10) {
            for (long j49 = 0; j49 < j28; j49 += j19) {
                int i36 = (int) (j28 + j49);
                iArr[i36] = ((iArr[(int) j49] & 65535) << 10) | (iArr[i36] & 1023);
            }
            long j55 = j19;
            while (j55 < j17 - j19) {
                long j56 = 0;
                while (j56 < j28) {
                    iArr[(int) j56] = (int) (((long) ((iArr[(int) (j28 + j56)] & (-1024)) << 6)) | j56);
                    j56 += j19;
                    j55 = j55;
                }
                long j57 = j55;
                sort32(iArr, 0, i26);
                for (long j58 = 0; j58 < j28; j58 += j19) {
                    int i37 = (int) j58;
                    iArr[i37] = (iArr[i37] << 20) | iArr[(int) (j28 + j58)];
                }
                sort32(iArr, 0, i26);
                for (long j59 = 0; j59 < j28; j59 += j19) {
                    int i38 = iArr[(int) j59];
                    int i39 = 1048575 & i38;
                    int i45 = (int) (j28 + j59);
                    int i46 = (i38 & 1047552) | (iArr[i45] & 1023);
                    if (i39 >= i46) {
                        i39 = i46;
                    }
                    iArr[i45] = i39;
                }
                j55 = j57 + j19;
            }
            for (long j65 = 0; j65 < j28; j65 += j19) {
                int i47 = (int) (j28 + j65);
                iArr[i47] = iArr[i47] & 1023;
            }
            i17 = 65535;
            i18 = -65536;
            c15 = c17;
            j25 = j19;
        } else {
            int i48 = -65536;
            for (long j66 = 0; j66 < j28; j66 += j19) {
                int i49 = (int) (j28 + j66);
                iArr[i49] = (iArr[(int) j66] << 16) | (iArr[i49] & 65535);
            }
            long j67 = j19;
            while (j67 < j17 - j19) {
                long j68 = 0;
                while (j68 < j28) {
                    int i55 = i48;
                    iArr[(int) j68] = (int) (((long) (iArr[(int) (j28 + j68)] & i55)) | j68);
                    j68 += j19;
                    i16 = i16;
                    i48 = i55;
                }
                int i56 = i16;
                int i57 = i48;
                sort32(iArr, 0, i26);
                long j69 = 0;
                while (j69 < j28) {
                    int i58 = (int) j69;
                    long j75 = j19;
                    iArr[i58] = (iArr[i58] << 16) | (iArr[(int) (j28 + j69)] & i56);
                    j69 += j75;
                    c17 = c17;
                    j19 = j75;
                }
                char c18 = c17;
                long j76 = j19;
                if (j67 < j17 - 2) {
                    for (long j77 = 0; j77 < j28; j77 += j76) {
                        int i59 = (int) (j28 + j77);
                        iArr[i59] = (iArr[(int) j77] & i57) | (iArr[i59] >> 16);
                    }
                    sort32(iArr, i26, (int) (j28 * 2));
                    for (long j78 = 0; j78 < j28; j78 += j76) {
                        int i65 = (int) (j28 + j78);
                        iArr[i65] = (iArr[i65] << 16) | (iArr[(int) j78] & i56);
                    }
                }
                sort32(iArr, 0, i26);
                for (long j79 = 0; j79 < j28; j79 += j76) {
                    int i66 = (int) (j28 + j79);
                    int i67 = iArr[i66];
                    int i68 = (i67 & i57) | (iArr[(int) j79] & i56);
                    if (i68 < i67) {
                        iArr[i66] = i68;
                    }
                }
                j67 += j76;
                i16 = i56;
                c17 = c18;
                i48 = i57;
                j19 = j76;
            }
            i17 = i16;
            i18 = i48;
            c15 = c17;
            j25 = j19;
            for (long j85 = 0; j85 < j28; j85 += j25) {
                int i69 = (int) (j28 + j85);
                iArr[i69] = iArr[i69] & i17;
            }
        }
        long j86 = 0;
        if (sArr != null) {
            while (j86 < j28) {
                int i75 = (int) j86;
                iArr[i75] = (int) (((long) (sArr[i75] << 16)) + j86);
                j86 += j25;
            }
        } else {
            while (j86 < j28) {
                iArr[(int) j86] = (int) (((long) (get_q_short(iArr, (int) (((long) i15) + j86)) << 16)) + j86);
                j86 += j25;
            }
        }
        sort32(iArr, 0, i26);
        long j87 = j15;
        int i76 = i17;
        long j88 = 0;
        while (true) {
            j26 = j28 / 2;
            if (j88 >= j26) {
                break;
            }
            long j89 = j88 * 2;
            long j95 = j28 + j89;
            int i77 = (int) j95;
            int i78 = i76;
            int i79 = iArr[i77] & 1;
            char c19 = c15;
            int i85 = (int) (((long) i79) + j89);
            long j96 = j87;
            int i86 = (int) (j96 >> c19);
            bArr[i86] = (byte) ((i79 << ((int) (j96 & j45))) ^ bArr[i86]);
            j87 = j96 + j16;
            iArr[i77] = (iArr[(int) j89] << 16) | i85;
            iArr[(int) (j95 + j25)] = (iArr[(int) (j89 + j25)] << 16) | (i85 ^ 1);
            j88 += j25;
            i76 = i78;
            j28 = j18;
            c15 = c19;
        }
        int i87 = i76;
        char c25 = c15;
        long j97 = j18 * 2;
        sort32(iArr, i26, (int) j97);
        long j98 = j17 * 2;
        long j99 = j87 + ((j98 - 3) * j16 * j26);
        long j100 = 0;
        while (true) {
            j27 = j97;
            if (j100 >= j26) {
                break;
            }
            long j101 = j100 * 2;
            long j102 = j98;
            long j103 = j18 + j101;
            int i88 = iArr[(int) j103];
            int i89 = i88 & 1;
            int i95 = (int) (((long) i89) + j101);
            int i96 = i95 ^ 1;
            int i97 = (int) (j99 >> c25);
            bArr[i97] = (byte) (bArr[i97] ^ (i89 << ((int) (j99 & j45))));
            j99 += j16;
            iArr[(int) j101] = (i88 & i87) | (i95 << 16);
            iArr[(int) (j101 + j25)] = (i96 << 16) | (iArr[(int) (j103 + j25)] & i87);
            j100 += j25;
            j97 = j27;
            j98 = j102;
        }
        sort32(iArr, 0, i26);
        long j104 = j99 - (((j98 - 2) * j16) * j26);
        short[] sArr2 = new short[i26 * 4];
        for (long j105 = 0; j105 < j27; j105 += j25) {
            long j106 = j105 * 2;
            int i98 = iArr[(int) j105];
            sArr2[(int) j106] = (short) i98;
            sArr2[(int) (j106 + j25)] = (short) ((i98 & i18) >> 16);
        }
        for (long j107 = 0; j107 < j26; j107 += j25) {
            long j108 = j107 * 2;
            sArr2[(int) j107] = (short) ((iArr[(int) j108] & i87) >>> 1);
            sArr2[(int) (j107 + j26)] = (short) ((iArr[(int) (j108 + j25)] & i87) >>> 1);
        }
        for (long j109 = 0; j109 < j26; j109 += j25) {
            long j110 = j109 * 2;
            iArr[(int) (j18 + (j18 / 4) + j109)] = sArr2[(int) j110] | (sArr2[(int) (j110 + j25)] << 16);
        }
        long j111 = j16 * 2;
        long j112 = j18 + (j18 / 4);
        long j113 = j17 - j25;
        cbrecursion(bArr, j104, j111, null, ((int) j112) * 2, j113, j26, iArr);
        cbrecursion(bArr, j104 + j16, j111, null, (int) ((j112 * 2) + j26), j113, j26, iArr);
    }

    private static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j15, long j16) {
        long j17 = j16;
        int[] iArr = new int[(int) (j17 * 2)];
        int i15 = (int) j17;
        short[] sArr2 = new short[i15];
        while (true) {
            short s15 = 0;
            for (int i16 = 0; i16 < (((((j15 * 2) - 1) * j17) / 2) + 7) / 8; i16++) {
                bArr[i16] = 0;
            }
            cbrecursion(bArr, 0L, 1L, sArr, 0, j15, j17, iArr);
            for (int i17 = 0; i17 < j16; i17++) {
                sArr2[i17] = (short) i17;
            }
            int i18 = 0;
            for (int i19 = 0; i19 < j15; i19++) {
                layer(sArr2, bArr, i18, i19, i15);
                i18 = (int) (((long) i18) + (j16 >> 4));
            }
            for (int i25 = (int) (j15 - 2); i25 >= 0; i25--) {
                layer(sArr2, bArr, i18, i25, i15);
                i18 = (int) (((long) i18) + (j16 >> 4));
            }
            int i26 = 0;
            while (i26 < j16) {
                short s16 = (short) (s15 | (sArr[i26] ^ sArr2[i26]));
                i26++;
                s15 = s16;
            }
            if (s15 == 0) {
                return;
            } else {
                j17 = j16;
            }
        }
    }

    private static int ctz(long j15) {
        long j16 = ~j15;
        long j17 = 72340172838076673L;
        long j18 = 0;
        for (int i15 = 0; i15 < 8; i15++) {
            j17 &= j16 >>> i15;
            j18 += j17;
        }
        long j19 = 578721382704613384L & j18;
        long j25 = j19 | (j19 >>> 1);
        long j26 = j25 | (j25 >>> 2);
        long j27 = j18 >>> 8;
        long j28 = j18 + (j27 & j26);
        for (int i16 = 2; i16 < 8; i16++) {
            j26 &= j26 >>> 8;
            j27 >>>= 8;
            j28 += j27 & j26;
        }
        return ((int) j28) & GF2Field.MASK;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i15;
        int i16;
        int i17 = this.SYS_T;
        short[] sArr = new short[i17 + 1];
        int i18 = this.SYS_N;
        short[] sArr2 = new short[i18];
        short[] sArr3 = new short[i17 * 2];
        short[] sArr4 = new short[i17 * 2];
        short[] sArr5 = new short[i17 + 1];
        short[] sArr6 = new short[i18];
        byte[] bArr4 = new byte[i18 / 8];
        int i19 = 0;
        while (true) {
            i15 = this.SYND_BYTES;
            if (i19 >= i15) {
                break;
            }
            bArr4[i19] = bArr3[i19];
            i19++;
        }
        while (i15 < this.SYS_N / 8) {
            bArr4[i15] = 0;
            i15++;
        }
        int i25 = 0;
        while (true) {
            i16 = this.SYS_T;
            if (i25 >= i16) {
                break;
            }
            sArr[i25] = Utils.load_gf(bArr2, (i25 * 2) + 40, this.GFMASK);
            i25++;
        }
        sArr[i16] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i26 = 0; i26 < this.SYS_N / 8; i26++) {
            bArr[i26] = 0;
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.SYS_N; i28++) {
            short sGf_iszero = (short) (this.f149436gf.gf_iszero(sArr6[i28]) & 1);
            int i29 = i28 / 8;
            bArr[i29] = (byte) (bArr[i29] | (sGf_iszero << (i28 % 8)));
            i27 += sGf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i35 = this.SYS_T ^ i27;
        for (int i36 = 0; i36 < this.SYS_T * 2; i36++) {
            i35 |= sArr3[i36] ^ sArr4[i36];
        }
        return (((i35 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s15) {
        int i15 = this.SYS_T;
        short sGf_mul = sArr[i15];
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            sGf_mul = (short) (this.f149436gf.gf_mul(sGf_mul, s15) ^ sArr[i16]);
        }
        return sGf_mul;
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i15;
        int i16 = this.SYS_T;
        short[] sArr = new short[i16 * 2];
        short[] sArr2 = new short[i16];
        byte[] bArr2 = new byte[i16];
        while (true) {
            if (this.countErrorIndices) {
                byte[] bArr3 = new byte[this.SYS_T * 4];
                secureRandom.nextBytes(bArr3);
                for (int i17 = 0; i17 < this.SYS_T * 2; i17++) {
                    sArr[i17] = Utils.load_gf(bArr3, i17 * 2, this.GFMASK);
                }
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    i15 = this.SYS_T;
                    if (i18 >= i15 * 2 || i19 >= i15) {
                        break;
                    }
                    short s15 = sArr[i18];
                    if (s15 < this.SYS_N) {
                        sArr2[i19] = s15;
                        i19++;
                    }
                    i18++;
                }
                if (i19 < i15) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[this.SYS_T * 2];
                secureRandom.nextBytes(bArr4);
                for (int i25 = 0; i25 < this.SYS_T; i25++) {
                    sArr2[i25] = Utils.load_gf(bArr4, i25 * 2, this.GFMASK);
                }
            }
            boolean z15 = false;
            for (int i26 = 1; i26 < this.SYS_T && !z15; i26++) {
                for (int i27 = 0; i27 < i26; i27++) {
                    if (sArr2[i26] == sArr2[i27]) {
                        z15 = true;
                        break;
                    }
                }
            }
            if (!z15) {
                break;
            }
        }
        for (int i28 = 0; i28 < this.SYS_T; i28++) {
            bArr2[i28] = (byte) (1 << (sArr2[i28] & 7));
        }
        for (short s16 = 0; s16 < this.SYS_N / 8; s16 = (short) (s16 + 1)) {
            bArr[s16] = 0;
            for (int i29 = 0; i29 < this.SYS_T; i29++) {
                bArr[s16] = (byte) ((((short) (same_mask32(s16, (short) (sArr2[i29] >> 3)) & 255)) & bArr2[i29]) | bArr[s16]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i15;
        int i16 = this.SYS_T;
        int i17 = 2;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i16 + 1, i16);
        sArr2[0][0] = 1;
        System.arraycopy(sArr, 0, sArr2[1], 0, this.SYS_T);
        int[] iArr = new int[(this.SYS_T * 2) - 1];
        while (true) {
            i15 = this.SYS_T;
            if (i17 >= i15) {
                break;
            }
            this.f149436gf.gf_sqr_poly(i15, this.poly, sArr2[i17], sArr2[i17 >>> 1], iArr);
            int[] iArr2 = iArr;
            this.f149436gf.gf_mul_poly(this.SYS_T, this.poly, sArr2[i17 + 1], sArr2[i17], sArr, iArr2);
            iArr = iArr2;
            i17 += 2;
        }
        if (i17 == i15) {
            this.f149436gf.gf_sqr_poly(i15, this.poly, sArr2[i17], sArr2[i17 >>> 1], iArr);
        }
        int i18 = 0;
        while (true) {
            int i19 = this.SYS_T;
            if (i18 >= i19) {
                System.arraycopy(sArr2[i19], 0, sArr, 0, i19);
                return 0;
            }
            int i25 = i18 + 1;
            for (int i26 = i25; i26 < this.SYS_T; i26++) {
                short sGf_iszero = this.f149436gf.gf_iszero(sArr2[i18][i18]);
                for (int i27 = i18; i27 < this.SYS_T + 1; i27++) {
                    short[] sArr3 = sArr2[i27];
                    sArr3[i18] = (short) (sArr3[i18] ^ ((short) (sArr3[i26] & sGf_iszero)));
                }
            }
            short s15 = sArr2[i18][i18];
            if (s15 == 0) {
                return -1;
            }
            short sGf_inv = this.f149436gf.gf_inv(s15);
            for (int i28 = i18; i28 < this.SYS_T + 1; i28++) {
                short[] sArr4 = sArr2[i28];
                sArr4[i18] = this.f149436gf.gf_mul(sArr4[i18], sGf_inv);
            }
            for (int i29 = 0; i29 < this.SYS_T; i29++) {
                if (i29 != i18) {
                    short s16 = sArr2[i18][i29];
                    for (int i35 = i18; i35 <= this.SYS_T; i35++) {
                        short[] sArr5 = sArr2[i35];
                        sArr5[i29] = (short) (sArr5[i29] ^ this.f149436gf.gf_mul(sArr5[i18], s16));
                    }
                }
            }
            i18 = i25;
        }
    }

    static short get_q_short(int[] iArr, int i15) {
        int i16 = i15 / 2;
        return (short) (i15 % 2 == 0 ? iArr[i16] : (iArr[i16] & (-65536)) >> 16);
    }

    private static void layer(short[] sArr, byte[] bArr, int i15, int i16, int i17) {
        int i18 = 1 << i16;
        int i19 = 0;
        for (int i25 = 0; i25 < i17; i25 += i18 * 2) {
            for (int i26 = 0; i26 < i18; i26++) {
                int i27 = i25 + i26;
                short s15 = sArr[i27];
                int i28 = i27 + i18;
                int i29 = (sArr[i28] ^ s15) & (-((bArr[(i19 >> 3) + i15] >> (i19 & 7)) & 1));
                sArr[i27] = (short) (s15 ^ i29);
                sArr[i28] = (short) (sArr[i28] ^ i29);
                i19++;
            }
        }
    }

    private static int min(short s15, int i15) {
        return s15 < i15 ? s15 : i15;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        long jLoad8;
        int i15 = 64;
        long[] jArr2 = new long[64];
        int i16 = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i17 = this.PK_NROWS - 32;
        int i18 = i17 / 8;
        int i19 = i17 % 8;
        char c15 = 0;
        if (this.usePadding) {
            for (int i25 = 0; i25 < 32; i25++) {
                for (int i26 = 0; i26 < 9; i26++) {
                    bArr2[i26] = bArr[i17 + i25][i18 + i26];
                }
                int i27 = 0;
                while (i27 < 8) {
                    int i28 = i27 + 1;
                    bArr2[i27] = (byte) (((bArr2[i27] & 255) >> i19) | (bArr2[i28] << (8 - i19)));
                    i27 = i28;
                }
                jArr2[i25] = Utils.load8(bArr2, 0);
            }
        } else {
            for (int i29 = 0; i29 < 32; i29++) {
                jArr2[i29] = Utils.load8(bArr[i17 + i29], i18);
            }
        }
        long j15 = 0;
        jArr[0] = 0;
        int i35 = 0;
        while (true) {
            long j16 = 1;
            if (i35 >= 32) {
                int i36 = 0;
                while (i36 < i16) {
                    int i37 = i36 + 1;
                    int i38 = i37;
                    while (i38 < i15) {
                        int i39 = i17 + i36;
                        int i45 = i17 + i38;
                        long[] jArr4 = jArr3;
                        long jSame_mask64 = ((long) (sArr[i39] ^ sArr[i45])) & same_mask64((short) i38, (short) jArr4[i36]);
                        sArr[i39] = (short) (((long) sArr[i39]) ^ jSame_mask64);
                        sArr[i45] = (short) (jSame_mask64 ^ ((long) sArr[i45]));
                        i38++;
                        i37 = i37;
                        jArr3 = jArr4;
                        i15 = 64;
                        i16 = 32;
                    }
                    i36 = i37;
                }
                long[] jArr5 = jArr3;
                for (int i46 = 0; i46 < this.PK_NROWS; i46++) {
                    if (this.usePadding) {
                        for (int i47 = 0; i47 < 9; i47++) {
                            bArr2[i47] = bArr[i46][i18 + i47];
                        }
                        int i48 = 0;
                        while (i48 < 8) {
                            int i49 = i48 + 1;
                            bArr2[i48] = (byte) (((bArr2[i48] & 255) >> i19) | (bArr2[i49] << (8 - i19)));
                            i48 = i49;
                        }
                        jLoad8 = Utils.load8(bArr2, 0);
                    } else {
                        jLoad8 = Utils.load8(bArr[i46], i18);
                    }
                    for (int i55 = 0; i55 < 32; i55++) {
                        long j17 = jArr5[i55];
                        long j18 = ((jLoad8 >> i55) ^ (jLoad8 >> ((int) j17))) & 1;
                        jLoad8 = (jLoad8 ^ (j18 << ((int) j17))) ^ (j18 << i55);
                    }
                    if (this.usePadding) {
                        Utils.store8(bArr2, 0, jLoad8);
                        byte[] bArr3 = bArr[i46];
                        int i56 = i18 + 8;
                        int i57 = 8 - i19;
                        bArr3[i56] = (byte) ((((bArr3[i56] & 255) >>> i19) << i19) | ((bArr2[7] & 255) >>> i57));
                        bArr3[i18] = (byte) (((bArr2[0] & 255) << i19) | (((bArr3[i18] & 255) << i57) >>> i57));
                        for (int i58 = 7; i58 >= 1; i58--) {
                            bArr[i46][i18 + i58] = (byte) (((bArr2[i58] & 255) << i19) | ((bArr2[i58 - 1] & 255) >>> i57));
                        }
                    } else {
                        Utils.store8(bArr[i46], i18, jLoad8);
                    }
                }
                return 0;
            }
            long j19 = jArr2[i35];
            int i59 = i35 + 1;
            long j25 = j15;
            for (int i65 = i59; i65 < 32; i65++) {
                j19 |= jArr2[i65];
            }
            if (j19 == j25) {
                return -1;
            }
            int iCtz = ctz(j19);
            char c16 = c15;
            long j26 = iCtz;
            jArr3[i35] = j26;
            jArr[c16] = jArr[c16] | (1 << ((int) j26));
            for (int i66 = i59; i66 < 32; i66++) {
                long j27 = jArr2[i35];
                jArr2[i35] = j27 ^ (jArr2[i66] & (((j27 >> iCtz) & 1) - 1));
            }
            int i67 = i59;
            while (i67 < 32) {
                long j28 = jArr2[i67];
                long j29 = j16;
                jArr2[i67] = j28 ^ (jArr2[i35] & (-((j28 >> iCtz) & j29)));
                i67++;
                j16 = j29;
                c16 = 0;
            }
            c15 = c16;
            i35 = i59;
            j15 = j25;
        }
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i15;
        int i16;
        int i17 = this.SYS_T;
        short[] sArr2 = new short[i17 + 1];
        byte b15 = 1;
        sArr2[i17] = 1;
        for (int i18 = 0; i18 < this.SYS_T; i18++) {
            sArr2[i18] = Utils.load_gf(bArr2, (i18 * 2) + 40, this.GFMASK);
        }
        int i19 = 1 << this.GFBITS;
        long[] jArr2 = new long[i19];
        for (int i25 = 0; i25 < (1 << this.GFBITS); i25++) {
            long j15 = iArr[i25];
            jArr2[i25] = j15;
            long j16 = j15 << 31;
            jArr2[i25] = j16;
            long j17 = j16 | ((long) i25);
            jArr2[i25] = j17;
            jArr2[i25] = j17 & Long.MAX_VALUE;
        }
        sort64(jArr2, 0, i19);
        for (int i26 = 1; i26 < (1 << this.GFBITS); i26++) {
            if ((jArr2[i26 - 1] >> 31) == (jArr2[i26] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i27 = 0; i27 < (1 << this.GFBITS); i27++) {
            sArr[i27] = (short) (jArr2[i27] & ((long) this.GFMASK));
        }
        int i28 = 0;
        while (true) {
            i15 = this.SYS_N;
            if (i28 >= i15) {
                break;
            }
            sArr3[i28] = Utils.bitrev(sArr[i28], this.GFBITS);
            i28++;
        }
        short[] sArr4 = new short[i15];
        root(sArr4, sArr2, sArr3);
        int i29 = 0;
        while (true) {
            i16 = this.SYS_N;
            if (i29 >= i16) {
                break;
            }
            sArr4[i29] = this.f149436gf.gf_inv(sArr4[i29]);
            i29++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i16 / 8);
        for (int i35 = 0; i35 < this.PK_NROWS; i35++) {
            for (int i36 = 0; i36 < this.SYS_N / 8; i36++) {
                bArr3[i35][i36] = 0;
            }
        }
        int i37 = 0;
        while (i37 < this.SYS_T) {
            for (int i38 = 0; i38 < this.SYS_N; i38 += 8) {
                int i39 = 0;
                while (true) {
                    int i45 = this.GFBITS;
                    if (i39 < i45) {
                        bArr3[(i45 * i37) + i39][i38 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i38 + 7] >>> i39) & 1)) << 1)) | ((sArr4[i38 + 6] >>> i39) & 1))) << 1)) | ((sArr4[i38 + 5] >>> i39) & 1))) << 1)) | ((sArr4[i38 + 4] >>> i39) & 1))) << 1)) | ((sArr4[i38 + 3] >>> i39) & 1))) << 1)) | ((sArr4[i38 + 2] >>> i39) & 1))) << 1)) | ((sArr4[i38 + 1] >>> i39) & 1))) << 1)) | ((sArr4[i38] >>> i39) & 1));
                        i39++;
                    }
                }
            }
            for (int i46 = 0; i46 < this.SYS_N; i46++) {
                sArr4[i46] = this.f149436gf.gf_mul(sArr4[i46], sArr3[i46]);
            }
            i37++;
        }
        int i47 = 0;
        while (true) {
            int i48 = this.PK_NROWS;
            if (i47 >= i48) {
                if (bArr != null) {
                    if (!this.usePadding) {
                        int i49 = ((this.SYS_N - i48) + 7) / 8;
                        int i55 = 0;
                        while (true) {
                            int i56 = this.PK_NROWS;
                            if (i55 >= i56) {
                                break;
                            }
                            System.arraycopy(bArr3[i55], i56 / 8, bArr, i49 * i55, i49);
                            i55++;
                        }
                    } else {
                        int i57 = i48 % 8;
                        if (i57 != 0) {
                            int i58 = 0;
                            int i59 = 0;
                            while (true) {
                                int i65 = this.PK_NROWS;
                                if (i58 >= i65) {
                                    break;
                                }
                                int i66 = (i65 - 1) / 8;
                                while (i66 < (this.SYS_N / 8) - 1) {
                                    byte[] bArr4 = bArr3[i58];
                                    int i67 = (bArr4[i66] & 255) >>> i57;
                                    i66++;
                                    bArr[i59] = (byte) ((bArr4[i66] << (8 - i57)) | i67);
                                    i59++;
                                }
                                bArr[i59] = (byte) ((bArr3[i58][i66] & 255) >>> i57);
                                i58++;
                                i59++;
                            }
                        } else {
                            System.arraycopy(bArr3[i37], (i48 - 1) / 8, bArr, 0, this.SYS_N / 8);
                        }
                    }
                }
                return 0;
            }
            i37 = i47 >>> 3;
            int i68 = i47 & 7;
            if (this.usePivots && i47 == i48 - 32) {
                if (mov_columns(bArr3, sArr, jArr) != 0) {
                    return -1;
                }
            }
            int i69 = i47 + 1;
            for (int i75 = i69; i75 < this.PK_NROWS; i75++) {
                byte b16 = (byte) (-((byte) (((byte) (((byte) (bArr3[i47][i37] ^ bArr3[i75][i37])) >> i68)) & b15)));
                int i76 = 0;
                while (i76 < this.SYS_N / 8) {
                    byte[] bArr5 = bArr3[i47];
                    bArr5[i76] = (byte) (bArr5[i76] ^ (bArr3[i75][i76] & b16));
                    i76++;
                    b15 = b15;
                }
            }
            byte b17 = b15;
            if (((bArr3[i47][i37] >> i68) & 1) == 0) {
                return -1;
            }
            for (int i77 = 0; i77 < this.PK_NROWS; i77++) {
                if (i77 != i47) {
                    byte b18 = (byte) (-((byte) (((byte) (bArr3[i77][i37] >> i68)) & 1)));
                    for (int i78 = 0; i78 < this.SYS_N / 8; i78++) {
                        byte[] bArr6 = bArr3[i77];
                        bArr6[i78] = (byte) (bArr6[i78] ^ (bArr3[i47][i78] & b18));
                    }
                }
            }
            i47 = i69;
            b15 = b17;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i15 = 0; i15 < this.SYS_N; i15++) {
            sArr[i15] = eval(sArr2, sArr3[i15]);
        }
    }

    private static byte same_mask32(short s15, short s16) {
        return (byte) ((-(((s15 ^ s16) - 1) >>> 31)) & GF2Field.MASK);
    }

    private static long same_mask64(short s15, short s16) {
        return -((((long) (s15 ^ s16)) - 1) >>> 63);
    }

    private static void sort32(int[] iArr, int i15, int i16) {
        int i17 = i16 - i15;
        if (i17 < 2) {
            return;
        }
        int i18 = 1;
        while (i18 < i17 - i18) {
            i18 += i18;
        }
        for (int i19 = i18; i19 > 0; i19 >>>= 1) {
            int i25 = 0;
            for (int i26 = 0; i26 < i17 - i19; i26++) {
                if ((i26 & i19) == 0) {
                    int i27 = i15 + i26;
                    int i28 = i27 + i19;
                    int i29 = iArr[i28];
                    int i35 = iArr[i27];
                    int i36 = i29 ^ i35;
                    int i37 = i29 - i35;
                    int i38 = ((((i29 ^ i37) & i36) ^ i37) >> 31) & i36;
                    iArr[i27] = i35 ^ i38;
                    iArr[i28] = iArr[i28] ^ i38;
                }
            }
            for (int i39 = i18; i39 > i19; i39 >>>= 1) {
                while (i25 < i17 - i39) {
                    if ((i25 & i19) == 0) {
                        int i45 = i15 + i25;
                        int i46 = i45 + i19;
                        int i47 = iArr[i46];
                        for (int i48 = i39; i48 > i19; i48 >>>= 1) {
                            int i49 = i45 + i48;
                            int i55 = iArr[i49];
                            int i56 = i55 ^ i47;
                            int i57 = i55 - i47;
                            int i58 = i56 & ((i57 ^ ((i57 ^ i55) & i56)) >> 31);
                            i47 ^= i58;
                            iArr[i49] = i55 ^ i58;
                        }
                        iArr[i46] = i47;
                    }
                    i25++;
                }
            }
        }
    }

    private static void sort64(long[] jArr, int i15, int i16) {
        int i17 = i16 - i15;
        if (i17 < 2) {
            return;
        }
        int i18 = 1;
        while (i18 < i17 - i18) {
            i18 += i18;
        }
        for (int i19 = i18; i19 > 0; i19 >>>= 1) {
            int i25 = 0;
            for (int i26 = 0; i26 < i17 - i19; i26++) {
                if ((i26 & i19) == 0) {
                    int i27 = i15 + i26;
                    int i28 = i27 + i19;
                    long j15 = jArr[i28];
                    long j16 = jArr[i27];
                    long j17 = (j15 ^ j16) & (-((j15 - j16) >>> 63));
                    jArr[i27] = j16 ^ j17;
                    jArr[i28] = jArr[i28] ^ j17;
                }
            }
            for (int i29 = i18; i29 > i19; i29 >>>= 1) {
                while (i25 < i17 - i29) {
                    if ((i25 & i19) == 0) {
                        int i35 = i15 + i25;
                        int i36 = i35 + i19;
                        long j18 = jArr[i36];
                        for (int i37 = i29; i37 > i19; i37 >>>= 1) {
                            int i38 = i35 + i37;
                            long j19 = jArr[i38];
                            long j25 = (-((j19 - j18) >>> 63)) & (j18 ^ j19);
                            j18 ^= j25;
                            jArr[i38] = j19 ^ j25;
                        }
                        jArr[i36] = j18;
                    }
                    i25++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        short s15 = (short) (bArr[0] & 1);
        short s16 = sArr3[0];
        short sEval = eval(sArr2, s16);
        GF gf4 = this.f149436gf;
        short sGf_inv = (short) ((-s15) & gf4.gf_inv(gf4.gf_sq(sEval)));
        sArr[0] = sGf_inv;
        for (int i15 = 1; i15 < this.SYS_T * 2; i15++) {
            sGf_inv = this.f149436gf.gf_mul(sGf_inv, s16);
            sArr[i15] = sGf_inv;
        }
        for (int i16 = 1; i16 < this.SYS_N; i16++) {
            short s17 = (short) ((bArr[i16 / 8] >> (i16 % 8)) & 1);
            short s18 = sArr3[i16];
            short sEval2 = eval(sArr2, s18);
            GF gf5 = this.f149436gf;
            short sGf_mul = this.f149436gf.gf_mul(gf5.gf_inv(gf5.gf_sq(sEval2)), s17);
            sArr[0] = (short) (sArr[0] ^ sGf_mul);
            for (int i17 = 1; i17 < this.SYS_T * 2; i17++) {
                sGf_mul = this.f149436gf.gf_mul(sGf_mul, s18);
                sArr[i17] = (short) (sArr[i17] ^ sGf_mul);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i15 = this.PK_NROWS % 8;
        for (int i16 = 0; i16 < this.SYND_BYTES; i16++) {
            bArr[i16] = 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.PK_NROWS; i18++) {
            for (int i19 = 0; i19 < this.SYS_N / 8; i19++) {
                sArr[i19] = 0;
            }
            int i25 = 0;
            while (true) {
                int i26 = this.PK_ROW_BYTES;
                if (i25 >= i26) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i26) + i25] = bArr2[i17 + i25];
                i25++;
            }
            if (this.usePadding) {
                for (int i27 = (this.SYS_N / 8) - 1; i27 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i27--) {
                    sArr[i27] = (short) ((((sArr[i27] & 255) << i15) | ((sArr[i27 - 1] & 255) >>> (8 - i15))) & GF2Field.MASK);
                }
            }
            int i28 = i18 / 8;
            int i29 = i18 % 8;
            sArr[i28] = (short) (sArr[i28] | (1 << i29));
            byte b15 = 0;
            for (int i35 = 0; i35 < this.SYS_N / 8; i35++) {
                b15 = (byte) (b15 ^ (sArr[i35] & bArr3[i35]));
            }
            byte b16 = (byte) ((b15 >>> 4) ^ b15);
            byte b17 = (byte) (b16 ^ (b16 >>> 2));
            bArr[i28] = (byte) ((((byte) (1 & ((byte) (b17 ^ (b17 >>> 1))))) << i29) | bArr[i28]);
            i17 += this.PK_ROW_BYTES;
        }
    }

    int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & 255) >>> (this.PK_NROWS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    int check_pk_padding(byte[] bArr) {
        byte b15 = 0;
        for (int i15 = 0; i15 < this.PK_NROWS; i15++) {
            int i16 = this.PK_ROW_BYTES;
            b15 = (byte) (b15 | bArr[((i15 * i16) + i16) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b15 & 255) >>> (this.PK_NCOLS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i15;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i16 = (this.SYS_N / 8) + ((1 << this.GFBITS) * 4) + this.IRR_BYTES;
        int i17 = i16 + 32;
        byte[] bArr3 = new byte[i17];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i17);
        if (bArr.length <= 40) {
            short[] sArr = new short[this.SYS_T];
            int i18 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i18];
            int i19 = i16 - i18;
            for (int i25 = 0; i25 < this.SYS_T; i25++) {
                sArr[i25] = Utils.load_gf(bArr3, (i25 * 2) + i19, this.GFMASK);
            }
            generate_irr_poly(sArr);
            for (int i26 = 0; i26 < this.SYS_T; i26++) {
                Utils.store_gf(bArr4, i26 * 2, sArr[i26]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i27 = this.IRR_BYTES;
        if (length <= i27 + 40) {
            int i28 = this.GFBITS;
            int[] iArr = new int[1 << i28];
            short[] sArr2 = new short[1 << i28];
            int i29 = (i16 - i27) - ((1 << i28) * 4);
            int i35 = 0;
            while (true) {
                i15 = this.GFBITS;
                if (i35 >= (1 << i15)) {
                    break;
                }
                iArr[i35] = Utils.load4(bArr3, (i35 * 4) + i29);
                i35++;
            }
            if (this.usePivots) {
                pk_gen(null, bArr2, iArr, sArr2, new long[]{0});
            } else {
                int i36 = 1 << i15;
                long[] jArr = new long[i36];
                for (int i37 = 0; i37 < (1 << this.GFBITS); i37++) {
                    long j15 = iArr[i37];
                    jArr[i37] = j15;
                    long j16 = j15 << 31;
                    jArr[i37] = j16;
                    long j17 = j16 | ((long) i37);
                    jArr[i37] = j17;
                    jArr[i37] = j17 & Long.MAX_VALUE;
                }
                sort64(jArr, 0, i36);
                for (int i38 = 0; i38 < (1 << this.GFBITS); i38++) {
                    sArr2[i38] = (short) (jArr[i38] & ((long) this.GFMASK));
                }
            }
            int i39 = this.COND_BYTES;
            byte[] bArr5 = new byte[i39];
            int i45 = this.GFBITS;
            controlbitsfrompermutation(bArr5, sArr2, i45, 1 << i45);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i39);
        }
        int privateKeySize = getPrivateKeySize();
        int i46 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i46 / 8), i46 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i15 = this.GFBITS;
        short[] sArr = new short[1 << i15];
        long[] jArr = {0};
        int[] iArr = new int[1 << i15];
        int i16 = (this.SYS_N / 8) + ((1 << i15) * 4);
        byte[] bArr3 = new byte[i16];
        int i17 = ((i16 - 32) - this.IRR_BYTES) - ((1 << i15) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i16);
        for (int i18 = 0; i18 < (1 << this.GFBITS); i18++) {
            iArr[i18] = Utils.load4(bArr3, (i18 * 4) + i17);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return this.COND_BYTES + this.IRR_BYTES + (this.SYS_N / 8) + 40;
    }

    public int getPublicKeySize() {
        if (!this.usePadding) {
            return (this.PK_NROWS * this.PK_NCOLS) / 8;
        }
        int i15 = this.PK_NROWS;
        return i15 * ((this.SYS_N / 8) - ((i15 - 1) / 8));
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i15 = this.SYS_N;
        byte[] bArr4 = new byte[i15 / 8];
        int i16 = (i15 / 8) + 1 + this.SYND_BYTES;
        byte[] bArr5 = new byte[i16];
        int iCheck_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        short sDecrypt = (short) (((short) (((short) (((byte) decrypt(bArr4, bArr3, bArr2)) - 1)) >> 8)) & 255);
        bArr5[0] = (byte) (sDecrypt & 1);
        int i17 = 0;
        while (i17 < this.SYS_N / 8) {
            int i18 = i17 + 1;
            bArr5[i18] = (byte) ((bArr4[i17] & sDecrypt) | ((~sDecrypt) & bArr3[i17 + 40 + this.IRR_BYTES + this.COND_BYTES]));
            i17 = i18;
        }
        for (int i19 = 0; i19 < this.SYND_BYTES; i19++) {
            bArr5[(this.SYS_N / 8) + 1 + i19] = bArr2[i19];
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, i16);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b15 = (byte) iCheck_c_padding;
        for (int i25 = 0; i25 < bArr.length; i25++) {
            bArr[i25] = (byte) (bArr[i25] | b15);
        }
        return iCheck_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i15 = this.SYS_N / 8;
        byte[] bArr4 = new byte[i15];
        int iCheck_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i15);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b15 = (byte) (((byte) iCheck_pk_padding) ^ 255);
        for (int i16 = 0; i16 < this.SYND_BYTES; i16++) {
            bArr[i16] = (byte) (bArr[i16] & b15);
        }
        for (int i17 = 0; i17 < 32; i17++) {
            bArr2[i17] = (byte) (bArr2[i17] & b15);
        }
        return iCheck_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i15;
        int i16;
        int i17;
        short[] sArr;
        int i18;
        long j15;
        int i19 = 32;
        byte[] bArr3 = new byte[32];
        int i25 = 1;
        int i26 = 0;
        byte[] bArr4 = {64};
        secureRandom.nextBytes(bArr3);
        int i27 = (this.SYS_N / 8) + ((1 << this.GFBITS) * 4) + (this.SYS_T * 2);
        int i28 = i27 + 32;
        byte[] bArr5 = new byte[i28];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = bArr3;
        while (true) {
            sHAKEDigest.update(bArr4, i26, i25);
            sHAKEDigest.update(bArr3, i26, bArr3.length);
            sHAKEDigest.doFinal(bArr5, i26, i28);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, i27, i27 + 32);
            System.arraycopy(bArr6, i26, bArr2, i26, i19);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, i26, i19);
            int i29 = this.SYS_T;
            short[] sArr2 = new short[i29];
            int i35 = i27 - (i29 * 2);
            i15 = i25;
            for (int i36 = i26; i36 < this.SYS_T; i36++) {
                sArr2[i36] = Utils.load_gf(bArr5, (i36 * 2) + i35, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i37 = i26; i37 < this.SYS_T; i37++) {
                    Utils.store_gf(bArr2, 40 + (i37 * 2), sArr2[i37]);
                }
                int i38 = this.GFBITS;
                int[] iArr = new int[i15 << i38];
                i16 = i35 - ((i15 << i38) * 4);
                int i39 = 0;
                while (true) {
                    i17 = this.GFBITS;
                    if (i39 >= (i15 << i17)) {
                        break;
                    }
                    iArr[i39] = Utils.load4(bArr5, (i39 * 4) + i16);
                    i39++;
                }
                sArr = new short[i15 << i17];
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            }
            bArr3 = bArrCopyOfRange;
            bArr6 = bArrCopyOfRange2;
            i25 = i15;
            i19 = 32;
            i26 = 0;
        }
        int i45 = this.COND_BYTES;
        byte[] bArr7 = new byte[i45];
        int i46 = this.GFBITS;
        controlbitsfrompermutation(bArr7, sArr, i46, i15 << i46);
        System.arraycopy(bArr7, 0, bArr2, this.IRR_BYTES + 40, i45);
        int i47 = this.SYS_N;
        System.arraycopy(bArr5, i16 - (i47 / 8), bArr2, bArr2.length - (i47 / 8), i47 / 8);
        if (this.usePivots) {
            i18 = 32;
            j15 = jArr[0];
        } else {
            j15 = BodyPartID.bodyIdMax;
            i18 = 32;
        }
        Utils.store8(bArr2, i18, j15);
    }
}
