package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;", "", "firstName", "", "lastname", "phoneNumber", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "email", "address", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftAddressDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftAddressDto;)V", "getFirstName", "()Ljava/lang/String;", "getLastname", "getPhoneNumber", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "getEmail", "getAddress", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftAddressDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftPersonalDataDto {
    public static final int $stable = 0;

    @c("address")
    private final CollisionDraftAddressDto address;

    @c("email")
    private final String email;

    @c("firstName")
    private final String firstName;

    @c("lastname")
    private final String lastname;

    @c("phoneNumber")
    private final CollisionDraftPhoneNumberDto phoneNumber;

    public CollisionDraftPersonalDataDto(String str, String str2, CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto, String str3, CollisionDraftAddressDto collisionDraftAddressDto) {
        this.firstName = str;
        this.lastname = str2;
        this.phoneNumber = collisionDraftPhoneNumberDto;
        this.email = str3;
        this.address = collisionDraftAddressDto;
    }

    public static /* synthetic */ CollisionDraftPersonalDataDto copy$default(CollisionDraftPersonalDataDto collisionDraftPersonalDataDto, String str, String str2, CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto, String str3, CollisionDraftAddressDto collisionDraftAddressDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = collisionDraftPersonalDataDto.firstName;
        }
        if ((i15 & 2) != 0) {
            str2 = collisionDraftPersonalDataDto.lastname;
        }
        if ((i15 & 4) != 0) {
            collisionDraftPhoneNumberDto = collisionDraftPersonalDataDto.phoneNumber;
        }
        if ((i15 & 8) != 0) {
            str3 = collisionDraftPersonalDataDto.email;
        }
        if ((i15 & 16) != 0) {
            collisionDraftAddressDto = collisionDraftPersonalDataDto.address;
        }
        CollisionDraftAddressDto collisionDraftAddressDto2 = collisionDraftAddressDto;
        CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto2 = collisionDraftPhoneNumberDto;
        return collisionDraftPersonalDataDto.copy(str, str2, collisionDraftPhoneNumberDto2, str3, collisionDraftAddressDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastname() {
        return this.lastname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CollisionDraftPhoneNumberDto getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CollisionDraftAddressDto getAddress() {
        return this.address;
    }

    public final CollisionDraftPersonalDataDto copy(String firstName, String lastname, CollisionDraftPhoneNumberDto phoneNumber, String email, CollisionDraftAddressDto address) {
        return new CollisionDraftPersonalDataDto(firstName, lastname, phoneNumber, email, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftPersonalDataDto)) {
            return false;
        }
        CollisionDraftPersonalDataDto collisionDraftPersonalDataDto = (CollisionDraftPersonalDataDto) other;
        return t.c(this.firstName, collisionDraftPersonalDataDto.firstName) && t.c(this.lastname, collisionDraftPersonalDataDto.lastname) && t.c(this.phoneNumber, collisionDraftPersonalDataDto.phoneNumber) && t.c(this.email, collisionDraftPersonalDataDto.email) && t.c(this.address, collisionDraftPersonalDataDto.address);
    }

    public final CollisionDraftAddressDto getAddress() {
        return this.address;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastname() {
        return this.lastname;
    }

    public final CollisionDraftPhoneNumberDto getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (((((((this.firstName.hashCode() * 31) + this.lastname.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + this.address.hashCode();
    }

    public String toString() {
        return "CollisionDraftPersonalDataDto(firstName=" + this.firstName + ", lastname=" + this.lastname + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", address=" + this.address + ')';
    }
}
