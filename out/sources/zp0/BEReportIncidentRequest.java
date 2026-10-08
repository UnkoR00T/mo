package zp0;

import p071kotlin.Metadata;
import vy.Coordinates;
import xw.PhoneNumber;

/* JADX INFO: renamed from: zp0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b'\u0010+¨\u0006,"}, d2 = {"Lzp0/l;", "", "", "code", "Lfz/b$d;", "date", "Lvy/c;", "selectedLocation", "lastLocation", "Lzp0/i;", "attachments", "Liy/b0;", "description", "Lxw/h;", "phoneNumber", "<init>", "(Ljava/lang/String;Lfz/b$d;Lvy/c;Lvy/c;Lzp0/i;Liy/b0;Lxw/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lfz/b$d;", "c", "()Lfz/b$d;", "Lvy/c;", "g", "()Lvy/c;", "d", "e", "Lzp0/i;", "()Lzp0/i;", "f", "Liy/b0;", "()Liy/b0;", "Lxw/h;", "()Lxw/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEReportIncidentRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDateTime date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates selectedLocation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates lastLocation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportIncidentAttachments attachments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    public BEReportIncidentRequest(String str, fz.b.LocalDateTime localDateTime, Coordinates coordinates, Coordinates coordinates2, BEReportIncidentAttachments bEReportIncidentAttachments, iy.b0 b0Var, PhoneNumber phoneNumber) {
        this.code = str;
        this.date = localDateTime;
        this.selectedLocation = coordinates;
        this.lastLocation = coordinates2;
        this.attachments = bEReportIncidentAttachments;
        this.description = b0Var;
        this.phoneNumber = phoneNumber;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEReportIncidentAttachments getAttachments() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.LocalDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Coordinates getLastLocation() {
        return this.lastLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEReportIncidentRequest)) {
            return false;
        }
        BEReportIncidentRequest bEReportIncidentRequest = (BEReportIncidentRequest) other;
        return fr.t.c(this.code, bEReportIncidentRequest.code) && fr.t.c(this.date, bEReportIncidentRequest.date) && fr.t.c(this.selectedLocation, bEReportIncidentRequest.selectedLocation) && fr.t.c(this.lastLocation, bEReportIncidentRequest.lastLocation) && fr.t.c(this.attachments, bEReportIncidentRequest.attachments) && fr.t.c(this.description, bEReportIncidentRequest.description) && fr.t.c(this.phoneNumber, bEReportIncidentRequest.phoneNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Coordinates getSelectedLocation() {
        return this.selectedLocation;
    }

    public int hashCode() {
        int iHashCode = ((((((this.code.hashCode() * 31) + this.date.hashCode()) * 31) + this.selectedLocation.hashCode()) * 31) + this.lastLocation.hashCode()) * 31;
        BEReportIncidentAttachments bEReportIncidentAttachments = this.attachments;
        int iHashCode2 = (iHashCode + (bEReportIncidentAttachments == null ? 0 : bEReportIncidentAttachments.hashCode())) * 31;
        iy.b0 b0Var = this.description;
        return ((iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0)) * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "BEReportIncidentRequest(code=" + this.code + ", date=" + this.date + ", selectedLocation=" + this.selectedLocation + ", lastLocation=" + this.lastLocation + ", attachments=" + this.attachments + ", description=" + this.description + ", phoneNumber=" + this.phoneNumber + ")";
    }
}
