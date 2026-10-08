package cr3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cr3.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcr3/e;", "", "Lcr3/a;", "document", "Lcr3/g;", "scope", "Lcr3/d;", "userDocumentData", "<init>", "(Lcr3/a;Lcr3/g;Lcr3/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcr3/a;", "()Lcr3/a;", "b", "Lcr3/g;", "()Lcr3/g;", "c", "Lcr3/d;", "()Lcr3/d;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WruDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final WruDocumentScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserDocumentData userDocumentData;

    public WruDocumentData(Document document, WruDocumentScope wruDocumentScope, UserDocumentData userDocumentData) {
        this.document = document;
        this.scope = wruDocumentScope;
        this.userDocumentData = userDocumentData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final WruDocumentScope getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UserDocumentData getUserDocumentData() {
        return this.userDocumentData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WruDocumentData)) {
            return false;
        }
        WruDocumentData wruDocumentData = (WruDocumentData) other;
        return t.c(this.document, wruDocumentData.document) && t.c(this.scope, wruDocumentData.scope) && t.c(this.userDocumentData, wruDocumentData.userDocumentData);
    }

    public int hashCode() {
        Document document = this.document;
        return ((((document == null ? 0 : document.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.userDocumentData.hashCode();
    }

    public String toString() {
        return "WruDocumentData(document=" + this.document + ", scope=" + this.scope + ", userDocumentData=" + this.userDocumentData + ')';
    }
}
