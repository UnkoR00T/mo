package i24;

import f24.Document;
import g24.DocumentSchema;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i24.o, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Li24/o;", "", "Lf24/e;", "document", "Li24/p;", "scope", "Lg24/h;", "schema", "<init>", "(Lf24/e;Li24/p;Lg24/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf24/e;", "()Lf24/e;", "b", "Li24/p;", "c", "()Li24/p;", "Lg24/h;", "()Lg24/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DynamicDocumentScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentSchema schema;

    public DynamicDocumentData(Document document, DynamicDocumentScope dynamicDocumentScope, DocumentSchema documentSchema) {
        this.document = document;
        this.scope = dynamicDocumentScope;
        this.schema = documentSchema;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentSchema getSchema() {
        return this.schema;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DynamicDocumentScope getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocumentData)) {
            return false;
        }
        DynamicDocumentData dynamicDocumentData = (DynamicDocumentData) other;
        return fr.t.c(this.document, dynamicDocumentData.document) && fr.t.c(this.scope, dynamicDocumentData.scope) && fr.t.c(this.schema, dynamicDocumentData.schema);
    }

    public int hashCode() {
        return (((this.document.hashCode() * 31) + this.scope.hashCode()) * 31) + this.schema.hashCode();
    }

    public String toString() {
        return "DynamicDocumentData(document=" + this.document + ", scope=" + this.scope + ", schema=" + this.schema + ")";
    }
}
