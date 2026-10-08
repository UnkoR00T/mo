package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;

/* JADX INFO: loaded from: classes5.dex */
abstract class AsconBaseDigest extends BufferBaseDigest {
    protected int ASCON_PB_ROUNDS;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    AsconPermutationFriend.AsconPermutation f148964p;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    protected AsconBaseDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 8);
        this.ASCON_PB_ROUNDS = 12;
        this.f148964p = AsconPermutationFriend.getAsconPermutation(ISAPDigest.Friend.getFriend(Friend.INSTANCE));
        this.DigestSize = 32;
    }

    protected void ensureSufficientOutputBuffer(byte[] bArr, int i15, int i16) {
        if (i15 + i16 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    protected void finish(byte[] bArr, int i15) {
        padAndAbsorb();
        squeeze(bArr, i15, this.DigestSize);
    }

    protected int hash(byte[] bArr, int i15, int i16) {
        ensureSufficientOutputBuffer(bArr, i15, i16);
        padAndAbsorb();
        squeeze(bArr, i15, i16);
        return i16;
    }

    protected abstract long loadBytes(byte[] bArr, int i15);

    protected abstract long loadBytes(byte[] bArr, int i15, int i16);

    protected abstract long pad(int i15);

    protected void padAndAbsorb() {
        this.f148964p.f149016x0 ^= loadBytes(this.m_buf, 0, this.m_bufPos) ^ pad(this.m_bufPos);
        this.f148964p.p(12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    protected void processBytes(byte[] bArr, int i15) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f148964p;
        asconPermutation.f149016x0 = loadBytes(bArr, i15) ^ asconPermutation.f149016x0;
        this.f148964p.p(this.ASCON_PB_ROUNDS);
    }

    protected abstract void setBytes(long j15, byte[] bArr, int i15);

    protected abstract void setBytes(long j15, byte[] bArr, int i15, int i16);

    protected void squeeze(byte[] bArr, int i15, int i16) {
        int i17 = i15;
        int i18 = i16;
        while (i18 > this.BlockSize) {
            setBytes(this.f148964p.f149016x0, bArr, i17);
            this.f148964p.p(this.ASCON_PB_ROUNDS);
            int i19 = this.BlockSize;
            i17 += i19;
            i18 -= i19;
        }
        setBytes(this.f148964p.f149016x0, bArr, i17, i18);
    }
}
