package co3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: co3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\tJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lco3/b;", "", "", "encodedDocument", "Lco3/j;", "additionalScope", "<init>", "(Ljava/lang/String;Lco3/j;)V", "a", "()Ljava/lang/String;", "b", "()Lco3/j;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "Lco3/j;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EncodedDocumentWithAdditionalScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encodedDocument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SecondDocument additionalScope;

    public EncodedDocumentWithAdditionalScope(String str, SecondDocument secondDocument) {
        this.encodedDocument = str;
        this.additionalScope = secondDocument;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEncodedDocument() {
        return this.encodedDocument;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SecondDocument getAdditionalScope() {
        return this.additionalScope;
    }

    public final SecondDocument c() {
        return this.additionalScope;
    }

    public final String d() {
        return this.encodedDocument;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncodedDocumentWithAdditionalScope)) {
            return false;
        }
        EncodedDocumentWithAdditionalScope encodedDocumentWithAdditionalScope = (EncodedDocumentWithAdditionalScope) other;
        return fr.t.c(this.encodedDocument, encodedDocumentWithAdditionalScope.encodedDocument) && fr.t.c(this.additionalScope, encodedDocumentWithAdditionalScope.additionalScope);
    }

    public int hashCode() {
        int iHashCode = this.encodedDocument.hashCode() * 31;
        SecondDocument secondDocument = this.additionalScope;
        return iHashCode + (secondDocument == null ? 0 : secondDocument.hashCode());
    }

    public String toString() {
        return "EncodedDocumentWithAdditionalScope(encodedDocument=" + this.encodedDocument + ", additionalScope=" + this.additionalScope + ')';
    }

    public /* synthetic */ EncodedDocumentWithAdditionalScope(String str, SecondDocument secondDocument, int i15, fr.k kVar) {
        this(str, (i15 & 2) != 0 ? null : secondDocument);
    }
}
