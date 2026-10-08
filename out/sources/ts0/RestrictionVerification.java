package ts0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ts0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lts0/p;", "", "Lts0/l;", "status", "Ljava/time/OffsetDateTime;", "statusStartDate", "<init>", "(Lts0/l;Ljava/time/OffsetDateTime;)V", "a", "()Lts0/l;", "b", "()Ljava/time/OffsetDateTime;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lts0/l;", "c", "Ljava/time/OffsetDateTime;", "getStatusStartDate", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionVerification {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime statusStartDate;

    public RestrictionVerification(l lVar, OffsetDateTime offsetDateTime) {
        this.status = lVar;
        this.statusStartDate = offsetDateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getStatusStartDate() {
        return this.statusStartDate;
    }

    public final l c() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionVerification)) {
            return false;
        }
        RestrictionVerification restrictionVerification = (RestrictionVerification) other;
        return this.status == restrictionVerification.status && fr.t.c(this.statusStartDate, restrictionVerification.statusStartDate);
    }

    public int hashCode() {
        l lVar = this.status;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.statusStartDate;
        return iHashCode + (offsetDateTime != null ? offsetDateTime.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionVerification(status=" + this.status + ", statusStartDate=" + this.statusStartDate + ")";
    }
}
