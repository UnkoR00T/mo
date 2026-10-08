package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes5.dex */
public class SHAKEDigest extends KeccakDigest implements Xof, SavableDigest {
    public SHAKEDigest() {
        this(128);
    }

    private static int checkBitLength(int i15) {
        if (i15 == 128 || i15 == 256) {
            return i15;
        }
        throw new IllegalArgumentException("'bitStrength' " + i15 + " not supported for SHAKE");
    }

    public Memoable copy() {
        return new SHAKEDigest(this);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        return doFinal(bArr, i15, getDigestSize());
    }

    public int doOutput(byte[] bArr, int i15, int i16) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i15, ((long) i16) * 8);
        return i16;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 4;
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.state.length * 8) + this.dataQueue.length + 14];
        super.getEncodedState(bArr);
        return bArr;
    }

    public void reset(Memoable memoable) {
        copyIn((SHAKEDigest) memoable);
    }

    public SHAKEDigest(int i15) {
        super(checkBitLength(i15), CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    protected int doFinal(byte[] bArr, int i15, byte b15, int i16) {
        return doFinal(bArr, i15, getDigestSize(), b15, i16);
    }

    public SHAKEDigest(int i15, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i15), cryptoServicePurpose);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i15, int i16) {
        int iDoOutput = doOutput(bArr, i15, i16);
        reset();
        return iDoOutput;
    }

    public SHAKEDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(128, cryptoServicePurpose);
    }

    protected int doFinal(byte[] bArr, int i15, int i16, byte b15, int i17) {
        if (i17 < 0 || i17 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i18 = (b15 & ((1 << i17) - 1)) | (15 << i17);
        int i19 = i17 + 4;
        if (i19 >= 8) {
            absorb((byte) i18);
            i19 = i17 - 4;
            i18 >>>= 8;
        }
        if (i19 > 0) {
            absorbBits(i18, i19);
        }
        squeeze(bArr, i15, ((long) i16) * 8);
        reset();
        return i16;
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }

    public SHAKEDigest(byte[] bArr) {
        super(bArr);
    }
}
