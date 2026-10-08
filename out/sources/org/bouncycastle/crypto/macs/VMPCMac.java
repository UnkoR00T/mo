package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class VMPCMac implements Mac {
    private byte[] T;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f149115g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private byte f149118x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private byte f149119x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private byte f149120x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private byte f149121x4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f149116n = 0;
    private byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f149117s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f149117s = (byte) 0;
        this.P = new byte[256];
        for (int i15 = 0; i15 < 256; i15++) {
            this.P[i15] = (byte) i15;
        }
        for (int i16 = 0; i16 < 768; i16++) {
            byte[] bArr3 = this.P;
            byte b15 = this.f149117s;
            int i17 = i16 & GF2Field.MASK;
            byte b16 = bArr3[i17];
            byte b17 = bArr3[(b15 + b16 + bArr[i16 % bArr.length]) & GF2Field.MASK];
            this.f149117s = b17;
            bArr3[i17] = bArr3[b17 & 255];
            bArr3[b17 & 255] = b16;
        }
        for (int i18 = 0; i18 < 768; i18++) {
            byte[] bArr4 = this.P;
            byte b18 = this.f149117s;
            int i19 = i18 & GF2Field.MASK;
            byte b19 = bArr4[i19];
            byte b25 = bArr4[(b18 + b19 + bArr2[i18 % bArr2.length]) & GF2Field.MASK];
            this.f149117s = b25;
            bArr4[i19] = bArr4[b25 & 255];
            bArr4[b25 & 255] = b19;
        }
        this.f149116n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i15) {
        for (int i16 = 1; i16 < 25; i16++) {
            byte[] bArr2 = this.P;
            byte b15 = this.f149117s;
            byte b16 = this.f149116n;
            byte b17 = bArr2[(b15 + bArr2[b16 & 255]) & GF2Field.MASK];
            this.f149117s = b17;
            byte b18 = this.f149121x4;
            byte b19 = this.f149120x3;
            byte b25 = bArr2[(b18 + b19 + i16) & GF2Field.MASK];
            this.f149121x4 = b25;
            byte b26 = this.f149119x2;
            byte b27 = bArr2[(b19 + b26 + i16) & GF2Field.MASK];
            this.f149120x3 = b27;
            byte b28 = this.f149118x1;
            byte b29 = bArr2[(b26 + b28 + i16) & GF2Field.MASK];
            this.f149119x2 = b29;
            byte b35 = bArr2[(b28 + b17 + i16) & GF2Field.MASK];
            this.f149118x1 = b35;
            byte[] bArr3 = this.T;
            byte b36 = this.f149115g;
            bArr3[b36 & 31] = (byte) (b35 ^ bArr3[b36 & 31]);
            bArr3[(b36 + 1) & 31] = (byte) (b29 ^ bArr3[(b36 + 1) & 31]);
            bArr3[(b36 + 2) & 31] = (byte) (b27 ^ bArr3[(b36 + 2) & 31]);
            bArr3[(b36 + 3) & 31] = (byte) (b25 ^ bArr3[(b36 + 3) & 31]);
            this.f149115g = (byte) ((b36 + 4) & 31);
            byte b37 = bArr2[b16 & 255];
            bArr2[b16 & 255] = bArr2[b17 & 255];
            bArr2[b17 & 255] = b37;
            this.f149116n = (byte) ((b16 + 1) & GF2Field.MASK);
        }
        for (int i17 = 0; i17 < 768; i17++) {
            byte[] bArr4 = this.P;
            byte b38 = this.f149117s;
            int i18 = i17 & GF2Field.MASK;
            byte b39 = bArr4[i18];
            byte b45 = bArr4[(b38 + b39 + this.T[i17 & 31]) & GF2Field.MASK];
            this.f149117s = b45;
            bArr4[i18] = bArr4[b45 & 255];
            bArr4[b45 & 255] = b39;
        }
        byte[] bArr5 = new byte[20];
        for (int i19 = 0; i19 < 20; i19++) {
            byte[] bArr6 = this.P;
            byte b46 = this.f149117s;
            int i25 = i19 & GF2Field.MASK;
            byte b47 = bArr6[(b46 + bArr6[i25]) & GF2Field.MASK];
            this.f149117s = b47;
            bArr5[i19] = bArr6[(bArr6[bArr6[b47 & 255] & 255] + 1) & GF2Field.MASK];
            byte b48 = bArr6[i25];
            bArr6[i25] = bArr6[b47 & 255];
            bArr6[b47 & 255] = b48;
        }
        System.arraycopy(bArr5, 0, bArr, i15, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv4 = parametersWithIV.getIV();
        this.workingIV = iv4;
        if (iv4 == null || iv4.length < 1 || iv4.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f149116n = (byte) 0;
        this.f149121x4 = (byte) 0;
        this.f149120x3 = (byte) 0;
        this.f149119x2 = (byte) 0;
        this.f149118x1 = (byte) 0;
        this.f149115g = (byte) 0;
        this.T = new byte[32];
        for (int i15 = 0; i15 < 32; i15++) {
            this.T[i15] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b15) {
        byte[] bArr = this.P;
        byte b16 = this.f149117s;
        byte b17 = this.f149116n;
        byte b18 = bArr[(b16 + bArr[b17 & 255]) & GF2Field.MASK];
        this.f149117s = b18;
        byte b19 = (byte) (b15 ^ bArr[(bArr[bArr[b18 & 255] & 255] + 1) & GF2Field.MASK]);
        byte b25 = this.f149121x4;
        byte b26 = this.f149120x3;
        byte b27 = bArr[(b25 + b26) & GF2Field.MASK];
        this.f149121x4 = b27;
        byte b28 = this.f149119x2;
        byte b29 = bArr[(b26 + b28) & GF2Field.MASK];
        this.f149120x3 = b29;
        byte b35 = this.f149118x1;
        byte b36 = bArr[(b28 + b35) & GF2Field.MASK];
        this.f149119x2 = b36;
        byte b37 = bArr[(b35 + b18 + b19) & GF2Field.MASK];
        this.f149118x1 = b37;
        byte[] bArr2 = this.T;
        byte b38 = this.f149115g;
        bArr2[b38 & 31] = (byte) (b37 ^ bArr2[b38 & 31]);
        bArr2[(b38 + 1) & 31] = (byte) (b36 ^ bArr2[(b38 + 1) & 31]);
        bArr2[(b38 + 2) & 31] = (byte) (b29 ^ bArr2[(b38 + 2) & 31]);
        bArr2[(b38 + 3) & 31] = (byte) (b27 ^ bArr2[(b38 + 3) & 31]);
        this.f149115g = (byte) ((b38 + 4) & 31);
        byte b39 = bArr[b17 & 255];
        bArr[b17 & 255] = bArr[b18 & 255];
        bArr[b18 & 255] = b39;
        this.f149116n = (byte) ((b17 + 1) & GF2Field.MASK);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i15, int i16) {
        if (i15 + i16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i17 = 0; i17 < i16; i17++) {
            update(bArr[i15 + i17]);
        }
    }
}
