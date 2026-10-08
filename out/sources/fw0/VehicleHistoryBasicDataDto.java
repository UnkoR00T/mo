package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.r3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0017\u0010\u0004¨\u0006\""}, d2 = {"Lfw0/r3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "description", "b", "Z", "g", "()Z", "isCivilLiabilityInsurance", "c", "h", "isLost", "d", "i", "isTemporarilyWithdrawnFromCirculation", "e", "vin", "f", "I", "yearOfProduction", "odometerState", "registrationStatus", "vehicleTechnicalInspection", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryBasicDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isCivilLiabilityInsurance")
    private final boolean isCivilLiabilityInsurance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isLost")
    private final boolean isLost;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isTemporarilyWithdrawnFromCirculation")
    private final boolean isTemporarilyWithdrawnFromCirculation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vin")
    private final String vin;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("yearOfProduction")
    private final int yearOfProduction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("odometerState")
    private final String odometerState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationStatus")
    private final String registrationStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleTechnicalInspection")
    private final String vehicleTechnicalInspection;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOdometerState() {
        return this.odometerState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRegistrationStatus() {
        return this.registrationStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVehicleTechnicalInspection() {
        return this.vehicleTechnicalInspection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryBasicDataDto)) {
            return false;
        }
        VehicleHistoryBasicDataDto vehicleHistoryBasicDataDto = (VehicleHistoryBasicDataDto) other;
        return fr.t.c(this.description, vehicleHistoryBasicDataDto.description) && this.isCivilLiabilityInsurance == vehicleHistoryBasicDataDto.isCivilLiabilityInsurance && this.isLost == vehicleHistoryBasicDataDto.isLost && this.isTemporarilyWithdrawnFromCirculation == vehicleHistoryBasicDataDto.isTemporarilyWithdrawnFromCirculation && fr.t.c(this.vin, vehicleHistoryBasicDataDto.vin) && this.yearOfProduction == vehicleHistoryBasicDataDto.yearOfProduction && fr.t.c(this.odometerState, vehicleHistoryBasicDataDto.odometerState) && fr.t.c(this.registrationStatus, vehicleHistoryBasicDataDto.registrationStatus) && fr.t.c(this.vehicleTechnicalInspection, vehicleHistoryBasicDataDto.vehicleTechnicalInspection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getYearOfProduction() {
        return this.yearOfProduction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsCivilLiabilityInsurance() {
        return this.isCivilLiabilityInsurance;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsLost() {
        return this.isLost;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.description.hashCode() * 31) + Boolean.hashCode(this.isCivilLiabilityInsurance)) * 31) + Boolean.hashCode(this.isLost)) * 31) + Boolean.hashCode(this.isTemporarilyWithdrawnFromCirculation)) * 31) + this.vin.hashCode()) * 31) + Integer.hashCode(this.yearOfProduction)) * 31;
        String str = this.odometerState;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.registrationStatus;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vehicleTechnicalInspection;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsTemporarilyWithdrawnFromCirculation() {
        return this.isTemporarilyWithdrawnFromCirculation;
    }

    public String toString() {
        return "VehicleHistoryBasicDataDto(description=" + this.description + ", isCivilLiabilityInsurance=" + this.isCivilLiabilityInsurance + ", isLost=" + this.isLost + ", isTemporarilyWithdrawnFromCirculation=" + this.isTemporarilyWithdrawnFromCirculation + ", vin=" + this.vin + ", yearOfProduction=" + this.yearOfProduction + ", odometerState=" + this.odometerState + ", registrationStatus=" + this.registrationStatus + ", vehicleTechnicalInspection=" + this.vehicleTechnicalInspection + ')';
    }
}
