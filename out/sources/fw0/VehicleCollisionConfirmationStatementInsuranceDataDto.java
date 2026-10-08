package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.m2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lfw0/m2;", "", "", "insuranceAddedManually", "", "insurerId", "insuranceNumber", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getInsuranceAddedManually", "()Z", "b", "Ljava/lang/String;", "getInsurerId", "c", "getInsuranceNumber", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionConfirmationStatementInsuranceDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insuranceAddedManually")
    private final boolean insuranceAddedManually;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insurerId")
    private final String insurerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insuranceNumber")
    private final String insuranceNumber;

    public VehicleCollisionConfirmationStatementInsuranceDataDto(boolean z15, String str, String str2) {
        this.insuranceAddedManually = z15;
        this.insurerId = str;
        this.insuranceNumber = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionConfirmationStatementInsuranceDataDto)) {
            return false;
        }
        VehicleCollisionConfirmationStatementInsuranceDataDto vehicleCollisionConfirmationStatementInsuranceDataDto = (VehicleCollisionConfirmationStatementInsuranceDataDto) other;
        return this.insuranceAddedManually == vehicleCollisionConfirmationStatementInsuranceDataDto.insuranceAddedManually && fr.t.c(this.insurerId, vehicleCollisionConfirmationStatementInsuranceDataDto.insurerId) && fr.t.c(this.insuranceNumber, vehicleCollisionConfirmationStatementInsuranceDataDto.insuranceNumber);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.insuranceAddedManually) * 31) + this.insurerId.hashCode()) * 31;
        String str = this.insuranceNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VehicleCollisionConfirmationStatementInsuranceDataDto(insuranceAddedManually=" + this.insuranceAddedManually + ", insurerId=" + this.insurerId + ", insuranceNumber=" + this.insuranceNumber + ')';
    }
}
