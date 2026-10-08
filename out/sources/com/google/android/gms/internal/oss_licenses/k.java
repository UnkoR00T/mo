package com.google.android.gms.internal.oss_licenses;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f30809c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f30810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f30811b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f30809c = new k(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    k(UUID uuid, long j15) {
        this.f30810a = uuid;
        this.f30811b = new AtomicLong((j15 ^ 25214903917L) & 281474976710655L);
    }

    static k a() {
        return f30809c;
    }

    final long b() {
        AtomicLong atomicLong;
        long j15;
        long j16;
        long j17;
        do {
            atomicLong = this.f30811b;
            j15 = atomicLong.get();
            j16 = ((j15 * 25214903917L) + 11) & 281474976710655L;
            j17 = ((25214903917L * j16) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j15, j17));
        return (((long) ((int) (j16 >>> 16))) << 32) + ((long) ((int) (j17 >>> 16)));
    }

    public final UUID c() {
        long jB = b() & (-61441);
        long jB2 = b() >>> 2;
        UUID uuid = this.f30810a;
        return new UUID(jB ^ uuid.getMostSignificantBits(), jB2 ^ uuid.getLeastSignificantBits());
    }
}
