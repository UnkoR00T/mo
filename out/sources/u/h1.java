package u;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h1 implements d1, androidx.camera.core.e.a, n1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d0 f193381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e0 f193382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a1 f193383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<a1> f193384e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Deque<n1> f193380a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f193385f = false;

    class a implements a0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f193386a;

        a(n nVar) {
            this.f193386a = nVar;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            if (this.f193386a.b()) {
                return;
            }
            int iE = this.f193386a.a().get(0).e();
            if (th4 instanceof o.v0) {
                h1.this.f193382c.j(d1.a.c(iE, (o.v0) th4));
            } else {
                h1.this.f193382c.j(d1.a.c(iE, new o.v0(2, "Failed to submit capture request", th4)));
            }
            h1.this.f193381b.c();
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
            h1.this.f193381b.c();
        }
    }

    public h1(d0 d0Var) {
        y.w.b();
        this.f193381b = d0Var;
        this.f193384e = new ArrayList();
    }

    public static /* synthetic */ void h(h1 h1Var) {
        h1Var.f193383d = null;
        h1Var.j();
    }

    private com.google.common.util.concurrent.q<Void> k(n nVar) {
        y.w.b();
        this.f193381b.b();
        com.google.common.util.concurrent.q<Void> qVarA = this.f193381b.a(nVar.a());
        a0.f.b(qVarA, new a(nVar), z.a.d());
        return qVarA;
    }

    private void l(final a1 a1Var) {
        i6.i.i(!i());
        this.f193383d = a1Var;
        a1Var.p().b(new Runnable() { // from class: u.e1
            @Override // java.lang.Runnable
            public final void run() {
                h1.h(this.f193368a);
            }
        }, z.a.a());
        this.f193384e.add(a1Var);
        a1Var.q().b(new Runnable() { // from class: u.f1
            @Override // java.lang.Runnable
            public final void run() {
                this.f193371a.f193384e.remove(a1Var);
            }
        }, z.a.a());
    }

    @Override // u.d1
    public void a(e0 e0Var) {
        y.w.b();
        this.f193382c = e0Var;
        e0Var.k(this);
    }

    @Override // androidx.camera.core.e.a
    public void b(androidx.camera.core.o oVar) {
        z.a.d().execute(new Runnable() { // from class: u.g1
            @Override // java.lang.Runnable
            public final void run() {
                this.f193377a.j();
            }
        });
    }

    @Override // u.d1
    public void c() {
        y.w.b();
        o.v0 v0Var = new o.v0(3, "Camera is closed.", null);
        Iterator<n1> it = this.f193380a.iterator();
        while (it.hasNext()) {
            it.next().x(v0Var);
        }
        this.f193380a.clear();
        Iterator it4 = new ArrayList(this.f193384e).iterator();
        while (it4.hasNext()) {
            ((a1) it4.next()).m(v0Var);
        }
    }

    @Override // u.n1.a
    public void d(n1 n1Var) {
        y.w.b();
        o.e1.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f193380a.addFirst(n1Var);
        j();
    }

    @Override // u.d1
    public void e(n1 n1Var) {
        y.w.b();
        this.f193380a.offer(n1Var);
        j();
    }

    @Override // u.d1
    public void g() {
        y.w.b();
        this.f193385f = true;
        a1 a1Var = this.f193383d;
        if (a1Var != null) {
            a1Var.n();
        }
    }

    public boolean i() {
        return this.f193383d != null;
    }

    void j() {
        n1 n1VarPoll;
        y.w.b();
        if (i() || this.f193385f || this.f193382c.h() == 0 || (n1VarPoll = this.f193380a.poll()) == null) {
            return;
        }
        a1 a1Var = new a1(n1VarPoll, this);
        l(a1Var);
        i6.d<n, x0> dVarE = this.f193382c.e(n1VarPoll, a1Var, a1Var.p());
        n nVar = dVarE.f89682a;
        Objects.requireNonNull(nVar);
        x0 x0Var = dVarE.f89683b;
        Objects.requireNonNull(x0Var);
        this.f193382c.m(x0Var);
        a1Var.t(k(nVar));
    }

    @Override // u.d1
    public void s() {
        y.w.b();
        this.f193385f = false;
        j();
    }
}
