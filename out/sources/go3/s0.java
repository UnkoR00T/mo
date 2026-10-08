package go3;

import dn0.VerificationCertificate;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgo3/s0;", "", "Lgo3/s0$a;", "Ldn0/c;", "Len0/c;", "fetchVerificationCertificateUC", "Lgo3/v0;", "verifyQrCodeExpirationUseCase", "Lac4/d;", "getCurrentServerTimeUseCase", "<init>", "(Len0/c;Lgo3/v0;Lac4/d;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/s0$a;Ltq/e;)Ljava/lang/Object;", "a", "Len0/c;", "b", "Lgo3/v0;", "c", "Lac4/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final en0.c fetchVerificationCertificateUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v0 verifyQrCodeExpirationUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: go3.s0$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgo3/s0$a;", "Lgz/b$a;", "", "sessionId", "", "validTime", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long validTime;

        public Params(String str, long j15) {
            this.sessionId = str;
            this.validTime = j15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getValidTime() {
            return this.validTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.sessionId, params.sessionId) && this.validTime == params.validTime;
        }

        public int hashCode() {
            return (this.sessionId.hashCode() * 31) + Long.hashCode(this.validTime);
        }

        public String toString() {
            return "Params(sessionId=" + this.sessionId + ", validTime=" + this.validTime + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75700e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75702g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75700e = obj;
            this.f75702g |= PKIFailureInfo.systemUnavail;
            return s0.this.d(null, this);
        }
    }

    public s0(en0.c cVar, v0 v0Var, ac4.d dVar) {
        this.fetchVerificationCertificateUC = cVar;
        this.verifyQrCodeExpirationUseCase = v0Var;
        this.getCurrentServerTimeUseCase = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, VerificationCertificate>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f75702g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f75702g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f75700e;
        Object objE = uq.b.e();
        int i16 = bVar.f75702g;
        if (i16 == 0) {
            oq.u.b(objC);
            en0.c cVar = this.fetchVerificationCertificateUC;
            en0.c.Params params2 = new en0.c.Params(params.getSessionId());
            bVar.f75699d = params;
            bVar.f75702g = 1;
            objC = cVar.c(params2, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (Params) bVar.f75699d;
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        VerificationCertificate verificationCertificate = (VerificationCertificate) ((dx.i.Right) iVar).b();
        dx.i<dx.b, oq.i0> iVarB = this.verifyQrCodeExpirationUseCase.b(new v0.Params(params.getValidTime(), this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a).toEpochSecond(), false));
        if (iVarB instanceof dx.i.Left) {
            return iVarB;
        }
        if (!(iVarB instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(verificationCertificate);
    }
}
