package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Tables4kGCMMultiplier implements GCMMultiplier {
    private byte[] H;
    private long[][] T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.T == null) {
            this.T = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (GCMUtil.areEqual(this.H, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.H = bArr2;
        GCMUtil.copy(bArr, bArr2);
        GCMUtil.asLongs(this.H, this.T[1]);
        long[] jArr = this.T[1];
        GCMUtil.multiplyP7(jArr, jArr);
        for (int i15 = 2; i15 < 256; i15 += 2) {
            long[][] jArr2 = this.T;
            GCMUtil.divideP(jArr2[i15 >> 1], jArr2[i15]);
            long[][] jArr3 = this.T;
            GCMUtil.xor(jArr3[i15], jArr3[1], jArr3[i15 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.T[bArr[15] & 255];
        long j15 = jArr[0];
        long j16 = jArr[1];
        for (int i15 = 14; i15 >= 0; i15--) {
            long[] jArr2 = this.T[bArr[i15] & 255];
            long j17 = j16 << 56;
            j16 = ((j16 >>> 8) | (j15 << 56)) ^ jArr2[1];
            j15 = (((((j15 >>> 8) ^ jArr2[0]) ^ j17) ^ (j17 >>> 1)) ^ (j17 >>> 2)) ^ (j17 >>> 7);
        }
        Pack.longToBigEndian(j15, bArr, 0);
        Pack.longToBigEndian(j16, bArr, 8);
    }
}
