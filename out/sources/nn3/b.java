package nn3;

import er.l;
import fr.k;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lnn3/b;", "Lxw/f;", "Lnn3/b$a;", "Ljb4/b;", "Lib4/c;", "genericErrorMapper", "<init>", "(Lib4/c;)V", "params", "e", "(Lnn3/b$a;)Ljb4/b;", "a", "Lib4/c;", "b", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: nn3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lnn3/b$a;", "", "Lnn3/b$b;", "error", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onRefresh", "<init>", "(Lnn3/b$b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnn3/b$b;", "()Lnn3/b$b;", "b", "Ler/a;", "()Ler/a;", "c", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC3391b error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRefresh;

        public Params(AbstractC3391b abstractC3391b, er.a<i0> aVar, er.a<i0> aVar2) {
            this.error = abstractC3391b;
            this.onClose = aVar;
            this.onRefresh = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC3391b getError() {
            return this.error;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onRefresh;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.error, params.error) && t.c(this.onClose, params.onClose) && t.c(this.onRefresh, params.onRefresh);
        }

        public int hashCode() {
            return (((this.error.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onRefresh.hashCode();
        }

        public String toString() {
            return "Params(error=" + this.error + ", onClose=" + this.onClose + ", onRefresh=" + this.onRefresh + ')';
        }
    }

    /* JADX INFO: renamed from: nn3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lnn3/b$b;", "", "Ldx/b;", "domainError", "<init>", "(Ldx/b;)V", "a", "Ldx/b;", "()Ldx/b;", "b", "Lnn3/b$b$a;", "Lnn3/b$b$b;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC3391b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final dx.b domainError;

        /* JADX INFO: renamed from: nn3.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnn3/b$b$a;", "Lnn3/b$b;", "Ldx/b;", "domainError", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class General extends AbstractC3391b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b domainError;

            public General(dx.b bVar) {
                super(bVar, null);
                this.domainError = bVar;
            }

            @Override // nn3.b.AbstractC3391b
            /* JADX INFO: renamed from: a, reason: from getter */
            public dx.b getDomainError() {
                return this.domainError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof General) && t.c(this.domainError, ((General) other).domainError);
            }

            public int hashCode() {
                return this.domainError.hashCode();
            }

            public String toString() {
                return "General(domainError=" + this.domainError + ')';
            }
        }

        /* JADX INFO: renamed from: nn3.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnn3/b$b$b;", "Lnn3/b$b;", "Ldx/b;", "domainError", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpdateError extends AbstractC3391b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b domainError;

            public UpdateError(dx.b bVar) {
                super(bVar, null);
                this.domainError = bVar;
            }

            @Override // nn3.b.AbstractC3391b
            /* JADX INFO: renamed from: a, reason: from getter */
            public dx.b getDomainError() {
                return this.domainError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateError) && t.c(this.domainError, ((UpdateError) other).domainError);
            }

            public int hashCode() {
                return this.domainError.hashCode();
            }

            public String toString() {
                return "UpdateError(domainError=" + this.domainError + ')';
            }
        }

        public /* synthetic */ AbstractC3391b(dx.b bVar, k kVar) {
            this(bVar);
        }

        /* JADX INFO: renamed from: a */
        public abstract dx.b getDomainError();

        private AbstractC3391b(dx.b bVar) {
            this.domainError = bVar;
        }
    }

    public b(ib4.c cVar) {
        this.genericErrorMapper = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ib4.c.b bVar) {
        if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            AbstractC3391b error = params.getError();
            if (error instanceof AbstractC3391b.General) {
                params.b().a();
            } else if (!(error instanceof AbstractC3391b.UpdateError)) {
                throw new p();
            }
        } else if (t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            params.c().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        return this.genericErrorMapper.b(new ib4.c.Params(params.getError().getDomainError(), false, new l() { // from class: nn3.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (ib4.c.b) obj);
            }
        }, 2, null));
    }
}
