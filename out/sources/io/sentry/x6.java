package io.sentry;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final class x6 extends n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Instant f95966a;

    public x6() {
        this(Instant.now());
    }

    @Override // io.sentry.n5
    public long l() {
        return m.n(this.f95966a.getEpochSecond()) + ((long) this.f95966a.getNano());
    }

    public x6(Instant instant) {
        this.f95966a = instant;
    }
}
