package w91;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lw91/d;", "Ll00/e;", "Lw91/d$a;", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lw91/d$a;", "", "b", "c", "d", "a", "Lw91/d$a$a;", "Lw91/d$a$b;", "Lw91/d$a$c;", "Lw91/d$a$d;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: w91.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw91/d$a$a;", "Lw91/d$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw91/d$a$b;", "Lw91/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f211327a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1605404821;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: w91.d$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010:R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\b@\u0010:R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\bE\u0010:R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bD\u0010=R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u00108\u001a\u0004\bC\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\bB\u0010=R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\bF\u0010:R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u0010=R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bI\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\bJ\u0010=R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\b7\u0010:R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\b3\u0010=R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bJ\u00108\u001a\u0004\bK\u0010:R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bI\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b/\u0010QR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010TR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bM\u0010U\u001a\u0004\bO\u0010VR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bG\u00106¨\u0006W"}, d2 = {"Lw91/d$a$c;", "Lw91/d$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lmx/a;", "headerLabel", "Ln30/b;", "officeCardListData", "parentSectionTitleLabel", "parentCardListData", "childSectionTitleLabel", "childCardListData", "correspondenceAddressTitleLabel", "correspondenceAddressCardListData", "contactTitleLabel", "contactCardListData", "paymentTitleLabel", "paymentCardListData", "pickupMethodTitleLabel", "pickupMethodCardListData", "attachmentsSectionTitleLabel", "attachmentsCardListData", "statementSectionTitleLabel", "Lw30/a;", "statementCheckBoxSingleData", "Lc30/b;", "alertData", "Lh30/a;", "sendButtonData", "", "scrollToStatementCheckBox", "onScrolledToStatementCheckBox", "<init>", "(Li50/a;Ler/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Lw30/a;Lc30/b;Lh30/a;ZLer/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Ler/a;", "m", "()Ler/a;", "c", "Lmx/a;", "k", "()Lmx/a;", "Ln30/b;", "l", "()Ln30/b;", "e", "p", "f", "o", "g", "h", "i", "j", "r", "n", "q", "t", "s", "x", "Lw30/a;", "w", "()Lw30/a;", "u", "Lc30/b;", "()Lc30/b;", "v", "Lh30/a;", "()Lh30/a;", "Z", "()Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final int f211328y = (c30.b.f22944i | CheckBoxSingleData.f210090f) | BaseScaffoldData.f89350g;

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
            private final Label correspondenceAddressTitleLabel;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData correspondenceAddressCardListData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label contactTitleLabel;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData contactCardListData;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label paymentTitleLabel;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData paymentCardListData;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label pickupMethodTitleLabel;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData pickupMethodCardListData;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label attachmentsSectionTitleLabel;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData attachmentsCardListData;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statementSectionTitleLabel;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData statementCheckBoxSingleData;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData sendButtonData;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToStatementCheckBox;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onScrolledToStatementCheckBox;

            public Initialized(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, Label label, CardListData cardListData, Label label2, CardListData cardListData2, Label label3, CardListData cardListData3, Label label4, CardListData cardListData4, Label label5, CardListData cardListData5, Label label6, CardListData cardListData6, Label label7, CardListData cardListData7, Label label8, CardListData cardListData8, Label label9, CheckBoxSingleData checkBoxSingleData, c30.b bVar, ButtonData buttonData, boolean z15, er.a<oq.i0> aVar2) {
                this.baseScaffoldData = baseScaffoldData;
                this.onBackClick = aVar;
                this.headerLabel = label;
                this.officeCardListData = cardListData;
                this.parentSectionTitleLabel = label2;
                this.parentCardListData = cardListData2;
                this.childSectionTitleLabel = label3;
                this.childCardListData = cardListData3;
                this.correspondenceAddressTitleLabel = label4;
                this.correspondenceAddressCardListData = cardListData4;
                this.contactTitleLabel = label5;
                this.contactCardListData = cardListData5;
                this.paymentTitleLabel = label6;
                this.paymentCardListData = cardListData6;
                this.pickupMethodTitleLabel = label7;
                this.pickupMethodCardListData = cardListData7;
                this.attachmentsSectionTitleLabel = label8;
                this.attachmentsCardListData = cardListData8;
                this.statementSectionTitleLabel = label9;
                this.statementCheckBoxSingleData = checkBoxSingleData;
                this.alertData = bVar;
                this.sendButtonData = buttonData;
                this.scrollToStatementCheckBox = z15;
                this.onScrolledToStatementCheckBox = aVar2;
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
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.headerLabel, initialized.headerLabel) && fr.t.c(this.officeCardListData, initialized.officeCardListData) && fr.t.c(this.parentSectionTitleLabel, initialized.parentSectionTitleLabel) && fr.t.c(this.parentCardListData, initialized.parentCardListData) && fr.t.c(this.childSectionTitleLabel, initialized.childSectionTitleLabel) && fr.t.c(this.childCardListData, initialized.childCardListData) && fr.t.c(this.correspondenceAddressTitleLabel, initialized.correspondenceAddressTitleLabel) && fr.t.c(this.correspondenceAddressCardListData, initialized.correspondenceAddressCardListData) && fr.t.c(this.contactTitleLabel, initialized.contactTitleLabel) && fr.t.c(this.contactCardListData, initialized.contactCardListData) && fr.t.c(this.paymentTitleLabel, initialized.paymentTitleLabel) && fr.t.c(this.paymentCardListData, initialized.paymentCardListData) && fr.t.c(this.pickupMethodTitleLabel, initialized.pickupMethodTitleLabel) && fr.t.c(this.pickupMethodCardListData, initialized.pickupMethodCardListData) && fr.t.c(this.attachmentsSectionTitleLabel, initialized.attachmentsSectionTitleLabel) && fr.t.c(this.attachmentsCardListData, initialized.attachmentsCardListData) && fr.t.c(this.statementSectionTitleLabel, initialized.statementSectionTitleLabel) && fr.t.c(this.statementCheckBoxSingleData, initialized.statementCheckBoxSingleData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.sendButtonData, initialized.sendButtonData) && this.scrollToStatementCheckBox == initialized.scrollToStatementCheckBox && fr.t.c(this.onScrolledToStatementCheckBox, initialized.onScrolledToStatementCheckBox);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getChildSectionTitleLabel() {
                return this.childSectionTitleLabel;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final CardListData getContactCardListData() {
                return this.contactCardListData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getContactTitleLabel() {
                return this.contactTitleLabel;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.headerLabel.hashCode()) * 31) + this.officeCardListData.hashCode()) * 31) + this.parentSectionTitleLabel.hashCode()) * 31) + this.parentCardListData.hashCode()) * 31) + this.childSectionTitleLabel.hashCode()) * 31) + this.childCardListData.hashCode()) * 31) + this.correspondenceAddressTitleLabel.hashCode()) * 31) + this.correspondenceAddressCardListData.hashCode()) * 31) + this.contactTitleLabel.hashCode()) * 31;
                CardListData cardListData = this.contactCardListData;
                int iHashCode2 = (((((((iHashCode + (cardListData == null ? 0 : cardListData.hashCode())) * 31) + this.paymentTitleLabel.hashCode()) * 31) + this.paymentCardListData.hashCode()) * 31) + this.pickupMethodTitleLabel.hashCode()) * 31;
                CardListData cardListData2 = this.pickupMethodCardListData;
                int iHashCode3 = (((((((iHashCode2 + (cardListData2 == null ? 0 : cardListData2.hashCode())) * 31) + this.attachmentsSectionTitleLabel.hashCode()) * 31) + this.attachmentsCardListData.hashCode()) * 31) + this.statementSectionTitleLabel.hashCode()) * 31;
                CheckBoxSingleData checkBoxSingleData = this.statementCheckBoxSingleData;
                return ((((((((iHashCode3 + (checkBoxSingleData != null ? checkBoxSingleData.hashCode() : 0)) * 31) + this.alertData.hashCode()) * 31) + this.sendButtonData.hashCode()) * 31) + Boolean.hashCode(this.scrollToStatementCheckBox)) * 31) + this.onScrolledToStatementCheckBox.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final CardListData getCorrespondenceAddressCardListData() {
                return this.correspondenceAddressCardListData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getCorrespondenceAddressTitleLabel() {
                return this.correspondenceAddressTitleLabel;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final CardListData getOfficeCardListData() {
                return this.officeCardListData;
            }

            public final er.a<oq.i0> m() {
                return this.onBackClick;
            }

            public final er.a<oq.i0> n() {
                return this.onScrolledToStatementCheckBox;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final CardListData getParentCardListData() {
                return this.parentCardListData;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final Label getParentSectionTitleLabel() {
                return this.parentSectionTitleLabel;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final CardListData getPaymentCardListData() {
                return this.paymentCardListData;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final Label getPaymentTitleLabel() {
                return this.paymentTitleLabel;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final CardListData getPickupMethodCardListData() {
                return this.pickupMethodCardListData;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final Label getPickupMethodTitleLabel() {
                return this.pickupMethodTitleLabel;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", headerLabel=" + this.headerLabel + ", officeCardListData=" + this.officeCardListData + ", parentSectionTitleLabel=" + this.parentSectionTitleLabel + ", parentCardListData=" + this.parentCardListData + ", childSectionTitleLabel=" + this.childSectionTitleLabel + ", childCardListData=" + this.childCardListData + ", correspondenceAddressTitleLabel=" + this.correspondenceAddressTitleLabel + ", correspondenceAddressCardListData=" + this.correspondenceAddressCardListData + ", contactTitleLabel=" + this.contactTitleLabel + ", contactCardListData=" + this.contactCardListData + ", paymentTitleLabel=" + this.paymentTitleLabel + ", paymentCardListData=" + this.paymentCardListData + ", pickupMethodTitleLabel=" + this.pickupMethodTitleLabel + ", pickupMethodCardListData=" + this.pickupMethodCardListData + ", attachmentsSectionTitleLabel=" + this.attachmentsSectionTitleLabel + ", attachmentsCardListData=" + this.attachmentsCardListData + ", statementSectionTitleLabel=" + this.statementSectionTitleLabel + ", statementCheckBoxSingleData=" + this.statementCheckBoxSingleData + ", alertData=" + this.alertData + ", sendButtonData=" + this.sendButtonData + ", scrollToStatementCheckBox=" + this.scrollToStatementCheckBox + ", onScrolledToStatementCheckBox=" + this.onScrolledToStatementCheckBox + ')';
            }

            /* JADX INFO: renamed from: u, reason: from getter */
            public final boolean getScrollToStatementCheckBox() {
                return this.scrollToStatementCheckBox;
            }

            /* JADX INFO: renamed from: v, reason: from getter */
            public final ButtonData getSendButtonData() {
                return this.sendButtonData;
            }

            /* JADX INFO: renamed from: w, reason: from getter */
            public final CheckBoxSingleData getStatementCheckBoxSingleData() {
                return this.statementCheckBoxSingleData;
            }

            /* JADX INFO: renamed from: x, reason: from getter */
            public final Label getStatementSectionTitleLabel() {
                return this.statementSectionTitleLabel;
            }
        }

        /* JADX INFO: renamed from: w91.d$a$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lw91/d$a$d;", "Lw91/d$a;", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Lt40/b;", "Lq40/f;", "iconPageData", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Li50/a;Lq40/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lq40/g;", "()Lq40/g;", "c", "Ler/a;", "()Ler/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f211353d = ((IconPageBottomContentData.f164663d | InfoRowListData.f187643b) | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<InfoRowListData, IconPageBottomContentData> iconPageData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onCloseClick;

            public Success(BaseScaffoldData baseScaffoldData, IconPageData<InfoRowListData, IconPageBottomContentData> iconPageData, er.a<oq.i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
                this.onCloseClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final IconPageData<InfoRowListData, IconPageBottomContentData> b() {
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
