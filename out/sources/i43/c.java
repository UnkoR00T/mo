package i43;

import f43.ChildStudent;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Li43/c;", "Ll00/e;", "Li43/c$a;", "a", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Li43/c$a;", "", "c", "a", "b", "Li43/c$a$a;", "Li43/c$a$b;", "Li43/c$a$c;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: i43.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b'\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b$\u00100R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b2\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b1\u00100R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Li43/c$a$a;", "Li43/c$a;", "Li50/a;", "scaffoldData", "Lf43/a;", "child", "Lh70/a;", "shortcutsLayoutData", "Lmx/a;", "latestGradeTitle", "Ln50/k;", "latestGradeCard", "latestAbsenceTitle", "latestAbsenceCard", "nextLessonTitle", "nextLessonCard", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lf43/a;Lh70/a;Lmx/a;Ln50/k;Lmx/a;Ln50/k;Lmx/a;Ln50/k;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "h", "()Li50/a;", "b", "Lf43/a;", "()Lf43/a;", "c", "Lh70/a;", "i", "()Lh70/a;", "d", "Lmx/a;", "e", "()Lmx/a;", "Ln50/k;", "()Ln50/k;", "f", "g", "j", "Ler/a;", "getOnBackAction", "()Ler/a;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayingChildDashboard implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ChildStudent child;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ShortcutsLayoutData shortcutsLayoutData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label latestGradeTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k latestGradeCard;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label latestAbsenceTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k latestAbsenceCard;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label nextLessonTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k nextLessonCard;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public DisplayingChildDashboard(BaseScaffoldData baseScaffoldData, ChildStudent childStudent, ShortcutsLayoutData shortcutsLayoutData, Label label, n50.k kVar, Label label2, n50.k kVar2, Label label3, n50.k kVar3, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.child = childStudent;
                this.shortcutsLayoutData = shortcutsLayoutData;
                this.latestGradeTitle = label;
                this.latestGradeCard = kVar;
                this.latestAbsenceTitle = label2;
                this.latestAbsenceCard = kVar2;
                this.nextLessonTitle = label3;
                this.nextLessonCard = kVar3;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ChildStudent getChild() {
                return this.child;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final n50.k getLatestAbsenceCard() {
                return this.latestAbsenceCard;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getLatestAbsenceTitle() {
                return this.latestAbsenceTitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final n50.k getLatestGradeCard() {
                return this.latestGradeCard;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getLatestGradeTitle() {
                return this.latestGradeTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayingChildDashboard)) {
                    return false;
                }
                DisplayingChildDashboard displayingChildDashboard = (DisplayingChildDashboard) other;
                return fr.t.c(this.scaffoldData, displayingChildDashboard.scaffoldData) && fr.t.c(this.child, displayingChildDashboard.child) && fr.t.c(this.shortcutsLayoutData, displayingChildDashboard.shortcutsLayoutData) && fr.t.c(this.latestGradeTitle, displayingChildDashboard.latestGradeTitle) && fr.t.c(this.latestGradeCard, displayingChildDashboard.latestGradeCard) && fr.t.c(this.latestAbsenceTitle, displayingChildDashboard.latestAbsenceTitle) && fr.t.c(this.latestAbsenceCard, displayingChildDashboard.latestAbsenceCard) && fr.t.c(this.nextLessonTitle, displayingChildDashboard.nextLessonTitle) && fr.t.c(this.nextLessonCard, displayingChildDashboard.nextLessonCard) && fr.t.c(this.onBackAction, displayingChildDashboard.onBackAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final n50.k getNextLessonCard() {
                return this.nextLessonCard;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getNextLessonTitle() {
                return this.nextLessonTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((((this.scaffoldData.hashCode() * 31) + this.child.hashCode()) * 31) + this.shortcutsLayoutData.hashCode()) * 31) + this.latestGradeTitle.hashCode()) * 31;
                n50.k kVar = this.latestGradeCard;
                int iHashCode2 = (((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31) + this.latestAbsenceTitle.hashCode()) * 31;
                n50.k kVar2 = this.latestAbsenceCard;
                int iHashCode3 = (((iHashCode2 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31) + this.nextLessonTitle.hashCode()) * 31;
                n50.k kVar3 = this.nextLessonCard;
                return ((iHashCode3 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31) + this.onBackAction.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final ShortcutsLayoutData getShortcutsLayoutData() {
                return this.shortcutsLayoutData;
            }

            public String toString() {
                return "DisplayingChildDashboard(scaffoldData=" + this.scaffoldData + ", child=" + this.child + ", shortcutsLayoutData=" + this.shortcutsLayoutData + ", latestGradeTitle=" + this.latestGradeTitle + ", latestGradeCard=" + this.latestGradeCard + ", latestAbsenceTitle=" + this.latestAbsenceTitle + ", latestAbsenceCard=" + this.latestAbsenceCard + ", nextLessonTitle=" + this.nextLessonTitle + ", nextLessonCard=" + this.nextLessonCard + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: i43.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li43/c$a$b;", "Li43/c$a;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorChildDashboard implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public ErrorChildDashboard(hb4.c cVar) {
                this.errorVMSAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorChildDashboard) && fr.t.c(this.errorVMSAdapter, ((ErrorChildDashboard) other).errorVMSAdapter);
            }

            public int hashCode() {
                return this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "ErrorChildDashboard(errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: i43.c$a$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li43/c$a$c;", "Li43/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2109c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2109c f89236a = new C2109c();

            private C2109c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2109c);
            }

            public int hashCode() {
                return -79835518;
            }

            public String toString() {
                return "LoadingChildDashboard";
            }
        }
    }
}
