package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.z, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lck0/z;", "", "Lck0/e;", "documentationStorageAddress", "", "taxOfficeHeadName", "Lck0/i0;", "taxType", "externalOperatorName", "externalOperatorNip", "<init>", "(Lck0/e;Ljava/lang/String;Lck0/i0;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lck0/e;", "getDocumentationStorageAddress", "()Lck0/e;", "b", "Ljava/lang/String;", "getTaxOfficeHeadName", "c", "Lck0/i0;", "getTaxType", "()Lck0/i0;", "d", "getExternalOperatorName", "e", "getExternalOperatorNip", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationSetupAccountingInputDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentationStorageAddress")
    private final CompanyApplicationAddressDto documentationStorageAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("taxOfficeHeadName")
    private final String taxOfficeHeadName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("taxType")
    private final i0 taxType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("externalOperatorName")
    private final String externalOperatorName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("externalOperatorNip")
    private final String externalOperatorNip;

    public CompanyApplicationSetupAccountingInputDto(CompanyApplicationAddressDto companyApplicationAddressDto, String str, i0 i0Var, String str2, String str3) {
        this.documentationStorageAddress = companyApplicationAddressDto;
        this.taxOfficeHeadName = str;
        this.taxType = i0Var;
        this.externalOperatorName = str2;
        this.externalOperatorNip = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationSetupAccountingInputDto)) {
            return false;
        }
        CompanyApplicationSetupAccountingInputDto companyApplicationSetupAccountingInputDto = (CompanyApplicationSetupAccountingInputDto) other;
        return fr.t.c(this.documentationStorageAddress, companyApplicationSetupAccountingInputDto.documentationStorageAddress) && fr.t.c(this.taxOfficeHeadName, companyApplicationSetupAccountingInputDto.taxOfficeHeadName) && this.taxType == companyApplicationSetupAccountingInputDto.taxType && fr.t.c(this.externalOperatorName, companyApplicationSetupAccountingInputDto.externalOperatorName) && fr.t.c(this.externalOperatorNip, companyApplicationSetupAccountingInputDto.externalOperatorNip);
    }

    public int hashCode() {
        int iHashCode = ((((this.documentationStorageAddress.hashCode() * 31) + this.taxOfficeHeadName.hashCode()) * 31) + this.taxType.hashCode()) * 31;
        String str = this.externalOperatorName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.externalOperatorNip;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CompanyApplicationSetupAccountingInputDto(documentationStorageAddress=" + this.documentationStorageAddress + ", taxOfficeHeadName=" + this.taxOfficeHeadName + ", taxType=" + this.taxType + ", externalOperatorName=" + this.externalOperatorName + ", externalOperatorNip=" + this.externalOperatorNip + ')';
    }
}
