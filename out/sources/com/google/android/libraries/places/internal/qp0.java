package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class qp0 implements es0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pr0 f33440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f33441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte f33442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f33443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f33444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    short f33445f;

    public qp0(pr0 pr0Var) {
        this.f33440a = pr0Var;
    }

    @Override // com.google.android.libraries.places.internal.es0
    public final long V1(nr0 nr0Var, long j15) throws IOException {
        int i15;
        int iQ;
        do {
            int i16 = this.f33444e;
            if (i16 == 0) {
                pr0 pr0Var = this.f33440a;
                pr0Var.e1(this.f33445f);
                this.f33445f = (short) 0;
                if ((this.f33442c & 4) == 0) {
                    i15 = this.f33443d;
                    int iF = up0.f(pr0Var);
                    this.f33444e = iF;
                    this.f33441b = iF;
                    int iK = pr0Var.k() & 255;
                    this.f33442c = (byte) (pr0Var.k() & 255);
                    Logger logger = up0.f33965a;
                    Level level = Level.FINE;
                    byte b15 = (byte) iK;
                    if (logger.isLoggable(level)) {
                        up0.f33965a.logp(level, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", rp0.a(true, this.f33443d, this.f33441b, b15, this.f33442c));
                    }
                    iQ = pr0Var.q() & Integer.MAX_VALUE;
                    this.f33443d = iQ;
                    if (b15 != 9) {
                        throw up0.i("%s != TYPE_CONTINUATION", Byte.valueOf(b15));
                    }
                }
            } else {
                long jV1 = this.f33440a.V1(nr0Var, Math.min(j15, i16));
                if (jV1 != -1) {
                    this.f33444e -= (int) jV1;
                    return jV1;
                }
            }
            return -1L;
        } while (iQ == i15);
        throw up0.i("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // com.google.android.libraries.places.internal.es0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
