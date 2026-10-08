package vi0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vi0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvi0/c;", "", "", "statusDescription", "caseContentDescription", "Lvi0/a;", "document", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lvi0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lvi0/a;", "getDocument", "()Lvi0/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MyCaseAdditionalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String caseContentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentData document;

    public MyCaseAdditionalData(String str, String str2, DocumentData documentData) {
        this.statusDescription = str;
        this.caseContentDescription = str2;
        this.document = documentData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCaseContentDescription() {
        return this.caseContentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStatusDescription() {
        return this.statusDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyCaseAdditionalData)) {
            return false;
        }
        MyCaseAdditionalData myCaseAdditionalData = (MyCaseAdditionalData) other;
        return t.c(this.statusDescription, myCaseAdditionalData.statusDescription) && t.c(this.caseContentDescription, myCaseAdditionalData.caseContentDescription) && t.c(this.document, myCaseAdditionalData.document);
    }

    public int hashCode() {
        String str = this.statusDescription;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.caseContentDescription;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.document.hashCode();
    }

    public String toString() {
        return "MyCaseAdditionalData(statusDescription=" + this.statusDescription + ", caseContentDescription=" + this.caseContentDescription + ", document=" + this.document + ")";
    }
}
