package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardPersonalDataContainerDto;", "", "name", "", "surname", "fatherName", "motherName", "pesel", "birthDate", "Ljava/time/LocalDate;", "citizenship", "picture", "secondName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSurname", "getFatherName", "getMotherName", "getPesel", "getBirthDate", "()Ljava/time/LocalDate;", "getCitizenship", "getPicture", "getSecondName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileIdCardPersonalDataContainerDto {

    @c("birthDate")
    private final LocalDate birthDate;

    @c("citizenship")
    private final String citizenship;

    @c("fatherName")
    private final String fatherName;

    @c("motherName")
    private final String motherName;

    @c("name")
    private final String name;

    @c("pesel")
    private final String pesel;

    @c("picture")
    private final String picture;

    @c("secondName")
    private final String secondName;

    @c("surname")
    private final String surname;

    public MobileIdCardPersonalDataContainerDto(String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, String str7, String str8) {
        this.name = str;
        this.surname = str2;
        this.fatherName = str3;
        this.motherName = str4;
        this.pesel = str5;
        this.birthDate = localDate;
        this.citizenship = str6;
        this.picture = str7;
        this.secondName = str8;
    }

    public static /* synthetic */ MobileIdCardPersonalDataContainerDto copy$default(MobileIdCardPersonalDataContainerDto mobileIdCardPersonalDataContainerDto, String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, String str7, String str8, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = mobileIdCardPersonalDataContainerDto.name;
        }
        if ((i15 & 2) != 0) {
            str2 = mobileIdCardPersonalDataContainerDto.surname;
        }
        if ((i15 & 4) != 0) {
            str3 = mobileIdCardPersonalDataContainerDto.fatherName;
        }
        if ((i15 & 8) != 0) {
            str4 = mobileIdCardPersonalDataContainerDto.motherName;
        }
        if ((i15 & 16) != 0) {
            str5 = mobileIdCardPersonalDataContainerDto.pesel;
        }
        if ((i15 & 32) != 0) {
            localDate = mobileIdCardPersonalDataContainerDto.birthDate;
        }
        if ((i15 & 64) != 0) {
            str6 = mobileIdCardPersonalDataContainerDto.citizenship;
        }
        if ((i15 & 128) != 0) {
            str7 = mobileIdCardPersonalDataContainerDto.picture;
        }
        if ((i15 & 256) != 0) {
            str8 = mobileIdCardPersonalDataContainerDto.secondName;
        }
        String str9 = str7;
        String str10 = str8;
        LocalDate localDate2 = localDate;
        String str11 = str6;
        String str12 = str5;
        String str13 = str3;
        return mobileIdCardPersonalDataContainerDto.copy(str, str2, str13, str4, str12, localDate2, str11, str9, str10);
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
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMotherName() {
        return this.motherName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCitizenship() {
        return this.citizenship;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    public final MobileIdCardPersonalDataContainerDto copy(String name, String surname, String fatherName, String motherName, String pesel, LocalDate birthDate, String citizenship, String picture, String secondName) {
        return new MobileIdCardPersonalDataContainerDto(name, surname, fatherName, motherName, pesel, birthDate, citizenship, picture, secondName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileIdCardPersonalDataContainerDto)) {
            return false;
        }
        MobileIdCardPersonalDataContainerDto mobileIdCardPersonalDataContainerDto = (MobileIdCardPersonalDataContainerDto) other;
        return t.c(this.name, mobileIdCardPersonalDataContainerDto.name) && t.c(this.surname, mobileIdCardPersonalDataContainerDto.surname) && t.c(this.fatherName, mobileIdCardPersonalDataContainerDto.fatherName) && t.c(this.motherName, mobileIdCardPersonalDataContainerDto.motherName) && t.c(this.pesel, mobileIdCardPersonalDataContainerDto.pesel) && t.c(this.birthDate, mobileIdCardPersonalDataContainerDto.birthDate) && t.c(this.citizenship, mobileIdCardPersonalDataContainerDto.citizenship) && t.c(this.picture, mobileIdCardPersonalDataContainerDto.picture) && t.c(this.secondName, mobileIdCardPersonalDataContainerDto.secondName);
    }

    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    public final String getCitizenship() {
        return this.citizenship;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final String getMotherName() {
        return this.motherName;
    }

    public final String getName() {
        return this.name;
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
        int iHashCode = ((((((((((((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.motherName.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.citizenship.hashCode()) * 31) + this.picture.hashCode()) * 31;
        String str = this.secondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MobileIdCardPersonalDataContainerDto(name=" + this.name + ", surname=" + this.surname + ", fatherName=" + this.fatherName + ", motherName=" + this.motherName + ", pesel=" + this.pesel + ", birthDate=" + this.birthDate + ", citizenship=" + this.citizenship + ", picture=" + this.picture + ", secondName=" + this.secondName + ')';
    }

    public /* synthetic */ MobileIdCardPersonalDataContainerDto(String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, String str7, String str8, int i15, k kVar) {
        this(str, str2, str3, str4, str5, localDate, str6, str7, (i15 & 256) != 0 ? null : str8);
    }
}
