package eh;

/* JADX INFO: loaded from: classes3.dex */
final class k5 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final k5 f50732a = new k5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f50733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f50734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f50735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f50736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f50737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f50738g;

    static {
        dl.c.b bVarA = dl.c.a("landmarkMode");
        s1 s1Var = new s1();
        s1Var.a(1);
        f50733b = bVarA.b(s1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("classificationMode");
        s1 s1Var2 = new s1();
        s1Var2.a(2);
        f50734c = bVarA2.b(s1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("performanceMode");
        s1 s1Var3 = new s1();
        s1Var3.a(3);
        f50735d = bVarA3.b(s1Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("contourMode");
        s1 s1Var4 = new s1();
        s1Var4.a(4);
        f50736e = bVarA4.b(s1Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("isTrackingEnabled");
        s1 s1Var5 = new s1();
        s1Var5.a(5);
        f50737f = bVarA5.b(s1Var5.b()).a();
        dl.c.b bVarA6 = dl.c.a("minFaceSize");
        s1 s1Var6 = new s1();
        s1Var6.a(6);
        f50738g = bVarA6.b(s1Var6.b()).a();
    }

    private k5() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        n9 n9Var = (n9) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f50733b, n9Var.c());
        eVar.d(f50734c, n9Var.a());
        eVar.d(f50735d, n9Var.d());
        eVar.d(f50736e, n9Var.b());
        eVar.d(f50737f, n9Var.e());
        eVar.d(f50738g, n9Var.f());
    }
}
