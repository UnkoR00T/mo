package xy;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xy.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lxy/a;", "", "Liy/b0;", "token", "", "validityInSeconds", "timestamp", "<init>", "(Liy/b0;JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "J", "c", "()J", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccessToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long validityInSeconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    public AccessToken(b0 b0Var, long j15, long j16) {
        this.token = b0Var;
        this.validityInSeconds = j15;
        this.timestamp = j16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getValidityInSeconds() {
        return this.validityInSeconds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        return t.c(this.token, accessToken.token) && this.validityInSeconds == accessToken.validityInSeconds && this.timestamp == accessToken.timestamp;
    }

    public int hashCode() {
        return (((this.token.hashCode() * 31) + Long.hashCode(this.validityInSeconds)) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "AccessToken(token=" + this.token + ", validityInSeconds=" + this.validityInSeconds + ", timestamp=" + this.timestamp + ")";
    }
}
