package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lck0/k;", "", "Lck0/e;", "correspondenceAddress", "Lck0/d0;", "postOfficeBoxAddress", "", "recipientName", "<init>", "(Lck0/e;Lck0/d0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lck0/e;", "getCorrespondenceAddress", "()Lck0/e;", "b", "Lck0/d0;", "getPostOfficeBoxAddress", "()Lck0/d0;", "c", "Ljava/lang/String;", "getRecipientName", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationCorrespondenceInputDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("correspondenceAddress")
    private final CompanyApplicationAddressDto correspondenceAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postOfficeBoxAddress")
    private final CompanyApplicationSetupPostOfficeBoxAddressDto postOfficeBoxAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("recipientName")
    private final String recipientName;

    public CompanyApplicationCorrespondenceInputDto() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationCorrespondenceInputDto)) {
            return false;
        }
        CompanyApplicationCorrespondenceInputDto companyApplicationCorrespondenceInputDto = (CompanyApplicationCorrespondenceInputDto) other;
        return fr.t.c(this.correspondenceAddress, companyApplicationCorrespondenceInputDto.correspondenceAddress) && fr.t.c(this.postOfficeBoxAddress, companyApplicationCorrespondenceInputDto.postOfficeBoxAddress) && fr.t.c(this.recipientName, companyApplicationCorrespondenceInputDto.recipientName);
    }

    public int hashCode() {
        CompanyApplicationAddressDto companyApplicationAddressDto = this.correspondenceAddress;
        int iHashCode = (companyApplicationAddressDto == null ? 0 : companyApplicationAddressDto.hashCode()) * 31;
        CompanyApplicationSetupPostOfficeBoxAddressDto companyApplicationSetupPostOfficeBoxAddressDto = this.postOfficeBoxAddress;
        int iHashCode2 = (iHashCode + (companyApplicationSetupPostOfficeBoxAddressDto == null ? 0 : companyApplicationSetupPostOfficeBoxAddressDto.hashCode())) * 31;
        String str = this.recipientName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CompanyApplicationCorrespondenceInputDto(correspondenceAddress=" + this.correspondenceAddress + ", postOfficeBoxAddress=" + this.postOfficeBoxAddress + ", recipientName=" + this.recipientName + ')';
    }

    public CompanyApplicationCorrespondenceInputDto(CompanyApplicationAddressDto companyApplicationAddressDto, CompanyApplicationSetupPostOfficeBoxAddressDto companyApplicationSetupPostOfficeBoxAddressDto, String str) {
        this.correspondenceAddress = companyApplicationAddressDto;
        this.postOfficeBoxAddress = companyApplicationSetupPostOfficeBoxAddressDto;
        this.recipientName = str;
    }

    public /* synthetic */ CompanyApplicationCorrespondenceInputDto(CompanyApplicationAddressDto companyApplicationAddressDto, CompanyApplicationSetupPostOfficeBoxAddressDto companyApplicationSetupPostOfficeBoxAddressDto, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : companyApplicationAddressDto, (i15 & 2) != 0 ? null : companyApplicationSetupPostOfficeBoxAddressDto, (i15 & 4) != 0 ? null : str);
    }
}
