package gk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f73324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk.b f73325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk.a f73326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f73327d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i f73328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private uk.b f73329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f73330c;

        private uk.a b() {
            if (this.f73328a.e() == i.c.f73347d) {
                return uk.a.a(new byte[0]);
            }
            if (this.f73328a.e() == i.c.f73346c) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f73330c.intValue()).array());
            }
            if (this.f73328a.e() == i.c.f73345b) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f73330c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f73328a.e());
        }

        public g a() throws GeneralSecurityException {
            i iVar = this.f73328a;
            if (iVar == null || this.f73329b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (iVar.c() != this.f73329b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f73328a.f() && this.f73330c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f73328a.f() && this.f73330c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new g(this.f73328a, this.f73329b, b(), this.f73330c);
        }

        public b c(Integer num) {
            this.f73330c = num;
            return this;
        }

        public b d(uk.b bVar) {
            this.f73329b = bVar;
            return this;
        }

        public b e(i iVar) {
            this.f73328a = iVar;
            return this;
        }

        private b() {
            this.f73328a = null;
            this.f73329b = null;
            this.f73330c = null;
        }
    }

    public static b a() {
        return new b();
    }

    private g(i iVar, uk.b bVar, uk.a aVar, Integer num) {
        this.f73324a = iVar;
        this.f73325b = bVar;
        this.f73326c = aVar;
        this.f73327d = num;
    }
}
