package k23;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k23.h, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk23/h;", "", "", "institutionName", "reportNumber", "Lfz/b$c;", "reportDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfz/b$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lfz/b$c;", "()Lfz/b$c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtherReportData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f107689d = fz.b.LocalDate.f68860b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reportNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate reportDate;

    public OtherReportData(String str, String str2, fz.b.LocalDate localDate) {
        this.institutionName = str;
        this.reportNumber = str2;
        this.reportDate = localDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDate getReportDate() {
        return this.reportDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReportNumber() {
        return this.reportNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherReportData)) {
            return false;
        }
        OtherReportData otherReportData = (OtherReportData) other;
        return t.c(this.institutionName, otherReportData.institutionName) && t.c(this.reportNumber, otherReportData.reportNumber) && t.c(this.reportDate, otherReportData.reportDate);
    }

    public int hashCode() {
        int iHashCode = this.institutionName.hashCode() * 31;
        String str = this.reportNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        fz.b.LocalDate localDate = this.reportDate;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }

    public String toString() {
        return "OtherReportData(institutionName=" + this.institutionName + ", reportNumber=" + this.reportNumber + ", reportDate=" + this.reportDate + ')';
    }
}
