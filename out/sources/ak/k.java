package ak;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class k<F, T> extends n1<F> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final zj.g<F, ? extends T> f6899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n1<T> f6900b;

    k(zj.g<F, ? extends T> gVar, n1<T> n1Var) {
        this.f6899a = (zj.g) zj.p.q(gVar);
        this.f6900b = (n1) zj.p.q(n1Var);
    }

    @Override // ak.n1, java.util.Comparator
    public int compare(F f15, F f16) {
        return this.f6900b.compare(this.f6899a.apply(f15), this.f6899a.apply(f16));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f6899a.equals(kVar.f6899a) && this.f6900b.equals(kVar.f6900b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return zj.l.b(this.f6899a, this.f6900b);
    }

    public String toString() {
        return this.f6900b + ".onResultOf(" + this.f6899a + ")";
    }
}
