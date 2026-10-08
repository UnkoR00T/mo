package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import vl.c;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00039:;Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0085\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006<"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto;", "", "name", "", "surname", "pesel", "professionalTitle", "documentNumber", "documentName", "issuerName", "creationDate", "Ljava/time/LocalDate;", "pwzType", "Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$PwzType;", "restriction", "Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$Restriction;", "secondName", "restrictionType", "Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$RestrictionType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$PwzType;Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$Restriction;Ljava/lang/String;Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$RestrictionType;)V", "getName", "()Ljava/lang/String;", "getSurname", "getPesel", "getProfessionalTitle", "getDocumentNumber", "getDocumentName", "getIssuerName", "getCreationDate", "()Ljava/time/LocalDate;", "getPwzType", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$PwzType;", "getRestriction", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$Restriction;", "getSecondName", "getRestrictionType", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$RestrictionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "PwzType", "Restriction", "RestrictionType", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NipipDataContainerDto {

    @c("creationDate")
    private final LocalDate creationDate;

    @c("documentName")
    private final String documentName;

    @c("documentNumber")
    private final String documentNumber;

    @c("issuerName")
    private final String issuerName;

    @c("name")
    private final String name;

    @c("pesel")
    private final String pesel;

    @c("professionalTitle")
    private final String professionalTitle;

    @c("pwzType")
    private final PwzType pwzType;

    @c("restriction")
    private final Restriction restriction;

    @c("restrictionType")
    private final RestrictionType restrictionType;

    @c("secondName")
    private final String secondName;

    @c("surname")
    private final String surname;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$PwzType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MIDWIFE", "NURSE", "UNKNOWN", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum PwzType {
        MIDWIFE("MIDWIFE"),
        NURSE("NURSE"),
        UNKNOWN("UNKNOWN");

        private static final /* synthetic */ a $ENTRIES = b.a(values());
        private final String value;

        PwzType(String str) {
            this.value = str;
        }

        public static a<PwzType> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$Restriction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FULL", "PARTIAL", "UNKNOWN", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Restriction {
        FULL("FULL"),
        PARTIAL("PARTIAL"),
        UNKNOWN("UNKNOWN");

        private static final /* synthetic */ a $ENTRIES = b.a(values());
        private final String value;

        Restriction(String str) {
            this.value = str;
        }

        public static a<Restriction> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$RestrictionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RANGE", "INDIVIDUAL", "UNDER_SUPERVISION", "FIXED_TERM", "UNKNOWN", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum RestrictionType {
        RANGE("RANGE"),
        INDIVIDUAL("INDIVIDUAL"),
        UNDER_SUPERVISION("UNDER_SUPERVISION"),
        FIXED_TERM("FIXED_TERM"),
        UNKNOWN("UNKNOWN");

        private static final /* synthetic */ a $ENTRIES = b.a(values());
        private final String value;

        RestrictionType(String str) {
            this.value = str;
        }

        public static a<RestrictionType> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public NipipDataContainerDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, LocalDate localDate, PwzType pwzType, Restriction restriction, String str8, RestrictionType restrictionType) {
        this.name = str;
        this.surname = str2;
        this.pesel = str3;
        this.professionalTitle = str4;
        this.documentNumber = str5;
        this.documentName = str6;
        this.issuerName = str7;
        this.creationDate = localDate;
        this.pwzType = pwzType;
        this.restriction = restriction;
        this.secondName = str8;
        this.restrictionType = restrictionType;
    }

    public static /* synthetic */ NipipDataContainerDto copy$default(NipipDataContainerDto nipipDataContainerDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, LocalDate localDate, PwzType pwzType, Restriction restriction, String str8, RestrictionType restrictionType, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = nipipDataContainerDto.name;
        }
        if ((i15 & 2) != 0) {
            str2 = nipipDataContainerDto.surname;
        }
        if ((i15 & 4) != 0) {
            str3 = nipipDataContainerDto.pesel;
        }
        if ((i15 & 8) != 0) {
            str4 = nipipDataContainerDto.professionalTitle;
        }
        if ((i15 & 16) != 0) {
            str5 = nipipDataContainerDto.documentNumber;
        }
        if ((i15 & 32) != 0) {
            str6 = nipipDataContainerDto.documentName;
        }
        if ((i15 & 64) != 0) {
            str7 = nipipDataContainerDto.issuerName;
        }
        if ((i15 & 128) != 0) {
            localDate = nipipDataContainerDto.creationDate;
        }
        if ((i15 & 256) != 0) {
            pwzType = nipipDataContainerDto.pwzType;
        }
        if ((i15 & 512) != 0) {
            restriction = nipipDataContainerDto.restriction;
        }
        if ((i15 & 1024) != 0) {
            str8 = nipipDataContainerDto.secondName;
        }
        if ((i15 & 2048) != 0) {
            restrictionType = nipipDataContainerDto.restrictionType;
        }
        String str9 = str8;
        RestrictionType restrictionType2 = restrictionType;
        PwzType pwzType2 = pwzType;
        Restriction restriction2 = restriction;
        String str10 = str7;
        LocalDate localDate2 = localDate;
        String str11 = str5;
        String str12 = str6;
        return nipipDataContainerDto.copy(str, str2, str3, str4, str11, str12, str10, localDate2, pwzType2, restriction2, str9, restrictionType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Restriction getRestriction() {
        return this.restriction;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final RestrictionType getRestrictionType() {
        return this.restrictionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProfessionalTitle() {
        return this.professionalTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LocalDate getCreationDate() {
        return this.creationDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PwzType getPwzType() {
        return this.pwzType;
    }

    public final NipipDataContainerDto copy(String name, String surname, String pesel, String professionalTitle, String documentNumber, String documentName, String issuerName, LocalDate creationDate, PwzType pwzType, Restriction restriction, String secondName, RestrictionType restrictionType) {
        return new NipipDataContainerDto(name, surname, pesel, professionalTitle, documentNumber, documentName, issuerName, creationDate, pwzType, restriction, secondName, restrictionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NipipDataContainerDto)) {
            return false;
        }
        NipipDataContainerDto nipipDataContainerDto = (NipipDataContainerDto) other;
        return t.c(this.name, nipipDataContainerDto.name) && t.c(this.surname, nipipDataContainerDto.surname) && t.c(this.pesel, nipipDataContainerDto.pesel) && t.c(this.professionalTitle, nipipDataContainerDto.professionalTitle) && t.c(this.documentNumber, nipipDataContainerDto.documentNumber) && t.c(this.documentName, nipipDataContainerDto.documentName) && t.c(this.issuerName, nipipDataContainerDto.issuerName) && t.c(this.creationDate, nipipDataContainerDto.creationDate) && this.pwzType == nipipDataContainerDto.pwzType && this.restriction == nipipDataContainerDto.restriction && t.c(this.secondName, nipipDataContainerDto.secondName) && this.restrictionType == nipipDataContainerDto.restrictionType;
    }

    public final LocalDate getCreationDate() {
        return this.creationDate;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getIssuerName() {
        return this.issuerName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getProfessionalTitle() {
        return this.professionalTitle;
    }

    public final PwzType getPwzType() {
        return this.pwzType;
    }

    public final Restriction getRestriction() {
        return this.restriction;
    }

    public final RestrictionType getRestrictionType() {
        return this.restrictionType;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.professionalTitle.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + this.documentName.hashCode()) * 31) + this.issuerName.hashCode()) * 31) + this.creationDate.hashCode()) * 31) + this.pwzType.hashCode()) * 31) + this.restriction.hashCode()) * 31;
        String str = this.secondName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        RestrictionType restrictionType = this.restrictionType;
        return iHashCode2 + (restrictionType != null ? restrictionType.hashCode() : 0);
    }

    public String toString() {
        return "NipipDataContainerDto(name=" + this.name + ", surname=" + this.surname + ", pesel=" + this.pesel + ", professionalTitle=" + this.professionalTitle + ", documentNumber=" + this.documentNumber + ", documentName=" + this.documentName + ", issuerName=" + this.issuerName + ", creationDate=" + this.creationDate + ", pwzType=" + this.pwzType + ", restriction=" + this.restriction + ", secondName=" + this.secondName + ", restrictionType=" + this.restrictionType + ')';
    }

    public /* synthetic */ NipipDataContainerDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, LocalDate localDate, PwzType pwzType, Restriction restriction, String str8, RestrictionType restrictionType, int i15, k kVar) {
        this(str, str2, str3, str4, str5, str6, str7, localDate, pwzType, restriction, (i15 & 1024) != 0 ? null : str8, (i15 & 2048) != 0 ? null : restrictionType);
    }
}
