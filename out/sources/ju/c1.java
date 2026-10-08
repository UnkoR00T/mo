package ju;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¨\u0006\u0017"}, d2 = {"Lju/c1;", "T", "Lou/a0;", "Ltq/i;", "context", "Ltq/e;", "uCont", "<init>", "(Ltq/i;Ltq/e;)V", "", "u1", "()Z", "t1", "", "state", "Loq/i0;", "z", "(Ljava/lang/Object;)V", "k1", "q1", "()Ljava/lang/Object;", "Liu/c;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1<T> extends ou.a0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105664e = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public c1(tq.i iVar, tq.e<? super T> eVar) {
        super(iVar, eVar);
    }

    private final boolean t1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105664e;
        do {
            int i15 = atomicIntegerFieldUpdater.get(this);
            if (i15 != 0) {
                if (i15 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f105664e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean u1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105664e;
        do {
            int i15 = atomicIntegerFieldUpdater.get(this);
            if (i15 != 0) {
                if (i15 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f105664e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // ou.a0, ju.a
    protected void k1(Object state) {
        if (t1()) {
            return;
        }
        ou.j.b(uq.b.c(this.uCont), e0.a(state, this.uCont));
    }

    public final Object q1() {
        if (u1()) {
            return uq.b.e();
        }
        Object objH = k2.h(s0());
        if (objH instanceof c0) {
            throw ((c0) objH).cause;
        }
        return objH;
    }

    @Override // ou.a0, ju.j2
    protected void z(Object state) {
        k1(state);
    }
}
