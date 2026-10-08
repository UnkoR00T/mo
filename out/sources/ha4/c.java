package ha4;

import p071kotlin.Metadata;
import w94.SchoolGradesMessage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lha4/c;", "", "f", "b", "a", "e", "c", "d", "Lha4/c$a;", "Lha4/c$b;", "Lha4/c$c;", "Lha4/c$d;", "Lha4/c$e;", "Lha4/c$f;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: ha4.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lha4/c$b;", "Lha4/c;", "Lw94/g;", "message", "<init>", "(Lw94/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw94/g;", "()Lw94/g;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmptyStateSubjectList implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SchoolGradesMessage message;

        public EmptyStateSubjectList(SchoolGradesMessage schoolGradesMessage) {
            this.message = schoolGradesMessage;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SchoolGradesMessage getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EmptyStateSubjectList) && fr.t.c(this.message, ((EmptyStateSubjectList) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "EmptyStateSubjectList(message=" + this.message + ')';
        }
    }

    /* JADX INFO: renamed from: ha4.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lha4/c$c;", "Lha4/c;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorLoadingInitialData implements c {

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

    /* JADX INFO: renamed from: ha4.c$d, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lha4/c$d;", "Lha4/c;", "Lha4/d;", "data", "", "semesterId", "Lhb4/c;", "errorVMS", "<init>", "(Lha4/d;Ljava/lang/String;Lhb4/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lha4/d;", "()Lha4/d;", "b", "Ljava/lang/String;", "c", "Lhb4/c;", "()Lhb4/c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorLoadingSemesterDetails implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SubjectListData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String semesterId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public ErrorLoadingSemesterDetails(SubjectListData subjectListData, String str, hb4.c cVar) {
            this.data = subjectListData;
            this.semesterId = str;
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SubjectListData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSemesterId() {
            return this.semesterId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorLoadingSemesterDetails)) {
                return false;
            }
            ErrorLoadingSemesterDetails errorLoadingSemesterDetails = (ErrorLoadingSemesterDetails) other;
            return fr.t.c(this.data, errorLoadingSemesterDetails.data) && fr.t.c(this.semesterId, errorLoadingSemesterDetails.semesterId) && fr.t.c(this.errorVMS, errorLoadingSemesterDetails.errorVMS);
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + this.semesterId.hashCode()) * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "ErrorLoadingSemesterDetails(data=" + this.data + ", semesterId=" + this.semesterId + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: ha4.c$e, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lha4/c$e;", "Lha4/c;", "Lha4/d;", "data", "", "semesterId", "<init>", "(Lha4/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lha4/d;", "()Lha4/d;", "b", "Ljava/lang/String;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadingSemesterDetails implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SubjectListData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String semesterId;

        public LoadingSemesterDetails(SubjectListData subjectListData, String str) {
            this.data = subjectListData;
            this.semesterId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SubjectListData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSemesterId() {
            return this.semesterId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingSemesterDetails)) {
                return false;
            }
            LoadingSemesterDetails loadingSemesterDetails = (LoadingSemesterDetails) other;
            return fr.t.c(this.data, loadingSemesterDetails.data) && fr.t.c(this.semesterId, loadingSemesterDetails.semesterId);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.semesterId.hashCode();
        }

        public String toString() {
            return "LoadingSemesterDetails(data=" + this.data + ", semesterId=" + this.semesterId + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lha4/c$f;", "Lha4/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f82613a = new f();

        private f() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -877275250;
        }

        public String toString() {
            return "LoadingSubjectList";
        }
    }

    /* JADX INFO: renamed from: ha4.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lha4/c$a;", "Lha4/c;", "Lha4/d;", "data", "", "isBottomSheetVisible", "<init>", "(Lha4/d;Z)V", "a", "(Lha4/d;Z)Lha4/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lha4/d;", "c", "()Lha4/d;", "b", "Z", "d", "()Z", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisplayingSubjectList implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SubjectListData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBottomSheetVisible;

        public DisplayingSubjectList(SubjectListData subjectListData, boolean z15) {
            this.data = subjectListData;
            this.isBottomSheetVisible = z15;
        }

        public static /* synthetic */ DisplayingSubjectList b(DisplayingSubjectList displayingSubjectList, SubjectListData subjectListData, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                subjectListData = displayingSubjectList.data;
            }
            if ((i15 & 2) != 0) {
                z15 = displayingSubjectList.isBottomSheetVisible;
            }
            return displayingSubjectList.a(subjectListData, z15);
        }

        public final DisplayingSubjectList a(SubjectListData data, boolean isBottomSheetVisible) {
            return new DisplayingSubjectList(data, isBottomSheetVisible);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final SubjectListData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsBottomSheetVisible() {
            return this.isBottomSheetVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayingSubjectList)) {
                return false;
            }
            DisplayingSubjectList displayingSubjectList = (DisplayingSubjectList) other;
            return fr.t.c(this.data, displayingSubjectList.data) && this.isBottomSheetVisible == displayingSubjectList.isBottomSheetVisible;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + Boolean.hashCode(this.isBottomSheetVisible);
        }

        public String toString() {
            return "DisplayingSubjectList(data=" + this.data + ", isBottomSheetVisible=" + this.isBottomSheetVisible + ')';
        }

        public /* synthetic */ DisplayingSubjectList(SubjectListData subjectListData, boolean z15, int i15, fr.k kVar) {
            this(subjectListData, (i15 & 2) != 0 ? false : z15);
        }
    }
}
