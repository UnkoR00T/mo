package qv3;

import dx.b;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lqv3/a;", "", "a", "b", "Lqv3/a$a;", "Lqv3/a$b;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: qv3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lqv3/a$a;", "Lqv3/a;", "Ldx/b;", "error", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "retryAction", "<init>", "(Ldx/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "b", "()Ldx/b;", "Ler/a;", "()Ler/a;", "c", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Domain implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> retryAction;

        public Domain(b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.error = bVar;
            this.closeAction = aVar;
            this.retryAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getError() {
            return this.error;
        }

        public final er.a<i0> c() {
            return this.retryAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Domain)) {
                return false;
            }
            Domain domain = (Domain) other;
            return t.c(this.error, domain.error) && t.c(this.closeAction, domain.closeAction) && t.c(this.retryAction, domain.retryAction);
        }

        public int hashCode() {
            return (((this.error.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.retryAction.hashCode();
        }

        public String toString() {
            return "Domain(error=" + this.error + ", closeAction=" + this.closeAction + ", retryAction=" + this.retryAction + ')';
        }
    }

    /* JADX INFO: renamed from: qv3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lqv3/a$b;", "Lqv3/a;", "Lkotlin/Function0;", "Loq/i0;", "openWeb", "closeAction", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "b", "()Ler/a;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MissingEdorAddress implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> openWeb;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        public MissingEdorAddress(er.a<i0> aVar, er.a<i0> aVar2) {
            this.openWeb = aVar;
            this.closeAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.openWeb;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MissingEdorAddress)) {
                return false;
            }
            MissingEdorAddress missingEdorAddress = (MissingEdorAddress) other;
            return t.c(this.openWeb, missingEdorAddress.openWeb) && t.c(this.closeAction, missingEdorAddress.closeAction);
        }

        public int hashCode() {
            return (this.openWeb.hashCode() * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "MissingEdorAddress(openWeb=" + this.openWeb + ", closeAction=" + this.closeAction + ')';
        }
    }
}
