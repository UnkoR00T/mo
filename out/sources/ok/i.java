package ok;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f146416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk.b f146417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk.a f146418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f146419d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private l f146420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private uk.b f146421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f146422c;

        private uk.a b() {
            if (this.f146420a.f() == l.d.f146443e) {
                return uk.a.a(new byte[0]);
            }
            if (this.f146420a.f() == l.d.f146442d || this.f146420a.f() == l.d.f146441c) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f146422c.intValue()).array());
            }
            if (this.f146420a.f() == l.d.f146440b) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f146422c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f146420a.f());
        }

        public i a() throws GeneralSecurityException {
            l lVar = this.f146420a;
            if (lVar == null || this.f146421b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (lVar.d() != this.f146421b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f146420a.g() && this.f146422c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f146420a.g() && this.f146422c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f146420a, this.f146421b, b(), this.f146422c);
        }

        public b c(Integer num) {
            this.f146422c = num;
            return this;
        }

        public b d(uk.b bVar) {
            this.f146421b = bVar;
            return this;
        }

        public b e(l lVar) {
            this.f146420a = lVar;
            return this;
        }

        private b() {
            this.f146420a = null;
            this.f146421b = null;
            this.f146422c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // ok.p
    public uk.a a() {
        return this.f146418c;
    }

    @Override // ok.p
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l b() {
        return this.f146416a;
    }

    private i(l lVar, uk.b bVar, uk.a aVar, Integer num) {
        this.f146416a = lVar;
        this.f146417b = bVar;
        this.f146418c = aVar;
        this.f146419d = num;
    }
}
