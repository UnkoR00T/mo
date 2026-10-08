package dg0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dg0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Ldg0/a;", "", "", "documentId", "Lvf0/c;", "documentStatus", "scopeName", "Ldg0/c;", "scopeData", "<init>", "(Ljava/lang/String;Lvf0/c;Ljava/lang/String;Ldg0/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvf0/c;", "()Lvf0/c;", "c", "d", "Ldg0/c;", "()Ldg0/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UutCardDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final vf0.c documentStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scopeName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final UutCardScope scopeData;

    public UutCardDocument(String str, vf0.c cVar, String str2, UutCardScope uutCardScope) {
        this.documentId = str;
        this.documentStatus = cVar;
        this.scopeName = str2;
        this.scopeData = uutCardScope;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vf0.c getDocumentStatus() {
        return this.documentStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UutCardScope getScopeData() {
        return this.scopeData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getScopeName() {
        return this.scopeName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UutCardDocument)) {
            return false;
        }
        UutCardDocument uutCardDocument = (UutCardDocument) other;
        return t.c(this.documentId, uutCardDocument.documentId) && this.documentStatus == uutCardDocument.documentStatus && t.c(this.scopeName, uutCardDocument.scopeName) && t.c(this.scopeData, uutCardDocument.scopeData);
    }

    public int hashCode() {
        return (((((this.documentId.hashCode() * 31) + this.documentStatus.hashCode()) * 31) + this.scopeName.hashCode()) * 31) + this.scopeData.hashCode();
    }

    public String toString() {
        return "UutCardDocument(documentId=" + this.documentId + ", documentStatus=" + this.documentStatus + ", scopeName=" + this.scopeName + ", scopeData=" + this.scopeData + ")";
    }
}
