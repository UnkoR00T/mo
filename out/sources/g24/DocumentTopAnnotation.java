package g24;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g24.p, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"Lg24/p;", "", "", "Lg24/n;", "title", "sections", "Lg24/o;", "staticSections", "Lg24/f;", "dynamicSections", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lg24/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "Lg24/f;", "()Lg24/f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentTopAnnotation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> sections;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentStaticSection> staticSections;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentDynamicSection dynamicSections;

    public DocumentTopAnnotation(List<DocumentSchemaLabel> list, List<DocumentSchemaLabel> list2, List<DocumentStaticSection> list3, DocumentDynamicSection documentDynamicSection) {
        this.title = list;
        this.sections = list2;
        this.staticSections = list3;
        this.dynamicSections = documentDynamicSection;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentDynamicSection getDynamicSections() {
        return this.dynamicSections;
    }

    public final List<DocumentSchemaLabel> b() {
        return this.sections;
    }

    public final List<DocumentStaticSection> c() {
        return this.staticSections;
    }

    public final List<DocumentSchemaLabel> d() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentTopAnnotation)) {
            return false;
        }
        DocumentTopAnnotation documentTopAnnotation = (DocumentTopAnnotation) other;
        return fr.t.c(this.title, documentTopAnnotation.title) && fr.t.c(this.sections, documentTopAnnotation.sections) && fr.t.c(this.staticSections, documentTopAnnotation.staticSections) && fr.t.c(this.dynamicSections, documentTopAnnotation.dynamicSections);
    }

    public int hashCode() {
        List<DocumentSchemaLabel> list = this.title;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DocumentSchemaLabel> list2 = this.sections;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DocumentStaticSection> list3 = this.staticSections;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        DocumentDynamicSection documentDynamicSection = this.dynamicSections;
        return iHashCode3 + (documentDynamicSection != null ? documentDynamicSection.hashCode() : 0);
    }

    public String toString() {
        return "DocumentTopAnnotation(title=" + this.title + ", sections=" + this.sections + ", staticSections=" + this.staticSections + ", dynamicSections=" + this.dynamicSections + ")";
    }
}
