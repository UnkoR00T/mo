package qt3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: qt3.j0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lqt3/j0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lqt3/h;", "a", "Lqt3/h;", "()Lqt3/h;", "dynamicSections", "Lqt3/g0;", "b", "Lqt3/g0;", "()Lqt3/g0;", "multiDocumentGroup", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDocumentViewDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dynamicSections")
    private final DocumentDynamicSectionDto dynamicSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("multiDocumentGroup")
    private final g0 multiDocumentGroup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentDynamicSectionDto getDynamicSections() {
        return this.dynamicSections;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g0 getMultiDocumentGroup() {
        return this.multiDocumentGroup;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocumentViewDto)) {
            return false;
        }
        MultiDocumentViewDto multiDocumentViewDto = (MultiDocumentViewDto) other;
        return fr.t.c(this.dynamicSections, multiDocumentViewDto.dynamicSections) && this.multiDocumentGroup == multiDocumentViewDto.multiDocumentGroup;
    }

    public int hashCode() {
        return (this.dynamicSections.hashCode() * 31) + this.multiDocumentGroup.hashCode();
    }

    public String toString() {
        return "MultiDocumentViewDto(dynamicSections=" + this.dynamicSections + ", multiDocumentGroup=" + this.multiDocumentGroup + ')';
    }
}
