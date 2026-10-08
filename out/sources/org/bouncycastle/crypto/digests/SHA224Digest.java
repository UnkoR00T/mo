package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SHA224Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 28;
    static final int[] K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int H8;
    private int[] X;
    private int xOff;

    public SHA224Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private int Ch(int i15, int i16, int i17) {
        return ((~i15) & i17) ^ (i16 & i15);
    }

    private int Maj(int i15, int i16, int i17) {
        return ((i15 & i17) ^ (i15 & i16)) ^ (i16 & i17);
    }

    private int Sum0(int i15) {
        return ((i15 << 10) | (i15 >>> 22)) ^ (((i15 >>> 2) | (i15 << 30)) ^ ((i15 >>> 13) | (i15 << 19)));
    }

    private int Sum1(int i15) {
        return ((i15 << 7) | (i15 >>> 25)) ^ (((i15 >>> 6) | (i15 << 26)) ^ ((i15 >>> 11) | (i15 << 21)));
    }

    private int Theta0(int i15) {
        return (i15 >>> 3) ^ (((i15 >>> 7) | (i15 << 25)) ^ ((i15 >>> 18) | (i15 << 14)));
    }

    private int Theta1(int i15) {
        return (i15 >>> 10) ^ (((i15 >>> 17) | (i15 << 15)) ^ ((i15 >>> 19) | (i15 << 13)));
    }

    private void doCopy(SHA224Digest sHA224Digest) {
        super.copyIn(sHA224Digest);
        this.H1 = sHA224Digest.H1;
        this.H2 = sHA224Digest.H2;
        this.H3 = sHA224Digest.H3;
        this.H4 = sHA224Digest.H4;
        this.H5 = sHA224Digest.H5;
        this.H6 = sHA224Digest.H6;
        this.H7 = sHA224Digest.H7;
        this.H8 = sHA224Digest.H8;
        int[] iArr = sHA224Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA224Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA224Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 192, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i15);
        Pack.intToBigEndian(this.H2, bArr, i15 + 4);
        Pack.intToBigEndian(this.H3, bArr, i15 + 8);
        Pack.intToBigEndian(this.H4, bArr, i15 + 12);
        Pack.intToBigEndian(this.H5, bArr, i15 + 16);
        Pack.intToBigEndian(this.H6, bArr, i15 + 20);
        Pack.intToBigEndian(this.H7, bArr, i15 + 24);
        reset();
        return 28;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-224";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 28;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest, org.bouncycastle.crypto.EncodableService
    public byte[] getEncodedState() {
        int i15 = this.xOff * 4;
        byte[] bArr = new byte[i15 + 53];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.H6, bArr, 36);
        Pack.intToBigEndian(this.H7, bArr, 40);
        Pack.intToBigEndian(this.H8, bArr, 44);
        Pack.intToBigEndian(this.xOff, bArr, 48);
        for (int i16 = 0; i16 != this.xOff; i16++) {
            Pack.intToBigEndian(this.X[i16], bArr, (i16 * 4) + 52);
        }
        bArr[i15 + 52] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i15 = 16; i15 <= 63; i15++) {
            int[] iArr = this.X;
            int iTheta1 = Theta1(iArr[i15 - 2]);
            int[] iArr2 = this.X;
            iArr[i15] = iTheta1 + iArr2[i15 - 7] + Theta0(iArr2[i15 - 15]) + this.X[i15 - 16];
        }
        int iSum0 = this.H1;
        int iSum1 = this.H2;
        int iSum2 = this.H3;
        int iSum3 = this.H4;
        int i16 = this.H5;
        int i17 = this.H6;
        int i18 = this.H7;
        int i19 = this.H8;
        int i25 = 0;
        for (int i26 = 0; i26 < 8; i26++) {
            int iSum4 = Sum1(i16) + Ch(i16, i17, i18);
            int[] iArr3 = K;
            int i27 = i19 + iSum4 + iArr3[i25] + this.X[i25];
            int i28 = iSum3 + i27;
            int iSum5 = i27 + Sum0(iSum0) + Maj(iSum0, iSum1, iSum2);
            int i29 = i25 + 1;
            int iSum6 = i18 + Sum1(i28) + Ch(i28, i16, i17) + iArr3[i29] + this.X[i29];
            int i35 = iSum2 + iSum6;
            int iSum7 = iSum6 + Sum0(iSum5) + Maj(iSum5, iSum0, iSum1);
            int i36 = i25 + 2;
            int iSum8 = i17 + Sum1(i35) + Ch(i35, i28, i16) + iArr3[i36] + this.X[i36];
            int i37 = iSum1 + iSum8;
            int iSum9 = iSum8 + Sum0(iSum7) + Maj(iSum7, iSum5, iSum0);
            int i38 = i25 + 3;
            int iSum10 = i16 + Sum1(i37) + Ch(i37, i35, i28) + iArr3[i38] + this.X[i38];
            int i39 = iSum0 + iSum10;
            int iSum11 = iSum10 + Sum0(iSum9) + Maj(iSum9, iSum7, iSum5);
            int i45 = i25 + 4;
            int iSum12 = i28 + Sum1(i39) + Ch(i39, i37, i35) + iArr3[i45] + this.X[i45];
            i19 = iSum5 + iSum12;
            iSum3 = iSum12 + Sum0(iSum11) + Maj(iSum11, iSum9, iSum7);
            int i46 = i25 + 5;
            int iSum13 = i35 + Sum1(i19) + Ch(i19, i39, i37) + iArr3[i46] + this.X[i46];
            i18 = iSum7 + iSum13;
            iSum2 = iSum13 + Sum0(iSum3) + Maj(iSum3, iSum11, iSum9);
            int i47 = i25 + 6;
            int iSum14 = i37 + Sum1(i18) + Ch(i18, i19, i39) + iArr3[i47] + this.X[i47];
            i17 = iSum9 + iSum14;
            iSum1 = iSum14 + Sum0(iSum2) + Maj(iSum2, iSum3, iSum11);
            int i48 = i25 + 7;
            int iSum15 = i39 + Sum1(i17) + Ch(i17, i18, i19) + iArr3[i48] + this.X[i48];
            i16 = iSum11 + iSum15;
            iSum0 = iSum15 + Sum0(iSum1) + Maj(iSum1, iSum2, iSum3);
            i25 += 8;
        }
        this.H1 += iSum0;
        this.H2 += iSum1;
        this.H3 += iSum2;
        this.H4 += iSum3;
        this.H5 += i16;
        this.H6 += i17;
        this.H7 += i18;
        this.H8 += i19;
        this.xOff = 0;
        for (int i49 = 0; i49 < 16; i49++) {
            this.X[i49] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j15) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j15 >>> 32);
        iArr[15] = (int) j15;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i15) {
        this.X[this.xOff] = Pack.bigEndianToInt(bArr, i15);
        int i16 = this.xOff + 1;
        this.xOff = i16;
        if (i16 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = -1056596264;
        this.H2 = 914150663;
        this.H3 = 812702999;
        this.H4 = -150054599;
        this.H5 = -4191439;
        this.H6 = 1750603025;
        this.H7 = 1694076839;
        this.H8 = -1090891868;
        this.xOff = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.X;
            if (i15 == iArr.length) {
                return;
            }
            iArr[i15] = 0;
            i15++;
        }
    }

    public SHA224Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.X = new int[64];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        doCopy((SHA224Digest) memoable);
    }

    public SHA224Digest(SHA224Digest sHA224Digest) {
        super(sHA224Digest);
        this.X = new int[64];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        doCopy(sHA224Digest);
    }

    public SHA224Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[64];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.H6 = Pack.bigEndianToInt(bArr, 36);
        this.H7 = Pack.bigEndianToInt(bArr, 40);
        this.H8 = Pack.bigEndianToInt(bArr, 44);
        this.xOff = Pack.bigEndianToInt(bArr, 48);
        for (int i15 = 0; i15 != this.xOff; i15++) {
            this.X[i15] = Pack.bigEndianToInt(bArr, (i15 * 4) + 52);
        }
    }
}
