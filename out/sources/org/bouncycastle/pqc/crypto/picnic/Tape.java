package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class Tape {
    private PicnicEngine engine;
    int nTapes;
    int pos = 0;
    byte[][] tapes;

    public Tape(PicnicEngine picnicEngine) {
        this.engine = picnicEngine;
        this.tapes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, picnicEngine.numMPCParties, picnicEngine.andSizeBytes * 2);
        this.nTapes = picnicEngine.numMPCParties;
    }

    private void tapesToParityBits(int[] iArr, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            Utils.setBitInWordArray(iArr, i16, Utils.parity16(tapesToWord()));
        }
    }

    protected void computeAuxTape(byte[] bArr) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        PicnicEngine picnicEngine = this.engine;
        iArr5[picnicEngine.stateSizeWords - 1] = 0;
        tapesToParityBits(iArr5, picnicEngine.stateSizeBits);
        PicnicEngine picnicEngine2 = this.engine;
        KMatricesWithPointer kMatricesWithPointerKMatrixInv = picnicEngine2.lowmcConstants.KMatrixInv(picnicEngine2);
        this.engine.matrix_mul(iArr4, iArr5, kMatricesWithPointerKMatrixInv.getData(), kMatricesWithPointerKMatrixInv.getMatrixPointer());
        if (bArr != null) {
            Pack.intToLittleEndian(iArr4, 0, this.engine.stateSizeWords, bArr, 0);
        }
        for (int i15 = this.engine.numRounds; i15 > 0; i15--) {
            PicnicEngine picnicEngine3 = this.engine;
            KMatricesWithPointer kMatricesWithPointerKMatrix = picnicEngine3.lowmcConstants.KMatrix(picnicEngine3, i15);
            this.engine.matrix_mul(iArr, iArr4, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
            this.engine.xor_array(iArr2, iArr2, iArr, 0);
            PicnicEngine picnicEngine4 = this.engine;
            int i16 = i15 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrixInv = picnicEngine4.lowmcConstants.LMatrixInv(picnicEngine4, i16);
            this.engine.matrix_mul(iArr3, iArr2, kMatricesWithPointerLMatrixInv.getData(), kMatricesWithPointerLMatrixInv.getMatrixPointer());
            if (i15 == 1) {
                System.arraycopy(iArr5, 0, iArr2, 0, 16);
            } else {
                int i17 = this.engine.stateSizeBits;
                this.pos = i17 * 2 * i16;
                tapesToParityBits(iArr2, i17);
            }
            PicnicEngine picnicEngine5 = this.engine;
            int i18 = picnicEngine5.stateSizeBits;
            this.pos = (i18 * 2 * i16) + i18;
            picnicEngine5.aux_mpc_sbox(iArr2, iArr3, this);
        }
        this.pos = 0;
    }

    protected void setAuxBits(byte[] bArr) {
        PicnicEngine picnicEngine = this.engine;
        int i15 = picnicEngine.numMPCParties - 1;
        int i16 = picnicEngine.stateSizeBits;
        int i17 = 0;
        for (int i18 = 0; i18 < this.engine.numRounds; i18++) {
            int i19 = 0;
            while (i19 < i16) {
                Utils.setBit(this.tapes[i15], (i16 * 2 * i18) + i16 + i19, Utils.getBit(bArr, i17));
                i19++;
                i17++;
            }
        }
    }

    protected int tapesToWord() {
        int i15 = this.pos;
        int i16 = i15 >>> 3;
        int i17 = (i15 & 7) ^ 7;
        int i18 = 1 << i17;
        byte[][] bArr = this.tapes;
        int i19 = ((bArr[15][i16] & i18) << 8) | (bArr[7][i16] & i18) | ((bArr[0][i16] & i18) << 7) | ((bArr[1][i16] & i18) << 6) | ((bArr[2][i16] & i18) << 5) | ((bArr[3][i16] & i18) << 4) | ((bArr[4][i16] & i18) << 3) | ((bArr[5][i16] & i18) << 2) | ((bArr[6][i16] & i18) << 1) | ((bArr[8][i16] & i18) << 15) | ((bArr[9][i16] & i18) << 14) | ((bArr[10][i16] & i18) << 13) | ((bArr[11][i16] & i18) << 12) | ((bArr[12][i16] & i18) << 11) | ((bArr[13][i16] & i18) << 10) | ((bArr[14][i16] & i18) << 9);
        this.pos = i15 + 1;
        return i19 >>> i17;
    }
}
