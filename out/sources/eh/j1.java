package eh;

/* JADX INFO: loaded from: classes3.dex */
final class j1 extends r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final r0 f50681f = new j1(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f50682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f50683e;

    private j1(Object obj, Object[] objArr, int i15) {
        this.f50682d = objArr;
        this.f50683e = i15;
    }

    static j1 g(int i15, Object[] objArr, q0 q0Var) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        v.b(obj, obj2);
        return new j1(null, objArr, 1);
    }

    @Override // eh.r0
    final k0 a() {
        return new i1(this.f50682d, 1, this.f50683e);
    }

    @Override // eh.r0
    final s0 d() {
        return new g1(this, this.f50682d, 0, this.f50683e);
    }

    @Override // eh.r0
    final s0 e() {
        return new h1(this, new i1(this.f50682d, 0, this.f50683e));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    @Override // eh.r0, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f50682d;
        int i15 = this.f50683e;
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
        return this.f50683e;
    }
}
