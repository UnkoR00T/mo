package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class ISAPDigest extends BufferBaseDigest {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AsconPermutationFriend.AsconPermutation f148982p;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }

        static Friend getFriend(AsconBaseDigest.Friend friend) {
            if (friend != null) {
                return INSTANCE;
            }
            throw new NullPointerException("This method is only for use by AsconBaseDigest");
        }
    }

    public ISAPDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 8);
        this.f148982p = AsconPermutationFriend.getAsconPermutation(Friend.INSTANCE);
        this.DigestSize = 32;
        this.algorithmName = "ISAP Hash";
        reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    protected void finish(byte[] bArr, int i15) {
        this.f148982p.f149016x0 ^= 128 << ((7 - this.m_bufPos) << 3);
        while (true) {
            int i16 = this.m_bufPos;
            if (i16 <= 0) {
                break;
            }
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f148982p;
            long j15 = asconPermutation.f149016x0;
            byte[] bArr2 = this.m_buf;
            int i17 = i16 - 1;
            this.m_bufPos = i17;
            asconPermutation.f149016x0 = j15 ^ ((((long) bArr2[i17]) & 255) << ((7 - i17) << 3));
        }
        for (int i18 = 0; i18 < 4; i18++) {
            this.f148982p.p(12);
            Pack.longToBigEndian(this.f148982p.f149016x0, bArr, i15);
            i15 += 8;
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.ExtendedDigest
    public /* bridge */ /* synthetic */ int getByteLength() {
        return super.getByteLength();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int getDigestSize() {
        return super.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    protected void processBytes(byte[] bArr, int i15) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f148982p;
        asconPermutation.f149016x0 = Pack.bigEndianToLong(bArr, i15) ^ asconPermutation.f149016x0;
        this.f148982p.p(12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f148982p.set(-1255492011513352131L, -8380609354527731710L, -5437372128236807582L, 4834782570098516968L, 3787428097924915520L);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b15) {
        super.update(b15);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i15, int i16) {
        super.update(bArr, i15, i16);
    }
}
