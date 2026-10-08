package de;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ve.k;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f41091a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f41092b = new b();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f41093a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f41094b;

        a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<a> f41095a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVarPoll;
            synchronized (this.f41095a) {
                aVarPoll = this.f41095a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.f41095a) {
                try {
                    if (this.f41095a.size() < 10) {
                        this.f41095a.offer(aVar);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = this.f41091a.get(str);
                if (aVarA == null) {
                    aVarA = this.f41092b.a();
                    this.f41091a.put(str, aVarA);
                }
                aVarA.f41094b++;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        aVarA.f41093a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f41091a.get(str));
                int i15 = aVar.f41094b;
                if (i15 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f41094b);
                }
                int i16 = i15 - 1;
                aVar.f41094b = i16;
                if (i16 == 0) {
                    a aVarRemove = this.f41091a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f41092b.b(aVarRemove);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        aVar.f41093a.unlock();
    }
}
