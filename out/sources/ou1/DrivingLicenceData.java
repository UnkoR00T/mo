package ou1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ou1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0014\u0010\f¨\u0006\u001e"}, d2 = {"Lou1/f;", "", "Lou1/a;", "document", "", "scopeName", "Lou1/h;", "scope", "documentId", "<init>", "(Lou1/a;Ljava/lang/String;Lou1/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lou1/a;", "getDocument", "()Lou1/a;", "b", "Ljava/lang/String;", "c", "Lou1/h;", "()Lou1/h;", "d", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scopeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DrivingLicenceScope scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    public DrivingLicenceData(Document document, String str, DrivingLicenceScope hVar, String str2) {
        this.document = document;
        this.scopeName = str;
        this.scope = hVar;
        this.documentId = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DrivingLicenceScope getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getScopeName() {
        return this.scopeName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceData)) {
            return false;
        }
        DrivingLicenceData drivingLicenceData = (DrivingLicenceData) other;
        return t.c(this.document, drivingLicenceData.document) && t.c(this.scopeName, drivingLicenceData.scopeName) && t.c(this.scope, drivingLicenceData.scope) && t.c(this.documentId, drivingLicenceData.documentId);
    }

    public int hashCode() {
        Document document = this.document;
        return ((((((document == null ? 0 : document.hashCode()) * 31) + this.scopeName.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.documentId.hashCode();
    }

    public String toString() {
        return "DrivingLicenceData(document=" + this.document + ", scopeName=" + this.scopeName + ", scope=" + this.scope + ", documentId=" + this.documentId + ')';
    }
}
