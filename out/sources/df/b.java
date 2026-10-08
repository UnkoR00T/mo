package df;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f41319b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f41320a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f41321a = null;

        a() {
        }

        public b a() {
            return new b(this.f41321a);
        }

        public a b(e eVar) {
            this.f41321a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f41320a = eVar;
    }

    public static a b() {
        return new a();
    }

    @gl.d(tag = 1)
    public e a() {
        return this.f41320a;
    }
}
