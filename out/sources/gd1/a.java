package gd1;

import fr.t;
import jd1.OpenCompanyWizardData;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import pq.v;
import sb1.AccountingDocumentAddressSelectionContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgd1/a;", "Lxw/f;", "Lgd1/a$a;", "Ln30/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgd1/a$a;)Ln30/b;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, CardListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gd1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgd1/a$a;", "", "Ljd1/a;", "openCompanyWizardData", "<init>", "(Ljd1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "()Ljd1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenCompanyWizardData openCompanyWizardData;

        public Params(OpenCompanyWizardData openCompanyWizardData) {
            this.openCompanyWizardData = openCompanyWizardData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final OpenCompanyWizardData getOpenCompanyWizardData() {
            return this.openCompanyWizardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.openCompanyWizardData, ((Params) other).openCompanyWizardData);
        }

        public int hashCode() {
            return this.openCompanyWizardData.hashCode();
        }

        public String toString() {
            return "Params(openCompanyWizardData=" + this.openCompanyWizardData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71925b;

        static {
            int[] iArr = new int[ib1.a.values().length];
            try {
                iArr[ib1.a.SELF_ACCOUNTING_OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71924a = iArr;
            int[] iArr2 = new int[sc1.q.a.values().length];
            try {
                iArr2[sc1.q.a.GENERAL_TAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[sc1.q.a.FLAT_TAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[sc1.q.a.LUMP_TAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f71925b = iArr2;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public CardListData b(Params params) {
        int i15;
        DefaultSingleCardData defaultSingleCardDataC = p.c(this.labelProvider.c(b.f71924a[params.getOpenCompanyWizardData().getAccountingDocumentSelectionContractData().getAccountingDocumentPlace().getType().ordinal()] == 1 ? ha1.a.I0 : ha1.a.K0).n("accounting_documentation_type_value"), this.labelProvider.c(ha1.a.f82476p3).n("accounting_documentation_type_label"), null, null, null, 28, null);
        Label labelN = this.labelProvider.c(ha1.a.f82469o3).n("accounting_documentation_address_label");
        AccountingDocumentAddressSelectionContractData accountingDocumentAddressSelectionContractData = params.getOpenCompanyWizardData().getAccountingDocumentAddressSelectionContractData();
        DefaultSingleCardData defaultSingleCardDataC2 = p.c(mx.b.d(String.valueOf(accountingDocumentAddressSelectionContractData != null ? accountingDocumentAddressSelectionContractData.getAccountingDocumentAddress() : null), "accounting_documentation_address_value"), labelN, null, null, null, 28, null);
        if (params.getOpenCompanyWizardData().getAccountingDocumentSelectionContractData().getAccountingDocumentPlace().getType() != ib1.a.SELF_ACCOUNTING_OFFICE) {
            defaultSingleCardDataC2 = null;
        }
        Label labelN2 = this.labelProvider.c(ha1.a.G0).n("accounting_office_name_title_label");
        ib1.b accountingDocumentPlace = params.getOpenCompanyWizardData().getAccountingDocumentSelectionContractData().getAccountingDocumentPlace();
        ib1.b.AccountingOffice accountingOffice = accountingDocumentPlace instanceof ib1.b.AccountingOffice ? (ib1.b.AccountingOffice) accountingDocumentPlace : null;
        Label labelD = mx.b.d(accountingOffice != null ? accountingOffice.getAccountingOfficeName() : null, "accounting_office_name_title_value");
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.labelProvider.c(ha1.a.P).getText());
        sb5.append(": ");
        ib1.b accountingDocumentPlace2 = params.getOpenCompanyWizardData().getAccountingDocumentSelectionContractData().getAccountingDocumentPlace();
        ib1.b.AccountingOffice accountingOffice2 = accountingDocumentPlace2 instanceof ib1.b.AccountingOffice ? (ib1.b.AccountingOffice) accountingDocumentPlace2 : null;
        sb5.append(accountingOffice2 != null ? accountingOffice2.getNipNumber() : null);
        DefaultSingleCardData defaultSingleCardDataC3 = params.getOpenCompanyWizardData().getAccountingDocumentSelectionContractData().getAccountingDocumentPlace() instanceof ib1.b.AccountingOffice ? p.c(labelD, labelN2, mx.b.d(sb5.toString(), "accounting_office_name_nip_value"), null, null, 24, null) : null;
        Label labelN3 = this.labelProvider.c(ha1.a.f82504t3).n("form_of_paying_tax_label");
        mx.c cVar = this.labelProvider;
        int i16 = b.f71925b[params.getOpenCompanyWizardData().getIncomeTaxFormSelectionContractData().getIncomeTaxForm().ordinal()];
        if (i16 == 1) {
            i15 = ha1.a.f82383d4;
        } else if (i16 != 2) {
            i15 = i16 != 3 ? ha1.a.f82407g4 : ha1.a.f82399f4;
        } else {
            i15 = ha1.a.f82391e4;
        }
        return new CardListData(v.s(defaultSingleCardDataC, defaultSingleCardDataC2, defaultSingleCardDataC3, p.c(cVar.c(i15).n("form_of_paying_tax_value"), labelN3, null, null, null, 28, null)), null, false, null, null, 30, null);
    }
}
