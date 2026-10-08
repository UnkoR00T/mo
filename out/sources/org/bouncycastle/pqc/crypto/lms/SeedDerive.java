package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes5.dex */
class SeedDerive {
    private final byte[] I;
    private final Digest digest;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f149492j;
    private final byte[] masterSeed;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f149493q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z15) {
        deriveSeed(bArr, z15, 0);
    }

    public byte[] getI() {
        return this.I;
    }

    public int getJ() {
        return this.f149492j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f149493q;
    }

    public void setJ(int i15) {
        this.f149492j = i15;
    }

    public void setQ(int i15) {
        this.f149493q = i15;
    }

    public void deriveSeed(byte[] bArr, boolean z15, int i15) {
        deriveSeed(bArr, i15);
        if (z15) {
            this.f149492j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i15) {
        if (bArr.length - i15 < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f149493q >>> 24));
        this.digest.update((byte) (this.f149493q >>> 16));
        this.digest.update((byte) (this.f149493q >>> 8));
        this.digest.update((byte) this.f149493q);
        this.digest.update((byte) (this.f149492j >>> 8));
        this.digest.update((byte) this.f149492j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i15);
        return bArr;
    }
}
