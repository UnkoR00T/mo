package gd1;

import fr.t;
import jd1.OpenCompanyWizardData;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import pq.v;
import rd1.CreatePublicAddressData;
import rd1.NotPublicAddressData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgd1/f;", "Lxw/f;", "Lgd1/f$a;", "Ln30/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgd1/f$a;)Ln30/b;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, CardListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gd1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgd1/f$a;", "", "Ljd1/a;", "openCompanyWizardData", "<init>", "(Ljd1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "()Ljd1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public static final /* synthetic */ int[] f71945a;

        static {
            int[] iArr = new int[rd1.c.values().length];
            try {
                iArr[rd1.c.CREATE_NEW_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71945a = iArr;
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public CardListData b(Params params) {
        DefaultSingleCardData defaultSingleCardDataC;
        DefaultSingleCardData defaultSingleCardDataC2;
        Label labelN = this.labelProvider.c(ha1.a.H3).n("service_provider_label");
        mx.c cVar = this.labelProvider;
        rd1.c selection = params.getOpenCompanyWizardData().getEdorAddressData().getSelection();
        DefaultSingleCardData defaultSingleCardDataC3 = p.c(cVar.c((selection == null ? -1 : b.f71945a[selection.ordinal()]) == 1 ? ha1.a.I1 : ha1.a.H1).n("service_provider_value"), labelN, null, null, null, 28, null);
        CreatePublicAddressData createPublicAddressData = params.getOpenCompanyWizardData().getEdorAddressData().getCreatePublicAddressData();
        DefaultSingleCardData defaultSingleCardDataC4 = null;
        if (createPublicAddressData != null) {
            defaultSingleCardDataC = p.c(mx.b.b(createPublicAddressData.getEmail(), "electronic_delivery_create_email_value"), this.labelProvider.c(ha1.a.f82518v3).n("electronic_delivery_create_email_label"), null, null, null, 28, null);
        } else {
            defaultSingleCardDataC = null;
        }
        NotPublicAddressData notPublicAddressData = params.getOpenCompanyWizardData().getEdorAddressData().getNotPublicAddressData();
        if (notPublicAddressData != null) {
            defaultSingleCardDataC2 = p.c(mx.b.b(notPublicAddressData.getAddress(), "electronic_delivery_address_value"), this.labelProvider.c(ha1.a.D4).n("electronic_delivery_address_label"), null, null, null, 28, null);
        } else {
            defaultSingleCardDataC2 = null;
        }
        NotPublicAddressData notPublicAddressData2 = params.getOpenCompanyWizardData().getEdorAddressData().getNotPublicAddressData();
        if (notPublicAddressData2 != null) {
            defaultSingleCardDataC4 = p.c(mx.b.b(notPublicAddressData2.getProviderShortcut(), "electronic_delivery_not_public_provider_symbol_value"), this.labelProvider.c(ha1.a.f82539y3).n("electronic_delivery_not_public_provider_symbol_label"), null, null, null, 28, null);
        }
        return new CardListData(v.s(defaultSingleCardDataC3, defaultSingleCardDataC, defaultSingleCardDataC2, defaultSingleCardDataC4), null, false, null, null, 30, null);
    }
}
