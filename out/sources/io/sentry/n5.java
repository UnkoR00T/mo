package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n5 implements Comparable<n5> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(n5 n5Var) {
        return Long.valueOf(l()).compareTo(Long.valueOf(n5Var.l()));
    }

    public long e(n5 n5Var) {
        return l() - n5Var.l();
    }

    public final boolean g(n5 n5Var) {
        return e(n5Var) > 0;
    }

    public final boolean j(n5 n5Var) {
        return e(n5Var) < 0;
    }

    public long k(n5 n5Var) {
        return (n5Var == null || compareTo(n5Var) >= 0) ? l() : n5Var.l();
    }

    public abstract long l();
}
