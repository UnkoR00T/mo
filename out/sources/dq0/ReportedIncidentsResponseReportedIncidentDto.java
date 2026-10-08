package dq0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.i0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\f\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b\u0011\u0010\u0004¨\u0006+"}, d2 = {"Ldq0/i0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "id", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "d", "()Ljava/time/OffsetDateTime;", "incidentDate", "Ldq0/t;", "Ldq0/t;", "e", "()Ldq0/t;", "location", "f", "reportedDate", "Ldq0/g0;", "Ldq0/g0;", "g", "()Ldq0/g0;", "state", "Ldq0/b0;", "Ldq0/b0;", "h", "()Ldq0/b0;", "type", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "attachmentsNumber", "description", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportedIncidentsResponseReportedIncidentDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("incidentDate")
    private final OffsetDateTime incidentDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("location")
    private final ReportIncidentLocationDto location;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reportedDate")
    private final OffsetDateTime reportedDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("state")
    private final g0 state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final ReportIncidentTypeDto type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachmentsNumber")
    private final Integer attachmentsNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAttachmentsNumber() {
        return this.attachmentsNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getIncidentDate() {
        return this.incidentDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ReportIncidentLocationDto getLocation() {
        return this.location;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportedIncidentsResponseReportedIncidentDto)) {
            return false;
        }
        ReportedIncidentsResponseReportedIncidentDto reportedIncidentsResponseReportedIncidentDto = (ReportedIncidentsResponseReportedIncidentDto) other;
        return fr.t.c(this.id, reportedIncidentsResponseReportedIncidentDto.id) && fr.t.c(this.incidentDate, reportedIncidentsResponseReportedIncidentDto.incidentDate) && fr.t.c(this.location, reportedIncidentsResponseReportedIncidentDto.location) && fr.t.c(this.reportedDate, reportedIncidentsResponseReportedIncidentDto.reportedDate) && this.state == reportedIncidentsResponseReportedIncidentDto.state && fr.t.c(this.type, reportedIncidentsResponseReportedIncidentDto.type) && fr.t.c(this.attachmentsNumber, reportedIncidentsResponseReportedIncidentDto.attachmentsNumber) && fr.t.c(this.description, reportedIncidentsResponseReportedIncidentDto.description);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getReportedDate() {
        return this.reportedDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g0 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ReportIncidentTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.incidentDate.hashCode()) * 31) + this.location.hashCode()) * 31) + this.reportedDate.hashCode()) * 31) + this.state.hashCode()) * 31) + this.type.hashCode()) * 31;
        Integer num = this.attachmentsNumber;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReportedIncidentsResponseReportedIncidentDto(id=" + this.id + ", incidentDate=" + this.incidentDate + ", location=" + this.location + ", reportedDate=" + this.reportedDate + ", state=" + this.state + ", type=" + this.type + ", attachmentsNumber=" + this.attachmentsNumber + ", description=" + this.description + ')';
    }
}
