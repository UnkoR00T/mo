package gk;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f73301a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f73302b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f73303c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f73304d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f73305a;

        private a(String str) {
            this.f73305a = str;
        }

        public String toString() {
            return this.f73305a;
        }
    }

    private a0(a aVar) {
        this.f73301a = aVar;
    }

    public static a0 a(a aVar) {
        return new a0(aVar);
    }

    public a b() {
        return this.f73301a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && ((a0) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f73301a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f73301a + ")";
    }
}
