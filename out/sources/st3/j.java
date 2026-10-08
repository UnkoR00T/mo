package st3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lst3/b;", "Lst3/i$a;", "a", "(Lst3/b;)Lst3/i$a;", "contract"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final AddressFormVMSSetupData.a a(AddressData addressData) {
        String id5 = addressData.getProvince().getId();
        String id6 = addressData.getCounty().getId();
        String id7 = addressData.getCommunity().getId();
        String id8 = addressData.getCity().getId();
        String postalCode = addressData.getPostalCode();
        AddressTerytDetail street = addressData.getStreet();
        return new AddressFormVMSSetupData.a(id5, id6, id7, id8, postalCode, street != null ? street.getId() : null, addressData.getBuildingNumber(), addressData.getApartmentNumber(), null);
    }
}
