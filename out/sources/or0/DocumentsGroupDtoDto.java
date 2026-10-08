package or0;

import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.o0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lor0/o0;", "", "", "Lor0/c0;", AnnotatedPrivateKey.LABEL, "Lor0/p0;", "sortOrder", "<init>", "(Ljava/util/List;Lor0/p0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lor0/p0;", "()Lor0/p0;", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsGroupDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c(AnnotatedPrivateKey.LABEL)
    private final List<DocumentSchemaLabelDtoDto> label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sortOrder")
    private final p0 sortOrder;

    public DocumentsGroupDtoDto(List<DocumentSchemaLabelDtoDto> list, p0 p0Var) {
        this.label = list;
        this.sortOrder = p0Var;
    }

    public final List<DocumentSchemaLabelDtoDto> a() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p0 getSortOrder() {
        return this.sortOrder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentsGroupDtoDto)) {
            return false;
        }
        DocumentsGroupDtoDto documentsGroupDtoDto = (DocumentsGroupDtoDto) other;
        return fr.t.c(this.label, documentsGroupDtoDto.label) && this.sortOrder == documentsGroupDtoDto.sortOrder;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.sortOrder.hashCode();
    }

    public String toString() {
        return "DocumentsGroupDtoDto(label=" + this.label + ", sortOrder=" + this.sortOrder + ')';
    }
}
