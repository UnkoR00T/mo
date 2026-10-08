package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SICBlockCipher extends StreamBlockCipher implements CTRModeCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    @Deprecated
    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j15) {
        int i15 = 5;
        if (j15 >= 0) {
            long j16 = (((long) this.byteCount) + j15) / ((long) this.blockSize);
            long j17 = j16;
            if (j16 > 255) {
                while (i15 >= 1) {
                    long j18 = 1 << (i15 * 8);
                    while (j17 >= j18) {
                        incrementCounterAt(i15);
                        j17 -= j18;
                    }
                    i15--;
                }
            }
            incrementCounter((int) j17);
            this.byteCount = (int) ((j15 + ((long) this.byteCount)) - (((long) this.blockSize) * j16));
            return;
        }
        long j19 = ((-j15) - ((long) this.byteCount)) / ((long) this.blockSize);
        long j25 = j19;
        if (j19 > 255) {
            while (i15 >= 1) {
                long j26 = 1 << (i15 * 8);
                while (j25 > j26) {
                    decrementCounterAt(i15);
                    j25 -= j26;
                }
                i15--;
            }
        }
        for (long j27 = 0; j27 != j25; j27++) {
            decrementCounterAt(0);
        }
        int i16 = (int) (((long) this.byteCount) + j15 + (((long) this.blockSize) * j19));
        if (i16 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i16;
        }
    }

    private void checkCounter() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                if (this.counter[length] != this.IV[length]) {
                    throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                }
            }
        }
    }

    private void checkLastIncrement() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize && this.counter[bArr.length - 1] != bArr[bArr.length - 1]) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    private void decrementCounterAt(int i15) {
        byte b15;
        int length = this.counter.length - i15;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b15 = (byte) (bArr[length] - 1);
            bArr[length] = b15;
        } while (b15 == -1);
    }

    private void incrementCounter() {
        byte b15;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b15 = (byte) (bArr[length] + 1);
            bArr[length] = b15;
        } while (b15 == 0);
    }

    private void incrementCounterAt(int i15) {
        byte b15;
        int length = this.counter.length - i15;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b15 = (byte) (bArr[length] + 1);
            bArr[length] = b15;
        } while (b15 == 0);
    }

    public static CTRModeCipher newInstance(BlockCipher blockCipher) {
        return new SICBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    protected byte calculateByte(byte b15) {
        int i15 = this.byteCount;
        if (i15 == 0) {
            checkLastIncrement();
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i16 = this.byteCount;
            this.byteCount = i16 + 1;
            return (byte) (b15 ^ bArr[i16]);
        }
        byte[] bArr2 = this.counterOut;
        int i17 = i15 + 1;
        this.byteCount = i17;
        byte b16 = (byte) (b15 ^ bArr2[i15]);
        if (i17 == this.counter.length) {
            this.byteCount = 0;
            incrementCounter();
        }
        return b16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i15 = length - 1;
        while (i15 >= 1) {
            byte[] bArr3 = this.IV;
            int i16 = i15 < bArr3.length ? (bArr2[i15] & 255) - (bArr3[i15] & 255) : bArr2[i15] & 255;
            if (i16 < 0) {
                int i17 = i15 - 1;
                bArr2[i17] = (byte) (bArr2[i17] - 1);
                i16 += 256;
            }
            bArr2[i15] = (byte) i16;
            i15--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * ((long) this.blockSize)) + ((long) this.byteCount);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
        this.IV = bArrClone;
        int i15 = this.blockSize;
        if (i15 < bArrClone.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.blockSize + " bytes.");
        }
        int i16 = 8 > i15 / 2 ? i15 / 2 : 8;
        if (i15 - bArrClone.length <= i16) {
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i16) + " bytes.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        SICBlockCipher sICBlockCipher;
        if (this.byteCount != 0) {
            sICBlockCipher = this;
            sICBlockCipher.processBytes(bArr, i15, this.blockSize, bArr2, i16);
        } else {
            sICBlockCipher = this;
            int i17 = sICBlockCipher.blockSize;
            if (i15 + i17 > bArr.length) {
                throw new DataLengthException("input buffer too small");
            }
            if (i16 + i17 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            sICBlockCipher.cipher.processBlock(sICBlockCipher.counter, 0, sICBlockCipher.counterOut, 0);
            for (int i18 = 0; i18 < sICBlockCipher.blockSize; i18++) {
                bArr2[i16 + i18] = (byte) (bArr[i15 + i18] ^ sICBlockCipher.counterOut[i18]);
            }
            incrementCounter();
        }
        return sICBlockCipher.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        byte b15;
        if (i15 + i16 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = this.byteCount;
            if (i19 == 0) {
                checkLastIncrement();
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                byte b16 = bArr[i15 + i18];
                byte[] bArr3 = this.counterOut;
                int i25 = this.byteCount;
                this.byteCount = i25 + 1;
                b15 = (byte) (b16 ^ bArr3[i25]);
            } else {
                byte b17 = bArr[i15 + i18];
                byte[] bArr4 = this.counterOut;
                int i26 = i19 + 1;
                this.byteCount = i26;
                b15 = (byte) (bArr4[i19] ^ b17);
                if (i26 == this.counter.length) {
                    this.byteCount = 0;
                    incrementCounter();
                }
            }
            bArr2[i17 + i18] = b15;
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j15) {
        reset();
        return skip(j15);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j15) {
        adjustCounter(j15);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j15;
    }

    private void incrementCounter(int i15) {
        byte[] bArr = this.counter;
        byte b15 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + ((byte) i15));
        if ((b15 & 255) + i15 > 255) {
            incrementCounterAt(1);
        }
    }
}
