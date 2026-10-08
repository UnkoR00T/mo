package o;

import v.i3;
import v.u3;

/* JADX INFO: loaded from: classes.dex */
public interface o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f140087a = new o1() { // from class: o.n1
        @Override // o.o1
        public final o1.c e(o1.b bVar) {
            return o1.c.f140092d;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f140088b = new v.e1.b(d());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f140089c = new v.e1(d());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o1 f140090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f140091b;

        public a(o1 o1Var) {
            this.f140090a = o1Var;
            this.f140091b = o1Var.b();
        }

        public o1 a() {
            o1 o1Var = this.f140090a;
            return o1Var instanceof i3 ? ((i3) o1Var).c(this.f140091b) : new u3(this.f140091b, this.f140090a);
        }
    }

    public interface b {
        long a();

        int b();

        Throwable getCause();
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f140092d = new c(false, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f140093e = new c(true);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f140094f = new c(true, 100);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static c f140095g = new c(false, 0, true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f140096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f140097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f140098c;

        private c(boolean z15) {
            this(z15, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f140096a;
        }

        public boolean c() {
            return this.f140098c;
        }

        public boolean d() {
            return this.f140097b;
        }

        private c(boolean z15, long j15) {
            this(z15, j15, false);
        }

        private c(boolean z15, long j15, boolean z16) {
            this.f140097b = z15;
            this.f140096a = j15;
            if (z16) {
                i6.i.b(!z15, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f140098c = z16;
        }
    }

    static long d() {
        return 6000L;
    }

    default long b() {
        return 0L;
    }

    c e(b bVar);
}
