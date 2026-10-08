package o;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import v.n3;

/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Range<Integer> f139980q = n3.f202727a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f139981a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f139982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f139983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Range<Integer> f139984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v.n0 f139985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f139986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f139987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.google.common.util.concurrent.q<Surface> f139988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Surface> f139989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f139990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f139991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f139992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final v.u1 f139993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h f139994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private i f139995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Executor f139996p;

    class a implements a0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f139997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q f139998b;

        a(androidx.concurrent.futures.c.a aVar, com.google.common.util.concurrent.q qVar) {
            this.f139997a = aVar;
            this.f139998b = qVar;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            if (th4 instanceof f) {
                i6.i.i(this.f139998b.cancel(false));
            } else {
                i6.i.i(this.f139997a.c(null));
            }
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
            i6.i.i(this.f139997a.c(null));
        }
    }

    class b extends v.u1 {
        b(Size size, int i15) {
            super(size, i15);
        }

        @Override // v.u1
        protected com.google.common.util.concurrent.q<Surface> o() {
            return h2.this.f139988h;
        }
    }

    class c implements a0.c<Surface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.q f140001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f140002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f140003c;

        c(com.google.common.util.concurrent.q qVar, androidx.concurrent.futures.c.a aVar, String str) {
            this.f140001a = qVar;
            this.f140002b = aVar;
            this.f140003c = str;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            if (!(th4 instanceof CancellationException)) {
                this.f140002b.c(null);
                return;
            }
            i6.i.i(this.f140002b.f(new f(this.f140003c + " cancelled.", th4)));
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Surface surface) {
            a0.f.j(this.f140001a, this.f140002b);
        }
    }

    class d implements a0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i6.a f140005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Surface f140006b;

        d(i6.a aVar, Surface surface) {
            this.f140005a = aVar;
            this.f140006b = surface;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            i6.i.j(th4 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th4);
            this.f140005a.accept(g.c(1, this.f140006b));
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
            this.f140005a.accept(g.c(0, this.f140006b));
        }
    }

    class e implements a0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f140008a;

        e(Runnable runnable) {
            this.f140008a = runnable;
        }

        @Override // a0.c
        public void b(Throwable th4) {
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
            this.f140008a.run();
        }
    }

    private static final class f extends RuntimeException {
        f(String str, Throwable th4) {
            super(str, th4);
        }
    }

    public static abstract class g {
        g() {
        }

        static g c(int i15, Surface surface) {
            return new o.g(i15, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    public static abstract class h {
        h() {
        }

        public static h g(Rect rect, int i15, int i16, boolean z15, Matrix matrix, boolean z16) {
            return new o.h(rect, i15, i16, z15, matrix, z16);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface i {
        void a(h hVar);
    }

    public h2(Size size, v.n0 n0Var, boolean z15, i0 i0Var, int i15, Range<Integer> range, Runnable runnable) {
        this.f139982b = size;
        this.f139985e = n0Var;
        this.f139986f = z15;
        i6.i.b(i0Var.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f139983c = i0Var;
        this.f139987g = i15;
        this.f139984d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.q qVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: o.c2
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return h2.a(atomicReference, str, aVar);
            }
        });
        androidx.concurrent.futures.c.a<Void> aVar = (androidx.concurrent.futures.c.a) i6.i.g((androidx.concurrent.futures.c.a) atomicReference.get());
        this.f139992l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.q<Void> qVarA2 = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: o.d2
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar2) {
                return h2.j(atomicReference2, str, aVar2);
            }
        });
        this.f139990j = qVarA2;
        a0.f.b(qVarA2, new a(aVar, qVarA), z.a.a());
        androidx.concurrent.futures.c.a aVar2 = (androidx.concurrent.futures.c.a) i6.i.g((androidx.concurrent.futures.c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.q<Surface> qVarA3 = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: o.e2
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar3) {
                return h2.c(atomicReference3, str, aVar3);
            }
        });
        this.f139988h = qVarA3;
        this.f139989i = (androidx.concurrent.futures.c.a) i6.i.g((androidx.concurrent.futures.c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f139993m = bVar;
        com.google.common.util.concurrent.q<Void> qVarK = bVar.k();
        a0.f.b(qVarA3, new c(qVarK, aVar2, str), z.a.a());
        qVarK.b(new Runnable() { // from class: o.f2
            @Override // java.lang.Runnable
            public final void run() {
                this.f139958a.f139988h.cancel(true);
            }
        }, z.a.a());
        this.f139991k = q(z.a.a(), runnable);
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, String str, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(h2 h2Var, AtomicReference atomicReference, androidx.concurrent.futures.c.a aVar) {
        h2Var.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + h2Var.hashCode() + ")";
    }

    public static /* synthetic */ Object j(AtomicReference atomicReference, String str, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    private androidx.concurrent.futures.c.a<Void> q(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        a0.f.b(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: o.g2
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return h2.g(this.f139964a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (androidx.concurrent.futures.c.a) i6.i.g((androidx.concurrent.futures.c.a) atomicReference.get());
    }

    @SuppressLint({"PairedRegistration"})
    public void k(Executor executor, Runnable runnable) {
        this.f139992l.a(runnable, executor);
    }

    public void l() {
        synchronized (this.f139981a) {
            this.f139995o = null;
            this.f139996p = null;
        }
    }

    public v.n0 m() {
        return this.f139985e;
    }

    public v.u1 n() {
        return this.f139993m;
    }

    public i0 o() {
        return this.f139983c;
    }

    public Size p() {
        return this.f139982b;
    }

    public boolean r() {
        w();
        return this.f139991k.c(null);
    }

    public boolean s() {
        return this.f139986f;
    }

    public void t(final Surface surface, Executor executor, final i6.a<g> aVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: o.x1
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(h2.g.c(2, surface));
                }
            });
            return;
        }
        if (this.f139989i.c(surface) || this.f139988h.isCancelled()) {
            a0.f.b(this.f139990j, new d(aVar, surface), executor);
            return;
        }
        i6.i.i(this.f139988h.isDone());
        try {
            this.f139988h.get();
            executor.execute(new Runnable() { // from class: o.y1
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(h2.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: o.z1
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(h2.g.c(4, surface));
                }
            });
        }
    }

    public void u(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f139981a) {
            this.f139995o = iVar;
            this.f139996p = executor;
            hVar = this.f139994n;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: o.a2
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(hVar);
                }
            });
        }
    }

    public void v(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f139981a) {
            this.f139994n = hVar;
            iVar = this.f139995o;
            executor = this.f139996p;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: o.b2
            @Override // java.lang.Runnable
            public final void run() {
                iVar.a(hVar);
            }
        });
    }

    public boolean w() {
        return this.f139989i.f(new v.u1.b("Surface request will not complete."));
    }
}
