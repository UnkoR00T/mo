package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgm0/l;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "documentId", "b", "documentNumber", "Lgm0/w1;", "c", "Lgm0/w1;", "()Lgm0/w1;", "restrictions", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankRestrictionDrivingLicenceResponseDrivingLicenceDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentId")
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentNumber")
    private final String documentNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("restrictions")
    private final DocumentRestrictionsDto restrictions;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentRestrictionsDto getRestrictions() {
        return this.restrictions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankRestrictionDrivingLicenceResponseDrivingLicenceDto)) {
            return false;
        }
        BankRestrictionDrivingLicenceResponseDrivingLicenceDto bankRestrictionDrivingLicenceResponseDrivingLicenceDto = (BankRestrictionDrivingLicenceResponseDrivingLicenceDto) other;
        return fr.t.c(this.documentId, bankRestrictionDrivingLicenceResponseDrivingLicenceDto.documentId) && fr.t.c(this.documentNumber, bankRestrictionDrivingLicenceResponseDrivingLicenceDto.documentNumber) && fr.t.c(this.restrictions, bankRestrictionDrivingLicenceResponseDrivingLicenceDto.restrictions);
    }

    public int hashCode() {
        int iHashCode = ((this.documentId.hashCode() * 31) + this.documentNumber.hashCode()) * 31;
        DocumentRestrictionsDto documentRestrictionsDto = this.restrictions;
        return iHashCode + (documentRestrictionsDto == null ? 0 : documentRestrictionsDto.hashCode());
    }

    public String toString() {
        return "BankRestrictionDrivingLicenceResponseDrivingLicenceDto(documentId=" + this.documentId + ", documentNumber=" + this.documentNumber + ", restrictions=" + this.restrictions + ')';
    }
}
