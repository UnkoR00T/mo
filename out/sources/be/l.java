package be;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class l<R> implements h.b<R>, we.a.f {
    private static final c C = new c();
    private volatile boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f18753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final we.c f18754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.a f18755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i6.f<l<?>> f18756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f18757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f18758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ee.a f18759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ee.a f18760h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ee.a f18761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ee.a f18762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f18763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private zd.f f18764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18765n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private v<?> f18769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    zd.a f18770t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f18771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    q f18772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    p<?> f18774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private h<R> f18775z;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final re.h f18776a;

        a(re.h hVar) {
            this.f18776a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f18776a.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f18753a.f(this.f18776a)) {
                            l.this.f(this.f18776a);
                        }
                        l.this.i();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final re.h f18778a;

        b(re.h hVar) {
            this.f18778a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f18778a.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f18753a.f(this.f18778a)) {
                            l.this.f18774y.a();
                            l.this.g(this.f18778a);
                            l.this.r(this.f18778a);
                        }
                        l.this.i();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public <R> p<R> a(v<R> vVar, boolean z15, zd.f fVar, p.a aVar) {
            return new p<>(vVar, z15, true, fVar, aVar);
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final re.h f18780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f18781b;

        d(re.h hVar, Executor executor) {
            this.f18780a = hVar;
            this.f18781b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f18780a.equals(((d) obj).f18780a);
            }
            return false;
        }

        public int hashCode() {
            return this.f18780a.hashCode();
        }
    }

    static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f18782a;

        e() {
            this(new ArrayList(2));
        }

        private static d h(re.h hVar) {
            return new d(hVar, ve.e.a());
        }

        void clear() {
            this.f18782a.clear();
        }

        void e(re.h hVar, Executor executor) {
            this.f18782a.add(new d(hVar, executor));
        }

        boolean f(re.h hVar) {
            return this.f18782a.contains(h(hVar));
        }

        e g() {
            return new e(new ArrayList(this.f18782a));
        }

        void i(re.h hVar) {
            this.f18782a.remove(h(hVar));
        }

        boolean isEmpty() {
            return this.f18782a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f18782a.iterator();
        }

        int size() {
            return this.f18782a.size();
        }

        e(List<d> list) {
            this.f18782a = list;
        }
    }

    l(ee.a aVar, ee.a aVar2, ee.a aVar3, ee.a aVar4, m mVar, p.a aVar5, i6.f<l<?>> fVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, fVar, C);
    }

    private ee.a j() {
        if (this.f18766p) {
            return this.f18761j;
        }
        return this.f18767q ? this.f18762k : this.f18760h;
    }

    private boolean m() {
        return this.f18773x || this.f18771v || this.A;
    }

    private synchronized void q() {
        if (this.f18764m == null) {
            throw new IllegalArgumentException();
        }
        this.f18753a.clear();
        this.f18764m = null;
        this.f18774y = null;
        this.f18769s = null;
        this.f18773x = false;
        this.A = false;
        this.f18771v = false;
        this.B = false;
        this.f18775z.G(false);
        this.f18775z = null;
        this.f18772w = null;
        this.f18770t = null;
        this.f18756d.A(this);
    }

    synchronized void a(re.h hVar, Executor executor) {
        try {
            this.f18754b.c();
            this.f18753a.e(hVar, executor);
            if (this.f18771v) {
                k(1);
                executor.execute(new b(hVar));
            } else if (this.f18773x) {
                k(1);
                executor.execute(new a(hVar));
            } else {
                ve.k.a(!this.A, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // we.a.f
    public we.c b() {
        return this.f18754b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // be.h.b
    public void c(v<R> vVar, zd.a aVar, boolean z15) {
        synchronized (this) {
            this.f18769s = vVar;
            this.f18770t = aVar;
            this.B = z15;
        }
        o();
    }

    @Override // be.h.b
    public void d(q qVar) {
        synchronized (this) {
            this.f18772w = qVar;
        }
        n();
    }

    @Override // be.h.b
    public void e(h<?> hVar) {
        j().execute(hVar);
    }

    void f(re.h hVar) {
        try {
            hVar.d(this.f18772w);
        } catch (Throwable th4) {
            throw new be.b(th4);
        }
    }

    void g(re.h hVar) {
        try {
            hVar.c(this.f18774y, this.f18770t, this.B);
        } catch (Throwable th4) {
            throw new be.b(th4);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.A = true;
        this.f18775z.k();
        this.f18758f.c(this, this.f18764m);
    }

    void i() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f18754b.c();
                ve.k.a(m(), "Not yet complete!");
                int iDecrementAndGet = this.f18763l.decrementAndGet();
                ve.k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    pVar = this.f18774y;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    synchronized void k(int i15) {
        p<?> pVar;
        ve.k.a(m(), "Not yet complete!");
        if (this.f18763l.getAndAdd(i15) == 0 && (pVar = this.f18774y) != null) {
            pVar.a();
        }
    }

    synchronized l<R> l(zd.f fVar, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f18764m = fVar;
        this.f18765n = z15;
        this.f18766p = z16;
        this.f18767q = z17;
        this.f18768r = z18;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f18754b.c();
                if (this.A) {
                    q();
                    return;
                }
                if (this.f18753a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f18773x) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f18773x = true;
                zd.f fVar = this.f18764m;
                e eVarG = this.f18753a.g();
                k(eVarG.size() + 1);
                this.f18758f.b(this, fVar, null);
                for (d dVar : eVarG) {
                    dVar.f18781b.execute(new a(dVar.f18780a));
                }
                i();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void o() {
        synchronized (this) {
            try {
                this.f18754b.c();
                if (this.A) {
                    this.f18769s.c();
                    q();
                    return;
                }
                if (this.f18753a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f18771v) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f18774y = this.f18757e.a(this.f18769s, this.f18765n, this.f18764m, this.f18755c);
                this.f18771v = true;
                e eVarG = this.f18753a.g();
                k(eVarG.size() + 1);
                this.f18758f.b(this, this.f18764m, this.f18774y);
                for (d dVar : eVarG) {
                    dVar.f18781b.execute(new b(dVar.f18780a));
                }
                i();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    boolean p() {
        return this.f18768r;
    }

    synchronized void r(re.h hVar) {
        try {
            this.f18754b.c();
            this.f18753a.i(hVar);
            if (this.f18753a.isEmpty()) {
                h();
                if (this.f18771v || this.f18773x) {
                    if (this.f18763l.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public synchronized void s(h<R> hVar) {
        try {
            this.f18775z = hVar;
            (hVar.P() ? this.f18759g : j()).execute(hVar);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    l(ee.a aVar, ee.a aVar2, ee.a aVar3, ee.a aVar4, m mVar, p.a aVar5, i6.f<l<?>> fVar, c cVar) {
        this.f18753a = new e();
        this.f18754b = we.c.a();
        this.f18763l = new AtomicInteger();
        this.f18759g = aVar;
        this.f18760h = aVar2;
        this.f18761j = aVar3;
        this.f18762k = aVar4;
        this.f18758f = mVar;
        this.f18755c = aVar5;
        this.f18756d = fVar;
        this.f18757e = cVar;
    }
}
