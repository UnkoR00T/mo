package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class w implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f206848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f206849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f206850c;

    public w(Executor executor, c cVar, o0 o0Var) {
        this.f206848a = executor;
        this.f206849b = cVar;
        this.f206850c = o0Var;
    }

    final /* synthetic */ c a() {
        return this.f206849b;
    }

    final /* synthetic */ o0 b() {
        return this.f206850c;
    }

    @Override // vh.j0
    public final void d(l lVar) {
        this.f206848a.execute(new v(this, lVar));
    }
}
