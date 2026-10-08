package m8;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import t7.m0;

/* JADX INFO: loaded from: classes3.dex */
public interface l0 {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f124379a = new C3051a();

        /* JADX INFO: renamed from: m8.l0$a$a, reason: collision with other inner class name */
        class C3051a implements a {
            C3051a() {
            }
        }

        default void a(m0 m0Var) {
        }

        default void b() {
        }

        default void d() {
        }

        default void g() {
        }
    }

    public interface b {
        void a();

        void b(long j15);
    }

    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.p f124380a;

        public c(Throwable th4, t7.p pVar) {
            super(th4);
            this.f124380a = pVar;
        }
    }

    void b();

    boolean c();

    boolean e();

    void f();

    Surface getInputSurface();

    void h(long j15, long j16);

    void i(a aVar, Executor executor);

    void j(int i15, t7.p pVar, long j15, int i16, List<Object> list);

    void k(long j15);

    void l();

    boolean m(long j15, b bVar);

    void n(List<Object> list);

    boolean o(boolean z15);

    boolean p(t7.p pVar);

    void q();

    void r();

    void s(t tVar);

    void t();

    void u(int i15);

    void v(float f15);

    void w();

    void x(Surface surface, w7.d0 d0Var);

    void y(boolean z15);

    void z(boolean z15);
}
