package ok;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f146388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk.b f146389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk.a f146390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f146391d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f146392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private uk.b f146393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f146394c;

        private uk.a b() {
            if (this.f146392a.e() == d.c.f146406e) {
                return uk.a.a(new byte[0]);
            }
            if (this.f146392a.e() == d.c.f146405d || this.f146392a.e() == d.c.f146404c) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f146394c.intValue()).array());
            }
            if (this.f146392a.e() == d.c.f146403b) {
                return uk.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f146394c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f146392a.e());
        }

        public a a() throws GeneralSecurityException {
            d dVar = this.f146392a;
            if (dVar == null || this.f146393b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (dVar.c() != this.f146393b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f146392a.f() && this.f146394c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f146392a.f() && this.f146394c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f146392a, this.f146393b, b(), this.f146394c);
        }

        public b c(uk.b bVar) {
            this.f146393b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f146394c = num;
            return this;
        }

        public b e(d dVar) {
            this.f146392a = dVar;
            return this;
        }

        private b() {
            this.f146392a = null;
            this.f146393b = null;
            this.f146394c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // ok.p
    public uk.a a() {
        return this.f146390c;
    }

    @Override // ok.p
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d b() {
        return this.f146388a;
    }

    private a(d dVar, uk.b bVar, uk.a aVar, Integer num) {
        this.f146388a = dVar;
        this.f146389b = bVar;
        this.f146390c = aVar;
        this.f146391d = num;
    }
}
