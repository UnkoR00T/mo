package gk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f73337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f73339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f73340d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f73341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f73342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f73343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f73344d;

        public i a() throws GeneralSecurityException {
            Integer num = this.f73341a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f73342b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f73344d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f73343c != null) {
                return new i(num.intValue(), this.f73342b.intValue(), this.f73343c.intValue(), this.f73344d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i15) throws GeneralSecurityException {
            if (i15 != 12 && i15 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i15)));
            }
            this.f73342b = Integer.valueOf(i15);
            return this;
        }

        public b c(int i15) throws InvalidAlgorithmParameterException {
            if (i15 != 16 && i15 != 24 && i15 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i15)));
            }
            this.f73341a = Integer.valueOf(i15);
            return this;
        }

        public b d(int i15) throws GeneralSecurityException {
            if (i15 < 0 || i15 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i15)));
            }
            this.f73343c = Integer.valueOf(i15);
            return this;
        }

        public b e(c cVar) {
            this.f73344d = cVar;
            return this;
        }

        private b() {
            this.f73341a = null;
            this.f73342b = null;
            this.f73343c = null;
            this.f73344d = c.f73347d;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f73345b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f73346c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f73347d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f73348a;

        private c(String str) {
            this.f73348a = str;
        }

        public String toString() {
            return this.f73348a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f73338b;
    }

    public int c() {
        return this.f73337a;
    }

    public int d() {
        return this.f73339c;
    }

    public c e() {
        return this.f73340d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.c() == c() && iVar.b() == b() && iVar.d() == d() && iVar.e() == e();
    }

    public boolean f() {
        return this.f73340d != c.f73347d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f73337a), Integer.valueOf(this.f73338b), Integer.valueOf(this.f73339c), this.f73340d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f73340d + ", " + this.f73338b + "-byte IV, " + this.f73339c + "-byte tag, and " + this.f73337a + "-byte key)";
    }

    private i(int i15, int i16, int i17, c cVar) {
        this.f73337a = i15;
        this.f73338b = i16;
        this.f73339c = i17;
        this.f73340d = cVar;
    }
}
