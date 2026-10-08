package zd2;

import fr.t;
import iy.b0;
import java.util.List;
import oq.r;
import p071kotlin.Metadata;
import vy.Coordinates;
import xw.PhoneNumber;

/* JADX INFO: renamed from: zd2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b \u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b%\u0010,R)\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b\u001d\u0010.¨\u0006/"}, d2 = {"Lzd2/c;", "", "", "reportCode", "reportName", "Lfz/b$d;", "incidentDate", "Lvy/c;", "selectedIncidentLocalization", "Liy/b0;", "description", "Lxw/h;", "phoneNumber", "", "Loq/r;", "Lzd2/d;", "Lzd2/b;", "addedPhotos", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfz/b$d;Lvy/c;Liy/b0;Lxw/h;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "f", "c", "Lfz/b$d;", "()Lfz/b$d;", "d", "Lvy/c;", "g", "()Lvy/c;", "Liy/b0;", "()Liy/b0;", "Lxw/h;", "()Lxw/h;", "Ljava/util/List;", "()Ljava/util/List;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewIncidentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reportCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reportName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDateTime incidentDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates selectedIncidentLocalization;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 description;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<r<Photo, ImageAttachments>> addedPhotos;

    public NewIncidentData(String str, String str2, fz.b.LocalDateTime localDateTime, Coordinates coordinates, b0 b0Var, PhoneNumber phoneNumber, List<r<Photo, ImageAttachments>> list) {
        this.reportCode = str;
        this.reportName = str2;
        this.incidentDate = localDateTime;
        this.selectedIncidentLocalization = coordinates;
        this.description = b0Var;
        this.phoneNumber = phoneNumber;
        this.addedPhotos = list;
    }

    public final List<r<Photo, ImageAttachments>> a() {
        return this.addedPhotos;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.LocalDateTime getIncidentDate() {
        return this.incidentDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getReportCode() {
        return this.reportCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewIncidentData)) {
            return false;
        }
        NewIncidentData newIncidentData = (NewIncidentData) other;
        return t.c(this.reportCode, newIncidentData.reportCode) && t.c(this.reportName, newIncidentData.reportName) && t.c(this.incidentDate, newIncidentData.incidentDate) && t.c(this.selectedIncidentLocalization, newIncidentData.selectedIncidentLocalization) && t.c(this.description, newIncidentData.description) && t.c(this.phoneNumber, newIncidentData.phoneNumber) && t.c(this.addedPhotos, newIncidentData.addedPhotos);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReportName() {
        return this.reportName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Coordinates getSelectedIncidentLocalization() {
        return this.selectedIncidentLocalization;
    }

    public int hashCode() {
        int iHashCode = ((((((this.reportCode.hashCode() * 31) + this.reportName.hashCode()) * 31) + this.incidentDate.hashCode()) * 31) + this.selectedIncidentLocalization.hashCode()) * 31;
        b0 b0Var = this.description;
        return ((((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.phoneNumber.hashCode()) * 31) + this.addedPhotos.hashCode();
    }

    public String toString() {
        return "NewIncidentData(reportCode=" + this.reportCode + ", reportName=" + this.reportName + ", incidentDate=" + this.incidentDate + ", selectedIncidentLocalization=" + this.selectedIncidentLocalization + ", description=" + this.description + ", phoneNumber=" + this.phoneNumber + ", addedPhotos=" + this.addedPhotos + ')';
    }
}
