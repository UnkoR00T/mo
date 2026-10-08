package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f29035a;

    /* synthetic */ d(BasePendingResult basePendingResult, byte[] bArr) {
        Objects.requireNonNull(basePendingResult);
        this.f29035a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult.i(this.f29035a.j());
        super.finalize();
    }
}
