package gr0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gr0.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgr0/t;", "", "", "documentId", "Lgr0/h;", "schema", "Lfz/b$c;", "expirationDate", "<init>", "(Ljava/lang/String;Lgr0/h;Lfz/b$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lgr0/h;", "c", "()Lgr0/h;", "Lfz/b$c;", "()Lfz/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocumentSchemaContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentSchema schema;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate expirationDate;

    public DynamicDocumentSchemaContainer(String str, DocumentSchema documentSchema, fz.b.LocalDate localDate) {
        this.documentId = str;
        this.schema = documentSchema;
        this.expirationDate = localDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentSchema getSchema() {
        return this.schema;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocumentSchemaContainer)) {
            return false;
        }
        DynamicDocumentSchemaContainer dynamicDocumentSchemaContainer = (DynamicDocumentSchemaContainer) other;
        return fr.t.c(this.documentId, dynamicDocumentSchemaContainer.documentId) && fr.t.c(this.schema, dynamicDocumentSchemaContainer.schema) && fr.t.c(this.expirationDate, dynamicDocumentSchemaContainer.expirationDate);
    }

    public int hashCode() {
        int iHashCode = ((this.documentId.hashCode() * 31) + this.schema.hashCode()) * 31;
        fz.b.LocalDate localDate = this.expirationDate;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "DynamicDocumentSchemaContainer(documentId=" + this.documentId + ", schema=" + this.schema + ", expirationDate=" + this.expirationDate + ")";
    }
}
