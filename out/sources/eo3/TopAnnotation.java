package eo3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo3.u, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Leo3/u;", "", "", "Leo3/h;", "title", "sections", "Leo3/t;", "staticSections", "Leo3/m;", "dynamicSections", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Leo3/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getTitle", "()Ljava/util/List;", "b", "getSections", "c", "getStaticSections", "d", "Leo3/m;", "()Leo3/m;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopAnnotation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentSchemaLabel> sections;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StaticSection> staticSections;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DynamicSection dynamicSections;

    public TopAnnotation(List<DocumentSchemaLabel> list, List<DocumentSchemaLabel> list2, List<StaticSection> list3, DynamicSection dynamicSection) {
        this.title = list;
        this.sections = list2;
        this.staticSections = list3;
        this.dynamicSections = dynamicSection;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DynamicSection getDynamicSections() {
        return this.dynamicSections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAnnotation)) {
            return false;
        }
        TopAnnotation topAnnotation = (TopAnnotation) other;
        return fr.t.c(this.title, topAnnotation.title) && fr.t.c(this.sections, topAnnotation.sections) && fr.t.c(this.staticSections, topAnnotation.staticSections) && fr.t.c(this.dynamicSections, topAnnotation.dynamicSections);
    }

    public int hashCode() {
        List<DocumentSchemaLabel> list = this.title;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DocumentSchemaLabel> list2 = this.sections;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StaticSection> list3 = this.staticSections;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        DynamicSection dynamicSection = this.dynamicSections;
        return iHashCode3 + (dynamicSection != null ? dynamicSection.hashCode() : 0);
    }

    public String toString() {
        return "TopAnnotation(title=" + this.title + ", sections=" + this.sections + ", staticSections=" + this.staticSections + ", dynamicSections=" + this.dynamicSections + ')';
    }
}
