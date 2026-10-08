package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class e0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f206810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f206811b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f206812c;

    public e0(Executor executor, g gVar) {
        this.f206810a = executor;
        this.f206812c = gVar;
    }

    final /* synthetic */ Object a() {
        return this.f206811b;
    }

    final /* synthetic */ g b() {
        return this.f206812c;
    }

    @Override // vh.j0
    public final void d(l lVar) {
        if (lVar.q() || lVar.o()) {
            return;
        }
        synchronized (this.f206811b) {
            try {
                if (this.f206812c == null) {
                    return;
                }
                this.f206810a.execute(new d0(this, lVar));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
