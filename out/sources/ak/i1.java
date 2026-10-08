package ak;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 {

    static abstract class a<E> implements h1.a<E> {
        a() {
        }

        public boolean equals(Object obj) {
            if (obj instanceof h1.a) {
                h1.a aVar = (h1.a) obj;
                if (getCount() == aVar.getCount() && zj.l.a(b(), aVar.b())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            E eB = b();
            return (eB == null ? 0 : eB.hashCode()) ^ getCount();
        }

        public String toString() {
            String strValueOf = String.valueOf(b());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    static <T> h1<T> a(Iterable<T> iterable) {
        return (h1) iterable;
    }

    static boolean b(h1<?> h1Var, Object obj) {
        if (obj == h1Var) {
            return true;
        }
        if (obj instanceof h1) {
            h1 h1Var2 = (h1) obj;
            if (h1Var.size() == h1Var2.size() && h1Var.entrySet().size() == h1Var2.entrySet().size()) {
                for (h1.a aVar : h1Var2.entrySet()) {
                    if (h1Var.l3(aVar.b()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static int c(Iterable<?> iterable) {
        if (iterable instanceof h1) {
            return ((h1) iterable).y2().size();
        }
        return 11;
    }
}
