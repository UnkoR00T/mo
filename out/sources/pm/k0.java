package pm;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
final class k0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f160837a;

    /* synthetic */ k0(o oVar, j0 j0Var) {
        this.f160837a = oVar;
        jg.s.o(((Thread) oVar.f160879d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f160837a.f160879d.set(null);
        this.f160837a.d();
    }
}
