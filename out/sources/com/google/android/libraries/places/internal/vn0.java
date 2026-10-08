package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
final class vn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f34073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CyclicBarrier f34074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ en0 f34075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f34076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ao0 f34077e;

    vn0(ao0 ao0Var, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, en0 en0Var, CountDownLatch countDownLatch2) {
        this.f34073a = countDownLatch;
        this.f34074b = cyclicBarrier;
        this.f34075c = en0Var;
        this.f34076d = countDownLatch2;
        Objects.requireNonNull(ao0Var);
        this.f34077e = ao0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ao0 ao0Var;
        yn0 yn0Var;
        pr0 pr0VarC = tr0.c(new un0(this));
        try {
            try {
                try {
                    try {
                        this.f34073a.await();
                        this.f34074b.await(1000L, TimeUnit.MILLISECONDS);
                    } catch (Throwable th4) {
                        ao0 ao0Var2 = this.f34077e;
                        ao0Var2.v(new yn0(ao0Var2, ao0Var2.l().b(pr0VarC, true)));
                        this.f34076d.countDown();
                        throw th4;
                    }
                } catch (m90 e15) {
                    this.f34077e.e0(0, ip0.INTERNAL_ERROR, e15.a());
                    ao0Var = this.f34077e;
                    yn0Var = new yn0(ao0Var, ao0Var.l().b(pr0VarC, true));
                    ao0Var.v(yn0Var);
                    this.f34076d.countDown();
                    return;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (BrokenBarrierException | TimeoutException unused2) {
                ao0Var = this.f34077e;
                ao0Var.e0(0, ip0.INTERNAL_ERROR, l90.f32815m.e("Timed out waiting for second handshake thread. The transport executor pool may have run out of threads"));
                yn0Var = new yn0(ao0Var, ao0Var.l().b(pr0VarC, true));
                ao0Var.v(yn0Var);
                this.f34076d.countDown();
                return;
            }
            ao0 ao0Var3 = this.f34077e;
            y50 y50Var = ao0Var3.N;
            if (y50Var == null) {
                ao0Var3.h0(ao0Var3.A().createSocket(ao0Var3.j().getAddress(), ao0Var3.j().getPort()));
            } else {
                if (!(y50Var.c() instanceof InetSocketAddress)) {
                    l90 l90Var = l90.f32814l;
                    String strValueOf = String.valueOf(y50Var.c().getClass());
                    StringBuilder sb5 = new StringBuilder(strValueOf.length() + 41);
                    sb5.append("Unsupported SocketAddress implementation ");
                    sb5.append(strValueOf);
                    throw new m90(l90Var.e(sb5.toString()), null);
                }
                ao0Var3.h0(ao0Var3.c0(y50Var.d(), (InetSocketAddress) y50Var.c(), y50Var.b(), y50Var.a()));
            }
            if (ao0Var3.B() != null) {
                SSLSocketFactory sSLSocketFactoryB = ao0Var3.B();
                HostnameVerifier hostnameVerifierC = ao0Var3.C();
                Socket socketG0 = ao0Var3.g0();
                String strU = ao0Var3.U();
                int iV = ao0Var3.V();
                to0 to0VarG = ao0Var3.G();
                List list = io0.f32585a;
                zj.p.r(sSLSocketFactoryB, "sslSocketFactory");
                zj.p.r(socketG0, "socket");
                zj.p.r(to0VarG, "spec");
                SSLSocket sSLSocket = (SSLSocket) sSLSocketFactoryB.createSocket(socketG0, strU, iV, true);
                to0VarG.b(sSLSocket, false);
                String strA = go0.d().a(sSLSocket, strU, to0VarG.a() ? io0.f32585a : null);
                List list2 = io0.f32585a;
                boolean zContains = list2.contains(fp0.b(strA));
                String strValueOf2 = String.valueOf(list2);
                StringBuilder sb6 = new StringBuilder(strValueOf2.length() + 50);
                sb6.append("Only ");
                sb6.append(strValueOf2);
                sb6.append(" are supported, but negotiated protocol is %s");
                zj.p.B(zContains, sb6.toString(), strA);
                if (!hostnameVerifierC.verify((strU.startsWith("[") && strU.endsWith("]")) ? strU.substring(1, strU.length() - 1) : strU, sSLSocket.getSession())) {
                    throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(strU));
                }
                ao0Var3.i(sSLSocket.getSession());
                ao0Var3.h0(sSLSocket);
            }
            ao0Var3.g0().setTcpNoDelay(true);
            pr0 pr0VarC2 = tr0.c(tr0.b(ao0Var3.g0()));
            this.f34075c.h(tr0.a(ao0Var3.g0()), ao0Var3.g0());
            z30 z30VarC = ao0Var3.w().c();
            z30VarC.a(w50.f34113a, ao0Var3.g0().getRemoteSocketAddress());
            z30VarC.a(w50.f34114b, ao0Var3.g0().getLocalSocketAddress());
            z30VarC.a(w50.f34115c, ao0Var3.i0());
            z30VarC.a(qe0.f33407a, ao0Var3.i0() == null ? e90.NONE : e90.PRIVACY_AND_INTEGRITY);
            ao0Var3.x(z30VarC.c());
            ao0Var3.v(new yn0(ao0Var3, ao0Var3.l().b(pr0VarC2, true)));
            this.f34076d.countDown();
            synchronized (ao0Var3.p()) {
                try {
                    ao0Var3.D((Socket) zj.p.r(ao0Var3.g0(), "socket"));
                    if (ao0Var3.i0() != null) {
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        } catch (Exception e16) {
            ao0 ao0Var4 = this.f34077e;
            ao0Var4.h(e16);
            ao0Var = ao0Var4;
        }
    }
}
