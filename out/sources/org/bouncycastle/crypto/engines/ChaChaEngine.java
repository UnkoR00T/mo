package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i15, int[] iArr, int[] iArr2) {
        int i16 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i15 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i17 = iArr[0];
        int i18 = iArr[1];
        int i19 = iArr[2];
        char c15 = 3;
        int i25 = iArr[3];
        char c16 = 4;
        int i26 = iArr[4];
        char c17 = 5;
        int i27 = iArr[5];
        char c18 = 6;
        int i28 = iArr[6];
        int i29 = 7;
        int i35 = iArr[7];
        int i36 = 8;
        int i37 = iArr[8];
        int i38 = iArr[9];
        int i39 = iArr[10];
        int i45 = iArr[11];
        int i46 = 12;
        int i47 = iArr[12];
        int i48 = iArr[13];
        int i49 = iArr[14];
        int iRotateLeft = iArr[15];
        int iRotateLeft2 = i49;
        int iRotateLeft3 = i48;
        int iRotateLeft4 = i47;
        int i55 = i45;
        int i56 = i39;
        int i57 = i38;
        int i58 = i37;
        int iRotateLeft5 = i35;
        int iRotateLeft6 = i28;
        int iRotateLeft7 = i27;
        int iRotateLeft8 = i26;
        int i59 = i25;
        int i65 = i19;
        int i66 = i18;
        int i67 = i17;
        int i68 = i15;
        while (i68 > 0) {
            int i69 = i67 + iRotateLeft8;
            char c19 = c15;
            int iRotateLeft9 = Integers.rotateLeft(iRotateLeft4 ^ i69, i16);
            int i75 = i58 + iRotateLeft9;
            int iRotateLeft10 = Integers.rotateLeft(iRotateLeft8 ^ i75, i46);
            int i76 = i69 + iRotateLeft10;
            int iRotateLeft11 = Integers.rotateLeft(iRotateLeft9 ^ i76, i36);
            int i77 = i75 + iRotateLeft11;
            int iRotateLeft12 = Integers.rotateLeft(iRotateLeft10 ^ i77, i29);
            int i78 = i66 + iRotateLeft7;
            char c25 = c16;
            int iRotateLeft13 = Integers.rotateLeft(iRotateLeft3 ^ i78, i16);
            int i79 = i57 + iRotateLeft13;
            char c26 = c17;
            int iRotateLeft14 = Integers.rotateLeft(iRotateLeft7 ^ i79, i46);
            int i85 = i78 + iRotateLeft14;
            int iRotateLeft15 = Integers.rotateLeft(iRotateLeft13 ^ i85, i36);
            int i86 = i79 + iRotateLeft15;
            int iRotateLeft16 = Integers.rotateLeft(iRotateLeft14 ^ i86, i29);
            int i87 = i65 + iRotateLeft6;
            char c27 = c18;
            int iRotateLeft17 = Integers.rotateLeft(iRotateLeft2 ^ i87, i16);
            int i88 = i56 + iRotateLeft17;
            int iRotateLeft18 = Integers.rotateLeft(iRotateLeft6 ^ i88, i46);
            int i89 = i87 + iRotateLeft18;
            int iRotateLeft19 = Integers.rotateLeft(iRotateLeft17 ^ i89, i36);
            int i95 = i88 + iRotateLeft19;
            int iRotateLeft20 = Integers.rotateLeft(iRotateLeft18 ^ i95, i29);
            int i96 = i59 + iRotateLeft5;
            int iRotateLeft21 = Integers.rotateLeft(iRotateLeft ^ i96, 16);
            int i97 = i55 + iRotateLeft21;
            int iRotateLeft22 = Integers.rotateLeft(iRotateLeft5 ^ i97, i46);
            int i98 = i96 + iRotateLeft22;
            int iRotateLeft23 = Integers.rotateLeft(iRotateLeft21 ^ i98, 8);
            int i99 = i97 + iRotateLeft23;
            int iRotateLeft24 = Integers.rotateLeft(iRotateLeft22 ^ i99, 7);
            int i100 = i76 + iRotateLeft16;
            int iRotateLeft25 = Integers.rotateLeft(iRotateLeft23 ^ i100, 16);
            int i101 = i95 + iRotateLeft25;
            int iRotateLeft26 = Integers.rotateLeft(iRotateLeft16 ^ i101, 12);
            i67 = i100 + iRotateLeft26;
            iRotateLeft = Integers.rotateLeft(iRotateLeft25 ^ i67, 8);
            i56 = i101 + iRotateLeft;
            iRotateLeft7 = Integers.rotateLeft(iRotateLeft26 ^ i56, 7);
            int i102 = i85 + iRotateLeft20;
            int iRotateLeft27 = Integers.rotateLeft(iRotateLeft11 ^ i102, 16);
            int i103 = i99 + iRotateLeft27;
            int iRotateLeft28 = Integers.rotateLeft(iRotateLeft20 ^ i103, 12);
            i66 = i102 + iRotateLeft28;
            iRotateLeft4 = Integers.rotateLeft(iRotateLeft27 ^ i66, 8);
            i55 = i103 + iRotateLeft4;
            iRotateLeft6 = Integers.rotateLeft(iRotateLeft28 ^ i55, 7);
            int i104 = i89 + iRotateLeft24;
            int iRotateLeft29 = Integers.rotateLeft(iRotateLeft15 ^ i104, 16);
            int i105 = i77 + iRotateLeft29;
            int iRotateLeft30 = Integers.rotateLeft(iRotateLeft24 ^ i105, 12);
            i65 = i104 + iRotateLeft30;
            iRotateLeft3 = Integers.rotateLeft(iRotateLeft29 ^ i65, 8);
            i58 = i105 + iRotateLeft3;
            iRotateLeft5 = Integers.rotateLeft(iRotateLeft30 ^ i58, 7);
            int i106 = i98 + iRotateLeft12;
            int iRotateLeft31 = Integers.rotateLeft(iRotateLeft19 ^ i106, 16);
            int i107 = i86 + iRotateLeft31;
            int iRotateLeft32 = Integers.rotateLeft(iRotateLeft12 ^ i107, 12);
            i59 = i106 + iRotateLeft32;
            iRotateLeft2 = Integers.rotateLeft(iRotateLeft31 ^ i59, 8);
            i57 = i107 + iRotateLeft2;
            iRotateLeft8 = Integers.rotateLeft(iRotateLeft32 ^ i57, 7);
            i68 -= 2;
            i16 = 16;
            c15 = c19;
            c16 = c25;
            c17 = c26;
            c18 = c27;
            i29 = 7;
            i36 = 8;
            i46 = 12;
        }
        char c28 = c15;
        char c29 = c16;
        char c35 = c17;
        char c36 = c18;
        iArr2[0] = i67 + iArr[0];
        iArr2[1] = i66 + iArr[1];
        iArr2[2] = i65 + iArr[2];
        iArr2[c28] = i59 + iArr[c28];
        iArr2[c29] = iRotateLeft8 + iArr[c29];
        iArr2[c35] = iRotateLeft7 + iArr[c35];
        iArr2[c36] = iRotateLeft6 + iArr[c36];
        iArr2[7] = iRotateLeft5 + iArr[7];
        iArr2[8] = i58 + iArr[8];
        iArr2[9] = i57 + iArr[9];
        iArr2[10] = i56 + iArr[10];
        iArr2[11] = i55 + iArr[11];
        iArr2[12] = iRotateLeft4 + iArr[12];
        iArr2[13] = iRotateLeft3 + iArr[13];
        iArr2[14] = iRotateLeft2 + iArr[14];
        iArr2[15] = iRotateLeft + iArr[15];
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i15 = iArr[12] + 1;
        iArr[12] = i15;
        if (i15 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f149061x);
        Pack.intToLittleEndian(this.f149061x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[13]) << 32) | (((long) iArr[12]) & BodyPartID.bodyIdMax);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter() {
        int[] iArr = this.engineState;
        int i15 = iArr[12];
        if (i15 == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i16 = i15 - 1;
        iArr[12] = i16;
        if (i16 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i15) {
        super(i15);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter(long j15) {
        int i15 = (int) (j15 >>> 32);
        int i16 = (int) j15;
        if (i15 > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i15;
        }
        int[] iArr2 = this.engineState;
        int i17 = iArr2[12];
        int i18 = i16 + i17;
        iArr2[12] = i18;
        if (i17 == 0 || i18 >= i17) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter(long j15) {
        int i15 = (int) (j15 >>> 32);
        int i16 = (int) j15;
        if (i15 != 0) {
            int[] iArr = this.engineState;
            int i17 = iArr[13];
            if ((((long) i17) & BodyPartID.bodyIdMax) < (((long) i15) & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[13] = i17 - i15;
        }
        int[] iArr2 = this.engineState;
        int i18 = iArr2[12];
        if ((((long) i18) & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & ((long) i16))) {
            iArr2[12] = i18 - i16;
            return;
        }
        int i19 = iArr2[13];
        if (i19 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[13] = i19 - 1;
        iArr2[12] = i18 - i16;
    }
}
