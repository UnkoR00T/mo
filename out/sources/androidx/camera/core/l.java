package androidx.camera.core;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import v.g2;

/* JADX INFO: loaded from: classes.dex */
final class l extends j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final Executor f9296v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Object f9297w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    o f9298x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b f9299y;

    class a implements a0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f9300a;

        a(b bVar) {
            this.f9300a = bVar;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            this.f9300a.close();
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
        }
    }

    static class b extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final WeakReference<l> f9302d;

        b(o oVar, l lVar) {
            super(oVar);
            this.f9302d = new WeakReference<>(lVar);
            b(new e.a() { // from class: androidx.camera.core.m
                @Override // androidx.camera.core.e.a
                public final void b(o oVar2) {
                    l.b.m(this.f9303a, oVar2);
                }
            });
        }

        public static /* synthetic */ void m(b bVar, o oVar) {
            final l lVar = bVar.f9302d.get();
            if (lVar != null) {
                lVar.f9296v.execute(new Runnable() { // from class: androidx.camera.core.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVar.w();
                    }
                });
            }
        }
    }

    l(Executor executor) {
        this.f9296v = executor;
    }

    @Override // androidx.camera.core.j
    o d(g2 g2Var) {
        return g2Var.c();
    }

    @Override // androidx.camera.core.j
    void f() {
        synchronized (this.f9297w) {
            try {
                o oVar = this.f9298x;
                if (oVar != null) {
                    oVar.close();
                    this.f9298x = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.camera.core.j
    void l(o oVar) {
        synchronized (this.f9297w) {
            try {
                if (!this.f9293u) {
                    oVar.close();
                    return;
                }
                if (this.f9299y == null) {
                    b bVar = new b(oVar, this);
                    this.f9299y = bVar;
                    a0.f.b(e(bVar), new a(bVar), z.a.a());
                } else {
                    if (oVar.v3().getTimestamp() <= this.f9299y.v3().getTimestamp()) {
                        oVar.close();
                    } else {
                        o oVar2 = this.f9298x;
                        if (oVar2 != null) {
                            oVar2.close();
                        }
                        this.f9298x = oVar;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        synchronized (this.f9297w) {
            try {
                this.f9299y = null;
                o oVar = this.f9298x;
                if (oVar != null) {
                    this.f9298x = null;
                    l(oVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
