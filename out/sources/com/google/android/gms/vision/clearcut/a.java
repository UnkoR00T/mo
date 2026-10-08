package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.v;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v f31456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ DynamiteClearcutLogger f31457c;

    a(DynamiteClearcutLogger dynamiteClearcutLogger, int i15, v vVar) {
        this.f31457c = dynamiteClearcutLogger;
        this.f31455a = i15;
        this.f31456b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31457c.zzc.zza(this.f31455a, this.f31456b);
    }
}
