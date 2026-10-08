package m34;

import fr.t;
import gr0.DynamicDocument;
import hr0.MultiDocumentSchema;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m34.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lm34/a;", "", "", "documentReferenceName", "", "Lgr0/r;", "multiDocuments", "Lhr0/a;", "multiDocumentSchema", "<init>", "(Ljava/lang/String;Ljava/util/List;Lhr0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDocumentReferenceName", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lhr0/a;", "()Lhr0/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicMultiDocumentFullDataContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentReferenceName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DynamicDocument> multiDocuments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentSchema multiDocumentSchema;

    public DynamicMultiDocumentFullDataContainer(String str, List<DynamicDocument> list, MultiDocumentSchema multiDocumentSchema) {
        this.documentReferenceName = str;
        this.multiDocuments = list;
        this.multiDocumentSchema = multiDocumentSchema;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MultiDocumentSchema getMultiDocumentSchema() {
        return this.multiDocumentSchema;
    }

    public final List<DynamicDocument> b() {
        return this.multiDocuments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicMultiDocumentFullDataContainer)) {
            return false;
        }
        DynamicMultiDocumentFullDataContainer dynamicMultiDocumentFullDataContainer = (DynamicMultiDocumentFullDataContainer) other;
        return t.c(this.documentReferenceName, dynamicMultiDocumentFullDataContainer.documentReferenceName) && t.c(this.multiDocuments, dynamicMultiDocumentFullDataContainer.multiDocuments) && t.c(this.multiDocumentSchema, dynamicMultiDocumentFullDataContainer.multiDocumentSchema);
    }

    public int hashCode() {
        return (((this.documentReferenceName.hashCode() * 31) + this.multiDocuments.hashCode()) * 31) + this.multiDocumentSchema.hashCode();
    }

    public String toString() {
        return "DynamicMultiDocumentFullDataContainer(documentReferenceName=" + this.documentReferenceName + ", multiDocuments=" + this.multiDocuments + ", multiDocumentSchema=" + this.multiDocumentSchema + ")";
    }
}
