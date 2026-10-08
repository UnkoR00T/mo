package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class VMPCEngine implements StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected byte f149067n = 0;
    protected byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected byte f149068s = 0;

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        byte[] iv4 = parametersWithIV.getIV();
        this.workingIV = iv4;
        if (iv4 == null || iv4.length < 1 || iv4.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
        String algorithmName = getAlgorithmName();
        byte[] bArr = this.workingKey;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(algorithmName, bArr.length >= 32 ? 256 : bArr.length * 8, cipherParameters, Utils.getPurpose(z15)));
    }

    protected void initKey(byte[] bArr, byte[] bArr2) {
        this.f149068s = (byte) 0;
        this.P = new byte[256];
        for (int i15 = 0; i15 < 256; i15++) {
            this.P[i15] = (byte) i15;
        }
        for (int i16 = 0; i16 < 768; i16++) {
            byte[] bArr3 = this.P;
            byte b15 = this.f149068s;
            int i17 = i16 & GF2Field.MASK;
            byte b16 = bArr3[i17];
            byte b17 = bArr3[(b15 + b16 + bArr[i16 % bArr.length]) & GF2Field.MASK];
            this.f149068s = b17;
            bArr3[i17] = bArr3[b17 & 255];
            bArr3[b17 & 255] = b16;
        }
        for (int i18 = 0; i18 < 768; i18++) {
            byte[] bArr4 = this.P;
            byte b18 = this.f149068s;
            int i19 = i18 & GF2Field.MASK;
            byte b19 = bArr4[i19];
            byte b25 = bArr4[(b18 + b19 + bArr2[i18 % bArr2.length]) & GF2Field.MASK];
            this.f149068s = b25;
            bArr4[i19] = bArr4[b25 & 255];
            bArr4[b25 & 255] = b19;
        }
        this.f149067n = (byte) 0;
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
            byte[] bArr3 = this.P;
            byte b15 = this.f149068s;
            byte b16 = this.f149067n;
            byte b17 = bArr3[(b15 + bArr3[b16 & 255]) & GF2Field.MASK];
            this.f149068s = b17;
            byte b18 = bArr3[(bArr3[bArr3[b17 & 255] & 255] + 1) & GF2Field.MASK];
            byte b19 = bArr3[b16 & 255];
            bArr3[b16 & 255] = bArr3[b17 & 255];
            bArr3[b17 & 255] = b19;
            this.f149067n = (byte) ((b16 + 1) & GF2Field.MASK);
            bArr2[i18 + i17] = (byte) (bArr[i18 + i15] ^ b18);
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b15) {
        byte[] bArr = this.P;
        byte b16 = this.f149068s;
        byte b17 = this.f149067n;
        byte b18 = bArr[(b16 + bArr[b17 & 255]) & GF2Field.MASK];
        this.f149068s = b18;
        byte b19 = bArr[(bArr[bArr[b18 & 255] & 255] + 1) & GF2Field.MASK];
        byte b25 = bArr[b17 & 255];
        bArr[b17 & 255] = bArr[b18 & 255];
        bArr[b18 & 255] = b25;
        this.f149067n = (byte) ((b17 + 1) & GF2Field.MASK);
        return (byte) (b15 ^ b19);
    }
}
