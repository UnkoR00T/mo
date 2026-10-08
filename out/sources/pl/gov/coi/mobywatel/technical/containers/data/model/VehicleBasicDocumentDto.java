package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.math.BigDecimal;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003Ji\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006'"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleBasicDocumentDto;", "", "make", "", "model", "registrationNumber", "vin", "productionYear", "engineCapacity", "Ljava/math/BigDecimal;", "maxPower", "imageCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMake", "()Ljava/lang/String;", "getModel", "getRegistrationNumber", "getVin", "getProductionYear", "getEngineCapacity", "()Ljava/math/BigDecimal;", "getMaxPower", "getImageCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleBasicDocumentDto {

    @c("engineCapacity")
    private final BigDecimal engineCapacity;

    @c("imageCode")
    private final BigDecimal imageCode;

    @c("make")
    private final String make;

    @c("maxPower")
    private final BigDecimal maxPower;

    @c("model")
    private final String model;

    @c("productionYear")
    private final String productionYear;

    @c("registrationNumber")
    private final String registrationNumber;

    @c("vin")
    private final String vin;

    public VehicleBasicDocumentDto() {
        this(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
    }

    public static /* synthetic */ VehicleBasicDocumentDto copy$default(VehicleBasicDocumentDto vehicleBasicDocumentDto, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = vehicleBasicDocumentDto.make;
        }
        if ((i15 & 2) != 0) {
            str2 = vehicleBasicDocumentDto.model;
        }
        if ((i15 & 4) != 0) {
            str3 = vehicleBasicDocumentDto.registrationNumber;
        }
        if ((i15 & 8) != 0) {
            str4 = vehicleBasicDocumentDto.vin;
        }
        if ((i15 & 16) != 0) {
            str5 = vehicleBasicDocumentDto.productionYear;
        }
        if ((i15 & 32) != 0) {
            bigDecimal = vehicleBasicDocumentDto.engineCapacity;
        }
        if ((i15 & 64) != 0) {
            bigDecimal2 = vehicleBasicDocumentDto.maxPower;
        }
        if ((i15 & 128) != 0) {
            bigDecimal3 = vehicleBasicDocumentDto.imageCode;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        BigDecimal bigDecimal5 = bigDecimal3;
        String str6 = str5;
        BigDecimal bigDecimal6 = bigDecimal;
        return vehicleBasicDocumentDto.copy(str, str2, str3, str4, str6, bigDecimal6, bigDecimal4, bigDecimal5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductionYear() {
        return this.productionYear;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getEngineCapacity() {
        return this.engineCapacity;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getMaxPower() {
        return this.maxPower;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getImageCode() {
        return this.imageCode;
    }

    public final VehicleBasicDocumentDto copy(String make, String model, String registrationNumber, String vin, String productionYear, BigDecimal engineCapacity, BigDecimal maxPower, BigDecimal imageCode) {
        return new VehicleBasicDocumentDto(make, model, registrationNumber, vin, productionYear, engineCapacity, maxPower, imageCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleBasicDocumentDto)) {
            return false;
        }
        VehicleBasicDocumentDto vehicleBasicDocumentDto = (VehicleBasicDocumentDto) other;
        return t.c(this.make, vehicleBasicDocumentDto.make) && t.c(this.model, vehicleBasicDocumentDto.model) && t.c(this.registrationNumber, vehicleBasicDocumentDto.registrationNumber) && t.c(this.vin, vehicleBasicDocumentDto.vin) && t.c(this.productionYear, vehicleBasicDocumentDto.productionYear) && t.c(this.engineCapacity, vehicleBasicDocumentDto.engineCapacity) && t.c(this.maxPower, vehicleBasicDocumentDto.maxPower) && t.c(this.imageCode, vehicleBasicDocumentDto.imageCode);
    }

    public final BigDecimal getEngineCapacity() {
        return this.engineCapacity;
    }

    public final BigDecimal getImageCode() {
        return this.imageCode;
    }

    public final String getMake() {
        return this.make;
    }

    public final BigDecimal getMaxPower() {
        return this.maxPower;
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

    public final String getVin() {
        return this.vin;
    }

    public int hashCode() {
        String str = this.make;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vin;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productionYear;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.engineCapacity;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.maxPower;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.imageCode;
        return iHashCode7 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    public String toString() {
        return "VehicleBasicDocumentDto(make=" + this.make + ", model=" + this.model + ", registrationNumber=" + this.registrationNumber + ", vin=" + this.vin + ", productionYear=" + this.productionYear + ", engineCapacity=" + this.engineCapacity + ", maxPower=" + this.maxPower + ", imageCode=" + this.imageCode + ')';
    }

    public VehicleBasicDocumentDto(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.make = str;
        this.model = str2;
        this.registrationNumber = str3;
        this.vin = str4;
        this.productionYear = str5;
        this.engineCapacity = bigDecimal;
        this.maxPower = bigDecimal2;
        this.imageCode = bigDecimal3;
    }

    public /* synthetic */ VehicleBasicDocumentDto(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : bigDecimal, (i15 & 64) != 0 ? null : bigDecimal2, (i15 & 128) != 0 ? null : bigDecimal3);
    }
}
