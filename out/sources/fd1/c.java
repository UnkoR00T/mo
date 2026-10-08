package fd1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfd1/c;", "Ll00/e;", "Lfd1/c$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lfd1/c$a;", "", "a", "c", "b", "Lfd1/c$a$a;", "Lfd1/c$a$b;", "Lfd1/c$a$c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: fd1.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\b3\u0010:R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\b7\u0010BR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\bF\u0010:R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bE\u0010HR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bD\u0010:R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bC\u0010HR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\bK\u0010:R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u0010@\u001a\u0004\bM\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bN\u00108\u001a\u0004\bO\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bP\u0010@\u001a\u0004\bQ\u0010BR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u00108\u001a\u0004\bI\u0010:R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bJ\u0010BR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bN\u0010:R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bO\u0010G\u001a\u0004\bL\u0010HR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u00108\u001a\u0004\bR\u0010:R\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bP\u0010HR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u00108\u001a\u0004\bU\u0010:R\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u0010@\u001a\u0004\bV\u0010BR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u00108\u001a\u0004\b=\u0010:R\u0017\u0010\u001e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bV\u0010G\u001a\u0004\b;\u0010HR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b9\u0010W\u001a\u0004\b?\u0010XR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b>\u0010Y\u001a\u0004\bT\u0010ZR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bA\u0010[\u001a\u0004\bS\u0010\\¨\u0006]"}, d2 = {"Lfd1/c$a$a;", "Lfd1/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "yourDataSectionTitle", "Ln50/k;", "yourDataSingleCardData", "accommodationSectionTitle", "accommodationSingleCardData", "companyDetailsSectionTitle", "Ln30/b;", "companyDetailsCardListData", "companyContactDataSectionTitle", "companyContactDataCardListData", "pkdCodesSectionTitle", "pkdCodesSingleCardData", "permanentBusinessPlaceSectionTitle", "permanentBusinessPlaceSingleCardData", "correspondenceAddressSectionTitle", "correspondenceAddressSingleCardData", "electronicDeliverySectionTitle", "electronicDeliveryCardListData", "insuranceSectionTitle", "insuranceCardListData", "taxOfficeSectionTitle", "taxOfficeSingleCardData", "accountingRecordsSectionTitle", "accountingRecordsCardListData", "Lc30/b;", "alertData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lh30/a;", "nextButton", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Ln50/k;Lmx/a;Ln50/k;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln50/k;Lmx/a;Ln50/k;Lmx/a;Ln50/k;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln50/k;Lmx/a;Ln30/b;Lc30/b;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "w", "()Li50/a;", "b", "Lmx/a;", "z", "()Lmx/a;", "c", "l", "d", "A", "e", "Ln50/k;", "B", "()Ln50/k;", "f", "g", "h", "i", "Ln30/b;", "()Ln30/b;", "j", "k", "u", "m", "v", "n", "s", "o", "t", "p", "q", "r", "x", "y", "Lc30/b;", "()Lc30/b;", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label yourDataSectionTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k yourDataSingleCardData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label accommodationSectionTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k accommodationSingleCardData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label companyDetailsSectionTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData companyDetailsCardListData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label companyContactDataSectionTitle;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData companyContactDataCardListData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label pkdCodesSectionTitle;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k pkdCodesSingleCardData;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label permanentBusinessPlaceSectionTitle;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k permanentBusinessPlaceSingleCardData;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label correspondenceAddressSectionTitle;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k correspondenceAddressSingleCardData;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label electronicDeliverySectionTitle;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData electronicDeliveryCardListData;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label insuranceSectionTitle;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData insuranceCardListData;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label taxOfficeSectionTitle;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k taxOfficeSingleCardData;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label accountingRecordsSectionTitle;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData accountingRecordsCardListData;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, n50.k kVar, Label label4, n50.k kVar2, Label label5, CardListData cardListData, Label label6, CardListData cardListData2, Label label7, n50.k kVar3, Label label8, n50.k kVar4, Label label9, n50.k kVar5, Label label10, CardListData cardListData3, Label label11, CardListData cardListData4, Label label12, n50.k kVar6, Label label13, CardListData cardListData5, c30.b bVar, er.a<i0> aVar, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.yourDataSectionTitle = label3;
                this.yourDataSingleCardData = kVar;
                this.accommodationSectionTitle = label4;
                this.accommodationSingleCardData = kVar2;
                this.companyDetailsSectionTitle = label5;
                this.companyDetailsCardListData = cardListData;
                this.companyContactDataSectionTitle = label6;
                this.companyContactDataCardListData = cardListData2;
                this.pkdCodesSectionTitle = label7;
                this.pkdCodesSingleCardData = kVar3;
                this.permanentBusinessPlaceSectionTitle = label8;
                this.permanentBusinessPlaceSingleCardData = kVar4;
                this.correspondenceAddressSectionTitle = label9;
                this.correspondenceAddressSingleCardData = kVar5;
                this.electronicDeliverySectionTitle = label10;
                this.electronicDeliveryCardListData = cardListData3;
                this.insuranceSectionTitle = label11;
                this.insuranceCardListData = cardListData4;
                this.taxOfficeSectionTitle = label12;
                this.taxOfficeSingleCardData = kVar6;
                this.accountingRecordsSectionTitle = label13;
                this.accountingRecordsCardListData = cardListData5;
                this.alertData = bVar;
                this.onBackAction = aVar;
                this.nextButton = buttonData;
            }

            /* JADX INFO: renamed from: A, reason: from getter */
            public final Label getYourDataSectionTitle() {
                return this.yourDataSectionTitle;
            }

            /* JADX INFO: renamed from: B, reason: from getter */
            public final n50.k getYourDataSingleCardData() {
                return this.yourDataSingleCardData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getAccommodationSectionTitle() {
                return this.accommodationSectionTitle;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final n50.k getAccommodationSingleCardData() {
                return this.accommodationSingleCardData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getAccountingRecordsCardListData() {
                return this.accountingRecordsCardListData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getAccountingRecordsSectionTitle() {
                return this.accountingRecordsSectionTitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.description, initialized.description) && fr.t.c(this.yourDataSectionTitle, initialized.yourDataSectionTitle) && fr.t.c(this.yourDataSingleCardData, initialized.yourDataSingleCardData) && fr.t.c(this.accommodationSectionTitle, initialized.accommodationSectionTitle) && fr.t.c(this.accommodationSingleCardData, initialized.accommodationSingleCardData) && fr.t.c(this.companyDetailsSectionTitle, initialized.companyDetailsSectionTitle) && fr.t.c(this.companyDetailsCardListData, initialized.companyDetailsCardListData) && fr.t.c(this.companyContactDataSectionTitle, initialized.companyContactDataSectionTitle) && fr.t.c(this.companyContactDataCardListData, initialized.companyContactDataCardListData) && fr.t.c(this.pkdCodesSectionTitle, initialized.pkdCodesSectionTitle) && fr.t.c(this.pkdCodesSingleCardData, initialized.pkdCodesSingleCardData) && fr.t.c(this.permanentBusinessPlaceSectionTitle, initialized.permanentBusinessPlaceSectionTitle) && fr.t.c(this.permanentBusinessPlaceSingleCardData, initialized.permanentBusinessPlaceSingleCardData) && fr.t.c(this.correspondenceAddressSectionTitle, initialized.correspondenceAddressSectionTitle) && fr.t.c(this.correspondenceAddressSingleCardData, initialized.correspondenceAddressSingleCardData) && fr.t.c(this.electronicDeliverySectionTitle, initialized.electronicDeliverySectionTitle) && fr.t.c(this.electronicDeliveryCardListData, initialized.electronicDeliveryCardListData) && fr.t.c(this.insuranceSectionTitle, initialized.insuranceSectionTitle) && fr.t.c(this.insuranceCardListData, initialized.insuranceCardListData) && fr.t.c(this.taxOfficeSectionTitle, initialized.taxOfficeSectionTitle) && fr.t.c(this.taxOfficeSingleCardData, initialized.taxOfficeSingleCardData) && fr.t.c(this.accountingRecordsSectionTitle, initialized.accountingRecordsSectionTitle) && fr.t.c(this.accountingRecordsCardListData, initialized.accountingRecordsCardListData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.onBackAction, initialized.onBackAction) && fr.t.c(this.nextButton, initialized.nextButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CardListData getCompanyContactDataCardListData() {
                return this.companyContactDataCardListData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getCompanyContactDataSectionTitle() {
                return this.companyContactDataSectionTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final CardListData getCompanyDetailsCardListData() {
                return this.companyDetailsCardListData;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.yourDataSectionTitle.hashCode()) * 31) + this.yourDataSingleCardData.hashCode()) * 31;
                Label label = this.accommodationSectionTitle;
                int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
                n50.k kVar = this.accommodationSingleCardData;
                int iHashCode3 = (((((((((((((iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31) + this.companyDetailsSectionTitle.hashCode()) * 31) + this.companyDetailsCardListData.hashCode()) * 31) + this.companyContactDataSectionTitle.hashCode()) * 31) + this.companyContactDataCardListData.hashCode()) * 31) + this.pkdCodesSectionTitle.hashCode()) * 31) + this.pkdCodesSingleCardData.hashCode()) * 31;
                Label label2 = this.permanentBusinessPlaceSectionTitle;
                int iHashCode4 = (iHashCode3 + (label2 == null ? 0 : label2.hashCode())) * 31;
                n50.k kVar2 = this.permanentBusinessPlaceSingleCardData;
                return ((((((((((((((((((((((((((iHashCode4 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31) + this.correspondenceAddressSectionTitle.hashCode()) * 31) + this.correspondenceAddressSingleCardData.hashCode()) * 31) + this.electronicDeliverySectionTitle.hashCode()) * 31) + this.electronicDeliveryCardListData.hashCode()) * 31) + this.insuranceSectionTitle.hashCode()) * 31) + this.insuranceCardListData.hashCode()) * 31) + this.taxOfficeSectionTitle.hashCode()) * 31) + this.taxOfficeSingleCardData.hashCode()) * 31) + this.accountingRecordsSectionTitle.hashCode()) * 31) + this.accountingRecordsCardListData.hashCode()) * 31) + this.alertData.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.nextButton.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getCompanyDetailsSectionTitle() {
                return this.companyDetailsSectionTitle;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getCorrespondenceAddressSectionTitle() {
                return this.correspondenceAddressSectionTitle;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final n50.k getCorrespondenceAddressSingleCardData() {
                return this.correspondenceAddressSingleCardData;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final CardListData getElectronicDeliveryCardListData() {
                return this.electronicDeliveryCardListData;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final Label getElectronicDeliverySectionTitle() {
                return this.electronicDeliverySectionTitle;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final CardListData getInsuranceCardListData() {
                return this.insuranceCardListData;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final Label getInsuranceSectionTitle() {
                return this.insuranceSectionTitle;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public final er.a<i0> r() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final Label getPermanentBusinessPlaceSectionTitle() {
                return this.permanentBusinessPlaceSectionTitle;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final n50.k getPermanentBusinessPlaceSingleCardData() {
                return this.permanentBusinessPlaceSingleCardData;
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", yourDataSectionTitle=" + this.yourDataSectionTitle + ", yourDataSingleCardData=" + this.yourDataSingleCardData + ", accommodationSectionTitle=" + this.accommodationSectionTitle + ", accommodationSingleCardData=" + this.accommodationSingleCardData + ", companyDetailsSectionTitle=" + this.companyDetailsSectionTitle + ", companyDetailsCardListData=" + this.companyDetailsCardListData + ", companyContactDataSectionTitle=" + this.companyContactDataSectionTitle + ", companyContactDataCardListData=" + this.companyContactDataCardListData + ", pkdCodesSectionTitle=" + this.pkdCodesSectionTitle + ", pkdCodesSingleCardData=" + this.pkdCodesSingleCardData + ", permanentBusinessPlaceSectionTitle=" + this.permanentBusinessPlaceSectionTitle + ", permanentBusinessPlaceSingleCardData=" + this.permanentBusinessPlaceSingleCardData + ", correspondenceAddressSectionTitle=" + this.correspondenceAddressSectionTitle + ", correspondenceAddressSingleCardData=" + this.correspondenceAddressSingleCardData + ", electronicDeliverySectionTitle=" + this.electronicDeliverySectionTitle + ", electronicDeliveryCardListData=" + this.electronicDeliveryCardListData + ", insuranceSectionTitle=" + this.insuranceSectionTitle + ", insuranceCardListData=" + this.insuranceCardListData + ", taxOfficeSectionTitle=" + this.taxOfficeSectionTitle + ", taxOfficeSingleCardData=" + this.taxOfficeSingleCardData + ", accountingRecordsSectionTitle=" + this.accountingRecordsSectionTitle + ", accountingRecordsCardListData=" + this.accountingRecordsCardListData + ", alertData=" + this.alertData + ", onBackAction=" + this.onBackAction + ", nextButton=" + this.nextButton + ')';
            }

            /* JADX INFO: renamed from: u, reason: from getter */
            public final Label getPkdCodesSectionTitle() {
                return this.pkdCodesSectionTitle;
            }

            /* JADX INFO: renamed from: v, reason: from getter */
            public final n50.k getPkdCodesSingleCardData() {
                return this.pkdCodesSingleCardData;
            }

            /* JADX INFO: renamed from: w, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: x, reason: from getter */
            public final Label getTaxOfficeSectionTitle() {
                return this.taxOfficeSectionTitle;
            }

            /* JADX INFO: renamed from: y, reason: from getter */
            public final n50.k getTaxOfficeSingleCardData() {
                return this.taxOfficeSingleCardData;
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }
        }

        /* JADX INFO: renamed from: fd1.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfd1/c$a$b;", "Lfd1/c$a;", "Li50/a;", "scaffoldData", "Ln30/b;", "pkdCodesCardList", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Ln30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Ln30/b;", "()Ln30/b;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Pkd implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f61433d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData pkdCodesCardList;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public Pkd(BaseScaffoldData baseScaffoldData, CardListData cardListData, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.pkdCodesCardList = cardListData;
                this.onBackAction = aVar;
            }

            public final er.a<i0> a() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getPkdCodesCardList() {
                return this.pkdCodesCardList;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Pkd)) {
                    return false;
                }
                Pkd pkd = (Pkd) other;
                return fr.t.c(this.scaffoldData, pkd.scaffoldData) && fr.t.c(this.pkdCodesCardList, pkd.pkdCodesCardList) && fr.t.c(this.onBackAction, pkd.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.pkdCodesCardList.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "Pkd(scaffoldData=" + this.scaffoldData + ", pkdCodesCardList=" + this.pkdCodesCardList + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: fd1.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006&"}, d2 = {"Lfd1/c$a$c;", "Lfd1/c$a;", "Li50/a;", "scaffoldData", "Ln30/b;", "yourDataCardList", "Lmx/a;", "parentsDataTitle", "parentsDataCardList", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Ln30/b;Lmx/a;Ln30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Ln30/b;", "e", "()Ln30/b;", "c", "Lmx/a;", "()Lmx/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class YourData implements a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f61437f = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData yourDataCardList;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label parentsDataTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData parentsDataCardList;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public YourData(BaseScaffoldData baseScaffoldData, CardListData cardListData, Label label, CardListData cardListData2, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.yourDataCardList = cardListData;
                this.parentsDataTitle = label;
                this.parentsDataCardList = cardListData2;
                this.onBackAction = aVar;
            }

            public final er.a<i0> a() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getParentsDataCardList() {
                return this.parentsDataCardList;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getParentsDataTitle() {
                return this.parentsDataTitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getYourDataCardList() {
                return this.yourDataCardList;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof YourData)) {
                    return false;
                }
                YourData yourData = (YourData) other;
                return fr.t.c(this.scaffoldData, yourData.scaffoldData) && fr.t.c(this.yourDataCardList, yourData.yourDataCardList) && fr.t.c(this.parentsDataTitle, yourData.parentsDataTitle) && fr.t.c(this.parentsDataCardList, yourData.parentsDataCardList) && fr.t.c(this.onBackAction, yourData.onBackAction);
            }

            public int hashCode() {
                return (((((((this.scaffoldData.hashCode() * 31) + this.yourDataCardList.hashCode()) * 31) + this.parentsDataTitle.hashCode()) * 31) + this.parentsDataCardList.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "YourData(scaffoldData=" + this.scaffoldData + ", yourDataCardList=" + this.yourDataCardList + ", parentsDataTitle=" + this.parentsDataTitle + ", parentsDataCardList=" + this.parentsDataCardList + ", onBackAction=" + this.onBackAction + ')';
            }
        }
    }
}
