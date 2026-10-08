package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.n2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfw0/n2;", "", "Lfw0/o2;", "personalData", "Lfw0/p2;", "vehicleData", "<init>", "(Lfw0/o2;Lfw0/p2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfw0/o2;", "getPersonalData", "()Lfw0/o2;", "b", "Lfw0/p2;", "getVehicleData", "()Lfw0/p2;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionConfirmationStatementParticipantDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("personalData")
    private final VehicleCollisionConfirmationStatementPersonalDataDto personalData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleData")
    private final VehicleCollisionConfirmationStatementVehicleDataDto vehicleData;

    public VehicleCollisionConfirmationStatementParticipantDataDto(VehicleCollisionConfirmationStatementPersonalDataDto o2Var, VehicleCollisionConfirmationStatementVehicleDataDto p2Var) {
        this.personalData = o2Var;
        this.vehicleData = p2Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionConfirmationStatementParticipantDataDto)) {
            return false;
        }
        VehicleCollisionConfirmationStatementParticipantDataDto vehicleCollisionConfirmationStatementParticipantDataDto = (VehicleCollisionConfirmationStatementParticipantDataDto) other;
        return fr.t.c(this.personalData, vehicleCollisionConfirmationStatementParticipantDataDto.personalData) && fr.t.c(this.vehicleData, vehicleCollisionConfirmationStatementParticipantDataDto.vehicleData);
    }

    public int hashCode() {
        return (this.personalData.hashCode() * 31) + this.vehicleData.hashCode();
    }

    public String toString() {
        return "VehicleCollisionConfirmationStatementParticipantDataDto(personalData=" + this.personalData + ", vehicleData=" + this.vehicleData + ')';
    }
}
