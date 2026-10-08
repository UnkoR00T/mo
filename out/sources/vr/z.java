package vr;

import java.util.Collection;
import java.util.List;
import st.g2;
import st.i2;

/* JADX INFO: loaded from: classes4.dex */
public interface z extends b {

    public interface a<D extends z> {
        a<D> a();

        a<D> b(st.t0 t0Var);

        D build();

        a<D> c(List<t1> list);

        a<D> d(wr.h hVar);

        a<D> e();

        a<D> f(m mVar);

        a<D> g();

        a<D> h(b bVar);

        a<D> i();

        a<D> j(u uVar);

        a<D> k(c1 c1Var);

        a<D> l(boolean z15);

        a<D> m(f0 f0Var);

        a<D> n(c1 c1Var);

        a<D> o(List<m1> list);

        a<D> p(g2 g2Var);

        <V> a<D> q(vr.a.InterfaceC5463a<V> interfaceC5463a, V v15);

        a<D> r(b.a aVar);

        a<D> s(zs.f fVar);

        a<D> t();
    }

    boolean G();

    boolean G0();

    boolean J0();

    boolean N0();

    @Override // vr.b, vr.a, vr.m
    z a();

    @Override // vr.n, vr.m
    m b();

    z c(i2 i2Var);

    @Override // vr.b, vr.a
    Collection<? extends z> e();

    boolean n();

    boolean p0();

    boolean u();

    z w0();

    a<? extends z> z();
}
