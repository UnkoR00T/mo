package ok;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f146397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f146398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f146399c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f146400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f146401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f146402c;

        public d a() throws GeneralSecurityException {
            Integer num = this.f146400a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f146401b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f146402c != null) {
                return new d(num.intValue(), this.f146401b.intValue(), this.f146402c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i15) throws InvalidAlgorithmParameterException {
            if (i15 != 16 && i15 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i15 * 8)));
            }
            this.f146400a = Integer.valueOf(i15);
            return this;
        }

        public b c(int i15) throws GeneralSecurityException {
            if (i15 >= 10 && 16 >= i15) {
                this.f146401b = Integer.valueOf(i15);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i15);
        }

        public b d(c cVar) {
            this.f146402c = cVar;
            return this;
        }

        private b() {
            this.f146400a = null;
            this.f146401b = null;
            this.f146402c = c.f146406e;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f146403b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f146404c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f146405d = new c("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f146406e = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f146407a;

        private c(String str) {
            this.f146407a = str;
        }

        public String toString() {
            return this.f146407a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f146398b;
    }

    public int c() {
        return this.f146397a;
    }

    public int d() {
        c cVar = this.f146399c;
        if (cVar == c.f146406e) {
            return b();
        }
        if (cVar != c.f146403b && cVar != c.f146404c && cVar != c.f146405d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public c e() {
        return this.f146399c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c() == c() && dVar.d() == d() && dVar.e() == e();
    }

    public boolean f() {
        return this.f146399c != c.f146406e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f146397a), Integer.valueOf(this.f146398b), this.f146399c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f146399c + ", " + this.f146398b + "-byte tags, and " + this.f146397a + "-byte key)";
    }

    private d(int i15, int i16, c cVar) {
        this.f146397a = i15;
        this.f146398b = i16;
        this.f146399c = cVar;
    }
}
