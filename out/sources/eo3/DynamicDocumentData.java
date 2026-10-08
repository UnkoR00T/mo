package eo3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo3.j, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Leo3/j;", "", "", "rawData", "documentId", "Leo3/l;", "schema", "Lrq0/b;", "documentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Leo3/l;Lrq0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Leo3/l;", "d", "()Leo3/l;", "Lrq0/b;", "()Lrq0/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rawData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DynamicDocumentSchema schema;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    public DynamicDocumentData(String str, String str2, DynamicDocumentSchema dynamicDocumentSchema, rq0.b bVar) {
        this.rawData = str;
        this.documentId = str2;
        this.schema = dynamicDocumentSchema;
        this.documentType = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rq0.b getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DynamicDocumentSchema getSchema() {
        return this.schema;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocumentData)) {
            return false;
        }
        DynamicDocumentData dynamicDocumentData = (DynamicDocumentData) other;
        return fr.t.c(this.rawData, dynamicDocumentData.rawData) && fr.t.c(this.documentId, dynamicDocumentData.documentId) && fr.t.c(this.schema, dynamicDocumentData.schema) && fr.t.c(this.documentType, dynamicDocumentData.documentType);
    }

    public int hashCode() {
        return (((((this.rawData.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.schema.hashCode()) * 31) + this.documentType.hashCode();
    }

    public String toString() {
        return "DynamicDocumentData(rawData=" + this.rawData + ", documentId=" + this.documentId + ", schema=" + this.schema + ", documentType=" + this.documentType + ')';
    }
}
