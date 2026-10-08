package b8;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t7.e0 f17294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h8.c0.b f17296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f17297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t7.e0 f17298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f17299g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final h8.c0.b f17300h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f17301i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f17302j;

        public a(long j15, t7.e0 e0Var, int i15, h8.c0.b bVar, long j16, t7.e0 e0Var2, int i16, h8.c0.b bVar2, long j17, long j18) {
            this.f17293a = j15;
            this.f17294b = e0Var;
            this.f17295c = i15;
            this.f17296d = bVar;
            this.f17297e = j16;
            this.f17298f = e0Var2;
            this.f17299g = i16;
            this.f17300h = bVar2;
            this.f17301i = j17;
            this.f17302j = j18;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f17293a == aVar.f17293a && this.f17295c == aVar.f17295c && this.f17297e == aVar.f17297e && this.f17299g == aVar.f17299g && this.f17301i == aVar.f17301i && this.f17302j == aVar.f17302j && Objects.equals(this.f17294b, aVar.f17294b) && Objects.equals(this.f17296d, aVar.f17296d) && Objects.equals(this.f17298f, aVar.f17298f) && Objects.equals(this.f17300h, aVar.f17300h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f17293a), this.f17294b, Integer.valueOf(this.f17295c), this.f17296d, Long.valueOf(this.f17297e), this.f17298f, Integer.valueOf(this.f17299g), this.f17300h, Long.valueOf(this.f17301i), Long.valueOf(this.f17302j));
        }
    }

    /* JADX INFO: renamed from: b8.b$b, reason: collision with other inner class name */
    public static final class C0423b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t7.n f17303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f17304b;

        public C0423b(t7.n nVar, SparseArray<a> sparseArray) {
            this.f17303a = nVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(nVar.c());
            for (int i15 = 0; i15 < nVar.c(); i15++) {
                int iB = nVar.b(i15);
                sparseArray2.append(iB, (a) zj.p.q(sparseArray.get(iB)));
            }
            this.f17304b = sparseArray2;
        }

        public boolean a(int i15) {
            return this.f17303a.a(i15);
        }

        public int b(int i15) {
            return this.f17303a.b(i15);
        }

        public a c(int i15) {
            return (a) zj.p.q(this.f17304b.get(i15));
        }

        public int d() {
            return this.f17303a.c();
        }
    }

    default void A(a aVar, int i15) {
    }

    default void B(a aVar, int i15, long j15) {
    }

    default void C(a aVar, String str) {
    }

    default void D(a aVar, int i15) {
    }

    default void E(a aVar, a8.e eVar) {
    }

    default void F(a aVar, d8.h0 h0Var) {
    }

    default void G(a aVar, Exception exc) {
    }

    default void H(a aVar, int i15, long j15, long j16) {
    }

    default void J(a aVar, boolean z15) {
    }

    default void K(a aVar) {
    }

    default void L(a aVar, t7.y yVar) {
    }

    default void M(a aVar, String str, long j15, long j16) {
    }

    default void N(a aVar, long j15, int i15) {
    }

    default void O(a aVar, h8.x xVar, h8.a0 a0Var) {
    }

    default void P(a aVar, t7.a0.e eVar, t7.a0.e eVar2, int i15) {
    }

    default void Q(a aVar, t7.p pVar, a8.f fVar) {
    }

    default void R(a aVar, Exception exc) {
    }

    default void S(a aVar, t7.u uVar) {
    }

    default void T(a aVar, Object obj, long j15) {
    }

    @Deprecated
    default void U(a aVar, List<v7.a> list) {
    }

    default void V(a aVar) {
    }

    @Deprecated
    default void W(a aVar) {
    }

    default void X(a aVar, t7.y yVar) {
    }

    default void Z(a aVar, boolean z15) {
    }

    @Deprecated
    default void a(a aVar, String str, long j15) {
    }

    default void a0(a aVar, h8.a0 a0Var) {
    }

    @Deprecated
    default void b0(a aVar) {
    }

    @Deprecated
    default void c(a aVar, boolean z15, int i15) {
    }

    default void c0(a aVar, int i15, boolean z15) {
    }

    default void d(a aVar, t7.m0 m0Var) {
    }

    default void d0(a aVar, boolean z15, int i15) {
    }

    default void e(a aVar, int i15) {
    }

    default void e0(a aVar, long j15) {
    }

    default void f(a aVar, v7.c cVar) {
    }

    default void f0(a aVar) {
    }

    default void g(a aVar, String str) {
    }

    default void g0(a aVar, Exception exc) {
    }

    default void h(a aVar, t7.v vVar) {
    }

    default void i(a aVar, int i15) {
    }

    @Deprecated
    default void i0(a aVar, h8.x xVar, h8.a0 a0Var) {
    }

    default void j(a aVar) {
    }

    default void j0(a aVar, t7.z zVar) {
    }

    @Deprecated
    default void k(a aVar, int i15, int i16, int i17, float f15) {
    }

    default void k0(a aVar, h8.x xVar, h8.a0 a0Var, int i15) {
    }

    default void l(a aVar, c8.a0.a aVar2) {
    }

    default void l0(a aVar, int i15, long j15, long j16) {
    }

    default void m(a aVar, t7.a0.b bVar) {
    }

    default void m0(a aVar, a8.e eVar) {
    }

    default void n(t7.a0 a0Var, C0423b c0423b) {
    }

    @Deprecated
    default void n0(a aVar) {
    }

    default void o(a aVar, t7.s sVar, int i15) {
    }

    default void o0(a aVar, int i15, int i16, boolean z15) {
    }

    @Deprecated
    default void p(a aVar, String str, long j15) {
    }

    default void p0(a aVar, h8.x xVar, h8.a0 a0Var, IOException iOException, boolean z15) {
    }

    default void q(a aVar, int i15) {
    }

    @Deprecated
    default void q0(a aVar, int i15) {
    }

    default void r(a aVar, Exception exc) {
    }

    default void r0(a aVar, boolean z15) {
    }

    default void s(a aVar, c8.a0.a aVar2) {
    }

    default void s0(a aVar, String str, long j15, long j16) {
    }

    default void t(a aVar, a8.e eVar) {
    }

    default void t0(a aVar, int i15, int i16) {
    }

    default void u(a aVar, int i15) {
    }

    default void u0(a aVar, t7.p pVar, a8.f fVar) {
    }

    default void v(a aVar, h8.x xVar, h8.a0 a0Var) {
    }

    default void w(a aVar, a8.e eVar) {
    }

    default void x(a aVar, t7.k kVar) {
    }

    default void y(a aVar, t7.i0 i0Var) {
    }

    @Deprecated
    default void z(a aVar, boolean z15) {
    }
}
