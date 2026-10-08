package m8;

import android.os.Handler;
import android.os.SystemClock;
import t7.m0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public interface k0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f124367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k0 f124368b;

        public a(Handler handler, k0 k0Var) {
            this.f124367a = k0Var != null ? (Handler) zj.p.q(handler) : null;
            this.f124368b = k0Var;
        }

        public static /* synthetic */ void d(a aVar, a8.e eVar) {
            aVar.getClass();
            eVar.c();
            ((k0) o0.h(aVar.f124368b)).v(eVar);
        }

        public void l(final String str, final long j15, final long j16) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124288a.f124368b)).j(str, j15, j16);
                    }
                });
            }
        }

        public void m(final String str) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124259a.f124368b)).i(str);
                    }
                });
            }
        }

        public void n(final a8.e eVar) {
            eVar.c();
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k0.a.d(this.f124282a, eVar);
                    }
                });
            }
        }

        public void o(final int i15, final long j15) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124502a.f124368b)).w(i15, j15);
                    }
                });
            }
        }

        public void p(final a8.e eVar) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124264a.f124368b)).s(eVar);
                    }
                });
            }
        }

        public void q(final t7.p pVar, final a8.f fVar) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124267a.f124368b)).h(pVar, fVar);
                    }
                });
            }
        }

        public void r(final Object obj) {
            if (this.f124367a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f124367a.post(new Runnable() { // from class: m8.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124310a.f124368b)).x(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void s(final long j15, final int i15) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124261a.f124368b)).B(j15, i15);
                    }
                });
            }
        }

        public void t(final Exception exc) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124315a.f124368b)).r(exc);
                    }
                });
            }
        }

        public void u(final a8.c cVar) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124285a.f124368b)).I(cVar);
                    }
                });
            }
        }

        public void v(final m0 m0Var) {
            Handler handler = this.f124367a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m8.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((k0) o0.h(this.f124294a.f124368b)).a(m0Var);
                    }
                });
            }
        }
    }

    default void B(long j15, int i15) {
    }

    default void I(a8.c cVar) {
    }

    default void a(m0 m0Var) {
    }

    default void h(t7.p pVar, a8.f fVar) {
    }

    default void i(String str) {
    }

    default void j(String str, long j15, long j16) {
    }

    default void r(Exception exc) {
    }

    default void s(a8.e eVar) {
    }

    default void v(a8.e eVar) {
    }

    default void w(int i15, long j15) {
    }

    default void x(Object obj, long j15) {
    }
}
