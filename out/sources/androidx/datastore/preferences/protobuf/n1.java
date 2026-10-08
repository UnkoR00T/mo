package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class n1<T, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f12051a = 100;

    n1() {
    }

    private final void l(B b15, f1 f1Var, int i15) {
        while (f1Var.z() != Integer.MAX_VALUE && m(b15, f1Var, i15)) {
        }
    }

    abstract void a(B b15, int i15, int i16);

    abstract void b(B b15, int i15, long j15);

    abstract void c(B b15, int i15, T t15);

    abstract void d(B b15, int i15, g gVar);

    abstract void e(B b15, int i15, long j15);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t15);

    abstract int i(T t15);

    abstract void j(Object obj);

    abstract T k(T t15, T t16);

    final boolean m(B b15, f1 f1Var, int i15) throws a0 {
        int tag = f1Var.getTag();
        int iA = s1.a(tag);
        int iB = s1.b(tag);
        if (iB == 0) {
            e(b15, iA, f1Var.G());
            return true;
        }
        if (iB == 1) {
            b(b15, iA, f1Var.a());
            return true;
        }
        if (iB == 2) {
            d(b15, iA, f1Var.n());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw a0.e();
            }
            a(b15, iA, f1Var.t());
            return true;
        }
        B bN = n();
        int iC = s1.c(iA, 4);
        int i16 = i15 + 1;
        if (i16 >= f12051a) {
            throw a0.i();
        }
        l(bN, f1Var, i16);
        if (iC != f1Var.getTag()) {
            throw a0.b();
        }
        c(b15, iA, r(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b15);

    abstract void p(Object obj, T t15);

    abstract boolean q(f1 f1Var);

    abstract T r(B b15);

    abstract void s(T t15, t1 t1Var);

    abstract void t(T t15, t1 t1Var);
}
