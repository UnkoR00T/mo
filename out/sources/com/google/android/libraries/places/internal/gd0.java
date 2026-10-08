package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class gd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InputStream f32383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd0 f32384b;

    gd0(pd0 pd0Var, InputStream inputStream) {
        this.f32383a = inputStream;
        Objects.requireNonNull(pd0Var);
        this.f32384b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32384b.v().d(this.f32383a);
    }
}
