package xt0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xt0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lxt0/o;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "reportedAuthority", "relatedCaseNumber", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "reportedToAuthorityDate", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetReportedProductInterventionResponseOtherInterventionDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reportedAuthority")
    private final String reportedAuthority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("relatedCaseNumber")
    private final String relatedCaseNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reportedToAuthorityDate")
    private final LocalDate reportedToAuthorityDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRelatedCaseNumber() {
        return this.relatedCaseNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReportedAuthority() {
        return this.reportedAuthority;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getReportedToAuthorityDate() {
        return this.reportedToAuthorityDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetReportedProductInterventionResponseOtherInterventionDto)) {
            return false;
        }
        GetReportedProductInterventionResponseOtherInterventionDto getReportedProductInterventionResponseOtherInterventionDto = (GetReportedProductInterventionResponseOtherInterventionDto) other;
        return fr.t.c(this.reportedAuthority, getReportedProductInterventionResponseOtherInterventionDto.reportedAuthority) && fr.t.c(this.relatedCaseNumber, getReportedProductInterventionResponseOtherInterventionDto.relatedCaseNumber) && fr.t.c(this.reportedToAuthorityDate, getReportedProductInterventionResponseOtherInterventionDto.reportedToAuthorityDate);
    }

    public int hashCode() {
        int iHashCode = this.reportedAuthority.hashCode() * 31;
        String str = this.relatedCaseNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.reportedToAuthorityDate;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }

    public String toString() {
        return "GetReportedProductInterventionResponseOtherInterventionDto(reportedAuthority=" + this.reportedAuthority + ", relatedCaseNumber=" + this.relatedCaseNumber + ", reportedToAuthorityDate=" + this.reportedToAuthorityDate + ')';
    }
}
