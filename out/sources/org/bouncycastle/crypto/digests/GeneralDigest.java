package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GeneralDigest implements ExtendedDigest, Memoable {
    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    protected final CryptoServicePurpose purpose;
    private final byte[] xBuf;
    private int xBufOff;

    protected GeneralDigest() {
        this(CryptoServicePurpose.ANY);
    }

    protected void copyIn(GeneralDigest generalDigest) {
        byte[] bArr = generalDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    protected abstract CryptoServiceProperties cryptoServiceProperties();

    public void finish() {
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

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    protected void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 4);
        Pack.longToBigEndian(this.byteCount, bArr, 8);
    }

    protected abstract void processBlock();

    protected abstract void processLength(long j15);

    protected abstract void processWord(byte[] bArr, int i15);

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
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

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b15) {
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

    protected GeneralDigest(CryptoServicePurpose cryptoServicePurpose) {
        this.xBuf = new byte[4];
        this.purpose = cryptoServicePurpose;
        this.xBufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        int i17 = 0;
        int iMax = Math.max(0, i16);
        if (this.xBufOff != 0) {
            int i18 = 0;
            while (true) {
                if (i18 >= iMax) {
                    i17 = i18;
                    break;
                }
                byte[] bArr2 = this.xBuf;
                int i19 = this.xBufOff;
                int i25 = i19 + 1;
                this.xBufOff = i25;
                int i26 = i18 + 1;
                bArr2[i19] = bArr[i18 + i15];
                if (i25 == 4) {
                    processWord(bArr2, 0);
                    this.xBufOff = 0;
                    i17 = i26;
                    break;
                }
                i18 = i26;
            }
        }
        int i27 = iMax - 3;
        while (i17 < i27) {
            processWord(bArr, i15 + i17);
            i17 += 4;
        }
        while (i17 < iMax) {
            byte[] bArr3 = this.xBuf;
            int i28 = this.xBufOff;
            this.xBufOff = i28 + 1;
            bArr3[i28] = bArr[i17 + i15];
            i17++;
        }
        this.byteCount += (long) iMax;
    }

    protected GeneralDigest(GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        this.purpose = generalDigest.purpose;
        copyIn(generalDigest);
    }

    protected GeneralDigest(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.xBuf = bArr2;
        this.purpose = CryptoServicePurpose.values()[bArr[bArr.length - 1]];
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.xBufOff = Pack.bigEndianToInt(bArr, 4);
        this.byteCount = Pack.bigEndianToLong(bArr, 8);
    }
}
