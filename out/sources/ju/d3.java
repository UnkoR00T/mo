package ju;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lju/d3;", "Lju/i2;", "<init>", "()V", "", "state", "", "B", "(I)Ljava/lang/Void;", "Lju/d2;", "job", "Loq/i0;", "C", "(Lju/d2;)V", "z", "", "cause", "x", "(Ljava/lang/Throwable;)V", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "e", "Ljava/lang/Thread;", "targetThread", "Lju/i1;", "f", "Lju/i1;", "cancelHandle", "", "w", "()Z", "onCancelling", "Liu/c;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d3 extends i2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105672g = AtomicIntegerFieldUpdater.newUpdater(d3.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Thread targetThread = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private i1 cancelHandle;

    private final Void B(int state) {
        throw new IllegalStateException(("Illegal state " + state).toString());
    }

    public final void C(d2 job) {
        int i15;
        this.cancelHandle = h2.m(job, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105672g;
        do {
            i15 = atomicIntegerFieldUpdater.get(this);
            if (i15 != 0) {
                if (i15 == 2 || i15 == 3) {
                    return;
                }
                B(i15);
                throw new oq.g();
            }
        } while (!f105672g.compareAndSet(this, i15, 0));
    }

    @Override // ju.i2
    public boolean w() {
        return true;
    }

    @Override // ju.i2
    public void x(Throwable cause) {
        int i15;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105672g;
        do {
            i15 = atomicIntegerFieldUpdater.get(this);
            if (i15 != 0) {
                if (i15 == 1 || i15 == 2 || i15 == 3) {
                    return;
                }
                B(i15);
                throw new oq.g();
            }
        } while (!f105672g.compareAndSet(this, i15, 2));
        this.targetThread.interrupt();
        f105672g.set(this, 3);
    }

    public final void z() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105672g;
        while (true) {
            int i15 = atomicIntegerFieldUpdater.get(this);
            if (i15 != 0) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        B(i15);
                        throw new oq.g();
                    }
                }
            } else if (f105672g.compareAndSet(this, i15, 1)) {
                i1 i1Var = this.cancelHandle;
                if (i1Var != null) {
                    i1Var.j();
                    return;
                }
                return;
            }
        }
    }
}
