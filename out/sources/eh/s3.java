package eh;

/* JADX INFO: loaded from: classes3.dex */
final class s3 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final s3 f51035a = new s3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f51036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f51037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f51038d;

    static {
        dl.c.b bVarA = dl.c.a("logEventKey");
        s1 s1Var = new s1();
        s1Var.a(1);
        f51036b = bVarA.b(s1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("eventCount");
        s1 s1Var2 = new s1();
        s1Var2.a(2);
        f51037c = bVarA2.b(s1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("inferenceDurationStats");
        s1 s1Var3 = new s1();
        s1Var3.a(3);
        f51038d = bVarA3.b(s1Var3.b()).a();
    }

    private s3() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        s2 s2Var = (s2) obj;
        dl.e eVar = (dl.e) obj2;
        eVar.d(f51036b, s2Var.a());
        eVar.d(f51037c, s2Var.c());
        eVar.d(f51038d, s2Var.b());
    }
}
