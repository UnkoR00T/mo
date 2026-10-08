package lv1;

import fr.t;
import lz3.h;
import mv1.DynamicDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lv1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Llv1/c;", "", "Llz3/h;", "status", "Lmv1/c;", "data", "<init>", "(Llz3/h;Lmv1/c;)V", "a", "()Llz3/h;", "b", "()Lmv1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llz3/h;", "d", "Lmv1/c;", "c", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DynamicDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DynamicDocumentData data;

    public DynamicDocument(h hVar, DynamicDocumentData dynamicDocumentData) {
        this.status = hVar;
        this.data = dynamicDocumentData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DynamicDocumentData getData() {
        return this.data;
    }

    public final DynamicDocumentData c() {
        return this.data;
    }

    public final h d() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicDocument)) {
            return false;
        }
        DynamicDocument dynamicDocument = (DynamicDocument) other;
        return this.status == dynamicDocument.status && t.c(this.data, dynamicDocument.data);
    }

    public int hashCode() {
        h hVar = this.status;
        return ((hVar == null ? 0 : hVar.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "DynamicDocument(status=" + this.status + ", data=" + this.data + ')';
    }
}
