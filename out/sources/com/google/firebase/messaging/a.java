package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements el.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final el.a f36458a = new a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0761a implements dl.d<rl.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0761a f36459a = new C0761a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f36460b = dl.c.a("projectNumber").b(gl.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final dl.c f36461c = dl.c.a("messageId").b(gl.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final dl.c f36462d = dl.c.a("instanceId").b(gl.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final dl.c f36463e = dl.c.a("messageType").b(gl.a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final dl.c f36464f = dl.c.a("sdkPlatform").b(gl.a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final dl.c f36465g = dl.c.a("packageName").b(gl.a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final dl.c f36466h = dl.c.a("collapseKey").b(gl.a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final dl.c f36467i = dl.c.a("priority").b(gl.a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final dl.c f36468j = dl.c.a("ttl").b(gl.a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final dl.c f36469k = dl.c.a("topic").b(gl.a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final dl.c f36470l = dl.c.a("bulkId").b(gl.a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final dl.c f36471m = dl.c.a("event").b(gl.a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final dl.c f36472n = dl.c.a("analyticsLabel").b(gl.a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final dl.c f36473o = dl.c.a("campaignId").b(gl.a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final dl.c f36474p = dl.c.a("composerLabel").b(gl.a.b().c(15).a()).a();

        private C0761a() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(rl.a aVar, dl.e eVar) {
            eVar.b(f36460b, aVar.l());
            eVar.d(f36461c, aVar.h());
            eVar.d(f36462d, aVar.g());
            eVar.d(f36463e, aVar.i());
            eVar.d(f36464f, aVar.m());
            eVar.d(f36465g, aVar.j());
            eVar.d(f36466h, aVar.d());
            eVar.a(f36467i, aVar.k());
            eVar.a(f36468j, aVar.o());
            eVar.d(f36469k, aVar.n());
            eVar.b(f36470l, aVar.b());
            eVar.d(f36471m, aVar.f());
            eVar.d(f36472n, aVar.a());
            eVar.b(f36473o, aVar.c());
            eVar.d(f36474p, aVar.e());
        }
    }

    private static final class b implements dl.d<rl.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f36475a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f36476b = dl.c.a("messagingClientEvent").b(gl.a.b().c(1).a()).a();

        private b() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(rl.b bVar, dl.e eVar) {
            eVar.d(f36476b, bVar.a());
        }
    }

    private static final class c implements dl.d<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f36477a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dl.c f36478b = dl.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // dl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(k0 k0Var, dl.e eVar) {
            eVar.d(f36478b, k0Var.b());
        }
    }

    private a() {
    }

    @Override // el.a
    public void a(el.b<?> bVar) {
        bVar.a(k0.class, c.f36477a);
        bVar.a(rl.b.class, b.f36475a);
        bVar.a(rl.a.class, C0761a.f36459a);
    }
}
