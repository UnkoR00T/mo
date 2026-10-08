package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class rh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ sh0 f33511a;

    rh0(sh0 sh0Var) {
        Objects.requireNonNull(sh0Var);
        this.f33511a = sh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33511a.f33686f.d(uh0.f33904g0);
    }
}
