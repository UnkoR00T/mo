package ba4;

import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lba4/k;", "Ll00/e;", "Lba4/k$a;", "a", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lba4/k$a;", "", "d", "b", "a", "c", "Lba4/k$a$a;", "Lba4/k$a$b;", "Lba4/k$a$c;", "Lba4/k$a$d;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ba4.k$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lba4/k$a$a;", "Lba4/k$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "gradeLabel", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "Ler/a;", "()Ler/a;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayingFullGradeText implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f17898d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label gradeLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public DisplayingFullGradeText(BaseScaffoldData baseScaffoldData, Label label, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.gradeLabel = label;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getGradeLabel() {
                return this.gradeLabel;
            }

            public final er.a<i0> b() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayingFullGradeText)) {
                    return false;
                }
                DisplayingFullGradeText displayingFullGradeText = (DisplayingFullGradeText) other;
                return fr.t.c(this.scaffoldData, displayingFullGradeText.scaffoldData) && fr.t.c(this.gradeLabel, displayingFullGradeText.gradeLabel) && fr.t.c(this.onBackAction, displayingFullGradeText.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.gradeLabel.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "DisplayingFullGradeText(scaffoldData=" + this.scaffoldData + ", gradeLabel=" + this.gradeLabel + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: ba4.k$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b!\u0010'¨\u0006("}, d2 = {"Lba4/k$a$b;", "Lba4/k$a;", "Li50/a;", "scaffoldData", "Ln30/b;", "firstCardData", "detailsCardData", "previousGradeCardData", "Lmx/a;", "previousGradeSectionTitle", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Ln30/b;Ln30/b;Ln30/b;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Ln30/b;", "()Ln30/b;", "c", "d", "e", "Lmx/a;", "()Lmx/a;", "Ler/a;", "()Ler/a;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayingGradeDetails implements a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f17902g = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData firstCardData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData detailsCardData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData previousGradeCardData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label previousGradeSectionTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public DisplayingGradeDetails(BaseScaffoldData baseScaffoldData, CardListData cardListData, CardListData cardListData2, CardListData cardListData3, Label label, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.firstCardData = cardListData;
                this.detailsCardData = cardListData2;
                this.previousGradeCardData = cardListData3;
                this.previousGradeSectionTitle = label;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CardListData getDetailsCardData() {
                return this.detailsCardData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getFirstCardData() {
                return this.firstCardData;
            }

            public final er.a<i0> c() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getPreviousGradeCardData() {
                return this.previousGradeCardData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getPreviousGradeSectionTitle() {
                return this.previousGradeSectionTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayingGradeDetails)) {
                    return false;
                }
                DisplayingGradeDetails displayingGradeDetails = (DisplayingGradeDetails) other;
                return fr.t.c(this.scaffoldData, displayingGradeDetails.scaffoldData) && fr.t.c(this.firstCardData, displayingGradeDetails.firstCardData) && fr.t.c(this.detailsCardData, displayingGradeDetails.detailsCardData) && fr.t.c(this.previousGradeCardData, displayingGradeDetails.previousGradeCardData) && fr.t.c(this.previousGradeSectionTitle, displayingGradeDetails.previousGradeSectionTitle) && fr.t.c(this.onBackAction, displayingGradeDetails.onBackAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.firstCardData.hashCode()) * 31) + this.detailsCardData.hashCode()) * 31;
                CardListData cardListData = this.previousGradeCardData;
                int iHashCode2 = (iHashCode + (cardListData == null ? 0 : cardListData.hashCode())) * 31;
                Label label = this.previousGradeSectionTitle;
                return ((iHashCode2 + (label != null ? label.hashCode() : 0)) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "DisplayingGradeDetails(scaffoldData=" + this.scaffoldData + ", firstCardData=" + this.firstCardData + ", detailsCardData=" + this.detailsCardData + ", previousGradeCardData=" + this.previousGradeCardData + ", previousGradeSectionTitle=" + this.previousGradeSectionTitle + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: ba4.k$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lba4/k$a$c;", "Lba4/k$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorLoadingGradeDetails implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public ErrorLoadingGradeDetails(hb4.c cVar) {
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
                return (other instanceof ErrorLoadingGradeDetails) && fr.t.c(this.errorVMS, ((ErrorLoadingGradeDetails) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "ErrorLoadingGradeDetails(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lba4/k$a$d;", "Lba4/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f17910a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1191524271;
            }

            public String toString() {
                return "LoadingGradeDetails";
            }
        }
    }
}
