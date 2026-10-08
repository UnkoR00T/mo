package vr;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface i0 extends m {

    public static final class a {
        public static <R, D> R a(i0 i0Var, o<R, D> oVar, D d15) {
            return oVar.g(i0Var, d15);
        }

        public static m b(i0 i0Var) {
            return null;
        }
    }

    boolean C(i0 i0Var);

    List<i0> D0();

    <T> T L0(h0<T> h0Var);

    v0 V(zs.c cVar);

    sr.j i();

    Collection<zs.c> s(zs.c cVar, er.l<? super zs.f, Boolean> lVar);
}
