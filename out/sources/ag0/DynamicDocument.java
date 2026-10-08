package ag0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import vf0.c;
import yf0.DocumentSchema;

/* JADX INFO: renamed from: ag0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Lag0/a;", "", "", "documentId", "Lvf0/c;", "documentStatus", "scopeName", "Liy/b0;", "rawScopeData", "Lyf0/e;", "schemaData", "<init>", "(Ljava/lang/String;Lvf0/c;Ljava/lang/String;Liy/b0;Lyf0/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvf0/c;", "()Lvf0/c;", "c", "e", "d", "Liy/b0;", "()Liy/b0;", "Lyf0/e;", "()Lyf0/e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c documentStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scopeName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 rawScopeData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentSchema schemaData;

    public DynamicDocument(String str, c cVar, String str2, b0 b0Var, DocumentSchema documentSchema) {
        this.documentId = str;
        this.documentStatus = cVar;
        this.scopeName = str2;
        this.rawScopeData = b0Var;
        this.schemaData = documentSchema;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getDocumentStatus() {
        return this.documentStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getRawScopeData() {
        return this.rawScopeData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DocumentSchema getSchemaData() {
        return this.schemaData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScopeName() {
        return this.scopeName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocument)) {
            return false;
        }
        DynamicDocument dynamicDocument = (DynamicDocument) other;
        return t.c(this.documentId, dynamicDocument.documentId) && this.documentStatus == dynamicDocument.documentStatus && t.c(this.scopeName, dynamicDocument.scopeName) && t.c(this.rawScopeData, dynamicDocument.rawScopeData) && t.c(this.schemaData, dynamicDocument.schemaData);
    }

    public int hashCode() {
        return (((((((this.documentId.hashCode() * 31) + this.documentStatus.hashCode()) * 31) + this.scopeName.hashCode()) * 31) + this.rawScopeData.hashCode()) * 31) + this.schemaData.hashCode();
    }

    public String toString() {
        return "DynamicDocument(documentId=" + this.documentId + ", documentStatus=" + this.documentStatus + ", scopeName=" + this.scopeName + ", rawScopeData=" + this.rawScopeData + ", schemaData=" + this.schemaData + ")";
    }
}
