package th0;

import iy.b0;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: th0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006!"}, d2 = {"Lth0/n;", "", "Liy/b0;", "token", "", "validityInSeconds", "", "certificateRenewalRequired", "Ljava/time/OffsetDateTime;", "certificateExpiryDate", "<init>", "(Liy/b0;JZLjava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "J", "d", "()J", "Z", "()Z", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Jwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long validityInSeconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean certificateRenewalRequired;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime certificateExpiryDate;

    public Jwt(b0 b0Var, long j15, boolean z15, OffsetDateTime offsetDateTime) {
        this.token = b0Var;
        this.validityInSeconds = j15;
        this.certificateRenewalRequired = z15;
        this.certificateExpiryDate = offsetDateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getCertificateExpiryDate() {
        return this.certificateExpiryDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCertificateRenewalRequired() {
        return this.certificateRenewalRequired;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getValidityInSeconds() {
        return this.validityInSeconds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Jwt)) {
            return false;
        }
        Jwt jwt = (Jwt) other;
        return fr.t.c(this.token, jwt.token) && this.validityInSeconds == jwt.validityInSeconds && this.certificateRenewalRequired == jwt.certificateRenewalRequired && fr.t.c(this.certificateExpiryDate, jwt.certificateExpiryDate);
    }

    public int hashCode() {
        int iHashCode = ((((this.token.hashCode() * 31) + Long.hashCode(this.validityInSeconds)) * 31) + Boolean.hashCode(this.certificateRenewalRequired)) * 31;
        OffsetDateTime offsetDateTime = this.certificateExpiryDate;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public String toString() {
        return "Jwt(token=" + this.token + ", validityInSeconds=" + this.validityInSeconds + ", certificateRenewalRequired=" + this.certificateRenewalRequired + ", certificateExpiryDate=" + this.certificateExpiryDate + ")";
    }
}
