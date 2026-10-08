package ie;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f91909a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f91910b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f91911c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f91912d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f91913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f91914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f91915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zd.g<n> f91916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f91917i;

    private static class a extends n {
        a() {
        }

        @Override // ie.n
        public g a(int i15, int i16, int i17, int i18) {
            return g.QUALITY;
        }

        @Override // ie.n
        public float b(int i15, int i16, int i17, int i18) {
            int iMin = Math.min(i16 / i18, i15 / i17);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    private static class b extends n {
        b() {
        }

        @Override // ie.n
        public g a(int i15, int i16, int i17, int i18) {
            return g.MEMORY;
        }

        @Override // ie.n
        public float b(int i15, int i16, int i17, int i18) {
            int iCeil = (int) Math.ceil(Math.max(i16 / i18, i15 / i17));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    private static class c extends n {
        c() {
        }

        @Override // ie.n
        public g a(int i15, int i16, int i17, int i18) {
            return b(i15, i16, i17, i18) == 1.0f ? g.QUALITY : n.f91911c.a(i15, i16, i17, i18);
        }

        @Override // ie.n
        public float b(int i15, int i16, int i17, int i18) {
            return Math.min(1.0f, n.f91911c.b(i15, i16, i17, i18));
        }
    }

    private static class d extends n {
        d() {
        }

        @Override // ie.n
        public g a(int i15, int i16, int i17, int i18) {
            return g.QUALITY;
        }

        @Override // ie.n
        public float b(int i15, int i16, int i17, int i18) {
            return Math.max(i17 / i15, i18 / i16);
        }
    }

    private static class e extends n {
        e() {
        }

        @Override // ie.n
        public g a(int i15, int i16, int i17, int i18) {
            return n.f91917i ? g.QUALITY : g.MEMORY;
        }

        @Override // ie.n
        public float b(int i15, int i16, int i17, int i18) {
            if (n.f91917i) {
                return Math.min(i17 / i15, i18 / i16);
            }
            int iMax = Math.max(i16 / i18, i15 / i17);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    private static class f extends n {
        f() {
        }

        @Override // ie.n
        public g a(int i15, int i16, int i17, int i18) {
            return g.QUALITY;
        }

        @Override // ie.n
        public float b(int i15, int i16, int i17, int i18) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f91913e = dVar;
        f91914f = new f();
        f91915g = dVar;
        f91916h = zd.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f91917i = true;
    }

    public abstract g a(int i15, int i16, int i17, int i18);

    public abstract float b(int i15, int i16, int i17, int i18);
}
