package rn0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rn0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, d2 = {"Lrn0/c0;", "", "", "id", "title", "", "Lrn0/g0;", "subjects", "Lrn0/a0;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lrn0/a0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lrn0/a0;", "()Lrn0/a0;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESemesterDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BESubjectEntry> subjects;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BESchoolFamilyMessage message;

    public BESemesterDetails(String str, String str2, List<BESubjectEntry> list, BESchoolFamilyMessage bESchoolFamilyMessage) {
        this.id = str;
        this.title = str2;
        this.subjects = list;
        this.message = bESchoolFamilyMessage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BESchoolFamilyMessage getMessage() {
        return this.message;
    }

    public final List<BESubjectEntry> c() {
        return this.subjects;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESemesterDetails)) {
            return false;
        }
        BESemesterDetails bESemesterDetails = (BESemesterDetails) other;
        return fr.t.c(this.id, bESemesterDetails.id) && fr.t.c(this.title, bESemesterDetails.title) && fr.t.c(this.subjects, bESemesterDetails.subjects) && fr.t.c(this.message, bESemesterDetails.message);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subjects.hashCode()) * 31;
        BESchoolFamilyMessage bESchoolFamilyMessage = this.message;
        return iHashCode + (bESchoolFamilyMessage == null ? 0 : bESchoolFamilyMessage.hashCode());
    }

    public String toString() {
        return "BESemesterDetails(id=" + this.id + ", title=" + this.title + ", subjects=" + this.subjects + ", message=" + this.message + ')';
    }
}
