package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class HKDFBytesGenerator implements DerivationFunction {
    private byte[] currentT;
    private int generatedBytes;
    private HMac hMacHash;
    private int hashLen;
    private byte[] info;

    public HKDFBytesGenerator(Digest digest) {
        this.hMacHash = new HMac(digest);
        this.hashLen = digest.getDigestSize();
    }

    private void expandNext() {
        int i15 = this.generatedBytes;
        int i16 = this.hashLen;
        int i17 = (i15 / i16) + 1;
        if (i17 >= 256) {
            throw new DataLengthException("HKDF cannot generate more than 255 blocks of HashLen size");
        }
        if (i15 != 0) {
            this.hMacHash.update(this.currentT, 0, i16);
        }
        HMac hMac = this.hMacHash;
        byte[] bArr = this.info;
        hMac.update(bArr, 0, bArr.length);
        this.hMacHash.update((byte) i17);
        this.hMacHash.doFinal(this.currentT, 0);
    }

    public byte[] extractPRK(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            this.hMacHash.init(new KeyParameter(new byte[this.hashLen]));
        } else {
            this.hMacHash.init(new KeyParameter(bArr));
        }
        this.hMacHash.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.hashLen];
        this.hMacHash.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i15, int i16) {
        int i17 = this.generatedBytes;
        int i18 = i17 + i16;
        int i19 = this.hashLen;
        if (i18 > i19 * GF2Field.MASK) {
            throw new DataLengthException("HKDF may only be used for 255 * HashLen bytes of output");
        }
        if (i17 % i19 == 0) {
            expandNext();
        }
        int i25 = this.generatedBytes;
        int i26 = this.hashLen;
        int i27 = i25 % i26;
        int iMin = Math.min(i26 - (i25 % i26), i16);
        System.arraycopy(this.currentT, i27, bArr, i15, iMin);
        this.generatedBytes += iMin;
        int i28 = i16 - iMin;
        while (true) {
            i15 += iMin;
            if (i28 <= 0) {
                return i16;
            }
            expandNext();
            iMin = Math.min(this.hashLen, i28);
            System.arraycopy(this.currentT, 0, bArr, i15, iMin);
            this.generatedBytes += iMin;
            i28 -= iMin;
        }
    }

    public Digest getDigest() {
        return this.hMacHash.getUnderlyingDigest();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        HMac hMac;
        KeyParameter keyParameter;
        if (!(derivationParameters instanceof HKDFParameters)) {
            throw new IllegalArgumentException("HKDF parameters required for HKDFBytesGenerator");
        }
        HKDFParameters hKDFParameters = (HKDFParameters) derivationParameters;
        if (hKDFParameters.skipExtract()) {
            hMac = this.hMacHash;
            keyParameter = new KeyParameter(hKDFParameters.getIKM());
        } else {
            hMac = this.hMacHash;
            keyParameter = new KeyParameter(extractPRK(hKDFParameters.getSalt(), hKDFParameters.getIKM()));
        }
        hMac.init(keyParameter);
        this.info = hKDFParameters.getInfo();
        this.generatedBytes = 0;
        this.currentT = new byte[this.hashLen];
    }
}
