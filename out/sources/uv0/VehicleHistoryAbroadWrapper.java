package uv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: uv0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Luv0/p;", "Luv0/s;", "Luv0/o;", "Luv0/n;", "vehicleHistoryAbroad", "<init>", "(Luv0/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Luv0/n;", "()Luv0/n;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryAbroadWrapper extends s implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleHistoryAbroad vehicleHistoryAbroad;

    public VehicleHistoryAbroadWrapper(VehicleHistoryAbroad vehicleHistoryAbroad) {
        super(false, 1, null);
        this.vehicleHistoryAbroad = vehicleHistoryAbroad;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleHistoryAbroad getVehicleHistoryAbroad() {
        return this.vehicleHistoryAbroad;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VehicleHistoryAbroadWrapper) && fr.t.c(this.vehicleHistoryAbroad, ((VehicleHistoryAbroadWrapper) other).vehicleHistoryAbroad);
    }

    public int hashCode() {
        return this.vehicleHistoryAbroad.hashCode();
    }

    public String toString() {
        return "VehicleHistoryAbroadWrapper(vehicleHistoryAbroad=" + this.vehicleHistoryAbroad + ")";
    }
}
