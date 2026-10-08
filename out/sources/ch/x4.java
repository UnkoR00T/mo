package ch;

/* JADX INFO: loaded from: classes3.dex */
final class x4 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final x4 f26470a = new x4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f26471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f26472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f26473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f26474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f26475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dl.c f26476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final dl.c f26477h;

    static {
        dl.c.b bVarA = dl.c.a("errorCode");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26471b = bVarA.b(l2Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("hasResult");
        l2 l2Var2 = new l2();
        l2Var2.a(2);
        f26472c = bVarA2.b(l2Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("isColdCall");
        l2 l2Var3 = new l2();
        l2Var3.a(3);
        f26473d = bVarA3.b(l2Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("imageInfo");
        l2 l2Var4 = new l2();
        l2Var4.a(4);
        f26474e = bVarA4.b(l2Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("options");
        l2 l2Var5 = new l2();
        l2Var5.a(5);
        f26475f = bVarA5.b(l2Var5.b()).a();
        dl.c.b bVarA6 = dl.c.a("detectedBarcodeFormats");
        l2 l2Var6 = new l2();
        l2Var6.a(6);
        f26476g = bVarA6.b(l2Var6.b()).a();
        dl.c.b bVarA7 = dl.c.a("detectedBarcodeValueTypes");
        l2 l2Var7 = new l2();
        l2Var7.a(7);
        f26477h = bVarA7.b(l2Var7.b()).a();
    }

    private x4() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        e3 e3Var = (e3) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f26471b, e3Var.c());
        eVar.d(f26472c, null);
        eVar.d(f26473d, e3Var.e());
        eVar.d(f26474e, null);
        eVar.d(f26475f, e3Var.d());
        eVar.d(f26476g, e3Var.a());
        eVar.d(f26477h, e3Var.b());
    }
}
