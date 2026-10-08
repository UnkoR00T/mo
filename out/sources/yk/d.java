package yk;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) b(d0.b(cls));
    }

    default <T> T b(d0<T> d0Var) {
        kl.b<T> bVarG = g(d0Var);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    default <T> Set<T> c(Class<T> cls) {
        return e(d0.b(cls));
    }

    default <T> kl.b<T> d(Class<T> cls) {
        return g(d0.b(cls));
    }

    default <T> Set<T> e(d0<T> d0Var) {
        return f(d0Var).get();
    }

    <T> kl.b<Set<T>> f(d0<T> d0Var);

    <T> kl.b<T> g(d0<T> d0Var);
}
