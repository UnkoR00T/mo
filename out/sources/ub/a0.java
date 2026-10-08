package ub;

/* JADX INFO: loaded from: classes3.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f197062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C5128b f197063b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f197064a;

            public a(Throwable th4) {
                this.f197064a = th4;
            }

            public String toString() {
                return "FAILURE (" + this.f197064a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: ub.a0$b$b, reason: collision with other inner class name */
        public static final class C5128b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C5128b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f197062a = new b.c();
        f197063b = new b.C5128b();
    }
}
