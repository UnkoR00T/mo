package gm0;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.p5, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0004R\u001a\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b#\u0010\u0004R\u001a\u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\r\u00102R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b\u0014\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001a\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010:\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b0\u00102R\u001c\u0010?\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b4\u0010>R\"\u0010C\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010\u001b\u0012\u0004\bA\u0010B\u001a\u0004\b7\u0010\u001dR\u001c\u0010F\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bE\u00102R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b9\u0010\u0004R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010 \u001a\u0004\b<\u0010\u0004R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010 \u001a\u0004\b@\u0010\u0004R\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\bD\u0010\u0004R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010 \u001a\u0004\bH\u0010\u0004R\u001c\u0010S\u001a\u0004\u0018\u00010O8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bJ\u0010RR\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\bM\u0010\u0004R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010 \u001a\u0004\bP\u0010\u0004¨\u0006W"}, d2 = {"Lgm0/p5;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgm0/g5;", "a", "Lgm0/g5;", "e", "()Lgm0/g5;", "countryCode", "", "Lgm0/h5;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "diplomaticData", "Ljava/time/OffsetDateTime;", "c", "Ljava/time/OffsetDateTime;", "g", "()Ljava/time/OffsetDateTime;", "executionDate", "d", "Ljava/lang/String;", "j", "id", "p", "number", "Lgm0/l5;", "Lgm0/l5;", "s", "()Lgm0/l5;", "status", "Lgm0/n5;", "Lgm0/n5;", "v", "()Lgm0/n5;", "type", "Ljava/time/LocalDate;", "h", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "birthDate", "i", "birthPlaceFirstLine", "birthPlaceSecondLine", "k", "citizenship", "l", "expiryDate", "Lgm0/g2;", "m", "Lgm0/g2;", "()Lgm0/g2;", "gender", "n", "getIssueDate$annotations", "()V", "issueDate", "o", "getIssueDateWithoutTime", "issueDateWithoutTime", "issuerNameFirstLine", "q", "issuerNameSecondLine", "r", "nameFirstLine", "nameSecondLine", "t", "pesel", "Lgm0/o5;", "u", "Lgm0/o5;", "()Lgm0/o5;", "revocationData", "surnameFirstLine", "w", "surnameSecondLine", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportVisualizationV2Dto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("countryCode")
    private final g5 countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("diplomaticData")
    private final List<PassportDiplomaticDataV2Dto> diplomaticData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("executionDate")
    private final OffsetDateTime executionDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final l5 status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final n5 type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthDate")
    private final LocalDate birthDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthPlaceFirstLine")
    private final String birthPlaceFirstLine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthPlaceSecondLine")
    private final String birthPlaceSecondLine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("citizenship")
    private final String citizenship;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expiryDate")
    private final LocalDate expiryDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gender")
    private final g2 gender;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("issueDate")
    private final OffsetDateTime issueDate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("issueDateWithoutTime")
    private final LocalDate issueDateWithoutTime;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("issuerNameFirstLine")
    private final String issuerNameFirstLine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("issuerNameSecondLine")
    private final String issuerNameSecondLine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nameFirstLine")
    private final String nameFirstLine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nameSecondLine")
    private final String nameSecondLine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("revocationData")
    private final PassportVisualizationRevocationV2Dto revocationData;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surnameFirstLine")
    private final String surnameFirstLine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surnameSecondLine")
    private final String surnameSecondLine;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBirthPlaceFirstLine() {
        return this.birthPlaceFirstLine;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBirthPlaceSecondLine() {
        return this.birthPlaceSecondLine;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCitizenship() {
        return this.citizenship;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g5 getCountryCode() {
        return this.countryCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportVisualizationV2Dto)) {
            return false;
        }
        PassportVisualizationV2Dto passportVisualizationV2Dto = (PassportVisualizationV2Dto) other;
        return this.countryCode == passportVisualizationV2Dto.countryCode && fr.t.c(this.diplomaticData, passportVisualizationV2Dto.diplomaticData) && fr.t.c(this.executionDate, passportVisualizationV2Dto.executionDate) && fr.t.c(this.id, passportVisualizationV2Dto.id) && fr.t.c(this.number, passportVisualizationV2Dto.number) && this.status == passportVisualizationV2Dto.status && this.type == passportVisualizationV2Dto.type && fr.t.c(this.birthDate, passportVisualizationV2Dto.birthDate) && fr.t.c(this.birthPlaceFirstLine, passportVisualizationV2Dto.birthPlaceFirstLine) && fr.t.c(this.birthPlaceSecondLine, passportVisualizationV2Dto.birthPlaceSecondLine) && fr.t.c(this.citizenship, passportVisualizationV2Dto.citizenship) && fr.t.c(this.expiryDate, passportVisualizationV2Dto.expiryDate) && this.gender == passportVisualizationV2Dto.gender && fr.t.c(this.issueDate, passportVisualizationV2Dto.issueDate) && fr.t.c(this.issueDateWithoutTime, passportVisualizationV2Dto.issueDateWithoutTime) && fr.t.c(this.issuerNameFirstLine, passportVisualizationV2Dto.issuerNameFirstLine) && fr.t.c(this.issuerNameSecondLine, passportVisualizationV2Dto.issuerNameSecondLine) && fr.t.c(this.nameFirstLine, passportVisualizationV2Dto.nameFirstLine) && fr.t.c(this.nameSecondLine, passportVisualizationV2Dto.nameSecondLine) && fr.t.c(this.pesel, passportVisualizationV2Dto.pesel) && fr.t.c(this.revocationData, passportVisualizationV2Dto.revocationData) && fr.t.c(this.surnameFirstLine, passportVisualizationV2Dto.surnameFirstLine) && fr.t.c(this.surnameSecondLine, passportVisualizationV2Dto.surnameSecondLine);
    }

    public final List<PassportDiplomaticDataV2Dto> f() {
        return this.diplomaticData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final OffsetDateTime getExecutionDate() {
        return this.executionDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.countryCode.hashCode() * 31) + this.diplomaticData.hashCode()) * 31) + this.executionDate.hashCode()) * 31) + this.id.hashCode()) * 31) + this.number.hashCode()) * 31) + this.status.hashCode()) * 31) + this.type.hashCode()) * 31;
        LocalDate localDate = this.birthDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.birthPlaceFirstLine;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birthPlaceSecondLine;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.citizenship;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDate localDate2 = this.expiryDate;
        int iHashCode6 = (iHashCode5 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        g2 g2Var = this.gender;
        int iHashCode7 = (iHashCode6 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.issueDate;
        int iHashCode8 = (iHashCode7 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        LocalDate localDate3 = this.issueDateWithoutTime;
        int iHashCode9 = (iHashCode8 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        String str4 = this.issuerNameFirstLine;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.issuerNameSecondLine;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nameFirstLine;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.nameSecondLine;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pesel;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        PassportVisualizationRevocationV2Dto passportVisualizationRevocationV2Dto = this.revocationData;
        int iHashCode15 = (iHashCode14 + (passportVisualizationRevocationV2Dto == null ? 0 : passportVisualizationRevocationV2Dto.hashCode())) * 31;
        String str9 = this.surnameFirstLine;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.surnameSecondLine;
        return iHashCode16 + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final g2 getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final OffsetDateTime getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getIssuerNameFirstLine() {
        return this.issuerNameFirstLine;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getIssuerNameSecondLine() {
        return this.issuerNameSecondLine;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getNameFirstLine() {
        return this.nameFirstLine;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getNameSecondLine() {
        return this.nameSecondLine;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final PassportVisualizationRevocationV2Dto getRevocationData() {
        return this.revocationData;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final l5 getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getSurnameFirstLine() {
        return this.surnameFirstLine;
    }

    public String toString() {
        return "PassportVisualizationV2Dto(countryCode=" + this.countryCode + ", diplomaticData=" + this.diplomaticData + ", executionDate=" + this.executionDate + ", id=" + this.id + ", number=" + this.number + ", status=" + this.status + ", type=" + this.type + ", birthDate=" + this.birthDate + ", birthPlaceFirstLine=" + this.birthPlaceFirstLine + ", birthPlaceSecondLine=" + this.birthPlaceSecondLine + ", citizenship=" + this.citizenship + ", expiryDate=" + this.expiryDate + ", gender=" + this.gender + ", issueDate=" + this.issueDate + ", issueDateWithoutTime=" + this.issueDateWithoutTime + ", issuerNameFirstLine=" + this.issuerNameFirstLine + ", issuerNameSecondLine=" + this.issuerNameSecondLine + ", nameFirstLine=" + this.nameFirstLine + ", nameSecondLine=" + this.nameSecondLine + ", pesel=" + this.pesel + ", revocationData=" + this.revocationData + ", surnameFirstLine=" + this.surnameFirstLine + ", surnameSecondLine=" + this.surnameSecondLine + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSurnameSecondLine() {
        return this.surnameSecondLine;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final n5 getType() {
        return this.type;
    }
}
