package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class NISTCTSBlockCipher extends DefaultBufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;
    private final int type;

    public NISTCTSBlockCipher(int i15, BlockCipher blockCipher) {
        this.type = i15;
        ((DefaultBufferedBlockCipher) this).cipher = CBCBlockCipher.newInstance(blockCipher);
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockSize * 2];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i15) {
        if (((DefaultBufferedBlockCipher) this).bufOff + i15 > bArr.length) {
            throw new OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        int i16 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i17 = i16 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (((DefaultBufferedBlockCipher) this).forEncryption) {
            if (i16 < blockSize) {
                throw new DataLengthException("need at least one block of input for NISTCTS");
            }
            if (i16 > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                int i18 = this.type;
                if (i18 == 2 || i18 == 3) {
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr3, 0, i17);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (this.type == 2 && i17 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i15, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i15 + blockSize, i17);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i15, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i15 + blockSize, i17);
                    }
                } else {
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0, blockSize);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i15, i17);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff - i17, bArr3, 0, i17);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i15 + i17, blockSize);
                }
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i15, blockSize);
            }
        } else {
            if (i16 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[blockSize];
            if (i16 > blockSize) {
                int i19 = this.type;
                if (i19 == 3 || (i19 == 2 && (((DefaultBufferedBlockCipher) this).buf.length - i16) % blockSize != 0)) {
                    BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
                    if (blockCipher instanceof CBCModeCipher) {
                        ((CBCModeCipher) blockCipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    } else {
                        blockCipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    }
                    for (int i25 = blockSize; i25 != ((DefaultBufferedBlockCipher) this).bufOff; i25++) {
                        int i26 = i25 - blockSize;
                        bArr4[i26] = (byte) (bArr2[i26] ^ ((DefaultBufferedBlockCipher) this).buf[i25]);
                    }
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr2, 0, i17);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i15);
                } else {
                    ((CBCModeCipher) ((DefaultBufferedBlockCipher) this).cipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff - blockSize, bArr4, 0);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0, blockSize);
                    if (i17 != blockSize) {
                        System.arraycopy(bArr4, i17, bArr2, i17, blockSize - i17);
                    }
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i15, blockSize);
                    for (int i27 = 0; i27 != i17; i27++) {
                        bArr4[i27] = (byte) (bArr4[i27] ^ ((DefaultBufferedBlockCipher) this).buf[i27]);
                    }
                }
                System.arraycopy(bArr4, 0, bArr, i15 + blockSize, i17);
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i15, blockSize);
            }
        }
        int i28 = ((DefaultBufferedBlockCipher) this).bufOff;
        reset();
        return i28;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i15) {
        return i15 + ((DefaultBufferedBlockCipher) this).bufOff;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i15) {
        int i16 = i15 + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i16 % bArr.length;
        return length == 0 ? i16 - bArr.length : i16 - length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b15, byte[] bArr, int i15) {
        int i16 = ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
        int i17 = 0;
        if (i16 == bArr2.length) {
            int iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i15);
            byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
            int i18 = this.blockSize;
            System.arraycopy(bArr3, i18, bArr3, 0, i18);
            ((DefaultBufferedBlockCipher) this).bufOff = this.blockSize;
            i17 = iProcessBlock;
        }
        byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
        int i19 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i19 + 1;
        bArr4[i19] = b15;
        return i17;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (i16 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i16);
        if (updateOutputSize > 0 && i17 + updateOutputSize > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int length = bArr3.length;
        int i18 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i19 = length - i18;
        int i25 = 0;
        if (i16 > i19) {
            System.arraycopy(bArr, i15, bArr3, i18, i19);
            i15 += i19;
            i16 -= i19;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i15, i16, i17, updateOutputSize)) {
                bArr = new byte[i16];
                System.arraycopy(bArr2, i15, bArr, 0, i16);
                i15 = 0;
            }
            int iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i17);
            byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            ((DefaultBufferedBlockCipher) this).bufOff = blockSize;
            while (i16 > blockSize) {
                System.arraycopy(bArr, i15, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, blockSize);
                iProcessBlock += ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i17 + iProcessBlock);
                byte[] bArr5 = ((DefaultBufferedBlockCipher) this).buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i16 -= blockSize;
                i15 += blockSize;
            }
            i25 = iProcessBlock;
        }
        System.arraycopy(bArr, i15, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, i16);
        ((DefaultBufferedBlockCipher) this).bufOff += i16;
        return i25;
    }
}
