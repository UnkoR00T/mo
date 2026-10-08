package d8;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public interface t {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h8.c0.b f40323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0881a> f40324c;

        /* JADX INFO: renamed from: d8.t$a$a, reason: collision with other inner class name */
        private static final class C0881a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f40325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public t f40326b;

            public C0881a(Handler handler, t tVar) {
                this.f40325a = handler;
                this.f40326b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void f(a aVar, t tVar, h0 h0Var) {
            tVar.a0(aVar.f40322a, aVar.f40323b);
            tVar.b0(aVar.f40322a, aVar.f40323b, h0Var);
        }

        public void g(Handler handler, t tVar) {
            zj.p.q(handler);
            zj.p.q(tVar);
            this.f40324c.add(new C0881a(handler, tVar));
        }

        public void h(final h0 h0Var) {
            for (C0881a c0881a : this.f40324c) {
                final t tVar = c0881a.f40326b;
                o0.R0(c0881a.f40325a, new Runnable() { // from class: d8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.f(this.f40319a, tVar, h0Var);
                    }
                });
            }
        }

        public void i() {
            for (C0881a c0881a : this.f40324c) {
                final t tVar = c0881a.f40326b;
                o0.R0(c0881a.f40325a, new Runnable() { // from class: d8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f40315a;
                        tVar.D(aVar.f40322a, aVar.f40323b);
                    }
                });
            }
        }

        public void j() {
            for (C0881a c0881a : this.f40324c) {
                final t tVar = c0881a.f40326b;
                o0.R0(c0881a.f40325a, new Runnable() { // from class: d8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f40317a;
                        tVar.l0(aVar.f40322a, aVar.f40323b);
                    }
                });
            }
        }

        public void k(final int i15) {
            for (C0881a c0881a : this.f40324c) {
                final t tVar = c0881a.f40326b;
                o0.R0(c0881a.f40325a, new Runnable() { // from class: d8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f40310a;
                        tVar.d0(aVar.f40322a, aVar.f40323b, i15);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0881a c0881a : this.f40324c) {
                final t tVar = c0881a.f40326b;
                o0.R0(c0881a.f40325a, new Runnable() { // from class: d8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f40307a;
                        tVar.W(aVar.f40322a, aVar.f40323b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0881a c0881a : this.f40324c) {
                final t tVar = c0881a.f40326b;
                o0.R0(c0881a.f40325a, new Runnable() { // from class: d8.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f40313a;
                        tVar.m0(aVar.f40322a, aVar.f40323b);
                    }
                });
            }
        }

        public void n(t tVar) {
            for (C0881a c0881a : this.f40324c) {
                if (c0881a.f40326b == tVar) {
                    this.f40324c.remove(c0881a);
                }
            }
        }

        public a o(int i15, h8.c0.b bVar) {
            return new a(this.f40324c, i15, bVar);
        }

        private a(CopyOnWriteArrayList<C0881a> copyOnWriteArrayList, int i15, h8.c0.b bVar) {
            this.f40324c = copyOnWriteArrayList;
            this.f40322a = i15;
            this.f40323b = bVar;
        }
    }

    default void D(int i15, h8.c0.b bVar) {
    }

    default void W(int i15, h8.c0.b bVar, Exception exc) {
    }

    @Deprecated
    default void a0(int i15, h8.c0.b bVar) {
    }

    default void b0(int i15, h8.c0.b bVar, h0 h0Var) {
    }

    default void d0(int i15, h8.c0.b bVar, int i16) {
    }

    default void l0(int i15, h8.c0.b bVar) {
    }

    default void m0(int i15, h8.c0.b bVar) {
    }
}
