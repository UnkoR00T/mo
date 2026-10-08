package zp0;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: zp0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b\u001a\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b\"\u0010,¨\u0006-"}, d2 = {"Lzp0/r;", "", "Lfz/b$f;", "incidentDate", "", "description", "id", "reportedDate", "Lzp0/p;", "state", "Lzp0/m;", "type", "", "attachmentsNumber", "Lvy/c;", "location", "<init>", "(Lfz/b$f;Ljava/lang/String;Ljava/lang/String;Lfz/b$f;Lzp0/p;Lzp0/m;Ljava/lang/Integer;Lvy/c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$f;", "d", "()Lfz/b$f;", "b", "Ljava/lang/String;", "c", "f", "e", "Lzp0/p;", "g", "()Lzp0/p;", "Lzp0/m;", "h", "()Lzp0/m;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lvy/c;", "()Lvy/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportedIncidentsReportedIncident {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime incidentDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime reportedDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final p state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportIncidentType type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer attachmentsNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates location;

    public BEReportedIncidentsReportedIncident(fz.b.OffsetDateTime offsetDateTime, String str, String str2, fz.b.OffsetDateTime offsetDateTime2, p pVar, BEReportIncidentType bEReportIncidentType, Integer num, Coordinates coordinates) {
        this.incidentDate = offsetDateTime;
        this.description = str;
        this.id = str2;
        this.reportedDate = offsetDateTime2;
        this.state = pVar;
        this.type = bEReportIncidentType;
        this.attachmentsNumber = num;
        this.location = coordinates;
    }

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
    public final fz.b.OffsetDateTime getIncidentDate() {
        return this.incidentDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Coordinates getLocation() {
        return this.location;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportedIncidentsReportedIncident)) {
            return false;
        }
        BEReportedIncidentsReportedIncident bEReportedIncidentsReportedIncident = (BEReportedIncidentsReportedIncident) other;
        return fr.t.c(this.incidentDate, bEReportedIncidentsReportedIncident.incidentDate) && fr.t.c(this.description, bEReportedIncidentsReportedIncident.description) && fr.t.c(this.id, bEReportedIncidentsReportedIncident.id) && fr.t.c(this.reportedDate, bEReportedIncidentsReportedIncident.reportedDate) && this.state == bEReportedIncidentsReportedIncident.state && fr.t.c(this.type, bEReportedIncidentsReportedIncident.type) && fr.t.c(this.attachmentsNumber, bEReportedIncidentsReportedIncident.attachmentsNumber) && fr.t.c(this.location, bEReportedIncidentsReportedIncident.location);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final fz.b.OffsetDateTime getReportedDate() {
        return this.reportedDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final p getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final BEReportIncidentType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.incidentDate.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.id.hashCode()) * 31) + this.reportedDate.hashCode()) * 31) + this.state.hashCode()) * 31) + this.type.hashCode()) * 31;
        Integer num = this.attachmentsNumber;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.location.hashCode();
    }

    public String toString() {
        return "BEReportedIncidentsReportedIncident(incidentDate=" + this.incidentDate + ", description=" + this.description + ", id=" + this.id + ", reportedDate=" + this.reportedDate + ", state=" + this.state + ", type=" + this.type + ", attachmentsNumber=" + this.attachmentsNumber + ", location=" + this.location + ")";
    }
}
