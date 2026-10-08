package ap3;

import er.l;
import fr.t;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lap3/b;", "Lxw/f;", "Lap3/b$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "domainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Ldx/b;", "Ljb4/f;", "e", "(Ldx/b;)Ljb4/f;", "params", "f", "(Lap3/b$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: ap3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lap3/b$a;", "", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onCloseVerificationProcess", "onTryAgain", "<init>", "(Ldx/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "()Ldx/b;", "b", "Ler/a;", "()Ler/a;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseVerificationProcess;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTryAgain;

        public Params(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.domainError = bVar;
            this.onCloseVerificationProcess = aVar;
            this.onTryAgain = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        public final er.a<i0> b() {
            return this.onCloseVerificationProcess;
        }

        public final er.a<i0> c() {
            return this.onTryAgain;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.domainError, params.domainError) && t.c(this.onCloseVerificationProcess, params.onCloseVerificationProcess) && t.c(this.onTryAgain, params.onTryAgain);
        }

        public int hashCode() {
            return (((this.domainError.hashCode() * 31) + this.onCloseVerificationProcess.hashCode()) * 31) + this.onTryAgain.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", onCloseVerificationProcess=" + this.onCloseVerificationProcess + ", onTryAgain=" + this.onTryAgain + ')';
        }
    }

    public b(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.domainErrorMapper = cVar2;
    }

    private final PayloadErrorData e(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, ib4.c.b bVar) {
        if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary)) {
            params.b().a();
        } else if (bVar instanceof ib4.c.b.a.Primary) {
            params.c().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        dx.b domainError;
        Label labelC;
        Label labelC2;
        String message;
        String title;
        PayloadErrorData payloadErrorDataE = e(params.getDomainError());
        if (t.c(payloadErrorDataE != null ? payloadErrorDataE.getCode() : null, "VERIFICATION_SESSION_BY_CODE_NOT_FOUND")) {
            PayloadErrorData payloadErrorDataE2 = e(params.getDomainError());
            if (payloadErrorDataE2 == null || (title = payloadErrorDataE2.getTitle()) == null || (labelC = mx.b.b(title, "errorTitle")) == null) {
                labelC = this.labelProvider.c(un3.b.f199471q);
            }
            Label label = labelC;
            PayloadErrorData payloadErrorDataE3 = e(params.getDomainError());
            if (payloadErrorDataE3 == null || (message = payloadErrorDataE3.getMessage()) == null || (labelC2 = mx.b.b(message, "errorMessage")) == null) {
                labelC2 = Label.INSTANCE.c();
            }
            domainError = new dx.b.Business(null, null, label, labelC2, null, this.labelProvider.c(un3.b.f199476r), this.labelProvider.c(un3.b.f199406d), 19, null);
        } else {
            domainError = params.getDomainError();
        }
        return this.domainErrorMapper.b(new ib4.c.Params(domainError, false, new l() { // from class: ap3.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.h(params, (ib4.c.b) obj);
            }
        }, 2, null));
    }
}
