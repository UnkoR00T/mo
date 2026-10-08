package ss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f183927a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f183928b = new d(jt.e.BOOLEAN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f183929c = new d(jt.e.CHAR);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f183930d = new d(jt.e.BYTE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f183931e = new d(jt.e.SHORT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f183932f = new d(jt.e.INT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f183933g = new d(jt.e.FLOAT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f183934h = new d(jt.e.LONG);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d f183935i = new d(jt.e.DOUBLE);

    public static final class a extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final s f183936j;

        public a(s sVar) {
            super(null);
            this.f183936j = sVar;
        }

        public final s i() {
            return this.f183936j;
        }
    }

    public static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        public final d a() {
            return s.f183928b;
        }

        public final d b() {
            return s.f183930d;
        }

        public final d c() {
            return s.f183929c;
        }

        public final d d() {
            return s.f183935i;
        }

        public final d e() {
            return s.f183933g;
        }

        public final d f() {
            return s.f183932f;
        }

        public final d g() {
            return s.f183934h;
        }

        public final d h() {
            return s.f183931e;
        }

        private b() {
        }
    }

    public static final class c extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f183937j;

        public c(String str) {
            super(null);
            this.f183937j = str;
        }

        public final String i() {
            return this.f183937j;
        }
    }

    public static final class d extends s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final jt.e f183938j;

        public d(jt.e eVar) {
            super(null);
            this.f183938j = eVar;
        }

        public final jt.e i() {
            return this.f183938j;
        }
    }

    public /* synthetic */ s(fr.k kVar) {
        this();
    }

    public String toString() {
        return u.f183939a.c(this);
    }

    private s() {
    }
}
