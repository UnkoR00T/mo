package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFCounterParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {
    private byte[] fixedInputDataCtrPrefix;
    private byte[] fixedInputData_afterCtr;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f149074h;
    private byte[] ios;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f149075k;
    private int maxSizeExcl;
    private final Mac prf;

    public KDFCounterBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f149074h = macSize;
        this.f149075k = new byte[macSize];
    }

    private void generateNext() {
        int i15 = (this.generatedBytes / this.f149074h) + 1;
        byte[] bArr = this.ios;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                    bArr[0] = (byte) (i15 >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i15 >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i15 >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i15;
        Mac mac = this.prf;
        byte[] bArr2 = this.fixedInputDataCtrPrefix;
        mac.update(bArr2, 0, bArr2.length);
        Mac mac2 = this.prf;
        byte[] bArr3 = this.ios;
        mac2.update(bArr3, 0, bArr3.length);
        Mac mac3 = this.prf;
        byte[] bArr4 = this.fixedInputData_afterCtr;
        mac3.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f149075k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i15, int i16) {
        int i17 = this.generatedBytes;
        int i18 = i17 + i16;
        if (i18 < 0 || i18 >= this.maxSizeExcl) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.maxSizeExcl + " bytes");
        }
        if (i17 % this.f149074h == 0) {
            generateNext();
        }
        int i19 = this.generatedBytes;
        int i25 = this.f149074h;
        int i26 = i19 % i25;
        int iMin = Math.min(i25 - (i19 % i25), i16);
        System.arraycopy(this.f149075k, i26, bArr, i15, iMin);
        this.generatedBytes += iMin;
        int i27 = i16 - iMin;
        while (true) {
            i15 += iMin;
            if (i27 <= 0) {
                return i16;
            }
            generateNext();
            iMin = Math.min(this.f149074h, i27);
            System.arraycopy(this.f149075k, 0, bArr, i15, iMin);
            this.generatedBytes += iMin;
            i27 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFCounterParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.fixedInputDataCtrPrefix = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.fixedInputData_afterCtr = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r15 = kDFCounterParameters.getR();
        this.ios = new byte[r15 / 8];
        this.maxSizeExcl = r15 >= Integers.numberOfLeadingZeros(this.f149074h) ? Integer.MAX_VALUE : this.f149074h << r15;
        this.generatedBytes = 0;
    }
}
