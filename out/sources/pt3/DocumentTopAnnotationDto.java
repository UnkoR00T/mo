package pt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pt3.p, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006\""}, d2 = {"Lpt3/p;", "", "Lpt3/j;", "dynamicSections", "", "sections", "staticSections", "title", "<init>", "(Lpt3/j;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpt3/j;", "getDynamicSections", "()Lpt3/j;", "b", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "getSections$annotations", "()V", "c", "getStaticSections", "d", "getTitle", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentTopAnnotationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dynamicSections")
    private final DocumentDynamicSectionDto dynamicSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sections")
    private final List<Object> sections;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("staticSections")
    private final List<Object> staticSections;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final List<Object> title;

    public DocumentTopAnnotationDto() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentTopAnnotationDto)) {
            return false;
        }
        DocumentTopAnnotationDto documentTopAnnotationDto = (DocumentTopAnnotationDto) other;
        return fr.t.c(this.dynamicSections, documentTopAnnotationDto.dynamicSections) && fr.t.c(this.sections, documentTopAnnotationDto.sections) && fr.t.c(this.staticSections, documentTopAnnotationDto.staticSections) && fr.t.c(this.title, documentTopAnnotationDto.title);
    }

    public int hashCode() {
        DocumentDynamicSectionDto documentDynamicSectionDto = this.dynamicSections;
        int iHashCode = (documentDynamicSectionDto == null ? 0 : documentDynamicSectionDto.hashCode()) * 31;
        List<Object> list = this.sections;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Object> list2 = this.staticSections;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Object> list3 = this.title;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "DocumentTopAnnotationDto(dynamicSections=" + this.dynamicSections + ", sections=" + this.sections + ", staticSections=" + this.staticSections + ", title=" + this.title + ')';
    }

    public DocumentTopAnnotationDto(DocumentDynamicSectionDto documentDynamicSectionDto, List<Object> list, List<Object> list2, List<Object> list3) {
        this.dynamicSections = documentDynamicSectionDto;
        this.sections = list;
        this.staticSections = list2;
        this.title = list3;
    }

    public /* synthetic */ DocumentTopAnnotationDto(DocumentDynamicSectionDto documentDynamicSectionDto, List list, List list2, List list3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : documentDynamicSectionDto, (i15 & 2) != 0 ? null : list, (i15 & 4) != 0 ? null : list2, (i15 & 8) != 0 ? null : list3);
    }
}
