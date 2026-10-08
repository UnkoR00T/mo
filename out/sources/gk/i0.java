package gk;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f73349a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f73350b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f73351c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f73352d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f73353a;

        private a(String str) {
            this.f73353a = str;
        }

        public String toString() {
            return this.f73353a;
        }
    }

    private i0(a aVar) {
        this.f73349a = aVar;
    }

    public static i0 a(a aVar) {
        return new i0(aVar);
    }

    public a b() {
        return this.f73349a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i0) && ((i0) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f73349a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f73349a + ")";
    }
}
