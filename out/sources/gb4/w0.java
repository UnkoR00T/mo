package gb4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgb4/w0;", "Lxw/f;", "Lgb4/w0$a;", "Ljb4/b;", "a", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w0 extends xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: gb4.w0$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgb4/w0$a;", "", "Ldx/b$j$b;", "integrityDomainError", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "<init>", "(Ldx/b$j$b;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b$j$b;", "getIntegrityDomainError", "()Ldx/b$j$b;", "b", "Ler/l;", "getResultAction", "()Ler/l;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b.j.InterfaceC1034b integrityDomainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ib4.c.b, oq.i0> resultAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dx.b.j.InterfaceC1034b interfaceC1034b, er.l<? super ib4.c.b, oq.i0> lVar) {
            this.integrityDomainError = interfaceC1034b;
            this.resultAction = lVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.integrityDomainError, params.integrityDomainError) && fr.t.c(this.resultAction, params.resultAction);
        }

        public int hashCode() {
            return (this.integrityDomainError.hashCode() * 31) + this.resultAction.hashCode();
        }

        public String toString() {
            return "Params(integrityDomainError=" + this.integrityDomainError + ", resultAction=" + this.resultAction + ')';
        }
    }
}
