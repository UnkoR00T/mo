package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.q2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0017"}, d2 = {"Lfw0/q2;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "insuranceAddedManually", "b", "Ljava/lang/String;", "c", "insurerId", "d", "insurerName", "insuranceNumber", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionCreatedStatementInsuranceDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insuranceAddedManually")
    private final boolean insuranceAddedManually;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insurerId")
    private final String insurerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insurerName")
    private final String insurerName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insuranceNumber")
    private final String insuranceNumber;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getInsuranceAddedManually() {
        return this.insuranceAddedManually;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInsurerId() {
        return this.insurerId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInsurerName() {
        return this.insurerName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionCreatedStatementInsuranceDataDto)) {
            return false;
        }
        VehicleCollisionCreatedStatementInsuranceDataDto vehicleCollisionCreatedStatementInsuranceDataDto = (VehicleCollisionCreatedStatementInsuranceDataDto) other;
        return this.insuranceAddedManually == vehicleCollisionCreatedStatementInsuranceDataDto.insuranceAddedManually && fr.t.c(this.insurerId, vehicleCollisionCreatedStatementInsuranceDataDto.insurerId) && fr.t.c(this.insurerName, vehicleCollisionCreatedStatementInsuranceDataDto.insurerName) && fr.t.c(this.insuranceNumber, vehicleCollisionCreatedStatementInsuranceDataDto.insuranceNumber);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.insuranceAddedManually) * 31) + this.insurerId.hashCode()) * 31) + this.insurerName.hashCode()) * 31;
        String str = this.insuranceNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VehicleCollisionCreatedStatementInsuranceDataDto(insuranceAddedManually=" + this.insuranceAddedManually + ", insurerId=" + this.insurerId + ", insurerName=" + this.insurerName + ", insuranceNumber=" + this.insuranceNumber + ')';
    }
}
