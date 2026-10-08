package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lck0/m;", "", "Lck0/h1;", "nonPublicSupplierInput", "Lck0/k1;", "publicSupplierInput", "<init>", "(Lck0/h1;Lck0/k1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lck0/h1;", "getNonPublicSupplierInput", "()Lck0/h1;", "b", "Lck0/k1;", "getPublicSupplierInput", "()Lck0/k1;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationElectronicDeliveryInputDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nonPublicSupplierInput")
    private final NonPublicSupplierInputDto nonPublicSupplierInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("publicSupplierInput")
    private final PublicSupplierInputDto publicSupplierInput;

    /* JADX WARN: Multi-variable type inference failed */
    public CompanyApplicationElectronicDeliveryInputDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationElectronicDeliveryInputDto)) {
            return false;
        }
        CompanyApplicationElectronicDeliveryInputDto companyApplicationElectronicDeliveryInputDto = (CompanyApplicationElectronicDeliveryInputDto) other;
        return fr.t.c(this.nonPublicSupplierInput, companyApplicationElectronicDeliveryInputDto.nonPublicSupplierInput) && fr.t.c(this.publicSupplierInput, companyApplicationElectronicDeliveryInputDto.publicSupplierInput);
    }

    public int hashCode() {
        NonPublicSupplierInputDto nonPublicSupplierInputDto = this.nonPublicSupplierInput;
        int iHashCode = (nonPublicSupplierInputDto == null ? 0 : nonPublicSupplierInputDto.hashCode()) * 31;
        PublicSupplierInputDto publicSupplierInputDto = this.publicSupplierInput;
        return iHashCode + (publicSupplierInputDto != null ? publicSupplierInputDto.hashCode() : 0);
    }

    public String toString() {
        return "CompanyApplicationElectronicDeliveryInputDto(nonPublicSupplierInput=" + this.nonPublicSupplierInput + ", publicSupplierInput=" + this.publicSupplierInput + ')';
    }

    public CompanyApplicationElectronicDeliveryInputDto(NonPublicSupplierInputDto nonPublicSupplierInputDto, PublicSupplierInputDto publicSupplierInputDto) {
        this.nonPublicSupplierInput = nonPublicSupplierInputDto;
        this.publicSupplierInput = publicSupplierInputDto;
    }

    public /* synthetic */ CompanyApplicationElectronicDeliveryInputDto(NonPublicSupplierInputDto nonPublicSupplierInputDto, PublicSupplierInputDto publicSupplierInputDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : nonPublicSupplierInputDto, (i15 & 2) != 0 ? null : publicSupplierInputDto);
    }
}
