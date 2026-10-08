package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003JÅ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006C"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/RailwayCardContainerDataDto;", "", "cardRelation", "", "holderType", "batch", "number", "firstName", "secondName", "lastName", "pesel", "employer", "ouCategory", "trainClass", "annotation", "concession", "status", "employerCode", "validFrom", "expiryDate", "qrCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardRelation", "()Ljava/lang/String;", "getHolderType", "getBatch", "getNumber", "getFirstName", "getSecondName", "getLastName", "getPesel", "getEmployer", "getOuCategory", "getTrainClass", "getAnnotation", "getConcession", "getStatus", "getEmployerCode", "getValidFrom", "getExpiryDate", "getQrCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RailwayCardContainerDataDto {

    @c("aD")
    private final String annotation;

    @c("sr")
    private final String batch;

    @c("ot")
    private final String cardRelation;

    @c("aDi")
    private final String concession;

    @c("ti")
    private final String employer;

    @c("cC")
    private final String employerCode;

    @c("eD")
    private final String expiryDate;

    @c("n")
    private final String firstName;

    @c("ch")
    private final String holderType;

    @c("su")
    private final String lastName;

    @c("no")
    private final String number;

    @c("oc")
    private final String ouCategory;

    @c("p")
    private final String pesel;

    @c("qrC")
    private final String qrCode;

    @c("s")
    private final String secondName;

    @c("sT")
    private final String status;

    @c("kl")
    private final String trainClass;

    @c("iD")
    private final String validFrom;

    public RailwayCardContainerDataDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.cardRelation = str;
        this.holderType = str2;
        this.batch = str3;
        this.number = str4;
        this.firstName = str5;
        this.secondName = str6;
        this.lastName = str7;
        this.pesel = str8;
        this.employer = str9;
        this.ouCategory = str10;
        this.trainClass = str11;
        this.annotation = str12;
        this.concession = str13;
        this.status = str14;
        this.employerCode = str15;
        this.validFrom = str16;
        this.expiryDate = str17;
        this.qrCode = str18;
    }

    public static /* synthetic */ RailwayCardContainerDataDto copy$default(RailwayCardContainerDataDto railwayCardContainerDataDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i15, Object obj) {
        String str19;
        String str20;
        String str21 = (i15 & 1) != 0 ? railwayCardContainerDataDto.cardRelation : str;
        String str22 = (i15 & 2) != 0 ? railwayCardContainerDataDto.holderType : str2;
        String str23 = (i15 & 4) != 0 ? railwayCardContainerDataDto.batch : str3;
        String str24 = (i15 & 8) != 0 ? railwayCardContainerDataDto.number : str4;
        String str25 = (i15 & 16) != 0 ? railwayCardContainerDataDto.firstName : str5;
        String str26 = (i15 & 32) != 0 ? railwayCardContainerDataDto.secondName : str6;
        String str27 = (i15 & 64) != 0 ? railwayCardContainerDataDto.lastName : str7;
        String str28 = (i15 & 128) != 0 ? railwayCardContainerDataDto.pesel : str8;
        String str29 = (i15 & 256) != 0 ? railwayCardContainerDataDto.employer : str9;
        String str30 = (i15 & 512) != 0 ? railwayCardContainerDataDto.ouCategory : str10;
        String str31 = (i15 & 1024) != 0 ? railwayCardContainerDataDto.trainClass : str11;
        String str32 = (i15 & 2048) != 0 ? railwayCardContainerDataDto.annotation : str12;
        String str33 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? railwayCardContainerDataDto.concession : str13;
        String str34 = (i15 & PKIFailureInfo.certRevoked) != 0 ? railwayCardContainerDataDto.status : str14;
        String str35 = str21;
        String str36 = (i15 & 16384) != 0 ? railwayCardContainerDataDto.employerCode : str15;
        String str37 = (i15 & 32768) != 0 ? railwayCardContainerDataDto.validFrom : str16;
        String str38 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? railwayCardContainerDataDto.expiryDate : str17;
        if ((i15 & PKIFailureInfo.unsupportedVersion) != 0) {
            str20 = str38;
            str19 = railwayCardContainerDataDto.qrCode;
        } else {
            str19 = str18;
            str20 = str38;
        }
        return railwayCardContainerDataDto.copy(str35, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str36, str37, str20, str19);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardRelation() {
        return this.cardRelation;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOuCategory() {
        return this.ouCategory;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTrainClass() {
        return this.trainClass;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAnnotation() {
        return this.annotation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getConcession() {
        return this.concession;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getEmployerCode() {
        return this.employerCode;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getValidFrom() {
        return this.validFrom;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHolderType() {
        return this.holderType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBatch() {
        return this.batch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEmployer() {
        return this.employer;
    }

    public final RailwayCardContainerDataDto copy(String cardRelation, String holderType, String batch, String number, String firstName, String secondName, String lastName, String pesel, String employer, String ouCategory, String trainClass, String annotation, String concession, String status, String employerCode, String validFrom, String expiryDate, String qrCode) {
        return new RailwayCardContainerDataDto(cardRelation, holderType, batch, number, firstName, secondName, lastName, pesel, employer, ouCategory, trainClass, annotation, concession, status, employerCode, validFrom, expiryDate, qrCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayCardContainerDataDto)) {
            return false;
        }
        RailwayCardContainerDataDto railwayCardContainerDataDto = (RailwayCardContainerDataDto) other;
        return t.c(this.cardRelation, railwayCardContainerDataDto.cardRelation) && t.c(this.holderType, railwayCardContainerDataDto.holderType) && t.c(this.batch, railwayCardContainerDataDto.batch) && t.c(this.number, railwayCardContainerDataDto.number) && t.c(this.firstName, railwayCardContainerDataDto.firstName) && t.c(this.secondName, railwayCardContainerDataDto.secondName) && t.c(this.lastName, railwayCardContainerDataDto.lastName) && t.c(this.pesel, railwayCardContainerDataDto.pesel) && t.c(this.employer, railwayCardContainerDataDto.employer) && t.c(this.ouCategory, railwayCardContainerDataDto.ouCategory) && t.c(this.trainClass, railwayCardContainerDataDto.trainClass) && t.c(this.annotation, railwayCardContainerDataDto.annotation) && t.c(this.concession, railwayCardContainerDataDto.concession) && t.c(this.status, railwayCardContainerDataDto.status) && t.c(this.employerCode, railwayCardContainerDataDto.employerCode) && t.c(this.validFrom, railwayCardContainerDataDto.validFrom) && t.c(this.expiryDate, railwayCardContainerDataDto.expiryDate) && t.c(this.qrCode, railwayCardContainerDataDto.qrCode);
    }

    public final String getAnnotation() {
        return this.annotation;
    }

    public final String getBatch() {
        return this.batch;
    }

    public final String getCardRelation() {
        return this.cardRelation;
    }

    public final String getConcession() {
        return this.concession;
    }

    public final String getEmployer() {
        return this.employer;
    }

    public final String getEmployerCode() {
        return this.employerCode;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getHolderType() {
        return this.holderType;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getOuCategory() {
        return this.ouCategory;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTrainClass() {
        return this.trainClass;
    }

    public final String getValidFrom() {
        return this.validFrom;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.cardRelation.hashCode() * 31) + this.holderType.hashCode()) * 31) + this.batch.hashCode()) * 31) + this.number.hashCode()) * 31) + this.firstName.hashCode()) * 31;
        String str = this.secondName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.lastName.hashCode()) * 31;
        String str2 = this.pesel;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.employer.hashCode()) * 31) + this.ouCategory.hashCode()) * 31) + this.trainClass.hashCode()) * 31;
        String str3 = this.annotation;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.concession;
        return ((((((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.status.hashCode()) * 31) + this.employerCode.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.expiryDate.hashCode()) * 31) + this.qrCode.hashCode();
    }

    public String toString() {
        return "RailwayCardContainerDataDto(cardRelation=" + this.cardRelation + ", holderType=" + this.holderType + ", batch=" + this.batch + ", number=" + this.number + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", pesel=" + this.pesel + ", employer=" + this.employer + ", ouCategory=" + this.ouCategory + ", trainClass=" + this.trainClass + ", annotation=" + this.annotation + ", concession=" + this.concession + ", status=" + this.status + ", employerCode=" + this.employerCode + ", validFrom=" + this.validFrom + ", expiryDate=" + this.expiryDate + ", qrCode=" + this.qrCode + ')';
    }
}
