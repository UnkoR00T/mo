package il;

/* JADX INFO: loaded from: classes4.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f93244a;

        a(int i15) {
            this.f93244a = i15;
        }

        public int e() {
            return this.f93244a;
        }
    }

    a b(String str);
}
