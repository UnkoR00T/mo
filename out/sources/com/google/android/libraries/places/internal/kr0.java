package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class kr0 implements cs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ cs0 f32757a;

    kr0(mr0 mr0Var, cs0 cs0Var) {
        this.f32757a = cs0Var;
    }

    @Override // com.google.android.libraries.places.internal.cs0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            try {
                this.f32757a.close();
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

    @Override // com.google.android.libraries.places.internal.cs0, java.io.Flushable
    public final void flush() {
        try {
            try {
                this.f32757a.flush();
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

    @Override // com.google.android.libraries.places.internal.cs0
    public final void q1(nr0 nr0Var, long j15) {
        jr0.a(nr0Var.K(), 0L, j15);
        while (true) {
            long j16 = 0;
            if (j15 <= 0) {
                return;
            }
            yr0 yr0Var = nr0Var.f33095a;
            while (j16 < 65536) {
                j16 += (long) (yr0Var.f34429c - yr0Var.f34428b);
                if (j16 >= j15) {
                    j16 = j15;
                    break;
                }
                yr0Var = yr0Var.f34432f;
            }
            try {
                this.f32757a.q1(nr0Var, j16);
                oq.i0 i0Var = oq.i0.f148189a;
                mr0.b();
                j15 -= j16;
            } catch (IOException e15) {
                throw e15;
            } finally {
                mr0.b();
            }
        }
    }

    public final String toString() {
        cs0 cs0Var = this.f32757a;
        StringBuilder sb5 = new StringBuilder(cs0Var.toString().length() + 19);
        sb5.append("AsyncTimeout.sink(");
        sb5.append(cs0Var);
        sb5.append(")");
        return sb5.toString();
    }
}
