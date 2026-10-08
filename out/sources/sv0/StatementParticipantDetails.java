package sv0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.d0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lsv0/d0;", "", "Lsv0/f0;", "personalData", "Lsv0/j0;", "vehicleData", "<init>", "(Lsv0/f0;Lsv0/j0;)V", "", "Lsv0/r;", "c", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/f0;", "()Lsv0/f0;", "b", "Lsv0/j0;", "()Lsv0/j0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementParticipantDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatementPersonalDetails personalData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatementVehicleDetails vehicleData;

    public StatementParticipantDetails(StatementPersonalDetails statementPersonalDetails, StatementVehicleDetails statementVehicleDetails) {
        this.personalData = statementPersonalDetails;
        this.vehicleData = statementVehicleDetails;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final StatementPersonalDetails getPersonalData() {
        return this.personalData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StatementVehicleDetails getVehicleData() {
        return this.vehicleData;
    }

    public final List<Insurance> c() {
        return this.vehicleData.g();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementParticipantDetails)) {
            return false;
        }
        StatementParticipantDetails statementParticipantDetails = (StatementParticipantDetails) other;
        return fr.t.c(this.personalData, statementParticipantDetails.personalData) && fr.t.c(this.vehicleData, statementParticipantDetails.vehicleData);
    }

    public int hashCode() {
        return (this.personalData.hashCode() * 31) + this.vehicleData.hashCode();
    }

    public String toString() {
        return "StatementParticipantDetails(personalData=" + this.personalData + ", vehicleData=" + this.vehicleData + ")";
    }
}
