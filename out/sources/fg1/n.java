package fg1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfg1/n;", "Ll00/e;", "Lfg1/n$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lfg1/n$a;", "", "a", "d", "b", "c", "Lfg1/n$a$a;", "Lfg1/n$a$b;", "Lfg1/n$a$d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: fg1.n$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b7\u00102R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b5\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b3\u00102R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b:\u00102R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b*\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b.\u00102R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b&\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b,\u0010>\u001a\u0004\b8\u0010?R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b1\u0010@\u001a\u0004\b9\u0010A¨\u0006B"}, d2 = {"Lfg1/n$a$a;", "Lfg1/n$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lfg1/n$a$c;", "userDataSection", "suspensionStartSection", "suspensionEndSection", "mainPkdSection", "homeAddressSection", "electronicDeliverySection", "socialInsuranceSection", "taxOfficeSection", "companyShortName", "contactInfoSection", "Lc30/b;", "alertData", "Lh30/a;", "nextButton", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lfg1/n$a$c;Lfg1/n$a$c;Lfg1/n$a$c;Lfg1/n$a$c;Lfg1/n$a$c;Lfg1/n$a$c;Lfg1/n$a$c;Lfg1/n$a$c;Lfg1/n$a$c;Lfg1/n$a$c;Lc30/b;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "j", "()Li50/a;", "b", "Lmx/a;", "o", "()Lmx/a;", "c", "d", "Lfg1/n$a$c;", "p", "()Lfg1/n$a$c;", "e", "m", "f", "l", "g", "h", "i", "k", "n", "Lc30/b;", "()Lc30/b;", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f62779q = c30.b.f22944i | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData userDataSection;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData suspensionStartSection;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData suspensionEndSection;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData mainPkdSection;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData homeAddressSection;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData electronicDeliverySection;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData socialInsuranceSection;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData taxOfficeSection;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData companyShortName;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData contactInfoSection;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, SummarySectionData summarySectionData, SummarySectionData summarySectionData2, SummarySectionData summarySectionData3, SummarySectionData summarySectionData4, SummarySectionData summarySectionData5, SummarySectionData summarySectionData6, SummarySectionData summarySectionData7, SummarySectionData summarySectionData8, SummarySectionData summarySectionData9, SummarySectionData summarySectionData10, c30.b bVar, ButtonData buttonData, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.userDataSection = summarySectionData;
                this.suspensionStartSection = summarySectionData2;
                this.suspensionEndSection = summarySectionData3;
                this.mainPkdSection = summarySectionData4;
                this.homeAddressSection = summarySectionData5;
                this.electronicDeliverySection = summarySectionData6;
                this.socialInsuranceSection = summarySectionData7;
                this.taxOfficeSection = summarySectionData8;
                this.companyShortName = summarySectionData9;
                this.contactInfoSection = summarySectionData10;
                this.alertData = bVar;
                this.nextButton = buttonData;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final SummarySectionData getCompanyShortName() {
                return this.companyShortName;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final SummarySectionData getContactInfoSection() {
                return this.contactInfoSection;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final SummarySectionData getElectronicDeliverySection() {
                return this.electronicDeliverySection;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.description, initialized.description) && fr.t.c(this.userDataSection, initialized.userDataSection) && fr.t.c(this.suspensionStartSection, initialized.suspensionStartSection) && fr.t.c(this.suspensionEndSection, initialized.suspensionEndSection) && fr.t.c(this.mainPkdSection, initialized.mainPkdSection) && fr.t.c(this.homeAddressSection, initialized.homeAddressSection) && fr.t.c(this.electronicDeliverySection, initialized.electronicDeliverySection) && fr.t.c(this.socialInsuranceSection, initialized.socialInsuranceSection) && fr.t.c(this.taxOfficeSection, initialized.taxOfficeSection) && fr.t.c(this.companyShortName, initialized.companyShortName) && fr.t.c(this.contactInfoSection, initialized.contactInfoSection) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.nextButton, initialized.nextButton) && fr.t.c(this.onBackAction, initialized.onBackAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final SummarySectionData getHomeAddressSection() {
                return this.homeAddressSection;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final SummarySectionData getMainPkdSection() {
                return this.mainPkdSection;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.userDataSection.hashCode()) * 31) + this.suspensionStartSection.hashCode()) * 31;
                SummarySectionData summarySectionData = this.suspensionEndSection;
                int iHashCode2 = (iHashCode + (summarySectionData == null ? 0 : summarySectionData.hashCode())) * 31;
                SummarySectionData summarySectionData2 = this.mainPkdSection;
                int iHashCode3 = (((iHashCode2 + (summarySectionData2 == null ? 0 : summarySectionData2.hashCode())) * 31) + this.homeAddressSection.hashCode()) * 31;
                SummarySectionData summarySectionData3 = this.electronicDeliverySection;
                int iHashCode4 = (((((((iHashCode3 + (summarySectionData3 == null ? 0 : summarySectionData3.hashCode())) * 31) + this.socialInsuranceSection.hashCode()) * 31) + this.taxOfficeSection.hashCode()) * 31) + this.companyShortName.hashCode()) * 31;
                SummarySectionData summarySectionData4 = this.contactInfoSection;
                return ((((((iHashCode4 + (summarySectionData4 != null ? summarySectionData4.hashCode() : 0)) * 31) + this.alertData.hashCode()) * 31) + this.nextButton.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public final er.a<i0> i() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final SummarySectionData getSocialInsuranceSection() {
                return this.socialInsuranceSection;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final SummarySectionData getSuspensionEndSection() {
                return this.suspensionEndSection;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final SummarySectionData getSuspensionStartSection() {
                return this.suspensionStartSection;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final SummarySectionData getTaxOfficeSection() {
                return this.taxOfficeSection;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final SummarySectionData getUserDataSection() {
                return this.userDataSection;
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", userDataSection=" + this.userDataSection + ", suspensionStartSection=" + this.suspensionStartSection + ", suspensionEndSection=" + this.suspensionEndSection + ", mainPkdSection=" + this.mainPkdSection + ", homeAddressSection=" + this.homeAddressSection + ", electronicDeliverySection=" + this.electronicDeliverySection + ", socialInsuranceSection=" + this.socialInsuranceSection + ", taxOfficeSection=" + this.taxOfficeSection + ", companyShortName=" + this.companyShortName + ", contactInfoSection=" + this.contactInfoSection + ", alertData=" + this.alertData + ", nextButton=" + this.nextButton + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: fg1.n$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfg1/n$a$b;", "Lfg1/n$a;", "Li50/a;", "scaffoldData", "Lfg1/n$a$c;", "pkdCodesSection", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lfg1/n$a$c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lfg1/n$a$c;", "()Lfg1/n$a$c;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Pkd implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f62796d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData pkdCodesSection;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public Pkd(BaseScaffoldData baseScaffoldData, SummarySectionData summarySectionData, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.pkdCodesSection = summarySectionData;
                this.onBackAction = aVar;
            }

            public final er.a<i0> a() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final SummarySectionData getPkdCodesSection() {
                return this.pkdCodesSection;
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
                return fr.t.c(this.scaffoldData, pkd.scaffoldData) && fr.t.c(this.pkdCodesSection, pkd.pkdCodesSection) && fr.t.c(this.onBackAction, pkd.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.pkdCodesSection.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "Pkd(scaffoldData=" + this.scaffoldData + ", pkdCodesSection=" + this.pkdCodesSection + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: fg1.n$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfg1/n$a$c;", "", "Lmx/a;", "title", "Ln30/b;", "cardListData", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SummarySectionData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData cardListData;

            public SummarySectionData(Label label, CardListData cardListData) {
                this.title = label;
                this.cardListData = cardListData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CardListData getCardListData() {
                return this.cardListData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SummarySectionData)) {
                    return false;
                }
                SummarySectionData summarySectionData = (SummarySectionData) other;
                return fr.t.c(this.title, summarySectionData.title) && fr.t.c(this.cardListData, summarySectionData.cardListData);
            }

            public int hashCode() {
                Label label = this.title;
                return ((label == null ? 0 : label.hashCode()) * 31) + this.cardListData.hashCode();
            }

            public String toString() {
                return "SummarySectionData(title=" + this.title + ", cardListData=" + this.cardListData + ')';
            }
        }

        /* JADX INFO: renamed from: fg1.n$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lfg1/n$a$d;", "Lfg1/n$a;", "Li50/a;", "scaffoldData", "Lfg1/n$a$c;", "userSection", "userParentsSection", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lfg1/n$a$c;Lfg1/n$a$c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lfg1/n$a$c;", "d", "()Lfg1/n$a$c;", "c", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UserData implements a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f62802e = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData userSection;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final SummarySectionData userParentsSection;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public UserData(BaseScaffoldData baseScaffoldData, SummarySectionData summarySectionData, SummarySectionData summarySectionData2, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.userSection = summarySectionData;
                this.userParentsSection = summarySectionData2;
                this.onBackAction = aVar;
            }

            public final er.a<i0> a() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final SummarySectionData getUserParentsSection() {
                return this.userParentsSection;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final SummarySectionData getUserSection() {
                return this.userSection;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UserData)) {
                    return false;
                }
                UserData userData = (UserData) other;
                return fr.t.c(this.scaffoldData, userData.scaffoldData) && fr.t.c(this.userSection, userData.userSection) && fr.t.c(this.userParentsSection, userData.userParentsSection) && fr.t.c(this.onBackAction, userData.onBackAction);
            }

            public int hashCode() {
                return (((((this.scaffoldData.hashCode() * 31) + this.userSection.hashCode()) * 31) + this.userParentsSection.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "UserData(scaffoldData=" + this.scaffoldData + ", userSection=" + this.userSection + ", userParentsSection=" + this.userParentsSection + ", onBackAction=" + this.onBackAction + ')';
            }
        }
    }
}
