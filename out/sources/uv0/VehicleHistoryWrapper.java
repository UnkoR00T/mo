package uv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: uv0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Luv0/u;", "Luv0/s;", "Luv0/m;", "vehicleHistory", "<init>", "(Luv0/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Luv0/m;", "()Luv0/m;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryWrapper extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleHistory vehicleHistory;

    public VehicleHistoryWrapper(VehicleHistory vehicleHistory) {
        super(false, 1, null);
        this.vehicleHistory = vehicleHistory;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleHistory getVehicleHistory() {
        return this.vehicleHistory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VehicleHistoryWrapper) && fr.t.c(this.vehicleHistory, ((VehicleHistoryWrapper) other).vehicleHistory);
    }

    public int hashCode() {
        return this.vehicleHistory.hashCode();
    }

    public String toString() {
        return "VehicleHistoryWrapper(vehicleHistory=" + this.vehicleHistory + ")";
    }
}
