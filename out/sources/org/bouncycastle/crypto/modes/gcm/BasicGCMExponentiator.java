package org.bouncycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: classes5.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long[] f149131x;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j15, byte[] bArr) {
        long[] jArrOneAsLongs = GCMUtil.oneAsLongs();
        if (j15 > 0) {
            long[] jArr = new long[2];
            GCMUtil.copy(this.f149131x, jArr);
            do {
                if ((1 & j15) != 0) {
                    GCMUtil.multiply(jArrOneAsLongs, jArr);
                }
                GCMUtil.square(jArr, jArr);
                j15 >>>= 1;
            } while (j15 > 0);
        }
        GCMUtil.asBytes(jArrOneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f149131x = GCMUtil.asLongs(bArr);
    }
}
