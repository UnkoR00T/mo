package tl0;

import al0.s0;
import fr.t;
import jl0.VerifyPassportChildApplicationAgreementRequest;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ltl0/h;", "", "Ltl0/h$a;", "", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends gz.b {

    /* JADX INFO: renamed from: tl0.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ltl0/h$a;", "Lgz/b$a;", "Lal0/s0;", "passportType", "Ljl0/z;", "request", "<init>", "(Lal0/s0;Ljl0/z;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/s0;", "()Lal0/s0;", "b", "Ljl0/z;", "()Ljl0/z;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 passportType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerifyPassportChildApplicationAgreementRequest request;

        public Params(s0 s0Var, VerifyPassportChildApplicationAgreementRequest verifyPassportChildApplicationAgreementRequest) {
            this.passportType = s0Var;
            this.request = verifyPassportChildApplicationAgreementRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final s0 getPassportType() {
            return this.passportType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final VerifyPassportChildApplicationAgreementRequest getRequest() {
            return this.request;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.passportType == params.passportType && t.c(this.request, params.request);
        }

        public int hashCode() {
            return (this.passportType.hashCode() * 31) + this.request.hashCode();
        }

        public String toString() {
            return "Params(passportType=" + this.passportType + ", request=" + this.request + ")";
        }
    }
}
