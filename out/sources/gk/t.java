package gk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f73392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk.b f73393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk.a f73394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f73395d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private v f73396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private uk.b f73397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f73398c;

        private uk.a b() {
            if (this.f73396a.c() == v.c.f73406d) {
                return uk.a.a(new byte[0]);
            }
            if (this.f73396a.c() == v.c.f73405c) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f73398c.intValue()).array());
            }
            if (this.f73396a.c() == v.c.f73404b) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f73398c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f73396a.c());
        }

        public t a() throws GeneralSecurityException {
            v vVar = this.f73396a;
            if (vVar == null || this.f73397b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.b() != this.f73397b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f73396a.d() && this.f73398c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f73396a.d() && this.f73398c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t(this.f73396a, this.f73397b, b(), this.f73398c);
        }

        public b c(Integer num) {
            this.f73398c = num;
            return this;
        }

        public b d(uk.b bVar) {
            this.f73397b = bVar;
            return this;
        }

        public b e(v vVar) {
            this.f73396a = vVar;
            return this;
        }

        private b() {
            this.f73396a = null;
            this.f73397b = null;
            this.f73398c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private t(v vVar, uk.b bVar, uk.a aVar, Integer num) {
        this.f73392a = vVar;
        this.f73393b = bVar;
        this.f73394c = aVar;
        this.f73395d = num;
    }
}
