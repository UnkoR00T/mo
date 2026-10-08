package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes5.dex */
class LmsUtils {
    LmsUtils() {
    }

    static void byteArray(byte[] bArr, int i15, int i16, Digest digest) {
        digest.update(bArr, i15, i16);
    }

    static int calculateStrength(LMSParameters lMSParameters) {
        if (lMSParameters == null) {
            throw new NullPointerException("lmsParameters cannot be null");
        }
        LMSigParameters lMSigParam = lMSParameters.getLMSigParam();
        return (1 << lMSigParam.getH()) * lMSigParam.getM();
    }

    static void u16str(short s15, Digest digest) {
        digest.update((byte) (s15 >>> 8));
        digest.update((byte) s15);
    }

    static void u32str(int i15, Digest digest) {
        digest.update((byte) (i15 >>> 24));
        digest.update((byte) (i15 >>> 16));
        digest.update((byte) (i15 >>> 8));
        digest.update((byte) i15);
    }

    static void byteArray(byte[] bArr, Digest digest) {
        digest.update(bArr, 0, bArr.length);
    }
}
