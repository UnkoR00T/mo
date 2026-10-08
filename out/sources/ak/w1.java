package ak;

/* JADX INFO: loaded from: classes4.dex */
final class w1<E> extends u0<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f6997h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final w1<Object> f6998j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f6999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f7000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f7001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f7002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f7003g;

    static {
        Object[] objArr = new Object[0];
        f6997h = objArr;
        f6998j = new w1<>(objArr, 0, objArr, 0, 0);
    }

    w1(Object[] objArr, int i15, Object[] objArr2, int i16, int i17) {
        this.f6999c = objArr;
        this.f7000d = i15;
        this.f7001e = objArr2;
        this.f7002f = i16;
        this.f7003g = i17;
    }

    @Override // ak.u0
    n0<E> A() {
        return n0.o(this.f6999c, this.f7003g);
    }

    @Override // ak.u0
    boolean B() {
        return true;
    }

    @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f7001e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = k0.c(obj);
        while (true) {
            int i15 = iC & this.f7002f;
            Object obj2 = objArr[i15];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i15 + 1;
        }
    }

    @Override // ak.l0
    int f(Object[] objArr, int i15) {
        System.arraycopy(this.f6999c, 0, objArr, i15, this.f7003g);
        return i15 + this.f7003g;
    }

    @Override // ak.l0
    Object[] g() {
        return this.f6999c;
    }

    @Override // ak.l0
    int h() {
        return this.f7003g;
    }

    @Override // ak.u0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f7000d;
    }

    @Override // ak.l0
    int i() {
        return 0;
    }

    @Override // ak.l0
    boolean j() {
        return false;
    }

    @Override // ak.u0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k */
    public h2<E> iterator() {
        return e().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7003g;
    }
}
