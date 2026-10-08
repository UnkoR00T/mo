package cm;

import bm.b;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import r0.c0;

/* JADX INFO: loaded from: classes4.dex */
public class f<T extends bm.b> extends cm.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<T> f28214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0<Integer, Set<? extends bm.a<T>>> f28215c = new c0<>(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReadWriteLock f28216d = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f28217e = Executors.newCachedThreadPool();

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f28218a;

        public a(int i15) {
            this.f28218a = i15;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            f.this.j(this.f28218a);
        }
    }

    public f(b<T> bVar) {
        this.f28214b = bVar;
    }

    private void i() {
        this.f28215c.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends bm.a<T>> j(int i15) {
        this.f28216d.readLock().lock();
        Set<? extends bm.a<T>> setD = this.f28215c.d(Integer.valueOf(i15));
        this.f28216d.readLock().unlock();
        if (setD == null) {
            this.f28216d.writeLock().lock();
            setD = this.f28215c.d(Integer.valueOf(i15));
            if (setD == null) {
                setD = this.f28214b.f(i15);
                this.f28215c.e(Integer.valueOf(i15), setD);
            }
            this.f28216d.writeLock().unlock();
        }
        return setD;
    }

    @Override // cm.b
    public Collection<T> a() {
        return this.f28214b.a();
    }

    @Override // cm.b
    public boolean c(Collection<T> collection) {
        boolean zC = this.f28214b.c(collection);
        if (zC) {
            i();
        }
        return zC;
    }

    @Override // cm.b
    public void d() {
        this.f28214b.d();
        i();
    }

    @Override // cm.b
    public Set<? extends bm.a<T>> f(float f15) {
        int i15 = (int) f15;
        Set<? extends bm.a<T>> setJ = j(i15);
        int i16 = i15 + 1;
        if (this.f28215c.d(Integer.valueOf(i16)) == null) {
            this.f28217e.execute(new a(i16));
        }
        int i17 = i15 - 1;
        if (this.f28215c.d(Integer.valueOf(i17)) == null) {
            this.f28217e.execute(new a(i17));
        }
        return setJ;
    }

    @Override // cm.b
    public int g() {
        return this.f28214b.g();
    }
}
