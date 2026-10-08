package cm;

import bm.b;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T extends bm.b> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f28201a = new ReentrantReadWriteLock();

    @Override // cm.b
    public void lock() {
        this.f28201a.writeLock().lock();
    }

    @Override // cm.b
    public void unlock() {
        this.f28201a.writeLock().unlock();
    }
}
