package rn0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.g0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lrn0/g0;", "", "", "id", "title", "Lrn0/i0;", "iconType", "", "newGrades", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrn0/i0;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Lrn0/i0;", "()Lrn0/i0;", "Z", "()Z", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESubjectEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i0 iconType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean newGrades;

    public BESubjectEntry(String str, String str2, i0 i0Var, boolean z15) {
        this.id = str;
        this.title = str2;
        this.iconType = i0Var;
        this.newGrades = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i0 getIconType() {
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
        if (!(other instanceof BESubjectEntry)) {
            return false;
        }
        BESubjectEntry bESubjectEntry = (BESubjectEntry) other;
        return fr.t.c(this.id, bESubjectEntry.id) && fr.t.c(this.title, bESubjectEntry.title) && this.iconType == bESubjectEntry.iconType && this.newGrades == bESubjectEntry.newGrades;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.iconType.hashCode()) * 31) + Boolean.hashCode(this.newGrades);
    }

    public String toString() {
        return "BESubjectEntry(id=" + this.id + ", title=" + this.title + ", iconType=" + this.iconType + ", newGrades=" + this.newGrades + ')';
    }
}
