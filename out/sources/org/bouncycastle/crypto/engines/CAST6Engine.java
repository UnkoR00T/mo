package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes5.dex */
public final class CAST6Engine extends CAST5Engine {
    protected static final int BLOCK_SIZE = 16;
    protected static final int ROUNDS = 12;
    protected int[] _Kr = new int[48];
    protected int[] _Km = new int[48];
    protected int[] _Tr = new int[192];
    protected int[] _Tm = new int[192];
    private int[] _workingKey = new int[8];

    protected final void CAST_Decipher(int i15, int i16, int i17, int i18, int[] iArr) {
        int i19;
        int i25 = 0;
        while (true) {
            if (i25 >= 6) {
                break;
            }
            int i26 = (11 - i25) * 4;
            i17 ^= F1(i18, this._Km[i26], this._Kr[i26]);
            int i27 = i26 + 1;
            i16 ^= F2(i17, this._Km[i27], this._Kr[i27]);
            int i28 = i26 + 2;
            i15 ^= F3(i16, this._Km[i28], this._Kr[i28]);
            int i29 = i26 + 3;
            i18 ^= F1(i15, this._Km[i29], this._Kr[i29]);
            i25++;
        }
        for (i19 = 6; i19 < 12; i19++) {
            int i35 = (11 - i19) * 4;
            int i36 = i35 + 3;
            i18 ^= F1(i15, this._Km[i36], this._Kr[i36]);
            int i37 = i35 + 2;
            i15 ^= F3(i16, this._Km[i37], this._Kr[i37]);
            int i38 = i35 + 1;
            i16 ^= F2(i17, this._Km[i38], this._Kr[i38]);
            i17 ^= F1(i18, this._Km[i35], this._Kr[i35]);
        }
        iArr[0] = i15;
        iArr[1] = i16;
        iArr[2] = i17;
        iArr[3] = i18;
    }

    protected final void CAST_Encipher(int i15, int i16, int i17, int i18, int[] iArr) {
        int i19;
        int i25 = 0;
        while (true) {
            if (i25 >= 6) {
                break;
            }
            int i26 = i25 * 4;
            i17 ^= F1(i18, this._Km[i26], this._Kr[i26]);
            int i27 = i26 + 1;
            i16 ^= F2(i17, this._Km[i27], this._Kr[i27]);
            int i28 = i26 + 2;
            i15 ^= F3(i16, this._Km[i28], this._Kr[i28]);
            int i29 = i26 + 3;
            i18 ^= F1(i15, this._Km[i29], this._Kr[i29]);
            i25++;
        }
        for (i19 = 6; i19 < 12; i19++) {
            int i35 = i19 * 4;
            int i36 = i35 + 3;
            i18 ^= F1(i15, this._Km[i36], this._Kr[i36]);
            int i37 = i35 + 2;
            i15 ^= F3(i16, this._Km[i37], this._Kr[i37]);
            int i38 = i35 + 1;
            i16 ^= F2(i17, this._Km[i38], this._Kr[i38]);
            i17 ^= F1(i18, this._Km[i35], this._Kr[i35]);
        }
        iArr[0] = i15;
        iArr[1] = i16;
        iArr[2] = i17;
        iArr[3] = i18;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    protected int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[] iArr = new int[4];
        CAST_Decipher(BytesTo32bits(bArr, i15), BytesTo32bits(bArr, i15 + 4), BytesTo32bits(bArr, i15 + 8), BytesTo32bits(bArr, i15 + 12), iArr);
        Bits32ToBytes(iArr[0], bArr2, i16);
        Bits32ToBytes(iArr[1], bArr2, i16 + 4);
        Bits32ToBytes(iArr[2], bArr2, i16 + 8);
        Bits32ToBytes(iArr[3], bArr2, i16 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    protected int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[] iArr = new int[4];
        CAST_Encipher(BytesTo32bits(bArr, i15), BytesTo32bits(bArr, i15 + 4), BytesTo32bits(bArr, i15 + 8), BytesTo32bits(bArr, i15 + 12), iArr);
        Bits32ToBytes(iArr[0], bArr2, i16);
        Bits32ToBytes(iArr[1], bArr2, i16 + 4);
        Bits32ToBytes(iArr[2], bArr2, i16 + 8);
        Bits32ToBytes(iArr[3], bArr2, i16 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "CAST6";
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    protected void setKey(byte[] bArr) {
        int i15 = 1518500249;
        int i16 = 19;
        char c15 = 0;
        for (int i17 = 0; i17 < 24; i17++) {
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = (i17 * 8) + i18;
                this._Tm[i19] = i15;
                i15 += 1859775393;
                this._Tr[i19] = i16;
                i16 = (i16 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i25 = 0; i25 < 8; i25++) {
            this._workingKey[i25] = BytesTo32bits(bArr2, i25 * 4);
        }
        int i26 = 0;
        while (i26 < 12) {
            int i27 = i26 * 16;
            int[] iArr = this._workingKey;
            iArr[6] = iArr[6] ^ F1(iArr[7], this._Tm[i27], this._Tr[i27]);
            int[] iArr2 = this._workingKey;
            int i28 = i27 + 1;
            iArr2[5] = iArr2[5] ^ F2(iArr2[6], this._Tm[i28], this._Tr[i28]);
            int[] iArr3 = this._workingKey;
            int i29 = i27 + 2;
            iArr3[4] = iArr3[4] ^ F3(iArr3[5], this._Tm[i29], this._Tr[i29]);
            int[] iArr4 = this._workingKey;
            int i35 = i27 + 3;
            char c16 = c15;
            iArr4[3] = F1(iArr4[4], this._Tm[i35], this._Tr[i35]) ^ iArr4[3];
            int[] iArr5 = this._workingKey;
            int i36 = i27 + 4;
            iArr5[2] = F2(iArr5[3], this._Tm[i36], this._Tr[i36]) ^ iArr5[2];
            int[] iArr6 = this._workingKey;
            int i37 = i27 + 5;
            iArr6[1] = F3(iArr6[2], this._Tm[i37], this._Tr[i37]) ^ iArr6[1];
            int[] iArr7 = this._workingKey;
            int i38 = i27 + 6;
            iArr7[c16] = iArr7[c16] ^ F1(iArr7[1], this._Tm[i38], this._Tr[i38]);
            int[] iArr8 = this._workingKey;
            int i39 = i27 + 7;
            iArr8[7] = F2(iArr8[c16], this._Tm[i39], this._Tr[i39]) ^ iArr8[7];
            int i45 = ((i26 * 2) + 1) * 8;
            int[] iArr9 = this._workingKey;
            iArr9[6] = iArr9[6] ^ F1(iArr9[7], this._Tm[i45], this._Tr[i45]);
            int[] iArr10 = this._workingKey;
            int i46 = i45 + 1;
            iArr10[5] = iArr10[5] ^ F2(iArr10[6], this._Tm[i46], this._Tr[i46]);
            int[] iArr11 = this._workingKey;
            int i47 = i45 + 2;
            iArr11[4] = iArr11[4] ^ F3(iArr11[5], this._Tm[i47], this._Tr[i47]);
            int[] iArr12 = this._workingKey;
            int i48 = i45 + 3;
            iArr12[3] = iArr12[3] ^ F1(iArr12[4], this._Tm[i48], this._Tr[i48]);
            int[] iArr13 = this._workingKey;
            int i49 = i45 + 4;
            iArr13[2] = iArr13[2] ^ F2(iArr13[3], this._Tm[i49], this._Tr[i49]);
            int[] iArr14 = this._workingKey;
            int i55 = i45 + 5;
            iArr14[1] = iArr14[1] ^ F3(iArr14[2], this._Tm[i55], this._Tr[i55]);
            int[] iArr15 = this._workingKey;
            int i56 = i45 + 6;
            iArr15[c16] = iArr15[c16] ^ F1(iArr15[1], this._Tm[i56], this._Tr[i56]);
            int[] iArr16 = this._workingKey;
            int i57 = i45 + 7;
            iArr16[7] = F2(iArr16[c16], this._Tm[i57], this._Tr[i57]) ^ iArr16[7];
            int[] iArr17 = this._Kr;
            int i58 = i26 * 4;
            int[] iArr18 = this._workingKey;
            iArr17[i58] = iArr18[c16] & 31;
            int i59 = i58 + 1;
            iArr17[i59] = iArr18[2] & 31;
            int i65 = i58 + 2;
            iArr17[i65] = iArr18[4] & 31;
            int i66 = i58 + 3;
            iArr17[i66] = iArr18[6] & 31;
            int[] iArr19 = this._Km;
            iArr19[i58] = iArr18[7];
            iArr19[i59] = iArr18[5];
            iArr19[i65] = iArr18[3];
            iArr19[i66] = iArr18[1];
            i26++;
            c15 = c16;
        }
    }
}
