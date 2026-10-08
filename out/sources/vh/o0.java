package vh;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class o0<TResult> extends l<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f206831a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0 f206832b = new k0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f206833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f206834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f206835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f206836f;

    o0() {
    }

    private final void A() {
        if (this.f206834d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void B() {
        synchronized (this.f206831a) {
            try {
                if (this.f206833c) {
                    this.f206832b.b(this);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void y() {
        jg.s.p(this.f206833c, "Task is not yet complete");
    }

    private final void z() {
        if (this.f206833c) {
            throw d.a(this);
        }
    }

    @Override // vh.l
    public final l<TResult> a(Executor executor, e eVar) {
        this.f206832b.a(new a0(executor, eVar));
        B();
        return this;
    }

    @Override // vh.l
    public final l<TResult> b(Executor executor, f<TResult> fVar) {
        this.f206832b.a(new c0(executor, fVar));
        B();
        return this;
    }

    @Override // vh.l
    public final l<TResult> c(f<TResult> fVar) {
        this.f206832b.a(new c0(n.f206828a, fVar));
        B();
        return this;
    }

    @Override // vh.l
    public final l<TResult> d(Executor executor, g gVar) {
        this.f206832b.a(new e0(executor, gVar));
        B();
        return this;
    }

    @Override // vh.l
    public final l<TResult> e(g gVar) {
        d(n.f206828a, gVar);
        return this;
    }

    @Override // vh.l
    public final l<TResult> f(Executor executor, h<? super TResult> hVar) {
        this.f206832b.a(new g0(executor, hVar));
        B();
        return this;
    }

    @Override // vh.l
    public final l<TResult> g(h<? super TResult> hVar) {
        f(n.f206828a, hVar);
        return this;
    }

    @Override // vh.l
    public final <TContinuationResult> l<TContinuationResult> h(Executor executor, c<TResult, TContinuationResult> cVar) {
        o0 o0Var = new o0();
        this.f206832b.a(new w(executor, cVar, o0Var));
        B();
        return o0Var;
    }

    @Override // vh.l
    public final <TContinuationResult> l<TContinuationResult> i(c<TResult, TContinuationResult> cVar) {
        return h(n.f206828a, cVar);
    }

    @Override // vh.l
    public final <TContinuationResult> l<TContinuationResult> j(Executor executor, c<TResult, l<TContinuationResult>> cVar) {
        o0 o0Var = new o0();
        this.f206832b.a(new y(executor, cVar, o0Var));
        B();
        return o0Var;
    }

    @Override // vh.l
    public final <TContinuationResult> l<TContinuationResult> k(c<TResult, l<TContinuationResult>> cVar) {
        return j(n.f206828a, cVar);
    }

    @Override // vh.l
    public final Exception l() {
        Exception exc;
        synchronized (this.f206831a) {
            exc = this.f206836f;
        }
        return exc;
    }

    @Override // vh.l
    public final TResult m() {
        TResult tresult;
        synchronized (this.f206831a) {
            try {
                y();
                A();
                Exception exc = this.f206836f;
                if (exc != null) {
                    throw new j(exc);
                }
                tresult = (TResult) this.f206835e;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return tresult;
    }

    @Override // vh.l
    public final <X extends Throwable> TResult n(Class<X> cls) {
        TResult tresult;
        synchronized (this.f206831a) {
            try {
                y();
                A();
                if (cls.isInstance(this.f206836f)) {
                    throw cls.cast(this.f206836f);
                }
                Exception exc = this.f206836f;
                if (exc != null) {
                    throw new j(exc);
                }
                tresult = (TResult) this.f206835e;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return tresult;
    }

    @Override // vh.l
    public final boolean o() {
        return this.f206834d;
    }

    @Override // vh.l
    public final boolean p() {
        boolean z15;
        synchronized (this.f206831a) {
            z15 = this.f206833c;
        }
        return z15;
    }

    @Override // vh.l
    public final boolean q() {
        boolean z15;
        synchronized (this.f206831a) {
            try {
                z15 = false;
                if (this.f206833c && !this.f206834d && this.f206836f == null) {
                    z15 = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // vh.l
    public final <TContinuationResult> l<TContinuationResult> r(Executor executor, k<TResult, TContinuationResult> kVar) {
        o0 o0Var = new o0();
        this.f206832b.a(new i0(executor, kVar, o0Var));
        B();
        return o0Var;
    }

    @Override // vh.l
    public final <TContinuationResult> l<TContinuationResult> s(k<TResult, TContinuationResult> kVar) {
        Executor executor = n.f206828a;
        o0 o0Var = new o0();
        this.f206832b.a(new i0(executor, kVar, o0Var));
        B();
        return o0Var;
    }

    public final void t(Object obj) {
        synchronized (this.f206831a) {
            z();
            this.f206833c = true;
            this.f206835e = obj;
        }
        this.f206832b.b(this);
    }

    public final boolean u(Object obj) {
        synchronized (this.f206831a) {
            try {
                if (this.f206833c) {
                    return false;
                }
                this.f206833c = true;
                this.f206835e = obj;
                this.f206832b.b(this);
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void v(Exception exc) {
        jg.s.m(exc, "Exception must not be null");
        synchronized (this.f206831a) {
            z();
            this.f206833c = true;
            this.f206836f = exc;
        }
        this.f206832b.b(this);
    }

    public final boolean w(Exception exc) {
        jg.s.m(exc, "Exception must not be null");
        synchronized (this.f206831a) {
            try {
                if (this.f206833c) {
                    return false;
                }
                this.f206833c = true;
                this.f206836f = exc;
                this.f206832b.b(this);
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean x() {
        synchronized (this.f206831a) {
            try {
                if (this.f206833c) {
                    return false;
                }
                this.f206833c = true;
                this.f206834d = true;
                this.f206832b.b(this);
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
