package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class OldCTSBlockCipher extends DefaultBufferedBlockCipher {
    private int blockSize;

    public OldCTSBlockCipher(BlockCipher blockCipher) {
        if ((blockCipher instanceof OFBBlockCipher) || (blockCipher instanceof CFBBlockCipher)) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
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
        int i16 = ((DefaultBufferedBlockCipher) this).bufOff - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (((DefaultBufferedBlockCipher) this).forEncryption) {
            ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
            int i17 = ((DefaultBufferedBlockCipher) this).bufOff;
            if (i17 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            while (true) {
                byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
                if (i17 == bArr3.length) {
                    break;
                }
                bArr3[i17] = bArr2[i17 - blockSize];
                i17++;
            }
            for (int i18 = blockSize; i18 != ((DefaultBufferedBlockCipher) this).bufOff; i18++) {
                byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
                bArr4[i18] = (byte) (bArr4[i18] ^ bArr2[i18 - blockSize]);
            }
            BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
            if (blockCipher instanceof CBCBlockCipher) {
                ((CBCBlockCipher) blockCipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr, i15);
            } else {
                blockCipher.processBlock(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr, i15);
            }
            System.arraycopy(bArr2, 0, bArr, i15 + blockSize, i16);
        } else {
            byte[] bArr5 = new byte[blockSize];
            BlockCipher blockCipher2 = ((DefaultBufferedBlockCipher) this).cipher;
            if (blockCipher2 instanceof CBCBlockCipher) {
                ((CBCBlockCipher) blockCipher2).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
            } else {
                blockCipher2.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
            }
            for (int i19 = blockSize; i19 != ((DefaultBufferedBlockCipher) this).bufOff; i19++) {
                int i25 = i19 - blockSize;
                bArr5[i25] = (byte) (bArr2[i25] ^ ((DefaultBufferedBlockCipher) this).buf[i19]);
            }
            System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr2, 0, i16);
            ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i15);
            System.arraycopy(bArr5, 0, bArr, i15 + blockSize, i16);
        }
        int i26 = ((DefaultBufferedBlockCipher) this).bufOff;
        reset();
        return i26;
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
