package or0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.k0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001bR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lor0/k0;", "", "Lor0/q;", "dynamicSections", "", "Lor0/c0;", "sections", "Lor0/e0;", "staticSections", "title", "<init>", "(Lor0/q;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor0/q;", "()Lor0/q;", "b", "Ljava/util/List;", "()Ljava/util/List;", "getSections$annotations", "()V", "c", "d", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentTopAnnotationDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dynamicSections")
    private final DocumentDynamicSectionDtoDto dynamicSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sections")
    private final List<DocumentSchemaLabelDtoDto> sections;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("staticSections")
    private final List<DocumentStaticSectionDtoDto> staticSections;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final List<DocumentSchemaLabelDtoDto> title;

    public DocumentTopAnnotationDtoDto() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentDynamicSectionDtoDto getDynamicSections() {
        return this.dynamicSections;
    }

    public final List<DocumentSchemaLabelDtoDto> b() {
        return this.sections;
    }

    public final List<DocumentStaticSectionDtoDto> c() {
        return this.staticSections;
    }

    public final List<DocumentSchemaLabelDtoDto> d() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentTopAnnotationDtoDto)) {
            return false;
        }
        DocumentTopAnnotationDtoDto documentTopAnnotationDtoDto = (DocumentTopAnnotationDtoDto) other;
        return fr.t.c(this.dynamicSections, documentTopAnnotationDtoDto.dynamicSections) && fr.t.c(this.sections, documentTopAnnotationDtoDto.sections) && fr.t.c(this.staticSections, documentTopAnnotationDtoDto.staticSections) && fr.t.c(this.title, documentTopAnnotationDtoDto.title);
    }

    public int hashCode() {
        DocumentDynamicSectionDtoDto documentDynamicSectionDtoDto = this.dynamicSections;
        int iHashCode = (documentDynamicSectionDtoDto == null ? 0 : documentDynamicSectionDtoDto.hashCode()) * 31;
        List<DocumentSchemaLabelDtoDto> list = this.sections;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<DocumentStaticSectionDtoDto> list2 = this.staticSections;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DocumentSchemaLabelDtoDto> list3 = this.title;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "DocumentTopAnnotationDtoDto(dynamicSections=" + this.dynamicSections + ", sections=" + this.sections + ", staticSections=" + this.staticSections + ", title=" + this.title + ')';
    }

    public DocumentTopAnnotationDtoDto(DocumentDynamicSectionDtoDto documentDynamicSectionDtoDto, List<DocumentSchemaLabelDtoDto> list, List<DocumentStaticSectionDtoDto> list2, List<DocumentSchemaLabelDtoDto> list3) {
        this.dynamicSections = documentDynamicSectionDtoDto;
        this.sections = list;
        this.staticSections = list2;
        this.title = list3;
    }

    public /* synthetic */ DocumentTopAnnotationDtoDto(DocumentDynamicSectionDtoDto documentDynamicSectionDtoDto, List list, List list2, List list3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : documentDynamicSectionDtoDto, (i15 & 2) != 0 ? null : list, (i15 & 4) != 0 ? null : list2, (i15 & 8) != 0 ? null : list3);
    }
}
