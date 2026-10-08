package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class g0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f206815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f206816b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f206817c;

    public g0(Executor executor, h hVar) {
        this.f206815a = executor;
        this.f206817c = hVar;
    }

    final /* synthetic */ Object a() {
        return this.f206816b;
    }

    final /* synthetic */ h b() {
        return this.f206817c;
    }

    @Override // vh.j0
    public final void d(l lVar) {
        if (lVar.q()) {
            synchronized (this.f206816b) {
                try {
                    if (this.f206817c == null) {
                        return;
                    }
                    this.f206815a.execute(new f0(this, lVar));
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }
}
