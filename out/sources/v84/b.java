package v84;

import p071kotlin.Metadata;
import s84.SchoolAttendanceMessage;
import s84.SemesterAttendanceSummary;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lv84/b;", "", "d", "a", "b", "c", "Lv84/b$a;", "Lv84/b$b;", "Lv84/b$c;", "Lv84/b$d;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: v84.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv84/b$a;", "Lv84/b;", "Ls84/j;", "message", "<init>", "(Ls84/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls84/j;", "()Ls84/j;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AttendanceEmptyState implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SchoolAttendanceMessage message;

        public AttendanceEmptyState(SchoolAttendanceMessage schoolAttendanceMessage) {
            this.message = schoolAttendanceMessage;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SchoolAttendanceMessage getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AttendanceEmptyState) && fr.t.c(this.message, ((AttendanceEmptyState) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "AttendanceEmptyState(message=" + this.message + ')';
        }
    }

    /* JADX INFO: renamed from: v84.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv84/b$c;", "Lv84/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorLoadingInitialData implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public ErrorLoadingInitialData(hb4.c cVar) {
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorLoadingInitialData) && fr.t.c(this.errorVMS, ((ErrorLoadingInitialData) other).errorVMS);
        }

        public int hashCode() {
            return this.errorVMS.hashCode();
        }

        public String toString() {
            return "ErrorLoadingInitialData(errorVMS=" + this.errorVMS + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv84/b$d;", "Lv84/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f204773a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -1155004943;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: v84.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lv84/b$b;", "Lv84/b;", "Ls84/f$a;", "data", "Ls84/k;", "selectedSemester", "", "isBottomSheetVisible", "<init>", "(Ls84/f$a;Ls84/k;Z)V", "a", "(Ls84/f$a;Ls84/k;Z)Lv84/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ls84/f$a;", "c", "()Ls84/f$a;", "b", "Ls84/k;", "d", "()Ls84/k;", "Z", "e", "()Z", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Displaying implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s84.f.AttendanceSemesters data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SemesterAttendanceSummary selectedSemester;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBottomSheetVisible;

        public Displaying(s84.f.AttendanceSemesters attendanceSemesters, SemesterAttendanceSummary semesterAttendanceSummary, boolean z15) {
            this.data = attendanceSemesters;
            this.selectedSemester = semesterAttendanceSummary;
            this.isBottomSheetVisible = z15;
        }

        public static /* synthetic */ Displaying b(Displaying displaying, s84.f.AttendanceSemesters attendanceSemesters, SemesterAttendanceSummary semesterAttendanceSummary, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                attendanceSemesters = displaying.data;
            }
            if ((i15 & 2) != 0) {
                semesterAttendanceSummary = displaying.selectedSemester;
            }
            if ((i15 & 4) != 0) {
                z15 = displaying.isBottomSheetVisible;
            }
            return displaying.a(attendanceSemesters, semesterAttendanceSummary, z15);
        }

        public final Displaying a(s84.f.AttendanceSemesters data, SemesterAttendanceSummary selectedSemester, boolean isBottomSheetVisible) {
            return new Displaying(data, selectedSemester, isBottomSheetVisible);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final s84.f.AttendanceSemesters getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final SemesterAttendanceSummary getSelectedSemester() {
            return this.selectedSemester;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsBottomSheetVisible() {
            return this.isBottomSheetVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return fr.t.c(this.data, displaying.data) && fr.t.c(this.selectedSemester, displaying.selectedSemester) && this.isBottomSheetVisible == displaying.isBottomSheetVisible;
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + this.selectedSemester.hashCode()) * 31) + Boolean.hashCode(this.isBottomSheetVisible);
        }

        public String toString() {
            return "Displaying(data=" + this.data + ", selectedSemester=" + this.selectedSemester + ", isBottomSheetVisible=" + this.isBottomSheetVisible + ')';
        }

        public /* synthetic */ Displaying(s84.f.AttendanceSemesters attendanceSemesters, SemesterAttendanceSummary semesterAttendanceSummary, boolean z15, int i15, fr.k kVar) {
            this(attendanceSemesters, semesterAttendanceSummary, (i15 & 4) != 0 ? false : z15);
        }
    }
}
