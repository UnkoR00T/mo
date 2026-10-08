package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgm0/m;", "", "", "documentId", "documentNumber", "Lgm0/w1;", "restrictions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgm0/w1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lgm0/w1;", "()Lgm0/w1;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankRestrictionPassportDocumentRestrictionDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentId")
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentNumber")
    private final String documentNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("restrictions")
    private final DocumentRestrictionsDto restrictions;

    public BankRestrictionPassportDocumentRestrictionDto() {
        this(null, null, null, 7, null);
    }

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
        if (!(other instanceof BankRestrictionPassportDocumentRestrictionDto)) {
            return false;
        }
        BankRestrictionPassportDocumentRestrictionDto bankRestrictionPassportDocumentRestrictionDto = (BankRestrictionPassportDocumentRestrictionDto) other;
        return fr.t.c(this.documentId, bankRestrictionPassportDocumentRestrictionDto.documentId) && fr.t.c(this.documentNumber, bankRestrictionPassportDocumentRestrictionDto.documentNumber) && fr.t.c(this.restrictions, bankRestrictionPassportDocumentRestrictionDto.restrictions);
    }

    public int hashCode() {
        String str = this.documentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.documentNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DocumentRestrictionsDto documentRestrictionsDto = this.restrictions;
        return iHashCode2 + (documentRestrictionsDto != null ? documentRestrictionsDto.hashCode() : 0);
    }

    public String toString() {
        return "BankRestrictionPassportDocumentRestrictionDto(documentId=" + this.documentId + ", documentNumber=" + this.documentNumber + ", restrictions=" + this.restrictions + ')';
    }

    public BankRestrictionPassportDocumentRestrictionDto(String str, String str2, DocumentRestrictionsDto documentRestrictionsDto) {
        this.documentId = str;
        this.documentNumber = str2;
        this.restrictions = documentRestrictionsDto;
    }

    public /* synthetic */ BankRestrictionPassportDocumentRestrictionDto(String str, String str2, DocumentRestrictionsDto documentRestrictionsDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : documentRestrictionsDto);
    }
}
