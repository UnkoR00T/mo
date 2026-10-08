package gg1;

import fr.t;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import pq.v;
import rd1.CreatePublicAddressData;
import rd1.EdorAddressData;
import rd1.NotPublicAddressData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgg1/b;", "Lxw/f;", "Lgg1/b$a;", "Ln30/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgg1/b$a;)Ln30/b;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, CardListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gg1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgg1/b$a;", "", "Lrd1/b;", "edorAddressData", "<init>", "(Lrd1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrd1/b;", "()Lrd1/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EdorAddressData edorAddressData;

        public Params(EdorAddressData edorAddressData) {
            this.edorAddressData = edorAddressData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EdorAddressData getEdorAddressData() {
            return this.edorAddressData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.edorAddressData, ((Params) other).edorAddressData);
        }

        public int hashCode() {
            return this.edorAddressData.hashCode();
        }

        public String toString() {
            return "Params(edorAddressData=" + this.edorAddressData + ')';
        }
    }

    /* JADX INFO: renamed from: gg1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1665b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72849a;

        static {
            int[] iArr = new int[rd1.c.values().length];
            try {
                iArr[rd1.c.CREATE_NEW_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f72849a = iArr;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public CardListData b(Params params) {
        DefaultSingleCardData defaultSingleCardDataB;
        DefaultSingleCardData defaultSingleCardDataB2;
        Label labelN = this.labelProvider.c(ha1.a.H3).n("service_provider_label");
        mx.c cVar = this.labelProvider;
        rd1.c selection = params.getEdorAddressData().getSelection();
        DefaultSingleCardData defaultSingleCardDataB3 = m.b(cVar.c((selection == null ? -1 : C1665b.f72849a[selection.ordinal()]) == 1 ? ha1.a.I1 : ha1.a.H1).n("service_provider_value"), labelN, null, null, null, 28, null);
        CreatePublicAddressData createPublicAddressData = params.getEdorAddressData().getCreatePublicAddressData();
        DefaultSingleCardData defaultSingleCardDataB4 = null;
        if (createPublicAddressData != null) {
            defaultSingleCardDataB = m.b(mx.b.b(createPublicAddressData.getEmail(), "electronic_delivery_create_email_value"), this.labelProvider.c(ha1.a.f82518v3).n("electronic_delivery_create_email_label"), null, null, null, 28, null);
        } else {
            defaultSingleCardDataB = null;
        }
        NotPublicAddressData notPublicAddressData = params.getEdorAddressData().getNotPublicAddressData();
        if (notPublicAddressData != null) {
            defaultSingleCardDataB2 = m.b(mx.b.b(notPublicAddressData.getAddress(), "electronic_delivery_address_value"), this.labelProvider.c(ha1.a.D4).n("electronic_delivery_address_label"), null, null, null, 28, null);
        } else {
            defaultSingleCardDataB2 = null;
        }
        NotPublicAddressData notPublicAddressData2 = params.getEdorAddressData().getNotPublicAddressData();
        if (notPublicAddressData2 != null) {
            defaultSingleCardDataB4 = m.b(mx.b.b(notPublicAddressData2.getProviderShortcut(), "electronic_delivery_not_public_provider_symbol_value"), this.labelProvider.c(ha1.a.f82539y3).n("electronic_delivery_not_public_provider_symbol_label"), null, null, null, 28, null);
        }
        return new CardListData(v.s(defaultSingleCardDataB3, defaultSingleCardDataB, defaultSingleCardDataB2, defaultSingleCardDataB4), null, false, null, null, 30, null);
    }
}
