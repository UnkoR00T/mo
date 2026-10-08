package lx1;

import dx.i;
import er.p;
import fr.k;
import fr.t;
import iy.i0;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.util.Arrays;
import ju.g1;
import ju.p0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0011B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Llx1/c;", "", "Llx1/c$a;", "Lkx1/a;", "Lix1/c;", "pdfSigningManager", "Liy/i0;", "x509CertificateDecoder", "<init>", "(Lix1/c;Liy/i0;)V", "params", "Ldx/i;", "Ldx/b;", "f", "(Llx1/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lix1/c;", "b", "Liy/i0;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ix1.c pdfSigningManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 x509CertificateDecoder;

    /* JADX INFO: renamed from: lx1.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Llx1/c$a;", "Lgz/b$a;", "", "pdf", "x509Cert", "Ljava/time/Instant;", "signingTime", "<init>", "([B[BLjava/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "()[B", "b", "c", "Ljava/time/Instant;", "()Ljava/time/Instant;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] pdf;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] x509Cert;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Instant signingTime;

        public Params(byte[] bArr, byte[] bArr2, Instant instant) {
            this.pdf = bArr;
            this.x509Cert = bArr2;
            this.signingTime = instant;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getPdf() {
            return this.pdf;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Instant getSigningTime() {
            return this.signingTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final byte[] getX509Cert() {
            return this.x509Cert;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.pdf, params.pdf) && t.c(this.x509Cert, params.x509Cert) && t.c(this.signingTime, params.signingTime);
        }

        public int hashCode() {
            return (((Arrays.hashCode(this.pdf) * 31) + Arrays.hashCode(this.x509Cert)) * 31) + this.signingTime.hashCode();
        }

        public String toString() {
            return "Params(pdf=" + Arrays.toString(this.pdf) + ", x509Cert=" + Arrays.toString(this.x509Cert) + ", signingTime=" + this.signingTime + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\t\u0006B\u0015\b\u0004\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Llx1/c$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "<init>", "(Ljava/lang/Exception;)V", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "Llx1/c$b$a;", "Llx1/c$b$b;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Exception error;

        /* JADX INFO: renamed from: lx1.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Llx1/c$b$a;", "Llx1/c$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Exception;", "a", "()Ljava/lang/Exception;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EncryptedFile extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Exception error;

            public EncryptedFile(Exception exc) {
                super(exc, null);
                this.error = exc;
            }

            @Override // lx1.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public Exception getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EncryptedFile) && t.c(this.error, ((EncryptedFile) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "EncryptedFile(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: lx1.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Llx1/c$b$b;", "Llx1/c$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Exception;", "a", "()Ljava/lang/Exception;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Generic extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Exception error;

            public Generic(Exception exc) {
                super(exc, null);
                this.error = exc;
            }

            @Override // lx1.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public Exception getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Generic) && t.c(this.error, ((Generic) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "Generic(error=" + this.error + ')';
            }
        }

        public /* synthetic */ b(Exception exc, k kVar) {
            this(exc);
        }

        /* JADX INFO: renamed from: a */
        public abstract Exception getError();

        private b(Exception exc) {
            this.error = exc;
        }
    }

    /* JADX INFO: renamed from: lx1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lkx1/a;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C2962c extends vq.k implements p<p0, e<? super i<? extends dx.b, ? extends kx1.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121104e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f121106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2962c(Params params, e<? super C2962c> eVar) {
            super(2, eVar);
            this.f121106g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f121104e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                i<dx.b, X509Certificate> iVarDecode = c.this.x509CertificateDecoder.decode(this.f121106g.getX509Cert());
                if (iVarDecode instanceof i.Left) {
                    return new i.Left((dx.b) ((i.Left) iVarDecode).b());
                }
                if (iVarDecode instanceof i.Right) {
                    return new i.Right(c.this.pdfSigningManager.a(this.f121106g.getPdf(), (X509Certificate) ((i.Right) iVarDecode).b(), this.f121106g.getSigningTime()));
                }
                throw new oq.p();
            } catch (Exception e15) {
                return new i.Left(new dx.b.Generic(e15.getCause() instanceof jp.c ? new b.EncryptedFile(e15) : new b.Generic(e15)));
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i<? extends dx.b, kx1.a>> eVar) {
            return ((C2962c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final e<oq.i0> v(Object obj, e<?> eVar) {
            return c.this.new C2962c(this.f121106g, eVar);
        }
    }

    public c(ix1.c cVar, i0 i0Var) {
        this.pdfSigningManager = cVar;
        this.x509CertificateDecoder = i0Var;
    }

    public Object f(Params params, e<? super i<? extends dx.b, kx1.a>> eVar) {
        return ju.i.g(g1.b(), new C2962c(params, null), eVar);
    }
}
