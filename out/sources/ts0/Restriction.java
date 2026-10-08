package ts0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ts0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u0018\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, d2 = {"Lts0/f;", "", "Lts0/l;", "status", "Lts0/k;", "restrictionLock", "Lts0/e;", "plannedRestriction", "Lts0/i;", "latestRestrictionCheck", "Lts0/n;", "latestRestrictionStatusChange", "<init>", "(Lts0/l;Lts0/k;Lts0/e;Lts0/i;Lts0/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lts0/l;", "e", "()Lts0/l;", "b", "Lts0/k;", "d", "()Lts0/k;", "c", "Lts0/e;", "()Lts0/e;", "Lts0/i;", "()Lts0/i;", "Lts0/n;", "()Lts0/n;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Restriction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RestrictionLock restrictionLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlanedRestriction plannedRestriction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final RestrictionCheckSummary latestRestrictionCheck;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final RestrictionStatusChangeSummary latestRestrictionStatusChange;

    public Restriction(l lVar, RestrictionLock restrictionLock, PlanedRestriction planedRestriction, RestrictionCheckSummary restrictionCheckSummary, RestrictionStatusChangeSummary restrictionStatusChangeSummary) {
        this.status = lVar;
        this.restrictionLock = restrictionLock;
        this.plannedRestriction = planedRestriction;
        this.latestRestrictionCheck = restrictionCheckSummary;
        this.latestRestrictionStatusChange = restrictionStatusChangeSummary;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RestrictionCheckSummary getLatestRestrictionCheck() {
        return this.latestRestrictionCheck;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RestrictionStatusChangeSummary getLatestRestrictionStatusChange() {
        return this.latestRestrictionStatusChange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PlanedRestriction getPlannedRestriction() {
        return this.plannedRestriction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RestrictionLock getRestrictionLock() {
        return this.restrictionLock;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Restriction)) {
            return false;
        }
        Restriction restriction = (Restriction) other;
        return this.status == restriction.status && fr.t.c(this.restrictionLock, restriction.restrictionLock) && fr.t.c(this.plannedRestriction, restriction.plannedRestriction) && fr.t.c(this.latestRestrictionCheck, restriction.latestRestrictionCheck) && fr.t.c(this.latestRestrictionStatusChange, restriction.latestRestrictionStatusChange);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        RestrictionLock restrictionLock = this.restrictionLock;
        int iHashCode2 = (iHashCode + (restrictionLock == null ? 0 : restrictionLock.hashCode())) * 31;
        PlanedRestriction planedRestriction = this.plannedRestriction;
        int iHashCode3 = (iHashCode2 + (planedRestriction == null ? 0 : planedRestriction.hashCode())) * 31;
        RestrictionCheckSummary restrictionCheckSummary = this.latestRestrictionCheck;
        int iHashCode4 = (iHashCode3 + (restrictionCheckSummary == null ? 0 : restrictionCheckSummary.hashCode())) * 31;
        RestrictionStatusChangeSummary restrictionStatusChangeSummary = this.latestRestrictionStatusChange;
        return iHashCode4 + (restrictionStatusChangeSummary != null ? restrictionStatusChangeSummary.hashCode() : 0);
    }

    public String toString() {
        return "Restriction(status=" + this.status + ", restrictionLock=" + this.restrictionLock + ", plannedRestriction=" + this.plannedRestriction + ", latestRestrictionCheck=" + this.latestRestrictionCheck + ", latestRestrictionStatusChange=" + this.latestRestrictionStatusChange + ")";
    }
}
