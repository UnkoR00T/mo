package vd;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class i extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<n<?>> f206171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f206172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f206173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f206174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f206175e = false;

    public i(BlockingQueue<n<?>> blockingQueue, h hVar, b bVar, q qVar) {
        this.f206171a = blockingQueue;
        this.f206172b = hVar;
        this.f206173c = bVar;
        this.f206174d = qVar;
    }

    @TargetApi(14)
    private void a(n<?> nVar) {
        TrafficStats.setThreadStatsTag(nVar.H());
    }

    private void b(n<?> nVar, u uVar) {
        this.f206174d.b(nVar, nVar.Q(uVar));
    }

    private void c() {
        d(this.f206171a.take());
    }

    void d(n<?> nVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        nVar.S(3);
        try {
            nVar.e("network-queue-take");
            if (nVar.K()) {
                nVar.p("network-discard-cancelled");
                nVar.O();
                return;
            }
            a(nVar);
            k kVarA = this.f206172b.a(nVar);
            nVar.e("network-http-complete");
            if (kVarA.f206180e && nVar.J()) {
                nVar.p("not-modified");
                nVar.O();
                return;
            }
            p<?> pVarR = nVar.R(kVarA);
            nVar.e("network-parse-complete");
            if (nVar.a0() && pVarR.f206218b != null) {
                this.f206173c.b(nVar.t(), pVarR.f206218b);
                nVar.e("network-cache-written");
            }
            nVar.N();
            this.f206174d.c(nVar, pVarR);
            nVar.P(pVarR);
        } catch (Exception e15) {
            v.d(e15, "Unhandled exception %s", e15.toString());
            u uVar = new u(e15);
            uVar.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.f206174d.b(nVar, uVar);
            nVar.O();
        } catch (u e16) {
            e16.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            b(nVar, e16);
            nVar.O();
        } finally {
            nVar.S(4);
        }
    }

    public void e() {
        this.f206175e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f206175e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
