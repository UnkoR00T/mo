package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
abstract class dn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ en0 f32063a;

    /* synthetic */ dn0(en0 en0Var, byte[] bArr) {
        Objects.requireNonNull(en0Var);
        this.f32063a = en0Var;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f32063a.y() == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e15) {
            this.f32063a.p().h(e15);
        }
    }
}
