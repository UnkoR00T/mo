package gd1;

import fr.t;
import java.util.List;
import jd1.OpenCompanyWizardData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgd1/e;", "Lxw/f;", "Lgd1/e$a;", "Ln30/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "consent", "Lmx/a;", "c", "(Z)Lmx/a;", "e", "f", "params", "h", "(Lgd1/e$a;)Ln30/b;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, CardListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gd1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgd1/e$a;", "", "Ljd1/a;", "openCompanyWizardData", "<init>", "(Ljd1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "()Ljd1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(boolean consent) {
        int i15;
        mx.c cVar = this.labelProvider;
        if (consent) {
            i15 = ha1.a.C3;
        } else {
            if (consent) {
                throw new oq.p();
            }
            i15 = ha1.a.B3;
        }
        return cVar.c(i15);
    }

    private final Label e(boolean consent) {
        int i15;
        mx.c cVar = this.labelProvider;
        if (consent) {
            i15 = ha1.a.E3;
        } else {
            if (consent) {
                throw new oq.p();
            }
            i15 = ha1.a.D3;
        }
        return cVar.c(i15);
    }

    private final Label f(boolean consent) {
        int i15;
        mx.c cVar = this.labelProvider;
        if (consent) {
            i15 = ha1.a.G3;
        } else {
            if (consent) {
                throw new oq.p();
            }
            i15 = ha1.a.F3;
        }
        return cVar.c(i15);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public CardListData b(Params params) {
        int i15;
        List listC = v.c();
        Label labelD = mx.b.d(params.getOpenCompanyWizardData().getContactInfoContractData().getEmail(), "contact_details_email_value");
        Label labelN = this.labelProvider.c(ha1.a.f82486r).n("contact_details_email_label");
        boolean isCompanyNewContactEnabled = params.getOpenCompanyWizardData().getIsCompanyNewContactEnabled();
        Boolean boolValueOf = Boolean.valueOf(isCompanyNewContactEnabled);
        if (!isCompanyNewContactEnabled) {
            boolValueOf = null;
        }
        listC.add(p.c(labelD, labelN, boolValueOf != null ? c(params.getOpenCompanyWizardData().getContactInfoContractData().getPublishEmailConsent()) : null, null, null, 24, null));
        Label labelD2 = mx.b.d(params.getOpenCompanyWizardData().getContactInfoContractData().getPhoneNumber(), "contact_details_phone_number_value");
        Label labelN2 = this.labelProvider.c(ha1.a.U).n("contact_details_phone_number_label");
        boolean isCompanyNewContactEnabled2 = params.getOpenCompanyWizardData().getIsCompanyNewContactEnabled();
        Boolean boolValueOf2 = Boolean.valueOf(isCompanyNewContactEnabled2);
        if (!isCompanyNewContactEnabled2) {
            boolValueOf2 = null;
        }
        listC.add(p.c(labelD2, labelN2, boolValueOf2 != null ? e(params.getOpenCompanyWizardData().getContactInfoContractData().getPublishPhoneNumberConsent()) : null, null, null, 24, null));
        Label labelD3 = mx.b.d(params.getOpenCompanyWizardData().getContactInfoContractData().getWebsiteUrl(), "contact_details_website_url_value");
        Label labelN3 = this.labelProvider.c(ha1.a.f82501t0).n("contact_details_website_url_label");
        boolean isCompanyNewContactEnabled3 = params.getOpenCompanyWizardData().getIsCompanyNewContactEnabled();
        Boolean boolValueOf3 = Boolean.valueOf(isCompanyNewContactEnabled3);
        if (!isCompanyNewContactEnabled3) {
            boolValueOf3 = null;
        }
        listC.add(p.c(labelD3, labelN3, boolValueOf3 != null ? f(params.getOpenCompanyWizardData().getContactInfoContractData().getPublishWebAddressConsent()) : null, null, null, 24, null));
        if (!params.getOpenCompanyWizardData().getIsCompanyNewContactEnabled()) {
            mx.c cVar = this.labelProvider;
            boolean ceidgConsent = params.getOpenCompanyWizardData().getContactInfoContractData().getCeidgConsent();
            if (ceidgConsent) {
                i15 = ha1.a.f82508u0;
            } else {
                if (ceidgConsent) {
                    throw new oq.p();
                }
                i15 = ha1.a.Q;
            }
            listC.add(p.c(cVar.c(i15).n("contact_details_ceidg_consent_value"), this.labelProvider.c(ha1.a.f82497s3).n("contact_details_ceidg_consent_label"), null, null, null, 28, null));
        }
        return new CardListData(v.a(listC), null, false, null, null, 30, null);
    }
}
