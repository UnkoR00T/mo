package eh;

/* JADX INFO: loaded from: classes3.dex */
final class m6 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final m6 f50807a = new m6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f50808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f50809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f50810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f50811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f50812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f50813g;

    static {
        dl.c.b bVarA = dl.c.a("inferenceCommonLogEvent");
        s1 s1Var = new s1();
        s1Var.a(1);
        f50808b = bVarA.b(s1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("options");
        s1 s1Var2 = new s1();
        s1Var2.a(2);
        f50809c = bVarA2.b(s1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("imageInfo");
        s1 s1Var3 = new s1();
        s1Var3.a(3);
        f50810d = bVarA3.b(s1Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("detectorOptions");
        s1 s1Var4 = new s1();
        s1Var4.a(4);
        f50811e = bVarA4.b(s1Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("contourDetectedFaces");
        s1 s1Var5 = new s1();
        s1Var5.a(5);
        f50812f = bVarA5.b(s1Var5.b()).a();
        dl.c.b bVarA6 = dl.c.a("nonContourDetectedFaces");
        s1 s1Var6 = new s1();
        s1Var6.a(6);
        f50813g = bVarA6.b(s1Var6.b()).a();
    }

    private m6() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        wa waVar = (wa) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f50808b, waVar.c());
        eVar.d(f50809c, null);
        eVar.d(f50810d, waVar.b());
        eVar.d(f50811e, waVar.a());
        eVar.d(f50812f, waVar.d());
        eVar.d(f50813g, waVar.e());
    }
}
