package al0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.v0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lal0/v0;", "", "Lal0/u0;", "document", "", "documentId", "Lal0/x;", "restrictions", "<init>", "(Lal0/u0;Ljava/lang/String;Lal0/x;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/u0;", "()Lal0/u0;", "b", "Ljava/lang/String;", "c", "Lal0/x;", "()Lal0/x;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardRestrictions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhysicalIdCard document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentRestrictions restrictions;

    public PhysicalIdCardRestrictions() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PhysicalIdCard getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentRestrictions getRestrictions() {
        return this.restrictions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalIdCardRestrictions)) {
            return false;
        }
        PhysicalIdCardRestrictions physicalIdCardRestrictions = (PhysicalIdCardRestrictions) other;
        return fr.t.c(this.document, physicalIdCardRestrictions.document) && fr.t.c(this.documentId, physicalIdCardRestrictions.documentId) && fr.t.c(this.restrictions, physicalIdCardRestrictions.restrictions);
    }

    public int hashCode() {
        PhysicalIdCard physicalIdCard = this.document;
        int iHashCode = (physicalIdCard == null ? 0 : physicalIdCard.hashCode()) * 31;
        String str = this.documentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DocumentRestrictions documentRestrictions = this.restrictions;
        return iHashCode2 + (documentRestrictions != null ? documentRestrictions.hashCode() : 0);
    }

    public String toString() {
        return "PhysicalIdCardRestrictions(document=" + this.document + ", documentId=" + this.documentId + ", restrictions=" + this.restrictions + ")";
    }

    public PhysicalIdCardRestrictions(PhysicalIdCard physicalIdCard, String str, DocumentRestrictions documentRestrictions) {
        this.document = physicalIdCard;
        this.documentId = str;
        this.restrictions = documentRestrictions;
    }

    public /* synthetic */ PhysicalIdCardRestrictions(PhysicalIdCard physicalIdCard, String str, DocumentRestrictions documentRestrictions, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : physicalIdCard, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : documentRestrictions);
    }
}
