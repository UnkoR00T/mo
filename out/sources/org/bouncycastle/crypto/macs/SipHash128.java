package org.bouncycastle.crypto.macs;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i15) {
        long j15 = this.f149110m;
        int i16 = this.wordPos;
        this.f149110m = ((j15 >>> ((7 - i16) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i16)) & 255) << 56);
        processMessageWord();
        this.f149113v2 ^= 238;
        applySipRounds(this.f149107d);
        long j16 = this.f149111v0;
        long j17 = this.f149112v1;
        long j18 = ((j16 ^ j17) ^ this.f149113v2) ^ this.f149114v3;
        this.f149112v1 = j17 ^ 221;
        applySipRounds(this.f149107d);
        long j19 = ((this.f149111v0 ^ this.f149112v1) ^ this.f149113v2) ^ this.f149114v3;
        reset();
        Pack.longToLittleEndian(j18, bArr, i15);
        Pack.longToLittleEndian(j19, bArr, i15 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f149106c + "-" + this.f149107d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f149112v1 ^= 238;
    }

    public SipHash128(int i15, int i16) {
        super(i15, i16);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
