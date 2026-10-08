package fe;

/* JADX INFO: loaded from: classes3.dex */
public class x<Model> implements o<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x<?> f61711a = new x<>();

    public static class a<Model> implements p<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a<?> f61712a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f61712a;
        }

        @Override // fe.p
        public o<Model, Model> d(s sVar) {
            return x.c();
        }
    }

    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Model f61713a;

        b(Model model) {
            this.f61713a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f61713a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public zd.a d() {
            return zd.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Model> aVar) {
            aVar.f(this.f61713a);
        }
    }

    @Deprecated
    public x() {
    }

    public static <T> x<T> c() {
        return (x<T>) f61711a;
    }

    @Override // fe.o
    public o.a<Model> a(Model model, int i15, int i16, zd.h hVar) {
        return new o.a<>(new ue.d(model), new b(model));
    }

    @Override // fe.o
    public boolean b(Model model) {
        return true;
    }
}
