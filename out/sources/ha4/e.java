package ha4;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import k40.EmptyStateData;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lha4/e;", "Ll00/e;", "Lha4/e$a;", "a", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lha4/e$a;", "", "d", "e", "a", "b", "c", "Lha4/e$a$a;", "Lha4/e$a$b;", "Lha4/e$a$c;", "Lha4/e$a$d;", "Lha4/e$a$e;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ha4.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b%\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b,\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b!\u00106R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b4\u00108¨\u00069"}, d2 = {"Lha4/e$a$a;", "Lha4/e$a;", "Lha4/d;", "data", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Li50/a;", "scaffoldData", "Ln30/b;", "subjectListData", "Lj30/a;", "changeSemesterButtonData", "Lk40/a;", "emptyStateData", "Lg30/n;", "bottomSheetData", "", "Lha4/b;", "semesterSheetItems", "<init>", "(Lha4/d;Ler/a;Li50/a;Ln30/b;Lj30/a;Lk40/a;Lg30/n;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lha4/d;", "c", "()Lha4/d;", "b", "Ler/a;", "e", "()Ler/a;", "Li50/a;", "f", "()Li50/a;", "d", "Ln30/b;", "h", "()Ln30/b;", "Lj30/a;", "()Lj30/a;", "Lk40/a;", "()Lk40/a;", "g", "Lg30/n;", "()Lg30/n;", "Ljava/util/List;", "()Ljava/util/List;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayingSubjectList implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SubjectListData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData subjectListData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData changeSemesterButtonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData emptyStateData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<SemesterSheetItemData> semesterSheetItems;

            public DisplayingSubjectList(SubjectListData subjectListData, er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, CardListData cardListData, ButtonTextData buttonTextData, EmptyStateData emptyStateData, ModalBottomSheetData modalBottomSheetData, List<SemesterSheetItemData> list) {
                this.data = subjectListData;
                this.onBackAction = aVar;
                this.scaffoldData = baseScaffoldData;
                this.subjectListData = cardListData;
                this.changeSemesterButtonData = buttonTextData;
                this.emptyStateData = emptyStateData;
                this.bottomSheetData = modalBottomSheetData;
                this.semesterSheetItems = list;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonTextData getChangeSemesterButtonData() {
                return this.changeSemesterButtonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final SubjectListData getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final EmptyStateData getEmptyStateData() {
                return this.emptyStateData;
            }

            public final er.a<oq.i0> e() {
                return this.onBackAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayingSubjectList)) {
                    return false;
                }
                DisplayingSubjectList displayingSubjectList = (DisplayingSubjectList) other;
                return fr.t.c(this.data, displayingSubjectList.data) && fr.t.c(this.onBackAction, displayingSubjectList.onBackAction) && fr.t.c(this.scaffoldData, displayingSubjectList.scaffoldData) && fr.t.c(this.subjectListData, displayingSubjectList.subjectListData) && fr.t.c(this.changeSemesterButtonData, displayingSubjectList.changeSemesterButtonData) && fr.t.c(this.emptyStateData, displayingSubjectList.emptyStateData) && fr.t.c(this.bottomSheetData, displayingSubjectList.bottomSheetData) && fr.t.c(this.semesterSheetItems, displayingSubjectList.semesterSheetItems);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public final List<SemesterSheetItemData> g() {
                return this.semesterSheetItems;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final CardListData getSubjectListData() {
                return this.subjectListData;
            }

            public int hashCode() {
                int iHashCode = ((((((this.data.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.scaffoldData.hashCode()) * 31) + this.subjectListData.hashCode()) * 31;
                ButtonTextData buttonTextData = this.changeSemesterButtonData;
                int iHashCode2 = (iHashCode + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31;
                EmptyStateData emptyStateData = this.emptyStateData;
                return ((((iHashCode2 + (emptyStateData != null ? emptyStateData.hashCode() : 0)) * 31) + this.bottomSheetData.hashCode()) * 31) + this.semesterSheetItems.hashCode();
            }

            public String toString() {
                return "DisplayingSubjectList(data=" + this.data + ", onBackAction=" + this.onBackAction + ", scaffoldData=" + this.scaffoldData + ", subjectListData=" + this.subjectListData + ", changeSemesterButtonData=" + this.changeSemesterButtonData + ", emptyStateData=" + this.emptyStateData + ", bottomSheetData=" + this.bottomSheetData + ", semesterSheetItems=" + this.semesterSheetItems + ')';
            }
        }

        /* JADX INFO: renamed from: ha4.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lha4/e$a$b;", "Lha4/e$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorLoadingInitialData implements a {

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

        /* JADX INFO: renamed from: ha4.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lha4/e$a$c;", "Lha4/e$a;", "Lha4/d;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Lha4/d;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lha4/d;", "getData", "()Lha4/d;", "b", "Lhb4/c;", "()Lhb4/c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorLoadingSemesterDetails implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SubjectListData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public ErrorLoadingSemesterDetails(SubjectListData subjectListData, hb4.c cVar) {
                this.data = subjectListData;
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
                if (!(other instanceof ErrorLoadingSemesterDetails)) {
                    return false;
                }
                ErrorLoadingSemesterDetails errorLoadingSemesterDetails = (ErrorLoadingSemesterDetails) other;
                return fr.t.c(this.data, errorLoadingSemesterDetails.data) && fr.t.c(this.errorVMS, errorLoadingSemesterDetails.errorVMS);
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "ErrorLoadingSemesterDetails(data=" + this.data + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lha4/e$a$d;", "Lha4/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f82632a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1713068315;
            }

            public String toString() {
                return "LoadingSubjectList";
            }
        }

        /* JADX INFO: renamed from: ha4.e$a$e, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lha4/e$a$e;", "Lha4/e$a;", "Li50/a;", "scaffoldData", "Lk40/a;", "emptyStateData", "<init>", "(Li50/a;Lk40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lk40/a;", "()Lk40/a;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SubjectListEmptyState implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f82633c = EmptyStateData.f108236d | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData emptyStateData;

            public SubjectListEmptyState(BaseScaffoldData baseScaffoldData, EmptyStateData emptyStateData) {
                this.scaffoldData = baseScaffoldData;
                this.emptyStateData = emptyStateData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final EmptyStateData getEmptyStateData() {
                return this.emptyStateData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubjectListEmptyState)) {
                    return false;
                }
                SubjectListEmptyState subjectListEmptyState = (SubjectListEmptyState) other;
                return fr.t.c(this.scaffoldData, subjectListEmptyState.scaffoldData) && fr.t.c(this.emptyStateData, subjectListEmptyState.emptyStateData);
            }

            public int hashCode() {
                return (this.scaffoldData.hashCode() * 31) + this.emptyStateData.hashCode();
            }

            public String toString() {
                return "SubjectListEmptyState(scaffoldData=" + this.scaffoldData + ", emptyStateData=" + this.emptyStateData + ')';
            }
        }
    }
}
