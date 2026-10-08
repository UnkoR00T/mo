package h8;

import android.os.Handler;
import android.os.Looper;
import b8.e2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<c0.c> f81447a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<c0.c> f81448b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0.a f81449c = new j0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d8.t.a f81450d = new d8.t.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f81451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t7.e0 f81452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e2 f81453g;

    protected abstract void A();

    @Override // h8.c0
    public final void a(Handler handler, d8.t tVar) {
        zj.p.q(handler);
        zj.p.q(tVar);
        this.f81450d.g(handler, tVar);
    }

    @Override // h8.c0
    public final void d(c0.c cVar, y7.x xVar, e2 e2Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f81451e;
        zj.p.d(looper == null || looper == looperMyLooper);
        this.f81453g = e2Var;
        t7.e0 e0Var = this.f81452f;
        this.f81447a.add(cVar);
        if (this.f81451e == null) {
            this.f81451e = looperMyLooper;
            this.f81448b.add(cVar);
            y(xVar);
        } else if (e0Var != null) {
            h(cVar);
            cVar.a(this, e0Var);
        }
    }

    @Override // h8.c0
    public final void f(d8.t tVar) {
        this.f81450d.n(tVar);
    }

    @Override // h8.c0
    public final void g(c0.c cVar) {
        boolean zIsEmpty = this.f81448b.isEmpty();
        this.f81448b.remove(cVar);
        if (zIsEmpty || !this.f81448b.isEmpty()) {
            return;
        }
        u();
    }

    @Override // h8.c0
    public final void h(c0.c cVar) {
        zj.p.q(this.f81451e);
        boolean zIsEmpty = this.f81448b.isEmpty();
        this.f81448b.add(cVar);
        if (zIsEmpty) {
            v();
        }
    }

    @Override // h8.c0
    public final void i(c0.c cVar) {
        this.f81447a.remove(cVar);
        if (!this.f81447a.isEmpty()) {
            g(cVar);
            return;
        }
        this.f81451e = null;
        this.f81452f = null;
        this.f81453g = null;
        this.f81448b.clear();
        A();
    }

    @Override // h8.c0
    public final void l(j0 j0Var) {
        this.f81449c.s(j0Var);
    }

    @Override // h8.c0
    public final void n(Handler handler, j0 j0Var) {
        zj.p.q(handler);
        zj.p.q(j0Var);
        this.f81449c.g(handler, j0Var);
    }

    protected final d8.t.a q(int i15, c0.b bVar) {
        return this.f81450d.o(i15, bVar);
    }

    protected final d8.t.a r(c0.b bVar) {
        return this.f81450d.o(0, bVar);
    }

    protected final j0.a s(int i15, c0.b bVar) {
        return this.f81449c.t(i15, bVar);
    }

    protected final j0.a t(c0.b bVar) {
        return this.f81449c.t(0, bVar);
    }

    protected void u() {
    }

    protected void v() {
    }

    protected final e2 w() {
        return (e2) zj.p.q(this.f81453g);
    }

    protected final boolean x() {
        return !this.f81448b.isEmpty();
    }

    protected abstract void y(y7.x xVar);

    protected final void z(t7.e0 e0Var) {
        this.f81452f = e0Var;
        Iterator<c0.c> it = this.f81447a.iterator();
        while (it.hasNext()) {
            it.next().a(this, e0Var);
        }
    }
}
