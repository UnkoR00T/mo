package gg1;

import de1.IncomeTaxExceededAddFileModel;
import de1.KrusData;
import de1.SocialInsuranceQuestions;
import df1.SocialInsuranceSelectionContractData;
import fr.t;
import h30.ButtonData;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgg1/e;", "Lxw/f;", "Lgg1/e$a;", "Ln30/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgg1/e$a;)Ln30/b;", "e", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, CardListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gg1.e$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgg1/e$a;", "", "Ldf1/b;", "socialInsuranceSelectionContractData", "Lde1/e;", "krusData", "Lkotlin/Function0;", "Loq/i0;", "onPreviewFileAction", "<init>", "(Ldf1/b;Lde1/e;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldf1/b;", "c", "()Ldf1/b;", "b", "Lde1/e;", "()Lde1/e;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SocialInsuranceSelectionContractData socialInsuranceSelectionContractData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final KrusData krusData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPreviewFileAction;

        public Params(SocialInsuranceSelectionContractData socialInsuranceSelectionContractData, KrusData krusData, er.a<i0> aVar) {
            this.socialInsuranceSelectionContractData = socialInsuranceSelectionContractData;
            this.krusData = krusData;
            this.onPreviewFileAction = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final KrusData getKrusData() {
            return this.krusData;
        }

        public final er.a<i0> b() {
            return this.onPreviewFileAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final SocialInsuranceSelectionContractData getSocialInsuranceSelectionContractData() {
            return this.socialInsuranceSelectionContractData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.socialInsuranceSelectionContractData, params.socialInsuranceSelectionContractData) && t.c(this.krusData, params.krusData) && t.c(this.onPreviewFileAction, params.onPreviewFileAction);
        }

        public int hashCode() {
            int iHashCode = this.socialInsuranceSelectionContractData.hashCode() * 31;
            KrusData krusData = this.krusData;
            return ((iHashCode + (krusData == null ? 0 : krusData.hashCode())) * 31) + this.onPreviewFileAction.hashCode();
        }

        public String toString() {
            return "Params(socialInsuranceSelectionContractData=" + this.socialInsuranceSelectionContractData + ", krusData=" + this.krusData + ", onPreviewFileAction=" + this.onPreviewFileAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f72865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f72866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f72867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f72868e;

        static {
            int[] iArr = new int[lb1.a.values().length];
            try {
                iArr[lb1.a.ZUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f72864a = iArr;
            int[] iArr2 = new int[de1.g.values().length];
            try {
                iArr2[de1.g.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f72865b = iArr2;
            int[] iArr3 = new int[de1.d.values().length];
            try {
                iArr3[de1.d.EXCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f72866c = iArr3;
            int[] iArr4 = new int[de1.c.values().length];
            try {
                iArr4[de1.c.SUBMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr4[de1.c.ATTACH_AS_ATTACHMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f72867d = iArr4;
            int[] iArr5 = new int[de1.b.values().length];
            try {
                iArr5[de1.b.SUBMIT_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            f72868e = iArr5;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData c(Params params) {
        DefaultSingleCardData defaultSingleCardDataB;
        TaxOfficeModel taxOffice;
        String strA;
        TaxOfficeModel taxOffice2;
        SocialInsuranceQuestions socialInsuranceQuestions;
        SocialInsuranceQuestions socialInsuranceQuestions2;
        SocialInsuranceQuestions socialInsuranceQuestions3;
        KrusOfficeModel krusOffice;
        String strA2;
        KrusOfficeModel krusOffice2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m.b(this.labelProvider.c(ha1.a.A2).n("place_payment_insurance_value"), this.labelProvider.c(ha1.a.f82546z3).n("place_payment_insurance_label"), null, null, null, 28, null));
        Label labelN = this.labelProvider.c(ha1.a.f82511u3).n("krus_label");
        KrusData krusData = params.getKrusData();
        Label labelD = mx.b.d((krusData == null || (krusOffice2 = krusData.getKrusOffice()) == null) ? null : krusOffice2.getName(), "krus_name_value");
        KrusData krusData2 = params.getKrusData();
        DefaultSingleCardData defaultSingleCardDataB2 = m.b(labelD, labelN, (krusData2 == null || (krusOffice = krusData2.getKrusOffice()) == null || (strA2 = ld1.j.a(krusOffice)) == null) ? null : mx.b.b(strA2, "krus_address_value"), null, null, 24, null);
        Label labelN2 = this.labelProvider.c(ha1.a.K3).n("social_insurance_farmers_label");
        mx.c cVar = this.labelProvider;
        KrusData krusData3 = params.getKrusData();
        de1.g firstAnswer = (krusData3 == null || (socialInsuranceQuestions3 = krusData3.getSocialInsuranceQuestions()) == null) ? null : socialInsuranceQuestions3.getFirstAnswer();
        DefaultSingleCardData defaultSingleCardDataB3 = m.b(cVar.c((firstAnswer == null ? -1 : b.f72865b[firstAnswer.ordinal()]) == 1 ? ha1.a.f82508u0 : ha1.a.Q).n("social_insurance_farmers_value"), labelN2, null, null, null, 28, null);
        Label labelN3 = this.labelProvider.c(ha1.a.f82483q3).n("agricultural_activity_label");
        mx.c cVar2 = this.labelProvider;
        KrusData krusData4 = params.getKrusData();
        de1.g secondAnswer = (krusData4 == null || (socialInsuranceQuestions2 = krusData4.getSocialInsuranceQuestions()) == null) ? null : socialInsuranceQuestions2.getSecondAnswer();
        DefaultSingleCardData defaultSingleCardDataB4 = m.b(cVar2.c((secondAnswer == null ? -1 : b.f72865b[secondAnswer.ordinal()]) == 1 ? ha1.a.f82508u0 : ha1.a.Q).n("agricultural_activity_value"), labelN3, null, null, null, 28, null);
        Label labelN4 = this.labelProvider.c(ha1.a.f82532x3).n("non_agricultural_activity_label");
        mx.c cVar3 = this.labelProvider;
        KrusData krusData5 = params.getKrusData();
        de1.g thirdAnswer = (krusData5 == null || (socialInsuranceQuestions = krusData5.getSocialInsuranceQuestions()) == null) ? null : socialInsuranceQuestions.getThirdAnswer();
        DefaultSingleCardData defaultSingleCardDataB5 = m.b(cVar3.c((thirdAnswer == null ? -1 : b.f72865b[thirdAnswer.ordinal()]) == 1 ? ha1.a.f82508u0 : ha1.a.Q).n("non_agricultural_activity_value"), labelN4, null, null, null, 28, null);
        Label labelN5 = this.labelProvider.c(ha1.a.P3).n("krus_tax_office_title");
        KrusData krusData6 = params.getKrusData();
        Label labelD2 = mx.b.d((krusData6 == null || (taxOffice2 = krusData6.getTaxOffice()) == null) ? null : taxOffice2.getName(), "krus_tax_office_name_value");
        KrusData krusData7 = params.getKrusData();
        arrayList.addAll(v.q(defaultSingleCardDataB2, defaultSingleCardDataB3, defaultSingleCardDataB4, defaultSingleCardDataB5, m.b(labelD2, labelN5, (krusData7 == null || (taxOffice = krusData7.getTaxOffice()) == null || (strA = s.a(taxOffice)) == null) ? null : mx.b.b(strA, "krus_tax_office_address_value"), null, null, 24, null)));
        KrusData krusData8 = params.getKrusData();
        de1.b incomeTaxExceededCertificateAnswer = krusData8 != null ? krusData8.getIncomeTaxExceededCertificateAnswer() : null;
        if ((incomeTaxExceededCertificateAnswer == null ? -1 : b.f72868e[incomeTaxExceededCertificateAnswer.ordinal()]) == 1) {
            Label labelC = this.labelProvider.c(ha1.a.f82485q5);
            mx.c cVar4 = this.labelProvider;
            de1.d incomeTaxExceededInfo = params.getKrusData().getIncomeTaxExceededInfo();
            arrayList.add(m.b(cVar4.c((incomeTaxExceededInfo != null ? b.f72866c[incomeTaxExceededInfo.ordinal()] : -1) == 1 ? ha1.a.f82471o5 : ha1.a.f82478p5), labelC, null, null, null, 28, null));
        } else {
            KrusData krusData9 = params.getKrusData();
            de1.c incomeTaxExceededCertificateInfoAnswer = krusData9 != null ? krusData9.getIncomeTaxExceededCertificateInfoAnswer() : null;
            int i15 = incomeTaxExceededCertificateInfoAnswer != null ? b.f72867d[incomeTaxExceededCertificateInfoAnswer.ordinal()] : -1;
            if (i15 == 1) {
                defaultSingleCardDataB = m.b(this.labelProvider.c(ha1.a.f82432j5), this.labelProvider.c(ha1.a.N3), null, null, null, 28, null);
            } else if (i15 != 2) {
                defaultSingleCardDataB = m.b(this.labelProvider.c(ha1.a.f82448l5), this.labelProvider.c(ha1.a.N3), null, null, null, 28, null);
            } else {
                Label labelC2 = this.labelProvider.c(ha1.a.N3);
                IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel = params.getKrusData().getIncomeTaxExceededAddFileModel();
                Label labelD3 = mx.b.d(incomeTaxExceededAddFileModel != null ? incomeTaxExceededAddFileModel.getFileName() : null, "file_name_value");
                IncomeTaxExceededAddFileModel incomeTaxExceededAddFileModel2 = params.getKrusData().getIncomeTaxExceededAddFileModel();
                defaultSingleCardDataB = m.b(labelD3, labelC2, mx.b.d(incomeTaxExceededAddFileModel2 != null ? incomeTaxExceededAddFileModel2.getSize() : null, "file_size_value"), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ha1.a.X), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), null, 16, null);
            }
            arrayList.add(defaultSingleCardDataB);
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public CardListData b(Params params) {
        if (b.f72864a[params.getSocialInsuranceSelectionContractData().getSelectedInsurance().ordinal()] != 1) {
            return c(params);
        }
        return new CardListData(v.e(m.b(this.labelProvider.c(ha1.a.C2).n("place_payment_insurance_value"), this.labelProvider.c(ha1.a.f82546z3).n("place_payment_insurance_label"), null, null, null, 28, null)), null, false, null, null, 30, null);
    }
}
