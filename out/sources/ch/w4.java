package ch;

/* JADX INFO: loaded from: classes3.dex */
final class w4 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w4 f26441a = new w4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f26442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f26443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f26444d;

    static {
        dl.c.b bVarA = dl.c.a("logEventKey");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26442b = bVarA.b(l2Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("eventCount");
        l2 l2Var2 = new l2();
        l2Var2.a(2);
        f26443c = bVarA2.b(l2Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("inferenceDurationStats");
        l2 l2Var3 = new l2();
        l2Var3.a(3);
        f26444d = bVarA3.b(l2Var3.b()).a();
    }

    private w4() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        g3 g3Var = (g3) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f26442b, g3Var.a());
        eVar.d(f26443c, g3Var.c());
        eVar.d(f26444d, g3Var.b());
    }
}
