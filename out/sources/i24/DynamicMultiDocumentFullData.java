package i24;

import h24.MultiDocumentSchema;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i24.q, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Li24/q;", "", "", "parentId", "Lh24/a;", "multiDocumentSchema", "", "Li24/o;", "documentsData", "<init>", "(Ljava/lang/String;Lh24/a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lh24/a;", "()Lh24/a;", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicMultiDocumentFullData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentSchema multiDocumentSchema;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DynamicDocumentData> documentsData;

    public DynamicMultiDocumentFullData(String str, MultiDocumentSchema multiDocumentSchema, List<DynamicDocumentData> list) {
        this.parentId = str;
        this.multiDocumentSchema = multiDocumentSchema;
        this.documentsData = list;
    }

    public final List<DynamicDocumentData> a() {
        return this.documentsData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MultiDocumentSchema getMultiDocumentSchema() {
        return this.multiDocumentSchema;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicMultiDocumentFullData)) {
            return false;
        }
        DynamicMultiDocumentFullData dynamicMultiDocumentFullData = (DynamicMultiDocumentFullData) other;
        return fr.t.c(this.parentId, dynamicMultiDocumentFullData.parentId) && fr.t.c(this.multiDocumentSchema, dynamicMultiDocumentFullData.multiDocumentSchema) && fr.t.c(this.documentsData, dynamicMultiDocumentFullData.documentsData);
    }

    public int hashCode() {
        return (((this.parentId.hashCode() * 31) + this.multiDocumentSchema.hashCode()) * 31) + this.documentsData.hashCode();
    }

    public String toString() {
        return "DynamicMultiDocumentFullData(parentId=" + this.parentId + ", multiDocumentSchema=" + this.multiDocumentSchema + ", documentsData=" + this.documentsData + ")";
    }
}
