package fh;

/* JADX INFO: loaded from: classes3.dex */
final class a7 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a7 f62923a = new a7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f62924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f62925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f62926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f62927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f62928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f62929g;

    static {
        dl.c.b bVarA = dl.c.a("maxMs");
        v1 v1Var = new v1();
        v1Var.a(1);
        f62924b = bVarA.b(v1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("minMs");
        v1 v1Var2 = new v1();
        v1Var2.a(2);
        f62925c = bVarA2.b(v1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("avgMs");
        v1 v1Var3 = new v1();
        v1Var3.a(3);
        f62926d = bVarA3.b(v1Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("firstQuartileMs");
        v1 v1Var4 = new v1();
        v1Var4.a(4);
        f62927e = bVarA4.b(v1Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("medianMs");
        v1 v1Var5 = new v1();
        v1Var5.a(5);
        f62928f = bVarA5.b(v1Var5.b()).a();
        dl.c.b bVarA6 = dl.c.a("thirdQuartileMs");
        v1 v1Var6 = new v1();
        v1Var6.a(6);
        f62929g = bVarA6.b(v1Var6.b()).a();
    }

    private a7() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        jd jdVar = (jd) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f62924b, jdVar.c());
        eVar.d(f62925c, jdVar.e());
        eVar.d(f62926d, jdVar.a());
        eVar.d(f62927e, jdVar.b());
        eVar.d(f62928f, jdVar.d());
        eVar.d(f62929g, jdVar.f());
    }
}
