package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
final class nn0 implements lb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final si0 f33070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f33071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final si0 f33072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ScheduledExecutorService f33073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final qm0 f33074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final SSLSocketFactory f33075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final to0 f33076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ma0 f33077h = new ma0("keepalive time nanos", Long.MAX_VALUE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33078j;

    /* synthetic */ nn0(si0 si0Var, si0 si0Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, to0 to0Var, int i15, boolean z15, long j15, long j16, int i16, boolean z16, int i17, qm0 qm0Var, boolean z17, h40 h40Var, byte[] bArr) {
        this.f33070a = si0Var;
        this.f33071b = (Executor) si0Var.zza();
        this.f33072c = si0Var2;
        this.f33073d = (ScheduledExecutorService) si0Var2.zza();
        this.f33075f = sSLSocketFactory;
        this.f33076g = to0Var;
        this.f33074e = (qm0) zj.p.r(qm0Var, "transportTracerFactory");
    }

    @Override // com.google.android.libraries.places.internal.lb0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33078j) {
            return;
        }
        this.f33078j = true;
        this.f33070a.c(this.f33071b);
        this.f33072c.c(this.f33073d);
    }

    @Override // com.google.android.libraries.places.internal.lb0
    public final vb0 f3(SocketAddress socketAddress, kb0 kb0Var, i40 i40Var) {
        if (this.f33078j) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new ao0(this, (InetSocketAddress) socketAddress, kb0Var.a(), kb0Var.e(), kb0Var.c(), kb0Var.g(), new mn0(this, this.f33077h.a()), null);
    }

    @Override // com.google.android.libraries.places.internal.lb0
    public final ScheduledExecutorService zzb() {
        return this.f33073d;
    }
}
