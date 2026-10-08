package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class xr0 implements pr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es0 f34308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nr0 f34309b = new nr0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34310c;

    public xr0(es0 es0Var) {
        this.f34308a = es0Var;
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final short A() throws EOFException {
        c2(2L);
        return this.f34309b.A();
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final rr0 C2(long j15) throws EOFException {
        c2(j15);
        return this.f34309b.C2(j15);
    }

    @Override // com.google.android.libraries.places.internal.es0
    public final long V1(nr0 nr0Var, long j15) {
        if (j15 < 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 15);
            sb5.append("byteCount < 0: ");
            sb5.append(j15);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (this.f34310c) {
            throw new IllegalStateException("closed");
        }
        nr0 nr0Var2 = this.f34309b;
        if (nr0Var2.K() == 0) {
            if (j15 == 0) {
                return 0L;
            }
            if (this.f34308a.V1(nr0Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return nr0Var2.V1(nr0Var, Math.min(j15, nr0Var2.K()));
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final void c2(long j15) throws EOFException {
        nr0 nr0Var;
        if (j15 < 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 15);
            sb5.append("byteCount < 0: ");
            sb5.append(j15);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (this.f34310c) {
            throw new IllegalStateException("closed");
        }
        do {
            nr0Var = this.f34309b;
            if (nr0Var.K() >= j15) {
                return;
            }
        } while (this.f34308a.V1(nr0Var, 8192L) != -1);
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.es0
    public final void close() throws EOFException {
        if (this.f34310c) {
            return;
        }
        this.f34310c = true;
        this.f34308a.close();
        nr0 nr0Var = this.f34309b;
        nr0Var.e1(nr0Var.K());
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final nr0 d() {
        return this.f34309b;
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final void e1(long j15) throws EOFException {
        if (this.f34310c) {
            throw new IllegalStateException("closed");
        }
        while (j15 > 0) {
            nr0 nr0Var = this.f34309b;
            if (nr0Var.K() == 0 && this.f34308a.V1(nr0Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j15, nr0Var.K());
            nr0Var.e1(jMin);
            j15 -= jMin;
        }
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final boolean f() {
        if (this.f34310c) {
            throw new IllegalStateException("closed");
        }
        nr0 nr0Var = this.f34309b;
        return nr0Var.f() && this.f34308a.V1(nr0Var, 8192L) == -1;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f34310c;
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final byte k() throws EOFException {
        c2(1L);
        return this.f34309b.k();
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final int q() throws EOFException {
        c2(4L);
        return this.f34309b.q();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        nr0 nr0Var = this.f34309b;
        if (nr0Var.K() == 0 && this.f34308a.V1(nr0Var, 8192L) == -1) {
            return -1;
        }
        return nr0Var.read(byteBuffer);
    }

    public final String toString() {
        es0 es0Var = this.f34308a;
        StringBuilder sb5 = new StringBuilder(es0Var.toString().length() + 8);
        sb5.append("buffer(");
        sb5.append(es0Var);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final byte[] y3(long j15) throws EOFException {
        c2(j15);
        return this.f34309b.y3(j15);
    }
}
