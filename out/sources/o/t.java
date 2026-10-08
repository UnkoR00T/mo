package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    public static abstract class a {
        public static a a(int i15) {
            return b(i15, null);
        }

        public static a b(int i15, Throwable th4) {
            return new c(i15, th4);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static t a(b bVar, a aVar) {
        return new o.b(bVar, aVar);
    }

    public abstract a b();

    public abstract b c();
}
