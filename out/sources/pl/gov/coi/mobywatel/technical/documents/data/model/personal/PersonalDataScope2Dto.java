package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope2Dto;", "", "dataHeader", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;", "name", "", "surname", "picture", "secondName", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDataHeader", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;", "getName", "()Ljava/lang/String;", "getSurname", "getPicture", "getSecondName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope2Dto {

    @c("dataHeader")
    private final PersonalLegacyHeaderContainerDto dataHeader;

    @c("name")
    private final String name;

    @c("picture")
    private final String picture;

    @c("secondName")
    private final String secondName;

    @c("surname")
    private final String surname;

    public PersonalDataScope2Dto(PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4) {
        this.dataHeader = personalLegacyHeaderContainerDto;
        this.name = str;
        this.surname = str2;
        this.picture = str3;
        this.secondName = str4;
    }

    public static /* synthetic */ PersonalDataScope2Dto copy$default(PersonalDataScope2Dto personalDataScope2Dto, PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            personalLegacyHeaderContainerDto = personalDataScope2Dto.dataHeader;
        }
        if ((i15 & 2) != 0) {
            str = personalDataScope2Dto.name;
        }
        if ((i15 & 4) != 0) {
            str2 = personalDataScope2Dto.surname;
        }
        if ((i15 & 8) != 0) {
            str3 = personalDataScope2Dto.picture;
        }
        if ((i15 & 16) != 0) {
            str4 = personalDataScope2Dto.secondName;
        }
        String str5 = str4;
        String str6 = str2;
        return personalDataScope2Dto.copy(personalLegacyHeaderContainerDto, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PersonalLegacyHeaderContainerDto getDataHeader() {
        return this.dataHeader;
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
    public final String getSecondName() {
        return this.secondName;
    }

    public final PersonalDataScope2Dto copy(PersonalLegacyHeaderContainerDto dataHeader, String name, String surname, String picture, String secondName) {
        return new PersonalDataScope2Dto(dataHeader, name, surname, picture, secondName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope2Dto)) {
            return false;
        }
        PersonalDataScope2Dto personalDataScope2Dto = (PersonalDataScope2Dto) other;
        return t.c(this.dataHeader, personalDataScope2Dto.dataHeader) && t.c(this.name, personalDataScope2Dto.name) && t.c(this.surname, personalDataScope2Dto.surname) && t.c(this.picture, personalDataScope2Dto.picture) && t.c(this.secondName, personalDataScope2Dto.secondName);
    }

    public final PersonalLegacyHeaderContainerDto getDataHeader() {
        return this.dataHeader;
    }

    public final String getName() {
        return this.name;
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
        int iHashCode = ((((((this.dataHeader.hashCode() * 31) + this.name.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.picture.hashCode()) * 31;
        String str = this.secondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PersonalDataScope2Dto(dataHeader=" + this.dataHeader + ", name=" + this.name + ", surname=" + this.surname + ", picture=" + this.picture + ", secondName=" + this.secondName + ')';
    }

    public /* synthetic */ PersonalDataScope2Dto(PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4, int i15, k kVar) {
        this(personalLegacyHeaderContainerDto, str, str2, str3, (i15 & 16) != 0 ? null : str4);
    }
}
