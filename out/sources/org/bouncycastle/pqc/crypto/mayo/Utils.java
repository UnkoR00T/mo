package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    Utils() {
    }

    public static void expandP1P2(MayoParameters mayoParameters, long[] jArr, byte[] bArr) {
        int p1Bytes = mayoParameters.getP1Bytes() + mayoParameters.getP2Bytes();
        byte[] bArr2 = new byte[p1Bytes];
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
        cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(Arrays.copyOf(bArr, mayoParameters.getPkSeedBytes())), new byte[16]));
        int blockSize = cTRModeCipherNewInstance.getBlockSize();
        byte[] bArr3 = new byte[blockSize];
        byte[] bArr4 = new byte[blockSize];
        int i15 = 0;
        while (true) {
            int i16 = i15 + blockSize;
            if (i16 > p1Bytes) {
                break;
            }
            cTRModeCipherNewInstance.processBlock(bArr3, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i15, blockSize);
            i15 = i16;
        }
        if (i15 < p1Bytes) {
            cTRModeCipherNewInstance.processBlock(bArr3, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i15, p1Bytes - i15);
        }
        unpackMVecs(bArr2, 0, jArr, 0, (mayoParameters.getP1Limbs() + mayoParameters.getP2Limbs()) / mayoParameters.getMVecLimbs(), mayoParameters.getM());
    }

    public static void packMVecs(long[] jArr, byte[] bArr, int i15, int i16, int i17) {
        int i18 = (i17 + 15) >> 4;
        int i19 = i17 >> 1;
        int i25 = (8 - (i18 << 3)) + i19;
        int i26 = 0;
        int i27 = 0;
        while (i26 < i16) {
            int i28 = 0;
            while (i28 < i18 - 1) {
                Pack.longToLittleEndian(jArr[i27 + i28], bArr, (i28 << 3) + i15);
                i28++;
            }
            Pack.longToLittleEndian(jArr[i27 + i28], bArr, (i28 << 3) + i15, i25);
            i26++;
            i15 += i19;
            i27 += i18;
        }
    }

    public static void unpackMVecs(byte[] bArr, int i15, long[] jArr, int i16, int i17, int i18) {
        int i19 = (i18 + 15) >> 4;
        int i25 = i18 >> 1;
        int i26 = (8 - (i19 << 3)) + i25;
        int i27 = i17 - 1;
        int i28 = i16 + (i27 * i19);
        int i29 = i15 + (i27 * i25);
        while (i27 >= 0) {
            int i35 = 0;
            while (i35 < i19 - 1) {
                jArr[i28 + i35] = Pack.littleEndianToLong(bArr, (i35 << 3) + i29);
                i35++;
            }
            jArr[i28 + i35] = Pack.littleEndianToLong(bArr, (i35 << 3) + i29, i26);
            i27--;
            i28 -= i19;
            i29 -= i25;
        }
    }
}
