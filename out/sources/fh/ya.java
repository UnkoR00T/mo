package fh;

/* JADX INFO: loaded from: classes3.dex */
final class ya implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ya f63744a = new ya();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f63745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f63746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f63747d;

    static {
        dl.c.b bVarA = dl.c.a("inferenceCommonLogEvent");
        v1 v1Var = new v1();
        v1Var.a(1);
        f63745b = bVarA.b(v1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("imageInfo");
        v1 v1Var2 = new v1();
        v1Var2.a(2);
        f63746c = bVarA2.b(v1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("recognizerOptions");
        v1 v1Var3 = new v1();
        v1Var3.a(3);
        f63747d = bVarA3.b(v1Var3.b()).a();
    }

    private ya() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        rh rhVar = (rh) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f63745b, rhVar.b());
        eVar.d(f63746c, rhVar.a());
        eVar.d(f63747d, rhVar.c());
    }
}
