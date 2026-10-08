package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class sr0 implements es0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f33717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gs0 f33718b;

    public sr0(InputStream inputStream, gs0 gs0Var) {
        this.f33717a = inputStream;
        this.f33718b = gs0Var;
    }

    @Override // com.google.android.libraries.places.internal.es0
    public final long V1(nr0 nr0Var, long j15) throws IOException {
        try {
            this.f33718b.a();
            yr0 yr0VarH = nr0Var.H(1);
            int i15 = this.f33717a.read(yr0VarH.f34427a, yr0VarH.f34429c, (int) Math.min(j15, 8192 - yr0VarH.f34429c));
            if (i15 != -1) {
                yr0VarH.f34429c += i15;
                long j16 = i15;
                nr0Var.N(nr0Var.K() + j16);
                return j16;
            }
            if (yr0VarH.f34428b != yr0VarH.f34429c) {
                return -1L;
            }
            nr0Var.f33095a = yr0VarH.b();
            as0.b(yr0VarH);
            return -1L;
        } catch (AssertionError e15) {
            if (ur0.a(e15)) {
                throw new IOException(e15);
            }
            throw e15;
        }
    }

    @Override // com.google.android.libraries.places.internal.es0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33717a.close();
    }

    public final String toString() {
        InputStream inputStream = this.f33717a;
        StringBuilder sb5 = new StringBuilder(String.valueOf(inputStream).length() + 8);
        sb5.append("source(");
        sb5.append(inputStream);
        sb5.append(")");
        return sb5.toString();
    }
}
