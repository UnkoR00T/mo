package ou;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.c3;
import ju.d1;
import ju.m1;
import ju.t0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u0010R\u0014\u00104\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001a\u00106\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0014R\u001c\u00108\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010$\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0>8\u0002X\u0082\u0004¨\u0006@"}, d2 = {"Lou/i;", "T", "Lju/d1;", "Lvq/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ltq/e;", "Lju/l0;", "dispatcher", "continuation", "<init>", "(Lju/l0;Ltq/e;)V", "", "q", "()Z", "Loq/i0;", "l", "()V", "t", "Lju/p;", "m", "()Lju/p;", "Lju/n;", "", "u", "(Lju/n;)Ljava/lang/Throwable;", "cause", "s", "(Ljava/lang/Throwable;)Z", "", "k", "()Ljava/lang/Object;", "Loq/t;", "result", "i", "(Ljava/lang/Object;)V", "Ltq/i;", "context", "value", "n", "(Ltq/i;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "d", "Lju/l0;", "e", "Ltq/e;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "o", "reusableCancellableContinuation", "()Lvq/e;", "callerFrame", "b", "()Ltq/e;", "delegate", "c", "()Ltq/i;", "Liu/e;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<T> extends d1<T> implements vq.e, tq.e<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f150037h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final ju.l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final tq.e<T> continuation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Object _state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public i(ju.l0 l0Var, tq.e<? super T> eVar) {
        super(-1);
        this.dispatcher = l0Var;
        this.continuation = eVar;
        this._state = j.f150042a;
        this.countOrElement = l0.g(getContext());
    }

    private final ju.p<?> o() {
        Object obj = f150037h.get(this);
        if (obj instanceof ju.p) {
            return (ju.p) obj;
        }
        return null;
    }

    @Override // ju.d1
    public tq.e<T> b() {
        return this;
    }

    @Override // tq.e
    /* JADX INFO: renamed from: c */
    public tq.i getContext() {
        return this.continuation.getContext();
    }

    @Override // vq.e
    public vq.e e() {
        tq.e<T> eVar = this.continuation;
        if (eVar instanceof vq.e) {
            return (vq.e) eVar;
        }
        return null;
    }

    @Override // tq.e
    public void i(Object result) {
        Object objB = ju.e0.b(result);
        if (j.d(this.dispatcher, getContext())) {
            this._state = objB;
            this.resumeMode = 0;
            j.c(this.dispatcher, getContext(), this);
            return;
        }
        m1 m1VarB = c3.f105666a.b();
        if (m1VarB.I2()) {
            this._state = objB;
            this.resumeMode = 0;
            m1VarB.t2(this);
            return;
        }
        m1VarB.y2(true);
        try {
            tq.i iVarC = getContext();
            Object objI = l0.i(iVarC, this.countOrElement);
            try {
                this.continuation.i(result);
                oq.i0 i0Var = oq.i0.f148189a;
                l0.f(iVarC, objI);
                while (m1VarB.Q2()) {
                }
            } catch (Throwable th4) {
                l0.f(iVarC, objI);
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                j(th5);
            } finally {
                m1VarB.d2(true);
            }
        }
    }

    @Override // ju.d1
    public Object k() {
        Object obj = this._state;
        this._state = j.f150042a;
        return obj;
    }

    public final void l() {
        while (f150037h.get(this) == j.f150043b) {
        }
    }

    public final ju.p<T> m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f150037h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f150037h.set(this, j.f150043b);
                return null;
            }
            if (obj instanceof ju.p) {
                if (androidx.concurrent.futures.b.a(f150037h, this, obj, j.f150043b)) {
                    return (ju.p) obj;
                }
            } else if (obj != j.f150043b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(tq.i context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.K1(context, this);
    }

    public final boolean q() {
        return f150037h.get(this) != null;
    }

    public final boolean s(Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f150037h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0 e0Var = j.f150043b;
            if (fr.t.c(obj, e0Var)) {
                if (androidx.concurrent.futures.b.a(f150037h, this, e0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f150037h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void t() {
        l();
        ju.p<?> pVarO = o();
        if (pVarO != null) {
            pVarO.s();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + t0.c(this.continuation) + ']';
    }

    public final Throwable u(ju.n<?> continuation) {
        e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f150037h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0Var = j.f150043b;
            if (obj != e0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f150037h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f150037h, this, e0Var, continuation));
        return null;
    }
}
