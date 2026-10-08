package eh;

/* JADX INFO: loaded from: classes3.dex */
final class t3 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t3 f51068a = new t3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f51069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f51070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f51071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f51072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f51073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f51074g;

    static {
        dl.c.b bVarA = dl.c.a("errorCode");
        s1 s1Var = new s1();
        s1Var.a(1);
        f51069b = bVarA.b(s1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("isColdCall");
        s1 s1Var2 = new s1();
        s1Var2.a(2);
        f51070c = bVarA2.b(s1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("imageInfo");
        s1 s1Var3 = new s1();
        s1Var3.a(3);
        f51071d = bVarA3.b(s1Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("detectorOptions");
        s1 s1Var4 = new s1();
        s1Var4.a(4);
        f51072e = bVarA4.b(s1Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("contourDetectedFaces");
        s1 s1Var5 = new s1();
        s1Var5.a(5);
        f51073f = bVarA5.b(s1Var5.b()).a();
        dl.c.b bVarA6 = dl.c.a("nonContourDetectedFaces");
        s1 s1Var6 = new s1();
        s1Var6.a(6);
        f51074g = bVarA6.b(s1Var6.b()).a();
    }

    private t3() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        q2 q2Var = (q2) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f51069b, q2Var.b());
        eVar.d(f51070c, q2Var.c());
        eVar.d(f51071d, null);
        eVar.d(f51072e, q2Var.a());
        eVar.d(f51073f, q2Var.d());
        eVar.d(f51074g, q2Var.e());
    }
}
