package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import java.util.Date;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/PensionerCardContainerDto;", "", "number", "", "firstName", "secondName", "lastName", "pesel", "type", "expiredDate", "Ljava/util/Date;", "department", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getFirstName", "getSecondName", "getLastName", "getPesel", "getType", "getExpiredDate", "()Ljava/util/Date;", "getDepartment", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PensionerCardContainerDto {

    @c("sZUS")
    private final String department;

    @c("eD")
    private final Date expiredDate;

    @c("n")
    private final String firstName;

    @c("su")
    private final String lastName;

    @c("no")
    private final String number;

    @c("p")
    private final String pesel;

    @c("s")
    private final String secondName;

    @c("bT")
    private final String type;

    public PensionerCardContainerDto(String str, String str2, String str3, String str4, String str5, String str6, Date date, String str7) {
        this.number = str;
        this.firstName = str2;
        this.secondName = str3;
        this.lastName = str4;
        this.pesel = str5;
        this.type = str6;
        this.expiredDate = date;
        this.department = str7;
    }

    public static /* synthetic */ PensionerCardContainerDto copy$default(PensionerCardContainerDto pensionerCardContainerDto, String str, String str2, String str3, String str4, String str5, String str6, Date date, String str7, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = pensionerCardContainerDto.number;
        }
        if ((i15 & 2) != 0) {
            str2 = pensionerCardContainerDto.firstName;
        }
        if ((i15 & 4) != 0) {
            str3 = pensionerCardContainerDto.secondName;
        }
        if ((i15 & 8) != 0) {
            str4 = pensionerCardContainerDto.lastName;
        }
        if ((i15 & 16) != 0) {
            str5 = pensionerCardContainerDto.pesel;
        }
        if ((i15 & 32) != 0) {
            str6 = pensionerCardContainerDto.type;
        }
        if ((i15 & 64) != 0) {
            date = pensionerCardContainerDto.expiredDate;
        }
        if ((i15 & 128) != 0) {
            str7 = pensionerCardContainerDto.department;
        }
        Date date2 = date;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        return pensionerCardContainerDto.copy(str, str2, str3, str4, str9, str10, date2, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDepartment() {
        return this.department;
    }

    public final PensionerCardContainerDto copy(String number, String firstName, String secondName, String lastName, String pesel, String type, Date expiredDate, String department) {
        return new PensionerCardContainerDto(number, firstName, secondName, lastName, pesel, type, expiredDate, department);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PensionerCardContainerDto)) {
            return false;
        }
        PensionerCardContainerDto pensionerCardContainerDto = (PensionerCardContainerDto) other;
        return t.c(this.number, pensionerCardContainerDto.number) && t.c(this.firstName, pensionerCardContainerDto.firstName) && t.c(this.secondName, pensionerCardContainerDto.secondName) && t.c(this.lastName, pensionerCardContainerDto.lastName) && t.c(this.pesel, pensionerCardContainerDto.pesel) && t.c(this.type, pensionerCardContainerDto.type) && t.c(this.expiredDate, pensionerCardContainerDto.expiredDate) && t.c(this.department, pensionerCardContainerDto.department);
    }

    public final String getDepartment() {
        return this.department;
    }

    public final Date getExpiredDate() {
        return this.expiredDate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pesel;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.expiredDate;
        int iHashCode7 = (iHashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        String str7 = this.department;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "PensionerCardContainerDto(number=" + this.number + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", pesel=" + this.pesel + ", type=" + this.type + ", expiredDate=" + this.expiredDate + ", department=" + this.department + ')';
    }
}
