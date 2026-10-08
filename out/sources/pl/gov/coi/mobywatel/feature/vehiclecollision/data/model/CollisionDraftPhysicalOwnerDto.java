package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.Map;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhysicalOwnerDto;", "", "owners", "", "", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhysicalOwnerDto$PersonDataDto;", "<init>", "(Ljava/util/Map;)V", "getOwners", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "PersonDataDto", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftPhysicalOwnerDto {
    public static final int $stable = 8;

    @c("owners")
    private final Map<Integer, PersonDataDto> owners;

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhysicalOwnerDto$PersonDataDto;", "", "name", "", "surname", "phoneNumber", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSurname", "getPhoneNumber", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "getEmail", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonDataDto {
        public static final int $stable = 0;

        @c("email")
        private final String email;

        @c("name")
        private final String name;

        @c("phoneNumber")
        private final CollisionDraftPhoneNumberDto phoneNumber;

        @c("surname")
        private final String surname;

        public PersonDataDto(String str, String str2, CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto, String str3) {
            this.name = str;
            this.surname = str2;
            this.phoneNumber = collisionDraftPhoneNumberDto;
            this.email = str3;
        }

        public static /* synthetic */ PersonDataDto copy$default(PersonDataDto personDataDto, String str, String str2, CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto, String str3, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = personDataDto.name;
            }
            if ((i15 & 2) != 0) {
                str2 = personDataDto.surname;
            }
            if ((i15 & 4) != 0) {
                collisionDraftPhoneNumberDto = personDataDto.phoneNumber;
            }
            if ((i15 & 8) != 0) {
                str3 = personDataDto.email;
            }
            return personDataDto.copy(str, str2, collisionDraftPhoneNumberDto, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSurname() {
            return this.surname;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CollisionDraftPhoneNumberDto getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final PersonDataDto copy(String name, String surname, CollisionDraftPhoneNumberDto phoneNumber, String email) {
            return new PersonDataDto(name, surname, phoneNumber, email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonDataDto)) {
                return false;
            }
            PersonDataDto personDataDto = (PersonDataDto) other;
            return t.c(this.name, personDataDto.name) && t.c(this.surname, personDataDto.surname) && t.c(this.phoneNumber, personDataDto.phoneNumber) && t.c(this.email, personDataDto.email);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final CollisionDraftPhoneNumberDto getPhoneNumber() {
            return this.phoneNumber;
        }

        public final String getSurname() {
            return this.surname;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode();
        }

        public String toString() {
            return "PersonDataDto(name=" + this.name + ", surname=" + this.surname + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ')';
        }
    }

    public CollisionDraftPhysicalOwnerDto(Map<Integer, PersonDataDto> map) {
        this.owners = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollisionDraftPhysicalOwnerDto copy$default(CollisionDraftPhysicalOwnerDto collisionDraftPhysicalOwnerDto, Map map, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            map = collisionDraftPhysicalOwnerDto.owners;
        }
        return collisionDraftPhysicalOwnerDto.copy(map);
    }

    public final Map<Integer, PersonDataDto> component1() {
        return this.owners;
    }

    public final CollisionDraftPhysicalOwnerDto copy(Map<Integer, PersonDataDto> owners) {
        return new CollisionDraftPhysicalOwnerDto(owners);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CollisionDraftPhysicalOwnerDto) && t.c(this.owners, ((CollisionDraftPhysicalOwnerDto) other).owners);
    }

    public final Map<Integer, PersonDataDto> getOwners() {
        return this.owners;
    }

    public int hashCode() {
        return this.owners.hashCode();
    }

    public String toString() {
        return "CollisionDraftPhysicalOwnerDto(owners=" + this.owners + ')';
    }
}
