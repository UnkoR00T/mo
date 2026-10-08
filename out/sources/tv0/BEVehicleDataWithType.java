package tv0;

import fr.t;
import p071kotlin.Metadata;
import sv0.BEVehicleData;

/* JADX INFO: renamed from: tv0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ltv0/k;", "", "Lsv0/e;", "vehicleData", "Ltv0/k$a;", "type", "<init>", "(Lsv0/e;Ltv0/k$a;)V", "a", "(Lsv0/e;Ltv0/k$a;)Ltv0/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsv0/e;", "d", "()Lsv0/e;", "b", "Ltv0/k$a;", "c", "()Ltv0/k$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEVehicleDataWithType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEVehicleData vehicleData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a type;

    /* JADX INFO: renamed from: tv0.k$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Ltv0/k$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        Ambulance,
        Bus,
        Motorcycle,
        StandardCar,
        Tractor,
        Trailer,
        Truck;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ wq.a f192422j = wq.b.a(b());
    }

    public BEVehicleDataWithType(BEVehicleData eVar, a aVar) {
        this.vehicleData = eVar;
        this.type = aVar;
    }

    public static /* synthetic */ BEVehicleDataWithType b(BEVehicleDataWithType bEVehicleDataWithType, BEVehicleData eVar, a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            eVar = bEVehicleDataWithType.vehicleData;
        }
        if ((i15 & 2) != 0) {
            aVar = bEVehicleDataWithType.type;
        }
        return bEVehicleDataWithType.a(eVar, aVar);
    }

    public final BEVehicleDataWithType a(BEVehicleData vehicleData, a type) {
        return new BEVehicleDataWithType(vehicleData, type);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEVehicleData getVehicleData() {
        return this.vehicleData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEVehicleDataWithType)) {
            return false;
        }
        BEVehicleDataWithType bEVehicleDataWithType = (BEVehicleDataWithType) other;
        return t.c(this.vehicleData, bEVehicleDataWithType.vehicleData) && this.type == bEVehicleDataWithType.type;
    }

    public int hashCode() {
        return (this.vehicleData.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "BEVehicleDataWithType(vehicleData=" + this.vehicleData + ", type=" + this.type + ")";
    }
}
