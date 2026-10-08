package bn3;

import fr.t;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bn3.k, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b \u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b\u001f\u0010\u0019¨\u0006$"}, d2 = {"Lbn3/k;", "", "Ljava/util/Date;", "insuranceExpireDate", "", "validInsuranceDays", "", "insuranceInstitutionName", "insuranceId", "insuranceType", "insuranceSignDay", "insurancePeriodStart", "insurancePeriodEnd", "<init>", "(Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "()Ljava/util/Date;", "b", "I", "getValidInsuranceDays", "c", "Ljava/lang/String;", "d", "e", "g", "f", "h", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleInsuranceModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date insuranceExpireDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int validInsuranceDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String insuranceInstitutionName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String insuranceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String insuranceType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date insuranceSignDay;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date insurancePeriodStart;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date insurancePeriodEnd;

    public VehicleInsuranceModel(Date date, int i15, String str, String str2, String str3, Date date2, Date date3, Date date4) {
        this.insuranceExpireDate = date;
        this.validInsuranceDays = i15;
        this.insuranceInstitutionName = str;
        this.insuranceId = str2;
        this.insuranceType = str3;
        this.insuranceSignDay = date2;
        this.insurancePeriodStart = date3;
        this.insurancePeriodEnd = date4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Date getInsuranceExpireDate() {
        return this.insuranceExpireDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInsuranceId() {
        return this.insuranceId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInsuranceInstitutionName() {
        return this.insuranceInstitutionName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Date getInsurancePeriodEnd() {
        return this.insurancePeriodEnd;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Date getInsurancePeriodStart() {
        return this.insurancePeriodStart;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleInsuranceModel)) {
            return false;
        }
        VehicleInsuranceModel vehicleInsuranceModel = (VehicleInsuranceModel) other;
        return t.c(this.insuranceExpireDate, vehicleInsuranceModel.insuranceExpireDate) && this.validInsuranceDays == vehicleInsuranceModel.validInsuranceDays && t.c(this.insuranceInstitutionName, vehicleInsuranceModel.insuranceInstitutionName) && t.c(this.insuranceId, vehicleInsuranceModel.insuranceId) && t.c(this.insuranceType, vehicleInsuranceModel.insuranceType) && t.c(this.insuranceSignDay, vehicleInsuranceModel.insuranceSignDay) && t.c(this.insurancePeriodStart, vehicleInsuranceModel.insurancePeriodStart) && t.c(this.insurancePeriodEnd, vehicleInsuranceModel.insurancePeriodEnd);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Date getInsuranceSignDay() {
        return this.insuranceSignDay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInsuranceType() {
        return this.insuranceType;
    }

    public int hashCode() {
        Date date = this.insuranceExpireDate;
        int iHashCode = (((date == null ? 0 : date.hashCode()) * 31) + Integer.hashCode(this.validInsuranceDays)) * 31;
        String str = this.insuranceInstitutionName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.insuranceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.insuranceType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date2 = this.insuranceSignDay;
        return ((((iHashCode4 + (date2 != null ? date2.hashCode() : 0)) * 31) + this.insurancePeriodStart.hashCode()) * 31) + this.insurancePeriodEnd.hashCode();
    }

    public String toString() {
        return "VehicleInsuranceModel(insuranceExpireDate=" + this.insuranceExpireDate + ", validInsuranceDays=" + this.validInsuranceDays + ", insuranceInstitutionName=" + this.insuranceInstitutionName + ", insuranceId=" + this.insuranceId + ", insuranceType=" + this.insuranceType + ", insuranceSignDay=" + this.insuranceSignDay + ", insurancePeriodStart=" + this.insurancePeriodStart + ", insurancePeriodEnd=" + this.insurancePeriodEnd + ')';
    }
}
