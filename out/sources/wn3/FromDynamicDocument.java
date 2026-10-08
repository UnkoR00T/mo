package wn3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: wn3.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lwn3/i;", "", "", "documentIID", "Lrq0/b$b;", "documentType", "<init>", "(Ljava/lang/String;Lrq0/b$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lrq0/b$b;", "()Lrq0/b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FromDynamicDocument implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentIID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b.EnumC4479b documentType;

    public FromDynamicDocument(String str, rq0.b.EnumC4479b enumC4479b) {
        this.documentIID = str;
        this.documentType = enumC4479b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentIID() {
        return this.documentIID;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rq0.b.EnumC4479b getDocumentType() {
        return this.documentType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FromDynamicDocument)) {
            return false;
        }
        FromDynamicDocument fromDynamicDocument = (FromDynamicDocument) other;
        return fr.t.c(this.documentIID, fromDynamicDocument.documentIID) && this.documentType == fromDynamicDocument.documentType;
    }

    public int hashCode() {
        String str = this.documentIID;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.documentType.hashCode();
    }

    public String toString() {
        return "FromDynamicDocument(documentIID=" + this.documentIID + ", documentType=" + this.documentType + ")";
    }
}
