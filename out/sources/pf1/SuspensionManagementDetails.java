package pf1;

import fr.t;
import p071kotlin.Metadata;
import qf1.SuspensionPeriod;

/* JADX INFO: renamed from: pf1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpf1/f;", "", "Lqf1/c;", "changePeriod", "Lpf1/c;", "currentSuspensionPeriod", "<init>", "(Lqf1/c;Lpf1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqf1/c;", "()Lqf1/c;", "b", "Lpf1/c;", "()Lpf1/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspensionManagementDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SuspensionPeriod changePeriod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c currentSuspensionPeriod;

    public SuspensionManagementDetails(SuspensionPeriod suspensionPeriod, c cVar) {
        this.changePeriod = suspensionPeriod;
        this.currentSuspensionPeriod = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SuspensionPeriod getChangePeriod() {
        return this.changePeriod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getCurrentSuspensionPeriod() {
        return this.currentSuspensionPeriod;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuspensionManagementDetails)) {
            return false;
        }
        SuspensionManagementDetails suspensionManagementDetails = (SuspensionManagementDetails) other;
        return t.c(this.changePeriod, suspensionManagementDetails.changePeriod) && t.c(this.currentSuspensionPeriod, suspensionManagementDetails.currentSuspensionPeriod);
    }

    public int hashCode() {
        SuspensionPeriod suspensionPeriod = this.changePeriod;
        int iHashCode = (suspensionPeriod == null ? 0 : suspensionPeriod.hashCode()) * 31;
        c cVar = this.currentSuspensionPeriod;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "SuspensionManagementDetails(changePeriod=" + this.changePeriod + ", currentSuspensionPeriod=" + this.currentSuspensionPeriod + ')';
    }
}
