package ak;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class y1 extends n1<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final y1 f7035a = new y1();

    private y1() {
    }

    @Override // ak.n1
    public <S extends Comparable<?>> n1<S> g() {
        return n1.d();
    }

    @Override // ak.n1, java.util.Comparator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        zj.p.q(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
