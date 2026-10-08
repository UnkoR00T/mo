package ch;

/* JADX INFO: loaded from: classes3.dex */
final class xb implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final xb f26484a = new xb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f26485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f26486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f26487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f26488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f26489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f26490g;

    static {
        dl.c.b bVarA = dl.c.a("appName");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26485b = bVarA.b(l2Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("sessionId");
        l2 l2Var2 = new l2();
        l2Var2.a(2);
        f26486c = bVarA2.b(l2Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("startZoomLevel");
        l2 l2Var3 = new l2();
        l2Var3.a(3);
        f26487d = bVarA3.b(l2Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("endZoomLevel");
        l2 l2Var4 = new l2();
        l2Var4.a(4);
        f26488e = bVarA4.b(l2Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("durationMs");
        l2 l2Var5 = new l2();
        l2Var5.a(5);
        f26489f = bVarA5.b(l2Var5.b()).a();
        dl.c.b bVarA6 = dl.c.a("predictedArea");
        l2 l2Var6 = new l2();
        l2Var6.a(6);
        f26490g = bVarA6.b(l2Var6.b()).a();
    }

    private xb() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        pi piVar = (pi) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f26485b, piVar.e());
        eVar.d(f26486c, piVar.f());
        eVar.d(f26487d, piVar.c());
        eVar.d(f26488e, piVar.b());
        eVar.d(f26489f, piVar.d());
        eVar.d(f26490g, piVar.a());
    }
}
