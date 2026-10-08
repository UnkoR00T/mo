package vf0;

import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vf0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvf0/b;", "", "", "documentId", "scopeName", "", "scopeData", "<init>", "(Ljava/lang/String;Ljava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDocumentId", "b", "getScopeName", "c", "[B", "()[B", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scopeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] scopeData;

    public DocumentScope(String str, String str2, byte[] bArr) {
        this.documentId = str;
        this.scopeName = str2;
        this.scopeData = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getScopeData() {
        return this.scopeData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScope)) {
            return false;
        }
        DocumentScope documentScope = (DocumentScope) other;
        return t.c(this.documentId, documentScope.documentId) && t.c(this.scopeName, documentScope.scopeName) && t.c(this.scopeData, documentScope.scopeData);
    }

    public int hashCode() {
        return (((this.documentId.hashCode() * 31) + this.scopeName.hashCode()) * 31) + Arrays.hashCode(this.scopeData);
    }

    public String toString() {
        return "DocumentScope(documentId=" + this.documentId + ", scopeName=" + this.scopeName + ", scopeData=" + Arrays.toString(this.scopeData) + ")";
    }
}
