package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public enum i90 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f32559b;

    i90(int i15) {
        this.f32558a = i15;
        this.f32559b = Integer.toString(i15).getBytes(StandardCharsets.US_ASCII);
    }

    public final l90 b() {
        return (l90) l90.f32806d.get(this.f32558a);
    }

    final /* synthetic */ byte[] e() {
        return this.f32559b;
    }

    public final int zza() {
        return this.f32558a;
    }
}
