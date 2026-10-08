package ch;

/* JADX INFO: loaded from: classes3.dex */
final class p7 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p7 f26241a = new p7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f26242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f26243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f26244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f26245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f26246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f26247g;

    static {
        dl.c.b bVarA = dl.c.a("maxMs");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26242b = bVarA.b(l2Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("minMs");
        l2 l2Var2 = new l2();
        l2Var2.a(2);
        f26243c = bVarA2.b(l2Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("avgMs");
        l2 l2Var3 = new l2();
        l2Var3.a(3);
        f26244d = bVarA3.b(l2Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("firstQuartileMs");
        l2 l2Var4 = new l2();
        l2Var4.a(4);
        f26245e = bVarA4.b(l2Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("medianMs");
        l2 l2Var5 = new l2();
        l2Var5.a(5);
        f26246f = bVarA5.b(l2Var5.b()).a();
        dl.c.b bVarA6 = dl.c.a("thirdQuartileMs");
        l2 l2Var6 = new l2();
        l2Var6.a(6);
        f26247g = bVarA6.b(l2Var6.b()).a();
    }

    private p7() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        yd ydVar = (yd) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f26242b, ydVar.c());
        eVar.d(f26243c, ydVar.e());
        eVar.d(f26244d, ydVar.a());
        eVar.d(f26245e, ydVar.b());
        eVar.d(f26246f, ydVar.d());
        eVar.d(f26247g, ydVar.f());
    }
}
