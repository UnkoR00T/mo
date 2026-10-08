package m94;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lm94/e;", "Ll00/e;", "Lm94/e$a;", "a", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lm94/e$a;", "", "e", "c", "a", "b", "d", "Lm94/e$a$a;", "Lm94/e$a$b;", "Lm94/e$a$c;", "Lm94/e$a$d;", "Lm94/e$a$e;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: m94.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b/\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b+\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b3\u0010>R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b?\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b1\u0010@\u001a\u0004\b<\u0010AR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b5\u0010C\u001a\u0004\b'\u0010DR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bB\u0010G¨\u0006H"}, d2 = {"Lm94/e$a$a;", "Lm94/e$a;", "Lm94/b;", "data", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Li50/a;", "scaffoldData", "Lmx/a;", "semesterTitle", "Lj30/a;", "changeSemesterButtonData", "Lk40/a;", "breakInLearningData", "Ln50/g;", "finalGradeCardData", "partialGradesSectionTitle", "Ln30/b;", "partialGradesListData", "partialGradesEmptyState", "Lg30/n;", "bottomSheetData", "", "Lm94/c;", "semesterSheetItems", "<init>", "(Lm94/b;Ler/a;Li50/a;Lmx/a;Lj30/a;Lk40/a;Ln50/g;Lmx/a;Ln30/b;Lk40/a;Lg30/n;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm94/b;", "getData", "()Lm94/b;", "b", "Ler/a;", "e", "()Ler/a;", "c", "Li50/a;", "i", "()Li50/a;", "d", "Lmx/a;", "k", "()Lmx/a;", "Lj30/a;", "()Lj30/a;", "f", "Lk40/a;", "()Lk40/a;", "g", "Ln50/g;", "()Ln50/g;", "h", "Ln30/b;", "()Ln30/b;", "j", "Lg30/n;", "()Lg30/n;", "l", "Ljava/util/List;", "()Ljava/util/List;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayingBehaviorList implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BehaviorListData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label semesterTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData changeSemesterButtonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData breakInLearningData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final DefaultSingleCardData finalGradeCardData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label partialGradesSectionTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData partialGradesListData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData partialGradesEmptyState;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<SemesterSheetItemData> semesterSheetItems;

            public DisplayingBehaviorList(BehaviorListData behaviorListData, er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, Label label, ButtonTextData buttonTextData, EmptyStateData emptyStateData, DefaultSingleCardData defaultSingleCardData, Label label2, CardListData cardListData, EmptyStateData emptyStateData2, ModalBottomSheetData modalBottomSheetData, List<SemesterSheetItemData> list) {
                this.data = behaviorListData;
                this.onBackAction = aVar;
                this.scaffoldData = baseScaffoldData;
                this.semesterTitle = label;
                this.changeSemesterButtonData = buttonTextData;
                this.breakInLearningData = emptyStateData;
                this.finalGradeCardData = defaultSingleCardData;
                this.partialGradesSectionTitle = label2;
                this.partialGradesListData = cardListData;
                this.partialGradesEmptyState = emptyStateData2;
                this.bottomSheetData = modalBottomSheetData;
                this.semesterSheetItems = list;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EmptyStateData getBreakInLearningData() {
                return this.breakInLearningData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonTextData getChangeSemesterButtonData() {
                return this.changeSemesterButtonData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final DefaultSingleCardData getFinalGradeCardData() {
                return this.finalGradeCardData;
            }

            public final er.a<oq.i0> e() {
                return this.onBackAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayingBehaviorList)) {
                    return false;
                }
                DisplayingBehaviorList displayingBehaviorList = (DisplayingBehaviorList) other;
                return fr.t.c(this.data, displayingBehaviorList.data) && fr.t.c(this.onBackAction, displayingBehaviorList.onBackAction) && fr.t.c(this.scaffoldData, displayingBehaviorList.scaffoldData) && fr.t.c(this.semesterTitle, displayingBehaviorList.semesterTitle) && fr.t.c(this.changeSemesterButtonData, displayingBehaviorList.changeSemesterButtonData) && fr.t.c(this.breakInLearningData, displayingBehaviorList.breakInLearningData) && fr.t.c(this.finalGradeCardData, displayingBehaviorList.finalGradeCardData) && fr.t.c(this.partialGradesSectionTitle, displayingBehaviorList.partialGradesSectionTitle) && fr.t.c(this.partialGradesListData, displayingBehaviorList.partialGradesListData) && fr.t.c(this.partialGradesEmptyState, displayingBehaviorList.partialGradesEmptyState) && fr.t.c(this.bottomSheetData, displayingBehaviorList.bottomSheetData) && fr.t.c(this.semesterSheetItems, displayingBehaviorList.semesterSheetItems);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final EmptyStateData getPartialGradesEmptyState() {
                return this.partialGradesEmptyState;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final CardListData getPartialGradesListData() {
                return this.partialGradesListData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getPartialGradesSectionTitle() {
                return this.partialGradesSectionTitle;
            }

            public int hashCode() {
                int iHashCode = ((((this.data.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.scaffoldData.hashCode()) * 31;
                Label label = this.semesterTitle;
                int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
                ButtonTextData buttonTextData = this.changeSemesterButtonData;
                int iHashCode3 = (iHashCode2 + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31;
                EmptyStateData emptyStateData = this.breakInLearningData;
                int iHashCode4 = (iHashCode3 + (emptyStateData == null ? 0 : emptyStateData.hashCode())) * 31;
                DefaultSingleCardData defaultSingleCardData = this.finalGradeCardData;
                int iHashCode5 = (((iHashCode4 + (defaultSingleCardData == null ? 0 : defaultSingleCardData.hashCode())) * 31) + this.partialGradesSectionTitle.hashCode()) * 31;
                CardListData cardListData = this.partialGradesListData;
                int iHashCode6 = (iHashCode5 + (cardListData == null ? 0 : cardListData.hashCode())) * 31;
                EmptyStateData emptyStateData2 = this.partialGradesEmptyState;
                return ((((iHashCode6 + (emptyStateData2 != null ? emptyStateData2.hashCode() : 0)) * 31) + this.bottomSheetData.hashCode()) * 31) + this.semesterSheetItems.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public final List<SemesterSheetItemData> j() {
                return this.semesterSheetItems;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getSemesterTitle() {
                return this.semesterTitle;
            }

            public String toString() {
                return "DisplayingBehaviorList(data=" + this.data + ", onBackAction=" + this.onBackAction + ", scaffoldData=" + this.scaffoldData + ", semesterTitle=" + this.semesterTitle + ", changeSemesterButtonData=" + this.changeSemesterButtonData + ", breakInLearningData=" + this.breakInLearningData + ", finalGradeCardData=" + this.finalGradeCardData + ", partialGradesSectionTitle=" + this.partialGradesSectionTitle + ", partialGradesListData=" + this.partialGradesListData + ", partialGradesEmptyState=" + this.partialGradesEmptyState + ", bottomSheetData=" + this.bottomSheetData + ", semesterSheetItems=" + this.semesterSheetItems + ')';
            }
        }

        /* JADX INFO: renamed from: m94.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lm94/e$a$b;", "Lm94/e$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "gradeLabel", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "Ler/a;", "()Ler/a;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayingFullBehaviourGradeText implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f124879d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label gradeLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            public DisplayingFullBehaviourGradeText(BaseScaffoldData baseScaffoldData, Label label, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.gradeLabel = label;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getGradeLabel() {
                return this.gradeLabel;
            }

            public final er.a<oq.i0> b() {
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
                if (!(other instanceof DisplayingFullBehaviourGradeText)) {
                    return false;
                }
                DisplayingFullBehaviourGradeText displayingFullBehaviourGradeText = (DisplayingFullBehaviourGradeText) other;
                return fr.t.c(this.scaffoldData, displayingFullBehaviourGradeText.scaffoldData) && fr.t.c(this.gradeLabel, displayingFullBehaviourGradeText.gradeLabel) && fr.t.c(this.onBackAction, displayingFullBehaviourGradeText.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.gradeLabel.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "DisplayingFullBehaviourGradeText(scaffoldData=" + this.scaffoldData + ", gradeLabel=" + this.gradeLabel + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: m94.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lm94/e$a$c;", "Lm94/e$a;", "Li50/a;", "scaffoldData", "Lk40/a;", "emptyStateData", "Lmx/a;", "partialGradesSectionTitle", "<init>", "(Li50/a;Lk40/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lk40/a;", "()Lk40/a;", "Lmx/a;", "()Lmx/a;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EmptyState implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f124883d = EmptyStateData.f108236d | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData emptyStateData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label partialGradesSectionTitle;

            public EmptyState(BaseScaffoldData baseScaffoldData, EmptyStateData emptyStateData, Label label) {
                this.scaffoldData = baseScaffoldData;
                this.emptyStateData = emptyStateData;
                this.partialGradesSectionTitle = label;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final EmptyStateData getEmptyStateData() {
                return this.emptyStateData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getPartialGradesSectionTitle() {
                return this.partialGradesSectionTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmptyState)) {
                    return false;
                }
                EmptyState emptyState = (EmptyState) other;
                return fr.t.c(this.scaffoldData, emptyState.scaffoldData) && fr.t.c(this.emptyStateData, emptyState.emptyStateData) && fr.t.c(this.partialGradesSectionTitle, emptyState.partialGradesSectionTitle);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.emptyStateData.hashCode()) * 31) + this.partialGradesSectionTitle.hashCode();
            }

            public String toString() {
                return "EmptyState(scaffoldData=" + this.scaffoldData + ", emptyStateData=" + this.emptyStateData + ", partialGradesSectionTitle=" + this.partialGradesSectionTitle + ')';
            }
        }

        /* JADX INFO: renamed from: m94.e$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm94/e$a$d;", "Lm94/e$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: m94.e$a$e, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm94/e$a$e;", "Lm94/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C3074e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3074e f124888a = new C3074e();

            private C3074e() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C3074e);
            }

            public int hashCode() {
                return -1277619741;
            }

            public String toString() {
                return "LoadingBehaviorList";
            }
        }
    }
}
