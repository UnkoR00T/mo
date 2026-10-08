package d64;

import fr.t;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d64.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Ld64/b;", "", "", "registrationNumber", "Ljava/util/Date;", "insuranceExpireDate", "technicalExaminationExpireDate", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/Date;", "()Ljava/util/Date;", "c", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registrationNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date insuranceExpireDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date technicalExaminationExpireDate;

    public VehicleData(String str, Date date, Date date2) {
        this.registrationNumber = str;
        this.insuranceExpireDate = date;
        this.technicalExaminationExpireDate = date2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Date getInsuranceExpireDate() {
        return this.insuranceExpireDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Date getTechnicalExaminationExpireDate() {
        return this.technicalExaminationExpireDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleData)) {
            return false;
        }
        VehicleData vehicleData = (VehicleData) other;
        return t.c(this.registrationNumber, vehicleData.registrationNumber) && t.c(this.insuranceExpireDate, vehicleData.insuranceExpireDate) && t.c(this.technicalExaminationExpireDate, vehicleData.technicalExaminationExpireDate);
    }

    public int hashCode() {
        String str = this.registrationNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.insuranceExpireDate;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.technicalExaminationExpireDate;
        return iHashCode2 + (date2 != null ? date2.hashCode() : 0);
    }

    public String toString() {
        return "VehicleData(registrationNumber=" + this.registrationNumber + ", insuranceExpireDate=" + this.insuranceExpireDate + ", technicalExaminationExpireDate=" + this.technicalExaminationExpireDate + ')';
    }
}
