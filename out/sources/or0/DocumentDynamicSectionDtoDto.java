package or0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lor0/q;", "", "", "", "fieldsReference", "footerReference", "headerReference", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentDynamicSectionDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fieldsReference")
    private final List<String> fieldsReference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("footerReference")
    private final List<String> footerReference;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("headerReference")
    private final List<String> headerReference;

    public DocumentDynamicSectionDtoDto(List<String> list, List<String> list2, List<String> list3) {
        this.fieldsReference = list;
        this.footerReference = list2;
        this.headerReference = list3;
    }

    public final List<String> a() {
        return this.fieldsReference;
    }

    public final List<String> b() {
        return this.footerReference;
    }

    public final List<String> c() {
        return this.headerReference;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentDynamicSectionDtoDto)) {
            return false;
        }
        DocumentDynamicSectionDtoDto documentDynamicSectionDtoDto = (DocumentDynamicSectionDtoDto) other;
        return fr.t.c(this.fieldsReference, documentDynamicSectionDtoDto.fieldsReference) && fr.t.c(this.footerReference, documentDynamicSectionDtoDto.footerReference) && fr.t.c(this.headerReference, documentDynamicSectionDtoDto.headerReference);
    }

    public int hashCode() {
        int iHashCode = this.fieldsReference.hashCode() * 31;
        List<String> list = this.footerReference;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.headerReference;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "DocumentDynamicSectionDtoDto(fieldsReference=" + this.fieldsReference + ", footerReference=" + this.footerReference + ", headerReference=" + this.headerReference + ')';
    }
}
