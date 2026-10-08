package fh;

/* JADX INFO: loaded from: classes3.dex */
final class q5 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final q5 f63463a = new q5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f63464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f63465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f63466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f63467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f63468f;

    static {
        dl.c.b bVarA = dl.c.a("errorCode");
        v1 v1Var = new v1();
        v1Var.a(1);
        f63464b = bVarA.b(v1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("hasResult");
        v1 v1Var2 = new v1();
        v1Var2.a(2);
        f63465c = bVarA2.b(v1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("isColdCall");
        v1 v1Var3 = new v1();
        v1Var3.a(3);
        f63466d = bVarA3.b(v1Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("imageInfo");
        v1 v1Var4 = new v1();
        v1Var4.a(4);
        f63467e = bVarA4.b(v1Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("recognizerOptions");
        v1 v1Var5 = new v1();
        v1Var5.a(5);
        f63468f = bVarA5.b(v1Var5.b()).a();
    }

    private q5() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        w3 w3Var = (w3) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f63464b, w3Var.a());
        eVar.d(f63465c, null);
        eVar.d(f63466d, w3Var.c());
        eVar.d(f63467e, null);
        eVar.d(f63468f, w3Var.b());
    }
}
