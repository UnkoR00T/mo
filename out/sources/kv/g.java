package kv;

import fv.f0;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001)\u0018\u0000 /2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-¨\u00060"}, d2 = {"Lkv/g;", "", "Ljv/e;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljv/e;IJLjava/util/concurrent/TimeUnit;)V", "Lkv/f;", "connection", "now", "d", "(Lkv/f;J)I", "Lfv/a;", "address", "Lkv/e;", "call", "", "Lfv/f0;", "routes", "", "requireMultiplexed", "a", "(Lfv/a;Lkv/e;Ljava/util/List;Z)Z", "Loq/i0;", "e", "(Lkv/f;)V", "c", "(Lkv/f;)Z", "b", "(J)J", "I", "J", "keepAliveDurationNs", "Ljv/d;", "Ljv/d;", "cleanupQueue", "kv/g$b", "Lkv/g$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "f", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxIdleConnections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long keepAliveDurationNs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jv.d cleanupQueue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b cleanupTask = new b(gv.d.f77111i + " ConnectionPool");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<f> connections = new ConcurrentLinkedQueue<>();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kv/g$b", "Ljv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends jv.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // jv.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(jv.e eVar, int i15, long j15, TimeUnit timeUnit) {
        this.maxIdleConnections = i15;
        this.keepAliveDurationNs = timeUnit.toNanos(j15);
        this.cleanupQueue = eVar.i();
        if (j15 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j15).toString());
    }

    private final int d(f connection, long now) {
        if (gv.d.f77110h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        List<Reference<e>> listO = connection.o();
        int i15 = 0;
        while (i15 < listO.size()) {
            Reference<e> reference = listO.get(i15);
            if (reference.get() != null) {
                i15++;
            } else {
                ov.h.INSTANCE.g().l("A connection to " + connection.getRoute().getAddress().getUrl() + " was leaked. Did you forget to close a response body?", ((e.b) reference).getCallStackTrace());
                listO.remove(i15);
                connection.D(true);
                if (listO.isEmpty()) {
                    connection.C(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return listO.size();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0024 A[SYNTHETIC] */
    public final boolean a(fv.a address, e call, List<f0> routes, boolean requireMultiplexed) {
        for (f fVar : this.connections) {
            synchronized (fVar) {
                if (requireMultiplexed) {
                    try {
                        if (fVar.w()) {
                            if (fVar.u(address, routes)) {
                                call.e(fVar);
                                return true;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } else if (fVar.u(address, routes)) {
                    call.e(fVar);
                    return true;
                }
                i0 i0Var = i0.f148189a;
            }
        }
        return false;
    }

    public final long b(long now) {
        int i15 = 0;
        long j15 = Long.MIN_VALUE;
        f fVar = null;
        int i16 = 0;
        for (f fVar2 : this.connections) {
            synchronized (fVar2) {
                if (d(fVar2, now) > 0) {
                    i16++;
                } else {
                    i15++;
                    long idleAtNs = now - fVar2.getIdleAtNs();
                    if (idleAtNs > j15) {
                        fVar = fVar2;
                        j15 = idleAtNs;
                    }
                    i0 i0Var = i0.f148189a;
                }
            }
        }
        long j16 = this.keepAliveDurationNs;
        if (j15 < j16 && i15 <= this.maxIdleConnections) {
            if (i15 > 0) {
                return j16 - j15;
            }
            if (i16 > 0) {
                return j16;
            }
            return -1L;
        }
        synchronized (fVar) {
            if (!fVar.o().isEmpty()) {
                return 0L;
            }
            if (fVar.getIdleAtNs() + j15 != now) {
                return 0L;
            }
            fVar.D(true);
            this.connections.remove(fVar);
            gv.d.n(fVar.getSocket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        if (gv.d.f77110h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            jv.d.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        connection.D(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.a();
        }
        return true;
    }

    public final void e(f connection) {
        if (!gv.d.f77110h || Thread.holdsLock(connection)) {
            this.connections.add(connection);
            jv.d.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
