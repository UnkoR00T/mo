package qt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qt3.s, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0019R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Lqt3/s;", "", "", "Lqt3/p;", "title", "sections", "Lqt3/r;", "staticSections", "Lqt3/h;", "dynamicSections", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqt3/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "getSections$annotations", "()V", "c", "Lqt3/h;", "()Lqt3/h;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentTopAnnotationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final List<DocumentSchemaLabelDto> title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sections")
    private final List<DocumentSchemaLabelDto> sections;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("staticSections")
    private final List<DocumentStaticSectionDto> staticSections;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dynamicSections")
    private final DocumentDynamicSectionDto dynamicSections;

    public DocumentTopAnnotationDto() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentDynamicSectionDto getDynamicSections() {
        return this.dynamicSections;
    }

    public final List<DocumentSchemaLabelDto> b() {
        return this.sections;
    }

    public final List<DocumentStaticSectionDto> c() {
        return this.staticSections;
    }

    public final List<DocumentSchemaLabelDto> d() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentTopAnnotationDto)) {
            return false;
        }
        DocumentTopAnnotationDto documentTopAnnotationDto = (DocumentTopAnnotationDto) other;
        return fr.t.c(this.title, documentTopAnnotationDto.title) && fr.t.c(this.sections, documentTopAnnotationDto.sections) && fr.t.c(this.staticSections, documentTopAnnotationDto.staticSections) && fr.t.c(this.dynamicSections, documentTopAnnotationDto.dynamicSections);
    }

    public int hashCode() {
        List<DocumentSchemaLabelDto> list = this.title;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DocumentSchemaLabelDto> list2 = this.sections;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DocumentStaticSectionDto> list3 = this.staticSections;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        DocumentDynamicSectionDto documentDynamicSectionDto = this.dynamicSections;
        return iHashCode3 + (documentDynamicSectionDto != null ? documentDynamicSectionDto.hashCode() : 0);
    }

    public String toString() {
        return "DocumentTopAnnotationDto(title=" + this.title + ", sections=" + this.sections + ", staticSections=" + this.staticSections + ", dynamicSections=" + this.dynamicSections + ')';
    }

    public DocumentTopAnnotationDto(List<DocumentSchemaLabelDto> list, List<DocumentSchemaLabelDto> list2, List<DocumentStaticSectionDto> list3, DocumentDynamicSectionDto documentDynamicSectionDto) {
        this.title = list;
        this.sections = list2;
        this.staticSections = list3;
        this.dynamicSections = documentDynamicSectionDto;
    }

    public /* synthetic */ DocumentTopAnnotationDto(List list, List list2, List list3, DocumentDynamicSectionDto documentDynamicSectionDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? null : list2, (i15 & 4) != 0 ? null : list3, (i15 & 8) != 0 ? null : documentDynamicSectionDto);
    }
}
