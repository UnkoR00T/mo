package eo3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo3.r, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Leo3/r;", "", "Leo3/o;", "multiDocumentSchema", "", "Leo3/j;", "multiDocuments", "<init>", "(Leo3/o;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo3/o;", "()Leo3/o;", "b", "Ljava/util/List;", "()Ljava/util/List;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDynamicDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentSchema multiDocumentSchema;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DynamicDocumentData> multiDocuments;

    public MultiDynamicDocumentData(MultiDocumentSchema multiDocumentSchema, List<DynamicDocumentData> list) {
        this.multiDocumentSchema = multiDocumentSchema;
        this.multiDocuments = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MultiDocumentSchema getMultiDocumentSchema() {
        return this.multiDocumentSchema;
    }

    public final List<DynamicDocumentData> b() {
        return this.multiDocuments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDynamicDocumentData)) {
            return false;
        }
        MultiDynamicDocumentData multiDynamicDocumentData = (MultiDynamicDocumentData) other;
        return fr.t.c(this.multiDocumentSchema, multiDynamicDocumentData.multiDocumentSchema) && fr.t.c(this.multiDocuments, multiDynamicDocumentData.multiDocuments);
    }

    public int hashCode() {
        return (this.multiDocumentSchema.hashCode() * 31) + this.multiDocuments.hashCode();
    }

    public String toString() {
        return "MultiDynamicDocumentData(multiDocumentSchema=" + this.multiDocumentSchema + ", multiDocuments=" + this.multiDocuments + ')';
    }
}
