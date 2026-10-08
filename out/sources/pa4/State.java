package pa4;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: pa4.r, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lpa4/r;", "", "Lma4/a;", "featureConfig", "", "studentId", "selectedLessonId", "<init>", "(Lma4/a;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lma4/a;Ljava/lang/String;Ljava/lang/String;)Lpa4/r;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lma4/a;", "c", "()Lma4/a;", "b", "Ljava/lang/String;", "e", "d", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ma4.a featureConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String studentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedLessonId;

    public State(ma4.a aVar, String str, String str2) {
        this.featureConfig = aVar;
        this.studentId = str;
        this.selectedLessonId = str2;
    }

    public static /* synthetic */ State b(State state, ma4.a aVar, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.featureConfig;
        }
        if ((i15 & 2) != 0) {
            str = state.studentId;
        }
        if ((i15 & 4) != 0) {
            str2 = state.selectedLessonId;
        }
        return state.a(aVar, str, str2);
    }

    public final State a(ma4.a featureConfig, String studentId, String selectedLessonId) {
        return new State(featureConfig, studentId, selectedLessonId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ma4.a getFeatureConfig() {
        return this.featureConfig;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSelectedLessonId() {
        return this.selectedLessonId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStudentId() {
        return this.studentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.featureConfig == state.featureConfig && fr.t.c(this.studentId, state.studentId) && fr.t.c(this.selectedLessonId, state.selectedLessonId);
    }

    public int hashCode() {
        int iHashCode = this.featureConfig.hashCode() * 31;
        String str = this.studentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedLessonId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "State(featureConfig=" + this.featureConfig + ", studentId=" + this.studentId + ", selectedLessonId=" + this.selectedLessonId + ')';
    }
}
