package w94;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: w94.k, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lw94/k;", "", "", "id", "title", "Lw94/m;", "iconType", "", "newGrades", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lw94/m;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lw94/m;Z)Lw94/k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "f", "c", "Lw94/m;", "()Lw94/m;", "Z", "e", "()Z", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Subject {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final m iconType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean newGrades;

    public Subject(String str, String str2, m mVar, boolean z15) {
        this.id = str;
        this.title = str2;
        this.iconType = mVar;
        this.newGrades = z15;
    }

    public static /* synthetic */ Subject b(Subject subject, String str, String str2, m mVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = subject.id;
        }
        if ((i15 & 2) != 0) {
            str2 = subject.title;
        }
        if ((i15 & 4) != 0) {
            mVar = subject.iconType;
        }
        if ((i15 & 8) != 0) {
            z15 = subject.newGrades;
        }
        return subject.a(str, str2, mVar, z15);
    }

    public final Subject a(String id5, String title, m iconType, boolean newGrades) {
        return new Subject(id5, title, iconType, newGrades);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getIconType() {
        return this.iconType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getNewGrades() {
        return this.newGrades;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Subject)) {
            return false;
        }
        Subject subject = (Subject) other;
        return t.c(this.id, subject.id) && t.c(this.title, subject.title) && this.iconType == subject.iconType && this.newGrades == subject.newGrades;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.iconType.hashCode()) * 31) + Boolean.hashCode(this.newGrades);
    }

    public String toString() {
        return "Subject(id=" + this.id + ", title=" + this.title + ", iconType=" + this.iconType + ", newGrades=" + this.newGrades + ')';
    }
}
