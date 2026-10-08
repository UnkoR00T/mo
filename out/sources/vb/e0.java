package vb;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class e0 extends ub.n0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f205755j = ub.w.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f205756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f205757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ub.j f205758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<? extends ub.q0> f205759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f205760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f205761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<e0> f205762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f205763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ub.a0 f205764i;

    public e0(e1 e1Var, List<? extends ub.q0> list) {
        this(e1Var, null, ub.j.KEEP, list, null);
    }

    public static /* synthetic */ oq.i0 a(e0 e0Var) {
        e0Var.getClass();
        dc.f.b(e0Var);
        return oq.i0.f148189a;
    }

    private static boolean j(e0 e0Var, Set<String> set) {
        set.addAll(e0Var.d());
        Set<String> setM = m(e0Var);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM.contains(it.next())) {
                return true;
            }
        }
        List<e0> listF = e0Var.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<e0> it4 = listF.iterator();
            while (it4.hasNext()) {
                if (j(it4.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(e0Var.d());
        return false;
    }

    public static Set<String> m(e0 e0Var) {
        HashSet hashSet = new HashSet();
        List<e0> listF = e0Var.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<e0> it = listF.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().d());
            }
        }
        return hashSet;
    }

    public ub.a0 b() {
        if (this.f205763h) {
            ub.w.e().k(f205755j, "Already enqueued work ids (" + TextUtils.join(", ", this.f205760e) + ")");
        } else {
            this.f205764i = ub.e0.c(this.f205756a.n().getTracer(), "EnqueueRunnable_" + c().name(), this.f205756a.v().c(), new er.a() { // from class: vb.d0
                @Override // er.a
                public final Object a() {
                    return e0.a(this.f205753a);
                }
            });
        }
        return this.f205764i;
    }

    public ub.j c() {
        return this.f205758c;
    }

    public List<String> d() {
        return this.f205760e;
    }

    public String e() {
        return this.f205757b;
    }

    public List<e0> f() {
        return this.f205762g;
    }

    public List<? extends ub.q0> g() {
        return this.f205759d;
    }

    public e1 h() {
        return this.f205756a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f205763h;
    }

    public void l() {
        this.f205763h = true;
    }

    public e0(e1 e1Var, String str, ub.j jVar, List<? extends ub.q0> list) {
        this(e1Var, str, jVar, list, null);
    }

    public e0(e1 e1Var, String str, ub.j jVar, List<? extends ub.q0> list, List<e0> list2) {
        this.f205756a = e1Var;
        this.f205757b = str;
        this.f205758c = jVar;
        this.f205759d = list;
        this.f205762g = list2;
        this.f205760e = new ArrayList(list.size());
        this.f205761f = new ArrayList();
        if (list2 != null) {
            Iterator<e0> it = list2.iterator();
            while (it.hasNext()) {
                this.f205761f.addAll(it.next().f205761f);
            }
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (jVar == ub.j.REPLACE && list.get(i15).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = list.get(i15).b();
            this.f205760e.add(strB);
            this.f205761f.add(strB);
        }
    }
}
