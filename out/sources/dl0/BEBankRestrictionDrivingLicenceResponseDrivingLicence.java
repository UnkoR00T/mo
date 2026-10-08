package dl0;

import al0.DocumentRestrictions;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dl0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ldl0/b;", "", "", "documentId", "documentNumber", "Lal0/x;", "restrictions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lal0/x;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lal0/x;", "()Lal0/x;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEBankRestrictionDrivingLicenceResponseDrivingLicence {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentRestrictions restrictions;

    public BEBankRestrictionDrivingLicenceResponseDrivingLicence(String str, String str2, DocumentRestrictions documentRestrictions) {
        this.documentId = str;
        this.documentNumber = str2;
        this.restrictions = documentRestrictions;
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
    public final DocumentRestrictions getRestrictions() {
        return this.restrictions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEBankRestrictionDrivingLicenceResponseDrivingLicence)) {
            return false;
        }
        BEBankRestrictionDrivingLicenceResponseDrivingLicence bEBankRestrictionDrivingLicenceResponseDrivingLicence = (BEBankRestrictionDrivingLicenceResponseDrivingLicence) other;
        return t.c(this.documentId, bEBankRestrictionDrivingLicenceResponseDrivingLicence.documentId) && t.c(this.documentNumber, bEBankRestrictionDrivingLicenceResponseDrivingLicence.documentNumber) && t.c(this.restrictions, bEBankRestrictionDrivingLicenceResponseDrivingLicence.restrictions);
    }

    public int hashCode() {
        int iHashCode = ((this.documentId.hashCode() * 31) + this.documentNumber.hashCode()) * 31;
        DocumentRestrictions documentRestrictions = this.restrictions;
        return iHashCode + (documentRestrictions == null ? 0 : documentRestrictions.hashCode());
    }

    public String toString() {
        return "BEBankRestrictionDrivingLicenceResponseDrivingLicence(documentId=" + this.documentId + ", documentNumber=" + this.documentNumber + ", restrictions=" + this.restrictions + ")";
    }
}
