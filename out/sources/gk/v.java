package gk;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends gk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f73400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f73401b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f73402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f73403b;

        public v a() throws GeneralSecurityException {
            Integer num = this.f73402a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f73403b != null) {
                return new v(num.intValue(), this.f73403b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i15) throws InvalidAlgorithmParameterException {
            if (i15 != 16 && i15 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i15)));
            }
            this.f73402a = Integer.valueOf(i15);
            return this;
        }

        public b c(c cVar) {
            this.f73403b = cVar;
            return this;
        }

        private b() {
            this.f73402a = null;
            this.f73403b = c.f73406d;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f73404b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f73405c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f73406d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f73407a;

        private c(String str) {
            this.f73407a = str;
        }

        public String toString() {
            return this.f73407a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f73400a;
    }

    public c c() {
        return this.f73401b;
    }

    public boolean d() {
        return this.f73401b != c.f73406d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f73400a), this.f73401b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f73401b + ", " + this.f73400a + "-byte key)";
    }

    private v(int i15, c cVar) {
        this.f73400a = i15;
        this.f73401b = cVar;
    }
}
