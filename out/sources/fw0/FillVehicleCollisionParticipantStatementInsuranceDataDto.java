package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.i0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lfw0/i0;", "", "", "insuranceAddedManually", "", "insurerId", "insurerName", "insuranceNumber", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getInsuranceAddedManually", "()Z", "b", "Ljava/lang/String;", "getInsurerId", "c", "getInsurerName", "d", "getInsuranceNumber", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FillVehicleCollisionParticipantStatementInsuranceDataDto {

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

    public FillVehicleCollisionParticipantStatementInsuranceDataDto(boolean z15, String str, String str2, String str3) {
        this.insuranceAddedManually = z15;
        this.insurerId = str;
        this.insurerName = str2;
        this.insuranceNumber = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FillVehicleCollisionParticipantStatementInsuranceDataDto)) {
            return false;
        }
        FillVehicleCollisionParticipantStatementInsuranceDataDto fillVehicleCollisionParticipantStatementInsuranceDataDto = (FillVehicleCollisionParticipantStatementInsuranceDataDto) other;
        return this.insuranceAddedManually == fillVehicleCollisionParticipantStatementInsuranceDataDto.insuranceAddedManually && fr.t.c(this.insurerId, fillVehicleCollisionParticipantStatementInsuranceDataDto.insurerId) && fr.t.c(this.insurerName, fillVehicleCollisionParticipantStatementInsuranceDataDto.insurerName) && fr.t.c(this.insuranceNumber, fillVehicleCollisionParticipantStatementInsuranceDataDto.insuranceNumber);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.insuranceAddedManually) * 31) + this.insurerId.hashCode()) * 31) + this.insurerName.hashCode()) * 31;
        String str = this.insuranceNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FillVehicleCollisionParticipantStatementInsuranceDataDto(insuranceAddedManually=" + this.insuranceAddedManually + ", insurerId=" + this.insurerId + ", insurerName=" + this.insurerName + ", insuranceNumber=" + this.insuranceNumber + ')';
    }
}
