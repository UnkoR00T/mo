package gd1;

import de1.IncomeTaxExceededAddFileModel;
import de1.KrusData;
import de1.SocialInsuranceQuestions;
import fr.t;
import h30.ButtonData;
import hb1.CompanyNameForm;
import java.util.ArrayList;
import jd1.OpenCompanyWizardData;
import ld1.KrusOfficeModel;
import ld1.TaxOfficeModel;
import ld1.s;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgd1/h;", "Lxw/f;", "Lgd1/h$a;", "Ln30/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgd1/h$a;)Ln30/b;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, CardListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gd1.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgd1/h$a;", "", "Ljd1/a;", "openCompanyWizardData", "Lkotlin/Function0;", "Loq/i0;", "onPreviewAction", "<init>", "(Ljd1/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "b", "()Ljd1/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenCompanyWizardData openCompanyWizardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPreviewAction;

        public Params(OpenCompanyWizardData openCompanyWizardData, er.a<i0> aVar) {
            this.openCompanyWizardData = openCompanyWizardData;
            this.onPreviewAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onPreviewAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OpenCompanyWizardData getOpenCompanyWizardData() {
            return this.openCompanyWizardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.openCompanyWizardData, params.openCompanyWizardData) && t.c(this.onPreviewAction, params.onPreviewAction);
        }

        public int hashCode() {
            return (this.openCompanyWizardData.hashCode() * 31) + this.onPreviewAction.hashCode();
        }

        public String toString() {
            return "Params(openCompanyWizardData=" + this.openCompanyWizardData + ", onPreviewAction=" + this.onPreviewAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f71954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f71955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f71956e;

        static {
            int[] iArr = new int[lb1.a.values().length];
            try {
                iArr[lb1.a.ZUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71952a = iArr;
            int[] iArr2 = new int[de1.g.values().length];
            try {
                iArr2[de1.g.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f71953b = iArr2;
            int[] iArr3 = new int[de1.d.values().length];
            try {
                iArr3[de1.d.EXCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f71954c = iArr3;
            int[] iArr4 = new int[de1.c.values().length];
            try {
                iArr4[de1.c.SUBMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr4[de1.c.ATTACH_AS_ATTACHMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f71955d = iArr4;
            int[] iArr5 = new int[de1.b.values().length];
            try {
                iArr5[de1.b.SUBMIT_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            f71956e = iArr5;
        }
    }

    public h(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public CardListData b(Params params) {
        DefaultSingleCardData defaultSingleCardDataC;
        TaxOfficeModel taxOffice;
        TaxOfficeModel taxOffice2;
        SocialInsuranceQuestions socialInsuranceQuestions;
        SocialInsuranceQuestions socialInsuranceQuestions2;
        SocialInsuranceQuestions socialInsuranceQuestions3;
        KrusOfficeModel krusOffice;
        KrusOfficeModel krusOffice2;
        ArrayList arrayList = new ArrayList();
        Label labelN = this.labelProvider.c(ha1.a.f82546z3).n("place_payment_insurance_label");
        mx.c cVar = this.labelProvider;
        lb1.a selectedInsurance = params.getOpenCompanyWizardData().getSocialInsuranceSelectionContractData().getSelectedInsurance();
        int[] iArr = b.f71952a;
        arrayList.add(p.c(cVar.c(iArr[selectedInsurance.ordinal()] == 1 ? ha1.a.C2 : ha1.a.A2).n("place_payment_insurance_value"), labelN, null, null, null, 28, null));
        if (iArr[params.getOpenCompanyWizardData().getSocialInsuranceSelectionContractData().getSelectedInsurance().ordinal()] == 1) {
            Label labelN2 = this.labelProvider.c(ha1.a.f82455m4).n("zus_start_of_insurance_label");
            CompanyNameForm companyNameForm = params.getOpenCompanyWizardData().getCompanyNameContractData().getCompanyNameForm();
            arrayList.add(p.c(mx.b.b(String.valueOf(companyNameForm != null ? companyNameForm.getLaunchDateFrom() : null), "zus_start_of_insurance_value"), labelN2, null, null, null, 28, null));
        } else {
            Label labelN3 = this.labelProvider.c(ha1.a.f82511u3).n("krus_label");
            KrusData krusData = params.getOpenCompanyWizardData().getKrusData();
            Label labelD = mx.b.d((krusData == null || (krusOffice2 = krusData.getKrusOffice()) == null) ? null : krusOffice2.getName(), "krus_name_value");
            KrusData krusData2 = params.getOpenCompanyWizardData().getKrusData();
            DefaultSingleCardData defaultSingleCardDataC2 = p.c(labelD, labelN3, mx.b.d((krusData2 == null || (krusOffice = krusData2.getKrusOffice()) == null) ? null : ld1.j.a(krusOffice), "krus_address_value"), null, null, 24, null);
            Label labelN4 = this.labelProvider.c(ha1.a.K3).n("social_insurance_farmers_label");
            mx.c cVar2 = this.labelProvider;
            KrusData krusData3 = params.getOpenCompanyWizardData().getKrusData();
            de1.g firstAnswer = (krusData3 == null || (socialInsuranceQuestions3 = krusData3.getSocialInsuranceQuestions()) == null) ? null : socialInsuranceQuestions3.getFirstAnswer();
            DefaultSingleCardData defaultSingleCardDataC3 = p.c(cVar2.c((firstAnswer == null ? -1 : b.f71953b[firstAnswer.ordinal()]) == 1 ? ha1.a.f82508u0 : ha1.a.Q).n("social_insurance_farmers_value"), labelN4, null, null, null, 28, null);
            Label labelN5 = this.labelProvider.c(ha1.a.f82483q3).n("agricultural_activity_label");
            mx.c cVar3 = this.labelProvider;
            KrusData krusData4 = params.getOpenCompanyWizardData().getKrusData();
            de1.g secondAnswer = (krusData4 == null || (socialInsuranceQuestions2 = krusData4.getSocialInsuranceQuestions()) == null) ? null : socialInsuranceQuestions2.getSecondAnswer();
            DefaultSingleCardData defaultSingleCardDataC4 = p.c(cVar3.c((secondAnswer == null ? -1 : b.f71953b[secondAnswer.ordinal()]) == 1 ? ha1.a.f82508u0 : ha1.a.Q).n("agricultural_activity_value"), labelN5, null, null, null, 28, null);
            Label labelN6 = this.labelProvider.c(ha1.a.f82532x3).n("non_agricultural_activity_label");
            mx.c cVar4 = this.labelProvider;
            KrusData krusData5 = params.getOpenCompanyWizardData().getKrusData();
            de1.g thirdAnswer = (krusData5 == null || (socialInsuranceQuestions = krusData5.getSocialInsuranceQuestions()) == null) ? null : socialInsuranceQuestions.getThirdAnswer();
            DefaultSingleCardData defaultSingleCardDataC5 = p.c(cVar4.c((thirdAnswer == null ? -1 : b.f71953b[thirdAnswer.ordinal()]) == 1 ? ha1.a.f82508u0 : ha1.a.Q).n("non_agricultural_activity_value"), labelN6, null, null, null, 28, null);
            Label labelN7 = this.labelProvider.c(ha1.a.P3).n("krus_tax_office_title");
            KrusData krusData6 = params.getOpenCompanyWizardData().getKrusData();
            Label labelD2 = mx.b.d((krusData6 == null || (taxOffice2 = krusData6.getTaxOffice()) == null) ? null : taxOffice2.getName(), "krus_tax_office_name_value");
            KrusData krusData7 = params.getOpenCompanyWizardData().getKrusData();
            arrayList.addAll(v.q(defaultSingleCardDataC2, defaultSingleCardDataC3, defaultSingleCardDataC4, defaultSingleCardDataC5, p.c(labelD2, labelN7, mx.b.d((krusData7 == null || (taxOffice = krusData7.getTaxOffice()) == null) ? null : s.a(taxOffice), "krus_tax_office_address_value"), null, null, 24, null)));
            KrusData krusData8 = params.getOpenCompanyWizardData().getKrusData();
            de1.b incomeTaxExceededCertificateAnswer = krusData8 != null ? krusData8.getIncomeTaxExceededCertificateAnswer() : null;
            if ((incomeTaxExceededCertificateAnswer == null ? -1 : b.f71956e[incomeTaxExceededCertificateAnswer.ordinal()]) == 1) {
                Label labelC = this.labelProvider.c(ha1.a.f82485q5);
                mx.c cVar5 = this.labelProvider;
                de1.d incomeTaxExceededInfo = params.getOpenCompanyWizardData().getKrusData().getIncomeTaxExceededInfo();
                arrayList.add(p.c(cVar5.c((incomeTaxExceededInfo != null ? b.f71954c[incomeTaxExceededInfo.ordinal()] : -1) == 1 ? ha1.a.f82471o5 : ha1.a.f82478p5), labelC, null, null, null, 28, null));
            } else {
                KrusData krusData9 = params.getOpenCompanyWizardData().getKrusData();
                de1.c incomeTaxExceededCertificateInfoAnswer = krusData9 != null ? krusData9.getIncomeTaxExceededCertificateInfoAnswer() : null;
                int i15 = incomeTaxExceededCertificateInfoAnswer != null ? b.f71955d[incomeTaxExceededCertificateInfoAnswer.ordinal()] : -1;
                if (i15 == 1) {
                    defaultSingleCardDataC = p.c(this.labelProvider.c(ha1.a.f82432j5), this.labelProvider.c(ha1.a.N3), null, null, null, 28, null);
                } else if (i15 != 2) {
                    defaultSingleCardDataC = p.c(this.labelProvider.c(ha1.a.f82448l5), this.labelProvider.c(ha1.a.N3), null, null, null, 28, null);
                } else {
                    Label labelC2 = this.labelProvider.c(ha1.a.N3);
                    IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel = params.getOpenCompanyWizardData().getKrusData().getIncomeTaxExceededAddFileModel();
                    Label labelD3 = mx.b.d(incomeTaxExceededAddFileModel != null ? incomeTaxExceededAddFileModel.getFileName() : null, "file_name_value");
                    IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel2 = params.getOpenCompanyWizardData().getKrusData().getIncomeTaxExceededAddFileModel();
                    defaultSingleCardDataC = p.c(labelD3, labelC2, mx.b.d(incomeTaxExceededAddFileModel2 != null ? incomeTaxExceededAddFileModel2.getSize() : null, "file_size_value"), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ha1.a.X), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), null, 16, null);
                }
                arrayList.add(defaultSingleCardDataC);
            }
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }
}
