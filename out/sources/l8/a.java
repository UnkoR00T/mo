package l8;

import java.util.concurrent.Executor;
import w7.l;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends Executor {

    /* JADX INFO: renamed from: l8.a$a, reason: collision with other inner class name */
    class C2828a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f116931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f116932b;

        C2828a(Executor executor, l lVar) {
            this.f116931a = executor;
            this.f116932b = lVar;
        }

        @Override // l8.a
        public void b() {
            this.f116932b.accept(this.f116931a);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f116931a.execute(runnable);
        }
    }

    static <T extends Executor> a a0(T t15, l<T> lVar) {
        return new C2828a(t15, lVar);
    }

    void b();
}
