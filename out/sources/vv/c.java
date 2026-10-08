package vv;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR$\u0010(\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lvv/c;", "Lvv/l0;", "<init>", "()V", "Loq/i0;", "s", "", "t", "()Z", "", "now", "w", "(J)J", "x", "(J)V", "B", "Lvv/j0;", "sink", "z", "(Lvv/j0;)Lvv/j0;", "Lvv/k0;", "source", "A", "(Lvv/k0;)Lvv/k0;", "Ljava/io/IOException;", "cause", "p", "(Ljava/io/IOException;)Ljava/io/IOException;", "v", "", "f", "I", "state", "g", "index", "value", "h", "J", "u", "()J", "timeoutAt", "i", "b", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class c extends l0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f208329i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d0 f208330j = new d0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f208331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ReentrantLock f208332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Condition f208333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f208334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f208335o;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int index = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long timeoutAt;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010 ¨\u0006)"}, d2 = {"Lvv/c$a;", "", "<init>", "()V", "Lvv/c;", "node", "Loq/i0;", "g", "(Lvv/c;)V", "b", "()Lvv/c;", "Lvv/d0;", "queue", "Lvv/d0;", "f", "()Lvv/d0;", "idleSentinel", "Lvv/c;", "d", "h", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "c", "()Ljava/util/concurrent/locks/Condition;", "", "TIMEOUT_WRITE_SIZE", "I", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(c node) {
            if (d() == null) {
                h(new c());
                new b().start();
            }
            c.y(node, 0L, 1, null);
            f().a(node);
            if (node.index == 1) {
                c().signal();
            }
        }

        public final c b() throws InterruptedException {
            c cVarB = f().b();
            if (cVarB == null) {
                long jNanoTime = System.nanoTime();
                c().await(c.f208334n, TimeUnit.MILLISECONDS);
                if (f().b() != null || System.nanoTime() - jNanoTime < c.f208335o) {
                    return null;
                }
                return d();
            }
            long jW = cVarB.w(System.nanoTime());
            if (jW > 0) {
                c().await(jW, TimeUnit.NANOSECONDS);
                return null;
            }
            f().e(cVarB);
            cVarB.state = 2;
            return cVarB;
        }

        public final Condition c() {
            return c.f208333m;
        }

        public final c d() {
            return c.f208331k;
        }

        public final ReentrantLock e() {
            return c.f208332l;
        }

        public final d0 f() {
            return c.f208330j;
        }

        public final void h(c cVar) {
            c.f208331k = cVar;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lvv/c$b;", "Ljava/lang/Thread;", "<init>", "()V", "Loq/i0;", "run", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = c.f208329i.e();
                    reentrantLockE.lock();
                    try {
                        c cVarB = c.f208329i.b();
                        if (cVarB == c.f208329i.d()) {
                            c.f208329i.h(null);
                            reentrantLockE.unlock();
                            return;
                        } else {
                            oq.i0 i0Var = oq.i0.f148189a;
                            reentrantLockE.unlock();
                            if (cVarB != null) {
                                cVarB.B();
                            }
                        }
                    } catch (Throwable th4) {
                        reentrantLockE.unlock();
                        throw th4;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: vv.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vv/c$c", "Lvv/j0;", "Lvv/e;", "source", "", "byteCount", "Loq/i0;", "O3", "(Lvv/e;J)V", "flush", "()V", "close", "Lvv/c;", "b", "()Lvv/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C5469c implements j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f208340b;

        C5469c(j0 j0Var) {
            this.f208340b = j0Var;
        }

        @Override // vv.j0
        public void O3(e source, long byteCount) throws IOException {
            vv.b.b(source.getSize(), 0L, byteCount);
            while (true) {
                long j15 = 0;
                if (byteCount <= 0) {
                    return;
                }
                g0 g0Var = source.head;
                while (j15 < 65536) {
                    j15 += (long) (g0Var.limit - g0Var.pos);
                    if (j15 >= byteCount) {
                        j15 = byteCount;
                        break;
                    }
                    g0Var = g0Var.next;
                }
                c cVar = c.this;
                j0 j0Var = this.f208340b;
                cVar.s();
                try {
                    try {
                        j0Var.O3(source, j15);
                        oq.i0 i0Var = oq.i0.f148189a;
                        if (cVar.t()) {
                            throw cVar.p(null);
                        }
                        byteCount -= j15;
                    } catch (IOException e15) {
                        if (!cVar.t()) {
                            throw e15;
                        }
                        throw cVar.p(e15);
                    }
                } catch (Throwable th4) {
                    cVar.t();
                    throw th4;
                }
            }
        }

        @Override // vv.j0
        /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
        public c R() {
            return c.this;
        }

        @Override // vv.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            j0 j0Var = this.f208340b;
            cVar.s();
            try {
                try {
                    j0Var.close();
                    oq.i0 i0Var = oq.i0.f148189a;
                    if (cVar.t()) {
                        throw cVar.p(null);
                    }
                } catch (IOException e15) {
                    if (!cVar.t()) {
                        throw e15;
                    }
                    throw cVar.p(e15);
                }
            } catch (Throwable th4) {
                cVar.t();
                throw th4;
            }
        }

        @Override // vv.j0, java.io.Flushable
        public void flush() throws IOException {
            c cVar = c.this;
            j0 j0Var = this.f208340b;
            cVar.s();
            try {
                try {
                    j0Var.flush();
                    oq.i0 i0Var = oq.i0.f148189a;
                    if (cVar.t()) {
                        throw cVar.p(null);
                    }
                } catch (IOException e15) {
                    if (!cVar.t()) {
                        throw e15;
                    }
                    throw cVar.p(e15);
                }
            } catch (Throwable th4) {
                cVar.t();
                throw th4;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f208340b + ')';
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"vv/c$d", "Lvv/k0;", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "Loq/i0;", "close", "()V", "Lvv/c;", "b", "()Lvv/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0 f208342b;

        d(k0 k0Var) {
            this.f208342b = k0Var;
        }

        @Override // vv.k0
        /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
        public c R() {
            return c.this;
        }

        @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            k0 k0Var = this.f208342b;
            cVar.s();
            try {
                try {
                    k0Var.close();
                    oq.i0 i0Var = oq.i0.f148189a;
                    if (cVar.t()) {
                        throw cVar.p(null);
                    }
                } catch (IOException e15) {
                    if (!cVar.t()) {
                        throw e15;
                    }
                    throw cVar.p(e15);
                }
            } catch (Throwable th4) {
                cVar.t();
                throw th4;
            }
        }

        @Override // vv.k0
        public long k3(e sink, long byteCount) throws IOException {
            c cVar = c.this;
            k0 k0Var = this.f208342b;
            cVar.s();
            try {
                try {
                    long jK3 = k0Var.k3(sink, byteCount);
                    if (cVar.t()) {
                        throw cVar.p(null);
                    }
                    return jK3;
                } catch (IOException e15) {
                    if (cVar.t()) {
                        throw cVar.p(e15);
                    }
                    throw e15;
                }
            } catch (Throwable th4) {
                cVar.t();
                throw th4;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f208342b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f208332l = reentrantLock;
        f208333m = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f208334n = millis;
        f208335o = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static /* synthetic */ void y(c cVar, long j15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimeoutAt");
        }
        if ((i15 & 1) != 0) {
            j15 = System.nanoTime();
        }
        cVar.x(j15);
    }

    public final k0 A(k0 source) {
        return new d(source);
    }

    protected void B() {
    }

    public final IOException p(IOException cause) {
        return v(cause);
    }

    public final void s() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = f208332l;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                f208329i.g(this);
                oq.i0 i0Var = oq.i0.f148189a;
                reentrantLock.unlock();
            } catch (Throwable th4) {
                reentrantLock.unlock();
                throw th4;
            }
        }
    }

    public final boolean t() {
        ReentrantLock reentrantLock = f208332l;
        reentrantLock.lock();
        try {
            int i15 = this.state;
            this.state = 0;
            if (i15 != 1) {
                return i15 == 2;
            }
            f208330j.e(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getTimeoutAt() {
        return this.timeoutAt;
    }

    protected IOException v(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final long w(long now) {
        return this.timeoutAt - now;
    }

    public final void x(long now) {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (getTimeoutNanos() != 0 && getHasDeadline()) {
            this.timeoutAt = now + Math.min(timeoutNanos, c() - now);
        } else if (timeoutNanos != 0) {
            this.timeoutAt = now + timeoutNanos;
        } else {
            if (!hasDeadline) {
                throw new AssertionError();
            }
            this.timeoutAt = c();
        }
    }

    public final j0 z(j0 sink) {
        return new C5469c(sink);
    }
}
