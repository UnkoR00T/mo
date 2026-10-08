package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private boolean forEncryption;
    private byte[] engineState = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f149052x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f149053y = 0;
    private byte[] workingKey = null;

    public RC4Engine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20));
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f149052x = 0;
        this.f149053y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i15 = 0; i15 < 256; i15++) {
            this.engineState[i15] = (byte) i15;
        }
        int length = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 256; i17++) {
            int i18 = bArr[length] & 255;
            byte[] bArr2 = this.engineState;
            byte b15 = bArr2[i17];
            i16 = (i18 + b15 + i16) & GF2Field.MASK;
            bArr2[i17] = bArr2[i16];
            bArr2[i16] = b15;
            length = (length + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        this.forEncryption = z15;
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20, cipherParameters, Utils.getPurpose(z15)));
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (i15 + i16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = (this.f149052x + 1) & GF2Field.MASK;
            this.f149052x = i19;
            byte[] bArr3 = this.engineState;
            byte b15 = bArr3[i19];
            int i25 = (this.f149053y + b15) & GF2Field.MASK;
            this.f149053y = i25;
            bArr3[i19] = bArr3[i25];
            bArr3[i25] = b15;
            bArr2[i18 + i17] = (byte) (bArr3[(bArr3[i19] + b15) & GF2Field.MASK] ^ bArr[i18 + i15]);
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b15) {
        int i15 = (this.f149052x + 1) & GF2Field.MASK;
        this.f149052x = i15;
        byte[] bArr = this.engineState;
        byte b16 = bArr[i15];
        int i16 = (this.f149053y + b16) & GF2Field.MASK;
        this.f149053y = i16;
        bArr[i15] = bArr[i16];
        bArr[i16] = b16;
        return (byte) (b15 ^ bArr[(bArr[i15] + b16) & GF2Field.MASK]);
    }
}
