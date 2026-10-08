package w94;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: w94.h, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lw94/h;", "", "", "id", "title", "", "Lw94/k;", "subjects", "Lw94/g;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lw94/g;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lw94/g;)Lw94/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "f", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "Lw94/g;", "()Lw94/g;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemesterDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Subject> subjects;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final SchoolGradesMessage message;

    public SemesterDetails(String str, String str2, List<Subject> list, SchoolGradesMessage schoolGradesMessage) {
        this.id = str;
        this.title = str2;
        this.subjects = list;
        this.message = schoolGradesMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SemesterDetails b(SemesterDetails semesterDetails, String str, String str2, List list, SchoolGradesMessage schoolGradesMessage, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = semesterDetails.id;
        }
        if ((i15 & 2) != 0) {
            str2 = semesterDetails.title;
        }
        if ((i15 & 4) != 0) {
            list = semesterDetails.subjects;
        }
        if ((i15 & 8) != 0) {
            schoolGradesMessage = semesterDetails.message;
        }
        return semesterDetails.a(str, str2, list, schoolGradesMessage);
    }

    public final SemesterDetails a(String id5, String title, List<Subject> subjects, SchoolGradesMessage message) {
        return new SemesterDetails(id5, title, subjects, message);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SchoolGradesMessage getMessage() {
        return this.message;
    }

    public final List<Subject> e() {
        return this.subjects;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemesterDetails)) {
            return false;
        }
        SemesterDetails semesterDetails = (SemesterDetails) other;
        return t.c(this.id, semesterDetails.id) && t.c(this.title, semesterDetails.title) && t.c(this.subjects, semesterDetails.subjects) && t.c(this.message, semesterDetails.message);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subjects.hashCode()) * 31;
        SchoolGradesMessage schoolGradesMessage = this.message;
        return iHashCode + (schoolGradesMessage == null ? 0 : schoolGradesMessage.hashCode());
    }

    public String toString() {
        return "SemesterDetails(id=" + this.id + ", title=" + this.title + ", subjects=" + this.subjects + ", message=" + this.message + ')';
    }
}
