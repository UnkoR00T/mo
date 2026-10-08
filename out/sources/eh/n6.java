package eh;

/* JADX INFO: loaded from: classes3.dex */
final class n6 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final n6 f50849a = new n6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f50850b;

    static {
        dl.c.b bVarA = dl.c.a("errorCode");
        s1 s1Var = new s1();
        s1Var.a(1);
        f50850b = bVarA.b(s1Var.b()).a();
    }

    private n6() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((dl.e) obj2).d(f50850b, ((za) obj).a());
    }
}
