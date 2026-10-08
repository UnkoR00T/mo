package gk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends gk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f73374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f73376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f73377d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f73378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f73379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f73380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f73381d;

        public q a() throws GeneralSecurityException {
            Integer num = this.f73378a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f73381d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f73379b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f73380c != null) {
                return new q(num.intValue(), this.f73379b.intValue(), this.f73380c.intValue(), this.f73381d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i15) throws GeneralSecurityException {
            if (i15 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i15)));
            }
            this.f73379b = Integer.valueOf(i15);
            return this;
        }

        public b c(int i15) throws InvalidAlgorithmParameterException {
            if (i15 != 16 && i15 != 24 && i15 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i15)));
            }
            this.f73378a = Integer.valueOf(i15);
            return this;
        }

        public b d(int i15) throws GeneralSecurityException {
            if (i15 != 12 && i15 != 13 && i15 != 14 && i15 != 15 && i15 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i15)));
            }
            this.f73380c = Integer.valueOf(i15);
            return this;
        }

        public b e(c cVar) {
            this.f73381d = cVar;
            return this;
        }

        private b() {
            this.f73378a = null;
            this.f73379b = null;
            this.f73380c = null;
            this.f73381d = c.f73384d;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f73382b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f73383c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f73384d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f73385a;

        private c(String str) {
            this.f73385a = str;
        }

        public String toString() {
            return this.f73385a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f73375b;
    }

    public int c() {
        return this.f73374a;
    }

    public int d() {
        return this.f73376c;
    }

    public c e() {
        return this.f73377d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f73377d != c.f73384d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f73374a), Integer.valueOf(this.f73375b), Integer.valueOf(this.f73376c), this.f73377d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f73377d + ", " + this.f73375b + "-byte IV, " + this.f73376c + "-byte tag, and " + this.f73374a + "-byte key)";
    }

    private q(int i15, int i16, int i17, c cVar) {
        this.f73374a = i15;
        this.f73375b = i16;
        this.f73376c = i17;
        this.f73377d = cVar;
    }
}
