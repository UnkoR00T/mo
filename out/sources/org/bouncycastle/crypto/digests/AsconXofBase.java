package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes5.dex */
abstract class AsconXofBase extends AsconBaseDigest implements Xof {
    private final byte[] buffer = new byte[this.BlockSize];
    private int bytesInBuffer;
    private boolean m_squeezing;

    AsconXofBase() {
    }

    private void ensureNoAbsorbWhileSqueezing(boolean z15) {
        if (z15) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    public int doFinal(byte[] bArr, int i15, int i16) {
        int iDoOutput = doOutput(bArr, i15, i16);
        reset();
        return iDoOutput;
    }

    public int doOutput(byte[] bArr, int i15, int i16) {
        int iHash;
        ensureSufficientOutputBuffer(bArr, i15, i16);
        int i17 = this.bytesInBuffer;
        if (i17 != 0) {
            int i18 = this.BlockSize - i17;
            iHash = Math.min(i16, i17);
            System.arraycopy(this.buffer, i18, bArr, i15, iHash);
            this.bytesInBuffer -= iHash;
        } else {
            iHash = 0;
        }
        int i19 = i16 - iHash;
        int i25 = this.BlockSize;
        if (i19 >= i25) {
            iHash += hash(bArr, i15 + iHash, i19 - (i19 % i25));
        }
        if (iHash >= i16) {
            return iHash;
        }
        hash(this.buffer, 0, this.BlockSize);
        int i26 = i16 - iHash;
        System.arraycopy(this.buffer, 0, bArr, i15 + iHash, i26);
        this.bytesInBuffer = this.buffer.length - i26;
        return iHash + i26;
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    protected void padAndAbsorb() {
        if (this.m_squeezing) {
            this.f148964p.p(this.ASCON_PB_ROUNDS);
        } else {
            this.m_squeezing = true;
            super.padAndAbsorb();
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        this.m_squeezing = false;
        this.bytesInBuffer = 0;
        super.reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void update(byte b15) {
        ensureNoAbsorbWhileSqueezing(this.m_squeezing);
        super.update(b15);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        ensureNoAbsorbWhileSqueezing(this.m_squeezing);
        super.update(bArr, i15, i16);
    }
}
