package org.bouncycastle.crypto.engines;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.bouncycastle.crypto.engines.VMPCEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.crypto.engines.VMPCEngine
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
        for (int i25 = 0; i25 < 768; i25++) {
            byte[] bArr5 = this.P;
            byte b26 = this.f149068s;
            int i26 = i25 & GF2Field.MASK;
            byte b27 = bArr5[i26];
            byte b28 = bArr5[(b26 + b27 + bArr[i25 % bArr.length]) & GF2Field.MASK];
            this.f149068s = b28;
            bArr5[i26] = bArr5[b28 & 255];
            bArr5[b28 & 255] = b27;
        }
        this.f149067n = (byte) 0;
    }
}
