package eo3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo3.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Leo3/i;", "", "Leo3/i$a;", "sortOrder", "", "Leo3/h;", "labels", "<init>", "(Leo3/i$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo3/i$a;", "getSortOrder", "()Leo3/i$a;", "b", "Ljava/util/List;", "getLabels", "()Ljava/util/List;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a sortOrder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> labels;

    /* JADX INFO: renamed from: eo3.i$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Leo3/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        ASC,
        DESC,
        UNKNOWN;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f52517e = wq.b.a(b());
    }

    public DocumentsGroup(a aVar, List<DocumentSchemaLabel> list) {
        this.sortOrder = aVar;
        this.labels = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentsGroup)) {
            return false;
        }
        DocumentsGroup documentsGroup = (DocumentsGroup) other;
        return this.sortOrder == documentsGroup.sortOrder && fr.t.c(this.labels, documentsGroup.labels);
    }

    public int hashCode() {
        return (this.sortOrder.hashCode() * 31) + this.labels.hashCode();
    }

    public String toString() {
        return "DocumentsGroup(sortOrder=" + this.sortOrder + ", labels=" + this.labels + ')';
    }
}
