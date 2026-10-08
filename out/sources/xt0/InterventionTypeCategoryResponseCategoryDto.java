package xt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: xt0.y, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u0004¨\u0006\u0013"}, d2 = {"Lxt0/y;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "code", "c", "name", "additionalDescription", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterventionTypeCategoryResponseCategoryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("code")
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("additionalDescription")
    private final String additionalDescription;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalDescription() {
        return this.additionalDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterventionTypeCategoryResponseCategoryDto)) {
            return false;
        }
        InterventionTypeCategoryResponseCategoryDto interventionTypeCategoryResponseCategoryDto = (InterventionTypeCategoryResponseCategoryDto) other;
        return fr.t.c(this.code, interventionTypeCategoryResponseCategoryDto.code) && fr.t.c(this.name, interventionTypeCategoryResponseCategoryDto.name) && fr.t.c(this.additionalDescription, interventionTypeCategoryResponseCategoryDto.additionalDescription);
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.additionalDescription;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InterventionTypeCategoryResponseCategoryDto(code=" + this.code + ", name=" + this.name + ", additionalDescription=" + this.additionalDescription + ')';
    }
}
