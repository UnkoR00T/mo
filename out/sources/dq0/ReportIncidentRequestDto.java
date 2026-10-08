package dq0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.a0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u0011¨\u00060"}, d2 = {"Ldq0/a0;", "", "", "code", "Ljava/time/OffsetDateTime;", "date", "Ldq0/t;", "location", "Ldq0/u;", "phoneNumber", "reporterLocation", "Ldq0/v;", "attachments", "description", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ldq0/t;Ldq0/u;Ldq0/t;Ldq0/v;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "Ljava/time/OffsetDateTime;", "getDate", "()Ljava/time/OffsetDateTime;", "c", "Ldq0/t;", "getLocation", "()Ldq0/t;", "d", "Ldq0/u;", "getPhoneNumber", "()Ldq0/u;", "e", "getReporterLocation", "f", "Ldq0/v;", "getAttachments", "()Ldq0/v;", "g", "getDescription", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportIncidentRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("code")
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("date")
    private final OffsetDateTime date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("location")
    private final ReportIncidentLocationDto location;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phoneNumber")
    private final ReportIncidentPhoneNumberDto phoneNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reporterLocation")
    private final ReportIncidentLocationDto reporterLocation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachments")
    private final ReportIncidentRequestAttachments attachments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    public ReportIncidentRequestDto(String str, OffsetDateTime offsetDateTime, ReportIncidentLocationDto reportIncidentLocationDto, ReportIncidentPhoneNumberDto reportIncidentPhoneNumberDto, ReportIncidentLocationDto reportIncidentLocationDto2, ReportIncidentRequestAttachments reportIncidentRequestAttachments, String str2) {
        this.code = str;
        this.date = offsetDateTime;
        this.location = reportIncidentLocationDto;
        this.phoneNumber = reportIncidentPhoneNumberDto;
        this.reporterLocation = reportIncidentLocationDto2;
        this.attachments = reportIncidentRequestAttachments;
        this.description = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportIncidentRequestDto)) {
            return false;
        }
        ReportIncidentRequestDto reportIncidentRequestDto = (ReportIncidentRequestDto) other;
        return fr.t.c(this.code, reportIncidentRequestDto.code) && fr.t.c(this.date, reportIncidentRequestDto.date) && fr.t.c(this.location, reportIncidentRequestDto.location) && fr.t.c(this.phoneNumber, reportIncidentRequestDto.phoneNumber) && fr.t.c(this.reporterLocation, reportIncidentRequestDto.reporterLocation) && fr.t.c(this.attachments, reportIncidentRequestDto.attachments) && fr.t.c(this.description, reportIncidentRequestDto.description);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.code.hashCode() * 31) + this.date.hashCode()) * 31) + this.location.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.reporterLocation.hashCode()) * 31;
        ReportIncidentRequestAttachments reportIncidentRequestAttachments = this.attachments;
        int iHashCode2 = (iHashCode + (reportIncidentRequestAttachments == null ? 0 : reportIncidentRequestAttachments.hashCode())) * 31;
        String str = this.description;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReportIncidentRequestDto(code=" + this.code + ", date=" + this.date + ", location=" + this.location + ", phoneNumber=" + this.phoneNumber + ", reporterLocation=" + this.reporterLocation + ", attachments=" + this.attachments + ", description=" + this.description + ')';
    }
}
