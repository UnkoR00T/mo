package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class KXTSBlockCipher extends DefaultBufferedBlockCipher {
    private static final long RED_POLY_128 = 135;
    private static final long RED_POLY_256 = 1061;
    private static final long RED_POLY_512 = 293;
    private final int blockSize;
    private int counter;
    private final long reductionPolynomial;
    private final long[] tw_current;
    private final long[] tw_init;

    public KXTSBlockCipher(BlockCipher blockCipher) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.reductionPolynomial = getReductionPolynomial(blockSize);
        this.tw_init = new long[blockSize >>> 3];
        this.tw_current = new long[blockSize >>> 3];
        this.counter = -1;
    }

    private static void GF_double(long j15, long[] jArr) {
        long j16 = 0;
        int i15 = 0;
        while (i15 < jArr.length) {
            long j17 = jArr[i15];
            jArr[i15] = j16 ^ (j17 << 1);
            i15++;
            j16 = j17 >>> 63;
        }
        jArr[0] = (j15 & (-j16)) ^ jArr[0];
    }

    protected static long getReductionPolynomial(int i15) {
        if (i15 == 16) {
            return RED_POLY_128;
        }
        if (i15 == 32) {
            return RED_POLY_256;
        }
        if (i15 == 64) {
            return RED_POLY_512;
        }
        throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    private void processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = this.counter;
        if (i17 == -1) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.counter = i17 + 1;
        GF_double(this.reductionPolynomial, this.tw_current);
        byte[] bArr3 = new byte[this.blockSize];
        Pack.longToLittleEndian(this.tw_current, bArr3, 0);
        int i18 = this.blockSize;
        byte[] bArr4 = new byte[i18];
        System.arraycopy(bArr3, 0, bArr4, 0, i18);
        for (int i19 = 0; i19 < this.blockSize; i19++) {
            bArr4[i19] = (byte) (bArr4[i19] ^ bArr[i15 + i19]);
        }
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr4, 0, bArr4, 0);
        for (int i25 = 0; i25 < this.blockSize; i25++) {
            bArr2[i16 + i25] = (byte) (bArr4[i25] ^ bArr3[i25]);
        }
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i15) {
        reset();
        return 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i15) {
        return i15;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i15) {
        return i15;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Invalid parameters passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        CipherParameters parameters = parametersWithIV.getParameters();
        byte[] iv4 = parametersWithIV.getIV();
        int length = iv4.length;
        int i15 = this.blockSize;
        if (length != i15) {
            throw new IllegalArgumentException("Currently only support IVs of exactly one block");
        }
        byte[] bArr = new byte[i15];
        System.arraycopy(iv4, 0, bArr, 0, i15);
        ((DefaultBufferedBlockCipher) this).cipher.init(true, parameters);
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, 0, bArr, 0);
        ((DefaultBufferedBlockCipher) this).cipher.init(z15, parameters);
        Pack.littleEndianToLong(bArr, 0, this.tw_init);
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b15, byte[] bArr, int i15) {
        throw new IllegalStateException("unsupported operation");
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (bArr.length - i15 < i16) {
            throw new DataLengthException("Input buffer too short");
        }
        if (bArr2.length - i15 < i16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i16 % this.blockSize != 0) {
            throw new IllegalArgumentException("Partial blocks not supported");
        }
        int i18 = 0;
        if (bArr == bArr2 && Arrays.segmentsOverlap(i15, i16, i17, i16)) {
            bArr = new byte[i16];
            System.arraycopy(bArr2, i15, bArr, 0, i16);
            i15 = 0;
        }
        while (i18 < i16) {
            processBlock(bArr, i15 + i18, bArr2, i17 + i18);
            i18 += this.blockSize;
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        ((DefaultBufferedBlockCipher) this).cipher.reset();
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }
}
