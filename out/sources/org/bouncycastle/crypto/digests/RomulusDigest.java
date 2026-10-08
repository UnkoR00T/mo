package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.engines.RomulusEngine;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RomulusDigest extends BufferBaseDigest {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f148983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f148984h;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public RomulusDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 32);
        this.f148984h = new byte[16];
        this.f148983g = new byte[16];
        this.DigestSize = 32;
        this.algorithmName = "Romulus Hash";
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    protected void finish(byte[] bArr, int i15) {
        Arrays.fill(this.m_buf, this.m_bufPos, 31, (byte) 0);
        this.m_buf[31] = (byte) (this.m_bufPos & 31);
        byte[] bArr2 = this.f148984h;
        bArr2[0] = (byte) (bArr2[0] ^ 2);
        RomulusEngine.hirose_128_128_256(Friend.INSTANCE, this.f148984h, this.f148983g, this.m_buf, 0);
        System.arraycopy(this.f148984h, 0, bArr, i15, 16);
        System.arraycopy(this.f148983g, 0, bArr, i15 + 16, 16);
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
        RomulusEngine.hirose_128_128_256(Friend.INSTANCE, this.f148984h, this.f148983g, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        Arrays.clear(this.f148984h);
        Arrays.clear(this.f148983g);
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
