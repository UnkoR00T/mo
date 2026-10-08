package es;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ wq.a f53063k = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fs.d f53064a;

    b(int i15) {
        this.f53064a = new fs.d(ws.b.f214724f, i15);
    }

    public static wq.a<b> e() {
        return f53063k;
    }

    public final fs.d g() {
        return this.f53064a;
    }
}
