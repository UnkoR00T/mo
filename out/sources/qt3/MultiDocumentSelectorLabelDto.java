package qt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qt3.i0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Lqt3/i0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lqt3/b0;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "selection", "selected", "c", "shared", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDocumentSelectorLabelDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("selection")
    private final List<LabelDto> selection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("selected")
    private final List<LabelDto> selected;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("shared")
    private final List<LabelDto> shared;

    public final List<LabelDto> a() {
        return this.selected;
    }

    public final List<LabelDto> b() {
        return this.selection;
    }

    public final List<LabelDto> c() {
        return this.shared;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocumentSelectorLabelDto)) {
            return false;
        }
        MultiDocumentSelectorLabelDto multiDocumentSelectorLabelDto = (MultiDocumentSelectorLabelDto) other;
        return fr.t.c(this.selection, multiDocumentSelectorLabelDto.selection) && fr.t.c(this.selected, multiDocumentSelectorLabelDto.selected) && fr.t.c(this.shared, multiDocumentSelectorLabelDto.shared);
    }

    public int hashCode() {
        int iHashCode = ((this.selection.hashCode() * 31) + this.selected.hashCode()) * 31;
        List<LabelDto> list = this.shared;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "MultiDocumentSelectorLabelDto(selection=" + this.selection + ", selected=" + this.selected + ", shared=" + this.shared + ')';
    }
}
