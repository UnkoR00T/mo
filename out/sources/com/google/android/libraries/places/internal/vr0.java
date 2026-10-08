package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class vr0 implements cs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f34085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gs0 f34086b;

    public vr0(OutputStream outputStream, gs0 gs0Var) {
        this.f34085a = outputStream;
        this.f34086b = gs0Var;
    }

    @Override // com.google.android.libraries.places.internal.cs0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34085a.close();
    }

    @Override // com.google.android.libraries.places.internal.cs0, java.io.Flushable
    public final void flush() throws IOException {
        this.f34085a.flush();
    }

    @Override // com.google.android.libraries.places.internal.cs0
    public final void q1(nr0 nr0Var, long j15) throws IOException {
        jr0.a(nr0Var.K(), 0L, j15);
        while (j15 > 0) {
            this.f34086b.a();
            yr0 yr0Var = nr0Var.f33095a;
            int iMin = (int) Math.min(j15, yr0Var.f34429c - yr0Var.f34428b);
            this.f34085a.write(yr0Var.f34427a, yr0Var.f34428b, iMin);
            yr0Var.f34428b += iMin;
            long j16 = iMin;
            nr0Var.N(nr0Var.K() - j16);
            j15 -= j16;
            if (yr0Var.f34428b == yr0Var.f34429c) {
                nr0Var.f33095a = yr0Var.b();
                as0.b(yr0Var);
            }
        }
    }

    public final String toString() {
        OutputStream outputStream = this.f34085a;
        StringBuilder sb5 = new StringBuilder(String.valueOf(outputStream).length() + 6);
        sb5.append("sink(");
        sb5.append(outputStream);
        sb5.append(")");
        return sb5.toString();
    }
}
