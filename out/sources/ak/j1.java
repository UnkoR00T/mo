package ak;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class j1 extends n1<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final j1 f6898a = new j1();

    private j1() {
    }

    @Override // ak.n1
    public <S extends Comparable<?>> n1<S> g() {
        return y1.f7035a;
    }

    @Override // ak.n1, java.util.Comparator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        zj.p.q(comparable);
        zj.p.q(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
