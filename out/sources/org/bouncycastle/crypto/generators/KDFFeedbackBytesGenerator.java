package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFFeedbackParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public class KDFFeedbackBytesGenerator implements MacDerivationFunction {
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f149079h;
    private byte[] ios;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149080iv;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f149081k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFFeedbackBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f149079h = macSize;
        this.f149081k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.f149080iv;
            mac.update(bArr, 0, bArr.length);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f149081k;
            mac2.update(bArr2, 0, bArr2.length);
        }
        if (this.useCounter) {
            int i15 = (this.generatedBytes / this.f149079h) + 1;
            byte[] bArr3 = this.ios;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr3[0] = (byte) (i15 >>> 24);
                    }
                    bArr3[bArr3.length - 3] = (byte) (i15 >>> 16);
                }
                bArr3[bArr3.length - 2] = (byte) (i15 >>> 8);
            }
            bArr3[bArr3.length - 1] = (byte) i15;
            this.prf.update(bArr3, 0, bArr3.length);
        }
        Mac mac3 = this.prf;
        byte[] bArr4 = this.fixedInputData;
        mac3.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f149081k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i15, int i16) {
        int i17 = this.generatedBytes;
        int i18 = i17 + i16;
        if (i18 < 0 || i18 >= this.maxSizeExcl) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.maxSizeExcl + " bytes");
        }
        if (i17 % this.f149079h == 0) {
            generateNext();
        }
        int i19 = this.generatedBytes;
        int i25 = this.f149079h;
        int i26 = i19 % i25;
        int iMin = Math.min(i25 - (i19 % i25), i16);
        System.arraycopy(this.f149081k, i26, bArr, i15, iMin);
        this.generatedBytes += iMin;
        int i27 = i16 - iMin;
        while (true) {
            i15 += iMin;
            if (i27 <= 0) {
                return i16;
            }
            generateNext();
            iMin = Math.min(this.f149079h, i27);
            System.arraycopy(this.f149081k, 0, bArr, i15, iMin);
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
        if (!(derivationParameters instanceof KDFFeedbackParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFFeedbackParameters kDFFeedbackParameters = (KDFFeedbackParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFFeedbackParameters.getKI()));
        this.fixedInputData = kDFFeedbackParameters.getFixedInputData();
        int r15 = kDFFeedbackParameters.getR();
        this.ios = new byte[r15 / 8];
        int i15 = Integer.MAX_VALUE;
        if (kDFFeedbackParameters.useCounter() && r15 < Integers.numberOfLeadingZeros(this.f149079h)) {
            i15 = this.f149079h << r15;
        }
        this.maxSizeExcl = i15;
        this.f149080iv = kDFFeedbackParameters.getIV();
        this.useCounter = kDFFeedbackParameters.useCounter();
        this.generatedBytes = 0;
    }
}
