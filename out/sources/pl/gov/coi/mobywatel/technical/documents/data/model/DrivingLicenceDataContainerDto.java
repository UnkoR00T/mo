package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fHÆ\u0003JÃ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fHÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!¨\u0006="}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceDataContainerDto;", "", "name", "", "secondName", "surname", "birthday", "Ljava/time/LocalDate;", "birthplace", "dSC", "dS", "tcS", "", "Lpl/gov/coi/mobywatel/technical/documents/data/model/StatusChangedReasonContainerDto;", "ldId", "pn", "rD", "eD", "resG", "cat", "Lpl/gov/coi/mobywatel/technical/documents/data/model/CategoryContainerDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getSecondName", "getSurname", "getBirthday", "()Ljava/time/LocalDate;", "getBirthplace", "getDSC", "getDS", "getTcS", "()Ljava/util/List;", "getLdId", "getPn", "getRD", "getED", "getResG", "getCat", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceDataContainerDto {

    @c("birthday")
    private final LocalDate birthday;

    @c("birthplace")
    private final String birthplace;

    @c("cat")
    private final List<CategoryContainerDto> cat;

    @c("dS")
    private final String dS;

    @c("dSC")
    private final String dSC;

    @c("eD")
    private final LocalDate eD;

    @c("ldId")
    private final String ldId;

    @c("name")
    private final String name;

    @c("pn")
    private final String pn;

    @c("rD")
    private final LocalDate rD;

    @c("resG")
    private final List<String> resG;

    @c("secondName")
    private final String secondName;

    @c("surname")
    private final String surname;

    @c("tcS")
    private final List<StatusChangedReasonContainerDto> tcS;

    public DrivingLicenceDataContainerDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPn() {
        return this.pn;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final LocalDate getRD() {
        return this.rD;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final LocalDate getED() {
        return this.eD;
    }

    public final List<String> component13() {
        return this.resG;
    }

    public final List<CategoryContainerDto> component14() {
        return this.cat;
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
    public final LocalDate getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBirthplace() {
        return this.birthplace;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDSC() {
        return this.dSC;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDS() {
        return this.dS;
    }

    public final List<StatusChangedReasonContainerDto> component8() {
        return this.tcS;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLdId() {
        return this.ldId;
    }

    public final DrivingLicenceDataContainerDto copy(String name, String secondName, String surname, LocalDate birthday, String birthplace, String dSC, String dS, List<StatusChangedReasonContainerDto> tcS, String ldId, String pn4, LocalDate rD, LocalDate eD, List<String> resG, List<CategoryContainerDto> cat) {
        return new DrivingLicenceDataContainerDto(name, secondName, surname, birthday, birthplace, dSC, dS, tcS, ldId, pn4, rD, eD, resG, cat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceDataContainerDto)) {
            return false;
        }
        DrivingLicenceDataContainerDto drivingLicenceDataContainerDto = (DrivingLicenceDataContainerDto) other;
        return t.c(this.name, drivingLicenceDataContainerDto.name) && t.c(this.secondName, drivingLicenceDataContainerDto.secondName) && t.c(this.surname, drivingLicenceDataContainerDto.surname) && t.c(this.birthday, drivingLicenceDataContainerDto.birthday) && t.c(this.birthplace, drivingLicenceDataContainerDto.birthplace) && t.c(this.dSC, drivingLicenceDataContainerDto.dSC) && t.c(this.dS, drivingLicenceDataContainerDto.dS) && t.c(this.tcS, drivingLicenceDataContainerDto.tcS) && t.c(this.ldId, drivingLicenceDataContainerDto.ldId) && t.c(this.pn, drivingLicenceDataContainerDto.pn) && t.c(this.rD, drivingLicenceDataContainerDto.rD) && t.c(this.eD, drivingLicenceDataContainerDto.eD) && t.c(this.resG, drivingLicenceDataContainerDto.resG) && t.c(this.cat, drivingLicenceDataContainerDto.cat);
    }

    public final LocalDate getBirthday() {
        return this.birthday;
    }

    public final String getBirthplace() {
        return this.birthplace;
    }

    public final List<CategoryContainerDto> getCat() {
        return this.cat;
    }

    public final String getDS() {
        return this.dS;
    }

    public final String getDSC() {
        return this.dSC;
    }

    public final LocalDate getED() {
        return this.eD;
    }

    public final String getLdId() {
        return this.ldId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPn() {
        return this.pn;
    }

    public final LocalDate getRD() {
        return this.rD;
    }

    public final List<String> getResG() {
        return this.resG;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final List<StatusChangedReasonContainerDto> getTcS() {
        return this.tcS;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDate localDate = this.birthday;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str4 = this.birthplace;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dSC;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dS;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<StatusChangedReasonContainerDto> list = this.tcS;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.ldId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pn;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        LocalDate localDate2 = this.rD;
        int iHashCode11 = (iHashCode10 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.eD;
        int iHashCode12 = (iHashCode11 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        List<String> list2 = this.resG;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CategoryContainerDto> list3 = this.cat;
        return iHashCode13 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "DrivingLicenceDataContainerDto(name=" + this.name + ", secondName=" + this.secondName + ", surname=" + this.surname + ", birthday=" + this.birthday + ", birthplace=" + this.birthplace + ", dSC=" + this.dSC + ", dS=" + this.dS + ", tcS=" + this.tcS + ", ldId=" + this.ldId + ", pn=" + this.pn + ", rD=" + this.rD + ", eD=" + this.eD + ", resG=" + this.resG + ", cat=" + this.cat + ')';
    }

    public DrivingLicenceDataContainerDto(String str, String str2, String str3, LocalDate localDate, String str4, String str5, String str6, List<StatusChangedReasonContainerDto> list, String str7, String str8, LocalDate localDate2, LocalDate localDate3, List<String> list2, List<CategoryContainerDto> list3) {
        this.name = str;
        this.secondName = str2;
        this.surname = str3;
        this.birthday = localDate;
        this.birthplace = str4;
        this.dSC = str5;
        this.dS = str6;
        this.tcS = list;
        this.ldId = str7;
        this.pn = str8;
        this.rD = localDate2;
        this.eD = localDate3;
        this.resG = list2;
        this.cat = list3;
    }

    public /* synthetic */ DrivingLicenceDataContainerDto(String str, String str2, String str3, LocalDate localDate, String str4, String str5, String str6, List list, String str7, String str8, LocalDate localDate2, LocalDate localDate3, List list2, List list3, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : localDate, (i15 & 16) != 0 ? null : str4, (i15 & 32) != 0 ? null : str5, (i15 & 64) != 0 ? null : str6, (i15 & 128) != 0 ? null : list, (i15 & 256) != 0 ? null : str7, (i15 & 512) != 0 ? null : str8, (i15 & 1024) != 0 ? null : localDate2, (i15 & 2048) != 0 ? null : localDate3, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : list2, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : list3);
    }
}
