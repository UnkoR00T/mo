package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class a0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f206799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f206800b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f206801c;

    public a0(Executor executor, e eVar) {
        this.f206799a = executor;
        this.f206801c = eVar;
    }

    final /* synthetic */ Object a() {
        return this.f206800b;
    }

    final /* synthetic */ e b() {
        return this.f206801c;
    }

    @Override // vh.j0
    public final void d(l lVar) {
        if (lVar.o()) {
            synchronized (this.f206800b) {
                try {
                    if (this.f206801c == null) {
                        return;
                    }
                    this.f206799a.execute(new z(this));
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }
}
