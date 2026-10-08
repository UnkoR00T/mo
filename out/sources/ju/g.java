package ju;

import java.util.concurrent.locks.LockSupport;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lju/g;", "T", "Lju/a;", "Ltq/i;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lju/m1;", "eventLoop", "<init>", "(Ltq/i;Ljava/lang/Thread;Lju/m1;)V", "", "state", "Loq/i0;", "z", "(Ljava/lang/Object;)V", "p1", "()Ljava/lang/Object;", "d", "Ljava/lang/Thread;", "e", "Lju/m1;", "", "A0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Thread blockedThread;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m1 eventLoop;

    public g(tq.i iVar, Thread thread, m1 m1Var) {
        super(iVar, true, true);
        this.blockedThread = thread;
        this.eventLoop = m1Var;
    }

    @Override // ju.j2
    protected boolean A0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T p1() throws Throwable {
        c.a();
        try {
            m1 m1Var = this.eventLoop;
            if (m1Var != null) {
                m1.A2(m1Var, false, 1, null);
            }
            while (true) {
                try {
                    m1 m1Var2 = this.eventLoop;
                    long jP2 = m1Var2 != null ? m1Var2.P2() : Long.MAX_VALUE;
                    if (r()) {
                        break;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jP2);
                    if (Thread.interrupted()) {
                        D(new InterruptedException());
                    }
                } catch (Throwable th4) {
                    m1 m1Var3 = this.eventLoop;
                    if (m1Var3 != null) {
                        m1.i2(m1Var3, false, 1, null);
                    }
                    throw th4;
                }
            }
            m1 m1Var4 = this.eventLoop;
            if (m1Var4 != null) {
                m1.i2(m1Var4, false, 1, null);
            }
            c.a();
            T t15 = (T) k2.h(s0());
            c0 c0Var = t15 instanceof c0 ? (c0) t15 : null;
            if (c0Var == null) {
                return t15;
            }
            throw c0Var.cause;
        } catch (Throwable th5) {
            c.a();
            throw th5;
        }
    }

    @Override // ju.j2
    protected void z(Object state) {
        if (fr.t.c(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        c.a();
        LockSupport.unpark(thread);
    }
}
