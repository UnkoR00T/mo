package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicLong f95831c = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f95832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f95833b;

    public z() {
        this(a(), a());
    }

    private static long a() {
        AtomicLong atomicLong;
        long j15;
        long j16;
        do {
            atomicLong = f95831c;
            j15 = atomicLong.get();
            long j17 = (j15 >> 12) ^ j15;
            long j18 = j17 ^ (j17 << 25);
            j16 = (j18 ^ (j18 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j15, j16));
        return j16;
    }

    public void b(byte[] bArr) {
        for (int i15 = 0; i15 < bArr.length; i15++) {
            long j15 = (this.f95832a * 6364136223846793005L) + this.f95833b;
            this.f95832a = j15;
            bArr[i15] = (byte) ((((j15 >>> 22) ^ j15) >>> ((int) ((j15 >>> 61) + 22))) >>> 24);
        }
    }

    public double c() {
        long j15 = this.f95832a * 6364136223846793005L;
        long j16 = this.f95833b;
        long j17 = j15 + j16;
        long j18 = (((j17 >>> 22) ^ j17) >>> ((int) ((j17 >>> 61) + 22))) & BodyPartID.bodyIdMax;
        long j19 = (j17 * 6364136223846793005L) + j16;
        this.f95832a = j19;
        return (((j18 >>> 6) << 27) + (((((j19 >>> 22) ^ j19) >>> ((int) ((j19 >>> 61) + 22))) & BodyPartID.bodyIdMax) >>> 5)) / 9.007199254740992E15d;
    }

    public void d(long j15, long j16) {
        long j17 = (j16 << 1) | 1;
        this.f95833b = j17;
        this.f95832a = j17 + j15;
    }

    public z(long j15, long j16) {
        d(j15, j16);
    }
}
