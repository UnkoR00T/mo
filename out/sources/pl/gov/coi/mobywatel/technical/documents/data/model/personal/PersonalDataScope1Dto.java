package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jy\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00062"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope1Dto;", "", "dataHeader", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;", "name", "", "surname", "picture", "personalId", "issuer", "birthday", "Ljava/time/LocalDate;", "pesel", "personalIdExpirationDate", "birthplace", "secondName", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "getDataHeader", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;", "getName", "()Ljava/lang/String;", "getSurname", "getPicture", "getPersonalId", "getIssuer", "getBirthday", "()Ljava/time/LocalDate;", "getPesel", "getPersonalIdExpirationDate", "getBirthplace", "getSecondName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope1Dto {

    @c("birthday")
    private final LocalDate birthday;

    @c("birthplace")
    private final String birthplace;

    @c("dataHeader")
    private final PersonalLegacyHeaderContainerDto dataHeader;

    @c("issuer")
    private final String issuer;

    @c("name")
    private final String name;

    @c("personalId")
    private final String personalId;

    @c("personalIdExpirationDate")
    private final LocalDate personalIdExpirationDate;

    @c("pesel")
    private final String pesel;

    @c("picture")
    private final String picture;

    @c("secondName")
    private final String secondName;

    @c("surname")
    private final String surname;

    public PersonalDataScope1Dto(PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, LocalDate localDate2, String str7, String str8) {
        this.dataHeader = personalLegacyHeaderContainerDto;
        this.name = str;
        this.surname = str2;
        this.picture = str3;
        this.personalId = str4;
        this.issuer = str5;
        this.birthday = localDate;
        this.pesel = str6;
        this.personalIdExpirationDate = localDate2;
        this.birthplace = str7;
        this.secondName = str8;
    }

    public static /* synthetic */ PersonalDataScope1Dto copy$default(PersonalDataScope1Dto personalDataScope1Dto, PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, LocalDate localDate2, String str7, String str8, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            personalLegacyHeaderContainerDto = personalDataScope1Dto.dataHeader;
        }
        if ((i15 & 2) != 0) {
            str = personalDataScope1Dto.name;
        }
        if ((i15 & 4) != 0) {
            str2 = personalDataScope1Dto.surname;
        }
        if ((i15 & 8) != 0) {
            str3 = personalDataScope1Dto.picture;
        }
        if ((i15 & 16) != 0) {
            str4 = personalDataScope1Dto.personalId;
        }
        if ((i15 & 32) != 0) {
            str5 = personalDataScope1Dto.issuer;
        }
        if ((i15 & 64) != 0) {
            localDate = personalDataScope1Dto.birthday;
        }
        if ((i15 & 128) != 0) {
            str6 = personalDataScope1Dto.pesel;
        }
        if ((i15 & 256) != 0) {
            localDate2 = personalDataScope1Dto.personalIdExpirationDate;
        }
        if ((i15 & 512) != 0) {
            str7 = personalDataScope1Dto.birthplace;
        }
        if ((i15 & 1024) != 0) {
            str8 = personalDataScope1Dto.secondName;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        LocalDate localDate3 = localDate2;
        String str12 = str5;
        LocalDate localDate4 = localDate;
        String str13 = str4;
        String str14 = str2;
        return personalDataScope1Dto.copy(personalLegacyHeaderContainerDto, str, str14, str3, str13, str12, localDate4, str11, localDate3, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PersonalLegacyHeaderContainerDto getDataHeader() {
        return this.dataHeader;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBirthplace() {
        return this.birthplace;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPersonalId() {
        return this.personalId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LocalDate getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final LocalDate getPersonalIdExpirationDate() {
        return this.personalIdExpirationDate;
    }

    public final PersonalDataScope1Dto copy(PersonalLegacyHeaderContainerDto dataHeader, String name, String surname, String picture, String personalId, String issuer, LocalDate birthday, String pesel, LocalDate personalIdExpirationDate, String birthplace, String secondName) {
        return new PersonalDataScope1Dto(dataHeader, name, surname, picture, personalId, issuer, birthday, pesel, personalIdExpirationDate, birthplace, secondName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope1Dto)) {
            return false;
        }
        PersonalDataScope1Dto personalDataScope1Dto = (PersonalDataScope1Dto) other;
        return t.c(this.dataHeader, personalDataScope1Dto.dataHeader) && t.c(this.name, personalDataScope1Dto.name) && t.c(this.surname, personalDataScope1Dto.surname) && t.c(this.picture, personalDataScope1Dto.picture) && t.c(this.personalId, personalDataScope1Dto.personalId) && t.c(this.issuer, personalDataScope1Dto.issuer) && t.c(this.birthday, personalDataScope1Dto.birthday) && t.c(this.pesel, personalDataScope1Dto.pesel) && t.c(this.personalIdExpirationDate, personalDataScope1Dto.personalIdExpirationDate) && t.c(this.birthplace, personalDataScope1Dto.birthplace) && t.c(this.secondName, personalDataScope1Dto.secondName);
    }

    public final LocalDate getBirthday() {
        return this.birthday;
    }

    public final String getBirthplace() {
        return this.birthplace;
    }

    public final PersonalLegacyHeaderContainerDto getDataHeader() {
        return this.dataHeader;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPersonalId() {
        return this.personalId;
    }

    public final LocalDate getPersonalIdExpirationDate() {
        return this.personalIdExpirationDate;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.dataHeader.hashCode() * 31) + this.name.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.picture.hashCode()) * 31) + this.personalId.hashCode()) * 31) + this.issuer.hashCode()) * 31) + this.birthday.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.personalIdExpirationDate.hashCode()) * 31) + this.birthplace.hashCode()) * 31;
        String str = this.secondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PersonalDataScope1Dto(dataHeader=" + this.dataHeader + ", name=" + this.name + ", surname=" + this.surname + ", picture=" + this.picture + ", personalId=" + this.personalId + ", issuer=" + this.issuer + ", birthday=" + this.birthday + ", pesel=" + this.pesel + ", personalIdExpirationDate=" + this.personalIdExpirationDate + ", birthplace=" + this.birthplace + ", secondName=" + this.secondName + ')';
    }

    public /* synthetic */ PersonalDataScope1Dto(PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, LocalDate localDate2, String str7, String str8, int i15, k kVar) {
        this(personalLegacyHeaderContainerDto, str, str2, str3, str4, str5, localDate, str6, localDate2, str7, (i15 & 1024) != 0 ? null : str8);
    }
}
