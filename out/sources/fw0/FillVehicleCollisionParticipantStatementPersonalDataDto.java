package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.j0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u000e¨\u0006'"}, d2 = {"Lfw0/j0;", "", "", "city", "email", "Lfw0/l0;", "fullPhoneNumber", "houseNumber", "postCode", "street", "apartmentNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfw0/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCity", "b", "getEmail", "c", "Lfw0/l0;", "getFullPhoneNumber", "()Lfw0/l0;", "d", "getHouseNumber", "e", "getPostCode", "f", "getStreet", "g", "getApartmentNumber", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FillVehicleCollisionParticipantStatementPersonalDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullPhoneNumber")
    private final FillVehicleCollisionPhoneNumberDataDto fullPhoneNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("houseNumber")
    private final String houseNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postCode")
    private final String postCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final String street;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("apartmentNumber")
    private final String apartmentNumber;

    public FillVehicleCollisionParticipantStatementPersonalDataDto(String str, String str2, FillVehicleCollisionPhoneNumberDataDto fillVehicleCollisionPhoneNumberDataDto, String str3, String str4, String str5, String str6) {
        this.city = str;
        this.email = str2;
        this.fullPhoneNumber = fillVehicleCollisionPhoneNumberDataDto;
        this.houseNumber = str3;
        this.postCode = str4;
        this.street = str5;
        this.apartmentNumber = str6;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FillVehicleCollisionParticipantStatementPersonalDataDto)) {
            return false;
        }
        FillVehicleCollisionParticipantStatementPersonalDataDto fillVehicleCollisionParticipantStatementPersonalDataDto = (FillVehicleCollisionParticipantStatementPersonalDataDto) other;
        return fr.t.c(this.city, fillVehicleCollisionParticipantStatementPersonalDataDto.city) && fr.t.c(this.email, fillVehicleCollisionParticipantStatementPersonalDataDto.email) && fr.t.c(this.fullPhoneNumber, fillVehicleCollisionParticipantStatementPersonalDataDto.fullPhoneNumber) && fr.t.c(this.houseNumber, fillVehicleCollisionParticipantStatementPersonalDataDto.houseNumber) && fr.t.c(this.postCode, fillVehicleCollisionParticipantStatementPersonalDataDto.postCode) && fr.t.c(this.street, fillVehicleCollisionParticipantStatementPersonalDataDto.street) && fr.t.c(this.apartmentNumber, fillVehicleCollisionParticipantStatementPersonalDataDto.apartmentNumber);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.city.hashCode() * 31) + this.email.hashCode()) * 31) + this.fullPhoneNumber.hashCode()) * 31) + this.houseNumber.hashCode()) * 31) + this.postCode.hashCode()) * 31) + this.street.hashCode()) * 31;
        String str = this.apartmentNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FillVehicleCollisionParticipantStatementPersonalDataDto(city=" + this.city + ", email=" + this.email + ", fullPhoneNumber=" + this.fullPhoneNumber + ", houseNumber=" + this.houseNumber + ", postCode=" + this.postCode + ", street=" + this.street + ", apartmentNumber=" + this.apartmentNumber + ')';
    }
}
