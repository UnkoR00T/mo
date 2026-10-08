package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index = 4;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 3) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i15 = this.index;
        this.index = i15 + 1;
        return bArr[i15];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = (i15 >>> 2) | (i16 << 30);
        int i18 = (i15 >>> 12) | (i16 << 20);
        int i19 = (i15 >>> 15) | (i16 << 17);
        int i25 = iArr[2];
        int i26 = (i16 >>> 4) | (i25 << 28);
        int i27 = (i16 >>> 13) | (i25 << 19);
        int i28 = iArr[3];
        int i29 = (i25 >>> 9) | (i28 << 23);
        int i35 = (i25 >>> 25) | (i28 << 7);
        int i36 = (i28 << 1) | (i25 >>> 31);
        int[] iArr2 = this.lfsr;
        int i37 = iArr2[0];
        int i38 = iArr2[1];
        int i39 = (i37 >>> 8) | (i38 << 24);
        int i45 = (i37 >>> 13) | (i38 << 19);
        int i46 = (i37 >>> 20) | (i38 << 12);
        int i47 = iArr2[2];
        int i48 = iArr2[3];
        int i49 = i45 & i46;
        return ((((((((((i36 & i18) & ((i48 << 1) | (i47 >>> 31))) ^ (((i49 ^ (i18 & i39)) ^ (i36 & ((i38 >>> 10) | (i47 << 22)))) ^ (((i38 >>> 28) | (i47 << 4)) & ((i47 >>> 15) | (i48 << 17))))) ^ ((i47 >>> 29) | (i48 << 3))) ^ i17) ^ i19) ^ i26) ^ i27) ^ i25) ^ i29) ^ i35;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = (i15 >>> 7) | (i16 << 25);
        int i18 = iArr[2];
        int i19 = iArr[3];
        int i25 = (i18 >>> 6) | (i19 << 26);
        return i19 ^ ((((i15 ^ i17) ^ ((i16 >>> 6) | (i18 << 26))) ^ i25) ^ ((i18 >>> 17) | (i19 << 15)));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = (i15 >>> 3) | (i16 << 29);
        int i18 = (i15 >>> 11) | (i16 << 21);
        int i19 = (i15 >>> 13) | (i16 << 19);
        int i25 = (i15 >>> 17) | (i16 << 15);
        int i26 = (i15 >>> 18) | (i16 << 14);
        int i27 = (i15 >>> 26) | (i16 << 6);
        int i28 = (i15 >>> 27) | (i16 << 5);
        int i29 = iArr[2];
        int i35 = (i16 >>> 8) | (i29 << 24);
        int i36 = (i16 >>> 16) | (i29 << 16);
        int i37 = (i16 >>> 24) | (i29 << 8);
        int i38 = (i16 >>> 27) | (i29 << 5);
        int i39 = (i16 >>> 29) | (i29 << 3);
        int i45 = iArr[3];
        return (((((((i45 ^ (((i15 ^ i27) ^ i37) ^ ((i29 >>> 27) | (i45 << 5)))) ^ (i17 & ((i29 >>> 3) | (i45 << 29)))) ^ (i18 & i19)) ^ (i25 & i26)) ^ (i28 & i38)) ^ (i35 & i36)) ^ (i39 & ((i29 >>> 1) | (i45 << 31)))) ^ (((i29 >>> 4) | (i45 << 28)) & ((i29 >>> 20) | (i45 << 12)));
    }

    private void initGrain() {
        for (int i15 = 0; i15 < 8; i15++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        bArr[2] = (byte) (output >> 16);
        bArr[3] = (byte) (output >> 24);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i15 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i17 = i16 + 3;
            int i18 = i16 + 2;
            int i19 = i16 + 1;
            iArr[i15] = (bArr3[i16] & 255) | (bArr3[i17] << 24) | ((bArr3[i18] << 16) & 16711680) | ((bArr3[i19] << 8) & 65280);
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i15] = (bArr4[i16] & 255) | (bArr4[i17] << 24) | ((bArr4[i18] << 16) & 16711680) | ((bArr4[i19] << 8) & 65280);
            i16 += 4;
            i15++;
        }
    }

    private int[] shift(int[] iArr, int i15) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i15;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv4 = parametersWithIV.getIV();
        if (iv4 == null || iv4.length != 12) {
            throw new IllegalArgumentException("Grain-128 requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128 init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Grain-128 key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z15)));
        byte[] bArr = new byte[key.length];
        this.workingIV = bArr;
        this.workingKey = new byte[key.length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
        System.arraycopy(iv4, 0, bArr, 0, iv4.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i15 + i16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i18 = 0; i18 < i16; i18++) {
            bArr2[i17 + i18] = (byte) (bArr[i15 + i18] ^ getKeyStream());
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 4;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b15) {
        if (this.initialised) {
            return (byte) (b15 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
