package es;

/* JADX INFO: loaded from: classes4.dex */
public enum h0 {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ wq.a f53151j = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fs.d f53152a;

    h0(int i15) {
        this.f53152a = new fs.d(ws.b.f214722d, i15);
    }

    public static wq.a<h0> e() {
        return f53151j;
    }

    public final fs.d g() {
        return this.f53152a;
    }
}
