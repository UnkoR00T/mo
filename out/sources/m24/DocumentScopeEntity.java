package m24;

import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m24.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lm24/i;", "", "", "id", "", "documentContainerId", "scopeName", "", "scopeData", "<init>", "(ILjava/lang/String;Ljava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "d", "[B", "()[B", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentScopeEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentContainerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scopeName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] scopeData;

    public DocumentScopeEntity(int i15, String str, String str2, byte[] bArr) {
        this.id = i15;
        this.documentContainerId = str;
        this.scopeName = str2;
        this.scopeData = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentContainerId() {
        return this.documentContainerId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getScopeData() {
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
        if (!(other instanceof DocumentScopeEntity)) {
            return false;
        }
        DocumentScopeEntity documentScopeEntity = (DocumentScopeEntity) other;
        return this.id == documentScopeEntity.id && t.c(this.documentContainerId, documentScopeEntity.documentContainerId) && t.c(this.scopeName, documentScopeEntity.scopeName) && t.c(this.scopeData, documentScopeEntity.scopeData);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.documentContainerId.hashCode()) * 31) + this.scopeName.hashCode()) * 31) + Arrays.hashCode(this.scopeData);
    }

    public String toString() {
        return "DocumentScopeEntity(id=" + this.id + ", documentContainerId=" + this.documentContainerId + ", scopeName=" + this.scopeName + ", scopeData=" + Arrays.toString(this.scopeData) + ')';
    }

    public /* synthetic */ DocumentScopeEntity(int i15, String str, String str2, byte[] bArr, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, str, str2, bArr);
    }
}
