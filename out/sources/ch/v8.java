package ch;

/* JADX INFO: loaded from: classes3.dex */
final class v8 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final v8 f26422a = new v8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f26423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f26424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f26425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f26426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f26427f;

    static {
        dl.c.b bVarA = dl.c.a("inferenceCommonLogEvent");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26423b = bVarA.b(l2Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("options");
        l2 l2Var2 = new l2();
        l2Var2.a(2);
        f26424c = bVarA2.b(l2Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("detectedBarcodeFormats");
        l2 l2Var3 = new l2();
        l2Var3.a(3);
        f26425d = bVarA3.b(l2Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("detectedBarcodeValueTypes");
        l2 l2Var4 = new l2();
        l2Var4.a(4);
        f26426e = bVarA4.b(l2Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("imageInfo");
        l2 l2Var5 = new l2();
        l2Var5.a(5);
        f26427f = bVarA5.b(l2Var5.b()).a();
    }

    private v8() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        of ofVar = (of) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f26423b, ofVar.d());
        eVar.d(f26424c, ofVar.e());
        eVar.d(f26425d, ofVar.a());
        eVar.d(f26426e, ofVar.b());
        eVar.d(f26427f, ofVar.c());
    }
}
