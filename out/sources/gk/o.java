package gk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f73366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk.b f73367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk.a f73368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f73369d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f73370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private uk.b f73371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f73372c;

        private uk.a b() {
            if (this.f73370a.e() == q.c.f73384d) {
                return uk.a.a(new byte[0]);
            }
            if (this.f73370a.e() == q.c.f73383c) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f73372c.intValue()).array());
            }
            if (this.f73370a.e() == q.c.f73382b) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f73372c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f73370a.e());
        }

        public o a() throws GeneralSecurityException {
            q qVar = this.f73370a;
            if (qVar == null || this.f73371b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (qVar.c() != this.f73371b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f73370a.f() && this.f73372c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f73370a.f() && this.f73372c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new o(this.f73370a, this.f73371b, b(), this.f73372c);
        }

        public b c(Integer num) {
            this.f73372c = num;
            return this;
        }

        public b d(uk.b bVar) {
            this.f73371b = bVar;
            return this;
        }

        public b e(q qVar) {
            this.f73370a = qVar;
            return this;
        }

        private b() {
            this.f73370a = null;
            this.f73371b = null;
            this.f73372c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private o(q qVar, uk.b bVar, uk.a aVar, Integer num) {
        this.f73366a = qVar;
        this.f73367b = bVar;
        this.f73368c = aVar;
        this.f73369d = num;
    }
}
