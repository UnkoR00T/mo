package c8;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public interface z {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f24464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z f24465b;

        public a(Handler handler, z zVar) {
            this.f24464a = zVar != null ? (Handler) zj.p.q(handler) : null;
            this.f24465b = zVar;
        }

        public static /* synthetic */ void d(a aVar, a8.e eVar) {
            aVar.getClass();
            eVar.c();
            ((z) w7.o0.h(aVar.f24465b)).t(eVar);
        }

        public void A(final boolean z15) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24371a.f24465b)).d(z15);
                    }
                });
            }
        }

        public void B(final int i15, final long j15, final long j16) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24444a.f24465b)).z(i15, j15, j16);
                    }
                });
            }
        }

        public void o(final Exception exc) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24307a.f24465b)).y(exc);
                    }
                });
            }
        }

        public void p(final a8.c cVar) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24378a.f24465b)).D(cVar);
                    }
                });
            }
        }

        public void q(final int i15) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24375a.f24465b)).c(i15);
                    }
                });
            }
        }

        public void r(final Exception exc) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24338a.f24465b)).e(exc);
                    }
                });
            }
        }

        public void s(final a0.a aVar) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24316a.f24465b)).g(aVar);
                    }
                });
            }
        }

        public void t(final a0.a aVar) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24305a.f24465b)).f(aVar);
                    }
                });
            }
        }

        public void u(final String str, final long j15, final long j16) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24309a.f24465b)).n(str, j15, j16);
                    }
                });
            }
        }

        public void v(final String str) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24313a.f24465b)).m(str);
                    }
                });
            }
        }

        public void w(final a8.e eVar) {
            eVar.c();
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.a.d(this.f24381a, eVar);
                    }
                });
            }
        }

        public void x(final a8.e eVar) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24302a.f24465b)).o(eVar);
                    }
                });
            }
        }

        public void y(final t7.p pVar, final a8.f fVar) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24366a.f24465b)).k(pVar, fVar);
                    }
                });
            }
        }

        public void z(final long j15) {
            Handler handler = this.f24464a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c8.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((z) w7.o0.h(this.f24462a.f24465b)).q(j15);
                    }
                });
            }
        }
    }

    default void D(a8.c cVar) {
    }

    default void c(int i15) {
    }

    default void d(boolean z15) {
    }

    default void e(Exception exc) {
    }

    default void f(a0.a aVar) {
    }

    default void g(a0.a aVar) {
    }

    default void k(t7.p pVar, a8.f fVar) {
    }

    default void m(String str) {
    }

    default void n(String str, long j15, long j16) {
    }

    default void o(a8.e eVar) {
    }

    default void q(long j15) {
    }

    default void t(a8.e eVar) {
    }

    default void y(Exception exc) {
    }

    default void z(int i15, long j15, long j16) {
    }
}
