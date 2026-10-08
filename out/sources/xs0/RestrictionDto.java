package xs0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xs0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"Lxs0/j;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxs0/j$a;", "a", "Lxs0/j$a;", "e", "()Lxs0/j$a;", "status", "Lxs0/h;", "b", "Lxs0/h;", "()Lxs0/h;", "latestRestrictionCheck", "Lxs0/m;", "c", "Lxs0/m;", "()Lxs0/m;", "latestRestrictionStatusChange", "Lxs0/e;", "d", "Lxs0/e;", "()Lxs0/e;", "planedRestriction", "Lxs0/k;", "Lxs0/k;", "()Lxs0/k;", "restrictionLock", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final a status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("latestRestrictionCheck")
    private final RestrictionCheckSummaryDto latestRestrictionCheck;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("latestRestrictionStatusChange")
    private final RestrictionStatusChangeSummaryDto latestRestrictionStatusChange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("planedRestriction")
    private final PlanedRestrictionDto planedRestriction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("restrictionLock")
    private final RestrictionLockDto restrictionLock;

    /* JADX INFO: renamed from: xs0.j$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lxs0/j$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        RESTRICTED("RESTRICTED"),
        UNRESTRICTED("UNRESTRICTED"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f220795f = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RestrictionCheckSummaryDto getLatestRestrictionCheck() {
        return this.latestRestrictionCheck;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RestrictionStatusChangeSummaryDto getLatestRestrictionStatusChange() {
        return this.latestRestrictionStatusChange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PlanedRestrictionDto getPlanedRestriction() {
        return this.planedRestriction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RestrictionLockDto getRestrictionLock() {
        return this.restrictionLock;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionDto)) {
            return false;
        }
        RestrictionDto restrictionDto = (RestrictionDto) other;
        return this.status == restrictionDto.status && t.c(this.latestRestrictionCheck, restrictionDto.latestRestrictionCheck) && t.c(this.latestRestrictionStatusChange, restrictionDto.latestRestrictionStatusChange) && t.c(this.planedRestriction, restrictionDto.planedRestriction) && t.c(this.restrictionLock, restrictionDto.restrictionLock);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        RestrictionCheckSummaryDto restrictionCheckSummaryDto = this.latestRestrictionCheck;
        int iHashCode2 = (iHashCode + (restrictionCheckSummaryDto == null ? 0 : restrictionCheckSummaryDto.hashCode())) * 31;
        RestrictionStatusChangeSummaryDto restrictionStatusChangeSummaryDto = this.latestRestrictionStatusChange;
        int iHashCode3 = (iHashCode2 + (restrictionStatusChangeSummaryDto == null ? 0 : restrictionStatusChangeSummaryDto.hashCode())) * 31;
        PlanedRestrictionDto planedRestrictionDto = this.planedRestriction;
        int iHashCode4 = (iHashCode3 + (planedRestrictionDto == null ? 0 : planedRestrictionDto.hashCode())) * 31;
        RestrictionLockDto restrictionLockDto = this.restrictionLock;
        return iHashCode4 + (restrictionLockDto != null ? restrictionLockDto.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionDto(status=" + this.status + ", latestRestrictionCheck=" + this.latestRestrictionCheck + ", latestRestrictionStatusChange=" + this.latestRestrictionStatusChange + ", planedRestriction=" + this.planedRestriction + ", restrictionLock=" + this.restrictionLock + ')';
    }
}
