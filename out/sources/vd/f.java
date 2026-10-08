package vd;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f206163a;

    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f206164a;

        a(Handler handler) {
            this.f206164a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f206164a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f206166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f206167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f206168c;

        public b(n nVar, p pVar, Runnable runnable) {
            this.f206166a = nVar;
            this.f206167b = pVar;
            this.f206168c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f206166a.K()) {
                this.f206166a.p("canceled-at-delivery");
                return;
            }
            if (this.f206167b.b()) {
                this.f206166a.l(this.f206167b.f206217a);
            } else {
                this.f206166a.k(this.f206167b.f206219c);
            }
            if (this.f206167b.f206220d) {
                this.f206166a.e("intermediate-response");
            } else {
                this.f206166a.p("done");
            }
            Runnable runnable = this.f206168c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f206163a = new a(handler);
    }

    @Override // vd.q
    public void a(n<?> nVar, p<?> pVar, Runnable runnable) {
        nVar.N();
        nVar.e("post-response");
        this.f206163a.execute(new b(nVar, pVar, runnable));
    }

    @Override // vd.q
    public void b(n<?> nVar, u uVar) {
        nVar.e("post-error");
        this.f206163a.execute(new b(nVar, p.a(uVar), null));
    }

    @Override // vd.q
    public void c(n<?> nVar, p<?> pVar) {
        a(nVar, pVar, null);
    }
}
