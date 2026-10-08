package fh;

/* JADX INFO: loaded from: classes3.dex */
final class g7 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final g7 f63057a = new g7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f63058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f63059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f63060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f63061e;

    static {
        dl.c.b bVarA = dl.c.a("imageFormat");
        v1 v1Var = new v1();
        v1Var.a(1);
        f63058b = bVarA.b(v1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("originalImageSize");
        v1 v1Var2 = new v1();
        v1Var2.a(2);
        f63059c = bVarA2.b(v1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("compressedImageSize");
        v1 v1Var3 = new v1();
        v1Var3.a(3);
        f63060d = bVarA3.b(v1Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("isOdmlImage");
        v1 v1Var4 = new v1();
        v1Var4.a(4);
        f63061e = bVarA4.b(v1Var4.b()).a();
    }

    private g7() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        rd rdVar = (rd) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f63058b, rdVar.a());
        eVar.d(f63059c, rdVar.b());
        eVar.d(f63060d, null);
        eVar.d(f63061e, null);
    }
}
