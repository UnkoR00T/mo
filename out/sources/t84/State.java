package t84;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: t84.w, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJJ\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lt84/w;", "", "Lq84/a;", "featureConfig", "", "studentId", "Ls84/f$a;", "attendanceSummary", "selectedSemesterId", "Ls84/h;", "selectedAttendanceType", "<init>", "(Lq84/a;Ljava/lang/String;Ls84/f$a;Ljava/lang/String;Ls84/h;)V", "a", "(Lq84/a;Ljava/lang/String;Ls84/f$a;Ljava/lang/String;Ls84/h;)Lt84/w;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lq84/a;", "d", "()Lq84/a;", "b", "Ljava/lang/String;", "g", "c", "Ls84/f$a;", "()Ls84/f$a;", "f", "e", "Ls84/h;", "()Ls84/h;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q84.a featureConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String studentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final s84.f.AttendanceSemesters attendanceSummary;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedSemesterId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final s84.h selectedAttendanceType;

    public State(q84.a aVar, String str, s84.f.AttendanceSemesters attendanceSemesters, String str2, s84.h hVar) {
        this.featureConfig = aVar;
        this.studentId = str;
        this.attendanceSummary = attendanceSemesters;
        this.selectedSemesterId = str2;
        this.selectedAttendanceType = hVar;
    }

    public static /* synthetic */ State b(State state, q84.a aVar, String str, s84.f.AttendanceSemesters attendanceSemesters, String str2, s84.h hVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.featureConfig;
        }
        if ((i15 & 2) != 0) {
            str = state.studentId;
        }
        if ((i15 & 4) != 0) {
            attendanceSemesters = state.attendanceSummary;
        }
        if ((i15 & 8) != 0) {
            str2 = state.selectedSemesterId;
        }
        if ((i15 & 16) != 0) {
            hVar = state.selectedAttendanceType;
        }
        s84.h hVar2 = hVar;
        s84.f.AttendanceSemesters attendanceSemesters2 = attendanceSemesters;
        return state.a(aVar, str, attendanceSemesters2, str2, hVar2);
    }

    public final State a(q84.a featureConfig, String studentId, s84.f.AttendanceSemesters attendanceSummary, String selectedSemesterId, s84.h selectedAttendanceType) {
        return new State(featureConfig, studentId, attendanceSummary, selectedSemesterId, selectedAttendanceType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s84.f.AttendanceSemesters getAttendanceSummary() {
        return this.attendanceSummary;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q84.a getFeatureConfig() {
        return this.featureConfig;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final s84.h getSelectedAttendanceType() {
        return this.selectedAttendanceType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.featureConfig == state.featureConfig && fr.t.c(this.studentId, state.studentId) && fr.t.c(this.attendanceSummary, state.attendanceSummary) && fr.t.c(this.selectedSemesterId, state.selectedSemesterId) && this.selectedAttendanceType == state.selectedAttendanceType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedSemesterId() {
        return this.selectedSemesterId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStudentId() {
        return this.studentId;
    }

    public int hashCode() {
        int iHashCode = this.featureConfig.hashCode() * 31;
        String str = this.studentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        s84.f.AttendanceSemesters attendanceSemesters = this.attendanceSummary;
        int iHashCode3 = (iHashCode2 + (attendanceSemesters == null ? 0 : attendanceSemesters.hashCode())) * 31;
        String str2 = this.selectedSemesterId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        s84.h hVar = this.selectedAttendanceType;
        return iHashCode4 + (hVar != null ? hVar.hashCode() : 0);
    }

    public String toString() {
        return "State(featureConfig=" + this.featureConfig + ", studentId=" + this.studentId + ", attendanceSummary=" + this.attendanceSummary + ", selectedSemesterId=" + this.selectedSemesterId + ", selectedAttendanceType=" + this.selectedAttendanceType + ')';
    }

    public /* synthetic */ State(q84.a aVar, String str, s84.f.AttendanceSemesters attendanceSemesters, String str2, s84.h hVar, int i15, fr.k kVar) {
        this(aVar, str, (i15 & 4) != 0 ? null : attendanceSemesters, (i15 & 8) != 0 ? null : str2, (i15 & 16) != 0 ? null : hVar);
    }
}
