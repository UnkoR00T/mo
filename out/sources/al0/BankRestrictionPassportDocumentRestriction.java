package al0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lal0/p;", "", "", "documentId", "documentNumber", "Lal0/x;", "restrictions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lal0/x;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getDocumentNumber", "c", "Lal0/x;", "()Lal0/x;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankRestrictionPassportDocumentRestriction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentRestrictions restrictions;

    public BankRestrictionPassportDocumentRestriction(String str, String str2, DocumentRestrictions documentRestrictions) {
        this.documentId = str;
        this.documentNumber = str2;
        this.restrictions = documentRestrictions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentRestrictions getRestrictions() {
        return this.restrictions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankRestrictionPassportDocumentRestriction)) {
            return false;
        }
        BankRestrictionPassportDocumentRestriction bankRestrictionPassportDocumentRestriction = (BankRestrictionPassportDocumentRestriction) other;
        return fr.t.c(this.documentId, bankRestrictionPassportDocumentRestriction.documentId) && fr.t.c(this.documentNumber, bankRestrictionPassportDocumentRestriction.documentNumber) && fr.t.c(this.restrictions, bankRestrictionPassportDocumentRestriction.restrictions);
    }

    public int hashCode() {
        String str = this.documentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.documentNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DocumentRestrictions documentRestrictions = this.restrictions;
        return iHashCode2 + (documentRestrictions != null ? documentRestrictions.hashCode() : 0);
    }

    public String toString() {
        return "BankRestrictionPassportDocumentRestriction(documentId=" + this.documentId + ", documentNumber=" + this.documentNumber + ", restrictions=" + this.restrictions + ")";
    }
}
