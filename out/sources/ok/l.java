package ok;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f146426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f146427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f146428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f146429d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f146430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f146431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f146432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f146433d;

        private static void f(int i15, c cVar) throws GeneralSecurityException {
            if (i15 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i15)));
            }
            if (cVar == c.f146434b) {
                if (i15 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i15)));
                }
                return;
            }
            if (cVar == c.f146435c) {
                if (i15 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i15)));
                }
                return;
            }
            if (cVar == c.f146436d) {
                if (i15 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i15)));
                }
            } else if (cVar == c.f146437e) {
                if (i15 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i15)));
                }
            } else {
                if (cVar != c.f146438f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i15 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i15)));
                }
            }
        }

        public l a() throws GeneralSecurityException {
            Integer num = this.f146430a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f146431b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f146432c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f146433d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f146430a));
            }
            f(this.f146431b.intValue(), this.f146432c);
            return new l(this.f146430a.intValue(), this.f146431b.intValue(), this.f146433d, this.f146432c);
        }

        public b b(c cVar) {
            this.f146432c = cVar;
            return this;
        }

        public b c(int i15) {
            this.f146430a = Integer.valueOf(i15);
            return this;
        }

        public b d(int i15) {
            this.f146431b = Integer.valueOf(i15);
            return this;
        }

        public b e(d dVar) {
            this.f146433d = dVar;
            return this;
        }

        private b() {
            this.f146430a = null;
            this.f146431b = null;
            this.f146432c = null;
            this.f146433d = d.f146443e;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f146434b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f146435c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f146436d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f146437e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f146438f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f146439a;

        private c(String str) {
            this.f146439a = str;
        }

        public String toString() {
            return this.f146439a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f146440b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f146441c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f146442d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f146443e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f146444a;

        private d(String str) {
            this.f146444a = str;
        }

        public String toString() {
            return this.f146444a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f146427b;
    }

    public c c() {
        return this.f146429d;
    }

    public int d() {
        return this.f146426a;
    }

    public int e() {
        d dVar = this.f146428c;
        if (dVar == d.f146443e) {
            return b();
        }
        if (dVar != d.f146440b && dVar != d.f146441c && dVar != d.f146442d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f146428c;
    }

    public boolean g() {
        return this.f146428c != d.f146443e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f146426a), Integer.valueOf(this.f146427b), this.f146428c, this.f146429d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f146428c + ", hashType: " + this.f146429d + ", " + this.f146427b + "-byte tags, and " + this.f146426a + "-byte key)";
    }

    private l(int i15, int i16, d dVar, c cVar) {
        this.f146426a = i15;
        this.f146427b = i16;
        this.f146428c = dVar;
        this.f146429d = cVar;
    }
}
