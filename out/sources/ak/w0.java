package ak;

/* JADX INFO: loaded from: classes4.dex */
abstract class w0<E> extends u0<E> {

    class a extends n0<E> {
        a() {
        }

        @Override // java.util.List
        public E get(int i15) {
            return (E) w0.this.get(i15);
        }

        @Override // ak.l0
        boolean j() {
            return w0.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return w0.this.size();
        }
    }

    w0() {
    }

    @Override // ak.u0
    n0<E> A() {
        return new a();
    }

    @Override // ak.l0
    int f(Object[] objArr, int i15) {
        return e().f(objArr, i15);
    }

    abstract E get(int i15);

    @Override // ak.u0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k */
    public h2<E> iterator() {
        return e().iterator();
    }
}
