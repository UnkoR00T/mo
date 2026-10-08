package ch;

/* JADX INFO: loaded from: classes3.dex */
final class w8 implements dl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w8 f26448a = new w8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl.c f26449b;

    static {
        dl.c.b bVarA = dl.c.a("errorCode");
        l2 l2Var = new l2();
        l2Var.a(1);
        f26449b = bVarA.b(l2Var.b()).a();
    }

    private w8() {
    }

    @Override // dl.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((dl.e) obj2).d(f26449b, ((rf) obj).a());
    }
}
