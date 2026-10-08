package st;

/* JADX INFO: loaded from: classes4.dex */
public enum p2 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ wq.a f184105j = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f184106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f184107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f184108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f184109d;

    p2(String str, boolean z15, boolean z16, int i15) {
        this.f184106a = str;
        this.f184107b = z15;
        this.f184108c = z16;
        this.f184109d = i15;
    }

    public final boolean e() {
        return this.f184108c;
    }

    public final String g() {
        return this.f184106a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f184106a;
    }
}
