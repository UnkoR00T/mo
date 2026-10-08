package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class KDFFeedbackParameters implements DerivationParameters {
    private static final int UNUSED_R = -1;
    private final byte[] fixedInputData;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f149182iv;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final byte[] f149183ki;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f149184r;
    private final boolean useCounter;

    private KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15, boolean z15) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f149183ki = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr3);
        }
        this.f149184r = i15;
        if (bArr2 == null) {
            this.f149182iv = new byte[0];
        } else {
            this.f149182iv = Arrays.clone(bArr2);
        }
        this.useCounter = z15;
    }

    public static KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        if (i15 == 8 || i15 == 16 || i15 == 24 || i15 == 32) {
            return new KDFFeedbackParameters(bArr, bArr2, bArr3, i15, true);
        }
        throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
    }

    public static KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getIV() {
        return this.f149182iv;
    }

    public byte[] getKI() {
        return this.f149183ki;
    }

    public int getR() {
        return this.f149184r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
