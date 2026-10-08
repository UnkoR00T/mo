package w7;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f210699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f210700b;

    public k() {
        this(h.f210683a);
    }

    public synchronized void a() {
        while (!this.f210700b) {
            this.f210699a.f();
            wait();
        }
    }

    public synchronized void b() {
        boolean z15 = false;
        while (!this.f210700b) {
            try {
                this.f210699a.f();
                wait();
            } catch (InterruptedException unused) {
                z15 = true;
            }
        }
        if (z15) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c(long j15) {
        try {
            if (j15 <= 0) {
                return this.f210700b;
            }
            long jB = this.f210699a.b();
            long j16 = j15 + jB;
            if (j16 < jB) {
                b();
            } else {
                boolean z15 = false;
                while (!this.f210700b && jB < j16) {
                    try {
                        this.f210699a.f();
                        wait(j16 - jB);
                    } catch (InterruptedException unused) {
                        z15 = true;
                    }
                    jB = this.f210699a.b();
                }
                if (z15) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f210700b;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public synchronized boolean d() {
        boolean z15;
        z15 = this.f210700b;
        this.f210700b = false;
        return z15;
    }

    public synchronized boolean e() {
        return this.f210700b;
    }

    public synchronized boolean f() {
        if (this.f210700b) {
            return false;
        }
        this.f210700b = true;
        notifyAll();
        return true;
    }

    public k(h hVar) {
        this.f210699a = hVar;
    }
}
