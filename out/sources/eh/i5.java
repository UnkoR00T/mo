package eh;

/* JADX INFO: loaded from: classes3.dex */
final class i5 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final i5 f50661a = new i5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f50662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f50663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f50664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f50665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f50666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f50667g;

    static {
        dl.c.b bVarA = dl.c.a("maxMs");
        s1 s1Var = new s1();
        s1Var.a(1);
        f50662b = bVarA.b(s1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("minMs");
        s1 s1Var2 = new s1();
        s1Var2.a(2);
        f50663c = bVarA2.b(s1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("avgMs");
        s1 s1Var3 = new s1();
        s1Var3.a(3);
        f50664d = bVarA3.b(s1Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("firstQuartileMs");
        s1 s1Var4 = new s1();
        s1Var4.a(4);
        f50665e = bVarA4.b(s1Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("medianMs");
        s1 s1Var5 = new s1();
        s1Var5.a(5);
        f50666f = bVarA5.b(s1Var5.b()).a();
        dl.c.b bVarA6 = dl.c.a("thirdQuartileMs");
        s1 s1Var6 = new s1();
        s1Var6.a(6);
        f50667g = bVarA6.b(s1Var6.b()).a();
    }

    private i5() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        e9 e9Var = (e9) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f50662b, e9Var.c());
        eVar.d(f50663c, e9Var.e());
        eVar.d(f50664d, e9Var.a());
        eVar.d(f50665e, e9Var.b());
        eVar.d(f50666f, e9Var.d());
        eVar.d(f50667g, e9Var.f());
    }
}
