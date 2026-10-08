package com.google.android.libraries.places.internal;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class z71 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z71 f34473c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f34474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f34475b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f34473c = new z71(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    z71(UUID uuid, long j15) {
        this.f34474a = uuid;
        this.f34475b = new AtomicLong((j15 ^ 25214903917L) & 281474976710655L);
    }

    static z71 a() {
        return f34473c;
    }

    final long b() {
        AtomicLong atomicLong;
        long j15;
        long j16;
        long j17;
        do {
            atomicLong = this.f34475b;
            j15 = atomicLong.get();
            j16 = ((j15 * 25214903917L) + 11) & 281474976710655L;
            j17 = ((25214903917L * j16) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j15, j17));
        return (((long) ((int) (j16 >>> 16))) << 32) + ((long) ((int) (j17 >>> 16)));
    }

    public final UUID c() {
        long jB = b() & (-61441);
        long jB2 = b() >>> 2;
        UUID uuid = this.f34474a;
        return new UUID(jB ^ uuid.getMostSignificantBits(), jB2 ^ uuid.getLeastSignificantBits());
    }
}
