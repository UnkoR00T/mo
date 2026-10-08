package h8;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface j0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0.b f81610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C1885a> f81611c;

        /* JADX INFO: renamed from: h8.j0$a$a, reason: collision with other inner class name */
        private static final class C1885a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f81612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public j0 f81613b;

            public C1885a(Handler handler, j0 j0Var) {
                this.f81612a = handler;
                this.f81613b = j0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, j0 j0Var) {
            zj.p.q(handler);
            zj.p.q(j0Var);
            this.f81611c.add(new C1885a(handler, j0Var));
        }

        public void h(final w7.l<j0> lVar) {
            for (C1885a c1885a : this.f81611c) {
                final j0 j0Var = c1885a.f81613b;
                w7.o0.R0(c1885a.f81612a, new Runnable() { // from class: h8.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVar.accept(j0Var);
                    }
                });
            }
        }

        public void i(int i15, t7.p pVar, int i16, Object obj, long j15) {
            j(new a0(1, i15, pVar, i16, obj, w7.o0.g1(j15), -9223372036854775807L));
        }

        public void j(final a0 a0Var) {
            h(new w7.l() { // from class: h8.d0
                @Override // w7.l
                public final void accept(Object obj) {
                    j0.a aVar = this.f81501a;
                    ((j0) obj).H(aVar.f81609a, aVar.f81610b, a0Var);
                }
            });
        }

        public void k(x xVar, int i15, int i16, t7.p pVar, int i17, Object obj, long j15, long j16) {
            l(xVar, new a0(i15, i16, pVar, i17, obj, w7.o0.g1(j15), w7.o0.g1(j16)));
        }

        public void l(final x xVar, final a0 a0Var) {
            h(new w7.l() { // from class: h8.h0
                @Override // w7.l
                public final void accept(Object obj) {
                    j0.a aVar = this.f81603a;
                    ((j0) obj).n0(aVar.f81609a, aVar.f81610b, xVar, a0Var);
                }
            });
        }

        public void m(x xVar, int i15, int i16, t7.p pVar, int i17, Object obj, long j15, long j16) {
            n(xVar, new a0(i15, i16, pVar, i17, obj, w7.o0.g1(j15), w7.o0.g1(j16)));
        }

        public void n(final x xVar, final a0 a0Var) {
            h(new w7.l() { // from class: h8.f0
                @Override // w7.l
                public final void accept(Object obj) {
                    j0.a aVar = this.f81573a;
                    ((j0) obj).N(aVar.f81609a, aVar.f81610b, xVar, a0Var);
                }
            });
        }

        public void o(x xVar, int i15, int i16, t7.p pVar, int i17, Object obj, long j15, long j16, IOException iOException, boolean z15) {
            p(xVar, new a0(i15, i16, pVar, i17, obj, w7.o0.g1(j15), w7.o0.g1(j16)), iOException, z15);
        }

        public void p(final x xVar, final a0 a0Var, final IOException iOException, final boolean z15) {
            h(new w7.l() { // from class: h8.g0
                @Override // w7.l
                public final void accept(Object obj) {
                    j0.a aVar = this.f81589a;
                    ((j0) obj).I(aVar.f81609a, aVar.f81610b, xVar, a0Var, iOException, z15);
                }
            });
        }

        public void q(x xVar, int i15, int i16, t7.p pVar, int i17, Object obj, long j15, long j16, int i18) {
            r(xVar, new a0(i15, i16, pVar, i17, obj, w7.o0.g1(j15), w7.o0.g1(j16)), i18);
        }

        public void r(final x xVar, final a0 a0Var, final int i15) {
            h(new w7.l() { // from class: h8.e0
                @Override // w7.l
                public final void accept(Object obj) {
                    j0.a aVar = this.f81551a;
                    ((j0) obj).G(aVar.f81609a, aVar.f81610b, xVar, a0Var, i15);
                }
            });
        }

        public void s(j0 j0Var) {
            for (C1885a c1885a : this.f81611c) {
                if (c1885a.f81613b == j0Var) {
                    this.f81611c.remove(c1885a);
                }
            }
        }

        public a t(int i15, c0.b bVar) {
            return new a(this.f81611c, i15, bVar);
        }

        private a(CopyOnWriteArrayList<C1885a> copyOnWriteArrayList, int i15, c0.b bVar) {
            this.f81611c = copyOnWriteArrayList;
            this.f81609a = i15;
            this.f81610b = bVar;
        }
    }

    default void G(int i15, c0.b bVar, x xVar, a0 a0Var, int i16) {
    }

    default void H(int i15, c0.b bVar, a0 a0Var) {
    }

    default void I(int i15, c0.b bVar, x xVar, a0 a0Var, IOException iOException, boolean z15) {
    }

    default void N(int i15, c0.b bVar, x xVar, a0 a0Var) {
    }

    default void n0(int i15, c0.b bVar, x xVar, a0 a0Var) {
    }
}
