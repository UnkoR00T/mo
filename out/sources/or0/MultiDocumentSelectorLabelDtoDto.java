package or0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.a1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lor0/a1;", "", "", "Lor0/t0;", "selected", "selection", "shared", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDocumentSelectorLabelDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("selected")
    private final List<LabelDtoDto> selected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("selection")
    private final List<LabelDtoDto> selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("shared")
    private final List<LabelDtoDto> shared;

    public MultiDocumentSelectorLabelDtoDto(List<LabelDtoDto> list, List<LabelDtoDto> list2, List<LabelDtoDto> list3) {
        this.selected = list;
        this.selection = list2;
        this.shared = list3;
    }

    public final List<LabelDtoDto> a() {
        return this.selected;
    }

    public final List<LabelDtoDto> b() {
        return this.selection;
    }

    public final List<LabelDtoDto> c() {
        return this.shared;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocumentSelectorLabelDtoDto)) {
            return false;
        }
        MultiDocumentSelectorLabelDtoDto multiDocumentSelectorLabelDtoDto = (MultiDocumentSelectorLabelDtoDto) other;
        return fr.t.c(this.selected, multiDocumentSelectorLabelDtoDto.selected) && fr.t.c(this.selection, multiDocumentSelectorLabelDtoDto.selection) && fr.t.c(this.shared, multiDocumentSelectorLabelDtoDto.shared);
    }

    public int hashCode() {
        int iHashCode = ((this.selected.hashCode() * 31) + this.selection.hashCode()) * 31;
        List<LabelDtoDto> list = this.shared;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "MultiDocumentSelectorLabelDtoDto(selected=" + this.selected + ", selection=" + this.selection + ", shared=" + this.shared + ')';
    }
}
