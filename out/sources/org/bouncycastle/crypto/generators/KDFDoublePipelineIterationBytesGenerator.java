package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f149076a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f149077h;
    private byte[] ios;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f149078k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f149077h = macSize;
        this.f149076a = new byte[macSize];
        this.f149078k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f149076a, 0);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f149076a;
            mac2.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f149076a, 0);
        }
        Mac mac3 = this.prf;
        byte[] bArr3 = this.f149076a;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i15 = (this.generatedBytes / this.f149077h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr4[0] = (byte) (i15 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i15 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i15 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i15;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac4 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac4.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.f149078k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i15, int i16) {
        int i17 = this.generatedBytes;
        int i18 = i17 + i16;
        if (i18 < 0 || i18 >= this.maxSizeExcl) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.maxSizeExcl + " bytes");
        }
        if (i17 % this.f149077h == 0) {
            generateNext();
        }
        int i19 = this.generatedBytes;
        int i25 = this.f149077h;
        int i26 = i19 % i25;
        int iMin = Math.min(i25 - (i19 % i25), i16);
        System.arraycopy(this.f149078k, i26, bArr, i15, iMin);
        this.generatedBytes += iMin;
        int i27 = i16 - iMin;
        while (true) {
            i15 += iMin;
            if (i27 <= 0) {
                return i16;
            }
            generateNext();
            iMin = Math.min(this.f149077h, i27);
            System.arraycopy(this.f149078k, 0, bArr, i15, iMin);
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
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r15 = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r15 / 8];
        int i15 = Integer.MAX_VALUE;
        if (kDFDoublePipelineIterationParameters.useCounter() && r15 < Integers.numberOfLeadingZeros(this.f149077h)) {
            i15 = this.f149077h << r15;
        }
        this.maxSizeExcl = i15;
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
