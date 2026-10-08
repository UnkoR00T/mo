package hb1;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hb1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, d2 = {"Lhb1/e;", "", "", "fullName", "shortName", "Ljava/time/LocalDate;", "launchDateFrom", "numberOfEmployees", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyNameForm {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate launchDateFrom;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String numberOfEmployees;

    public CompanyNameForm(String str, String str2, LocalDate localDate, String str3) {
        this.fullName = str;
        this.shortName = str2;
        this.launchDateFrom = localDate;
        this.numberOfEmployees = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getLaunchDateFrom() {
        return this.launchDateFrom;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyNameForm)) {
            return false;
        }
        CompanyNameForm companyNameForm = (CompanyNameForm) other;
        return t.c(this.fullName, companyNameForm.fullName) && t.c(this.shortName, companyNameForm.shortName) && t.c(this.launchDateFrom, companyNameForm.launchDateFrom) && t.c(this.numberOfEmployees, companyNameForm.numberOfEmployees);
    }

    public int hashCode() {
        return (((((this.fullName.hashCode() * 31) + this.shortName.hashCode()) * 31) + this.launchDateFrom.hashCode()) * 31) + this.numberOfEmployees.hashCode();
    }

    public String toString() {
        return "CompanyNameForm(fullName=" + this.fullName + ", shortName=" + this.shortName + ", launchDateFrom=" + this.launchDateFrom + ", numberOfEmployees=" + this.numberOfEmployees + ')';
    }
}
