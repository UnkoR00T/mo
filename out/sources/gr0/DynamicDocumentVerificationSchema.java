package gr0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gr0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f¨\u0006$"}, d2 = {"Lgr0/u;", "", "", "schemaId", "schemaVersion", "documentName", "", "Lgr0/n;", "title", "Lgr0/i;", "expirationDate", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgr0/i;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSchemaId", "b", "getSchemaVersion", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Lgr0/i;", "()Lgr0/i;", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocumentVerificationSchema {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schemaId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schemaVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentSchemaAttribute expirationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaAttribute> attributes;

    public DynamicDocumentVerificationSchema(String str, String str2, String str3, List<DocumentSchemaLabel> list, DocumentSchemaAttribute documentSchemaAttribute, List<DocumentSchemaAttribute> list2) {
        this.schemaId = str;
        this.schemaVersion = str2;
        this.documentName = str3;
        this.title = list;
        this.expirationDate = documentSchemaAttribute;
        this.attributes = list2;
    }

    public final List<DocumentSchemaAttribute> a() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentSchemaAttribute getExpirationDate() {
        return this.expirationDate;
    }

    public final List<DocumentSchemaLabel> d() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocumentVerificationSchema)) {
            return false;
        }
        DynamicDocumentVerificationSchema dynamicDocumentVerificationSchema = (DynamicDocumentVerificationSchema) other;
        return fr.t.c(this.schemaId, dynamicDocumentVerificationSchema.schemaId) && fr.t.c(this.schemaVersion, dynamicDocumentVerificationSchema.schemaVersion) && fr.t.c(this.documentName, dynamicDocumentVerificationSchema.documentName) && fr.t.c(this.title, dynamicDocumentVerificationSchema.title) && fr.t.c(this.expirationDate, dynamicDocumentVerificationSchema.expirationDate) && fr.t.c(this.attributes, dynamicDocumentVerificationSchema.attributes);
    }

    public int hashCode() {
        return (((((((((this.schemaId.hashCode() * 31) + this.schemaVersion.hashCode()) * 31) + this.documentName.hashCode()) * 31) + this.title.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.attributes.hashCode();
    }

    public String toString() {
        return "DynamicDocumentVerificationSchema(schemaId=" + this.schemaId + ", schemaVersion=" + this.schemaVersion + ", documentName=" + this.documentName + ", title=" + this.title + ", expirationDate=" + this.expirationDate + ", attributes=" + this.attributes + ")";
    }
}
