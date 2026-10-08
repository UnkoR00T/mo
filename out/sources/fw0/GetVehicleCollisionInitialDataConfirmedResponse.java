package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.s0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lfw0/s0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/a3;", "a", "Lfw0/a3;", "b", "()Lfw0/a3;", "status", "Lfw0/w2;", "Lfw0/w2;", "()Lfw0/w2;", "rejectionReason", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetVehicleCollisionInitialDataConfirmedResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final a3 status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rejectionReason")
    private final w2 rejectionReason;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w2 getRejectionReason() {
        return this.rejectionReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a3 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetVehicleCollisionInitialDataConfirmedResponse)) {
            return false;
        }
        GetVehicleCollisionInitialDataConfirmedResponse getVehicleCollisionInitialDataConfirmedResponse = (GetVehicleCollisionInitialDataConfirmedResponse) other;
        return this.status == getVehicleCollisionInitialDataConfirmedResponse.status && this.rejectionReason == getVehicleCollisionInitialDataConfirmedResponse.rejectionReason;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        w2 w2Var = this.rejectionReason;
        return iHashCode + (w2Var == null ? 0 : w2Var.hashCode());
    }

    public String toString() {
        return "GetVehicleCollisionInitialDataConfirmedResponse(status=" + this.status + ", rejectionReason=" + this.rejectionReason + ')';
    }
}
