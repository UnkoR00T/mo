package ak;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final class c0<T> extends n1<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<T> f6832a;

    c0(Comparator<T> comparator) {
        this.f6832a = (Comparator) zj.p.q(comparator);
    }

    @Override // ak.n1, java.util.Comparator
    public int compare(T t15, T t16) {
        return this.f6832a.compare(t15, t16);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f6832a.equals(((c0) obj).f6832a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6832a.hashCode();
    }

    public String toString() {
        return this.f6832a.toString();
    }
}
