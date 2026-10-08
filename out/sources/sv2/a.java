package sv2;

import al0.BECorrespondenceAddressData;
import al0.DMSTerytDetail;
import fr.t;
import gz.b;
import mx.Label;
import mx.c;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormData;
import st3.AddressTerytDetail;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsv2/a;", "Lgz/a;", "Lsv2/a$a;", "Lst3/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lal0/w;", "Lst3/l;", "c", "(Lal0/w;)Lst3/l;", "params", "b", "(Lsv2/a$a;)Lst3/d;", "a", "Lmx/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, AddressFormData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: sv2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsv2/a$a;", "Lgz/b$a;", "Lal0/k;", "correspondenceAddressData", "<init>", "(Lal0/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/k;", "()Lal0/k;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BECorrespondenceAddressData correspondenceAddressData;

        public Params(BECorrespondenceAddressData bECorrespondenceAddressData) {
            this.correspondenceAddressData = bECorrespondenceAddressData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BECorrespondenceAddressData getCorrespondenceAddressData() {
            return this.correspondenceAddressData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.correspondenceAddressData, ((Params) other).correspondenceAddressData);
        }

        public int hashCode() {
            BECorrespondenceAddressData bECorrespondenceAddressData = this.correspondenceAddressData;
            if (bECorrespondenceAddressData == null) {
                return 0;
            }
            return bECorrespondenceAddressData.hashCode();
        }

        public String toString() {
            return "Params(correspondenceAddressData=" + this.correspondenceAddressData + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final AddressTerytDetail c(DMSTerytDetail dMSTerytDetail) {
        return new AddressTerytDetail(AddressTerytDetail.a.a(dMSTerytDetail.getId()), dMSTerytDetail.getName(), dMSTerytDetail.getDescription(), null);
    }

    public AddressFormData b(Params params) {
        AddressData addressData;
        Label labelC = this.labelProvider.c(gv2.a.f77307s0);
        Label labelC2 = this.labelProvider.c(gv2.a.f77311t0);
        BECorrespondenceAddressData correspondenceAddressData = params.getCorrespondenceAddressData();
        if (correspondenceAddressData != null) {
            AddressTerytDetail addressTerytDetailC = c(correspondenceAddressData.getProvince());
            AddressTerytDetail addressTerytDetailC2 = c(correspondenceAddressData.getCounty());
            AddressTerytDetail addressTerytDetailC3 = c(correspondenceAddressData.getCommunity());
            AddressTerytDetail addressTerytDetailC4 = c(correspondenceAddressData.getCity());
            String postalCode = correspondenceAddressData.getPostalCode();
            DMSTerytDetail street = correspondenceAddressData.getStreet();
            addressData = new AddressData(addressTerytDetailC, addressTerytDetailC2, addressTerytDetailC3, addressTerytDetailC4, postalCode, street != null ? c(street) : null, correspondenceAddressData.getBuildingNumber(), correspondenceAddressData.getApartmentNumber());
        } else {
            addressData = null;
        }
        return new AddressFormData(null, true, labelC, labelC2, null, null, addressData, 49, null);
    }
}
