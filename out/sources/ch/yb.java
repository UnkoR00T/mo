package ch;

/* JADX INFO: loaded from: classes3.dex */
final class yb implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final yb f26546a = new yb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f26547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f26548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f26549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl.c f26550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dl.c f26551f;

    static {
        dl.c.b bVarA = dl.c.a("xMin");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26547b = bVarA.b(l2Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("yMin");
        l2 l2Var2 = new l2();
        l2Var2.a(2);
        f26548c = bVarA2.b(l2Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("xMax");
        l2 l2Var3 = new l2();
        l2Var3.a(3);
        f26549d = bVarA3.b(l2Var3.b()).a();
        dl.c.b bVarA4 = dl.c.a("yMax");
        l2 l2Var4 = new l2();
        l2Var4.a(4);
        f26550e = bVarA4.b(l2Var4.b()).a();
        dl.c.b bVarA5 = dl.c.a("confidenceScore");
        l2 l2Var5 = new l2();
        l2Var5.a(5);
        f26551f = bVarA5.b(l2Var5.b()).a();
    }

    private yb() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        oi oiVar = (oi) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f26547b, oiVar.c());
        eVar.d(f26548c, oiVar.e());
        eVar.d(f26549d, oiVar.b());
        eVar.d(f26550e, oiVar.d());
        eVar.d(f26551f, oiVar.a());
    }
}
