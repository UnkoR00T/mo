package vb;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import cc.WorkGenerationalId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public class s implements bc.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f205871l = ub.w.i("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f205873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.a f205874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ec.b f205875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkDatabase f205876e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, p1> f205878g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, p1> f205877f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f205880i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<e> f205881j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f205872a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f205882k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Set<x>> f205879h = new HashMap();

    public s(Context context, androidx.work.a aVar, ec.b bVar, WorkDatabase workDatabase) {
        this.f205873b = context;
        this.f205874c = aVar;
        this.f205875d = bVar;
        this.f205876e = workDatabase;
    }

    public static /* synthetic */ cc.i0 b(s sVar, ArrayList arrayList, String str) {
        arrayList.addAll(sVar.f205876e.f0().a(str));
        return sVar.f205876e.e0().i(str);
    }

    public static /* synthetic */ void c(s sVar, WorkGenerationalId workGenerationalId, boolean z15) {
        synchronized (sVar.f205882k) {
            try {
                Iterator<e> it = sVar.f205881j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalId, z15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(s sVar, com.google.common.util.concurrent.q qVar, p1 p1Var) {
        boolean zBooleanValue;
        sVar.getClass();
        try {
            zBooleanValue = ((Boolean) qVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        sVar.l(p1Var, zBooleanValue);
    }

    private p1 f(String str) {
        p1 p1VarRemove = this.f205877f.remove(str);
        boolean z15 = p1VarRemove != null;
        if (!z15) {
            p1VarRemove = this.f205878g.remove(str);
        }
        this.f205879h.remove(str);
        if (z15) {
            q();
        }
        return p1VarRemove;
    }

    private p1 h(String str) {
        p1 p1Var = this.f205877f.get(str);
        return p1Var == null ? this.f205878g.get(str) : p1Var;
    }

    private static boolean i(String str, p1 p1Var, int i15) {
        if (p1Var == null) {
            ub.w.e().a(f205871l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        p1Var.p(i15);
        ub.w.e().a(f205871l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void l(p1 p1Var, boolean z15) {
        synchronized (this.f205882k) {
            try {
                WorkGenerationalId workGenerationalIdM = p1Var.m();
                String workSpecId = workGenerationalIdM.getWorkSpecId();
                if (h(workSpecId) == p1Var) {
                    f(workSpecId);
                }
                ub.w.e().a(f205871l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z15);
                Iterator<e> it = this.f205881j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalIdM, z15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void n(final WorkGenerationalId workGenerationalId, final boolean z15) {
        this.f205875d.a().execute(new Runnable() { // from class: vb.r
            @Override // java.lang.Runnable
            public final void run() {
                s.c(this.f205865a, workGenerationalId, z15);
            }
        });
    }

    private void q() {
        synchronized (this.f205882k) {
            try {
                if (this.f205877f.isEmpty()) {
                    try {
                        this.f205873b.startService(androidx.work.impl.foreground.a.g(this.f205873b));
                    } catch (Throwable th4) {
                        ub.w.e().d(f205871l, "Unable to stop foreground service", th4);
                    }
                    PowerManager.WakeLock wakeLock = this.f205872a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f205872a = null;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // bc.a
    public void a(String str, ub.k kVar) {
        synchronized (this.f205882k) {
            try {
                ub.w.e().f(f205871l, "Moving WorkSpec (" + str + ") to the foreground");
                p1 p1VarRemove = this.f205878g.remove(str);
                if (p1VarRemove != null) {
                    if (this.f205872a == null) {
                        PowerManager.WakeLock wakeLockA = dc.z.a(this.f205873b, "ProcessorForegroundLck");
                        this.f205872a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f205877f.put(str, p1VarRemove);
                    u5.a.q(this.f205873b, androidx.work.impl.foreground.a.f(this.f205873b, p1VarRemove.m(), kVar));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void e(e eVar) {
        synchronized (this.f205882k) {
            this.f205881j.add(eVar);
        }
    }

    public cc.i0 g(String str) {
        synchronized (this.f205882k) {
            try {
                p1 p1VarH = h(str);
                if (p1VarH == null) {
                    return null;
                }
                return p1VarH.getWorkSpec();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f205882k) {
            zContains = this.f205880i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z15;
        synchronized (this.f205882k) {
            z15 = h(str) != null;
        }
        return z15;
    }

    public void m(e eVar) {
        synchronized (this.f205882k) {
            this.f205881j.remove(eVar);
        }
    }

    public boolean o(x xVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th4;
        WorkGenerationalId id5 = xVar.getId();
        final String workSpecId = id5.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        cc.i0 i0Var = (cc.i0) this.f205876e.S(new Callable() { // from class: vb.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.b(this.f205818a, arrayList, workSpecId);
            }
        });
        if (i0Var == null) {
            ub.w.e().k(f205871l, "Didn't find WorkSpec for id " + id5);
            n(id5, false);
            return false;
        }
        synchronized (this.f205882k) {
            try {
                try {
                    try {
                        if (k(workSpecId)) {
                            Set<x> set = this.f205879h.get(workSpecId);
                            if (set.iterator().next().getId().getGeneration() == id5.getGeneration()) {
                                set.add(xVar);
                                ub.w.e().a(f205871l, "Work " + id5 + " is already enqueued for processing");
                            } else {
                                n(id5, false);
                            }
                            return false;
                        }
                        if (i0Var.getGeneration() != id5.getGeneration()) {
                            n(id5, false);
                            return false;
                        }
                        final p1 p1VarA = new p1.a(this.f205873b, this.f205874c, this.f205875d, this, this.f205876e, i0Var, arrayList).k(aVar).a();
                        final com.google.common.util.concurrent.q<Boolean> qVarR = p1VarA.r();
                        qVarR.b(new Runnable() { // from class: vb.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                s.d(this.f205860a, qVarR, p1VarA);
                            }
                        }, this.f205875d.a());
                        this.f205878g.put(workSpecId, p1VarA);
                        HashSet hashSet = new HashSet();
                        hashSet.add(xVar);
                        this.f205879h.put(workSpecId, hashSet);
                        ub.w.e().a(f205871l, getClass().getSimpleName() + ": processing " + id5);
                        return true;
                    } catch (Throwable th5) {
                        th4 = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th4 = th;
                }
            } catch (Throwable th7) {
                th = th7;
                th4 = th;
            }
            throw th4;
        }
    }

    public boolean p(String str, int i15) {
        p1 p1VarF;
        synchronized (this.f205882k) {
            ub.w.e().a(f205871l, "Processor cancelling " + str);
            this.f205880i.add(str);
            p1VarF = f(str);
        }
        return i(str, p1VarF, i15);
    }

    public boolean r(x xVar, int i15) {
        p1 p1VarF;
        String workSpecId = xVar.getId().getWorkSpecId();
        synchronized (this.f205882k) {
            p1VarF = f(workSpecId);
        }
        return i(workSpecId, p1VarF, i15);
    }

    public boolean s(x xVar, int i15) {
        String workSpecId = xVar.getId().getWorkSpecId();
        synchronized (this.f205882k) {
            try {
                if (this.f205877f.get(workSpecId) == null) {
                    Set<x> set = this.f205879h.get(workSpecId);
                    if (set != null && set.contains(xVar)) {
                        return i(workSpecId, f(workSpecId), i15);
                    }
                    return false;
                }
                ub.w.e().a(f205871l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
