package o24;

import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.u, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lo24/u;", "", "Lo24/v;", "sortOrder", "", "Lo24/p;", AnnotatedPrivateKey.LABEL, "<init>", "(Lo24/v;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo24/v;", "b", "()Lo24/v;", "Ljava/util/List;", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsGroupDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sortOrder")
    private final v sortOrder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c(AnnotatedPrivateKey.LABEL)
    private final List<DocumentSchemaLabelDto> label;

    public DocumentsGroupDto(v vVar, List<DocumentSchemaLabelDto> list) {
        this.sortOrder = vVar;
        this.label = list;
    }

    public final List<DocumentSchemaLabelDto> a() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getSortOrder() {
        return this.sortOrder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentsGroupDto)) {
            return false;
        }
        DocumentsGroupDto documentsGroupDto = (DocumentsGroupDto) other;
        return this.sortOrder == documentsGroupDto.sortOrder && fr.t.c(this.label, documentsGroupDto.label);
    }

    public int hashCode() {
        return (this.sortOrder.hashCode() * 31) + this.label.hashCode();
    }

    public String toString() {
        return "DocumentsGroupDto(sortOrder=" + this.sortOrder + ", label=" + this.label + ')';
    }
}
