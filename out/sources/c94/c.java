package c94;

import i50.BaseScaffoldData;
import java.util.List;
import k40.EmptyStateData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lc94/c;", "Ll00/e;", "Lc94/c$b;", "b", "a", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<b> {

    /* JADX INFO: renamed from: c94.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc94/c$a;", "", "", "date", "Ln30/b;", "cardListData", "<init>", "(Ljava/lang/String;Ln30/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ln30/b;", "()Ln30/b;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AttendanceDayViewData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cardListData;

        public AttendanceDayViewData(String str, CardListData cardListData) {
            this.date = str;
            this.cardListData = cardListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getCardListData() {
            return this.cardListData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttendanceDayViewData)) {
                return false;
            }
            AttendanceDayViewData attendanceDayViewData = (AttendanceDayViewData) other;
            return fr.t.c(this.date, attendanceDayViewData.date) && fr.t.c(this.cardListData, attendanceDayViewData.cardListData);
        }

        public int hashCode() {
            return (this.date.hashCode() * 31) + this.cardListData.hashCode();
        }

        public String toString() {
            return "AttendanceDayViewData(date=" + this.date + ", cardListData=" + this.cardListData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lc94/c$b;", "", "c", "a", "b", "Lc94/c$b$a;", "Lc94/c$b$b;", "Lc94/c$b$c;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: c94.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001d\u0010$¨\u0006%"}, d2 = {"Lc94/c$b$a;", "Lc94/c$b;", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Li50/a;", "scaffoldData", "", "Lc94/c$a;", "attendanceDays", "Lk40/a;", "emptyStateData", "<init>", "(Ler/a;Li50/a;Ljava/util/List;Lk40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "c", "()Ler/a;", "b", "Li50/a;", "d", "()Li50/a;", "Ljava/util/List;", "()Ljava/util/List;", "Lk40/a;", "()Lk40/a;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displaying implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<AttendanceDayViewData> attendanceDays;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData emptyStateData;

            public Displaying(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, List<AttendanceDayViewData> list, EmptyStateData emptyStateData) {
                this.onBackAction = aVar;
                this.scaffoldData = baseScaffoldData;
                this.attendanceDays = list;
                this.emptyStateData = emptyStateData;
            }

            public final List<AttendanceDayViewData> a() {
                return this.attendanceDays;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EmptyStateData getEmptyStateData() {
                return this.emptyStateData;
            }

            public final er.a<i0> c() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displaying)) {
                    return false;
                }
                Displaying displaying = (Displaying) other;
                return fr.t.c(this.onBackAction, displaying.onBackAction) && fr.t.c(this.scaffoldData, displaying.scaffoldData) && fr.t.c(this.attendanceDays, displaying.attendanceDays) && fr.t.c(this.emptyStateData, displaying.emptyStateData);
            }

            public int hashCode() {
                int iHashCode = ((((this.onBackAction.hashCode() * 31) + this.scaffoldData.hashCode()) * 31) + this.attendanceDays.hashCode()) * 31;
                EmptyStateData emptyStateData = this.emptyStateData;
                return iHashCode + (emptyStateData == null ? 0 : emptyStateData.hashCode());
            }

            public String toString() {
                return "Displaying(onBackAction=" + this.onBackAction + ", scaffoldData=" + this.scaffoldData + ", attendanceDays=" + this.attendanceDays + ", emptyStateData=" + this.emptyStateData + ')';
            }
        }

        /* JADX INFO: renamed from: c94.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lc94/c$b$b;", "Lc94/c$b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorLoading implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public ErrorLoading(hb4.c cVar) {
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
                return (other instanceof ErrorLoading) && fr.t.c(this.errorVMS, ((ErrorLoading) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "ErrorLoading(errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: c94.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lc94/c$b$c;", "Lc94/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0658c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0658c f24645a = new C0658c();

            private C0658c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0658c);
            }

            public int hashCode() {
                return -1281795112;
            }

            public String toString() {
                return "Loading";
            }
        }
    }
}
