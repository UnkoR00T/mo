package ts0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ts0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lts0/r;", "", "", "Lts0/p;", "restrictionVerifications", "Ljava/time/OffsetDateTime;", "verificationDate", "Lts0/q;", "verificationStatus", "<init>", "(Ljava/util/List;Ljava/time/OffsetDateTime;Lts0/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "c", "Lts0/q;", "()Lts0/q;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionsVerificationList {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<RestrictionVerification> restrictionVerifications;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime verificationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q verificationStatus;

    public RestrictionsVerificationList(List<RestrictionVerification> list, OffsetDateTime offsetDateTime, q qVar) {
        this.restrictionVerifications = list;
        this.verificationDate = offsetDateTime;
        this.verificationStatus = qVar;
    }

    public final List<RestrictionVerification> a() {
        return this.restrictionVerifications;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getVerificationDate() {
        return this.verificationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getVerificationStatus() {
        return this.verificationStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionsVerificationList)) {
            return false;
        }
        RestrictionsVerificationList restrictionsVerificationList = (RestrictionsVerificationList) other;
        return fr.t.c(this.restrictionVerifications, restrictionsVerificationList.restrictionVerifications) && fr.t.c(this.verificationDate, restrictionsVerificationList.verificationDate) && this.verificationStatus == restrictionsVerificationList.verificationStatus;
    }

    public int hashCode() {
        int iHashCode = this.restrictionVerifications.hashCode() * 31;
        OffsetDateTime offsetDateTime = this.verificationDate;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        q qVar = this.verificationStatus;
        return iHashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionsVerificationList(restrictionVerifications=" + this.restrictionVerifications + ", verificationDate=" + this.verificationDate + ", verificationStatus=" + this.verificationStatus + ")";
    }
}
