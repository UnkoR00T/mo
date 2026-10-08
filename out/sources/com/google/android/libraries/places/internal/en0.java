package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes4.dex */
final class en0 implements cs0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wl0 f32220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fn0 f32221d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private cs0 f32225h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Socket f32226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f32228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32229m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32218a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nr0 f32219b = new nr0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32222e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32223f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32224g = false;

    private en0(wl0 wl0Var, fn0 fn0Var, int i15) {
        this.f32220c = (wl0) zj.p.r(wl0Var, "executor");
        this.f32221d = (fn0) zj.p.r(fn0Var, "exceptionHandler");
    }

    static en0 b(wl0 wl0Var, fn0 fn0Var, int i15) {
        return new en0(wl0Var, fn0Var, 10000);
    }

    final /* synthetic */ Socket C() {
        return this.f32226j;
    }

    final /* synthetic */ int E() {
        return this.f32228l;
    }

    final /* synthetic */ void H(int i15) {
        this.f32228l = i15;
    }

    final /* synthetic */ void I(int i15) {
        this.f32229m = i15;
    }

    @Override // com.google.android.libraries.places.internal.cs0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f32224g) {
            return;
        }
        this.f32224g = true;
        this.f32220c.execute(new an0(this));
    }

    final /* synthetic */ nr0 d() {
        return this.f32219b;
    }

    @Override // com.google.android.libraries.places.internal.cs0, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f32224g) {
            throw new IOException("closed");
        }
        int i15 = fr0.f32341a;
        synchronized (this.f32218a) {
            try {
                if (this.f32223f) {
                    return;
                }
                this.f32223f = true;
                this.f32220c.execute(new zm0(this));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final void h(cs0 cs0Var, Socket socket) {
        zj.p.x(this.f32225h == null, "AsyncSink's becomeConnected should only be called once.");
        this.f32225h = (cs0) zj.p.r(cs0Var, "sink");
        this.f32226j = (Socket) zj.p.r(socket, "socket");
    }

    final /* synthetic */ Object m() {
        return this.f32218a;
    }

    final /* synthetic */ fn0 p() {
        return this.f32221d;
    }

    final /* synthetic */ int q() {
        return this.f32229m;
    }

    @Override // com.google.android.libraries.places.internal.cs0
    public final void q1(nr0 nr0Var, long j15) throws IOException {
        zj.p.r(nr0Var, "source");
        if (this.f32224g) {
            throw new IOException("closed");
        }
        int i15 = fr0.f32341a;
        synchronized (this.f32218a) {
            try {
                nr0 nr0Var2 = this.f32219b;
                nr0Var2.q1(nr0Var, j15);
                int i16 = this.f32229m + this.f32228l;
                this.f32229m = i16;
                boolean z15 = false;
                this.f32228l = 0;
                if (this.f32227k || i16 <= 10000) {
                    if (!this.f32222e && !this.f32223f && nr0Var2.o() > 0) {
                        this.f32222e = true;
                    }
                    return;
                }
                this.f32227k = true;
                z15 = true;
                if (!z15) {
                    this.f32220c.execute(new ym0(this));
                    return;
                }
                try {
                    this.f32226j.close();
                } catch (IOException e15) {
                    this.f32221d.h(e15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final /* synthetic */ void r(boolean z15) {
        this.f32222e = false;
    }

    final /* synthetic */ void u(boolean z15) {
        this.f32223f = false;
    }

    final /* synthetic */ cs0 y() {
        return this.f32225h;
    }
}
