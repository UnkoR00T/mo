package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class y<TResult, TContinuationResult> implements h<TContinuationResult>, g, e, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f206853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f206854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f206855c;

    public y(Executor executor, c cVar, o0 o0Var) {
        this.f206853a = executor;
        this.f206854b = cVar;
        this.f206855c = o0Var;
    }

    @Override // vh.h
    public final void a(TContinuationResult tcontinuationresult) {
        this.f206855c.t(tcontinuationresult);
    }

    @Override // vh.e
    public final void b() {
        this.f206855c.x();
    }

    @Override // vh.g
    public final void c(Exception exc) {
        this.f206855c.v(exc);
    }

    @Override // vh.j0
    public final void d(l lVar) {
        this.f206853a.execute(new x(this, lVar));
    }

    final /* synthetic */ c e() {
        return this.f206854b;
    }

    final /* synthetic */ o0 f() {
        return this.f206855c;
    }
}
