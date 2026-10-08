package org.bouncycastle.cert.selector;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class MSOutlookKeyIdCalculator {

    private static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        void finish() {
            long j15 = this.byteCount << 3;
            byte b15 = -128;
            while (true) {
                update(b15);
                if (this.xBufOff == 0) {
                    processLength(j15);
                    processBlock();
                    return;
                }
                b15 = 0;
            }
        }

        abstract void processBlock();

        abstract void processLength(long j15);

        abstract void processWord(byte[] bArr, int i15);

        void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i15 = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i15 >= bArr.length) {
                    return;
                }
                bArr[i15] = 0;
                i15++;
            }
        }

        void update(byte b15) {
            byte[] bArr = this.xBuf;
            int i15 = this.xBufOff;
            int i16 = i15 + 1;
            this.xBufOff = i16;
            bArr[i15] = b15;
            if (i16 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }

        GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        void update(byte[] bArr, int i15, int i16) {
            while (this.xBufOff != 0 && i16 > 0) {
                update(bArr[i15]);
                i15++;
                i16--;
            }
            while (i16 > this.xBuf.length) {
                processWord(bArr, i15);
                byte[] bArr2 = this.xBuf;
                i15 += bArr2.length;
                i16 -= bArr2.length;
                this.byteCount += (long) bArr2.length;
            }
            while (i16 > 0) {
                update(bArr[i15]);
                i15++;
                i16--;
            }
        }
    }

    private static class SHA1Digest extends GeneralDigest {
        private static final int DIGEST_LENGTH = 20;
        private static final int Y1 = 1518500249;
        private static final int Y2 = 1859775393;
        private static final int Y3 = -1894007588;
        private static final int Y4 = -899497514;
        private int H1;
        private int H2;
        private int H3;
        private int H4;
        private int H5;
        private int[] X = new int[80];
        private int xOff;

        SHA1Digest() {
            reset();
        }

        private int f(int i15, int i16, int i17) {
            return ((~i15) & i17) | (i16 & i15);
        }

        private int g(int i15, int i16, int i17) {
            return (i15 & (i16 | i17)) | (i16 & i17);
        }

        private int h(int i15, int i16, int i17) {
            return (i15 ^ i16) ^ i17;
        }

        int doFinal(byte[] bArr, int i15) {
            finish();
            Pack.intToBigEndian(this.H1, bArr, i15);
            Pack.intToBigEndian(this.H2, bArr, i15 + 4);
            Pack.intToBigEndian(this.H3, bArr, i15 + 8);
            Pack.intToBigEndian(this.H4, bArr, i15 + 12);
            Pack.intToBigEndian(this.H5, bArr, i15 + 16);
            reset();
            return 20;
        }

        String getAlgorithmName() {
            return "SHA-1";
        }

        int getDigestSize() {
            return 20;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        void processBlock() {
            for (int i15 = 16; i15 < 80; i15++) {
                int[] iArr = this.X;
                int i16 = ((iArr[i15 - 3] ^ iArr[i15 - 8]) ^ iArr[i15 - 14]) ^ iArr[i15 - 16];
                iArr[i15] = (i16 >>> 31) | (i16 << 1);
            }
            int iH = this.H1;
            int iH2 = this.H2;
            int i17 = this.H3;
            int i18 = this.H4;
            int i19 = this.H5;
            int i25 = 0;
            for (int i26 = 0; i26 < 4; i26++) {
                int iF = i19 + ((iH << 5) | (iH >>> 27)) + f(iH2, i17, i18) + this.X[i25] + Y1;
                int i27 = (iH2 >>> 2) | (iH2 << 30);
                int iF2 = i18 + ((iF << 5) | (iF >>> 27)) + f(iH, i27, i17) + this.X[i25 + 1] + Y1;
                int i28 = (iH >>> 2) | (iH << 30);
                int iF3 = i17 + ((iF2 << 5) | (iF2 >>> 27)) + f(iF, i28, i27) + this.X[i25 + 2] + Y1;
                i19 = (iF >>> 2) | (iF << 30);
                int i29 = i25 + 4;
                iH2 = i27 + ((iF3 << 5) | (iF3 >>> 27)) + f(iF2, i19, i28) + this.X[i25 + 3] + Y1;
                i18 = (iF2 >>> 2) | (iF2 << 30);
                i25 += 5;
                iH = i28 + ((iH2 << 5) | (iH2 >>> 27)) + f(iF3, i18, i19) + this.X[i29] + Y1;
                i17 = (iF3 >>> 2) | (iF3 << 30);
            }
            for (int i35 = 0; i35 < 4; i35++) {
                int iH3 = i19 + ((iH << 5) | (iH >>> 27)) + h(iH2, i17, i18) + this.X[i25] + Y2;
                int i36 = (iH2 >>> 2) | (iH2 << 30);
                int iH4 = i18 + ((iH3 << 5) | (iH3 >>> 27)) + h(iH, i36, i17) + this.X[i25 + 1] + Y2;
                int i37 = (iH >>> 2) | (iH << 30);
                int iH5 = i17 + ((iH4 << 5) | (iH4 >>> 27)) + h(iH3, i37, i36) + this.X[i25 + 2] + Y2;
                i19 = (iH3 >>> 2) | (iH3 << 30);
                int i38 = i25 + 4;
                iH2 = i36 + ((iH5 << 5) | (iH5 >>> 27)) + h(iH4, i19, i37) + this.X[i25 + 3] + Y2;
                i18 = (iH4 >>> 2) | (iH4 << 30);
                i25 += 5;
                iH = i37 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH5, i18, i19) + this.X[i38] + Y2;
                i17 = (iH5 >>> 2) | (iH5 << 30);
            }
            for (int i39 = 0; i39 < 4; i39++) {
                int iG = i19 + ((iH << 5) | (iH >>> 27)) + g(iH2, i17, i18) + this.X[i25] + Y3;
                int i45 = (iH2 >>> 2) | (iH2 << 30);
                int iG2 = i18 + ((iG << 5) | (iG >>> 27)) + g(iH, i45, i17) + this.X[i25 + 1] + Y3;
                int i46 = (iH >>> 2) | (iH << 30);
                int iG3 = i17 + ((iG2 << 5) | (iG2 >>> 27)) + g(iG, i46, i45) + this.X[i25 + 2] + Y3;
                i19 = (iG >>> 2) | (iG << 30);
                int i47 = i25 + 4;
                iH2 = i45 + ((iG3 << 5) | (iG3 >>> 27)) + g(iG2, i19, i46) + this.X[i25 + 3] + Y3;
                i18 = (iG2 >>> 2) | (iG2 << 30);
                i25 += 5;
                iH = i46 + ((iH2 << 5) | (iH2 >>> 27)) + g(iG3, i18, i19) + this.X[i47] + Y3;
                i17 = (iG3 >>> 2) | (iG3 << 30);
            }
            for (int i48 = 0; i48 <= 3; i48++) {
                int iH6 = i19 + ((iH << 5) | (iH >>> 27)) + h(iH2, i17, i18) + this.X[i25] + Y4;
                int i49 = (iH2 >>> 2) | (iH2 << 30);
                int iH7 = i18 + ((iH6 << 5) | (iH6 >>> 27)) + h(iH, i49, i17) + this.X[i25 + 1] + Y4;
                int i55 = (iH >>> 2) | (iH << 30);
                int iH8 = i17 + ((iH7 << 5) | (iH7 >>> 27)) + h(iH6, i55, i49) + this.X[i25 + 2] + Y4;
                i19 = (iH6 >>> 2) | (iH6 << 30);
                int i56 = i25 + 4;
                iH2 = i49 + ((iH8 << 5) | (iH8 >>> 27)) + h(iH7, i19, i55) + this.X[i25 + 3] + Y4;
                i18 = (iH7 >>> 2) | (iH7 << 30);
                i25 += 5;
                iH = i55 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH8, i18, i19) + this.X[i56] + Y4;
                i17 = (iH8 >>> 2) | (iH8 << 30);
            }
            this.H1 += iH;
            this.H2 += iH2;
            this.H3 += i17;
            this.H4 += i18;
            this.H5 += i19;
            this.xOff = 0;
            for (int i57 = 0; i57 < 16; i57++) {
                this.X[i57] = 0;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        void processLength(long j15) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j15 >>> 32);
            iArr[15] = (int) j15;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        void processWord(byte[] bArr, int i15) {
            int i16 = (bArr[i15 + 3] & 255) | (bArr[i15] << 24) | ((bArr[i15 + 1] & 255) << 16) | ((bArr[i15 + 2] & 255) << 8);
            int[] iArr = this.X;
            int i17 = this.xOff;
            iArr[i17] = i16;
            int i18 = i17 + 1;
            this.xOff = i18;
            if (i18 == 16) {
                processBlock();
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        void reset() {
            super.reset();
            this.H1 = 1732584193;
            this.H2 = -271733879;
            this.H3 = -1732584194;
            this.H4 = 271733878;
            this.H5 = -1009589776;
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
    }

    MSOutlookKeyIdCalculator() {
    }

    static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded(ASN1Encoding.DER);
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
