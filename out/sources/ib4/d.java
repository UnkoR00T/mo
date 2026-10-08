package ib4;

import dx.i;
import er.l;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lib4/d;", "Lxw/f;", "Lib4/d$a;", "Ldx/i;", "Loq/i0;", "Ljb4/b;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends f<Params, i<? extends i0, ? extends jb4.b>> {

    /* JADX INFO: renamed from: ib4.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lib4/d$a;", "", "Ldx/b$g$d;", "domainError", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "", "genericRetryAllowed", "<init>", "(Ldx/b$g$d;Ler/l;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b$g$d;", "()Ldx/b$g$d;", "b", "Ler/l;", "c", "()Ler/l;", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b.g.Http<?> domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<c.b, i0> resultAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean genericRetryAllowed;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dx.b.g.Http<?> http, l<? super c.b, i0> lVar, boolean z15) {
            this.domainError = http;
            this.resultAction = lVar;
            this.genericRetryAllowed = z15;
        }

        public final dx.b.g.Http<?> a() {
            return this.domainError;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getGenericRetryAllowed() {
            return this.genericRetryAllowed;
        }

        public final l<c.b, i0> c() {
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
            return t.c(this.domainError, params.domainError) && t.c(this.resultAction, params.resultAction) && this.genericRetryAllowed == params.genericRetryAllowed;
        }

        public int hashCode() {
            return (((this.domainError.hashCode() * 31) + this.resultAction.hashCode()) * 31) + Boolean.hashCode(this.genericRetryAllowed);
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", resultAction=" + this.resultAction + ", genericRetryAllowed=" + this.genericRetryAllowed + ")";
        }
    }
}
