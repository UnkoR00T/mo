package zt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f237213a;

    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f237214b = new a();

        private a() {
            super(false, null);
        }
    }

    public static final class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f237215b;

        public b(String str) {
            super(false, null);
            this.f237215b = str;
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f237216b = new c();

        private c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z15, fr.k kVar) {
        this(z15);
    }

    public final boolean a() {
        return this.f237213a;
    }

    private g(boolean z15) {
        this.f237213a = z15;
    }
}
