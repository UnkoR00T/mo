package po3;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpo3/b;", "Lxw/f;", "Lpo3/b$a;", "Ljb4/b;", "Lib4/c;", "domainErrorMapper", "<init>", "(Lib4/c;)V", "params", "e", "(Lpo3/b$a;)Ljb4/b;", "a", "Lib4/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: po3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006!"}, d2 = {"Lpo3/b$a;", "", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onRetry", "onEndVerificationProcess", "onGoToDrivingLicenceDocument", "onCheckVerificationStatus", "<init>", "(Ldx/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "()Ldx/b;", "b", "Ler/a;", "()Ler/a;", "c", "f", "d", "e", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetry;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEndVerificationProcess;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToDrivingLicenceDocument;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCheckVerificationStatus;

        public Params(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.domainError = bVar;
            this.onBack = aVar;
            this.onRetry = aVar2;
            this.onEndVerificationProcess = aVar3;
            this.onGoToDrivingLicenceDocument = aVar4;
            this.onCheckVerificationStatus = aVar5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onCheckVerificationStatus;
        }

        public final er.a<i0> d() {
            return this.onEndVerificationProcess;
        }

        public final er.a<i0> e() {
            return this.onGoToDrivingLicenceDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.domainError, params.domainError) && t.c(this.onBack, params.onBack) && t.c(this.onRetry, params.onRetry) && t.c(this.onEndVerificationProcess, params.onEndVerificationProcess) && t.c(this.onGoToDrivingLicenceDocument, params.onGoToDrivingLicenceDocument) && t.c(this.onCheckVerificationStatus, params.onCheckVerificationStatus);
        }

        public final er.a<i0> f() {
            return this.onRetry;
        }

        public int hashCode() {
            return (((((((((this.domainError.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onRetry.hashCode()) * 31) + this.onEndVerificationProcess.hashCode()) * 31) + this.onGoToDrivingLicenceDocument.hashCode()) * 31) + this.onCheckVerificationStatus.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", onBack=" + this.onBack + ", onRetry=" + this.onRetry + ", onEndVerificationProcess=" + this.onEndVerificationProcess + ", onGoToDrivingLicenceDocument=" + this.onGoToDrivingLicenceDocument + ", onCheckVerificationStatus=" + this.onCheckVerificationStatus + ')';
        }
    }

    public b(ib4.c cVar) {
        this.domainErrorMapper = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ib4.c.b bVar) {
        if (params.getDomainError() instanceof dx.b.Business) {
            dx.b.Business.a type = ((dx.b.Business) params.getDomainError()).getType();
            if (type == co3.a.EXPIRED_QR) {
                if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary)) {
                    params.d().a();
                } else {
                    params.b().a();
                }
            } else if (type == co3.a.INVALID_SCOPE) {
                params.d().a();
            } else if (type == co3.a.DRIVING_LICENCE_UPDATE_REQUIRED) {
                if (bVar instanceof ib4.c.b.a.Primary) {
                    params.e().a();
                } else {
                    params.d().a();
                }
            } else if (type == co3.a.VERIFICATION_STATUS_LIMIT_EXCEEDED) {
                if ((bVar instanceof ib4.c.b.a.Primary) || t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    params.c().a();
                } else {
                    params.d().a();
                }
            } else if (type == co3.a.VERIFICATION_EXPIRED) {
                if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary)) {
                    params.d().a();
                } else {
                    params.b().a();
                }
            }
        } else if (t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            params.f().a();
        } else {
            params.d().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        return this.domainErrorMapper.b(new ib4.c.Params(params.getDomainError(), false, new er.l() { // from class: po3.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (ib4.c.b) obj);
            }
        }, 2, null));
    }
}
