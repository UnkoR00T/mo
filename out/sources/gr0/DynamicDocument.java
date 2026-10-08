package gr0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gr0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, d2 = {"Lgr0/r;", "", "", "documentId", "Lrq0/b;", "documentType", "Lgr0/h;", "schema", "Lgr0/c;", "signedAndEncryptedDocumentBase64", "Lfz/b$c;", "expirationDate", "<init>", "(Ljava/lang/String;Lrq0/b;Lgr0/h;Liy/b0;Lfz/b$c;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lrq0/b;", "()Lrq0/b;", "c", "Lgr0/h;", "d", "()Lgr0/h;", "Liy/b0;", "e", "()Liy/b0;", "Lfz/b$c;", "()Lfz/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentSchema schema;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 signedAndEncryptedDocumentBase64;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate expirationDate;

    public /* synthetic */ DynamicDocument(String str, rq0.b bVar, DocumentSchema documentSchema, b0 b0Var, fz.b.LocalDate localDate, fr.k kVar) {
        this(str, bVar, documentSchema, b0Var, localDate);
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
    public final fz.b.LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DocumentSchema getSchema() {
        return this.schema;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getSignedAndEncryptedDocumentBase64() {
        return this.signedAndEncryptedDocumentBase64;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocument)) {
            return false;
        }
        DynamicDocument dynamicDocument = (DynamicDocument) other;
        return fr.t.c(this.documentId, dynamicDocument.documentId) && fr.t.c(this.documentType, dynamicDocument.documentType) && fr.t.c(this.schema, dynamicDocument.schema) && c.d(this.signedAndEncryptedDocumentBase64, dynamicDocument.signedAndEncryptedDocumentBase64) && fr.t.c(this.expirationDate, dynamicDocument.expirationDate);
    }

    public int hashCode() {
        int iHashCode = this.documentId.hashCode() * 31;
        rq0.b bVar = this.documentType;
        int iHashCode2 = (((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.schema.hashCode()) * 31) + c.e(this.signedAndEncryptedDocumentBase64)) * 31;
        fz.b.LocalDate localDate = this.expirationDate;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }

    public String toString() {
        return "DynamicDocument(documentId=" + this.documentId + ", documentType=" + this.documentType + ", schema=" + this.schema + ", signedAndEncryptedDocumentBase64=" + c.f(this.signedAndEncryptedDocumentBase64) + ", expirationDate=" + this.expirationDate + ")";
    }

    private DynamicDocument(String str, rq0.b bVar, DocumentSchema documentSchema, b0 b0Var, fz.b.LocalDate localDate) {
        this.documentId = str;
        this.documentType = bVar;
        this.schema = documentSchema;
        this.signedAndEncryptedDocumentBase64 = b0Var;
        this.expirationDate = localDate;
    }
}
