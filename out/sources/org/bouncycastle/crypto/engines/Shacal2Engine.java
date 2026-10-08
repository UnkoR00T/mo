package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class Shacal2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 32;
    private static final int[] K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private static final int ROUNDS = 64;
    private boolean forEncryption = false;
    private int[] workingKey = null;

    private void byteBlockToInts(byte[] bArr, int[] iArr, int i15, int i16) {
        while (i16 < 8) {
            int i17 = ((bArr[i15 + 1] & GF2Field.MASK) << 16) | ((bArr[i15] & GF2Field.MASK) << 24);
            int i18 = i15 + 3;
            int i19 = ((bArr[i15 + 2] & GF2Field.MASK) << 8) | i17;
            i15 += 4;
            iArr[i16] = i19 | (bArr[i18] & GF2Field.MASK);
            i16++;
        }
    }

    private void bytes2ints(byte[] bArr, int[] iArr, int i15, int i16) {
        while (i16 < bArr.length / 4) {
            int i17 = ((bArr[i15 + 1] & GF2Field.MASK) << 16) | ((bArr[i15] & GF2Field.MASK) << 24);
            int i18 = i15 + 3;
            int i19 = i17 | ((bArr[i15 + 2] & GF2Field.MASK) << 8);
            i15 += 4;
            iArr[i16] = i19 | (bArr[i18] & GF2Field.MASK);
            i16++;
        }
    }

    private void decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i15, 0);
        for (int i17 = 63; i17 > -1; i17--) {
            int i18 = iArr[0];
            int i19 = iArr[1];
            int i25 = iArr[2];
            int i26 = iArr[3];
            int i27 = (i18 - ((((i19 >>> 2) | (i19 << (-2))) ^ ((i19 >>> 13) | (i19 << (-13)))) ^ ((i19 >>> 22) | (i19 << (-22))))) - (((i19 & i25) ^ (i19 & i26)) ^ (i25 & i26));
            iArr[0] = i19;
            iArr[1] = i25;
            iArr[2] = i26;
            iArr[3] = iArr[4] - i27;
            int i28 = iArr[5];
            iArr[4] = i28;
            int i29 = iArr[6];
            iArr[5] = i29;
            int i35 = iArr[7];
            iArr[6] = i35;
            iArr[7] = (((i27 - K[i17]) - this.workingKey[i17]) - ((((i28 >>> 6) | (i28 << (-6))) ^ ((i28 >>> 11) | (i28 << (-11)))) ^ ((i28 >>> 25) | (i28 << (-25))))) - ((i28 & i29) ^ ((~i28) & i35));
        }
        ints2bytes(iArr, bArr2, i16);
    }

    private void encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i15, 0);
        for (int i17 = 0; i17 < 64; i17++) {
            int i18 = iArr[4];
            int i19 = iArr[5];
            int i25 = ~i18;
            int i26 = iArr[6];
            int i27 = ((((i18 >>> 6) | (i18 << (-6))) ^ ((i18 >>> 11) | (i18 << (-11)))) ^ ((i18 >>> 25) | (i18 << (-25)))) + ((i18 & i19) ^ (i25 & i26)) + iArr[7] + K[i17] + this.workingKey[i17];
            iArr[7] = i26;
            iArr[6] = i19;
            iArr[5] = i18;
            iArr[4] = iArr[3] + i27;
            int i28 = iArr[2];
            iArr[3] = i28;
            int i29 = iArr[1];
            iArr[2] = i29;
            int i35 = iArr[0];
            iArr[1] = i35;
            iArr[0] = i27 + ((((i35 >>> 2) | (i35 << (-2))) ^ ((i35 >>> 13) | (i35 << (-13)))) ^ ((i35 >>> 22) | (i35 << (-22)))) + (((i35 & i28) ^ (i35 & i29)) ^ (i29 & i28));
        }
        ints2bytes(iArr, bArr2, i16);
    }

    private void ints2bytes(int[] iArr, byte[] bArr, int i15) {
        for (int i16 : iArr) {
            bArr[i15] = (byte) (i16 >>> 24);
            bArr[i15 + 1] = (byte) (i16 >>> 16);
            int i17 = i15 + 3;
            bArr[i15 + 2] = (byte) (i16 >>> 8);
            i15 += 4;
            bArr[i17] = (byte) i16;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Shacal2";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.forEncryption = z15;
        this.workingKey = new int[64];
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        setKey(key);
        int length = key.length * 8;
        String algorithmName = getAlgorithmName();
        if (length >= 256) {
            length = 256;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(algorithmName, length, cipherParameters, Utils.getPurpose(this.forEncryption)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        }
        if (i15 + 32 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + 32 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i15, bArr2, i16);
            return 32;
        }
        decryptBlock(bArr, i15, bArr2, i16);
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public void setKey(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                bytes2ints(bArr, this.workingKey, 0, 0);
                for (int i15 = 16; i15 < 64; i15++) {
                    int[] iArr = this.workingKey;
                    int i16 = iArr[i15 - 2];
                    int i17 = ((i16 >>> 10) ^ (((i16 >>> 17) | (i16 << (-17))) ^ ((i16 >>> 19) | (i16 << (-19))))) + iArr[i15 - 7];
                    int i18 = iArr[i15 - 15];
                    iArr[i15] = i17 + ((i18 >>> 3) ^ (((i18 >>> 7) | (i18 << (-7))) ^ ((i18 >>> 18) | (i18 << (-18))))) + iArr[i15 - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
    }
}
