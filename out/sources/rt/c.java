package rt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import oq.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f175950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final er.l<InterruptedException, i0> f175951d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Lock lock, Runnable runnable, er.l<? super InterruptedException, i0> lVar) {
        super(lock);
        this.f175950c = runnable;
        this.f175951d = lVar;
    }

    @Override // rt.d, rt.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f175950c.run();
            } catch (InterruptedException e15) {
                this.f175951d.b(e15);
                return;
            }
        }
    }

    public c(Runnable runnable, er.l<? super InterruptedException, i0> lVar) {
        this(new ReentrantLock(), runnable, lVar);
    }
}
