package fw0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.o0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001f\u0010\u0004R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006&"}, d2 = {"Lfw0/o0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "brand", "b", "kind", "c", "model", "d", "productionYear", "e", "registrationNumber", "Lfw0/a2;", "f", "Lfw0/a2;", "()Lfw0/a2;", "vehicleCardOwnershipType", "g", "h", "vehicleSignature", "i", "vin", "", "Lfw0/p;", "Ljava/util/List;", "()Ljava/util/List;", "vehicleInsurances", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetCollisionVehicleResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("brand")
    private final String brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("kind")
    private final String kind;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("model")
    private final String model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("productionYear")
    private final String productionYear;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationNumber")
    private final String registrationNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleCardOwnershipType")
    private final a2 vehicleCardOwnershipType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleSignature")
    private final String vehicleSignature;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vin")
    private final String vin;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleInsurances")
    private final List<CollisionVehicleInsuranceDataDto> vehicleInsurances;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProductionYear() {
        return this.productionYear;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCollisionVehicleResponse)) {
            return false;
        }
        GetCollisionVehicleResponse getCollisionVehicleResponse = (GetCollisionVehicleResponse) other;
        return fr.t.c(this.brand, getCollisionVehicleResponse.brand) && fr.t.c(this.kind, getCollisionVehicleResponse.kind) && fr.t.c(this.model, getCollisionVehicleResponse.model) && fr.t.c(this.productionYear, getCollisionVehicleResponse.productionYear) && fr.t.c(this.registrationNumber, getCollisionVehicleResponse.registrationNumber) && this.vehicleCardOwnershipType == getCollisionVehicleResponse.vehicleCardOwnershipType && fr.t.c(this.vehicleSignature, getCollisionVehicleResponse.vehicleSignature) && fr.t.c(this.vin, getCollisionVehicleResponse.vin) && fr.t.c(this.vehicleInsurances, getCollisionVehicleResponse.vehicleInsurances);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a2 getVehicleCardOwnershipType() {
        return this.vehicleCardOwnershipType;
    }

    public final List<CollisionVehicleInsuranceDataDto> g() {
        return this.vehicleInsurances;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVehicleSignature() {
        return this.vehicleSignature;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.brand.hashCode() * 31) + this.kind.hashCode()) * 31) + this.model.hashCode()) * 31) + this.productionYear.hashCode()) * 31) + this.registrationNumber.hashCode()) * 31) + this.vehicleCardOwnershipType.hashCode()) * 31) + this.vehicleSignature.hashCode()) * 31) + this.vin.hashCode()) * 31;
        List<CollisionVehicleInsuranceDataDto> list = this.vehicleInsurances;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    public String toString() {
        return "GetCollisionVehicleResponse(brand=" + this.brand + ", kind=" + this.kind + ", model=" + this.model + ", productionYear=" + this.productionYear + ", registrationNumber=" + this.registrationNumber + ", vehicleCardOwnershipType=" + this.vehicleCardOwnershipType + ", vehicleSignature=" + this.vehicleSignature + ", vin=" + this.vin + ", vehicleInsurances=" + this.vehicleInsurances + ')';
    }
}
