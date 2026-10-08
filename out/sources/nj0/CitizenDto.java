package nj0;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\r\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\"\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b'\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b)\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b+\u0010 R\"\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0013\u001a\u0004\b3\u0010\u0004¨\u00065"}, d2 = {"Lnj0/g;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "birthDate", "b", "Ljava/lang/String;", "h", "firstName", "i", "lastName", "d", "j", "pesel", "e", "additionalNames", "Lnj0/f;", "f", "Lnj0/f;", "()Lnj0/f;", "address", "g", "citizenshipCode", "citizenshipDescription", "documentNumber", "documentType", "k", "registerCode", "l", "registerName", "m", "registeredAddress", "", "Lnj0/k0;", "n", "Ljava/util/List;", "()Ljava/util/List;", "residenceAddresses", "o", "secondName", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CitizenDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthDate")
    private final LocalDate birthDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalNames")
    private final String additionalNames;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final CitizenAddressDto address;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("citizenshipCode")
    private final String citizenshipCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("citizenshipDescription")
    private final String citizenshipDescription;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentNumber")
    private final String documentNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentType")
    private final String documentType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registerCode")
    private final String registerCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registerName")
    private final String registerName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registeredAddress")
    private final CitizenAddressDto registeredAddress;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("residenceAddresses")
    private final List<ResidenceAddressDto> residenceAddresses;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondName")
    private final String secondName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalNames() {
        return this.additionalNames;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CitizenAddressDto getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCitizenshipCode() {
        return this.citizenshipCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCitizenshipDescription() {
        return this.citizenshipDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitizenDto)) {
            return false;
        }
        CitizenDto citizenDto = (CitizenDto) other;
        return fr.t.c(this.birthDate, citizenDto.birthDate) && fr.t.c(this.firstName, citizenDto.firstName) && fr.t.c(this.lastName, citizenDto.lastName) && fr.t.c(this.pesel, citizenDto.pesel) && fr.t.c(this.additionalNames, citizenDto.additionalNames) && fr.t.c(this.address, citizenDto.address) && fr.t.c(this.citizenshipCode, citizenDto.citizenshipCode) && fr.t.c(this.citizenshipDescription, citizenDto.citizenshipDescription) && fr.t.c(this.documentNumber, citizenDto.documentNumber) && fr.t.c(this.documentType, citizenDto.documentType) && fr.t.c(this.registerCode, citizenDto.registerCode) && fr.t.c(this.registerName, citizenDto.registerName) && fr.t.c(this.registeredAddress, citizenDto.registeredAddress) && fr.t.c(this.residenceAddresses, citizenDto.residenceAddresses) && fr.t.c(this.secondName, citizenDto.secondName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public int hashCode() {
        int iHashCode = ((((((this.birthDate.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.pesel.hashCode()) * 31;
        String str = this.additionalNames;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CitizenAddressDto citizenAddressDto = this.address;
        int iHashCode3 = (iHashCode2 + (citizenAddressDto == null ? 0 : citizenAddressDto.hashCode())) * 31;
        String str2 = this.citizenshipCode;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.citizenshipDescription;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.documentNumber;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.documentType;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.registerCode;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.registerName;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        CitizenAddressDto citizenAddressDto2 = this.registeredAddress;
        int iHashCode10 = (iHashCode9 + (citizenAddressDto2 == null ? 0 : citizenAddressDto2.hashCode())) * 31;
        List<ResidenceAddressDto> list = this.residenceAddresses;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.secondName;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRegisterCode() {
        return this.registerCode;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getRegisterName() {
        return this.registerName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final CitizenAddressDto getRegisteredAddress() {
        return this.registeredAddress;
    }

    public final List<ResidenceAddressDto> n() {
        return this.residenceAddresses;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    public String toString() {
        return "CitizenDto(birthDate=" + this.birthDate + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", pesel=" + this.pesel + ", additionalNames=" + this.additionalNames + ", address=" + this.address + ", citizenshipCode=" + this.citizenshipCode + ", citizenshipDescription=" + this.citizenshipDescription + ", documentNumber=" + this.documentNumber + ", documentType=" + this.documentType + ", registerCode=" + this.registerCode + ", registerName=" + this.registerName + ", registeredAddress=" + this.registeredAddress + ", residenceAddresses=" + this.residenceAddresses + ", secondName=" + this.secondName + ')';
    }
}
