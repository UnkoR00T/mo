package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes5.dex */
abstract class AsconBaseEngine extends AEADBaseEngine {
    protected long ASCON_IV;
    protected long K0;
    protected long K1;
    protected long N0;
    protected long N1;
    protected long dsep;

    /* JADX INFO: renamed from: nr, reason: collision with root package name */
    protected int f149014nr;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    AsconPermutationFriend.AsconPermutation f149015p = new AsconPermutationFriend.AsconPermutation();

    AsconBaseEngine() {
    }

    protected abstract void ascon_aeadinit();

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void finishAAD(AEADBaseEngine.State state, boolean z15) {
        int i15 = this.m_state.ord;
        if (i15 == 2 || i15 == 6) {
            processFinalAAD();
            this.f149015p.p(this.f149014nr);
        }
        this.f149015p.f149020x4 ^= this.dsep;
        this.m_aadPos = 0;
        this.m_state = state;
    }

    public abstract String getAlgorithmVersion();

    protected abstract long loadBytes(byte[] bArr, int i15);

    protected abstract long pad(int i15);

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferAAD(byte[] bArr, int i15) {
        this.f149015p.f149016x0 ^= loadBytes(bArr, i15);
        if (this.BlockSize == 16) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
            asconPermutation.f149017x1 = loadBytes(bArr, i15 + 8) ^ asconPermutation.f149017x1;
        }
        this.f149015p.p(this.f149014nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        long jLoadBytes = loadBytes(bArr, i15);
        setBytes(this.f149015p.f149016x0 ^ jLoadBytes, bArr2, i16);
        this.f149015p.f149016x0 = jLoadBytes;
        if (this.BlockSize == 16) {
            long jLoadBytes2 = loadBytes(bArr, i15 + 8);
            setBytes(this.f149015p.f149017x1 ^ jLoadBytes2, bArr2, i16 + 8);
            this.f149015p.f149017x1 = jLoadBytes2;
        }
        this.f149015p.p(this.f149014nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        this.f149015p.f149016x0 ^= loadBytes(bArr, i15);
        setBytes(this.f149015p.f149016x0, bArr2, i16);
        if (this.BlockSize == 16) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f149015p;
            asconPermutation.f149017x1 = loadBytes(bArr, i15 + 8) ^ asconPermutation.f149017x1;
            setBytes(this.f149015p.f149017x1, bArr2, i16 + 8);
        }
        this.f149015p.p(this.f149014nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void processFinalBlock(byte[] bArr, int i15) {
        if (this.forEncryption) {
            processFinalEncrypt(this.m_buf, this.m_bufPos, bArr, i15);
        } else {
            processFinalDecrypt(this.m_buf, this.m_bufPos, bArr, i15);
        }
        setBytes(this.f149015p.f149019x3, this.mac, 0);
        setBytes(this.f149015p.f149020x4, this.mac, 8);
    }

    protected abstract void processFinalDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16);

    protected abstract void processFinalEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16);

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    protected void reset(boolean z15) {
        super.reset(z15);
        ascon_aeadinit();
    }

    protected abstract void setBytes(long j15, byte[] bArr, int i15);
}
