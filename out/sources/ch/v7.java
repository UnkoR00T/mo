package ch;

/* JADX INFO: loaded from: classes3.dex */
final class v7 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final v7 f26417a = new v7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f26418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f26419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f26420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f26421e;

    static {
        dl.c.b bVarA = dl.c.a("imageFormat");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26418b = bVarA.b(l2Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("originalImageSize");
        l2 l2Var2 = new l2();
        l2Var2.a(2);
        f26419c = bVarA2.b(l2Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("compressedImageSize");
        l2 l2Var3 = new l2();
        l2Var3.a(3);
        f26420d = bVarA3.b(l2Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("isOdmlImage");
        l2 l2Var4 = new l2();
        l2Var4.a(4);
        f26421e = bVarA4.b(l2Var4.b()).a();
    }

    private v7() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        fe feVar = (fe) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f26418b, feVar.a());
        eVar.d(f26419c, feVar.b());
        eVar.d(f26420d, null);
        eVar.d(f26421e, null);
    }
}
