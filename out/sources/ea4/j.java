package ea4;

import i50.BaseScaffoldData;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lea4/j;", "Ll00/e;", "Lea4/j$a;", "a", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lea4/j$a;", "", "c", "a", "b", "Lea4/j$a$a;", "Lea4/j$a$b;", "Lea4/j$a$c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ea4.j$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001c\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b(\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b \u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b%\u0010,¨\u0006-"}, d2 = {"Lea4/j$a$a;", "Lea4/j$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "subjectTitle", "currentGradesTitle", "Ln30/b;", "gradesListData", "semesterGradeListData", "Lk40/a;", "emptyStateData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ln30/b;Ln30/b;Lk40/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "d", "Ln30/b;", "()Ln30/b;", "f", "Lk40/a;", "()Lk40/a;", "Ler/a;", "()Ler/a;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayingSubjectGrades implements a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f49013h = EmptyStateData.f108236d | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subjectTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label currentGradesTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData gradesListData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData semesterGradeListData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData emptyStateData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public DisplayingSubjectGrades(BaseScaffoldData baseScaffoldData, Label label, Label label2, CardListData cardListData, CardListData cardListData2, EmptyStateData emptyStateData, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.subjectTitle = label;
                this.currentGradesTitle = label2;
                this.gradesListData = cardListData;
                this.semesterGradeListData = cardListData2;
                this.emptyStateData = emptyStateData;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getCurrentGradesTitle() {
                return this.currentGradesTitle;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EmptyStateData getEmptyStateData() {
                return this.emptyStateData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getGradesListData() {
                return this.gradesListData;
            }

            public final er.a<i0> d() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayingSubjectGrades)) {
                    return false;
                }
                DisplayingSubjectGrades displayingSubjectGrades = (DisplayingSubjectGrades) other;
                return fr.t.c(this.scaffoldData, displayingSubjectGrades.scaffoldData) && fr.t.c(this.subjectTitle, displayingSubjectGrades.subjectTitle) && fr.t.c(this.currentGradesTitle, displayingSubjectGrades.currentGradesTitle) && fr.t.c(this.gradesListData, displayingSubjectGrades.gradesListData) && fr.t.c(this.semesterGradeListData, displayingSubjectGrades.semesterGradeListData) && fr.t.c(this.emptyStateData, displayingSubjectGrades.emptyStateData) && fr.t.c(this.onBackAction, displayingSubjectGrades.onBackAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CardListData getSemesterGradeListData() {
                return this.semesterGradeListData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getSubjectTitle() {
                return this.subjectTitle;
            }

            public int hashCode() {
                int iHashCode = ((((((this.scaffoldData.hashCode() * 31) + this.subjectTitle.hashCode()) * 31) + this.currentGradesTitle.hashCode()) * 31) + this.gradesListData.hashCode()) * 31;
                CardListData cardListData = this.semesterGradeListData;
                int iHashCode2 = (iHashCode + (cardListData == null ? 0 : cardListData.hashCode())) * 31;
                EmptyStateData emptyStateData = this.emptyStateData;
                return ((iHashCode2 + (emptyStateData != null ? emptyStateData.hashCode() : 0)) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "DisplayingSubjectGrades(scaffoldData=" + this.scaffoldData + ", subjectTitle=" + this.subjectTitle + ", currentGradesTitle=" + this.currentGradesTitle + ", gradesListData=" + this.gradesListData + ", semesterGradeListData=" + this.semesterGradeListData + ", emptyStateData=" + this.emptyStateData + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: ea4.j$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lea4/j$a$b;", "Lea4/j$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorLoadingSubjectGrades implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public ErrorLoadingSubjectGrades(hb4.c cVar) {
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
                return (other instanceof ErrorLoadingSubjectGrades) && fr.t.c(this.errorVMS, ((ErrorLoadingSubjectGrades) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "ErrorLoadingSubjectGrades(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lea4/j$a$c;", "Lea4/j$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f49022a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 586007862;
            }

            public String toString() {
                return "LoadingSubjectGrades";
            }
        }
    }
}
