package ck0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0012R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010\u0012¨\u00063"}, d2 = {"Lck0/r;", "", "Lck0/p;", "accounting", "", "entryId", "fullName", "Lck0/v;", "insurance", "abbreviatedName", "", "activityCategoryCodes", "Lck0/m;", "electronicDelivery", "mainActivityCategoryCode", "<init>", "(Lck0/p;Ljava/lang/String;Ljava/lang/String;Lck0/v;Ljava/lang/String;Ljava/util/List;Lck0/m;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lck0/p;", "getAccounting", "()Lck0/p;", "b", "Ljava/lang/String;", "getEntryId", "c", "getFullName", "d", "Lck0/v;", "getInsurance", "()Lck0/v;", "e", "getAbbreviatedName", "f", "Ljava/util/List;", "getActivityCategoryCodes", "()Ljava/util/List;", "g", "Lck0/m;", "getElectronicDelivery", "()Lck0/m;", "h", "getMainActivityCategoryCode", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationManagementCompanyDetailsInputDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("accounting")
    private final CompanyApplicationManagementAccountingInputDto accounting;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("entryId")
    private final String entryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insurance")
    private final CompanyApplicationManagementInsuranceInputDto insurance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("abbreviatedName")
    private final String abbreviatedName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("activityCategoryCodes")
    private final List<String> activityCategoryCodes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("electronicDelivery")
    private final CompanyApplicationElectronicDeliveryInputDto electronicDelivery;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mainActivityCategoryCode")
    private final String mainActivityCategoryCode;

    public CompanyApplicationManagementCompanyDetailsInputDto(CompanyApplicationManagementAccountingInputDto companyApplicationManagementAccountingInputDto, String str, String str2, CompanyApplicationManagementInsuranceInputDto companyApplicationManagementInsuranceInputDto, String str3, List<String> list, CompanyApplicationElectronicDeliveryInputDto companyApplicationElectronicDeliveryInputDto, String str4) {
        this.accounting = companyApplicationManagementAccountingInputDto;
        this.entryId = str;
        this.fullName = str2;
        this.insurance = companyApplicationManagementInsuranceInputDto;
        this.abbreviatedName = str3;
        this.activityCategoryCodes = list;
        this.electronicDelivery = companyApplicationElectronicDeliveryInputDto;
        this.mainActivityCategoryCode = str4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationManagementCompanyDetailsInputDto)) {
            return false;
        }
        CompanyApplicationManagementCompanyDetailsInputDto companyApplicationManagementCompanyDetailsInputDto = (CompanyApplicationManagementCompanyDetailsInputDto) other;
        return fr.t.c(this.accounting, companyApplicationManagementCompanyDetailsInputDto.accounting) && fr.t.c(this.entryId, companyApplicationManagementCompanyDetailsInputDto.entryId) && fr.t.c(this.fullName, companyApplicationManagementCompanyDetailsInputDto.fullName) && fr.t.c(this.insurance, companyApplicationManagementCompanyDetailsInputDto.insurance) && fr.t.c(this.abbreviatedName, companyApplicationManagementCompanyDetailsInputDto.abbreviatedName) && fr.t.c(this.activityCategoryCodes, companyApplicationManagementCompanyDetailsInputDto.activityCategoryCodes) && fr.t.c(this.electronicDelivery, companyApplicationManagementCompanyDetailsInputDto.electronicDelivery) && fr.t.c(this.mainActivityCategoryCode, companyApplicationManagementCompanyDetailsInputDto.mainActivityCategoryCode);
    }

    public int hashCode() {
        int iHashCode = ((((((this.accounting.hashCode() * 31) + this.entryId.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.insurance.hashCode()) * 31;
        String str = this.abbreviatedName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.activityCategoryCodes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CompanyApplicationElectronicDeliveryInputDto companyApplicationElectronicDeliveryInputDto = this.electronicDelivery;
        int iHashCode4 = (iHashCode3 + (companyApplicationElectronicDeliveryInputDto == null ? 0 : companyApplicationElectronicDeliveryInputDto.hashCode())) * 31;
        String str2 = this.mainActivityCategoryCode;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CompanyApplicationManagementCompanyDetailsInputDto(accounting=" + this.accounting + ", entryId=" + this.entryId + ", fullName=" + this.fullName + ", insurance=" + this.insurance + ", abbreviatedName=" + this.abbreviatedName + ", activityCategoryCodes=" + this.activityCategoryCodes + ", electronicDelivery=" + this.electronicDelivery + ", mainActivityCategoryCode=" + this.mainActivityCategoryCode + ')';
    }
}
