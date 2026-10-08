package df3;

import fr.t;
import p071kotlin.Metadata;
import sv0.StatementVehicleDetails;
import sv0.l;

/* JADX INFO: renamed from: df3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Ldf3/a;", "", "Lsv0/l;", "role", "Lsv0/j0;", "vehicleData", "", "copyEnabled", "<init>", "(Lsv0/l;Lsv0/j0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/l;", "b", "()Lsv0/l;", "Lsv0/j0;", "c", "()Lsv0/j0;", "Z", "()Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleDetailsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l role;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatementVehicleDetails vehicleData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean copyEnabled;

    public VehicleDetailsData(l lVar, StatementVehicleDetails statementVehicleDetails, boolean z15) {
        this.role = lVar;
        this.vehicleData = statementVehicleDetails;
        this.copyEnabled = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCopyEnabled() {
        return this.copyEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final StatementVehicleDetails getVehicleData() {
        return this.vehicleData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleDetailsData)) {
            return false;
        }
        VehicleDetailsData vehicleDetailsData = (VehicleDetailsData) other;
        return this.role == vehicleDetailsData.role && t.c(this.vehicleData, vehicleDetailsData.vehicleData) && this.copyEnabled == vehicleDetailsData.copyEnabled;
    }

    public int hashCode() {
        return (((this.role.hashCode() * 31) + this.vehicleData.hashCode()) * 31) + Boolean.hashCode(this.copyEnabled);
    }

    public String toString() {
        return "VehicleDetailsData(role=" + this.role + ", vehicleData=" + this.vehicleData + ", copyEnabled=" + this.copyEnabled + ')';
    }
}
