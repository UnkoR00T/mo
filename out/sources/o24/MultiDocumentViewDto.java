package o24;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.j0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lo24/j0;", "", "Lo24/f;", "dynamicSections", "Lo24/g0;", "multiDocumentGroup", "<init>", "(Lo24/f;Lo24/g0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo24/f;", "()Lo24/f;", "b", "Lo24/g0;", "()Lo24/g0;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDocumentViewDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dynamicSections")
    private final DocumentDynamicSectionDto dynamicSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("multiDocumentGroup")
    private final g0 multiDocumentGroup;

    public MultiDocumentViewDto(DocumentDynamicSectionDto documentDynamicSectionDto, g0 g0Var) {
        this.dynamicSections = documentDynamicSectionDto;
        this.multiDocumentGroup = g0Var;
    }

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
