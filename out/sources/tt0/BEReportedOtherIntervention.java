package tt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltt0/p;", "", "", "reportedAuthority", "relatedCaseNumber", "Lfz/b$c;", "reportedToAuthorityDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfz/b$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lfz/b$c;", "()Lfz/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportedOtherIntervention {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reportedAuthority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String relatedCaseNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate reportedToAuthorityDate;

    public BEReportedOtherIntervention(String str, String str2, fz.b.LocalDate localDate) {
        this.reportedAuthority = str;
        this.relatedCaseNumber = str2;
        this.reportedToAuthorityDate = localDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRelatedCaseNumber() {
        return this.relatedCaseNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReportedAuthority() {
        return this.reportedAuthority;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.LocalDate getReportedToAuthorityDate() {
        return this.reportedToAuthorityDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportedOtherIntervention)) {
            return false;
        }
        BEReportedOtherIntervention bEReportedOtherIntervention = (BEReportedOtherIntervention) other;
        return fr.t.c(this.reportedAuthority, bEReportedOtherIntervention.reportedAuthority) && fr.t.c(this.relatedCaseNumber, bEReportedOtherIntervention.relatedCaseNumber) && fr.t.c(this.reportedToAuthorityDate, bEReportedOtherIntervention.reportedToAuthorityDate);
    }

    public int hashCode() {
        int iHashCode = this.reportedAuthority.hashCode() * 31;
        String str = this.relatedCaseNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        fz.b.LocalDate localDate = this.reportedToAuthorityDate;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }

    public String toString() {
        return "BEReportedOtherIntervention(reportedAuthority=" + this.reportedAuthority + ", relatedCaseNumber=" + this.relatedCaseNumber + ", reportedToAuthorityDate=" + this.reportedToAuthorityDate + ")";
    }
}
