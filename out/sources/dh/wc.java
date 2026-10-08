package dh;

/* JADX INFO: loaded from: classes3.dex */
final class wc extends oc {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final oc f42435f = new wc(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f42436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f42437e;

    private wc(Object obj, Object[] objArr, int i15) {
        this.f42436d = objArr;
        this.f42437e = i15;
    }

    static wc g(int i15, Object[] objArr, nc ncVar) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        i7.a(obj, obj2);
        return new wc(null, objArr, 1);
    }

    @Override // dh.oc
    final la a() {
        return new vc(this.f42436d, 1, this.f42437e);
    }

    @Override // dh.oc
    final pc d() {
        return new tc(this, this.f42436d, 0, this.f42437e);
    }

    @Override // dh.oc
    final pc e() {
        return new uc(this, new vc(this.f42436d, 0, this.f42437e));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    @Override // dh.oc, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f42436d;
        int i15 = this.f42437e;
        if (obj != null && i15 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f42437e;
    }
}
