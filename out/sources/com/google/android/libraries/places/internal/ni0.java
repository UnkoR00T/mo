package com.google.android.libraries.places.internal;

import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ni0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ pi0 f33065a;

    /* synthetic */ ni0(pi0 pi0Var, byte[] bArr) {
        Objects.requireNonNull(pi0Var);
        this.f33065a = pi0Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i15) {
        this.f33065a.f(new byte[]{(byte) i15}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i15, int i16) {
        this.f33065a.f(bArr, i15, i16);
    }
}
