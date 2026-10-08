package rt;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class d implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f175952b;

    public d(Lock lock) {
        this.f175952b = lock;
    }

    protected final Lock a() {
        return this.f175952b;
    }

    @Override // rt.k
    public void lock() {
        this.f175952b.lock();
    }

    @Override // rt.k
    public void unlock() {
        this.f175952b.unlock();
    }

    public /* synthetic */ d(Lock lock, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
