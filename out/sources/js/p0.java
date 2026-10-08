package js;

/* JADX INFO: loaded from: classes4.dex */
public enum p0 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f104725a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f104724g = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f104719b = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    p0(String str) {
        this.f104725a = str;
    }

    public final String e() {
        return this.f104725a;
    }

    public final boolean g() {
        return this == IGNORE;
    }

    public final boolean j() {
        return this == WARN;
    }
}
