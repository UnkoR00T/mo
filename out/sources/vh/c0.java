package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class c0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f206805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f206806b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f206807c;

    public c0(Executor executor, f fVar) {
        this.f206805a = executor;
        this.f206807c = fVar;
    }

    final /* synthetic */ Object a() {
        return this.f206806b;
    }

    final /* synthetic */ f b() {
        return this.f206807c;
    }

    @Override // vh.j0
    public final void d(l lVar) {
        synchronized (this.f206806b) {
            try {
                if (this.f206807c == null) {
                    return;
                }
                this.f206805a.execute(new b0(this, lVar));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
