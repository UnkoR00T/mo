package pl.gov.coi.mobywatel.feature.userdata.data.model.passports;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\"\u0010#J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\rHÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0089\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020^HÖ\u0001J\t\u0010_\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010+¨\u0006`"}, d2 = {"Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportVisualizationDto;", "", "countryCode", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportCountryCodeDto;", "diplomaticData", "", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportDiplomaticDataDto;", "executionDate", "Ljava/time/OffsetDateTime;", "id", "", "number", "status", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportStatusDto;", "type", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportTypeDto;", "birthDate", "Ljava/time/LocalDate;", "birthPlaceFirstLine", "birthPlaceSecondLine", "citizenship", "expiryDate", "gender", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportGenderDto;", "issueDate", "issuerNameFirstLine", "issuerNameSecondLine", "nameFirstLine", "nameSecondLine", "pesel", "revocationData", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationDataDto;", "surnameFirstLine", "surnameSecondLine", "<init>", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportCountryCodeDto;Ljava/util/List;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportStatusDto;Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportTypeDto;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportGenderDto;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationDataDto;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportCountryCodeDto;", "getDiplomaticData", "()Ljava/util/List;", "getExecutionDate", "()Ljava/time/OffsetDateTime;", "getId", "()Ljava/lang/String;", "getNumber", "getStatus", "()Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportStatusDto;", "getType", "()Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportTypeDto;", "getBirthDate", "()Ljava/time/LocalDate;", "getBirthPlaceFirstLine", "getBirthPlaceSecondLine", "getCitizenship", "getExpiryDate", "getGender", "()Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportGenderDto;", "getIssueDate", "getIssuerNameFirstLine", "getIssuerNameSecondLine", "getNameFirstLine", "getNameSecondLine", "getPesel", "getRevocationData", "()Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationDataDto;", "getSurnameFirstLine", "getSurnameSecondLine", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "", "toString", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportVisualizationDto {
    public static final int $stable = 8;

    @c("birthDate")
    private final LocalDate birthDate;

    @c("birthPlaceFirstLine")
    private final String birthPlaceFirstLine;

    @c("birthPlaceSecondLine")
    private final String birthPlaceSecondLine;

    @c("citizenship")
    private final String citizenship;

    @c("countryCode")
    private final PassportCountryCodeDto countryCode;

    @c("diplomaticData")
    private final List<PassportDiplomaticDataDto> diplomaticData;

    @c("executionDate")
    private final OffsetDateTime executionDate;

    @c("expiryDate")
    private final LocalDate expiryDate;

    @c("gender")
    private final PassportGenderDto gender;

    @c("id")
    private final String id;

    @c("issueDate")
    private final OffsetDateTime issueDate;

    @c("issuerNameFirstLine")
    private final String issuerNameFirstLine;

    @c("issuerNameSecondLine")
    private final String issuerNameSecondLine;

    @c("nameFirstLine")
    private final String nameFirstLine;

    @c("nameSecondLine")
    private final String nameSecondLine;

    @c("number")
    private final String number;

    @c("pesel")
    private final String pesel;

    @c("revocationData")
    private final PassportRevocationDataDto revocationData;

    @c("status")
    private final PassportStatusDto status;

    @c("surnameFirstLine")
    private final String surnameFirstLine;

    @c("surnameSecondLine")
    private final String surnameSecondLine;

    @c("type")
    private final PassportTypeDto type;

    public PassportVisualizationDto(PassportCountryCodeDto passportCountryCodeDto, List<PassportDiplomaticDataDto> list, OffsetDateTime offsetDateTime, String str, String str2, PassportStatusDto passportStatusDto, PassportTypeDto passportTypeDto, LocalDate localDate, String str3, String str4, String str5, LocalDate localDate2, PassportGenderDto passportGenderDto, OffsetDateTime offsetDateTime2, String str6, String str7, String str8, String str9, String str10, PassportRevocationDataDto passportRevocationDataDto, String str11, String str12) {
        this.countryCode = passportCountryCodeDto;
        this.diplomaticData = list;
        this.executionDate = offsetDateTime;
        this.id = str;
        this.number = str2;
        this.status = passportStatusDto;
        this.type = passportTypeDto;
        this.birthDate = localDate;
        this.birthPlaceFirstLine = str3;
        this.birthPlaceSecondLine = str4;
        this.citizenship = str5;
        this.expiryDate = localDate2;
        this.gender = passportGenderDto;
        this.issueDate = offsetDateTime2;
        this.issuerNameFirstLine = str6;
        this.issuerNameSecondLine = str7;
        this.nameFirstLine = str8;
        this.nameSecondLine = str9;
        this.pesel = str10;
        this.revocationData = passportRevocationDataDto;
        this.surnameFirstLine = str11;
        this.surnameSecondLine = str12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PassportVisualizationDto copy$default(PassportVisualizationDto passportVisualizationDto, PassportCountryCodeDto passportCountryCodeDto, List list, OffsetDateTime offsetDateTime, String str, String str2, PassportStatusDto passportStatusDto, PassportTypeDto passportTypeDto, LocalDate localDate, String str3, String str4, String str5, LocalDate localDate2, PassportGenderDto passportGenderDto, OffsetDateTime offsetDateTime2, String str6, String str7, String str8, String str9, String str10, PassportRevocationDataDto passportRevocationDataDto, String str11, String str12, int i15, Object obj) {
        String str13;
        String str14;
        PassportCountryCodeDto passportCountryCodeDto2 = (i15 & 1) != 0 ? passportVisualizationDto.countryCode : passportCountryCodeDto;
        List list2 = (i15 & 2) != 0 ? passportVisualizationDto.diplomaticData : list;
        OffsetDateTime offsetDateTime3 = (i15 & 4) != 0 ? passportVisualizationDto.executionDate : offsetDateTime;
        String str15 = (i15 & 8) != 0 ? passportVisualizationDto.id : str;
        String str16 = (i15 & 16) != 0 ? passportVisualizationDto.number : str2;
        PassportStatusDto passportStatusDto2 = (i15 & 32) != 0 ? passportVisualizationDto.status : passportStatusDto;
        PassportTypeDto passportTypeDto2 = (i15 & 64) != 0 ? passportVisualizationDto.type : passportTypeDto;
        LocalDate localDate3 = (i15 & 128) != 0 ? passportVisualizationDto.birthDate : localDate;
        String str17 = (i15 & 256) != 0 ? passportVisualizationDto.birthPlaceFirstLine : str3;
        String str18 = (i15 & 512) != 0 ? passportVisualizationDto.birthPlaceSecondLine : str4;
        String str19 = (i15 & 1024) != 0 ? passportVisualizationDto.citizenship : str5;
        LocalDate localDate4 = (i15 & 2048) != 0 ? passportVisualizationDto.expiryDate : localDate2;
        PassportGenderDto passportGenderDto2 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? passportVisualizationDto.gender : passportGenderDto;
        OffsetDateTime offsetDateTime4 = (i15 & PKIFailureInfo.certRevoked) != 0 ? passportVisualizationDto.issueDate : offsetDateTime2;
        PassportCountryCodeDto passportCountryCodeDto3 = passportCountryCodeDto2;
        String str20 = (i15 & 16384) != 0 ? passportVisualizationDto.issuerNameFirstLine : str6;
        String str21 = (i15 & 32768) != 0 ? passportVisualizationDto.issuerNameSecondLine : str7;
        String str22 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? passportVisualizationDto.nameFirstLine : str8;
        String str23 = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? passportVisualizationDto.nameSecondLine : str9;
        String str24 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? passportVisualizationDto.pesel : str10;
        PassportRevocationDataDto passportRevocationDataDto2 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? passportVisualizationDto.revocationData : passportRevocationDataDto;
        String str25 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? passportVisualizationDto.surnameFirstLine : str11;
        if ((i15 & PKIFailureInfo.badSenderNonce) != 0) {
            str14 = str25;
            str13 = passportVisualizationDto.surnameSecondLine;
        } else {
            str13 = str12;
            str14 = str25;
        }
        return passportVisualizationDto.copy(passportCountryCodeDto3, list2, offsetDateTime3, str15, str16, passportStatusDto2, passportTypeDto2, localDate3, str17, str18, str19, localDate4, passportGenderDto2, offsetDateTime4, str20, str21, str22, str23, str24, passportRevocationDataDto2, str14, str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PassportCountryCodeDto getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBirthPlaceSecondLine() {
        return this.birthPlaceSecondLine;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCitizenship() {
        return this.citizenship;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final PassportGenderDto getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final OffsetDateTime getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIssuerNameFirstLine() {
        return this.issuerNameFirstLine;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIssuerNameSecondLine() {
        return this.issuerNameSecondLine;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getNameFirstLine() {
        return this.nameFirstLine;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNameSecondLine() {
        return this.nameSecondLine;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    public final List<PassportDiplomaticDataDto> component2() {
        return this.diplomaticData;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final PassportRevocationDataDto getRevocationData() {
        return this.revocationData;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSurnameFirstLine() {
        return this.surnameFirstLine;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSurnameSecondLine() {
        return this.surnameSecondLine;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getExecutionDate() {
        return this.executionDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PassportStatusDto getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PassportTypeDto getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBirthPlaceFirstLine() {
        return this.birthPlaceFirstLine;
    }

    public final PassportVisualizationDto copy(PassportCountryCodeDto countryCode, List<PassportDiplomaticDataDto> diplomaticData, OffsetDateTime executionDate, String id5, String number, PassportStatusDto status, PassportTypeDto type, LocalDate birthDate, String birthPlaceFirstLine, String birthPlaceSecondLine, String citizenship, LocalDate expiryDate, PassportGenderDto gender, OffsetDateTime issueDate, String issuerNameFirstLine, String issuerNameSecondLine, String nameFirstLine, String nameSecondLine, String pesel, PassportRevocationDataDto revocationData, String surnameFirstLine, String surnameSecondLine) {
        return new PassportVisualizationDto(countryCode, diplomaticData, executionDate, id5, number, status, type, birthDate, birthPlaceFirstLine, birthPlaceSecondLine, citizenship, expiryDate, gender, issueDate, issuerNameFirstLine, issuerNameSecondLine, nameFirstLine, nameSecondLine, pesel, revocationData, surnameFirstLine, surnameSecondLine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportVisualizationDto)) {
            return false;
        }
        PassportVisualizationDto passportVisualizationDto = (PassportVisualizationDto) other;
        return this.countryCode == passportVisualizationDto.countryCode && t.c(this.diplomaticData, passportVisualizationDto.diplomaticData) && t.c(this.executionDate, passportVisualizationDto.executionDate) && t.c(this.id, passportVisualizationDto.id) && t.c(this.number, passportVisualizationDto.number) && this.status == passportVisualizationDto.status && this.type == passportVisualizationDto.type && t.c(this.birthDate, passportVisualizationDto.birthDate) && t.c(this.birthPlaceFirstLine, passportVisualizationDto.birthPlaceFirstLine) && t.c(this.birthPlaceSecondLine, passportVisualizationDto.birthPlaceSecondLine) && t.c(this.citizenship, passportVisualizationDto.citizenship) && t.c(this.expiryDate, passportVisualizationDto.expiryDate) && this.gender == passportVisualizationDto.gender && t.c(this.issueDate, passportVisualizationDto.issueDate) && t.c(this.issuerNameFirstLine, passportVisualizationDto.issuerNameFirstLine) && t.c(this.issuerNameSecondLine, passportVisualizationDto.issuerNameSecondLine) && t.c(this.nameFirstLine, passportVisualizationDto.nameFirstLine) && t.c(this.nameSecondLine, passportVisualizationDto.nameSecondLine) && t.c(this.pesel, passportVisualizationDto.pesel) && t.c(this.revocationData, passportVisualizationDto.revocationData) && t.c(this.surnameFirstLine, passportVisualizationDto.surnameFirstLine) && t.c(this.surnameSecondLine, passportVisualizationDto.surnameSecondLine);
    }

    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    public final String getBirthPlaceFirstLine() {
        return this.birthPlaceFirstLine;
    }

    public final String getBirthPlaceSecondLine() {
        return this.birthPlaceSecondLine;
    }

    public final String getCitizenship() {
        return this.citizenship;
    }

    public final PassportCountryCodeDto getCountryCode() {
        return this.countryCode;
    }

    public final List<PassportDiplomaticDataDto> getDiplomaticData() {
        return this.diplomaticData;
    }

    public final OffsetDateTime getExecutionDate() {
        return this.executionDate;
    }

    public final LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    public final PassportGenderDto getGender() {
        return this.gender;
    }

    public final String getId() {
        return this.id;
    }

    public final OffsetDateTime getIssueDate() {
        return this.issueDate;
    }

    public final String getIssuerNameFirstLine() {
        return this.issuerNameFirstLine;
    }

    public final String getIssuerNameSecondLine() {
        return this.issuerNameSecondLine;
    }

    public final String getNameFirstLine() {
        return this.nameFirstLine;
    }

    public final String getNameSecondLine() {
        return this.nameSecondLine;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final PassportRevocationDataDto getRevocationData() {
        return this.revocationData;
    }

    public final PassportStatusDto getStatus() {
        return this.status;
    }

    public final String getSurnameFirstLine() {
        return this.surnameFirstLine;
    }

    public final String getSurnameSecondLine() {
        return this.surnameSecondLine;
    }

    public final PassportTypeDto getType() {
        return this.type;
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
        PassportGenderDto passportGenderDto = this.gender;
        int iHashCode7 = (iHashCode6 + (passportGenderDto == null ? 0 : passportGenderDto.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.issueDate;
        int iHashCode8 = (iHashCode7 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str4 = this.issuerNameFirstLine;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.issuerNameSecondLine;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nameFirstLine;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.nameSecondLine;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pesel;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        PassportRevocationDataDto passportRevocationDataDto = this.revocationData;
        int iHashCode14 = (iHashCode13 + (passportRevocationDataDto == null ? 0 : passportRevocationDataDto.hashCode())) * 31;
        String str9 = this.surnameFirstLine;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.surnameSecondLine;
        return iHashCode15 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "PassportVisualizationDto(countryCode=" + this.countryCode + ", diplomaticData=" + this.diplomaticData + ", executionDate=" + this.executionDate + ", id=" + this.id + ", number=" + this.number + ", status=" + this.status + ", type=" + this.type + ", birthDate=" + this.birthDate + ", birthPlaceFirstLine=" + this.birthPlaceFirstLine + ", birthPlaceSecondLine=" + this.birthPlaceSecondLine + ", citizenship=" + this.citizenship + ", expiryDate=" + this.expiryDate + ", gender=" + this.gender + ", issueDate=" + this.issueDate + ", issuerNameFirstLine=" + this.issuerNameFirstLine + ", issuerNameSecondLine=" + this.issuerNameSecondLine + ", nameFirstLine=" + this.nameFirstLine + ", nameSecondLine=" + this.nameSecondLine + ", pesel=" + this.pesel + ", revocationData=" + this.revocationData + ", surnameFirstLine=" + this.surnameFirstLine + ", surnameSecondLine=" + this.surnameSecondLine + ')';
    }

    public /* synthetic */ PassportVisualizationDto(PassportCountryCodeDto passportCountryCodeDto, List list, OffsetDateTime offsetDateTime, String str, String str2, PassportStatusDto passportStatusDto, PassportTypeDto passportTypeDto, LocalDate localDate, String str3, String str4, String str5, LocalDate localDate2, PassportGenderDto passportGenderDto, OffsetDateTime offsetDateTime2, String str6, String str7, String str8, String str9, String str10, PassportRevocationDataDto passportRevocationDataDto, String str11, String str12, int i15, k kVar) {
        this(passportCountryCodeDto, list, offsetDateTime, str, str2, passportStatusDto, passportTypeDto, (i15 & 128) != 0 ? null : localDate, (i15 & 256) != 0 ? null : str3, (i15 & 512) != 0 ? null : str4, (i15 & 1024) != 0 ? null : str5, (i15 & 2048) != 0 ? null : localDate2, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : passportGenderDto, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : offsetDateTime2, (i15 & 16384) != 0 ? null : str6, (32768 & i15) != 0 ? null : str7, (65536 & i15) != 0 ? null : str8, (131072 & i15) != 0 ? null : str9, (262144 & i15) != 0 ? null : str10, (524288 & i15) != 0 ? null : passportRevocationDataDto, (1048576 & i15) != 0 ? null : str11, (i15 & PKIFailureInfo.badSenderNonce) != 0 ? null : str12);
    }
}
