package p076m2;

import e3.g;
import er.p;
import ju.d2;
import ju.h2;
import ju.k;
import ju.m0;
import ju.p0;
import ju.q0;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import tq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0018\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lm2/v1;", "Lm2/u4;", "Lju/m0;", "Ltq/i;", "parentCoroutineContext", "Lkotlin/Function2;", "Lju/p0;", "Ltq/e;", "Loq/i0;", "", "task", "<init>", "(Ltq/i;Ler/p;)V", "c", "()V", "e", "d", "context", "", "exception", "i1", "(Ltq/i;Ljava/lang/Throwable;)V", "a", "Ltq/i;", "b", "Ler/p;", "Lju/p0;", "scope", "Lju/d2;", "Lju/d2;", "job", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1 implements u4, m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i parentCoroutineContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<p0, e<? super i0>, Object> task;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d2 job;

    /* JADX WARN: Multi-variable type inference failed */
    public v1(i iVar, p<? super p0, ? super e<? super i0>, ? extends Object> pVar) {
        this.parentCoroutineContext = iVar;
        this.task = pVar;
        i iVarN0 = iVar.n0(this);
        this.scope = q0.a(g.isVerboseTracingEnabled ? iVarN0.n0(w1.f123212c) : iVarN0);
    }

    @Override // tq.i
    public /* bridge */ i D1(i.c<?> cVar) {
        return m0.a.c(this, cVar);
    }

    @Override // p076m2.u4
    public void c() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            h2.e(d2Var, "Old job was still running!", null, 2, null);
        }
        this.job = k.d(this.scope, null, null, this.task, 3, null);
    }

    @Override // p076m2.u4
    public void d() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2Var.u(new y1());
        }
        this.job = null;
    }

    @Override // p076m2.u4
    public void e() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2Var.u(new y1());
        }
        this.job = null;
    }

    @Override // tq.i.b
    public i.c<?> getKey() {
        return m0.INSTANCE;
    }

    @Override // ju.m0
    public void i1(i context, Throwable exception) throws Throwable {
        e3.k kVar = (e3.k) context.m(e3.k.INSTANCE);
        if (kVar != null) {
            kVar.a(exception, this);
        }
        m0 m0Var = (m0) this.parentCoroutineContext.m(m0.INSTANCE);
        if (m0Var == null) {
            throw exception;
        }
        m0Var.i1(context, exception);
    }

    @Override // tq.i.b, tq.i
    public /* bridge */ <E extends i.b> E m(i.c<E> cVar) {
        return (E) m0.a.b(this, cVar);
    }

    @Override // tq.i
    public /* bridge */ i n0(i iVar) {
        return m0.a.d(this, iVar);
    }

    @Override // tq.i
    public /* bridge */ <R> R s1(R r15, p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) m0.a.a(this, r15, pVar);
    }
}
