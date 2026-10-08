package j8;

import a8.a3;
import a8.z2;
import h8.c0;
import h8.j1;
import t7.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f100149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k8.d f100150b;

    public interface a {
        default void a(z2 z2Var) {
        }

        void b();
    }

    protected final k8.d b() {
        return (k8.d) zj.p.q(this.f100150b);
    }

    public a3.a c() {
        return null;
    }

    public void d(a aVar, k8.d dVar) {
        zj.p.w(this.f100149a == null);
        this.f100149a = aVar;
        this.f100150b = dVar;
    }

    protected final void e() {
        a aVar = this.f100149a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void f(z2 z2Var) {
        a aVar = this.f100149a;
        if (aVar != null) {
            aVar.a(z2Var);
        }
    }

    public boolean g() {
        return false;
    }

    public abstract void h(Object obj);

    public void i() {
        this.f100149a = null;
        this.f100150b = null;
    }

    public abstract y j(a3[] a3VarArr, j1 j1Var, c0.b bVar, e0 e0Var);

    public void k(t7.b bVar) {
    }
}
