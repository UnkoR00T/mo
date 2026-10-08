package androidx.camera.core;

import v.g2;

/* JADX INFO: loaded from: classes.dex */
final class k extends j {

    class a implements a0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f9294a;

        a(o oVar) {
            this.f9294a = oVar;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            this.f9294a.close();
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
        }
    }

    k() {
    }

    @Override // androidx.camera.core.j
    o d(g2 g2Var) {
        return g2Var.g();
    }

    @Override // androidx.camera.core.j
    void f() {
    }

    @Override // androidx.camera.core.j
    void l(o oVar) {
        a0.f.b(e(oVar), new a(oVar), z.a.a());
    }
}
