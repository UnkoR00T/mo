package androidx.camera.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.e1;
import p105prN.o2;
import v.m0;
import v.n0;
import v.x2;

/* JADX INFO: loaded from: classes.dex */
final class e implements x2.a<n0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f9356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.p016lifecycle.b0<m.e> f9357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m.e f9358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f9359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.google.common.util.concurrent.q<Void> f9360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9361f = false;

    class a implements a0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f9362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o.q f9363b;

        a(List list, o.q qVar) {
            this.f9362a = list;
            this.f9363b = qVar;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            e.this.f9360e = null;
            if (this.f9362a.isEmpty()) {
                return;
            }
            Iterator it = this.f9362a.iterator();
            while (it.hasNext()) {
                ((m0) this.f9363b).F((v.s) it.next());
            }
            this.f9362a.clear();
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
            e.this.f9360e = null;
        }
    }

    class b extends v.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f9365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o.q f9366b;

        b(androidx.concurrent.futures.c.a aVar, o.q qVar) {
            this.f9365a = aVar;
            this.f9366b = qVar;
        }

        @Override // v.s
        public void b(int i15, v.c0 c0Var) {
            this.f9365a.c(null);
            ((m0) this.f9366b).F(this);
        }
    }

    e(m0 m0Var, androidx.p016lifecycle.b0<m.e> b0Var, n nVar) {
        this.f9356a = m0Var;
        this.f9357b = b0Var;
        this.f9359d = nVar;
        synchronized (this) {
            this.f9358c = b0Var.f();
        }
    }

    public static /* synthetic */ Object b(e eVar, o.q qVar, List list, androidx.concurrent.futures.c.a aVar) {
        eVar.getClass();
        b bVar = eVar.new b(aVar, qVar);
        list.add(bVar);
        ((m0) qVar).B(z.a.a(), bVar);
        return "waitForCaptureResult";
    }

    public static /* synthetic */ Void d(e eVar, Void r15) {
        eVar.getClass();
        eVar.i(m.e.STREAMING);
        return null;
    }

    private void e() {
        com.google.common.util.concurrent.q<Void> qVar = this.f9360e;
        if (qVar != null) {
            qVar.cancel(false);
            this.f9360e = null;
        }
    }

    private void h(o.q qVar) {
        i(m.e.IDLE);
        ArrayList arrayList = new ArrayList();
        a0.d dVarE = a0.d.a(j(qVar, arrayList)).f(new a0.a() { // from class: androidx.camera.view.b
            @Override // a0.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return this.f9334a.f9359d.i();
            }
        }, z.a.a()).e(new o2() { // from class: androidx.camera.view.c
            @Override // p105prN.o2
            public final Object apply(Object obj) {
                return e.d(this.f9339a, (Void) obj);
            }
        }, z.a.a());
        this.f9360e = dVarE;
        a0.f.b(dVarE, new a(arrayList, qVar), z.a.a());
    }

    private com.google.common.util.concurrent.q<Void> j(final o.q qVar, final List<v.s> list) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: androidx.camera.view.d
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return e.b(this.f9341a, qVar, list, aVar);
            }
        });
    }

    void f() {
        e();
    }

    @Override // v.x2.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(n0.a aVar) {
        if (aVar == n0.a.CLOSING || aVar == n0.a.CLOSED || aVar == n0.a.RELEASING || aVar == n0.a.RELEASED) {
            i(m.e.IDLE);
            if (this.f9361f) {
                this.f9361f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == n0.a.OPENING || aVar == n0.a.OPEN || aVar == n0.a.PENDING_OPEN) && !this.f9361f) {
            h(this.f9356a);
            this.f9361f = true;
        }
    }

    void i(m.e eVar) {
        synchronized (this) {
            try {
                if (this.f9358c.equals(eVar)) {
                    return;
                }
                this.f9358c = eVar;
                e1.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f9357b.m(eVar);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // v.x2.a
    public void onError(Throwable th4) {
        f();
        i(m.e.IDLE);
    }
}
