package st3;

import fu.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lst3/b;", "", "b", "(Lst3/b;)Ljava/lang/String;", "c", "a", "contract"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final String a(AddressData addressData) {
        AddressTerytDetail street = addressData.getStreet();
        String str = (street != null ? street.getDescription() : null) + " ";
        AddressTerytDetail street2 = addressData.getStreet();
        String description = street2 != null ? street2.getDescription() : null;
        boolean z15 = true;
        if (description == null || r.t0(description)) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        AddressTerytDetail street3 = addressData.getStreet();
        String str2 = (street3 != null ? street3.getName() : null) + " ";
        AddressTerytDetail street4 = addressData.getStreet();
        String name = street4 != null ? street4.getName() : null;
        if (name != null && !r.t0(name)) {
            z15 = false;
        }
        if (z15) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = addressData.getCity().getName() + " ";
        }
        String buildingNumber = addressData.getBuildingNumber();
        String str3 = r.t0(addressData.getApartmentNumber()) ? null : "/" + addressData.getApartmentNumber();
        return str + str2 + buildingNumber + (str3 != null ? str3 : "") + ", " + addressData.getPostalCode() + " " + addressData.getCity().getName();
    }

    public static final String b(AddressData addressData) {
        return addressData.getCity().getId();
    }

    public static final String c(AddressData addressData) {
        return addressData.getProvince().getId() + addressData.getCounty().getId() + addressData.getCommunity().getId();
    }
}
