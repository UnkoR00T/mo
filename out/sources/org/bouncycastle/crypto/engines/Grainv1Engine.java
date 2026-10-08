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
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 1) {
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
        int i17 = (i15 >>> 1) | (i16 << 15);
        int i18 = (i15 >>> 2) | (i16 << 14);
        int i19 = (i15 >>> 4) | (i16 << 12);
        int i25 = (i15 >>> 10) | (i16 << 6);
        int i26 = iArr[2];
        int i27 = (i16 >>> 15) | (i26 << 1);
        int i28 = iArr[3];
        int i29 = (i26 >>> 11) | (i28 << 5);
        int i35 = iArr[4];
        int i36 = (i28 >>> 8) | (i35 << 8);
        int i37 = (i35 << 1) | (i28 >>> 15);
        int[] iArr2 = this.lfsr;
        int i38 = iArr2[0] >>> 3;
        int i39 = iArr2[1];
        int i45 = i38 | (i39 << 13);
        int i46 = iArr2[2];
        int i47 = (i39 >>> 9) | (i46 << 7);
        int i48 = (iArr2[3] << 2) | (i46 >>> 14);
        int i49 = iArr2[4];
        int i55 = i48 & i49;
        int i56 = ((((i47 ^ i37) ^ (i45 & i49)) ^ i55) ^ (i49 & i37)) ^ ((i45 & i47) & i48);
        int i57 = i45 & i48;
        return (((((((((i37 & i55) ^ (((i57 & i37) ^ ((i49 & i57) ^ i56)) ^ ((i47 & i48) & i37))) ^ i17) ^ i18) ^ i19) ^ i25) ^ i27) ^ i29) ^ i36) & 65535;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = (i15 >>> 13) | (i16 << 3);
        int i18 = iArr[2];
        int i19 = (i16 >>> 7) | (i18 << 9);
        int i25 = iArr[3];
        int i26 = (i18 >>> 6) | (i25 << 10);
        int i27 = iArr[4];
        int i28 = (i25 >>> 3) | (i27 << 13);
        return (((i27 << 2) | (i25 >>> 14)) ^ ((((i15 ^ i17) ^ i19) ^ i26) ^ i28)) & 65535;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = (i15 >>> 9) | (i16 << 7);
        int i18 = (i15 >>> 14) | (i16 << 2);
        int i19 = (i15 >>> 15) | (i16 << 1);
        int i25 = iArr[2];
        int i26 = (i16 >>> 5) | (i25 << 11);
        int i27 = (i16 >>> 12) | (i25 << 4);
        int i28 = iArr[3];
        int i29 = (i25 >>> 1) | (i28 << 15);
        int i35 = (i25 >>> 5) | (i28 << 11);
        int i36 = (i25 >>> 13) | (i28 << 3);
        int i37 = iArr[4];
        int i38 = (i28 >>> 4) | (i37 << 12);
        int i39 = (i28 >>> 12) | (i37 << 4);
        int i45 = (i28 >>> 14) | (i37 << 2);
        int i46 = (i37 << 1) | (i28 >>> 15);
        int i47 = i46 & i39;
        int i48 = (((i15 ^ (((((((((i45 ^ i39) ^ i38) ^ i36) ^ i35) ^ i29) ^ i27) ^ i26) ^ i18) ^ i17)) ^ i47) ^ (i35 & i29)) ^ (i19 & i17);
        int i49 = i39 & i38;
        int i55 = i29 & i27 & i26;
        return (((((((((i46 & i36) & i27) & i17) ^ ((i48 ^ (i49 & i36)) ^ i55)) ^ ((i49 & i35) & i29)) ^ ((i47 & i26) & i19)) ^ (((i47 & i38) & i36) & i35)) ^ ((i55 & i19) & i17)) ^ (((((i38 & i36) & i35) & i29) & i27) & i26)) & 65535;
    }

    private void initGrain() {
        for (int i15 = 0; i15 < 10; i15++) {
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
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
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
            int i17 = i16 + 1;
            iArr[i15] = ((bArr3[i16] & 255) | (bArr3[i17] << 8)) & 65535;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i15] = ((bArr4[i16] & 255) | (bArr4[i17] << 8)) & 65535;
            i16 += 2;
            i15++;
        }
    }

    private int[] shift(int[] iArr, int i15) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i15;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain v1 init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv4 = parametersWithIV.getIV();
        if (iv4 == null || iv4.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain v1 init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 10) {
            throw new IllegalArgumentException("Grain v1 key must be 80 bits long");
        }
        byte[] bArr = new byte[key.length];
        this.workingIV = bArr;
        this.workingKey = new byte[key.length];
        this.lfsr = new int[5];
        this.nfsr = new int[5];
        this.out = new byte[2];
        System.arraycopy(iv4, 0, bArr, 0, iv4.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80, cipherParameters, Utils.getPurpose(z15)));
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
        this.index = 2;
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
