package vb;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import cc.WorkGenerationalId;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class e1 extends ub.p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f205765m = ub.w.i("WorkManagerImpl");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static e1 f205766n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static e1 f205767o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f205768p = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f205769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.a f205770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WorkDatabase f205771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ec.b f205772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<u> f205773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f205774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private dc.s f205775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f205776i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f205777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ac.n f205778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ju.p0 f205779l;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public e1(Context context, androidx.work.a aVar, ec.b bVar, WorkDatabase workDatabase, List<u> list, s sVar, ac.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ub.w.h(new ub.w.a(aVar.getMinimumLoggingLevel()));
        this.f205769b = applicationContext;
        this.f205772e = bVar;
        this.f205771d = workDatabase;
        this.f205774g = sVar;
        this.f205778k = nVar;
        this.f205770c = aVar;
        this.f205773f = list;
        ju.p0 p0VarF = androidx.work.impl.b.f(bVar);
        this.f205779l = p0VarF;
        this.f205775h = new dc.s(this.f205771d);
        androidx.work.impl.a.e(list, this.f205774g, bVar.c(), this.f205771d, aVar);
        this.f205772e.d(new ForceStopRunnable(applicationContext, this));
        c0.c(p0VarF, this.f205769b, aVar, workDatabase);
    }

    public static void j(Context context, androidx.work.a aVar) {
        synchronized (f205768p) {
            try {
                e1 e1Var = f205766n;
                if (e1Var != null && f205767o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (e1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f205767o == null) {
                        f205767o = androidx.work.impl.b.c(applicationContext, aVar);
                    }
                    f205766n = f205767o;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static /* synthetic */ oq.i0 k(e1 e1Var) {
        xb.f.a(e1Var.m());
        e1Var.u().e0().m();
        androidx.work.impl.a.f(e1Var.n(), e1Var.u(), e1Var.s());
        return oq.i0.f148189a;
    }

    @Deprecated
    public static e1 o() {
        synchronized (f205768p) {
            try {
                e1 e1Var = f205766n;
                if (e1Var != null) {
                    return e1Var;
                }
                return f205767o;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e1 p(Context context) {
        e1 e1VarO;
        synchronized (f205768p) {
            try {
                e1VarO = o();
                if (e1VarO == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof androidx.work.a.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    j(applicationContext, ((androidx.work.a.c) applicationContext).a());
                    e1VarO = p(applicationContext);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return e1VarO;
    }

    @Override // ub.p0
    public ub.a0 a(UUID uuid) {
        return dc.e.e(uuid, this);
    }

    @Override // ub.p0
    public ub.a0 b(List<? extends ub.q0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new e0(this, list).b();
    }

    @Override // ub.p0
    public ub.a0 d(String str, ub.i iVar, ub.g0 g0Var) {
        return iVar == ub.i.UPDATE ? l1.e(this, str, g0Var) : l(str, iVar, g0Var).b();
    }

    @Override // ub.p0
    public ub.a0 e(String str, ub.j jVar, List<ub.z> list) {
        return new e0(this, str, jVar, list).b();
    }

    @Override // ub.p0
    public com.google.common.util.concurrent.q<List<ub.o0>> h(String str) {
        return dc.x.c(this.f205771d, this.f205772e, str);
    }

    @Override // ub.p0
    public mu.g<List<ub.o0>> i(String str) {
        return cc.k0.b(this.f205771d.e0(), this.f205772e.b(), str);
    }

    public e0 l(String str, ub.i iVar, ub.g0 g0Var) {
        return new e0(this, str, iVar == ub.i.KEEP ? ub.j.KEEP : ub.j.REPLACE, Collections.singletonList(g0Var));
    }

    public Context m() {
        return this.f205769b;
    }

    public androidx.work.a n() {
        return this.f205770c;
    }

    public dc.s q() {
        return this.f205775h;
    }

    public s r() {
        return this.f205774g;
    }

    public List<u> s() {
        return this.f205773f;
    }

    public ac.n t() {
        return this.f205778k;
    }

    public WorkDatabase u() {
        return this.f205771d;
    }

    public ec.b v() {
        return this.f205772e;
    }

    public void w() {
        synchronized (f205768p) {
            try {
                this.f205776i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f205777j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f205777j = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void x() {
        ub.m0.a(n().getTracer(), "ReschedulingWork", new er.a() { // from class: vb.d1
            @Override // er.a
            public final Object a() {
                return e1.k(this.f205754a);
            }
        });
    }

    public void y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f205768p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f205777j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f205777j = pendingResult;
                if (this.f205776i) {
                    pendingResult.finish();
                    this.f205777j = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void z(WorkGenerationalId workGenerationalId, int i15) {
        this.f205772e.d(new dc.y(this.f205774g, new x(workGenerationalId), true, i15));
    }
}
