package my2;

import er.l;
import fr.t;
import jb4.ErrorActionData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmy2/b;", "Lxw/f;", "Lmy2/b$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "params", "e", "(Lmy2/b$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: my2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmy2/b$a;", "", "Lny2/a;", "error", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onCloseProcess", "<init>", "(Lny2/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lny2/a;", "()Lny2/a;", "b", "Ler/a;", "c", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ny2.a error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetry;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseProcess;

        public Params(ny2.a aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.error = aVar;
            this.onRetry = aVar2;
            this.onCloseProcess = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ny2.a getError() {
            return this.error;
        }

        public final er.a<i0> b() {
            return this.onCloseProcess;
        }

        public final er.a<i0> c() {
            return this.onRetry;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.error, params.error) && t.c(this.onRetry, params.onRetry) && t.c(this.onCloseProcess, params.onCloseProcess);
        }

        public int hashCode() {
            return (((this.error.hashCode() * 31) + this.onRetry.hashCode()) * 31) + this.onCloseProcess.hashCode();
        }

        public String toString() {
            return "Params(error=" + this.error + ", onRetry=" + this.onRetry + ", onCloseProcess=" + this.onCloseProcess + ')';
        }
    }

    public b(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ib4.c.b bVar) {
        if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary)) {
            params.b().a();
        } else {
            if (!t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new p();
            }
            params.c().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        ny2.a error = params.getError();
        if (t.c(error, ny2.a.b.f139693a)) {
            return new jb4.b.Warning(this.labelProvider.c(gv2.a.Q0), this.labelProvider.c(gv2.a.P0), null, new ErrorActionData(this.labelProvider.c(gv2.a.f77286n), params.b()), null, null, new ErrorActionData(null, params.b(), 1, null), 52, null);
        }
        if (error instanceof ny2.a.Generic) {
            return this.genericDomainErrorMapper.b(new ib4.c.Params(((ny2.a.Generic) error).getDomainError(), false, new l() { // from class: my2.a
                @Override // er.l
                public final Object b(Object obj) {
                    return b.f(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        throw new p();
    }
}
