package j0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0.a f98429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f98430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f98431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f98432d;

    c(j0.a aVar, d dVar, b bVar, int i15) {
        this.f98429a = aVar;
        this.f98430b = dVar;
        this.f98431c = bVar;
        this.f98432d = i15;
    }

    public int a() {
        return this.f98432d;
    }

    public j0.a b() {
        return this.f98429a;
    }

    public b c() {
        return this.f98431c;
    }

    public d d() {
        return this.f98430b;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private j0.a f98433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f98434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f98435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f98436d;

        public a() {
            this.f98433a = j0.a.f98425c;
            this.f98434b = null;
            this.f98435c = null;
            this.f98436d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f98433a, this.f98434b, this.f98435c, this.f98436d);
        }

        public a c(int i15) {
            this.f98436d = i15;
            return this;
        }

        public a d(j0.a aVar) {
            this.f98433a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f98435c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f98434b = dVar;
            return this;
        }

        private a(c cVar) {
            this.f98433a = j0.a.f98425c;
            this.f98434b = null;
            this.f98435c = null;
            this.f98436d = 0;
            this.f98433a = cVar.b();
            this.f98434b = cVar.d();
            this.f98435c = cVar.c();
            this.f98436d = cVar.a();
        }
    }
}
