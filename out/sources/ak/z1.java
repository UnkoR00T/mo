package ak;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class z1<T> extends n1<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n1<? super T> f7040a;

    z1(n1<? super T> n1Var) {
        this.f7040a = (n1) zj.p.q(n1Var);
    }

    @Override // ak.n1, java.util.Comparator
    public int compare(T t15, T t16) {
        return this.f7040a.compare(t16, t15);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            return this.f7040a.equals(((z1) obj).f7040a);
        }
        return false;
    }

    @Override // ak.n1
    public <S extends T> n1<S> g() {
        return this.f7040a;
    }

    public int hashCode() {
        return -this.f7040a.hashCode();
    }

    public String toString() {
        return this.f7040a + ".reverse()";
    }
}
