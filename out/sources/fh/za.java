package fh;

/* JADX INFO: loaded from: classes3.dex */
final class za implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final za f63768a = new za();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f63769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl.c f63770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.c f63771d;

    static {
        dl.c.b bVarA = dl.c.a("languageOption");
        v1 v1Var = new v1();
        v1Var.a(3);
        f63769b = bVarA.b(v1Var.b()).a();
        dl.c.b bVarA2 = dl.c.a("isUsingLegacyApi");
        v1 v1Var2 = new v1();
        v1Var2.a(4);
        f63770c = bVarA2.b(v1Var2.b()).a();
        dl.c.b bVarA3 = dl.c.a("sdkVersion");
        v1 v1Var3 = new v1();
        v1Var3.a(5);
        f63771d = bVarA3.b(v1Var3.b()).a();
    }

    private za() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dl.e eVar = (dl.e) obj2;
        eVar.d(f63769b, ((wh) obj).a());
        eVar.d(f63770c, null);
        eVar.d(f63771d, null);
    }
}
