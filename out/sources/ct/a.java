package ct;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f37591g = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37593b;

    a(boolean z15, boolean z16) {
        this.f37592a = z15;
        this.f37593b = z16;
    }

    public final boolean e() {
        return this.f37592a;
    }

    public final boolean g() {
        return this.f37593b;
    }

    /* synthetic */ a(boolean z15, boolean z16, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? false : z16);
    }
}
