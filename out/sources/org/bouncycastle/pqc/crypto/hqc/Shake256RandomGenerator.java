package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes5.dex */
class Shake256RandomGenerator {
    private final SHAKEDigest digest;

    public Shake256RandomGenerator(byte[] bArr, byte b15) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        this.digest = sHAKEDigest;
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.update(b15);
    }

    public void init(byte[] bArr, int i15, int i16, byte b15) {
        this.digest.reset();
        this.digest.update(bArr, i15, i16);
        this.digest.update(b15);
    }

    public void nextBytes(byte[] bArr) {
        this.digest.doOutput(bArr, 0, bArr.length);
    }

    public void xofGetBytes(byte[] bArr, int i15) {
        int i16 = i15 & 7;
        int i17 = i15 - i16;
        this.digest.doOutput(bArr, 0, i17);
        if (i16 != 0) {
            byte[] bArr2 = new byte[8];
            this.digest.doOutput(bArr2, 0, 8);
            System.arraycopy(bArr2, 0, bArr, i17, i16);
        }
    }

    public Shake256RandomGenerator(byte[] bArr, int i15, int i16, byte b15) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        this.digest = sHAKEDigest;
        sHAKEDigest.update(bArr, i15, i16);
        sHAKEDigest.update(b15);
    }

    public void nextBytes(byte[] bArr, int i15, int i16) {
        this.digest.doOutput(bArr, i15, i16);
    }
}
