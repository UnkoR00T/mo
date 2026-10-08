package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class i0<TResult, TContinuationResult> implements h<TContinuationResult>, g, e, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f206820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f206821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f206822c;

    public i0(Executor executor, k kVar, o0 o0Var) {
        this.f206820a = executor;
        this.f206821b = kVar;
        this.f206822c = o0Var;
    }

    @Override // vh.h
    public final void a(TContinuationResult tcontinuationresult) {
        this.f206822c.t(tcontinuationresult);
    }

    @Override // vh.e
    public final void b() {
        this.f206822c.x();
    }

    @Override // vh.g
    public final void c(Exception exc) {
        this.f206822c.v(exc);
    }

    @Override // vh.j0
    public final void d(l lVar) {
        this.f206820a.execute(new h0(this, lVar));
    }

    final /* synthetic */ k e() {
        return this.f206821b;
    }
}
