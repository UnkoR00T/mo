package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.vehicle.VehicleCardOwnershipTypeDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.vehicle.VehicleTypeDto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\t\u0010/\u001a\u00020\u0012HÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;", "", "kind", "", "registrationNumber", "vin", "brand", "model", "vehicleSignature", "productionYear", "type", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleTypeDto;", "insurances", "", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftInsuranceDto;", "addedManually", "", "vehicleCardOwnershipType", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleCardOwnershipTypeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleTypeDto;Ljava/util/List;ZLpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleCardOwnershipTypeDto;)V", "getKind", "()Ljava/lang/String;", "getRegistrationNumber", "getVin", "getBrand", "getModel", "getVehicleSignature", "getProductionYear", "getType", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleTypeDto;", "getInsurances", "()Ljava/util/List;", "getAddedManually", "()Z", "getVehicleCardOwnershipType", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleCardOwnershipTypeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftVehicleDto {
    public static final int $stable = 8;

    @c("addedManually")
    private final boolean addedManually;

    @c("brand")
    private final String brand;

    @c("insurances")
    private final List<CollisionDraftInsuranceDto> insurances;

    @c("kind")
    private final String kind;

    @c("model")
    private final String model;

    @c("productionYear")
    private final String productionYear;

    @c("registrationNumber")
    private final String registrationNumber;

    @c("type")
    private final VehicleTypeDto type;

    @c("VehicleCardOwnershipType")
    private final VehicleCardOwnershipTypeDto vehicleCardOwnershipType;

    @c("vehicleSignature")
    private final String vehicleSignature;

    @c("vin")
    private final String vin;

    public CollisionDraftVehicleDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, VehicleTypeDto vehicleTypeDto, List<CollisionDraftInsuranceDto> list, boolean z15, VehicleCardOwnershipTypeDto vehicleCardOwnershipTypeDto) {
        this.kind = str;
        this.registrationNumber = str2;
        this.vin = str3;
        this.brand = str4;
        this.model = str5;
        this.vehicleSignature = str6;
        this.productionYear = str7;
        this.type = vehicleTypeDto;
        this.insurances = list;
        this.addedManually = z15;
        this.vehicleCardOwnershipType = vehicleCardOwnershipTypeDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollisionDraftVehicleDto copy$default(CollisionDraftVehicleDto collisionDraftVehicleDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, VehicleTypeDto vehicleTypeDto, List list, boolean z15, VehicleCardOwnershipTypeDto vehicleCardOwnershipTypeDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = collisionDraftVehicleDto.kind;
        }
        if ((i15 & 2) != 0) {
            str2 = collisionDraftVehicleDto.registrationNumber;
        }
        if ((i15 & 4) != 0) {
            str3 = collisionDraftVehicleDto.vin;
        }
        if ((i15 & 8) != 0) {
            str4 = collisionDraftVehicleDto.brand;
        }
        if ((i15 & 16) != 0) {
            str5 = collisionDraftVehicleDto.model;
        }
        if ((i15 & 32) != 0) {
            str6 = collisionDraftVehicleDto.vehicleSignature;
        }
        if ((i15 & 64) != 0) {
            str7 = collisionDraftVehicleDto.productionYear;
        }
        if ((i15 & 128) != 0) {
            vehicleTypeDto = collisionDraftVehicleDto.type;
        }
        if ((i15 & 256) != 0) {
            list = collisionDraftVehicleDto.insurances;
        }
        if ((i15 & 512) != 0) {
            z15 = collisionDraftVehicleDto.addedManually;
        }
        if ((i15 & 1024) != 0) {
            vehicleCardOwnershipTypeDto = collisionDraftVehicleDto.vehicleCardOwnershipType;
        }
        boolean z16 = z15;
        VehicleCardOwnershipTypeDto vehicleCardOwnershipTypeDto2 = vehicleCardOwnershipTypeDto;
        VehicleTypeDto vehicleTypeDto2 = vehicleTypeDto;
        List list2 = list;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return collisionDraftVehicleDto.copy(str, str2, str11, str4, str10, str8, str9, vehicleTypeDto2, list2, z16, vehicleCardOwnershipTypeDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getAddedManually() {
        return this.addedManually;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VehicleCardOwnershipTypeDto getVehicleCardOwnershipType() {
        return this.vehicleCardOwnershipType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVehicleSignature() {
        return this.vehicleSignature;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProductionYear() {
        return this.productionYear;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VehicleTypeDto getType() {
        return this.type;
    }

    public final List<CollisionDraftInsuranceDto> component9() {
        return this.insurances;
    }

    public final CollisionDraftVehicleDto copy(String kind, String registrationNumber, String vin, String brand, String model, String vehicleSignature, String productionYear, VehicleTypeDto type, List<CollisionDraftInsuranceDto> insurances, boolean addedManually, VehicleCardOwnershipTypeDto vehicleCardOwnershipType) {
        return new CollisionDraftVehicleDto(kind, registrationNumber, vin, brand, model, vehicleSignature, productionYear, type, insurances, addedManually, vehicleCardOwnershipType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftVehicleDto)) {
            return false;
        }
        CollisionDraftVehicleDto collisionDraftVehicleDto = (CollisionDraftVehicleDto) other;
        return t.c(this.kind, collisionDraftVehicleDto.kind) && t.c(this.registrationNumber, collisionDraftVehicleDto.registrationNumber) && t.c(this.vin, collisionDraftVehicleDto.vin) && t.c(this.brand, collisionDraftVehicleDto.brand) && t.c(this.model, collisionDraftVehicleDto.model) && t.c(this.vehicleSignature, collisionDraftVehicleDto.vehicleSignature) && t.c(this.productionYear, collisionDraftVehicleDto.productionYear) && this.type == collisionDraftVehicleDto.type && t.c(this.insurances, collisionDraftVehicleDto.insurances) && this.addedManually == collisionDraftVehicleDto.addedManually && this.vehicleCardOwnershipType == collisionDraftVehicleDto.vehicleCardOwnershipType;
    }

    public final boolean getAddedManually() {
        return this.addedManually;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final List<CollisionDraftInsuranceDto> getInsurances() {
        return this.insurances;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getProductionYear() {
        return this.productionYear;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public final VehicleTypeDto getType() {
        return this.type;
    }

    public final VehicleCardOwnershipTypeDto getVehicleCardOwnershipType() {
        return this.vehicleCardOwnershipType;
    }

    public final String getVehicleSignature() {
        return this.vehicleSignature;
    }

    public final String getVin() {
        return this.vin;
    }

    public int hashCode() {
        return (((((((((((((((((((this.kind.hashCode() * 31) + this.registrationNumber.hashCode()) * 31) + this.vin.hashCode()) * 31) + this.brand.hashCode()) * 31) + this.model.hashCode()) * 31) + this.vehicleSignature.hashCode()) * 31) + this.productionYear.hashCode()) * 31) + this.type.hashCode()) * 31) + this.insurances.hashCode()) * 31) + Boolean.hashCode(this.addedManually)) * 31) + this.vehicleCardOwnershipType.hashCode();
    }

    public String toString() {
        return "CollisionDraftVehicleDto(kind=" + this.kind + ", registrationNumber=" + this.registrationNumber + ", vin=" + this.vin + ", brand=" + this.brand + ", model=" + this.model + ", vehicleSignature=" + this.vehicleSignature + ", productionYear=" + this.productionYear + ", type=" + this.type + ", insurances=" + this.insurances + ", addedManually=" + this.addedManually + ", vehicleCardOwnershipType=" + this.vehicleCardOwnershipType + ')';
    }
}
