package io.sentry;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class f4 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile io.sentry.protocol.v f94905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b7 f94906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1 f94907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference<j1> f94908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f94909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.sentry.protocol.g0 f94910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f94911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.sentry.protocol.m f94912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f94913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Queue<f> f94914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, String> f94915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f94916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<io.sentry.internal.eventprocessor.a> f94917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile q7 f94918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile i8 f94919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.util.a f94920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final io.sentry.util.a f94921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final io.sentry.util.a f94922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.sentry.protocol.c f94923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<io.sentry.b> f94924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private y3 f94925u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private io.sentry.protocol.v f94926v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e1 f94927w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Map<Throwable, io.sentry.util.w<WeakReference<j1>, String>> f94928x;

    public interface a {
        void a(y3 y3Var);
    }

    interface b {
        void a(i8 i8Var);
    }

    public interface c {
        void a(l1 l1Var);
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i8 f94929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i8 f94930b;

        public d(i8 i8Var, i8 i8Var2) {
            this.f94930b = i8Var;
            this.f94929a = i8Var2;
        }

        public i8 a() {
            return this.f94930b;
        }

        public i8 b() {
            return this.f94929a;
        }
    }

    public f4(q7 q7Var) {
        this.f94908d = new WeakReference<>(null);
        this.f94913i = new ArrayList();
        this.f94915k = new ConcurrentHashMap();
        this.f94916l = new ConcurrentHashMap();
        this.f94917m = new CopyOnWriteArrayList();
        this.f94920p = new io.sentry.util.a();
        this.f94921q = new io.sentry.util.a();
        this.f94922r = new io.sentry.util.a();
        this.f94923s = new io.sentry.protocol.c();
        this.f94924t = new CopyOnWriteArrayList();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        this.f94926v = vVar;
        this.f94927w = y2.j();
        this.f94928x = Collections.synchronizedMap(new WeakHashMap());
        this.f94918n = (q7) io.sentry.util.v.c(q7Var, "SentryOptions is required.");
        this.f94914j = f(this.f94918n.getMaxBreadcrumbs());
        this.f94925u = new y3();
        this.f94905a = vVar;
    }

    static Queue<f> f(int i15) {
        return i15 > 0 ? x8.g(new g(i15)) : new w();
    }

    @Override // io.sentry.a1
    public i8 A(b bVar) {
        g1 g1VarA = this.f94920p.a();
        try {
            bVar.a(this.f94919o);
            i8 i8VarClone = this.f94919o != null ? this.f94919o.clone() : null;
            if (g1VarA != null) {
                g1VarA.close();
            }
            return i8VarClone;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.a1
    public Map<String, String> B() {
        return io.sentry.util.c.c(this.f94915k);
    }

    @Override // io.sentry.a1
    public List<io.sentry.internal.eventprocessor.a> C() {
        return this.f94917m;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.c D() {
        return this.f94923s;
    }

    @Override // io.sentry.a1
    public String E() {
        return this.f94911g;
    }

    @Override // io.sentry.a1
    public void F(l1 l1Var) {
        g1 g1VarA = this.f94921q.a();
        try {
            this.f94907c = l1Var;
            for (b1 b1Var : this.f94918n.getScopeObservers()) {
                if (l1Var != null) {
                    b1Var.g(l1Var.getName());
                    b1Var.e(l1Var.w(), this);
                } else {
                    b1Var.g(null);
                    b1Var.e(null, this);
                }
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.a1
    public List<String> G() {
        return this.f94913i;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.g0 H() {
        return this.f94910f;
    }

    @Override // io.sentry.a1
    public String I() {
        l1 l1Var = this.f94907c;
        return l1Var != null ? l1Var.getName() : this.f94909e;
    }

    @Override // io.sentry.a1
    public void J() {
        g1 g1VarA = this.f94921q.a();
        try {
            this.f94907c = null;
            if (g1VarA != null) {
                g1VarA.close();
            }
            this.f94909e = null;
            for (b1 b1Var : this.f94918n.getScopeObservers()) {
                b1Var.g(null);
                b1Var.e(null, this);
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.a1
    public void K(e1 e1Var) {
        this.f94927w = e1Var;
    }

    @Override // io.sentry.a1
    public b7 L() {
        return this.f94906b;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.v M() {
        return this.f94926v;
    }

    @Override // io.sentry.a1
    public y3 N() {
        return this.f94925u;
    }

    @Override // io.sentry.a1
    public void O(String str) {
        this.f94911g = str;
        io.sentry.protocol.c cVarD = D();
        io.sentry.protocol.a aVarD = cVarD.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
            cVarD.n(aVarD);
        }
        if (str == null) {
            aVarD.x(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarD.x(arrayList);
        }
        Iterator<b1> it = this.f94918n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().f(cVarD);
        }
    }

    @Override // io.sentry.a1
    public e1 P() {
        return this.f94927w;
    }

    @Override // io.sentry.a1
    public void Q(r6 r6Var) {
        io.sentry.util.w<WeakReference<j1>, String> wVar;
        j1 j1Var;
        if (!this.f94918n.isTracingEnabled() || r6Var.O() == null || (wVar = this.f94928x.get(io.sentry.util.g.a(r6Var.O()))) == null) {
            return;
        }
        WeakReference<j1> weakReferenceA = wVar.a();
        if (r6Var.C().i() == null && weakReferenceA != null && (j1Var = weakReferenceA.get()) != null) {
            r6Var.C().x(j1Var.w());
        }
        String strB = wVar.b();
        if (r6Var.w0() != null || strB == null) {
            return;
        }
        r6Var.H0(strB);
    }

    @Override // io.sentry.a1
    public y3 R(a aVar) {
        g1 g1VarA = this.f94922r.a();
        try {
            aVar.a(this.f94925u);
            y3 y3Var = new y3(this.f94925u);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return y3Var;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.a1
    public void S(c cVar) {
        g1 g1VarA = this.f94921q.a();
        try {
            cVar.a(this.f94907c);
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.a1
    public void T(io.sentry.protocol.v vVar) {
        this.f94905a = vVar;
    }

    @Override // io.sentry.a1
    public List<e0> U() {
        return io.sentry.util.f.a(this.f94917m);
    }

    @Override // io.sentry.a1
    public void V(y3 y3Var) {
        this.f94925u = y3Var;
        n8 n8VarG = y3Var.g();
        Iterator<b1> it = this.f94918n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(n8VarG, this);
        }
    }

    @Override // io.sentry.a1
    public j1 a() {
        j1 j1VarT;
        j1 j1Var = this.f94908d.get();
        if (j1Var != null) {
            return j1Var;
        }
        l1 l1Var = this.f94907c;
        return (l1Var == null || (j1VarT = l1Var.t()) == null) ? l1Var : j1VarT;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.m b() {
        return this.f94912h;
    }

    public void c(f fVar) {
        q(fVar, null);
    }

    @Override // io.sentry.a1
    public void clear() {
        this.f94906b = null;
        this.f94910f = null;
        this.f94912h = null;
        this.f94911g = null;
        this.f94913i.clear();
        e();
        this.f94915k.clear();
        this.f94916l.clear();
        this.f94917m.clear();
        J();
        d();
    }

    public void d() {
        this.f94924t.clear();
    }

    public void e() {
        this.f94914j.clear();
        Iterator<b1> it = this.f94918n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().d(this.f94914j);
        }
    }

    public io.sentry.protocol.v g() {
        return this.f94905a;
    }

    @Override // io.sentry.a1
    public Map<String, Object> getExtras() {
        return this.f94916l;
    }

    @Override // io.sentry.a1
    public i8 getSession() {
        return this.f94919o;
    }

    @Override // io.sentry.a1
    public List<io.sentry.b> h() {
        return new CopyOnWriteArrayList(this.f94924t);
    }

    public void i(String str) {
        if (str == null) {
            return;
        }
        this.f94915k.remove(str);
        for (b1 b1Var : this.f94918n.getScopeObservers()) {
            b1Var.b(str);
            b1Var.a(this.f94915k);
        }
    }

    @Override // io.sentry.a1
    public void p(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            i(str);
            return;
        }
        this.f94915k.put(str, str2);
        for (b1 b1Var : this.f94918n.getScopeObservers()) {
            b1Var.p(str, str2);
            b1Var.a(this.f94915k);
        }
    }

    @Override // io.sentry.a1
    public void q(f fVar, j0 j0Var) {
        if (fVar == null || (this.f94914j instanceof w)) {
            return;
        }
        if (j0Var == null) {
            new j0();
        }
        this.f94918n.getBeforeBreadcrumb();
        this.f94914j.add(fVar);
        for (b1 b1Var : this.f94918n.getScopeObservers()) {
            b1Var.c(fVar);
            b1Var.d(this.f94914j);
        }
    }

    @Override // io.sentry.a1
    public void r(Throwable th4, j1 j1Var, String str) {
        io.sentry.util.v.c(th4, "throwable is required");
        io.sentry.util.v.c(j1Var, "span is required");
        io.sentry.util.v.c(str, "transactionName is required");
        Throwable thA = io.sentry.util.g.a(th4);
        if (this.f94928x.containsKey(thA)) {
            return;
        }
        this.f94928x.put(thA, new io.sentry.util.w<>(new WeakReference(j1Var), str));
    }

    @Override // io.sentry.a1
    public q7 s() {
        return this.f94918n;
    }

    @Override // io.sentry.a1
    public l1 u() {
        return this.f94907c;
    }

    @Override // io.sentry.a1
    public i8 v() {
        g1 g1VarA = this.f94920p.a();
        try {
            i8 i8Var = null;
            if (this.f94919o != null) {
                this.f94919o.c();
                this.f94918n.getContinuousProfiler().p();
                i8 i8VarClone = this.f94919o.clone();
                this.f94919o = null;
                i8Var = i8VarClone;
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
            return i8Var;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.a1
    public void w(io.sentry.protocol.v vVar) {
        this.f94926v = vVar;
        Iterator<b1> it = this.f94918n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().w(vVar);
        }
    }

    @Override // io.sentry.a1
    public d x() {
        g1 g1VarA = this.f94920p.a();
        try {
            if (this.f94919o != null) {
                this.f94919o.c();
                this.f94918n.getContinuousProfiler().p();
            }
            i8 i8Var = this.f94919o;
            d dVar = null;
            if (this.f94918n.getRelease() != null) {
                this.f94919o = new i8(this.f94918n.getDistinctId(), this.f94910f, this.f94918n.getEnvironment(), this.f94918n.getRelease());
                dVar = new d(this.f94919o.clone(), i8Var != null ? i8Var.clone() : null);
            } else {
                this.f94918n.getLogger().c(b7.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
            return dVar;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.a1
    public void y(q7 q7Var) {
        this.f94918n = q7Var;
        Queue<f> queue = this.f94914j;
        this.f94914j = f(q7Var.getMaxBreadcrumbs());
        Iterator<f> it = queue.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    @Override // io.sentry.a1
    public Queue<f> z() {
        return this.f94914j;
    }

    @Override // io.sentry.a1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public a1 m41clone() {
        return new f4(this);
    }

    private f4(f4 f4Var) {
        this.f94908d = new WeakReference<>(null);
        this.f94913i = new ArrayList();
        this.f94915k = new ConcurrentHashMap();
        this.f94916l = new ConcurrentHashMap();
        this.f94917m = new CopyOnWriteArrayList();
        this.f94920p = new io.sentry.util.a();
        this.f94921q = new io.sentry.util.a();
        this.f94922r = new io.sentry.util.a();
        this.f94923s = new io.sentry.protocol.c();
        this.f94924t = new CopyOnWriteArrayList();
        this.f94926v = io.sentry.protocol.v.f95495b;
        this.f94927w = y2.j();
        this.f94928x = Collections.synchronizedMap(new WeakHashMap());
        this.f94907c = f4Var.f94907c;
        this.f94909e = f4Var.f94909e;
        this.f94919o = f4Var.f94919o;
        this.f94918n = f4Var.f94918n;
        this.f94906b = f4Var.f94906b;
        this.f94927w = f4Var.f94927w;
        this.f94905a = f4Var.g();
        io.sentry.protocol.g0 g0Var = f4Var.f94910f;
        this.f94910f = g0Var != null ? new io.sentry.protocol.g0(g0Var) : null;
        this.f94911g = f4Var.f94911g;
        this.f94926v = f4Var.f94926v;
        io.sentry.protocol.m mVar = f4Var.f94912h;
        this.f94912h = mVar != null ? new io.sentry.protocol.m(mVar) : null;
        this.f94913i = new ArrayList(f4Var.f94913i);
        this.f94917m = new CopyOnWriteArrayList(f4Var.f94917m);
        f[] fVarArr = (f[]) f4Var.f94914j.toArray(new f[0]);
        Queue<f> queueF = f(f4Var.f94918n.getMaxBreadcrumbs());
        for (f fVar : fVarArr) {
            queueF.add(new f(fVar));
        }
        this.f94914j = queueF;
        Map<String, String> map = f4Var.f94915k;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f94915k = concurrentHashMap;
        Map<String, Object> map2 = f4Var.f94916l;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f94916l = concurrentHashMap2;
        this.f94923s = new io.sentry.protocol.c(f4Var.f94923s);
        this.f94924t = new CopyOnWriteArrayList(f4Var.f94924t);
        this.f94925u = new y3(f4Var.f94925u);
    }
}
