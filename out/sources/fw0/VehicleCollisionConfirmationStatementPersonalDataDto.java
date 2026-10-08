package fw0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.o2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u0012¨\u00061"}, d2 = {"Lfw0/o2;", "", "", "city", "", "Lfw0/i2;", "drivingLicenses", "email", "Lfw0/j2;", "fullPhoneNumber", "houseNumber", "pesel", "postCode", "street", "apartmentNumber", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfw0/j2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCity", "b", "Ljava/util/List;", "getDrivingLicenses", "()Ljava/util/List;", "c", "getEmail", "d", "Lfw0/j2;", "getFullPhoneNumber", "()Lfw0/j2;", "e", "getHouseNumber", "f", "getPesel", "g", "getPostCode", "h", "getStreet", "i", "getApartmentNumber", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionConfirmationStatementPersonalDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("drivingLicenses")
    private final List<VehicleCollisionConfirmationParticipantDrivingLicenseDto> drivingLicenses;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullPhoneNumber")
    private final VehicleCollisionConfirmationPhoneNumberDataDto fullPhoneNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("houseNumber")
    private final String houseNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postCode")
    private final String postCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final String street;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("apartmentNumber")
    private final String apartmentNumber;

    public VehicleCollisionConfirmationStatementPersonalDataDto(String str, List<VehicleCollisionConfirmationParticipantDrivingLicenseDto> list, String str2, VehicleCollisionConfirmationPhoneNumberDataDto vehicleCollisionConfirmationPhoneNumberDataDto, String str3, String str4, String str5, String str6, String str7) {
        this.city = str;
        this.drivingLicenses = list;
        this.email = str2;
        this.fullPhoneNumber = vehicleCollisionConfirmationPhoneNumberDataDto;
        this.houseNumber = str3;
        this.pesel = str4;
        this.postCode = str5;
        this.street = str6;
        this.apartmentNumber = str7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionConfirmationStatementPersonalDataDto)) {
            return false;
        }
        VehicleCollisionConfirmationStatementPersonalDataDto vehicleCollisionConfirmationStatementPersonalDataDto = (VehicleCollisionConfirmationStatementPersonalDataDto) other;
        return fr.t.c(this.city, vehicleCollisionConfirmationStatementPersonalDataDto.city) && fr.t.c(this.drivingLicenses, vehicleCollisionConfirmationStatementPersonalDataDto.drivingLicenses) && fr.t.c(this.email, vehicleCollisionConfirmationStatementPersonalDataDto.email) && fr.t.c(this.fullPhoneNumber, vehicleCollisionConfirmationStatementPersonalDataDto.fullPhoneNumber) && fr.t.c(this.houseNumber, vehicleCollisionConfirmationStatementPersonalDataDto.houseNumber) && fr.t.c(this.pesel, vehicleCollisionConfirmationStatementPersonalDataDto.pesel) && fr.t.c(this.postCode, vehicleCollisionConfirmationStatementPersonalDataDto.postCode) && fr.t.c(this.street, vehicleCollisionConfirmationStatementPersonalDataDto.street) && fr.t.c(this.apartmentNumber, vehicleCollisionConfirmationStatementPersonalDataDto.apartmentNumber);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.city.hashCode() * 31) + this.drivingLicenses.hashCode()) * 31) + this.email.hashCode()) * 31) + this.fullPhoneNumber.hashCode()) * 31) + this.houseNumber.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.postCode.hashCode()) * 31) + this.street.hashCode()) * 31;
        String str = this.apartmentNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VehicleCollisionConfirmationStatementPersonalDataDto(city=" + this.city + ", drivingLicenses=" + this.drivingLicenses + ", email=" + this.email + ", fullPhoneNumber=" + this.fullPhoneNumber + ", houseNumber=" + this.houseNumber + ", pesel=" + this.pesel + ", postCode=" + this.postCode + ", street=" + this.street + ", apartmentNumber=" + this.apartmentNumber + ')';
    }
}
