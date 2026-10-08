package nj0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004R \u0010\u001f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0010R \u0010#\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u000e\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\u0010R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b \u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b\r\u0010\u0004¨\u0006("}, d2 = {"Lnj0/e;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "b", "()Ljava/time/OffsetDateTime;", "fullVisitDate", "c", "fullVisitEndDate", "", "J", "d", "()J", "id", "Ljava/lang/String;", "e", "topicDescription", "getVisitDate", "getVisitDate$annotations", "()V", "visitDate", "f", "getVisitEndDate", "getVisitEndDate$annotations", "visitEndDate", "g", "visitUrl", "h", "departmentDescription", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookedZusEVisitSummaryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullVisitDate")
    private final OffsetDateTime fullVisitDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullVisitEndDate")
    private final OffsetDateTime fullVisitEndDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final long id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("topicDescription")
    private final String topicDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("visitDate")
    private final OffsetDateTime visitDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("visitEndDate")
    private final OffsetDateTime visitEndDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("visitUrl")
    private final String visitUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("departmentDescription")
    private final String departmentDescription;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDepartmentDescription() {
        return this.departmentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getFullVisitDate() {
        return this.fullVisitDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getFullVisitEndDate() {
        return this.fullVisitEndDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTopicDescription() {
        return this.topicDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookedZusEVisitSummaryDto)) {
            return false;
        }
        BookedZusEVisitSummaryDto bookedZusEVisitSummaryDto = (BookedZusEVisitSummaryDto) other;
        return fr.t.c(this.fullVisitDate, bookedZusEVisitSummaryDto.fullVisitDate) && fr.t.c(this.fullVisitEndDate, bookedZusEVisitSummaryDto.fullVisitEndDate) && this.id == bookedZusEVisitSummaryDto.id && fr.t.c(this.topicDescription, bookedZusEVisitSummaryDto.topicDescription) && fr.t.c(this.visitDate, bookedZusEVisitSummaryDto.visitDate) && fr.t.c(this.visitEndDate, bookedZusEVisitSummaryDto.visitEndDate) && fr.t.c(this.visitUrl, bookedZusEVisitSummaryDto.visitUrl) && fr.t.c(this.departmentDescription, bookedZusEVisitSummaryDto.departmentDescription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getVisitUrl() {
        return this.visitUrl;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.fullVisitDate.hashCode() * 31) + this.fullVisitEndDate.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.topicDescription.hashCode()) * 31) + this.visitDate.hashCode()) * 31) + this.visitEndDate.hashCode()) * 31) + this.visitUrl.hashCode()) * 31;
        String str = this.departmentDescription;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BookedZusEVisitSummaryDto(fullVisitDate=" + this.fullVisitDate + ", fullVisitEndDate=" + this.fullVisitEndDate + ", id=" + this.id + ", topicDescription=" + this.topicDescription + ", visitDate=" + this.visitDate + ", visitEndDate=" + this.visitEndDate + ", visitUrl=" + this.visitUrl + ", departmentDescription=" + this.departmentDescription + ')';
    }
}
