package yk;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
class x<T> implements kl.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set<T> f227524b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set<kl.b<T>> f227523a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection<kl.b<T>> collection) {
        this.f227523a.addAll(collection);
    }

    static x<?> b(Collection<kl.b<?>> collection) {
        return new x<>((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator<kl.b<T>> it = this.f227523a.iterator();
            while (it.hasNext()) {
                this.f227524b.add(it.next().get());
            }
            this.f227523a = null;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    synchronized void a(kl.b<T> bVar) {
        try {
            if (this.f227524b == null) {
                this.f227523a.add(bVar);
            } else {
                this.f227524b.add(bVar.get());
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // kl.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f227524b == null) {
            synchronized (this) {
                try {
                    if (this.f227524b == null) {
                        this.f227524b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return Collections.unmodifiableSet(this.f227524b);
    }
}
