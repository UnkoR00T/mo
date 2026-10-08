package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.Date;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/JuniorSchoolCardContainerDto;", "", "name", "", "secondName", "surname", "pesel", "dateOfBirth", "Ljava/util/Date;", "issueDate", "expirationDate", "disability", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Z)V", "getName", "()Ljava/lang/String;", "getSecondName", "getSurname", "getPesel", "getDateOfBirth", "()Ljava/util/Date;", "getIssueDate", "getExpirationDate", "getDisability", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorSchoolCardContainerDto {

    @c("dateOfBirth")
    private final Date dateOfBirth;

    @c("disability")
    private final boolean disability;

    @c("expirationDate")
    private final Date expirationDate;

    @c("issueDate")
    private final Date issueDate;

    @c("firstName")
    private final String name;

    @c("pesel")
    private final String pesel;

    @c("secondName")
    private final String secondName;

    @c("lastName")
    private final String surname;

    public JuniorSchoolCardContainerDto(String str, String str2, String str3, String str4, Date date, Date date2, Date date3, boolean z15) {
        this.name = str;
        this.secondName = str2;
        this.surname = str3;
        this.pesel = str4;
        this.dateOfBirth = date;
        this.issueDate = date2;
        this.expirationDate = date3;
        this.disability = z15;
    }

    public static /* synthetic */ JuniorSchoolCardContainerDto copy$default(JuniorSchoolCardContainerDto juniorSchoolCardContainerDto, String str, String str2, String str3, String str4, Date date, Date date2, Date date3, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = juniorSchoolCardContainerDto.name;
        }
        if ((i15 & 2) != 0) {
            str2 = juniorSchoolCardContainerDto.secondName;
        }
        if ((i15 & 4) != 0) {
            str3 = juniorSchoolCardContainerDto.surname;
        }
        if ((i15 & 8) != 0) {
            str4 = juniorSchoolCardContainerDto.pesel;
        }
        if ((i15 & 16) != 0) {
            date = juniorSchoolCardContainerDto.dateOfBirth;
        }
        if ((i15 & 32) != 0) {
            date2 = juniorSchoolCardContainerDto.issueDate;
        }
        if ((i15 & 64) != 0) {
            date3 = juniorSchoolCardContainerDto.expirationDate;
        }
        if ((i15 & 128) != 0) {
            z15 = juniorSchoolCardContainerDto.disability;
        }
        Date date4 = date3;
        boolean z16 = z15;
        Date date5 = date;
        Date date6 = date2;
        return juniorSchoolCardContainerDto.copy(str, str2, str3, str4, date5, date6, date4, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDisability() {
        return this.disability;
    }

    public final JuniorSchoolCardContainerDto copy(String name, String secondName, String surname, String pesel, Date dateOfBirth, Date issueDate, Date expirationDate, boolean disability) {
        return new JuniorSchoolCardContainerDto(name, secondName, surname, pesel, dateOfBirth, issueDate, expirationDate, disability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JuniorSchoolCardContainerDto)) {
            return false;
        }
        JuniorSchoolCardContainerDto juniorSchoolCardContainerDto = (JuniorSchoolCardContainerDto) other;
        return t.c(this.name, juniorSchoolCardContainerDto.name) && t.c(this.secondName, juniorSchoolCardContainerDto.secondName) && t.c(this.surname, juniorSchoolCardContainerDto.surname) && t.c(this.pesel, juniorSchoolCardContainerDto.pesel) && t.c(this.dateOfBirth, juniorSchoolCardContainerDto.dateOfBirth) && t.c(this.issueDate, juniorSchoolCardContainerDto.issueDate) && t.c(this.expirationDate, juniorSchoolCardContainerDto.expirationDate) && this.disability == juniorSchoolCardContainerDto.disability;
    }

    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final boolean getDisability() {
        return this.disability;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final Date getIssueDate() {
        return this.issueDate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.secondName;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.surname.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.issueDate.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + Boolean.hashCode(this.disability);
    }

    public String toString() {
        return "JuniorSchoolCardContainerDto(name=" + this.name + ", secondName=" + this.secondName + ", surname=" + this.surname + ", pesel=" + this.pesel + ", dateOfBirth=" + this.dateOfBirth + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", disability=" + this.disability + ')';
    }
}
