package org.bouncycastle.pqc.crypto.frodo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class FrodoEngine {
    private static final int len_chi = 16;
    private static final int len_chi_bytes = 2;
    private static final int len_seedA = 128;
    private static final int len_seedA_bytes = 16;
    private static final int len_z = 128;
    private static final int len_z_bytes = 16;
    private static final int mbar = 8;
    static final int nbar = 8;
    private final int B;
    private final int D;
    private final short[] T_chi;
    private final Xof digest;
    private final FrodoMatrixGenerator gen;
    private final int len_ct_bytes;
    private final int len_k;
    private final int len_k_bytes;
    private final int len_mu;
    private final int len_mu_bytes;
    private final int len_pk_bytes;
    private final int len_pkh;
    private final int len_pkh_bytes;
    private final int len_s;
    private final int len_s_bytes;
    private final int len_seedSE;
    private final int len_seedSE_bytes;
    private final int len_sk_bytes;
    private final int len_ss;
    private final int len_ss_bytes;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f149458n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f149459q;

    public FrodoEngine(int i15, int i16, int i17, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.f149458n = i15;
        this.D = i16;
        this.f149459q = 1 << i16;
        this.B = i17;
        int i18 = i17 * 64;
        this.len_mu = i18;
        this.len_seedSE = i18;
        this.len_s = i18;
        this.len_k = i18;
        this.len_pkh = i18;
        this.len_ss = i18;
        this.len_mu_bytes = i18 / 8;
        this.len_seedSE_bytes = i18 / 8;
        int i19 = i18 / 8;
        this.len_s_bytes = i19;
        this.len_k_bytes = i18 / 8;
        int i25 = i18 / 8;
        this.len_pkh_bytes = i25;
        this.len_ss_bytes = i18 / 8;
        int i26 = ((i16 * i15) * 8) / 8;
        this.len_ct_bytes = ((i16 * 64) / 8) + i26;
        int i27 = i26 + 16;
        this.len_pk_bytes = i27;
        this.len_sk_bytes = i19 + i27 + (i15 * 16) + i25;
        this.T_chi = sArr;
        this.digest = xof;
        this.gen = frodoMatrixGenerator;
    }

    private byte[] ctselect(byte[] bArr, byte[] bArr2, short s15) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr3[i15] = (byte) (((~s15) & bArr[i15] & GF2Field.MASK) | (bArr2[i15] & s15 & GF2Field.MASK));
        }
        return bArr3;
    }

    private short ctverify(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        short s15 = 0;
        for (short s16 = 0; s16 < sArr.length; s16 = (short) (s16 + 1)) {
            s15 = (short) (s15 | (sArr[s16] ^ sArr3[s16]));
        }
        for (short s17 = 0; s17 < sArr2.length; s17 = (short) (s17 + 1)) {
            s15 = (short) ((sArr2[s17] ^ sArr4[s17]) | s15);
        }
        return s15 == 0 ? (short) 0 : (short) -1;
    }

    private byte[] decode(short[] sArr) {
        int i15 = this.B;
        short s15 = (short) ((1 << i15) - 1);
        short s16 = (short) ((1 << this.D) - 1);
        byte[] bArr = new byte[i15 * 8];
        int i16 = 0;
        for (int i17 = 0; i17 < 8; i17++) {
            long j15 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = sArr[i16] & s16;
                int i25 = this.D;
                int i26 = this.B;
                j15 |= ((long) (((short) ((i19 + (1 << ((i25 - i26) - 1))) >> (i25 - i26))) & s15)) << (i26 * i18);
                i16++;
            }
            int i27 = 0;
            while (true) {
                int i28 = this.B;
                if (i27 < i28) {
                    bArr[(i28 * i17) + i27] = (byte) ((j15 >> (i27 * 8)) & 255);
                    i27++;
                }
            }
        }
        return bArr;
    }

    private short[] encode(byte[] bArr) {
        int i15;
        short[] sArr = new short[64];
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < 8; i18++) {
            for (int i19 = 0; i19 < 8; i19++) {
                int i25 = 0;
                int i26 = 0;
                while (true) {
                    i15 = this.B;
                    if (i25 < i15) {
                        i26 += ((bArr[i16] >>> i17) & 1) << i25;
                        int i27 = i17 + 1;
                        i16 += i27 >>> 3;
                        i17 = i27 & 7;
                        i25++;
                    }
                }
                sArr[(i18 * 8) + i19] = (short) (i26 * (this.f149459q / (1 << i15)));
            }
        }
        return sArr;
    }

    private short[] matrix_add(short[] sArr, short[] sArr2, int i15, int i16) {
        int i17 = this.f149459q - 1;
        short[] sArr3 = new short[i15 * i16];
        for (int i18 = 0; i18 < i15; i18++) {
            for (int i19 = 0; i19 < i16; i19++) {
                int i25 = (i18 * i16) + i19;
                sArr3[i25] = (short) ((sArr[i25] + sArr2[i25]) & i17);
            }
        }
        return sArr3;
    }

    private short[] matrix_mul(short[] sArr, int i15, int i16, short[] sArr2, int i17, int i18) {
        int i19 = this.f149459q - 1;
        short[] sArr3 = new short[i15 * i18];
        for (int i25 = 0; i25 < i15; i25++) {
            for (int i26 = 0; i26 < i18; i26++) {
                int i27 = 0;
                for (int i28 = 0; i28 < i16; i28++) {
                    i27 += sArr[(i25 * i16) + i28] * sArr2[(i28 * i18) + i26];
                }
                sArr3[(i25 * i18) + i26] = (short) (i27 & i19);
            }
        }
        return sArr3;
    }

    private short[] matrix_sub(short[] sArr, short[] sArr2, int i15, int i16) {
        int i17 = this.f149459q - 1;
        short[] sArr3 = new short[i15 * i16];
        for (int i18 = 0; i18 < i15; i18++) {
            for (int i19 = 0; i19 < i16; i19++) {
                int i25 = (i18 * i16) + i19;
                sArr3[i25] = (short) ((sArr[i25] - sArr2[i25]) & i17);
            }
        }
        return sArr3;
    }

    private short[] matrix_transpose(short[] sArr, int i15, int i16) {
        short[] sArr2 = new short[i15 * i16];
        for (int i17 = 0; i17 < i16; i17++) {
            for (int i18 = 0; i18 < i15; i18++) {
                sArr2[(i17 * i15) + i18] = sArr[(i18 * i16) + i17];
            }
        }
        return sArr2;
    }

    private byte[] pack(short[] sArr) {
        int length = sArr.length;
        int i15 = (this.D * length) / 8;
        byte[] bArr = new byte[i15];
        short s15 = 0;
        short s16 = 0;
        byte b15 = 0;
        short s17 = 0;
        while (s15 < i15 && (s16 < length || (s16 == length && b15 > 0))) {
            byte b16 = 0;
            while (b16 < 8) {
                int i16 = 8 - b16;
                int iMin = Math.min(i16, (int) b15);
                int i17 = b15 - iMin;
                bArr[s15] = (byte) (bArr[s15] + (((byte) (((short) ((1 << iMin) - 1)) & (s17 >> i17))) << (i16 - iMin)));
                b16 = (byte) (b16 + iMin);
                b15 = (byte) i17;
                if (b15 == 0) {
                    if (s16 >= length) {
                        break;
                    }
                    short s18 = sArr[s16];
                    s16 = (short) (s16 + 1);
                    s17 = s18;
                    b15 = (byte) this.D;
                }
            }
            if (b16 == 8) {
                s15 = (short) (s15 + 1);
            }
        }
        return bArr;
    }

    private short sample(short s15) {
        int i15 = s15 & HPKE.aead_EXPORT_ONLY;
        short s16 = (short) (i15 >>> 1);
        int i16 = 0;
        short s17 = 0;
        while (true) {
            short[] sArr = this.T_chi;
            if (i16 >= sArr.length) {
                break;
            }
            if (s16 > sArr[i16]) {
                s17 = (short) (s17 + 1);
            }
            i16++;
        }
        return i15 % 2 == 1 ? (short) ((s17 * (-1)) & 65535) : s17;
    }

    private short[] sample_matrix(short[] sArr, int i15, int i16, int i17) {
        short[] sArr2 = new short[i16 * i17];
        for (int i18 = 0; i18 < i16; i18++) {
            for (int i19 = 0; i19 < i17; i19++) {
                int i25 = (i18 * i17) + i19;
                sArr2[i25] = sample(sArr[i25 + i15]);
            }
        }
        return sArr2;
    }

    private short[] unpack(byte[] bArr, int i15, int i16) {
        int i17 = i15 * i16;
        short[] sArr = new short[i17];
        short s15 = 0;
        short s16 = 0;
        byte b15 = 0;
        byte b16 = 0;
        while (s15 < i17 && (s16 < bArr.length || (s16 == bArr.length && b15 > 0))) {
            byte b17 = 0;
            while (true) {
                int i18 = this.D;
                if (b17 >= i18) {
                    break;
                }
                int iMin = Math.min(i18 - b17, (int) b15);
                short s17 = (short) (((1 << iMin) - 1) & 65535);
                sArr[s15] = (short) (((sArr[s15] & HPKE.aead_EXPORT_ONLY) + ((((byte) ((((b16 & 255) >>> ((b15 & 255) - iMin)) & (s17 & HPKE.aead_EXPORT_ONLY)) & GF2Field.MASK)) & 255) << ((this.D - (b17 & 255)) - iMin))) & 65535);
                b17 = (byte) (b17 + iMin);
                byte b18 = (byte) (b15 - iMin);
                byte b19 = (byte) ((~(s17 << b18)) & b16);
                if (b18 != 0) {
                    b16 = b19;
                    b15 = b18;
                } else {
                    if (s16 >= bArr.length) {
                        b16 = b19;
                        b15 = b18;
                        break;
                    }
                    byte b25 = bArr[s16];
                    s16 = (short) (s16 + 1);
                    b15 = 8;
                    b16 = b25;
                }
            }
            if (b17 == this.D) {
                s15 = (short) (s15 + 1);
            }
        }
        return sArr;
    }

    public int getCipherTextSize() {
        return this.len_ct_bytes;
    }

    public int getPrivateKeySize() {
        return this.len_sk_bytes;
    }

    public int getPublicKeySize() {
        return this.len_pk_bytes;
    }

    public int getSessionKeySize() {
        return this.len_ss_bytes;
    }

    public void kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i15 = ((this.f149458n * 8) * this.D) / 8;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, i15);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i15, ((this.D * 64) / 8) + i15);
        int i16 = this.len_s_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, 0, i16);
        int i17 = i16 + 16;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr3, i16, i17);
        int i18 = (((this.D * this.f149458n) * 8) / 8) + i17;
        byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArr3, i17, i18);
        int i19 = ((this.f149458n * 128) / 8) + i18;
        byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArr3, i18, i19);
        short[] sArr = new short[this.f149458n * 8];
        for (int i25 = 0; i25 < 8; i25++) {
            int i26 = 0;
            while (true) {
                int i27 = this.f149458n;
                if (i26 < i27) {
                    sArr[(i25 * i27) + i26] = Pack.littleEndianToShort(bArrCopyOfRange6, (i27 * i25 * 2) + (i26 * 2));
                    i26++;
                }
            }
        }
        short[] sArrMatrix_transpose = matrix_transpose(sArr, 8, this.f149458n);
        byte[] bArrCopyOfRange7 = Arrays.copyOfRange(bArr3, i19, this.len_pkh_bytes + i19);
        short[] sArrUnpack = unpack(bArrCopyOfRange, 8, this.f149458n);
        short[] sArrUnpack2 = unpack(bArrCopyOfRange2, 8, 8);
        int i28 = this.f149458n;
        byte[] bArrDecode = decode(matrix_sub(sArrUnpack2, matrix_mul(sArrUnpack, 8, i28, sArrMatrix_transpose, i28, 8), 8, 8));
        byte[] bArr4 = new byte[this.len_seedSE_bytes + this.len_k_bytes];
        this.digest.update(bArrCopyOfRange7, 0, this.len_pkh_bytes);
        this.digest.update(bArrDecode, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr4, 0, this.len_seedSE_bytes + this.len_k_bytes);
        int i29 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange8 = Arrays.copyOfRange(bArr4, i29, this.len_k_bytes + i29);
        int i35 = ((this.f149458n * 16) + 64) * 2;
        byte[] bArr5 = new byte[i35];
        this.digest.update((byte) -106);
        this.digest.update(bArr4, 0, this.len_seedSE_bytes);
        this.digest.doFinal(bArr5, 0, i35);
        int i36 = (this.f149458n * 16) + 64;
        short[] sArr2 = new short[i36];
        for (int i37 = 0; i37 < i36; i37++) {
            sArr2[i37] = Pack.littleEndianToShort(bArr5, i37 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr2, 0, 8, this.f149458n);
        int i38 = this.f149458n;
        short[] sArrSample_matrix2 = sample_matrix(sArr2, i38 * 8, 8, i38);
        short[] sArrGenMatrix = this.gen.genMatrix(bArrCopyOfRange4);
        int i39 = this.f149458n;
        short[] sArrMatrix_add = matrix_add(matrix_mul(sArrSample_matrix, 8, i39, sArrGenMatrix, i39, i39), sArrSample_matrix2, 8, this.f149458n);
        short[] sArrSample_matrix3 = sample_matrix(sArr2, this.f149458n * 16, 8, 8);
        short[] sArrUnpack3 = unpack(bArrCopyOfRange5, this.f149458n, 8);
        int i45 = this.f149458n;
        byte[] bArrCtselect = ctselect(bArrCopyOfRange8, bArrCopyOfRange3, ctverify(sArrUnpack, sArrUnpack2, sArrMatrix_add, matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, i45, sArrUnpack3, i45, 8), sArrSample_matrix3, 8, 8), encode(bArrDecode), 8, 8)));
        this.digest.update(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.update(bArrCtselect, 0, bArrCtselect.length);
        this.digest.doFinal(bArr, 0, this.len_ss_bytes);
    }

    public void kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, 16);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, 16, this.len_pk_bytes);
        byte[] bArr4 = new byte[this.len_mu_bytes];
        secureRandom.nextBytes(bArr4);
        byte[] bArr5 = new byte[this.len_pkh_bytes];
        this.digest.update(bArr3, 0, this.len_pk_bytes);
        this.digest.doFinal(bArr5, 0, this.len_pkh_bytes);
        byte[] bArr6 = new byte[this.len_seedSE + this.len_k];
        this.digest.update(bArr5, 0, this.len_pkh_bytes);
        this.digest.update(bArr4, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr6, 0, this.len_seedSE_bytes + this.len_k_bytes);
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr6, 0, this.len_seedSE_bytes);
        int i15 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr6, i15, this.len_k_bytes + i15);
        int i16 = ((this.f149458n * 16) + 64) * 2;
        byte[] bArr7 = new byte[i16];
        this.digest.update((byte) -106);
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr7, 0, i16);
        int i17 = i16 / 2;
        short[] sArr = new short[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            sArr[i18] = Pack.littleEndianToShort(bArr7, i18 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr, 0, 8, this.f149458n);
        int i19 = this.f149458n;
        short[] sArrSample_matrix2 = sample_matrix(sArr, i19 * 8, 8, i19);
        short[] sArrGenMatrix = this.gen.genMatrix(bArrCopyOfRange);
        int i25 = this.f149458n;
        byte[] bArrPack = pack(matrix_add(matrix_mul(sArrSample_matrix, 8, i25, sArrGenMatrix, i25, i25), sArrSample_matrix2, 8, this.f149458n));
        short[] sArrSample_matrix3 = sample_matrix(sArr, this.f149458n * 16, 8, 8);
        short[] sArrUnpack = unpack(bArrCopyOfRange2, this.f149458n, 8);
        int i26 = this.f149458n;
        byte[] bArrPack2 = pack(matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, i26, sArrUnpack, i26, 8), sArrSample_matrix3, 8, 8), encode(bArr4), 8, 8));
        System.arraycopy(Arrays.concatenate(bArrPack, bArrPack2), 0, bArr, 0, this.len_ct_bytes);
        this.digest.update(bArrPack, 0, bArrPack.length);
        this.digest.update(bArrPack2, 0, bArrPack2.length);
        this.digest.update(bArrCopyOfRange4, 0, this.len_k_bytes);
        this.digest.doFinal(bArr2, 0, this.len_s_bytes);
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[this.len_s_bytes + this.len_seedSE_bytes + 16];
        secureRandom.nextBytes(bArr3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, this.len_s_bytes);
        int i15 = this.len_s_bytes;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, i15, this.len_seedSE_bytes + i15);
        int i16 = this.len_s_bytes;
        int i17 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, i16 + i17, i16 + i17 + 16);
        byte[] bArr4 = new byte[16];
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr4, 0, 16);
        short[] sArrGenMatrix = this.gen.genMatrix(bArr4);
        int i18 = this.f149458n * 32;
        byte[] bArr5 = new byte[i18];
        this.digest.update((byte) 95);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.doFinal(bArr5, 0, i18);
        int i19 = this.f149458n * 16;
        short[] sArr = new short[i19];
        for (int i25 = 0; i25 < i19; i25++) {
            sArr[i25] = Pack.littleEndianToShort(bArr5, i25 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr, 0, 8, this.f149458n);
        short[] sArrMatrix_transpose = matrix_transpose(sArrSample_matrix, 8, this.f149458n);
        int i26 = this.f149458n;
        short[] sArrSample_matrix2 = sample_matrix(sArr, i26 * 8, i26, 8);
        int i27 = this.f149458n;
        System.arraycopy(Arrays.concatenate(bArr4, pack(matrix_add(matrix_mul(sArrGenMatrix, i27, i27, sArrMatrix_transpose, i27, 8), sArrSample_matrix2, this.f149458n, 8))), 0, bArr, 0, this.len_pk_bytes);
        int i28 = this.len_pkh_bytes;
        byte[] bArr6 = new byte[i28];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.doFinal(bArr6, 0, i28);
        System.arraycopy(Arrays.concatenate(bArrCopyOfRange, bArr), 0, bArr2, 0, this.len_s_bytes + this.len_pk_bytes);
        for (int i29 = 0; i29 < 8; i29++) {
            int i35 = 0;
            while (true) {
                int i36 = this.f149458n;
                if (i35 < i36) {
                    System.arraycopy(Pack.shortToLittleEndian(sArrSample_matrix[(i36 * i29) + i35]), 0, bArr2, this.len_s_bytes + this.len_pk_bytes + (this.f149458n * i29 * 2) + (i35 * 2), 2);
                    i35++;
                }
            }
        }
        int i37 = this.len_sk_bytes;
        int i38 = this.len_pkh_bytes;
        System.arraycopy(bArr6, 0, bArr2, i37 - i38, i38);
    }
}
