package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftAddressDto;", "", "city", "", "postcode", "street", "buildingNumber", "flatNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getPostcode", "getStreet", "getBuildingNumber", "getFlatNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftAddressDto {
    public static final int $stable = 0;

    @c("buildingNumber")
    private final String buildingNumber;

    @c("city")
    private final String city;

    @c("flatNumber")
    private final String flatNumber;

    @c("postcode")
    private final String postcode;

    @c("street")
    private final String street;

    public CollisionDraftAddressDto(String str, String str2, String str3, String str4, String str5) {
        this.city = str;
        this.postcode = str2;
        this.street = str3;
        this.buildingNumber = str4;
        this.flatNumber = str5;
    }

    public static /* synthetic */ CollisionDraftAddressDto copy$default(CollisionDraftAddressDto collisionDraftAddressDto, String str, String str2, String str3, String str4, String str5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = collisionDraftAddressDto.city;
        }
        if ((i15 & 2) != 0) {
            str2 = collisionDraftAddressDto.postcode;
        }
        if ((i15 & 4) != 0) {
            str3 = collisionDraftAddressDto.street;
        }
        if ((i15 & 8) != 0) {
            str4 = collisionDraftAddressDto.buildingNumber;
        }
        if ((i15 & 16) != 0) {
            str5 = collisionDraftAddressDto.flatNumber;
        }
        String str6 = str5;
        String str7 = str3;
        return collisionDraftAddressDto.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFlatNumber() {
        return this.flatNumber;
    }

    public final CollisionDraftAddressDto copy(String city, String postcode, String street, String buildingNumber, String flatNumber) {
        return new CollisionDraftAddressDto(city, postcode, street, buildingNumber, flatNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftAddressDto)) {
            return false;
        }
        CollisionDraftAddressDto collisionDraftAddressDto = (CollisionDraftAddressDto) other;
        return t.c(this.city, collisionDraftAddressDto.city) && t.c(this.postcode, collisionDraftAddressDto.postcode) && t.c(this.street, collisionDraftAddressDto.street) && t.c(this.buildingNumber, collisionDraftAddressDto.buildingNumber) && t.c(this.flatNumber, collisionDraftAddressDto.flatNumber);
    }

    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getFlatNumber() {
        return this.flatNumber;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        int iHashCode = ((((((this.city.hashCode() * 31) + this.postcode.hashCode()) * 31) + this.street.hashCode()) * 31) + this.buildingNumber.hashCode()) * 31;
        String str = this.flatNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CollisionDraftAddressDto(city=" + this.city + ", postcode=" + this.postcode + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", flatNumber=" + this.flatNumber + ')';
    }
}
