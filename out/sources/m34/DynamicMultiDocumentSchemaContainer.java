package m34;

import fr.t;
import gr0.DocumentSchema;
import hr0.MultiDocumentSchema;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m34.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lm34/b;", "", "Lgr0/h;", "schema", "Lhr0/a;", "multiDocumentSchema", "Lfz/b$c;", "expirationDate", "<init>", "(Lgr0/h;Lhr0/a;Lfz/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgr0/h;", "c", "()Lgr0/h;", "b", "Lhr0/a;", "()Lhr0/a;", "Lfz/b$c;", "()Lfz/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicMultiDocumentSchemaContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentSchema schema;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentSchema multiDocumentSchema;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate expirationDate;

    public DynamicMultiDocumentSchemaContainer(DocumentSchema documentSchema, MultiDocumentSchema multiDocumentSchema, fz.b.LocalDate localDate) {
        this.schema = documentSchema;
        this.multiDocumentSchema = multiDocumentSchema;
        this.expirationDate = localDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MultiDocumentSchema getMultiDocumentSchema() {
        return this.multiDocumentSchema;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentSchema getSchema() {
        return this.schema;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicMultiDocumentSchemaContainer)) {
            return false;
        }
        DynamicMultiDocumentSchemaContainer dynamicMultiDocumentSchemaContainer = (DynamicMultiDocumentSchemaContainer) other;
        return t.c(this.schema, dynamicMultiDocumentSchemaContainer.schema) && t.c(this.multiDocumentSchema, dynamicMultiDocumentSchemaContainer.multiDocumentSchema) && t.c(this.expirationDate, dynamicMultiDocumentSchemaContainer.expirationDate);
    }

    public int hashCode() {
        int iHashCode = ((this.schema.hashCode() * 31) + this.multiDocumentSchema.hashCode()) * 31;
        fz.b.LocalDate localDate = this.expirationDate;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "DynamicMultiDocumentSchemaContainer(schema=" + this.schema + ", multiDocumentSchema=" + this.multiDocumentSchema + ", expirationDate=" + this.expirationDate + ")";
    }
}
