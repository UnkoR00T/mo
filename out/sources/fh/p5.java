package fh;

/* JADX INFO: loaded from: classes3.dex */
final class p5 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p5 f63436a = new p5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f63437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f63438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f63439d;

    static {
        dl.c.b bVarA = dl.c.a("logEventKey");
        v1 v1Var = new v1();
        v1Var.a(1);
        f63437b = bVarA.b(v1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("eventCount");
        v1 v1Var2 = new v1();
        v1Var2.a(2);
        f63438c = bVarA2.b(v1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("inferenceDurationStats");
        v1 v1Var3 = new v1();
        v1Var3.a(3);
        f63439d = bVarA3.b(v1Var3.b()).a();
    }

    private p5() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        y3 y3Var = (y3) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f63437b, y3Var.a());
        eVar.d(f63438c, y3Var.c());
        eVar.d(f63439d, y3Var.b());
    }
}
