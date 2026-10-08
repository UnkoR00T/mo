package wb;

import cc.i0;
import java.util.HashMap;
import java.util.Map;
import ub.j0;
import ub.w;
import vb.u;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f211774e = w.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u f211775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f211776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ub.b f211777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Runnable> f211778d = new HashMap();

    /* JADX INFO: renamed from: wb.a$a, reason: collision with other inner class name */
    class RunnableC5577a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i0 f211779a;

        RunnableC5577a(i0 i0Var) {
            this.f211779a = i0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.e().a(a.f211774e, "Scheduling work " + this.f211779a.id);
            a.this.f211775a.c(this.f211779a);
        }
    }

    public a(u uVar, j0 j0Var, ub.b bVar) {
        this.f211775a = uVar;
        this.f211776b = j0Var;
        this.f211777c = bVar;
    }

    public void a(i0 i0Var, long j15) {
        Runnable runnableRemove = this.f211778d.remove(i0Var.id);
        if (runnableRemove != null) {
            this.f211776b.a(runnableRemove);
        }
        RunnableC5577a runnableC5577a = new RunnableC5577a(i0Var);
        this.f211778d.put(i0Var.id, runnableC5577a);
        this.f211776b.b(j15 - this.f211777c.a(), runnableC5577a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f211778d.remove(str);
        if (runnableRemove != null) {
            this.f211776b.a(runnableRemove);
        }
    }
}
