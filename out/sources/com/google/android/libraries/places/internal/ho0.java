package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class ho0 extends fa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nr0 f32505a;

    ho0(nr0 nr0Var) {
        this.f32505a = nr0Var;
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void D(int i15) {
        try {
            this.f32505a.e1(i15);
        } catch (EOFException e15) {
            throw new IndexOutOfBoundsException(e15.getMessage());
        }
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void H3(OutputStream outputStream, int i15) throws IOException {
        this.f32505a.O(outputStream, i15);
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final sj0 W2(int i15) {
        nr0 nr0Var = new nr0();
        nr0Var.q1(this.f32505a, i15);
        return new ho0(nr0Var);
    }

    @Override // com.google.android.libraries.places.internal.fa0, com.google.android.libraries.places.internal.sj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        nr0 nr0Var = this.f32505a;
        nr0Var.e1(nr0Var.K());
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final int f() {
        return (int) this.f32505a.K();
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final int i() {
        try {
            return this.f32505a.k() & 255;
        } catch (EOFException e15) {
            throw new IndexOutOfBoundsException(e15.getMessage());
        }
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void t3(byte[] bArr, int i15, int i16) {
        while (i16 > 0) {
            int iT0 = this.f32505a.t0(bArr, i15, i16);
            if (iT0 == -1) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 25);
                sb5.append("EOF trying to read ");
                sb5.append(i16);
                sb5.append(" bytes");
                throw new IndexOutOfBoundsException(sb5.toString());
            }
            i16 -= iT0;
            i15 += iT0;
        }
    }
}
