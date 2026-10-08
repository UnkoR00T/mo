package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class wr0 implements or0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cs0 f34200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nr0 f34201b = new nr0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34202c;

    public wr0(cs0 cs0Var) {
        this.f34200a = cs0Var;
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final or0 D2(int i15) {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        this.f34201b.p(i15);
        return b();
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final or0 S3(String str) {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        this.f34201b.C0(str);
        return b();
    }

    public final or0 b() {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        nr0 nr0Var = this.f34201b;
        long jO = nr0Var.o();
        if (jO > 0) {
            this.f34200a.q1(nr0Var, jO);
        }
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.cs0
    public final void close() throws Throwable {
        Throwable th4;
        if (this.f34202c) {
            return;
        }
        try {
            nr0 nr0Var = this.f34201b;
            th4 = null;
            if (nr0Var.K() > 0) {
                this.f34200a.q1(nr0Var, nr0Var.K());
            }
        } catch (Throwable th5) {
            th4 = th5;
        }
        try {
            this.f34200a.close();
        } catch (Throwable th6) {
            if (th4 == null) {
                th4 = th6;
            }
        }
        this.f34202c = true;
        if (th4 != null) {
            throw th4;
        }
    }

    @Override // com.google.android.libraries.places.internal.or0, com.google.android.libraries.places.internal.cs0, java.io.Flushable
    public final void flush() {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        nr0 nr0Var = this.f34201b;
        if (nr0Var.K() > 0) {
            this.f34200a.q1(nr0Var, nr0Var.K());
        }
        this.f34200a.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f34202c;
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final or0 j3(int i15) {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        this.f34201b.b(i15);
        return b();
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final or0 p2(byte[] bArr) {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        this.f34201b.C1(bArr);
        return b();
    }

    @Override // com.google.android.libraries.places.internal.cs0
    public final void q1(nr0 nr0Var, long j15) {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        this.f34201b.q1(nr0Var, j15);
        b();
    }

    public final String toString() {
        cs0 cs0Var = this.f34200a;
        StringBuilder sb5 = new StringBuilder(cs0Var.toString().length() + 8);
        sb5.append("buffer(");
        sb5.append(cs0Var);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f34201b.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final or0 x2(int i15) {
        if (this.f34202c) {
            throw new IllegalStateException("closed");
        }
        this.f34201b.m(i15);
        return b();
    }
}
