package af;

/* JADX INFO: loaded from: classes3.dex */
abstract class n {

    public static abstract class a {
        public abstract n a();

        abstract a b(ye.c cVar);

        abstract a c(ye.d<?> dVar);

        abstract a d(ye.g<?, byte[]> gVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract ye.c b();

    abstract ye.d<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    abstract ye.g<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
