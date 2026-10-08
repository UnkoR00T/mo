package fh;

/* JADX INFO: loaded from: classes3.dex */
final class xa implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final xa f63710a = new xa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f63711b;

    static {
        dl.c.b bVarA = dl.c.a("errorCode");
        v1 v1Var = new v1();
        v1Var.a(1);
        f63711b = bVarA.b(v1Var.b()).a();
    }

    private xa() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((dl.e) obj2).d(f63711b, ((oh) obj).a());
    }
}
