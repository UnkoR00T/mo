package ox3;

import fr.t;
import jb4.ErrorActionData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lox3/d;", "Lxw/f;", "Lox3/d$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lox3/d$a;)Ljb4/b;", "a", "Lmx/c;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ox3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lox3/d$a;", "", "Lnx3/a;", "error", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "<init>", "(Lnx3/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnx3/a;", "b", "()Lnx3/a;", "Ler/a;", "()Ler/a;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nx3.a error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        public Params(nx3.a aVar, er.a<i0> aVar2) {
            this.error = aVar;
            this.closeAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final nx3.a getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.error, params.error) && t.c(this.closeAction, params.closeAction);
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(error=" + this.error + ", closeAction=" + this.closeAction + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public jb4.b b(Params params) {
        nx3.a error = params.getError();
        if (t.c(error, nx3.a.C3453a.f139468a) || t.c(error, nx3.a.c.f139479a) || error == nx3.a.b.EPUAP_GENERAL) {
            return new jb4.b.Failure(this.labelProvider.c(gx3.a.f78221c), this.labelProvider.c(gx3.a.f78228j), null, new ErrorActionData(this.labelProvider.c(gx3.a.f78219a), params.a()), null, null, new ErrorActionData(Label.INSTANCE.c(), params.a()), 52, null);
        }
        if (error == nx3.a.b.MISSING_EPUAP) {
            return new jb4.b.Warning(this.labelProvider.c(gx3.a.f78225g), this.labelProvider.c(gx3.a.f78233o), null, new ErrorActionData(this.labelProvider.c(gx3.a.f78219a), params.a()), null, null, new ErrorActionData(null, params.a(), 1, null), 52, null);
        }
        if (error == nx3.a.b.MISSING_PZ) {
            return new jb4.b.Warning(this.labelProvider.c(gx3.a.f78226h), this.labelProvider.c(gx3.a.f78234p), null, new ErrorActionData(this.labelProvider.c(gx3.a.f78219a), params.a()), null, null, new ErrorActionData(null, params.a(), 1, null), 52, null);
        }
        if (error == nx3.a.b.MORE_THAN_ONE_EPUAP_ACCOUNT) {
            return new jb4.b.Warning(this.labelProvider.c(gx3.a.f78227i), this.labelProvider.c(gx3.a.f78235q), null, new ErrorActionData(this.labelProvider.c(gx3.a.f78219a), params.a()), null, null, new ErrorActionData(null, params.a(), 1, null), 52, null);
        }
        if (error == nx3.a.b.ACCOUNT_BROKEN) {
            return new jb4.b.Warning(this.labelProvider.c(gx3.a.f78232n), this.labelProvider.c(gx3.a.f78231m), null, new ErrorActionData(this.labelProvider.c(gx3.a.f78219a), params.a()), null, null, new ErrorActionData(null, params.a(), 1, null), 52, null);
        }
        if (error == nx3.a.b.LOGIN_NOT_POSSIBLE_MANUAL) {
            return new jb4.b.Warning(this.labelProvider.c(gx3.a.f78230l), this.labelProvider.c(gx3.a.f78229k), null, new ErrorActionData(this.labelProvider.c(gx3.a.f78219a), params.a()), null, null, new ErrorActionData(null, params.a(), 1, null), 52, null);
        }
        throw new p();
    }
}
