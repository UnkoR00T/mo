package x94;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: x94.w, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJV\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, d2 = {"Lx94/w;", "", "Lu94/a;", "featureConfig", "", "studentId", "selectedSemesterId", "selectedSubjectId", "selectedSubjectTitle", "Lx94/v;", "selectedGrade", "<init>", "(Lu94/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx94/v;)V", "a", "(Lu94/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx94/v;)Lx94/w;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu94/a;", "c", "()Lu94/a;", "b", "Ljava/lang/String;", "h", "e", "d", "f", "g", "Lx94/v;", "()Lx94/v;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final u94.a featureConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String studentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedSemesterId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedSubjectId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedSubjectTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final v selectedGrade;

    public State(u94.a aVar, String str, String str2, String str3, String str4, v vVar) {
        this.featureConfig = aVar;
        this.studentId = str;
        this.selectedSemesterId = str2;
        this.selectedSubjectId = str3;
        this.selectedSubjectTitle = str4;
        this.selectedGrade = vVar;
    }

    public static /* synthetic */ State b(State state, u94.a aVar, String str, String str2, String str3, String str4, v vVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.featureConfig;
        }
        if ((i15 & 2) != 0) {
            str = state.studentId;
        }
        if ((i15 & 4) != 0) {
            str2 = state.selectedSemesterId;
        }
        if ((i15 & 8) != 0) {
            str3 = state.selectedSubjectId;
        }
        if ((i15 & 16) != 0) {
            str4 = state.selectedSubjectTitle;
        }
        if ((i15 & 32) != 0) {
            vVar = state.selectedGrade;
        }
        String str5 = str4;
        v vVar2 = vVar;
        return state.a(aVar, str, str2, str3, str5, vVar2);
    }

    public final State a(u94.a featureConfig, String studentId, String selectedSemesterId, String selectedSubjectId, String selectedSubjectTitle, v selectedGrade) {
        return new State(featureConfig, studentId, selectedSemesterId, selectedSubjectId, selectedSubjectTitle, selectedGrade);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u94.a getFeatureConfig() {
        return this.featureConfig;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getSelectedGrade() {
        return this.selectedGrade;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSelectedSemesterId() {
        return this.selectedSemesterId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.featureConfig == state.featureConfig && fr.t.c(this.studentId, state.studentId) && fr.t.c(this.selectedSemesterId, state.selectedSemesterId) && fr.t.c(this.selectedSubjectId, state.selectedSubjectId) && fr.t.c(this.selectedSubjectTitle, state.selectedSubjectTitle) && fr.t.c(this.selectedGrade, state.selectedGrade);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedSubjectId() {
        return this.selectedSubjectId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSelectedSubjectTitle() {
        return this.selectedSubjectTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStudentId() {
        return this.studentId;
    }

    public int hashCode() {
        int iHashCode = this.featureConfig.hashCode() * 31;
        String str = this.studentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedSemesterId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedSubjectId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.selectedSubjectTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        v vVar = this.selectedGrade;
        return iHashCode5 + (vVar != null ? vVar.hashCode() : 0);
    }

    public String toString() {
        return "State(featureConfig=" + this.featureConfig + ", studentId=" + this.studentId + ", selectedSemesterId=" + this.selectedSemesterId + ", selectedSubjectId=" + this.selectedSubjectId + ", selectedSubjectTitle=" + this.selectedSubjectTitle + ", selectedGrade=" + this.selectedGrade + ')';
    }

    public /* synthetic */ State(u94.a aVar, String str, String str2, String str3, String str4, v vVar, int i15, fr.k kVar) {
        this(aVar, str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : str3, (i15 & 16) != 0 ? null : str4, (i15 & 32) != 0 ? null : vVar);
    }
}
