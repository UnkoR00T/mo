package jt3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.i0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001a"}, d2 = {"Ljt3/i0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljt3/k0;", "a", "Ljt3/k0;", "()Ljt3/k0;", "iconType", "b", "Ljava/lang/String;", "id", "c", "Z", "()Z", "newGrades", "d", "title", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubjectEntryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("iconType")
    private final k0 iconType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("newGrades")
    private final boolean newGrades;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k0 getIconType() {
        return this.iconType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getNewGrades() {
        return this.newGrades;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubjectEntryDto)) {
            return false;
        }
        SubjectEntryDto subjectEntryDto = (SubjectEntryDto) other;
        return this.iconType == subjectEntryDto.iconType && fr.t.c(this.id, subjectEntryDto.id) && this.newGrades == subjectEntryDto.newGrades && fr.t.c(this.title, subjectEntryDto.title);
    }

    public int hashCode() {
        return (((((this.iconType.hashCode() * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.newGrades)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SubjectEntryDto(iconType=" + this.iconType + ", id=" + this.id + ", newGrades=" + this.newGrades + ", title=" + this.title + ')';
    }
}
