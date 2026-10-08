package v22;

import fr.t;
import fu.r;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressTerytDetail;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lv22/a;", "Lxw/f;", "Lv22/a$a;", "", "<init>", "()V", "params", "c", "(Lv22/a$a;)Ljava/lang/String;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, String> {

    /* JADX INFO: renamed from: v22.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv22/a$a;", "", "Lst3/b;", "address", "<init>", "(Lst3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/b;", "()Lst3/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressData address;

        public Params(AddressData addressData) {
            this.address = addressData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AddressData getAddress() {
            return this.address;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.address, ((Params) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "Params(address=" + this.address + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(Params params) {
        AddressData address = params.getAddress();
        AddressTerytDetail street = address.getStreet();
        String name = street != null ? street.getName() : null;
        if ((name == null || r.t0(name)) && r.t0(address.getApartmentNumber())) {
            return address.getCity().getName() + ' ' + address.getBuildingNumber() + ", " + address.getPostalCode() + ' ' + address.getCity().getName();
        }
        AddressTerytDetail street2 = address.getStreet();
        String name2 = street2 != null ? street2.getName() : null;
        if (name2 == null || r.t0(name2)) {
            return address.getCity().getName() + ' ' + address.getBuildingNumber() + '/' + address.getApartmentNumber() + ", " + address.getPostalCode() + ' ' + address.getCity().getName();
        }
        if (r.t0(address.getApartmentNumber())) {
            StringBuilder sb5 = new StringBuilder();
            AddressTerytDetail street3 = address.getStreet();
            sb5.append(street3 != null ? street3.getName() : null);
            sb5.append(' ');
            sb5.append(address.getBuildingNumber());
            sb5.append(", ");
            sb5.append(address.getPostalCode());
            sb5.append(' ');
            sb5.append(address.getCity().getName());
            return sb5.toString();
        }
        StringBuilder sb6 = new StringBuilder();
        AddressTerytDetail street4 = address.getStreet();
        sb6.append(street4 != null ? street4.getName() : null);
        sb6.append(' ');
        sb6.append(address.getBuildingNumber());
        sb6.append('/');
        sb6.append(address.getApartmentNumber());
        sb6.append(", ");
        sb6.append(address.getPostalCode());
        sb6.append(' ');
        sb6.append(address.getCity().getName());
        return sb6.toString();
    }
}
