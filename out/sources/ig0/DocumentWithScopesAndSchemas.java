package ig0;

import fr.t;
import hg0.DocumentEntity;
import hg0.SchemaEntity;
import hg0.ScopeEntity;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ig0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, d2 = {"Lig0/b;", "", "Lhg0/c;", "document", "", "Lhg0/g;", "scopes", "Lhg0/f;", "schemas", "<init>", "(Lhg0/c;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg0/c;", "()Lhg0/c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentWithScopesAndSchemas {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentEntity document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ScopeEntity> scopes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SchemaEntity> schemas;

    public DocumentWithScopesAndSchemas(DocumentEntity documentEntity, List<ScopeEntity> list, List<SchemaEntity> list2) {
        this.document = documentEntity;
        this.scopes = list;
        this.schemas = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentEntity getDocument() {
        return this.document;
    }

    public final List<SchemaEntity> b() {
        return this.schemas;
    }

    public final List<ScopeEntity> c() {
        return this.scopes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentWithScopesAndSchemas)) {
            return false;
        }
        DocumentWithScopesAndSchemas documentWithScopesAndSchemas = (DocumentWithScopesAndSchemas) other;
        return t.c(this.document, documentWithScopesAndSchemas.document) && t.c(this.scopes, documentWithScopesAndSchemas.scopes) && t.c(this.schemas, documentWithScopesAndSchemas.schemas);
    }

    public int hashCode() {
        return (((this.document.hashCode() * 31) + this.scopes.hashCode()) * 31) + this.schemas.hashCode();
    }

    public String toString() {
        return "DocumentWithScopesAndSchemas(document=" + this.document + ", scopes=" + this.scopes + ", schemas=" + this.schemas + ')';
    }
}
