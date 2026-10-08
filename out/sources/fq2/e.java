package fq2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfq2/e;", "Ll00/e;", "Lfq2/e$a;", "a", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lfq2/e$a;", "", "b", "c", "d", "a", "Lfq2/e$a$a;", "Lfq2/e$a$b;", "Lfq2/e$a$c;", "Lfq2/e$a$d;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: fq2.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfq2/e$a$a;", "Lfq2/e$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
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
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq2/e$a$b;", "Lfq2/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f66188a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -322931883;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: fq2.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b8\u00102R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b6\u00105R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b/\u00102R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b+\u00105R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b;\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\b?\u0010DR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b:\u0010.R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b;\u0010E\u001a\u0004\b'\u0010F¨\u0006G"}, d2 = {"Lfq2/e$a$c;", "Lfq2/e$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lmx/a;", "headerLabel", "Ln30/b;", "officeCardListData", "parentSectionTitleLabel", "parentCardListData", "childSectionTitleLabel", "childCardListData", "attachmentsSectionTitleLabel", "attachmentsCardListData", "statementSectionTitleLabel", "Lw30/a;", "statementCheckBoxSingleData", "Lh30/a;", "sendButtonData", "", "scrollToStatementCheckBox", "onScrolledToStatementCheckBox", "Lc30/b;", "alertData", "<init>", "(Li50/a;Ler/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Lw30/a;Lh30/a;ZLer/a;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Ler/a;", "i", "()Ler/a;", "c", "Lmx/a;", "g", "()Lmx/a;", "Ln30/b;", "h", "()Ln30/b;", "e", "l", "f", "k", "j", "p", "Lw30/a;", "o", "()Lw30/a;", "m", "Lh30/a;", "n", "()Lh30/a;", "Z", "()Z", "Lc30/b;", "()Lc30/b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f66189q = (c30.b.f22944i | CheckBoxSingleData.f210090f) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData officeCardListData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label parentSectionTitleLabel;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData parentCardListData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label childSectionTitleLabel;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData childCardListData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label attachmentsSectionTitleLabel;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData attachmentsCardListData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statementSectionTitleLabel;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData statementCheckBoxSingleData;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData sendButtonData;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToStatementCheckBox;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onScrolledToStatementCheckBox;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            public Initialized(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, Label label, CardListData cardListData, Label label2, CardListData cardListData2, Label label3, CardListData cardListData3, Label label4, CardListData cardListData4, Label label5, CheckBoxSingleData checkBoxSingleData, ButtonData buttonData, boolean z15, er.a<oq.i0> aVar2, c30.b bVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.onBackClick = aVar;
                this.headerLabel = label;
                this.officeCardListData = cardListData;
                this.parentSectionTitleLabel = label2;
                this.parentCardListData = cardListData2;
                this.childSectionTitleLabel = label3;
                this.childCardListData = cardListData3;
                this.attachmentsSectionTitleLabel = label4;
                this.attachmentsCardListData = cardListData4;
                this.statementSectionTitleLabel = label5;
                this.statementCheckBoxSingleData = checkBoxSingleData;
                this.sendButtonData = buttonData;
                this.scrollToStatementCheckBox = z15;
                this.onScrolledToStatementCheckBox = aVar2;
                this.alertData = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getAttachmentsCardListData() {
                return this.attachmentsCardListData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getAttachmentsSectionTitleLabel() {
                return this.attachmentsSectionTitleLabel;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getChildCardListData() {
                return this.childCardListData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.headerLabel, initialized.headerLabel) && fr.t.c(this.officeCardListData, initialized.officeCardListData) && fr.t.c(this.parentSectionTitleLabel, initialized.parentSectionTitleLabel) && fr.t.c(this.parentCardListData, initialized.parentCardListData) && fr.t.c(this.childSectionTitleLabel, initialized.childSectionTitleLabel) && fr.t.c(this.childCardListData, initialized.childCardListData) && fr.t.c(this.attachmentsSectionTitleLabel, initialized.attachmentsSectionTitleLabel) && fr.t.c(this.attachmentsCardListData, initialized.attachmentsCardListData) && fr.t.c(this.statementSectionTitleLabel, initialized.statementSectionTitleLabel) && fr.t.c(this.statementCheckBoxSingleData, initialized.statementCheckBoxSingleData) && fr.t.c(this.sendButtonData, initialized.sendButtonData) && this.scrollToStatementCheckBox == initialized.scrollToStatementCheckBox && fr.t.c(this.onScrolledToStatementCheckBox, initialized.onScrolledToStatementCheckBox) && fr.t.c(this.alertData, initialized.alertData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getChildSectionTitleLabel() {
                return this.childSectionTitleLabel;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final CardListData getOfficeCardListData() {
                return this.officeCardListData;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.headerLabel.hashCode()) * 31) + this.officeCardListData.hashCode()) * 31) + this.parentSectionTitleLabel.hashCode()) * 31) + this.parentCardListData.hashCode()) * 31) + this.childSectionTitleLabel.hashCode()) * 31) + this.childCardListData.hashCode()) * 31) + this.attachmentsSectionTitleLabel.hashCode()) * 31) + this.attachmentsCardListData.hashCode()) * 31) + this.statementSectionTitleLabel.hashCode()) * 31;
                CheckBoxSingleData checkBoxSingleData = this.statementCheckBoxSingleData;
                return ((((((((iHashCode + (checkBoxSingleData == null ? 0 : checkBoxSingleData.hashCode())) * 31) + this.sendButtonData.hashCode()) * 31) + Boolean.hashCode(this.scrollToStatementCheckBox)) * 31) + this.onScrolledToStatementCheckBox.hashCode()) * 31) + this.alertData.hashCode();
            }

            public final er.a<oq.i0> i() {
                return this.onBackClick;
            }

            public final er.a<oq.i0> j() {
                return this.onScrolledToStatementCheckBox;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final CardListData getParentCardListData() {
                return this.parentCardListData;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getParentSectionTitleLabel() {
                return this.parentSectionTitleLabel;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final boolean getScrollToStatementCheckBox() {
                return this.scrollToStatementCheckBox;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final ButtonData getSendButtonData() {
                return this.sendButtonData;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final CheckBoxSingleData getStatementCheckBoxSingleData() {
                return this.statementCheckBoxSingleData;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final Label getStatementSectionTitleLabel() {
                return this.statementSectionTitleLabel;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", headerLabel=" + this.headerLabel + ", officeCardListData=" + this.officeCardListData + ", parentSectionTitleLabel=" + this.parentSectionTitleLabel + ", parentCardListData=" + this.parentCardListData + ", childSectionTitleLabel=" + this.childSectionTitleLabel + ", childCardListData=" + this.childCardListData + ", attachmentsSectionTitleLabel=" + this.attachmentsSectionTitleLabel + ", attachmentsCardListData=" + this.attachmentsCardListData + ", statementSectionTitleLabel=" + this.statementSectionTitleLabel + ", statementCheckBoxSingleData=" + this.statementCheckBoxSingleData + ", sendButtonData=" + this.sendButtonData + ", scrollToStatementCheckBox=" + this.scrollToStatementCheckBox + ", onScrolledToStatementCheckBox=" + this.onScrolledToStatementCheckBox + ", alertData=" + this.alertData + ')';
            }
        }

        /* JADX INFO: renamed from: fq2.e$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lfq2/e$a$d;", "Lfq2/e$a;", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "Lkotlin/Function0;", "onCloseClick", "<init>", "(Li50/a;Lq40/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lq40/g;", "()Lq40/g;", "c", "Ler/a;", "()Ler/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f66206d = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> iconPageData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onCloseClick;

            public Success(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, IconPageBottomContentData> iconPageData, er.a<oq.i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
                this.onCloseClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> b() {
                return this.iconPageData;
            }

            public final er.a<oq.i0> c() {
                return this.onCloseClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return fr.t.c(this.baseScaffoldData, success.baseScaffoldData) && fr.t.c(this.iconPageData, success.iconPageData) && fr.t.c(this.onCloseClick, success.onCloseClick);
            }

            public int hashCode() {
                return (((this.baseScaffoldData.hashCode() * 31) + this.iconPageData.hashCode()) * 31) + this.onCloseClick.hashCode();
            }

            public String toString() {
                return "Success(baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ", onCloseClick=" + this.onCloseClick + ')';
            }
        }
    }
}
