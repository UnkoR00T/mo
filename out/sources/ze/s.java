package ze;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    public static abstract class a {
        public abstract s a();

        public abstract a b(n nVar);

        public abstract a c(List<r> list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(v vVar);

        public abstract a g(long j15);

        public abstract a h(long j15);

        public a i(int i15) {
            return d(Integer.valueOf(i15));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new j.b();
    }

    public abstract n b();

    public abstract List<r> c();

    public abstract Integer d();

    public abstract String e();

    public abstract v f();

    public abstract long g();

    public abstract long h();
}
