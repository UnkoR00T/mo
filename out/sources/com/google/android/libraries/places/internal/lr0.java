package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class lr0 implements es0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ es0 f32882a;

    lr0(mr0 mr0Var, es0 es0Var) {
        this.f32882a = es0Var;
    }

    @Override // com.google.android.libraries.places.internal.es0
    public final long V1(nr0 nr0Var, long j15) {
        try {
            try {
                long jV1 = this.f32882a.V1(nr0Var, j15);
                mr0.b();
                return jV1;
            } catch (IOException e15) {
                mr0.b();
                throw e15;
            }
        } catch (Throwable th4) {
            mr0.b();
            throw th4;
        }
    }

    @Override // com.google.android.libraries.places.internal.es0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            try {
                this.f32882a.close();
                oq.i0 i0Var = oq.i0.f148189a;
                mr0.b();
            } catch (IOException e15) {
                mr0.b();
                throw e15;
            }
        } catch (Throwable th4) {
            mr0.b();
            throw th4;
        }
    }

    public final String toString() {
        es0 es0Var = this.f32882a;
        StringBuilder sb5 = new StringBuilder(es0Var.toString().length() + 21);
        sb5.append("AsyncTimeout.source(");
        sb5.append(es0Var);
        sb5.append(")");
        return sb5.toString();
    }
}
