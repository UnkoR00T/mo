package sr;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f183554h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final oq.k<g> f183555i = oq.l.a(f.f183553a);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final g a() {
            return (g) g.f183555i.getValue();
        }

        private a() {
        }
    }

    public g() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g G0() {
        return new g(false, 1, null);
    }

    public g(boolean z15) {
        super(new rt.f("DefaultBuiltIns"));
        if (z15) {
            f(false);
        }
    }

    public /* synthetic */ g(boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? true : z15);
    }
}
