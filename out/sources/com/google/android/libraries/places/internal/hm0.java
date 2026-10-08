package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum hm0 implements qd0 {
    SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
    CONNECTION_RESET("connection reset"),
    CONNECTION_TIMED_OUT("connection timed out"),
    CONNECTION_ABORTED("connection aborted"),
    SOCKET_ERROR("socket error"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32502a;

    hm0(String str) {
        this.f32502a = str;
    }

    @Override // com.google.android.libraries.places.internal.qd0
    public final String zza() {
        return this.f32502a;
    }
}
