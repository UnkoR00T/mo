package ha4;

import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import w94.SemesterDetails;
import w94.SemesterPreview;

/* JADX INFO: renamed from: ha4.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001\fB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lha4/d;", "", "", "selectedSemesterId", "", "Lw94/j;", "allSemesters", "", "Lw94/h;", "semestersCache", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lha4/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "d", "()Lw94/h;", "selectedSemester", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubjectListData {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f82616e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedSemesterId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SemesterPreview> allSemesters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, SemesterDetails> semestersCache;

    /* JADX INFO: renamed from: ha4.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lha4/d$a;", "", "<init>", "()V", "Lw94/e$c;", "semesters", "Lha4/d;", "a", "(Lw94/e$c;)Lha4/d;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final SubjectListData a(w94.e.Semesters semesters) {
            SemesterPreview semesterPreview = new SemesterPreview(semesters.getCurrentSemester().getId(), semesters.getCurrentSemester().getTitle());
            List listC = pq.v.c();
            listC.add(semesterPreview);
            listC.addAll(semesters.b());
            return new SubjectListData(semesters.getCurrentSemester().getId(), pq.v.a(listC), pq.v0.f(oq.y.a(semesters.getCurrentSemester().getId(), semesters.getCurrentSemester())));
        }

        private Companion() {
        }
    }

    public SubjectListData(String str, List<SemesterPreview> list, Map<String, SemesterDetails> map) {
        this.selectedSemesterId = str;
        this.allSemesters = list;
        this.semestersCache = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubjectListData b(SubjectListData subjectListData, String str, List list, Map map, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = subjectListData.selectedSemesterId;
        }
        if ((i15 & 2) != 0) {
            list = subjectListData.allSemesters;
        }
        if ((i15 & 4) != 0) {
            map = subjectListData.semestersCache;
        }
        return subjectListData.a(str, list, map);
    }

    public final SubjectListData a(String selectedSemesterId, List<SemesterPreview> allSemesters, Map<String, SemesterDetails> semestersCache) {
        return new SubjectListData(selectedSemesterId, allSemesters, semestersCache);
    }

    public final List<SemesterPreview> c() {
        return this.allSemesters;
    }

    public final SemesterDetails d() {
        SemesterDetails semesterDetails = this.semestersCache.get(this.selectedSemesterId);
        if (semesterDetails != null) {
            return semesterDetails;
        }
        throw new IllegalArgumentException(("No details for selected semester " + this.selectedSemesterId).toString());
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSelectedSemesterId() {
        return this.selectedSemesterId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubjectListData)) {
            return false;
        }
        SubjectListData subjectListData = (SubjectListData) other;
        return fr.t.c(this.selectedSemesterId, subjectListData.selectedSemesterId) && fr.t.c(this.allSemesters, subjectListData.allSemesters) && fr.t.c(this.semestersCache, subjectListData.semestersCache);
    }

    public final Map<String, SemesterDetails> f() {
        return this.semestersCache;
    }

    public int hashCode() {
        return (((this.selectedSemesterId.hashCode() * 31) + this.allSemesters.hashCode()) * 31) + this.semestersCache.hashCode();
    }

    public String toString() {
        return "SubjectListData(selectedSemesterId=" + this.selectedSemesterId + ", allSemesters=" + this.allSemesters + ", semestersCache=" + this.semestersCache + ')';
    }
}
