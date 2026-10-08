package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes5.dex */
public class SHA3Digest extends KeccakDigest implements SavableDigest {
    public SHA3Digest() {
        this(256, CryptoServicePurpose.ANY);
    }

    private static int checkBitLength(int i15) {
        if (i15 == 224 || i15 == 256 || i15 == 384 || i15 == 512) {
            return i15;
        }
        throw new IllegalArgumentException("'bitLength' " + i15 + " not supported for SHA-3");
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest, org.bouncycastle.crypto.EncodableService
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.state.length * 8) + this.dataQueue.length + 14];
        super.getEncodedState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA3Digest) memoable);
    }

    public SHA3Digest(int i15) {
        super(checkBitLength(i15), CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    protected int doFinal(byte[] bArr, int i15, byte b15, int i16) {
        if (i16 < 0 || i16 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i17 = (b15 & ((1 << i16) - 1)) | (2 << i16);
        int i18 = i16 + 2;
        if (i18 >= 8) {
            absorb((byte) i17);
            i18 = i16 - 6;
            i17 >>>= 8;
        }
        return super.doFinal(bArr, i15, (byte) i17, i18);
    }

    public SHA3Digest(int i15, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i15), cryptoServicePurpose);
    }

    public SHA3Digest(CryptoServicePurpose cryptoServicePurpose) {
        this(256, cryptoServicePurpose);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }

    public SHA3Digest(byte[] bArr) {
        super(bArr);
    }
}
