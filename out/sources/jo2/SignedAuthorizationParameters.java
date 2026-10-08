package jo2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo2.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Ljo2/e;", "", "Ljo2/c;", "action", "", "authorizationId", "<init>", "(Ljo2/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljo2/c;", "getAction", "()Ljo2/c;", "b", "Ljava/lang/String;", "getAuthorizationId", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignedAuthorizationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("action")
    private final c action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("authorizationId")
    private final String authorizationId;

    public SignedAuthorizationParameters(c cVar, String str) {
        this.action = cVar;
        this.authorizationId = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignedAuthorizationParameters)) {
            return false;
        }
        SignedAuthorizationParameters signedAuthorizationParameters = (SignedAuthorizationParameters) other;
        return this.action == signedAuthorizationParameters.action && t.c(this.authorizationId, signedAuthorizationParameters.authorizationId);
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        String str = this.authorizationId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SignedAuthorizationParameters(action=" + this.action + ", authorizationId=" + this.authorizationId + ')';
    }
}
