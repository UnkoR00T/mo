package y82;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ly82/b;", "Lxw/f;", "Ly82/b$a;", "Ljb4/b;", "a", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: y82.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Ly82/b$a;", "", "Lib4/c$a;", "params", "", "requestId", "<init>", "(Lib4/c$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lib4/c$a;", "b", "()Lib4/c$a;", "Ljava/lang/String;", "c", "Ldx/b;", "Ldx/b;", "()Ldx/b;", "domainError", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "d", "Ler/l;", "()Ler/l;", "resultAction", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ib4.c.Params params;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final dx.b domainError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final er.l<ib4.c.b, i0> resultAction;

        public Params(ib4.c.Params params, String str) {
            this.params = params;
            this.requestId = str;
            this.domainError = params.getDomainError();
            this.resultAction = params.c();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ib4.c.Params getParams() {
            return this.params;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        public final er.l<ib4.c.b, i0> d() {
            return this.resultAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.params, params.params) && t.c(this.requestId, params.requestId);
        }

        public int hashCode() {
            int iHashCode = this.params.hashCode() * 31;
            String str = this.requestId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(params=" + this.params + ", requestId=" + this.requestId + ')';
        }

        public /* synthetic */ Params(ib4.c.Params params, String str, int i15, fr.k kVar) {
            this(params, (i15 & 2) != 0 ? null : str);
        }
    }
}
