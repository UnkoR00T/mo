package ze;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    public static abstract class a {
        public abstract n a();

        public abstract a b(ze.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f234571a;

        b(int i15) {
            this.f234571a = i15;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract ze.a b();

    public abstract b c();
}
