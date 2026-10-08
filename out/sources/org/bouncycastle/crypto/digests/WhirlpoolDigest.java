package org.bouncycastle.crypto.digests;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes5.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private final CryptoServicePurpose purpose;
    private static final int[] SBOX = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, BERTags.FLAGS, 215, 194, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, GF2Field.MASK, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 209, 165, 226, 97, 179, 33, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256, 30, 67, 199, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, 247, 185, 19, 44, Primes.SMALL_FACTOR_LIMIT, 231, 110, 196, 3, 86, 68, CertificateBody.profileType, 169, 42, 187, 193, 83, 220, 11, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 152, 164, 40, 92, 248, 134};
    private static final long[] C0 = new long[256];
    private static final long[] C1 = new long[256];
    private static final long[] C2 = new long[256];
    private static final long[] C3 = new long[256];
    private static final long[] C4 = new long[256];
    private static final long[] C5 = new long[256];
    private static final long[] C6 = new long[256];
    private static final long[] C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
        for (int i15 = 0; i15 < 256; i15++) {
            int i16 = SBOX[i15];
            int iMulX = mulX(i16);
            int iMulX2 = mulX(iMulX);
            int i17 = iMulX2 ^ i16;
            int iMulX3 = mulX(iMulX2);
            int i18 = iMulX3 ^ i16;
            C0[i15] = packIntoLong(i16, i16, iMulX2, i16, iMulX3, i17, iMulX, i18);
            C1[i15] = packIntoLong(i18, i16, i16, iMulX2, i16, iMulX3, i17, iMulX);
            C2[i15] = packIntoLong(iMulX, i18, i16, i16, iMulX2, i16, iMulX3, i17);
            C3[i15] = packIntoLong(i17, iMulX, i18, i16, i16, iMulX2, i16, iMulX3);
            C4[i15] = packIntoLong(iMulX3, i17, iMulX, i18, i16, i16, iMulX2, i16);
            C5[i15] = packIntoLong(i16, iMulX3, i17, iMulX, i18, i16, i16, iMulX2);
            C6[i15] = packIntoLong(iMulX2, i16, iMulX3, i17, iMulX, i18, i16, i16);
            C7[i15] = packIntoLong(i16, iMulX2, i16, iMulX3, i17, iMulX, i18, i16);
        }
    }

    public WhirlpoolDigest() {
        this(CryptoServicePurpose.ANY);
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i15 = 0; i15 < 32; i15++) {
            bArr[i15] = (byte) (this._bitCount[i15] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] bArrCopyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i15 = this._bufferPos;
        bArr[i15] = (byte) (bArr[i15] | 128);
        int i16 = i15 + 1;
        this._bufferPos = i16;
        if (i16 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArrCopyBitLength, 0, this._buffer, 32, bArrCopyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i15 = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i16 = (sArr[length] & 255) + EIGHT[length] + i15;
            i15 = i16 >>> 8;
            sArr[length] = (short) (i16 & GF2Field.MASK);
        }
    }

    private static int mulX(int i15) {
        return ((-(i15 >>> 7)) & REDUCTION_POLYNOMIAL) ^ (i15 << 1);
    }

    private static long packIntoLong(int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27) {
        return (((((((((long) i16) << 48) ^ (((long) i15) << 56)) ^ (((long) i17) << 40)) ^ (((long) i18) << 32)) ^ (((long) i19) << 24)) ^ (((long) i25) << 16)) ^ (((long) i26) << 8)) ^ ((long) i27);
    }

    private void processFilledBuffer(byte[] bArr, int i15) {
        Pack.bigEndianToLong(this._buffer, 0, this._block);
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        finish();
        Pack.longToBigEndian(this._hash, bArr, i15);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    protected void processBlock() {
        char c15;
        char c16;
        for (int i15 = 0; i15 < 8; i15++) {
            long[] jArr = this._state;
            long j15 = this._block[i15];
            long[] jArr2 = this._K;
            long j16 = this._hash[i15];
            jArr2[i15] = j16;
            jArr[i15] = j15 ^ j16;
        }
        for (int i16 = 1; i16 <= 10; i16++) {
            int i17 = 0;
            while (true) {
                c15 = ' ';
                c16 = '(';
                if (i17 >= 8) {
                    break;
                }
                long[] jArr3 = this._L;
                jArr3[i17] = 0;
                long[] jArr4 = C0;
                long[] jArr5 = this._K;
                long j17 = jArr4[((int) (jArr5[i17 & 7] >>> 56)) & GF2Field.MASK];
                jArr3[i17] = j17;
                long j18 = C1[((int) (jArr5[(i17 - 1) & 7] >>> 48)) & GF2Field.MASK] ^ j17;
                jArr3[i17] = j18;
                long j19 = j18 ^ C2[((int) (jArr5[(i17 - 2) & 7] >>> 40)) & GF2Field.MASK];
                jArr3[i17] = j19;
                long j25 = j19 ^ C3[((int) (jArr5[(i17 - 3) & 7] >>> 32)) & GF2Field.MASK];
                jArr3[i17] = j25;
                long j26 = j25 ^ C4[((int) (jArr5[(i17 - 4) & 7] >>> 24)) & GF2Field.MASK];
                jArr3[i17] = j26;
                long j27 = j26 ^ C5[((int) (jArr5[(i17 - 5) & 7] >>> 16)) & GF2Field.MASK];
                jArr3[i17] = j27;
                long j28 = j27 ^ C6[((int) (jArr5[(i17 - 6) & 7] >>> 8)) & GF2Field.MASK];
                jArr3[i17] = j28;
                jArr3[i17] = j28 ^ C7[((int) jArr5[(i17 - 7) & 7]) & GF2Field.MASK];
                i17++;
            }
            long[] jArr6 = this._L;
            long[] jArr7 = this._K;
            System.arraycopy(jArr6, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this._K;
            jArr8[0] = jArr8[0] ^ this._rc[i16];
            int i18 = 0;
            while (i18 < 8) {
                long[] jArr9 = this._L;
                long j29 = this._K[i18];
                jArr9[i18] = j29;
                long[] jArr10 = C0;
                long[] jArr11 = this._state;
                char c17 = c15;
                char c18 = c16;
                long j35 = j29 ^ jArr10[((int) (jArr11[i18 & 7] >>> 56)) & GF2Field.MASK];
                jArr9[i18] = j35;
                long j36 = j35 ^ C1[((int) (jArr11[(i18 - 1) & 7] >>> 48)) & GF2Field.MASK];
                jArr9[i18] = j36;
                long j37 = j36 ^ C2[((int) (jArr11[(i18 - 2) & 7] >>> c18)) & GF2Field.MASK];
                jArr9[i18] = j37;
                long j38 = j37 ^ C3[((int) (jArr11[(i18 - 3) & 7] >>> c17)) & GF2Field.MASK];
                jArr9[i18] = j38;
                long j39 = j38 ^ C4[((int) (jArr11[(i18 - 4) & 7] >>> 24)) & GF2Field.MASK];
                jArr9[i18] = j39;
                long j45 = j39 ^ C5[((int) (jArr11[(i18 - 5) & 7] >>> 16)) & GF2Field.MASK];
                jArr9[i18] = j45;
                long j46 = j45 ^ C6[((int) (jArr11[(i18 - 6) & 7] >>> 8)) & GF2Field.MASK];
                jArr9[i18] = j46;
                jArr9[i18] = j46 ^ C7[((int) jArr11[(i18 - 7) & 7]) & GF2Field.MASK];
                i18++;
                c16 = c18;
                c15 = c17;
            }
            long[] jArr12 = this._L;
            long[] jArr13 = this._state;
            System.arraycopy(jArr12, 0, jArr13, 0, jArr13.length);
        }
        for (int i19 = 0; i19 < 8; i19++) {
            long[] jArr14 = this._hash;
            jArr14[i19] = jArr14[i19] ^ (this._state[i19] ^ this._block[i19]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b15) {
        byte[] bArr = this._buffer;
        int i15 = this._bufferPos;
        bArr[i15] = b15;
        int i16 = i15 + 1;
        this._bufferPos = i16;
        if (i16 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    public WhirlpoolDigest(CryptoServicePurpose cryptoServicePurpose) {
        long[] jArr = new long[11];
        this._rc = jArr;
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        jArr[0] = 0;
        for (int i15 = 1; i15 <= 10; i15++) {
            int i16 = (i15 - 1) * 8;
            this._rc[i15] = (((((((C0[i16] & (-72057594037927936L)) ^ (C1[i16 + 1] & 71776119061217280L)) ^ (C2[i16 + 2] & 280375465082880L)) ^ (C3[i16 + 3] & 1095216660480L)) ^ (C4[i16 + 4] & 4278190080L)) ^ (C5[i16 + 5] & 16711680)) ^ (C6[i16 + 6] & 65280)) ^ (C7[i16 + 7] & 255);
        }
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize(), cryptoServicePurpose));
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        while (i16 > 0) {
            update(bArr[i15]);
            i15++;
            i16--;
        }
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        CryptoServicePurpose cryptoServicePurpose = whirlpoolDigest.purpose;
        this.purpose = cryptoServicePurpose;
        reset(whirlpoolDigest);
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize(), cryptoServicePurpose));
    }
}
