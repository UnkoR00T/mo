package af;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements el.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final el.a f6070a = new a();

    /* JADX INFO: renamed from: af.a$a, reason: collision with other inner class name */
    private static final class C0124a implements dl.d<df.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0124a f6071a = new C0124a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f6072b = dl.c.a("window").b(gl.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final dl.c f6073c = dl.c.a("logSourceMetrics").b(gl.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final dl.c f6074d = dl.c.a("globalMetrics").b(gl.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final dl.c f6075e = dl.c.a("appNamespace").b(gl.a.b().c(4).a()).a();

        private C0124a() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(df.a aVar, dl.e eVar) {
            eVar.d(f6072b, aVar.d());
            eVar.d(f6073c, aVar.c());
            eVar.d(f6074d, aVar.b());
            eVar.d(f6075e, aVar.a());
        }
    }

    private static final class b implements dl.d<df.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f6076a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f6077b = dl.c.a("storageMetrics").b(gl.a.b().c(1).a()).a();

        private b() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(df.b bVar, dl.e eVar) {
            eVar.d(f6077b, bVar.a());
        }
    }

    private static final class c implements dl.d<df.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f6078a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f6079b = dl.c.a("eventsDroppedCount").b(gl.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final dl.c f6080c = dl.c.a("reason").b(gl.a.b().c(3).a()).a();

        private c() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(df.c cVar, dl.e eVar) {
            eVar.b(f6079b, cVar.a());
            eVar.d(f6080c, cVar.b());
        }
    }

    private static final class d implements dl.d<df.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f6081a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f6082b = dl.c.a("logSource").b(gl.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final dl.c f6083c = dl.c.a("logEventDropped").b(gl.a.b().c(2).a()).a();

        private d() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(df.d dVar, dl.e eVar) {
            eVar.d(f6082b, dVar.b());
            eVar.d(f6083c, dVar.a());
        }
    }

    private static final class e implements dl.d<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f6084a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f6085b = dl.c.d("clientMetrics");

        private e() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(l lVar, dl.e eVar) {
            eVar.d(f6085b, lVar.b());
        }
    }

    private static final class f implements dl.d<df.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f6086a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f6087b = dl.c.a("currentCacheSizeBytes").b(gl.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final dl.c f6088c = dl.c.a("maxCacheSizeBytes").b(gl.a.b().c(2).a()).a();

        private f() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(df.e eVar, dl.e eVar2) {
            eVar2.b(f6087b, eVar.a());
            eVar2.b(f6088c, eVar.b());
        }
    }

    private static final class g implements dl.d<df.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f6089a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f6090b = dl.c.a("startMs").b(gl.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final dl.c f6091c = dl.c.a("endMs").b(gl.a.b().c(2).a()).a();

        private g() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(df.f fVar, dl.e eVar) {
            eVar.b(f6090b, fVar.b());
            eVar.b(f6091c, fVar.a());
        }
    }

    private a() {
    }

    @Override // el.a
    public void a(el.b<?> bVar) {
        bVar.a(l.class, e.f6084a);
        bVar.a(df.a.class, C0124a.f6071a);
        bVar.a(df.f.class, g.f6089a);
        bVar.a(df.d.class, d.f6081a);
        bVar.a(df.c.class, c.f6078a);
        bVar.a(df.b.class, b.f6076a);
        bVar.a(df.e.class, f.f6086a);
    }
}
