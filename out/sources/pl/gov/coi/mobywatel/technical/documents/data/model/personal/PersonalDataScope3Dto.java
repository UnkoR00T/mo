package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope3Dto;", "", "dataHeader", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;", "name", "", "surname", "picture", "personalId", "issuer", "secondName", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDataHeader", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;", "getName", "()Ljava/lang/String;", "getSurname", "getPicture", "getPersonalId", "getIssuer", "getSecondName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope3Dto {

    @c("dataHeader")
    private final PersonalLegacyHeaderContainerDto dataHeader;

    @c("issuer")
    private final String issuer;

    @c("name")
    private final String name;

    @c("personalId")
    private final String personalId;

    @c("picture")
    private final String picture;

    @c("secondName")
    private final String secondName;

    @c("surname")
    private final String surname;

    public PersonalDataScope3Dto(PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4, String str5, String str6) {
        this.dataHeader = personalLegacyHeaderContainerDto;
        this.name = str;
        this.surname = str2;
        this.picture = str3;
        this.personalId = str4;
        this.issuer = str5;
        this.secondName = str6;
    }

    public static /* synthetic */ PersonalDataScope3Dto copy$default(PersonalDataScope3Dto personalDataScope3Dto, PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4, String str5, String str6, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            personalLegacyHeaderContainerDto = personalDataScope3Dto.dataHeader;
        }
        if ((i15 & 2) != 0) {
            str = personalDataScope3Dto.name;
        }
        if ((i15 & 4) != 0) {
            str2 = personalDataScope3Dto.surname;
        }
        if ((i15 & 8) != 0) {
            str3 = personalDataScope3Dto.picture;
        }
        if ((i15 & 16) != 0) {
            str4 = personalDataScope3Dto.personalId;
        }
        if ((i15 & 32) != 0) {
            str5 = personalDataScope3Dto.issuer;
        }
        if ((i15 & 64) != 0) {
            str6 = personalDataScope3Dto.secondName;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return personalDataScope3Dto.copy(personalLegacyHeaderContainerDto, str, str10, str3, str9, str7, str8);
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
    public final String getPersonalId() {
        return this.personalId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    public final PersonalDataScope3Dto copy(PersonalLegacyHeaderContainerDto dataHeader, String name, String surname, String picture, String personalId, String issuer, String secondName) {
        return new PersonalDataScope3Dto(dataHeader, name, surname, picture, personalId, issuer, secondName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope3Dto)) {
            return false;
        }
        PersonalDataScope3Dto personalDataScope3Dto = (PersonalDataScope3Dto) other;
        return t.c(this.dataHeader, personalDataScope3Dto.dataHeader) && t.c(this.name, personalDataScope3Dto.name) && t.c(this.surname, personalDataScope3Dto.surname) && t.c(this.picture, personalDataScope3Dto.picture) && t.c(this.personalId, personalDataScope3Dto.personalId) && t.c(this.issuer, personalDataScope3Dto.issuer) && t.c(this.secondName, personalDataScope3Dto.secondName);
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
        int iHashCode = ((((((((((this.dataHeader.hashCode() * 31) + this.name.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.picture.hashCode()) * 31) + this.personalId.hashCode()) * 31) + this.issuer.hashCode()) * 31;
        String str = this.secondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PersonalDataScope3Dto(dataHeader=" + this.dataHeader + ", name=" + this.name + ", surname=" + this.surname + ", picture=" + this.picture + ", personalId=" + this.personalId + ", issuer=" + this.issuer + ", secondName=" + this.secondName + ')';
    }

    public /* synthetic */ PersonalDataScope3Dto(PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, String str, String str2, String str3, String str4, String str5, String str6, int i15, k kVar) {
        this(personalLegacyHeaderContainerDto, str, str2, str3, str4, str5, (i15 & 64) != 0 ? null : str6);
    }
}
