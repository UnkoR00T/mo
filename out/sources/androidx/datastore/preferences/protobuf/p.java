package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t.b;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class p<T extends t.b<T>> {
    p() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(o oVar, r0 r0Var, int i15);

    abstract t<T> c(Object obj);

    abstract t<T> d(Object obj);

    abstract boolean e(r0 r0Var);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, o oVar, t<T> tVar, UB ub5, n1<UT, UB> n1Var);

    abstract void h(f1 f1Var, Object obj, o oVar, t<T> tVar);

    abstract void i(g gVar, Object obj, o oVar, t<T> tVar);

    abstract void j(t1 t1Var, Map.Entry<?, ?> entry);
}
