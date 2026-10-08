package v84;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import k40.EmptyStateData;
import p071kotlin.Metadata;
import q50.StatisticCardData;
import y84.SemesterChangerData;
import y84.SemesterSheetItemData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lv84/c;", "Ll00/e;", "Lv84/c$a;", "a", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lv84/c$a;", "", "d", "a", "b", "c", "Lv84/c$a$a;", "Lv84/c$a$b;", "Lv84/c$a$c;", "Lv84/c$a$d;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: v84.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Lv84/c$a$a;", "Lv84/c$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Li50/a;", "scaffoldData", "Lk40/a;", "emptyStateData", "<init>", "(Ler/a;Li50/a;Lk40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "getOnBackAction", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lk40/a;", "()Lk40/a;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AttendanceEmptyState implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f204776d = EmptyStateData.f108236d | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData emptyStateData;

            public AttendanceEmptyState(er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, EmptyStateData emptyStateData) {
                this.onBackAction = aVar;
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
                if (!(other instanceof AttendanceEmptyState)) {
                    return false;
                }
                AttendanceEmptyState attendanceEmptyState = (AttendanceEmptyState) other;
                return fr.t.c(this.onBackAction, attendanceEmptyState.onBackAction) && fr.t.c(this.scaffoldData, attendanceEmptyState.scaffoldData) && fr.t.c(this.emptyStateData, attendanceEmptyState.emptyStateData);
            }

            public int hashCode() {
                return (((this.onBackAction.hashCode() * 31) + this.scaffoldData.hashCode()) * 31) + this.emptyStateData.hashCode();
            }

            public String toString() {
                return "AttendanceEmptyState(onBackAction=" + this.onBackAction + ", scaffoldData=" + this.scaffoldData + ", emptyStateData=" + this.emptyStateData + ')';
            }
        }

        /* JADX INFO: renamed from: v84.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001d\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b*\u0010)¨\u0006-"}, d2 = {"Lv84/c$a$b;", "Lv84/c$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Li50/a;", "scaffoldData", "Ly84/a;", "semesterChanger", "", "Lq50/a;", "statisticCardsData", "Lg30/n;", "bottomSheetData", "Ly84/b;", "semesterSheetItems", "<init>", "(Ler/a;Li50/a;Ly84/a;Ljava/util/List;Lg30/n;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "b", "()Ler/a;", "Li50/a;", "c", "()Li50/a;", "Ly84/a;", "d", "()Ly84/a;", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lg30/n;", "()Lg30/n;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displaying implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final SemesterChangerData semesterChanger;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<StatisticCardData> statisticCardsData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<SemesterSheetItemData> semesterSheetItems;

            public Displaying(er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, SemesterChangerData semesterChangerData, List<StatisticCardData> list, ModalBottomSheetData modalBottomSheetData, List<SemesterSheetItemData> list2) {
                this.onBackAction = aVar;
                this.scaffoldData = baseScaffoldData;
                this.semesterChanger = semesterChangerData;
                this.statisticCardsData = list;
                this.bottomSheetData = modalBottomSheetData;
                this.semesterSheetItems = list2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            public final er.a<oq.i0> b() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final SemesterChangerData getSemesterChanger() {
                return this.semesterChanger;
            }

            public final List<SemesterSheetItemData> e() {
                return this.semesterSheetItems;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displaying)) {
                    return false;
                }
                Displaying displaying = (Displaying) other;
                return fr.t.c(this.onBackAction, displaying.onBackAction) && fr.t.c(this.scaffoldData, displaying.scaffoldData) && fr.t.c(this.semesterChanger, displaying.semesterChanger) && fr.t.c(this.statisticCardsData, displaying.statisticCardsData) && fr.t.c(this.bottomSheetData, displaying.bottomSheetData) && fr.t.c(this.semesterSheetItems, displaying.semesterSheetItems);
            }

            public final List<StatisticCardData> f() {
                return this.statisticCardsData;
            }

            public int hashCode() {
                int iHashCode = ((this.onBackAction.hashCode() * 31) + this.scaffoldData.hashCode()) * 31;
                SemesterChangerData semesterChangerData = this.semesterChanger;
                return ((((((iHashCode + (semesterChangerData == null ? 0 : semesterChangerData.hashCode())) * 31) + this.statisticCardsData.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.semesterSheetItems.hashCode();
            }

            public String toString() {
                return "Displaying(onBackAction=" + this.onBackAction + ", scaffoldData=" + this.scaffoldData + ", semesterChanger=" + this.semesterChanger + ", statisticCardsData=" + this.statisticCardsData + ", bottomSheetData=" + this.bottomSheetData + ", semesterSheetItems=" + this.semesterSheetItems + ')';
            }
        }

        /* JADX INFO: renamed from: v84.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv84/c$a$c;", "Lv84/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv84/c$a$d;", "Lv84/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f204787a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -347622352;
            }

            public String toString() {
                return "Loading";
            }
        }
    }
}
