package ou;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ou.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004R\u0013\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lou/c;", "N", "", "prev", "<init>", "(Lou/c;)V", "value", "", "o", "(Lou/c;)Z", "Loq/i0;", "b", "()V", "m", "()Z", "n", "g", "()Ljava/lang/Object;", "nextOrClosed", "c", "()Lou/c;", "aliveSegmentLeft", "d", "aliveSegmentRight", "f", "next", "l", "isTail", "h", "k", "isRemoved", "Liu/e;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c<N extends c<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f150027a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f150028b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(N n15) {
        this._prev$volatile = n15;
    }

    private final N c() {
        N n15 = (N) h();
        while (n15 != null && n15.k()) {
            n15 = (N) f150028b.get(n15);
        }
        return n15;
    }

    private final N d() {
        c cVarF;
        N n15 = (N) f();
        while (n15.k() && (cVarF = n15.f()) != null) {
            n15 = (N) cVarF;
        }
        return n15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f150027a.get(this);
    }

    public final void b() {
        f150028b.set(this, null);
    }

    public final N f() {
        Object objG = g();
        if (objG == b.f150024a) {
            return null;
        }
        return (N) objG;
    }

    public final N h() {
        return (N) f150028b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f150027a, this, null, b.f150024a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            c cVarC = c();
            c cVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f150028b;
            do {
                obj = atomicReferenceFieldUpdater.get(cVarD);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, cVarD, obj, ((c) obj) == null ? null : cVarC));
            if (cVarC != null) {
                f150027a.set(cVarC, cVarD);
            }
            if (!cVarD.k() || cVarD.l()) {
                if (cVarC == null || !cVarC.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(N value) {
        return androidx.concurrent.futures.b.a(f150027a, this, null, value);
    }
}
