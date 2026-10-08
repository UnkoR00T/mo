package d64;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d64.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ld64/a;", "", "Lfz/b$c;", "drivingLicenceExpirationDate", "temporaryDrivingLicenceExpirationDate", "<init>", "(Lfz/b$c;Lfz/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$c;", "()Lfz/b$c;", "b", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicencesExpirationDate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate drivingLicenceExpirationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate temporaryDrivingLicenceExpirationDate;

    public DrivingLicencesExpirationDate(fz.b.LocalDate localDate, fz.b.LocalDate localDate2) {
        this.drivingLicenceExpirationDate = localDate;
        this.temporaryDrivingLicenceExpirationDate = localDate2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.LocalDate getDrivingLicenceExpirationDate() {
        return this.drivingLicenceExpirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDate getTemporaryDrivingLicenceExpirationDate() {
        return this.temporaryDrivingLicenceExpirationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicencesExpirationDate)) {
            return false;
        }
        DrivingLicencesExpirationDate drivingLicencesExpirationDate = (DrivingLicencesExpirationDate) other;
        return t.c(this.drivingLicenceExpirationDate, drivingLicencesExpirationDate.drivingLicenceExpirationDate) && t.c(this.temporaryDrivingLicenceExpirationDate, drivingLicencesExpirationDate.temporaryDrivingLicenceExpirationDate);
    }

    public int hashCode() {
        fz.b.LocalDate localDate = this.drivingLicenceExpirationDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        fz.b.LocalDate localDate2 = this.temporaryDrivingLicenceExpirationDate;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public String toString() {
        return "DrivingLicencesExpirationDate(drivingLicenceExpirationDate=" + this.drivingLicenceExpirationDate + ", temporaryDrivingLicenceExpirationDate=" + this.temporaryDrivingLicenceExpirationDate + ')';
    }
}
