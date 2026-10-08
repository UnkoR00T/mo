package eh;

/* JADX INFO: loaded from: classes3.dex */
final class n5 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final n5 f50844a = new n5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f50845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f50846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f50847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f50848e;

    static {
        dl.c.b bVarA = dl.c.a("imageFormat");
        s1 s1Var = new s1();
        s1Var.a(1);
        f50845b = bVarA.b(s1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("originalImageSize");
        s1 s1Var2 = new s1();
        s1Var2.a(2);
        f50846c = bVarA2.b(s1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("compressedImageSize");
        s1 s1Var3 = new s1();
        s1Var3.a(3);
        f50847d = bVarA3.b(s1Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("isOdmlImage");
        s1 s1Var4 = new s1();
        s1Var4.a(4);
        f50848e = bVarA4.b(s1Var4.b()).a();
    }

    private n5() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        r9 r9Var = (r9) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f50845b, r9Var.a());
        eVar.d(f50846c, r9Var.b());
        eVar.d(f50847d, null);
        eVar.d(f50848e, null);
    }
}
