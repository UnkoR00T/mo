package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/OwnerDto;", "", "firstName", "", "secondName", "lastName", "pesel", "address", "Lpl/gov/coi/mobywatel/technical/containers/data/model/OwnerAddressDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/technical/containers/data/model/OwnerAddressDto;)V", "getFirstName", "()Ljava/lang/String;", "getSecondName", "getLastName", "getPesel", "getAddress", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/OwnerAddressDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OwnerDto {

    @c("address")
    private final OwnerAddressDto address;

    @c("firstName")
    private final String firstName;

    @c("lastName")
    private final String lastName;

    @c("pesel")
    private final String pesel;

    @c("secondName")
    private final String secondName;

    public OwnerDto() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OwnerDto copy$default(OwnerDto ownerDto, String str, String str2, String str3, String str4, OwnerAddressDto ownerAddressDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = ownerDto.firstName;
        }
        if ((i15 & 2) != 0) {
            str2 = ownerDto.secondName;
        }
        if ((i15 & 4) != 0) {
            str3 = ownerDto.lastName;
        }
        if ((i15 & 8) != 0) {
            str4 = ownerDto.pesel;
        }
        if ((i15 & 16) != 0) {
            ownerAddressDto = ownerDto.address;
        }
        OwnerAddressDto ownerAddressDto2 = ownerAddressDto;
        String str5 = str3;
        return ownerDto.copy(str, str2, str5, str4, ownerAddressDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OwnerAddressDto getAddress() {
        return this.address;
    }

    public final OwnerDto copy(String firstName, String secondName, String lastName, String pesel, OwnerAddressDto address) {
        return new OwnerDto(firstName, secondName, lastName, pesel, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerDto)) {
            return false;
        }
        OwnerDto ownerDto = (OwnerDto) other;
        return t.c(this.firstName, ownerDto.firstName) && t.c(this.secondName, ownerDto.secondName) && t.c(this.lastName, ownerDto.lastName) && t.c(this.pesel, ownerDto.pesel) && t.c(this.address, ownerDto.address);
    }

    public final OwnerAddressDto getAddress() {
        return this.address;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pesel;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OwnerAddressDto ownerAddressDto = this.address;
        return iHashCode4 + (ownerAddressDto != null ? ownerAddressDto.hashCode() : 0);
    }

    public String toString() {
        return "OwnerDto(firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", pesel=" + this.pesel + ", address=" + this.address + ')';
    }

    public OwnerDto(String str, String str2, String str3, String str4, OwnerAddressDto ownerAddressDto) {
        this.firstName = str;
        this.secondName = str2;
        this.lastName = str3;
        this.pesel = str4;
        this.address = ownerAddressDto;
    }

    public /* synthetic */ OwnerDto(String str, String str2, String str3, String str4, OwnerAddressDto ownerAddressDto, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : ownerAddressDto);
    }
}
