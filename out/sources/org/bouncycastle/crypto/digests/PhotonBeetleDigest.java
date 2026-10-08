package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.engines.PhotonBeetleEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes5.dex */
public class PhotonBeetleDigest extends BufferBaseDigest {
    private static final int D = 8;
    private static final int SQUEEZE_RATE_INBYTES = 16;
    private int blockCount;
    private final byte[] state;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public PhotonBeetleDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Buffered, 4);
        this.DigestSize = 32;
        this.state = new byte[32];
        this.algorithmName = "Photon-Beetle Hash";
        this.blockCount = 0;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    protected void finish(byte[] bArr, int i15) {
        int i16 = this.m_bufPos;
        if (i16 == 0 && this.blockCount == 0) {
            byte[] bArr2 = this.state;
            int i17 = this.DigestSize - 1;
            bArr2[i17] = (byte) (bArr2[i17] ^ 32);
        } else {
            int i18 = this.blockCount;
            if (i18 < 4) {
                System.arraycopy(this.m_buf, 0, this.state, i18 << 2, i16);
                byte[] bArr3 = this.state;
                int i19 = (this.blockCount << 2) + this.m_bufPos;
                bArr3[i19] = (byte) (bArr3[i19] ^ 1);
                int i25 = this.DigestSize - 1;
                bArr3[i25] = (byte) (bArr3[i25] ^ 32);
            } else if (i18 == 4 && i16 == 0) {
                byte[] bArr4 = this.state;
                int i26 = this.DigestSize - 1;
                bArr4[i26] = (byte) (bArr4[i26] ^ 64);
            } else {
                PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
                Bytes.xorTo(this.m_bufPos, this.m_buf, this.state);
                int i27 = this.m_bufPos;
                int i28 = this.BlockSize;
                if (i27 < i28) {
                    byte[] bArr5 = this.state;
                    bArr5[i27] = (byte) (bArr5[i27] ^ 1);
                }
                byte[] bArr6 = this.state;
                int i29 = this.DigestSize - 1;
                bArr6[i29] = (byte) (((i27 % i28 != 0 ? 2 : 1) << 5) ^ bArr6[i29]);
            }
        }
        PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
        System.arraycopy(this.state, 0, bArr, i15, 16);
        PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
        System.arraycopy(this.state, 0, bArr, i15 + 16, 16);
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
        int i16 = this.blockCount;
        if (i16 < 4) {
            System.arraycopy(bArr, i15, this.state, i16 << 2, this.BlockSize);
        } else {
            PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
            Bytes.xorTo(this.BlockSize, bArr, i15, this.state);
        }
        this.blockCount++;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        Arrays.fill(this.state, (byte) 0);
        this.blockCount = 0;
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
